package o;

import java.util.Arrays;
import o.C1294;

/* renamed from: o.ǃӏ  reason: contains not printable characters */
public final class C0934 {

    /* renamed from: ı  reason: contains not printable characters */
    int f5902 = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f5903;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C1133 f5904;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C1123 f5905;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f5906;

    /* renamed from: Ι  reason: contains not printable characters */
    int[] f5907;

    /* renamed from: ι  reason: contains not printable characters */
    int[] f5908;

    /* renamed from: І  reason: contains not printable characters */
    private int f5909 = 8;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f5910;

    /* renamed from: Ӏ  reason: contains not printable characters */
    float[] f5911;

    C0934(C1123 r4, C1133 r5) {
        int i = this.f5909;
        this.f5907 = new int[i];
        this.f5908 = new int[i];
        this.f5911 = new float[i];
        this.f5903 = -1;
        this.f5906 = -1;
        this.f5910 = false;
        this.f5905 = r4;
        this.f5904 = r5;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6802(C1294 r9, float f) {
        if (f == 0.0f) {
            m6795(r9, true);
            return;
        }
        int i = this.f5903;
        if (i == -1) {
            this.f5903 = 0;
            float[] fArr = this.f5911;
            int i2 = this.f5903;
            fArr[i2] = f;
            this.f5907[i2] = r9.f7254;
            this.f5908[this.f5903] = -1;
            r9.f7258++;
            r9.m8234(this.f5905);
            this.f5902++;
            if (!this.f5910) {
                this.f5906++;
                int i3 = this.f5906;
                int[] iArr = this.f5907;
                if (i3 >= iArr.length) {
                    this.f5910 = true;
                    this.f5906 = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f5902) {
            if (this.f5907[i] == r9.f7254) {
                this.f5911[i] = f;
                return;
            }
            if (this.f5907[i] < r9.f7254) {
                i5 = i;
            }
            i = this.f5908[i];
            i4++;
        }
        int i6 = this.f5906;
        int i7 = i6 + 1;
        if (this.f5910) {
            int[] iArr2 = this.f5907;
            if (iArr2[i6] != -1) {
                i6 = iArr2.length;
            }
        } else {
            i6 = i7;
        }
        int[] iArr3 = this.f5907;
        if (i6 >= iArr3.length && this.f5902 < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f5907;
                if (i8 >= iArr4.length) {
                    break;
                } else if (iArr4[i8] == -1) {
                    i6 = i8;
                    break;
                } else {
                    i8++;
                }
            }
        }
        int[] iArr5 = this.f5907;
        if (i6 >= iArr5.length) {
            i6 = iArr5.length;
            this.f5909 <<= 1;
            this.f5910 = false;
            this.f5906 = i6 - 1;
            this.f5911 = Arrays.copyOf(this.f5911, this.f5909);
            this.f5907 = Arrays.copyOf(this.f5907, this.f5909);
            this.f5908 = Arrays.copyOf(this.f5908, this.f5909);
        }
        this.f5907[i6] = r9.f7254;
        this.f5911[i6] = f;
        if (i5 != -1) {
            int[] iArr6 = this.f5908;
            iArr6[i6] = iArr6[i5];
            iArr6[i5] = i6;
        } else {
            this.f5908[i6] = this.f5903;
            this.f5903 = i6;
        }
        r9.f7258++;
        r9.m8234(this.f5905);
        this.f5902++;
        if (!this.f5910) {
            this.f5906++;
        }
        if (this.f5902 >= this.f5907.length) {
            this.f5910 = true;
        }
        int i9 = this.f5906;
        int[] iArr7 = this.f5907;
        if (i9 >= iArr7.length) {
            this.f5910 = true;
            this.f5906 = iArr7.length - 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m6796(C1294 r10, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f5903;
            if (i == -1) {
                this.f5903 = 0;
                float[] fArr = this.f5911;
                int i2 = this.f5903;
                fArr[i2] = f;
                this.f5907[i2] = r10.f7254;
                this.f5908[this.f5903] = -1;
                r10.f7258++;
                r10.m8234(this.f5905);
                this.f5902++;
                if (!this.f5910) {
                    this.f5906++;
                    int i3 = this.f5906;
                    int[] iArr = this.f5907;
                    if (i3 >= iArr.length) {
                        this.f5910 = true;
                        this.f5906 = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.f5902) {
                if (this.f5907[i] == r10.f7254) {
                    float[] fArr2 = this.f5911;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f5903) {
                            this.f5903 = this.f5908[i];
                        } else {
                            int[] iArr2 = this.f5908;
                            iArr2[i5] = iArr2[i];
                        }
                        if (z) {
                            r10.m8236(this.f5905);
                        }
                        if (this.f5910) {
                            this.f5906 = i;
                        }
                        r10.f7258--;
                        this.f5902--;
                        return;
                    }
                    return;
                }
                if (this.f5907[i] < r10.f7254) {
                    i5 = i;
                }
                i = this.f5908[i];
                i4++;
            }
            int i6 = this.f5906;
            int i7 = i6 + 1;
            if (this.f5910) {
                int[] iArr3 = this.f5907;
                if (iArr3[i6] != -1) {
                    i6 = iArr3.length;
                }
            } else {
                i6 = i7;
            }
            int[] iArr4 = this.f5907;
            if (i6 >= iArr4.length && this.f5902 < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f5907;
                    if (i8 >= iArr5.length) {
                        break;
                    } else if (iArr5[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr6 = this.f5907;
            if (i6 >= iArr6.length) {
                i6 = iArr6.length;
                this.f5909 <<= 1;
                this.f5910 = false;
                this.f5906 = i6 - 1;
                this.f5911 = Arrays.copyOf(this.f5911, this.f5909);
                this.f5907 = Arrays.copyOf(this.f5907, this.f5909);
                this.f5908 = Arrays.copyOf(this.f5908, this.f5909);
            }
            this.f5907[i6] = r10.f7254;
            this.f5911[i6] = f;
            if (i5 != -1) {
                int[] iArr7 = this.f5908;
                iArr7[i6] = iArr7[i5];
                iArr7[i5] = i6;
            } else {
                this.f5908[i6] = this.f5903;
                this.f5903 = i6;
            }
            r10.f7258++;
            r10.m8234(this.f5905);
            this.f5902++;
            if (!this.f5910) {
                this.f5906++;
            }
            int i9 = this.f5906;
            int[] iArr8 = this.f5907;
            if (i9 >= iArr8.length) {
                this.f5910 = true;
                this.f5906 = iArr8.length - 1;
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final float m6795(C1294 r9, boolean z) {
        int i = this.f5903;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f5902) {
            if (this.f5907[i] == r9.f7254) {
                if (i == this.f5903) {
                    this.f5903 = this.f5908[i];
                } else {
                    int[] iArr = this.f5908;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    r9.m8236(this.f5905);
                }
                r9.f7258--;
                this.f5902--;
                this.f5907[i] = -1;
                if (this.f5910) {
                    this.f5906 = i;
                }
                return this.f5911[i];
            }
            i2++;
            i3 = i;
            i = this.f5908[i];
        }
        return 0.0f;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6798() {
        int i = this.f5903;
        int i2 = 0;
        while (i != -1 && i2 < this.f5902) {
            C1294 r3 = this.f5904.f6651[this.f5907[i]];
            if (r3 != null) {
                r3.m8236(this.f5905);
            }
            i = this.f5908[i];
            i2++;
        }
        this.f5903 = -1;
        this.f5906 = -1;
        this.f5910 = false;
        this.f5902 = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6799(C1123 r9, C1123 r10) {
        int i = this.f5903;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f5902) {
                if (this.f5907[i] == r10.f6638.f7254) {
                    float f = this.f5911[i];
                    m6795(r10.f6638, false);
                    C0934 r2 = r10.f6636;
                    int i3 = r2.f5903;
                    int i4 = 0;
                    while (i3 != -1 && i4 < r2.f5902) {
                        m6796(this.f5904.f6651[r2.f5907[i3]], r2.f5911[i3] * f, false);
                        i3 = r2.f5908[i3];
                        i4++;
                    }
                    r9.f6637 += r10.f6637 * f;
                    i = this.f5903;
                } else {
                    i = this.f5908[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1294 m6801(boolean[] zArr, C1294 r10) {
        int i = this.f5903;
        int i2 = 0;
        C1294 r3 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f5902) {
            if (this.f5911[i] < 0.0f) {
                C1294 r5 = this.f5904.f6651[this.f5907[i]];
                if ((zArr == null || !zArr[r5.f7254]) && r5 != r10 && (r5.f7261 == C1294.C1295.SLACK || r5.f7261 == C1294.C1295.ERROR)) {
                    float f2 = this.f5911[i];
                    if (f2 < f) {
                        r3 = r5;
                        f = f2;
                    }
                }
            }
            i = this.f5908[i];
            i2++;
        }
        return r3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1294 m6800(int i) {
        int i2 = this.f5903;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5902) {
            if (i3 == i) {
                return this.f5904.f6651[this.f5907[i2]];
            }
            i2 = this.f5908[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final float m6803(int i) {
        int i2 = this.f5903;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f5902) {
            if (i3 == i) {
                return this.f5911[i2];
            }
            i2 = this.f5908[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final float m6797(C1294 r5) {
        int i = this.f5903;
        int i2 = 0;
        while (i != -1 && i2 < this.f5902) {
            if (this.f5907[i] == r5.f7254) {
                return this.f5911[i];
            }
            i = this.f5908[i];
            i2++;
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f5903;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f5902) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.f5911[i]);
            sb2.append(" : ");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(this.f5904.f6651[this.f5907[i]]);
            str = sb3.toString();
            i = this.f5908[i];
            i2++;
        }
        return str;
    }
}
