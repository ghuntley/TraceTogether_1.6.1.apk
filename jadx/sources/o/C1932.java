package o;

import java.util.Arrays;

/* renamed from: o.ε  reason: contains not printable characters */
public class C1932 extends C1696 {

    /* renamed from: ʃ  reason: contains not printable characters */
    protected C1696[] f9760 = new C1696[4];

    /* renamed from: ͽ  reason: contains not printable characters */
    protected int f9761 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10556(C1696 r4) {
        int i = this.f9761 + 1;
        C1696[] r1 = this.f9760;
        if (i > r1.length) {
            this.f9760 = (C1696[]) Arrays.copyOf(r1, r1.length << 1);
        }
        C1696[] r0 = this.f9760;
        int i2 = this.f9761;
        r0[i2] = r4;
        this.f9761 = i2 + 1;
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final void m10555() {
        this.f9761 = 0;
    }
}
