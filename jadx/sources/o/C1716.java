package o;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: o.ʭІ  reason: contains not printable characters */
public final class C1716 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ String f8904;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ boolean f8905;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C1818 f8906;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ AppMeasurementDynamiteService f8907;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f8908;

    public C1716(AppMeasurementDynamiteService appMeasurementDynamiteService, C1818 r2, String str, String str2, boolean z) {
        this.f8907 = appMeasurementDynamiteService;
        this.f8906 = r2;
        this.f8908 = str;
        this.f8904 = str2;
        this.f8905 = z;
    }

    public final void run() {
        this.f8907.f601.m14093().m6368(this.f8906, this.f8908, this.f8904, this.f8905);
    }
}
