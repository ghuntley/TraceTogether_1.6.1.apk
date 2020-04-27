package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: o.Ο  reason: contains not printable characters */
public final class C1911 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C1911 f9652;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Boolean f9653 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    Boolean f9654 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f9655 = null;

    /* renamed from: ι  reason: contains not printable characters */
    final Queue<Intent> f9656 = new ArrayDeque();

    /* renamed from: Ι  reason: contains not printable characters */
    public static synchronized C1911 m10386() {
        C1911 r1;
        synchronized (C1911.class) {
            if (f9652 == null) {
                f9652 = new C1911();
            }
            r1 = f9652;
        }
        return r1;
    }

    private C1911() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Intent m10387() {
        return this.f9656.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m10388(Context context, Intent intent) {
        ComponentName componentName;
        String r0 = m10385(context, intent);
        if (r0 != null) {
            intent.setClassName(context.getPackageName(), r0);
        }
        try {
            if (m10389(context)) {
                componentName = C2046.m10938(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            return componentName == null ? 404 : -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException unused2) {
            return 402;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        return null;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String m10385(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.f9655     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0009
            java.lang.String r4 = r3.f9655     // Catch:{ all -> 0x0069 }
            monitor-exit(r3)
            return r4
        L_0x0009:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x0069 }
            r1 = 0
            android.content.pm.ResolveInfo r5 = r0.resolveService(r5, r1)     // Catch:{ all -> 0x0069 }
            r0 = 0
            if (r5 == 0) goto L_0x0067
            android.content.pm.ServiceInfo r1 = r5.serviceInfo     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x001a
            goto L_0x0067
        L_0x001a:
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = r5.packageName     // Catch:{ all -> 0x0069 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x002d
            goto L_0x0061
        L_0x002d:
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0059
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0069 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0069 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0069 }
            int r0 = r5.length()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0069 }
            goto L_0x0056
        L_0x0050:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0069 }
            r5.<init>(r4)     // Catch:{ all -> 0x0069 }
            r4 = r5
        L_0x0056:
            r3.f9655 = r4     // Catch:{ all -> 0x0069 }
            goto L_0x005d
        L_0x0059:
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0069 }
            r3.f9655 = r4     // Catch:{ all -> 0x0069 }
        L_0x005d:
            java.lang.String r4 = r3.f9655     // Catch:{ all -> 0x0069 }
            monitor-exit(r3)
            return r4
        L_0x0061:
            java.lang.String r4 = r5.packageName     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0069 }
            monitor-exit(r3)
            return r0
        L_0x0067:
            monitor-exit(r3)
            return r0
        L_0x0069:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1911.m10385(android.content.Context, android.content.Intent):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10389(Context context) {
        if (this.f9653 == null) {
            this.f9653 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        return this.f9653.booleanValue();
    }
}
