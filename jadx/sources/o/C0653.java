package o;

import java.util.logging.Logger;

/* renamed from: o.Ɩɹ  reason: contains not printable characters */
public final class C0653 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2466 f4694;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2291 f4695;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2201 f4696;

    public C0653(C2466 r1, C2291 r2, C2201 r3) {
        this.f4694 = r1;
        this.f4695 = r2;
        this.f4696 = r3;
    }

    public final void run() {
        C2466 r0 = this.f4694;
        C2291 r1 = this.f4695;
        C2201 r2 = this.f4696;
        try {
            C2362 r3 = r0.f11235.m12181(r1.m11959());
            if (r3 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{r1.m11959()});
                C2466.f11232.warning(format);
                new IllegalArgumentException(format);
                return;
            }
            r0.f11234.m14295(new C0736(r0, r1, r3.m12317(r2)));
        } catch (Exception e) {
            Logger logger = C2466.f11232;
            StringBuilder sb = new StringBuilder("Error scheduling event ");
            sb.append(e.getMessage());
            logger.warning(sb.toString());
        }
    }
}
