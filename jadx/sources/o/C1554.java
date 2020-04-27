package o;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import o.C2319;

/* renamed from: o.ɾІ  reason: contains not printable characters */
public final class C1554 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1555 f8295 = new C1555();

    /* renamed from: ι  reason: contains not printable characters */
    private final C1568 f8296;

    private C1554(C1568 r1) {
        this.f8296 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1555 m9163() {
        return this.f8295;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9164(Bundle bundle) {
        C2319 lifecycle = this.f8296.getLifecycle();
        if (lifecycle.m12096() == C2319.Cif.INITIALIZED) {
            lifecycle.m12098(new Recreator(this.f8296));
            this.f8295.m9165(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9162(Bundle bundle) {
        this.f8295.m9168(bundle);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1554 m9161(C1568 r1) {
        return new C1554(r1);
    }
}
