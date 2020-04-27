package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import o.C0293;
import o.C0501;
import o.C0520;
import o.C0607;
import o.C0671;
import o.C0858;
import o.C1137;
import o.C1203;
import o.C1219;
import o.C1247;
import o.C1266;
import o.C1311;
import o.C2408;
import o.C2607;
import o.C2610;
import o.C2745;
import o.C2850;
import o.C3160;
import o.C3257Con;
import o.R;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    int f607;

    /* renamed from: ł  reason: contains not printable characters */
    private int[] f608;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f609;

    /* renamed from: ǃ  reason: contains not printable characters */
    C0501 f610;

    /* renamed from: ȷ  reason: contains not printable characters */
    private ValueAnimator f611;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f612;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f613;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f614;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f615;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f616;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f617;

    /* renamed from: ι  reason: contains not printable characters */
    public List<C0060> f618;

    /* renamed from: І  reason: contains not printable characters */
    private int f619;

    /* renamed from: і  reason: contains not printable characters */
    private int f620;

    /* renamed from: Ӏ  reason: contains not printable characters */
    Drawable f621;

    /* renamed from: ӏ  reason: contains not printable characters */
    private WeakReference<View> f622;

    /* renamed from: com.google.android.material.appbar.AppBarLayout$if  reason: invalid class name */
    public interface Cif extends C0060<AppBarLayout> {
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$ǃ  reason: contains not printable characters */
    public interface C0060<T extends AppBarLayout> {
        /* renamed from: ı  reason: contains not printable characters */
        void m867(int i);
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f148542130968620);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f619 = -1;
        this.f615 = -1;
        this.f620 = -1;
        this.f607 = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            Context context3 = getContext();
            int[] iArr = C1247.f7061;
            C3160.m15978(context3, attributeSet2, i2, R.style.f174922131952213);
            C3160.m15976(context3, attributeSet, iArr, i, R.style.f174922131952213, new int[0]);
            TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet2, iArr, i2, R.style.f174922131952213);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, obtainStyledAttributes.getResourceId(0, 0)));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        int[] iArr2 = C0858.Aux.f5591;
        C3160.m15978(context2, attributeSet2, i2, R.style.f174922131952213);
        C3160.m15976(context, attributeSet, iArr2, i, R.style.f174922131952213, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, R.style.f174922131952213);
        C0293.m4199((View) this, obtainStyledAttributes2.getDrawable(0));
        if (getBackground() instanceof ColorDrawable) {
            C0671 r4 = new C0671();
            ColorStateList valueOf = ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor());
            if (r4.f4785.f4804 != valueOf) {
                r4.f4785.f4804 = valueOf;
                r4.onStateChange(r4.getState());
            }
            r4.f4785.f4812 = new C2610(context2);
            r4.m5521();
            C0293.m4199((View) this, (Drawable) r4);
        }
        if (obtainStyledAttributes2.hasValue(4)) {
            m824(obtainStyledAttributes2.getBoolean(4, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && obtainStyledAttributes2.hasValue(3)) {
            C1247.m8053(this, (float) obtainStyledAttributes2.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes2.hasValue(2)) {
                setKeyboardNavigationCluster(obtainStyledAttributes2.getBoolean(2, false));
            }
            if (obtainStyledAttributes2.hasValue(1)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes2.getBoolean(1, false));
            }
        }
        this.f617 = obtainStyledAttributes2.getBoolean(5, false);
        this.f616 = obtainStyledAttributes2.getResourceId(6, -1);
        setStatusBarForeground(obtainStyledAttributes2.getDrawable(7));
        obtainStyledAttributes2.recycle();
        C0293.m4207((View) this, (C2850) new C2850() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final C0501 m833(View view, C0501 r5) {
                AppBarLayout appBarLayout = AppBarLayout.this;
                C0501 r0 = C0293.m4153(appBarLayout) ? r5 : null;
                if (!C2408.m12453(appBarLayout.f610, r0)) {
                    appBarLayout.f610 = r0;
                    boolean z = false;
                    if (appBarLayout.f621 != null) {
                        if ((appBarLayout.f610 != null ? appBarLayout.f610.m4893() : 0) > 0) {
                            z = true;
                        }
                    }
                    appBarLayout.setWillNotDraw(!z);
                    appBarLayout.requestLayout();
                }
                return r5;
            }
        });
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f621;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f621 = drawable3;
            Drawable drawable4 = this.f621;
            boolean z = false;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f621.setState(getDrawableState());
                }
                C1266.m8157(this.f621, C0293.m4156(this));
                this.f621.setVisible(getVisibility() == 0, false);
                this.f621.setCallback(this);
            }
            if (this.f621 != null) {
                C0501 r4 = this.f610;
                if ((r4 != null ? r4.m4893() : 0) > 0) {
                    z = true;
                }
            }
            setWillNotDraw(!z);
            C0293.m4176(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C3257Con.m1345(getContext(), i));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        if (this.f621 != null) {
            C0501 r0 = this.f610;
            if ((r0 != null ? r0.m4893() : 0) > 0) {
                z = true;
            }
        }
        if (z) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f609));
            this.f621.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f621;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f621;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f621;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C0293.m4153(this) && m822()) {
            int measuredHeight = getMeasuredHeight();
            int i3 = 0;
            if (mode == Integer.MIN_VALUE) {
                int measuredHeight2 = getMeasuredHeight();
                C0501 r0 = this.f610;
                int r4 = measuredHeight2 + (r0 != null ? r0.m4893() : 0);
                int size = View.MeasureSpec.getSize(i2);
                measuredHeight = r4 < 0 ? 0 : r4 > size ? size : r4;
            } else if (mode == 0) {
                C0501 r42 = this.f610;
                if (r42 != null) {
                    i3 = r42.m4893();
                }
                measuredHeight += i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.f619 = -1;
        this.f615 = -1;
        this.f620 = -1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = true;
        if (C0293.m4153(this) && m822()) {
            C0501 r2 = this.f610;
            int r22 = r2 != null ? r2.m4893() : 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0293.m4164(getChildAt(childCount), r22);
            }
        }
        this.f619 = -1;
        this.f615 = -1;
        this.f620 = -1;
        this.f613 = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C0059) getChildAt(i5).getLayoutParams()).f646 != null) {
                this.f613 = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f621;
        if (drawable != null) {
            int width = getWidth();
            C0501 r6 = this.f610;
            drawable.setBounds(0, 0, width, r6 != null ? r6.m4893() : 0);
        }
        if (!this.f617) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                C0059 r62 = (C0059) getChildAt(i6).getLayoutParams();
                if ((r62.f645 & 1) == 1 && (r62.f645 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f614 != z3) {
            this.f614 = z3;
            refreshDrawableState();
        }
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14535((View) this);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final CoordinatorLayout.C3238If<AppBarLayout> m829() {
        return new Behavior();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2745.m14513((View) this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, C0293.m4186(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        m824(z, z2, true);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m824(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f607 = i2 | i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0059;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C0059 m823(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C0059((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0059((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0059(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f622;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f622 = null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m831() {
        int i = this.f619;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0059 r5 = (C0059) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = r5.f645;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + r5.topMargin + r5.bottomMargin;
            if (i2 == 0 && C0293.m4153(childAt)) {
                C0501 r52 = this.f610;
                i3 -= r52 != null ? r52.m4893() : 0;
            }
            if ((i4 & 2) != 0) {
                i3 -= C0293.m4182(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f619 = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m825() {
        /*
            r9 = this;
            int r0 = r9.f615
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = 0
        L_0x000e:
            if (r0 < 0) goto L_0x005e
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$ı r4 = (com.google.android.material.appbar.AppBarLayout.C0059) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f645
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0059
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0034
            int r4 = o.C0293.m4182(r3)
        L_0x0032:
            int r7 = r7 + r4
            goto L_0x0040
        L_0x0034:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x003f
            int r4 = o.C0293.m4182(r3)
            int r4 = r5 - r4
            goto L_0x0032
        L_0x003f:
            int r7 = r7 + r5
        L_0x0040:
            if (r0 != 0) goto L_0x0057
            boolean r3 = o.C0293.m4153(r3)
            if (r3 == 0) goto L_0x0057
            o.ŀǃ r3 = r9.f610
            if (r3 == 0) goto L_0x0051
            int r3 = r3.m4893()
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            int r5 = r5 - r3
            int r7 = java.lang.Math.min(r7, r5)
        L_0x0057:
            int r2 = r2 + r7
            goto L_0x005b
        L_0x0059:
            if (r2 > 0) goto L_0x005e
        L_0x005b:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x005e:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f615 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.m825():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m828() {
        int i = this.f620;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0059 r5 = (C0059) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + r5.topMargin + r5.bottomMargin;
            int i4 = r5.f645;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0293.m4182(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f620 = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m827(int i) {
        this.f609 = i;
        if (!willNotDraw()) {
            C0293.m4176(this);
        }
        List<C0060> list = this.f618;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0060 r2 = this.f618.get(i2);
                if (r2 != null) {
                    r2.m867(i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f608 == null) {
            this.f608 = new int[4];
        }
        int[] iArr = this.f608;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f614 ? R.attr.f154432130969262 : -2130969262;
        iArr[1] = (!this.f614 || !this.f612) ? -2130969263 : R.attr.f154442130969263;
        iArr[2] = this.f614 ? R.attr.f154412130969260 : -2130969260;
        iArr[3] = (!this.f614 || !this.f612) ? -2130969259 : R.attr.f154402130969259;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m832(boolean z) {
        if (this.f612 == z) {
            return false;
        }
        this.f612 = z;
        refreshDrawableState();
        if (this.f617 && (getBackground() instanceof C0671)) {
            final C0671 r0 = (C0671) getBackground();
            float dimension = getResources().getDimension(R.dimen.f157972131165281);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f611;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f611 = ValueAnimator.ofFloat(new float[]{f, dimension});
            ValueAnimator valueAnimator2 = this.f611;
            getResources();
            valueAnimator2.setDuration(150);
            this.f611.setInterpolator(C1311.f7290);
            this.f611.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C0671 r0 = C0671.this;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (r0.f4785.f4803 != floatValue) {
                        r0.f4785.f4803 = floatValue;
                        r0.m5521();
                    }
                }
            });
            this.f611.start();
        }
        return true;
    }

    public void setLiftOnScroll(boolean z) {
        this.f617 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f616 = i;
        WeakReference<View> weakReference = this.f622;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f622 = null;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1247.m8053(this, f);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean m822() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() == 8 || C0293.m4153(childAt)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$ı  reason: contains not printable characters */
    public static class C0059 extends LinearLayout.LayoutParams {

        /* renamed from: ǃ  reason: contains not printable characters */
        int f645 = 1;

        /* renamed from: Ι  reason: contains not printable characters */
        Interpolator f646;

        public C0059(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5603);
            this.f645 = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f646 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0059() {
            super(-1, -2);
        }

        public C0059(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0059(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0059(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ Parcelable m859(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ boolean m860(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ boolean m861(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m862(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m863(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m864(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ boolean m865(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ void m866(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends C1137<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private ValueAnimator f625;

        /* renamed from: ǃ  reason: contains not printable characters */
        private int f626;

        /* renamed from: ɹ  reason: contains not printable characters */
        private WeakReference<View> f627;

        /* renamed from: Ι  reason: contains not printable characters */
        private int f628 = -1;

        /* renamed from: ι  reason: contains not printable characters */
        int f629;

        /* renamed from: І  reason: contains not printable characters */
        private float f630;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private boolean f631;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ int m848(View view) {
            return ((AppBarLayout) view).m831();
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6  */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int m849(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.getTopAndBottomOffset()
                int r1 = r7.f629
                int r0 = r0 + r1
                r1 = 0
                if (r11 == 0) goto L_0x00bc
                if (r0 < r11) goto L_0x00bc
                if (r0 > r12) goto L_0x00bc
                if (r10 >= r11) goto L_0x0014
                r10 = r11
                goto L_0x0017
            L_0x0014:
                if (r10 <= r12) goto L_0x0017
                r10 = r12
            L_0x0017:
                if (r0 == r10) goto L_0x00be
                boolean r11 = r9.f613
                if (r11 == 0) goto L_0x0097
                int r11 = java.lang.Math.abs(r10)
                int r12 = r9.getChildCount()
                r2 = 0
            L_0x0026:
                if (r2 >= r12) goto L_0x0097
                android.view.View r3 = r9.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$ı r4 = (com.google.android.material.appbar.AppBarLayout.C0059) r4
                android.view.animation.Interpolator r5 = r4.f646
                int r6 = r3.getTop()
                if (r11 < r6) goto L_0x0094
                int r6 = r3.getBottom()
                if (r11 > r6) goto L_0x0094
                if (r5 == 0) goto L_0x0097
                int r12 = r4.f645
                r2 = r12 & 1
                if (r2 == 0) goto L_0x0060
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                int r2 = r2 + r1
                r12 = r12 & 2
                if (r12 == 0) goto L_0x005e
                int r12 = o.C0293.m4182(r3)
                int r12 = r2 - r12
                goto L_0x0061
            L_0x005e:
                r12 = r2
                goto L_0x0061
            L_0x0060:
                r12 = 0
            L_0x0061:
                boolean r2 = o.C0293.m4153(r3)
                if (r2 == 0) goto L_0x0074
                o.ŀǃ r2 = r9.f610
                if (r2 == 0) goto L_0x0072
                o.ŀǃ r2 = r9.f610
                int r2 = r2.m4893()
                goto L_0x0073
            L_0x0072:
                r2 = 0
            L_0x0073:
                int r12 = r12 - r2
            L_0x0074:
                if (r12 <= 0) goto L_0x0097
                int r2 = r3.getTop()
                int r11 = r11 - r2
                float r12 = (float) r12
                float r11 = (float) r11
                float r11 = r11 / r12
                float r11 = r5.getInterpolation(r11)
                float r12 = r12 * r11
                int r11 = java.lang.Math.round(r12)
                int r12 = java.lang.Integer.signum(r10)
                int r2 = r3.getTop()
                int r2 = r2 + r11
                int r11 = r12 * r2
                goto L_0x0098
            L_0x0094:
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0097:
                r11 = r10
            L_0x0098:
                boolean r12 = r7.setTopAndBottomOffset(r11)
                int r2 = r0 - r10
                int r11 = r10 - r11
                r7.f629 = r11
                if (r12 != 0) goto L_0x00ab
                boolean r11 = r9.f613
                if (r11 == 0) goto L_0x00ab
                r8.m141((android.view.View) r9)
            L_0x00ab:
                int r11 = r7.getTopAndBottomOffset()
                r9.m827(r11)
                if (r10 >= r0) goto L_0x00b6
                r11 = -1
                goto L_0x00b7
            L_0x00b6:
                r11 = 1
            L_0x00b7:
                m840(r8, r9, r10, r11, r1)
                r1 = r2
                goto L_0x00be
            L_0x00bc:
                r7.f629 = r1
            L_0x00be:
                r7.m836(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m849(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m850(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m837(coordinatorLayout, appBarLayout);
            if (appBarLayout.f617) {
                appBarLayout.m832(appBarLayout.m830(m835(coordinatorLayout)));
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ int m854(View view) {
            return -((AppBarLayout) view).m828();
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.m831();
                    i5 = i6;
                    i4 = t.m825() + i6;
                } else {
                    i5 = -t.m831();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = m7575(coordinatorLayout, t, m7579() - i2, i5, i4);
                }
            }
            if (t.f617) {
                t.m832(t.m830(view));
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                T t2 = t;
                iArr[1] = m7575(coordinatorLayout2, t2, m7579() - i4, -t.m828(), 0);
            }
            if (i4 == 0) {
                m836(coordinatorLayout, t);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f626 == 0 || i == 1) {
                m837(coordinatorLayout, t);
                if (t.f617) {
                    t.m832(t.m830(view));
                }
            }
            this.f627 = new WeakReference<>(view);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static int m839(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C0059 r3 = (C0059) childAt.getLayoutParams();
                if ((r3.f645 & 32) == 32) {
                    top -= r3.topMargin;
                    bottom += r3.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0016) t.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.m152(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int i3 = t.f607;
            int i4 = this.f628;
            if (i4 >= 0 && (i3 & 8) == 0) {
                View childAt = t.getChildAt(i4);
                int i5 = -childAt.getBottom();
                if (this.f631) {
                    i2 = C0293.m4182(childAt) + (t.f610 != null ? t.f610.m4893() : 0);
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f630);
                }
                m7575(coordinatorLayout, t, i5 + i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            } else if (i3 != 0) {
                boolean z = (i3 & 4) != 0;
                if ((i3 & 2) != 0) {
                    int i6 = -t.m831();
                    if (z) {
                        m838(coordinatorLayout, t, i6);
                    } else {
                        m7575(coordinatorLayout, t, i6, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
                    }
                } else if ((i3 & 1) != 0) {
                    if (z) {
                        m838(coordinatorLayout, t, 0);
                    } else {
                        m7575(coordinatorLayout, t, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
                    }
                }
            }
            t.f607 = 0;
            this.f628 = -1;
            int topAndBottomOffset = getTopAndBottomOffset();
            int i7 = -t.m831();
            if (topAndBottomOffset < i7) {
                topAndBottomOffset = i7;
            } else if (topAndBottomOffset > 0) {
                topAndBottomOffset = 0;
            }
            setTopAndBottomOffset(topAndBottomOffset);
            m840(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.m827(getTopAndBottomOffset());
            m836(coordinatorLayout, t);
            return onLayoutChild;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m836(CoordinatorLayout coordinatorLayout, T t) {
            C0293.m4147((View) coordinatorLayout, C0520.Cif.f4325.m5074());
            C0293.m4147((View) coordinatorLayout, C0520.Cif.f4315.m5074());
            View r0 = m835(coordinatorLayout);
            if (r0 != null && t.m831() != 0 && (((CoordinatorLayout.C0016) r0.getLayoutParams()).f162 instanceof ScrollingViewBehavior)) {
                m841(coordinatorLayout, t, r0);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
            if ((-r7) >= ((r0.getBottom() - r2) - (r6.f610 != null ? r6.f610.m4893() : 0))) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            if ((-r7) >= ((r0.getBottom() - r2) - (r6.f610 != null ? r6.f610.m4893() : 0))) goto L_0x0033;
         */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m840(androidx.coordinatorlayout.widget.CoordinatorLayout r5, T r6, int r7, int r8, boolean r9) {
            /*
                android.view.View r0 = m834((com.google.android.material.appbar.AppBarLayout) r6, (int) r7)
                if (r0 == 0) goto L_0x006c
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$ı r1 = (com.google.android.material.appbar.AppBarLayout.C0059) r1
                int r1 = r1.f645
                r2 = r1 & 1
                r3 = 0
                if (r2 == 0) goto L_0x004f
                int r2 = o.C0293.m4182(r0)
                r4 = 1
                if (r8 <= 0) goto L_0x0035
                r8 = r1 & 12
                if (r8 == 0) goto L_0x0035
                int r7 = -r7
                int r8 = r0.getBottom()
                int r8 = r8 - r2
                o.ŀǃ r0 = r6.f610
                if (r0 == 0) goto L_0x002f
                o.ŀǃ r0 = r6.f610
                int r0 = r0.m4893()
                goto L_0x0030
            L_0x002f:
                r0 = 0
            L_0x0030:
                int r8 = r8 - r0
                if (r7 < r8) goto L_0x004f
            L_0x0033:
                r3 = 1
                goto L_0x004f
            L_0x0035:
                r8 = r1 & 2
                if (r8 == 0) goto L_0x004f
                int r7 = -r7
                int r8 = r0.getBottom()
                int r8 = r8 - r2
                o.ŀǃ r0 = r6.f610
                if (r0 == 0) goto L_0x004a
                o.ŀǃ r0 = r6.f610
                int r0 = r0.m4893()
                goto L_0x004b
            L_0x004a:
                r0 = 0
            L_0x004b:
                int r8 = r8 - r0
                if (r7 < r8) goto L_0x004f
                goto L_0x0033
            L_0x004f:
                boolean r7 = r6.f617
                if (r7 == 0) goto L_0x005b
                android.view.View r7 = m835(r5)
                boolean r3 = r6.m830(r7)
            L_0x005b:
                boolean r7 = r6.m832(r3)
                if (r9 != 0) goto L_0x0069
                if (r7 == 0) goto L_0x006c
                boolean r5 = m842(r5, r6)
                if (r5 == 0) goto L_0x006c
            L_0x0069:
                r6.jumpDrawablesToCurrentState()
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m840(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: ι  reason: contains not printable characters */
        private static boolean m842(CoordinatorLayout coordinatorLayout, T t) {
            List<View> r4 = coordinatorLayout.m151(t);
            int size = r4.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.C3238If ifR = ((CoordinatorLayout.C0016) r4.get(i).getLayoutParams()).f162;
                if (!(ifR instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) ifR).getOverlayTop() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private static View m834(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private static View m835(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C2607) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m856() {
            return getTopAndBottomOffset() + this.f629;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                    i++;
                } else {
                    C0058 r0 = new C0058(onSaveInstanceState);
                    r0.f644 = i;
                    if (bottom == C0293.m4182(childAt) + (t.f610 != null ? t.f610.m4893() : 0)) {
                        z = true;
                    }
                    r0.f643 = z;
                    r0.f642 = ((float) bottom) / ((float) childAt.getHeight());
                    return r0;
                }
            }
            return onSaveInstanceState;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C0058) {
                C0058 r4 = (C0058) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, t, r4.f6905);
                this.f628 = r4.f644;
                this.f630 = r4.f642;
                this.f631 = r4.f643;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.f628 = -1;
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$ı  reason: contains not printable characters */
        public static class C0058 extends C1219 {
            public static final Parcelable.Creator<C0058> CREATOR = new Parcelable.ClassLoaderCreator<C0058>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C0058(parcel, classLoader);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new C0058[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new C0058(parcel, (ClassLoader) null);
                }
            };

            /* renamed from: ı  reason: contains not printable characters */
            float f642;

            /* renamed from: ǃ  reason: contains not printable characters */
            boolean f643;

            /* renamed from: ɩ  reason: contains not printable characters */
            int f644;

            public C0058(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f644 = parcel.readInt();
                this.f642 = parcel.readFloat();
                this.f643 = parcel.readByte() != 0;
            }

            public C0058(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f644);
                parcel.writeFloat(this.f642);
                parcel.writeByte(this.f643 ? (byte) 1 : 0);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r3.m831() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002a
                boolean r5 = r3.f617
                if (r5 != 0) goto L_0x002b
                int r5 = r3.m831()
                if (r5 == 0) goto L_0x0012
                r5 = 1
                goto L_0x0013
            L_0x0012:
                r5 = 0
            L_0x0013:
                if (r5 == 0) goto L_0x0026
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r6 = 0
            L_0x002b:
                if (r6 == 0) goto L_0x0034
                android.animation.ValueAnimator r2 = r1.f625
                if (r2 == 0) goto L_0x0034
                r2.cancel()
            L_0x0034:
                r2 = 0
                r1.f627 = r2
                r1.f626 = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m838(final CoordinatorLayout coordinatorLayout, final T t, int i) {
            int i2;
            int abs = Math.abs((getTopAndBottomOffset() + this.f629) - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int topAndBottomOffset = getTopAndBottomOffset() + this.f629;
            if (topAndBottomOffset == i) {
                ValueAnimator valueAnimator = this.f625;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f625.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f625;
            if (valueAnimator2 == null) {
                this.f625 = new ValueAnimator();
                this.f625.setInterpolator(C1311.f7292);
                this.f625.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.m7575(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue(), RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f625.setDuration((long) Math.min(i2, 600));
            this.f625.setIntValues(new int[]{topAndBottomOffset, i});
            this.f625.start();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m837(CoordinatorLayout coordinatorLayout, T t) {
            int topAndBottomOffset = getTopAndBottomOffset() + this.f629;
            int r1 = m839(t, topAndBottomOffset);
            if (r1 >= 0) {
                View childAt = t.getChildAt(r1);
                C0059 r3 = (C0059) childAt.getLayoutParams();
                int i = r3.f645;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    boolean z = true;
                    if (r1 == t.getChildCount() - 1) {
                        i3 += t.f610 != null ? t.f610.m4893() : 0;
                    }
                    if ((i & 2) == 2) {
                        i3 += C0293.m4182(childAt);
                    } else {
                        if ((i & 5) == 5) {
                            int r12 = C0293.m4182(childAt) + i3;
                            if (topAndBottomOffset < r12) {
                                i2 = r12;
                            } else {
                                i3 = r12;
                            }
                        }
                    }
                    if ((i & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i2 += r3.topMargin;
                        i3 -= r3.bottomMargin;
                    }
                    if (topAndBottomOffset < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    int i4 = -t.m831();
                    if (i2 >= i4) {
                        i4 = i2 > 0 ? 0 : i2;
                    }
                    m838(coordinatorLayout, t, i4);
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m841(CoordinatorLayout coordinatorLayout, final T t, View view) {
            if (getTopAndBottomOffset() + this.f629 != (-t.m831()) && view.canScrollVertically(1)) {
                C0293.m4150(coordinatorLayout, C0520.Cif.f4325, (CharSequence) null, new C0607(false) {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m858(View view) {
                        AppBarLayout.this.setExpanded(true);
                        return true;
                    }
                });
            }
            if (getTopAndBottomOffset() + this.f629 == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                final int i = -t.m825();
                if (i != 0) {
                    final CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                    final T t2 = t;
                    final View view2 = view;
                    C0293.m4150(coordinatorLayout, C0520.Cif.f4315, (CharSequence) null, new C0607() {
                        /* renamed from: ı  reason: contains not printable characters */
                        public final boolean m857(View view) {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout2, t2, view2, 0, i, new int[]{0, 0}, 1);
                            return true;
                        }
                    });
                    return;
                }
                return;
            }
            C0293.m4150(coordinatorLayout, C0520.Cif.f4315, (CharSequence) null, new C0607(true) {
                /* renamed from: ı  reason: contains not printable characters */
                public final boolean m858(View view) {
                    AppBarLayout.this.setExpanded(true);
                    return true;
                }
            });
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ boolean m852() {
            WeakReference<View> weakReference = this.f627;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }
    }

    public static class ScrollingViewBehavior extends C1203 {
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5595);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C0293.m4147((View) coordinatorLayout, C0520.Cif.f4325.m5074());
                C0293.m4147((View) coordinatorLayout, C0520.Cif.f4315.m5074());
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency((List) coordinatorLayout.m144(view));
            if (findFirstDependency != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.tempRect1;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    findFirstDependency.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            CoordinatorLayout.C3238If ifR = ((CoordinatorLayout.C0016) view2.getLayoutParams()).f162;
            if (ifR instanceof BaseBehavior) {
                C0293.m4164(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ifR).f629) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        public float getOverlapRatioForOffset(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int r0 = appBarLayout.m831();
                int r2 = appBarLayout.m825();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((r2 == 0 || r0 + appBarLayoutOffset > r2) && (i = r0 - r2) != 0) {
                    return (((float) appBarLayoutOffset) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            CoordinatorLayout.C3238If ifR = ((CoordinatorLayout.C0016) appBarLayout.getLayoutParams()).f162;
            if (!(ifR instanceof BaseBehavior)) {
                return 0;
            }
            BaseBehavior baseBehavior = (BaseBehavior) ifR;
            return baseBehavior.getTopAndBottomOffset() + baseBehavior.f629;
        }

        /* access modifiers changed from: package-private */
        public AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).m831();
            }
            return super.getScrollRange(view);
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f617) {
                    appBarLayout.m832(appBarLayout.m830(view));
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m826() {
        int i;
        C0501 r0 = this.f610;
        int i2 = 0;
        int r02 = r0 != null ? r0.m4893() : 0;
        int r2 = C0293.m4182(this);
        if (r2 != 0) {
            i = r2 << 1;
        } else {
            int childCount = getChildCount();
            if (childCount > 0) {
                i2 = C0293.m4182(getChildAt(childCount - 1));
            }
            if (i2 == 0) {
                return getHeight() / 3;
            }
            i = i2 << 1;
        }
        return i + r02;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m830(View view) {
        int i;
        if (this.f622 == null && (i = this.f616) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f616);
            }
            if (findViewById != null) {
                this.f622 = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f622;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }
}
