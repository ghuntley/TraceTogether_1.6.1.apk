package o;

import android.content.Context;

/* renamed from: o.ɴ  reason: contains not printable characters */
public class C1453 implements C1481 {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f7818 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f7819;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1481 f7820;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f7821;

    public C1453(Context context, C1481 r3) {
        this.f7821 = context;
        this.f7820 = r3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public String m8715() {
        if (!this.f7818) {
            this.f7819 = C3285aw.m1670(this.f7821);
            this.f7818 = true;
        }
        String str = this.f7819;
        if (str != null) {
            return str;
        }
        C1481 r0 = this.f7820;
        if (r0 != null) {
            return r0.m8860();
        }
        return null;
    }
}
