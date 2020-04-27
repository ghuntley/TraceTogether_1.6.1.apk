package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: o.ƒ  reason: contains not printable characters */
final class C0624 extends Drawable {

    /* renamed from: ι  reason: contains not printable characters */
    static C0625 f4590;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final double f4591 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: ı  reason: contains not printable characters */
    final int f4592;

    /* renamed from: ł  reason: contains not printable characters */
    private final int f4593 = 50331648;

    /* renamed from: Ɩ  reason: contains not printable characters */
    boolean f4594 = true;

    /* renamed from: ǃ  reason: contains not printable characters */
    float f4595;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final RectF f4596;

    /* renamed from: ɨ  reason: contains not printable characters */
    private float f4597;

    /* renamed from: ɩ  reason: contains not printable characters */
    float f4598;

    /* renamed from: ɪ  reason: contains not printable characters */
    private Path f4599;

    /* renamed from: ɹ  reason: contains not printable characters */
    ColorStateList f4600;

    /* renamed from: ɾ  reason: contains not printable characters */
    private Paint f4601;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final int f4602 = 922746880;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f4603 = false;

    /* renamed from: Ι  reason: contains not printable characters */
    float f4604;

    /* renamed from: І  reason: contains not printable characters */
    boolean f4605 = true;

    /* renamed from: і  reason: contains not printable characters */
    private Paint f4606;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Paint f4607;

    /* renamed from: o.ƒ$ı  reason: contains not printable characters */
    interface C0625 {
        /* renamed from: ı  reason: contains not printable characters */
        void m5337(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public final int getOpacity() {
        return -3;
    }

    C0624(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f4592 = resources.getDimensionPixelSize(R.dimen.f157922131165270);
        this.f4606 = new Paint(5);
        m5336(colorStateList);
        this.f4607 = new Paint(5);
        this.f4607.setStyle(Paint.Style.FILL);
        this.f4598 = (float) ((int) (f + 0.5f));
        this.f4596 = new RectF();
        this.f4601 = new Paint(this.f4607);
        this.f4601.setAntiAlias(false);
        m5335(f2, f3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5336(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4600 = colorStateList;
        this.f4606.setColor(this.f4600.getColorForState(getState(), this.f4600.getDefaultColor()));
    }

    public final void setAlpha(int i) {
        this.f4606.setAlpha(i);
        this.f4607.setAlpha(i);
        this.f4601.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4594 = true;
    }

    public final boolean getPadding(Rect rect) {
        float f = this.f4595;
        int ceil = (int) Math.ceil((double) (this.f4605 ? (float) (((double) (f * 1.5f)) + ((1.0d - f4591) * ((double) this.f4598))) : f * 1.5f));
        float f2 = this.f4595;
        float f3 = this.f4598;
        if (this.f4605) {
            f2 = (float) (((double) f2) + ((1.0d - f4591) * ((double) f3)));
        }
        int ceil2 = (int) Math.ceil((double) f2);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static float m5333(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f4591) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static float m5334(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f4591) * ((double) f2))) : f;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f4600;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f4606.getColor() == colorForState) {
            return false;
        }
        this.f4606.setColor(colorForState);
        this.f4594 = true;
        invalidateSelf();
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4600;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4606.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        if (this.f4594) {
            Rect bounds = getBounds();
            float f = this.f4595 * 1.5f;
            this.f4596.set(((float) bounds.left) + this.f4595, ((float) bounds.top) + f, ((float) bounds.right) - this.f4595, ((float) bounds.bottom) - f);
            float f2 = this.f4598;
            RectF rectF = new RectF(-f2, -f2, f2, f2);
            RectF rectF2 = new RectF(rectF);
            float f3 = this.f4597;
            rectF2.inset(-f3, -f3);
            Path path = this.f4599;
            if (path == null) {
                this.f4599 = new Path();
            } else {
                path.reset();
            }
            this.f4599.setFillType(Path.FillType.EVEN_ODD);
            this.f4599.moveTo(-this.f4598, 0.0f);
            this.f4599.rLineTo(-this.f4597, 0.0f);
            this.f4599.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f4599.arcTo(rectF, 270.0f, -90.0f, false);
            this.f4599.close();
            float f4 = this.f4598;
            float f5 = this.f4597;
            Paint paint = this.f4607;
            int i2 = this.f4602;
            RadialGradient radialGradient = r12;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f4 + f5, new int[]{i2, i2, this.f4593}, new float[]{0.0f, f4 / (f4 + f5), 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
            Paint paint2 = this.f4601;
            float f6 = this.f4598;
            float f7 = this.f4597;
            int i3 = this.f4602;
            paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i3, i3, this.f4593}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f4601.setAntiAlias(false);
            this.f4594 = false;
        }
        canvas2.translate(0.0f, this.f4604 / 2.0f);
        float f8 = this.f4598;
        float f9 = (-f8) - this.f4597;
        float f10 = f8 + ((float) this.f4592) + (this.f4604 / 2.0f);
        float f11 = f10 * 2.0f;
        boolean z = this.f4596.width() - f11 > 0.0f;
        boolean z2 = this.f4596.height() - f11 > 0.0f;
        int save = canvas.save();
        canvas2.translate(this.f4596.left + f10, this.f4596.top + f10);
        canvas2.drawPath(this.f4599, this.f4607);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f9, this.f4596.width() - f11, -this.f4598, this.f4601);
        } else {
            i = save;
        }
        canvas2.restoreToCount(i);
        int save2 = canvas.save();
        canvas2.translate(this.f4596.right - f10, this.f4596.bottom - f10);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f4599, this.f4607);
        if (z) {
            canvas.drawRect(0.0f, f9, this.f4596.width() - f11, (-this.f4598) + this.f4597, this.f4601);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        canvas2.translate(this.f4596.left + f10, this.f4596.bottom - f10);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f4599, this.f4607);
        if (z2) {
            canvas.drawRect(0.0f, f9, this.f4596.height() - f11, -this.f4598, this.f4601);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.f4596.right - f10, this.f4596.top + f10);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f4599, this.f4607);
        if (z2) {
            canvas.drawRect(0.0f, f9, this.f4596.height() - f11, -this.f4598, this.f4601);
        }
        canvas2.restoreToCount(save4);
        canvas2.translate(0.0f, (-this.f4604) / 2.0f);
        f4590.m5337(canvas2, this.f4596, this.f4598, this.f4606);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5335(float f, float f2) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            int i = (int) (f + 0.5f);
            if (i % 2 == 1) {
                i--;
            }
            float f3 = (float) i;
            int i2 = (int) (f2 + 0.5f);
            if (i2 % 2 == 1) {
                i2--;
            }
            float f4 = (float) i2;
            if (f3 > f4) {
                if (!this.f4603) {
                    this.f4603 = true;
                }
                f3 = f4;
            }
            if (this.f4604 != f3 || this.f4595 != f4) {
                this.f4604 = f3;
                this.f4595 = f4;
                this.f4597 = (float) ((int) ((f3 * 1.5f) + ((float) this.f4592) + 0.5f));
                this.f4594 = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
