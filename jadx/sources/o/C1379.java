package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import o.C0520;
import o.C2317;

/* renamed from: o.ɪε  reason: contains not printable characters */
public final class C1379 extends ViewGroup implements C1429, View.OnClickListener {

    /* renamed from: ɨ  reason: contains not printable characters */
    private static final int[] f7575 = {16842912};

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final int[] f7576 = {-16842910};

    /* renamed from: ı  reason: contains not printable characters */
    final C2170 f7577;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final int f7578;

    /* renamed from: ł  reason: contains not printable characters */
    private final C2317.If<C1407> f7579;

    /* renamed from: ſ  reason: contains not printable characters */
    private int f7580;

    /* renamed from: Ɩ  reason: contains not printable characters */
    SparseArray<C1349> f7581;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private ColorStateList f7582;

    /* renamed from: ƚ  reason: contains not printable characters */
    private int f7583;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f7584;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final int f7585;

    /* renamed from: ɍ  reason: contains not printable characters */
    private final ColorStateList f7586;

    /* renamed from: ɟ  reason: contains not printable characters */
    private int[] f7587;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f7588;

    /* renamed from: ɹ  reason: contains not printable characters */
    C1395 f7589;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int f7590;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final int f7591;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final int f7592;

    /* renamed from: ʅ  reason: contains not printable characters */
    private int f7593;

    /* renamed from: ʟ  reason: contains not printable characters */
    private ColorStateList f7594;

    /* renamed from: Ι  reason: contains not printable characters */
    int f7595;

    /* renamed from: ι  reason: contains not printable characters */
    C1407[] f7596;

    /* renamed from: І  reason: contains not printable characters */
    C2328 f7597;

    /* renamed from: г  reason: contains not printable characters */
    private final View.OnClickListener f7598;

    /* renamed from: і  reason: contains not printable characters */
    int f7599;

    /* renamed from: Ӏ  reason: contains not printable characters */
    Drawable f7600;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final int f7601;

    public C1379(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1379(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7579 = new C2317.Cif(5);
        this.f7584 = 0;
        this.f7599 = 0;
        this.f7581 = new SparseArray<>(5);
        Resources resources = getResources();
        this.f7585 = resources.getDimensionPixelSize(R.dimen.f158032131165288);
        this.f7591 = resources.getDimensionPixelSize(R.dimen.f158042131165289);
        this.f7601 = resources.getDimensionPixelSize(R.dimen.f157982131165282);
        this.f7578 = resources.getDimensionPixelSize(R.dimen.f157992131165283);
        this.f7592 = resources.getDimensionPixelSize(R.dimen.f158012131165286);
        this.f7586 = m8521();
        this.f7577 = new C1807();
        this.f7577.m11507(0);
        this.f7577.m11505(115);
        this.f7577.m11499((TimeInterpolator) new C1991());
        this.f7577.m11509((C1976) new C3158());
        this.f7598 = this;
        this.f7587 = new int[5];
        C0293.m4203((View) this, 1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8520(C2328 r1) {
        this.f7597 = r1;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f7597.m12145().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7592, 1073741824);
        int i3 = this.f7595;
        if (!(i3 != -1 ? i3 == 0 : size2 > 3) || !this.f7588) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f7601);
            int i4 = size - (size2 * min);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getVisibility() != 8) {
                    int[] iArr = this.f7587;
                    iArr[i5] = min;
                    if (i4 > 0) {
                        iArr[i5] = iArr[i5] + 1;
                        i4--;
                    }
                } else {
                    this.f7587[i5] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f7599);
            int i6 = this.f7578;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f7601, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f7591 * i7), Math.min(i6, this.f7601));
            int i8 = size - min2;
            int min3 = Math.min(i8 / (i7 == 0 ? 1 : i7), this.f7585);
            int i9 = i8 - (i7 * min3);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    this.f7587[i10] = i10 == this.f7599 ? min2 : min3;
                    if (i9 > 0) {
                        int[] iArr2 = this.f7587;
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.f7587[i10] = 0;
                }
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f7587[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0), View.resolveSizeAndState(this.f7592, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C0293.m4156(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0520.m4998(accessibilityNodeInfo).m5035((Object) C0520.C0521.m5076(1, this.f7597.m12145().size(), false, 1));
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        this.f7594 = colorStateList;
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 iconTintList : r0) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public final void setItemIconSize(int i) {
        this.f7583 = i;
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 iconSize : r0) {
                iconSize.setIconSize(i);
            }
        }
    }

    public final void setItemTextColor(ColorStateList colorStateList) {
        this.f7582 = colorStateList;
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 textColor : r0) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public final void setItemTextAppearanceInactive(int i) {
        this.f7593 = i;
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 r3 : r0) {
                r3.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f7582;
                if (colorStateList != null) {
                    r3.setTextColor(colorStateList);
                }
            }
        }
    }

    public final void setItemTextAppearanceActive(int i) {
        this.f7580 = i;
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 r3 : r0) {
                r3.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f7582;
                if (colorStateList != null) {
                    r3.setTextColor(colorStateList);
                }
            }
        }
    }

    public final void setItemBackgroundRes(int i) {
        this.f7590 = i;
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 itemBackground : r0) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public final void setItemBackground(Drawable drawable) {
        this.f7600 = drawable;
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 itemBackground : r0) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public final void setLabelVisibilityMode(int i) {
        this.f7595 = i;
    }

    public final void setItemHorizontalTranslationEnabled(boolean z) {
        this.f7588 = z;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final ColorStateList m8521() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList r1 = C3257Con.m1342(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.f150312130968815, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = r1.getDefaultColor();
        return new ColorStateList(new int[][]{f7576, f7575, EMPTY_STATE_SET}, new int[]{r1.getColorForState(f7576, defaultColor), i, defaultColor});
    }

    public final void setPresenter(C1395 r1) {
        this.f7589 = r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8522() {
        C1349 r6;
        removeAllViews();
        C1407[] r0 = this.f7596;
        if (r0 != null) {
            for (C1407 r62 : r0) {
                if (r62 != null) {
                    this.f7579.m12091(r62);
                    ImageView imageView = r62.f7695;
                    if (r62.f7690 != null) {
                        if (imageView != null) {
                            r62.setClipChildren(true);
                            r62.setClipToPadding(true);
                            C1349 r8 = r62.f7690;
                            FrameLayout frameLayout = (imageView != r62.f7695 || !C1315.f7313) ? null : (FrameLayout) r62.f7695.getParent();
                            if (r8 != null) {
                                if (C1315.f7313) {
                                    frameLayout.setForeground((Drawable) null);
                                } else {
                                    imageView.getOverlay().remove(r8);
                                }
                            }
                        }
                        r62.f7690 = null;
                    }
                }
            }
        }
        if (this.f7597.size() == 0) {
            this.f7584 = 0;
            this.f7599 = 0;
            this.f7596 = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f7597.size(); i++) {
            hashSet.add(Integer.valueOf(this.f7597.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f7581.size(); i2++) {
            int keyAt = this.f7581.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f7581.delete(keyAt);
            }
        }
        this.f7596 = new C1407[this.f7597.size()];
        int i3 = this.f7595;
        boolean z = i3 != -1 ? i3 == 0 : this.f7597.m12145().size() > 3;
        for (int i4 = 0; i4 < this.f7597.size(); i4++) {
            this.f7589.f7648 = true;
            this.f7597.getItem(i4).setCheckable(true);
            this.f7589.f7648 = false;
            C1407 r5 = this.f7579.m12090();
            if (r5 == null) {
                r5 = new C1407(getContext());
            }
            this.f7596[i4] = r5;
            r5.setIconTintList(this.f7594);
            r5.setIconSize(this.f7583);
            r5.setTextColor(this.f7586);
            r5.setTextAppearanceInactive(this.f7593);
            r5.setTextAppearanceActive(this.f7580);
            r5.setTextColor(this.f7582);
            Drawable drawable = this.f7600;
            if (drawable != null) {
                r5.setItemBackground(drawable);
            } else {
                r5.setItemBackground(this.f7590);
            }
            r5.setShifting(z);
            r5.setLabelVisibilityMode(this.f7595);
            r5.m8589((C2459) this.f7597.getItem(i4));
            r5.setItemPosition(i4);
            r5.setOnClickListener(this.f7598);
            if (this.f7584 != 0 && this.f7597.getItem(i4).getItemId() == this.f7584) {
                this.f7599 = i4;
            }
            int id = r5.getId();
            if ((id != -1) && (r6 = this.f7581.get(id)) != null) {
                r5.m8591(r6);
            }
            addView(r5);
        }
        this.f7599 = Math.min(this.f7597.size() - 1, this.f7599);
        this.f7597.getItem(this.f7599).setChecked(true);
    }

    public final void onClick(View view) {
        C2459 r4 = ((C1407) view).f7686;
        if (!this.f7597.m12143(r4, this.f7589, 0)) {
            r4.setChecked(true);
        }
    }
}
