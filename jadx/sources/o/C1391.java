package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: o.ɪз  reason: contains not printable characters */
public final class C1391 extends C2328 {
    public C1391(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final MenuItem m8557(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            if (!this.f10820) {
                this.f10820 = true;
                this.f10809 = false;
                this.f10811 = false;
            }
            MenuItem r4 = super.m12151(i, i2, i3, charSequence);
            if (r4 instanceof C2459) {
                C2459 r5 = (C2459) r4;
                r5.f11183 = (r5.f11183 & -5) | 4;
            }
            this.f10820 = false;
            if (this.f10809) {
                this.f10809 = false;
                m12149(this.f10811);
            }
            return r4;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }
}
