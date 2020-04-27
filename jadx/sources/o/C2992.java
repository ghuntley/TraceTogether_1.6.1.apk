package o;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: o.ԟΙ  reason: contains not printable characters */
public final class C2992 extends FilterInputStream {

    /* renamed from: ı  reason: contains not printable characters */
    private short f13783;

    /* renamed from: ǃ  reason: contains not printable characters */
    private long[] f13784;

    /* renamed from: ɩ  reason: contains not printable characters */
    private byte[] f13785;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f13786 = Integer.MAX_VALUE;

    /* renamed from: Ι  reason: contains not printable characters */
    private long[] f13787;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f13788;

    /* renamed from: І  reason: contains not printable characters */
    private int f13789;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f13790;

    public final boolean markSupported() {
        return false;
    }

    public C2992(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        super(inputStream);
        this.f13788 = Math.min(Math.max(s, 4), 8);
        int i5 = this.f13788;
        this.f13785 = new byte[i5];
        this.f13787 = new long[4];
        this.f13784 = new long[4];
        this.f13790 = i5;
        this.f13789 = i5;
        this.f13787 = C3056.m15607(i ^ i4, i5 ^ i4);
        this.f13784 = C3056.m15607(i2 ^ i4, i3 ^ i4);
    }

    public final int read() {
        m15337();
        int i = this.f13790;
        if (i >= this.f13789) {
            return -1;
        }
        byte[] bArr = this.f13785;
        this.f13790 = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m15337();
            int i5 = this.f13790;
            if (i5 < this.f13789) {
                byte[] bArr2 = this.f13785;
                this.f13790 = i5 + 1;
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
        m15337();
        return this.f13789 - this.f13790;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m15336() {
        long[] jArr = this.f13787;
        long[] jArr2 = this.f13784;
        short s = this.f13783;
        int i = (s + 2) % 4;
        int i2 = (s + 3) % 4;
        jArr2[i2] = ((jArr[i2] * 2147483085) + jArr2[i]) / 2147483647L;
        jArr[i2] = ((jArr[s % 4] * 2147483085) + jArr2[i]) % 2147483647L;
        for (int i3 = 0; i3 < this.f13788; i3++) {
            byte[] bArr = this.f13785;
            bArr[i3] = (byte) ((int) (((long) bArr[i3]) ^ ((this.f13787[this.f13783] >> (i3 << 3)) & 255)));
        }
        this.f13783 = (short) ((this.f13783 + 1) % 4);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m15337() {
        int read;
        int i;
        if (this.f13786 == Integer.MAX_VALUE) {
            this.f13786 = this.in.read();
        }
        if (this.f13790 == this.f13788) {
            byte[] bArr = this.f13785;
            int i2 = this.f13786;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    read = this.in.read(this.f13785, i3, this.f13788 - i3);
                    if (read <= 0 || (i3 = i3 + read) >= this.f13788) {
                    }
                    read = this.in.read(this.f13785, i3, this.f13788 - i3);
                    break;
                } while ((i3 = i3 + read) >= this.f13788);
                if (i3 >= this.f13788) {
                    m15336();
                    this.f13786 = this.in.read();
                    this.f13790 = 0;
                    if (this.f13786 < 0) {
                        int i4 = this.f13788;
                        i = i4 - (this.f13785[i4 - 1] & 255);
                    } else {
                        i = this.f13788;
                    }
                    this.f13789 = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f13789;
    }
}
