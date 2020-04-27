package o;

import android.util.Log;
import java.util.concurrent.Callable;
import o.C2771;

/* renamed from: o.ҥ  reason: contains not printable characters */
class C2712 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2712 f12539 = new C2712(true, (String) null, (Throwable) null);

    /* renamed from: ı  reason: contains not printable characters */
    private final String f12540;

    /* renamed from: ǃ  reason: contains not printable characters */
    final boolean f12541;

    /* renamed from: ι  reason: contains not printable characters */
    private final Throwable f12542;

    C2712(boolean z, String str, Throwable th) {
        this.f12541 = z;
        this.f12540 = str;
        this.f12542 = th;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C2712 m14412() {
        return f12539;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C2712 m14408(Callable<String> callable) {
        return new C2830(callable);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C2712 m14410(String str) {
        return new C2712(false, str, (Throwable) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C2712 m14409(String str, Throwable th) {
        return new C2712(false, str, th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public String m14414() {
        return this.f12540;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14413() {
        if (!this.f12541 && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f12542 != null) {
                Log.d("GoogleCertificatesRslt", m14414(), this.f12542);
            } else {
                Log.d("GoogleCertificatesRslt", m14414());
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static String m14411(String str, C2500 r3, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C2771.If.m14661(C1975.m10712("SHA-1").digest(r3.m13252())), Boolean.valueOf(z), "12451009.false"});
    }
}
