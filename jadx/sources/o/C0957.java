package o;

import android.graphics.Path;
import java.util.ArrayList;
import o.C2724;
import o.C2745;

/* renamed from: o.ȷı  reason: contains not printable characters */
public final class C0957 {

    /* renamed from: ı  reason: contains not printable characters */
    public float f5954;

    /* renamed from: ǃ  reason: contains not printable characters */
    public float f5955;

    /* renamed from: ǃ  reason: contains not printable characters */
    static float[] m6862(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Path m6861(String str) {
        Path path = new Path();
        If[] r1 = m6860(str);
        if (r1 == null) {
            return null;
        }
        try {
            If.m6869(r1, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static If[] m6860(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int r3 = m6863(str, i);
            String trim = str.substring(i2, r3).trim();
            if (trim.length() > 0) {
                arrayList.add(new If(trim.charAt(0), m6864(trim)));
            }
            i2 = r3;
            i = r3 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            arrayList.add(new If(str.charAt(i2), new float[0]));
        }
        return (If[]) arrayList.toArray(new If[arrayList.size()]);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static If[] m6866(If[] ifArr) {
        if (ifArr == null) {
            return null;
        }
        If[] ifArr2 = new If[ifArr.length];
        for (int i = 0; i < ifArr.length; i++) {
            ifArr2[i] = new If(ifArr[i]);
        }
        return ifArr2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m6865(If[] ifArr, If[] ifArr2) {
        if (ifArr == null || ifArr2 == null || ifArr.length != ifArr2.length) {
            return false;
        }
        for (int i = 0; i < ifArr.length; i++) {
            if (ifArr[i].f5956 != ifArr2[i].f5956 || ifArr[i].f5957.length != ifArr2[i].f5957.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m6863(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: o.ȷı$ɩ  reason: contains not printable characters */
    static class C0958 {

        /* renamed from: ǃ  reason: contains not printable characters */
        int f5958;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f5959;

        C0958() {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ NumberFormatException -> 0x0082 }, LOOP:1: B:8:0x002d->B:28:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078 A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch:{ NumberFormatException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0061 A[SYNTHETIC] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] m6864(java.lang.String r13) {
        /*
            r0 = 0
            char r1 = r13.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x009c
            char r1 = r13.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L_0x0013
            goto L_0x009c
        L_0x0013:
            int r1 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            float[] r1 = new float[r1]     // Catch:{ NumberFormatException -> 0x0082 }
            o.ȷı$ɩ r2 = new o.ȷı$ɩ     // Catch:{ NumberFormatException -> 0x0082 }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x0082 }
            int r3 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            r4 = 1
            r5 = 1
            r6 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x007d
            r2.f5959 = r0     // Catch:{ NumberFormatException -> 0x0082 }
            r7 = r5
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x002d:
            int r11 = r13.length()     // Catch:{ NumberFormatException -> 0x0082 }
            if (r7 >= r11) goto L_0x0061
            char r11 = r13.charAt(r7)     // Catch:{ NumberFormatException -> 0x0082 }
            r12 = 32
            if (r11 == r12) goto L_0x005a
            r12 = 69
            if (r11 == r12) goto L_0x0058
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L_0x0058
            switch(r11) {
                case 44: goto L_0x005a;
                case 45: goto L_0x004f;
                case 46: goto L_0x0047;
                default: goto L_0x0046;
            }     // Catch:{ NumberFormatException -> 0x0082 }
        L_0x0046:
            goto L_0x0056
        L_0x0047:
            if (r9 != 0) goto L_0x004c
            r8 = 0
            r9 = 1
            goto L_0x005c
        L_0x004c:
            r2.f5959 = r4     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x005a
        L_0x004f:
            if (r7 == r5) goto L_0x0056
            if (r8 != 0) goto L_0x0056
            r2.f5959 = r4     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x005a
        L_0x0056:
            r8 = 0
            goto L_0x005c
        L_0x0058:
            r8 = 1
            goto L_0x005c
        L_0x005a:
            r8 = 0
            r10 = 1
        L_0x005c:
            if (r10 != 0) goto L_0x0061
            int r7 = r7 + 1
            goto L_0x002d
        L_0x0061:
            r2.f5958 = r7     // Catch:{ NumberFormatException -> 0x0082 }
            int r7 = r2.f5958     // Catch:{ NumberFormatException -> 0x0082 }
            if (r5 >= r7) goto L_0x0074
            int r8 = r6 + 1
            java.lang.String r5 = r13.substring(r5, r7)     // Catch:{ NumberFormatException -> 0x0082 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x0082 }
            r1[r6] = r5     // Catch:{ NumberFormatException -> 0x0082 }
            r6 = r8
        L_0x0074:
            boolean r5 = r2.f5959     // Catch:{ NumberFormatException -> 0x0082 }
            if (r5 == 0) goto L_0x007a
            r5 = r7
            goto L_0x0025
        L_0x007a:
            int r5 = r7 + 1
            goto L_0x0025
        L_0x007d:
            float[] r13 = m6862(r1, r6)     // Catch:{ NumberFormatException -> 0x0082 }
            return r13
        L_0x0082:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r13 = "\""
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.<init>(r13, r0)
            throw r1
        L_0x009c:
            float[] r13 = new float[r0]
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0957.m6864(java.lang.String):float[]");
    }

    /* renamed from: o.ȷı$If */
    public static class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        public char f5956;

        /* renamed from: Ι  reason: contains not printable characters */
        public float[] f5957;

        If(char c, float[] fArr) {
            this.f5956 = c;
            this.f5957 = fArr;
        }

        If(If ifR) {
            this.f5956 = ifR.f5956;
            float[] fArr = ifR.f5957;
            this.f5957 = C0957.m6862(fArr, fArr.length);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static void m6869(If[] ifArr, Path path) {
            int i;
            char c;
            int i2;
            int i3;
            float[] fArr;
            int i4;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            If[] ifArr2 = ifArr;
            Path path2 = path;
            float[] fArr2 = new float[6];
            char c2 = 0;
            char c3 = 'm';
            int i6 = 0;
            while (i6 < ifArr2.length) {
                char c4 = ifArr2[i6].f5956;
                float[] fArr3 = ifArr2[i6].f5957;
                float f14 = fArr2[c2];
                float f15 = fArr2[1];
                float f16 = fArr2[2];
                float f17 = fArr2[3];
                float f18 = fArr2[4];
                float f19 = fArr2[5];
                switch (c4) {
                    case C2724.C2725.f12592 /*65*/:
                    case 'a':
                        i = 7;
                        break;
                    case C2724.C2725.f12607 /*67*/:
                    case 'c':
                        i = 6;
                        break;
                    case C2724.C2725.f12634 /*72*/:
                    case 'V':
                    case 'h':
                    case C2745.aux.f12990 /*118*/:
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case C2745.aux.f12993 /*115*/:
                        i = 4;
                        break;
                    case 'Z':
                    case C2745.aux.f13023 /*122*/:
                        path.close();
                        path2.moveTo(f18, f19);
                        f14 = f18;
                        f16 = f14;
                        f15 = f19;
                        f17 = f15;
                        break;
                }
                i = 2;
                float f20 = f18;
                float f21 = f19;
                int i7 = 0;
                float f22 = f14;
                float f23 = f15;
                while (i7 < fArr3.length) {
                    if (c4 != 'A') {
                        if (c4 == 'C') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            int i8 = i3 + 2;
                            int i9 = i3 + 3;
                            int i10 = i3 + 4;
                            int i11 = i3 + 5;
                            path.cubicTo(fArr[i3], fArr[i3 + 1], fArr[i8], fArr[i9], fArr[i10], fArr[i11]);
                            f22 = fArr[i10];
                            f23 = fArr[i11];
                            float f24 = fArr[i8];
                            f17 = fArr[i9];
                            f16 = f24;
                        } else if (c4 == 'H') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            path2.lineTo(fArr[i3], f23);
                            f22 = fArr[i3];
                        } else if (c4 == 'Q') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            int i12 = i3 + 1;
                            int i13 = i3 + 2;
                            int i14 = i3 + 3;
                            path2.quadTo(fArr[i3], fArr[i12], fArr[i13], fArr[i14]);
                            float f25 = fArr[i3];
                            float f26 = fArr[i12];
                            f22 = fArr[i13];
                            f23 = fArr[i14];
                            f16 = f25;
                            f17 = f26;
                        } else if (c4 == 'V') {
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            i2 = i6;
                            path2.lineTo(f22, fArr[i3]);
                            f23 = fArr[i3];
                        } else if (c4 != 'a') {
                            if (c4 != 'c') {
                                if (c4 == 'h') {
                                    float f27 = f23;
                                    i2 = i6;
                                    path2.rLineTo(fArr3[i7], 0.0f);
                                    f22 += fArr3[i7];
                                } else if (c4 != 'q') {
                                    if (c4 == 'v') {
                                        f6 = f23;
                                        i2 = i6;
                                        float f28 = f22;
                                        path2.rLineTo(0.0f, fArr3[i7]);
                                        f7 = fArr3[i7];
                                    } else if (c4 != 'L') {
                                        if (c4 == 'M') {
                                            i2 = i6;
                                            f22 = fArr3[i7];
                                            int i15 = i7 + 1;
                                            f23 = fArr3[i15];
                                            if (i7 > 0) {
                                                path2.lineTo(fArr3[i7], fArr3[i15]);
                                            } else {
                                                path2.moveTo(fArr3[i7], fArr3[i15]);
                                            }
                                        } else if (c4 == 'S') {
                                            float f29 = f23;
                                            i2 = i6;
                                            float f30 = f22;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f8 = (f29 * 2.0f) - f17;
                                                f9 = (f30 * 2.0f) - f16;
                                            } else {
                                                f8 = f29;
                                                f9 = f30;
                                            }
                                            int i16 = i7 + 1;
                                            int i17 = i7 + 2;
                                            int i18 = i7 + 3;
                                            path.cubicTo(f9, f8, fArr3[i7], fArr3[i16], fArr3[i17], fArr3[i18]);
                                            float f31 = fArr3[i7];
                                            float f32 = fArr3[i16];
                                            f22 = fArr3[i17];
                                            f23 = fArr3[i18];
                                            f17 = f32;
                                            f16 = f31;
                                        } else if (c4 == 'T') {
                                            float f33 = f23;
                                            i2 = i6;
                                            float f34 = f22;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f33 = (f33 * 2.0f) - f17;
                                                f34 = (f34 * 2.0f) - f16;
                                            }
                                            int i19 = i7 + 1;
                                            path2.quadTo(f34, f33, fArr3[i7], fArr3[i19]);
                                            f22 = fArr3[i7];
                                            f23 = fArr3[i19];
                                            f17 = f33;
                                            i3 = i7;
                                            fArr = fArr3;
                                            c = c4;
                                            f16 = f34;
                                        } else if (c4 == 'l') {
                                            f6 = f23;
                                            i2 = i6;
                                            int i20 = i7 + 1;
                                            path2.rLineTo(fArr3[i7], fArr3[i20]);
                                            f22 += fArr3[i7];
                                            f7 = fArr3[i20];
                                        } else if (c4 == 'm') {
                                            i2 = i6;
                                            f22 += fArr3[i7];
                                            int i21 = i7 + 1;
                                            f23 += fArr3[i21];
                                            if (i7 > 0) {
                                                path2.rLineTo(fArr3[i7], fArr3[i21]);
                                            } else {
                                                path2.rMoveTo(fArr3[i7], fArr3[i21]);
                                            }
                                        } else if (c4 != 's') {
                                            if (c4 == 't') {
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f12 = f22 - f16;
                                                    f13 = f23 - f17;
                                                } else {
                                                    f13 = 0.0f;
                                                    f12 = 0.0f;
                                                }
                                                int i22 = i7 + 1;
                                                path2.rQuadTo(f12, f13, fArr3[i7], fArr3[i22]);
                                                float f35 = f12 + f22;
                                                float f36 = f13 + f23;
                                                f22 += fArr3[i7];
                                                f23 += fArr3[i22];
                                                f17 = f36;
                                                f16 = f35;
                                            }
                                            i3 = i7;
                                            fArr = fArr3;
                                            c = c4;
                                            i2 = i6;
                                        } else {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f10 = f23 - f17;
                                                f11 = f22 - f16;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i23 = i7 + 1;
                                            int i24 = i7 + 2;
                                            int i25 = i7 + 3;
                                            f5 = f23;
                                            i5 = i6;
                                            float f37 = f22;
                                            path.rCubicTo(f11, f10, fArr3[i7], fArr3[i23], fArr3[i24], fArr3[i25]);
                                            f = f37 + fArr3[i7];
                                            f2 = f5 + fArr3[i23];
                                            f4 = fArr3[i24] + f37;
                                            f3 = fArr3[i25];
                                        }
                                        f21 = f23;
                                        f20 = f22;
                                    } else {
                                        i2 = i6;
                                        int i26 = i7 + 1;
                                        path2.lineTo(fArr3[i7], fArr3[i26]);
                                        f22 = fArr3[i7];
                                        f23 = fArr3[i26];
                                    }
                                    f23 = f6 + f7;
                                } else {
                                    float f38 = f23;
                                    i2 = i6;
                                    float f39 = f22;
                                    int i27 = i7 + 1;
                                    int i28 = i7 + 2;
                                    int i29 = i7 + 3;
                                    path2.rQuadTo(fArr3[i7], fArr3[i27], fArr3[i28], fArr3[i29]);
                                    float f40 = f39 + fArr3[i7];
                                    f23 = f38 + fArr3[i29];
                                    f17 = fArr3[i27] + f38;
                                    f16 = f40;
                                    i3 = i7;
                                    fArr = fArr3;
                                    c = c4;
                                    f22 = fArr3[i28] + f39;
                                }
                                i3 = i7;
                                fArr = fArr3;
                                c = c4;
                            } else {
                                f5 = f23;
                                i5 = i6;
                                float f41 = f22;
                                int i30 = i7 + 2;
                                int i31 = i7 + 3;
                                int i32 = i7 + 4;
                                int i33 = i7 + 5;
                                path.rCubicTo(fArr3[i7], fArr3[i7 + 1], fArr3[i30], fArr3[i31], fArr3[i32], fArr3[i33]);
                                f = f41 + fArr3[i30];
                                f2 = f5 + fArr3[i31];
                                f4 = fArr3[i32] + f41;
                                f3 = fArr3[i33];
                            }
                            f17 = f2;
                            f16 = f;
                            i3 = i7;
                            fArr = fArr3;
                            c = c4;
                            f23 = f5 + f3;
                            f22 = f4;
                        } else {
                            float f42 = f23;
                            i4 = i6;
                            float f43 = f22;
                            int i34 = i7 + 5;
                            float f44 = fArr3[i34] + f43;
                            int i35 = i7 + 6;
                            float f45 = fArr3[i35] + f42;
                            float f46 = fArr3[i7];
                            float f47 = fArr3[i7 + 1];
                            float f48 = fArr3[i7 + 2];
                            boolean z = fArr3[i7 + 3] != 0.0f;
                            boolean z2 = fArr3[i7 + 4] != 0.0f;
                            i3 = i7;
                            float f49 = f48;
                            fArr = fArr3;
                            c = c4;
                            m6868(path, f43, f42, f44, f45, f46, f47, f49, z, z2);
                            f22 = f43 + fArr[i34];
                            f23 = f42 + fArr[i35];
                        }
                        i7 = i3 + i;
                        If[] ifArr3 = ifArr;
                        fArr3 = fArr;
                        i6 = i2;
                        c3 = c;
                        c4 = c3;
                    } else {
                        i3 = i7;
                        fArr = fArr3;
                        c = c4;
                        i4 = i6;
                        int i36 = i3 + 5;
                        int i37 = i3 + 6;
                        m6868(path, f22, f23, fArr[i36], fArr[i37], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f, fArr[i3 + 4] != 0.0f);
                        f22 = fArr[i36];
                        f23 = fArr[i37];
                    }
                    f17 = f23;
                    f16 = f22;
                    i7 = i3 + i;
                    If[] ifArr32 = ifArr;
                    fArr3 = fArr;
                    i6 = i2;
                    c3 = c;
                    c4 = c3;
                }
                int i38 = i6;
                fArr2[0] = f22;
                fArr2[1] = f23;
                fArr2[2] = f16;
                fArr2[3] = f17;
                fArr2[4] = f20;
                fArr2[5] = f21;
                i6 = i38 + 1;
                c3 = ifArr[i38].f5956;
                c2 = 0;
                ifArr2 = ifArr;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m6870(If ifR, If ifR2, float f) {
            this.f5956 = ifR.f5956;
            int i = 0;
            while (true) {
                float[] fArr = ifR.f5957;
                if (i < fArr.length) {
                    this.f5957[i] = (fArr[i] * (1.0f - f)) + (ifR2.f5957[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static void m6868(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            boolean z3 = z2;
            float f10 = f5;
            float f11 = f6;
            float f12 = f7;
            while (true) {
                double radians = Math.toRadians((double) f12);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = (double) f8;
                double d4 = d3 * cos;
                double d5 = d3;
                double d6 = (double) f2;
                double d7 = (double) f10;
                double d8 = (d4 + (d6 * sin)) / d7;
                double d9 = (((double) (-f8)) * sin) + (d6 * cos);
                double d10 = d6;
                double d11 = (double) f11;
                float f13 = f10;
                float f14 = f11;
                double d12 = d9 / d11;
                double d13 = (double) f4;
                double d14 = ((((double) f9) * cos) + (d13 * sin)) / d7;
                double d15 = ((((double) (-f9)) * sin) + (d13 * cos)) / d11;
                double d16 = d8 - d14;
                double d17 = d12 - d15;
                double d18 = (d8 + d14) / 2.0d;
                double d19 = (d12 + d15) / 2.0d;
                double d20 = (d16 * d16) + (d17 * d17);
                if (d20 != 0.0d) {
                    double d21 = (1.0d / d20) - 0.25d;
                    if (d21 < 0.0d) {
                        float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                        f10 = f13 * sqrt;
                        f11 = f14 * sqrt;
                        f8 = f;
                        f9 = f3;
                        f12 = f7;
                        boolean z4 = z2;
                    } else {
                        double sqrt2 = Math.sqrt(d21);
                        double d22 = d16 * sqrt2;
                        double d23 = sqrt2 * d17;
                        double d24 = d7;
                        boolean z5 = z2;
                        if (z == z5) {
                            d2 = d18 - d23;
                            d = d19 + d22;
                        } else {
                            d2 = d18 + d23;
                            d = d19 - d22;
                        }
                        double d25 = sin;
                        double atan2 = Math.atan2(d12 - d, d8 - d2);
                        double atan22 = Math.atan2(d15 - d, d14 - d2) - atan2;
                        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
                        if (z5 != (i >= 0)) {
                            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                        }
                        double d26 = d2 * d24;
                        double d27 = d * d11;
                        m6867(path, (d26 * cos) - (d27 * d25), (d26 * d25) + (d27 * cos), d24, d11, d5, d10, radians, atan2, atan22);
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private static void m6867(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ((double) ceil);
            double d19 = d5;
            double d20 = d6;
            double d21 = d17;
            double d22 = d14;
            int i = 0;
            double d23 = d8;
            while (i < ceil) {
                double d24 = d23 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d26 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (sin3 * d15) + (cos3 * d16);
                double d29 = d24 - d23;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                int i2 = ceil;
                double d30 = cos;
                path.rLineTo(0.0f, 0.0f);
                float f = (float) (d20 + (d21 * sin4));
                float f2 = (float) (d25 - (sin4 * d27));
                path.cubicTo((float) (d19 + (d22 * sin4)), f, f2, (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                ceil = i2;
                sin = sin;
                d20 = d26;
                d15 = d15;
                d23 = d24;
                d21 = d28;
                d22 = d27;
                cos = d30;
                d10 = d3;
                d19 = d25;
            }
        }
    }

    public C0957(float f, float f2) {
        this.f5954 = f;
        this.f5955 = f2;
    }

    public C0957() {
        this(1.0f, 1.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5954);
        sb.append("x");
        sb.append(this.f5955);
        return sb.toString();
    }
}
