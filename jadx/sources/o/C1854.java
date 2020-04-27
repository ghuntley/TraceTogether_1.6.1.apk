package o;

import o.C1696;

/* renamed from: o.Ιι  reason: contains not printable characters */
public final class C1854 {

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean[] f9475 = new boolean[3];

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m10214(C1821 r7, C1461 r8, C1696 r9) {
        int i;
        int i2 = 0;
        if (r7.f8818[0] != C1696.C1697.WRAP_CONTENT && r9.f8818[0] == C1696.C1697.MATCH_PARENT) {
            int i3 = r9.f8813.f8544;
            if (r7.f8850 == 8) {
                i = 0;
            } else {
                i = r7.f8827;
            }
            int i4 = i - r9.f8816.f8544;
            r9.f8813.f8550 = r8.m8743((Object) r9.f8813);
            r9.f8816.f8550 = r8.m8743((Object) r9.f8816);
            r8.m8744(r9.f8813.f8550, i3);
            r8.m8744(r9.f8816.f8550, i4);
            r9.f8852 = 2;
            r9.m9652(i3, i4);
        }
        if (r7.f8818[1] != C1696.C1697.WRAP_CONTENT && r9.f8818[1] == C1696.C1697.MATCH_PARENT) {
            int i5 = r9.f8812.f8544;
            if (r7.f8850 != 8) {
                i2 = r7.f8836;
            }
            int i6 = i2 - r9.f8840.f8544;
            r9.f8812.f8550 = r8.m8743((Object) r9.f8812);
            r9.f8840.f8550 = r8.m8743((Object) r9.f8840);
            r8.m8744(r9.f8812.f8550, i5);
            r8.m8744(r9.f8840.f8550, i6);
            if (r9.f8835 > 0 || r9.f8850 == 8) {
                r9.f8814.f8550 = r8.m8743((Object) r9.f8814);
                r8.m8744(r9.f8814.f8550, r9.f8835 + i5);
            }
            r9.f8830 = 2;
            r9.m9622(i5, i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[RETURN] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m10213(o.C1696 r4, int r5) {
        /*
            o.ʢ$ɩ[] r0 = r4.f8818
            r0 = r0[r5]
            o.ʢ$ɩ r1 = o.C1696.C1697.MATCH_CONSTRAINT
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            float r0 = r4.f8854
            r1 = 0
            r3 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            o.ʢ$ɩ[] r4 = r4.f8818
            if (r5 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r4 = r4[r3]
            o.ʢ$ɩ r5 = o.C1696.C1697.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x001e
        L_0x001e:
            return r2
        L_0x001f:
            if (r5 != 0) goto L_0x002f
            int r5 = r4.f8863
            if (r5 == 0) goto L_0x0026
            return r2
        L_0x0026:
            int r5 = r4.f8866
            if (r5 != 0) goto L_0x002e
            int r4 = r4.f8867
            if (r4 == 0) goto L_0x003d
        L_0x002e:
            return r2
        L_0x002f:
            int r5 = r4.f8815
            if (r5 == 0) goto L_0x0034
            return r2
        L_0x0034:
            int r5 = r4.f8829
            if (r5 != 0) goto L_0x003e
            int r4 = r4.f8837
            if (r4 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            return r3
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1854.m10213(o.ʢ, int):boolean");
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m10216(int i, C1696 r17) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C1696 r0 = r17;
        r17.m9659();
        C2024 r1 = r0.f8813.f8547;
        C2024 r2 = r0.f8812.f8547;
        C2024 r3 = r0.f8816.f8547;
        C2024 r4 = r0.f8840.f8547;
        boolean z = (i & 8) == 8;
        boolean z2 = r0.f8818[0] == C1696.C1697.MATCH_CONSTRAINT && m10213(r0, 0);
        if (!(r1.f10001 == 4 || r3.f10001 == 4)) {
            if (r0.f8818[0] == C1696.C1697.FIXED || (z2 && r0.f8850 == 8)) {
                if (r0.f8813.f8549 == null && r0.f8816.f8549 == null) {
                    r1.f10001 = 1;
                    r3.f10001 = 1;
                    if (z) {
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        C2074 r7 = r0.f8851;
                        r3.f9996 = r1;
                        r3.f9996.f13031.add(r3);
                        r3.f9997 = r7;
                        r3.f9995 = 1;
                        r3.f9997.f13031.add(r3);
                    } else {
                        if (r0.f8850 == 8) {
                            i9 = 0;
                        } else {
                            i9 = r0.f8827;
                        }
                        r3.f9996 = r1;
                        r3.f9999 = (float) i9;
                        r3.f9996.f13031.add(r3);
                    }
                } else if (r0.f8813.f8549 != null && r0.f8816.f8549 == null) {
                    r1.f10001 = 1;
                    r3.f10001 = 1;
                    if (z) {
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        C2074 r72 = r0.f8851;
                        r3.f9996 = r1;
                        r3.f9996.f13031.add(r3);
                        r3.f9997 = r72;
                        r3.f9995 = 1;
                        r3.f9997.f13031.add(r3);
                    } else {
                        if (r0.f8850 == 8) {
                            i8 = 0;
                        } else {
                            i8 = r0.f8827;
                        }
                        r3.f9996 = r1;
                        r3.f9999 = (float) i8;
                        r3.f9996.f13031.add(r3);
                    }
                } else if (r0.f8813.f8549 == null && r0.f8816.f8549 != null) {
                    r1.f10001 = 1;
                    r3.f10001 = 1;
                    if (r0.f8850 == 8) {
                        i6 = 0;
                    } else {
                        i6 = r0.f8827;
                    }
                    r1.f9996 = r3;
                    r1.f9999 = (float) (-i6);
                    r1.f9996.f13031.add(r1);
                    if (z) {
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        C2074 r73 = r0.f8851;
                        r1.f9996 = r3;
                        r1.f9996.f13031.add(r1);
                        r1.f9997 = r73;
                        r1.f9995 = -1;
                        r1.f9997.f13031.add(r1);
                    } else {
                        if (r0.f8850 == 8) {
                            i7 = 0;
                        } else {
                            i7 = r0.f8827;
                        }
                        r1.f9996 = r3;
                        r1.f9999 = (float) (-i7);
                        r1.f9996.f13031.add(r1);
                    }
                } else if (!(r0.f8813.f8549 == null || r0.f8816.f8549 == null)) {
                    r1.f10001 = 2;
                    r3.f10001 = 2;
                    if (z) {
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        r0.f8851.f13031.add(r1);
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        r0.f8851.f13031.add(r3);
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        C2074 r74 = r0.f8851;
                        r1.f9994 = r3;
                        r1.f9998 = r74;
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        C2074 r75 = r0.f8851;
                        r3.f9994 = r1;
                        r3.f9998 = r75;
                    } else {
                        r1.f9994 = r3;
                        r3.f9994 = r1;
                    }
                }
            } else if (z2) {
                if (r0.f8850 == 8) {
                    i10 = 0;
                } else {
                    i10 = r0.f8827;
                }
                r1.f10001 = 1;
                r3.f10001 = 1;
                if (r0.f8813.f8549 == null && r0.f8816.f8549 == null) {
                    if (z) {
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        C2074 r76 = r0.f8851;
                        r3.f9996 = r1;
                        r3.f9996.f13031.add(r3);
                        r3.f9997 = r76;
                        r3.f9995 = 1;
                        r3.f9997.f13031.add(r3);
                    } else {
                        r3.f9996 = r1;
                        r3.f9999 = (float) i10;
                        r3.f9996.f13031.add(r3);
                    }
                } else if (r0.f8813.f8549 == null || r0.f8816.f8549 != null) {
                    if (r0.f8813.f8549 != null || r0.f8816.f8549 == null) {
                        if (!(r0.f8813.f8549 == null || r0.f8816.f8549 == null)) {
                            if (z) {
                                if (r0.f8851 == null) {
                                    r0.f8851 = new C2074();
                                }
                                r0.f8851.f13031.add(r1);
                                if (r0.f8851 == null) {
                                    r0.f8851 = new C2074();
                                }
                                r0.f8851.f13031.add(r3);
                            }
                            if (r0.f8854 == 0.0f) {
                                r1.f10001 = 3;
                                r3.f10001 = 3;
                                r1.f9994 = r3;
                                r3.f9994 = r1;
                            } else {
                                r1.f10001 = 2;
                                r3.f10001 = 2;
                                r1.f9994 = r3;
                                r3.f9994 = r1;
                                r0.m9645(i10);
                            }
                        }
                    } else if (z) {
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        C2074 r77 = r0.f8851;
                        r1.f9996 = r3;
                        r1.f9996.f13031.add(r1);
                        r1.f9997 = r77;
                        r1.f9995 = -1;
                        r1.f9997.f13031.add(r1);
                    } else {
                        r1.f9996 = r3;
                        r1.f9999 = (float) (-i10);
                        r1.f9996.f13031.add(r1);
                    }
                } else if (z) {
                    if (r0.f8851 == null) {
                        r0.f8851 = new C2074();
                    }
                    C2074 r78 = r0.f8851;
                    r3.f9996 = r1;
                    r3.f9996.f13031.add(r3);
                    r3.f9997 = r78;
                    r3.f9995 = 1;
                    r3.f9997.f13031.add(r3);
                } else {
                    r3.f9996 = r1;
                    r3.f9999 = (float) i10;
                    r3.f9996.f13031.add(r3);
                }
            }
        }
        boolean z3 = r0.f8818[1] == C1696.C1697.MATCH_CONSTRAINT && m10213(r0, 1);
        if (r2.f10001 != 4 && r4.f10001 != 4) {
            if (r0.f8818[1] == C1696.C1697.FIXED || (z3 && r0.f8850 == 8)) {
                if (r0.f8812.f8549 == null && r0.f8840.f8549 == null) {
                    r2.f10001 = 1;
                    r4.f10001 = 1;
                    if (z) {
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        C2074 r12 = r0.f8833;
                        r4.f9996 = r2;
                        r4.f9996.f13031.add(r4);
                        r4.f9997 = r12;
                        r4.f9995 = 1;
                        r4.f9997.f13031.add(r4);
                    } else {
                        if (r0.f8850 == 8) {
                            i4 = 0;
                        } else {
                            i4 = r0.f8836;
                        }
                        r4.f9996 = r2;
                        r4.f9999 = (float) i4;
                        r4.f9996.f13031.add(r4);
                    }
                    if (r0.f8814.f8549 != null) {
                        r0.f8814.f8547.f10001 = 1;
                        C2024 r13 = r0.f8814.f8547;
                        r2.f10001 = 1;
                        r2.f9996 = r13;
                        r2.f9999 = (float) (-r0.f8835);
                        r2.f9996.f13031.add(r2);
                    }
                } else if (r0.f8812.f8549 != null && r0.f8840.f8549 == null) {
                    r2.f10001 = 1;
                    r4.f10001 = 1;
                    if (z) {
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        C2074 r14 = r0.f8833;
                        r4.f9996 = r2;
                        r4.f9996.f13031.add(r4);
                        r4.f9997 = r14;
                        r4.f9995 = 1;
                        r4.f9997.f13031.add(r4);
                    } else {
                        if (r0.f8850 == 8) {
                            i3 = 0;
                        } else {
                            i3 = r0.f8836;
                        }
                        r4.f9996 = r2;
                        r4.f9999 = (float) i3;
                        r4.f9996.f13031.add(r4);
                    }
                    if (r0.f8835 > 0) {
                        C2024 r15 = r0.f8814.f8547;
                        int i11 = r0.f8835;
                        r15.f10001 = 1;
                        r15.f9996 = r2;
                        r15.f9999 = (float) i11;
                        r15.f9996.f13031.add(r15);
                    }
                } else if (r0.f8812.f8549 == null && r0.f8840.f8549 != null) {
                    r2.f10001 = 1;
                    r4.f10001 = 1;
                    if (z) {
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        C2074 r16 = r0.f8833;
                        r2.f9996 = r4;
                        r2.f9996.f13031.add(r2);
                        r2.f9997 = r16;
                        r2.f9995 = -1;
                        r2.f9997.f13031.add(r2);
                    } else {
                        if (r0.f8850 == 8) {
                            i2 = 0;
                        } else {
                            i2 = r0.f8836;
                        }
                        r2.f9996 = r4;
                        r2.f9999 = (float) (-i2);
                        r2.f9996.f13031.add(r2);
                    }
                    if (r0.f8835 > 0) {
                        C2024 r18 = r0.f8814.f8547;
                        int i12 = r0.f8835;
                        r18.f10001 = 1;
                        r18.f9996 = r2;
                        r18.f9999 = (float) i12;
                        r18.f9996.f13031.add(r18);
                    }
                } else if (r0.f8812.f8549 != null && r0.f8840.f8549 != null) {
                    r2.f10001 = 2;
                    r4.f10001 = 2;
                    if (z) {
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        C2074 r19 = r0.f8833;
                        r2.f9994 = r4;
                        r2.f9998 = r19;
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        C2074 r110 = r0.f8833;
                        r4.f9994 = r2;
                        r4.f9998 = r110;
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        r0.f8833.f13031.add(r2);
                        if (r0.f8851 == null) {
                            r0.f8851 = new C2074();
                        }
                        r0.f8851.f13031.add(r4);
                    } else {
                        r2.f9994 = r4;
                        r4.f9994 = r2;
                    }
                    if (r0.f8835 > 0) {
                        C2024 r111 = r0.f8814.f8547;
                        int i13 = r0.f8835;
                        r111.f10001 = 1;
                        r111.f9996 = r2;
                        r111.f9999 = (float) i13;
                        r111.f9996.f13031.add(r111);
                    }
                }
            } else if (z3) {
                if (r0.f8850 == 8) {
                    i5 = 0;
                } else {
                    i5 = r0.f8836;
                }
                r2.f10001 = 1;
                r4.f10001 = 1;
                if (r0.f8812.f8549 == null && r0.f8840.f8549 == null) {
                    if (z) {
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        C2074 r02 = r0.f8833;
                        r4.f9996 = r2;
                        r4.f9996.f13031.add(r4);
                        r4.f9997 = r02;
                        r4.f9995 = 1;
                        r4.f9997.f13031.add(r4);
                        return;
                    }
                    r4.f9996 = r2;
                    r4.f9999 = (float) i5;
                    r4.f9996.f13031.add(r4);
                } else if (r0.f8812.f8549 == null || r0.f8840.f8549 != null) {
                    if (r0.f8812.f8549 != null || r0.f8840.f8549 == null) {
                        if (r0.f8812.f8549 != null && r0.f8840.f8549 != null) {
                            if (z) {
                                if (r0.f8833 == null) {
                                    r0.f8833 = new C2074();
                                }
                                r0.f8833.f13031.add(r2);
                                if (r0.f8851 == null) {
                                    r0.f8851 = new C2074();
                                }
                                r0.f8851.f13031.add(r4);
                            }
                            if (r0.f8854 == 0.0f) {
                                r2.f10001 = 3;
                                r4.f10001 = 3;
                                r2.f9994 = r4;
                                r4.f9994 = r2;
                                return;
                            }
                            r2.f10001 = 2;
                            r4.f10001 = 2;
                            r2.f9994 = r4;
                            r4.f9994 = r2;
                            r0.m9651(i5);
                            if (r0.f8835 > 0) {
                                C2024 r112 = r0.f8814.f8547;
                                int i14 = r0.f8835;
                                r112.f10001 = 1;
                                r112.f9996 = r2;
                                r112.f9999 = (float) i14;
                                r112.f9996.f13031.add(r112);
                            }
                        }
                    } else if (z) {
                        if (r0.f8833 == null) {
                            r0.f8833 = new C2074();
                        }
                        C2074 r03 = r0.f8833;
                        r2.f9996 = r4;
                        r2.f9996.f13031.add(r2);
                        r2.f9997 = r03;
                        r2.f9995 = -1;
                        r2.f9997.f13031.add(r2);
                    } else {
                        r2.f9996 = r4;
                        r2.f9999 = (float) (-i5);
                        r2.f9996.f13031.add(r2);
                    }
                } else if (z) {
                    if (r0.f8833 == null) {
                        r0.f8833 = new C2074();
                    }
                    C2074 r04 = r0.f8833;
                    r4.f9996 = r2;
                    r4.f9996.f13031.add(r4);
                    r4.f9997 = r04;
                    r4.f9995 = 1;
                    r4.f9997.f13031.add(r4);
                } else {
                    r4.f9996 = r2;
                    r4.f9999 = (float) i5;
                    r4.f9996.f13031.add(r4);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r7.f8821 == 2) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r7.f8823 == 2) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fe  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m10217(o.C1461 r21, int r22, int r23, o.C1607 r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r24
            o.ʢ r3 = r2.f8497
            o.ʢ r4 = r2.f8489
            o.ʢ r5 = r2.f8492
            o.ʢ r6 = r2.f8487
            o.ʢ r7 = r2.f8498
            float r2 = r2.f8499
            o.ʢ$ɩ r8 = o.C1696.C1697.WRAP_CONTENT
            r8 = 2
            r9 = 1
            if (r1 != 0) goto L_0x002e
            int r11 = r7.f8821
            if (r11 != 0) goto L_0x001e
            r11 = 1
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            int r12 = r7.f8821
            if (r12 != r9) goto L_0x0025
            r12 = 1
            goto L_0x0026
        L_0x0025:
            r12 = 0
        L_0x0026:
            int r7 = r7.f8821
            if (r7 != r8) goto L_0x002c
        L_0x002a:
            r7 = 1
            goto L_0x0041
        L_0x002c:
            r7 = 0
            goto L_0x0041
        L_0x002e:
            int r11 = r7.f8823
            if (r11 != 0) goto L_0x0034
            r11 = 1
            goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            int r12 = r7.f8823
            if (r12 != r9) goto L_0x003b
            r12 = 1
            goto L_0x003c
        L_0x003b:
            r12 = 0
        L_0x003c:
            int r7 = r7.f8823
            if (r7 != r8) goto L_0x002c
            goto L_0x002a
        L_0x0041:
            r14 = r3
            r9 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0049:
            r8 = 8
            if (r13 != 0) goto L_0x0101
            int r10 = r14.f8850
            if (r10 == r8) goto L_0x009c
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x005d
            int r10 = r14.f8850
            if (r10 != r8) goto L_0x005a
            goto L_0x0061
        L_0x005a:
            int r10 = r14.f8827
            goto L_0x0065
        L_0x005d:
            int r10 = r14.f8850
            if (r10 != r8) goto L_0x0063
        L_0x0061:
            r10 = 0
            goto L_0x0065
        L_0x0063:
            int r10 = r14.f8836
        L_0x0065:
            float r10 = (float) r10
            float r16 = r16 + r10
            if (r14 == r5) goto L_0x0075
            o.ʈ[] r10 = r14.f8826
            r10 = r10[r23]
            int r10 = r10.m9386()
            float r10 = (float) r10
            float r16 = r16 + r10
        L_0x0075:
            if (r14 == r6) goto L_0x0084
            o.ʈ[] r10 = r14.f8826
            int r19 = r23 + 1
            r10 = r10[r19]
            int r10 = r10.m9386()
            float r10 = (float) r10
            float r16 = r16 + r10
        L_0x0084:
            o.ʈ[] r10 = r14.f8826
            r10 = r10[r23]
            int r10 = r10.m9386()
            float r10 = (float) r10
            float r17 = r17 + r10
            o.ʈ[] r10 = r14.f8826
            int r19 = r23 + 1
            r10 = r10[r19]
            int r10 = r10.m9386()
            float r10 = (float) r10
            float r17 = r17 + r10
        L_0x009c:
            int r10 = r14.f8850
            if (r10 == r8) goto L_0x00d4
            o.ʢ$ɩ[] r8 = r14.f8818
            r8 = r8[r1]
            o.ʢ$ɩ r10 = o.C1696.C1697.MATCH_CONSTRAINT
            if (r8 != r10) goto L_0x00d4
            int r9 = r9 + 1
            if (r1 != 0) goto L_0x00bc
            int r8 = r14.f8863
            if (r8 == 0) goto L_0x00b2
            r8 = 0
            return r8
        L_0x00b2:
            r8 = 0
            int r10 = r14.f8866
            if (r10 != 0) goto L_0x00bb
            int r10 = r14.f8867
            if (r10 == 0) goto L_0x00cb
        L_0x00bb:
            return r8
        L_0x00bc:
            r8 = 0
            int r10 = r14.f8815
            if (r10 == 0) goto L_0x00c2
            return r8
        L_0x00c2:
            int r10 = r14.f8829
            if (r10 != 0) goto L_0x00d3
            int r10 = r14.f8837
            if (r10 == 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            float r10 = r14.f8854
            r18 = 0
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x00d4
        L_0x00d3:
            return r8
        L_0x00d4:
            o.ʈ[] r8 = r14.f8826
            int r10 = r23 + 1
            r8 = r8[r10]
            o.ʈ r8 = r8.f8549
            if (r8 == 0) goto L_0x00f6
            o.ʢ r8 = r8.f8546
            o.ʈ[] r10 = r8.f8826
            r10 = r10[r23]
            o.ʈ r10 = r10.f8549
            if (r10 == 0) goto L_0x00f6
            o.ʈ[] r10 = r8.f8826
            r10 = r10[r23]
            o.ʈ r10 = r10.f8549
            o.ʢ r10 = r10.f8546
            if (r10 == r14) goto L_0x00f3
            goto L_0x00f6
        L_0x00f3:
            r19 = r8
            goto L_0x00f8
        L_0x00f6:
            r19 = 0
        L_0x00f8:
            if (r19 == 0) goto L_0x00fe
            r14 = r19
            goto L_0x0049
        L_0x00fe:
            r13 = 1
            goto L_0x0049
        L_0x0101:
            o.ʈ[] r10 = r3.f8826
            r10 = r10[r23]
            o.ιΙ r10 = r10.f8547
            o.ʈ[] r13 = r4.f8826
            int r19 = r23 + 1
            r13 = r13[r19]
            o.ιΙ r13 = r13.f8547
            o.ιΙ r8 = r10.f9996
            if (r8 == 0) goto L_0x032c
            o.ιΙ r8 = r13.f9996
            if (r8 != 0) goto L_0x0119
            goto L_0x032c
        L_0x0119:
            o.ιΙ r8 = r10.f9996
            int r8 = r8.f13030
            r20 = r3
            r3 = 1
            if (r8 != r3) goto L_0x032a
            o.ιΙ r8 = r13.f9996
            int r8 = r8.f13030
            if (r8 == r3) goto L_0x012a
            goto L_0x032a
        L_0x012a:
            if (r9 <= 0) goto L_0x0130
            if (r9 == r15) goto L_0x0130
            r3 = 0
            return r3
        L_0x0130:
            if (r7 != 0) goto L_0x0139
            if (r11 != 0) goto L_0x0139
            if (r12 == 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r8 = 0
            goto L_0x0152
        L_0x0139:
            if (r5 == 0) goto L_0x0145
            o.ʈ[] r3 = r5.f8826
            r3 = r3[r23]
            int r3 = r3.m9386()
            float r8 = (float) r3
            goto L_0x0146
        L_0x0145:
            r8 = 0
        L_0x0146:
            if (r6 == 0) goto L_0x0152
            o.ʈ[] r3 = r6.f8826
            r3 = r3[r19]
            int r3 = r3.m9386()
            float r3 = (float) r3
            float r8 = r8 + r3
        L_0x0152:
            o.ιΙ r3 = r10.f9996
            float r3 = r3.f10002
            o.ιΙ r6 = r13.f9996
            float r6 = r6.f10002
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x0160
            float r6 = r6 - r3
            goto L_0x0162
        L_0x0160:
            float r6 = r3 - r6
        L_0x0162:
            float r6 = r6 - r16
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 <= 0) goto L_0x01ee
            if (r9 != r15) goto L_0x01ee
            o.ʢ r5 = r14.f8828
            if (r5 == 0) goto L_0x017a
            o.ʢ r5 = r14.f8828
            o.ʢ$ɩ[] r5 = r5.f8818
            r5 = r5[r1]
            o.ʢ$ɩ r7 = o.C1696.C1697.WRAP_CONTENT
            if (r5 != r7) goto L_0x017a
            r5 = 0
            return r5
        L_0x017a:
            float r6 = r6 + r16
            float r6 = r6 - r17
            r5 = r3
            r3 = r20
        L_0x0181:
            if (r3 == 0) goto L_0x01ec
            o.Ӏ$If r7 = o.C1461.f7864
            o.ʢ[] r7 = r3.f8841
            r7 = r7[r1]
            if (r7 != 0) goto L_0x018d
            if (r3 != r4) goto L_0x01ea
        L_0x018d:
            float r8 = (float) r9
            float r8 = r6 / r8
            r11 = 0
            int r12 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x01a6
            float[] r8 = r3.f8825
            r8 = r8[r1]
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x019f
            r8 = 0
            goto L_0x01a6
        L_0x019f:
            float[] r8 = r3.f8825
            r8 = r8[r1]
            float r8 = r8 * r6
            float r8 = r8 / r2
        L_0x01a6:
            int r11 = r3.f8850
            r12 = 8
            if (r11 != r12) goto L_0x01ad
            r8 = 0
        L_0x01ad:
            o.ʈ[] r11 = r3.f8826
            r11 = r11[r23]
            int r11 = r11.m9386()
            float r11 = (float) r11
            float r5 = r5 + r11
            o.ʈ[] r11 = r3.f8826
            r11 = r11[r23]
            o.ιΙ r11 = r11.f8547
            o.ιΙ r12 = r10.f10000
            r11.m10851(r12, r5)
            o.ʈ[] r11 = r3.f8826
            r11 = r11[r19]
            o.ιΙ r11 = r11.f8547
            o.ιΙ r12 = r10.f10000
            float r5 = r5 + r8
            r11.m10851(r12, r5)
            o.ʈ[] r8 = r3.f8826
            r8 = r8[r23]
            o.ιΙ r8 = r8.f8547
            r8.m10853(r0)
            o.ʈ[] r8 = r3.f8826
            r8 = r8[r19]
            o.ιΙ r8 = r8.f8547
            r8.m10853(r0)
            o.ʈ[] r3 = r3.f8826
            r3 = r3[r19]
            int r3 = r3.m9386()
            float r3 = (float) r3
            float r5 = r5 + r3
        L_0x01ea:
            r3 = r7
            goto L_0x0181
        L_0x01ec:
            r3 = 1
            return r3
        L_0x01ee:
            r2 = 0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01f6
            r7 = 1
            r11 = 0
            r12 = 0
        L_0x01f6:
            if (r7 == 0) goto L_0x026c
            float r6 = r6 - r8
            if (r1 != 0) goto L_0x0200
            r2 = r20
            float r13 = r2.f8853
            goto L_0x0207
        L_0x0200:
            r2 = r20
            r5 = 1
            if (r1 != r5) goto L_0x0207
            float r13 = r2.f8868
        L_0x0207:
            float r6 = r6 * r13
            float r3 = r3 + r6
        L_0x020a:
            if (r2 == 0) goto L_0x0273
            o.Ӏ$If r5 = o.C1461.f7864
            o.ʢ[] r5 = r2.f8841
            r5 = r5[r1]
            if (r5 != 0) goto L_0x0216
            if (r2 != r4) goto L_0x026a
        L_0x0216:
            if (r1 != 0) goto L_0x0222
            int r6 = r2.f8850
            r7 = 8
            if (r6 != r7) goto L_0x021f
            goto L_0x0228
        L_0x021f:
            int r6 = r2.f8827
            goto L_0x022c
        L_0x0222:
            r7 = 8
            int r6 = r2.f8850
            if (r6 != r7) goto L_0x022a
        L_0x0228:
            r6 = 0
            goto L_0x022c
        L_0x022a:
            int r6 = r2.f8836
        L_0x022c:
            float r6 = (float) r6
            o.ʈ[] r7 = r2.f8826
            r7 = r7[r23]
            int r7 = r7.m9386()
            float r7 = (float) r7
            float r3 = r3 + r7
            o.ʈ[] r7 = r2.f8826
            r7 = r7[r23]
            o.ιΙ r7 = r7.f8547
            o.ιΙ r8 = r10.f10000
            r7.m10851(r8, r3)
            o.ʈ[] r7 = r2.f8826
            r7 = r7[r19]
            o.ιΙ r7 = r7.f8547
            o.ιΙ r8 = r10.f10000
            float r3 = r3 + r6
            r7.m10851(r8, r3)
            o.ʈ[] r6 = r2.f8826
            r6 = r6[r23]
            o.ιΙ r6 = r6.f8547
            r6.m10853(r0)
            o.ʈ[] r6 = r2.f8826
            r6 = r6[r19]
            o.ιΙ r6 = r6.f8547
            r6.m10853(r0)
            o.ʈ[] r2 = r2.f8826
            r2 = r2[r19]
            int r2 = r2.m9386()
            float r2 = (float) r2
            float r3 = r3 + r2
        L_0x026a:
            r2 = r5
            goto L_0x020a
        L_0x026c:
            r2 = r20
            if (r11 != 0) goto L_0x0276
            if (r12 == 0) goto L_0x0273
            goto L_0x0276
        L_0x0273:
            r0 = 1
            goto L_0x0329
        L_0x0276:
            if (r11 == 0) goto L_0x027a
        L_0x0278:
            float r6 = r6 - r8
            goto L_0x027d
        L_0x027a:
            if (r12 == 0) goto L_0x027d
            goto L_0x0278
        L_0x027d:
            int r7 = r15 + 1
            float r7 = (float) r7
            float r7 = r6 / r7
            if (r12 == 0) goto L_0x028f
            r8 = 1
            if (r15 <= r8) goto L_0x028b
            int r7 = r15 + -1
            float r7 = (float) r7
            goto L_0x028d
        L_0x028b:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x028d:
            float r7 = r6 / r7
        L_0x028f:
            int r6 = r2.f8850
            r8 = 8
            if (r6 == r8) goto L_0x0298
            float r6 = r3 + r7
            goto L_0x0299
        L_0x0298:
            r6 = r3
        L_0x0299:
            if (r12 == 0) goto L_0x02a8
            r8 = 1
            if (r15 <= r8) goto L_0x02a8
            o.ʈ[] r6 = r5.f8826
            r6 = r6[r23]
            int r6 = r6.m9386()
            float r6 = (float) r6
            float r6 = r6 + r3
        L_0x02a8:
            if (r11 == 0) goto L_0x02b6
            if (r5 == 0) goto L_0x02b6
            o.ʈ[] r3 = r5.f8826
            r3 = r3[r23]
            int r3 = r3.m9386()
            float r3 = (float) r3
            float r6 = r6 + r3
        L_0x02b6:
            if (r2 == 0) goto L_0x0273
            o.Ӏ$If r3 = o.C1461.f7864
            o.ʢ[] r3 = r2.f8841
            r3 = r3[r1]
            if (r3 != 0) goto L_0x02c6
            if (r2 != r4) goto L_0x02c3
            goto L_0x02c6
        L_0x02c3:
            r8 = 8
            goto L_0x0327
        L_0x02c6:
            if (r1 != 0) goto L_0x02d2
            int r8 = r2.f8850
            r9 = 8
            if (r8 != r9) goto L_0x02cf
            goto L_0x02d8
        L_0x02cf:
            int r8 = r2.f8827
            goto L_0x02dc
        L_0x02d2:
            r9 = 8
            int r8 = r2.f8850
            if (r8 != r9) goto L_0x02da
        L_0x02d8:
            r8 = 0
            goto L_0x02dc
        L_0x02da:
            int r8 = r2.f8836
        L_0x02dc:
            float r8 = (float) r8
            if (r2 == r5) goto L_0x02e9
            o.ʈ[] r9 = r2.f8826
            r9 = r9[r23]
            int r9 = r9.m9386()
            float r9 = (float) r9
            float r6 = r6 + r9
        L_0x02e9:
            o.ʈ[] r9 = r2.f8826
            r9 = r9[r23]
            o.ιΙ r9 = r9.f8547
            o.ιΙ r11 = r10.f10000
            r9.m10851(r11, r6)
            o.ʈ[] r9 = r2.f8826
            r9 = r9[r19]
            o.ιΙ r9 = r9.f8547
            o.ιΙ r11 = r10.f10000
            float r12 = r6 + r8
            r9.m10851(r11, r12)
            o.ʈ[] r9 = r2.f8826
            r9 = r9[r23]
            o.ιΙ r9 = r9.f8547
            r9.m10853(r0)
            o.ʈ[] r9 = r2.f8826
            r9 = r9[r19]
            o.ιΙ r9 = r9.f8547
            r9.m10853(r0)
            o.ʈ[] r2 = r2.f8826
            r2 = r2[r19]
            int r2 = r2.m9386()
            float r2 = (float) r2
            float r8 = r8 + r2
            float r6 = r6 + r8
            if (r3 == 0) goto L_0x02c3
            int r2 = r3.f8850
            r8 = 8
            if (r2 == r8) goto L_0x0327
            float r6 = r6 + r7
        L_0x0327:
            r2 = r3
            goto L_0x02b6
        L_0x0329:
            return r0
        L_0x032a:
            r0 = 0
            return r0
        L_0x032c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1854.m10217(o.ɹǃ, int, int, o.ʄ):boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m10215(C1696 r4, int i, int i2) {
        int i3;
        int i4 = i << 1;
        int i5 = i4 + 1;
        r4.f8826[i4].f8547.f10000 = r4.f8828.f8813.f8547;
        r4.f8826[i4].f8547.f10002 = (float) i2;
        r4.f8826[i4].f8547.f13030 = 1;
        r4.f8826[i5].f8547.f10000 = r4.f8826[i4].f8547;
        C2024 r6 = r4.f8826[i5].f8547;
        if (i == 0) {
            if (r4.f8850 != 8) {
                i3 = r4.f8827;
                r6.f10002 = (float) i3;
                r4.f8826[i5].f8547.f13030 = 1;
            }
        } else if (i == 1 && r4.f8850 != 8) {
            i3 = r4.f8836;
            r6.f10002 = (float) i3;
            r4.f8826[i5].f8547.f13030 = 1;
        }
        i3 = 0;
        r6.f10002 = (float) i3;
        r4.f8826[i5].f8547.f13030 = 1;
    }
}
