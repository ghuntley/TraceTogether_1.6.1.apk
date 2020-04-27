package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: o.əı  reason: contains not printable characters */
public final class C1121 {

    /* renamed from: ı  reason: contains not printable characters */
    public long f6630 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f6631 = 1;

    /* renamed from: ɩ  reason: contains not printable characters */
    public long f6632 = 300;

    /* renamed from: Ι  reason: contains not printable characters */
    public TimeInterpolator f6633 = null;

    /* renamed from: ι  reason: contains not printable characters */
    private int f6634 = 0;

    public C1121(long j) {
        this.f6630 = j;
        this.f6632 = 150;
    }

    private C1121(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f6630 = j;
        this.f6632 = j2;
        this.f6633 = timeInterpolator;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C1121 m7541(ValueAnimator valueAnimator) {
        C1121 r0 = new C1121(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m7542(valueAnimator));
        r0.f6634 = valueAnimator.getRepeatCount();
        r0.f6631 = valueAnimator.getRepeatMode();
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static TimeInterpolator m7542(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C1311.f7289;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C1311.f7288;
        }
        return interpolator instanceof DecelerateInterpolator ? C1311.f7291 : interpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1121)) {
            return false;
        }
        C1121 r7 = (C1121) obj;
        if (this.f6630 != r7.f6630 || this.f6632 != r7.f6632 || this.f6634 != r7.f6634 || this.f6631 != r7.f6631) {
            return false;
        }
        TimeInterpolator timeInterpolator = this.f6633;
        if (timeInterpolator == null) {
            timeInterpolator = C1311.f7289;
        }
        Class<?> cls = timeInterpolator.getClass();
        TimeInterpolator timeInterpolator2 = r7.f6633;
        if (timeInterpolator2 == null) {
            timeInterpolator2 = C1311.f7289;
        }
        return cls.equals(timeInterpolator2.getClass());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f6630);
        sb.append(" duration: ");
        sb.append(this.f6632);
        sb.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.f6633;
        if (timeInterpolator == null) {
            timeInterpolator = C1311.f7289;
        }
        sb.append(timeInterpolator.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f6634);
        sb.append(" repeatMode: ");
        sb.append(this.f6631);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7543(Animator animator) {
        animator.setStartDelay(this.f6630);
        animator.setDuration(this.f6632);
        TimeInterpolator timeInterpolator = this.f6633;
        if (timeInterpolator == null) {
            timeInterpolator = C1311.f7289;
        }
        animator.setInterpolator(timeInterpolator);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f6634);
            valueAnimator.setRepeatMode(this.f6631);
        }
    }

    public final int hashCode() {
        long j = this.f6630;
        long j2 = this.f6632;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        TimeInterpolator timeInterpolator = this.f6633;
        if (timeInterpolator == null) {
            timeInterpolator = C1311.f7289;
        }
        return ((((i + timeInterpolator.getClass().hashCode()) * 31) + this.f6634) * 31) + this.f6631;
    }
}
