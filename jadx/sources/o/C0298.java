package o;

import android.content.Context;
import o.C2745;

/* renamed from: o.ıƐ  reason: contains not printable characters */
public final class C0298 {

    /* renamed from: ı  reason: contains not printable characters */
    Boolean f3568;

    /* renamed from: ǃ  reason: contains not printable characters */
    String f3569;

    /* renamed from: ɩ  reason: contains not printable characters */
    final Context f3570;

    /* renamed from: Ι  reason: contains not printable characters */
    String f3571;

    /* renamed from: ι  reason: contains not printable characters */
    String f3572;

    /* renamed from: І  reason: contains not printable characters */
    long f3573;

    /* renamed from: і  reason: contains not printable characters */
    C2193 f3574;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f3575 = true;

    public C0298(Context context, C2193 r5) {
        C2745.C2746.m14555(context);
        Context applicationContext = context.getApplicationContext();
        C2745.C2746.m14555(applicationContext);
        this.f3570 = applicationContext;
        if (r5 != null) {
            this.f3574 = r5;
            this.f3571 = r5.f10435;
            this.f3572 = r5.f10432;
            this.f3569 = r5.f10429;
            this.f3575 = r5.f10431;
            this.f3573 = r5.f10433;
            if (r5.f10434 != null) {
                this.f3568 = Boolean.valueOf(r5.f10434.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
