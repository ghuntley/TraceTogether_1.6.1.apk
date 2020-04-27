package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.C0858;

/* renamed from: o.ԑɪ  reason: contains not printable characters */
public class C2978 extends ViewGroup {

    /* renamed from: ı  reason: contains not printable characters */
    private int f13745;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f13746;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f13747;

    /* renamed from: ι  reason: contains not printable characters */
    private int f13748;

    public C2978(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2978(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2978(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13747 = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0858.Aux.f5586, 0, 0);
        this.f13746 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f13745 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m15303(int i) {
        this.f13746 = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15302(int i) {
        this.f13745 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m15301() {
        return this.f13747;
    }

    public void setSingleLine(boolean z) {
        this.f13747 = z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i5 - getPaddingRight();
        int i6 = paddingLeft;
        int i7 = paddingTop;
        int i8 = i7;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i11 = i6;
                if (i6 + i4 + childAt.getMeasuredWidth() > paddingRight && !m15301()) {
                    int paddingLeft2 = getPaddingLeft();
                    i8 = this.f13746 + i7;
                    i11 = paddingLeft2;
                }
                int measuredWidth = i11 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i8;
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                int measuredWidth2 = i11 + i4 + i3 + childAt.getMeasuredWidth() + this.f13745;
                if (i10 == getChildCount() - 1) {
                    i9 += i3;
                }
                i7 = measuredHeight;
                i6 = measuredWidth2;
            } else {
                int i12 = i;
                int i13 = i2;
                int i14 = i6;
            }
        }
        setMeasuredDimension(m15300(size, mode, i9 + getPaddingRight()), m15300(size2, mode2, i7 + getPaddingBottom()));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m15300(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f13748 = 0;
            return;
        }
        this.f13748 = 1;
        boolean z2 = C0293.m4156(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.f167192131362305, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = C2826.m14763(marginLayoutParams);
                    i6 = C2826.m14766(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f13747 && measuredWidth > i7) {
                    i9 = paddingTop + this.f13746;
                    this.f13748++;
                    i8 = paddingRight;
                }
                childAt.setTag(R.id.f167192131362305, Integer.valueOf(this.f13748 - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f13745;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m15304() {
        return this.f13748;
    }
}
