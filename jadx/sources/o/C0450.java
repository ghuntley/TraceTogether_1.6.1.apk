package o;

import java.util.concurrent.Executor;

/* renamed from: o.ıө  reason: contains not printable characters */
final class C0450<TResult> implements C0642<TResult> {
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object f4055 = new Object();
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2970 f4056;

    /* renamed from: ι  reason: contains not printable characters */
    private final Executor f4057;

    public C0450(Executor executor, C2970 r3) {
        this.f4057 = executor;
        this.f4056 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4763(C0329 r2) {
        if (r2.m4405()) {
            synchronized (this.f4055) {
                if (this.f4056 != null) {
                    this.f4057.execute(new C0437(this));
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4762() {
        synchronized (this.f4055) {
            this.f4056 = null;
        }
    }
}
