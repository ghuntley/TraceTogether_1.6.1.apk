package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import o.mG;

/* renamed from: o.aq  reason: case insensitive filesystem */
final class C3277aq {

    /* renamed from: ı  reason: contains not printable characters */
    final C3306bq f1536;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f1537;

    public C3277aq(Context context) {
        this.f1537 = context.getApplicationContext();
        this.f1536 = new C3308bs(context, "TwitterAdvertisingInfoPreferences");
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1619(mG.C0235 r6) {
        if (r6 != null && !TextUtils.isEmpty(r6.f3096)) {
            C3306bq bqVar = this.f1536;
            bqVar.m1829(bqVar.m1828().putString("advertising_id", r6.f3096).putBoolean("limit_ad_tracking_enabled", r6.f3095));
            return;
        }
        C3306bq bqVar2 = this.f1536;
        bqVar2.m1829(bqVar2.m1828().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final mG.C0235 m1618() {
        mG.C0235 r0 = new C1973(this.f1537).m1621();
        boolean z = true;
        if (!(r0 != null && !TextUtils.isEmpty(r0.f3096))) {
            r0 = new C3279as(this.f1537).m1621();
            if (r0 == null || TextUtils.isEmpty(r0.f3096)) {
                z = false;
            }
            if (!z) {
                C3263ac.m1563();
            } else {
                C3263ac.m1563();
            }
        } else {
            C3263ac.m1563();
        }
        return r0;
    }
}
