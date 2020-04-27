package o;

import android.app.Activity;
import android.os.Bundle;
import o.C0496;
import o.C3262ab;

/* renamed from: o.Ӏŀ  reason: contains not printable characters */
class C2756 extends C3262ab.C0117 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2764 f13063;

    /* renamed from: ι  reason: contains not printable characters */
    private final C0528 f13064;

    /* renamed from: ı  reason: contains not printable characters */
    public void m14592(Activity activity, Bundle bundle) {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m14593(Activity activity) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m14595(Activity activity, Bundle bundle) {
    }

    public C2756(C0528 r1, C2764 r2) {
        this.f13064 = r1;
        this.f13063 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m14594(Activity activity) {
        this.f13064.m5089(activity, C0496.C0497.START);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m14597(Activity activity) {
        this.f13064.m5089(activity, C0496.C0497.RESUME);
        this.f13063.m14624();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14591(Activity activity) {
        this.f13064.m5089(activity, C0496.C0497.PAUSE);
        this.f13063.m14625();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m14596(Activity activity) {
        this.f13064.m5089(activity, C0496.C0497.STOP);
    }
}
