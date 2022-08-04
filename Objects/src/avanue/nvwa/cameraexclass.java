package avanue.nvwa;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cameraexclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "avanue.nvwa.cameraexclass");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", avanue.nvwa.cameraexclass.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _camerainfoandid{
public boolean IsInitialized;
public Object CameraInfo;
public int Id;
public void Initialize() {
IsInitialized = true;
CameraInfo = new Object();
Id = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _camerasize{
public boolean IsInitialized;
public int Width;
public int Height;
public void Initialize() {
IsInitialized = true;
Width = 0;
Height = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _nativecam = null;
public anywheresoftware.b4a.objects.CameraW _cam = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
public Object _target = null;
public String _event = "";
public boolean _front = false;
public Object _parameters = null;
public avanue.nvwa.main _main = null;
public avanue.nvwa.starter _starter = null;
public String  _release(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "release", false))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public String  _takepicture(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "takepicture", false))
	 {return ((String) Debug.delegate(ba, "takepicture", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub TakePicture";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="cam.TakePicture";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .TakePicture();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public float[]  _getfocusdistances(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getfocusdistances", false))
	 {return ((float[]) Debug.delegate(ba, "getfocusdistances", null));}
float[] _f = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub GetFocusDistances As Float()";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim F(3) As Float";
_f = new float[(int) (3)];
;
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("getFocusDistances",new Object[]{(Object)(_f)},new String[]{"[F"});
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="Return F";
if (true) return _f;
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedflashmodes(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedflashmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedflashmodes", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub GetSupportedFlashModes As List";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFlashModes")));
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="End Sub";
return null;
}
public String  _getflashmode(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getflashmode", false))
	 {return ((String) Debug.delegate(ba, "getflashmode", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub GetFlashMode As String";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getFlashMode"));
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="End Sub";
return "";
}
public String  _setflashmode(avanue.nvwa.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setflashmode", false))
	 {return ((String) Debug.delegate(ba, "setflashmode", new Object[] {_mode}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFlashMode",_mode,"java.lang.String");
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="End Sub";
return "";
}
public String  _commitparameters(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "commitparameters", false))
	 {return ((String) Debug.delegate(ba, "commitparameters", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub CommitParameters";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(par";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("setParameters",new Object[]{__ref._parameters /*Object*/ },new String[]{"android.hardware.Camera$Parameters"});
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="End Sub";
return "";
}
public String  _savepicturetofile(avanue.nvwa.cameraexclass __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "savepicturetofile", false))
	 {return ((String) Debug.delegate(ba, "savepicturetofile", new Object[] {_data,_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return "";
}
public String  _startpreview(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "startpreview", false))
	 {return ((String) Debug.delegate(ba, "startpreview", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub StartPreview";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="cam.StartPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StartPreview();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public String  _setjpegquality(avanue.nvwa.cameraexclass __ref,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setjpegquality", false))
	 {return ((String) Debug.delegate(ba, "setjpegquality", new Object[] {_quality}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setJpegQuality",BA.NumberToString(_quality),"java.lang.int");
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return "";
}
public String  _setcontinuousautofocus(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcontinuousautofocus", false))
	 {return ((String) Debug.delegate(ba, "setcontinuousautofocus", null));}
anywheresoftware.b4a.objects.collections.List _modes = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub SetContinuousAutoFocus";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
_modes = new anywheresoftware.b4a.objects.collections.List();
_modes = __ref._getsupportedfocusmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Then";
if (_modes.IndexOf((Object)("continuous-picture"))>-1) { 
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="SetFocusMode(\"continuous-picture\")";
__ref._setfocusmode /*String*/ (null,"continuous-picture");
 }else 
{RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1 Th";
if (_modes.IndexOf((Object)("continuous-video"))>-1) { 
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="SetFocusMode(\"continuous-video\")";
__ref._setfocusmode /*String*/ (null,"continuous-video");
 }else {
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="Log(\"Continuous focus mode is not available\")";
__c.LogImpl("25701639","Continuous focus mode is not available",0);
 }}
;
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="End Sub";
return "";
}
public avanue.nvwa.cameraexclass._camerasize  _getpreviewsize(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpreviewsize", false))
	 {return ((avanue.nvwa.cameraexclass._camerasize) Debug.delegate(ba, "getpreviewsize", null));}
avanue.nvwa.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Dim cs As CameraSize";
_cs = new avanue.nvwa.cameraexclass._camerasize();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="End Sub";
return null;
}
public String  _initialize(avanue.nvwa.cameraexclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,boolean _frontcamera,Object _targetmodule,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_panel1,_frontcamera,_targetmodule,_eventname}));}
int _id = 0;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="event = EventName";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Front = FrontCamera";
__ref._front /*boolean*/  = _frontcamera;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*avanue.nvwa.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Front = Not(Front) 'try different camera";
__ref._front /*boolean*/  = __c.Not(__ref._front /*boolean*/ );
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera /*avanue.nvwa.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ ).Id /*int*/ ;
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No camera found."),__c.True);
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Initialize2(ba,(android.view.ViewGroup)(_panel1.getObject()),"camera",_id);
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="End Sub";
return "";
}
public String  _camera_focusdone(avanue.nvwa.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_focusdone", false))
	 {return ((String) Debug.delegate(ba, "camera_focusdone", new Object[] {_success}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub Camera_FocusDone (Success As Boolean)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="TakePicture";
__ref._takepicture /*String*/ (null);
 }else {
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Log(\"AutoFocus error.\")";
__c.LogImpl("26094852","AutoFocus error.",0);
 };
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="End Sub";
return "";
}
public String  _camera_picturetaken(avanue.nvwa.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_picturetaken", false))
	 {return ((String) Debug.delegate(ba, "camera_picturetaken", new Object[] {_data}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_PictureTaken",(Object)(_data));
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public String  _camera_ready(avanue.nvwa.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "camera_ready", false))
	 {return ((String) Debug.delegate(ba, "camera_ready", new Object[] {_success}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="nativeCam = r.GetField(\"camera\")";
__ref._nativecam /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("camera");
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
__ref._parameters /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getParameters");
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="SetDisplayOrientation";
__ref._setdisplayorientation /*String*/ (null);
 }else {
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Log(\"success = false, \" & LastException)";
__c.LogImpl("23866632","success = false, "+BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_ready",(Object)(_success));
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayorientation(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setdisplayorientation", false))
	 {return ((String) Debug.delegate(ba, "setdisplayorientation", null));}
int _previewresult = 0;
int _result = 0;
int _degrees = 0;
avanue.nvwa.cameraexclass._camerainfoandid _ci = null;
int _orientation = 0;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub SetDisplayOrientation";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="r.target = r.GetActivity";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetActivity(ba));
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWindowManager");
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getDefaultDisplay");
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getRotation");
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Dim previewResult, result, degrees As Int = r.tar";
_previewresult = 0;
_result = 0;
_degrees = (int) ((double)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target))*90);
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
_ci = __ref._findcamera /*avanue.nvwa.cameraexclass._camerainfoandid*/ (null,__ref._front /*boolean*/ );
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="r.target = ci.CameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _ci.CameraInfo /*Object*/ ;
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
_orientation = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("orientation")));
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="If Front Then";
if (__ref._front /*boolean*/ ) { 
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="previewResult = (orientation + degrees) Mod 360";
_previewresult = (int) ((_orientation+_degrees)%360);
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="previewResult = (360 - previewResult) Mod 360";
_previewresult = (int) ((360-_previewresult)%360);
 }else {
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="previewResult = (orientation - degrees + 360) Mo";
_previewresult = (int) ((_orientation-_degrees+360)%360);
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=3801104;
 //BA.debugLineNum = 3801104;BA.debugLine="Log(previewResult)";
__c.LogImpl("23801104",BA.NumberToString(_previewresult),0);
 };
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="r.target = nativeCam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._nativecam /*Object*/ ;
RDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", previewResu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setDisplayOrientation",BA.NumberToString(_previewresult),"java.lang.int");
RDebugUtils.currentLine=3801108;
 //BA.debugLineNum = 3801108;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setRotation",BA.NumberToString(_result),"java.lang.int");
RDebugUtils.currentLine=3801110;
 //BA.debugLineNum = 3801110;BA.debugLine="CommitParameters";
__ref._commitparameters /*String*/ (null);
RDebugUtils.currentLine=3801111;
 //BA.debugLineNum = 3801111;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Private nativeCam As Object";
_nativecam = new Object();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Private cam As Camera";
_cam = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Private event As String";
_event = "";
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Public Front As Boolean";
_front = false;
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="Private parameters As Object";
_parameters = new Object();
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="End Sub";
return "";
}
public String  _closenow(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "closenow", false))
	 {return ((String) Debug.delegate(ba, "closenow", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Public Sub CloseNow";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="cam.Release";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .Release();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="r.target = cam";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = (Object)(__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ );
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("releaseCameras",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="End Sub";
return "";
}
public Object  _facedetection_event(avanue.nvwa.cameraexclass __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "facedetection_event", false))
	 {return ((Object) Debug.delegate(ba, "facedetection_event", new Object[] {_methodname,_args}));}
Object[] _faces = null;
Object _f = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _facerect = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub FaceDetection_Event (MethodName As Str";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim faces() As Object = Args(0)";
_faces = (Object[])(_args[(int) (0)]);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="For Each f As Object In faces";
{
final Object[] group2 = _faces;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_f = group2[index2];
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim jo As JavaObject = f";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim faceRect As Rect = jo.GetField(\"rect\")";
_facerect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
_facerect = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper(), (android.graphics.Rect)(_jo.GetField("rect")));
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Log(faceRect)";
__c.LogImpl("26750213",BA.ObjectToString(_facerect),0);
 }
};
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="End Sub";
return null;
}
public avanue.nvwa.cameraexclass._camerainfoandid  _findcamera(avanue.nvwa.cameraexclass __ref,boolean _frontcamera) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "findcamera", false))
	 {return ((avanue.nvwa.cameraexclass._camerainfoandid) Debug.delegate(ba, "findcamera", new Object[] {_frontcamera}));}
avanue.nvwa.cameraexclass._camerainfoandid _ci = null;
Object _camerainfo = null;
int _cameravalue = 0;
int _numberofcameras = 0;
int _i = 0;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim ci As CameraInfoAndId";
_ci = new avanue.nvwa.cameraexclass._camerainfoandid();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim cameraInfo As Object";
_camerainfo = new Object();
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Dim cameraValue As Int";
_cameravalue = 0;
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Log(\"findCamera\")";
__c.LogImpl("23735556","findCamera",0);
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
if (_frontcamera) { 
_cameravalue = (int) (1);}
else {
_cameravalue = (int) (0);};
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
_camerainfo = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject("android.hardware.Camera$CameraInfo");
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
_numberofcameras = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getNumberOfCameras",(Object[])(__c.Null),(String[])(__c.Null))));
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="Log(r.target)";
__c.LogImpl("23735560",BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target),0);
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Log(numberOfCameras)";
__c.LogImpl("23735561",BA.NumberToString(_numberofcameras),0);
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="For i = 0 To numberOfCameras - 1";
{
final int step10 = 1;
final int limit10 = (int) (_numberofcameras-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunStaticMethod("android.hardware.Camera","getCameraInfo",new Object[]{(Object)(_i),_camerainfo},new String[]{"java.lang.int","android.hardware.Camera$CameraInfo"});
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="r.target = cameraInfo";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _camerainfo;
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="Log(\"facing: \" & r.GetField(\"facing\") & \", \" & c";
__c.LogImpl("23735566","facing: "+BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("facing"))+", "+BA.NumberToString(_cameravalue),0);
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
if ((__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("facing")).equals((Object)(_cameravalue))) { 
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="ci.cameraInfo = r.target";
_ci.CameraInfo /*Object*/  = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target;
RDebugUtils.currentLine=3735569;
 //BA.debugLineNum = 3735569;BA.debugLine="ci.Id = i";
_ci.Id /*int*/  = _i;
RDebugUtils.currentLine=3735570;
 //BA.debugLineNum = 3735570;BA.debugLine="Return ci";
if (true) return _ci;
 };
 }
};
RDebugUtils.currentLine=3735573;
 //BA.debugLineNum = 3735573;BA.debugLine="ci.id = -1";
_ci.Id /*int*/  = (int) (-1);
RDebugUtils.currentLine=3735574;
 //BA.debugLineNum = 3735574;BA.debugLine="Return ci";
if (true) return _ci;
RDebugUtils.currentLine=3735575;
 //BA.debugLineNum = 3735575;BA.debugLine="End Sub";
return null;
}
public String  _focusandtakepicture(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "focusandtakepicture", false))
	 {return ((String) Debug.delegate(ba, "focusandtakepicture", null));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub FocusAndTakePicture";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="cam.AutoFocus";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .AutoFocus();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public String  _getcoloreffect(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "getcoloreffect", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub GetColorEffect As String";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Return GetParameter(\"effect\")";
if (true) return __ref._getparameter /*String*/ (null,"effect");
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return "";
}
public String  _getparameter(avanue.nvwa.cameraexclass __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getparameter", false))
	 {return ((String) Debug.delegate(ba, "getparameter", new Object[] {_key}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub GetParameter(Key As String) As String";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
if (true) return BA.ObjectToString(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("get",_key,"java.lang.String"));
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="End Sub";
return "";
}
public int  _getexposurecompensation(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getexposurecompensation", false))
	 {return ((Integer) Debug.delegate(ba, "getexposurecompensation", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub getExposureCompensation As Int";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Return r.RunMethod(\"getExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getExposureCompensation")));
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="End Sub";
return 0;
}
public int  _getmaxexposurecompensation(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getmaxexposurecompensation", false))
	 {return ((Integer) Debug.delegate(ba, "getmaxexposurecompensation", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub getMaxExposureCompensation As Int";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Return r.RunMethod(\"getMaxExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getMaxExposureCompensation")));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="End Sub";
return 0;
}
public int  _getmaxzoom(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getmaxzoom", false))
	 {return ((Integer) Debug.delegate(ba, "getmaxzoom", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub GetMaxZoom As Int";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Return r.RunMethod(\"getMaxZoom\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getMaxZoom")));
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="End Sub";
return 0;
}
public int  _getminexposurecompensation(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getminexposurecompensation", false))
	 {return ((Integer) Debug.delegate(ba, "getminexposurecompensation", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub getMinExposureCompensation As Int";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Return r.RunMethod(\"getMinExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getMinExposureCompensation")));
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return 0;
}
public avanue.nvwa.cameraexclass._camerasize  _getpicturesize(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpicturesize", false))
	 {return ((avanue.nvwa.cameraexclass._camerasize) Debug.delegate(ba, "getpicturesize", null));}
avanue.nvwa.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub GetPictureSize As CameraSize";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPictureSize");
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim cs As CameraSize";
_cs = new avanue.nvwa.cameraexclass._camerasize();
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="End Sub";
return null;
}
public String  _getpreviewfpsrange(avanue.nvwa.cameraexclass __ref,int[] _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getpreviewfpsrange", false))
	 {return ((String) Debug.delegate(ba, "getpreviewfpsrange", new Object[] {_range}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub GetPreviewFpsRange(Range() As Int)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="r.RunMethod4(\"getPreviewFpsRange\", Array As Objec";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("getPreviewFpsRange",new Object[]{(Object)(_range)},new String[]{"[I"});
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcoloreffects(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedcoloreffects", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedcoloreffects", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub GetSupportedColorEffects As List";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedColorEffects")));
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedfocusmodes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedfocusmodes", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub GetSupportedFocusModes As List";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpictureformats(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpictureformats", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedpictureformats", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub GetSupportedPictureFormats As List";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Return r.RunMethod(\"getSupportedPictureFormats\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPictureFormats")));
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="End Sub";
return null;
}
public avanue.nvwa.cameraexclass._camerasize[]  _getsupportedpicturessizes(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpicturessizes", false))
	 {return ((avanue.nvwa.cameraexclass._camerasize[]) Debug.delegate(ba, "getsupportedpicturessizes", null));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
avanue.nvwa.cameraexclass._camerasize[] _cs = null;
int _i = 0;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPictureSizes")));
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new avanue.nvwa.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new avanue.nvwa.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="r.target = list1.get(i)";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _list1.Get(_i);
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 }
};
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpreviewfpsrange(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpreviewfpsrange", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getsupportedpreviewfpsrange", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub GetSupportedPreviewFpsRange As List";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Return r.RunMethod(\"getSupportedPreviewFpsRange\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPreviewFpsRange")));
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="End Sub";
return null;
}
public avanue.nvwa.cameraexclass._camerasize[]  _getsupportedpreviewsizes(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getsupportedpreviewsizes", false))
	 {return ((avanue.nvwa.cameraexclass._camerasize[]) Debug.delegate(ba, "getsupportedpreviewsizes", null));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
avanue.nvwa.cameraexclass._camerasize[] _cs = null;
int _i = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub GetSupportedPreviewSizes As CameraSize(";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPrev";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getSupportedPreviewSizes")));
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new avanue.nvwa.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new avanue.nvwa.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="r.target = list1.get(i)";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _list1.Get(_i);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
 }
};
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="End Sub";
return null;
}
public int  _getzoom(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "getzoom", false))
	 {return ((Integer) Debug.delegate(ba, "getzoom", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub getZoom() As Int";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Return r.RunMethod(\"getZoom\")";
if (true) return (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getZoom")));
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="End Sub";
return 0;
}
public boolean  _iszoomsupported(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "iszoomsupported", false))
	 {return ((Boolean) Debug.delegate(ba, "iszoomsupported", null));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub IsZoomSupported As Boolean";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Return r.RunMethod(\"isZoomSupported\")";
if (true) return BA.ObjectToBoolean(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("isZoomSupported"));
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="End Sub";
return false;
}
public byte[]  _previewimagetojpeg(avanue.nvwa.cameraexclass __ref,byte[] _data,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "previewimagetojpeg", false))
	 {return ((byte[]) Debug.delegate(ba, "previewimagetojpeg", new Object[] {_data,_quality}));}
Object _size = null;
Object _previewformat = null;
int _width = 0;
int _height = 0;
Object _yuvimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim size, previewFormat As Object";
_size = new Object();
_previewformat = new Object();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
_size = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewSize");
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
_previewformat = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getPreviewFormat");
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="r.target = size";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _size;
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
_width = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("width")));
_height = (int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .GetField("height")));
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
_yuvimage = __ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .CreateObject2("android.graphics.YuvImage",new Object[]{(Object)(_data),_previewformat,(Object)(_width),(Object)(_height),__c.Null},new String[]{"[B","java.lang.int","java.lang.int","java.lang.int","[I"});
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="r.target = yuvImage";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = _yuvimage;
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="Dim rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
_rect1.Initialize((int) (0),(int) (0),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getWidth"))),(int)(BA.ObjectToNumber(__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod("getHeight"))));
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("compressToJpeg",new Object[]{(Object)(_rect1.getObject()),(Object)(_quality),(Object)(_out.getObject())},new String[]{"android.graphics.Rect","java.lang.int","java.io.OutputStream"});
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=5570578;
 //BA.debugLineNum = 5570578;BA.debugLine="End Sub";
return null;
}
public String  _setcoloreffect(avanue.nvwa.cameraexclass __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setcoloreffect", false))
	 {return ((String) Debug.delegate(ba, "setcoloreffect", new Object[] {_effect}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="SetParameter(\"effect\", Effect)";
__ref._setparameter /*String*/ (null,"effect",_effect);
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return "";
}
public String  _setparameter(avanue.nvwa.cameraexclass __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setparameter", false))
	 {return ((String) Debug.delegate(ba, "setparameter", new Object[] {_key,_value}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("set",_key,"java.lang.String",_value,"java.lang.String");
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(avanue.nvwa.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setfocusmode", false))
	 {return ((String) Debug.delegate(ba, "setfocusmode", new Object[] {_mode}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.Str";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setFocusMode",_mode,"java.lang.String");
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="End Sub";
return "";
}
public String  _setexposurecompensation(avanue.nvwa.cameraexclass __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setexposurecompensation", false))
	 {return ((String) Debug.delegate(ba, "setexposurecompensation", new Object[] {_v}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub setExposureCompensation(v As Int)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="r.RunMethod2(\"setExposureCompensation\", v, \"java.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setExposureCompensation",BA.NumberToString(_v),"java.lang.int");
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="End Sub";
return "";
}
public String  _setfacedetectionlistener(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setfacedetectionlistener", false))
	 {return ((String) Debug.delegate(ba, "setfacedetectionlistener", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
Object _e = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub SetFaceDetectionListener";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativecam /*Object*/ ));
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim e As Object = jo.CreateEvent(\"android.hardwar";
_e = _jo.CreateEvent(ba,"android.hardware.Camera.FaceDetectionListener","FaceDetection",__c.Null);
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="jo.RunMethod(\"setFaceDetectionListener\", Array(e)";
_jo.RunMethod("setFaceDetectionListener",new Object[]{_e});
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return "";
}
public String  _setpicturesize(avanue.nvwa.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpicturesize", false))
	 {return ((String) Debug.delegate(ba, "setpicturesize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("setPictureSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="End Sub";
return "";
}
public String  _setpreviewfpsrange(avanue.nvwa.cameraexclass __ref,int _minvalue,int _maxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpreviewfpsrange", false))
	 {return ((String) Debug.delegate(ba, "setpreviewfpsrange", new Object[] {_minvalue,_maxvalue}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub SetPreviewFpsRange(MinValue As Int, Max";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="r.RunMethod4(\"setPreviewFpsRange\", Array As Objec";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod4("setPreviewFpsRange",new Object[]{(Object)(_minvalue),(Object)(_maxvalue)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="End Sub";
return "";
}
public String  _setpreviewsize(avanue.nvwa.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setpreviewsize", false))
	 {return ((String) Debug.delegate(ba, "setpreviewsize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub SetPreviewSize(Width As Int, Height As";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="r.RunMethod3(\"setPreviewSize\", Width, \"java.lang.";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod3("setPreviewSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public String  _setzoom(avanue.nvwa.cameraexclass __ref,int _zoomvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "setzoom", false))
	 {return ((String) Debug.delegate(ba, "setzoom", new Object[] {_zoomvalue}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub setZoom(ZoomValue As Int)";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="r.target = parameters";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .Target = __ref._parameters /*Object*/ ;
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="r.RunMethod2(\"setZoom\", ZoomValue, \"java.lang.int";
__ref._r /*anywheresoftware.b4a.agraham.reflection.Reflection*/ .RunMethod2("setZoom",BA.NumberToString(_zoomvalue),"java.lang.int");
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="End Sub";
return "";
}
public String  _startfacedetection(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "startfacedetection", false))
	 {return ((String) Debug.delegate(ba, "startfacedetection", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub StartFaceDetection";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativecam /*Object*/ ));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="jo.RunMethod(\"startFaceDetection\", Null)";
_jo.RunMethod("startFaceDetection",(Object[])(__c.Null));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return "";
}
public String  _stopfacedetection(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "stopfacedetection", false))
	 {return ((String) Debug.delegate(ba, "stopfacedetection", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub StopFaceDetection";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativecam /*Object*/ ));
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="jo.RunMethod(\"stopFaceDetection\", Null)";
_jo.RunMethod("stopFaceDetection",(Object[])(__c.Null));
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="End Sub";
return "";
}
public String  _stoppreview(avanue.nvwa.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
if (Debug.shouldDelegate(ba, "stoppreview", false))
	 {return ((String) Debug.delegate(ba, "stoppreview", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub StopPreview";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="cam.StopPreview";
__ref._cam /*anywheresoftware.b4a.objects.CameraW*/ .StopPreview();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
}