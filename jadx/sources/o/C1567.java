package o;

import android.graphics.PointF;

/* renamed from: o.ɿɹ  reason: contains not printable characters */
public final class C1567 implements C1455 {

    /* renamed from: ı  reason: contains not printable characters */
    public final If f8320;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C1282 f8321;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f8322;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1431<PointF, PointF> f8323;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C1282 f8324;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1282 f8325;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1282 f8326;

    /* renamed from: І  reason: contains not printable characters */
    public final C1282 f8327;

    /* renamed from: і  reason: contains not printable characters */
    public final boolean f8328;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C1282 f8329;

    /* renamed from: o.ɿɹ$If */
    public enum If {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f8333;

        private If(int i) {
            this.f8333 = i;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static If m9208(int i) {
            for (If ifR : values()) {
                if (ifR.f8333 == i) {
                    return ifR;
                }
            }
            return null;
        }
    }

    public C1567(String str, If ifR, C1282 r3, C1431<PointF, PointF> r4, C1282 r5, C1282 r6, C1282 r7, C1282 r8, C1282 r9, boolean z) {
        this.f8322 = str;
        this.f8320 = ifR;
        this.f8326 = r3;
        this.f8323 = r4;
        this.f8325 = r5;
        this.f8327 = r6;
        this.f8321 = r7;
        this.f8329 = r8;
        this.f8324 = r9;
        this.f8328 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0550 m9207(C0379 r2, C1578 r3) {
        return new C0652(r2, r3, this);
    }
}
