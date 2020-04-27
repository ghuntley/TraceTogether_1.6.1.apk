package o;

import java.util.concurrent.Executor;

/* renamed from: o.ıа  reason: contains not printable characters */
final class C0407<TResult> implements C0642<TResult> {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public C3149<TResult> f3965;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object f3966 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private final Executor f3967;

    public C0407(Executor executor, C3149<TResult> r3) {
        this.f3967 = executor;
        this.f3965 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4692(C0329<TResult> r3) {
        synchronized (this.f3966) {
            if (this.f3965 != null) {
                this.f3967.execute(new C0439(this, r3));
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4691() {
        synchronized (this.f3966) {
            this.f3965 = null;
        }
    }
}
