package o;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import o.C2745;

/* renamed from: o.р  reason: contains not printable characters */
final class C2458 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Context f11164;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Object f11165 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private static volatile C1775 f11166;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m12665(android.content.Context r2) {
        /*
            java.lang.Class<o.р> r0 = o.C2458.class
            monitor-enter(r0)
            android.content.Context r1 = f11164     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f11164 = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2458.m12665(android.content.Context):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C2712 m12662(String str, C2500 r2, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m12664(str, r2, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C2712 m12664(String str, C2500 r5, boolean z, boolean z2) {
        try {
            if (f11166 == null) {
                C2745.C2746.m14555(f11164);
                synchronized (f11165) {
                    if (f11166 == null) {
                        f11166 = C1870.m10256(DynamiteModule.m800(f11164, DynamiteModule.f582, "com.google.android.gms.googlecertificates").m801("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C2745.C2746.m14555(f11164);
            try {
                if (f11166.m9889(new C2587(str, r5, z, z2), C2813.m14730(f11164.getPackageManager()))) {
                    return C2712.m14412();
                }
                return C2712.m14408(new C2465(z, str, r5));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C2712.m14409("module call", e);
            }
        } catch (DynamiteModule.If e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return C2712.m14409(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static final /* synthetic */ String m12663(boolean z, String str, C2500 r5) {
        boolean z2 = true;
        if (z || !m12664(str, r5, true, false).f12541) {
            z2 = false;
        }
        return C2712.m14411(str, r5, z, z2);
    }
}
