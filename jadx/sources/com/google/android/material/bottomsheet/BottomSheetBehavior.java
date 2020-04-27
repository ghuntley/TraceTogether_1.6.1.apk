package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.C0293;
import o.C0344;
import o.C0520;
import o.C0531;
import o.C0607;
import o.C0671;
import o.C0785;
import o.C0858;
import o.C1068;
import o.C1219;
import o.C2610;
import o.R;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C3238If<V> {

    /* renamed from: ı  reason: contains not printable characters */
    boolean f706 = true;

    /* renamed from: ŀ  reason: contains not printable characters */
    WeakReference<View> f707;

    /* renamed from: ł  reason: contains not printable characters */
    boolean f708;

    /* renamed from: ſ  reason: contains not printable characters */
    private C0785 f709;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f710;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private float f711;

    /* renamed from: ƚ  reason: contains not printable characters */
    private boolean f712;

    /* renamed from: ǀ  reason: contains not printable characters */
    private BottomSheetBehavior<V>.ɩ f713 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f714;

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean f715 = true;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f716;

    /* renamed from: ɔ  reason: contains not printable characters */
    private float f717 = 0.5f;

    /* renamed from: ɟ  reason: contains not printable characters */
    private ValueAnimator f718;

    /* renamed from: ɨ  reason: contains not printable characters */
    int f719;

    /* renamed from: ɩ  reason: contains not printable characters */
    C0671 f720;

    /* renamed from: ɪ  reason: contains not printable characters */
    public int f721 = 4;

    /* renamed from: ɹ  reason: contains not printable characters */
    public boolean f722;

    /* renamed from: ɺ  reason: contains not printable characters */
    private boolean f723;

    /* renamed from: ɼ  reason: contains not printable characters */
    private float f724 = -1.0f;

    /* renamed from: ɾ  reason: contains not printable characters */
    C1068 f725;

    /* renamed from: ɿ  reason: contains not printable characters */
    int f726;

    /* renamed from: ʅ  reason: contains not printable characters */
    private int f727;

    /* renamed from: ʟ  reason: contains not printable characters */
    private int f728 = 0;

    /* renamed from: ͻ  reason: contains not printable characters */
    private int f729;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f730;

    /* renamed from: ι  reason: contains not printable characters */
    public int f731;

    /* renamed from: ϲ  reason: contains not printable characters */
    private int f732;

    /* renamed from: ϳ  reason: contains not printable characters */
    private VelocityTracker f733;

    /* renamed from: І  reason: contains not printable characters */
    int f734;

    /* renamed from: Ј  reason: contains not printable characters */
    private int f735;

    /* renamed from: г  reason: contains not printable characters */
    public final ArrayList<C0064> f736 = new ArrayList<>();

    /* renamed from: с  reason: contains not printable characters */
    private boolean f737;

    /* renamed from: і  reason: contains not printable characters */
    boolean f738;

    /* renamed from: ј  reason: contains not printable characters */
    private final C1068.If f739 = new C1068.If() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m921(View view, int i) {
            if (BottomSheetBehavior.this.f721 == 1 || BottomSheetBehavior.this.f708) {
                return false;
            }
            if (BottomSheetBehavior.this.f721 == 3 && BottomSheetBehavior.this.f726 == i) {
                View view2 = BottomSheetBehavior.this.f707 != null ? BottomSheetBehavior.this.f707.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return BottomSheetBehavior.this.f742 != null && BottomSheetBehavior.this.f742.get() == view;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m918(View view, int i) {
            BottomSheetBehavior.this.m911();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m923(int i) {
            if (i == 1 && BottomSheetBehavior.this.f715) {
                BottomSheetBehavior.this.m910(1);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m920(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                if (BottomSheetBehavior.this.f706) {
                    i = BottomSheetBehavior.this.f734;
                } else if (view.getTop() > BottomSheetBehavior.this.f710) {
                    i = BottomSheetBehavior.this.f710;
                } else {
                    i = BottomSheetBehavior.this.f714;
                }
                BottomSheetBehavior.this.m913(view, i3, i, true);
            } else if (!BottomSheetBehavior.this.f738 || !BottomSheetBehavior.this.m915(view, f2)) {
                if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (BottomSheetBehavior.this.f706) {
                        if (Math.abs(top - BottomSheetBehavior.this.f734) < Math.abs(top - BottomSheetBehavior.this.f741)) {
                            i = BottomSheetBehavior.this.f734;
                            BottomSheetBehavior.this.m913(view, i3, i, true);
                        }
                        i2 = BottomSheetBehavior.this.f741;
                    } else if (top < BottomSheetBehavior.this.f710) {
                        if (top < Math.abs(top - BottomSheetBehavior.this.f741)) {
                            i = BottomSheetBehavior.this.f714;
                            BottomSheetBehavior.this.m913(view, i3, i, true);
                        }
                        i = BottomSheetBehavior.this.f710;
                    } else if (Math.abs(top - BottomSheetBehavior.this.f710) < Math.abs(top - BottomSheetBehavior.this.f741)) {
                        i = BottomSheetBehavior.this.f710;
                    } else {
                        i2 = BottomSheetBehavior.this.f741;
                    }
                } else {
                    if (!BottomSheetBehavior.this.f706) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f710) < Math.abs(top2 - BottomSheetBehavior.this.f741)) {
                            i = BottomSheetBehavior.this.f710;
                        }
                    }
                    i2 = BottomSheetBehavior.this.f741;
                }
                i3 = 4;
                BottomSheetBehavior.this.m913(view, i3, i, true);
            } else {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top3 = view.getTop();
                    int i4 = BottomSheetBehavior.this.f719;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (!(top3 > (i4 + (bottomSheetBehavior.f706 ? bottomSheetBehavior.f734 : bottomSheetBehavior.f714)) / 2)) {
                        if (BottomSheetBehavior.this.f706) {
                            i = BottomSheetBehavior.this.f734;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f714) < Math.abs(view.getTop() - BottomSheetBehavior.this.f710)) {
                            i = BottomSheetBehavior.this.f714;
                        } else {
                            i = BottomSheetBehavior.this.f710;
                        }
                        BottomSheetBehavior.this.m913(view, i3, i, true);
                    }
                }
                i = BottomSheetBehavior.this.f719;
                i3 = 5;
                BottomSheetBehavior.this.m913(view, i3, i, true);
            }
            i3 = 6;
            BottomSheetBehavior.this.m913(view, i3, i, true);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m917(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f706 ? bottomSheetBehavior.f734 : bottomSheetBehavior.f714;
            int i3 = BottomSheetBehavior.this.f738 ? BottomSheetBehavior.this.f719 : BottomSheetBehavior.this.f741;
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m919(View view, int i) {
            return view.getLeft();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m922() {
            if (BottomSheetBehavior.this.f738) {
                return BottomSheetBehavior.this.f719;
            }
            return BottomSheetBehavior.this.f741;
        }
    };

    /* renamed from: ґ  reason: contains not printable characters */
    private Map<View, Integer> f740;

    /* renamed from: Ӏ  reason: contains not printable characters */
    int f741;

    /* renamed from: ӏ  reason: contains not printable characters */
    WeakReference<V> f742;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$ǃ  reason: contains not printable characters */
    public static abstract class C0064 {
        /* renamed from: ı  reason: contains not printable characters */
        public abstract void m925(int i);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5577);
        this.f716 = obtainStyledAttributes.hasValue(10);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            m901(context, attributeSet, hasValue, C0344.m4473(context, obtainStyledAttributes, 1));
        } else {
            m901(context, attributeSet, hasValue, (ColorStateList) null);
        }
        this.f718 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f718.setDuration(500);
        this.f718.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.f720 != null) {
                    C0671 r0 = BottomSheetBehavior.this.f720;
                    if (r0.f4785.f4807 != floatValue) {
                        r0.f4785.f4807 = floatValue;
                        r0.f4787 = true;
                        r0.invalidateSelf();
                    }
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.f724 = obtainStyledAttributes.getDimension(0, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || peekValue.data != -1) {
            m916(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            m916(peekValue.data);
        }
        m914(obtainStyledAttributes.getBoolean(6, false));
        boolean z = obtainStyledAttributes.getBoolean(4, true);
        if (this.f706 != z) {
            this.f706 = z;
            if (this.f742 != null) {
                m906();
            }
            m910((!this.f706 || this.f721 != 6) ? this.f721 : 3);
            m908();
        }
        this.f722 = obtainStyledAttributes.getBoolean(9, false);
        this.f715 = obtainStyledAttributes.getBoolean(2, true);
        this.f728 = obtainStyledAttributes.getInt(8, 0);
        float f = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f717 = f;
        if (this.f742 != null) {
            this.f710 = (int) (((float) this.f719) * (1.0f - this.f717));
        }
        int i = obtainStyledAttributes.getInt(3, 0);
        if (i >= 0) {
            this.f714 = i;
            obtainStyledAttributes.recycle();
            this.f711 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new Cif(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        Cif ifVar = (Cif) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, ifVar.f6905);
        int i = this.f728;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f731 = ifVar.f752;
            }
            int i2 = this.f728;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f706 = ifVar.f751;
            }
            int i3 = this.f728;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f738 = ifVar.f754;
            }
            int i4 = this.f728;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f722 = ifVar.f753;
            }
        }
        if (ifVar.f750 == 1 || ifVar.f750 == 2) {
            this.f721 = 4;
        } else {
            this.f721 = ifVar.f750;
        }
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.C0016 r1) {
        super.onAttachedToLayoutParams(r1);
        this.f742 = null;
        this.f725 = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f742 = null;
        this.f725 = null;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        C0671 r0;
        if (C0293.m4153(coordinatorLayout) && !C0293.m4153(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f742 == null) {
            this.f727 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f158082131165295);
            this.f742 = new WeakReference<>(v);
            if (this.f716 && (r0 = this.f720) != null) {
                C0293.m4199((View) v, (Drawable) r0);
            }
            C0671 r02 = this.f720;
            if (r02 != null) {
                float f = this.f724;
                if (f == -1.0f) {
                    f = C0293.m4188(v);
                }
                if (r02.f4785.f4803 != f) {
                    r02.f4785.f4803 = f;
                    r02.m5521();
                }
                this.f712 = this.f721 == 3;
                C0671 r03 = this.f720;
                float f2 = this.f712 ? 0.0f : 1.0f;
                if (r03.f4785.f4807 != f2) {
                    r03.f4785.f4807 = f2;
                    r03.f4787 = true;
                    r03.invalidateSelf();
                }
            }
            m908();
            if (C0293.m4217(v) == 0) {
                C0293.m4203((View) v, 1);
            }
        }
        if (this.f725 == null) {
            this.f725 = C1068.m7371((ViewGroup) coordinatorLayout, this.f739);
        }
        int top = v.getTop();
        coordinatorLayout.m142(v, i);
        this.f729 = coordinatorLayout.getWidth();
        this.f719 = coordinatorLayout.getHeight();
        this.f734 = Math.max(0, this.f719 - v.getHeight());
        this.f710 = (int) (((float) this.f719) * (1.0f - this.f717));
        m906();
        int i2 = this.f721;
        if (i2 == 3) {
            C0293.m4164((View) v, this.f706 ? this.f734 : this.f714);
        } else if (i2 == 6) {
            C0293.m4164((View) v, this.f710);
        } else if (!this.f738 || i2 != 5) {
            int i3 = this.f721;
            if (i3 == 4) {
                C0293.m4164((View) v, this.f741);
            } else if (i3 == 1 || i3 == 2) {
                C0293.m4164((View) v, top - v.getTop());
            }
        } else {
            C0293.m4164((View) v, this.f719);
        }
        this.f707 = new WeakReference<>(m900((View) v));
        return true;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1068 r11;
        if (!v.isShown() || !this.f715) {
            this.f723 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.f726 = -1;
            VelocityTracker velocityTracker = this.f733;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f733 = null;
            }
        }
        if (this.f733 == null) {
            this.f733 = VelocityTracker.obtain();
        }
        this.f733.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f735 = (int) motionEvent.getY();
            if (this.f721 != 2) {
                WeakReference<View> weakReference = this.f707;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m143(view2, x, this.f735)) {
                    this.f726 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f708 = true;
                }
            }
            this.f723 = this.f726 == -1 && !coordinatorLayout.m143(v, x, this.f735);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f708 = false;
            this.f726 = -1;
            if (this.f723) {
                this.f723 = false;
                return false;
            }
        }
        if (!this.f723 && (r11 = this.f725) != null && r11.m7379(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f707;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.f723 && this.f721 != 1 && !coordinatorLayout.m143(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f725 != null && Math.abs(((float) this.f735) - motionEvent.getY()) > ((float) this.f725.f6413);
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f721 == 1 && actionMasked == 0) {
            return true;
        }
        C1068 r1 = this.f725;
        if (r1 != null) {
            r1.m7382(motionEvent);
        }
        if (actionMasked == 0) {
            this.f726 = -1;
            VelocityTracker velocityTracker = this.f733;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f733 = null;
            }
        }
        if (this.f733 == null) {
            this.f733 = VelocityTracker.obtain();
        }
        this.f733.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f723 && Math.abs(((float) this.f735) - motionEvent.getY()) > ((float) this.f725.f6413)) {
            this.f725.m7383(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f723) {
            return true;
        }
        return false;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f732 = 0;
        this.f737 = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f707;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < (this.f706 ? this.f734 : this.f714)) {
                        iArr[1] = top - (this.f706 ? this.f734 : this.f714);
                        C0293.m4164((View) v, -iArr[1]);
                        m910(3);
                    } else if (this.f715) {
                        iArr[1] = i2;
                        C0293.m4164((View) v, -i2);
                        m910(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f741;
                    if (i4 > i5 && !this.f738) {
                        iArr[1] = top - i5;
                        C0293.m4164((View) v, -iArr[1]);
                        m910(4);
                    } else if (this.f715) {
                        iArr[1] = i2;
                        C0293.m4164((View) v, -i2);
                        m910(1);
                    } else {
                        return;
                    }
                }
                v.getTop();
                m911();
                this.f732 = i2;
                this.f737 = true;
            }
        }
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        float f;
        int i4 = 3;
        if (v.getTop() == (this.f706 ? this.f734 : this.f714)) {
            m910(3);
            return;
        }
        WeakReference<View> weakReference = this.f707;
        if (weakReference != null && view == weakReference.get() && this.f737) {
            if (this.f732 > 0) {
                if (this.f706) {
                    i2 = this.f734;
                } else {
                    int top = v.getTop();
                    int i5 = this.f710;
                    if (top > i5) {
                        i2 = i5;
                    } else {
                        i2 = this.f714;
                    }
                }
                m913(v, i4, i2, false);
                this.f737 = false;
            }
            if (this.f738) {
                VelocityTracker velocityTracker = this.f733;
                if (velocityTracker == null) {
                    f = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f711);
                    f = this.f733.getYVelocity(this.f726);
                }
                if (m915(v, f)) {
                    i2 = this.f719;
                    i4 = 5;
                    m913(v, i4, i2, false);
                    this.f737 = false;
                }
            }
            if (this.f732 == 0) {
                int top2 = v.getTop();
                if (!this.f706) {
                    int i6 = this.f710;
                    if (top2 < i6) {
                        if (top2 < Math.abs(top2 - this.f741)) {
                            i2 = this.f714;
                            m913(v, i4, i2, false);
                            this.f737 = false;
                        }
                        i2 = this.f710;
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f741)) {
                        i2 = this.f710;
                    } else {
                        i3 = this.f741;
                    }
                } else if (Math.abs(top2 - this.f734) < Math.abs(top2 - this.f741)) {
                    i2 = this.f734;
                    m913(v, i4, i2, false);
                    this.f737 = false;
                } else {
                    i3 = this.f741;
                }
            } else {
                if (!this.f706) {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f710) < Math.abs(top3 - this.f741)) {
                        i2 = this.f710;
                    }
                }
                i3 = this.f741;
            }
            i4 = 4;
            m913(v, i4, i2, false);
            this.f737 = false;
            i4 = 6;
            m913(v, i4, i2, false);
            this.f737 = false;
        }
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f707;
        if (weakReference == null || view != weakReference.get() || (this.f721 == 3 && !super.onNestedPreFling(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m916(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f730
            if (r4 != 0) goto L_0x0015
            r3.f730 = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f730
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f731
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f730 = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f731 = r4
        L_0x001f:
            if (r0 == 0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f742
            if (r4 == 0) goto L_0x003a
            r3.m906()
            int r4 = r3.f721
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f742
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m916(int):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m914(boolean z) {
        if (this.f738 != z) {
            this.f738 = z;
            if (!z && this.f721 == 5) {
                m909(4);
            }
            m908();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m909(int i) {
        if (i != this.f721) {
            if (this.f742 != null) {
                m905(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f738 && i == 5)) {
                this.f721 = i;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m905(final int i) {
        final View view = (View) this.f742.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0293.m4187(view)) {
                m912(view, i);
            } else {
                view.post(new Runnable() {
                    public final void run() {
                        BottomSheetBehavior.this.m912(view, i);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m910(int i) {
        if (this.f721 != i) {
            this.f721 = i;
            WeakReference<V> weakReference = this.f742;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i == 3) {
                    m902(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m902(false);
                }
                m907(i);
                for (int i2 = 0; i2 < this.f736.size(); i2++) {
                    this.f736.get(i2).m925(i);
                }
                m908();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m907(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f712 != z) {
                this.f712 = z;
                if (this.f720 != null && (valueAnimator = this.f718) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f718.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f718.setFloatValues(new float[]{1.0f - f, f});
                    this.f718.start();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m903() {
        if (this.f730) {
            return Math.max(this.f727, this.f719 - ((this.f729 * 9) / 16));
        }
        return this.f731;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m906() {
        int r0 = m903();
        if (this.f706) {
            this.f741 = Math.max(this.f719 - r0, this.f734);
        } else {
            this.f741 = this.f719 - r0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m915(View view, float f) {
        if (this.f722) {
            return true;
        }
        if (view.getTop() < this.f741) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f741)) / ((float) m903()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private View m900(View view) {
        if (C0293.m4170(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View r2 = m900(viewGroup.getChildAt(i));
            if (r2 != null) {
                return r2;
            }
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m901(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f716) {
            this.f709 = new C0785(C0785.m6131(context, attributeSet, R.attr.f148972130968674, R.style.f174942131952215, new C0531(0.0f)), (byte) 0);
            this.f720 = new C0671(this.f709);
            C0671 r6 = this.f720;
            r6.f4785.f4812 = new C2610(context);
            r6.m5521();
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f720.setTint(typedValue.data);
                return;
            }
            C0671 r5 = this.f720;
            if (r5.f4785.f4804 != colorStateList) {
                r5.f4785.f4804 = colorStateList;
                r5.onStateChange(r5.getState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m912(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f741;
        } else if (i == 6) {
            int i4 = this.f710;
            if (!this.f706 || i4 > (i3 = this.f734)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = this.f706 ? this.f734 : this.f714;
        } else if (!this.f738 || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        } else {
            i2 = this.f719;
        }
        m913(view, i, i2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m913(View view, int i, int i2, boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f725.m7384(view.getLeft(), i2);
        } else {
            z2 = this.f725.m7385(view, view.getLeft(), i2);
        }
        if (z2) {
            m910(2);
            m907(i);
            if (this.f713 == null) {
                this.f713 = new C0065(view, i);
            }
            if (!this.f713.f756) {
                BottomSheetBehavior<V>.ɩ r4 = this.f713;
                r4.f758 = i;
                C0293.m4204(view, (Runnable) r4);
                this.f713.f756 = true;
                return;
            }
            this.f713.f758 = i;
            return;
        }
        m910(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m911() {
        if (((View) this.f742.get()) != null && !this.f736.isEmpty()) {
            for (int i = 0; i < this.f736.size(); i++) {
                this.f736.get(i);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$ɩ  reason: contains not printable characters */
    class C0065 implements Runnable {

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f756;

        /* renamed from: Ι  reason: contains not printable characters */
        private final View f757;

        /* renamed from: ι  reason: contains not printable characters */
        int f758;

        C0065(View view, int i) {
            this.f757 = view;
            this.f758 = i;
        }

        public final void run() {
            if (BottomSheetBehavior.this.f725 == null || !BottomSheetBehavior.this.f725.m7381()) {
                BottomSheetBehavior.this.m910(this.f758);
            } else {
                C0293.m4204(this.f757, (Runnable) this);
            }
            this.f756 = false;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$if  reason: invalid class name */
    public static class Cif extends C1219 {
        public static final Parcelable.Creator<Cif> CREATOR = new Parcelable.ClassLoaderCreator<Cif>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new Cif(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Cif[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Cif(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        final int f750;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f751;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f752;

        /* renamed from: ɹ  reason: contains not printable characters */
        boolean f753;

        /* renamed from: І  reason: contains not printable characters */
        boolean f754;

        public Cif(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f750 = parcel.readInt();
            this.f752 = parcel.readInt();
            boolean z = false;
            this.f751 = parcel.readInt() == 1;
            this.f754 = parcel.readInt() == 1;
            this.f753 = parcel.readInt() == 1 ? true : z;
        }

        public Cif(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f750 = bottomSheetBehavior.f721;
            this.f752 = bottomSheetBehavior.f731;
            this.f751 = bottomSheetBehavior.f706;
            this.f754 = bottomSheetBehavior.f738;
            this.f753 = bottomSheetBehavior.f722;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f750);
            parcel.writeInt(this.f752);
            parcel.writeInt(this.f751 ? 1 : 0);
            parcel.writeInt(this.f754 ? 1 : 0);
            parcel.writeInt(this.f753 ? 1 : 0);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <V extends View> BottomSheetBehavior<V> m904(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0016) {
            CoordinatorLayout.C3238If ifR = ((CoordinatorLayout.C0016) layoutParams).f162;
            if (ifR instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) ifR;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m902(boolean z) {
        WeakReference<V> weakReference = this.f742;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f740 == null) {
                        this.f740 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f742.get() && z && Build.VERSION.SDK_INT >= 16) {
                        this.f740.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z) {
                    this.f740 = null;
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m908() {
        View view;
        WeakReference<V> weakReference = this.f742;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C0293.m4147(view, 524288);
            C0293.m4147(view, 262144);
            C0293.m4147(view, 1048576);
            if (this.f738 && this.f721 != 5) {
                C0293.m4150(view, C0520.Cif.f4327, (CharSequence) null, new C0607(5) {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m924(View view) {
                        BottomSheetBehavior.this.m909(r3);
                        return true;
                    }
                });
            }
            int i = this.f721;
            final int i2 = 6;
            if (i == 3) {
                if (this.f706) {
                    i2 = 4;
                }
                C0293.m4150(view, C0520.Cif.f4328, (CharSequence) null, new C0607() {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m924(View view) {
                        BottomSheetBehavior.this.m909(i2);
                        return true;
                    }
                });
            } else if (i == 4) {
                if (this.f706) {
                    i2 = 3;
                }
                C0293.m4150(view, C0520.Cif.f4326, (CharSequence) null, new C0607() {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m924(View view) {
                        BottomSheetBehavior.this.m909(i2);
                        return true;
                    }
                });
            } else if (i == 6) {
                C0293.m4150(view, C0520.Cif.f4328, (CharSequence) null, new C0607(4) {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m924(View view) {
                        BottomSheetBehavior.this.m909(i2);
                        return true;
                    }
                });
                C0293.m4150(view, C0520.Cif.f4326, (CharSequence) null, new C0607(3) {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m924(View view) {
                        BottomSheetBehavior.this.m909(i2);
                        return true;
                    }
                });
            }
        }
    }
}
