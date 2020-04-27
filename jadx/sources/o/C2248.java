package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C2745;

/* renamed from: o.Іɤ  reason: contains not printable characters */
public class C2248 {

    /* renamed from: ı  reason: contains not printable characters */
    private static volatile C2248 f10549 = null;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static boolean f10550 = false;

    /* renamed from: ȷ  reason: contains not printable characters */
    private static Boolean f10551 = null;

    /* renamed from: ɨ  reason: contains not printable characters */
    private static boolean f10552 = false;

    /* renamed from: ɪ  reason: contains not printable characters */
    private static boolean f10553 = false;

    /* renamed from: ɾ  reason: contains not printable characters */
    private static String f10554 = "use_dynamite_api";
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public static Boolean f10555 = null;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static Boolean f10556 = null;

    /* renamed from: ӏ  reason: contains not printable characters */
    private static String f10557 = "allow_remote_dynamite";
    /* access modifiers changed from: private */

    /* renamed from: ł  reason: contains not printable characters */
    public C1426 f10558;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final ExecutorService f10559;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected final C2023 f10560;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f10561;
    /* access modifiers changed from: private */

    /* renamed from: ʟ  reason: contains not printable characters */
    public boolean f10562;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f10563;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1544 f10564;
    /* access modifiers changed from: private */

    /* renamed from: І  reason: contains not printable characters */
    public List<Pair<C3211, C2249>> f10565;

    /* renamed from: г  reason: contains not printable characters */
    private String f10566;

    /* renamed from: o.Іɤ$ǃ  reason: contains not printable characters */
    class C2250 implements Application.ActivityLifecycleCallbacks {
        C2250() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2248.this.m11760((If) new C2238(this, activity, bundle));
        }

        public final void onActivityStarted(Activity activity) {
            C2248.this.m11760((If) new C2237(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C2248.this.m11760((If) new C2207(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C2248.this.m11760((If) new C2265(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C2248.this.m11760((If) new C2239(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C0601 r0 = new C0601();
            C2248.this.m11760((If) new C2284(this, activity, r0));
            Bundle r4 = r0.m5308(50);
            if (r4 != null) {
                bundle.putAll(r4);
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            C2248.this.m11760((If) new C2273(this, activity));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2248 m11745(Context context) {
        return m11739(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* renamed from: o.Іɤ$If */
    abstract class If implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f10567;

        /* renamed from: Ι  reason: contains not printable characters */
        final long f10569;

        /* renamed from: ι  reason: contains not printable characters */
        final long f10570;

        If(C2248 r2) {
            this(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ı  reason: contains not printable characters */
        public void m11784() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m11785();

        If(boolean z) {
            this.f10570 = C2248.this.f10560.m10846();
            this.f10569 = C2248.this.f10560.m10847();
            this.f10567 = z;
        }

        public void run() {
            if (C2248.this.f10562) {
                m11784();
                return;
            }
            try {
                m11785();
            } catch (Exception e) {
                C2248.this.m11746(e, false, this.f10567);
                m11784();
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2248 m11739(Context context, String str, String str2, String str3, Bundle bundle) {
        C2745.C2746.m14555(context);
        if (f10549 == null) {
            synchronized (C2248.class) {
                if (f10549 == null) {
                    f10549 = new C2248(context, str, str2, str3, bundle);
                }
            }
        }
        return f10549;
    }

    /* renamed from: o.Іɤ$ı  reason: contains not printable characters */
    static class C2249 extends C2132 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C3211 f10571;

        C2249(C3211 r1) {
            this.f10571 = r1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m11787(String str, String str2, Bundle bundle, long j) {
            this.f10571.onEvent(str, str2, bundle, j);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m11786() {
            return System.identityHashCode(this.f10571);
        }
    }

    private C2248(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m11741(str2, str3)) {
            this.f10563 = "FA";
        } else {
            this.f10563 = str;
        }
        this.f10560 = C2022.m10841();
        this.f10559 = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f10564 = new C1544(this);
        boolean z = false;
        if (!(!m11762(context) || m11752())) {
            this.f10566 = null;
            this.f10562 = true;
            Log.w(this.f10563, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!m11741(str2, str3)) {
            this.f10566 = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f10563, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f10563, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.f10566 = str2;
        }
        m11760((If) new C1913(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f10563, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2250());
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private static boolean m11762(Context context) {
        try {
            C0503.m4905(context);
            if (C0503.m4902() != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m11741(String str, String str2) {
        return (str2 == null || str == null || m11752()) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m11760(If ifR) {
        this.f10559.execute(ifR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final C1426 m11765(Context context, boolean z) {
        DynamiteModule.C0053 r3;
        if (z) {
            try {
                r3 = DynamiteModule.f581;
            } catch (DynamiteModule.If e) {
                m11746((Exception) e, true, false);
                return null;
            }
        } else {
            r3 = DynamiteModule.f578;
        }
        return C1130.asInterface(DynamiteModule.m800(context, r3, ModuleDescriptor.MODULE_ID).m801("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* access modifiers changed from: private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m11751(Context context) {
        return DynamiteModule.m790(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public static int m11763(Context context) {
        return DynamiteModule.m798(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11746(Exception exc, boolean z, boolean z2) {
        this.f10562 |= z;
        if (z) {
            Log.w(this.f10563, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m11768(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f10563, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private static boolean m11752() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11783(C3211 r2) {
        C2745.C2746.m14555(r2);
        m11760((If) new C2203(this, r2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11781(String str, Bundle bundle) {
        m11756((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11782(String str, String str2, Bundle bundle) {
        m11756(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m11756(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m11760((If) new C2187(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11774(String str, String str2, Object obj) {
        m11749(str, str2, obj, true);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m11749(String str, String str2, Object obj, boolean z) {
        m11760((If) new C2172(this, str, str2, obj, z));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11772(Bundle bundle) {
        m11760((If) new C2206(this, bundle));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11769(String str, String str2, Bundle bundle) {
        m11760((If) new C2208(this, str, str2, bundle));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<Bundle> m11771(String str, String str2) {
        C0601 r0 = new C0601();
        m11760((If) new C1910(this, str, str2, r0));
        List<Bundle> list = (List) C0601.m5306(r0.m5308(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11780(Activity activity, String str, String str2) {
        m11760((If) new C1950(this, activity, str, str2));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11766(String str) {
        m11760((If) new C1999(this, str));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11773(String str) {
        m11760((If) new C2007(this, str));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m11778() {
        C0601 r0 = new C0601();
        m11760((If) new C2085(this, r0));
        return r0.m5309(500);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m11770() {
        C0601 r0 = new C0601();
        m11760((If) new C2005(this, r0));
        return r0.m5309(50);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m11767() {
        C0601 r0 = new C0601();
        m11760((If) new C2111(this, r0));
        Long l = (Long) C0601.m5306(r0.m5308(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f10560.m10846()).nextLong();
        int i = this.f10561 + 1;
        this.f10561 = i;
        return nextLong + ((long) i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m11776() {
        C0601 r0 = new C0601();
        m11760((If) new C2070(this, r0));
        return r0.m5309(500);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m11764() {
        C0601 r0 = new C0601();
        m11760((If) new C2160(this, r0));
        return r0.m5309(500);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Map<String, Object> m11779(String str, String str2, boolean z) {
        C0601 r6 = new C0601();
        m11760((If) new C2124(this, str, str2, z, r6));
        Bundle r9 = r6.m5308(5000);
        if (r9 == null || r9.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(r9.size());
        for (String str3 : r9.keySet()) {
            Object obj = r9.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11768(int i, String str, Object obj, Object obj2, Object obj3) {
        m11760((If) new C2106(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m11777(String str) {
        C0601 r0 = new C0601();
        m11760((If) new C2125(this, str, r0));
        Integer num = (Integer) C0601.m5306(r0.m5308(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11775(boolean z) {
        m11760((If) new C2200(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public static void m11743(Context context) {
        synchronized (C2248.class) {
            try {
                if (f10556 != null && f10555 != null) {
                    return;
                }
                if (m11740(context, "app_measurement_internal_disable_startup_flags")) {
                    f10556 = false;
                    f10555 = false;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f10556 = Boolean.valueOf(sharedPreferences.getBoolean(f10554, false));
                f10555 = Boolean.valueOf(sharedPreferences.getBoolean(f10557, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(f10554);
                edit.remove(f10557);
                edit.apply();
            } catch (Exception e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                f10556 = false;
                f10555 = false;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m11750(Context context) {
        m11743(context);
        synchronized (C2248.class) {
            if (!f10550) {
                try {
                    String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{"measurement.dynamite.enabled", ""});
                    if ("true".equals(str)) {
                        f10551 = true;
                    } else if ("false".equals(str)) {
                        f10551 = false;
                    } else {
                        f10551 = null;
                    }
                    f10550 = true;
                } catch (Exception e) {
                    try {
                        Log.e("FA", "Unable to call SystemProperties.get()", e);
                        f10551 = null;
                    } finally {
                        f10550 = true;
                    }
                }
            }
        }
        Boolean bool = f10551;
        if (bool == null) {
            bool = f10556;
        }
        return bool.booleanValue();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m11740(Context context, String str) {
        C2745.C2746.m14562(str);
        try {
            ApplicationInfo r3 = C2059.m10962(context).m12203(context.getPackageName(), 128);
            if (r3 != null) {
                if (r3.metaData != null) {
                    return r3.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
