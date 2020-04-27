package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: o.յІ  reason: contains not printable characters */
public final class C3156 {

    /* renamed from: ı  reason: contains not printable characters */
    public final ArrayList<If> f14367 = new ArrayList<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    public If f14368 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    public ValueAnimator f14369 = null;

    /* renamed from: ι  reason: contains not printable characters */
    public final Animator.AnimatorListener f14370 = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            if (C3156.this.f14369 == animator) {
                C3156.this.f14369 = null;
            }
        }
    };

    /* renamed from: o.յІ$If */
    public static class If {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final ValueAnimator f14372;

        /* renamed from: ι  reason: contains not printable characters */
        public final int[] f14373;

        public If(int[] iArr, ValueAnimator valueAnimator) {
            this.f14373 = iArr;
            this.f14372 = valueAnimator;
        }
    }
}
