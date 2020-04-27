package o;

import java.nio.charset.Charset;

/* renamed from: o.ſϳ  reason: contains not printable characters */
class C0594 extends C0626 {

    /* renamed from: ǃ  reason: contains not printable characters */
    protected final byte[] f4529;

    C0594(byte[] bArr) {
        if (bArr != null) {
            this.f4529 = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public int m5254() {
        return 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public byte m5249(int i) {
        return this.f4529[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public byte m5248(int i) {
        return this.f4529[i];
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m5252() {
        return this.f4529.length;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0510 m5253(int i, int i2) {
        int r3 = m4958(0, i2, m4967());
        if (r3 == 0) {
            return C0510.f4250;
        }
        return new C0584(this.f4529, m5254(), r3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5251(C0513 r4) {
        r4.m4975(this.f4529, m5254(), m4967());
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final String m5255(Charset charset) {
        return new String(this.f4529, m5254(), m4967(), charset);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m5257() {
        int r0 = m5254();
        return C2530.m13535(this.f4529, r0, m4967() + r0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0510) || m4967() != ((C0510) obj).m4967()) {
            return false;
        }
        if (m4967() == 0) {
            return true;
        }
        if (!(obj instanceof C0594)) {
            return obj.equals(this);
        }
        C0594 r5 = (C0594) obj;
        int r0 = m4964();
        int r1 = r5.m4964();
        if (r0 == 0 || r1 == 0 || r0 == r1) {
            return m5338(r5, 0, m4967());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5256(C0510 r6, int i, int i2) {
        if (i2 > r6.m4967()) {
            int r7 = m4967();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(r7);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > r6.m4967()) {
            int r62 = r6.m4967();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(r62);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(r6 instanceof C0594)) {
            return r6.m4968(0, i2).equals(m4968(0, i2));
        } else {
            C0594 r63 = (C0594) r6;
            byte[] bArr = this.f4529;
            byte[] bArr2 = r63.f4529;
            int r2 = m5254() + i2;
            int r8 = m5254();
            int r64 = r63.m5254();
            while (r8 < r2) {
                if (bArr[r8] != bArr2[r64]) {
                    return false;
                }
                r8++;
                r64++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m5250(int i, int i2, int i3) {
        return C0936.m6811(i, this.f4529, m5254(), i3);
    }
}
