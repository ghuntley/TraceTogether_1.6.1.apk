package o;

import android.content.Context;
import android.util.TypedValue;
import o.C2038;

public final class mY implements C2038.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0993 f3187;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m3796(Context context) {
        if (context == null) {
            F.m1359();
            return -16777216;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.f150312130968815, typedValue, true)) {
            return typedValue.resourceId == 0 ? typedValue.data : C0651.m5450(context, typedValue.resourceId);
        }
        new Object[1][0] = Integer.valueOf(R.attr.f150312130968815);
        F.m1358();
        return C0651.m5450(context, R.color.f157522131099962);
    }

    public mY(C0993 r1) {
        this.f3187 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3797(Object obj, Object obj2) {
        C0993.m7029(this.f3187, (C2970) obj);
    }
}
