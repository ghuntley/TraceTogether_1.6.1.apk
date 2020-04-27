package o;

import android.content.Context;
import java.util.Random;

/* renamed from: o.Ӏȣ  reason: contains not printable characters */
public final class C2775 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Random f13146 = new Random();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C2023 f13147 = C2022.f9992;

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2234 f13148 = new C0410();

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f13149;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private long f13150;

    /* renamed from: ι  reason: contains not printable characters */
    public volatile boolean f13151;

    /* renamed from: і  reason: contains not printable characters */
    private final C0367 f13152;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m14664(int i) {
        return (i >= 500 && i < 600) || i == -2 || i == 429 || i == 408;
    }

    public C2775(Context context, C0367 r2, long j) {
        this.f13149 = context;
        this.f13152 = r2;
        this.f13150 = j;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14665(C2940 r9) {
        long r0 = f13147.m10847() + this.f13150;
        r9.m15183(C3060.m15613(this.f13152), this.f13149);
        int i = 1000;
        while (f13147.m10847() + ((long) i) <= r0) {
            if (!(r9.f13654 >= 200 && r9.f13654 < 300) && m14664(r9.f13654)) {
                try {
                    f13148.m11684(f13146.nextInt(250) + i);
                    if (i < 30000) {
                        i = r9.f13654 != -2 ? i << 1 : 1000;
                    }
                    if (!this.f13151) {
                        r9.m15178();
                        r9.m15183(C3060.m15613(this.f13152), this.f13149);
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } else {
                return;
            }
        }
    }
}
