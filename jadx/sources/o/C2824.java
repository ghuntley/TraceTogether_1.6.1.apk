package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: o.Ӏϵ  reason: contains not printable characters */
public final class C2824 extends C2652 {
    /* access modifiers changed from: package-private */
    /* renamed from: ɨ  reason: contains not printable characters */
    public final void m14756() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14757() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public final boolean m14761() {
        return false;
    }

    public C2824(FloatingActionButton floatingActionButton, C0429 r2) {
        super(floatingActionButton, r2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m14751(ColorStateList colorStateList) {
        if (this.f12154 instanceof RippleDrawable) {
            ((RippleDrawable) this.f12154).setColor(C0410.m4695(colorStateList));
        } else {
            super.m14026(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14755(float f, float f2, float f3) {
        boolean z = true;
        if (Build.VERSION.SDK_INT == 21) {
            this.f12167.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f12147, m14750(f, f3));
            stateListAnimator.addState(f12152, m14750(f, f2));
            stateListAnimator.addState(f12148, m14750(f, f2));
            stateListAnimator.addState(f12149, m14750(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f12167, "elevation", new float[]{f}).setDuration(0));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f12167, View.TRANSLATION_Z, new float[]{this.f12167.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f12167, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f12153);
            stateListAnimator.addState(f12150, animatorSet);
            stateListAnimator.addState(f12151, m14750(0.0f, 0.0f));
            this.f12167.setStateListAnimator(stateListAnimator);
        }
        if (!this.f12168.m4729() && m14034()) {
            z = false;
        }
        if (z) {
            m14045();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Animator m14750(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f12167, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f12167, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(f12153);
        return animatorSet;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final float m14759() {
        return this.f12167.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m14762() {
        m14045();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m14758() {
        return this.f12168.m4729() || !m14034();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m14753(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f12167.isEnabled()) {
            this.f12167.setElevation(this.f12166);
            if (this.f12167.isPressed()) {
                this.f12167.setTranslationZ(this.f12164);
            } else if (this.f12167.isFocused() || this.f12167.isHovered()) {
                this.f12167.setTranslationZ(this.f12183);
            } else {
                this.f12167.setTranslationZ(0.0f);
            }
        } else {
            this.f12167.setElevation(0.0f);
            this.f12167.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C0671 m14754() {
        C0785 r0 = this.f12173;
        if (r0 != null) {
            return new C2825(r0);
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m14760(Rect rect) {
        if (this.f12168.m4729()) {
            super.m14042(rect);
        } else if (!m14034()) {
            int i = this.f12162;
            FloatingActionButton floatingActionButton = this.f12167;
            int r0 = (i - floatingActionButton.m992(floatingActionButton.f857)) / 2;
            rect.set(r0, r0, r0, r0);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: o.Ӏϵ$ǃ  reason: contains not printable characters */
    static class C2825 extends C0671 {
        public final boolean isStateful() {
            return true;
        }

        C2825(C0785 r1) {
            super(r1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m14752(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C0785 r0 = this.f12173;
        if (r0 != null) {
            this.f12163 = new C2825(r0);
            this.f12163.setTintList(colorStateList);
            if (mode != null) {
                this.f12163.setTintMode(mode);
            }
            C0671 r8 = this.f12163;
            Context context = this.f12167.getContext();
            r8.f4785.f4812 = new C2610(context);
            r8.m5521();
            if (i > 0) {
                Context context2 = this.f12167.getContext();
                C0785 r2 = this.f12173;
                if (r2 != null) {
                    C2737 r1 = new C2737(r2);
                    int r22 = C0651.m5450(context2, R.color.f156322131099749);
                    int r3 = C0651.m5450(context2, R.color.f156312131099748);
                    int r4 = C0651.m5450(context2, R.color.f156292131099746);
                    int r02 = C0651.m5450(context2, R.color.f156302131099747);
                    r1.f12737 = r22;
                    r1.f12740 = r3;
                    r1.f12744 = r4;
                    r1.f12742 = r02;
                    float f = (float) i;
                    if (r1.f12745 != f) {
                        r1.f12745 = f;
                        r1.f12734.setStrokeWidth(f * 1.3333f);
                        r1.f12747 = true;
                        r1.invalidateSelf();
                    }
                    r1.m14483(colorStateList);
                    this.f12158 = r1;
                    Drawable[] drawableArr = new Drawable[2];
                    C2737 r12 = this.f12158;
                    if (r12 != null) {
                        drawableArr[0] = r12;
                        C0671 r03 = this.f12163;
                        if (r03 != null) {
                            drawableArr[1] = r03;
                            drawable = new LayerDrawable(drawableArr);
                        } else {
                            throw new NullPointerException();
                        }
                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    throw new NullPointerException();
                }
            } else {
                this.f12158 = null;
                drawable = this.f12163;
            }
            this.f12154 = new RippleDrawable(C0410.m4695(colorStateList2), drawable, (Drawable) null);
            this.f12157 = this.f12154;
            return;
        }
        throw new NullPointerException();
    }
}
