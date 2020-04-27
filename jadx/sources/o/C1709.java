package o;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: o.ʭɪ  reason: contains not printable characters */
public abstract class C1709 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C1709 f8886 = new Cif("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract int m9685(byte[] bArr, CharSequence charSequence);

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m9687(int i);

    C1709() {
    }

    /* renamed from: o.ʭɪ$ı  reason: contains not printable characters */
    public static final class C1710 extends IOException {
        C1710(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public CharSequence m9686(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence;
        }
        throw new NullPointerException();
    }

    static {
        new Cif("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C1712("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C1712("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new C1711("base16()", "0123456789ABCDEF");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1709 m9684() {
        return f8886;
    }

    /* renamed from: o.ʭɪ$If */
    static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        final char[] f8887;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final String f8888;

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f8889;

        /* renamed from: ɩ  reason: contains not printable characters */
        final int f8890;

        /* renamed from: ɹ  reason: contains not printable characters */
        final boolean[] f8891;

        /* renamed from: Ι  reason: contains not printable characters */
        final byte[] f8892;

        /* renamed from: ι  reason: contains not printable characters */
        final int f8893;

        /* JADX WARNING: Code restructure failed: missing block: B:72:0x010c, code lost:
            if (((r5 == java.math.RoundingMode.HALF_EVEN) & ((r6 & 1) != 0)) != false) goto L_0x0114;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x010f, code lost:
            if (r7 > 0) goto L_0x0114;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0112, code lost:
            if (r0 > 0) goto L_0x0114;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0114, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0116, code lost:
            if (r0 < 0) goto L_0x0114;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0120, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0121, code lost:
            if (r4 == false) goto L_0x012b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0123, code lost:
            r6 = r6 + r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        If(java.lang.String r11, char[] r12) {
            /*
                r10 = this;
                r10.<init>()
                if (r11 == 0) goto L_0x01a0
                java.lang.String r11 = (java.lang.String) r11
                r10.f8888 = r11
                if (r12 == 0) goto L_0x019a
                r11 = r12
                char[] r11 = (char[]) r11
                r10.f8887 = r11
                int r11 = r12.length     // Catch:{ ArithmeticException -> 0x0184 }
                java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x0184 }
                java.lang.String r1 = "x"
                if (r11 <= 0) goto L_0x0165
                int[] r1 = o.C1596.AnonymousClass2.f8473     // Catch:{ ArithmeticException -> 0x0184 }
                int r0 = r0.ordinal()     // Catch:{ ArithmeticException -> 0x0184 }
                r0 = r1[r0]     // Catch:{ ArithmeticException -> 0x0184 }
                java.lang.String r1 = "mode was UNNECESSARY, but rounding was necessary"
                r2 = 0
                r3 = 1
                switch(r0) {
                    case 1: goto L_0x0043;
                    case 2: goto L_0x0053;
                    case 3: goto L_0x0053;
                    case 4: goto L_0x003b;
                    case 5: goto L_0x003b;
                    case 6: goto L_0x002a;
                    case 7: goto L_0x002a;
                    case 8: goto L_0x002a;
                    default: goto L_0x0026;
                }
            L_0x0026:
                java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch:{ ArithmeticException -> 0x0184 }
                goto L_0x0161
            L_0x002a:
                int r0 = java.lang.Integer.numberOfLeadingZeros(r11)     // Catch:{ ArithmeticException -> 0x0184 }
                r4 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
                int r4 = r4 >>> r0
                int r0 = 31 - r0
                int r4 = r4 - r11
                int r11 = ~r4     // Catch:{ ArithmeticException -> 0x0184 }
                int r11 = ~r11     // Catch:{ ArithmeticException -> 0x0184 }
                int r11 = r11 >>> 31
                int r0 = r0 + r11
                goto L_0x0059
            L_0x003b:
                int r11 = r11 - r3
                int r11 = java.lang.Integer.numberOfLeadingZeros(r11)     // Catch:{ ArithmeticException -> 0x0184 }
                int r0 = 32 - r11
                goto L_0x0059
            L_0x0043:
                if (r11 <= 0) goto L_0x0047
                r0 = 1
                goto L_0x0048
            L_0x0047:
                r0 = 0
            L_0x0048:
                int r4 = r11 + -1
                r4 = r4 & r11
                if (r4 != 0) goto L_0x004f
                r4 = 1
                goto L_0x0050
            L_0x004f:
                r4 = 0
            L_0x0050:
                r0 = r0 & r4
                if (r0 == 0) goto L_0x015b
            L_0x0053:
                int r11 = java.lang.Integer.numberOfLeadingZeros(r11)     // Catch:{ ArithmeticException -> 0x0184 }
                int r0 = 31 - r11
            L_0x0059:
                r10.f8890 = r0     // Catch:{ ArithmeticException -> 0x0184 }
                int r11 = r10.f8890
                int r11 = java.lang.Integer.lowestOneBit(r11)
                r0 = 8
                int r11 = java.lang.Math.min(r0, r11)
                int r0 = r0 / r11
                r10.f8889 = r0     // Catch:{ ArithmeticException -> 0x0141 }
                int r0 = r10.f8890     // Catch:{ ArithmeticException -> 0x0141 }
                int r0 = r0 / r11
                r10.f8893 = r0     // Catch:{ ArithmeticException -> 0x0141 }
                r11 = 128(0x80, float:1.794E-43)
                byte[] r0 = new byte[r11]
                r4 = -1
                java.util.Arrays.fill(r0, r4)
                r5 = 0
            L_0x0078:
                int r6 = r12.length
                if (r5 >= r6) goto L_0x00bb
                char r6 = r12[r5]
                if (r6 >= r11) goto L_0x0081
                r7 = 1
                goto L_0x0082
            L_0x0081:
                r7 = 0
            L_0x0082:
                if (r7 == 0) goto L_0x00a7
                byte r7 = r0[r6]
                if (r7 != r4) goto L_0x008a
                r7 = 1
                goto L_0x008b
            L_0x008a:
                r7 = 0
            L_0x008b:
                if (r7 == 0) goto L_0x0093
                byte r7 = (byte) r5
                r0[r6] = r7
                int r5 = r5 + 1
                goto L_0x0078
            L_0x0093:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.Character r0 = java.lang.Character.valueOf(r6)
                r12[r2] = r0
                java.lang.String r0 = "Duplicate character: %s"
                java.lang.String r12 = o.C2745.m14519(r0, r12)
                r11.<init>(r12)
                throw r11
            L_0x00a7:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.Object[] r12 = new java.lang.Object[r3]
                java.lang.Character r0 = java.lang.Character.valueOf(r6)
                r12[r2] = r0
                java.lang.String r0 = "Non-ASCII character: %s"
                java.lang.String r12 = o.C2745.m14519(r0, r12)
                r11.<init>(r12)
                throw r11
            L_0x00bb:
                r10.f8892 = r0
                int r11 = r10.f8889
                boolean[] r11 = new boolean[r11]
                r12 = 0
            L_0x00c2:
                int r0 = r10.f8893
                if (r12 >= r0) goto L_0x013e
                int r0 = r12 << 3
                int r4 = r10.f8890
                java.math.RoundingMode r5 = java.math.RoundingMode.CEILING
                if (r5 == 0) goto L_0x0138
                if (r4 == 0) goto L_0x0130
                int r6 = r0 / r4
                int r7 = r4 * r6
                int r7 = r0 - r7
                if (r7 == 0) goto L_0x012b
                r0 = r0 ^ r4
                int r0 = r0 >> 31
                r0 = r0 | r3
                int[] r8 = o.C1596.AnonymousClass2.f8473
                int r9 = r5.ordinal()
                r8 = r8[r9]
                switch(r8) {
                    case 1: goto L_0x0119;
                    case 2: goto L_0x0120;
                    case 3: goto L_0x0116;
                    case 4: goto L_0x0114;
                    case 5: goto L_0x0112;
                    case 6: goto L_0x00ed;
                    case 7: goto L_0x00ed;
                    case 8: goto L_0x00ed;
                    default: goto L_0x00e7;
                }
            L_0x00e7:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                throw r11
            L_0x00ed:
                int r7 = java.lang.Math.abs(r7)
                int r4 = java.lang.Math.abs(r4)
                int r4 = r4 - r7
                int r7 = r7 - r4
                if (r7 != 0) goto L_0x010f
                java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
                if (r5 == r4) goto L_0x0114
                java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
                if (r5 != r4) goto L_0x0103
                r4 = 1
                goto L_0x0104
            L_0x0103:
                r4 = 0
            L_0x0104:
                r5 = r6 & 1
                if (r5 == 0) goto L_0x010a
                r5 = 1
                goto L_0x010b
            L_0x010a:
                r5 = 0
            L_0x010b:
                r4 = r4 & r5
                if (r4 == 0) goto L_0x0120
                goto L_0x0114
            L_0x010f:
                if (r7 <= 0) goto L_0x0120
                goto L_0x0114
            L_0x0112:
                if (r0 <= 0) goto L_0x0120
            L_0x0114:
                r4 = 1
                goto L_0x0121
            L_0x0116:
                if (r0 >= 0) goto L_0x0120
                goto L_0x0114
            L_0x0119:
                if (r7 != 0) goto L_0x011d
                r4 = 1
                goto L_0x011e
            L_0x011d:
                r4 = 0
            L_0x011e:
                if (r4 == 0) goto L_0x0125
            L_0x0120:
                r4 = 0
            L_0x0121:
                if (r4 == 0) goto L_0x012b
                int r6 = r6 + r0
                goto L_0x012b
            L_0x0125:
                java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
                r11.<init>(r1)
                throw r11
            L_0x012b:
                r11[r6] = r3
                int r12 = r12 + 1
                goto L_0x00c2
            L_0x0130:
                java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
                java.lang.String r12 = "/ by zero"
                r11.<init>(r12)
                throw r11
            L_0x0138:
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                r11.<init>()
                throw r11
            L_0x013e:
                r10.f8891 = r11
                return
            L_0x0141:
                r11 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Illegal alphabet "
                r1.<init>(r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r12)
                r1.append(r2)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12, r11)
                throw r0
            L_0x015b:
                java.lang.ArithmeticException r11 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x0184 }
                r11.<init>(r1)     // Catch:{ ArithmeticException -> 0x0184 }
                throw r11     // Catch:{ ArithmeticException -> 0x0184 }
            L_0x0161:
                r11.<init>()     // Catch:{ ArithmeticException -> 0x0184 }
                throw r11     // Catch:{ ArithmeticException -> 0x0184 }
            L_0x0165:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ArithmeticException -> 0x0184 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ArithmeticException -> 0x0184 }
                r2.<init>()     // Catch:{ ArithmeticException -> 0x0184 }
                r2.append(r1)     // Catch:{ ArithmeticException -> 0x0184 }
                java.lang.String r1 = " ("
                r2.append(r1)     // Catch:{ ArithmeticException -> 0x0184 }
                r2.append(r11)     // Catch:{ ArithmeticException -> 0x0184 }
                java.lang.String r11 = ") must be > 0"
                r2.append(r11)     // Catch:{ ArithmeticException -> 0x0184 }
                java.lang.String r11 = r2.toString()     // Catch:{ ArithmeticException -> 0x0184 }
                r0.<init>(r11)     // Catch:{ ArithmeticException -> 0x0184 }
                throw r0     // Catch:{ ArithmeticException -> 0x0184 }
            L_0x0184:
                r11 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Illegal alphabet length "
                r1.<init>(r2)
                int r12 = r12.length
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12, r11)
                throw r0
            L_0x019a:
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                r11.<init>()
                throw r11
            L_0x01a0:
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1709.If.<init>(java.lang.String, char[]):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final int m9689(char c) {
            if (c <= 127) {
                byte b = this.f8892[c];
                if (b != -1) {
                    return b;
                }
                if (c <= ' ' || c == 127) {
                    StringBuilder sb = new StringBuilder("Unrecognized character: 0x");
                    sb.append(Integer.toHexString(c));
                    throw new C1710(sb.toString());
                }
                throw new C1710("Unrecognized character: ".concat(String.valueOf(c)));
            }
            StringBuilder sb2 = new StringBuilder("Unrecognized character: 0x");
            sb2.append(Integer.toHexString(c));
            throw new C1710(sb2.toString());
        }

        public final String toString() {
            return this.f8888;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof If) {
                return Arrays.equals(this.f8887, ((If) obj).f8887);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8887);
        }
    }

    /* renamed from: o.ʭɪ$ɩ  reason: contains not printable characters */
    static class C1712 extends C1709 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private Character f8895;

        /* renamed from: Ι  reason: contains not printable characters */
        final If f8896;

        C1712(String str, String str2, Character ch) {
            this(new If(str, str2.toCharArray()), ch);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C1712(o.C1709.If r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                if (r5 == 0) goto L_0x003c
                r0 = r5
                o.ʭɪ$If r0 = (o.C1709.If) r0
                r4.f8896 = r0
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L_0x0026
                char r2 = r6.charValue()
                byte[] r3 = r5.f8892
                int r3 = r3.length
                if (r2 >= r3) goto L_0x0020
                byte[] r5 = r5.f8892
                byte r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L_0x0020
                r5 = 1
                goto L_0x0021
            L_0x0020:
                r5 = 0
            L_0x0021:
                if (r5 != 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r5 = 0
                goto L_0x0027
            L_0x0026:
                r5 = 1
            L_0x0027:
                if (r5 == 0) goto L_0x002c
                r4.f8895 = r6
                return
            L_0x002c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "Padding character %s was already in alphabet"
                java.lang.String r6 = o.C2745.m14519(r6, r1)
                r5.<init>(r6)
                throw r5
            L_0x003c:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1709.C1712.<init>(o.ʭɪ$If, java.lang.Character):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final int m9694(int i) {
            return (int) (((((long) this.f8896.f8890) * ((long) i)) + 7) / 8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final CharSequence m9693(CharSequence charSequence) {
            if (charSequence != null) {
                Character ch = this.f8895;
                if (ch == null) {
                    return charSequence;
                }
                char charValue = ch.charValue();
                int length = charSequence.length() - 1;
                while (length >= 0 && charSequence.charAt(length) == charValue) {
                    length--;
                }
                return charSequence.subSequence(0, length + 1);
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public int m9692(byte[] bArr, CharSequence charSequence) {
            CharSequence r14 = m9693(charSequence);
            If ifR = this.f8896;
            if (ifR.f8891[r14.length() % ifR.f8889]) {
                int i = 0;
                int i2 = 0;
                while (i < r14.length()) {
                    long j = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < this.f8896.f8889; i4++) {
                        j <<= this.f8896.f8890;
                        if (i + i4 < r14.length()) {
                            j |= (long) this.f8896.m9689(r14.charAt(i3 + i));
                            i3++;
                        }
                    }
                    int i5 = (this.f8896.f8893 << 3) - (i3 * this.f8896.f8890);
                    int i6 = (this.f8896.f8893 - 1) << 3;
                    while (i6 >= i5) {
                        bArr[i2] = (byte) ((int) ((j >>> i6) & 255));
                        i6 -= 8;
                        i2++;
                    }
                    i += this.f8896.f8889;
                }
                return i2;
            }
            StringBuilder sb = new StringBuilder("Invalid input length ");
            sb.append(r14.length());
            throw new C1710(sb.toString());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f8896.toString());
            if (8 % this.f8896.f8890 != 0) {
                if (this.f8895 == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f8895);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1712) {
                C1712 r4 = (C1712) obj;
                if (this.f8896.equals(r4.f8896)) {
                    Character ch = this.f8895;
                    Character ch2 = r4.f8895;
                    if (ch == ch2 || (ch != null && ch.equals(ch2))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f8896.hashCode() ^ Arrays.hashCode(new Object[]{this.f8895});
        }
    }

    /* renamed from: o.ʭɪ$ǃ  reason: contains not printable characters */
    static final class C1711 extends C1712 {

        /* renamed from: ι  reason: contains not printable characters */
        private char[] f8894;

        C1711(String str, String str2) {
            this(new If(str, str2.toCharArray()));
        }

        private C1711(If ifR) {
            super(ifR, (Character) null);
            this.f8894 = new char[512];
            if (ifR.f8887.length == 16) {
                for (int i = 0; i < 256; i++) {
                    this.f8894[i] = ifR.f8887[i >>> 4];
                    this.f8894[i | 256] = ifR.f8887[i & 15];
                }
                return;
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final int m9691(byte[] bArr, CharSequence charSequence) {
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.f8896.m9689(charSequence.charAt(i)) << 4) | this.f8896.m9689(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            StringBuilder sb = new StringBuilder("Invalid input length ");
            sb.append(charSequence.length());
            throw new C1710(sb.toString());
        }
    }

    /* renamed from: o.ʭɪ$if  reason: invalid class name */
    static final class Cif extends C1712 {
        Cif(String str, String str2, Character ch) {
            this(new If(str, str2.toCharArray()), ch);
        }

        private Cif(If ifR, Character ch) {
            super(ifR, ch);
            if (!(ifR.f8887.length == 64)) {
                throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final int m9690(byte[] bArr, CharSequence charSequence) {
            CharSequence r7 = m9693(charSequence);
            If ifR = this.f8896;
            if (ifR.f8891[r7.length() % ifR.f8889]) {
                int i = 0;
                int i2 = 0;
                while (i < r7.length()) {
                    int i3 = i + 1;
                    int i4 = i3 + 1;
                    int r0 = (this.f8896.m9689(r7.charAt(i)) << 18) | (this.f8896.m9689(r7.charAt(i3)) << 12);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (r0 >>> 16);
                    if (i4 < r7.length()) {
                        int i6 = i4 + 1;
                        int r02 = r0 | (this.f8896.m9689(r7.charAt(i4)) << 6);
                        i2 = i5 + 1;
                        bArr[i5] = (byte) (r02 >>> 8);
                        if (i6 < r7.length()) {
                            i4 = i6 + 1;
                            i5 = i2 + 1;
                            bArr[i2] = (byte) (r02 | this.f8896.m9689(r7.charAt(i6)));
                        } else {
                            i = i6;
                        }
                    }
                    i2 = i5;
                    i = i4;
                }
                return i2;
            }
            StringBuilder sb = new StringBuilder("Invalid input length ");
            sb.append(r7.length());
            throw new C1710(sb.toString());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final byte[] m9688(CharSequence charSequence) {
        try {
            CharSequence r4 = m9686(charSequence);
            byte[] bArr = new byte[m9687(r4.length())];
            int r42 = m9685(bArr, r4);
            if (r42 == bArr.length) {
                return bArr;
            }
            byte[] bArr2 = new byte[r42];
            System.arraycopy(bArr, 0, bArr2, 0, r42);
            return bArr2;
        } catch (C1710 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
