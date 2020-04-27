package o;

import android.graphics.Color;
import o.C2383;

/* renamed from: o.Ιƚ  reason: contains not printable characters */
public final class C1797 implements C2218<Integer> {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C1797 f9230 = new C1797();

    private C1797() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m9974(C2383 r12, float f) {
        boolean z = r12.m12390() == C2383.C2384.BEGIN_ARRAY;
        if (z) {
            r12.m12388();
        }
        double r0 = r12.m12387();
        double r2 = r12.m12387();
        double r4 = r12.m12387();
        double r6 = r12.m12387();
        if (z) {
            r12.m12386();
        }
        if (r0 <= 1.0d && r2 <= 1.0d && r4 <= 1.0d) {
            r0 *= 255.0d;
            r2 *= 255.0d;
            r4 *= 255.0d;
            if (r6 <= 1.0d) {
                r6 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) r6, (int) r0, (int) r2, (int) r4));
    }
}
