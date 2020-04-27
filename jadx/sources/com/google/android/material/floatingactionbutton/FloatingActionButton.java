package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import o.C0291;
import o.C0293;
import o.C0337;
import o.C0344;
import o.C0429;
import o.C0671;
import o.C0710;
import o.C0785;
import o.C0808;
import o.C0858;
import o.C0902;
import o.C0910;
import o.C1091;
import o.C1122;
import o.C1266;
import o.C1400;
import o.C1641;
import o.C1975;
import o.C2652;
import o.C2715;
import o.C2732;
import o.C2745;
import o.C2824;
import o.C3160;
import o.C3198;
import o.C3206;
import o.R;

public class FloatingActionButton extends C3206 implements C0291, C0902, C2732, C0710, CoordinatorLayout.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    boolean f847;

    /* renamed from: ł  reason: contains not printable characters */
    private final C0337 f848;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private PorterDuff.Mode f849;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f850;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f851;

    /* renamed from: ɨ  reason: contains not printable characters */
    private PorterDuff.Mode f852;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Rect f853;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f854;

    /* renamed from: ɹ  reason: contains not printable characters */
    private ColorStateList f855;

    /* renamed from: ɾ  reason: contains not printable characters */
    private ColorStateList f856;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f857;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1975 f858;

    /* renamed from: І  reason: contains not printable characters */
    public C2652 f859;

    /* renamed from: г  reason: contains not printable characters */
    private final Rect f860;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private ColorStateList f861;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f862;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$if  reason: invalid class name */
    public static abstract class Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m1010(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m1011() {
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f151542130968943);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f174962131952217), attributeSet, i);
        C1091 r9;
        int resourceId;
        int resourceId2;
        this.f853 = new Rect();
        this.f860 = new Rect();
        Context context2 = getContext();
        int[] iArr = C0858.Aux.f5597;
        C3160.m15978(context2, attributeSet, i, R.style.f174962131952217);
        C3160.m15976(context2, attributeSet, iArr, i, R.style.f174962131952217, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.f174962131952217);
        this.f861 = C0344.m4473(context2, obtainStyledAttributes, 1);
        C1091 r5 = null;
        this.f849 = C3198.m16133(obtainStyledAttributes.getInt(2, -1), (PorterDuff.Mode) null);
        this.f856 = C0344.m4473(context2, obtainStyledAttributes, 12);
        this.f857 = obtainStyledAttributes.getInt(7, -1);
        this.f862 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f854 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        float dimension = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(9, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(11, 0.0f);
        this.f847 = obtainStyledAttributes.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f159132131165466);
        this.f851 = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        if (!obtainStyledAttributes.hasValue(15) || (resourceId2 = obtainStyledAttributes.getResourceId(15, 0)) == 0) {
            r9 = null;
        } else {
            r9 = C1091.m7459(context2, resourceId2);
        }
        if (obtainStyledAttributes.hasValue(8) && (resourceId = obtainStyledAttributes.getResourceId(8, 0)) != 0) {
            r5 = C1091.m7459(context2, resourceId);
        }
        C0785 r0 = new C0785(C0785.m6131(context2, attributeSet, i, R.style.f174962131952217, C0785.f5213), (byte) 0);
        boolean z = obtainStyledAttributes.getBoolean(5, false);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        this.f848 = new C0337(this);
        this.f848.m4449(attributeSet, i);
        this.f858 = new C1975(this);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14033(r0);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14027(this.f861, this.f849, this.f856, this.f854);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r14 = this.f859;
        r14.f12162 = dimensionPixelSize;
        if (r14 == null) {
            this.f859 = m997();
        }
        C2652 r142 = this.f859;
        if (r142.f12166 != dimension) {
            r142.f12166 = dimension;
            r142.m14031(r142.f12166, r142.f12183, r142.f12164);
        }
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r143 = this.f859;
        if (r143.f12183 != dimension2) {
            r143.f12183 = dimension2;
            r143.m14031(r143.f12166, r143.f12183, r143.f12164);
        }
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r144 = this.f859;
        if (r144.f12164 != dimension3) {
            r144.f12164 = dimension3;
            r144.m14031(r144.f12166, r144.f12183, r144.f12164);
        }
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r145 = this.f859;
        int i2 = this.f851;
        if (r145.f12178 != i2) {
            r145.f12178 = i2;
            float f = r145.f12170;
            r145.f12170 = f;
            Matrix matrix = r145.f12161;
            r145.m14032(f, matrix);
            r145.f12167.setImageMatrix(matrix);
        }
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r146 = this.f859;
        r146.f12159 = r9;
        if (r146 == null) {
            this.f859 = m997();
        }
        C2652 r147 = this.f859;
        r147.f12184 = r5;
        if (r147 == null) {
            this.f859 = m997();
        }
        this.f859.f12176 = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f856 != colorStateList) {
            this.f856 = colorStateList;
            if (this.f859 == null) {
                this.f859 = m997();
            }
            this.f859.m14026(this.f856);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final CoordinatorLayout.C3238If<FloatingActionButton> m995() {
        return new Behavior();
    }

    public ColorStateList getBackgroundTintList() {
        return this.f861;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f861 != colorStateList) {
            this.f861 = colorStateList;
            if (this.f859 == null) {
                this.f859 = m997();
            }
            C2652 r0 = this.f859;
            if (r0.f12163 != null) {
                r0.f12163.setTintList(colorStateList);
            }
            if (r0.f12158 != null) {
                r0.f12158.m14483(colorStateList);
            }
        }
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f849;
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f849 != mode) {
            this.f849 = mode;
            if (this.f859 == null) {
                this.f859 = m997();
            }
            C2652 r0 = this.f859;
            if (r0.f12163 != null) {
                r0.f12163.setTintMode(mode);
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f855 != colorStateList) {
            this.f855 = colorStateList;
            m986();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public ColorStateList m990() {
        return this.f855;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f852 != mode) {
            this.f852 = mode;
            m986();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public PorterDuff.Mode m989() {
        return this.f852;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private void m986() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f855;
            if (colorStateList == null) {
                C1266.m8159(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f852;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C1641.m9447(colorForState, mode));
        }
    }

    public void setImageResource(int i) {
        this.f848.m4448(i);
        m986();
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            if (this.f859 == null) {
                this.f859 = m997();
            }
            C2652 r3 = this.f859;
            float f = r3.f12170;
            r3.f12170 = f;
            Matrix matrix = r3.f12161;
            r3.m14032(f, matrix);
            r3.f12167.setImageMatrix(matrix);
            if (this.f855 != null) {
                m986();
            }
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m994() {
        return this.f858.f9886;
    }

    public void setExpandedComponentIdHint(int i) {
        this.f858.f9885 = i;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f847 != z) {
            this.f847 = z;
            if (this.f859 == null) {
                this.f859 = m997();
            }
            this.f859.m14046();
        }
    }

    public void setSize(int i) {
        this.f862 = 0;
        if (i != this.f857) {
            this.f857 = i;
            requestLayout();
        }
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f862) {
            this.f862 = i;
            requestLayout();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m992(int i) {
        while (true) {
            int i2 = this.f862;
            if (i2 != 0) {
                return i2;
            }
            Resources resources = getResources();
            if (i == -1) {
                i = Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? 1 : 0;
            } else if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.f158132131165300);
            } else {
                return resources.getDimensionPixelSize(R.dimen.f158122131165299);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        if (r0.f12163 != null) {
            C2745.m14514((View) r0.f12167, r0.f12163);
        }
        if (r0.m14044()) {
            ViewTreeObserver viewTreeObserver = r0.f12167.getViewTreeObserver();
            if (r0.f12177 == null) {
                r0.f12177 = r0;
            }
            viewTreeObserver.addOnPreDrawListener(r0.f12177);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        ViewTreeObserver viewTreeObserver = r0.f12167.getViewTreeObserver();
        if (r0.f12177 != null) {
            viewTreeObserver.removeOnPreDrawListener(r0.f12177);
            r0.f12177 = null;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14029(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14036();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C0808 r1 = new C0808(onSaveInstanceState);
        C0910<String, Bundle> r0 = r1.f5287;
        C1975 r2 = this.f858;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", r2.f9886);
        bundle.putInt("expandedComponentIdHint", r2.f9885);
        r0.put("expandableWidgetHelper", bundle);
        return r1;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0808)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0808 r3 = (C0808) parcelable;
        super.onRestoreInstanceState(r3.f6905);
        C1975 r0 = this.f858;
        Bundle bundle = r3.f5287.get("expandableWidgetHelper");
        if (bundle != null) {
            r0.m10714(bundle);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m991(Rect rect) {
        rect.left += this.f853.left;
        rect.top += this.f853.top;
        rect.right -= this.f853.right;
        rect.bottom -= this.f853.bottom;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m987(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f860;
            if (C0293.m4186(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                m991(rect);
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f860.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.C0016 r1) {
            super.onAttachedToLayoutParams(r1);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ boolean m1007(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ boolean m1008(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ boolean m1009(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C3238If<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private Rect f865;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f866;

        public BaseBehavior() {
            this.f866 = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5590);
            this.f866 = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public void onAttachedToLayoutParams(CoordinatorLayout.C0016 r2) {
            if (r2.f163 == 0) {
                r2.f163 = 80;
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            boolean z;
            if (view instanceof AppBarLayout) {
                m1002(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0016) {
                    z = ((CoordinatorLayout.C0016) layoutParams).f162 instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    m1001(view, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: ι  reason: contains not printable characters */
        private boolean m1003(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0016 r0 = (CoordinatorLayout.C0016) floatingActionButton.getLayoutParams();
            if (this.f866 && r0.f177 == view.getId() && floatingActionButton.f14562 == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean m1002(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m1003(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f865 == null) {
                this.f865 = new Rect();
            }
            Rect rect = this.f865;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            C2715.m14418(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m826()) {
                floatingActionButton.m993((Cif) null, false);
                return true;
            }
            floatingActionButton.m996();
            return true;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private boolean m1001(View view, FloatingActionButton floatingActionButton) {
            if (!m1003(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0016) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m993((Cif) null, false);
                return true;
            }
            if (floatingActionButton.f859 == null) {
                floatingActionButton.f859 = floatingActionButton.m997();
            }
            floatingActionButton.f859.m14028((C2652.C2653) null, false);
            return true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            boolean z;
            List<View> r0 = coordinatorLayout.m144((View) floatingActionButton);
            int size = r0.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = r0.get(i4);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0016) {
                        z = ((CoordinatorLayout.C0016) layoutParams).f162 instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && m1001(view, floatingActionButton)) {
                        break;
                    }
                } else if (m1002(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m142(floatingActionButton, i);
            Rect rect = floatingActionButton.f853;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.C0016 r02 = (CoordinatorLayout.C0016) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - r02.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= r02.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - r02.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= r02.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                C0293.m4164((View) floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            C0293.m4221(floatingActionButton, i2);
            return true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f853;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        if (r0.f12163 != null) {
            C0671 r02 = r0.f12163;
            if (r02.f4785.f4803 != f) {
                r02.f4785.f4803 = f;
                r02.m5521();
            }
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1091.m7459(getContext(), i));
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1091.m7459(getContext(), i));
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$ɩ  reason: contains not printable characters */
    public class C0072<T extends FloatingActionButton> implements C2652.C2654 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C1122<T> f869;

        public C0072(C1122<T> r2) {
            this.f869 = r2;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m1016() {
            this.f869.m7544(FloatingActionButton.this);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1015() {
            this.f869.m7545(FloatingActionButton.this);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C0072) && ((C0072) obj).f869.equals(this.f869);
        }

        public final int hashCode() {
            return this.f869.hashCode();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14025();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14025();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14025();
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14040();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14040();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final C2652 m997() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C2824(this, new C0071());
        }
        return new C2652(this, new C0071());
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$ǃ  reason: contains not printable characters */
    class C0071 implements C0429 {
        C0071() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1013(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f853.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f850, i2 + FloatingActionButton.this.f850, i3 + FloatingActionButton.this.f850, i4 + FloatingActionButton.this.f850);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1012(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m1014() {
            return FloatingActionButton.this.f847;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int r0 = m992(this.f857);
        this.f850 = (r0 - this.f851) / 2;
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14045();
        int min = Math.min(m987(r0, i), m987(r0, i2));
        setMeasuredDimension(this.f853.left + min + this.f853.right, min + this.f853.top + this.f853.bottom);
    }

    public void setShapeAppearanceModel(C0785 r2) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14033(r2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        if (z != this.f859.f12176) {
            if (this.f859 == null) {
                this.f859 = m997();
            }
            this.f859.f12176 = z;
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m996() {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14028((C2652.C2653) null, false);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m998() {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.m14043((C2652.C2653) null, true);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m993(final Cif ifVar, boolean z) {
        AnonymousClass5 r3;
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        if (ifVar == null) {
            r3 = null;
        } else {
            r3 = new C2652.C2653() {
                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m999() {
                    ifVar.m1011();
                }

                /* renamed from: ι  reason: contains not printable characters */
                public final void m1000() {
                    ifVar.m1010(FloatingActionButton.this);
                }
            };
        }
        r0.m14043(r3, z);
    }

    public void setCompatElevation(float f) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        if (r0.f12166 != f) {
            r0.f12166 = f;
            r0.m14031(r0.f12166, r0.f12183, r0.f12164);
        }
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        if (r0.f12183 != f) {
            r0.f12183 = f;
            r0.m14031(r0.f12166, r0.f12183, r0.f12164);
        }
    }

    public void setCompatPressedTranslationZ(float f) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        if (r0.f12164 != f) {
            r0.f12164 = f;
            r0.m14031(r0.f12166, r0.f12183, r0.f12164);
        }
    }

    public void setShowMotionSpec(C1091 r2) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.f12159 = r2;
    }

    public void setHideMotionSpec(C1091 r2) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        this.f859.f12184 = r2;
    }

    public void setShadowPaddingEnabled(boolean z) {
        if (this.f859 == null) {
            this.f859 = m997();
        }
        C2652 r0 = this.f859;
        r0.f12181 = z;
        r0.m14045();
    }
}
