package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C0293;
import o.C0299;
import o.C0785;
import o.C0858;
import o.C1091;
import o.C1561;
import o.C1579;
import o.C1652;
import o.C1676;
import o.C2134;
import o.C2179;
import o.C2551;
import o.C2715;
import o.C2857;
import o.C3160;
import o.R;

public final class ExtendedFloatingActionButton extends C1579 implements CoordinatorLayout.Cif {

    /* renamed from: ɾ  reason: contains not printable characters */
    public static final Property<View, Float> f822 = new Property<View, Float>(Float.class, "height") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    };

    /* renamed from: ӏ  reason: contains not printable characters */
    public static final Property<View, Float> f823 = new Property<View, Float>(Float.class, "width") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    };

    /* renamed from: ŀ  reason: contains not printable characters */
    private final CoordinatorLayout.C3238If<ExtendedFloatingActionButton> f824;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final C2857 f825;

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean f826;

    /* renamed from: ɨ  reason: contains not printable characters */
    final C2857 f827;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C2134 f828;

    /* renamed from: ɹ  reason: contains not printable characters */
    final C2857 f829;

    /* renamed from: І  reason: contains not printable characters */
    int f830;

    /* renamed from: і  reason: contains not printable characters */
    final C2857 f831;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$if  reason: invalid class name */
    interface Cif {
        /* renamed from: ı  reason: contains not printable characters */
        int m968();

        /* renamed from: ǃ  reason: contains not printable characters */
        int m969();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ı  reason: contains not printable characters */
    public static abstract class C0068 {

        /* renamed from: ı  reason: contains not printable characters */
        private Map<C1676, SubMenu> f841;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Map<C1561, MenuItem> f842;

        /* renamed from: Ι  reason: contains not printable characters */
        public final Context f843;

        public C0068() {
        }

        public C0068(Context context) {
            this.f843 = context;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final MenuItem m973(MenuItem menuItem) {
            if (!(menuItem instanceof C1561)) {
                return menuItem;
            }
            C1561 r0 = (C1561) menuItem;
            if (this.f842 == null) {
                this.f842 = new C0299();
            }
            MenuItem menuItem2 = this.f842.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            C2179 r3 = new C2179(this.f843, r0);
            this.f842.put(r0, r3);
            return r3;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final SubMenu m974(SubMenu subMenu) {
            if (!(subMenu instanceof C1676)) {
                return subMenu;
            }
            C1676 r3 = (C1676) subMenu;
            if (this.f841 == null) {
                this.f841 = new C0299();
            }
            SubMenu subMenu2 = this.f841.get(r3);
            if (subMenu2 != null) {
                return subMenu2;
            }
            C1652 r0 = new C1652(this.f843, r3);
            this.f841.put(r3, r0);
            return r0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m971() {
            Map<C1561, MenuItem> map = this.f842;
            if (map != null) {
                map.clear();
            }
            Map<C1676, SubMenu> map2 = this.f841;
            if (map2 != null) {
                map2.clear();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m970(int i) {
            Map<C1561, MenuItem> map = this.f842;
            if (map != null) {
                Iterator<C1561> it = map.keySet().iterator();
                while (it.hasNext()) {
                    if (i == it.next().getGroupId()) {
                        it.remove();
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m972(int i) {
            Map<C1561, MenuItem> map = this.f842;
            if (map != null) {
                Iterator<C1561> it = map.keySet().iterator();
                while (it.hasNext()) {
                    if (i == it.next().getItemId()) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f151362130968925);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1091 r3;
        C1091 r4;
        C1091 r6;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        this.f830 = 0;
        this.f828 = new C2134();
        this.f831 = new C0069(this.f828);
        this.f827 = new C0070(this.f828);
        this.f826 = true;
        this.f824 = new ExtendedFloatingActionButtonBehavior(context, attributeSet);
        int[] iArr = C0858.Aux.f5592;
        C3160.m15978(context, attributeSet, i, R.style.f175132131952266);
        C3160.m15976(context, attributeSet, iArr, i, R.style.f175132131952266, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175132131952266);
        C1091 r5 = null;
        if (!obtainStyledAttributes.hasValue(3) || (resourceId4 = obtainStyledAttributes.getResourceId(3, 0)) == 0) {
            r3 = null;
        } else {
            r3 = C1091.m7459(context, resourceId4);
        }
        if (!obtainStyledAttributes.hasValue(2) || (resourceId3 = obtainStyledAttributes.getResourceId(2, 0)) == 0) {
            r4 = null;
        } else {
            r4 = C1091.m7459(context, resourceId3);
        }
        if (!obtainStyledAttributes.hasValue(1) || (resourceId2 = obtainStyledAttributes.getResourceId(1, 0)) == 0) {
            r6 = null;
        } else {
            r6 = C1091.m7459(context, resourceId2);
        }
        if (obtainStyledAttributes.hasValue(4) && (resourceId = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            r5 = C1091.m7459(context, resourceId);
        }
        C2134 r7 = new C2134();
        this.f825 = new If(r7, new Cif() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final int m957() {
                return ExtendedFloatingActionButton.this.getMeasuredWidth();
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final int m956() {
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }
        }, true);
        this.f829 = new If(r7, new Cif() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final int m955() {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                return (Math.min(C0293.m4184(extendedFloatingActionButton), C0293.m4173(extendedFloatingActionButton)) << 1) + extendedFloatingActionButton.f8421;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final int m954() {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                return (Math.min(C0293.m4184(extendedFloatingActionButton), C0293.m4173(extendedFloatingActionButton)) << 1) + extendedFloatingActionButton.f8421;
            }
        }, false);
        this.f831.m14838(r3);
        this.f827.m14838(r4);
        this.f825.m14838(r6);
        this.f829.m14838(r5);
        obtainStyledAttributes.recycle();
        setShapeAppearanceModel(new C0785(C0785.m6131(context, attributeSet, i, R.style.f175132131952266, C0785.f5213), (byte) 0));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f826 && TextUtils.isEmpty(getText()) && this.f8418 != null) {
            this.f826 = false;
            this.f829.m14842();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final CoordinatorLayout.C3238If<ExtendedFloatingActionButton> m953() {
        return this.f824;
    }

    public final void setExtended(boolean z) {
        if (this.f826 != z) {
            C2857 r2 = z ? this.f825 : this.f829;
            if (!r2.m14841()) {
                r2.m14842();
            }
        }
    }

    public final void setShowMotionSpec(C1091 r2) {
        this.f831.m14838(r2);
    }

    public final void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1091.m7459(getContext(), i));
    }

    public final void setHideMotionSpec(C1091 r2) {
        this.f827.m14838(r2);
    }

    public final void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1091.m7459(getContext(), i));
    }

    public final void setExtendMotionSpec(C1091 r2) {
        this.f825.m14838(r2);
    }

    public final void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1091.m7459(getContext(), i));
    }

    public final void setShrinkMotionSpec(C1091 r2) {
        this.f829.m14838(r2);
    }

    public final void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1091.m7459(getContext(), i));
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C3238If<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private boolean f835;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Rect f836;

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f837;

        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        public /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m961(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0016) {
                    z = ((CoordinatorLayout.C0016) layoutParams).f162 instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    m959(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.f837 = false;
            this.f835 = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5617);
            this.f837 = obtainStyledAttributes.getBoolean(0, false);
            this.f835 = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public void onAttachedToLayoutParams(CoordinatorLayout.C0016 r2) {
            if (r2.f163 == 0) {
                r2.f163 = 80;
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean m960(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0016 r4 = (CoordinatorLayout.C0016) extendedFloatingActionButton.getLayoutParams();
            if ((this.f837 || this.f835) && r4.f177 == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean m961(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            C2857 r5;
            C2857 r52;
            if (!m960(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f836 == null) {
                this.f836 = new Rect();
            }
            Rect rect = this.f836;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            C2715.m14418(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m826()) {
                if (this.f835) {
                    r52 = extendedFloatingActionButton.f829;
                } else {
                    r52 = extendedFloatingActionButton.f827;
                }
                ExtendedFloatingActionButton.m952(extendedFloatingActionButton, r52);
                return true;
            }
            if (this.f835) {
                r5 = extendedFloatingActionButton.f825;
            } else {
                r5 = extendedFloatingActionButton.f831;
            }
            ExtendedFloatingActionButton.m952(extendedFloatingActionButton, r5);
            return true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean m959(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            C2857 r3;
            C2857 r32;
            if (!m960(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0016) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (this.f835) {
                    r32 = extendedFloatingActionButton.f829;
                } else {
                    r32 = extendedFloatingActionButton.f827;
                }
                ExtendedFloatingActionButton.m952(extendedFloatingActionButton, r32);
                return true;
            }
            if (this.f835) {
                r3 = extendedFloatingActionButton.f825;
            } else {
                r3 = extendedFloatingActionButton.f831;
            }
            ExtendedFloatingActionButton.m952(extendedFloatingActionButton, r3);
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            boolean z;
            List<View> r0 = coordinatorLayout.m144((View) extendedFloatingActionButton);
            int size = r0.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = r0.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0016) {
                        z = ((CoordinatorLayout.C0016) layoutParams).f162 instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && m959(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m961(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m142(extendedFloatingActionButton, i);
            return true;
        }
    }

    class If extends C2551 {

        /* renamed from: ı  reason: contains not printable characters */
        private final boolean f838;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Cif f839;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final int m963() {
            return R.animator.f148032130837514;
        }

        If(C2134 r2, Cif ifVar, boolean z) {
            super(ExtendedFloatingActionButton.this, r2);
            this.f839 = ifVar;
            this.f838 = z;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m967() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f826 = this.f838;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams != null) {
                if (this.f838) {
                    ExtendedFloatingActionButton.this.measure(0, 0);
                }
                layoutParams.width = this.f839.m969();
                layoutParams.height = this.f839.m968();
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final AnimatorSet m962() {
            C1091 r0 = m13611();
            if (r0.f6499.get("width") != null) {
                PropertyValuesHolder[] r1 = r0.m7462("width");
                r1[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f839.m969()});
                r0.f6499.put("width", r1);
            }
            if (r0.f6499.get("height") != null) {
                PropertyValuesHolder[] r12 = r0.m7462("height");
                r12[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f839.m968()});
                r0.f6499.put("height", r12);
            }
            return super.m13615(r0);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m964(Animator animator) {
            super.m13612(animator);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f826 = this.f838;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m965() {
            super.m13613();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m966() {
            return this.f838 == ExtendedFloatingActionButton.this.f826 || ExtendedFloatingActionButton.this.f8418 == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ǃ  reason: contains not printable characters */
    class C0069 extends C2551 {
        /* renamed from: Ɩ  reason: contains not printable characters */
        public final int m975() {
            return R.animator.f148052130837516;
        }

        public C0069(C2134 r2) {
            super(ExtendedFloatingActionButton.this, r2);
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m979() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m976(Animator animator) {
            super.m13612(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f830 = 2;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m977() {
            super.m13613();
            ExtendedFloatingActionButton.this.f830 = 0;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m978() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return extendedFloatingActionButton.getVisibility() != 0 ? extendedFloatingActionButton.f830 == 2 : extendedFloatingActionButton.f830 != 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ɩ  reason: contains not printable characters */
    class C0070 extends C2551 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f846;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final int m980() {
            return R.animator.f148042130837515;
        }

        public C0070(C2134 r2) {
            super(ExtendedFloatingActionButton.this, r2);
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final void m985() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: і  reason: contains not printable characters */
        public final boolean m984() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return extendedFloatingActionButton.getVisibility() == 0 ? extendedFloatingActionButton.f830 == 1 : extendedFloatingActionButton.f830 != 2;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m981(Animator animator) {
            super.m13612(animator);
            this.f846 = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f830 = 1;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m983() {
            super.m13616();
            this.f846 = true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m982() {
            super.m13613();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f830 = 0;
            if (!this.f846) {
                extendedFloatingActionButton.setVisibility(8);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static /* synthetic */ void m952(ExtendedFloatingActionButton extendedFloatingActionButton, final C2857 r3) {
        if (!r3.m14841()) {
            if (!(C0293.m4186(extendedFloatingActionButton) && !extendedFloatingActionButton.isInEditMode())) {
                r3.m14842();
                return;
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet r2 = r3.m14834();
            r2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C2857.this.m14836(animator);
                }

                public final void onAnimationCancel(Animator animator) {
                    C2857.this.m14839();
                }

                public final void onAnimationEnd(Animator animator) {
                    C2857.this.m14837();
                }
            });
            for (Animator.AnimatorListener addListener : r3.m14840()) {
                r2.addListener(addListener);
            }
            r2.start();
        }
    }
}
