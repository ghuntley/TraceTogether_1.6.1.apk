package o;

import o.C1461;

/* renamed from: o.ɛ  reason: contains not printable characters */
public class C1123 implements C1461.C1462 {

    /* renamed from: ı  reason: contains not printable characters */
    public boolean f6635 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0934 f6636;

    /* renamed from: Ι  reason: contains not printable characters */
    public float f6637 = 0.0f;

    /* renamed from: ι  reason: contains not printable characters */
    C1294 f6638 = null;

    public C1123(C1133 r2) {
        this.f6636 = new C0934(this, r2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m7551(C1294 r8) {
        C0934 r0 = this.f6636;
        if (r0.f5903 != -1) {
            int i = r0.f5903;
            int i2 = 0;
            while (i != -1 && i2 < r0.f5902) {
                if (r0.f5907[i] == r8.f7254) {
                    return true;
                }
                i = r0.f5908[i];
                i2++;
            }
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1123 m7548(C1294 r3, C1294 r4, C1294 r5, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f6637 = (float) i;
        }
        if (!z) {
            this.f6636.m6802(r3, -1.0f);
            this.f6636.m6802(r4, 1.0f);
            this.f6636.m6802(r5, 1.0f);
        } else {
            this.f6636.m6802(r3, 1.0f);
            this.f6636.m6802(r4, -1.0f);
            this.f6636.m6802(r5, -1.0f);
        }
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1123 m7549(C1294 r3, C1294 r4, C1294 r5, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f6637 = (float) i;
        }
        if (!z) {
            this.f6636.m6802(r3, -1.0f);
            this.f6636.m6802(r4, 1.0f);
            this.f6636.m6802(r5, -1.0f);
        } else {
            this.f6636.m6802(r3, 1.0f);
            this.f6636.m6802(r4, -1.0f);
            this.f6636.m6802(r5, 1.0f);
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1123 m7552(C1294 r3, C1294 r4, C1294 r5, C1294 r6, float f) {
        this.f6636.m6802(r3, -1.0f);
        this.f6636.m6802(r4, 1.0f);
        this.f6636.m6802(r5, f);
        this.f6636.m6802(r6, -f);
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1123 m7550(C1294 r3, C1294 r4, C1294 r5, C1294 r6, float f) {
        this.f6636.m6802(r5, 0.5f);
        this.f6636.m6802(r6, 0.5f);
        this.f6636.m6802(r3, -0.5f);
        this.f6636.m6802(r4, -0.5f);
        this.f6637 = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7547(C1294 r6) {
        C1294 r0 = this.f6638;
        if (r0 != null) {
            this.f6636.m6802(r0, -1.0f);
            this.f6638 = null;
        }
        float f = -this.f6636.m6795(r6, true);
        this.f6638 = r6;
        if (f != 1.0f) {
            this.f6637 /= f;
            C0934 r62 = this.f6636;
            int i = r62.f5903;
            int i2 = 0;
            while (i != -1 && i2 < r62.f5902) {
                float[] fArr = r62.f5911;
                fArr[i] = fArr[i] / f;
                i = r62.f5908[i];
                i2++;
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1294 m7553(boolean[] zArr) {
        return this.f6636.m6801(zArr, (C1294) null);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7554() {
        this.f6636.m6798();
        this.f6638 = null;
        this.f6637 = 0.0f;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7556(C1461.C1462 r6) {
        if (r6 instanceof C1123) {
            C1123 r62 = (C1123) r6;
            this.f6638 = null;
            this.f6636.m6798();
            for (int i = 0; i < r62.f6636.f5902; i++) {
                this.f6636.m6796(r62.f6636.m6800(i), r62.f6636.m6803(i), true);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m7555(C1294 r4) {
        float f = 1.0f;
        if (r4.f7256 != 1) {
            if (r4.f7256 == 2) {
                f = 1000.0f;
            } else if (r4.f7256 == 3) {
                f = 1000000.0f;
            } else if (r4.f7256 == 4) {
                f = 1.0E9f;
            } else if (r4.f7256 == 5) {
                f = 1.0E12f;
            }
        }
        this.f6636.m6802(r4, f);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1294 m7546() {
        return this.f6638;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        r7 = r9.f6636.m6803(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            o.ɩІ r0 = r9.f6638
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            o.ɩІ r1 = r9.f6638
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f6637
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f6637
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            o.ǃӏ r5 = r9.f6636
            int r5 = r5.f5902
        L_0x005b:
            if (r2 >= r5) goto L_0x00e3
            o.ǃӏ r6 = r9.f6636
            o.ɩІ r6 = r6.m6800(r2)
            if (r6 == 0) goto L_0x00df
            o.ǃӏ r7 = r9.f6636
            float r7 = r7.m6803(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00df
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x008b
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b0
        L_0x008b:
            if (r8 <= 0) goto L_0x009f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b1
        L_0x009f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b0:
            float r7 = -r7
        L_0x00b1:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00de
        L_0x00c7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00de:
            r1 = 1
        L_0x00df:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00e3:
            if (r1 != 0) goto L_0x00f6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1123.toString():java.lang.String");
    }
}
