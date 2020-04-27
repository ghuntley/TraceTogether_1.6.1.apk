package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: o.ʟӀ  reason: contains not printable characters */
public final class C1692 extends Drawable implements Animatable {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Interpolator f8771 = new LinearInterpolator();

    /* renamed from: ι  reason: contains not printable characters */
    private static final Interpolator f8772 = new C1991();

    /* renamed from: І  reason: contains not printable characters */
    private static final int[] f8773 = {-16777216};

    /* renamed from: ǃ  reason: contains not printable characters */
    final C1693 f8774;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f8775;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Resources f8776;

    /* renamed from: Ι  reason: contains not printable characters */
    float f8777;

    /* renamed from: і  reason: contains not printable characters */
    private float f8778;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Animator f8779;

    public final int getOpacity() {
        return -3;
    }

    public C1692(Context context) {
        if (context != null) {
            this.f8776 = context.getResources();
            this.f8774 = new C1693();
            C1693 r3 = this.f8774;
            r3.f8794 = f8773;
            r3.f8802 = 0;
            r3.f8788 = r3.f8794[r3.f8802];
            C1693 r32 = this.f8774;
            r32.f8787 = 2.5f;
            r32.f8798.setStrokeWidth(2.5f);
            invalidateSelf();
            final C1693 r33 = this.f8774;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    C1692.m9608(floatValue, r33);
                    C1692.this.m9609(floatValue, r33, false);
                    C1692.this.invalidateSelf();
                }
            });
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(f8771);
            ofFloat.addListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    C1692.this.f8777 = 0.0f;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C1692.this.m9609(1.0f, r33, true);
                    C1693 r0 = r33;
                    r0.f8795 = r0.f8784;
                    r0.f8804 = r0.f8800;
                    r0.f8791 = r0.f8803;
                    C1693 r02 = r33;
                    r02.f8802 = (r02.f8802 + 1) % r02.f8794.length;
                    r02.f8788 = r02.f8794[r02.f8802];
                    if (C1692.this.f8775) {
                        C1692.this.f8775 = false;
                        animator.cancel();
                        animator.setDuration(1332);
                        animator.start();
                        C1693 r5 = r33;
                        if (r5.f8793) {
                            r5.f8793 = false;
                            return;
                        }
                        return;
                    }
                    C1692.this.f8777 += 1.0f;
                }
            });
            this.f8779 = ofFloat;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m9607(float f, float f2, float f3, float f4) {
        C1693 r0 = this.f8774;
        float f5 = this.f8776.getDisplayMetrics().density;
        float f6 = f2 * f5;
        r0.f8787 = f6;
        r0.f8798.setStrokeWidth(f6);
        r0.f8801 = f * f5;
        r0.f8802 = 0;
        r0.f8788 = r0.f8794[r0.f8802];
        r0.f8785 = (int) (f3 * f5);
        r0.f8796 = (int) (f4 * f5);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9610(int i) {
        if (i == 0) {
            m9607(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m9607(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f8778, bounds.exactCenterX(), bounds.exactCenterY());
        C1693 r1 = this.f8774;
        RectF rectF = r1.f8799;
        float f = r1.f8801 + (r1.f8787 / 2.0f);
        if (r1.f8801 <= 0.0f) {
            f = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) r1.f8785) * r1.f8797) / 2.0f, r1.f8787 / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f, ((float) bounds.centerY()) - f, ((float) bounds.centerX()) + f, ((float) bounds.centerY()) + f);
        float f2 = (r1.f8784 + r1.f8803) * 360.0f;
        float f3 = ((r1.f8800 + r1.f8803) * 360.0f) - f2;
        r1.f8798.setColor(r1.f8788);
        r1.f8798.setAlpha(r1.f8786);
        float f4 = r1.f8787 / 2.0f;
        rectF.inset(f4, f4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, r1.f8789);
        float f5 = -f4;
        rectF.inset(f5, f5);
        canvas.drawArc(rectF, f2, f3, false, r1.f8798);
        if (r1.f8793) {
            if (r1.f8790 == null) {
                r1.f8790 = new Path();
                r1.f8790.setFillType(Path.FillType.EVEN_ODD);
            } else {
                r1.f8790.reset();
            }
            r1.f8790.moveTo(0.0f, 0.0f);
            r1.f8790.lineTo(((float) r1.f8785) * r1.f8797, 0.0f);
            r1.f8790.lineTo((((float) r1.f8785) * r1.f8797) / 2.0f, ((float) r1.f8796) * r1.f8797);
            r1.f8790.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) r1.f8785) * r1.f8797) / 2.0f), rectF.centerY() + (r1.f8787 / 2.0f));
            r1.f8790.close();
            r1.f8792.setColor(r1.f8788);
            r1.f8792.setAlpha(r1.f8786);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(r1.f8790, r1.f8792);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.f8774.f8786 = i;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f8774.f8786;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8774.f8798.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean isRunning() {
        return this.f8779.isRunning();
    }

    public final void start() {
        this.f8779.cancel();
        C1693 r0 = this.f8774;
        r0.f8795 = r0.f8784;
        r0.f8804 = r0.f8800;
        r0.f8791 = r0.f8803;
        if (this.f8774.f8800 != this.f8774.f8784) {
            this.f8775 = true;
            this.f8779.setDuration(666);
            this.f8779.start();
            return;
        }
        C1693 r02 = this.f8774;
        r02.f8802 = 0;
        r02.f8788 = r02.f8794[r02.f8802];
        C1693 r03 = this.f8774;
        r03.f8795 = 0.0f;
        r03.f8804 = 0.0f;
        r03.f8791 = 0.0f;
        r03.f8784 = 0.0f;
        r03.f8800 = 0.0f;
        r03.f8803 = 0.0f;
        this.f8779.setDuration(1332);
        this.f8779.start();
    }

    public final void stop() {
        this.f8779.cancel();
        this.f8778 = 0.0f;
        C1693 r1 = this.f8774;
        if (r1.f8793) {
            r1.f8793 = false;
        }
        C1693 r12 = this.f8774;
        r12.f8802 = 0;
        r12.f8788 = r12.f8794[r12.f8802];
        C1693 r13 = this.f8774;
        r13.f8795 = 0.0f;
        r13.f8804 = 0.0f;
        r13.f8791 = 0.0f;
        r13.f8784 = 0.0f;
        r13.f8800 = 0.0f;
        r13.f8803 = 0.0f;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9609(float f, C1693 r9, boolean z) {
        float f2;
        float f3;
        if (this.f8775) {
            m9608(f, r9);
            float floor = (float) (Math.floor((double) (r9.f8791 / 0.8f)) + 1.0d);
            r9.f8784 = r9.f8795 + (((r9.f8804 - 0.01f) - r9.f8795) * f);
            r9.f8800 = r9.f8804;
            r9.f8803 = r9.f8791 + ((floor - r9.f8791) * f);
        } else if (f != 1.0f || z) {
            float f4 = r9.f8791;
            if (f < 0.5f) {
                float f5 = r9.f8795;
                float f6 = f5;
                f2 = (f8772.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f5;
                f3 = f6;
            } else {
                f2 = r9.f8795 + 0.79f;
                f3 = f2 - (((1.0f - f8772.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            r9.f8784 = f3;
            r9.f8800 = f2;
            r9.f8803 = f4 + (0.20999998f * f);
            this.f8778 = (f + this.f8777) * 216.0f;
        }
    }

    /* renamed from: o.ʟӀ$ɩ  reason: contains not printable characters */
    static class C1693 {

        /* renamed from: ı  reason: contains not printable characters */
        float f8784 = 0.0f;

        /* renamed from: ŀ  reason: contains not printable characters */
        int f8785;

        /* renamed from: ł  reason: contains not printable characters */
        int f8786 = 255;

        /* renamed from: Ɩ  reason: contains not printable characters */
        float f8787 = 5.0f;

        /* renamed from: ƚ  reason: contains not printable characters */
        int f8788;

        /* renamed from: ǃ  reason: contains not printable characters */
        final Paint f8789 = new Paint();

        /* renamed from: ȷ  reason: contains not printable characters */
        Path f8790;

        /* renamed from: ɨ  reason: contains not printable characters */
        float f8791;

        /* renamed from: ɩ  reason: contains not printable characters */
        final Paint f8792 = new Paint();

        /* renamed from: ɪ  reason: contains not printable characters */
        boolean f8793;

        /* renamed from: ɹ  reason: contains not printable characters */
        int[] f8794;

        /* renamed from: ɾ  reason: contains not printable characters */
        float f8795;

        /* renamed from: ɿ  reason: contains not printable characters */
        int f8796;

        /* renamed from: ʟ  reason: contains not printable characters */
        float f8797 = 1.0f;

        /* renamed from: Ι  reason: contains not printable characters */
        final Paint f8798 = new Paint();

        /* renamed from: ι  reason: contains not printable characters */
        final RectF f8799 = new RectF();

        /* renamed from: І  reason: contains not printable characters */
        float f8800 = 0.0f;

        /* renamed from: г  reason: contains not printable characters */
        float f8801;

        /* renamed from: і  reason: contains not printable characters */
        int f8802;

        /* renamed from: Ӏ  reason: contains not printable characters */
        float f8803 = 0.0f;

        /* renamed from: ӏ  reason: contains not printable characters */
        float f8804;

        C1693() {
            this.f8798.setStrokeCap(Paint.Cap.SQUARE);
            this.f8798.setAntiAlias(true);
            this.f8798.setStyle(Paint.Style.STROKE);
            this.f8792.setStyle(Paint.Style.FILL);
            this.f8792.setAntiAlias(true);
            this.f8789.setColor(0);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m9608(float f, C1693 r9) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int i = r9.f8794[r9.f8802];
            int i2 = r9.f8794[(r9.f8802 + 1) % r9.f8794.length];
            int i3 = i >>> 24;
            int i4 = (i >> 16) & 255;
            int i5 = (i >> 8) & 255;
            int i6 = i & 255;
            r9.f8788 = ((i3 + ((int) (((float) ((i2 >>> 24) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & 255) - i6)))));
            return;
        }
        r9.f8788 = r9.f8794[r9.f8802];
    }
}
