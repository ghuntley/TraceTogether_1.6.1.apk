package o;

import android.app.Application;
import android.content.Context;
import com.google.firebase.FirebaseApp;
import o.C0473;

/* renamed from: o.Ɨʝ  reason: contains not printable characters */
public final class C0696 implements C0473.C0474 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0408 f4869;

    /* renamed from: ɩ  reason: contains not printable characters */
    private volatile boolean f4870;

    /* renamed from: ι  reason: contains not printable characters */
    private volatile int f4871;

    public C0696(FirebaseApp firebaseApp) {
        this(firebaseApp.m1074(), new C0408(firebaseApp));
    }

    private C0696(Context context, C0408 r3) {
        this.f4870 = false;
        this.f4871 = 0;
        this.f4869 = r3;
        C0473.m4804((Application) context.getApplicationContext());
        C0473 r2 = C0473.f4096;
        synchronized (C0473.f4096) {
            r2.f4100.add(this);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5743(C1383 r7) {
        if (r7 != null) {
            long r0 = r7.m8535();
            if (r0 <= 0) {
                r0 = 3600;
            }
            C0408 r72 = this.f4869;
            r72.f3973 = r7.m8533() + (r0 * 1000);
            r72.f3971 = -1;
            int i = this.f4871;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5742(boolean z) {
        if (z) {
            this.f4870 = true;
            C0408 r2 = this.f4869;
            r2.f3969.removeCallbacks(r2.f3972);
            return;
        }
        this.f4870 = false;
        int i = this.f4871;
    }
}
