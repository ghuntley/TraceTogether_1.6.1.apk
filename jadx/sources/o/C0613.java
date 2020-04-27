package o;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: o.Ƌ  reason: contains not printable characters */
public final class C0613 implements C0460 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float f4575;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0460 f4576;

    public C0613(float f, C0460 r3) {
        while (r3 instanceof C0613) {
            r3 = ((C0613) r3).f4576;
            f += ((C0613) r3).f4575;
        }
        this.f4576 = r3;
        this.f4575 = f;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final float m5317(RectF rectF) {
        return Math.max(0.0f, this.f4576.m4787(rectF) + this.f4575);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0613)) {
            return false;
        }
        C0613 r5 = (C0613) obj;
        return this.f4576.equals(r5.f4576) && this.f4575 == r5.f4575;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4576, Float.valueOf(this.f4575)});
    }
}
