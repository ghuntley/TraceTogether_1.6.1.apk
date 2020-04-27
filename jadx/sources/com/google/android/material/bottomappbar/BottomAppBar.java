package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.C0293;
import o.C0344;
import o.C0501;
import o.C0671;
import o.C0785;
import o.C0858;
import o.C1122;
import o.C1219;
import o.C1266;
import o.C1400;
import o.C1408;
import o.C2026;
import o.C2118;
import o.C2610;
import o.C2652;
import o.C2745;
import o.C3160;
import o.C3198;
import o.R;

public final class BottomAppBar extends C2026 implements CoordinatorLayout.Cif {

    /* renamed from: ŀ  reason: contains not printable characters */
    final int f667;

    /* renamed from: ł  reason: contains not printable characters */
    Animator f668;

    /* renamed from: ſ  reason: contains not printable characters */
    final boolean f669;

    /* renamed from: Ɨ  reason: contains not printable characters */
    int f670;

    /* renamed from: ƚ  reason: contains not printable characters */
    final boolean f671;

    /* renamed from: ǀ  reason: contains not printable characters */
    int f672;

    /* renamed from: ɍ  reason: contains not printable characters */
    boolean f673;

    /* renamed from: ɔ  reason: contains not printable characters */
    int f674;

    /* renamed from: ɟ  reason: contains not printable characters */
    int f675;

    /* renamed from: ɺ  reason: contains not printable characters */
    boolean f676;

    /* renamed from: ɼ  reason: contains not printable characters */
    AnimatorListenerAdapter f677;

    /* renamed from: ɿ  reason: contains not printable characters */
    final C0671 f678;

    /* renamed from: ʅ  reason: contains not printable characters */
    final boolean f679;

    /* renamed from: ʟ  reason: contains not printable characters */
    int f680;

    /* renamed from: ϳ  reason: contains not printable characters */
    C1122<FloatingActionButton> f681;

    /* renamed from: Ј  reason: contains not printable characters */
    private Behavior f682;

    /* renamed from: г  reason: contains not printable characters */
    Animator f683;

    /* renamed from: с  reason: contains not printable characters */
    private int f684;

    public final void setSubtitle(CharSequence charSequence) {
    }

    public final void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f148942130968671);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f175022131952235), attributeSet, i);
        this.f678 = new C0671();
        this.f670 = 0;
        this.f676 = true;
        this.f677 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m888(bottomAppBar.f680, BottomAppBar.this.f676);
            }
        };
        this.f681 = new C1122<FloatingActionButton>() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final /* synthetic */ void m896(View view) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                float translationX = floatingActionButton.getTranslationX();
                if (((C1408) BottomAppBar.this.f678.f4785.f4796.f5223).f7705 != translationX) {
                    ((C1408) BottomAppBar.this.f678.f4785.f4796.f5223).f7705 = translationX;
                    BottomAppBar.this.f678.invalidateSelf();
                }
                float f = -floatingActionButton.getTranslationY();
                if (((C1408) BottomAppBar.this.f678.f4785.f4796.f5223).f7702 != f) {
                    ((C1408) BottomAppBar.this.f678.f4785.f4796.f5223).f7702 = f;
                    BottomAppBar.this.f678.invalidateSelf();
                }
                C0671 r0 = BottomAppBar.this.f678;
                float scaleY = floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f;
                if (r0.f4785.f4807 != scaleY) {
                    r0.f4785.f4807 = scaleY;
                    r0.f4787 = true;
                    r0.invalidateSelf();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final /* synthetic */ void m897(View view) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                C0671 r0 = BottomAppBar.this.f678;
                float scaleY = floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f;
                if (r0.f4785.f4807 != scaleY) {
                    r0.f4785.f4807 = scaleY;
                    r0.f4787 = true;
                    r0.invalidateSelf();
                }
            }
        };
        Context context2 = getContext();
        int[] iArr = C0858.Aux.f5585;
        C3160.m15978(context2, attributeSet, i, R.style.f175022131952235);
        C3160.m15976(context2, attributeSet, iArr, i, R.style.f175022131952235, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175022131952235);
        ColorStateList r4 = C0344.m4473(context2, obtainStyledAttributes, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f680 = obtainStyledAttributes.getInt(2, 0);
        this.f684 = obtainStyledAttributes.getInt(3, 0);
        this.f673 = obtainStyledAttributes.getBoolean(7, false);
        this.f679 = obtainStyledAttributes.getBoolean(8, false);
        this.f671 = obtainStyledAttributes.getBoolean(9, false);
        this.f669 = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        this.f667 = getResources().getDimensionPixelOffset(R.dimen.f158502131165367);
        C1408 r3 = new C1408((float) obtainStyledAttributes.getDimensionPixelOffset(4, 0), (float) obtainStyledAttributes.getDimensionPixelOffset(5, 0), (float) obtainStyledAttributes.getDimensionPixelOffset(6, 0));
        C0785.If ifR = new C0785.If();
        ifR.f5237 = r3;
        this.f678.setShapeAppearanceModel(new C0785(ifR, (byte) 0));
        this.f678.m5529();
        C0671 r32 = this.f678;
        r32.f4785.f4809 = Paint.Style.FILL;
        r32.m5524();
        C0671 r33 = this.f678;
        r33.f4785.f4812 = new C2610(context2);
        r33.m5521();
        setElevation((float) dimensionPixelSize);
        C1266.m8152((Drawable) this.f678, r4);
        C0293.m4199((View) this, (Drawable) this.f678);
        AnonymousClass5 r2 = new C3198.Cif() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final C0501 m898(View view, C0501 r5, C3198.C3199 r6) {
                boolean z;
                if (BottomAppBar.this.f679) {
                    BottomAppBar.this.f674 = r5.m4890();
                }
                boolean z2 = false;
                if (BottomAppBar.this.f671) {
                    z = BottomAppBar.this.f672 != r5.m4895();
                    BottomAppBar.this.f672 = r5.m4895();
                } else {
                    z = false;
                }
                if (BottomAppBar.this.f669) {
                    if (BottomAppBar.this.f675 != r5.m4894()) {
                        z2 = true;
                    }
                    BottomAppBar.this.f675 = r5.m4894();
                }
                if (z || z2) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    if (bottomAppBar.f683 != null) {
                        bottomAppBar.f683.cancel();
                    }
                    if (bottomAppBar.f668 != null) {
                        bottomAppBar.f668.cancel();
                    }
                    BottomAppBar.this.m893();
                    BottomAppBar.this.m892();
                }
                return r5;
            }
        };
        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, C0858.Aux.f5601, i, R.style.f175022131952235);
        boolean z = obtainStyledAttributes2.getBoolean(0, false);
        boolean z2 = obtainStyledAttributes2.getBoolean(1, false);
        boolean z3 = obtainStyledAttributes2.getBoolean(2, false);
        obtainStyledAttributes2.recycle();
        C3198.m16134((View) this, (C3198.Cif) new C3198.Cif(z, z2, z3, r2) {

            /* renamed from: ı  reason: contains not printable characters */
            private /* synthetic */ Cif f14533;

            /* renamed from: ǃ  reason: contains not printable characters */
            private /* synthetic */ boolean f14534;

            /* renamed from: Ι  reason: contains not printable characters */
            private /* synthetic */ boolean f14535;

            /* renamed from: ι  reason: contains not printable characters */
            private /* synthetic */ boolean f14536;

            {
                this.f14535 = r1;
                this.f14534 = r2;
                this.f14536 = r3;
                this.f14533 = r4;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final C0501 m16138(View view, C0501 r6, C3199 r7) {
                if (this.f14535) {
                    r7.f14541 += r6.m4890();
                }
                boolean z = true;
                if (C0293.m4156(view) != 1) {
                    z = false;
                }
                if (this.f14534) {
                    if (z) {
                        r7.f14542 += r6.m4895();
                    } else {
                        r7.f14540 += r6.m4895();
                    }
                }
                if (this.f14536) {
                    if (z) {
                        r7.f14540 += r6.m4894();
                    } else {
                        r7.f14542 += r6.m4894();
                    }
                }
                C0293.m4178(view, r7.f14540, r7.f14539, r7.f14542, r7.f14541);
                Cif ifVar = this.f14533;
                return ifVar != null ? ifVar.m16140(view, r6, r7) : r6;
            }
        });
    }

    public final void setFabAnimationMode(int i) {
        this.f684 = i;
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        C1266.m8152((Drawable) this.f678, colorStateList);
    }

    public final void setHideOnScroll(boolean z) {
        this.f673 = z;
    }

    public final void setElevation(float f) {
        C0671 r0 = this.f678;
        if (r0.f4785.f4803 != f) {
            r0.f4785.f4803 = f;
            r0.m5521();
        }
        int i = this.f678.f4785.f4798;
        C0671 r02 = this.f678;
        int cos = i - ((int) (((double) r02.f4785.f4814) * Math.cos(Math.toRadians((double) r02.f4785.f4810))));
        if (this.f682 == null) {
            this.f682 = new Behavior();
        }
        Behavior behavior = this.f682;
        behavior.f649 = cos;
        if (behavior.f647 == 1) {
            setTranslationY((float) (behavior.f648 + behavior.f649));
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private FloatingActionButton m886() {
        View r0 = m891();
        if (r0 instanceof FloatingActionButton) {
            return (FloatingActionButton) r0;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: І  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View m891() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m151(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m891():android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m888(int i, boolean z) {
        if (C0293.m4186(this)) {
            Animator animator = this.f683;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m882()) {
                i = 0;
                z = false;
            }
            m884(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f683 = animatorSet;
            this.f683.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    BottomAppBar.this.f670++;
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.f670--;
                    BottomAppBar.this.f683 = null;
                }
            });
            this.f683.start();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m884(final int i, final boolean z, List<Animator> list) {
        final C2118 r0 = m885();
        if (r0 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r0, "alpha", new float[]{1.0f});
            if (Math.abs(r0.getTranslationX() - ((float) m890(r0, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r0, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: ι  reason: contains not printable characters */
                    private boolean f692;

                    public final void onAnimationCancel(Animator animator) {
                        this.f692 = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (!this.f692) {
                            BottomAppBar bottomAppBar = BottomAppBar.this;
                            C2118 r0 = r0;
                            r0.setTranslationX((float) bottomAppBar.m890(r0, i, z));
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (r0.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private C2118 m885() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C2118) {
                return (C2118) childAt;
            }
        }
        return null;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f683;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f668;
            if (animator2 != null) {
                animator2.cancel();
            }
            m893();
        }
        m892();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final void m892() {
        C2118 r0 = m885();
        if (r0 != null) {
            r0.setAlpha(1.0f);
            if (!m882()) {
                r0.setTranslationX((float) m890(r0, 0, false));
            } else {
                r0.setTranslationX((float) m890(r0, this.f680, this.f676));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14514((View) this, this.f678);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: Ɩ  reason: contains not printable characters */
        WeakReference<BottomAppBar> f699;

        /* renamed from: ǃ  reason: contains not printable characters */
        final Rect f700 = new Rect();

        /* renamed from: ɹ  reason: contains not printable characters */
        int f701;

        /* renamed from: І  reason: contains not printable characters */
        private final View.OnLayoutChangeListener f702 = new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f699.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Rect rect = Behavior.this.f700;
                rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                floatingActionButton.m991(rect);
                int height = Behavior.this.f700.height();
                float f = (float) height;
                if (f != ((C1408) bottomAppBar.f678.f4785.f4796.f5223).f7706) {
                    ((C1408) bottomAppBar.f678.f4785.f4796.f5223).f7706 = f;
                    bottomAppBar.f678.invalidateSelf();
                }
                CoordinatorLayout.C0016 r1 = (CoordinatorLayout.C0016) view.getLayoutParams();
                if (Behavior.this.f701 == 0) {
                    r1.bottomMargin = bottomAppBar.f674 + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.f158512131165368) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    r1.leftMargin = bottomAppBar.f672;
                    r1.rightMargin = bottomAppBar.f675;
                    boolean z = true;
                    if (C0293.m4156(floatingActionButton) != 1) {
                        z = false;
                    }
                    if (z) {
                        r1.leftMargin += bottomAppBar.f667;
                    } else {
                        r1.rightMargin += bottomAppBar.f667;
                    }
                }
            }
        };

        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.f673 && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f699 = new WeakReference<>(bottomAppBar);
            View r0 = bottomAppBar.m891();
            if (r0 != null && !C0293.m4186(r0)) {
                CoordinatorLayout.C0016 r1 = (CoordinatorLayout.C0016) r0.getLayoutParams();
                r1.f173 = 49;
                this.f701 = r1.bottomMargin;
                if (r0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) r0;
                    floatingActionButton.addOnLayoutChangeListener(this.f702);
                    AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.f677;
                    if (floatingActionButton.f859 == null) {
                        floatingActionButton.f859 = floatingActionButton.m997();
                    }
                    C2652 r2 = floatingActionButton.f859;
                    if (r2.f12155 == null) {
                        r2.f12155 = new ArrayList<>();
                    }
                    r2.f12155.add(animatorListenerAdapter);
                    AnonymousClass7 r12 = new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            BottomAppBar.this.f677.onAnimationStart(animator);
                            View r3 = BottomAppBar.this.m891();
                            FloatingActionButton floatingActionButton = r3 instanceof FloatingActionButton ? (FloatingActionButton) r3 : null;
                            if (floatingActionButton != null) {
                                BottomAppBar bottomAppBar = BottomAppBar.this;
                                floatingActionButton.setTranslationX(bottomAppBar.m887(bottomAppBar.f680));
                            }
                        }
                    };
                    if (floatingActionButton.f859 == null) {
                        floatingActionButton.f859 = floatingActionButton.m997();
                    }
                    C2652 r22 = floatingActionButton.f859;
                    if (r22.f12171 == null) {
                        r22.f12171 = new ArrayList<>();
                    }
                    r22.f12171.add(r12);
                    C1122<FloatingActionButton> r13 = bottomAppBar.f681;
                    if (floatingActionButton.f859 == null) {
                        floatingActionButton.f859 = floatingActionButton.m997();
                    }
                    C2652 r23 = floatingActionButton.f859;
                    FloatingActionButton.C0072 r3 = new FloatingActionButton.C0072(r13);
                    if (r23.f12160 == null) {
                        r23.f12160 = new ArrayList<>();
                    }
                    r23.f12160.add(r3);
                }
                bottomAppBar.m893();
            }
            coordinatorLayout.m142(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }
    }

    public final Parcelable onSaveInstanceState() {
        C0063 r1 = new C0063(super.onSaveInstanceState());
        r1.f705 = this.f680;
        r1.f704 = this.f676;
        return r1;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0063)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0063 r2 = (C0063) parcelable;
        super.onRestoreInstanceState(r2.f6905);
        this.f680 = r2.f705;
        this.f676 = r2.f704;
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$ɩ  reason: contains not printable characters */
    static class C0063 extends C1219 {
        public static final Parcelable.Creator<C0063> CREATOR = new Parcelable.ClassLoaderCreator<C0063>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0063(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0063[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0063(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        boolean f704;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f705;

        public C0063(Parcelable parcelable) {
            super(parcelable);
        }

        public C0063(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f705 = parcel.readInt();
            this.f704 = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f705);
            parcel.writeInt(this.f704 ? 1 : 0);
        }
    }

    public final void setFabAlignmentMode(final int i) {
        if (this.f680 != i && C0293.m4186(this)) {
            Animator animator = this.f668;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f684 == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m886(), "translationX", new float[]{m887(i)});
                ofFloat.setDuration(300);
                arrayList.add(ofFloat);
            } else {
                FloatingActionButton r1 = m886();
                if (r1 != null) {
                    if (r1.f859 == null) {
                        r1.f859 = r1.m997();
                    }
                    if (!r1.f859.m14039()) {
                        this.f670++;
                        r1.m993(new FloatingActionButton.Cif() {
                            /* renamed from: ɩ  reason: contains not printable characters */
                            public final void m894(FloatingActionButton floatingActionButton) {
                                floatingActionButton.setTranslationX(BottomAppBar.this.m887(i));
                                AnonymousClass1 r0 = new FloatingActionButton.Cif() {
                                    /* renamed from: ι  reason: contains not printable characters */
                                    public final void m895() {
                                        BottomAppBar bottomAppBar = BottomAppBar.this;
                                        bottomAppBar.f670--;
                                    }
                                };
                                if (floatingActionButton.f859 == null) {
                                    floatingActionButton.f859 = floatingActionButton.m997();
                                }
                                floatingActionButton.f859.m14028(new C2652.C2653(r0) {
                                    /* renamed from: ǃ  reason: contains not printable characters */
                                    public final void m999() {
                                        r3.m1011();
                                    }

                                    /* renamed from: ι  reason: contains not printable characters */
                                    public final void m1000() {
                                        r3.m1010(FloatingActionButton.this);
                                    }
                                }, true);
                            }
                        }, true);
                    }
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f668 = animatorSet;
            this.f668.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    BottomAppBar.this.f670++;
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.f670--;
                }
            });
            this.f668.start();
        }
        m888(i, this.f676);
        this.f680 = i;
    }

    public final void setFabCradleMargin(float f) {
        if (f != ((C1408) this.f678.f4785.f4796.f5223).f7704) {
            ((C1408) this.f678.f4785.f4796.f5223).f7704 = f;
            this.f678.invalidateSelf();
        }
    }

    public final void setFabCradleRoundedCornerRadius(float f) {
        if (f != ((C1408) this.f678.f4785.f4796.f5223).f7703) {
            ((C1408) this.f678.f4785.f4796.f5223).f7703 = f;
            this.f678.invalidateSelf();
        }
    }

    public final void setCradleVerticalOffset(float f) {
        if (f != ((C1408) this.f678.f4785.f4796.f5223).f7702) {
            ((C1408) this.f678.f4785.f4796.f5223).f7702 = f;
            this.f678.invalidateSelf();
            m893();
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean m882() {
        View r0 = m891();
        FloatingActionButton floatingActionButton = r0 instanceof FloatingActionButton ? (FloatingActionButton) r0 : null;
        if (floatingActionButton == null) {
            return false;
        }
        if (floatingActionButton.f859 == null) {
            floatingActionButton.f859 = floatingActionButton.m997();
        }
        return floatingActionButton.f859.m14047();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final float m887(int i) {
        int i2 = 1;
        boolean z = C0293.m4156(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f667 + (z ? this.f672 : this.f675));
        if (z) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m890(C2118 r7, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean z2 = C0293.m4156(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C2026.C2028) && (((C2026.C2028) childAt.getLayoutParams()).f1551 & 8388615) == 8388611) {
                if (z2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((z2 ? r7.getRight() : r7.getLeft()) + (z2 ? this.f675 : -this.f672));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m893() {
        ((C1408) this.f678.f4785.f4796.f5223).f7705 = m887(this.f680);
        View r0 = m891();
        C0671 r1 = this.f678;
        float f = (!this.f676 || !m882()) ? 0.0f : 1.0f;
        if (r1.f4785.f4807 != f) {
            r1.f4785.f4807 = f;
            r1.f4787 = true;
            r1.invalidateSelf();
        }
        if (r0 != null) {
            r0.setTranslationY(-((C1408) this.f678.f4785.f4796.f5223).f7702);
            r0.setTranslationX(m887(this.f680));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ CoordinatorLayout.C3238If m889() {
        if (this.f682 == null) {
            this.f682 = new Behavior();
        }
        return this.f682;
    }
}
