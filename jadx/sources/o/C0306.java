package o;

/* renamed from: o.ıƾ  reason: contains not printable characters */
final /* synthetic */ class C0306 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0305 f3601;

    C0306(C0305 r1) {
        this.f3601 = r1;
    }

    public final void run() {
        C0305 r0 = this.f3601;
        r0.y_();
        if (r0.s_().f10773.m12524()) {
            r0.t_().m11711().m11606("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long r1 = r0.s_().f10787.m13399();
        r0.s_().f10787.m13398(1 + r1);
        if (r1 >= 5) {
            r0.t_().A_().m11606("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            r0.s_().f10773.m12525(true);
            return;
        }
        r0.f14314.m14110();
    }
}
