package o;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: o.լɽ  reason: contains not printable characters */
public final class C3110 extends FilterInputStream {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final short f14211 = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));

    /* renamed from: ı  reason: contains not printable characters */
    private byte[] f14212 = new byte[8];

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f14213 = Integer.MAX_VALUE;

    /* renamed from: ǃ  reason: contains not printable characters */
    private byte[] f14214 = new byte[8];

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f14215;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f14216;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f14217;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f14218 = 8;

    /* renamed from: ι  reason: contains not printable characters */
    private byte[] f14219 = new byte[8];

    /* renamed from: І  reason: contains not printable characters */
    private int f14220 = 8;

    /* renamed from: і  reason: contains not printable characters */
    private int f14221;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f14222;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f14223;

    public final boolean markSupported() {
        return false;
    }

    public C3110(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        super(inputStream);
        this.f14216 = Math.min(Math.max(i2, 5), 16);
        this.f14221 = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.f14212, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i == 0) {
            this.f14222 = (int) j;
            long j2 = j >> 3;
            short s = f14211;
            this.f14217 = (int) ((((long) s) * j2) >> 32);
            this.f14223 = (int) (j >> 32);
            this.f14215 = (int) (j2 + ((long) s));
            return;
        }
        int i4 = (int) j;
        this.f14222 = i4;
        this.f14217 = i4 * i;
        this.f14223 = i4 ^ i;
        this.f14215 = (int) (j >> 32);
    }

    public final int read() {
        m15770();
        int i = this.f14218;
        if (i >= this.f14220) {
            return -1;
        }
        byte[] bArr = this.f14219;
        this.f14218 = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m15770();
            int i5 = this.f14218;
            if (i5 < this.f14220) {
                byte[] bArr2 = this.f14219;
                this.f14218 = i5 + 1;
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
        m15770();
        return this.f14220 - this.f14218;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m15771() {
        if (this.f14221 == 3) {
            byte[] bArr = this.f14219;
            System.arraycopy(bArr, 0, this.f14214, 0, bArr.length);
        }
        byte[] bArr2 = this.f14219;
        int i = ((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.f14216;
            if (i3 >= i4) {
                break;
            }
            short s = f14211;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.f14223)) ^ ((i >>> 5) + this.f14215);
            i -= (((i2 << 4) + this.f14222) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f14217);
            i3++;
        }
        byte[] bArr3 = this.f14219;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f14221 == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.f14219;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.f14212[i5]);
            }
            byte[] bArr5 = this.f14214;
            System.arraycopy(bArr5, 0, this.f14212, 0, bArr5.length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m15770() {
        /*
            r7 = this;
            int r0 = r7.f14213
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f14213 = r0
        L_0x000f:
            int r0 = r7.f14218
            r1 = 8
            if (r0 != r1) goto L_0x005b
            byte[] r0 = r7.f14219
            int r2 = r7.f14213
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0055
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.f14219
            int r6 = 8 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x004f
            r7.m15771()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f14213 = r0
            r7.f14218 = r4
            int r0 = r7.f14213
            if (r0 >= 0) goto L_0x004c
            byte[] r0 = r7.f14219
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004c:
            r7.f14220 = r1
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
            int r0 = r7.f14220
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3110.m15770():int");
    }
}
