package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import o.C0858;

/* renamed from: o.ιɒ  reason: contains not printable characters */
public final class C1981 {

    /* renamed from: ı  reason: contains not printable characters */
    private final int f9921;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0785 f9922;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final ColorStateList f9923;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Rect f9924;

    /* renamed from: Ι  reason: contains not printable characters */
    private final ColorStateList f9925;

    /* renamed from: ι  reason: contains not printable characters */
    private final ColorStateList f9926;

    private C1981(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C0785 r6, Rect rect) {
        if (rect.left < 0) {
            throw new IllegalArgumentException();
        } else if (rect.top < 0) {
            throw new IllegalArgumentException();
        } else if (rect.right < 0) {
            throw new IllegalArgumentException();
        } else if (rect.bottom >= 0) {
            this.f9924 = rect;
            this.f9925 = colorStateList2;
            this.f9923 = colorStateList;
            this.f9926 = colorStateList3;
            this.f9921 = i;
            this.f9922 = r6;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C1981 m10772(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0858.Aux.f5583);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList r6 = C0344.m4473(context, obtainStyledAttributes, 4);
            ColorStateList r7 = C0344.m4473(context, obtainStyledAttributes, 9);
            ColorStateList r8 = C0344.m4473(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            C0785 r10 = new C0785(C0785.m6130(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0531(0.0f)), (byte) 0);
            obtainStyledAttributes.recycle();
            return new C1981(r6, r7, r8, dimensionPixelSize, r10, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10773(TextView textView) {
        C0671 r0 = new C0671();
        C0671 r1 = new C0671();
        r0.setShapeAppearanceModel(this.f9922);
        r1.setShapeAppearanceModel(this.f9922);
        ColorStateList colorStateList = this.f9923;
        if (r0.f4785.f4804 != colorStateList) {
            r0.f4785.f4804 = colorStateList;
            r0.onStateChange(r0.getState());
        }
        r0.m5525((float) this.f9921, this.f9926);
        textView.setTextColor(this.f9925);
        C0293.m4199((View) textView, (Drawable) new InsetDrawable(Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f9925.withAlpha(30), r0, r1) : r0, this.f9924.left, this.f9924.top, this.f9924.right, this.f9924.bottom));
    }
}
