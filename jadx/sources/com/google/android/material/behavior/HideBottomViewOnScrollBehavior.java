package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.C1311;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C3238If<V> {

    /* renamed from: ı  reason: contains not printable characters */
    public int f647 = 2;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f648 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f649 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    ViewPropertyAnimator f650;

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f648 = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m868(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f650 = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f650 = null;
            }
        });
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f647 != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f650;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.f647 = 1;
                m868(v, this.f648 + this.f649, 175, C1311.f7288);
            }
        } else if (i2 < 0 && this.f647 != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f650;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f647 = 2;
            m868(v, 0, 225, C1311.f7291);
        }
    }
}
