package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class mN extends FrameLayout implements View.OnClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    private View f3115;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f3116;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f3117;

    /* renamed from: Ι  reason: contains not printable characters */
    private View f3118;

    /* renamed from: ι  reason: contains not printable characters */
    private If f3119;

    interface If {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m3761();
    }

    public mN(Context context) {
        super(context);
        m3757();
    }

    public mN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3757();
    }

    public mN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3757();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m3757() {
        setClickable(true);
        setFocusable(true);
        setOnClickListener(this);
        this.f3115 = m3759(mM.m3752(getContext(), R.attr.f150312130968815));
        addView(this.f3115);
    }

    public void setContentDescriptionStrings(String str, String str2) {
        this.f3117 = str;
        this.f3116 = str2;
        if (isSelected()) {
            setContentDescription(this.f3117);
        } else {
            setContentDescription(this.f3116);
        }
    }

    public void onClick(View view) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z = true;
        boolean z2 = !isSelected();
        If ifR = this.f3119;
        if (ifR != null) {
            z = ifR.m3761();
        }
        if (z) {
            setSelected(z2);
            if (z2) {
                valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.9f});
                valueAnimator2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f});
            } else {
                valueAnimator = ValueAnimator.ofFloat(new float[]{0.9f, 1.0f});
                valueAnimator2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
            }
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    mN.m3756(mN.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    mN.this.m3755().setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            valueAnimator2.setDuration(75);
            valueAnimator.setDuration(75);
            valueAnimator.start();
            valueAnimator2.start();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            m3755().setScaleX(0.9f);
            m3755().setScaleY(0.9f);
            m3755().setAlpha(0.8f);
            m3758(true);
            setContentDescription(this.f3117);
            return;
        }
        m3755().setScaleX(1.0f);
        m3755().setScaleY(1.0f);
        m3755().setAlpha(1.0f);
        m3758(false);
        setContentDescription(this.f3116);
    }

    public void setSelectionListener(If ifR) {
        this.f3119 = ifR;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private ImageView m3759(int i) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.f164742131361961);
        imageView.setImageDrawable(C0651.m5458(getContext(), 2131230824));
        C0293.m4199((View) imageView, C0651.m5458(getContext(), 2131230823));
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(8);
        Drawable r0 = C1266.m8158(imageView.getDrawable());
        if (r0 != null) {
            C1266.m8148(r0.mutate(), i);
        }
        imageView.invalidate();
        return imageView;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m3758(boolean z) {
        if (z) {
            this.f3115.setVisibility(0);
            this.f3115.bringToFront();
            C0293.m4163(this.f3115, C0293.m4188(this.f3118) + 1.0f);
            return;
        }
        this.f3115.setVisibility(8);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private View m3755() {
        View view = this.f3118;
        if (view != null) {
            return view;
        }
        if (getChildCount() == 2) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt.getId() != R.id.f164742131361961) {
                    this.f3118 = childAt;
                    break;
                }
                i++;
            }
            return this.f3118;
        }
        throw new RuntimeException("More then one child added to SelectableView");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ void m3756(mN mNVar, float f) {
        mNVar.m3755().setScaleX(f);
        mNVar.m3755().setScaleY(f);
    }
}
