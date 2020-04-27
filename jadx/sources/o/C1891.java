package o;

import java.util.Locale;

/* renamed from: o.ΙӀ  reason: contains not printable characters */
public final class C1891 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static C1891 f9578 = new C1891(false, 2, f9581);

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final String f9579 = Character.toString(8206);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final String f9580 = Character.toString(8207);

    /* renamed from: Ι  reason: contains not printable characters */
    static final C2075 f9581 = C2139.f10294;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static C1891 f9582 = new C1891(true, 2, f9581);

    /* renamed from: ı  reason: contains not printable characters */
    public final int f9583;

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean f9584;

    /* renamed from: І  reason: contains not printable characters */
    public final C2075 f9585;

    /* renamed from: o.ΙӀ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f9586 = C1891.m10298(Locale.getDefault());

        /* renamed from: ɩ  reason: contains not printable characters */
        int f9587 = 2;

        /* renamed from: Ι  reason: contains not printable characters */
        C2075 f9588 = C1891.f9581;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1891 m10299() {
        Cif ifVar = new Cif();
        if (ifVar.f9587 != 2 || ifVar.f9588 != f9581) {
            return new C1891(ifVar.f9586, ifVar.f9587, ifVar.f9588);
        }
        if (ifVar.f9586) {
            return f9582;
        }
        return f9578;
    }

    private C1891(boolean z, int i, C2075 r3) {
        this.f9584 = z;
        this.f9583 = i;
        this.f9585 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m10298(Locale locale) {
        return C2148.m11333(locale) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r2 = r2 - 1;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10296(java.lang.CharSequence r7) {
        /*
            o.ΙӀ$ɩ r0 = new o.ΙӀ$ɩ
            r0.<init>(r7)
            int r7 = r0.f9590
            r0.f9591 = r7
            r7 = 0
            r1 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f9591
            if (r3 <= 0) goto L_0x0040
            byte r3 = r0.m10302()
            r4 = -1
            if (r3 == 0) goto L_0x0039
            r5 = 1
            if (r3 == r5) goto L_0x0033
            r6 = 2
            if (r3 == r6) goto L_0x0033
            r6 = 9
            if (r3 == r6) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002d;
                case 15: goto L_0x002d;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x0027;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r1 != 0) goto L_0x000c
            goto L_0x003e
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x002a:
            if (r1 != r2) goto L_0x0030
            return r5
        L_0x002d:
            if (r1 != r2) goto L_0x0030
            return r4
        L_0x0030:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0033:
            if (r2 != 0) goto L_0x0036
            return r5
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003e
        L_0x0039:
            if (r2 != 0) goto L_0x003c
            return r4
        L_0x003c:
            if (r1 != 0) goto L_0x000c
        L_0x003e:
            r1 = r2
            goto L_0x000c
        L_0x0040:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1891.m10296(java.lang.CharSequence):int");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m10297(CharSequence charSequence) {
        byte b;
        C1892 r0 = new C1892(charSequence);
        r0.f9591 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (r0.f9591 < r0.f9590 && i == 0) {
            r0.f9594 = r0.f9592.charAt(r0.f9591);
            if (Character.isHighSurrogate(r0.f9594)) {
                int codePointAt = Character.codePointAt(r0.f9592, r0.f9591);
                r0.f9591 += Character.charCount(codePointAt);
                b = Character.getDirectionality(codePointAt);
            } else {
                r0.f9591++;
                char c = r0.f9594;
                b = c < 1792 ? C1892.f9589[c] : Character.getDirectionality(c);
                byte b2 = 12;
                if (r0.f9593) {
                    if (r0.f9594 == '<') {
                        int i4 = r0.f9591;
                        while (true) {
                            if (r0.f9591 < r0.f9590) {
                                CharSequence charSequence2 = r0.f9592;
                                int i5 = r0.f9591;
                                r0.f9591 = i5 + 1;
                                r0.f9594 = charSequence2.charAt(i5);
                                if (r0.f9594 != '>') {
                                    if (r0.f9594 == '\"' || r0.f9594 == '\'') {
                                        char c2 = r0.f9594;
                                        while (r0.f9591 < r0.f9590) {
                                            CharSequence charSequence3 = r0.f9592;
                                            int i6 = r0.f9591;
                                            r0.f9591 = i6 + 1;
                                            char charAt = charSequence3.charAt(i6);
                                            r0.f9594 = charAt;
                                            if (charAt == c2) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                r0.f9591 = i4;
                                r0.f9594 = '<';
                                b2 = 13;
                            }
                        }
                        b = b2;
                    } else if (r0.f9594 == '&') {
                        while (r0.f9591 < r0.f9590) {
                            CharSequence charSequence4 = r0.f9592;
                            int i7 = r0.f9591;
                            r0.f9591 = i7 + 1;
                            char charAt2 = charSequence4.charAt(i7);
                            r0.f9594 = charAt2;
                            if (charAt2 == ';') {
                                b = 12;
                            }
                        }
                        b = 12;
                    }
                }
            }
            if (b != 0) {
                if (b == 1 || b == 2) {
                    if (i3 == 0) {
                        return 1;
                    }
                } else if (b != 9) {
                    switch (b) {
                        case 14:
                        case 15:
                            i3++;
                            i2 = -1;
                            continue;
                        case 16:
                        case 17:
                            i3++;
                            i2 = 1;
                            continue;
                        case 18:
                            i3--;
                            i2 = 0;
                            continue;
                    }
                }
            } else if (i3 == 0) {
                return -1;
            }
            i = i3;
        }
        if (i != 0) {
            if (i2 != 0) {
                return i2;
            }
            while (r0.f9591 > 0) {
                switch (r0.m10302()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
        }
        return 0;
    }

    /* renamed from: o.ΙӀ$ɩ  reason: contains not printable characters */
    static class C1892 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final byte[] f9589 = new byte[1792];

        /* renamed from: ı  reason: contains not printable characters */
        final int f9590;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f9591;

        /* renamed from: Ι  reason: contains not printable characters */
        final CharSequence f9592;

        /* renamed from: ι  reason: contains not printable characters */
        final boolean f9593 = false;

        /* renamed from: Ӏ  reason: contains not printable characters */
        char f9594;

        static {
            for (int i = 0; i < 1792; i++) {
                f9589[i] = Character.getDirectionality(i);
            }
        }

        C1892(CharSequence charSequence) {
            this.f9592 = charSequence;
            this.f9590 = charSequence.length();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final byte m10302() {
            this.f9594 = this.f9592.charAt(this.f9591 - 1);
            if (Character.isLowSurrogate(this.f9594)) {
                int codePointBefore = Character.codePointBefore(this.f9592, this.f9591);
                this.f9591 -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f9591--;
            char c = this.f9594;
            byte directionality = c < 1792 ? f9589[c] : Character.getDirectionality(c);
            if (!this.f9593) {
                return directionality;
            }
            char c2 = this.f9594;
            if (c2 == '>') {
                return m10300();
            }
            return c2 == ';' ? m10301() : directionality;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private byte m10300() {
            char charAt;
            int i = this.f9591;
            while (true) {
                int i2 = this.f9591;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9592;
                int i3 = i2 - 1;
                this.f9591 = i3;
                this.f9594 = charSequence.charAt(i3);
                char c = this.f9594;
                if (c != '<') {
                    if (c == '>') {
                        break;
                    } else if (c == '\"' || c == '\'') {
                        char c2 = this.f9594;
                        do {
                            int i4 = this.f9591;
                            if (i4 <= 0) {
                                break;
                            }
                            CharSequence charSequence2 = this.f9592;
                            int i5 = i4 - 1;
                            this.f9591 = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f9594 = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    return 12;
                }
            }
            this.f9591 = i;
            this.f9594 = '>';
            return 13;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private byte m10301() {
            char c;
            int i = this.f9591;
            do {
                int i2 = this.f9591;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9592;
                int i3 = i2 - 1;
                this.f9591 = i3;
                this.f9594 = charSequence.charAt(i3);
                c = this.f9594;
                if (c == '&') {
                    return 12;
                }
            } while (c != ';');
            this.f9591 = i;
            this.f9594 = ';';
            return 13;
        }
    }
}
