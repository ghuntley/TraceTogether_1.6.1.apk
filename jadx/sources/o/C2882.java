package o;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: o.ӏǃ  reason: contains not printable characters */
final class C2882 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Field f13408 = m14954();

    /* renamed from: ǃ  reason: contains not printable characters */
    protected static final Method f13409 = m14952(f13412);

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Field f13410 = m14949();

    /* renamed from: Ι  reason: contains not printable characters */
    protected static final Method f13411 = m14955(f13412);

    /* renamed from: ι  reason: contains not printable characters */
    private static Class<?> f13412 = m14951();

    /* renamed from: І  reason: contains not printable characters */
    private static Method f13413 = m14950(f13412);

    /* renamed from: і  reason: contains not printable characters */
    private static final Handler f13414 = new Handler(Looper.getMainLooper());

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062 A[Catch:{ all -> 0x009f, all -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[Catch:{ all -> 0x009f, all -> 0x00ab }] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m14953(android.app.Activity r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 28
            if (r0 < r2) goto L_0x000b
            r10.recreate()
            return r1
        L_0x000b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 27
            r3 = 26
            r4 = 0
            if (r0 == r3) goto L_0x001b
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r2) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0023
            java.lang.reflect.Method r0 = f13413
            if (r0 != 0) goto L_0x0023
            return r4
        L_0x0023:
            java.lang.reflect.Method r0 = f13411
            if (r0 != 0) goto L_0x002c
            java.lang.reflect.Method r0 = f13409
            if (r0 != 0) goto L_0x002c
            return r4
        L_0x002c:
            java.lang.reflect.Field r0 = f13410     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0035
            return r4
        L_0x0035:
            java.lang.reflect.Field r5 = f13408     // Catch:{ all -> 0x00ab }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ all -> 0x00ab }
            if (r5 != 0) goto L_0x003e
            return r4
        L_0x003e:
            android.app.Application r6 = r10.getApplication()     // Catch:{ all -> 0x00ab }
            o.ӏǃ$ɩ r7 = new o.ӏǃ$ɩ     // Catch:{ all -> 0x00ab }
            r7.<init>(r10)     // Catch:{ all -> 0x00ab }
            r6.registerActivityLifecycleCallbacks(r7)     // Catch:{ all -> 0x00ab }
            android.os.Handler r8 = f13414     // Catch:{ all -> 0x00ab }
            o.ӏǃ$3 r9 = new o.ӏǃ$3     // Catch:{ all -> 0x00ab }
            r9.<init>(r7, r0)     // Catch:{ all -> 0x00ab }
            r8.post(r9)     // Catch:{ all -> 0x00ab }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x009f }
            if (r8 == r3) goto L_0x005f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x009f }
            if (r3 != r2) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r2 = 0
            goto L_0x0060
        L_0x005f:
            r2 = 1
        L_0x0060:
            if (r2 == 0) goto L_0x0091
            java.lang.reflect.Method r10 = f13413     // Catch:{ all -> 0x009f }
            r2 = 9
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x009f }
            r2[r4] = r0     // Catch:{ all -> 0x009f }
            r0 = 0
            r2[r1] = r0     // Catch:{ all -> 0x009f }
            r3 = 2
            r2[r3] = r0     // Catch:{ all -> 0x009f }
            r3 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x009f }
            r2[r3] = r8     // Catch:{ all -> 0x009f }
            r3 = 4
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009f }
            r2[r3] = r8     // Catch:{ all -> 0x009f }
            r3 = 5
            r2[r3] = r0     // Catch:{ all -> 0x009f }
            r3 = 6
            r2[r3] = r0     // Catch:{ all -> 0x009f }
            r0 = 7
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009f }
            r2[r0] = r3     // Catch:{ all -> 0x009f }
            r0 = 8
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009f }
            r2[r0] = r3     // Catch:{ all -> 0x009f }
            r10.invoke(r5, r2)     // Catch:{ all -> 0x009f }
            goto L_0x0094
        L_0x0091:
            r10.recreate()     // Catch:{ all -> 0x009f }
        L_0x0094:
            android.os.Handler r10 = f13414     // Catch:{ all -> 0x00ab }
            o.ӏǃ$5 r0 = new o.ӏǃ$5     // Catch:{ all -> 0x00ab }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x00ab }
            r10.post(r0)     // Catch:{ all -> 0x00ab }
            return r1
        L_0x009f:
            r10 = move-exception
            android.os.Handler r0 = f13414     // Catch:{ all -> 0x00ab }
            o.ӏǃ$5 r1 = new o.ӏǃ$5     // Catch:{ all -> 0x00ab }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x00ab }
            r0.post(r1)     // Catch:{ all -> 0x00ab }
            throw r10     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2882.m14953(android.app.Activity):boolean");
    }

    /* renamed from: o.ӏǃ$ɩ  reason: contains not printable characters */
    static final class C2883 implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ı  reason: contains not printable characters */
        private boolean f13421 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        Object f13422;

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f13423 = false;

        /* renamed from: Ι  reason: contains not printable characters */
        private Activity f13424;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f13425 = false;

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        C2883(Activity activity) {
            this.f13424 = activity;
        }

        public final void onActivityStarted(Activity activity) {
            if (this.f13424 == activity) {
                this.f13425 = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.f13421 && !this.f13423 && !this.f13425 && C2882.m14948(this.f13422, activity)) {
                this.f13423 = true;
                this.f13422 = null;
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.f13424 == activity) {
                this.f13424 = null;
                this.f13421 = true;
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    protected static boolean m14948(Object obj, Activity activity) {
        try {
            final Object obj2 = f13410.get(activity);
            if (obj2 != obj) {
                return false;
            }
            final Object obj3 = f13408.get(activity);
            f13414.postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    try {
                        if (C2882.f13409 != null) {
                            C2882.f13409.invoke(obj3, new Object[]{obj2, Boolean.FALSE, "AppCompat recreation"});
                            return;
                        }
                        C2882.f13411.invoke(obj3, new Object[]{obj2, Boolean.FALSE});
                    } catch (RuntimeException e) {
                        if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                            throw e;
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Method m14952(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Method m14955(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Field m14954() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Field m14949() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Class<?> m14951() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Method m14950(Class<?> cls) {
        if ((Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
