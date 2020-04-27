package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import o.C0785;
import o.C1336;

/* renamed from: o.ɨʝ  reason: contains not printable characters */
final class C1216 extends C1097 implements TextWatcher, C1336.C1339, View.OnClickListener, View.OnFocusChangeListener, AutoCompleteTextView.OnDismissListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: І  reason: contains not printable characters */
    private static boolean f6887 = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: ı  reason: contains not printable characters */
    long f6888 = Long.MAX_VALUE;

    /* renamed from: ǃ  reason: contains not printable characters */
    ValueAnimator f6889;

    /* renamed from: ȷ  reason: contains not printable characters */
    private StateListDrawable f6890;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C0671 f6891;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f6892 = false;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C1336.C1338 f6893 = new C1336.C1338(this.f6533) {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7890(View view, C0520 r2) {
            super.m8418(view, r2);
            r2.m5022((CharSequence) Spinner.class.getName());
            if (r2.m5046()) {
                r2.m5039((CharSequence) null);
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7889(View view, AccessibilityEvent accessibilityEvent) {
            super.m12576(view, accessibilityEvent);
            EditText editText = C1216.this.f6533.f7418;
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (accessibilityEvent.getEventType() == 1 && C1216.this.f6895.isTouchExplorationEnabled()) {
                    C1216.m7883(C1216.this, autoCompleteTextView);
                    return;
                }
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    };

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C1336.C1339 f6894 = this;

    /* renamed from: Ι  reason: contains not printable characters */
    AccessibilityManager f6895;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f6896 = false;

    /* renamed from: Ӏ  reason: contains not printable characters */
    ValueAnimator f6897;

    /* renamed from: ӏ  reason: contains not printable characters */
    private TextWatcher f6898 = this;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m7885() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m7886(int i) {
        return i != 0;
    }

    C1216(C1336 r3) {
        super(r3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m7887() {
        float dimensionPixelOffset = (float) this.f6534.getResources().getDimensionPixelOffset(R.dimen.f159222131165487);
        float dimensionPixelOffset2 = (float) this.f6534.getResources().getDimensionPixelOffset(R.dimen.f159002131165445);
        int dimensionPixelOffset3 = this.f6534.getResources().getDimensionPixelOffset(R.dimen.f159012131165447);
        C0671 r3 = m7884(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C0671 r0 = m7884(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f6891 = r3;
        this.f6890 = new StateListDrawable();
        this.f6890.addState(new int[]{16842922}, r3);
        this.f6890.addState(new int[0], r0);
        this.f6533.setEndIconDrawable(C3257Con.m1345(this.f6534, f6887 ? R.drawable.f163652131231179 : R.drawable.f163662131231180));
        this.f6533.setEndIconContentDescription(this.f6533.getResources().getText(R.string.f170822131886179));
        this.f6533.setEndIconOnClickListener(this);
        C1336 r02 = this.f6533;
        C1336.C1339 r1 = this.f6894;
        r02.f7370.add(r1);
        if (r02.f7418 != null) {
            r1.m8419(r02);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(C1311.f7290);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(this);
        this.f6897 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(C1311.f7290);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(this);
        this.f6889 = ofFloat2;
        this.f6889.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C1216.this.f6535.setChecked(C1216.this.f6896);
                C1216.this.f6897.start();
            }
        });
        C0293.m4203((View) this.f6535, 2);
        this.f6895 = (AccessibilityManager) this.f6534.getSystemService("accessibility");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private C0671 m7884(float f, float f2, float f3, int i) {
        C0785.If ifR = new C0785.If();
        ifR.f5228 = new C0531(f);
        ifR.f5227 = new C0531(f);
        ifR.f5231 = new C0531(f2);
        ifR.f5235 = new C0531(f2);
        C0785 r3 = new C0785(ifR, (byte) 0);
        C0671 r4 = C0671.m5512(this.f6534, f3);
        r4.setShapeAppearanceModel(r3);
        r4.m5533(i, i);
        return r4;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m7883(C1216 r7, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            long currentTimeMillis = System.currentTimeMillis() - r7.f6888;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                r7.f6892 = false;
            }
            if (!r7.f6892) {
                if (f6887) {
                    boolean z = r7.f6896;
                    boolean z2 = !z;
                    if (z != z2) {
                        r7.f6896 = z2;
                        r7.f6897.cancel();
                        r7.f6889.start();
                    }
                } else {
                    r7.f6896 = !r7.f6896;
                    r7.f6535.toggle();
                }
                if (r7.f6896) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            r7.f6892 = false;
        }
    }

    public final void afterTextChanged(Editable editable) {
        EditText editText = this.f6533.f7418;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            autoCompleteTextView.post(new C1119(this, autoCompleteTextView));
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7888(C1336 r12) {
        LayerDrawable layerDrawable;
        EditText editText = r12.f7418;
        if (editText instanceof AutoCompleteTextView) {
            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (f6887) {
                int i = this.f6533.f7390;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.f6891);
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.f6890);
                }
            }
            if (autoCompleteTextView.getKeyListener() == null) {
                int i2 = this.f6533.f7390;
                C1336 r5 = this.f6533;
                if (r5.f7390 == 1 || r5.f7390 == 2) {
                    C0671 r52 = r5.f7443;
                    int r6 = C0328.m4398(autoCompleteTextView.getContext(), (int) R.attr.f150252130968805, autoCompleteTextView.getClass().getCanonicalName());
                    int[][] iArr = {new int[]{16842919}, new int[0]};
                    if (i2 == 2) {
                        int r1 = C0328.m4398(autoCompleteTextView.getContext(), (int) R.attr.f150352130968822, autoCompleteTextView.getClass().getCanonicalName());
                        C0671 r9 = new C0671(r52.f4785.f4796);
                        int r62 = C2724.m14457(r6, r1, 0.1f);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{r62, 0});
                        if (r9.f4785.f4804 != colorStateList) {
                            r9.f4785.f4804 = colorStateList;
                            r9.onStateChange(r9.getState());
                        }
                        if (f6887) {
                            r9.setTint(r1);
                            ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{r62, r1});
                            C0671 r63 = new C0671(r52.f4785.f4796);
                            r63.setTint(-1);
                            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList2, r9, r63), r52});
                        } else {
                            layerDrawable = new LayerDrawable(new Drawable[]{r9, r52});
                        }
                        C0293.m4199((View) autoCompleteTextView, (Drawable) layerDrawable);
                    } else if (i2 == 1) {
                        int i3 = this.f6533.f7413;
                        int[] iArr2 = {C2724.m14457(r6, i3, 0.1f), i3};
                        if (f6887) {
                            C0293.m4199((View) autoCompleteTextView, (Drawable) new RippleDrawable(new ColorStateList(iArr, iArr2), r52, r52));
                        } else {
                            C0671 r13 = new C0671(r52.f4785.f4796);
                            ColorStateList colorStateList3 = new ColorStateList(iArr, iArr2);
                            if (r13.f4785.f4804 != colorStateList3) {
                                r13.f4785.f4804 = colorStateList3;
                                r13.onStateChange(r13.getState());
                            }
                            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{r52, r13});
                            int r2 = C0293.m4184(autoCompleteTextView);
                            int paddingTop = autoCompleteTextView.getPaddingTop();
                            int r64 = C0293.m4173(autoCompleteTextView);
                            int paddingBottom = autoCompleteTextView.getPaddingBottom();
                            C0293.m4199((View) autoCompleteTextView, (Drawable) layerDrawable2);
                            C0293.m4178(autoCompleteTextView, r2, paddingTop, r64, paddingBottom);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z = true;
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - C1216.this.f6888;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z = false;
                        }
                        if (z) {
                            C1216.this.f6892 = false;
                        }
                        C1216.m7883(C1216.this, autoCompleteTextView);
                        view.performClick();
                    }
                    return false;
                }
            });
            autoCompleteTextView.setOnFocusChangeListener(this);
            if (f6887) {
                autoCompleteTextView.setOnDismissListener(this);
            }
            autoCompleteTextView.setThreshold(0);
            autoCompleteTextView.removeTextChangedListener(this.f6898);
            autoCompleteTextView.addTextChangedListener(this.f6898);
            r12.setErrorIconDrawable((Drawable) null);
            r12.setTextInputAccessibilityDelegate(this.f6893);
            r12.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void onClick(View view) {
        m7883(this, (AutoCompleteTextView) this.f6533.f7418);
    }

    public final void onFocusChange(View view, boolean z) {
        this.f6533.setEndIconActivated(z);
        if (!z) {
            if (this.f6896) {
                this.f6896 = false;
                this.f6897.cancel();
                this.f6889.start();
            }
            this.f6892 = false;
        }
    }

    public final void onDismiss() {
        this.f6892 = true;
        this.f6888 = System.currentTimeMillis();
        if (this.f6896) {
            this.f6896 = false;
            this.f6897.cancel();
            this.f6889.start();
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6535.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
