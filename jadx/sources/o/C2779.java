package o;

import android.os.Binder;

/* renamed from: o.Ӏɂ  reason: contains not printable characters */
public final /* synthetic */ class C2779 {
    /* renamed from: ι  reason: contains not printable characters */
    public static <V> V m14670(C2579<V> r2) {
        long clearCallingIdentity;
        try {
            return r2.m13699();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V r22 = r2.m13699();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return r22;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
