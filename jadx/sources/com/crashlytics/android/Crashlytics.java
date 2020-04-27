package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import o.C0961;
import o.C1211;
import o.C3263ac;
import o.C3269ai;
import o.C3270aj;
import o.C3281au;

public class Crashlytics extends C3269ai<Void> implements C3270aj {

    /* renamed from: ι  reason: contains not printable characters */
    public static final String f460 = "Crashlytics";

    /* renamed from: ı  reason: contains not printable characters */
    public final Answers f461;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Beta f462;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final CrashlyticsCore f463;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Collection<? extends C3269ai> f464;

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m634() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Void m633() {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public String m636() {
        return "2.10.1.34";
    }

    public Crashlytics() {
        this(new Answers(), new Beta(), new CrashlyticsCore());
    }

    Crashlytics(Answers answers, Beta beta, CrashlyticsCore crashlyticsCore) {
        this.f461 = answers;
        this.f462 = beta;
        this.f463 = crashlyticsCore;
        this.f464 = Collections.unmodifiableCollection(Arrays.asList(new C3269ai[]{answers, beta, crashlyticsCore}));
    }

    /* renamed from: com.crashlytics.android.Crashlytics$ɩ  reason: contains not printable characters */
    public static class C0049 {

        /* renamed from: ı  reason: contains not printable characters */
        private CrashlyticsCore.C0051 f465;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Answers f466;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Beta f467;

        /* renamed from: Ι  reason: contains not printable characters */
        private CrashlyticsCore f468;

        @Deprecated
        /* renamed from: ı  reason: contains not printable characters */
        public C0049 m643(float f) {
            m642().m731(f);
            return this;
        }

        @Deprecated
        /* renamed from: ǃ  reason: contains not printable characters */
        public C0049 m646(C0961 r2) {
            m642().m730(r2);
            return this;
        }

        @Deprecated
        /* renamed from: ɩ  reason: contains not printable characters */
        public C0049 m648(C1211 r2) {
            m642().m727(r2);
            return this;
        }

        @Deprecated
        /* renamed from: ɩ  reason: contains not printable characters */
        public C0049 m649(boolean z) {
            m642().m728(z);
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public C0049 m645(Answers answers) {
            if (answers == null) {
                throw new NullPointerException("Answers Kit must not be null.");
            } else if (this.f466 == null) {
                this.f466 = answers;
                return this;
            } else {
                throw new IllegalStateException("Answers Kit already set.");
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public C0049 m644(Beta beta) {
            if (beta == null) {
                throw new NullPointerException("Beta Kit must not be null.");
            } else if (this.f467 == null) {
                this.f467 = beta;
                return this;
            } else {
                throw new IllegalStateException("Beta Kit already set.");
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public C0049 m650(CrashlyticsCore crashlyticsCore) {
            if (crashlyticsCore == null) {
                throw new NullPointerException("CrashlyticsCore Kit must not be null.");
            } else if (this.f468 == null) {
                this.f468 = crashlyticsCore;
                return this;
            } else {
                throw new IllegalStateException("CrashlyticsCore Kit already set.");
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Crashlytics m647() {
            CrashlyticsCore.C0051 r0 = this.f465;
            if (r0 != null) {
                if (this.f468 == null) {
                    this.f468 = r0.m729();
                } else {
                    throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
            }
            if (this.f466 == null) {
                this.f466 = new Answers();
            }
            if (this.f467 == null) {
                this.f467 = new Beta();
            }
            if (this.f468 == null) {
                this.f468 = new CrashlyticsCore();
            }
            return new Crashlytics(this.f466, this.f467, this.f468);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private synchronized CrashlyticsCore.C0051 m642() {
            if (this.f465 == null) {
                this.f465 = new CrashlyticsCore.C0051();
            }
            return this.f465;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Collection<? extends C3269ai> m639() {
        return this.f464;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Crashlytics m614() {
        return (Crashlytics) C3263ac.m1559(Crashlytics.class);
    }

    /* renamed from: І  reason: contains not printable characters */
    public static C1211 m631() {
        m621();
        return m614().f463.m718();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m619(Throwable th) {
        m621();
        m614().f463.m697(th);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m627(String str) {
        m621();
        m614().f463.m688(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m626(int i, String str, String str2) {
        m621();
        m614().f463.m708(i, str, str2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m622(String str) {
        m621();
        m614().f463.m709(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m617(String str) {
        m621();
        m614().f463.m695(str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m615(String str) {
        m621();
        m614().f463.m713(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m624(String str, String str2) {
        m621();
        m614().f463.m696(str, str2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m629(String str, boolean z) {
        m621();
        m614().f463.m715(str, z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m623(String str, double d) {
        m621();
        m614().f463.m700(str, d);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m616(String str, float f) {
        m621();
        m614().f463.m714(str, f);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m628(String str, int i) {
        m621();
        m614().f463.m710(str, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m618(String str, long j) {
        m621();
        m614().f463.m711(str, j);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private static boolean m620() {
        m621();
        return C3281au.m1627(m614().m1589()).m1628();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m630(boolean z) {
        m621();
        C3281au r0 = C3281au.m1627(m614().m1589());
        r0.f1548 = z;
        r0.f1549 = true;
        r0.f1547.edit().putBoolean("firebase_crashlytics_collection_enabled", z).commit();
    }

    /* renamed from: і  reason: contains not printable characters */
    public void m640() {
        this.f463.m717();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m632(URL url) {
        return this.f463.m702(url);
    }

    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public synchronized void m637(C0961 r2) {
        this.f463.m701(r2);
    }

    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public void m638(boolean z) {
        C3263ac.m1563();
    }

    @Deprecated
    /* renamed from: Ӏ  reason: contains not printable characters */
    public boolean m641() {
        C3263ac.m1563();
        m1588();
        return C3263ac.m1558();
    }

    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public static void m625(C1211 r0) {
        C3263ac.m1563();
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private static void m621() {
        if (m614() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }
}
