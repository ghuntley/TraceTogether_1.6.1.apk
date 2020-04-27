package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

public final class na implements C3149 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2979 f3373;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0993 f3374;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3203 f3375;

    /* renamed from: ι  reason: contains not printable characters */
    static ValueAnimator m3977(final View view, int i, int i2) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: ǃ  reason: contains not printable characters */
            private int f3382 = view.getPaddingBottom();

            /* renamed from: ɩ  reason: contains not printable characters */
            private int f3383 = view.getPaddingRight();

            /* renamed from: ι  reason: contains not printable characters */
            private int f3385 = view.getPaddingLeft();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setPadding(this.f3385, ((Integer) ofInt.getAnimatedValue()).intValue(), this.f3383, this.f3382);
            }
        });
        ofInt.setDuration(200);
        return ofInt;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static ValueAnimator m3976(final View view, int i, int i2) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: ǃ  reason: contains not printable characters */
            private int f3377 = view.getPaddingRight();

            /* renamed from: ɩ  reason: contains not printable characters */
            private int f3378 = view.getPaddingLeft();

            /* renamed from: ι  reason: contains not printable characters */
            private int f3380 = view.getPaddingTop();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setPadding(this.f3378, this.f3380, this.f3377, ((Integer) ofInt.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration(200);
        return ofInt;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static ValueAnimator m3974(final View view, int i, int i2) {
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                layoutParams.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration(200);
        return ofInt;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static ValueAnimator m3975(final View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setMinimumHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration(200);
        return ofInt;
    }

    public na(C0993 r1, C2979 r2, C3203 r3) {
        this.f3374 = r1;
        this.f3373 = r2;
        this.f3375 = r3;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3978(C0329 r3) {
        C0993.m7033(this.f3374, this.f3373, this.f3375);
    }
}
