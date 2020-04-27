package o;

import java.util.concurrent.Executor;

/* renamed from: o.ıʑ  reason: contains not printable characters */
final class C0365<TResult, TContinuationResult> implements C2970, C0642<TResult> {

    /* renamed from: ı  reason: contains not printable characters */
    private final Executor f3825;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0770<TContinuationResult> f3826;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final C2979<TResult, C0329<TContinuationResult>> f3827;

    public C0365(Executor executor, C2979<TResult, C0329<TContinuationResult>> r2, C0770<TContinuationResult> r3) {
        this.f3825 = executor;
        this.f3827 = r2;
        this.f3826 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4554(C0329<TResult> r3) {
        this.f3825.execute(new C0345(this, r3));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f3826.m6079(tcontinuationresult);
    }

    public final void onFailure(Exception exc) {
        this.f3826.m6073(exc);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4552() {
        this.f3826.m6088();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4553() {
        throw new UnsupportedOperationException();
    }
}
