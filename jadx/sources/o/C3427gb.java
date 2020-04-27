package o;

/* renamed from: o.gb  reason: case insensitive filesystem */
public final class C3427gb {

    /* renamed from: ı  reason: contains not printable characters */
    public final long f2214;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long f2215;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long f2216;

    /* renamed from: ȷ  reason: contains not printable characters */
    private long f2217;

    /* renamed from: ɨ  reason: contains not printable characters */
    public final int f2218;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int f2219;

    /* renamed from: ɪ  reason: contains not printable characters */
    public final int f2220;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final long f2221;

    /* renamed from: Ι  reason: contains not printable characters */
    public final int f2222;

    /* renamed from: ι  reason: contains not printable characters */
    public final long f2223;

    /* renamed from: І  reason: contains not printable characters */
    public final long f2224;

    /* renamed from: і  reason: contains not printable characters */
    public final long f2225;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final long f2226;

    /* renamed from: ӏ  reason: contains not printable characters */
    public final int f2227;

    public C3427gb() {
    }

    public C3427gb(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f2219 = i;
        this.f2222 = i2;
        this.f2214 = j;
        this.f2223 = j2;
        this.f2216 = j3;
        this.f2221 = j4;
        this.f2215 = j5;
        this.f2225 = j6;
        this.f2226 = j7;
        this.f2224 = j8;
        this.f2218 = i3;
        this.f2220 = i4;
        this.f2227 = i5;
        this.f2217 = j9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsSnapshot{maxSize=");
        sb.append(this.f2219);
        sb.append(", size=");
        sb.append(this.f2222);
        sb.append(", cacheHits=");
        sb.append(this.f2214);
        sb.append(", cacheMisses=");
        sb.append(this.f2223);
        sb.append(", downloadCount=");
        sb.append(this.f2218);
        sb.append(", totalDownloadSize=");
        sb.append(this.f2216);
        sb.append(", averageDownloadSize=");
        sb.append(this.f2225);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.f2221);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.f2215);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.f2226);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.f2224);
        sb.append(", originalBitmapCount=");
        sb.append(this.f2220);
        sb.append(", transformedBitmapCount=");
        sb.append(this.f2227);
        sb.append(", timeStamp=");
        sb.append(this.f2217);
        sb.append('}');
        return sb.toString();
    }
}
