package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import o.C3086;

/* renamed from: o.ւɪ  reason: contains not printable characters */
public final class C3201 extends C3065 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int[] f14544 = {16842912};

    /* renamed from: ι  reason: contains not printable characters */
    private static final int[] f14545 = {-16842910};

    /* renamed from: ı  reason: contains not printable characters */
    private C3086 f14546;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private ViewTreeObserver.OnGlobalLayoutListener f14547;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2931 f14548;

    /* renamed from: ɩ  reason: contains not printable characters */
    Cif f14549;

    /* renamed from: І  reason: contains not printable characters */
    private MenuInflater f14550;

    /* renamed from: і  reason: contains not printable characters */
    private final int f14551;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int[] f14552;

    /* renamed from: o.ւɪ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: Ι  reason: contains not printable characters */
        boolean m16146();
    }

    public C3201(Context context) {
        this(context, (AttributeSet) null);
    }

    public C3201(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153482130969159);
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r11v11, types: [android.graphics.drawable.InsetDrawable] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3201(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r18
            r17.<init>(r18, r19, r20)
            o.լı r1 = new o.լı
            r1.<init>()
            r0.f14546 = r1
            r8 = 2
            int[] r1 = new int[r8]
            r0.f14552 = r1
            o.өı r1 = new o.өı
            r1.<init>(r7)
            r0.f14548 = r1
            int[] r3 = o.C0858.Aux.f5588
            r9 = 0
            int[] r6 = new int[r9]
            r5 = 2131952218(0x7f13025a, float:1.9540873E38)
            r1 = r18
            r2 = r19
            r4 = r20
            o.ιɩ r1 = o.C3160.m15977(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r2 = r1.f9934
            boolean r2 = r2.hasValue(r9)
            if (r2 == 0) goto L_0x003b
            android.graphics.drawable.Drawable r2 = r1.m10793(r9)
            o.C0293.m4199((android.view.View) r0, (android.graphics.drawable.Drawable) r2)
        L_0x003b:
            android.graphics.drawable.Drawable r2 = r17.getBackground()
            if (r2 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r2 = r17.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x0080
        L_0x0049:
            android.graphics.drawable.Drawable r2 = r17.getBackground()
            o.Ɨŧ r3 = new o.Ɨŧ
            r3.<init>()
            boolean r4 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r4 == 0) goto L_0x0071
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            o.Ɨŧ$if r4 = r3.f4785
            android.content.res.ColorStateList r4 = r4.f4804
            if (r4 == r2) goto L_0x0071
            o.Ɨŧ$if r4 = r3.f4785
            r4.f4804 = r2
            int[] r2 = r3.getState()
            r3.onStateChange(r2)
        L_0x0071:
            o.Ɨŧ$if r2 = r3.f4785
            o.іյ r4 = new o.іյ
            r4.<init>(r7)
            r2.f4812 = r4
            r3.m5521()
            o.C0293.m4199((android.view.View) r0, (android.graphics.drawable.Drawable) r3)
        L_0x0080:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 3
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x0093
            android.content.res.TypedArray r2 = r1.f9934
            int r2 = r2.getDimensionPixelSize(r3, r9)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x0093:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 1
            boolean r2 = r2.getBoolean(r3, r9)
            r0.setFitsSystemWindows(r2)
            android.content.res.TypedArray r2 = r1.f9934
            int r2 = r2.getDimensionPixelSize(r8, r9)
            r0.f14551 = r2
            android.content.res.TypedArray r2 = r1.f9934
            r4 = 9
            boolean r2 = r2.hasValue(r4)
            if (r2 == 0) goto L_0x00b4
            android.content.res.ColorStateList r2 = r1.m10792(r4)
            goto L_0x00bb
        L_0x00b4:
            r2 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r2 = r0.m16142(r2)
        L_0x00bb:
            android.content.res.TypedArray r4 = r1.f9934
            r5 = 18
            boolean r4 = r4.hasValue(r5)
            if (r4 == 0) goto L_0x00ce
            android.content.res.TypedArray r4 = r1.f9934
            int r4 = r4.getResourceId(r5, r9)
            r5 = r4
            r4 = 1
            goto L_0x00d0
        L_0x00ce:
            r4 = 0
            r5 = 0
        L_0x00d0:
            android.content.res.TypedArray r6 = r1.f9934
            r8 = 8
            boolean r6 = r6.hasValue(r8)
            if (r6 == 0) goto L_0x00e3
            android.content.res.TypedArray r6 = r1.f9934
            int r6 = r6.getDimensionPixelSize(r8, r9)
            r0.setItemIconSize(r6)
        L_0x00e3:
            r6 = 0
            android.content.res.TypedArray r8 = r1.f9934
            r10 = 19
            boolean r8 = r8.hasValue(r10)
            if (r8 == 0) goto L_0x00f2
            android.content.res.ColorStateList r6 = r1.m10792(r10)
        L_0x00f2:
            if (r4 != 0) goto L_0x00fd
            if (r6 != 0) goto L_0x00fd
            r6 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r6 = r0.m16142(r6)
        L_0x00fd:
            r8 = 5
            android.graphics.drawable.Drawable r8 = r1.m10793(r8)
            if (r8 != 0) goto L_0x0183
            android.content.res.TypedArray r10 = r1.f9934
            r11 = 11
            boolean r10 = r10.hasValue(r11)
            r12 = 12
            if (r10 != 0) goto L_0x011b
            android.content.res.TypedArray r10 = r1.f9934
            boolean r10 = r10.hasValue(r12)
            if (r10 == 0) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            r10 = 0
            goto L_0x011c
        L_0x011b:
            r10 = 1
        L_0x011c:
            if (r10 == 0) goto L_0x0183
            android.content.res.TypedArray r8 = r1.f9934
            int r8 = r8.getResourceId(r11, r9)
            android.content.res.TypedArray r10 = r1.f9934
            int r10 = r10.getResourceId(r12, r9)
            o.Ɨŧ r12 = new o.Ɨŧ
            android.content.Context r11 = r17.getContext()
            o.łƭ r13 = new o.łƭ
            r14 = 0
            r13.<init>(r14)
            o.ƭł$If r8 = o.C0785.m6130(r11, r8, r10, r13)
            o.ƭł r10 = new o.ƭł
            r10.<init>(r8, r9)
            r12.<init>((o.C0785) r10)
            android.content.Context r8 = r17.getContext()
            r10 = 13
            android.content.res.ColorStateList r8 = o.C0344.m4476((android.content.Context) r8, (o.C1992) r1, (int) r10)
            o.Ɨŧ$if r10 = r12.f4785
            android.content.res.ColorStateList r10 = r10.f4804
            if (r10 == r8) goto L_0x015d
            o.Ɨŧ$if r10 = r12.f4785
            r10.f4804 = r8
            int[] r8 = r12.getState()
            r12.onStateChange(r8)
        L_0x015d:
            android.content.res.TypedArray r8 = r1.f9934
            r10 = 16
            int r13 = r8.getDimensionPixelSize(r10, r9)
            android.content.res.TypedArray r8 = r1.f9934
            r10 = 17
            int r14 = r8.getDimensionPixelSize(r10, r9)
            android.content.res.TypedArray r8 = r1.f9934
            r10 = 15
            int r15 = r8.getDimensionPixelSize(r10, r9)
            android.content.res.TypedArray r8 = r1.f9934
            r10 = 14
            int r16 = r8.getDimensionPixelSize(r10, r9)
            android.graphics.drawable.InsetDrawable r8 = new android.graphics.drawable.InsetDrawable
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0183:
            android.content.res.TypedArray r10 = r1.f9934
            r11 = 6
            boolean r10 = r10.hasValue(r11)
            if (r10 == 0) goto L_0x0197
            android.content.res.TypedArray r10 = r1.f9934
            int r10 = r10.getDimensionPixelSize(r11, r9)
            o.լı r11 = r0.f14546
            r11.m15706((int) r10)
        L_0x0197:
            android.content.res.TypedArray r10 = r1.f9934
            r11 = 7
            int r10 = r10.getDimensionPixelSize(r11, r9)
            android.content.res.TypedArray r11 = r1.f9934
            r12 = 10
            int r11 = r11.getInt(r12, r3)
            r0.setItemMaxLines(r11)
            o.өı r11 = r0.f14548
            o.ւɪ$1 r12 = new o.ւɪ$1
            r12.<init>()
            r11.m12148((o.C2328.Cif) r12)
            o.լı r11 = r0.f14546
            r11.f14141 = r3
            o.өı r12 = r0.f14548
            r11.m15714(r7, r12)
            o.լı r7 = r0.f14546
            r7.m15707((android.content.res.ColorStateList) r2)
            o.լı r2 = r0.f14546
            int r7 = r17.getOverScrollMode()
            r2.f14154 = r7
            o.լǃ r11 = r2.f14145
            if (r11 == 0) goto L_0x01d2
            o.լǃ r2 = r2.f14145
            r2.setOverScrollMode(r7)
        L_0x01d2:
            if (r4 == 0) goto L_0x01d9
            o.լı r2 = r0.f14546
            r2.m15712((int) r5)
        L_0x01d9:
            o.լı r2 = r0.f14546
            r2.m15715((android.content.res.ColorStateList) r6)
            o.լı r2 = r0.f14546
            r2.m15700((android.graphics.drawable.Drawable) r8)
            o.լı r2 = r0.f14546
            r2.m15710(r10)
            o.өı r2 = r0.f14548
            o.լı r4 = r0.f14546
            r2.m12156((o.C1483) r4)
            o.լı r2 = r0.f14546
            o.լǃ r4 = r2.f14145
            if (r4 != 0) goto L_0x023b
            android.view.LayoutInflater r4 = r2.f14153
            r5 = 2131558455(0x7f0d0037, float:1.8742226E38)
            android.view.View r4 = r4.inflate(r5, r0, r9)
            o.լǃ r4 = (o.C3099) r4
            r2.f14145 = r4
            o.լǃ r4 = r2.f14145
            o.լı$iF r5 = new o.լı$iF
            o.լǃ r6 = r2.f14145
            r5.<init>(r6)
            r4.setAccessibilityDelegateCompat(r5)
            o.լı$ɩ r4 = r2.f14152
            if (r4 != 0) goto L_0x0219
            o.լı$ɩ r4 = new o.լı$ɩ
            r4.<init>()
            r2.f14152 = r4
        L_0x0219:
            int r4 = r2.f14154
            r5 = -1
            if (r4 == r5) goto L_0x0225
            o.լǃ r4 = r2.f14145
            int r5 = r2.f14154
            r4.setOverScrollMode(r5)
        L_0x0225:
            android.view.LayoutInflater r4 = r2.f14153
            r5 = 2131558452(0x7f0d0034, float:1.874222E38)
            o.լǃ r6 = r2.f14145
            android.view.View r4 = r4.inflate(r5, r6, r9)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r2.f14151 = r4
            o.լǃ r4 = r2.f14145
            o.լı$ɩ r5 = r2.f14152
            r4.setAdapter(r5)
        L_0x023b:
            o.լǃ r2 = r2.f14145
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            android.content.res.TypedArray r2 = r1.f9934
            r4 = 20
            boolean r2 = r2.hasValue(r4)
            if (r2 == 0) goto L_0x0281
            android.content.res.TypedArray r2 = r1.f9934
            int r2 = r2.getResourceId(r4, r9)
            o.լı r4 = r0.f14546
            o.լı$ɩ r5 = r4.f14152
            if (r5 == 0) goto L_0x025c
            o.լı$ɩ r4 = r4.f14152
            r4.f14163 = r3
        L_0x025c:
            android.view.MenuInflater r3 = r0.f14550
            if (r3 != 0) goto L_0x026b
            o.ŀ r3 = new o.ŀ
            android.content.Context r4 = r17.getContext()
            r3.<init>(r4)
            r0.f14550 = r3
        L_0x026b:
            android.view.MenuInflater r3 = r0.f14550
            o.өı r4 = r0.f14548
            r3.inflate(r2, r4)
            o.լı r2 = r0.f14546
            o.լı$ɩ r3 = r2.f14152
            if (r3 == 0) goto L_0x027c
            o.լı$ɩ r2 = r2.f14152
            r2.f14163 = r9
        L_0x027c:
            o.լı r2 = r0.f14546
            r2.m15716((boolean) r9)
        L_0x0281:
            android.content.res.TypedArray r2 = r1.f9934
            r3 = 4
            boolean r2 = r2.hasValue(r3)
            if (r2 == 0) goto L_0x02aa
            android.content.res.TypedArray r2 = r1.f9934
            int r2 = r2.getResourceId(r3, r9)
            o.լı r3 = r0.f14546
            android.view.LayoutInflater r4 = r3.f14153
            android.widget.LinearLayout r5 = r3.f14151
            android.view.View r2 = r4.inflate(r2, r5, r9)
            android.widget.LinearLayout r4 = r3.f14151
            r4.addView(r2)
            o.լǃ r2 = r3.f14145
            o.լǃ r3 = r3.f14145
            int r3 = r3.getPaddingBottom()
            r2.setPadding(r9, r9, r9, r3)
        L_0x02aa:
            android.content.res.TypedArray r1 = r1.f9934
            r1.recycle()
            r0.f14547 = r0
            android.view.ViewTreeObserver r1 = r17.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r0.f14547
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3201.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C3086 r0 = this.f14546;
        if (r0 != null) {
            r0.f14154 = i;
            if (r0.f14145 != null) {
                r0.f14145.setOverScrollMode(i);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14535((View) this);
    }

    public final void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C2745.m14513((View) this, f);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        C3202 r1 = new C3202(super.onSaveInstanceState());
        r1.f14554 = new Bundle();
        this.f14548.m12155(r1.f14554);
        return r1;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3202)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3202 r2 = (C3202) parcelable;
        super.onRestoreInstanceState(r2.f6905);
        this.f14548.m12137(r2.f14554);
    }

    public final void setNavigationItemSelectedListener(Cif ifVar) {
        this.f14549 = ifVar;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f14551), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f14551, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m16143(C0501 r6) {
        C3086 r0 = this.f14546;
        int r1 = r6.m4893();
        if (r0.f14137 != r1) {
            r0.f14137 = r1;
            r0.m15705();
        }
        r0.f14145.setPadding(0, r0.f14145.getPaddingTop(), 0, r6.m4890());
        C0293.m4175((View) r0.f14151, r6);
    }

    public final void setItemIconTintList(ColorStateList colorStateList) {
        C3086 r0 = this.f14546;
        r0.f14156 = colorStateList;
        if (r0.f14152 != null) {
            C3086.C3089 r2 = r0.f14152;
            r2.m15720();
            r2.notifyDataSetChanged();
        }
    }

    public final void setItemTextColor(ColorStateList colorStateList) {
        C3086 r0 = this.f14546;
        r0.f14139 = colorStateList;
        if (r0.f14152 != null) {
            C3086.C3089 r2 = r0.f14152;
            r2.m15720();
            r2.notifyDataSetChanged();
        }
    }

    public final void setItemBackgroundResource(int i) {
        setItemBackground(C0651.m5458(getContext(), i));
    }

    public final void setItemBackground(Drawable drawable) {
        C3086 r0 = this.f14546;
        r0.f14146 = drawable;
        if (r0.f14152 != null) {
            C3086.C3089 r2 = r0.f14152;
            r2.m15720();
            r2.notifyDataSetChanged();
        }
    }

    public final void setItemHorizontalPadding(int i) {
        C3086 r0 = this.f14546;
        r0.f14142 = i;
        if (r0.f14152 != null) {
            C3086.C3089 r2 = r0.f14152;
            r2.m15720();
            r2.notifyDataSetChanged();
        }
    }

    public final void setItemHorizontalPaddingResource(int i) {
        C3086 r0 = this.f14546;
        r0.f14142 = getResources().getDimensionPixelSize(i);
        if (r0.f14152 != null) {
            C3086.C3089 r3 = r0.f14152;
            r3.m15720();
            r3.notifyDataSetChanged();
        }
    }

    public final void setItemIconPadding(int i) {
        C3086 r0 = this.f14546;
        r0.f14144 = i;
        if (r0.f14152 != null) {
            C3086.C3089 r2 = r0.f14152;
            r2.m15720();
            r2.notifyDataSetChanged();
        }
    }

    public final void setItemIconPaddingResource(int i) {
        C3086 r0 = this.f14546;
        r0.f14144 = getResources().getDimensionPixelSize(i);
        if (r0.f14152 != null) {
            C3086.C3089 r3 = r0.f14152;
            r3.m15720();
            r3.notifyDataSetChanged();
        }
    }

    public final void setCheckedItem(int i) {
        MenuItem findItem = this.f14548.findItem(i);
        if (findItem != null) {
            this.f14546.f14152.m15721((C2459) findItem);
        }
    }

    public final void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f14548.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f14546.f14152.m15721((C2459) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public final void setItemTextAppearance(int i) {
        this.f14546.m15712(i);
    }

    public final void setItemIconSize(int i) {
        C3086 r0 = this.f14546;
        if (r0.f14157 != i) {
            r0.f14157 = i;
            r0.f14148 = true;
            if (r0.f14152 != null) {
                C3086.C3089 r3 = r0.f14152;
                r3.m15720();
                r3.notifyDataSetChanged();
            }
        }
    }

    public final void setItemMaxLines(int i) {
        C3086 r0 = this.f14546;
        r0.f14149 = i;
        if (r0.f14152 != null) {
            C3086.C3089 r2 = r0.f14152;
            r2.m15720();
            r2.notifyDataSetChanged();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private ColorStateList m16142(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList r10 = C3257Con.m1342(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.f150312130968815, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = r10.getDefaultColor();
        return new ColorStateList(new int[][]{f14545, f14544, EMPTY_STATE_SET}, new int[]{r10.getColorForState(f14545, defaultColor), i2, defaultColor});
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f14547);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f14547);
        }
    }

    /* renamed from: o.ւɪ$ı  reason: contains not printable characters */
    public static class C3202 extends C1219 {
        public static final Parcelable.Creator<C3202> CREATOR = new Parcelable.ClassLoaderCreator<C3202>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3202(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C3202[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C3202(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        public Bundle f14554;

        public C3202(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14554 = parcel.readBundle(classLoader);
        }

        public C3202(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f14554);
        }
    }

    public final void onGlobalLayout() {
        getLocationOnScreen(this.f14552);
        boolean z = true;
        boolean z2 = this.f14552[1] == 0;
        C3086 r3 = this.f14546;
        if (r3.f14138 != z2) {
            r3.f14138 = z2;
            r3.m15705();
        }
        setDrawTopInsetForeground(z2);
        Context context = getContext();
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 21) {
            Activity activity = (Activity) context;
            boolean z3 = activity.findViewById(16908290).getHeight() == getHeight();
            boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
            if (!z3 || !z4) {
                z = false;
            }
            setDrawBottomInsetForeground(z);
        }
    }
}
