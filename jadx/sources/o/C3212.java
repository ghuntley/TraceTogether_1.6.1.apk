package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C0858;

/* renamed from: o.ւг  reason: contains not printable characters */
public final class C3212 extends C0983 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[][] f14571 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: ǃ  reason: contains not printable characters */
    private ColorStateList f14572;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f14573;

    public C3212(Context context) {
        this(context, (AttributeSet) null);
    }

    public C3212(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153952130969208);
    }

    public C3212(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f175102131952263), attributeSet, i);
        Context context2 = getContext();
        int[] iArr = C0858.Aux.f5582;
        C3160.m15978(context2, attributeSet, i, R.style.f175102131952263);
        C3160.m15976(context2, attributeSet, iArr, i, R.style.f175102131952263, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175102131952263);
        this.f14573 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14573 && C0729.m5867(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final void setUseMaterialThemeColors(boolean z) {
        this.f14573 = z;
        if (z) {
            if (this.f14572 == null) {
                int r6 = C0328.m4398(getContext(), (int) R.attr.f150242130968804, getClass().getCanonicalName());
                int r0 = C0328.m4398(getContext(), (int) R.attr.f150292130968813, getClass().getCanonicalName());
                int r1 = C0328.m4398(getContext(), (int) R.attr.f150352130968822, getClass().getCanonicalName());
                int[] iArr = new int[f14571.length];
                iArr[0] = C2724.m14457(r1, r6, 1.0f);
                iArr[1] = C2724.m14457(r1, r0, 0.54f);
                iArr[2] = C2724.m14457(r1, r0, 0.38f);
                iArr[3] = C2724.m14457(r1, r0, 0.38f);
                this.f14572 = new ColorStateList(f14571, iArr);
            }
            C0729.m5866(this, this.f14572);
            return;
        }
        C0729.m5866(this, (ColorStateList) null);
    }
}
