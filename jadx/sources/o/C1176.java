package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: o.ɤ  reason: contains not printable characters */
final class C1176 {

    /* renamed from: ı  reason: contains not printable characters */
    static final int[] f6773 = {-16842910};

    /* renamed from: ǃ  reason: contains not printable characters */
    static final int[] f6774 = new int[0];

    /* renamed from: ɩ  reason: contains not printable characters */
    static final int[] f6775 = {16842908};

    /* renamed from: Ι  reason: contains not printable characters */
    static final int[] f6776 = {16842919};

    /* renamed from: ι  reason: contains not printable characters */
    static final int[] f6777 = {16842912};

    /* renamed from: і  reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f6778 = new ThreadLocal<>();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final int[] f6779 = new int[1];

    /* renamed from: ı  reason: contains not printable characters */
    public static int m7697(Context context, int i) {
        int[] iArr = f6779;
        iArr[0] = i;
        C1992 r4 = new C1992(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return r4.f9934.getColor(0, 0);
        } finally {
            r4.f9934.recycle();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static ColorStateList m7698(Context context, int i) {
        int[] iArr = f6779;
        iArr[0] = i;
        C1992 r4 = new C1992(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
        try {
            return r4.m10792(0);
        } finally {
            r4.f9934.recycle();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m7699(Context context, int i) {
        ColorStateList r0 = m7698(context, i);
        if (r0 != null && r0.isStateful()) {
            return r0.getColorForState(f6773, r0.getDefaultColor());
        }
        TypedValue typedValue = f6778.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f6778.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int r4 = m7697(context, i);
        int round = Math.round(((float) Color.alpha(r4)) * f);
        if (round >= 0 && round <= 255) {
            return (r4 & 16777215) | (round << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
