package o;

/* renamed from: o.ŀӏ  reason: contains not printable characters */
final class C0519 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f4290;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final String f4291;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f4292;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f4293;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String f4294;

    /* renamed from: ɾ  reason: contains not printable characters */
    private String f4295;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f4296;

    /* renamed from: ι  reason: contains not printable characters */
    public final Boolean f4297;

    /* renamed from: І  reason: contains not printable characters */
    public final String f4298;

    /* renamed from: і  reason: contains not printable characters */
    public final String f4299;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String f4300;

    public C0519(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f4292 = str;
        this.f4293 = str2;
        this.f4290 = str3;
        this.f4297 = bool;
        this.f4296 = str4;
        this.f4291 = str5;
        this.f4300 = str6;
        this.f4299 = str7;
        this.f4298 = str8;
        this.f4294 = str9;
    }

    public final String toString() {
        if (this.f4295 == null) {
            StringBuilder sb = new StringBuilder("appBundleId=");
            sb.append(this.f4292);
            sb.append(", executionId=");
            sb.append(this.f4293);
            sb.append(", installationId=");
            sb.append(this.f4290);
            sb.append(", limitAdTrackingEnabled=");
            sb.append(this.f4297);
            sb.append(", betaDeviceToken=");
            sb.append(this.f4296);
            sb.append(", buildId=");
            sb.append(this.f4291);
            sb.append(", osVersion=");
            sb.append(this.f4300);
            sb.append(", deviceModel=");
            sb.append(this.f4299);
            sb.append(", appVersionCode=");
            sb.append(this.f4298);
            sb.append(", appVersionName=");
            sb.append(this.f4294);
            this.f4295 = sb.toString();
        }
        return this.f4295;
    }
}
