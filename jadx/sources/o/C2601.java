package o;

import android.view.View;
import android.view.ViewParent;

/* renamed from: o.іІ  reason: contains not printable characters */
public class C2601 {

    /* renamed from: ı  reason: contains not printable characters */
    private int[] f11845;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f11846;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final View f11847;

    /* renamed from: Ι  reason: contains not printable characters */
    private ViewParent f11848;

    /* renamed from: ι  reason: contains not printable characters */
    private ViewParent f11849;

    public C2601(View view) {
        this.f11847 = view;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final ViewParent m13785(int i) {
        if (i == 0) {
            return this.f11848;
        }
        if (i != 1) {
            return null;
        }
        return this.f11849;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13787(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f11848 = viewParent;
        } else if (i == 1) {
            this.f11849 = viewParent;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13789(int i, int i2) {
        if (m13785(i2) != null) {
            return true;
        }
        if (this.f11846) {
            View view = this.f11847;
            for (ViewParent parent = this.f11847.getParent(); parent != null; parent = parent.getParent()) {
                if (C0301.m4286(parent, view, this.f11847, i, i2)) {
                    m13787(i2, parent);
                    C0301.m4283(parent, view, this.f11847, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m13786(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent r4;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.f11846 || (r4 = m13785(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f11847.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f11845 == null) {
                this.f11845 = new int[2];
            }
            int[] iArr5 = this.f11845;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        C0301.m4281(r4, this.f11847, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f11847.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13790(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent r2;
        int i4;
        int i5;
        if (!this.f11846 || (r2 = m13785(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f11847.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f11845 == null) {
                this.f11845 = new int[2];
            }
            iArr = this.f11845;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0301.m4285(r2, this.f11847, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f11847.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13788(float f, float f2, boolean z) {
        ViewParent r0;
        if (!this.f11846 || (r0 = m13785(0)) == null) {
            return false;
        }
        return C0301.m4279(r0, this.f11847, f, f2, z);
    }
}
