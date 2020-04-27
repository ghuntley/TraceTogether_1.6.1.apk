package o;

import java.util.concurrent.Executor;

/* renamed from: o.ıә  reason: contains not printable characters */
final class C0449<TResult> implements C0642<TResult> {

    /* renamed from: ı  reason: contains not printable characters */
    private final Executor f4052;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public C3191 f4053;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final Object f4054 = new Object();

    public C0449(Executor executor, C3191 r3) {
        this.f4052 = executor;
        this.f4053 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4759(C0329<TResult> r3) {
        if (!r3.m4421() && !r3.m4405()) {
            synchronized (this.f4054) {
                if (this.f4053 != null) {
                    this.f4052.execute(new C0568(this, r3));
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4758() {
        synchronized (this.f4054) {
            this.f4053 = null;
        }
    }
}
