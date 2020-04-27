package o;

/* renamed from: o.լʝ  reason: contains not printable characters */
final class C3113 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final C3115 f14228 = (C3073.m15669() && C3073.m15671() ? new Cif() : new If());

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ int m15776(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ int m15779(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ int m15780(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m15782(byte[] bArr, int i, int i2) {
        return f14228.m15790(bArr, i, i2) == 0;
    }

    /* renamed from: o.լʝ$ǃ  reason: contains not printable characters */
    static class C3114 extends IllegalArgumentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C3114(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3113.C3114.<init>(int, int):void");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m15781(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C3114(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m15777(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f14228.m15789(charSequence, bArr, i, i2);
    }

    /* renamed from: o.լʝ$ɩ  reason: contains not printable characters */
    static abstract class C3115 {
        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract int m15789(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public abstract int m15790(byte[] bArr, int i, int i2);

        C3115() {
        }
    }

    /* renamed from: o.լʝ$If */
    static final class If extends C3115 {
        If() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final int m15783(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new C3114(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    StringBuilder sb = new StringBuilder("Failed writing ");
                    sb.append(charAt2);
                    sb.append(" at index ");
                    sb.append(i8);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                } else {
                    throw new C3114(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final int m15784(byte[] bArr, int i, int i2) {
            while (r9 < i2 && bArr[r9] >= 0) {
                i = r9 + 1;
            }
            if (r9 >= i2) {
                return 0;
            }
            while (r9 < i2) {
                int i3 = r9 + 1;
                byte b = bArr[r9];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            r9 = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return C3113.m15778(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            r9 = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return C3113.m15778(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                r9 = i3;
            }
            return 0;
        }
    }

    /* renamed from: o.լʝ$if  reason: invalid class name */
    static final class Cif extends C3115 {
        Cif() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final int m15788(byte[] bArr, int i, int i2) {
            if ((i | i2 | (bArr.length - i2)) >= 0) {
                long r0 = C3073.m15673() + ((long) i);
                return m15786(bArr, r0, (int) ((C3073.m15673() + ((long) i2)) - r0));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[LOOP:1: B:14:0x003d->B:39:0x0105, LOOP_START, PHI: r2 r3 r4 r11 
  PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r4v4 long) = (r4v3 long), (r4v6 long) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x0034, B:39:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int m15787(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
            /*
                r22 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                r3 = r26
                long r4 = o.C3073.m15673()
                long r6 = (long) r2
                long r4 = r4 + r6
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r23.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x014f
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x014f
                r2 = 0
            L_0x001f:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x0034
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0034
                long r11 = r11 + r4
                byte r3 = (byte) r13
                o.C3073.m15675(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001f
            L_0x0034:
                if (r2 != r8) goto L_0x003d
                long r0 = o.C3073.m15673()
            L_0x003a:
                long r4 = r4 - r0
                int r0 = (int) r4
                return r0
            L_0x003d:
                if (r2 >= r8) goto L_0x0149
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0055
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x0055
                long r14 = r4 + r11
                byte r13 = (byte) r13
                o.C3073.m15675(r1, r4, r13)
                r4 = r11
                r12 = r14
            L_0x0051:
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x0105
            L_0x0055:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x007f
                r14 = 2
                long r14 = r6 - r14
                int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r16 > 0) goto L_0x007f
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                o.C3073.m15675(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                o.C3073.m15675(r1, r14, r5)
                r20 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r20
                goto L_0x0105
            L_0x007f:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x0089
                if (r3 >= r13) goto L_0x00b8
            L_0x0089:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00b8
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                o.C3073.m15675(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                o.C3073.m15675(r1, r14, r5)
                r14 = 1
                long r18 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                o.C3073.m15675(r1, r3, r5)
                r12 = r18
                r4 = 1
                goto L_0x0051
            L_0x00b8:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x0119
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0111
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0110
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                o.C3073.m15675(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                o.C3073.m15675(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                o.C3073.m15675(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                o.C3073.m15675(r1, r14, r2)
                r2 = r3
            L_0x0105:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                r20 = r4
                r4 = r12
                r11 = r20
                goto L_0x003d
            L_0x0110:
                r2 = r3
            L_0x0111:
                o.լʝ$ǃ r0 = new o.լʝ$ǃ
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x0119:
                if (r14 > r13) goto L_0x0131
                if (r13 > r3) goto L_0x0131
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x012b
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0131
            L_0x012b:
                o.լʝ$ǃ r0 = new o.լʝ$ǃ
                r0.<init>(r2, r8)
                throw r0
            L_0x0131:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0149:
                long r0 = o.C3073.m15673()
                goto L_0x003a
            L_0x014f:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3113.Cif.m15787(java.lang.CharSequence, byte[], int, int):int");
        }

        /* renamed from: ı  reason: contains not printable characters */
        private static int m15785(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return C3113.m15776(i);
            }
            if (i2 == 1) {
                return C3113.m15779(i, C3073.m15672(bArr, j));
            }
            if (i2 == 2) {
                return C3113.m15780(i, (int) C3073.m15672(bArr, j), (int) C3073.m15672(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a1, code lost:
            return -1;
         */
        /* renamed from: ǃ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int m15786(byte[] r17, long r18, int r20) {
            /*
                r0 = r17
                r1 = r18
                r3 = r20
                r4 = 0
                r5 = 1
                r7 = 16
                if (r3 >= r7) goto L_0x000f
                r7 = 0
                goto L_0x0042
            L_0x000f:
                int r7 = (int) r1
                r7 = r7 & 7
                r9 = r1
                r8 = r7
            L_0x0014:
                if (r8 <= 0) goto L_0x0024
                long r11 = r9 + r5
                byte r9 = o.C3073.m15672((byte[]) r0, (long) r9)
                if (r9 >= 0) goto L_0x0020
                int r7 = r7 - r8
                goto L_0x0042
            L_0x0020:
                int r8 = r8 + -1
                r9 = r11
                goto L_0x0014
            L_0x0024:
                int r7 = r3 - r7
            L_0x0026:
                r8 = 8
                if (r7 < r8) goto L_0x0040
                long r11 = o.C3073.m15668(r0, r9)
                r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r11 = r11 & r13
                r13 = 0
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 != 0) goto L_0x0040
                r11 = 8
                long r9 = r9 + r11
                int r7 = r7 + -8
                goto L_0x0026
            L_0x0040:
                int r7 = r3 - r7
            L_0x0042:
                int r3 = r3 - r7
                long r7 = (long) r7
                long r1 = r1 + r7
            L_0x0045:
                r7 = 0
            L_0x0046:
                if (r3 <= 0) goto L_0x0056
                long r7 = r1 + r5
                byte r1 = o.C3073.m15672((byte[]) r0, (long) r1)
                if (r1 < 0) goto L_0x0059
                int r3 = r3 + -1
                r15 = r7
                r7 = r1
                r1 = r15
                goto L_0x0046
            L_0x0056:
                r15 = r1
                r1 = r7
                r7 = r15
            L_0x0059:
                if (r3 != 0) goto L_0x005c
                return r4
            L_0x005c:
                int r3 = r3 + -1
                r2 = -32
                r9 = -65
                r10 = -1
                if (r1 >= r2) goto L_0x0077
                if (r3 != 0) goto L_0x0068
                return r1
            L_0x0068:
                int r3 = r3 + -1
                r2 = -62
                if (r1 < r2) goto L_0x0076
                long r1 = r7 + r5
                byte r7 = o.C3073.m15672((byte[]) r0, (long) r7)
                if (r7 <= r9) goto L_0x0045
            L_0x0076:
                return r10
            L_0x0077:
                r11 = -16
                if (r1 >= r11) goto L_0x00a2
                r11 = 2
                if (r3 >= r11) goto L_0x0083
                int r0 = m15785(r0, r1, r7, r3)
                return r0
            L_0x0083:
                int r3 = r3 + -2
                long r11 = r7 + r5
                byte r7 = o.C3073.m15672((byte[]) r0, (long) r7)
                if (r7 > r9) goto L_0x00a1
                r8 = -96
                if (r1 != r2) goto L_0x0093
                if (r7 < r8) goto L_0x00a1
            L_0x0093:
                r2 = -19
                if (r1 != r2) goto L_0x0099
                if (r7 >= r8) goto L_0x00a1
            L_0x0099:
                long r1 = r11 + r5
                byte r7 = o.C3073.m15672((byte[]) r0, (long) r11)
                if (r7 <= r9) goto L_0x0045
            L_0x00a1:
                return r10
            L_0x00a2:
                r2 = 3
                if (r3 >= r2) goto L_0x00aa
                int r0 = m15785(r0, r1, r7, r3)
                return r0
            L_0x00aa:
                int r3 = r3 + -3
                long r11 = r7 + r5
                byte r2 = o.C3073.m15672((byte[]) r0, (long) r7)
                if (r2 > r9) goto L_0x00d1
                int r1 = r1 << 28
                int r2 = r2 + 112
                int r1 = r1 + r2
                int r1 = r1 >> 30
                if (r1 != 0) goto L_0x00d1
                long r1 = r11 + r5
                byte r7 = o.C3073.m15672((byte[]) r0, (long) r11)
                if (r7 > r9) goto L_0x00d1
                long r7 = r1 + r5
                byte r1 = o.C3073.m15672((byte[]) r0, (long) r1)
                if (r1 <= r9) goto L_0x00ce
                goto L_0x00d1
            L_0x00ce:
                r1 = r7
                goto L_0x0045
            L_0x00d1:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3113.Cif.m15786(byte[], long, int):int");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static /* synthetic */ int m15778(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b > -12 || b2 > -65) {
                    return -1;
                }
                return (b2 << 8) ^ b;
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return (b4 << 16) ^ ((b3 << 8) ^ b);
            } else {
                throw new AssertionError();
            }
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }
}
