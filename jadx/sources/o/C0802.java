package o;

import java.util.Map;

/* renamed from: o.ƶǃ  reason: contains not printable characters */
final /* synthetic */ class C0802 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0796 f5277;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Exception f5278;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final byte[] f5279;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map f5280;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f5281;

    C0802(C0796 r1, int i, Exception exc, byte[] bArr, Map map) {
        this.f5277 = r1;
        this.f5281 = i;
        this.f5278 = exc;
        this.f5279 = bArr;
        this.f5280 = map;
    }

    public final void run() {
        this.f5277.m6172(this.f5281, this.f5278, this.f5279, this.f5280);
    }
}
