package o;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: o.ŀǃ  reason: contains not printable characters */
public class C0501 {

    /* renamed from: ι  reason: contains not printable characters */
    private final Object f4195;

    private C0501(Object obj) {
        this.f4195 = obj;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public int m4895() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4195).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m4893() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4195).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public int m4894() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4195).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public int m4890() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4195).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m4892() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4195).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public boolean m4897() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f4195).isConsumed();
        }
        return false;
    }

    /* renamed from: І  reason: contains not printable characters */
    public C0501 m4896() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0501(((WindowInsets) this.f4195).consumeSystemWindowInsets());
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0501 m4891(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0501(((WindowInsets) this.f4195).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f4195;
        Object obj3 = ((C0501) obj).f4195;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f4195;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C0501 m4889(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0501(obj);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static Object m4888(C0501 r0) {
        if (r0 == null) {
            return null;
        }
        return r0.f4195;
    }
}
