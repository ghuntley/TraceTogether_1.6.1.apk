package o;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: o.ԟӀ  reason: contains not printable characters */
public final class C2996 extends FilterInputStream {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[] f13798 = C2995.f13796;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f13799 = C2995.f13794;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int[] f13800 = C2995.f13793;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int[] f13801 = C2995.f13797;

    /* renamed from: ι  reason: contains not printable characters */
    private static final byte[] f13802 = C2995.f13791;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int[] f13803;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f13804 = 16;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final byte[] f13805 = new byte[16];

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int[] f13806 = new int[4];

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f13807 = 16;

    /* renamed from: І  reason: contains not printable characters */
    private final int f13808;

    /* renamed from: і  reason: contains not printable characters */
    private final byte[] f13809 = new byte[16];

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final byte[][] f13810;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f13811 = Integer.MAX_VALUE;

    public final boolean markSupported() {
        return false;
    }

    public C2996(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.f13808 = i;
        this.f13803 = C2995.m15343(bArr, i);
        this.f13810 = m15347(bArr2);
    }

    public final int read() {
        m15348();
        int i = this.f13804;
        if (i >= this.f13807) {
            return -1;
        }
        byte[] bArr = this.f13805;
        this.f13804 = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m15348();
            int i5 = this.f13804;
            if (i5 < this.f13807) {
                byte[] bArr2 = this.f13805;
                this.f13804 = i5 + 1;
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
        m15348();
        return this.f13807 - this.f13804;
    }

    public final void close() {
        super.close();
    }

    public final synchronized void mark(int i) {
    }

    public final synchronized void reset() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static byte[][] m15347(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            for (int i2 = 0; i2 < bArr[i].length; i2++) {
                bArr2[i][bArr[i][i2]] = (byte) i2;
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m15348() {
        /*
            r7 = this;
            int r0 = r7.f13811
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f13811 = r0
        L_0x000f:
            int r0 = r7.f13804
            r1 = 16
            if (r0 != r1) goto L_0x0060
            byte[] r0 = r7.f13809
            int r2 = r7.f13811
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x005a
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.f13809
            int r6 = 16 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x0054
            byte[] r0 = r7.f13809
            byte[] r2 = r7.f13805
            r7.m15346(r0, r2)
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f13811 = r0
            r7.f13804 = r4
            int r0 = r7.f13811
            if (r0 >= 0) goto L_0x0051
            byte[] r0 = r7.f13805
            r2 = 15
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x0051:
            r7.f13807 = r1
            goto L_0x0060
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x005a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0060:
            int r0 = r7.f13807
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2996.m15348():int");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m15346(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f13806;
        char c = 1;
        byte b = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f13803;
        iArr[0] = b ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ ((((bArr[12] << 24) | ((bArr[13] & 255) << 16)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i = 1;
        int i2 = 4;
        while (i < this.f13808) {
            int[] iArr3 = f13800;
            int[] iArr4 = this.f13806;
            byte[][] bArr3 = this.f13810;
            int i3 = iArr3[iArr4[bArr3[0][0]] >>> 24];
            int[] iArr5 = f13798;
            int i4 = i3 ^ iArr5[(iArr4[bArr3[c][0]] >>> 16) & 255];
            int[] iArr6 = f13801;
            int i5 = iArr6[(iArr4[bArr3[2][0]] >>> 8) & 255] ^ i4;
            int[] iArr7 = f13799;
            int i6 = iArr7[iArr4[bArr3[3][0]] & 255] ^ i5;
            int[] iArr8 = this.f13803;
            int i7 = i6 ^ iArr8[i2];
            int i8 = ((iArr6[(iArr4[bArr3[2][c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr3[0][c]] >>> 24] ^ iArr5[(iArr4[bArr3[c][c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr3[3][c]] & 255]) ^ iArr8[i2 + 1];
            int i9 = (((iArr5[(iArr4[bArr3[c][2]] >>> 16) & 255] ^ iArr3[iArr4[bArr3[0][2]] >>> 24]) ^ iArr6[(iArr4[bArr3[2][2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][2]] & 255]) ^ iArr8[i2 + 2];
            iArr4[0] = i7;
            iArr4[1] = i8;
            iArr4[2] = i9;
            iArr4[3] = (((iArr3[iArr4[bArr3[0][3]] >>> 24] ^ iArr5[(iArr4[bArr3[1][3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr3[2][3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][3]] & 255]) ^ iArr8[i2 + 3];
            i++;
            i2 += 4;
            c = 1;
        }
        int[] iArr9 = this.f13803;
        int i10 = iArr9[i2];
        byte[] bArr4 = f13802;
        int[] iArr10 = this.f13806;
        byte[][] bArr5 = this.f13810;
        bArr2[0] = (byte) (bArr4[iArr10[bArr5[0][0]] >>> 24] ^ (i10 >>> 24));
        bArr2[1] = (byte) (bArr4[(iArr10[bArr5[1][0]] >>> 16) & 255] ^ (i10 >>> 16));
        bArr2[2] = (byte) (bArr4[(iArr10[bArr5[2][0]] >>> 8) & 255] ^ (i10 >>> 8));
        bArr2[3] = (byte) (i10 ^ bArr4[iArr10[bArr5[3][0]] & 255]);
        int i11 = iArr9[i2 + 1];
        bArr2[4] = (byte) (bArr4[iArr10[bArr5[0][1]] >>> 24] ^ (i11 >>> 24));
        bArr2[5] = (byte) (bArr4[(iArr10[bArr5[1][1]] >>> 16) & 255] ^ (i11 >>> 16));
        bArr2[6] = (byte) (bArr4[(iArr10[bArr5[2][1]] >>> 8) & 255] ^ (i11 >>> 8));
        bArr2[7] = (byte) (i11 ^ bArr4[iArr10[bArr5[3][1]] & 255]);
        int i12 = iArr9[i2 + 2];
        bArr2[8] = (byte) (bArr4[iArr10[bArr5[0][2]] >>> 24] ^ (i12 >>> 24));
        bArr2[9] = (byte) (bArr4[(iArr10[bArr5[1][2]] >>> 16) & 255] ^ (i12 >>> 16));
        bArr2[10] = (byte) (bArr4[(iArr10[bArr5[2][2]] >>> 8) & 255] ^ (i12 >>> 8));
        bArr2[11] = (byte) (i12 ^ bArr4[iArr10[bArr5[3][2]] & 255]);
        int i13 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr4[iArr10[bArr5[0][3]] >>> 24] ^ (i13 >>> 24));
        bArr2[13] = (byte) (bArr4[(iArr10[bArr5[1][3]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[14] = (byte) (bArr4[(iArr10[bArr5[2][3]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[15] = (byte) (i13 ^ bArr4[iArr10[bArr5[3][3]] & 255]);
    }
}
