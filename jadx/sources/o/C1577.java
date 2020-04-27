package o;

import android.graphics.Path;

/* renamed from: o.ɿӏ  reason: contains not printable characters */
public final class C1577 implements C1455 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f8378;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1292 f8379;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1267 f8380;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final boolean f8381;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean f8382;

    /* renamed from: ι  reason: contains not printable characters */
    public final Path.FillType f8383;

    public C1577(String str, boolean z, Path.FillType fillType, C1292 r4, C1267 r5, boolean z2) {
        this.f8378 = str;
        this.f8381 = z;
        this.f8383 = fillType;
        this.f8379 = r4;
        this.f8380 = r5;
        this.f8382 = z2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0550 m9246(C0379 r2, C1578 r3) {
        return new C0599(r2, r3, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.f8381);
        sb.append('}');
        return sb.toString();
    }
}
