package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: o.чӀ  reason: contains not printable characters */
public class C2506 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static UserManager f11321;

    /* renamed from: Ι  reason: contains not printable characters */
    private static volatile boolean f11322 = (!m13257());

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean f11323 = false;

    private C2506() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m13257() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m13254(Context context) {
        return !m13257() || m13255(context);
    }

    @TargetApi(24)
    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m13256(Context context) {
        boolean z;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f11321 == null) {
                f11321 = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f11321;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                    z = true;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                f11321 = null;
                i++;
            }
        }
        if (z) {
            f11321 = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m13255(android.content.Context r3) {
        /*
            boolean r0 = f11322
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<o.чӀ> r0 = o.C2506.class
            monitor-enter(r0)
            boolean r2 = f11322     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = m13256(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f11322 = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2506.m13255(android.content.Context):boolean");
    }
}
