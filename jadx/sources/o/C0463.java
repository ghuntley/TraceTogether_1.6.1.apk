package o;

/* renamed from: o.ıշ  reason: contains not printable characters */
final class C0463 implements Runnable {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0561 f4080;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0329 f4081;

    C0463(C0561 r1, C0329 r2) {
        this.f4080 = r1;
        this.f4081 = r2;
    }

    public final void run() {
        synchronized (this.f4080.f4463) {
            if (this.f4080.f4462 != null) {
                this.f4080.f4462.onSuccess(this.f4081.m4401());
            }
        }
    }
}
