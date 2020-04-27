package o;

import java.util.concurrent.Callable;

/* renamed from: o.ιп  reason: contains not printable characters */
final class C2055 implements Callable<String> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C1924 f10110;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2270 f10111;

    C2055(C1924 r1, C2270 r2) {
        this.f10110 = r1;
        this.f10111 = r2;
    }

    public final /* synthetic */ Object call() {
        C2457 r0 = this.f10110.m10491(this.f10111);
        if (r0 != null) {
            return r0.m12621();
        }
        this.f10110.t_().A_().m11606("App info was null when attempting to get app instance id");
        return null;
    }
}
