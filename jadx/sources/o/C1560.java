package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C2745;

/* renamed from: o.ɿ  reason: contains not printable characters */
public final class C1560 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public Context f8311;

    public C1560(Context context) {
        this.f8311 = context;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m9186() {
        Configuration configuration = this.f8311.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m9187() {
        TypedArray obtainStyledAttributes = this.f8311.obtainStyledAttributes((AttributeSet) null, C2745.aux.f12818, R.attr.f148162130968582, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C2745.aux.f12806, 0);
        Resources resources = this.f8311.getResources();
        if (!this.f8311.getResources().getBoolean(R.bool.f155672131034112)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.f157632131165193));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }
}
