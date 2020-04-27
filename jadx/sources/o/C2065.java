package o;

import java.util.ArrayList;
import o.C1625;
import o.C1696;

/* renamed from: o.ιі  reason: contains not printable characters */
public final class C2065 extends C1696 {

    /* renamed from: ı  reason: contains not printable characters */
    public int f10132 = -1;

    /* renamed from: ıɩ  reason: contains not printable characters */
    private int f10133;

    /* renamed from: ǃ  reason: contains not printable characters */
    public float f10134 = -1.0f;

    /* renamed from: ʃ  reason: contains not printable characters */
    public int f10135 = -1;

    /* renamed from: ͽ  reason: contains not printable characters */
    private C1625 f10136 = this.f8812;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m10988() {
        return true;
    }

    public C2065() {
        this.f10133 = 0;
        this.f8834.clear();
        this.f8834.add(this.f10136);
        int length = this.f8826.length;
        for (int i = 0; i < length; i++) {
            this.f8826[i] = this.f10136;
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m10989(int i) {
        if (this.f10133 != i) {
            this.f10133 = i;
            this.f8834.clear();
            if (this.f10133 == 1) {
                this.f10136 = this.f8813;
            } else {
                this.f10136 = this.f8812;
            }
            this.f8834.add(this.f10136);
            int length = this.f8826.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f8826[i2] = this.f10136;
            }
        }
    }

    /* renamed from: o.ιі$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ı  reason: contains not printable characters */
        static final /* synthetic */ int[] f10137 = new int[C1625.C1626.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                o.ʈ$ı[] r0 = o.C1625.C1626.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10137 = r0
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ʈ$ı r1 = o.C1625.C1626.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ʈ$ı r1 = o.C1625.C1626.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ʈ$ı r1 = o.C1625.C1626.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ʈ$ı r1 = o.C1625.C1626.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.ʈ$ı r1 = o.C1625.C1626.BASELINE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x004b }
                o.ʈ$ı r1 = o.C1625.C1626.CENTER     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.ʈ$ı r1 = o.C1625.C1626.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.ʈ$ı r1 = o.C1625.C1626.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10137     // Catch:{ NoSuchFieldError -> 0x006e }
                o.ʈ$ı r1 = o.C1625.C1626.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2065.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1625 m10986(C1625.C1626 r3) {
        switch (AnonymousClass5.f10137[r3.ordinal()]) {
            case 1:
            case 2:
                if (this.f10133 == 1) {
                    return this.f10136;
                }
                break;
            case 3:
            case 4:
                if (this.f10133 == 0) {
                    return this.f10136;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(r3.name());
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final ArrayList<C1625> m10990() {
        return this.f8834;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m10984(int i) {
        C1696 r7 = this.f8828;
        if (r7 != null) {
            if (this.f10133 == 1) {
                C2024 r0 = this.f8812.f8547;
                C2024 r5 = r7.f8812.f8547;
                r0.f10001 = 1;
                r0.f9996 = r5;
                r0.f9999 = 0.0f;
                r0.f9996.f13031.add(r0);
                C2024 r02 = this.f8840.f8547;
                C2024 r52 = r7.f8812.f8547;
                r02.f10001 = 1;
                r02.f9996 = r52;
                r02.f9999 = 0.0f;
                r02.f9996.f13031.add(r02);
                if (this.f10132 != -1) {
                    C2024 r03 = this.f8813.f8547;
                    C2024 r1 = r7.f8813.f8547;
                    int i2 = this.f10132;
                    r03.f10001 = 1;
                    r03.f9996 = r1;
                    r03.f9999 = (float) i2;
                    r03.f9996.f13031.add(r03);
                    C2024 r04 = this.f8816.f8547;
                    C2024 r72 = r7.f8813.f8547;
                    int i3 = this.f10132;
                    r04.f10001 = 1;
                    r04.f9996 = r72;
                    r04.f9999 = (float) i3;
                    r04.f9996.f13031.add(r04);
                } else if (this.f10135 != -1) {
                    C2024 r05 = this.f8813.f8547;
                    C2024 r12 = r7.f8816.f8547;
                    r05.f10001 = 1;
                    r05.f9996 = r12;
                    r05.f9999 = (float) (-this.f10135);
                    r05.f9996.f13031.add(r05);
                    C2024 r06 = this.f8816.f8547;
                    C2024 r73 = r7.f8816.f8547;
                    r06.f10001 = 1;
                    r06.f9996 = r73;
                    r06.f9999 = (float) (-this.f10135);
                    r06.f9996.f13031.add(r06);
                } else if (this.f10134 != -1.0f && r7.m9625() == C1696.C1697.FIXED) {
                    C2024 r13 = this.f8813.f8547;
                    C2024 r2 = r7.f8813.f8547;
                    r13.f10001 = 1;
                    r13.f9996 = r2;
                    float f = (float) ((int) (((float) r7.f8827) * this.f10134));
                    r13.f9999 = f;
                    r13.f9996.f13031.add(r13);
                    C2024 r14 = this.f8816.f8547;
                    C2024 r74 = r7.f8813.f8547;
                    r14.f10001 = 1;
                    r14.f9996 = r74;
                    r14.f9999 = f;
                    r14.f9996.f13031.add(r14);
                }
            } else {
                C2024 r07 = this.f8813.f8547;
                C2024 r53 = r7.f8813.f8547;
                r07.f10001 = 1;
                r07.f9996 = r53;
                r07.f9999 = 0.0f;
                r07.f9996.f13031.add(r07);
                C2024 r08 = this.f8816.f8547;
                C2024 r54 = r7.f8813.f8547;
                r08.f10001 = 1;
                r08.f9996 = r54;
                r08.f9999 = 0.0f;
                r08.f9996.f13031.add(r08);
                if (this.f10132 != -1) {
                    C2024 r09 = this.f8812.f8547;
                    C2024 r15 = r7.f8812.f8547;
                    int i4 = this.f10132;
                    r09.f10001 = 1;
                    r09.f9996 = r15;
                    r09.f9999 = (float) i4;
                    r09.f9996.f13031.add(r09);
                    C2024 r010 = this.f8840.f8547;
                    C2024 r75 = r7.f8812.f8547;
                    int i5 = this.f10132;
                    r010.f10001 = 1;
                    r010.f9996 = r75;
                    r010.f9999 = (float) i5;
                    r010.f9996.f13031.add(r010);
                } else if (this.f10135 != -1) {
                    C2024 r011 = this.f8812.f8547;
                    C2024 r16 = r7.f8840.f8547;
                    r011.f10001 = 1;
                    r011.f9996 = r16;
                    r011.f9999 = (float) (-this.f10135);
                    r011.f9996.f13031.add(r011);
                    C2024 r012 = this.f8840.f8547;
                    C2024 r76 = r7.f8840.f8547;
                    r012.f10001 = 1;
                    r012.f9996 = r76;
                    r012.f9999 = (float) (-this.f10135);
                    r012.f9996.f13031.add(r012);
                } else if (this.f10134 != -1.0f && r7.m9643() == C1696.C1697.FIXED) {
                    C2024 r17 = this.f8812.f8547;
                    C2024 r22 = r7.f8812.f8547;
                    r17.f10001 = 1;
                    r17.f9996 = r22;
                    float f2 = (float) ((int) (((float) r7.f8836) * this.f10134));
                    r17.f9999 = f2;
                    r17.f9996.f13031.add(r17);
                    C2024 r18 = this.f8840.f8547;
                    C2024 r77 = r7.f8812.f8547;
                    r18.f10001 = 1;
                    r18.f9996 = r77;
                    r18.f9999 = f2;
                    r18.f9996.f13031.add(r18);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10987(C1461 r9) {
        C1821 r0 = (C1821) this.f8828;
        if (r0 != null) {
            C1625 r1 = r0.m9629(C1625.C1626.LEFT);
            C1625 r2 = r0.m9629(C1625.C1626.RIGHT);
            boolean z = this.f8828 != null && this.f8828.f8818[0] == C1696.C1697.WRAP_CONTENT;
            if (this.f10133 == 0) {
                r1 = r0.m9629(C1625.C1626.TOP);
                r2 = r0.m9629(C1625.C1626.BOTTOM);
                z = this.f8828 != null && this.f8828.f8818[1] == C1696.C1697.WRAP_CONTENT;
            }
            if (this.f10132 != -1) {
                C1294 r02 = r9.m8743((Object) this.f10136);
                r9.m8746(r02, r9.m8743((Object) r1), this.f10132, 6);
                if (z) {
                    r9.m8754(r9.m8743((Object) r2), r02, 0, 5);
                }
            } else if (this.f10135 != -1) {
                C1294 r03 = r9.m8743((Object) this.f10136);
                C1294 r22 = r9.m8743((Object) r2);
                r9.m8746(r03, r22, -this.f10135, 6);
                if (z) {
                    r9.m8754(r03, r9.m8743((Object) r1), 0, 5);
                    r9.m8754(r22, r03, 0, 5);
                }
            } else if (this.f10134 != -1.0f) {
                r9.m8751(C1461.m8735(r9, r9.m8743((Object) this.f10136), r9.m8743((Object) r1), r9.m8743((Object) r2), this.f10134));
            }
        }
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final void m10985() {
        int i;
        int i2;
        if (this.f8828 != null) {
            int r0 = C1461.m8734((Object) this.f10136);
            if (this.f10133 == 1) {
                m9636(r0);
                m9631(0);
                C1696 r02 = this.f8828;
                if (r02.f8850 == 8) {
                    i2 = 0;
                } else {
                    i2 = r02.f8836;
                }
                m9651(i2);
                m9645(0);
                return;
            }
            m9636(0);
            m9631(r0);
            C1696 r03 = this.f8828;
            if (r03.f8850 == 8) {
                i = 0;
            } else {
                i = r03.f8827;
            }
            m9645(i);
            m9651(0);
        }
    }
}
