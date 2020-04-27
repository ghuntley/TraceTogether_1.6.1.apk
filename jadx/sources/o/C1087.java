package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import o.C1336;

/* renamed from: o.ɍւ  reason: contains not printable characters */
final class C1087 extends C1097 implements TextWatcher, C1336.C1339, View.OnClickListener, ValueAnimator.AnimatorUpdateListener, View.OnFocusChangeListener {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1336.C1339 f6484 = this;

    /* renamed from: ǃ  reason: contains not printable characters */
    private ValueAnimator f6485;

    /* renamed from: ɩ  reason: contains not printable characters */
    private TextWatcher f6486 = this;

    /* renamed from: ι  reason: contains not printable characters */
    private AnimatorSet f6487;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    C1087(C1336 r1) {
        super(r1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m7452() {
        this.f6533.setEndIconDrawable(C3257Con.m1345(this.f6534, R.drawable.f163682131231182));
        this.f6533.setEndIconContentDescription(this.f6533.getResources().getText(R.string.f170592131886149));
        this.f6533.setEndIconOnClickListener(this);
        C1336 r0 = this.f6533;
        C1336.C1339 r1 = this.f6484;
        r0.f7370.add(r1);
        if (r0.f7418 != null) {
            r1.m8419(r0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C1311.f7291);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1087.this.f6535.setScaleX(floatValue);
                C1087.this.f6535.setScaleY(floatValue);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(C1311.f7290);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(this);
        this.f6487 = new AnimatorSet();
        this.f6487.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f6487.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                C1087.this.f6533.setEndIconVisible(true);
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(C1311.f7290);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(this);
        this.f6485 = ofFloat3;
        this.f6485.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C1087.this.f6533.setEndIconVisible(false);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7451(boolean z) {
        if (this.f6533.f7429 != null) {
            m7450(z);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m7450(boolean z) {
        C1336 r0 = this.f6533;
        boolean z2 = true;
        if ((r0.f7391.getVisibility() == 0 && r0.f7403.getVisibility() == 0) != z) {
            z2 = false;
        }
        if (z) {
            this.f6485.cancel();
            this.f6487.start();
            if (z2) {
                this.f6487.end();
                return;
            }
            return;
        }
        this.f6487.cancel();
        this.f6485.start();
        if (z2) {
            this.f6485.end();
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f6533.f7429 == null) {
            m7450(editable.length() > 0);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7453(C1336 r4) {
        EditText editText = r4.f7418;
        r4.setEndIconVisible(editText.getText().length() > 0);
        r4.setEndIconCheckable(false);
        editText.setOnFocusChangeListener(this);
        editText.removeTextChangedListener(this.f6486);
        editText.addTextChangedListener(this.f6486);
    }

    public final void onClick(View view) {
        this.f6533.f7418.setText((CharSequence) null);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6535.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void onFocusChange(View view, boolean z) {
        boolean z2 = true;
        if (!(!TextUtils.isEmpty(((EditText) view).getText())) || !z) {
            z2 = false;
        }
        m7450(z2);
    }
}
