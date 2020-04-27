package o;

import android.content.SharedPreferences;
import o.C2745;

/* renamed from: o.нı  reason: contains not printable characters */
public final class C2453 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f11112;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f11113;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f11114 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f11115;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2327 f11116;

    public C2453(C2327 r1, String str, String str2) {
        this.f11116 = r1;
        C2745.C2746.m14562(str);
        this.f11112 = str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m12586() {
        if (!this.f11115) {
            this.f11115 = true;
            this.f11113 = this.f11116.m12121().getString(this.f11112, (String) null);
        }
        return this.f11113;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12587(String str) {
        if (this.f11116.r_().m13372(C2529.f11522) || !C2151.m11340(str, this.f11113)) {
            SharedPreferences.Editor edit = this.f11116.m12121().edit();
            edit.putString(this.f11112, str);
            edit.apply();
            this.f11113 = str;
        }
    }
}
