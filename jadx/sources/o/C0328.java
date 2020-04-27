package o;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: o.ıɘ  reason: contains not printable characters */
public final class C0328 implements C2979 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0400 f3682;

    public C0328() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m4398(Context context, int i, String str) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue != null) {
            return typedValue.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m4399(Context context, int i, boolean z) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue == null || typedValue.type != 18) {
            return z;
        }
        return typedValue.data != 0;
    }

    public C0328(C0400 r1) {
        this.f3682 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m4400(C0329 r2) {
        return C0400.m4682(this.f3682, r2);
    }
}
