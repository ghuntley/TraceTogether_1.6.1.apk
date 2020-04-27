package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class mV extends FrameLayout implements View.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: ı  reason: contains not printable characters */
    C0248 f3173;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private AnimatorSet f3174;

    /* renamed from: ǃ  reason: contains not printable characters */
    TextWatcher f3175;

    /* renamed from: ɨ  reason: contains not printable characters */
    private AnimatorSet f3176;

    /* renamed from: ɩ  reason: contains not printable characters */
    mU f3177;

    /* renamed from: ɹ  reason: contains not printable characters */
    private AnimatorSet f3178;

    /* renamed from: ɾ  reason: contains not printable characters */
    private View.OnClickListener f3179;

    /* renamed from: Ι  reason: contains not printable characters */
    ImageView f3180;

    /* renamed from: ι  reason: contains not printable characters */
    EditText f3181;

    /* renamed from: І  reason: contains not printable characters */
    private AnimatorSet f3182;

    /* renamed from: і  reason: contains not printable characters */
    private AnimatorSet f3183;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private AnimatorSet f3184;

    /* renamed from: o.mV$ɩ  reason: contains not printable characters */
    public interface C0248 {
        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m3795();
    }

    public mV(Context context) {
        super(context);
        m3789(context);
    }

    public mV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3789(context);
    }

    public mV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3789(context);
    }

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            this.f3181.clearFocus();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return !isEnabled() || super.dispatchTouchEvent(motionEvent);
    }

    public final void setInputTextWatcher(TextWatcher textWatcher) {
        this.f3175 = textWatcher;
    }

    public final void setAttachmentsIndicatorClickListener(View.OnClickListener onClickListener) {
        this.f3179 = onClickListener;
        m3790(onClickListener != null);
    }

    public final void setInputTextConsumer(C0248 r1) {
        this.f3173 = r1;
    }

    public final void setAttachmentsCount(int i) {
        this.f3177.m3788(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m3789(Context context) {
        inflate(context, R.layout.f170032131558586, this);
        if (!isInEditMode()) {
            m3792();
            m3791();
            m3794();
            m3790(false);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m3792() {
        this.f3181 = (EditText) findViewById(R.id.f165562131362101);
        this.f3177 = (mU) findViewById(R.id.f165552131362100);
        this.f3180 = (ImageView) findViewById(R.id.f165572131362102);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m3791() {
        this.f3177.setOnClickListener(this);
        this.f3180.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (mV.this.f3173 != null) {
                    C0248 r3 = mV.this.f3173;
                    mV.this.f3181.getText();
                    if (r3.m3795()) {
                        mU mUVar = mV.this.f3177;
                        mUVar.f3172.setVisibility(4);
                        mUVar.m3788(0);
                        mUVar.f3167.setVisibility(4);
                        int i = mUVar.f3170;
                        Drawable drawable = mUVar.f3171.getDrawable();
                        ImageView imageView = mUVar.f3171;
                        if (drawable == null) {
                            F.m1358();
                        } else {
                            C1266.m8148(C1266.m8158(drawable).mutate(), i);
                            if (imageView != null) {
                                imageView.invalidate();
                            }
                        }
                        mV.this.f3181.setText((CharSequence) null);
                    }
                }
            }
        });
        this.f3181.addTextChangedListener(new mX() {
            public final void afterTextChanged(Editable editable) {
                int i;
                boolean r0 = P.m1406(editable.toString());
                boolean z = true;
                int i2 = 0;
                boolean z2 = mV.this.f3177.f3169 > 0;
                mV mVVar = mV.this;
                boolean z3 = r0 || z2;
                boolean z4 = r0 || z2;
                Context context = mVVar.getContext();
                if (z4) {
                    i = mY.m3796(context);
                } else {
                    i = C0651.m5450(context, R.color.f157542131099974);
                }
                ImageView imageView = mVVar.f3180;
                if (!z3 || !z4) {
                    z = false;
                }
                imageView.setEnabled(z);
                ImageView imageView2 = mVVar.f3180;
                if (!z3) {
                    i2 = 4;
                }
                imageView2.setVisibility(i2);
                Drawable drawable = mVVar.f3180.getDrawable();
                ImageView imageView3 = mVVar.f3180;
                if (drawable == null) {
                    F.m1358();
                } else {
                    C1266.m8148(C1266.m8158(drawable).mutate(), i);
                    if (imageView3 != null) {
                        imageView3.invalidate();
                    }
                }
                if (mV.this.f3175 != null) {
                    mV.this.f3175.afterTextChanged(editable);
                }
            }
        });
        this.f3181.setOnFocusChangeListener(this);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m3794() {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f160062131165657);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f160102131165661);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.f160112131165662);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.f160072131165658);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.f160122131165663);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.f160082131165659);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f160092131165660);
        this.f3183 = new AnimatorSet();
        this.f3174 = new AnimatorSet();
        this.f3178 = new AnimatorSet();
        this.f3184 = new AnimatorSet();
        C2000 r7 = new C2000();
        C1991 r8 = new C1991();
        this.f3183.setInterpolator(r7);
        this.f3174.setInterpolator(r7);
        this.f3178.setInterpolator(r8);
        this.f3184.setInterpolator(r8);
        this.f3183.play(na.m3975(this.f3181, dimensionPixelSize, dimensionPixelSize2)).with(na.m3974(this.f3181, dimensionPixelSize4, dimensionPixelSize3)).with(na.m3977(this.f3181, dimensionPixelSize6, dimensionPixelSize5)).with(na.m3976(this.f3181, 0, dimensionPixelOffset));
        this.f3178.play(na.m3974(this.f3181, dimensionPixelSize3, dimensionPixelSize4)).with(na.m3977(this.f3181, dimensionPixelSize5, dimensionPixelSize6)).with(na.m3975(this.f3181, dimensionPixelSize2, dimensionPixelSize)).with(na.m3976(this.f3181, dimensionPixelOffset, 0));
        this.f3174.play(na.m3975(this.f3181, dimensionPixelSize, dimensionPixelSize2)).with(na.m3974(this.f3181, dimensionPixelSize3, dimensionPixelSize3)).with(na.m3977(this.f3181, dimensionPixelSize6, dimensionPixelSize5)).with(na.m3976(this.f3181, 0, dimensionPixelOffset));
        this.f3184.play(na.m3974(this.f3181, dimensionPixelSize3, dimensionPixelSize3)).with(na.m3977(this.f3181, dimensionPixelSize5, dimensionPixelSize6)).with(na.m3975(this.f3181, dimensionPixelSize2, dimensionPixelSize)).with(na.m3976(this.f3181, dimensionPixelOffset, 0));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m3790(boolean z) {
        if (z) {
            this.f3182 = this.f3183;
            this.f3176 = this.f3178;
            this.f3177.setEnabled(true);
            m3793(true);
            this.f3177.setVisibility(0);
            return;
        }
        this.f3182 = this.f3174;
        this.f3176 = this.f3184;
        this.f3177.setEnabled(false);
        this.f3177.setVisibility(8);
        m3793(false);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m3793(boolean z) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f160112131165662);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f160072131165658);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3181.getLayoutParams();
        if (!z) {
            dimensionPixelSize2 = dimensionPixelSize;
        }
        layoutParams.leftMargin = dimensionPixelSize2;
        this.f3181.setLayoutParams(layoutParams);
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f3179;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f3182.start();
        } else {
            this.f3176.start();
        }
    }
}
