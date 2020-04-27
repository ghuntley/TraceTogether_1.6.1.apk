package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Executor;

/* renamed from: o.э  reason: contains not printable characters */
public class C2523 extends C2575 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static volatile C2523 f11449;

    /* renamed from: ι  reason: contains not printable characters */
    private static final Executor f11450 = new Executor() {
        public final void execute(Runnable runnable) {
            C2523.m13404().f11452.m13691(runnable);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    private C2575 f11451 = new C2559();

    /* renamed from: Ι  reason: contains not printable characters */
    public C2575 f11452 = this.f11451;

    /* renamed from: o.э$4  reason: invalid class name */
    public static class AnonymousClass4 implements Executor {

        /* renamed from: ı  reason: contains not printable characters */
        private final RecyclerView f11453;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C2833 f11454;

        /* renamed from: ι  reason: contains not printable characters */
        private final C2895 f11455;

        AnonymousClass4() {
        }

        public final void execute(Runnable runnable) {
            C2523.m13404().f11452.m13693(runnable);
        }

        public AnonymousClass4(C2895 r1, C2833 r2, RecyclerView recyclerView) {
            this.f11455 = r1;
            this.f11454 = r2;
            this.f11453 = recyclerView;
        }
    }

    private C2523() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2523 m13404() {
        if (f11449 != null) {
            return f11449;
        }
        synchronized (C2523.class) {
            if (f11449 == null) {
                f11449 = new C2523();
            }
        }
        return f11449;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13405(Runnable runnable) {
        this.f11452.m13691(runnable);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13407(Runnable runnable) {
        this.f11452.m13693(runnable);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Executor m13403() {
        return f11450;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m13406() {
        return this.f11452.m13692();
    }
}
