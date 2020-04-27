package o;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: o.łƭ  reason: contains not printable characters */
public final class C0531 implements C0460 {

    /* renamed from: ι  reason: contains not printable characters */
    private final float f4361;

    public C0531(float f) {
        this.f4361 = f;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final float m5097(RectF rectF) {
        return this.f4361;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0531) && this.f4361 == ((C0531) obj).f4361;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4361)});
    }
}
