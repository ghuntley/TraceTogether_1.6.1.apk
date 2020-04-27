package o;

import java.util.Arrays;

/* renamed from: o.ɩІ  reason: contains not printable characters */
public final class C1294 {

    /* renamed from: і  reason: contains not printable characters */
    private static int f7253 = 1;

    /* renamed from: ı  reason: contains not printable characters */
    public int f7254 = -1;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C1123[] f7255 = new C1123[8];

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f7256 = 0;

    /* renamed from: ɩ  reason: contains not printable characters */
    float[] f7257 = new float[7];

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f7258 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    public float f7259;

    /* renamed from: ι  reason: contains not printable characters */
    int f7260 = -1;

    /* renamed from: І  reason: contains not printable characters */
    C1295 f7261;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f7262 = 0;

    /* renamed from: o.ɩІ$ɩ  reason: contains not printable characters */
    public enum C1295 {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m8232() {
        f7253++;
    }

    public C1294(C1295 r3) {
        this.f7261 = r3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8234(C1123 r4) {
        int i = 0;
        while (true) {
            int i2 = this.f7262;
            if (i >= i2) {
                C1123[] r0 = this.f7255;
                if (i2 >= r0.length) {
                    this.f7255 = (C1123[]) Arrays.copyOf(r0, r0.length << 1);
                }
                C1123[] r02 = this.f7255;
                int i3 = this.f7262;
                r02[i3] = r4;
                this.f7262 = i3 + 1;
                return;
            } else if (this.f7255[i] != r4) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8236(C1123 r6) {
        int i = this.f7262;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7255[i2] == r6) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C1123[] r62 = this.f7255;
                    int i4 = i2 + i3;
                    r62[i4] = r62[i4 + 1];
                }
                this.f7262--;
                return;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8233(C1123 r6) {
        int i = this.f7262;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7255[i2].f6636.m6799(this.f7255[i2], r6);
        }
        this.f7262 = 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8235() {
        this.f7261 = C1295.UNKNOWN;
        this.f7256 = 0;
        this.f7254 = -1;
        this.f7260 = -1;
        this.f7259 = 0.0f;
        this.f7262 = 0;
        this.f7258 = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((String) null);
        return sb.toString();
    }
}
