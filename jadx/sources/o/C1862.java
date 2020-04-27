package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.ArrayList;
import o.C0520;
import o.C0858;

/* renamed from: o.Ιϵ  reason: contains not printable characters */
public final class C1862 extends C2978 {

    /* renamed from: ı  reason: contains not printable characters */
    final C1864 f9506;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f9507;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f9508;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f9509;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f9510;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f9511;

    /* renamed from: і  reason: contains not printable characters */
    private C1865 f9512;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f9513;

    /* renamed from: o.Ιϵ$If */
    public interface If {
    }

    public final void setOnCheckedChangeListener(If ifR) {
    }

    /* renamed from: o.Ιϵ$ı  reason: contains not printable characters */
    public static class C1863 extends ViewGroup.MarginLayoutParams {
        public C1863(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1863(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1863() {
            super(-2, -2);
        }
    }

    public C1862(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1862(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f149932130968770);
    }

    public C1862(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9506 = new C1864(this, (byte) 0);
        this.f9512 = new C1865(this, (byte) 0);
        this.f9507 = -1;
        this.f9511 = false;
        int[] iArr = C0858.Aux.f5607;
        C3160.m15978(context, attributeSet, i, R.style.f175082131952261);
        C3160.m15976(context, attributeSet, iArr, i, R.style.f175082131952261, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175082131952261);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(obtainStyledAttributes.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(obtainStyledAttributes.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(obtainStyledAttributes.getBoolean(5, false));
        setSingleSelection(obtainStyledAttributes.getBoolean(6, false));
        setSelectionRequired(obtainStyledAttributes.getBoolean(4, false));
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f9507 = resourceId;
        }
        obtainStyledAttributes.recycle();
        super.setOnHierarchyChangeListener(this.f9512);
        C0293.m4203((View) this, 1);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0520 r5 = C0520.m4998(accessibilityNodeInfo);
        if (super.m15301()) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof C1594) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        r5.m5035((Object) C0520.C0521.m5076(m15304(), i, false, this.f9508 ? 1 : 2));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1863(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1863(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1863();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1863);
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9512.f9516 = onHierarchyChangeListener;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f9507;
        if (i != -1) {
            View findViewById = findViewById(i);
            if (findViewById instanceof C1594) {
                this.f9511 = true;
                ((C1594) findViewById).setChecked(true);
                this.f9511 = false;
            }
            this.f9507 = this.f9507;
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C1594) {
            C1594 r0 = (C1594) view;
            if (r0.isChecked()) {
                int i2 = this.f9507;
                if (i2 != -1 && this.f9508) {
                    View findViewById = findViewById(i2);
                    if (findViewById instanceof C1594) {
                        this.f9511 = true;
                        ((C1594) findViewById).setChecked(false);
                        this.f9511 = false;
                    }
                }
                this.f9507 = r0.getId();
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Deprecated
    public final void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public final void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public final void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public final void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public final void setChipSpacingHorizontal(int i) {
        if (this.f9509 != i) {
            this.f9509 = i;
            m15302(i);
            requestLayout();
        }
    }

    public final void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public final void setChipSpacingVertical(int i) {
        if (this.f9513 != i) {
            this.f9513 = i;
            m15303(i);
            requestLayout();
        }
    }

    public final void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10241() {
        return super.m15301();
    }

    public final void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public final void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public final void setSingleSelection(boolean z) {
        if (this.f9508 != z) {
            this.f9508 = z;
            this.f9511 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C1594) {
                    ((C1594) childAt).setChecked(false);
                }
            }
            this.f9511 = false;
            this.f9507 = -1;
        }
    }

    public final void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public final void setSelectionRequired(boolean z) {
        this.f9510 = z;
    }

    /* renamed from: o.Ιϵ$ǃ  reason: contains not printable characters */
    class C1864 implements CompoundButton.OnCheckedChangeListener {
        private C1864() {
        }

        /* synthetic */ C1864(C1862 r1, byte b) {
            this();
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!C1862.this.f9511) {
                C1862 r0 = C1862.this;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < r0.getChildCount(); i++) {
                    View childAt = r0.getChildAt(i);
                    if ((childAt instanceof C1594) && ((C1594) childAt).isChecked()) {
                        arrayList.add(Integer.valueOf(childAt.getId()));
                        if (r0.f9508) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty() || !C1862.this.f9510) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(C1862.this.f9507 == -1 || C1862.this.f9507 == id || !C1862.this.f9508)) {
                            C1862 r8 = C1862.this;
                            View findViewById = r8.findViewById(r8.f9507);
                            if (findViewById instanceof C1594) {
                                r8.f9511 = true;
                                ((C1594) findViewById).setChecked(false);
                                r8.f9511 = false;
                            }
                        }
                        C1862.this.f9507 = id;
                    } else if (C1862.this.f9507 == id) {
                        C1862.this.f9507 = -1;
                    }
                } else {
                    C1862 r82 = C1862.this;
                    View findViewById2 = r82.findViewById(compoundButton.getId());
                    if (findViewById2 instanceof C1594) {
                        r82.f9511 = true;
                        ((C1594) findViewById2).setChecked(true);
                        r82.f9511 = false;
                    }
                    C1862.this.f9507 = compoundButton.getId();
                }
            }
        }
    }

    /* renamed from: o.Ιϵ$ɩ  reason: contains not printable characters */
    class C1865 implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: ɩ  reason: contains not printable characters */
        ViewGroup.OnHierarchyChangeListener f9516;

        private C1865() {
        }

        /* synthetic */ C1865(C1862 r1, byte b) {
            this();
        }

        public final void onChildViewAdded(View view, View view2) {
            int i;
            if (view == C1862.this && (view2 instanceof C1594)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((C1594) view2).f8451 = C1862.this.f9506;
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9516;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            if (view == C1862.this && (view2 instanceof C1594)) {
                ((C1594) view2).f8451 = null;
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f9516;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }
}
