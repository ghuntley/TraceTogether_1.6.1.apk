package o;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: o.өı  reason: contains not printable characters */
public final class C2931 extends C2328 {
    public C2931(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C2459 r1 = (C2459) m12151(i, i2, i3, charSequence);
        C2997 r2 = new C2997(this.f10808, this, r1);
        r1.f11191 = r2;
        r2.setHeaderTitle(r1.getTitle());
        return r2;
    }
}
