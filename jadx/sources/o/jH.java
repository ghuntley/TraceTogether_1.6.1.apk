package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import sg.gov.tech.bluetrace.BuildConfig;

public final class jH implements jI, jK, Cloneable, ByteChannel {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final byte[] f2410 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: ı  reason: contains not printable characters */
    public long f2411;

    /* renamed from: ι  reason: contains not printable characters */
    jS f2412;

    public final void close() {
    }

    public final void flush() {
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ jK m2844() {
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final jH m2850() {
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final jK m2865() {
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jH m2876() {
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final OutputStream m2837() {
        return new OutputStream() {
            public final void close() {
            }

            public final void flush() {
            }

            public final void write(int i) {
                jH.this.m2899((int) (byte) i);
            }

            public final void write(byte[] bArr, int i, int i2) {
                jH.this.m2840(bArr, i, i2);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(jH.this);
                sb.append(".outputStream()");
                return sb.toString();
            }
        };
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m2890() {
        return this.f2411 == 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m2841(long j) {
        if (this.f2411 < j) {
            throw new EOFException();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2881(long j) {
        return this.f2411 >= j;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final InputStream m2845() {
        return new InputStream() {
            public final void close() {
            }

            public final int read() {
                if (jH.this.f2411 > 0) {
                    return jH.this.m2868() & 255;
                }
                return -1;
            }

            public final int read(byte[] bArr, int i, int i2) {
                return jH.this.m2858(bArr, i, i2);
            }

            public final int available() {
                return (int) Math.min(jH.this.f2411, 2147483647L);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(jH.this);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final jH m2864(jH jHVar, long j, long j2) {
        if (jHVar != null) {
            jX.m3051(this.f2411, j, j2);
            if (j2 == 0) {
                return this;
            }
            jHVar.f2411 += j2;
            jS jSVar = this.f2412;
            while (j >= ((long) (jSVar.f2447 - jSVar.f2449))) {
                j -= (long) (jSVar.f2447 - jSVar.f2449);
                jSVar = jSVar.f2450;
            }
            while (j2 > 0) {
                jSVar.f2445 = true;
                jS jSVar2 = new jS(jSVar.f2446, jSVar.f2449, jSVar.f2447, true, false);
                jSVar2.f2449 = (int) (((long) jSVar2.f2449) + j);
                jSVar2.f2447 = Math.min(jSVar2.f2449 + ((int) j2), jSVar2.f2447);
                jS jSVar3 = jHVar.f2412;
                if (jSVar3 == null) {
                    jSVar2.f2451 = jSVar2;
                    jSVar2.f2450 = jSVar2;
                    jHVar.f2412 = jSVar2;
                } else {
                    jS jSVar4 = jSVar3.f2451;
                    jSVar2.f2451 = jSVar4;
                    jSVar2.f2450 = jSVar4.f2450;
                    jSVar4.f2450.f2451 = jSVar2;
                    jSVar4.f2450 = jSVar2;
                }
                j2 -= (long) (jSVar2.f2447 - jSVar2.f2449);
                jSVar = jSVar.f2450;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: і  reason: contains not printable characters */
    public final long m2894() {
        long j = this.f2411;
        if (j == 0) {
            return 0;
        }
        jS jSVar = this.f2412.f2451;
        return (jSVar.f2447 >= 8192 || !jSVar.f2448) ? j : j - ((long) (jSVar.f2447 - jSVar.f2449));
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final byte m2868() {
        if (this.f2411 != 0) {
            jS jSVar = this.f2412;
            int i = jSVar.f2449;
            int i2 = jSVar.f2447;
            int i3 = i + 1;
            byte b = jSVar.f2446[i];
            this.f2411--;
            if (i3 == i2) {
                this.f2412 = jSVar.m2984();
                jV.m3018(jSVar);
            } else {
                jSVar.f2449 = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte m2847(long j) {
        jX.m3051(this.f2411, j, 1);
        long j2 = this.f2411;
        if (j2 - j > j) {
            jS jSVar = this.f2412;
            while (true) {
                long j3 = (long) (jSVar.f2447 - jSVar.f2449);
                if (j < j3) {
                    return jSVar.f2446[jSVar.f2449 + ((int) j)];
                }
                j -= j3;
                jSVar = jSVar.f2450;
            }
        } else {
            long j4 = j - j2;
            jS jSVar2 = this.f2412;
            do {
                jSVar2 = jSVar2.f2451;
                j4 += (long) (jSVar2.f2447 - jSVar2.f2449);
            } while (j4 < 0);
            return jSVar2.f2446[jSVar2.f2449 + ((int) j4)];
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public final short m2892() {
        if (this.f2411 >= 2) {
            jS jSVar = this.f2412;
            int i = jSVar.f2449;
            int i2 = jSVar.f2447;
            if (i2 - i < 2) {
                return (short) (((m2868() & 255) << 8) | (m2868() & 255));
            }
            byte[] bArr = jSVar.f2446;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f2411 -= 2;
            if (i4 == i2) {
                this.f2412 = jSVar.m2984();
                jV.m3018(jSVar);
            } else {
                jSVar.f2449 = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder("size < 2: ");
        sb.append(this.f2411);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m2897() {
        if (this.f2411 >= 4) {
            jS jSVar = this.f2412;
            int i = jSVar.f2449;
            int i2 = jSVar.f2447;
            if (i2 - i < 4) {
                return ((m2868() & 255) << 24) | ((m2868() & 255) << 16) | ((m2868() & 255) << 8) | (m2868() & 255);
            }
            byte[] bArr = jSVar.f2446;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f2411 -= 4;
            if (i6 == i2) {
                this.f2412 = jSVar.m2984();
                jV.m3018(jSVar);
            } else {
                jSVar.f2449 = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder("size < 4: ");
        sb.append(this.f2411);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final long m2854() {
        if (this.f2411 >= 8) {
            jS jSVar = this.f2412;
            int i = jSVar.f2449;
            int i2 = jSVar.f2447;
            if (i2 - i < 8) {
                return ((((long) m2897()) & 4294967295L) << 32) | (4294967295L & ((long) m2897()));
            }
            byte[] bArr = jSVar.f2446;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j = (((long) bArr[i9]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
            this.f2411 -= 8;
            if (i10 == i2) {
                this.f2412 = jSVar.m2984();
                jV.m3018(jSVar);
            } else {
                jSVar.f2449 = i10;
            }
            return j;
        }
        StringBuilder sb = new StringBuilder("size < 8: ");
        sb.append(this.f2411);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final short m2867() {
        return jX.m3049(m2892());
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final int m2856() {
        return jX.m3053(m2897());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r1 = new o.jH().m2846(r6).m2877((int) r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r3 != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1.m2868();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r3 = new java.lang.StringBuilder("Number too large: ");
        r3.append(r1.m2873());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001b  */
    /* renamed from: ɾ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m2871() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f2411
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00bd
            r1 = -7
            r5 = 0
            r6 = r3
            r3 = 0
            r4 = 0
        L_0x0010:
            o.jS r8 = r0.f2412
            byte[] r9 = r8.f2446
            int r10 = r8.f2449
            int r11 = r8.f2447
        L_0x0018:
            r12 = 1
            if (r10 >= r11) goto L_0x009c
            byte r13 = r9[r10]
            r14 = 48
            if (r13 < r14) goto L_0x006b
            r15 = 57
            if (r13 > r15) goto L_0x006b
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0041
            r15 = r8
            r16 = r9
            if (r12 != 0) goto L_0x003a
            long r8 = (long) r14
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            r8 = 10
            long r6 = r6 * r8
            long r8 = (long) r14
            long r6 = r6 + r8
            goto L_0x0078
        L_0x0041:
            o.jH r1 = new o.jH
            r1.<init>()
            o.jH r1 = r1.m2855(r6)
            o.jH r1 = r1.m2899((int) r13)
            if (r3 != 0) goto L_0x0053
            r1.m2868()
        L_0x0053:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Number too large: "
            r3.<init>(r4)
            java.lang.String r1 = r1.m2873()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006b:
            r15 = r8
            r16 = r9
            r8 = 45
            if (r13 != r8) goto L_0x0080
            if (r5 != 0) goto L_0x0080
            r8 = 1
            long r1 = r1 - r8
            r3 = 1
        L_0x0078:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r8 = r15
            r9 = r16
            goto L_0x0018
        L_0x0080:
            if (r5 == 0) goto L_0x0084
            r4 = 1
            goto L_0x009d
        L_0x0084:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009c:
            r15 = r8
        L_0x009d:
            if (r10 != r11) goto L_0x00a9
            o.jS r8 = r15.m2984()
            r0.f2412 = r8
            o.jV.m3018(r15)
            goto L_0x00ac
        L_0x00a9:
            r8 = r15
            r8.f2449 = r10
        L_0x00ac:
            if (r4 != 0) goto L_0x00b2
            o.jS r8 = r0.f2412
            if (r8 != 0) goto L_0x0010
        L_0x00b2:
            long r1 = r0.f2411
            long r4 = (long) r5
            long r1 = r1 - r4
            r0.f2411 = r1
            if (r3 == 0) goto L_0x00bb
            return r6
        L_0x00bb:
            long r1 = -r6
            return r1
        L_0x00bd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jH.m2871():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r8 != r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r15.f2412 = r6.m2984();
        o.jV.m3018(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r6.f2449 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r5 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074 A[SYNTHETIC] */
    /* renamed from: ӏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m2900() {
        /*
            r15 = this;
            long r0 = r15.f2411
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a7
            r0 = 0
            r0 = r2
            r4 = 0
            r5 = 0
        L_0x000c:
            o.jS r6 = r15.f2412
            byte[] r7 = r6.f2446
            int r8 = r6.f2449
            int r9 = r6.f2447
        L_0x0014:
            if (r8 >= r9) goto L_0x008c
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0023
            r11 = 57
            if (r10 > r11) goto L_0x0023
            int r11 = r10 + -48
            goto L_0x003b
        L_0x0023:
            r11 = 97
            if (r10 < r11) goto L_0x0030
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0030
            int r11 = r10 + -97
        L_0x002d:
            int r11 = r11 + 10
            goto L_0x003b
        L_0x0030:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002d
        L_0x003b:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r0
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004b
            r10 = 4
            long r0 = r0 << r10
            long r10 = (long) r11
            long r0 = r0 | r10
            int r8 = r8 + 1
            int r4 = r4 + 1
            goto L_0x0014
        L_0x004b:
            o.jH r2 = new o.jH
            r2.<init>()
            o.jH r0 = r2.m2866(r0)
            o.jH r0 = r0.m2899((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.m2873()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r4 == 0) goto L_0x0074
            r5 = 1
            goto L_0x008c
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008c:
            if (r8 != r9) goto L_0x0098
            o.jS r7 = r6.m2984()
            r15.f2412 = r7
            o.jV.m3018(r6)
            goto L_0x009a
        L_0x0098:
            r6.f2449 = r8
        L_0x009a:
            if (r5 != 0) goto L_0x00a0
            o.jS r6 = r15.f2412
            if (r6 != 0) goto L_0x000c
        L_0x00a0:
            long r2 = r15.f2411
            long r4 = (long) r4
            long r2 = r2 - r4
            r15.f2411 = r2
            return r0
        L_0x00a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jH.m2900():long");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final jM m2887(long j) {
        return new jM(m2870(j));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m2857(jN jNVar) {
        int r0 = m2848(jNVar, false);
        if (r0 == -1) {
            return -1;
        }
        try {
            m2896((long) jNVar.f2428[r0].m2967());
            return r0;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m2848(jN jNVar, boolean z) {
        int i;
        int i2;
        jS jSVar;
        jN jNVar2 = jNVar;
        jS jSVar2 = this.f2412;
        if (jSVar2 != null) {
            byte[] bArr = jSVar2.f2446;
            int i3 = jSVar2.f2449;
            int i4 = jSVar2.f2447;
            int[] iArr = jNVar2.f2427;
            int i5 = i3;
            int i6 = i4;
            int i7 = -1;
            jS jSVar3 = jSVar2;
            byte[] bArr2 = bArr;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (jSVar3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr2[i5] & 255) != iArr[i11]) {
                            return i7;
                        }
                        boolean z2 = i15 == i13;
                        if (i14 == i6) {
                            jSVar = jSVar3.f2450;
                            i2 = jSVar.f2449;
                            bArr2 = jSVar.f2446;
                            i6 = jSVar.f2447;
                            if (jSVar == jSVar2) {
                                if (!z2) {
                                    break loop0;
                                }
                                jSVar = null;
                            }
                        } else {
                            jS jSVar4 = jSVar3;
                            i2 = i14;
                            jSVar = jSVar4;
                        }
                        if (z2) {
                            i = iArr[i15];
                            break;
                        }
                        i5 = i2;
                        i11 = i15;
                        jSVar3 = jSVar;
                    }
                } else {
                    int i16 = i5 + 1;
                    byte b = bArr2[i5] & 255;
                    int i17 = i11 + i10;
                    while (i11 != i17) {
                        if (b == iArr[i11]) {
                            i = iArr[i11 + i10];
                            if (i16 == i6) {
                                jSVar = jSVar3.f2450;
                                i2 = jSVar.f2449;
                                bArr2 = jSVar.f2446;
                                i6 = jSVar.f2447;
                                if (jSVar == jSVar2) {
                                    jSVar = null;
                                }
                            } else {
                                jSVar = jSVar3;
                                i2 = i16;
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i >= 0) {
                    return i;
                }
                int i18 = -i;
                i5 = i2;
                jSVar3 = jSVar;
                i8 = i18;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return jNVar2.indexOf(jM.f2423);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m2888(jH jHVar, long j) {
        long j2 = this.f2411;
        if (j2 >= j) {
            jHVar.write(this, j);
        } else {
            jHVar.write(this, j2);
            throw new EOFException();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m2849(jZ jZVar) {
        long j = this.f2411;
        if (j > 0) {
            jZVar.write(this, j);
        }
        return j;
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public final String m2873() {
        try {
            return m2884(this.f2411, jX.f2464);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m2861(Charset charset) {
        try {
            return m2884(this.f2411, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m2884(long j, Charset charset) {
        jX.m3051(this.f2411, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            jS jSVar = this.f2412;
            if (((long) jSVar.f2449) + j > ((long) jSVar.f2447)) {
                return new String(m2870(j), charset);
            }
            String str = new String(jSVar.f2446, jSVar.f2449, (int) j, charset);
            jSVar.f2449 = (int) (((long) jSVar.f2449) + j);
            this.f2411 -= j;
            if (jSVar.f2449 == jSVar.f2447) {
                this.f2412 = jSVar.m2984();
                jV.m3018(jSVar);
            }
            return str;
        }
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final String m2843() {
        return m2860(Long.MAX_VALUE);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m2860(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long r4 = m2883((byte) 10, 0, j2);
            if (r4 != -1) {
                return m2898(r4);
            }
            if (j2 < this.f2411 && m2847(j2 - 1) == 13 && m2847(j2) == 10) {
                return m2898(j2);
            }
            jH jHVar = new jH();
            m2864(jHVar, 0, Math.min(32, this.f2411));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.f2411, j));
            sb.append(" content=");
            sb.append(new jM(jHVar.m2893()).m2965());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String m2898(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (m2847(j2) == 13) {
                String r7 = m2884(j2, jX.f2464);
                m2896(2);
                return r7;
            }
        }
        String r72 = m2884(j, jX.f2464);
        m2896(1);
        return r72;
    }

    /* renamed from: г  reason: contains not printable characters */
    public final byte[] m2893() {
        try {
            return m2870(this.f2411);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final byte[] m2870(long j) {
        jX.m3051(this.f2411, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            m2889(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m2889(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int r1 = m2858(bArr, i, bArr.length - i);
            if (r1 != -1) {
                i += r1;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m2858(byte[] bArr, int i, int i2) {
        jX.m3051((long) bArr.length, (long) i, (long) i2);
        jS jSVar = this.f2412;
        if (jSVar == null) {
            return -1;
        }
        int min = Math.min(i2, jSVar.f2447 - jSVar.f2449);
        System.arraycopy(jSVar.f2446, jSVar.f2449, bArr, i, min);
        jSVar.f2449 += min;
        this.f2411 -= (long) min;
        if (jSVar.f2449 == jSVar.f2447) {
            this.f2412 = jSVar.m2984();
            jV.m3018(jSVar);
        }
        return min;
    }

    public final int read(ByteBuffer byteBuffer) {
        jS jSVar = this.f2412;
        if (jSVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), jSVar.f2447 - jSVar.f2449);
        byteBuffer.put(jSVar.f2446, jSVar.f2449, min);
        jSVar.f2449 += min;
        this.f2411 -= (long) min;
        if (jSVar.f2449 == jSVar.f2447) {
            this.f2412 = jSVar.m2984();
            jV.m3018(jSVar);
        }
        return min;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m2896(long j) {
        while (j > 0) {
            jS jSVar = this.f2412;
            if (jSVar != null) {
                int min = (int) Math.min(j, (long) (jSVar.f2447 - this.f2412.f2449));
                long j2 = (long) min;
                this.f2411 -= j2;
                j -= j2;
                this.f2412.f2449 += min;
                if (this.f2412.f2449 == this.f2412.f2447) {
                    jS jSVar2 = this.f2412;
                    this.f2412 = jSVar2.m2984();
                    jV.m3018(jSVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final jH m2863(String str) {
        return m2880(str, 0, str.length());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final jH m2880(String str, int i, int i2) {
        char c;
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    jS r2 = m2853(1);
                    byte[] bArr = r2.f2446;
                    int i3 = r2.f2447 - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = (i3 + i) - r2.f2447;
                            r2.f2447 += i5;
                            this.f2411 += (long) i5;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = (i3 + i) - r2.f2447;
                    r2.f2447 += i52;
                    this.f2411 += (long) i52;
                } else {
                    if (charAt2 < 2048) {
                        m2899((charAt2 >> 6) | 192);
                        m2899((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        m2899((charAt2 >> 12) | 224);
                        m2899(((charAt2 >> 6) & 63) | 128);
                        m2899((int) (charAt2 & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c = str.charAt(i6);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || c < 56320 || c > 57343) {
                            m2899(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt2 & 10239) << 10) | (9215 & c)) + 0;
                            m2899((i7 >> 18) | 240);
                            m2899(((i7 >> 12) & 63) | 128);
                            m2899(((i7 >> 6) & 63) | 128);
                            m2899((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final jH m2838(int i) {
        if (i < 128) {
            m2899(i);
        } else if (i < 2048) {
            m2899((i >> 6) | 192);
            m2899((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                m2899((i >> 12) | 224);
                m2899(((i >> 6) & 63) | 128);
                m2899((i & 63) | 128);
            } else {
                m2899(63);
            }
        } else if (i <= 1114111) {
            m2899((i >> 18) | 240);
            m2899(((i >> 12) & 63) | 128);
            m2899(((i >> 6) & 63) | 128);
            m2899((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jH m2878(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(jX.f2464)) {
            return m2880(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return m2840(bytes, 0, bytes.length);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final jH m2840(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            jX.m3051((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                jS r0 = m2853(1);
                int min = Math.min(i3 - i, 8192 - r0.f2447);
                System.arraycopy(bArr, i, r0.f2446, r0.f2447, min);
                i += min;
                r0.f2447 += min;
            }
            this.f2411 += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                jS r2 = m2853(1);
                int min = Math.min(i, 8192 - r2.f2447);
                byteBuffer.get(r2.f2446, r2.f2447, min);
                i -= min;
                r2.f2447 += min;
            }
            this.f2411 += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m2875(jY jYVar) {
        if (jYVar != null) {
            long j = 0;
            while (true) {
                long read = jYVar.read(this, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final jH m2899(int i) {
        jS r0 = m2853(1);
        byte[] bArr = r0.f2446;
        int i2 = r0.f2447;
        r0.f2447 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f2411++;
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final jH m2895(int i) {
        jS r0 = m2853(2);
        byte[] bArr = r0.f2446;
        int i2 = r0.f2447;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        r0.f2447 = i3 + 1;
        this.f2411 += 2;
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final jH m2869(int i) {
        jS r0 = m2853(4);
        byte[] bArr = r0.f2446;
        int i2 = r0.f2447;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        r0.f2447 = i5 + 1;
        this.f2411 += 4;
        return this;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final jH m2891(long j) {
        jS r1 = m2853(8);
        byte[] bArr = r1.f2446;
        int i = r1.f2447;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        r1.f2447 = i8 + 1;
        this.f2411 += 8;
        return this;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final jH m2855(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return m2899(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return m2880("-9223372036854775808", 0, 20);
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < BuildConfig.BLACKLIST_DURATION ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        jS r2 = m2853(i2);
        byte[] bArr = r2.f2446;
        int i3 = r2.f2447 + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f2410[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        r2.f2447 += i2;
        this.f2411 += (long) i2;
        return this;
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final jH m2866(long j) {
        if (j == 0) {
            return m2899(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        jS r2 = m2853(numberOfTrailingZeros);
        byte[] bArr = r2.f2446;
        int i = r2.f2447;
        for (int i2 = (r2.f2447 + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f2410[(int) (15 & j)];
            j >>>= 4;
        }
        r2.f2447 += numberOfTrailingZeros;
        this.f2411 += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final jS m2853(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        jS jSVar = this.f2412;
        if (jSVar == null) {
            this.f2412 = jV.m3017();
            jS jSVar2 = this.f2412;
            jSVar2.f2451 = jSVar2;
            jSVar2.f2450 = jSVar2;
            return jSVar2;
        }
        jS jSVar3 = jSVar.f2451;
        if (jSVar3.f2447 + i <= 8192 && jSVar3.f2448) {
            return jSVar3;
        }
        jS r4 = jV.m3017();
        r4.f2451 = jSVar3;
        r4.f2450 = jSVar3.f2450;
        jSVar3.f2450.f2451 = r4;
        jSVar3.f2450 = r4;
        return r4;
    }

    public final void write(jH jHVar, long j) {
        jS jSVar;
        int i;
        if (jHVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (jHVar != this) {
            jX.m3051(jHVar.f2411, 0, j);
            while (j > 0) {
                int i2 = 0;
                if (j < ((long) (jHVar.f2412.f2447 - jHVar.f2412.f2449))) {
                    jS jSVar2 = this.f2412;
                    jS jSVar3 = jSVar2 != null ? jSVar2.f2451 : null;
                    if (jSVar3 != null && jSVar3.f2448) {
                        long j2 = ((long) jSVar3.f2447) + j;
                        if (jSVar3.f2445) {
                            i = 0;
                        } else {
                            i = jSVar3.f2449;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            jHVar.f2412.m2985(jSVar3, (int) j);
                            jHVar.f2411 -= j;
                            this.f2411 += j;
                            return;
                        }
                    }
                    jS jSVar4 = jHVar.f2412;
                    int i3 = (int) j;
                    if (i3 <= 0 || i3 > jSVar4.f2447 - jSVar4.f2449) {
                        throw new IllegalArgumentException();
                    }
                    if (i3 >= 1024) {
                        jSVar4.f2445 = true;
                        jSVar = new jS(jSVar4.f2446, jSVar4.f2449, jSVar4.f2447, true, false);
                    } else {
                        jSVar = jV.m3017();
                        System.arraycopy(jSVar4.f2446, jSVar4.f2449, jSVar.f2446, 0, i3);
                    }
                    jSVar.f2447 = jSVar.f2449 + i3;
                    jSVar4.f2449 += i3;
                    jS jSVar5 = jSVar4.f2451;
                    jSVar.f2451 = jSVar5;
                    jSVar.f2450 = jSVar5.f2450;
                    jSVar5.f2450.f2451 = jSVar;
                    jSVar5.f2450 = jSVar;
                    jHVar.f2412 = jSVar;
                }
                jS jSVar6 = jHVar.f2412;
                long j3 = (long) (jSVar6.f2447 - jSVar6.f2449);
                jHVar.f2412 = jSVar6.m2984();
                jS jSVar7 = this.f2412;
                if (jSVar7 == null) {
                    this.f2412 = jSVar6;
                    jS jSVar8 = this.f2412;
                    jSVar8.f2451 = jSVar8;
                    jSVar8.f2450 = jSVar8;
                } else {
                    jS jSVar9 = jSVar7.f2451;
                    jSVar6.f2451 = jSVar9;
                    jSVar6.f2450 = jSVar9.f2450;
                    jSVar9.f2450.f2451 = jSVar6;
                    jSVar9.f2450 = jSVar6;
                    if (jSVar6.f2451 == jSVar6) {
                        throw new IllegalStateException();
                    } else if (jSVar6.f2451.f2448) {
                        int i4 = jSVar6.f2447 - jSVar6.f2449;
                        int i5 = 8192 - jSVar6.f2451.f2447;
                        if (!jSVar6.f2451.f2445) {
                            i2 = jSVar6.f2451.f2449;
                        }
                        if (i4 <= i5 + i2) {
                            jSVar6.m2985(jSVar6.f2451, i4);
                            jSVar6.m2984();
                            jV.m3018(jSVar6);
                        }
                    }
                }
                jHVar.f2411 -= j3;
                this.f2411 += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final long read(jH jHVar, long j) {
        if (jHVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f2411;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            jHVar.write(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public final long m2842() {
        return m2883((byte) 0, 0, Long.MAX_VALUE);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final long m2883(byte b, long j, long j2) {
        jS jSVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f2411), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f2411;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (jSVar = this.f2412) == null) {
            return -1;
        }
        long j5 = this.f2411;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = ((long) (jSVar.f2447 - jSVar.f2449)) + j5;
                if (j3 >= j) {
                    break;
                }
                jSVar = jSVar.f2450;
            }
        } else {
            while (j5 > j) {
                jSVar = jSVar.f2451;
                j5 -= (long) (jSVar.f2447 - jSVar.f2449);
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = jSVar.f2446;
            int min = (int) Math.min((long) jSVar.f2447, (((long) jSVar.f2449) + j4) - j5);
            for (int i = (int) ((((long) jSVar.f2449) + j6) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - jSVar.f2449)) + j5;
                }
            }
            byte b2 = b;
            j6 = ((long) (jSVar.f2447 - jSVar.f2449)) + j5;
            jSVar = jSVar.f2450;
            j5 = j6;
        }
        return -1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m2836(jM jMVar) {
        return m2859(jMVar, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long m2859(jM jMVar, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            jS jSVar = this.f2412;
            if (jSVar == null) {
                return -1;
            }
            long j3 = this.f2411;
            if (j3 - j >= j) {
                while (true) {
                    j3 = j2;
                    j2 = ((long) (jSVar.f2447 - jSVar.f2449)) + j3;
                    if (j2 >= j) {
                        break;
                    }
                    jSVar = jSVar.f2450;
                }
            } else {
                while (j3 > j) {
                    jSVar = jSVar.f2451;
                    j3 -= (long) (jSVar.f2447 - jSVar.f2449);
                }
            }
            if (jMVar.m2967() == 2) {
                byte r0 = jMVar.m2956(0);
                byte r12 = jMVar.m2956(1);
                while (j3 < this.f2411) {
                    byte[] bArr = jSVar.f2446;
                    i = (int) ((((long) jSVar.f2449) + j) - j3);
                    int i3 = jSVar.f2447;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == r0 || b == r12) {
                            i2 = jSVar.f2449;
                        } else {
                            i++;
                        }
                    }
                    j = ((long) (jSVar.f2447 - jSVar.f2449)) + j3;
                    jSVar = jSVar.f2450;
                    j3 = j;
                }
                return -1;
            }
            byte[] r122 = jMVar.m2966();
            while (j3 < this.f2411) {
                byte[] bArr2 = jSVar.f2446;
                int i4 = (int) ((((long) jSVar.f2449) + j) - j3);
                int i5 = jSVar.f2447;
                while (i < i5) {
                    byte b2 = bArr2[i];
                    int length = r122.length;
                    int i6 = 0;
                    while (i6 < length) {
                        if (b2 == r122[i6]) {
                            i2 = jSVar.f2449;
                        } else {
                            i6++;
                        }
                    }
                    i4 = i + 1;
                }
                j = ((long) (jSVar.f2447 - jSVar.f2449)) + j3;
                jSVar = jSVar.f2450;
                j3 = j;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2882(jM jMVar) {
        int r0 = jMVar.m2967();
        if (r0 < 0 || this.f2411 < ((long) r0) || jMVar.m2967() < r0) {
            return false;
        }
        for (int i = 0; i < r0; i++) {
            if (m2847(((long) i) + 0) != jMVar.m2956(i)) {
                return false;
            }
        }
        return true;
    }

    public final C3533kb timeout() {
        return C3533kb.NONE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jH)) {
            return false;
        }
        jH jHVar = (jH) obj;
        long j = this.f2411;
        if (j != jHVar.f2411) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        jS jSVar = this.f2412;
        jS jSVar2 = jHVar.f2412;
        int i = jSVar.f2449;
        int i2 = jSVar2.f2449;
        while (j2 < this.f2411) {
            long min = (long) Math.min(jSVar.f2447 - i, jSVar2.f2447 - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (jSVar.f2446[i4] != jSVar2.f2446[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == jSVar.f2447) {
                jSVar = jSVar.f2450;
                i = jSVar.f2449;
            } else {
                i = i4;
            }
            if (i3 == jSVar2.f2447) {
                jSVar2 = jSVar2.f2450;
                i2 = jSVar2.f2449;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        jS jSVar = this.f2412;
        if (jSVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jSVar.f2447;
            for (int i3 = jSVar.f2449; i3 < i2; i3++) {
                i = (i * 31) + jSVar.f2446[i3];
            }
            jSVar = jSVar.f2450;
        } while (jSVar != this.f2412);
        return i;
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public final jH clone() {
        jH jHVar = new jH();
        if (this.f2411 == 0) {
            return jHVar;
        }
        jS jSVar = this.f2412;
        jSVar.f2445 = true;
        jHVar.f2412 = new jS(jSVar.f2446, jSVar.f2449, jSVar.f2447, true, false);
        jS jSVar2 = jHVar.f2412;
        jSVar2.f2451 = jSVar2;
        jSVar2.f2450 = jSVar2;
        jS jSVar3 = this.f2412;
        while (true) {
            jSVar3 = jSVar3.f2450;
            if (jSVar3 != this.f2412) {
                jS jSVar4 = jHVar.f2412.f2451;
                jSVar3.f2445 = true;
                jS jSVar5 = new jS(jSVar3.f2446, jSVar3.f2449, jSVar3.f2447, true, false);
                jSVar5.f2451 = jSVar4;
                jSVar5.f2450 = jSVar4.f2450;
                jSVar4.f2450.f2451 = jSVar5;
                jSVar4.f2450 = jSVar5;
            } else {
                jHVar.f2411 = this.f2411;
                return jHVar;
            }
        }
    }

    /* renamed from: o.jH$if  reason: invalid class name */
    public static final class Cif implements Closeable {

        /* renamed from: ı  reason: contains not printable characters */
        public long f2415 = -1;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public int f2416 = -1;

        /* renamed from: ǃ  reason: contains not printable characters */
        public byte[] f2417;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f2418 = -1;

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean f2419;

        /* renamed from: ι  reason: contains not printable characters */
        public jH f2420;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private jS f2421;

        /* renamed from: ι  reason: contains not printable characters */
        public final int m2901(long j) {
            jS jSVar;
            long j2;
            jS jSVar2;
            int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i < 0 || j > this.f2420.f2411) {
                throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f2420.f2411)}));
            } else if (i == 0 || j == this.f2420.f2411) {
                this.f2421 = null;
                this.f2415 = j;
                this.f2417 = null;
                this.f2418 = -1;
                this.f2416 = -1;
                return -1;
            } else {
                long j3 = 0;
                long j4 = this.f2420.f2411;
                jS jSVar3 = this.f2420.f2412;
                jS jSVar4 = this.f2420.f2412;
                jS jSVar5 = this.f2421;
                if (jSVar5 != null) {
                    long j5 = this.f2415 - ((long) (this.f2418 - jSVar5.f2449));
                    if (j5 > j) {
                        jSVar4 = this.f2421;
                        j4 = j5;
                    } else {
                        jSVar3 = this.f2421;
                        j3 = j5;
                    }
                }
                if (j4 - j > j - j3) {
                    while (j >= ((long) (jSVar.f2447 - jSVar.f2449)) + j2) {
                        j3 = j2 + ((long) (jSVar.f2447 - jSVar.f2449));
                        jSVar3 = jSVar.f2450;
                    }
                } else {
                    j2 = j4;
                    jSVar = jSVar4;
                    while (j2 > j) {
                        jSVar = jSVar.f2451;
                        j2 -= (long) (jSVar.f2447 - jSVar.f2449);
                    }
                }
                if (!this.f2419 || !jSVar.f2445) {
                    jSVar2 = jSVar;
                } else {
                    jSVar2 = jSVar.m2986();
                    if (this.f2420.f2412 == jSVar) {
                        this.f2420.f2412 = jSVar2;
                    }
                    jSVar2.f2451 = jSVar;
                    jSVar2.f2450 = jSVar.f2450;
                    jSVar.f2450.f2451 = jSVar2;
                    jSVar.f2450 = jSVar2;
                    jSVar2.f2451.m2984();
                }
                this.f2421 = jSVar2;
                this.f2415 = j;
                this.f2417 = jSVar2.f2446;
                this.f2418 = jSVar2.f2449 + ((int) (j - j2));
                this.f2416 = jSVar2.f2447;
                return this.f2416 - this.f2418;
            }
        }

        public final void close() {
            if (this.f2420 != null) {
                this.f2420 = null;
                this.f2421 = null;
                this.f2415 = -1;
                this.f2417 = null;
                this.f2418 = -1;
                this.f2416 = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }
    }

    public final String toString() {
        Object obj;
        long j = this.f2411;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                obj = jM.f2423;
            } else {
                obj = new jT(this, i);
            }
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.f2411);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ jK m2879(String str) {
        return m2880(str, 0, str.length());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ jK m2852(byte[] bArr) {
        if (bArr != null) {
            return m2840(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ jK m2851(jM jMVar) {
        if (jMVar != null) {
            jMVar.m2958(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }
}
