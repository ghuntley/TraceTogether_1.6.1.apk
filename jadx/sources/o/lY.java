package o;

import o.C3594mg;

public final class lY extends C3011 implements C0760 {

    /* renamed from: ı  reason: contains not printable characters */
    private C3122 f2873;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3216 f2874;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3057 f2875;

    public lY(C3122 r1, C3057 r2, C3216 r3) {
        this.f2873 = r1;
        this.f2875 = r2;
        this.f2874 = r3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3548(C0815 r5, Object obj) {
        if (obj == null) {
            r5.m6224();
            return;
        }
        C3594mg.If ifR = (C3594mg.If) obj;
        C3122 r0 = this.f2873;
        C3216 r1 = this.f2874;
        r5.m6234();
        if (ifR != ifR.f3225) {
            r1.m16163(r5, 2);
            C3594mg.C0252 r3 = ifR.f3225;
            C0954.m6859(r0, C3594mg.C0252.class, r3).m15435(r5, r3);
        }
        if (ifR != ifR.f3224) {
            r1.m16163(r5, 23);
            C3594mg.C0252 r32 = ifR.f3224;
            C0954.m6859(r0, C3594mg.C0252.class, r32).m15435(r5, r32);
        }
        if (ifR != ifR.f3228) {
            r1.m16163(r5, 18);
            C3594mg.C0252 r33 = ifR.f3228;
            C0954.m6859(r0, C3594mg.C0252.class, r33).m15435(r5, r33);
        }
        if (ifR != ifR.f3227) {
            r1.m16163(r5, 20);
            C3594mg.C0252 r34 = ifR.f3227;
            C0954.m6859(r0, C3594mg.C0252.class, r34).m15435(r5, r34);
        }
        if (ifR != ifR.f3226) {
            r1.m16163(r5, 4);
            C3594mg.C0252 r35 = ifR.f3226;
            C0954.m6859(r0, C3594mg.C0252.class, r35).m15435(r5, r35);
        }
        if (ifR != ifR.f3230) {
            r1.m16163(r5, 22);
            C3594mg.C0252 r36 = ifR.f3230;
            C0954.m6859(r0, C3594mg.C0252.class, r36).m15435(r5, r36);
        }
        if (ifR != ifR.f3231) {
            r1.m16163(r5, 13);
            C3594mg.C0252 r6 = ifR.f3231;
            C0954.m6859(r0, C3594mg.C0252.class, r6).m15435(r5, r6);
        }
        r5.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3547(C0995 r8) {
        boolean z;
        if (r8.m7095() == C0313.NULL) {
            r8.m7097();
            return null;
        }
        C3594mg.If ifR = new C3594mg.If();
        C3122 r1 = this.f2873;
        C3057 r3 = this.f2875;
        r8.m7096();
        while (r8.m7092()) {
            int r4 = r3.m15608(r8);
            do {
                z = r8.m7095() != C0313.NULL;
            } while (r4 == 5);
            if (r4 != 7) {
                if (r4 != 9) {
                    if (r4 != 11) {
                        if (r4 != 14) {
                            if (r4 != 19) {
                                if (r4 != 21) {
                                    if (r4 != 23) {
                                        r8.m7097();
                                    } else if (z) {
                                        ifR.f3231 = r1.m15830(C3101.get(C3594mg.C0252.class)).m15434(r8);
                                    } else {
                                        ifR.f3231 = null;
                                    }
                                } else if (z) {
                                    ifR.f3228 = r1.m15830(C3101.get(C3594mg.C0252.class)).m15434(r8);
                                } else {
                                    ifR.f3228 = null;
                                }
                            } else if (z) {
                                ifR.f3225 = r1.m15830(C3101.get(C3594mg.C0252.class)).m15434(r8);
                            } else {
                                ifR.f3225 = null;
                            }
                        } else if (z) {
                            ifR.f3227 = r1.m15830(C3101.get(C3594mg.C0252.class)).m15434(r8);
                        } else {
                            ifR.f3227 = null;
                        }
                    } else if (z) {
                        ifR.f3226 = r1.m15830(C3101.get(C3594mg.C0252.class)).m15434(r8);
                    } else {
                        ifR.f3226 = null;
                    }
                } else if (z) {
                    ifR.f3230 = r1.m15830(C3101.get(C3594mg.C0252.class)).m15434(r8);
                } else {
                    ifR.f3230 = null;
                }
            } else if (z) {
                ifR.f3224 = r1.m15830(C3101.get(C3594mg.C0252.class)).m15434(r8);
            } else {
                ifR.f3224 = null;
            }
            r8.m7105();
        }
        r8.m7103();
        return ifR;
    }
}
