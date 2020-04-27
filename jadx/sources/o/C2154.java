package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: o.Ϟ  reason: contains not printable characters */
public final class C2154 implements C3195 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final ViewOverlay f10320;

    public C2154() {
    }

    static {
        new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m11412(Context context, Throwable th) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (th != null) {
            return false;
        } else {
            try {
                throw new NullPointerException("null reference");
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public C2154(View view) {
        this.f10320 = view.getOverlay();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11413(Drawable drawable) {
        this.f10320.add(drawable);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11414(Drawable drawable) {
        this.f10320.remove(drawable);
    }
}
