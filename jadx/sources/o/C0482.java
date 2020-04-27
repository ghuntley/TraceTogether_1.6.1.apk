package o;

/* renamed from: o.ĸӀ  reason: contains not printable characters */
final class C0482 {
    /* renamed from: Ι  reason: contains not printable characters */
    static int m4835(byte[] bArr, int i, C0515 r3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m4832(b, bArr, i2, r3);
        }
        r3.f4280 = b;
        return i2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m4832(int i, byte[] bArr, int i2, C0515 r4) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            r4.f4280 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            r4.f4280 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            r4.f4280 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            r4.f4280 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                r4.f4280 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m4839(byte[] bArr, int i, C0515 r11) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            r11.f4279 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        r11.f4279 = j2;
        return i3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m4834(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static long m4825(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static double m4836(byte[] bArr, int i) {
        return Double.longBitsToDouble(m4825(bArr, i));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static float m4831(byte[] bArr, int i) {
        return Float.intBitsToFloat(m4834(bArr, i));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m4833(byte[] bArr, int i, C0515 r5) {
        int r4 = m4835(bArr, i, r5);
        int i2 = r5.f4280;
        if (i2 < 0) {
            throw C1124.m7559();
        } else if (i2 == 0) {
            r5.f4278 = "";
            return r4;
        } else {
            r5.f4278 = new String(bArr, r4, i2, C0936.f5914);
            return r4 + i2;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m4829(byte[] bArr, int i, C0515 r3) {
        int r2 = m4835(bArr, i, r3);
        int i2 = r3.f4280;
        if (i2 < 0) {
            throw C1124.m7559();
        } else if (i2 == 0) {
            r3.f4278 = "";
            return r2;
        } else {
            r3.f4278 = C2530.m13533(bArr, r2, i2);
            return r2 + i2;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m4824(byte[] bArr, int i, C0515 r4) {
        int r3 = m4835(bArr, i, r4);
        int i2 = r4.f4280;
        if (i2 < 0) {
            throw C1124.m7559();
        } else if (i2 > bArr.length - r3) {
            throw C1124.m7558();
        } else if (i2 == 0) {
            r4.f4278 = C0510.f4250;
            return r3;
        } else {
            r4.f4278 = C0510.m4957(bArr, r3, i2);
            return r3 + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m4838(o.C1990 r6, byte[] r7, int r8, int r9, o.C0515 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m4832(r8, r7, r0, r10)
            int r8 = r10.f4280
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.m10788()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.m10789(r1, r2, r3, r4, r5)
            r6.m10784(r9)
            r10.f4278 = r9
            return r8
        L_0x0025:
            o.ɛı r6 = o.C1124.m7558()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0482.m4838(o.ιɤ, byte[], int, int, o.ŀЈ):int");
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m4837(C1990 r8, byte[] bArr, int i, int i2, int i3, C0515 r13) {
        C1824 r82 = (C1824) r8;
        Object r7 = r82.m10075();
        int r9 = r82.m10070(r7, bArr, i, i2, i3, r13);
        r82.m10071(r7);
        r13.f4278 = r7;
        return r9;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m4827(int i, byte[] bArr, int i2, int i3, C1001<?> r6, C0515 r7) {
        C0986 r62 = (C0986) r6;
        int r4 = m4835(bArr, i2, r7);
        r62.m6972(r7.f4280);
        while (r4 < i3) {
            int r0 = m4835(bArr, r4, r7);
            if (i != r7.f4280) {
                break;
            }
            r4 = m4835(bArr, r0, r7);
            r62.m6972(r7.f4280);
        }
        return r4;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m4830(byte[] bArr, int i, C1001<?> r4, C0515 r5) {
        C0986 r42 = (C0986) r4;
        int r3 = m4835(bArr, i, r5);
        int i2 = r5.f4280 + r3;
        while (r3 < i2) {
            r3 = m4835(bArr, r3, r5);
            r42.m6972(r5.f4280);
        }
        if (r3 == i2) {
            return r3;
        }
        throw C1124.m7558();
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m4823(C1990<?> r2, int i, byte[] bArr, int i2, int i3, C1001<?> r7, C0515 r8) {
        int r5 = m4838(r2, bArr, i2, i3, r8);
        r7.add(r8.f4278);
        while (r5 < i3) {
            int r0 = m4835(bArr, r5, r8);
            if (i != r8.f4280) {
                break;
            }
            r5 = m4838(r2, bArr, r0, i3, r8);
            r7.add(r8.f4278);
        }
        return r5;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m4828(int i, byte[] bArr, int i2, int i3, C2515 r13, C0515 r14) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int r10 = m4839(bArr, i2, r14);
                r13.m13360(i, Long.valueOf(r14.f4279));
                return r10;
            } else if (i4 == 1) {
                r13.m13360(i, Long.valueOf(m4825(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int r11 = m4835(bArr, i2, r14);
                int i5 = r14.f4280;
                if (i5 < 0) {
                    throw C1124.m7559();
                } else if (i5 <= bArr.length - r11) {
                    if (i5 == 0) {
                        r13.m13360(i, C0510.f4250);
                    } else {
                        r13.m13360(i, C0510.m4957(bArr, r11, i5));
                    }
                    return r11 + i5;
                } else {
                    throw C1124.m7558();
                }
            } else if (i4 == 3) {
                C2515 r6 = C2515.m13352();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int r2 = m4835(bArr, i2, r14);
                    int i8 = r14.f4280;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = r2;
                        break;
                    }
                    int r8 = m4828(i7, bArr, r2, i3, r6, r14);
                    i7 = i8;
                    i2 = r8;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C1124.m7563();
                }
                r13.m13360(i, r6);
                return i2;
            } else if (i4 == 5) {
                r13.m13360(i, Integer.valueOf(m4834(bArr, i2)));
                return i2 + 4;
            } else {
                throw C1124.m7561();
            }
        } else {
            throw C1124.m7561();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m4826(int i, byte[] bArr, int i2, int i3, C0515 r6) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m4839(bArr, i2, r6);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m4835(bArr, i2, r6) + r6.f4280;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m4835(bArr, i2, r6);
                    i6 = r6.f4280;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m4826(i6, bArr, i2, i3, r6);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C1124.m7563();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C1124.m7561();
            }
        } else {
            throw C1124.m7561();
        }
    }
}
