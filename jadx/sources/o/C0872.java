package o;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: o.ǀӀ  reason: contains not printable characters */
final class C0872 implements Flushable {

    /* renamed from: ı  reason: contains not printable characters */
    public static final int f5651 = 8;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int f5652 = 4;

    /* renamed from: ι  reason: contains not printable characters */
    public static final int f5653 = 4096;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f5654;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final byte[] f5655;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f5656;

    /* renamed from: І  reason: contains not printable characters */
    private final OutputStream f5657;

    /* renamed from: ı  reason: contains not printable characters */
    public static int m6448(double d) {
        return 8;
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public static int m6452(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m6456(float f) {
        return 4;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m6457(int i) {
        return i > 4096 ? f5653 : i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m6459(boolean z) {
        return 1;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public static int m6460(int i) {
        return 4;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public static long m6461(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public static int m6463(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m6480(int i) {
        return 4;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m6483(long j) {
        return 8;
    }

    /* renamed from: г  reason: contains not printable characters */
    public static int m6484(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static int m6490(long j) {
        return 8;
    }

    private C0872(byte[] bArr, int i, int i2) {
        this.f5657 = null;
        this.f5655 = bArr;
        this.f5656 = i;
        this.f5654 = i + i2;
    }

    private C0872(OutputStream outputStream, byte[] bArr) {
        this.f5657 = outputStream;
        this.f5655 = bArr;
        this.f5656 = 0;
        this.f5654 = bArr.length;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0872 m6479(OutputStream outputStream) {
        return m6474(outputStream, (int) f5653);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0872 m6474(OutputStream outputStream, int i) {
        return new C0872(outputStream, new byte[i]);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0872 m6475(byte[] bArr) {
        return m6451(bArr, 0, bArr.length);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0872 m6451(byte[] bArr, int i, int i2) {
        return new C0872(bArr, i, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6501(int i, double d) {
        m6517(i, 1);
        m6520(d);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6522(int i, float f) {
        m6517(i, 5);
        m6509(f);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6495(int i, long j) {
        m6517(i, 0);
        m6496(j);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6512(int i, long j) {
        m6517(i, 0);
        m6514(j);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6502(int i, int i2) {
        m6517(i, 0);
        m6510(i2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6530(int i, long j) {
        m6517(i, 1);
        m6505(j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6523(int i, int i2) {
        m6517(i, 5);
        m6521(i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6513(int i, boolean z) {
        m6517(i, 0);
        m6515(z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6525(int i, String str) {
        m6517(i, 2);
        m6497(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6531(int i, C0754 r3) {
        m6517(i, 2);
        m6506(r3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6494(int i, int i2) {
        m6517(i, 0);
        m6493(i2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6529(int i, int i2) {
        m6517(i, 0);
        m6528(i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6511(int i, int i2) {
        m6517(i, 5);
        m6535(i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6503(int i, long j) {
        m6517(i, 1);
        m6532(j);
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m6534(int i, int i2) {
        m6517(i, 0);
        m6499(i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6524(int i, long j) {
        m6517(i, 0);
        m6526(j);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6504(int i, C0754 r5) {
        m6517(1, 3);
        m6494(2, i);
        m6531(3, r5);
        m6517(1, 4);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6520(double d) {
        m6537(Double.doubleToRawLongBits(d));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6509(float f) {
        m6498(Float.floatToRawIntBits(f));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6496(long j) {
        m6516(j);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6514(long j) {
        m6516(j);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6510(int i) {
        if (i >= 0) {
            m6518(i);
        } else {
            m6516((long) i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6505(long j) {
        m6537(j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6521(int i) {
        m6498(i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6515(boolean z) {
        m6536(z ? 1 : 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6497(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m6518(bytes.length);
        m6533(bytes);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6506(C0754 r2) {
        m6518(r2.m6024());
        m6527(r2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6493(int i) {
        m6518(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6528(int i) {
        m6510(i);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m6535(int i) {
        m6498(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6532(long j) {
        m6537(j);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m6499(int i) {
        m6518(m6452(i));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6526(long j) {
        m6516(m6461(j));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m6473(int i, double d) {
        return m6462(i) + m6448(d);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m6458(int i, float f) {
        return m6462(i) + m6456(f);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m6454(int i, long j) {
        return m6462(i) + m6455(j);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m6470(int i, long j) {
        return m6462(i) + m6487(j);
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m6481(int i, int i2) {
        return m6462(i) + m6485(i2);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static int m6489(int i, long j) {
        return m6462(i) + m6490(j);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static int m6488(int i, int i2) {
        return m6462(i) + m6480(i2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m6477(int i, boolean z) {
        return m6462(i) + m6459(z);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m6464(int i, String str) {
        return m6462(i) + m6478(str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m6465(int i, C0754 r1) {
        return m6462(i) + m6450(r1);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m6469(int i, int i2) {
        return m6462(i) + m6468(i2);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m6453(int i, int i2) {
        return m6462(i) + m6472(i2);
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public static int m6491(int i, int i2) {
        return m6462(i) + m6460(i2);
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m6486(int i, long j) {
        return m6462(i) + m6483(j);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public static int m6467(int i, int i2) {
        return m6462(i) + m6466(i2);
    }

    /* renamed from: І  reason: contains not printable characters */
    public static int m6482(int i, long j) {
        return m6462(i) + m6471(j);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m6449(int i, C0754 r3) {
        return (m6462(1) << 1) + m6469(2, i) + m6465(3, r3);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m6455(long j) {
        return m6463(j);
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m6487(long j) {
        return m6463(j);
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m6485(int i) {
        if (i >= 0) {
            return m6484(i);
        }
        return 10;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m6478(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m6484(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m6450(C0754 r1) {
        return m6484(r1.m6024()) + r1.m6024();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m6468(int i) {
        return m6484(i);
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public static int m6472(int i) {
        return m6485(i);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public static int m6466(int i) {
        return m6484(m6452(i));
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static int m6471(long j) {
        return m6463(m6461(j));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6476() {
        OutputStream outputStream = this.f5657;
        if (outputStream != null) {
            outputStream.write(this.f5655, 0, this.f5656);
            this.f5656 = 0;
            return;
        }
        throw new C0873();
    }

    public final void flush() {
        if (this.f5657 != null) {
            m6476();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m6492() {
        if (this.f5657 == null) {
            return this.f5654 - this.f5656;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6500() {
        if (m6492() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: o.ǀӀ$ɩ  reason: contains not printable characters */
    static class C0873 extends IOException {

        /* renamed from: ɩ  reason: contains not printable characters */
        private static final long f5658 = -6947486886997889499L;

        C0873() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6519(byte b) {
        if (this.f5656 == this.f5654) {
            m6476();
        }
        byte[] bArr = this.f5655;
        int i = this.f5656;
        this.f5656 = i + 1;
        bArr[i] = b;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m6536(int i) {
        m6519((byte) i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6527(C0754 r3) {
        m6507(r3, 0, r3.m6024());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6533(byte[] bArr) {
        m6508(bArr, 0, bArr.length);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6508(byte[] bArr, int i, int i2) {
        int i3 = this.f5654;
        int i4 = this.f5656;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f5655, i4, i2);
            this.f5656 += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f5655, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f5656 = this.f5654;
        m6476();
        if (i7 <= this.f5654) {
            System.arraycopy(bArr, i6, this.f5655, 0, i7);
            this.f5656 = i7;
            return;
        }
        this.f5657.write(bArr, i6, i7);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6507(C0754 r7, int i, int i2) {
        int i3 = this.f5654;
        int i4 = this.f5656;
        if (i3 - i4 >= i2) {
            r7.m6023(this.f5655, i, i4, i2);
            this.f5656 += i2;
            return;
        }
        int i5 = i3 - i4;
        r7.m6023(this.f5655, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f5656 = this.f5654;
        m6476();
        if (i7 <= this.f5654) {
            r7.m6023(this.f5655, i6, 0, i7);
            this.f5656 = i7;
            return;
        }
        InputStream r72 = r7.m6026();
        long j = (long) i6;
        if (j == r72.skip(j)) {
            while (i7 > 0) {
                int min = Math.min(i7, this.f5654);
                int read = r72.read(this.f5655, 0, min);
                if (read == min) {
                    this.f5657.write(this.f5655, 0, read);
                    i7 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final void m6517(int i, int i2) {
        m6518(C1506.m8929(i, i2));
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public static int m6462(int i) {
        return m6484(C1506.m8929(i, 0));
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public final void m6518(int i) {
        while ((i & -128) != 0) {
            m6536((i & 127) | 128);
            i >>>= 7;
        }
        m6536(i);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final void m6516(long j) {
        while ((-128 & j) != 0) {
            m6536((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m6536((int) j);
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final void m6498(int i) {
        m6536(i & 255);
        m6536((i >> 8) & 255);
        m6536((i >> 16) & 255);
        m6536(i >>> 24);
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m6537(long j) {
        m6536(((int) j) & 255);
        m6536(((int) (j >> 8)) & 255);
        m6536(((int) (j >> 16)) & 255);
        m6536(((int) (j >> 24)) & 255);
        m6536(((int) (j >> 32)) & 255);
        m6536(((int) (j >> 40)) & 255);
        m6536(((int) (j >> 48)) & 255);
        m6536(((int) (j >> 56)) & 255);
    }
}
