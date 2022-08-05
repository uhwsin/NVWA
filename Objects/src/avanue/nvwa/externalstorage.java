package avanue.nvwa;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class externalstorage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "avanue.nvwa.externalstorage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", avanue.nvwa.externalstorage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _externalfile{
public boolean IsInitialized;
public String Name;
public long Length;
public long LastModified;
public boolean IsFolder;
public anywheresoftware.b4j.object.JavaObject Native;
public void Initialize() {
IsInitialized = true;
Name = "";
Length = 0L;
LastModified = 0L;
IsFolder = false;
Native = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _ion = null;
public String _persistanturi = "";
public String _previousurifilename = "";
public anywheresoftware.b4j.object.JavaObject _ctxt = null;
public Object _mcallback = null;
public String _meventname = "";
public avanue.nvwa.externalstorage._externalfile _root = null;
public avanue.nvwa.main _main = null;
public avanue.nvwa.starter _starter = null;
public String  _initialize(avanue.nvwa.externalstorage __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="ctxt.InitializeContext";
__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .InitializeContext(ba);
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(avanue.nvwa.externalstorage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Private ion As Object";
_ion = new Object();
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Private PersistantUri As String";
_persistanturi = "";
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Public PreviousUriFileName As String = \"Persistan";
_previousurifilename = "PersistantUri";
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="Private ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Public Root As ExternalFile";
_root = new avanue.nvwa.externalstorage._externalfile();
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="Type ExternalFile (Name As String, Length As Long";
;
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="End Sub";
return "";
}
public avanue.nvwa.externalstorage._externalfile  _createnewdir(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _parent,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "createnewdir", true))
	 {return ((avanue.nvwa.externalstorage._externalfile) Debug.delegate(ba, "createnewdir", new Object[] {_parent,_name}));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub CreateNewDir (Parent As ExternalFile, N";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Return DocumentFileToExternalFile(Parent.Native.R";
if (true) return __ref._documentfiletoexternalfile /*avanue.nvwa.externalstorage._externalfile*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.Native /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createDirectory",new Object[]{(Object)(_name)}))));
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return null;
}
public avanue.nvwa.externalstorage._externalfile  _documentfiletoexternalfile(avanue.nvwa.externalstorage __ref,anywheresoftware.b4j.object.JavaObject _documentfile) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "documentfiletoexternalfile", true))
	 {return ((avanue.nvwa.externalstorage._externalfile) Debug.delegate(ba, "documentfiletoexternalfile", new Object[] {_documentfile}));}
avanue.nvwa.externalstorage._externalfile _ef = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub DocumentFileToExternalFile (DocumentFi";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim ef As ExternalFile";
_ef = new avanue.nvwa.externalstorage._externalfile();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="If DocumentFile.IsInitialized = False Then";
if (_documentfile.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Return ef";
if (true) return _ef;
 };
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="ef.Initialize";
_ef.Initialize();
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="ef.Name = DocumentFile.RunMethod(\"getName\", Null)";
_ef.Name /*String*/  = BA.ObjectToString(_documentfile.RunMethod("getName",(Object[])(__c.Null)));
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="ef.Length = DocumentFile.RunMethod(\"length\", Null";
_ef.Length /*long*/  = BA.ObjectToLongNumber(_documentfile.RunMethod("length",(Object[])(__c.Null)));
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="ef.IsFolder = DocumentFile.RunMethod(\"isDirectory";
_ef.IsFolder /*boolean*/  = BA.ObjectToBoolean(_documentfile.RunMethod("isDirectory",(Object[])(__c.Null)));
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="ef.Native = DocumentFile";
_ef.Native /*anywheresoftware.b4j.object.JavaObject*/  = _documentfile;
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="ef.LastModified = DocumentFile.RunMethod(\"lastMod";
_ef.LastModified /*long*/  = BA.ObjectToLongNumber(_documentfile.RunMethod("lastModified",(Object[])(__c.Null)));
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="Return ef";
if (true) return _ef;
RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="End Sub";
return null;
}
public avanue.nvwa.externalstorage._externalfile  _createnewfile(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _parent,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "createnewfile", true))
	 {return ((avanue.nvwa.externalstorage._externalfile) Debug.delegate(ba, "createnewfile", new Object[] {_parent,_name}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub CreateNewFile (Parent As ExternalFile,";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Return DocumentFileToExternalFile(Parent.Native.R";
if (true) return __ref._documentfiletoexternalfile /*avanue.nvwa.externalstorage._externalfile*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.Native /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createFile",new Object[]{(Object)(""),(Object)(_name)}))));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return null;
}
public boolean  _deletefile(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _ef) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "deletefile", true))
	 {return ((Boolean) Debug.delegate(ba, "deletefile", new Object[] {_ef}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub DeleteFile (EF As ExternalFile) As Bool";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If EF.IsInitialized = False Then Return False";
if (_ef.IsInitialized /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Return EF.Native.RunMethod(\"delete\", Null)";
if (true) return BA.ObjectToBoolean(_ef.Native /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("delete",(Object[])(__c.Null)));
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="End Sub";
return false;
}
public avanue.nvwa.externalstorage._externalfile  _finddirorcreate(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _parent,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "finddirorcreate", true))
	 {return ((avanue.nvwa.externalstorage._externalfile) Debug.delegate(ba, "finddirorcreate", new Object[] {_parent,_name}));}
avanue.nvwa.externalstorage._externalfile _f = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub FindDirOrCreate(Parent As ExternalFile,";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Dim f As ExternalFile = FindFile(Parent, Name)";
_f = __ref._findfile /*avanue.nvwa.externalstorage._externalfile*/ (null,_parent,_name);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="If f.IsInitialized = False Then";
if (_f.IsInitialized /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Return CreateNewDir(Parent, Name)";
if (true) return __ref._createnewdir /*avanue.nvwa.externalstorage._externalfile*/ (null,_parent,_name);
 }else {
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Return f";
if (true) return _f;
 };
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="End Sub";
return null;
}
public avanue.nvwa.externalstorage._externalfile  _findfile(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _parent,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "findfile", true))
	 {return ((avanue.nvwa.externalstorage._externalfile) Debug.delegate(ba, "findfile", new Object[] {_parent,_name}));}
anywheresoftware.b4j.object.JavaObject _f = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub FindFile (Parent As ExternalFile, Name";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim f As JavaObject = Parent.Native.RunMethod(\"fi";
_f = new anywheresoftware.b4j.object.JavaObject();
_f = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.Native /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("findFile",new Object[]{(Object)(_name)})));
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Return DocumentFileToExternalFile(f)";
if (true) return __ref._documentfiletoexternalfile /*avanue.nvwa.externalstorage._externalfile*/ (null,_f);
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="End Sub";
return null;
}
public avanue.nvwa.externalstorage._externalfile  _findfileorcreate(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _parent,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "findfileorcreate", true))
	 {return ((avanue.nvwa.externalstorage._externalfile) Debug.delegate(ba, "findfileorcreate", new Object[] {_parent,_name}));}
avanue.nvwa.externalstorage._externalfile _f = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub FindFileOrCreate (Parent As ExternalFil";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim f As ExternalFile = FindFile(Parent, Name)";
_f = __ref._findfile /*avanue.nvwa.externalstorage._externalfile*/ (null,_parent,_name);
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="If f.IsInitialized = False Then";
if (_f.IsInitialized /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Return CreateNewFile(Parent, Name)";
if (true) return __ref._createnewfile /*avanue.nvwa.externalstorage._externalfile*/ (null,_parent,_name);
 }else {
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Return f";
if (true) return _f;
 };
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="End Sub";
return null;
}
public Object  _getba(avanue.nvwa.externalstorage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "getba", true))
	 {return ((Object) Debug.delegate(ba, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub GetBA As Object";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Return jo.RunMethod(\"getBA\", Null)";
if (true) return _jo.RunMethod("getBA",(Object[])(__c.Null));
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getpickeddir(avanue.nvwa.externalstorage __ref,String _uri) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "getpickeddir", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getpickeddir", new Object[] {_uri}));}
anywheresoftware.b4j.object.JavaObject _documentfilestatic = null;
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _treeuri = null;
anywheresoftware.b4j.object.JavaObject _pickeddir = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub GetPickedDir (uri As String) As JavaOb";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim DocumentFileStatic As JavaObject";
_documentfilestatic = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Dim treeUri As Uri";
_treeuri = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="treeUri.Parse(uri)";
_treeuri.Parse(_uri);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Dim PickedDir As JavaObject = DocumentFileStatic.";
_pickeddir = new anywheresoftware.b4j.object.JavaObject();
_pickeddir = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_documentfilestatic.InitializeStatic("androidx.documentfile.provider.DocumentFile").RunMethod("fromTreeUri",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_treeuri.getObject())})));
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Return PickedDir";
if (true) return _pickeddir;
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return null;
}
public Object  _ion_event(avanue.nvwa.externalstorage __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "ion_event", true))
	 {return ((Object) Debug.delegate(ba, "ion_event", new Object[] {_methodname,_args}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _treeuri = null;
int _takeflags = 0;
Object _temp = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub ion_Event (MethodName As String, Args(";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="If -1 = Args(0) Then 'resultCode = RESULT_OK";
if (-1==(double)(BA.ObjectToNumber(_args[(int) (0)]))) { 
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Dim i As Intent = Args(1)";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
_i = (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_args[(int) (1)]));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Dim jo As JavaObject = i";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_i.getObject()));
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Dim treeUri As Uri = jo.RunMethod(\"getData\", Nul";
_treeuri = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
_treeuri = (anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper(), (android.net.Uri)(_jo.RunMethod("getData",(Object[])(__c.Null))));
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Dim takeFlags As Int = Bit.And(i.Flags, 3)";
_takeflags = __c.Bit.And(_i.getFlags(),(int) (3));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="ctxt.RunMethodJO(\"getContentResolver\", Null).Run";
__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getContentResolver",(Object[])(__c.Null)).RunMethod("takePersistableUriPermission",new Object[]{(Object)(_treeuri.getObject()),(Object)(_takeflags)});
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Dim temp As Object = treeUri";
_temp = (Object)(_treeuri.getObject());
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="PersistantUri = temp";
__ref._persistanturi /*String*/  = BA.ObjectToString(_temp);
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="File.WriteString(File.DirInternal, PreviousUriFi";
__c.File.WriteString(__c.File.getDirInternal(),__ref._previousurifilename /*String*/ ,__ref._persistanturi /*String*/ );
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="Log(PersistantUri)";
__c.LogImpl("98781834",__ref._persistanturi /*String*/ ,0);
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="SetPickedDir";
__ref._setpickeddir /*String*/ (null);
 };
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="End Sub";
return null;
}
public String  _setpickeddir(avanue.nvwa.externalstorage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "setpickeddir", true))
	 {return ((String) Debug.delegate(ba, "setpickeddir", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub SetPickedDir";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Root = DocumentFileToExternalFile(GetPickedDir(Pe";
__ref._root /*avanue.nvwa.externalstorage._externalfile*/  = __ref._documentfiletoexternalfile /*avanue.nvwa.externalstorage._externalfile*/ (null,__ref._getpickeddir /*anywheresoftware.b4j.object.JavaObject*/ (null,__ref._persistanturi /*String*/ ));
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="CallSubDelayed(mCallback, mEventName & \"_External";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ExternalFolderAvailable");
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listfiles(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _folder) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "listfiles", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listfiles", new Object[] {_folder}));}
Object[] _files = null;
anywheresoftware.b4a.objects.collections.List _res = null;
Object _o = null;
anywheresoftware.b4j.object.JavaObject _f = null;
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub ListFiles (Folder As ExternalFile) As L";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim files() As Object = Folder.Native.RunMethod(\"";
_files = (Object[])(_folder.Native /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("listFiles",(Object[])(__c.Null)));
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="For Each o As Object In files";
{
final Object[] group4 = _files;
final int groupLen4 = group4.length
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_o = group4[index4];
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="Dim f As JavaObject = o";
_f = new anywheresoftware.b4j.object.JavaObject();
_f = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_o));
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="res.Add(DocumentFileToExternalFile(f))";
_res.Add((Object)(__ref._documentfiletoexternalfile /*avanue.nvwa.externalstorage._externalfile*/ (null,_f)));
 }
};
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _openinputstream(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _ef) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "openinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "openinputstream", new Object[] {_ef}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub OpenInputStream(EF As ExternalFile) As";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return ctxt.RunMethodJO(\"getContentResolver\", Nul";
if (true) return (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getContentResolver",(Object[])(__c.Null)).RunMethod("openInputStream",new Object[]{_ef.Native /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getUri",(Object[])(__c.Null))})));
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper  _openoutputstream(avanue.nvwa.externalstorage __ref,avanue.nvwa.externalstorage._externalfile _ef) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "openoutputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper) Debug.delegate(ba, "openoutputstream", new Object[] {_ef}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub OpenOutputStream(EF As ExternalFile) As";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Return ctxt.RunMethodJO(\"getContentResolver\", Nul";
if (true) return (anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper(), (java.io.OutputStream)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getContentResolver",(Object[])(__c.Null)).RunMethod("openOutputStream",new Object[]{_ef.Native /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getUri",(Object[])(__c.Null))})));
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return null;
}
public String  _selectdir(avanue.nvwa.externalstorage __ref,boolean _usepreviouslyselectedifavailable) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "selectdir", true))
	 {return ((String) Debug.delegate(ba, "selectdir", new Object[] {_usepreviouslyselectedifavailable}));}
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4j.object.JavaObject _uripermission = null;
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _u = null;
Object _temp = null;
String _s = "";
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub SelectDir (UsePreviouslySelectedIfAvail";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="If UsePreviouslySelectedIfAvailable And File.Exis";
if (_usepreviouslyselectedifavailable && __c.File.Exists(__c.File.getDirInternal(),__ref._previousurifilename /*String*/ )) { 
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="PersistantUri = File.ReadString(File.DirInternal";
__ref._persistanturi /*String*/  = __c.File.ReadString(__c.File.getDirInternal(),__ref._previousurifilename /*String*/ );
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Dim list As List = ctxt.RunMethodJO(\"getContentR";
_list = new anywheresoftware.b4a.objects.collections.List();
_list = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getContentResolver",(Object[])(__c.Null)).RunMethod("getPersistedUriPermissions",(Object[])(__c.Null))));
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="If list.IsInitialized Then";
if (_list.IsInitialized()) { 
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="For Each uripermission As JavaObject In list";
_uripermission = new anywheresoftware.b4j.object.JavaObject();
{
final anywheresoftware.b4a.BA.IterableList group5 = _list;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_uripermission = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Dim u As Uri = uripermission.RunMethod(\"getUri";
_u = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
_u = (anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper(), (android.net.Uri)(_uripermission.RunMethod("getUri",(Object[])(__c.Null))));
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="Dim temp As Object = u";
_temp = (Object)(_u.getObject());
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Dim s As String = temp";
_s = BA.ObjectToString(_temp);
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="If s = PersistantUri And uripermission.RunMeth";
if ((_s).equals(__ref._persistanturi /*String*/ ) && (_uripermission.RunMethod("isWritePermission",(Object[])(__c.Null))).equals((Object)(__c.True))) { 
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="Log(\"Can use persistant uri!\")";
__c.LogImpl("97995402","Can use persistant uri!",0);
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="SetPickedDir";
__ref._setpickeddir /*String*/ (null);
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="Return";
if (true) return "";
 };
 }
};
 };
 };
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="i.Initialize(\"android.intent.action.OPEN_DOCUMENT";
_i.Initialize("android.intent.action.OPEN_DOCUMENT_TREE","");
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="i.PutExtra(\"android.content.extra.SHOW_ADVANCED\",";
_i.PutExtra("android.content.extra.SHOW_ADVANCED",(Object)(__c.True));
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="StartActivityForResult(i)";
__ref._startactivityforresult /*String*/ (null,_i);
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="End Sub";
return "";
}
public String  _startactivityforresult(avanue.nvwa.externalstorage __ref,anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="externalstorage";
if (Debug.shouldDelegate(ba, "startactivityforresult", true))
	 {return ((String) Debug.delegate(ba, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._getba /*Object*/ (null)));
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
__ref._ion /*Object*/  = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{__ref._ion /*Object*/ ,(Object)(_i.getObject())});
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="End Sub";
return "";
}
}