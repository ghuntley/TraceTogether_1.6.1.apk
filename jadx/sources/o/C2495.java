package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import o.C2745;

/* renamed from: o.хӀ  reason: contains not printable characters */
public final class C2495 implements C2606 {

    /* renamed from: ı  reason: contains not printable characters */
    private AlarmManager f11298;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2602 f11299;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2693 f11300;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2572 f11301;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f11302;

    public C2495(Context context, C2602 r9, C2693 r10, C2572 r11) {
        this(context, r9, (AlarmManager) context.getSystemService("alarm"), r10, r11);
    }

    private C2495(Context context, C2602 r2, AlarmManager alarmManager, C2693 r4, C2572 r5) {
        this.f11302 = context;
        this.f11299 = r2;
        this.f11298 = alarmManager;
        this.f11300 = r4;
        this.f11301 = r5;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13246(C2291 r9, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", r9.m11959());
        builder.appendQueryParameter("priority", String.valueOf(C2745.C3657iF.m14550(r9.m11961())));
        if (r9.m11960() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(r9.m11960(), 0));
        }
        Intent intent = new Intent(this.f11302, C2469.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (PendingIntent.getBroadcast(this.f11302, 0, intent, 536870912) != null) {
            new Object[1][0] = r9;
            return;
        }
        long r4 = this.f11299.m13792(r9);
        long r6 = this.f11301.m13681(r9.m11961(), r4, i);
        Object[] objArr = {r9, Long.valueOf(r6), Long.valueOf(r4), Integer.valueOf(i)};
        this.f11298.set(3, this.f11300.m14297() + r6, PendingIntent.getBroadcast(this.f11302, 0, intent, 0));
    }
}
