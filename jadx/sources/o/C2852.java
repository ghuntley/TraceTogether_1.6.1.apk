package o;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: o.Ӏԁ  reason: contains not printable characters */
public final class C2852 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2441 f13298;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C1818 f13299;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ String f13300;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ AppMeasurementDynamiteService f13301;

    public C2852(AppMeasurementDynamiteService appMeasurementDynamiteService, C1818 r2, C2441 r3, String str) {
        this.f13301 = appMeasurementDynamiteService;
        this.f13299 = r2;
        this.f13298 = r3;
        this.f13300 = str;
    }

    public final void run() {
        this.f13301.f601.m14093().m6375(this.f13299, this.f13298, this.f13300);
    }
}
