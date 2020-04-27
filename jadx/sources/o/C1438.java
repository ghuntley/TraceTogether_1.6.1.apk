package o;

/* renamed from: o.ɭɉ  reason: contains not printable characters */
final class C1438 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C1353 f7777;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2082 f7778;

    C1438(C1353 r1, C2082 r2) {
        this.f7777 = r1;
        this.f7778 = r2;
    }

    public final void run() {
        synchronized (this.f7777) {
            boolean unused = this.f7777.f7506 = false;
            if (!this.f7777.f7507.m6365()) {
                this.f7777.f7507.t_().m11713().m11606("Connected to service");
                this.f7777.f7507.m6385(this.f7778);
            }
        }
    }
}
