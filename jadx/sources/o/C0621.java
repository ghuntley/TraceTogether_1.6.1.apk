package o;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: o.ƐΙ  reason: contains not printable characters */
public final class C0621 implements C0460 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final float f4587;

    public C0621(float f) {
        this.f4587 = f;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final float m5329(RectF rectF) {
        return this.f4587 * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0621) && this.f4587 == ((C0621) obj).f4587;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4587)});
    }
}
