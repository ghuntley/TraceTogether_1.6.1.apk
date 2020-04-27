package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: o.ɪɜ  reason: contains not printable characters */
public class C1351<V extends View> extends CoordinatorLayout.C3238If<V> {
    private int tempLeftRightOffset = 0;
    private int tempTopBottomOffset = 0;
    private C1289 viewOffsetHelper;

    public C1351() {
    }

    public C1351(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new C1289(v);
        }
        C1289 r2 = this.viewOffsetHelper;
        r2.f7240 = r2.f7237.getTop();
        r2.f7239 = r2.f7237.getLeft();
        this.viewOffsetHelper.m8223();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            C1289 r4 = this.viewOffsetHelper;
            if (r4.f7243 && r4.f7238 != i2) {
                r4.f7238 = i2;
                r4.m8223();
            }
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 == 0) {
            return true;
        }
        C1289 r42 = this.viewOffsetHelper;
        if (r42.f7242 && r42.f7241 != i3) {
            r42.f7241 = i3;
            r42.m8223();
        }
        this.tempLeftRightOffset = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m142(v, i);
    }

    public boolean setTopAndBottomOffset(int i) {
        C1289 r0 = this.viewOffsetHelper;
        if (r0 == null) {
            this.tempTopBottomOffset = i;
            return false;
        } else if (!r0.f7243 || r0.f7238 == i) {
            return false;
        } else {
            r0.f7238 = i;
            r0.m8223();
            return true;
        }
    }

    public int getTopAndBottomOffset() {
        C1289 r0 = this.viewOffsetHelper;
        if (r0 != null) {
            return r0.f7238;
        }
        return 0;
    }
}
