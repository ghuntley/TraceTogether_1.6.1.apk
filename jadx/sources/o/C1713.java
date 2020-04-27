package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C0858;

/* renamed from: o.ʭɹ  reason: contains not printable characters */
public final class C1713 extends C1905 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[][] f8897 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: ɩ  reason: contains not printable characters */
    private ColorStateList f8898;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f8899;

    public C1713(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1713(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f149822130968759);
    }

    public C1713(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f175092131952262), attributeSet, i);
        Context context2 = getContext();
        int[] iArr = C0858.Aux.f5580;
        C3160.m15978(context2, attributeSet, i, R.style.f175092131952262);
        C3160.m15976(context2, attributeSet, iArr, i, R.style.f175092131952262, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175092131952262);
        if (obtainStyledAttributes.hasValue(0)) {
            C0729.m5866(this, C0344.m4473(context2, obtainStyledAttributes, 0));
        }
        this.f8899 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8899 && C0729.m5867(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final void setUseMaterialThemeColors(boolean z) {
        this.f8899 = z;
        if (z) {
            if (this.f8898 == null) {
                int[] iArr = new int[f8897.length];
                int r0 = C0328.m4398(getContext(), (int) R.attr.f150242130968804, getClass().getCanonicalName());
                int r1 = C0328.m4398(getContext(), (int) R.attr.f150352130968822, getClass().getCanonicalName());
                int r2 = C0328.m4398(getContext(), (int) R.attr.f150292130968813, getClass().getCanonicalName());
                iArr[0] = C2724.m14457(r1, r0, 1.0f);
                iArr[1] = C2724.m14457(r1, r2, 0.54f);
                iArr[2] = C2724.m14457(r1, r2, 0.38f);
                iArr[3] = C2724.m14457(r1, r2, 0.38f);
                this.f8898 = new ColorStateList(f8897, iArr);
            }
            C0729.m5866(this, this.f8898);
            return;
        }
        C0729.m5866(this, (ColorStateList) null);
    }
}
