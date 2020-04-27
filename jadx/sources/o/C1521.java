package o;

/* renamed from: o.ɽɟ  reason: contains not printable characters */
final class C1521 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2082 f8111;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C1353 f8112;

    C1521(C1353 r1, C2082 r2) {
        this.f8112 = r1;
        this.f8111 = r2;
    }

    public final void run() {
        synchronized (this.f8112) {
            boolean unused = this.f8112.f7506 = false;
            if (!this.f8112.f7507.m6365()) {
                this.f8112.f7507.t_().m11711().m11606("Connected to remote service");
                this.f8112.f7507.m6385(this.f8111);
            }
        }
    }
}
