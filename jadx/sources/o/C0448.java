package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: o.ıӏ  reason: contains not printable characters */
class C0448 extends Drawable {

    /* renamed from: ı  reason: contains not printable characters */
    private final Paint f4041;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private ColorStateList f4042;

    /* renamed from: ǃ  reason: contains not printable characters */
    private float f4043;

    /* renamed from: ɨ  reason: contains not printable characters */
    private PorterDuff.Mode f4044 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final RectF f4045;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f4046 = true;

    /* renamed from: Ι  reason: contains not printable characters */
    private float f4047;

    /* renamed from: ι  reason: contains not printable characters */
    private final Rect f4048;

    /* renamed from: І  reason: contains not printable characters */
    private PorterDuffColorFilter f4049;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f4050 = false;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private ColorStateList f4051;

    public int getOpacity() {
        return -3;
    }

    C0448(ColorStateList colorStateList, float f) {
        this.f4047 = f;
        this.f4041 = new Paint(5);
        m4749(colorStateList);
        this.f4045 = new RectF();
        this.f4048 = new Rect();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m4749(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4042 = colorStateList;
        this.f4041.setColor(this.f4042.getColorForState(getState(), this.f4042.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m4754(float f, boolean z, boolean z2) {
        if (f != this.f4043 || this.f4050 != z || this.f4046 != z2) {
            this.f4043 = f;
            this.f4050 = z;
            this.f4046 = z2;
            m4747((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public float m4753() {
        return this.f4043;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f4041;
        if (this.f4049 == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f4049);
            z = true;
        }
        RectF rectF = this.f4045;
        float f = this.f4047;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m4747(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f4045.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f4048.set(rect);
        if (this.f4050) {
            float r6 = C0624.m5333(this.f4043, this.f4047, this.f4046);
            this.f4048.inset((int) Math.ceil((double) C0624.m5334(this.f4043, this.f4047, this.f4046)), (int) Math.ceil((double) r6));
            this.f4045.set(this.f4048);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4747(rect);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f4048, this.f4047);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m4751(float f) {
        if (f != this.f4047) {
            this.f4047 = f;
            m4747((Rect) null);
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.f4041.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4041.setColorFilter(colorFilter);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public float m4755() {
        return this.f4047;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m4752(ColorStateList colorStateList) {
        m4749(colorStateList);
        invalidateSelf();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public ColorStateList m4750() {
        return this.f4042;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4051 = colorStateList;
        this.f4049 = m4748(this.f4051, this.f4044);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f4044 = mode;
        this.f4049 = m4748(this.f4051, this.f4044);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4042;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f4041.getColor();
        if (z) {
            this.f4041.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4051;
        if (colorStateList2 == null || (mode = this.f4044) == null) {
            return z;
        }
        this.f4049 = m4748(colorStateList2, mode);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f4051;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f4042;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private PorterDuffColorFilter m4748(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
