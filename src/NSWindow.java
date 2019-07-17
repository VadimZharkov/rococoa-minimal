import org.rococoa.ID;
import org.rococoa.ObjCClass;
import org.rococoa.Rococoa;
import org.rococoa.cocoa.foundation.NSObject;
import org.rococoa.cocoa.foundation.NSPoint;
import org.rococoa.cocoa.foundation.NSRect;

public abstract class NSWindow extends NSObject {
    public static final _Class CLASS = Rococoa.createClass("NSWindow",  _Class.class);

    public static final int NSWindowStyleMaskTitled = 1;
    public static final int NSBackingStoreBuffered = 2;

    public static NSWindow windowWithContentRect(NSRect contentRect, int style, int backingStoreType, boolean flag) {
        return CLASS.alloc().initWithContentRect_styleMask_backing_defer(contentRect, style, backingStoreType, flag);
    }

    public interface _Class extends ObjCClass {
        public abstract NSWindow alloc();
    }

    public abstract NSWindow initWithContentRect_styleMask_backing_defer(
            NSRect contentRect, int style, int backingStoreType, boolean flag);
    public abstract void setTitle(String string);
    public abstract void center();
    public abstract NSPoint cascadeTopLeftFromPoint(NSPoint topLeftPoint);
    public abstract void makeKeyAndOrderFront(final ID sender);
}
