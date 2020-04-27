package o;

import android.graphics.PointF;
import o.C2383;

/* renamed from: o.ρ  reason: contains not printable characters */
public final class C2114 implements C2218<PointF> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C2114 f10240 = new C2114();

    private C2114() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m11269(C2383 r5, float f) {
        C2383.C2384 r0 = r5.m12390();
        if (r0 == C2383.C2384.BEGIN_ARRAY) {
            return C2041.m10923(r5, f);
        }
        if (r0 == C2383.C2384.BEGIN_OBJECT) {
            return C2041.m10923(r5, f);
        }
        if (r0 == C2383.C2384.NUMBER) {
            PointF pointF = new PointF(((float) r5.m12387()) * f, ((float) r5.m12387()) * f);
            while (r5.m12383()) {
                r5.m12396();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(r0)));
    }
}
