package o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import o.C2745;

/* renamed from: o.Ŀ  reason: contains not printable characters */
class C0483 extends PopupWindow {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final boolean f4112 = (Build.VERSION.SDK_INT < 21);

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f4113;

    public C0483(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4840(context, attributeSet, i, 0);
    }

    public C0483(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4840(context, attributeSet, i, i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m4840(Context context, AttributeSet attributeSet, int i, int i2) {
        C1992 r1 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f12934, i, i2));
        int i3 = C2745.aux.f12940;
        if (r1.f9934.hasValue(2)) {
            int i4 = C2745.aux.f12940;
            m4841(r1.f9934.getBoolean(2, false));
        }
        setBackgroundDrawable(r1.m10793(C2745.aux.f12935));
        r1.f9934.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f4112 && this.f4113) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f4112 && this.f4113) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f4112 && this.f4113) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m4841(boolean z) {
        if (f4112) {
            this.f4113 = z;
        } else {
            C0887.m6600(this, z);
        }
    }
}
