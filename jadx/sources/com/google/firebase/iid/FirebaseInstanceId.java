package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.B;
import o.C0309;
import o.C0329;
import o.C0770;
import o.C1086;
import o.C1252;
import o.C1298;
import o.C1725;
import o.C1799;
import o.C1881;
import o.C1918;
import o.C1971;
import o.C2011;
import o.C2324;
import o.C2400;
import o.C2404;
import o.C2648;
import o.C3035;
import o.C3121;
import o.C3149;
import o.C3197;
import o.C3626z;

public class FirebaseInstanceId {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1881 f978;

    /* renamed from: І  reason: contains not printable characters */
    private static ScheduledExecutorService f979;

    /* renamed from: і  reason: contains not printable characters */
    private static final long f980 = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: ı  reason: contains not printable characters */
    public final C1799 f981;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C3626z.C0279 f982;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final FirebaseApp f983;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f984;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final If f985;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C3035 f986;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Executor f987;

    /* renamed from: ι  reason: contains not printable characters */
    public final C2400 f988;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C2648.C2649 f989;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static FirebaseInstanceId m1106() {
        return getInstance(FirebaseApp.getInstance());
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.m1077(FirebaseInstanceId.class);
    }

    public class If {

        /* renamed from: ı  reason: contains not printable characters */
        private C3197<C1725> f990;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C3121 f991;

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f992;

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean f993;

        /* renamed from: і  reason: contains not printable characters */
        private Boolean f995;

        If(C3121 r2) {
            this.f991 = r2;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private final synchronized void m1121() {
            if (!this.f993) {
                this.f992 = m1123();
                this.f995 = m1122();
                if (this.f995 == null && this.f992) {
                    this.f990 = new B.IF(this);
                    this.f991.m15825(C1725.class, this.f990);
                }
                this.f993 = true;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final synchronized boolean m1124() {
            m1121();
            if (this.f995 == null) {
                return this.f992 && FirebaseInstanceId.this.f983.isDataCollectionDefaultEnabled();
            }
            return this.f995.booleanValue();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Boolean m1122() {
            ApplicationInfo applicationInfo;
            Context r1 = FirebaseInstanceId.this.f983.m1074();
            SharedPreferences sharedPreferences = r1.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = r1.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(r1.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private final boolean m1123() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context r1 = FirebaseInstanceId.this.f983.m1074();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(r1.getPackageName());
                ResolveInfo resolveService = r1.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, C3121 r11, C1971 r12, C1298 r13, C3035 r14) {
        this(firebaseApp, new C1799(firebaseApp.m1074()), C2324.m12104(), C2324.m12104(), r11, r12, r13, r14);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, C1799 r14, Executor executor, Executor executor2, C3121 r17, C1971 r18, C1298 r19, C3035 r20) {
        Executor executor3 = executor2;
        this.f984 = false;
        if (C1799.m9976(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f978 == null) {
                    f978 = new C1881(firebaseApp.m1074());
                }
            }
            this.f983 = firebaseApp;
            this.f981 = r14;
            this.f988 = new C2400(firebaseApp, r14, executor, r18, r19, r20);
            this.f987 = executor3;
            this.f982 = new C3626z.C0279(f978);
            this.f985 = new If(r17);
            Executor executor4 = executor;
            this.f989 = new C2648.C2649(executor);
            this.f986 = r20;
            executor3.execute(new B.C0087(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m1116(boolean z) {
        this.f984 = z;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized void m1115() {
        if (!this.f984) {
            m1113(0);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m1113(long j) {
        m1105(new C2011(this, this.f982, Math.min(Math.max(30, j << 1), f980)), j);
        this.f984 = true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m1105(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f979 == null) {
                f979 = new ScheduledThreadPoolExecutor(1, new C1252("FirebaseInstanceId", (byte) 0));
            }
            f979.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m1107(FirebaseApp firebaseApp) {
        String str;
        if (TextUtils.isEmpty(firebaseApp.m1075().f8949)) {
            str = firebaseApp.m1075().f8950;
        } else {
            str = firebaseApp.m1075().f8949;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("FirebaseApp should have a non-empty projectId.");
        } else if (TextUtils.isEmpty(firebaseApp.m1075().f8951)) {
            throw new IllegalArgumentException("FirebaseApp should have a non-empty applicationId.");
        } else if (TextUtils.isEmpty(firebaseApp.m1075().f8953)) {
            throw new IllegalArgumentException("FirebaseApp should have a non-empty apiKey.");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m1118() {
        try {
            f978.m10279(this.f983.m1078());
            C0329<String> r0 = this.f986.m15500();
            if (r0 != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                r0.m4407(C2404.f10974, (C3149<String>) new B.C3254iF(countDownLatch));
                countDownLatch.await(30000, TimeUnit.MILLISECONDS);
                if (r0.m4421()) {
                    return r0.m4401();
                }
                if (r0.m4405()) {
                    throw new CancellationException("Task is already canceled");
                }
                throw new IllegalStateException(r0.m4406());
            }
            throw new NullPointerException("Task must not be null");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C1086> m1117() {
        String r0 = C1799.m9976(this.f983);
        String r1 = m1109("*");
        C0770 r2 = new C0770();
        r2.m6079(null);
        return r2.m4404(this.f987, new B.C0090(this, r0, r1));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C1918 m1103(String str, String str2) {
        return f978.m10280("", str, str2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> T m1114(C0329<T> r4) {
        try {
            return C0309.m4372(r4, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    m1120();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static boolean m1108() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final synchronized void m1120() {
        f978.m10285();
        if (this.f985.m1124()) {
            m1115();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m1109(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m1119(C1918 r9) {
        if (r9 != null) {
            if (System.currentTimeMillis() > r9.f9676 + C1918.f9675 || !this.f981.m9978().equals(r9.f9677)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if ((java.lang.System.currentTimeMillis() > r0.f9676 + o.C1918.f9675 || !r10.f981.m9978().equals(r0.f9677)) != false) goto L_0x0035;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1112() {
        /*
            r10 = this;
            com.google.firebase.FirebaseApp r0 = r10.f983
            java.lang.String r0 = o.C1799.m9976(r0)
            o.Ιя r1 = f978
            java.lang.String r2 = "*"
            java.lang.String r3 = ""
            o.ΣІ r0 = r1.m10280(r3, r0, r2)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0035
            o.ΙƩ r3 = r10.f981
            java.lang.String r3 = r3.m9978()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f9676
            long r8 = o.C1918.f9675
            long r6 = r6 + r8
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0032
            java.lang.String r0 = r0.f9677
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            if (r1 != 0) goto L_0x0040
            o.z$ɩ r0 = r10.f982
            boolean r0 = r0.m4103()
            if (r0 == 0) goto L_0x0043
        L_0x0040:
            r10.m1115()
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.m1112():void");
    }
}
