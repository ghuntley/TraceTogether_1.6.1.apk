package o;

import android.app.Activity;

/* renamed from: o.ŀȷ  reason: contains not printable characters */
public class C0502 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Object f4196;

    public C0502(Activity activity) {
        if (activity != null) {
            this.f4196 = activity;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m4900() {
        return this.f4196 instanceof C1269;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m4898() {
        return this.f4196 instanceof Activity;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Activity m4899() {
        return (Activity) this.f4196;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1269 m4901() {
        return (C1269) this.f4196;
    }
}
