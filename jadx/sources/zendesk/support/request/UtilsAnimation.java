package zendesk.support.request;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

class UtilsAnimation {
    static ValueAnimator topPaddingAnimator(final View view, int i, int i2, int i3) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final int paddingBottom = view.getPaddingBottom();
            final int paddingLeft = view.getPaddingLeft();
            final int paddingRight = view.getPaddingRight();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setPadding(this.paddingLeft, ((Integer) ofInt.getAnimatedValue()).intValue(), this.paddingRight, this.paddingBottom);
            }
        });
        ofInt.setDuration((long) i3);
        return ofInt;
    }

    static ValueAnimator bottomPaddingAnimator(final View view, int i, int i2, int i3) {
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final int paddingLeft = view.getPaddingLeft();
            final int paddingRight = view.getPaddingRight();
            final int paddingTop = view.getPaddingTop();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setPadding(this.paddingLeft, this.paddingTop, this.paddingRight, ((Integer) ofInt.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration((long) i3);
        return ofInt;
    }

    static ValueAnimator sideMarginsAnimator(final View view, int i, int i2, int i3) {
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                layoutParams.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration((long) i3);
        return ofInt;
    }

    static ValueAnimator minHeightAnimator(final View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setMinimumHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration((long) i3);
        return ofInt;
    }
}
