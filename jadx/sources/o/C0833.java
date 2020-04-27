package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C0858;

/* renamed from: o.ƾӀ  reason: contains not printable characters */
public final class C0833 extends C1264 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final int[][] f5462 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: ǃ  reason: contains not printable characters */
    private ColorStateList f5463;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2610 f5464;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f5465;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private ColorStateList f5466;

    public C0833(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0833(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154622130969281);
    }

    public C0833(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f175112131952264), attributeSet, i);
        Context context2 = getContext();
        this.f5464 = new C2610(context2);
        int[] iArr = C0858.Aux.f5610;
        C3160.m15978(context2, attributeSet, i, R.style.f175112131952264);
        C3160.m15976(context2, attributeSet, iArr, i, R.style.f175112131952264, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175112131952264);
        this.f5465 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5465 && m8115() == null) {
            setThumbTintList(m6298());
        }
        if (this.f5465 && m8114() == null) {
            setTrackTintList(m6299());
        }
    }

    public final void setUseMaterialThemeColors(boolean z) {
        this.f5465 = z;
        if (z) {
            setThumbTintList(m6298());
            setTrackTintList(m6299());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private ColorStateList m6298() {
        if (this.f5463 == null) {
            int r0 = C0328.m4398(getContext(), (int) R.attr.f150352130968822, getClass().getCanonicalName());
            int r1 = C0328.m4398(getContext(), (int) R.attr.f150242130968804, getClass().getCanonicalName());
            float dimension = getResources().getDimension(R.dimen.f159322131165502);
            if (this.f5464.f11871) {
                dimension += C3198.m16137(this);
            }
            int r2 = this.f5464.m13834(r0, dimension);
            int[] iArr = new int[f5462.length];
            iArr[0] = C2724.m14457(r0, r1, 1.0f);
            iArr[1] = r2;
            iArr[2] = C2724.m14457(r0, r1, 0.38f);
            iArr[3] = r2;
            this.f5463 = new ColorStateList(f5462, iArr);
        }
        return this.f5463;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private ColorStateList m6299() {
        if (this.f5466 == null) {
            int[] iArr = new int[f5462.length];
            int r1 = C0328.m4398(getContext(), (int) R.attr.f150352130968822, getClass().getCanonicalName());
            int r2 = C0328.m4398(getContext(), (int) R.attr.f150242130968804, getClass().getCanonicalName());
            int r3 = C0328.m4398(getContext(), (int) R.attr.f150292130968813, getClass().getCanonicalName());
            iArr[0] = C2724.m14457(r1, r2, 0.54f);
            iArr[1] = C2724.m14457(r1, r3, 0.32f);
            iArr[2] = C2724.m14457(r1, r2, 0.12f);
            iArr[3] = C2724.m14457(r1, r3, 0.12f);
            this.f5466 = new ColorStateList(f5462, iArr);
        }
        return this.f5466;
    }
}
