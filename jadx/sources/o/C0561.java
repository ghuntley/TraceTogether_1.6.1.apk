package o;

import java.util.concurrent.Executor;

/* renamed from: o.ŧƖ  reason: contains not printable characters */
final class C0561<TResult> implements C0642<TResult> {

    /* renamed from: ı  reason: contains not printable characters */
    private final Executor f4461;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public C3153<? super TResult> f4462;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final Object f4463 = new Object();

    public C0561(Executor executor, C3153<? super TResult> r3) {
        this.f4461 = executor;
        this.f4462 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5174(C0329<TResult> r3) {
        if (r3.m4421()) {
            synchronized (this.f4463) {
                if (this.f4462 != null) {
                    this.f4461.execute(new C0463(this, r3));
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5173() {
        synchronized (this.f4463) {
            this.f4462 = null;
        }
    }
}
