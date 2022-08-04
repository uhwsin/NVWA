package avanue.nvwa;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,107);
if (RapidSub.canDelegate("activity_create")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 107;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(2048);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 110;BA.debugLine="Storage.Initialize (Me, \"Storage\")";
Debug.ShouldStop(8192);
main._storage.runClassMethod (avanue.nvwa.externalstorage.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(main.getObject()),(Object)(RemoteObject.createImmutable("Storage")));
 BA.debugLineNum = 111;BA.debugLine="Parents_Dir.Initialize";
Debug.ShouldStop(16384);
main._parents_dir.runVoidMethod ("Initialize");
 BA.debugLineNum = 112;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 119;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_S";
Debug.ShouldStop(4194304);
main.mostCurrent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(main.mostCurrent._rp.getField(true,"PERMISSION_READ_EXTERNAL_STORAGE")));
 BA.debugLineNum = 120;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_WRITE_EXTERNAL_";
Debug.ShouldStop(8388608);
main.mostCurrent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(main.mostCurrent._rp.getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 121;BA.debugLine="rp.GetAllSafeDirsExternal (\"\")";
Debug.ShouldStop(16777216);
main.mostCurrent._rp.runVoidMethod ("GetAllSafeDirsExternal",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 122;BA.debugLine="If File.Exists(File.DirDefaultExternal ,\"nvwa.db";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("nvwa.db"))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 123;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 124;BA.debugLine="File.Copy(File.DirAssets,\"nvwa.db\",File.DirDef";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("nvwa.db")),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("nvwa.db")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e12.toString()); BA.debugLineNum = 126;BA.debugLine="Msgbox(\"Copy error\",\"ERR\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Copy error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 128;BA.debugLine="Msgbox(\"nvwa not exits\",\"DEST\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("nvwa not exits")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("DEST"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 131;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",main.mostCurrent._sql1.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 132;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 133;BA.debugLine="SQL1.Initialize(File.DirDefaultExternal, \"nvwa";
Debug.ShouldStop(16);
main.mostCurrent._sql1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("nvwa.db")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e20.toString()); BA.debugLineNum = 135;BA.debugLine="Msgbox(\"DB Init Error\",\"ERR\")";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("DB Init Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 };
 };
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,166);
if (RapidSub.canDelegate("activity_pause")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 166;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="If camEx.IsInitialized Then";
Debug.ShouldStop(64);
if (main.mostCurrent._camex.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 168;BA.debugLine="camEx.Release";
Debug.ShouldStop(128);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_release" /*RemoteObject*/ );
 };
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,156);
if (RapidSub.canDelegate("activity_permissionresult")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 156;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="If Result=False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_result,main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 158;BA.debugLine="Msgbox(\"Permission Denied\",\"PD\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Permission Denied")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PD"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 160;BA.debugLine="CallSubDelayed(Me, \"permission_done\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed",main.processBA,(Object)(main.getObject()),(Object)(RemoteObject.createImmutable("permission_done")));
 BA.debugLineNum = 161;BA.debugLine="Msgbox(\"Permission OK\",\"P\")";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Permission OK")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("P"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 163;BA.debugLine="Log(Permission)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2393223",_permission,0);
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,151);
if (RapidSub.canDelegate("activity_resume")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 151;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _answer_click() throws Exception{
try {
		Debug.PushSubsStack("answer_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,510);
if (RapidSub.canDelegate("answer_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","answer_click");}
 BA.debugLineNum = 510;BA.debugLine="Private Sub answer_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 511;BA.debugLine="A_Name = now_string";
Debug.ShouldStop(1073741824);
main.mostCurrent._a_name = _now_string();
 BA.debugLineNum = 512;BA.debugLine="T_Name = A_Name";
Debug.ShouldStop(-2147483648);
main.mostCurrent._t_name = main.mostCurrent._a_name;
 BA.debugLineNum = 513;BA.debugLine="camEx.TakePicture";
Debug.ShouldStop(1);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_click() throws Exception{
try {
		Debug.PushSubsStack("back_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,185);
if (RapidSub.canDelegate("back_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","back_click");}
 BA.debugLineNum = 185;BA.debugLine="Private Sub back_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 187;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_rev_click() throws Exception{
try {
		Debug.PushSubsStack("back_rev_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,735);
if (RapidSub.canDelegate("back_rev_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","back_rev_click");}
 BA.debugLineNum = 735;BA.debugLine="Private Sub back_rev_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 736;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 737;BA.debugLine="Activity.LoadLayout(\"subjects_rev\")";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("subjects_rev")),main.mostCurrent.activityBA);
 BA.debugLineNum = 738;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_rule_click() throws Exception{
try {
		Debug.PushSubsStack("back_rule_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,765);
if (RapidSub.canDelegate("back_rule_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","back_rule_click");}
 BA.debugLineNum = 765;BA.debugLine="Private Sub back_rule_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 767;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 768;BA.debugLine="Activity.LoadLayout(\"review\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("review")),main.mostCurrent.activityBA);
 BA.debugLineNum = 769;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _biology_click() throws Exception{
try {
		Debug.PushSubsStack("biology_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,311);
if (RapidSub.canDelegate("biology_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","biology_click");}
 BA.debugLineNum = 311;BA.debugLine="Private Sub biology_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="tag_subject= \"biology\"";
Debug.ShouldStop(8388608);
main.mostCurrent._tag_subject = BA.ObjectToString("biology");
 BA.debugLineNum = 314;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 316;BA.debugLine="Activity.LoadLayout (\"record_choice\")";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_choice")),main.mostCurrent.activityBA);
 BA.debugLineNum = 317;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 318;BA.debugLine="InitializeCamera";
Debug.ShouldStop(536870912);
_initializecamera();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 320;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("camera init err")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("err"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 322;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
Debug.ShouldStop(2);
main.mostCurrent._q_count.runMethod(true,"setText",BA.ObjectToCharSequence(_refresh_count(main.mostCurrent._tag_subject)));
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _biology_imp_click() throws Exception{
try {
		Debug.PushSubsStack("biology_imp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,377);
if (RapidSub.canDelegate("biology_imp_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","biology_imp_click");}
 BA.debugLineNum = 377;BA.debugLine="Private Sub biology_imp_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="tag_subject= \"biology\"";
Debug.ShouldStop(33554432);
main.mostCurrent._tag_subject = BA.ObjectToString("biology");
 BA.debugLineNum = 379;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 380;BA.debugLine="Activity.LoadLayout(\"record_import\")";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_import")),main.mostCurrent.activityBA);
 BA.debugLineNum = 381;BA.debugLine="QuesFileName = \" \"";
Debug.ShouldStop(268435456);
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 382;BA.debugLine="AnsFileName = \" \"";
Debug.ShouldStop(536870912);
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _biology_rev_click() throws Exception{
try {
		Debug.PushSubsStack("biology_rev_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,640);
if (RapidSub.canDelegate("biology_rev_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","biology_rev_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
 BA.debugLineNum = 640;BA.debugLine="Private Sub biology_rev_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 641;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 642;BA.debugLine="Activity.LoadLayout(\"review\")";
Debug.ShouldStop(2);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("review")),main.mostCurrent.activityBA);
 BA.debugLineNum = 643;BA.debugLine="tag_subject= \"biology\"";
Debug.ShouldStop(4);
main.mostCurrent._tag_subject = BA.ObjectToString("biology");
 BA.debugLineNum = 644;BA.debugLine="Dim tn As String";
Debug.ShouldStop(8);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 645;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(16);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 646;BA.debugLine="If tn = \"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_tn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 647;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("没题啊")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 648;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 650;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
Debug.ShouldStop(512);
main.mostCurrent._touchimageview1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("TouchImageView1")));
 BA.debugLineNum = 651;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
Debug.ShouldStop(1024);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._touchimageview1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 652;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(2048);
_refresh_question(main._random_num);
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnflash_click() throws Exception{
try {
		Debug.PushSubsStack("btnFlash_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,490);
if (RapidSub.canDelegate("btnflash_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","btnflash_click");}
RemoteObject _f = null;
RemoteObject _flashmodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flash = RemoteObject.createImmutable("");
 BA.debugLineNum = 490;BA.debugLine="Private Sub btnFlash_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 491;BA.debugLine="Dim f() As Float = camEx.GetFocusDistances";
Debug.ShouldStop(1024);
_f = main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_getfocusdistances" /*RemoteObject*/ );Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 492;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","22228226",RemoteObject.concat(_f.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(", "),_f.getArrayElement(true,BA.numberCast(int.class, 2))),0);
 BA.debugLineNum = 493;BA.debugLine="Dim flashModes As List = camEx.GetSupportedFlashM";
Debug.ShouldStop(4096);
_flashmodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_flashmodes = main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_getsupportedflashmodes" /*RemoteObject*/ );Debug.locals.put("flashModes", _flashmodes);Debug.locals.put("flashModes", _flashmodes);
 BA.debugLineNum = 494;BA.debugLine="If flashModes.IsInitialized = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_flashmodes.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 495;BA.debugLine="ToastMessageShow(\"Flash not supported.\", False)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Flash not supported.")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 496;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 498;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
Debug.ShouldStop(131072);
_flash = BA.ObjectToString(_flashmodes.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_flashmodes.runMethod(true,"IndexOf",(Object)((main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_getflashmode" /*RemoteObject*/ )))),RemoteObject.createImmutable(1)}, "+",1, 1)),_flashmodes.runMethod(true,"getSize")}, "%",0, 1))));Debug.locals.put("flash", _flash);Debug.locals.put("flash", _flash);
 BA.debugLineNum = 499;BA.debugLine="camEx.SetFlashMode(flash)";
Debug.ShouldStop(262144);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_setflashmode" /*RemoteObject*/ ,(Object)(_flash));
 BA.debugLineNum = 500;BA.debugLine="ToastMessageShow(flash, False)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_flash)),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 501;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(1048576);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 503;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnimpans_click() throws Exception{
try {
		Debug.PushSubsStack("btnImpAns_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,404);
if (RapidSub.canDelegate("btnimpans_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","btnimpans_click");}
RemoteObject _answ = RemoteObject.createImmutable(0);
 BA.debugLineNum = 404;BA.debugLine="Private Sub btnImpAns_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 405;BA.debugLine="Dim Answ As Int";
Debug.ShouldStop(1048576);
_answ = RemoteObject.createImmutable(0);Debug.locals.put("Answ", _answ);
 BA.debugLineNum = 407;BA.debugLine="FileDialog1.FilePath = AnsFilePath";
Debug.ShouldStop(4194304);
main.mostCurrent._filedialog1.runMethod(true,"setFilePath",main.mostCurrent._ansfilepath);
 BA.debugLineNum = 408;BA.debugLine="Answ = FileDialog1.Show(\"Databases\",\"Load\",\"Cance";
Debug.ShouldStop(8388608);
_answ = main.mostCurrent._filedialog1.runMethod(true,"Show",(Object)(BA.ObjectToCharSequence("Databases")),(Object)(BA.ObjectToString("Load")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),main.mostCurrent.activityBA,(Object)((main.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Answ", _answ);
 BA.debugLineNum = 410;BA.debugLine="Select Answ";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_answ,main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"),main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL"))) {
case 0: {
 BA.debugLineNum = 412;BA.debugLine="AnsFileName = FileDialog1.ChosenName";
Debug.ShouldStop(134217728);
main.mostCurrent._ansfilename = main.mostCurrent._filedialog1.runMethod(true,"getChosenName");
 BA.debugLineNum = 413;BA.debugLine="AnsFilePath = FileDialog1.FilePath";
Debug.ShouldStop(268435456);
main.mostCurrent._ansfilepath = main.mostCurrent._filedialog1.runMethod(true,"getFilePath");
 BA.debugLineNum = 414;BA.debugLine="ScrAns.Panel.SetBackgroundImage(LoadBitmap(AnsF";
Debug.ShouldStop(536870912);
main.mostCurrent._scrans.runMethod(false,"getPanel").runVoidMethod ("SetBackgroundImageNew",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent._ansfilepath),(Object)(main.mostCurrent._ansfilename)).getObject())));
 BA.debugLineNum = 415;BA.debugLine="BitmapAns.Initialize(AnsFilePath, AnsFileName)";
Debug.ShouldStop(1073741824);
main.mostCurrent._bitmapans.runVoidMethod ("Initialize",(Object)(main.mostCurrent._ansfilepath),(Object)(main.mostCurrent._ansfilename));
 BA.debugLineNum = 416;BA.debugLine="ScrAns.Panel.SetBackgroundImage(BitmapAns)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._scrans.runMethod(false,"getPanel").runVoidMethod ("SetBackgroundImageNew",(Object)((main.mostCurrent._bitmapans.getObject())));
 BA.debugLineNum = 417;BA.debugLine="ScrAns.Panel.Height = Floor(BitmapAns.Height /";
Debug.ShouldStop(1);
main.mostCurrent._scrans.runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._bitmapans.runMethod(true,"getHeight"),RemoteObject.createImmutable(5)}, "/",0, 0))),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 0)));
 BA.debugLineNum = 418;BA.debugLine="ScrAns.Panel.Width = Floor(BitmapAns.Width / 5)";
Debug.ShouldStop(2);
main.mostCurrent._scrans.runMethod(false,"getPanel").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._bitmapans.runMethod(true,"getWidth"),RemoteObject.createImmutable(5)}, "/",0, 0))),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 0)));
 break; }
case 1: {
 break; }
}
;
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnimpcomplete_click() throws Exception{
try {
		Debug.PushSubsStack("btnImpComplete_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,424);
if (RapidSub.canDelegate("btnimpcomplete_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","btnimpcomplete_click");}
RemoteObject _table_name = RemoteObject.createImmutable("");
RemoteObject _td = RemoteObject.createImmutable("");
RemoteObject _level = RemoteObject.createImmutable(0);
RemoteObject _newid = RemoteObject.createImmutable(0);
 BA.debugLineNum = 424;BA.debugLine="Private Sub btnImpComplete_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 425;BA.debugLine="If QuesFileName = \" \" Or AnsFileName = \" \" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",main.mostCurrent._quesfilename,BA.ObjectToString(" ")) || RemoteObject.solveBoolean("=",main.mostCurrent._ansfilename,BA.ObjectToString(" "))) { 
 BA.debugLineNum = 426;BA.debugLine="Msgbox(\"没选完呢！！\",\"ERR\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("没选完呢！！")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 429;BA.debugLine="File.Copy(QuesFilePath,QuesFileName,File.DirDefa";
Debug.ShouldStop(4096);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent._quesfilepath),(Object)(main.mostCurrent._quesfilename),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main.mostCurrent._quesfilename));
 BA.debugLineNum = 430;BA.debugLine="File.Copy(AnsFilePath,AnsFileName,File.DirDefaul";
Debug.ShouldStop(8192);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent._ansfilepath),(Object)(main.mostCurrent._ansfilename),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main.mostCurrent._ansfilename));
 BA.debugLineNum = 431;BA.debugLine="Dim table_name As String";
Debug.ShouldStop(16384);
_table_name = RemoteObject.createImmutable("");Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 432;BA.debugLine="table_name = tag_subject & \"_bank\"";
Debug.ShouldStop(32768);
_table_name = RemoteObject.concat(main.mostCurrent._tag_subject,RemoteObject.createImmutable("_bank"));Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 433;BA.debugLine="Dim td As String";
Debug.ShouldStop(65536);
_td = RemoteObject.createImmutable("");Debug.locals.put("td", _td);
 BA.debugLineNum = 434;BA.debugLine="td = now_string";
Debug.ShouldStop(131072);
_td = _now_string();Debug.locals.put("td", _td);
 BA.debugLineNum = 435;BA.debugLine="Dim level As Int";
Debug.ShouldStop(262144);
_level = RemoteObject.createImmutable(0);Debug.locals.put("level", _level);
 BA.debugLineNum = 436;BA.debugLine="level = 1";
Debug.ShouldStop(524288);
_level = BA.numberCast(int.class, 1);Debug.locals.put("level", _level);
 BA.debugLineNum = 437;BA.debugLine="Dim NewID As Int = 0";
Debug.ShouldStop(1048576);
_newid = BA.numberCast(int.class, 0);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 438;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT ID FROM \" & tab";
Debug.ShouldStop(2097152);
main.mostCurrent._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT ID FROM "),_table_name))));
 BA.debugLineNum = 439;BA.debugLine="NewID = cursor1.RowCount + 1 ' add 1 to the ID n";
Debug.ShouldStop(4194304);
_newid = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 440;BA.debugLine="SQL1.ExecNonQuery(\"INSERT INTO \" & table_name &\"";
Debug.ShouldStop(8388608);
main.mostCurrent._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO "),_table_name,RemoteObject.createImmutable("  (ID,Time_Create,Valid,Level,Question_Image,Answer_Image)  VALUES('"),_newid,RemoteObject.createImmutable("','"),_td,RemoteObject.createImmutable("','"),_td,RemoteObject.createImmutable("','"),_level,RemoteObject.createImmutable("','"),main.mostCurrent._quesfilename,RemoteObject.createImmutable("','"),main.mostCurrent._ansfilename,RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 443;BA.debugLine="QuesFileName = \" \"";
Debug.ShouldStop(67108864);
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 444;BA.debugLine="AnsFileName = \" \"";
Debug.ShouldStop(134217728);
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 445;BA.debugLine="ScrQues.Panel.RemoveView";
Debug.ShouldStop(268435456);
main.mostCurrent._scrques.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 BA.debugLineNum = 446;BA.debugLine="ScrAns.Panel.RemoveView";
Debug.ShouldStop(536870912);
main.mostCurrent._scrans.runMethod(false,"getPanel").runVoidMethod ("RemoveView");
 };
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnimpques_click() throws Exception{
try {
		Debug.PushSubsStack("btnImpQues_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,385);
if (RapidSub.canDelegate("btnimpques_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","btnimpques_click");}
RemoteObject _answ = RemoteObject.createImmutable(0);
 BA.debugLineNum = 385;BA.debugLine="Private Sub btnImpQues_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 386;BA.debugLine="Dim Answ As Int";
Debug.ShouldStop(2);
_answ = RemoteObject.createImmutable(0);Debug.locals.put("Answ", _answ);
 BA.debugLineNum = 388;BA.debugLine="FileDialog1.FilePath = QuesFilePath '弹出选择窗口";
Debug.ShouldStop(8);
main.mostCurrent._filedialog1.runMethod(true,"setFilePath",main.mostCurrent._quesfilepath);
 BA.debugLineNum = 389;BA.debugLine="Answ = FileDialog1.Show(\"Databases\",\"Load\",\"Cance";
Debug.ShouldStop(16);
_answ = main.mostCurrent._filedialog1.runMethod(true,"Show",(Object)(BA.ObjectToCharSequence("Databases")),(Object)(BA.ObjectToString("Load")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),main.mostCurrent.activityBA,(Object)((main.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Answ", _answ);
 BA.debugLineNum = 391;BA.debugLine="Select Answ";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_answ,main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"),main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL"))) {
case 0: {
 BA.debugLineNum = 393;BA.debugLine="QuesFileName = FileDialog1.ChosenName";
Debug.ShouldStop(256);
main.mostCurrent._quesfilename = main.mostCurrent._filedialog1.runMethod(true,"getChosenName");
 BA.debugLineNum = 394;BA.debugLine="QuesFilePath = FileDialog1.FilePath";
Debug.ShouldStop(512);
main.mostCurrent._quesfilepath = main.mostCurrent._filedialog1.runMethod(true,"getFilePath");
 BA.debugLineNum = 395;BA.debugLine="BitmapQues.Initialize(QuesFilePath, QuesFileNam";
Debug.ShouldStop(1024);
main.mostCurrent._bitmapques.runVoidMethod ("Initialize",(Object)(main.mostCurrent._quesfilepath),(Object)(main.mostCurrent._quesfilename));
 BA.debugLineNum = 396;BA.debugLine="ScrQues.Panel.SetBackgroundImage(BitmapQues)";
Debug.ShouldStop(2048);
main.mostCurrent._scrques.runMethod(false,"getPanel").runVoidMethod ("SetBackgroundImageNew",(Object)((main.mostCurrent._bitmapques.getObject())));
 BA.debugLineNum = 397;BA.debugLine="ScrQues.Panel.Height = Floor(BitmapQues.Height";
Debug.ShouldStop(4096);
main.mostCurrent._scrques.runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._bitmapques.runMethod(true,"getHeight"),RemoteObject.createImmutable(5)}, "/",0, 0))),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 0)));
 BA.debugLineNum = 398;BA.debugLine="ScrQues.Panel.Width = Floor(BitmapQues.Width /";
Debug.ShouldStop(8192);
main.mostCurrent._scrques.runMethod(false,"getPanel").runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent._bitmapques.runMethod(true,"getWidth"),RemoteObject.createImmutable(5)}, "/",0, 0))),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "*",0, 0)));
 break; }
case 1: {
 break; }
}
;
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntakepicture_click() throws Exception{
try {
		Debug.PushSubsStack("btnTakePicture_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,471);
if (RapidSub.canDelegate("btntakepicture_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","btntakepicture_click");}
 BA.debugLineNum = 471;BA.debugLine="Sub btnTakePicture_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 473;BA.debugLine="Q_Name = now_string";
Debug.ShouldStop(16777216);
main.mostCurrent._q_name = _now_string();
 BA.debugLineNum = 474;BA.debugLine="T_Name = Q_Name";
Debug.ShouldStop(33554432);
main.mostCurrent._t_name = main.mostCurrent._q_name;
 BA.debugLineNum = 475;BA.debugLine="camEx.TakePicture";
Debug.ShouldStop(67108864);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_takepicture" /*RemoteObject*/ );
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera1_focusdone(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera1_FocusDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,203);
if (RapidSub.canDelegate("camera1_focusdone")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","camera1_focusdone", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 203;BA.debugLine="Sub Camera1_FocusDone(Success As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Msgbox(\"Mamera focus down\",\"FD\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Mamera focus down")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("FD"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 205;BA.debugLine="If Success Then";
Debug.ShouldStop(4096);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 206;BA.debugLine="Msgbox(\"Camera focus down\",\"Focus DONE\")";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Camera focus down")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Focus DONE"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera1_picturetaken(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera1_PictureTaken (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,452);
if (RapidSub.canDelegate("camera1_picturetaken")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","camera1_picturetaken", _data);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 452;BA.debugLine="Sub Camera1_PictureTaken (Data() As Byte)";
Debug.ShouldStop(8);
 BA.debugLineNum = 454;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(32);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 457;BA.debugLine="camEx.SavePictureToFile(Data, File.DirDefaultExte";
Debug.ShouldStop(256);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_savepicturetofile" /*RemoteObject*/ ,(Object)(_data),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.concat(main.mostCurrent._t_name,RemoteObject.createImmutable(".jpg"))));
 BA.debugLineNum = 458;BA.debugLine="camEx.StartPreview 'restart preview";
Debug.ShouldStop(512);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 BA.debugLineNum = 460;BA.debugLine="ToastMessageShow(\"Image saved: \" & File.Combine(F";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Image saved: "),main.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.concat(main.mostCurrent._t_name,RemoteObject.createImmutable(".jpg"))))))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 461;BA.debugLine="btnTakePicture.Enabled = True";
Debug.ShouldStop(4096);
main.mostCurrent._btntakepicture.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera1_ready(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera1_Ready (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,190);
if (RapidSub.canDelegate("camera1_ready")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","camera1_ready", _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 190;BA.debugLine="Sub Camera1_Ready (Success As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="If Success Then";
Debug.ShouldStop(1073741824);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 192;BA.debugLine="camEx.SetJpegQuality(90)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_setjpegquality" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 90)));
 BA.debugLineNum = 193;BA.debugLine="camEx.SetContinuousAutoFocus";
Debug.ShouldStop(1);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_setcontinuousautofocus" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(2);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="camEx.StartPreview";
Debug.ShouldStop(4);
main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 BA.debugLineNum = 196;BA.debugLine="Log(camEx.GetPreviewSize)";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2720902",BA.ObjectToString(main.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_getpreviewsize" /*RemoteObject*/ )),0);
 }else {
 BA.debugLineNum = 198;BA.debugLine="ToastMessageShow(\"Cannot open camera.\", True)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cannot open camera.")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancel_click() throws Exception{
try {
		Debug.PushSubsStack("cancel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,547);
if (RapidSub.canDelegate("cancel_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","cancel_click");}
 BA.debugLineNum = 547;BA.debugLine="Private Sub cancel_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="A_Name = \"\"";
Debug.ShouldStop(8);
main.mostCurrent._a_name = BA.ObjectToString("");
 BA.debugLineNum = 549;BA.debugLine="Q_Name = \"\"";
Debug.ShouldStop(16);
main.mostCurrent._q_name = BA.ObjectToString("");
 BA.debugLineNum = 550;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _change_rules_click() throws Exception{
try {
		Debug.PushSubsStack("change_rules_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,744);
if (RapidSub.canDelegate("change_rules_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","change_rules_click");}
 BA.debugLineNum = 744;BA.debugLine="Private Sub change_rules_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 745;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM \" & tag_s";
Debug.ShouldStop(256);
main.mostCurrent._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM "),main.mostCurrent._tag_subject,RemoteObject.createImmutable("_bank")))));
 BA.debugLineNum = 747;BA.debugLine="If cursor1.RowCount < 1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",main.mostCurrent._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 748;BA.debugLine="Msgbox(\"找不到题目呢\",\"ERR\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("找不到题目呢")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 749;BA.debugLine="Return (\"\")";
Debug.ShouldStop(4096);
if (true) return (RemoteObject.createImmutable(""));
 };
 BA.debugLineNum = 752;BA.debugLine="random_num = Rnd(0,cursor1.RowCount)";
Debug.ShouldStop(32768);
main._random_num = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._cursor1.runMethod(true,"getRowCount")));
 BA.debugLineNum = 753;BA.debugLine="cursor1.Position = random_num";
Debug.ShouldStop(65536);
main.mostCurrent._cursor1.runMethod(true,"setPosition",main._random_num);
 BA.debugLineNum = 755;BA.debugLine="Current_ID = cursor1.GetInt(\"ID\")";
Debug.ShouldStop(262144);
main._current_id = main.mostCurrent._cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID")));
 BA.debugLineNum = 756;BA.debugLine="Current_Correct_Times = cursor1.GetInt(\"Correct_T";
Debug.ShouldStop(524288);
main._current_correct_times = main.mostCurrent._cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Correct_Times")));
 BA.debugLineNum = 757;BA.debugLine="Current_Last_Time = cursor1.GetString(\"Last_Time\"";
Debug.ShouldStop(1048576);
main.mostCurrent._current_last_time = main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Last_Time")));
 BA.debugLineNum = 759;BA.debugLine="Return(cursor1.GetString(\"Question_Image\"))";
Debug.ShouldStop(4194304);
if (true) return (main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Question_Image"))));
 BA.debugLineNum = 760;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(8388608);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 761;BA.debugLine="Activity.LoadLayout(\"select_rule\")";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("select_rule")),main.mostCurrent.activityBA);
 BA.debugLineNum = 763;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chemistry_click() throws Exception{
try {
		Debug.PushSubsStack("chemistry_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,297);
if (RapidSub.canDelegate("chemistry_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","chemistry_click");}
 BA.debugLineNum = 297;BA.debugLine="Private Sub chemistry_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="tag_subject= \"chemistry\"";
Debug.ShouldStop(512);
main.mostCurrent._tag_subject = BA.ObjectToString("chemistry");
 BA.debugLineNum = 300;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 302;BA.debugLine="Activity.LoadLayout (\"record_choice\")";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_choice")),main.mostCurrent.activityBA);
 BA.debugLineNum = 303;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 304;BA.debugLine="InitializeCamera";
Debug.ShouldStop(32768);
_initializecamera();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 306;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("camera init err")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("err"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 308;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
Debug.ShouldStop(524288);
main.mostCurrent._q_count.runMethod(true,"setText",BA.ObjectToCharSequence(_refresh_count(main.mostCurrent._tag_subject)));
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chemistry_imp_click() throws Exception{
try {
		Debug.PushSubsStack("chemistry_imp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,369);
if (RapidSub.canDelegate("chemistry_imp_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","chemistry_imp_click");}
 BA.debugLineNum = 369;BA.debugLine="Private Sub chemistry_imp_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 370;BA.debugLine="tag_subject= \"chemistry\"";
Debug.ShouldStop(131072);
main.mostCurrent._tag_subject = BA.ObjectToString("chemistry");
 BA.debugLineNum = 371;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 372;BA.debugLine="Activity.LoadLayout(\"record_import\")";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_import")),main.mostCurrent.activityBA);
 BA.debugLineNum = 373;BA.debugLine="QuesFileName = \" \"";
Debug.ShouldStop(1048576);
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 374;BA.debugLine="AnsFileName = \" \"";
Debug.ShouldStop(2097152);
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chemistry_rev_click() throws Exception{
try {
		Debug.PushSubsStack("chemistry_rev_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,625);
if (RapidSub.canDelegate("chemistry_rev_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","chemistry_rev_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
 BA.debugLineNum = 625;BA.debugLine="Private Sub chemistry_rev_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 626;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 627;BA.debugLine="Activity.LoadLayout(\"review\")";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("review")),main.mostCurrent.activityBA);
 BA.debugLineNum = 628;BA.debugLine="tag_subject= \"chemistry\"";
Debug.ShouldStop(524288);
main.mostCurrent._tag_subject = BA.ObjectToString("chemistry");
 BA.debugLineNum = 629;BA.debugLine="Dim tn As String";
Debug.ShouldStop(1048576);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 630;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(2097152);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 631;BA.debugLine="If tn = \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_tn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 632;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("没题啊")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 633;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 635;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
Debug.ShouldStop(67108864);
main.mostCurrent._touchimageview1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("TouchImageView1")));
 BA.debugLineNum = 636;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._touchimageview1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 637;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(268435456);
_refresh_question(main._random_num);
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chinese_click() throws Exception{
try {
		Debug.PushSubsStack("chinese_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,230);
if (RapidSub.canDelegate("chinese_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","chinese_click");}
RemoteObject _tempcheckbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 BA.debugLineNum = 230;BA.debugLine="Private Sub chinese_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="tag_subject= \"chinese\"";
Debug.ShouldStop(64);
main.mostCurrent._tag_subject = BA.ObjectToString("chinese");
 BA.debugLineNum = 233;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(256);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 235;BA.debugLine="Activity.LoadLayout (\"record\")";
Debug.ShouldStop(1024);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record")),main.mostCurrent.activityBA);
 BA.debugLineNum = 236;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 237;BA.debugLine="InitializeCamera";
Debug.ShouldStop(4096);
_initializecamera();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 239;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("camera init err")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("err"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 241;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
Debug.ShouldStop(65536);
main.mostCurrent._q_count.runMethod(true,"setText",BA.ObjectToCharSequence(_refresh_count(main.mostCurrent._tag_subject)));
 BA.debugLineNum = 242;BA.debugLine="Msgbox(get_tags(tag_subject),\"tags\")";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_get_tags(main.mostCurrent._tag_subject))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("tags"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 243;BA.debugLine="Dim tempcheckbox  As CheckBox";
Debug.ShouldStop(262144);
_tempcheckbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("tempcheckbox", _tempcheckbox);
 BA.debugLineNum = 244;BA.debugLine="tempcheckbox.Initialize(\"tempcheckbox\")";
Debug.ShouldStop(524288);
_tempcheckbox.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tempcheckbox")));
 BA.debugLineNum = 245;BA.debugLine="tempcheckbox.Text =\"TEMP\"";
Debug.ShouldStop(1048576);
_tempcheckbox.runMethod(true,"setText",BA.ObjectToCharSequence("TEMP"));
 BA.debugLineNum = 249;BA.debugLine="Activity.Addview(tempcheckbox, 90%x,1%y,10%x,10%y";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_tempcheckbox.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chinese_imp_click() throws Exception{
try {
		Debug.PushSubsStack("chinese_imp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,337);
if (RapidSub.canDelegate("chinese_imp_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","chinese_imp_click");}
 BA.debugLineNum = 337;BA.debugLine="Private Sub chinese_imp_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="tag_subject= \"chinese\"";
Debug.ShouldStop(131072);
main.mostCurrent._tag_subject = BA.ObjectToString("chinese");
 BA.debugLineNum = 339;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 340;BA.debugLine="Activity.LoadLayout(\"record_import\")";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_import")),main.mostCurrent.activityBA);
 BA.debugLineNum = 341;BA.debugLine="QuesFileName = \" \"";
Debug.ShouldStop(1048576);
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 342;BA.debugLine="AnsFileName = \" \"";
Debug.ShouldStop(2097152);
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chinese_rev_click() throws Exception{
try {
		Debug.PushSubsStack("chinese_rev_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,563);
if (RapidSub.canDelegate("chinese_rev_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","chinese_rev_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
 BA.debugLineNum = 563;BA.debugLine="Private Sub chinese_rev_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 564;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 565;BA.debugLine="Activity.LoadLayout(\"review\")";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("review")),main.mostCurrent.activityBA);
 BA.debugLineNum = 566;BA.debugLine="tag_subject= \"chinese\"";
Debug.ShouldStop(2097152);
main.mostCurrent._tag_subject = BA.ObjectToString("chinese");
 BA.debugLineNum = 567;BA.debugLine="Dim tn As String";
Debug.ShouldStop(4194304);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 568;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(8388608);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 569;BA.debugLine="If tn = \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_tn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 570;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("没题啊")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 571;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 574;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
Debug.ShouldStop(536870912);
main.mostCurrent._touchimageview1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("TouchImageView1")));
 BA.debugLineNum = 575;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._touchimageview1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 576;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(-2147483648);
_refresh_question(main._random_num);
 BA.debugLineNum = 578;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _correct_click() throws Exception{
try {
		Debug.PushSubsStack("correct_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,655);
if (RapidSub.canDelegate("correct_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","correct_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
RemoteObject _table_name = RemoteObject.createImmutable("");
 BA.debugLineNum = 655;BA.debugLine="Private Sub correct_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 656;BA.debugLine="Dim tn As String";
Debug.ShouldStop(32768);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 657;BA.debugLine="Dim table_name As String";
Debug.ShouldStop(65536);
_table_name = RemoteObject.createImmutable("");Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 658;BA.debugLine="table_name = tag_subject & \"_bank\"";
Debug.ShouldStop(131072);
_table_name = RemoteObject.concat(main.mostCurrent._tag_subject,RemoteObject.createImmutable("_bank"));Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 661;BA.debugLine="Current_Correct_Times = Current_Correct_Times +1";
Debug.ShouldStop(1048576);
main._current_correct_times = RemoteObject.solve(new RemoteObject[] {main._current_correct_times,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 662;BA.debugLine="SQL1.ExecNonQuery(\"UPDATE '\"& table_name &\"' SET";
Debug.ShouldStop(2097152);
main.mostCurrent._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE '"),_table_name,RemoteObject.createImmutable("' SET Correct_Times = '"),main._current_correct_times,RemoteObject.createImmutable("' WHERE  ID = '"),main._current_id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 663;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(4194304);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 665;BA.debugLine="If tn = \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_tn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 666;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 668;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(134217728);
_refresh_question(main._random_num);
 BA.debugLineNum = 669;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbload() throws Exception{
try {
		Debug.PushSubsStack("DBload (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,94);
if (RapidSub.canDelegate("dbload")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","dbload");}
 BA.debugLineNum = 94;BA.debugLine="Sub DBload";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 96;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM question_";
Debug.ShouldStop(-2147483648);
main.mostCurrent._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM question_bank"))));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _english_click() throws Exception{
try {
		Debug.PushSubsStack("english_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,269);
if (RapidSub.canDelegate("english_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","english_click");}
 BA.debugLineNum = 269;BA.debugLine="Private Sub english_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="tag_subject= \"english\"";
Debug.ShouldStop(8192);
main.mostCurrent._tag_subject = BA.ObjectToString("english");
 BA.debugLineNum = 272;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 274;BA.debugLine="Activity.LoadLayout (\"record_choice\")";
Debug.ShouldStop(131072);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_choice")),main.mostCurrent.activityBA);
 BA.debugLineNum = 275;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 276;BA.debugLine="InitializeCamera";
Debug.ShouldStop(524288);
_initializecamera();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 278;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("camera init err")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("err"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 280;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
Debug.ShouldStop(8388608);
main.mostCurrent._q_count.runMethod(true,"setText",BA.ObjectToCharSequence(_refresh_count(main.mostCurrent._tag_subject)));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _english_imp_click() throws Exception{
try {
		Debug.PushSubsStack("english_imp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,353);
if (RapidSub.canDelegate("english_imp_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","english_imp_click");}
 BA.debugLineNum = 353;BA.debugLine="Private Sub english_imp_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="tag_subject= \"english\"";
Debug.ShouldStop(2);
main.mostCurrent._tag_subject = BA.ObjectToString("english");
 BA.debugLineNum = 355;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 356;BA.debugLine="Activity.LoadLayout(\"record_import\")";
Debug.ShouldStop(8);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_import")),main.mostCurrent.activityBA);
 BA.debugLineNum = 357;BA.debugLine="QuesFileName = \" \"";
Debug.ShouldStop(16);
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 358;BA.debugLine="AnsFileName = \" \"";
Debug.ShouldStop(32);
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _english_rev_click() throws Exception{
try {
		Debug.PushSubsStack("english_rev_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,595);
if (RapidSub.canDelegate("english_rev_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","english_rev_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
 BA.debugLineNum = 595;BA.debugLine="Private Sub english_rev_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 596;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 597;BA.debugLine="Activity.LoadLayout(\"review\")";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("review")),main.mostCurrent.activityBA);
 BA.debugLineNum = 598;BA.debugLine="tag_subject= \"english\"";
Debug.ShouldStop(2097152);
main.mostCurrent._tag_subject = BA.ObjectToString("english");
 BA.debugLineNum = 599;BA.debugLine="Dim tn As String";
Debug.ShouldStop(4194304);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 600;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(8388608);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 601;BA.debugLine="If tn = \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_tn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 602;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("没题啊")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 603;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 605;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
Debug.ShouldStop(268435456);
main.mostCurrent._touchimageview1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("TouchImageView1")));
 BA.debugLineNum = 606;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
Debug.ShouldStop(536870912);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._touchimageview1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 607;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(1073741824);
_refresh_question(main._random_num);
 BA.debugLineNum = 608;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_tags(RemoteObject _subject) throws Exception{
try {
		Debug.PushSubsStack("get_tags (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,210);
if (RapidSub.canDelegate("get_tags")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","get_tags", _subject);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _tag = null;
Debug.locals.put("subject", _subject);
 BA.debugLineNum = 210;BA.debugLine="Sub get_tags(subject As String) As String()";
Debug.ShouldStop(131072);
 BA.debugLineNum = 212;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM tags wher";
Debug.ShouldStop(524288);
main.mostCurrent._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM tags where Subject =  '"),_subject,RemoteObject.createImmutable("' ")))));
 BA.debugLineNum = 213;BA.debugLine="Msgbox(cursor1.RowCount,\"INF\")";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(main.mostCurrent._cursor1.runMethod(true,"getRowCount"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("INF"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 214;BA.debugLine="If cursor1.RowCount < 1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",main.mostCurrent._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 215;BA.debugLine="Msgbox(\"找不到tags呢\",\"ERR\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("找不到tags呢")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 216;BA.debugLine="Return (Null)";
Debug.ShouldStop(8388608);
if (true) return ((main.mostCurrent.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 218;BA.debugLine="Dim i As Int";
Debug.ShouldStop(33554432);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 219;BA.debugLine="Dim tag(100) As String";
Debug.ShouldStop(67108864);
_tag = RemoteObject.createNewArray ("String", new int[] {100}, new Object[]{});Debug.locals.put("tag", _tag);
 BA.debugLineNum = 220;BA.debugLine="For i = 0 To cursor1.RowCount - 1";
Debug.ShouldStop(134217728);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 221;BA.debugLine="cursor1.Position = i";
Debug.ShouldStop(268435456);
main.mostCurrent._cursor1.runMethod(true,"setPosition",_i);
 BA.debugLineNum = 222;BA.debugLine="tag(i) = cursor1.GetString(\"tag_name\")";
Debug.ShouldStop(536870912);
_tag.setArrayElement (main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tag_name"))),_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 225;BA.debugLine="Return(tag)";
Debug.ShouldStop(1);
if (true) return (_tag);
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private camEx As CameraExClass";
main.mostCurrent._camex = RemoteObject.createNew ("avanue.nvwa.cameraexclass");
 //BA.debugLineNum = 27;BA.debugLine="Dim TouchImageView1 As TouchImageView";
main.mostCurrent._touchimageview1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.touchimageview.TouchImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim ID As String";
main.mostCurrent._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Dim SQL1 As SQL";
main.mostCurrent._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 30;BA.debugLine="Dim cursor1 As Cursor";
main.mostCurrent._cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim now As Long";
main._now = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 32;BA.debugLine="Public rp As RuntimePermissions";
main.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 33;BA.debugLine="Public tag_subject As String";
main.mostCurrent._tag_subject = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim btnTakePicture As Button";
main.mostCurrent._btntakepicture = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private MyTaskIndex As Int";
main._mytaskindex = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 39;BA.debugLine="Public rp As RuntimePermissions";
main.mostCurrent._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 40;BA.debugLine="Dim q_count As Label";
main.mostCurrent._q_count = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Dim Q_Name , A_Name,T_Name  As String";
main.mostCurrent._q_name = RemoteObject.createImmutable("");
main.mostCurrent._a_name = RemoteObject.createImmutable("");
main.mostCurrent._t_name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 42;BA.debugLine="Dim random_num  As Int";
main._random_num = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 43;BA.debugLine="Dim ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim Current_ID As Int";
main._current_id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 45;BA.debugLine="Dim Current_Time_Create As String";
main.mostCurrent._current_time_create = RemoteObject.createImmutable("");
 //BA.debugLineNum = 46;BA.debugLine="Dim Current_Time_Modify As String";
main.mostCurrent._current_time_modify = RemoteObject.createImmutable("");
 //BA.debugLineNum = 47;BA.debugLine="Dim Current_Time_Delete As String";
main.mostCurrent._current_time_delete = RemoteObject.createImmutable("");
 //BA.debugLineNum = 48;BA.debugLine="Dim Current_Valid As Int";
main._current_valid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 49;BA.debugLine="Dim Current_Subject As String";
main.mostCurrent._current_subject = RemoteObject.createImmutable("");
 //BA.debugLineNum = 50;BA.debugLine="Dim Current_Leval As Int";
main._current_leval = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 51;BA.debugLine="Dim Current_Grade As Int";
main._current_grade = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 52;BA.debugLine="Dim Current_Tags As String";
main.mostCurrent._current_tags = RemoteObject.createImmutable("");
 //BA.debugLineNum = 53;BA.debugLine="Dim Current_Question_Image As String";
main.mostCurrent._current_question_image = RemoteObject.createImmutable("");
 //BA.debugLineNum = 54;BA.debugLine="Dim Current_Answer_Image As String";
main.mostCurrent._current_answer_image = RemoteObject.createImmutable("");
 //BA.debugLineNum = 55;BA.debugLine="Dim Current_Correct_Times As Int";
main._current_correct_times = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 56;BA.debugLine="Dim Current_Incorrect_Times As Int";
main._current_incorrect_times = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 57;BA.debugLine="Dim Current_Last_Time As String";
main.mostCurrent._current_last_time = RemoteObject.createImmutable("");
 //BA.debugLineNum = 58;BA.debugLine="Dim QA_S As Int";
main._qa_s = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 59;BA.debugLine="Dim rule_never_do As Int = 1";
main._rule_never_do = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 60;BA.debugLine="Dim rule_correct As Int =0";
main._rule_correct = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 61;BA.debugLine="Dim rule_incorrect As Int =1";
main._rule_incorrect = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 62;BA.debugLine="Dim tags As String";
main.mostCurrent._tags = RemoteObject.createImmutable("");
 //BA.debugLineNum = 65;BA.debugLine="Dim FileDialog1 As FileDialog";
main.mostCurrent._filedialog1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs2.InputDialog.FileDialog");
 //BA.debugLineNum = 66;BA.debugLine="Dim QuesFilePath As String = File.DirRootExternal";
main.mostCurrent._quesfilepath = main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal");
 //BA.debugLineNum = 67;BA.debugLine="Dim QuesFileName As String = \" \"";
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 //BA.debugLineNum = 68;BA.debugLine="Dim AnsFilePath As String = File.DirRootExternal";
main.mostCurrent._ansfilepath = main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal");
 //BA.debugLineNum = 69;BA.debugLine="Dim AnsFileName As String = \" \"";
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 //BA.debugLineNum = 70;BA.debugLine="Dim BitmapQues As Bitmap";
main.mostCurrent._bitmapques = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Dim BitmapAns As Bitmap";
main.mostCurrent._bitmapans = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private ScrAns As ScrollView2D";
main.mostCurrent._scrans = RemoteObject.createNew ("flm.b4a.scrollview2d.ScrollView2DWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private ScrQues As ScrollView2D";
main.mostCurrent._scrques = RemoteObject.createNew ("flm.b4a.scrollview2d.ScrollView2DWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private btnImpAns As Button";
main.mostCurrent._btnimpans = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private btnImpComplete As Button";
main.mostCurrent._btnimpcomplete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private btnImpQues As Button";
main.mostCurrent._btnimpques = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _incorrect_click() throws Exception{
try {
		Debug.PushSubsStack("incorrect_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,710);
if (RapidSub.canDelegate("incorrect_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","incorrect_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
RemoteObject _table_name = RemoteObject.createImmutable("");
 BA.debugLineNum = 710;BA.debugLine="Private Sub incorrect_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 711;BA.debugLine="Dim tn As String";
Debug.ShouldStop(64);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 712;BA.debugLine="Dim table_name As String";
Debug.ShouldStop(128);
_table_name = RemoteObject.createImmutable("");Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 713;BA.debugLine="table_name = tag_subject & \"_bank\"";
Debug.ShouldStop(256);
_table_name = RemoteObject.concat(main.mostCurrent._tag_subject,RemoteObject.createImmutable("_bank"));Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 715;BA.debugLine="Current_Incorrect_Times = Current_Incorrect_Times";
Debug.ShouldStop(1024);
main._current_incorrect_times = RemoteObject.solve(new RemoteObject[] {main._current_incorrect_times,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 716;BA.debugLine="SQL1.ExecNonQuery(\"UPDATE '\"& table_name &\"' SET";
Debug.ShouldStop(2048);
main.mostCurrent._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE '"),_table_name,RemoteObject.createImmutable("' SET Incorrect_Times = '"),main._current_incorrect_times,RemoteObject.createImmutable("' WHERE  ID = '"),main._current_id,RemoteObject.createImmutable("' "))));
 BA.debugLineNum = 718;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(8192);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 719;BA.debugLine="Msgbox(tn,\"Question\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_tn)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Question"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 720;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(32768);
_refresh_question(main._random_num);
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _initializecamera() throws Exception{
try {
		Debug.PushSubsStack("InitializeCamera (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,479);
if (RapidSub.canDelegate("initializecamera")) { avanue.nvwa.main.remoteMe.runUserSub(false, "main","initializecamera"); return;}
ResumableSub_InitializeCamera rsub = new ResumableSub_InitializeCamera(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InitializeCamera extends BA.ResumableSub {
public ResumableSub_InitializeCamera(avanue.nvwa.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
avanue.nvwa.main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InitializeCamera (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,479);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 480;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 481;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "initializecamera"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 482;BA.debugLine="If Result Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 6;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 483;BA.debugLine="camEx.Initialize(Panel1, frontCamera, Me, \"Camer";
Debug.ShouldStop(4);
parent.mostCurrent._camex.runClassMethod (avanue.nvwa.cameraexclass.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._panel1),(Object)(parent._frontcamera),(Object)(main.getObject()),(Object)(RemoteObject.createImmutable("Camera1")));
 BA.debugLineNum = 484;BA.debugLine="frontCamera = camEx.Front";
Debug.ShouldStop(8);
parent._frontcamera = parent.mostCurrent._camex.getField(true,"_front" /*RemoteObject*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 486;BA.debugLine="ToastMessageShow(\"No permission!!!\", True)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No permission!!!")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 488;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _maths_click() throws Exception{
try {
		Debug.PushSubsStack("maths_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,254);
if (RapidSub.canDelegate("maths_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","maths_click");}
 BA.debugLineNum = 254;BA.debugLine="Private Sub maths_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="tag_subject= \"maths\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._tag_subject = BA.ObjectToString("maths");
 BA.debugLineNum = 257;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 259;BA.debugLine="Activity.LoadLayout (\"record_choice\")";
Debug.ShouldStop(4);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_choice")),main.mostCurrent.activityBA);
 BA.debugLineNum = 260;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 261;BA.debugLine="InitializeCamera";
Debug.ShouldStop(16);
_initializecamera();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 263;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("camera init err")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("err"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 265;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
Debug.ShouldStop(256);
main.mostCurrent._q_count.runMethod(true,"setText",BA.ObjectToCharSequence(_refresh_count(main.mostCurrent._tag_subject)));
 BA.debugLineNum = 266;BA.debugLine="Msgbox(get_tags(tag_subject),\"tags\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_get_tags(main.mostCurrent._tag_subject))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("tags"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maths_imp_click() throws Exception{
try {
		Debug.PushSubsStack("maths_imp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,345);
if (RapidSub.canDelegate("maths_imp_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","maths_imp_click");}
 BA.debugLineNum = 345;BA.debugLine="Private Sub maths_imp_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="tag_subject= \"maths\"";
Debug.ShouldStop(33554432);
main.mostCurrent._tag_subject = BA.ObjectToString("maths");
 BA.debugLineNum = 347;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 348;BA.debugLine="Activity.LoadLayout(\"record_import\")";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_import")),main.mostCurrent.activityBA);
 BA.debugLineNum = 349;BA.debugLine="QuesFileName = \" \"";
Debug.ShouldStop(268435456);
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 350;BA.debugLine="AnsFileName = \" \"";
Debug.ShouldStop(536870912);
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maths_rev_click() throws Exception{
try {
		Debug.PushSubsStack("maths_rev_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,580);
if (RapidSub.canDelegate("maths_rev_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","maths_rev_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
 BA.debugLineNum = 580;BA.debugLine="Private Sub maths_rev_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 581;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 582;BA.debugLine="Activity.LoadLayout(\"review\")";
Debug.ShouldStop(32);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("review")),main.mostCurrent.activityBA);
 BA.debugLineNum = 583;BA.debugLine="tag_subject= \"maths\"";
Debug.ShouldStop(64);
main.mostCurrent._tag_subject = BA.ObjectToString("maths");
 BA.debugLineNum = 584;BA.debugLine="Dim tn As String";
Debug.ShouldStop(128);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 585;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(256);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 586;BA.debugLine="If tn = \"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_tn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 587;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("没题啊")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 588;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 590;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
Debug.ShouldStop(8192);
main.mostCurrent._touchimageview1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("TouchImageView1")));
 BA.debugLineNum = 591;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._touchimageview1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 592;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(32768);
_refresh_question(main._random_num);
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _now_string() throws Exception{
try {
		Debug.PushSubsStack("now_string (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,84);
if (RapidSub.canDelegate("now_string")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","now_string");}
RemoteObject _nows = RemoteObject.createImmutable("");
 BA.debugLineNum = 84;BA.debugLine="Private Sub now_string As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="now  = DateTime.Now";
Debug.ShouldStop(1048576);
main._now = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 BA.debugLineNum = 86;BA.debugLine="Dim nows As String";
Debug.ShouldStop(2097152);
_nows = RemoteObject.createImmutable("");Debug.locals.put("nows", _nows);
 BA.debugLineNum = 87;BA.debugLine="DateTime.DateFormat = \"YYYYMMdd.\"";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("YYYYMMdd."));
 BA.debugLineNum = 89;BA.debugLine="DateTime.SetTimeZone(8)";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.getField(false,"DateTime").runVoidMethod ("SetTimeZone",(Object)(BA.numberCast(double.class, 8)));
 BA.debugLineNum = 90;BA.debugLine="nows = DateTime.Date(now) & DateTime.Time(now)";
Debug.ShouldStop(33554432);
_nows = RemoteObject.concat(main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main._now)),main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(main._now)));Debug.locals.put("nows", _nows);
 BA.debugLineNum = 91;BA.debugLine="Return nows";
Debug.ShouldStop(67108864);
if (true) return _nows;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physics_click() throws Exception{
try {
		Debug.PushSubsStack("physics_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,283);
if (RapidSub.canDelegate("physics_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","physics_click");}
 BA.debugLineNum = 283;BA.debugLine="Private Sub physics_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="tag_subject= \"physics\"";
Debug.ShouldStop(134217728);
main.mostCurrent._tag_subject = BA.ObjectToString("physics");
 BA.debugLineNum = 286;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(536870912);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 288;BA.debugLine="Activity.LoadLayout (\"record_choice\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_choice")),main.mostCurrent.activityBA);
 BA.debugLineNum = 289;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 290;BA.debugLine="InitializeCamera";
Debug.ShouldStop(2);
_initializecamera();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 292;BA.debugLine="Msgbox(\"camera init err\",\"err\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("camera init err")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("err"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 294;BA.debugLine="q_count.Text = refresh_count(tag_subject)";
Debug.ShouldStop(32);
main.mostCurrent._q_count.runMethod(true,"setText",BA.ObjectToCharSequence(_refresh_count(main.mostCurrent._tag_subject)));
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physics_imp_click() throws Exception{
try {
		Debug.PushSubsStack("physics_imp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,361);
if (RapidSub.canDelegate("physics_imp_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","physics_imp_click");}
 BA.debugLineNum = 361;BA.debugLine="Private Sub physics_imp_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 362;BA.debugLine="tag_subject= \"physics\"";
Debug.ShouldStop(512);
main.mostCurrent._tag_subject = BA.ObjectToString("physics");
 BA.debugLineNum = 363;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(1024);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 364;BA.debugLine="Activity.LoadLayout(\"record_import\")";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_import")),main.mostCurrent.activityBA);
 BA.debugLineNum = 365;BA.debugLine="QuesFileName = \" \"";
Debug.ShouldStop(4096);
main.mostCurrent._quesfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 366;BA.debugLine="AnsFileName = \" \"";
Debug.ShouldStop(8192);
main.mostCurrent._ansfilename = BA.ObjectToString(" ");
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _physics_rev_click() throws Exception{
try {
		Debug.PushSubsStack("physics_rev_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,610);
if (RapidSub.canDelegate("physics_rev_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","physics_rev_click");}
RemoteObject _tn = RemoteObject.createImmutable("");
 BA.debugLineNum = 610;BA.debugLine="Private Sub physics_rev_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 611;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 612;BA.debugLine="Activity.LoadLayout(\"review\")";
Debug.ShouldStop(8);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("review")),main.mostCurrent.activityBA);
 BA.debugLineNum = 613;BA.debugLine="tag_subject= \"physics\"";
Debug.ShouldStop(16);
main.mostCurrent._tag_subject = BA.ObjectToString("physics");
 BA.debugLineNum = 614;BA.debugLine="Dim tn As String";
Debug.ShouldStop(32);
_tn = RemoteObject.createImmutable("");Debug.locals.put("tn", _tn);
 BA.debugLineNum = 615;BA.debugLine="tn = select_question(tag_subject)";
Debug.ShouldStop(64);
_tn = _select_question(main.mostCurrent._tag_subject);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 616;BA.debugLine="If tn = \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_tn,BA.ObjectToString(""))) { 
 BA.debugLineNum = 617;BA.debugLine="Msgbox(\"没题啊\",\"ERR\")";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("没题啊")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 618;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 620;BA.debugLine="TouchImageView1.Initialize(\"TouchImageView1\")";
Debug.ShouldStop(2048);
main.mostCurrent._touchimageview1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("TouchImageView1")));
 BA.debugLineNum = 621;BA.debugLine="Activity.AddView(TouchImageView1, 0, 0, 100%x, 10";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._touchimageview1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 622;BA.debugLine="Refresh_question(random_num)";
Debug.ShouldStop(8192);
_refresh_question(main._random_num);
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("avanue.nvwa.main");
cameraexclass.myClass = BA.getDeviceClass ("avanue.nvwa.cameraexclass");
starter.myClass = BA.getDeviceClass ("avanue.nvwa.starter");
externalstorage.myClass = BA.getDeviceClass ("avanue.nvwa.externalstorage");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Private frontCamera As Boolean = False";
main._frontcamera = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 20;BA.debugLine="Private Storage As ExternalStorage";
main._storage = RemoteObject.createNew ("avanue.nvwa.externalstorage");
 //BA.debugLineNum = 21;BA.debugLine="Private Parents_Dir As ExternalFile";
main._parents_dir = RemoteObject.createNew ("avanue.nvwa.externalstorage._externalfile");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _quit_click() throws Exception{
try {
		Debug.PushSubsStack("quit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,176);
if (RapidSub.canDelegate("quit_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","quit_click");}
 BA.debugLineNum = 176;BA.debugLine="Private Sub quit_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="ExitApplication";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _r_return_click() throws Exception{
try {
		Debug.PushSubsStack("r_return_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,552);
if (RapidSub.canDelegate("r_return_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","r_return_click");}
 BA.debugLineNum = 552;BA.debugLine="Private Sub r_return_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 553;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(256);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 554;BA.debugLine="Activity.LoadLayout(\"subjects\")";
Debug.ShouldStop(512);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("subjects")),main.mostCurrent.activityBA);
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _record_camera_click() throws Exception{
try {
		Debug.PushSubsStack("record_camera_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,327);
if (RapidSub.canDelegate("record_camera_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","record_camera_click");}
 BA.debugLineNum = 327;BA.debugLine="Private Sub record_camera_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 328;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(128);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 329;BA.debugLine="Activity.LoadLayout (\"subjects\")";
Debug.ShouldStop(256);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("subjects")),main.mostCurrent.activityBA);
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _record_click() throws Exception{
try {
		Debug.PushSubsStack("record_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,180);
if (RapidSub.canDelegate("record_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","record_click");}
 BA.debugLineNum = 180;BA.debugLine="Private Sub record_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 182;BA.debugLine="Activity.LoadLayout(\"record_choice\")";
Debug.ShouldStop(2097152);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("record_choice")),main.mostCurrent.activityBA);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _record_import_click() throws Exception{
try {
		Debug.PushSubsStack("record_import_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,332);
if (RapidSub.canDelegate("record_import_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","record_import_click");}
 BA.debugLineNum = 332;BA.debugLine="Private Sub record_import_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 334;BA.debugLine="Activity.LoadLayout(\"subjects_imp\")";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("subjects_imp")),main.mostCurrent.activityBA);
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh_count(RemoteObject _subs) throws Exception{
try {
		Debug.PushSubsStack("refresh_count (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,505);
if (RapidSub.canDelegate("refresh_count")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","refresh_count", _subs);}
Debug.locals.put("subs", _subs);
 BA.debugLineNum = 505;BA.debugLine="Private Sub refresh_count(subs As String) As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 506;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM \" & subs";
Debug.ShouldStop(33554432);
main.mostCurrent._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM "),_subs,RemoteObject.createImmutable("_bank")))));
 BA.debugLineNum = 507;BA.debugLine="Return cursor1.RowCount";
Debug.ShouldStop(67108864);
if (true) return main.mostCurrent._cursor1.runMethod(true,"getRowCount");
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh_question(RemoteObject _cn) throws Exception{
try {
		Debug.PushSubsStack("Refresh_question (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,691);
if (RapidSub.canDelegate("refresh_question")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","refresh_question", _cn);}
RemoteObject _question_file = RemoteObject.createImmutable("");
RemoteObject _bitmap1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("cn", _cn);
 BA.debugLineNum = 691;BA.debugLine="Private Sub Refresh_question(cn As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 692;BA.debugLine="Dim Question_file As String";
Debug.ShouldStop(524288);
_question_file = RemoteObject.createImmutable("");Debug.locals.put("Question_file", _question_file);
 BA.debugLineNum = 694;BA.debugLine="TouchImageView1.MinScale=0.25			'	default is 0.5";
Debug.ShouldStop(2097152);
main.mostCurrent._touchimageview1.runMethod(true,"setMinScale",BA.numberCast(float.class, 0.25));
 BA.debugLineNum = 695;BA.debugLine="TouchImageView1.MaxScale=2				'	default is 1.5";
Debug.ShouldStop(4194304);
main.mostCurrent._touchimageview1.runMethod(true,"setMaxScale",BA.numberCast(float.class, 2));
 BA.debugLineNum = 696;BA.debugLine="TouchImageView1.TranslatePadding=128dip	'	default";
Debug.ShouldStop(8388608);
main.mostCurrent._touchimageview1.runMethod(true,"setTranslatePadding",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128))));
 BA.debugLineNum = 698;BA.debugLine="Question_file = File.Combine(File.DirDefaultExter";
Debug.ShouldStop(33554432);
_question_file = main.mostCurrent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Question_Image")))));Debug.locals.put("Question_file", _question_file);
 BA.debugLineNum = 701;BA.debugLine="Dim Bitmap1 As Bitmap";
Debug.ShouldStop(268435456);
_bitmap1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bitmap1", _bitmap1);
 BA.debugLineNum = 702;BA.debugLine="Bitmap1.Initialize(File.DirDefaultExternal,cursor";
Debug.ShouldStop(536870912);
_bitmap1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Question_Image")))));
 BA.debugLineNum = 704;BA.debugLine="TouchImageView1.SetBitmap(Bitmap1)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._touchimageview1.runVoidMethod ("SetBitmap",main.mostCurrent.activityBA,(Object)((_bitmap1.getObject())));
 BA.debugLineNum = 706;BA.debugLine="QA_S = 0";
Debug.ShouldStop(2);
main._qa_s = BA.numberCast(int.class, 0);
 BA.debugLineNum = 707;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _review_click() throws Exception{
try {
		Debug.PushSubsStack("review_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,557);
if (RapidSub.canDelegate("review_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","review_click");}
 BA.debugLineNum = 557;BA.debugLine="Private Sub review_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="Activity.RemoveAllViews";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 559;BA.debugLine="Activity.LoadLayout(\"subjects_rev\")";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("subjects_rev")),main.mostCurrent.activityBA);
 BA.debugLineNum = 561;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _select_question(RemoteObject _subject) throws Exception{
try {
		Debug.PushSubsStack("select_question (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,671);
if (RapidSub.canDelegate("select_question")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","select_question", _subject);}
RemoteObject _table_name = RemoteObject.createImmutable("");
Debug.locals.put("subject", _subject);
 BA.debugLineNum = 671;BA.debugLine="private Sub select_question(subject As String) As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 672;BA.debugLine="Dim table_name As String";
Debug.ShouldStop(-2147483648);
_table_name = RemoteObject.createImmutable("");Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 673;BA.debugLine="table_name = subject & \"_bank\"";
Debug.ShouldStop(1);
_table_name = RemoteObject.concat(_subject,RemoteObject.createImmutable("_bank"));Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 674;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT * FROM \" & table";
Debug.ShouldStop(2);
main.mostCurrent._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM "),_table_name))));
 BA.debugLineNum = 676;BA.debugLine="If cursor1.RowCount < 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",main.mostCurrent._cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 677;BA.debugLine="Msgbox(\"找不到题目呢\",\"ERR\")";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("找不到题目呢")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 678;BA.debugLine="Return (\"\")";
Debug.ShouldStop(32);
if (true) return (RemoteObject.createImmutable(""));
 };
 BA.debugLineNum = 680;BA.debugLine="random_num = Rnd(0,cursor1.RowCount)";
Debug.ShouldStop(128);
main._random_num = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._cursor1.runMethod(true,"getRowCount")));
 BA.debugLineNum = 681;BA.debugLine="cursor1.Position = random_num";
Debug.ShouldStop(256);
main.mostCurrent._cursor1.runMethod(true,"setPosition",main._random_num);
 BA.debugLineNum = 683;BA.debugLine="Current_ID = cursor1.GetInt(\"ID\")";
Debug.ShouldStop(1024);
main._current_id = main.mostCurrent._cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ID")));
 BA.debugLineNum = 684;BA.debugLine="Current_Correct_Times = cursor1.GetInt(\"Correct_T";
Debug.ShouldStop(2048);
main._current_correct_times = main.mostCurrent._cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Correct_Times")));
 BA.debugLineNum = 685;BA.debugLine="Current_Last_Time = cursor1.GetString(\"Last_Time\"";
Debug.ShouldStop(4096);
main.mostCurrent._current_last_time = main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Last_Time")));
 BA.debugLineNum = 687;BA.debugLine="Return(cursor1.GetString(\"Question_Image\"))";
Debug.ShouldStop(16384);
if (true) return (main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Question_Image"))));
 BA.debugLineNum = 689;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submit_click() throws Exception{
try {
		Debug.PushSubsStack("submit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,516);
if (RapidSub.canDelegate("submit_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","submit_click");}
RemoteObject _table_name = RemoteObject.createImmutable("");
RemoteObject _td = RemoteObject.createImmutable("");
RemoteObject _level = RemoteObject.createImmutable(0);
RemoteObject _newid = RemoteObject.createImmutable(0);
 BA.debugLineNum = 516;BA.debugLine="Private Sub submit_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 517;BA.debugLine="If  A_Name = \"\" Or Q_Name = \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.mostCurrent._a_name,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",main.mostCurrent._q_name,BA.ObjectToString(""))) { 
 BA.debugLineNum = 518;BA.debugLine="Msgbox(\"请先拍题目再拍答案\",\"ERR\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("请先拍题目再拍答案")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERR"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 519;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 521;BA.debugLine="Dim table_name As String";
Debug.ShouldStop(256);
_table_name = RemoteObject.createImmutable("");Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 522;BA.debugLine="table_name = tag_subject & \"_bank\"";
Debug.ShouldStop(512);
_table_name = RemoteObject.concat(main.mostCurrent._tag_subject,RemoteObject.createImmutable("_bank"));Debug.locals.put("table_name", _table_name);
 BA.debugLineNum = 523;BA.debugLine="Dim td As String";
Debug.ShouldStop(1024);
_td = RemoteObject.createImmutable("");Debug.locals.put("td", _td);
 BA.debugLineNum = 524;BA.debugLine="td = now_string";
Debug.ShouldStop(2048);
_td = _now_string();Debug.locals.put("td", _td);
 BA.debugLineNum = 525;BA.debugLine="Dim level As Int";
Debug.ShouldStop(4096);
_level = RemoteObject.createImmutable(0);Debug.locals.put("level", _level);
 BA.debugLineNum = 526;BA.debugLine="level = 1";
Debug.ShouldStop(8192);
_level = BA.numberCast(int.class, 1);Debug.locals.put("level", _level);
 BA.debugLineNum = 527;BA.debugLine="Dim NewID As Int = 0";
Debug.ShouldStop(16384);
_newid = BA.numberCast(int.class, 0);Debug.locals.put("NewID", _newid);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 528;BA.debugLine="cursor1 = SQL1.ExecQuery(\"SELECT ID FROM \" & tabl";
Debug.ShouldStop(32768);
main.mostCurrent._cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), main.mostCurrent._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT ID FROM "),_table_name))));
 BA.debugLineNum = 538;BA.debugLine="NewID = cursor1.RowCount + 1 ' add 1 to the ID nu";
Debug.ShouldStop(33554432);
_newid = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NewID", _newid);
 BA.debugLineNum = 541;BA.debugLine="SQL1.ExecNonQuery(\"INSERT INTO \" & table_name &\"";
Debug.ShouldStop(268435456);
main.mostCurrent._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO "),_table_name,RemoteObject.createImmutable("  (ID,Time_Create,Valid,Level,Question_Image,Answer_Image)  VALUES('"),_newid,RemoteObject.createImmutable("','"),_td,RemoteObject.createImmutable("','"),_td,RemoteObject.createImmutable("','"),_level,RemoteObject.createImmutable("','"),main.mostCurrent._q_name,RemoteObject.createImmutable(".jpg"),RemoteObject.createImmutable("','"),main.mostCurrent._a_name,RemoteObject.createImmutable(".jpg"),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 542;BA.debugLine="A_Name = \"\"";
Debug.ShouldStop(536870912);
main.mostCurrent._a_name = BA.ObjectToString("");
 BA.debugLineNum = 543;BA.debugLine="Q_Name = \"\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._q_name = BA.ObjectToString("");
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _switch_qa_click() throws Exception{
try {
		Debug.PushSubsStack("switch_qa_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,723);
if (RapidSub.canDelegate("switch_qa_click")) { return avanue.nvwa.main.remoteMe.runUserSub(false, "main","switch_qa_click");}
RemoteObject _bitmap1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 723;BA.debugLine="Private Sub switch_qa_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 724;BA.debugLine="Dim Bitmap1 As Bitmap";
Debug.ShouldStop(524288);
_bitmap1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bitmap1", _bitmap1);
 BA.debugLineNum = 725;BA.debugLine="If QA_S =0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main._qa_s,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 726;BA.debugLine="QA_S = 1";
Debug.ShouldStop(2097152);
main._qa_s = BA.numberCast(int.class, 1);
 BA.debugLineNum = 727;BA.debugLine="Bitmap1.Initialize(File.DirDefaultExternal,curso";
Debug.ShouldStop(4194304);
_bitmap1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Answer_Image")))));
 }else {
 BA.debugLineNum = 729;BA.debugLine="QA_S = 0";
Debug.ShouldStop(16777216);
main._qa_s = BA.numberCast(int.class, 0);
 BA.debugLineNum = 730;BA.debugLine="Bitmap1.Initialize(File.DirDefaultExternal,curso";
Debug.ShouldStop(33554432);
_bitmap1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(main.mostCurrent._cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Question_Image")))));
 };
 BA.debugLineNum = 732;BA.debugLine="TouchImageView1.SetBitmap(Bitmap1)";
Debug.ShouldStop(134217728);
main.mostCurrent._touchimageview1.runVoidMethod ("SetBitmap",main.mostCurrent.activityBA,(Object)((_bitmap1.getObject())));
 BA.debugLineNum = 733;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}