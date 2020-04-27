package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import o.C0858;
import o.C2745;

/* renamed from: o.ԁɪ  reason: contains not printable characters */
public class C2950 extends C2958 {

    /* renamed from: ı  reason: contains not printable characters */
    private Drawable f13676;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Rect f13677;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f13678;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Rect f13679;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f13680;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f13681;

    public C2950(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2950(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2950(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13677 = new Rect();
        this.f13679 = new Rect();
        this.f13678 = C2745.aux.f12991;
        this.f13680 = true;
        this.f13681 = false;
        int[] iArr = C0858.Aux.f5609;
        C3160.m15978(context, attributeSet, i, 0);
        C3160.m15976(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f13678 = obtainStyledAttributes.getInt(1, this.f13678);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f13680 = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public int getForegroundGravity() {
        return this.f13678;
    }

    public void setForegroundGravity(int i) {
        if (this.f13678 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f13678 = i;
            if (this.f13678 == 119 && this.f13676 != null) {
                this.f13676.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13676;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13676;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13676;
        if (drawable != null && drawable.isStateful()) {
            this.f13676.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f13676;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f13676);
            }
            this.f13676 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f13678 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f13676;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f13681 = z | this.f13681;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f13681 = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f13676;
        if (drawable != null) {
            if (this.f13681) {
                this.f13681 = false;
                Rect rect = this.f13677;
                Rect rect2 = this.f13679;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f13680) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f13678, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f13676;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}
