package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;
import o.C0858;

/* renamed from: o.εɪ  reason: contains not printable characters */
public final class C1936 {

    /* renamed from: ı  reason: contains not printable characters */
    final C1981 f9769;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C1981 f9770;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1981 f9771;

    /* renamed from: Ι  reason: contains not printable characters */
    final C1981 f9772;

    /* renamed from: ι  reason: contains not printable characters */
    final C1981 f9773;

    /* renamed from: І  reason: contains not printable characters */
    final C1981 f9774;

    /* renamed from: і  reason: contains not printable characters */
    final C1981 f9775;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Paint f9776 = new Paint();

    public C1936(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0328.m4398(context, (int) R.attr.f153352130969143, MaterialCalendar.class.getCanonicalName()), C0858.Aux.f5578);
        this.f9770 = C1981.m10772(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f9774 = C1981.m10772(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f9769 = C1981.m10772(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f9772 = C1981.m10772(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList r2 = C0344.m4473(context, obtainStyledAttributes, 5);
        this.f9771 = C1981.m10772(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f9773 = C1981.m10772(context, obtainStyledAttributes.getResourceId(6, 0));
        this.f9775 = C1981.m10772(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f9776.setColor(r2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
