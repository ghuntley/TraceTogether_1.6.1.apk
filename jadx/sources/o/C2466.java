package o;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: o.сΙ  reason: contains not printable characters */
public final class C2466 implements C2468 {

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Logger f11232 = Logger.getLogger(C2243.class.getName());

    /* renamed from: ı  reason: contains not printable characters */
    public final C2606 f11233;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2691 f11234;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2336 f11235;

    /* renamed from: ι  reason: contains not printable characters */
    public final C2602 f11236;

    /* renamed from: і  reason: contains not printable characters */
    private final Executor f11237;

    @C3350db
    public C2466(Executor executor, C2336 r2, C2606 r3, C2602 r4, C2691 r5) {
        this.f11237 = executor;
        this.f11235 = r2;
        this.f11233 = r3;
        this.f11236 = r4;
        this.f11234 = r5;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12706(C2291 r3, C2201 r4) {
        this.f11237.execute(new C0653(this, r3, r4));
    }
}
