package o;

import java.util.concurrent.Callable;

/* renamed from: o.ƺ  reason: contains not printable characters */
final class C0814 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0770 f5309;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ Callable f5310;

    C0814(C0770 r1, Callable callable) {
        this.f5309 = r1;
        this.f5310 = callable;
    }

    public final void run() {
        try {
            this.f5309.m6079(this.f5310.call());
        } catch (Exception e) {
            this.f5309.m6073(e);
        }
    }
}
