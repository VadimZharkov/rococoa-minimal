import org.rococoa.ObjCClass;
import org.rococoa.Rococoa;
import org.rococoa.RunOnMainThread;
import org.rococoa.cocoa.foundation.NSObject;

@RunOnMainThread
public abstract class NSApplication extends NSObject {
    private static final _Class CLASS = Rococoa.createClass("NSApplication", _Class.class);

    private interface _Class extends ObjCClass {
        NSApplication sharedApplication();
    }

    static public final NSApplication NSApp = NSApplication.CLASS.sharedApplication();

    static public NSApplication sharedApplication() {
        return NSApp;
    }

    public abstract void run();
    public static final int NSApplicationActivationPolicyRegular = 0;
    public abstract boolean setActivationPolicy(int activationPolicy);
    public abstract void activateIgnoringOtherApps(boolean flag);
}