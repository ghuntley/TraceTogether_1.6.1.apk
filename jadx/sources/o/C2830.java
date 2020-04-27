package o;

import java.util.concurrent.Callable;

/* renamed from: o.ӀГ  reason: contains not printable characters */
final class C2830 extends C2712 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final Callable<String> f13254;

    private C2830(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.f13254 = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14772() {
        try {
            return this.f13254.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
