package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: o.ɪѕ  reason: contains not printable characters */
public final class C1400 implements C2979 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f7658 = {R.attr.f153372130969146};

    /* renamed from: ι  reason: contains not printable characters */
    private static final int[] f7659 = {16842752, R.attr.f155082130969340};

    /* renamed from: ı  reason: contains not printable characters */
    private final C0452 f7660;

    /* renamed from: ι  reason: contains not printable characters */
    private static int m8577(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7659);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Context m8576(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7658, i, i2);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof C0522) && ((C0522) context).f4345 == resourceId) {
            z = true;
        }
        if (resourceId == 0 || z) {
            return context;
        }
        C0522 r4 = new C0522(context, resourceId);
        int r2 = m8577(context, attributeSet);
        if (r2 != 0) {
            r4.getTheme().applyStyle(r2, true);
        }
        return r4;
    }

    public C1400(C0452 r1) {
        this.f7660 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m8578(C0329 r1) {
        return this.f7660.f4065.m5144();
    }
}
