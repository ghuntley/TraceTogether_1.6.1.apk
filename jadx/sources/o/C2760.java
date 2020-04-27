package o;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: o.Ӏſ  reason: contains not printable characters */
class C2760 {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f13085 = "settings";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f13086 = "analytics_launched";

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3306bq f13087;

    /* renamed from: ι  reason: contains not printable characters */
    public static C2760 m14603(Context context) {
        return new C2760(new C3308bs(context, f13085));
    }

    C2760(C3306bq bqVar) {
        this.f13087 = bqVar;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: ι  reason: contains not printable characters */
    public void m14605() {
        C3306bq bqVar = this.f13087;
        bqVar.m1829(bqVar.m1828().putBoolean(f13086, true));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: ı  reason: contains not printable characters */
    public boolean m14604() {
        return this.f13087.m1830().getBoolean(f13086, false);
    }
}
