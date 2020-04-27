package o;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: o.Іւ  reason: contains not printable characters */
final class C2327 extends C3067 {

    /* renamed from: ǃ  reason: contains not printable characters */
    static final Pair<String, Long> f10769 = new Pair<>("", 0L);

    /* renamed from: ı  reason: contains not printable characters */
    public final C2519 f10770 = new C2519(this, "last_upload_attempt", 0);

    /* renamed from: ŀ  reason: contains not printable characters */
    public final C2432 f10771 = new C2432(this, "allow_remote_dynamite", false);

    /* renamed from: ł  reason: contains not printable characters */
    public final C2519 f10772 = new C2519(this, "last_pause_time", 0);

    /* renamed from: ſ  reason: contains not printable characters */
    public C2432 f10773 = new C2432(this, "deep_link_retrieval_complete", false);

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C2519 f10774 = new C2519(this, "midnight_offset", 0);

    /* renamed from: Ɨ  reason: contains not printable characters */
    public final C2453 f10775 = new C2453(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: ƚ  reason: contains not printable characters */
    private SharedPreferences f10776;

    /* renamed from: ȷ  reason: contains not printable characters */
    public final C2432 f10777 = new C2432(this, "use_dynamite_api", false);

    /* renamed from: ɔ  reason: contains not printable characters */
    private String f10778;

    /* renamed from: ɨ  reason: contains not printable characters */
    public final C2519 f10779 = new C2519(this, "time_before_start", 10000);

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2519 f10780 = new C2519(this, "backoff", 0);

    /* renamed from: ɪ  reason: contains not printable characters */
    public final C2453 f10781 = new C2453(this, "non_personalized_ads", (String) null);

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C2519 f10782 = new C2519(this, "app_install_time", 0);

    /* renamed from: ɺ  reason: contains not printable characters */
    private boolean f10783;

    /* renamed from: ɼ  reason: contains not printable characters */
    private long f10784;

    /* renamed from: ɾ  reason: contains not printable characters */
    public final C2432 f10785 = new C2432(this, "start_new_session", true);

    /* renamed from: ɿ  reason: contains not printable characters */
    public final C2519 f10786 = new C2519(this, "time_active", 0);

    /* renamed from: ʅ  reason: contains not printable characters */
    public C2519 f10787 = new C2519(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: ʟ  reason: contains not printable characters */
    public C2432 f10788 = new C2432(this, "app_backgrounded", false);

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2519 f10789 = new C2519(this, "last_upload", 0);

    /* renamed from: ι  reason: contains not printable characters */
    public C2434 f10790;

    /* renamed from: І  reason: contains not printable characters */
    public final C2453 f10791 = new C2453(this, "app_instance_id", (String) null);

    /* renamed from: г  reason: contains not printable characters */
    public boolean f10792;

    /* renamed from: і  reason: contains not printable characters */
    public final C2519 f10793 = new C2519(this, "first_open_time", 0);

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C2519 f10794 = new C2519(this, "last_delete_stale", 0);

    /* renamed from: ӏ  reason: contains not printable characters */
    public final C2519 f10795 = new C2519(this, "session_timeout", 1800000);

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Pair<String, Boolean> m12122(String str) {
        y_();
        long r1 = w_().m10847();
        String str2 = this.f10778;
        if (str2 != null && r1 < this.f10784) {
            return new Pair<>(str2, Boolean.valueOf(this.f10783));
        }
        this.f10784 = r1 + r_().m13370(str, C2529.f11569);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m15904());
            if (advertisingIdInfo != null) {
                this.f10778 = advertisingIdInfo.getId();
                this.f10783 = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f10778 == null) {
                this.f10778 = "";
            }
        } catch (Exception e) {
            t_().m11711().m11603("Unable to get advertising id", e);
            this.f10778 = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f10778, Boolean.valueOf(this.f10783));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m12126() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m12124(String str) {
        y_();
        String str2 = (String) m12122(str).first;
        MessageDigest r0 = C2151.m11355();
        if (r0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r0.digest(str2.getBytes()))});
    }

    C2327(C2658 r6) {
        super(r6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m12109() {
        this.f10776 = m15904().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10792 = this.f10776.getBoolean("has_been_opened", false);
        if (!this.f10792) {
            SharedPreferences.Editor edit = this.f10776.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f10790 = new C2434(this, "health_monitor", Math.max(0, C2529.f11514.m10833(null).longValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final SharedPreferences m12121() {
        y_();
        m15649();
        return this.f10776;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m12110(String str) {
        y_();
        SharedPreferences.Editor edit = m12121().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m12113() {
        y_();
        return m12121().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12117(String str) {
        y_();
        SharedPreferences.Editor edit = m12121().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m12116() {
        y_();
        return m12121().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final Boolean m12119() {
        y_();
        if (!m12121().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(m12121().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12114(boolean z) {
        y_();
        SharedPreferences.Editor edit = m12121().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɍ  reason: contains not printable characters */
    public final void m12115() {
        y_();
        Boolean r0 = m12120();
        SharedPreferences.Editor edit = m12121().edit();
        edit.clear();
        edit.apply();
        if (r0 != null) {
            m12118(r0.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12118(boolean z) {
        y_();
        SharedPreferences.Editor edit = m12121().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ʅ  reason: contains not printable characters */
    public final Boolean m12120() {
        y_();
        if (m12121().contains("measurement_enabled")) {
            return Boolean.valueOf(m12121().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ƚ  reason: contains not printable characters */
    public final String m12112() {
        y_();
        String string = m12121().getString("previous_os_version", (String) null);
        x_().m15649();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = m12121().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m12125(boolean z) {
        y_();
        t_().m11713().m11603("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m12121().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɨ  reason: contains not printable characters */
    public final boolean m12111() {
        return this.f10776.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m12123(long j) {
        return j - this.f10795.m13399() > this.f10772.m13399();
    }
}
