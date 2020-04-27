package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;

/* renamed from: o.ͼı  reason: contains not printable characters */
public final class C1746 {

    /* renamed from: ı  reason: contains not printable characters */
    private float f9046;

    /* renamed from: ǃ  reason: contains not printable characters */
    public View f9047;

    /* renamed from: ɩ  reason: contains not printable characters */
    public AnimatorSet f9048;

    /* renamed from: Ι  reason: contains not printable characters */
    private float f9049;

    /* renamed from: ι  reason: contains not printable characters */
    public AnimatorSet f9050;

    protected C1746(final View view, int i, int i2, float f, float f2, int i3) {
        this.f9047 = view;
        this.f9046 = f;
        this.f9049 = f2;
        this.f9050 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
        this.f9050.setStartDelay((long) i3);
        this.f9050.setTarget(view);
        this.f9048 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i);
        this.f9048.setTarget(view);
        this.f9050.addListener(new AnimatorListenerAdapter() {

            /* renamed from: ι  reason: contains not printable characters */
            private boolean f9052;

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!this.f9052) {
                    view.setVisibility(4);
                }
                this.f9052 = false;
            }

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f9052 = true;
            }
        });
        m9814();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9814() {
        View view = this.f9047;
        view.setPivotX(this.f9046 * ((float) view.getMeasuredWidth()));
        View view2 = this.f9047;
        view2.setPivotY(this.f9049 * ((float) view2.getMeasuredHeight()));
    }

    /* renamed from: o.ͼı$if  reason: invalid class name */
    public static abstract class Cif<T extends C1746> {

        /* renamed from: ı  reason: contains not printable characters */
        protected int f9053 = R.animator.f147972130837508;

        /* renamed from: ǃ  reason: contains not printable characters */
        protected final View f9054;

        /* renamed from: ɩ  reason: contains not printable characters */
        protected int f9055 = R.animator.f147982130837509;

        /* renamed from: Ι  reason: contains not printable characters */
        protected int f9056 = 1000;

        /* renamed from: ι  reason: contains not printable characters */
        protected float f9057 = 0.5f;

        /* renamed from: Ӏ  reason: contains not printable characters */
        protected float f9058 = 0.5f;

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract T m9816();

        public Cif(View view) {
            this.f9054 = view;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final Cif<T> m9817() {
            this.f9057 = 1.0f;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Cif<T> m9815() {
            this.f9058 = 1.0f;
            return this;
        }
    }

    /* renamed from: o.ͼı$ı  reason: contains not printable characters */
    public static class C1747 extends Cif<C1746> {
        public C1747(View view) {
            super(view);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1746 m9818() {
            return new C1746(this.f9054, this.f9055, this.f9053, this.f9057, this.f9058, this.f9056);
        }
    }
}
