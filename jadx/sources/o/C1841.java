package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: o.Ιʬ  reason: contains not printable characters */
public final class C1841 {

    /* renamed from: ı  reason: contains not printable characters */
    int f9437;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f9438;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f9439;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f9440;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f9441;

    /* renamed from: Ι  reason: contains not printable characters */
    private final byte[] f9442;

    /* renamed from: ι  reason: contains not printable characters */
    private int f9443;

    /* renamed from: І  reason: contains not printable characters */
    private int f9444;

    /* renamed from: і  reason: contains not printable characters */
    private int f9445;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final InputStream f9446;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f9447;

    /* renamed from: o.Ιʬ$ɩ  reason: contains not printable characters */
    public interface C1842 {
        /* renamed from: ı  reason: contains not printable characters */
        View m10189();

        /* renamed from: ı  reason: contains not printable characters */
        void m10190(int i, int i2);

        /* renamed from: ı  reason: contains not printable characters */
        void m10191(int i, int i2, int i3, int i4);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m10192(Drawable drawable);

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m10193();

        /* renamed from: ɩ  reason: contains not printable characters */
        Drawable m10194();

        /* renamed from: ι  reason: contains not printable characters */
        boolean m10195();
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C1841 m10175(byte[] bArr, int i) {
        C1841 r0 = new C1841(bArr, i);
        try {
            r0.m10169(i);
            return r0;
        } catch (C2991 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10179(int i) {
        int r0;
        int i2 = i & 7;
        if (i2 == 0) {
            int i3 = this.f9440;
            int i4 = this.f9443;
            if (i3 - i4 >= 10) {
                byte[] bArr = this.f9442;
                int i5 = i4;
                int i6 = 0;
                while (true) {
                    if (i6 >= 10) {
                        break;
                    }
                    int i7 = i5 + 1;
                    if (bArr[i5] >= 0) {
                        this.f9443 = i7;
                        break;
                    }
                    i6++;
                    i5 = i7;
                }
                return true;
            }
            for (int i8 = 0; i8 < 10; i8++) {
                if (m10171() >= 0) {
                    return true;
                }
            }
            throw new C2991("CodedInputStream encountered a malformed varint.");
        } else if (i2 == 1) {
            m10172(8);
            return true;
        } else if (i2 == 2) {
            m10172(m10188());
            return true;
        } else if (i2 == 3) {
            do {
                r0 = m10178();
                if (r0 == 0 || !m10179(r0)) {
                }
                r0 = m10178();
                break;
            } while (!m10179(r0));
            if (this.f9437 == (((i >>> 3) << 3) | 4)) {
                return true;
            }
            throw new C2991("Protocol message end-group tag did not match expected tag.");
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                m10172(4);
                return true;
            }
            throw new C2991("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m10184() {
        return m10186();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m10185() {
        int r0 = m10188();
        int i = this.f9440;
        int i2 = this.f9443;
        if (r0 <= i - i2 && r0 > 0) {
            String str = new String(this.f9442, i2, r0, C2702.f12516);
            this.f9443 += r0;
            return str;
        } else if (r0 == 0) {
            return "";
        } else {
            if (r0 > this.f9440) {
                return new String(m10174(r0), C2702.f12516);
            }
            if (m10176(r0)) {
                String str2 = new String(this.f9442, this.f9443, r0, C2702.f12516);
                this.f9443 += r0;
                return str2;
            }
            throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m10182() {
        byte[] bArr;
        int r0 = m10188();
        int i = this.f9443;
        int i2 = 0;
        if (r0 <= this.f9440 - i && r0 > 0) {
            bArr = this.f9442;
            this.f9443 = i + r0;
            i2 = i;
        } else if (r0 == 0) {
            return "";
        } else {
            if (r0 > this.f9440) {
                bArr = m10174(r0);
            } else if (m10176(r0)) {
                bArr = this.f9442;
                this.f9443 = r0;
            } else {
                throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (C3113.m15782(bArr, i2, i2 + r0)) {
            return new String(bArr, i2, r0, C2702.f12516);
        }
        throw new C2991("Protocol message had invalid UTF-8.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final <T extends C2993> T m10183(C3022<T> r4, C2269 r5) {
        int r0 = m10188();
        if (this.f9445 < this.f9444) {
            int r02 = m10169(r0);
            this.f9445++;
            T t = (C2993) r4.m15471(this, r5);
            if (this.f9437 == 0) {
                this.f9445--;
                this.f9441 = r02;
                m10170();
                return t;
            }
            throw new C2991("Protocol message end-group tag did not match expected tag.");
        }
        throw new C2991("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: і  reason: contains not printable characters */
    public final C1767 m10187() {
        int r0 = m10188();
        int i = this.f9440;
        int i2 = this.f9443;
        if (r0 <= i - i2 && r0 > 0) {
            C1767 r1 = C1767.m9856(this.f9442, i2, r0);
            this.f9443 += r0;
            return r1;
        } else if (r0 == 0) {
            return C1767.f9079;
        } else {
            return C1767.m9853(m10174(r0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* renamed from: Ӏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m10188() {
        /*
            r5 = this;
            int r0 = r5.f9443
            int r1 = r5.f9440
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f9442
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f9443 = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.f9443 = r1
            return r0
        L_0x006b:
            long r0 = r5.m10173()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1841.m10188():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* renamed from: І  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m10186() {
        /*
            r11 = this;
            int r0 = r11.f9443
            int r1 = r11.f9440
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f9442
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f9443 = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r2 = r3 ^ r5
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            r2 = r3
        L_0x00b5:
            r11.f9443 = r1
            return r2
        L_0x00b8:
            long r0 = r11.m10173()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1841.m10186():long");
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private long m10173() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte r3 = m10171();
            j |= ((long) (r3 & Byte.MAX_VALUE)) << i;
            if ((r3 & 128) == 0) {
                return j;
            }
        }
        throw new C2991("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long m10180() {
        int i = this.f9443;
        if (this.f9440 - i < 8) {
            if (m10176(8)) {
                i = this.f9443;
            } else {
                throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        byte[] bArr = this.f9442;
        this.f9443 = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private C1841(byte[] bArr, int i) {
        this.f9441 = Integer.MAX_VALUE;
        this.f9444 = 100;
        this.f9447 = 67108864;
        this.f9442 = bArr;
        this.f9440 = i;
        this.f9443 = 0;
        this.f9438 = 0;
        this.f9446 = null;
    }

    C1841(InputStream inputStream) {
        this.f9441 = Integer.MAX_VALUE;
        this.f9444 = 100;
        this.f9447 = 67108864;
        this.f9442 = new byte[C0872.f5653];
        this.f9443 = 0;
        this.f9438 = 0;
        this.f9446 = inputStream;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m10169(int i) {
        if (i >= 0) {
            int i2 = i + this.f9438 + this.f9443;
            int i3 = this.f9441;
            if (i2 <= i3) {
                this.f9441 = i2;
                m10170();
                return i3;
            }
            throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C2991("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private void m10170() {
        this.f9440 += this.f9439;
        int i = this.f9438;
        int i2 = this.f9440;
        int i3 = i + i2;
        int i4 = this.f9441;
        if (i3 > i4) {
            this.f9439 = i3 - i4;
            this.f9440 = i2 - this.f9439;
            return;
        }
        this.f9439 = 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m10176(int i) {
        do {
            int i2 = this.f9443;
            int i3 = i2 + i;
            int i4 = this.f9440;
            if (i3 > i4) {
                if (this.f9438 + i2 + i <= this.f9441 && this.f9446 != null) {
                    if (i2 > 0) {
                        if (i4 > i2) {
                            byte[] bArr = this.f9442;
                            System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                        }
                        this.f9438 += i2;
                        this.f9440 -= i2;
                        this.f9443 = 0;
                    }
                    InputStream inputStream = this.f9446;
                    byte[] bArr2 = this.f9442;
                    int i5 = this.f9440;
                    int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                    if (read == 0 || read < -1 || read > this.f9442.length) {
                        StringBuilder sb = new StringBuilder("InputStream#read(byte[]) returned invalid result: ");
                        sb.append(read);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    } else if (read > 0) {
                        this.f9440 += read;
                        if ((this.f9438 + i) - this.f9447 <= 0) {
                            m10170();
                        } else {
                            throw new C2991("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                        }
                    }
                }
                return false;
            }
            StringBuilder sb2 = new StringBuilder("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        } while (this.f9440 < i);
        return true;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private byte m10171() {
        if (this.f9443 != this.f9440 || m10176(1)) {
            byte[] bArr = this.f9442;
            int i = this.f9443;
            this.f9443 = i + 1;
            return bArr[i];
        }
        throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private byte[] m10174(int i) {
        if (i > 0) {
            int i2 = this.f9438;
            int i3 = this.f9443;
            int i4 = i2 + i3 + i;
            if (i4 <= this.f9447) {
                int i5 = this.f9441;
                if (i4 <= i5) {
                    InputStream inputStream = this.f9446;
                    if (inputStream != null) {
                        int i6 = this.f9440;
                        int i7 = i6 - i3;
                        this.f9438 = i2 + i6;
                        this.f9443 = 0;
                        this.f9440 = 0;
                        int i8 = i - i7;
                        if (i8 < 4096 || i8 <= inputStream.available()) {
                            byte[] bArr = new byte[i];
                            System.arraycopy(this.f9442, i3, bArr, 0, i7);
                            while (i7 < bArr.length) {
                                int read = this.f9446.read(bArr, i7, i - i7);
                                if (read != -1) {
                                    this.f9438 += read;
                                    i7 += read;
                                } else {
                                    throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                            }
                            return bArr;
                        }
                        ArrayList<byte[]> arrayList = new ArrayList<>();
                        while (i8 > 0) {
                            byte[] bArr2 = new byte[Math.min(i8, C0872.f5653)];
                            int i9 = 0;
                            while (i9 < bArr2.length) {
                                int read2 = this.f9446.read(bArr2, i9, bArr2.length - i9);
                                if (read2 != -1) {
                                    this.f9438 += read2;
                                    i9 += read2;
                                } else {
                                    throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                            }
                            i8 -= bArr2.length;
                            arrayList.add(bArr2);
                        }
                        byte[] bArr3 = new byte[i];
                        System.arraycopy(this.f9442, i3, bArr3, 0, i7);
                        for (byte[] bArr4 : arrayList) {
                            System.arraycopy(bArr4, 0, bArr3, i7, bArr4.length);
                            i7 += bArr4.length;
                        }
                        return bArr3;
                    }
                    throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                m10172((i5 - i2) - i3);
                throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new C2991("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        } else if (i == 0) {
            return C2702.f12517;
        } else {
            throw new C2991("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m10172(int i) {
        int i2 = this.f9440;
        int i3 = this.f9443;
        if (i > i2 - i3 || i < 0) {
            m10177(i);
        } else {
            this.f9443 = i3 + i;
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private void m10177(int i) {
        if (i >= 0) {
            int i2 = this.f9438;
            int i3 = this.f9443;
            int i4 = i2 + i3 + i;
            int i5 = this.f9441;
            if (i4 <= i5) {
                int i6 = this.f9440;
                int i7 = i6 - i3;
                this.f9443 = i6;
                if (m10176(1)) {
                    do {
                        int i8 = i - i7;
                        int i9 = this.f9440;
                        if (i8 > i9) {
                            i7 += i9;
                            this.f9443 = i9;
                        } else {
                            this.f9443 = i8;
                            return;
                        }
                    } while (m10176(1));
                    throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            m10172((i5 - i2) - i3);
            throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C2991("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m10178() {
        boolean z = true;
        if (this.f9443 != this.f9440 || m10176(1)) {
            z = false;
        }
        if (z) {
            this.f9437 = 0;
            return 0;
        }
        this.f9437 = m10188();
        int i = this.f9437;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw new C2991("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m10181() {
        int i = this.f9443;
        if (this.f9440 - i < 4) {
            if (m10176(4)) {
                i = this.f9443;
            } else {
                throw new C2991("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        byte[] bArr = this.f9442;
        this.f9443 = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
