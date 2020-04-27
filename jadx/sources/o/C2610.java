package o;

import android.content.Context;
import android.graphics.Color;

/* renamed from: o.іյ  reason: contains not printable characters */
public final class C2610 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float f11869;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f11870;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean f11871;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f11872;

    public C2610(Context context) {
        this.f11871 = C0328.m4399(context, (int) R.attr.f151062130968895, false);
        this.f11870 = C2724.m14458(context, R.attr.f151052130968894);
        this.f11872 = C2724.m14458(context, R.attr.f150352130968822);
        this.f11869 = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m13834(int i, float f) {
        if (this.f11871) {
            int i2 = (i & 16777215) | -16777216;
            if (i2 == this.f11872) {
                float f2 = this.f11869;
                float f3 = 0.0f;
                if (f2 > 0.0f && f > 0.0f) {
                    f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                }
                int alpha = Color.alpha(i);
                int r7 = C2724.m14457(i2, this.f11870, f3);
                if (alpha < 0 || alpha > 255) {
                    throw new IllegalArgumentException("alpha must be between 0 and 255.");
                }
                return (alpha << 24) | (r7 & 16777215);
            }
        }
        return i;
    }
}
