package o;

import java.util.concurrent.Executor;

/* renamed from: o.ıլ  reason: contains not printable characters */
final class C0461<TResult, TContinuationResult> implements C2970, C0642<TResult> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Executor f4076;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3184<TResult, TContinuationResult> f4077;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0770<TContinuationResult> f4078;

    public C0461(Executor executor, C3184<TResult, TContinuationResult> r2, C0770<TContinuationResult> r3) {
        this.f4076 = executor;
        this.f4077 = r2;
        this.f4078 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4791(C0329<TResult> r3) {
        this.f4076.execute(new C0574(this, r3));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4790() {
        throw new UnsupportedOperationException();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f4078.m6079(tcontinuationresult);
    }

    public final void onFailure(Exception exc) {
        this.f4078.m6073(exc);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4789() {
        this.f4078.m6088();
    }
}
