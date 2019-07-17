import org.rococoa.ID;
import org.rococoa.Foundation;
import org.rococoa.cocoa.foundation.*;

public class Main {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.setProperty("jna.library.path", currentDir + "/lib");

        Foundation.runOnMainThread(() -> {
            System.out.println("Start running...");
            NSAutoreleasePool pool = NSAutoreleasePool.new_();

            NSApplication app = NSApplication.sharedApplication();
            app.setActivationPolicy(NSApplication.NSApplicationActivationPolicyRegular);

             NSWindow window = NSWindow.windowWithContentRect(
                    new NSRect(new NSPoint(0, 0), new NSSize(200, 200)),
                    NSWindow.NSWindowStyleMaskTitled,
                    NSWindow.NSBackingStoreBuffered,
                    false);
            window.setTitle("Hello Rococoa");
            window.center();
            window.makeKeyAndOrderFront(ID.fromLong(0));

            app.activateIgnoringOtherApps(true);
            app.run();

        }, true);
    }
}
