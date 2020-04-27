package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ms  reason: case insensitive filesystem */
public class C3606ms extends LinearLayout implements View.OnClickListener {

    /* renamed from: ı  reason: contains not printable characters */
    private int f3318;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public List<C2311<FloatingActionButton, View.OnClickListener>> f3319;

    /* renamed from: ɩ  reason: contains not printable characters */
    private LayoutInflater f3320;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f3321;

    /* renamed from: Ι  reason: contains not printable characters */
    private FloatingActionButton f3322;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f3323;

    /* renamed from: І  reason: contains not printable characters */
    private Cif f3324 = new Cif() {
        public final void onAnimationEnd(Animation animation) {
            for (C2311 r0 : C3606ms.this.f3319) {
                ((FloatingActionButton) r0.f10733).setVisibility(8);
            }
        }
    };

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f3325;

    public C3606ms(Context context) {
        super(context);
        m3922(context);
    }

    public C3606ms(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3922(context);
    }

    public C3606ms(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3922(context);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m3922(Context context) {
        inflate(context, R.layout.f168932131558435, this);
        if (!isInEditMode()) {
            setOrientation(1);
            setOnClickListener(this);
            this.f3322 = (FloatingActionButton) findViewById(R.id.f165272131362060);
            this.f3320 = LayoutInflater.from(context);
            this.f3319 = new ArrayList();
            getResources();
            this.f3318 = 150;
            this.f3321 = 45;
            getResources();
            this.f3325 = 50;
        }
    }

    public void onClick(View view) {
        if (this.f3319.size() == 1) {
            C2311 r8 = this.f3319.get(0);
            ((View.OnClickListener) r8.f10734).onClick((View) r8.f10733);
            return;
        }
        this.f3323 = !this.f3323;
        long j = 0;
        if (this.f3323) {
            for (C2311 next : this.f3319) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f147712130771981);
                loadAnimation.setRepeatMode(2);
                loadAnimation.setStartOffset(j);
                ((FloatingActionButton) next.f10733).setVisibility(0);
                ((FloatingActionButton) next.f10733).startAnimation(loadAnimation);
                j += (long) this.f3325;
            }
        } else {
            Animation animation = null;
            int size = this.f3319.size() - 1;
            while (size >= 0) {
                final C2311 r82 = this.f3319.get(size);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.f147702130771980);
                loadAnimation2.setRepeatMode(2);
                loadAnimation2.setStartOffset(j);
                loadAnimation2.setAnimationListener(new Cif() {
                    public final void onAnimationEnd(Animation animation) {
                        ((FloatingActionButton) C2311.this.f10733).setVisibility(4);
                    }
                });
                ((FloatingActionButton) r82.f10733).startAnimation(loadAnimation2);
                j += (long) this.f3325;
                size--;
                animation = loadAnimation2;
            }
            if (animation != null) {
                animation.setAnimationListener(this.f3324);
            }
        }
        C0293.m4169(this.f3322).m4534(this.f3323 ? (float) this.f3321 : 0.0f).m4531((long) this.f3318).m4536();
        if (this.f3323) {
            this.f3322.setContentDescription(getResources().getString(R.string.f170392131886123));
        } else {
            this.f3322.setContentDescription(getResources().getString(R.string.f170402131886124));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3923(int i, int i2, int i3, View.OnClickListener onClickListener) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.f3320.inflate(R.layout.f168942131558436, this, false);
        floatingActionButton.setOnClickListener(onClickListener);
        Context context = getContext();
        Drawable r3 = C1266.m8158(C0651.m5458(context, i));
        C1266.m8148(r3, C0651.m5450(context, R.color.f156022131099680));
        floatingActionButton.setImageDrawable(r3);
        floatingActionButton.setId(i2);
        floatingActionButton.setContentDescription(getResources().getString(i3));
        this.f3319.add(C2311.m12057(floatingActionButton, onClickListener));
        if (this.f3319.size() == 1) {
            FloatingActionButton floatingActionButton2 = this.f3322;
            Context context2 = getContext();
            Drawable r6 = C1266.m8158(C0651.m5458(context2, i));
            C1266.m8148(r6, C0651.m5450(context2, R.color.f156002131099678));
            floatingActionButton2.setImageDrawable(r6);
            this.f3322.setContentDescription(getResources().getString(i3));
        } else if (this.f3319.size() == 2) {
            addView((View) this.f3319.get(0).f10733, 0);
            addView(floatingActionButton, 0);
            FloatingActionButton floatingActionButton3 = this.f3322;
            Context context3 = getContext();
            Drawable r8 = C1266.m8158(C0651.m5458(context3, 2131230820));
            C1266.m8148(r8, C0651.m5450(context3, R.color.f156002131099678));
            floatingActionButton3.setImageDrawable(r8);
            this.f3322.setContentDescription(getResources().getString(R.string.f170402131886124));
        } else {
            addView(floatingActionButton, 0);
        }
        setVisibility(0);
    }

    /* renamed from: o.ms$if  reason: invalid class name */
    abstract class Cif implements Animation.AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        /* synthetic */ Cif() {
            this((byte) 0);
        }

        private Cif(byte b) {
        }
    }
}
