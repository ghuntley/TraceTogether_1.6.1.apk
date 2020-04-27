package o;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: o.Ɉǀ  reason: contains not printable characters */
public final class C1033 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ String f6280;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C1818 f6281;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ AppMeasurementDynamiteService f6282;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f6283;

    public C1033(AppMeasurementDynamiteService appMeasurementDynamiteService, C1818 r2, String str, String str2) {
        this.f6282 = appMeasurementDynamiteService;
        this.f6281 = r2;
        this.f6283 = str;
        this.f6280 = str2;
    }

    public final void run() {
        this.f6282.f601.m14093().m6374(this.f6281, this.f6283, this.f6280);
    }
}
