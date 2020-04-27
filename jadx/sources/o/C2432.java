package o;

import android.content.SharedPreferences;
import o.C2745;

/* renamed from: o.зΙ  reason: contains not printable characters */
public final class C2432 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f11061;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean f11062;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f11063;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f11064;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2327 f11065;

    public C2432(C2327 r1, String str, boolean z) {
        this.f11065 = r1;
        C2745.C2746.m14562(str);
        this.f11061 = str;
        this.f11062 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12524() {
        if (!this.f11064) {
            this.f11064 = true;
            this.f11063 = this.f11065.m12121().getBoolean(this.f11061, this.f11062);
        }
        return this.f11063;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12525(boolean z) {
        SharedPreferences.Editor edit = this.f11065.m12121().edit();
        edit.putBoolean(this.f11061, z);
        edit.apply();
        this.f11063 = z;
    }
}
