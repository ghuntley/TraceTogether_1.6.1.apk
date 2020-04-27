package o;

import android.annotation.SuppressLint;
import com.crashlytics.android.core.CrashlyticsCore;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: o.ɪȷ  reason: contains not printable characters */
public class C1343 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final boolean f7465 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f7466 = "preferences_migration_complete";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f7467 = "always_send_reports_opt_in";

    /* renamed from: ı  reason: contains not printable characters */
    private final CrashlyticsCore f7468;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3306bq f7469;

    /* renamed from: ı  reason: contains not printable characters */
    public static C1343 m8428(C3306bq bqVar, CrashlyticsCore crashlyticsCore) {
        return new C1343(bqVar, crashlyticsCore);
    }

    public C1343(C3306bq bqVar, CrashlyticsCore crashlyticsCore) {
        this.f7469 = bqVar;
        this.f7468 = crashlyticsCore;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m8429(boolean z) {
        C3306bq bqVar = this.f7469;
        bqVar.m1829(bqVar.m1828().putBoolean(f7467, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m8430() {
        if (!this.f7469.m1830().contains(f7466)) {
            C3308bs bsVar = new C3308bs(this.f7468);
            if (!this.f7469.m1830().contains(f7467) && bsVar.m1830().contains(f7467)) {
                boolean z = bsVar.m1830().getBoolean(f7467, false);
                C3306bq bqVar = this.f7469;
                bqVar.m1829(bqVar.m1828().putBoolean(f7467, z));
            }
            C3306bq bqVar2 = this.f7469;
            bqVar2.m1829(bqVar2.m1828().putBoolean(f7466, true));
        }
        return this.f7469.m1830().getBoolean(f7467, false);
    }
}
