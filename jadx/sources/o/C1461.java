package o;

import java.util.Arrays;
import o.C1294;
import o.C2745;

/* renamed from: o.ɹǃ  reason: contains not printable characters */
public final class C1461 {

    /* renamed from: ɹ  reason: contains not printable characters */
    public static C2745.C3656If f7864 = null;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static int f7865 = 1000;

    /* renamed from: ı  reason: contains not printable characters */
    public int f7866;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f7867 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    public C1123[] f7868;

    /* renamed from: ȷ  reason: contains not printable characters */
    private C1294[] f7869;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean[] f7870;

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean f7871;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f7872;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f7873;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1133 f7874;

    /* renamed from: ι  reason: contains not printable characters */
    public C1462 f7875;

    /* renamed from: І  reason: contains not printable characters */
    private int f7876;

    /* renamed from: г  reason: contains not printable characters */
    private final C1462 f7877;

    /* renamed from: і  reason: contains not printable characters */
    private int f7878 = 32;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f7879;

    /* renamed from: o.ɹǃ$ǃ  reason: contains not printable characters */
    interface C1462 {
        /* renamed from: ı  reason: contains not printable characters */
        C1294 m8755();

        /* renamed from: Ι  reason: contains not printable characters */
        C1294 m8756(boolean[] zArr);

        /* renamed from: Ι  reason: contains not printable characters */
        void m8757();

        /* renamed from: Ι  reason: contains not printable characters */
        void m8758(C1294 r1);

        /* renamed from: ι  reason: contains not printable characters */
        void m8759(C1462 r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2745.C3656If m8733() {
        return null;
    }

    public C1461() {
        int i = this.f7878;
        this.f7876 = i;
        this.f7868 = null;
        this.f7871 = false;
        this.f7870 = new boolean[i];
        this.f7872 = 1;
        this.f7866 = 0;
        this.f7873 = i;
        this.f7869 = new C1294[f7865];
        this.f7879 = 0;
        this.f7868 = new C1123[i];
        m8739();
        this.f7874 = new C1133();
        this.f7875 = new C0999(this.f7874);
        this.f7877 = new C1123(this.f7874);
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m8738() {
        this.f7878 <<= 1;
        this.f7868 = (C1123[]) Arrays.copyOf(this.f7868, this.f7878);
        C1133 r0 = this.f7874;
        r0.f6651 = (C1294[]) Arrays.copyOf(r0.f6651, this.f7878);
        int i = this.f7878;
        this.f7870 = new boolean[i];
        this.f7876 = i;
        this.f7873 = i;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private void m8739() {
        int i = 0;
        while (true) {
            C1123[] r1 = this.f7868;
            if (i < r1.length) {
                C1123 r12 = r1[i];
                if (r12 != null) {
                    this.f7874.f6649.m8269(r12);
                }
                this.f7868[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8747() {
        for (C1294 r2 : this.f7874.f6651) {
            if (r2 != null) {
                r2.m8235();
            }
        }
        this.f7874.f6650.m8268(this.f7869, this.f7879);
        this.f7879 = 0;
        Arrays.fill(this.f7874.f6651, (Object) null);
        this.f7867 = 0;
        this.f7875.m8757();
        this.f7872 = 1;
        m8739();
        this.f7866 = 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1294 m8743(Object obj) {
        C1294 r0 = null;
        if (obj == null) {
            return null;
        }
        if (this.f7872 + 1 >= this.f7876) {
            m8738();
        }
        if (obj instanceof C1625) {
            C1625 r4 = (C1625) obj;
            r0 = r4.f8550;
            if (r0 == null) {
                if (r4.f8550 == null) {
                    r4.f8550 = new C1294(C1294.C1295.UNRESTRICTED);
                } else {
                    r4.f8550.m8235();
                }
                r0 = r4.f8550;
            }
            if (r0.f7254 == -1 || r0.f7254 > this.f7867 || this.f7874.f6651[r0.f7254] == null) {
                if (r0.f7254 != -1) {
                    r0.m8235();
                }
                this.f7867++;
                this.f7872++;
                r0.f7254 = this.f7867;
                r0.f7261 = C1294.C1295.UNRESTRICTED;
                this.f7874.f6651[this.f7867] = r0;
            }
        }
        return r0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1123 m8752() {
        C1123 r0 = this.f7874.f6649.m8270();
        if (r0 == null) {
            r0 = new C1123(this.f7874);
        } else {
            r0.f6638 = null;
            r0.f6636.m6798();
            r0.f6637 = 0.0f;
            r0.f6635 = false;
        }
        C1294.m8232();
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1294 m8742() {
        if (this.f7872 + 1 >= this.f7876) {
            m8738();
        }
        C1294 r0 = m8737(C1294.C1295.SLACK);
        this.f7867++;
        this.f7872++;
        r0.f7254 = this.f7867;
        this.f7874.f6651[this.f7867] = r0;
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1294 m8750(int i) {
        if (this.f7872 + 1 >= this.f7876) {
            m8738();
        }
        C1294 r0 = m8737(C1294.C1295.ERROR);
        this.f7867++;
        this.f7872++;
        r0.f7254 = this.f7867;
        r0.f7256 = i;
        this.f7874.f6651[this.f7867] = r0;
        this.f7875.m8758(r0);
        return r0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private C1294 m8737(C1294.C1295 r4) {
        C1294 r0 = this.f7874.f6650.m8270();
        if (r0 == null) {
            r0 = new C1294(r4);
            r0.f7261 = r4;
        } else {
            r0.m8235();
            r0.f7261 = r4;
        }
        int i = this.f7879;
        int i2 = f7865;
        if (i >= i2) {
            f7865 = i2 << 1;
            this.f7869 = (C1294[]) Arrays.copyOf(this.f7869, f7865);
        }
        C1294[] r42 = this.f7869;
        int i3 = this.f7879;
        this.f7879 = i3 + 1;
        r42[i3] = r0;
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m8734(Object obj) {
        C1294 r1 = ((C1625) obj).f8550;
        if (r1 != null) {
            return (int) (r1.f7259 + 0.5f);
        }
        return 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8740(C1123 r13) {
        if (this.f7866 > 0) {
            C0934 r0 = r13.f6636;
            C1123[] r1 = this.f7868;
            int i = r0.f5903;
            loop0:
            while (true) {
                int i2 = 0;
                while (i != -1 && i2 < r0.f5902) {
                    C1294 r7 = r0.f5904.f6651[r0.f5907[i]];
                    if (r7.f7260 != -1) {
                        float f = r0.f5911[i];
                        r0.m6795(r7, true);
                        C1123 r4 = r1[r7.f7260];
                        if (!r4.f6635) {
                            C0934 r72 = r4.f6636;
                            int i3 = r72.f5903;
                            int i4 = 0;
                            while (i3 != -1 && i4 < r72.f5902) {
                                r0.m6796(r0.f5904.f6651[r72.f5907[i3]], r72.f5911[i3] * f, true);
                                i3 = r72.f5908[i3];
                                i4++;
                            }
                        }
                        r13.f6637 += r4.f6637 * f;
                        r4.f6638.m8236(r13);
                        i = r0.f5903;
                    } else {
                        i = r0.f5908[i];
                        i2++;
                    }
                }
            }
            if (r13.f6636.f5902 == 0) {
                r13.f6635 = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r6.f7258 <= 1) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
        if (r6.f7258 <= 1) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00db, code lost:
        if (r6.f7258 <= 1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ea, code lost:
        if (r6.f7258 <= 1) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x00fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8751(o.C1123 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r0.f7866
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f7873
            if (r2 >= r4) goto L_0x0016
            int r2 = r0.f7872
            int r2 = r2 + r3
            int r4 = r0.f7876
            if (r2 < r4) goto L_0x0019
        L_0x0016:
            r17.m8738()
        L_0x0019:
            boolean r2 = r1.f6635
            if (r2 != 0) goto L_0x0193
            r17.m8740(r18)
            o.ɩІ r2 = r1.f6638
            r5 = 0
            if (r2 != 0) goto L_0x0033
            float r2 = r1.f6637
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0033
            o.ǃӏ r2 = r1.f6636
            int r2 = r2.f5902
            if (r2 != 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            float r2 = r1.f6637
            r6 = -1
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x005c
            float r2 = r1.f6637
            float r2 = -r2
            r1.f6637 = r2
            o.ǃӏ r2 = r1.f6636
            int r7 = r2.f5903
            r8 = 0
        L_0x0048:
            if (r7 == r6) goto L_0x005c
            int r9 = r2.f5902
            if (r8 >= r9) goto L_0x005c
            float[] r9 = r2.f5911
            r10 = r9[r7]
            float r10 = -r10
            r9[r7] = r10
            int[] r9 = r2.f5908
            r7 = r9[r7]
            int r8 = r8 + 1
            goto L_0x0048
        L_0x005c:
            o.ǃӏ r2 = r1.f6636
            int r7 = r2.f5903
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0067:
            if (r7 == r6) goto L_0x0105
            int r4 = r2.f5902
            if (r9 >= r4) goto L_0x0105
            float[] r4 = r2.f5911
            r4 = r4[r7]
            o.ɜ r8 = r2.f5904
            o.ɩІ[] r8 = r8.f6651
            int[] r6 = r2.f5907
            r6 = r6[r7]
            r6 = r8[r6]
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0090
            r8 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a1
            float[] r4 = r2.f5911
            r4[r7] = r5
            o.ɛ r4 = r2.f5905
            r6.m8236(r4)
            goto L_0x00a0
        L_0x0090:
            r8 = 981668463(0x3a83126f, float:0.001)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a1
            float[] r4 = r2.f5911
            r4[r7] = r5
            o.ɛ r4 = r2.f5905
            r6.m8236(r4)
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00fb
            o.ɩІ$ɩ r8 = r6.f7261
            o.ɩІ$ɩ r5 = o.C1294.C1295.UNRESTRICTED
            if (r8 != r5) goto L_0x00d0
            if (r11 != 0) goto L_0x00b8
            int r5 = r6.f7258
            if (r5 > r3) goto L_0x00b3
        L_0x00b1:
            r5 = 1
            goto L_0x00b4
        L_0x00b3:
            r5 = 0
        L_0x00b4:
            r12 = r4
            r13 = r5
            r11 = r6
            goto L_0x00fb
        L_0x00b8:
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c1
            int r5 = r6.f7258
            if (r5 > r3) goto L_0x00b3
            goto L_0x00b1
        L_0x00c1:
            if (r13 != 0) goto L_0x00fb
            int r5 = r6.f7258
            if (r5 > r3) goto L_0x00c9
            r5 = 1
            goto L_0x00ca
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            if (r5 == 0) goto L_0x00fb
            r12 = r4
            r11 = r6
            r13 = 1
            goto L_0x00fb
        L_0x00d0:
            if (r11 != 0) goto L_0x00fb
            r5 = 0
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x00fb
            if (r10 != 0) goto L_0x00e4
            int r5 = r6.f7258
            if (r5 > r3) goto L_0x00df
        L_0x00dd:
            r5 = 1
            goto L_0x00e0
        L_0x00df:
            r5 = 0
        L_0x00e0:
            r14 = r4
            r15 = r5
            r10 = r6
            goto L_0x00fb
        L_0x00e4:
            int r5 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ed
            int r5 = r6.f7258
            if (r5 > r3) goto L_0x00df
            goto L_0x00dd
        L_0x00ed:
            if (r15 != 0) goto L_0x00fb
            int r5 = r6.f7258
            if (r5 > r3) goto L_0x00f5
            r5 = 1
            goto L_0x00f6
        L_0x00f5:
            r5 = 0
        L_0x00f6:
            if (r5 == 0) goto L_0x00fb
            r14 = r4
            r10 = r6
            r15 = 1
        L_0x00fb:
            int[] r4 = r2.f5908
            r7 = r4[r7]
            int r9 = r9 + 1
            r5 = 0
            r6 = -1
            goto L_0x0067
        L_0x0105:
            if (r11 == 0) goto L_0x0108
            r10 = r11
        L_0x0108:
            if (r10 != 0) goto L_0x010c
            r2 = 1
            goto L_0x0110
        L_0x010c:
            r1.m7547(r10)
            r2 = 0
        L_0x0110:
            o.ǃӏ r4 = r1.f6636
            int r4 = r4.f5902
            if (r4 != 0) goto L_0x0118
            r1.f6635 = r3
        L_0x0118:
            if (r2 == 0) goto L_0x0174
            int r2 = r0.f7872
            int r2 = r2 + r3
            int r4 = r0.f7876
            if (r2 < r4) goto L_0x0124
            r17.m8738()
        L_0x0124:
            o.ɩІ$ɩ r2 = o.C1294.C1295.SLACK
            o.ɩІ r2 = r0.m8737(r2)
            int r4 = r0.f7867
            int r4 = r4 + r3
            r0.f7867 = r4
            int r4 = r0.f7872
            int r4 = r4 + r3
            r0.f7872 = r4
            int r4 = r0.f7867
            r2.f7254 = r4
            o.ɜ r4 = r0.f7874
            o.ɩІ[] r4 = r4.f6651
            int r5 = r0.f7867
            r4[r5] = r2
            r1.f6638 = r2
            r17.m8736((o.C1123) r18)
            o.ɹǃ$ǃ r4 = r0.f7877
            r4.m8759(r1)
            o.ɹǃ$ǃ r4 = r0.f7877
            r0.m8741((o.C1461.C1462) r4)
            int r4 = r2.f7260
            r5 = -1
            if (r4 != r5) goto L_0x0172
            o.ɩІ r4 = r1.f6638
            if (r4 != r2) goto L_0x0164
            o.ǃӏ r4 = r1.f6636
            r5 = 0
            o.ɩІ r2 = r4.m6801((boolean[]) r5, (o.C1294) r2)
            if (r2 == 0) goto L_0x0164
            r1.m7547(r2)
        L_0x0164:
            boolean r2 = r1.f6635
            if (r2 != 0) goto L_0x016d
            o.ɩІ r2 = r1.f6638
            r2.m8233(r1)
        L_0x016d:
            int r2 = r0.f7866
            int r2 = r2 - r3
            r0.f7866 = r2
        L_0x0172:
            r4 = 1
            goto L_0x0175
        L_0x0174:
            r4 = 0
        L_0x0175:
            o.ɩІ r2 = r1.f6638
            if (r2 == 0) goto L_0x018b
            o.ɩІ r2 = r1.f6638
            o.ɩІ$ɩ r2 = r2.f7261
            o.ɩІ$ɩ r5 = o.C1294.C1295.UNRESTRICTED
            if (r2 == r5) goto L_0x0188
            float r2 = r1.f6637
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x018b
        L_0x0188:
            r16 = 1
            goto L_0x018d
        L_0x018b:
            r16 = 0
        L_0x018d:
            if (r16 != 0) goto L_0x0190
            return
        L_0x0190:
            r16 = r4
            goto L_0x0195
        L_0x0193:
            r16 = 0
        L_0x0195:
            if (r16 != 0) goto L_0x019a
            r17.m8736((o.C1123) r18)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1461.m8751(o.ɛ):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m8736(C1123 r4) {
        if (this.f7868[this.f7866] != null) {
            this.f7874.f6649.m8269(this.f7868[this.f7866]);
        }
        this.f7868[this.f7866] = r4;
        C1294 r0 = r4.f6638;
        int i = this.f7866;
        r0.f7260 = i;
        this.f7866 = i + 1;
        r4.f6638.m8233(r4);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m8741(C1462 r13) {
        for (int i = 0; i < this.f7872; i++) {
            this.f7870[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f7872 * 2) {
                return i2;
            }
            if (r13.m8755() != null) {
                this.f7870[r13.m8755().f7254] = true;
            }
            C1294 r4 = r13.m8756(this.f7870);
            if (r4 != null) {
                if (this.f7870[r4.f7254]) {
                    return i2;
                }
                this.f7870[r4.f7254] = true;
            }
            if (r4 != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.f7866; i4++) {
                    C1123 r9 = this.f7868[i4];
                    if (r9.f6638.f7261 != C1294.C1295.UNRESTRICTED && !r9.f6635 && r9.m7551(r4)) {
                        float r10 = r9.f6636.m6797(r4);
                        if (r10 < 0.0f) {
                            float f2 = (-r9.f6637) / r10;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    C1123 r5 = this.f7868[i3];
                    r5.f6638.f7260 = -1;
                    r5.m7547(r4);
                    r5.f6638.f7260 = i3;
                    r5.f6638.m8233(r5);
                }
            }
            z = true;
        }
        return i2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m8749() {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i < this.f7866) {
                if (this.f7868[i].f6638.f7261 != C1294.C1295.UNRESTRICTED && this.f7868[i].f6637 < 0.0f) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f7866) {
                C1123 r12 = this.f7868[i3];
                if (r12.f6638.f7261 != C1294.C1295.UNRESTRICTED && !r12.f6635 && r12.f6637 < f) {
                    int i7 = i6;
                    float f3 = f2;
                    int i8 = i5;
                    int i9 = i4;
                    int i10 = 1;
                    while (i10 < this.f7872) {
                        C1294 r14 = this.f7874.f6651[i10];
                        float r15 = r12.f6636.m6797(r14);
                        if (r15 > f) {
                            int i11 = i7;
                            float f4 = f3;
                            int i12 = i8;
                            int i13 = i9;
                            for (int i14 = 0; i14 < 7; i14++) {
                                float f5 = r14.f7257[i14] / r15;
                                if ((f5 < f4 && i14 == i11) || i14 > i11) {
                                    f4 = f5;
                                    i13 = i3;
                                    i12 = i10;
                                    i11 = i14;
                                }
                            }
                            i9 = i13;
                            i8 = i12;
                            f3 = f4;
                            i7 = i11;
                        }
                        i10++;
                        f = 0.0f;
                    }
                    i4 = i9;
                    i5 = i8;
                    f2 = f3;
                    i6 = i7;
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C1123 r1 = this.f7868[i4];
                r1.f6638.f7260 = -1;
                r1.m7547(this.f7874.f6651[i5]);
                r1.f6638.f7260 = i4;
                r1.f6638.m8233(r1);
            } else {
                z2 = true;
            }
            if (i2 > this.f7872 / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m8748() {
        for (int i = 0; i < this.f7866; i++) {
            C1123 r1 = this.f7868[i];
            r1.f6638.f7259 = r1.f6637;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8754(C1294 r4, C1294 r5, int i, int i2) {
        C1123 r0 = m8752();
        C1294 r1 = m8742();
        r1.f7256 = 0;
        r0.m7548(r4, r5, r1, i);
        if (i2 != 6) {
            r0.f6636.m6802(m8750(i2), (float) ((int) (r0.f6636.m6797(r1) * -1.0f)));
        }
        m8751(r0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8745(C1294 r4, C1294 r5, int i, int i2) {
        C1123 r0 = m8752();
        C1294 r1 = m8742();
        r1.f7256 = 0;
        r0.m7549(r4, r5, r1, i);
        if (i2 != 6) {
            r0.f6636.m6802(m8750(i2), (float) ((int) (r0.f6636.m6797(r1) * -1.0f)));
        }
        m8751(r0);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8753(C1294 r7, C1294 r8, int i, float f, C1294 r11, C1294 r12, int i2, int i3) {
        C1123 r0 = m8752();
        if (r8 == r11) {
            r0.f6636.m6802(r7, 1.0f);
            r0.f6636.m6802(r12, 1.0f);
            r0.f6636.m6802(r8, -2.0f);
        } else if (f == 0.5f) {
            r0.f6636.m6802(r7, 1.0f);
            r0.f6636.m6802(r8, -1.0f);
            r0.f6636.m6802(r11, -1.0f);
            r0.f6636.m6802(r12, 1.0f);
            if (i > 0 || i2 > 0) {
                r0.f6637 = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            r0.f6636.m6802(r7, -1.0f);
            r0.f6636.m6802(r8, 1.0f);
            r0.f6637 = (float) i;
        } else if (f >= 1.0f) {
            r0.f6636.m6802(r11, -1.0f);
            r0.f6636.m6802(r12, 1.0f);
            r0.f6637 = (float) i2;
        } else {
            float f2 = 1.0f - f;
            r0.f6636.m6802(r7, f2 * 1.0f);
            r0.f6636.m6802(r8, f2 * -1.0f);
            r0.f6636.m6802(r11, f * -1.0f);
            r0.f6636.m6802(r12, f);
            if (i > 0 || i2 > 0) {
                r0.f6637 = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        if (i3 != 6) {
            r0.f6636.m6802(m8750(i3), 1.0f);
            r0.f6636.m6802(m8750(i3), -1.0f);
        }
        m8751(r0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1123 m8746(C1294 r4, C1294 r5, int i, int i2) {
        C1123 r0 = m8752();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            r0.f6637 = (float) i;
        }
        if (!z) {
            r0.f6636.m6802(r4, -1.0f);
            r0.f6636.m6802(r5, 1.0f);
        } else {
            r0.f6636.m6802(r4, 1.0f);
            r0.f6636.m6802(r5, -1.0f);
        }
        if (i2 != 6) {
            r0.f6636.m6802(m8750(i2), 1.0f);
            r0.f6636.m6802(m8750(i2), -1.0f);
        }
        m8751(r0);
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8744(C1294 r5, int i) {
        int i2 = r5.f7260;
        if (r5.f7260 != -1) {
            C1123 r0 = this.f7868[i2];
            if (r0.f6635) {
                r0.f6637 = (float) i;
            } else if (r0.f6636.f5902 == 0) {
                r0.f6635 = true;
                r0.f6637 = (float) i;
            } else {
                C1123 r02 = m8752();
                if (i < 0) {
                    r02.f6637 = (float) (i * -1);
                    r02.f6636.m6802(r5, 1.0f);
                } else {
                    r02.f6637 = (float) i;
                    r02.f6636.m6802(r5, -1.0f);
                }
                m8751(r02);
            }
        } else {
            C1123 r03 = m8752();
            r03.f6638 = r5;
            float f = (float) i;
            r5.f7259 = f;
            r03.f6637 = f;
            r03.f6635 = true;
            m8751(r03);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1123 m8735(C1461 r2, C1294 r3, C1294 r4, C1294 r5, float f) {
        C1123 r22 = r2.m8752();
        r22.f6636.m6802(r3, -1.0f);
        r22.f6636.m6802(r4, 1.0f - f);
        r22.f6636.m6802(r5, f);
        return r22;
    }
}
