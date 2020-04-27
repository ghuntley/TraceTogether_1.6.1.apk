package o;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: o.ҝІ  reason: contains not printable characters */
public final class C2707 extends FilterInputStream {

    /* renamed from: ı  reason: contains not printable characters */
    private final int f12520;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f12521;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C2708 f12522;

    /* renamed from: ɩ  reason: contains not printable characters */
    private byte[] f12523;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f12524;

    /* renamed from: Ι  reason: contains not printable characters */
    private byte[] f12525;

    /* renamed from: ι  reason: contains not printable characters */
    private byte[] f12526;

    /* renamed from: І  reason: contains not printable characters */
    private int f12527;

    /* renamed from: і  reason: contains not printable characters */
    private int[] f12528;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f12529 = Integer.MAX_VALUE;

    public final boolean markSupported() {
        return false;
    }

    public C2707(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) {
        super(inputStream);
        this.f12520 = Math.min(Math.max(i, 3), 16);
        this.f12523 = new byte[8];
        this.f12526 = new byte[8];
        this.f12525 = new byte[8];
        this.f12528 = new int[2];
        this.f12527 = 8;
        this.f12521 = 8;
        this.f12524 = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, this.f12526, 0, 8);
        }
        this.f12522 = new C2708(iArr, this.f12520, true);
    }

    public final int read() {
        m14402();
        int i = this.f12527;
        if (i >= this.f12521) {
            return -1;
        }
        byte[] bArr = this.f12523;
        this.f12527 = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m14402();
            int i5 = this.f12527;
            if (i5 < this.f12521) {
                byte[] bArr2 = this.f12523;
                this.f12527 = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int available() {
        m14402();
        return this.f12521 - this.f12527;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m14403() {
        if (this.f12524 == 2) {
            byte[] bArr = this.f12523;
            System.arraycopy(bArr, 0, this.f12525, 0, bArr.length);
        }
        byte[] bArr2 = this.f12523;
        C0416.m4707(((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.f12520, this.f12522.f12532, this.f12522.f12531, this.f12528);
        int[] iArr = this.f12528;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.f12523;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f12524 == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.f12523;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.f12526[i3]);
            }
            byte[] bArr5 = this.f12525;
            System.arraycopy(bArr5, 0, this.f12526, 0, bArr5.length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m14402() {
        /*
            r7 = this;
            int r0 = r7.f12529
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f12529 = r0
        L_0x000f:
            int r0 = r7.f12527
            r1 = 8
            if (r0 != r1) goto L_0x005b
            byte[] r0 = r7.f12523
            int r2 = r7.f12529
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0055
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.f12523
            int r6 = 8 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x004f
            r7.m14403()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f12529 = r0
            r7.f12527 = r4
            int r0 = r7.f12529
            if (r0 >= 0) goto L_0x004c
            byte[] r0 = r7.f12523
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004c:
            r7.f12521 = r1
            goto L_0x005b
        L_0x004f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x005b:
            int r0 = r7.f12521
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2707.m14402():int");
    }
}
