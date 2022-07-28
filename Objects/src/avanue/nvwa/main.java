package avanue.nvwa;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "avanue.nvwa", "avanue.nvwa.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "avanue.nvwa", "avanue.nvwa.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "avanue.nvwa.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static boolean _frontcamera = false;
public static avanue.nvwa.externalstorage _storage = null;
public static avanue.nvwa.externalstorage._externalfile _parents_dir = null;
public avanue.nvwa.cameraexclass _camex = null;
public uk.co.martinpearman.b4a.touchimageview.TouchImageViewWrapper _touchimageview1 = null;
public static String _id = "";
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
public static long _now = 0L;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static String _tag_subject = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntakepicture = null;
public static int _mytaskindex = 0;
public anywheresoftware.b4a.objects.LabelWrapper _q_count = null;
public static String _q_name = "";
public static String _a_name = "";
public static String _t_name = "";
public static int _random_num = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public static int _current_id = 0;
public static String _current_time_create = "";
public static String _current_time_modify = "";
public static String _current_time_delete = "";
public static int _current_valid = 0;
public static String _current_subject = "";
public static int _current_leval = 0;
public static int _current_grade = 0;
public static String _current_tags = "";
public static String _current_question_image = "";
public static String _current_answer_image = "";
public static int _current_correct_times = 0;
public static int _current_incorrect_times = 0;
public static String _current_last_time = "";
public static int _qa_s = 0;
public static int _rule_never_do = 0;
public static int _rule_correct = 0;
public static int _rule_incorrect = 0;
public static String _tags = "";
public avanue.nvwa.starter _starter = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 94;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 //BA.debugLineNum = 96;BA.debugLine="Storage.Initialize (Me, \"Storage\")";
_storage._initialize /*String*/ (processBA,main.getObject(),"Storage");
 //BA.debugLineNum = 97;BA.debugLine="Parents_Dir.Initialize";
_parents_dir.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 //BA.debugLineNum = 105;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_S";
mostCurrent._rp.CheckAndRequest(processBA,mostCurrent._rp.PERMISSION_READ_EXTERNAL_STORAGE);
 //BA.debugLineNum = 106;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_WRITE_EXTERNAL_";
mostCurrent._rp.CheckAndRequest(processBA,mostCurrent._rp.PERMISSION_WRITE_EXTERNAL_STORAGE);
 //BA.debugLineNum = 107;BA.debugLine="rp.GetAllSafeDirsExternal (\"\")";
mostCurrent._rp.GetAllSafeDirsExternal("");
 //BA.debugLineNum = 108;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"nvwa.db";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"nvwa.db")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 109;BA.debugLine="Try";
try { //BA.debugLineNum = 110;BA.debugLine="File.Copy(File.DirAssets,\"nvwa.db\",File.DirDef";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"nvwa.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"nvwa.db");
 } 
       catch (Exception e12) {
			processBA.setLastException(e12); //BA.debugLineNum = 112;BA.debugLine="Msgbox(\"Copy error\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Copy error"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 114;BA.debugLine="Msgbox(\"nvwa not exits\",\"DEST\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("nvwa not exits"),BA.ObjectToCharSequence("DEST"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 117;BA.debugLine="If SQL1.IsInitialized = False Then";
if (mostCurrent._sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 118;BA.debugLine="Try";
try { //BA.debugLineNum = 119;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"nvwa";
mostCurrent._sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"nvwa.db",anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e20) {
			processBA.setLastException(e20); //BA.debugLineNum = 121;BA.debugLine="Msgbox(\"DB Init Error\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("DB Init Error"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 };
 };
 //BA.debugLineNum = 131;BA.debugLine="Msgbox(File.DirRootExternal,\"Dir\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal()),BA.ObjectToCharSequence("Dir"),mostCurrent.activityBA);
 //BA.debugLineNum = 132;BA.debugLine="Msgbox(File.DirDefaultExternal,\"Dir\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()),BA.ObjectToCharSequence("Dir"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 153;BA.debugLine="If camEx.IsInitialized Then";
if (mostCurrent._camex.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 154;BA.debugLine="camEx.Release";
mostCurrent._camex._release /*String*/ ();
 };
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public static String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
 //BA.debugLineNum = 143;BA.debugLine="If Result=False Then";
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 144;BA.debugLine="Msgbox(\"Permission Denied\",\"PD\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Permission Denied"),BA.ObjectToCharSequence("PD"),mostCurrent.activityBA);
 }else {
 //BA.debugLineNum = 146;BA.debugLine="CallSubDelayed(Me, \"permission_done\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,main.getObject(),"permission_done");
 //BA.debugLineNum = 147;BA.debugLine="Msgbox(\"Permission OK\",\"P\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Permission OK"),BA.ObjectToCharSequence("P"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 149;BA.debugLine="Log(Permission)";
anywheresoftware.b4a.keywords.Common.LogImpl("4393223",_permission,0);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _answer_click() throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Private Sub answer_Click";
 //BA.debugLineNum = 370;BA.debugLine="A_Name = now_string";
mostCurrent._a_name = _now_string();
 //BA.debugLineNum = 371;BA.debugLine="T_Name = A_Name";
mostCurrent._t_name = mostCurrent._a_name;
 //BA.debugLineNum = 372;BA.debugLine="camEx.TakePicture";
mostCurrent._camex._takepicture /*String*/ ();
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public static String  _back_click() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Private Sub back_Click";
 //BA.debugLineNum = 172;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 173;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public static String  _back_rev_click() throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Private Sub back_rev_Click";
 //BA.debugLineNum = 590;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 591;BA.debugLine="Activity.LoadLayout(\"subjects_rev\")";
mostCurrent._activity.LoadLayout("subjects_rev",mostCurrent.activityBA);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return "";
}
public static String  _back_rule_click() throws Exception{
 //BA.debugLineNum = 619;BA.debugLine="Private Sub back_rule_Click";
 //BA.debugLineNum = 621;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 622;BA.debugLine="Activity.LoadLayout(\"review\")";
mostCurrent._activity.LoadLayout("review",mostCurrent.activityBA);
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return "";
}
public static String  _biology_click() throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Private Sub biology_Click";
 //BA.debugLineNum = 299;BA.debugLine="tag_subject= \"biology\"";
mostCurrent._tag_subject = "biology";
 //BA.debugLineNum = 301;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 303;BA.debugLine="Activity.LoadLayout (\"record\")";
mostCurrent._activity.LoadLayout("record",mostCurrent.activityBA);
 //BA.debugLineNum = 304;BA.debugLine="Try";
try { //BA.debugLineNum = 305;BA.debugLine="InitializeCamera";
_initializecamera();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7); //BA.debugLineNum = 307;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("camera init err"),BA.ObjectToCharSequence("err"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 309;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
mostCurrent._q_count.setText(BA.ObjectToCharSequence(_refresh_count(mostCurrent._tag_subject)));
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public static String  _biology_rev_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 497;BA.debugLine="Private Sub biology_rev_Click";
 //BA.debugLineNum = 498;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 499;BA.debugLine="Activity.LoadLayout(\"review\")";
mostCurrent._activity.LoadLayout("review",mostCurrent.activityBA);
 //BA.debugLineNum = 500;BA.debugLine="tag_subject= \"biology\"";
mostCurrent._tag_subject = "biology";
 //BA.debugLineNum = 501;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 502;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 503;BA.debugLine="If tn = \"\" Then";
if ((_tn).equals("")) { 
 //BA.debugLineNum = 504;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("没题啊"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 505;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 507;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
mostCurrent._touchimageview1.Initialize(mostCurrent.activityBA,"TouchImageView1");
 //BA.debugLineNum = 508;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._touchimageview1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 509;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return "";
}
public static String  _btnflash_click() throws Exception{
float[] _f = null;
anywheresoftware.b4a.objects.collections.List _flashmodes = null;
String _flash = "";
 //BA.debugLineNum = 349;BA.debugLine="Private Sub btnFlash_Click";
 //BA.debugLineNum = 350;BA.debugLine="Dim f() As Float = camEx.GetFocusDistances";
_f = mostCurrent._camex._getfocusdistances /*float[]*/ ();
 //BA.debugLineNum = 351;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
anywheresoftware.b4a.keywords.Common.LogImpl("41572866",BA.NumberToString(_f[(int) (0)])+", "+BA.NumberToString(_f[(int) (1)])+", "+BA.NumberToString(_f[(int) (2)]),0);
 //BA.debugLineNum = 352;BA.debugLine="Dim flashModes As List = camEx.GetSupportedFlashM";
_flashmodes = new anywheresoftware.b4a.objects.collections.List();
_flashmodes = mostCurrent._camex._getsupportedflashmodes /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 353;BA.debugLine="If flashModes.IsInitialized = False Then";
if (_flashmodes.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 354;BA.debugLine="ToastMessageShow(\"Flash not supported.\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Flash not supported."),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 355;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 357;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
_flash = BA.ObjectToString(_flashmodes.Get((int) ((_flashmodes.IndexOf((Object)(mostCurrent._camex._getflashmode /*String*/ ()))+1)%_flashmodes.getSize())));
 //BA.debugLineNum = 358;BA.debugLine="camEx.SetFlashMode(flash)";
mostCurrent._camex._setflashmode /*String*/ (_flash);
 //BA.debugLineNum = 359;BA.debugLine="ToastMessageShow(flash, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_flash),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 360;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ ();
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return "";
}
public static String  _btntakepicture_click() throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub btnTakePicture_Click";
 //BA.debugLineNum = 332;BA.debugLine="Q_Name = now_string";
mostCurrent._q_name = _now_string();
 //BA.debugLineNum = 333;BA.debugLine="T_Name = Q_Name";
mostCurrent._t_name = mostCurrent._q_name;
 //BA.debugLineNum = 334;BA.debugLine="camEx.TakePicture";
mostCurrent._camex._takepicture /*String*/ ();
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub Button1_Click";
 //BA.debugLineNum = 159;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
_xui.MsgboxAsync(processBA,BA.ObjectToCharSequence("Hello world!"),BA.ObjectToCharSequence("B4X"));
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public static String  _camera1_focusdone(boolean _success) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub Camera1_FocusDone(Success As Boolean)";
 //BA.debugLineNum = 190;BA.debugLine="Msgbox(\"Mamera focus down\",\"FD\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Mamera focus down"),BA.ObjectToCharSequence("FD"),mostCurrent.activityBA);
 //BA.debugLineNum = 191;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 192;BA.debugLine="Msgbox(\"Camera focus down\",\"Focus DONE\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Camera focus down"),BA.ObjectToCharSequence("Focus DONE"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public static String  _camera1_picturetaken(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 311;BA.debugLine="Sub Camera1_PictureTaken (Data() As Byte)";
 //BA.debugLineNum = 313;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 316;BA.debugLine="camEx.SavePictureToFile(Data, File.DirDefaultExte";
mostCurrent._camex._savepicturetofile /*String*/ (_data,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),mostCurrent._t_name+".jpg");
 //BA.debugLineNum = 317;BA.debugLine="camEx.StartPreview 'restart preview";
mostCurrent._camex._startpreview /*String*/ ();
 //BA.debugLineNum = 318;BA.debugLine="Msgbox(T_Name,\"MSG\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._t_name),BA.ObjectToCharSequence("MSG"),mostCurrent.activityBA);
 //BA.debugLineNum = 319;BA.debugLine="ToastMessageShow(\"Image saved: \" & File.Combine(F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Image saved: "+anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),mostCurrent._t_name+".jpg")),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 320;BA.debugLine="btnTakePicture.Enabled = True";
mostCurrent._btntakepicture.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public static String  _camera1_ready(boolean _success) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub Camera1_Ready (Success As Boolean)";
 //BA.debugLineNum = 177;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 178;BA.debugLine="camEx.SetJpegQuality(90)";
mostCurrent._camex._setjpegquality /*String*/ ((int) (90));
 //BA.debugLineNum = 179;BA.debugLine="camEx.SetContinuousAutoFocus";
mostCurrent._camex._setcontinuousautofocus /*String*/ ();
 //BA.debugLineNum = 180;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ ();
 //BA.debugLineNum = 181;BA.debugLine="camEx.StartPreview";
mostCurrent._camex._startpreview /*String*/ ();
 //BA.debugLineNum = 182;BA.debugLine="Log(camEx.GetPreviewSize)";
anywheresoftware.b4a.keywords.Common.LogImpl("4786438",BA.ObjectToString(mostCurrent._camex._getpreviewsize /*avanue.nvwa.cameraexclass._camerasize*/ ()),0);
 }else {
 //BA.debugLineNum = 184;BA.debugLine="ToastMessageShow(\"Cannot open camera.\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cannot open camera."),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public static String  _cancle_click() throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Private Sub cancle_Click";
 //BA.debugLineNum = 405;BA.debugLine="A_Name = \"\"";
mostCurrent._a_name = "";
 //BA.debugLineNum = 406;BA.debugLine="Q_Name = \"\"";
mostCurrent._q_name = "";
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return "";
}
public static String  _change_rules_click() throws Exception{
 //BA.debugLineNum = 598;BA.debugLine="Private Sub change_rules_Click";
 //BA.debugLineNum = 599;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM question_";
mostCurrent._cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._sql1.ExecQuery("SELECT * FROM question_bank where Subject =  '"+mostCurrent._tag_subject+"' ")));
 //BA.debugLineNum = 600;BA.debugLine="Msgbox(cursor1.RowCount,\"INF\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._cursor1.getRowCount()),BA.ObjectToCharSequence("INF"),mostCurrent.activityBA);
 //BA.debugLineNum = 601;BA.debugLine="If cursor1.RowCount < 1 Then";
if (mostCurrent._cursor1.getRowCount()<1) { 
 //BA.debugLineNum = 602;BA.debugLine="Msgbox(\"找不到题目呢\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("找不到题目呢"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 603;BA.debugLine="Return (\"\")";
if (true) return ("");
 };
 //BA.debugLineNum = 606;BA.debugLine="random_num = Rnd(0,cursor1.RowCount)";
_random_num = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),mostCurrent._cursor1.getRowCount());
 //BA.debugLineNum = 607;BA.debugLine="cursor1.Position = random_num";
mostCurrent._cursor1.setPosition(_random_num);
 //BA.debugLineNum = 608;BA.debugLine="Msgbox(random_num,\"Question Num\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_random_num),BA.ObjectToCharSequence("Question Num"),mostCurrent.activityBA);
 //BA.debugLineNum = 609;BA.debugLine="Current_ID = cursor1.GetInt(\"ID\")";
_current_id = mostCurrent._cursor1.GetInt("ID");
 //BA.debugLineNum = 610;BA.debugLine="Current_Correct_Times = cursor1.GetInt(\"Correct_T";
_current_correct_times = mostCurrent._cursor1.GetInt("Correct_Times");
 //BA.debugLineNum = 611;BA.debugLine="Current_Last_Time = cursor1.GetString(\"Last_Time\"";
mostCurrent._current_last_time = mostCurrent._cursor1.GetString("Last_Time");
 //BA.debugLineNum = 612;BA.debugLine="Msgbox(Current_Correct_Times,\"Correct_Times\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_current_correct_times),BA.ObjectToCharSequence("Correct_Times"),mostCurrent.activityBA);
 //BA.debugLineNum = 613;BA.debugLine="Return(cursor1.GetString(\"Question_Image\"))";
if (true) return (mostCurrent._cursor1.GetString("Question_Image"));
 //BA.debugLineNum = 614;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 615;BA.debugLine="Activity.LoadLayout(\"select_rule\")";
mostCurrent._activity.LoadLayout("select_rule",mostCurrent.activityBA);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return "";
}
public static String  _chemistry_click() throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Private Sub chemistry_Click";
 //BA.debugLineNum = 285;BA.debugLine="tag_subject= \"chemistry\"";
mostCurrent._tag_subject = "chemistry";
 //BA.debugLineNum = 287;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 289;BA.debugLine="Activity.LoadLayout (\"record\")";
mostCurrent._activity.LoadLayout("record",mostCurrent.activityBA);
 //BA.debugLineNum = 290;BA.debugLine="Try";
try { //BA.debugLineNum = 291;BA.debugLine="InitializeCamera";
_initializecamera();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7); //BA.debugLineNum = 293;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("camera init err"),BA.ObjectToCharSequence("err"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 295;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
mostCurrent._q_count.setText(BA.ObjectToCharSequence(_refresh_count(mostCurrent._tag_subject)));
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public static String  _chemistry_rev_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 482;BA.debugLine="Private Sub chemistry_rev_Click";
 //BA.debugLineNum = 483;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 484;BA.debugLine="Activity.LoadLayout(\"review\")";
mostCurrent._activity.LoadLayout("review",mostCurrent.activityBA);
 //BA.debugLineNum = 485;BA.debugLine="tag_subject= \"chemistry\"";
mostCurrent._tag_subject = "chemistry";
 //BA.debugLineNum = 486;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 487;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 488;BA.debugLine="If tn = \"\" Then";
if ((_tn).equals("")) { 
 //BA.debugLineNum = 489;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("没题啊"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 490;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 492;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
mostCurrent._touchimageview1.Initialize(mostCurrent.activityBA,"TouchImageView1");
 //BA.debugLineNum = 493;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._touchimageview1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 494;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public static String  _chinese_click() throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _tempcheckbox = null;
 //BA.debugLineNum = 217;BA.debugLine="Private Sub chinese_Click";
 //BA.debugLineNum = 218;BA.debugLine="tag_subject= \"chinese\"";
mostCurrent._tag_subject = "chinese";
 //BA.debugLineNum = 220;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 222;BA.debugLine="Activity.LoadLayout (\"record\")";
mostCurrent._activity.LoadLayout("record",mostCurrent.activityBA);
 //BA.debugLineNum = 223;BA.debugLine="Try";
try { //BA.debugLineNum = 224;BA.debugLine="InitializeCamera";
_initializecamera();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7); //BA.debugLineNum = 226;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("camera init err"),BA.ObjectToCharSequence("err"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 228;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
mostCurrent._q_count.setText(BA.ObjectToCharSequence(_refresh_count(mostCurrent._tag_subject)));
 //BA.debugLineNum = 229;BA.debugLine="Msgbox(get_tags(tag_subject),\"tags\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_get_tags(mostCurrent._tag_subject)),BA.ObjectToCharSequence("tags"),mostCurrent.activityBA);
 //BA.debugLineNum = 230;BA.debugLine="Dim tempcheckbox  As CheckBox";
_tempcheckbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 231;BA.debugLine="tempcheckbox.Initialize(\"tempcheckbox\")";
_tempcheckbox.Initialize(mostCurrent.activityBA,"tempcheckbox");
 //BA.debugLineNum = 232;BA.debugLine="tempcheckbox.Text =\"TEMP\"";
_tempcheckbox.setText(BA.ObjectToCharSequence("TEMP"));
 //BA.debugLineNum = 236;BA.debugLine="Activity.Addview(tempcheckbox, 90%x,1%y,10%x,10%y";
mostCurrent._activity.AddView((android.view.View)(_tempcheckbox.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public static String  _chinese_rev_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 420;BA.debugLine="Private Sub chinese_rev_Click";
 //BA.debugLineNum = 421;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 422;BA.debugLine="Activity.LoadLayout(\"review\")";
mostCurrent._activity.LoadLayout("review",mostCurrent.activityBA);
 //BA.debugLineNum = 423;BA.debugLine="tag_subject= \"chinese\"";
mostCurrent._tag_subject = "chinese";
 //BA.debugLineNum = 424;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 425;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 426;BA.debugLine="If tn = \"\" Then";
if ((_tn).equals("")) { 
 //BA.debugLineNum = 427;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("没题啊"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 428;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 431;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
mostCurrent._touchimageview1.Initialize(mostCurrent.activityBA,"TouchImageView1");
 //BA.debugLineNum = 432;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._touchimageview1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 433;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return "";
}
public static String  _correct_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 512;BA.debugLine="Private Sub correct_Click";
 //BA.debugLineNum = 513;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 517;BA.debugLine="Current_Correct_Times = Current_Correct_Times +1";
_current_correct_times = (int) (_current_correct_times+1);
 //BA.debugLineNum = 518;BA.debugLine="SQL1.ExecNonQuery(\"UPDATE question_bank	SET Corre";
mostCurrent._sql1.ExecNonQuery("UPDATE question_bank	SET Correct_Times = '"+BA.NumberToString(_current_correct_times)+"' WHERE  ID = '"+BA.NumberToString(_current_id)+"' ");
 //BA.debugLineNum = 519;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 521;BA.debugLine="If tn = \"\" Then";
if ((_tn).equals("")) { 
 //BA.debugLineNum = 522;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 524;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return "";
}
public static String  _dbload() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub DBload";
 //BA.debugLineNum = 82;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM question_";
mostCurrent._cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._sql1.ExecQuery("SELECT * FROM question_bank")));
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _english_click() throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Private Sub english_Click";
 //BA.debugLineNum = 257;BA.debugLine="tag_subject= \"english\"";
mostCurrent._tag_subject = "english";
 //BA.debugLineNum = 259;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 261;BA.debugLine="Activity.LoadLayout (\"record\")";
mostCurrent._activity.LoadLayout("record",mostCurrent.activityBA);
 //BA.debugLineNum = 262;BA.debugLine="Try";
try { //BA.debugLineNum = 263;BA.debugLine="InitializeCamera";
_initializecamera();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7); //BA.debugLineNum = 265;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("camera init err"),BA.ObjectToCharSequence("err"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 267;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
mostCurrent._q_count.setText(BA.ObjectToCharSequence(_refresh_count(mostCurrent._tag_subject)));
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return "";
}
public static String  _english_rev_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 452;BA.debugLine="Private Sub english_rev_Click";
 //BA.debugLineNum = 453;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 454;BA.debugLine="Activity.LoadLayout(\"review\")";
mostCurrent._activity.LoadLayout("review",mostCurrent.activityBA);
 //BA.debugLineNum = 455;BA.debugLine="tag_subject= \"english\"";
mostCurrent._tag_subject = "english";
 //BA.debugLineNum = 456;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 457;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 458;BA.debugLine="If tn = \"\" Then";
if ((_tn).equals("")) { 
 //BA.debugLineNum = 459;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("没题啊"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 460;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 462;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
mostCurrent._touchimageview1.Initialize(mostCurrent.activityBA,"TouchImageView1");
 //BA.debugLineNum = 463;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._touchimageview1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 464;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public static String[]  _get_tags(String _subject) throws Exception{
int _i = 0;
String[] _tag = null;
 //BA.debugLineNum = 196;BA.debugLine="Sub get_tags(subject As String) As String()";
 //BA.debugLineNum = 198;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM tags wher";
mostCurrent._cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._sql1.ExecQuery("SELECT * FROM tags where Subject =  '"+_subject+"' ")));
 //BA.debugLineNum = 199;BA.debugLine="Msgbox(cursor1.RowCount,\"INF\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._cursor1.getRowCount()),BA.ObjectToCharSequence("INF"),mostCurrent.activityBA);
 //BA.debugLineNum = 200;BA.debugLine="If cursor1.RowCount < 1 Then";
if (mostCurrent._cursor1.getRowCount()<1) { 
 //BA.debugLineNum = 201;BA.debugLine="Msgbox(\"找不到tags呢\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("找不到tags呢"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 202;BA.debugLine="Return (Null)";
if (true) return (String[])((anywheresoftware.b4a.keywords.Common.Null));
 };
 //BA.debugLineNum = 204;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 205;BA.debugLine="Dim tag() As String";
_tag = new String[(int) (0)];
java.util.Arrays.fill(_tag,"");
 //BA.debugLineNum = 206;BA.debugLine="For i = 0 To cursor1.RowCount";
{
final int step9 = 1;
final int limit9 = mostCurrent._cursor1.getRowCount();
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 207;BA.debugLine="cursor1.Position = i";
mostCurrent._cursor1.setPosition(_i);
 //BA.debugLineNum = 208;BA.debugLine="tag(i) = cursor1.GetString(\"Last_Time\")";
_tag[_i] = mostCurrent._cursor1.GetString("Last_Time");
 }
};
 //BA.debugLineNum = 211;BA.debugLine="Return(tag)";
if (true) return (_tag);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private camEx As CameraExClass";
mostCurrent._camex = new avanue.nvwa.cameraexclass();
 //BA.debugLineNum = 27;BA.debugLine="Dim TouchImageView1 As TouchImageView";
mostCurrent._touchimageview1 = new uk.co.martinpearman.b4a.touchimageview.TouchImageViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim ID As String";
mostCurrent._id = "";
 //BA.debugLineNum = 29;BA.debugLine="Dim SQL1 As SQL";
mostCurrent._sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 30;BA.debugLine="Dim cursor1 As Cursor";
mostCurrent._cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim now As Long";
_now = 0L;
 //BA.debugLineNum = 32;BA.debugLine="Public rp As RuntimePermissions";
mostCurrent._rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 33;BA.debugLine="Public tag_subject As String";
mostCurrent._tag_subject = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim Panel1 As Panel";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Dim btnTakePicture As Button";
mostCurrent._btntakepicture = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private MyTaskIndex As Int";
_mytaskindex = 0;
 //BA.debugLineNum = 39;BA.debugLine="Public rp As RuntimePermissions";
mostCurrent._rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 40;BA.debugLine="Dim q_count As Label";
mostCurrent._q_count = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Dim Q_Name , A_Name,T_Name  As String";
mostCurrent._q_name = "";
mostCurrent._a_name = "";
mostCurrent._t_name = "";
 //BA.debugLineNum = 42;BA.debugLine="Dim random_num  As Int";
_random_num = 0;
 //BA.debugLineNum = 43;BA.debugLine="Dim ImageView1 As ImageView";
mostCurrent._imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Dim Current_ID As Int";
_current_id = 0;
 //BA.debugLineNum = 45;BA.debugLine="Dim Current_Time_Create As String";
mostCurrent._current_time_create = "";
 //BA.debugLineNum = 46;BA.debugLine="Dim Current_Time_Modify As String";
mostCurrent._current_time_modify = "";
 //BA.debugLineNum = 47;BA.debugLine="Dim Current_Time_Delete As String";
mostCurrent._current_time_delete = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim Current_Valid As Int";
_current_valid = 0;
 //BA.debugLineNum = 49;BA.debugLine="Dim Current_Subject As String";
mostCurrent._current_subject = "";
 //BA.debugLineNum = 50;BA.debugLine="Dim Current_Leval As Int";
_current_leval = 0;
 //BA.debugLineNum = 51;BA.debugLine="Dim Current_Grade As Int";
_current_grade = 0;
 //BA.debugLineNum = 52;BA.debugLine="Dim Current_Tags As String";
mostCurrent._current_tags = "";
 //BA.debugLineNum = 53;BA.debugLine="Dim Current_Question_Image As String";
mostCurrent._current_question_image = "";
 //BA.debugLineNum = 54;BA.debugLine="Dim Current_Answer_Image As String";
mostCurrent._current_answer_image = "";
 //BA.debugLineNum = 55;BA.debugLine="Dim Current_Correct_Times As Int";
_current_correct_times = 0;
 //BA.debugLineNum = 56;BA.debugLine="Dim Current_Incorrect_Times As Int";
_current_incorrect_times = 0;
 //BA.debugLineNum = 57;BA.debugLine="Dim Current_Last_Time As String";
mostCurrent._current_last_time = "";
 //BA.debugLineNum = 58;BA.debugLine="Dim QA_S As Int";
_qa_s = 0;
 //BA.debugLineNum = 59;BA.debugLine="Dim rule_never_do As Int = 1";
_rule_never_do = (int) (1);
 //BA.debugLineNum = 60;BA.debugLine="Dim rule_correct As Int =0";
_rule_correct = (int) (0);
 //BA.debugLineNum = 61;BA.debugLine="Dim rule_incorrect As Int =1";
_rule_incorrect = (int) (1);
 //BA.debugLineNum = 62;BA.debugLine="Dim tags As String";
mostCurrent._tags = "";
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _incorrect_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 565;BA.debugLine="Private Sub incorrect_Click";
 //BA.debugLineNum = 566;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 569;BA.debugLine="Current_Incorrect_Times = Current_Incorrect_Times";
_current_incorrect_times = (int) (_current_incorrect_times+1);
 //BA.debugLineNum = 570;BA.debugLine="SQL1.ExecNonQuery(\"UPDATE question_bank	SET Incor";
mostCurrent._sql1.ExecNonQuery("UPDATE question_bank	SET Incorrect_Times = '"+BA.NumberToString(_current_incorrect_times)+"' WHERE  ID = '"+BA.NumberToString(_current_id)+"' ");
 //BA.debugLineNum = 572;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 573;BA.debugLine="Msgbox(tn,\"Question\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_tn),BA.ObjectToCharSequence("Question"),mostCurrent.activityBA);
 //BA.debugLineNum = 574;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return "";
}
public static void  _initializecamera() throws Exception{
ResumableSub_InitializeCamera rsub = new ResumableSub_InitializeCamera(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_InitializeCamera extends BA.ResumableSub {
public ResumableSub_InitializeCamera(avanue.nvwa.main parent) {
this.parent = parent;
}
avanue.nvwa.main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 339;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 340;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 341;BA.debugLine="If Result Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 342;BA.debugLine="camEx.Initialize(Panel1, frontCamera, Me, \"Camer";
parent.mostCurrent._camex._initialize /*String*/ (mostCurrent.activityBA,parent.mostCurrent._panel1,parent._frontcamera,main.getObject(),"Camera1");
 //BA.debugLineNum = 343;BA.debugLine="frontCamera = camEx.Front";
parent._frontcamera = parent.mostCurrent._camex._front /*boolean*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 345;BA.debugLine="ToastMessageShow(\"No permission!!!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission!!!"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _maths_click() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Private Sub maths_Click";
 //BA.debugLineNum = 242;BA.debugLine="tag_subject= \"maths\"";
mostCurrent._tag_subject = "maths";
 //BA.debugLineNum = 244;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 246;BA.debugLine="Activity.LoadLayout (\"record\")";
mostCurrent._activity.LoadLayout("record",mostCurrent.activityBA);
 //BA.debugLineNum = 247;BA.debugLine="Try";
try { //BA.debugLineNum = 248;BA.debugLine="InitializeCamera";
_initializecamera();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7); //BA.debugLineNum = 250;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("camera init err"),BA.ObjectToCharSequence("err"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 252;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
mostCurrent._q_count.setText(BA.ObjectToCharSequence(_refresh_count(mostCurrent._tag_subject)));
 //BA.debugLineNum = 253;BA.debugLine="Msgbox(get_tags(tag_subject),\"tags\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_get_tags(mostCurrent._tag_subject)),BA.ObjectToCharSequence("tags"),mostCurrent.activityBA);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public static String  _maths_rev_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 437;BA.debugLine="Private Sub maths_rev_Click";
 //BA.debugLineNum = 438;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 439;BA.debugLine="Activity.LoadLayout(\"review\")";
mostCurrent._activity.LoadLayout("review",mostCurrent.activityBA);
 //BA.debugLineNum = 440;BA.debugLine="tag_subject= \"maths\"";
mostCurrent._tag_subject = "maths";
 //BA.debugLineNum = 441;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 442;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 443;BA.debugLine="If tn = \"\" Then";
if ((_tn).equals("")) { 
 //BA.debugLineNum = 444;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("没题啊"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 445;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 447;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
mostCurrent._touchimageview1.Initialize(mostCurrent.activityBA,"TouchImageView1");
 //BA.debugLineNum = 448;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._touchimageview1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 449;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return "";
}
public static String  _now_string() throws Exception{
String _nows = "";
 //BA.debugLineNum = 70;BA.debugLine="Private Sub now_string As String";
 //BA.debugLineNum = 71;BA.debugLine="now  = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 72;BA.debugLine="Dim nows As String";
_nows = "";
 //BA.debugLineNum = 73;BA.debugLine="DateTime.DateFormat = \"YYYYMMdd.\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("YYYYMMdd.");
 //BA.debugLineNum = 75;BA.debugLine="DateTime.SetTimeZone(8)";
anywheresoftware.b4a.keywords.Common.DateTime.SetTimeZone(8);
 //BA.debugLineNum = 76;BA.debugLine="nows = DateTime.Date(now) & DateTime.Time(now)";
_nows = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now)+anywheresoftware.b4a.keywords.Common.DateTime.Time(_now);
 //BA.debugLineNum = 77;BA.debugLine="Return nows";
if (true) return _nows;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _physics_click() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Private Sub physics_Click";
 //BA.debugLineNum = 271;BA.debugLine="tag_subject= \"physics\"";
mostCurrent._tag_subject = "physics";
 //BA.debugLineNum = 273;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 275;BA.debugLine="Activity.LoadLayout (\"record\")";
mostCurrent._activity.LoadLayout("record",mostCurrent.activityBA);
 //BA.debugLineNum = 276;BA.debugLine="Try";
try { //BA.debugLineNum = 277;BA.debugLine="InitializeCamera";
_initializecamera();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7); //BA.debugLineNum = 279;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("camera init err"),BA.ObjectToCharSequence("err"),mostCurrent.activityBA);
 };
 //BA.debugLineNum = 281;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
mostCurrent._q_count.setText(BA.ObjectToCharSequence(_refresh_count(mostCurrent._tag_subject)));
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public static String  _physics_rev_click() throws Exception{
String _tn = "";
 //BA.debugLineNum = 467;BA.debugLine="Private Sub physics_rev_Click";
 //BA.debugLineNum = 468;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 469;BA.debugLine="Activity.LoadLayout(\"review\")";
mostCurrent._activity.LoadLayout("review",mostCurrent.activityBA);
 //BA.debugLineNum = 470;BA.debugLine="tag_subject= \"physics\"";
mostCurrent._tag_subject = "physics";
 //BA.debugLineNum = 471;BA.debugLine="Dim tn As String";
_tn = "";
 //BA.debugLineNum = 472;BA.debugLine="tn = select_question(tag_subject)";
_tn = _select_question(mostCurrent._tag_subject);
 //BA.debugLineNum = 473;BA.debugLine="If tn = \"\" Then";
if ((_tn).equals("")) { 
 //BA.debugLineNum = 474;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("没题啊"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 475;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 477;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
mostCurrent._touchimageview1.Initialize(mostCurrent.activityBA,"TouchImageView1");
 //BA.debugLineNum = 478;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._touchimageview1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 479;BA.debugLine="Refresh_question(random_num)";
_refresh_question(_random_num);
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
starter._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 19;BA.debugLine="Private frontCamera As Boolean = False";
_frontcamera = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 20;BA.debugLine="Private Storage As ExternalStorage";
_storage = new avanue.nvwa.externalstorage();
 //BA.debugLineNum = 21;BA.debugLine="Private Parents_Dir As ExternalFile";
_parents_dir = new avanue.nvwa.externalstorage._externalfile();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _quit_click() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Private Sub quit_Click";
 //BA.debugLineNum = 163;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public static String  _r_return_click() throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Private Sub r_return_Click";
 //BA.debugLineNum = 410;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 411;BA.debugLine="Activity.LoadLayout(\"subjects\")";
mostCurrent._activity.LoadLayout("subjects",mostCurrent.activityBA);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return "";
}
public static String  _record_click() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Private Sub record_Click";
 //BA.debugLineNum = 167;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 168;BA.debugLine="Activity.LoadLayout(\"subjects\")";
mostCurrent._activity.LoadLayout("subjects",mostCurrent.activityBA);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public static int  _refresh_count(String _subs) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Private Sub refresh_count(subs As String) As Int";
 //BA.debugLineNum = 365;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM question_";
mostCurrent._cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._sql1.ExecQuery("SELECT * FROM question_bank where Subject =  '"+_subs+"' ")));
 //BA.debugLineNum = 366;BA.debugLine="Return cursor1.RowCount";
if (true) return mostCurrent._cursor1.getRowCount();
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return 0;
}
public static String  _refresh_question(int _cn) throws Exception{
String _question_file = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap1 = null;
 //BA.debugLineNum = 546;BA.debugLine="Private Sub Refresh_question(cn As Int)";
 //BA.debugLineNum = 547;BA.debugLine="Dim Question_file As String";
_question_file = "";
 //BA.debugLineNum = 549;BA.debugLine="TouchImageView1.MinScale=0.25			'	default is 0.5";
mostCurrent._touchimageview1.setMinScale((float) (0.25));
 //BA.debugLineNum = 550;BA.debugLine="TouchImageView1.MaxScale=2				'	default is 1.5";
mostCurrent._touchimageview1.setMaxScale((float) (2));
 //BA.debugLineNum = 551;BA.debugLine="TouchImageView1.TranslatePadding=128dip	'	default";
mostCurrent._touchimageview1.setTranslatePadding(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (128)));
 //BA.debugLineNum = 553;BA.debugLine="Question_file = File.Combine(File.DirDefaultExter";
_question_file = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),mostCurrent._cursor1.GetString("Question_Image")+".jpg");
 //BA.debugLineNum = 554;BA.debugLine="Msgbox(Question_file,\"Question File\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_question_file),BA.ObjectToCharSequence("Question File"),mostCurrent.activityBA);
 //BA.debugLineNum = 556;BA.debugLine="Dim Bitmap1 As Bitmap";
_bitmap1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 557;BA.debugLine="Bitmap1.Initialize(File.DirDefaultExternal,cursor";
_bitmap1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),mostCurrent._cursor1.GetString("Question_Image")+".jpg");
 //BA.debugLineNum = 559;BA.debugLine="TouchImageView1.SetBitmap(Bitmap1)";
mostCurrent._touchimageview1.SetBitmap(mostCurrent.activityBA,(android.graphics.Bitmap)(_bitmap1.getObject()));
 //BA.debugLineNum = 561;BA.debugLine="QA_S = 0";
_qa_s = (int) (0);
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public static String  _review_click() throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Private Sub review_Click";
 //BA.debugLineNum = 415;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 416;BA.debugLine="Activity.LoadLayout(\"subjects_rev\")";
mostCurrent._activity.LoadLayout("subjects_rev",mostCurrent.activityBA);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return "";
}
public static String  _select_question(String _subject) throws Exception{
 //BA.debugLineNum = 527;BA.debugLine="private Sub select_question(subject As String) As";
 //BA.debugLineNum = 529;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM question_";
mostCurrent._cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._sql1.ExecQuery("SELECT * FROM question_bank where Subject =  '"+_subject+"' ")));
 //BA.debugLineNum = 530;BA.debugLine="Msgbox(cursor1.RowCount,\"INF\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._cursor1.getRowCount()),BA.ObjectToCharSequence("INF"),mostCurrent.activityBA);
 //BA.debugLineNum = 531;BA.debugLine="If cursor1.RowCount < 1 Then";
if (mostCurrent._cursor1.getRowCount()<1) { 
 //BA.debugLineNum = 532;BA.debugLine="Msgbox(\"找不到题目呢\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("找不到题目呢"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 533;BA.debugLine="Return (\"\")";
if (true) return ("");
 };
 //BA.debugLineNum = 535;BA.debugLine="random_num = Rnd(0,cursor1.RowCount)";
_random_num = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),mostCurrent._cursor1.getRowCount());
 //BA.debugLineNum = 536;BA.debugLine="cursor1.Position = random_num";
mostCurrent._cursor1.setPosition(_random_num);
 //BA.debugLineNum = 537;BA.debugLine="Msgbox(random_num,\"Question Num\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_random_num),BA.ObjectToCharSequence("Question Num"),mostCurrent.activityBA);
 //BA.debugLineNum = 538;BA.debugLine="Current_ID = cursor1.GetInt(\"ID\")";
_current_id = mostCurrent._cursor1.GetInt("ID");
 //BA.debugLineNum = 539;BA.debugLine="Current_Correct_Times = cursor1.GetInt(\"Correct_T";
_current_correct_times = mostCurrent._cursor1.GetInt("Correct_Times");
 //BA.debugLineNum = 540;BA.debugLine="Current_Last_Time = cursor1.GetString(\"Last_Time\"";
mostCurrent._current_last_time = mostCurrent._cursor1.GetString("Last_Time");
 //BA.debugLineNum = 541;BA.debugLine="Msgbox(Current_Correct_Times,\"Correct_Times\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_current_correct_times),BA.ObjectToCharSequence("Correct_Times"),mostCurrent.activityBA);
 //BA.debugLineNum = 542;BA.debugLine="Return(cursor1.GetString(\"Question_Image\"))";
if (true) return (mostCurrent._cursor1.GetString("Question_Image"));
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return "";
}
public static String  _submit_click() throws Exception{
String _td = "";
int _level = 0;
int _i = 0;
int _newid = 0;
 //BA.debugLineNum = 375;BA.debugLine="Private Sub submit_Click";
 //BA.debugLineNum = 376;BA.debugLine="If  A_Name = \"\" Or Q_Name = \"\" Then";
if ((mostCurrent._a_name).equals("") || (mostCurrent._q_name).equals("")) { 
 //BA.debugLineNum = 377;BA.debugLine="Msgbox(\"请先拍题目再拍答案\",\"ERR\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("请先拍题目再拍答案"),BA.ObjectToCharSequence("ERR"),mostCurrent.activityBA);
 //BA.debugLineNum = 378;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 381;BA.debugLine="Dim td As String";
_td = "";
 //BA.debugLineNum = 382;BA.debugLine="td = now_string";
_td = _now_string();
 //BA.debugLineNum = 383;BA.debugLine="Dim level As Int";
_level = 0;
 //BA.debugLineNum = 384;BA.debugLine="level = 1";
_level = (int) (1);
 //BA.debugLineNum = 385;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT ID FROM question";
mostCurrent._cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._sql1.ExecQuery("SELECT ID FROM question_bank")));
 //BA.debugLineNum = 386;BA.debugLine="If cursor1.RowCount > 0 Then";
if (mostCurrent._cursor1.getRowCount()>0) { 
 //BA.debugLineNum = 387;BA.debugLine="For i = 0 To cursor1.RowCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (mostCurrent._cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 388;BA.debugLine="cursor1.Position = i";
mostCurrent._cursor1.setPosition(_i);
 //BA.debugLineNum = 390;BA.debugLine="Dim NewID As Int";
_newid = 0;
 //BA.debugLineNum = 391;BA.debugLine="NewID = cursor1.GetInt(\"ID\")";
_newid = mostCurrent._cursor1.GetInt("ID");
 }
};
 };
 //BA.debugLineNum = 395;BA.debugLine="NewID = NewID +1 ' add 1 to the ID number to make";
_newid = (int) (_newid+1);
 //BA.debugLineNum = 398;BA.debugLine="SQL1.ExecNonQuery(\"INSERT INTO question_bank (ID,";
mostCurrent._sql1.ExecNonQuery("INSERT INTO question_bank (ID,Time_Create,Valid,Subject,Level,Question_Image,Answer_Image)  VALUES('"+BA.NumberToString(_newid)+"','"+_td+"','"+_td+"','"+mostCurrent._tag_subject+"','"+BA.NumberToString(_level)+"','"+mostCurrent._q_name+"','"+mostCurrent._a_name+"')");
 //BA.debugLineNum = 399;BA.debugLine="A_Name = \"\"";
mostCurrent._a_name = "";
 //BA.debugLineNum = 400;BA.debugLine="Q_Name = \"\"";
mostCurrent._q_name = "";
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return "";
}
public static String  _switch_qa_click() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap1 = null;
 //BA.debugLineNum = 577;BA.debugLine="Private Sub switch_qa_Click";
 //BA.debugLineNum = 578;BA.debugLine="Dim Bitmap1 As Bitmap";
_bitmap1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 579;BA.debugLine="If QA_S =0 Then";
if (_qa_s==0) { 
 //BA.debugLineNum = 580;BA.debugLine="QA_S = 1";
_qa_s = (int) (1);
 //BA.debugLineNum = 581;BA.debugLine="Bitmap1.Initialize(File.DirDefaultExternal,curso";
_bitmap1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),mostCurrent._cursor1.GetString("Answer_Image")+".jpg");
 }else {
 //BA.debugLineNum = 583;BA.debugLine="QA_S = 0";
_qa_s = (int) (0);
 //BA.debugLineNum = 584;BA.debugLine="Bitmap1.Initialize(File.DirDefaultExternal,curso";
_bitmap1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),mostCurrent._cursor1.GetString("Question_Image")+".jpg");
 };
 //BA.debugLineNum = 586;BA.debugLine="TouchImageView1.SetBitmap(Bitmap1)";
mostCurrent._touchimageview1.SetBitmap(mostCurrent.activityBA,(android.graphics.Bitmap)(_bitmap1.getObject()));
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return "";
}
}
