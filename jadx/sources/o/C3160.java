package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.Set;
import o.C0858;

/* renamed from: o.յӀ  reason: contains not printable characters */
public final class C3160 implements C2841 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final int[] f14378 = {R.attr.f150332130968818};

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int[] f14379 = {R.attr.f150312130968815};

    /* renamed from: ı  reason: contains not printable characters */
    private final Set f14380;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static TypedArray m15974(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m15978(context, attributeSet, i, i2);
        m15976(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1992 m15977(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m15978(context, attributeSet, i, i2);
        m15976(context, attributeSet, iArr, i, i2, iArr2);
        return new C1992(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m15978(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5593, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.f152022130968996, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m15973(context, f14378, "Theme.MaterialComponents");
            }
        }
        m15973(context, f14379, "Theme.AppCompat");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m15976(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5593, i, i2);
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(0, -1) != -1;
        } else {
            z = m15979(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m15979(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m15975(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m15973(Context context, int[] iArr, String str) {
        if (!m15975(context, iArr)) {
            StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public C3160(Set set) {
        this.f14380 = set;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m15980() {
        return C2397.m12411(this.f14380);
    }
}
