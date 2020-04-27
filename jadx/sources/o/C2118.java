package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import o.C1483;
import o.C2328;
import o.C2958;

/* renamed from: o.τ  reason: contains not printable characters */
public class C2118 extends C2958 implements C2328.If, C1429 {

    /* renamed from: ı  reason: contains not printable characters */
    C2348 f10244;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f10245;

    /* renamed from: ǃ  reason: contains not printable characters */
    C2328 f10246;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f10247;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f10248;

    /* renamed from: ɩ  reason: contains not printable characters */
    Cif f10249;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f10250;

    /* renamed from: Ι  reason: contains not printable characters */
    C2328.Cif f10251;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f10252;

    /* renamed from: І  reason: contains not printable characters */
    private C1483.C1484 f10253;

    /* renamed from: і  reason: contains not printable characters */
    private Context f10254;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f10255;

    /* renamed from: o.τ$If */
    public interface If {
        boolean a_();

        /* renamed from: Ι  reason: contains not printable characters */
        boolean m11286();
    }

    /* renamed from: o.τ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ι  reason: contains not printable characters */
        boolean m11287(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public C2118(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2118(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f10248 = (int) (56.0f * f);
        this.f10247 = (int) (f * 4.0f);
        this.f10254 = context;
        this.f10250 = 0;
    }

    public void setPopupTheme(int i) {
        if (this.f10250 != i) {
            this.f10250 = i;
            if (i == 0) {
                this.f10254 = getContext();
            } else {
                this.f10254 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C2348 r1) {
        this.f10244 = r1;
        C2348 r12 = this.f10244;
        r12.f6333 = this;
        this.f10246 = r12.f6336;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2348 r2 = this.f10244;
        if (r2 != null) {
            r2.m7317(false);
            if (this.f10244.m12286()) {
                this.f10244.m12291();
                this.f10244.m12296();
            }
        }
    }

    public void setOnMenuItemClickListener(Cif ifVar) {
        this.f10249 = ifVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        C2328 r2;
        boolean z3 = this.f10245;
        this.f10245 = View.MeasureSpec.getMode(i) == 1073741824;
        if (z3 != this.f10245) {
            this.f10255 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f10245 || (r2 = this.f10246) == null || size == this.f10255)) {
            this.f10255 = size;
            r2.m12149(true);
        }
        int childCount = getChildCount();
        if (!this.f10245 || childCount <= 0) {
            int i9 = i2;
            for (int i10 = 0; i10 < childCount; i10++) {
                C2119 r3 = (C2119) getChildAt(i10).getLayoutParams();
                r3.rightMargin = 0;
                r3.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = size2 - paddingLeft;
        int i12 = this.f10248;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount2 = getChildCount();
        int i16 = i13;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z4 = false;
        int i20 = 0;
        long j = 0;
        int i21 = 0;
        while (i17 < childCount2) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof C0666;
                int i22 = i20 + 1;
                if (z5) {
                    int i23 = this.f10247;
                    i7 = size3;
                    z2 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i7 = size3;
                    z2 = false;
                }
                C2119 r5 = (C2119) childAt.getLayoutParams();
                r5.f10261 = z2;
                r5.f10257 = z2 ? 1 : 0;
                r5.f10259 = z2;
                r5.f10258 = z2;
                r5.leftMargin = z2;
                r5.rightMargin = z2;
                r5.f10260 = z5 && (TextUtils.isEmpty(((C0666) childAt).getText()) ^ true);
                int i24 = r5.f10256 ? 1 : i16;
                int i25 = i22;
                C2119 r15 = (C2119) childAt.getLayoutParams();
                i5 = i11;
                i6 = paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                C0666 r4 = z5 ? (C0666) childAt : null;
                boolean z6 = r4 != null && (TextUtils.isEmpty(r4.getText()) ^ true);
                if (i24 <= 0 || (z6 && i24 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i24 * i15, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i15;
                    if (measuredWidth % i15 != 0) {
                        i8++;
                    }
                    if (z6 && i8 < 2) {
                        i8 = 2;
                    }
                }
                r15.f10258 = !r15.f10256 && z6;
                r15.f10259 = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i15, 1073741824), makeMeasureSpec);
                int max = Math.max(i18, i8);
                if (r5.f10258) {
                    i19++;
                }
                if (r5.f10256) {
                    z4 = true;
                }
                i16 -= i8;
                int max2 = Math.max(i21, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    i18 = max;
                    i21 = max2;
                    j |= (long) (1 << i17);
                } else {
                    i18 = max;
                    i21 = max2;
                }
                i20 = i25;
            } else {
                i5 = i11;
                i7 = size3;
                i6 = paddingTop;
                int i26 = i21;
            }
            i17++;
            size3 = i7;
            paddingTop = i6;
            i11 = i5;
        }
        int i27 = i11;
        int i28 = size3;
        int i29 = i21;
        boolean z7 = z4 && i20 == 2;
        int i30 = i16;
        boolean z8 = false;
        while (true) {
            if (i19 > 0 && i30 > 0) {
                int i31 = 0;
                int i32 = 0;
                int i33 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i31 < childCount2) {
                    int i34 = i29;
                    C2119 r42 = (C2119) getChildAt(i31).getLayoutParams();
                    boolean z9 = z8;
                    if (r42.f10258) {
                        if (r42.f10259 < i33) {
                            j2 = 1 << i31;
                            i33 = r42.f10259;
                            i32 = 1;
                        } else if (r42.f10259 == i33) {
                            i32++;
                            j2 |= 1 << i31;
                        }
                    }
                    i31++;
                    z8 = z9;
                    i29 = i34;
                }
                i3 = i29;
                z = z8;
                j |= j2;
                if (i32 > i30) {
                    break;
                }
                int i35 = i33 + 1;
                int i36 = i30;
                int i37 = 0;
                while (i37 < childCount2) {
                    View childAt2 = getChildAt(i37);
                    C2119 r6 = (C2119) childAt2.getLayoutParams();
                    int i38 = i19;
                    int i39 = childMeasureSpec;
                    long j3 = (long) (1 << i37);
                    if ((j2 & j3) != 0) {
                        if (z7 && r6.f10260 && i36 == 1) {
                            int i40 = this.f10247;
                            childAt2.setPadding(i40 + i15, 0, i40, 0);
                        }
                        r6.f10259++;
                        r6.f10261 = true;
                        i36--;
                    } else if (r6.f10259 == i35) {
                        j |= j3;
                    }
                    i37++;
                    i19 = i38;
                    childMeasureSpec = i39;
                }
                i30 = i36;
                i29 = i3;
                z8 = true;
            } else {
                i3 = i29;
                z = z8;
            }
        }
        int i41 = childMeasureSpec;
        boolean z10 = !z4 && i20 == 1;
        if (i30 > 0 && j != 0 && (i30 < i20 - 1 || z10 || i18 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C2119) getChildAt(0).getLayoutParams()).f10260) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount2 - 1;
                if ((j & ((long) (1 << i42))) != 0 && !((C2119) getChildAt(i42).getLayoutParams()).f10260) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) (((float) (i30 * i15)) / bitCount) : 0;
            boolean z11 = z;
            for (int i44 = 0; i44 < childCount2; i44++) {
                if ((j & ((long) (1 << i44))) != 0) {
                    View childAt3 = getChildAt(i44);
                    C2119 r8 = (C2119) childAt3.getLayoutParams();
                    if (childAt3 instanceof C0666) {
                        r8.f10257 = i43;
                        r8.f10261 = true;
                        if (i44 == 0 && !r8.f10260) {
                            r8.leftMargin = (-i43) / 2;
                        }
                    } else if (r8.f10256) {
                        r8.f10257 = i43;
                        r8.f10261 = true;
                        r8.rightMargin = (-i43) / 2;
                    } else {
                        if (i44 != 0) {
                            r8.leftMargin = i43 / 2;
                        }
                        if (i44 != childCount2 - 1) {
                            r8.rightMargin = i43 / 2;
                        }
                    }
                    z11 = true;
                }
            }
            z = z11;
        }
        if (z) {
            int i45 = 0;
            while (i45 < childCount2) {
                View childAt4 = getChildAt(i45);
                C2119 r43 = (C2119) childAt4.getLayoutParams();
                if (r43.f10261) {
                    i4 = i41;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((r43.f10259 * i15) + r43.f10257, 1073741824), i4);
                } else {
                    i4 = i41;
                }
                i45++;
                i41 = i4;
            }
        }
        setMeasuredDimension(i27, mode != 1073741824 ? i3 : i28);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f10245) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean r6 = C2373.m12363(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C2119 r11 = (C2119) childAt.getLayoutParams();
                if (r11.f10256) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m11282(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (r6) {
                        i7 = getPaddingLeft() + r11.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - r11.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + r11.leftMargin) + r11.rightMargin;
                    m11282(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (r6) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C2119 r7 = (C2119) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !r7.f10256) {
                    int i19 = width - r7.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + r7.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            C2119 r72 = (C2119) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !r72.f10256) {
                int i21 = paddingLeft + r72.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + r72.rightMargin + max;
            }
            i6++;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2348 r0 = this.f10244;
        if (r0 != null) {
            r0.m12291();
            if (r0.f10867 != null) {
                r0.f10867.m14216();
            }
        }
    }

    public void setOverflowIcon(Drawable drawable) {
        m11283();
        C2348 r0 = this.f10244;
        if (r0.f10875 != null) {
            r0.f10875.setImageDrawable(drawable);
            return;
        }
        r0.f10864 = true;
        r0.f10869 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f10252 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    protected static C2119 m11280(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C2119 r1 = layoutParams instanceof C2119 ? new C2119((C2119) layoutParams) : new C2119(layoutParams);
            if (r1.f13691 <= 0) {
                r1.f13691 = 16;
            }
            return r1;
        }
        C2119 r2 = new C2119();
        r2.f13691 = 16;
        return r2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2119;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11285(C2459 r4) {
        return this.f10246.m12143(r4, (C1483) null, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11284(C2328 r1) {
        this.f10246 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Menu m11283() {
        if (this.f10246 == null) {
            Context context = getContext();
            this.f10246 = new C2328(context);
            this.f10246.m12148((C2328.Cif) new C2121());
            this.f10244 = new C2348(context);
            C2348 r0 = this.f10244;
            r0.f10873 = true;
            r0.f10866 = true;
            C1483.C1484 r2 = this.f10253;
            if (r2 == null) {
                r2 = new C2120();
            }
            r0.f6330 = r2;
            C2328 r02 = this.f10246;
            C2348 r22 = this.f10244;
            Context context2 = this.f10254;
            r02.f10807.add(new WeakReference(r22));
            r22.m8873(context2, r02);
            r02.f10817 = true;
            C2348 r03 = this.f10244;
            r03.f6333 = this;
            this.f10246 = r03.f6336;
        }
        return this.f10246;
    }

    public void setMenuCallbacks(C1483.C1484 r1, C2328.Cif ifVar) {
        this.f10253 = r1;
        this.f10251 = ifVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m11282(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof If)) {
            z = false | ((If) childAt).a_();
        }
        return (i <= 0 || !(childAt2 instanceof If)) ? z : z | ((If) childAt2).m11286();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f10244.f10870 = z;
    }

    /* renamed from: o.τ$ɩ  reason: contains not printable characters */
    class C2121 implements C2328.Cif {
        C2121() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m11290(C2328 r1, MenuItem menuItem) {
            return C2118.this.f10249 != null && C2118.this.f10249.m11287(menuItem);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m11291(C2328 r2) {
            if (C2118.this.f10251 != null) {
                C2118.this.f10251.m12161(r2);
            }
        }
    }

    /* renamed from: o.τ$ǃ  reason: contains not printable characters */
    static class C2120 implements C1483.C1484 {
        /* renamed from: ı  reason: contains not printable characters */
        public final void m11288(C2328 r1, boolean z) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m11289(C2328 r1) {
            return false;
        }

        C2120() {
        }
    }

    /* renamed from: o.τ$ı  reason: contains not printable characters */
    public static class C2119 extends C2958.C2959 {
        @ViewDebug.ExportedProperty

        /* renamed from: ı  reason: contains not printable characters */
        public boolean f10256;
        @ViewDebug.ExportedProperty

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f10257;
        @ViewDebug.ExportedProperty

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean f10258;
        @ViewDebug.ExportedProperty

        /* renamed from: Ι  reason: contains not printable characters */
        public int f10259;
        @ViewDebug.ExportedProperty

        /* renamed from: ι  reason: contains not printable characters */
        public boolean f10260;

        /* renamed from: і  reason: contains not printable characters */
        boolean f10261;

        public C2119(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2119(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2119(C2119 r1) {
            super(r1);
            this.f10256 = r1.f10256;
        }

        public C2119() {
            super(-2, -2);
            this.f10256 = false;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C2119 m11281() {
        C2119 r0 = new C2119();
        r0.f13691 = 16;
        r0.f10256 = true;
        return r0;
    }
}
