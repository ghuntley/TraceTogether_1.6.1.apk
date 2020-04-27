package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.au  reason: case insensitive filesystem */
public final class C3281au {

    /* renamed from: ı  reason: contains not printable characters */
    private static C3281au f1544;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Object f1545 = new Object();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f1546 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final SharedPreferences f1547;

    /* renamed from: Ι  reason: contains not printable characters */
    public volatile boolean f1548;

    /* renamed from: ι  reason: contains not printable characters */
    public volatile boolean f1549;

    /* renamed from: і  reason: contains not printable characters */
    private final aC f1550;

    /* renamed from: ι  reason: contains not printable characters */
    public static C3281au m1627(Context context) {
        C3281au auVar;
        synchronized (f1545) {
            if (f1544 == null) {
                f1544 = new C3281au(context);
            }
            auVar = f1544;
        }
        return auVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r1 = r1.getApplicationInfo(r7.getPackageName(), 128);
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3281au(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f1546 = r0
            if (r7 == 0) goto L_0x0061
            java.lang.String r1 = "com.google.firebase.crashlytics.prefs"
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r1, r0)
            r6.f1547 = r1
            o.aC r1 = o.mP.m3769(r7)
            r6.f1550 = r1
            android.content.SharedPreferences r1 = r6.f1547
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.contains(r2)
            r3 = 1
            if (r1 == 0) goto L_0x0029
            android.content.SharedPreferences r1 = r6.f1547
            boolean r1 = r1.getBoolean(r2, r3)
        L_0x0027:
            r2 = 1
            goto L_0x0053
        L_0x0029:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x0051
            java.lang.String r4 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x004e }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x0051
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x0051
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r4 = r4.containsKey(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x0051
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r1 = r1.getBoolean(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            goto L_0x0027
        L_0x004e:
            o.C3263ac.m1563()
        L_0x0051:
            r1 = 1
            r2 = 0
        L_0x0053:
            r6.f1548 = r1
            r6.f1549 = r2
            java.lang.String r7 = o.C3285aw.m1670(r7)
            if (r7 == 0) goto L_0x005e
            r0 = 1
        L_0x005e:
            r6.f1546 = r0
            return
        L_0x0061:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3281au.<init>(android.content.Context):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m1628() {
        if (this.f1546 && this.f1549) {
            return this.f1548;
        }
        aC aCVar = this.f1550;
        if (aCVar != null) {
            return aCVar.m1454();
        }
        return true;
    }
}
