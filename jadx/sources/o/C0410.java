package o;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* renamed from: o.ıе  reason: contains not printable characters */
public final class C0410 implements C2234 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[] f3975 = {16843623};

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final int[] f3976 = {16842913, 16843623, 16842908};

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f3977 = {16842919};

    /* renamed from: ȷ  reason: contains not printable characters */
    private static final int[] f3978 = {16842910, 16842919};

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final boolean f3979 = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final int[] f3980 = {16842913, 16843623};

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int[] f3981 = {16843623, 16842908};

    /* renamed from: ι  reason: contains not printable characters */
    private static final int[] f3982 = {16842908};

    /* renamed from: І  reason: contains not printable characters */
    private static final int[] f3983 = {16842913, 16842908};

    /* renamed from: і  reason: contains not printable characters */
    private static final int[] f3984 = {16842913, 16842919};

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final int[] f3985 = {16842913};

    /* renamed from: Ι  reason: contains not printable characters */
    public static ColorStateList m4696(ColorStateList colorStateList) {
        if (f3979) {
            return new ColorStateList(new int[][]{f3985, StateSet.NOTHING}, new int[]{m4694(colorStateList, f3984), m4694(colorStateList, f3977)});
        }
        int[] iArr = f3984;
        int[] iArr2 = f3976;
        int[] iArr3 = f3983;
        int[] iArr4 = f3980;
        int[] iArr5 = f3977;
        int[] iArr6 = f3981;
        int[] iArr7 = f3982;
        int[] iArr8 = f3975;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f3985, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m4694(colorStateList, iArr), m4694(colorStateList, iArr2), m4694(colorStateList, iArr3), m4694(colorStateList, iArr4), 0, m4694(colorStateList, iArr5), m4694(colorStateList, iArr6), m4694(colorStateList, iArr7), m4694(colorStateList, iArr8), 0});
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static ColorStateList m4695(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f3978, 0));
        }
        return colorStateList;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m4697(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m4694(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        if (!f3979) {
            return colorForState;
        }
        int min = Math.min(Color.alpha(colorForState) * 2, 255);
        if (min >= 0 && min <= 255) {
            return (colorForState & 16777215) | (min << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4698(int i) {
        Thread.sleep((long) i);
    }
}
