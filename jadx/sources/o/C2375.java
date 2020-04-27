package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: o.Х  reason: contains not printable characters */
public abstract class C2375 extends ValueAnimator {

    /* renamed from: ı  reason: contains not printable characters */
    private final Set<Animator.AnimatorListener> f10900 = new CopyOnWriteArraySet();

    /* renamed from: ι  reason: contains not printable characters */
    private final Set<ValueAnimator.AnimatorUpdateListener> f10901 = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f10901.add(animatorUpdateListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f10901.remove(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.f10901.clear();
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f10900.add(animatorListener);
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f10900.remove(animatorListener);
    }

    public void removeAllListeners() {
        this.f10900.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12366(boolean z) {
        for (Animator.AnimatorListener next : this.f10900) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m12368() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f10900) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12365(boolean z) {
        for (Animator.AnimatorListener next : this.f10900) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12367() {
        for (Animator.AnimatorListener onAnimationCancel : this.f10900) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m12364() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f10901) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }
}
