package o;

import java.util.concurrent.Executor;

/* renamed from: o.ıʁ  reason: contains not printable characters */
final class C0355<TResult, TContinuationResult> implements C0642<TResult> {
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2979<TResult, TContinuationResult> f3794;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0770<TContinuationResult> f3795;

    /* renamed from: ι  reason: contains not printable characters */
    private final Executor f3796;

    public C0355(Executor executor, C2979<TResult, TContinuationResult> r2, C0770<TContinuationResult> r3) {
        this.f3796 = executor;
        this.f3794 = r2;
        this.f3795 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4515(C0329<TResult> r3) {
        this.f3796.execute(new C0354(this, r3));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4514() {
        throw new UnsupportedOperationException();
    }
}
