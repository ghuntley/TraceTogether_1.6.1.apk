package o;

import java.io.IOException;
import java.io.InputStream;
import o.C0712;
import o.C2669;
import o.C2702;

/* renamed from: o.յǀ  reason: contains not printable characters */
public final class C3139 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0452 f14315;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C0804 f14316 = new C0804();

    /* renamed from: ι  reason: contains not printable characters */
    private final String f14317;

    /* renamed from: o.յǀ$ǃ  reason: contains not printable characters */
    public static final class C3143 extends C2669<C3143, Cif> implements C0712.C0713 {

        /* renamed from: ɪ  reason: contains not printable characters */
        private static volatile C3022<C3143> f14342;
        /* access modifiers changed from: private */

        /* renamed from: І  reason: contains not printable characters */
        public static final C3143 f14343;

        /* renamed from: ı  reason: contains not printable characters */
        public Cif f14344;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private C2702.C2704<IF> f14345 = C3072.m15665();

        /* renamed from: ǃ  reason: contains not printable characters */
        private int f14346;

        /* renamed from: ɩ  reason: contains not printable characters */
        public Cif f14347;

        /* renamed from: ɹ  reason: contains not printable characters */
        private C3142 f14348;

        /* renamed from: ι  reason: contains not printable characters */
        public Cif f14349;

        private C3143() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15926(C2346 r4) {
            if ((this.f14346 & 1) == 1) {
                Cif ifVar = this.f14347;
                if (ifVar == null) {
                    ifVar = Cif.m15916();
                }
                r4.m12252(1, (C2993) ifVar);
            }
            if ((this.f14346 & 2) == 2) {
                Cif ifVar2 = this.f14344;
                if (ifVar2 == null) {
                    ifVar2 = Cif.m15916();
                }
                r4.m12252(2, (C2993) ifVar2);
            }
            if ((this.f14346 & 4) == 4) {
                Cif ifVar3 = this.f14349;
                if (ifVar3 == null) {
                    ifVar3 = Cif.m15916();
                }
                r4.m12252(3, (C2993) ifVar3);
            }
            if ((this.f14346 & 8) == 8) {
                C3142 r0 = this.f14348;
                if (r0 == null) {
                    r0 = C3142.m15920();
                }
                r4.m12252(4, (C2993) r0);
            }
            for (int i = 0; i < this.f14345.size(); i++) {
                r4.m12252(5, (C2993) this.f14345.get(i));
            }
            this.f12289.m15884(r4);
        }

        public final int I_() {
            int i;
            int i2 = this.f12290;
            if (i2 != -1) {
                return i2;
            }
            if ((this.f14346 & 1) == 1) {
                Cif ifVar = this.f14347;
                if (ifVar == null) {
                    ifVar = Cif.m15916();
                }
                i = C2346.m12240(1, (C2993) ifVar) + 0;
            } else {
                i = 0;
            }
            if ((this.f14346 & 2) == 2) {
                Cif ifVar2 = this.f14344;
                if (ifVar2 == null) {
                    ifVar2 = Cif.m15916();
                }
                i += C2346.m12240(2, (C2993) ifVar2);
            }
            if ((this.f14346 & 4) == 4) {
                Cif ifVar3 = this.f14349;
                if (ifVar3 == null) {
                    ifVar3 = Cif.m15916();
                }
                i += C2346.m12240(3, (C2993) ifVar3);
            }
            if ((this.f14346 & 8) == 8) {
                C3142 r1 = this.f14348;
                if (r1 == null) {
                    r1 = C3142.m15920();
                }
                i += C2346.m12240(4, (C2993) r1);
            }
            for (int i3 = 0; i3 < this.f14345.size(); i3++) {
                i += C2346.m12240(5, (C2993) this.f14345.get(i3));
            }
            int r0 = i + this.f12289.m15886();
            this.f12290 = r0;
            return r0;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static C3143 m15924(InputStream inputStream) {
            return (C3143) C2669.m14155(f14343, inputStream);
        }

        /* renamed from: o.յǀ$ǃ$if  reason: invalid class name */
        public static final class Cif extends C2669.C2672<C3143, Cif> implements C0712.C0713 {
            /* synthetic */ Cif(byte b) {
                this();
            }

            private Cif() {
                super(C3143.f14343);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m15927(C2669.C2673 r6, Object obj, Object obj2) {
            MessageType messagetype;
            MessageType messagetype2;
            MessageType messagetype3;
            MessageType messagetype4;
            boolean z = false;
            switch (AnonymousClass3.f14318[r6.ordinal()]) {
                case 1:
                    return new C3143();
                case 2:
                    return f14343;
                case 3:
                    this.f14345.m14400();
                    return null;
                case 4:
                    return new Cif((byte) 0);
                case 5:
                    C2669.IF ifR = (C2669.IF) obj;
                    C3143 r8 = (C3143) obj2;
                    this.f14347 = (Cif) ifR.m14173(this.f14347, r8.f14347);
                    this.f14344 = (Cif) ifR.m14173(this.f14344, r8.f14344);
                    this.f14349 = (Cif) ifR.m14173(this.f14349, r8.f14349);
                    this.f14348 = (C3142) ifR.m14173(this.f14348, r8.f14348);
                    this.f14345 = ifR.m14172(this.f14345, r8.f14345);
                    if (ifR == C2669.aux.f12293) {
                        this.f14346 |= r8.f14346;
                    }
                    return this;
                case 6:
                    C1841 r7 = (C1841) obj;
                    C2269 r82 = (C2269) obj2;
                    while (!z) {
                        try {
                            int r2 = r7.m10178();
                            if (r2 != 0) {
                                int i = 10;
                                if (r2 == 10) {
                                    Cif.C3141 r22 = (this.f14346 & 1) == 1 ? (Cif.C3141) this.f14347.m14161() : null;
                                    this.f14347 = (Cif) r7.m10183(Cif.m15914(), r82);
                                    if (r22 != null) {
                                        r22.m14207(this.f14347);
                                        if (r22.f12299) {
                                            messagetype = r22.f12300;
                                        } else {
                                            r22.f12300.m14165();
                                            r22.f12299 = true;
                                            messagetype = r22.f12300;
                                        }
                                        this.f14347 = (Cif) messagetype;
                                    }
                                    this.f14346 |= 1;
                                } else if (r2 == 18) {
                                    Cif.C3141 r23 = (this.f14346 & 2) == 2 ? (Cif.C3141) this.f14344.m14161() : null;
                                    this.f14344 = (Cif) r7.m10183(Cif.m15914(), r82);
                                    if (r23 != null) {
                                        r23.m14207(this.f14344);
                                        if (r23.f12299) {
                                            messagetype2 = r23.f12300;
                                        } else {
                                            r23.f12300.m14165();
                                            r23.f12299 = true;
                                            messagetype2 = r23.f12300;
                                        }
                                        this.f14344 = (Cif) messagetype2;
                                    }
                                    this.f14346 |= 2;
                                } else if (r2 == 26) {
                                    Cif.C3141 r24 = (this.f14346 & 4) == 4 ? (Cif.C3141) this.f14349.m14161() : null;
                                    this.f14349 = (Cif) r7.m10183(Cif.m15914(), r82);
                                    if (r24 != null) {
                                        r24.m14207(this.f14349);
                                        if (r24.f12299) {
                                            messagetype3 = r24.f12300;
                                        } else {
                                            r24.f12300.m14165();
                                            r24.f12299 = true;
                                            messagetype3 = r24.f12300;
                                        }
                                        this.f14349 = (Cif) messagetype3;
                                    }
                                    this.f14346 |= 4;
                                } else if (r2 == 34) {
                                    C3142.If ifR2 = (this.f14346 & 8) == 8 ? (C3142.If) this.f14348.m14161() : null;
                                    this.f14348 = (C3142) r7.m10183(C3142.m15919(), r82);
                                    if (ifR2 != null) {
                                        ifR2.m14207(this.f14348);
                                        if (ifR2.f12299) {
                                            messagetype4 = ifR2.f12300;
                                        } else {
                                            ifR2.f12300.m14165();
                                            ifR2.f12299 = true;
                                            messagetype4 = ifR2.f12300;
                                        }
                                        this.f14348 = (C3142) messagetype4;
                                    }
                                    this.f14346 |= 8;
                                } else if (r2 == 42) {
                                    if (!this.f14345.m14401()) {
                                        C2702.C2704<IF> r25 = this.f14345;
                                        int size = r25.size();
                                        if (size != 0) {
                                            i = size << 1;
                                        }
                                        this.f14345 = r25.m14399(i);
                                    }
                                    this.f14345.add((IF) r7.m10183(IF.K_(), r82));
                                } else if (!m14164(r2, r7)) {
                                }
                            }
                            z = true;
                        } catch (C2991 e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new C2991(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f14342 == null) {
                        synchronized (C3143.class) {
                            if (f14342 == null) {
                                f14342 = new C2669.C2671(f14343);
                            }
                        }
                    }
                    return f14342;
                default:
                    throw new UnsupportedOperationException();
            }
            return f14343;
        }

        static {
            C3143 r0 = new C3143();
            f14343 = r0;
            r0.m14165();
        }
    }

    /* renamed from: o.յǀ$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: ǃ  reason: contains not printable characters */
        static final /* synthetic */ int[] f14318 = new int[C2669.C2673.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                o.ҏ$Ι[] r0 = o.C2669.C2673.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14318 = r0
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ҏ$Ι r1 = o.C2669.C2673.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ҏ$Ι r1 = o.C2669.C2673.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ҏ$Ι r1 = o.C2669.C2673.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ҏ$Ι r1 = o.C2669.C2673.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.ҏ$Ι r1 = o.C2669.C2673.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x004b }
                o.ҏ$Ι r1 = o.C2669.C2673.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.ҏ$Ι r1 = o.C2669.C2673.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f14318     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.ҏ$Ι r1 = o.C2669.C2673.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3139.AnonymousClass3.<clinit>():void");
        }
    }

    /* renamed from: o.յǀ$ɩ  reason: contains not printable characters */
    public static final class C3144 extends C2669<C3144, C3145> implements C0712.C0713 {
        /* access modifiers changed from: private */

        /* renamed from: ı  reason: contains not printable characters */
        public static final C3144 f14350;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private static volatile C3022<C3144> f14351;

        /* renamed from: ǃ  reason: contains not printable characters */
        public String f14352 = "";

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f14353;

        /* renamed from: ι  reason: contains not printable characters */
        public C1767 f14354 = C1767.f9079;

        private C3144() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15930(C2346 r3) {
            if ((this.f14353 & 1) == 1) {
                r3.m12253(1, this.f14352);
            }
            if ((this.f14353 & 2) == 2) {
                r3.m12256(2, this.f14354);
            }
            this.f12289.m15884(r3);
        }

        public final int I_() {
            int i = this.f12290;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f14353 & 1) == 1) {
                i2 = 0 + C2346.m12233(1, this.f14352);
            }
            if ((this.f14353 & 2) == 2) {
                i2 += C2346.m12246(2, this.f14354);
            }
            int r2 = i2 + this.f12289.m15886();
            this.f12290 = r2;
            return r2;
        }

        /* renamed from: o.յǀ$ɩ$ɩ  reason: contains not printable characters */
        public static final class C3145 extends C2669.C2672<C3144, C3145> implements C0712.C0713 {
            /* synthetic */ C3145(byte b) {
                this();
            }

            private C3145() {
                super(C3144.f14350);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m15931(C2669.C2673 r7, Object obj, Object obj2) {
            boolean z = false;
            switch (AnonymousClass3.f14318[r7.ordinal()]) {
                case 1:
                    return new C3144();
                case 2:
                    return f14350;
                case 3:
                    return null;
                case 4:
                    return new C3145((byte) 0);
                case 5:
                    C2669.IF ifR = (C2669.IF) obj;
                    C3144 r9 = (C3144) obj2;
                    this.f14352 = ifR.m14174((this.f14353 & 1) == 1, this.f14352, (r9.f14353 & 1) == 1, r9.f14352);
                    boolean z2 = (this.f14353 & 2) == 2;
                    C1767 r3 = this.f14354;
                    if ((r9.f14353 & 2) == 2) {
                        z = true;
                    }
                    this.f14354 = ifR.m14176(z2, r3, z, r9.f14354);
                    if (ifR == C2669.aux.f12293) {
                        this.f14353 |= r9.f14353;
                    }
                    return this;
                case 6:
                    C1841 r8 = (C1841) obj;
                    while (!z) {
                        try {
                            int r72 = r8.m10178();
                            if (r72 != 0) {
                                if (r72 == 10) {
                                    String r73 = r8.m10185();
                                    this.f14353 |= 1;
                                    this.f14352 = r73;
                                } else if (r72 == 18) {
                                    this.f14353 |= 2;
                                    this.f14354 = r8.m10187();
                                } else if (!m14164(r72, r8)) {
                                }
                            }
                            z = true;
                        } catch (C2991 e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new C2991(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f14351 == null) {
                        synchronized (C3144.class) {
                            if (f14351 == null) {
                                f14351 = new C2669.C2671(f14350);
                            }
                        }
                    }
                    return f14351;
                default:
                    throw new UnsupportedOperationException();
            }
            return f14350;
        }

        static {
            C3144 r0 = new C3144();
            f14350 = r0;
            r0.m14165();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static C3022<C3144> m15929() {
            return f14350.m14168();
        }
    }

    public C3139(C0452 r2, String str) {
        this.f14315 = r2;
        this.f14317 = str;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0329<C0757> m15906(Object obj) {
        return this.f14315.m4772(this.f14317, obj, this.f14316);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C0757> m15905() {
        return this.f14315.m4772(this.f14317, (Object) null, this.f14316);
    }

    /* renamed from: o.յǀ$If  reason: case insensitive filesystem */
    public static final class C3664If extends C2669<C3664If, C3140> implements C0712.C0713 {

        /* renamed from: Ɩ  reason: contains not printable characters */
        private static volatile C3022<C3664If> f14325;
        /* access modifiers changed from: private */

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final C3664If f14326;

        /* renamed from: ı  reason: contains not printable characters */
        public String f14327 = "";

        /* renamed from: ǃ  reason: contains not printable characters */
        public C2702.C2704<C3144> f14328 = C3072.m15665();

        /* renamed from: ι  reason: contains not printable characters */
        private int f14329;

        private C3664If() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15912(C2346 r4) {
            if ((this.f14329 & 1) == 1) {
                r4.m12253(1, this.f14327);
            }
            for (int i = 0; i < this.f14328.size(); i++) {
                r4.m12252(2, (C2993) this.f14328.get(i));
            }
            this.f12289.m15884(r4);
        }

        public final int I_() {
            int i = this.f12290;
            if (i != -1) {
                return i;
            }
            int r0 = (this.f14329 & 1) == 1 ? C2346.m12233(1, this.f14327) + 0 : 0;
            for (int i2 = 0; i2 < this.f14328.size(); i2++) {
                r0 += C2346.m12240(2, (C2993) this.f14328.get(i2));
            }
            int r02 = r0 + this.f12289.m15886();
            this.f12290 = r02;
            return r02;
        }

        /* renamed from: o.յǀ$If$ǃ  reason: contains not printable characters */
        public static final class C3140 extends C2669.C2672<C3664If, C3140> implements C0712.C0713 {
            /* synthetic */ C3140(byte b) {
                this();
            }

            private C3140() {
                super(C3664If.f14326);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m15913(C2669.C2673 r5, Object obj, Object obj2) {
            boolean z = false;
            switch (AnonymousClass3.f14318[r5.ordinal()]) {
                case 1:
                    return new C3664If();
                case 2:
                    return f14326;
                case 3:
                    this.f14328.m14400();
                    return null;
                case 4:
                    return new C3140((byte) 0);
                case 5:
                    C2669.IF ifR = (C2669.IF) obj;
                    C3664If ifR2 = (C3664If) obj2;
                    boolean z2 = (this.f14329 & 1) == 1;
                    String str = this.f14327;
                    if ((ifR2.f14329 & 1) == 1) {
                        z = true;
                    }
                    this.f14327 = ifR.m14174(z2, str, z, ifR2.f14327);
                    this.f14328 = ifR.m14172(this.f14328, ifR2.f14328);
                    if (ifR == C2669.aux.f12293) {
                        this.f14329 |= ifR2.f14329;
                    }
                    return this;
                case 6:
                    C1841 r6 = (C1841) obj;
                    C2269 r7 = (C2269) obj2;
                    while (!z) {
                        try {
                            int r52 = r6.m10178();
                            if (r52 != 0) {
                                int i = 10;
                                if (r52 == 10) {
                                    String r53 = r6.m10185();
                                    this.f14329 |= 1;
                                    this.f14327 = r53;
                                } else if (r52 == 18) {
                                    if (!this.f14328.m14401()) {
                                        C2702.C2704<C3144> r54 = this.f14328;
                                        int size = r54.size();
                                        if (size != 0) {
                                            i = size << 1;
                                        }
                                        this.f14328 = r54.m14399(i);
                                    }
                                    this.f14328.add((C3144) r6.m10183(C3144.m15929(), r7));
                                } else if (!m14164(r52, r6)) {
                                }
                            }
                            z = true;
                        } catch (C2991 e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new C2991(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f14325 == null) {
                        synchronized (C3664If.class) {
                            if (f14325 == null) {
                                f14325 = new C2669.C2671(f14326);
                            }
                        }
                    }
                    return f14325;
                default:
                    throw new UnsupportedOperationException();
            }
            return f14326;
        }

        static {
            C3664If ifR = new C3664If();
            f14326 = ifR;
            ifR.m14165();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static C3022<C3664If> m15910() {
            return f14326.m14168();
        }
    }

    /* renamed from: o.յǀ$if  reason: invalid class name */
    public static final class Cif extends C2669<Cif, C3141> implements C0712.C0713 {

        /* renamed from: ɹ  reason: contains not printable characters */
        private static volatile C3022<Cif> f14330;
        /* access modifiers changed from: private */

        /* renamed from: І  reason: contains not printable characters */
        public static final Cif f14331;

        /* renamed from: ı  reason: contains not printable characters */
        private int f14332;

        /* renamed from: ǃ  reason: contains not printable characters */
        public long f14333;

        /* renamed from: ɩ  reason: contains not printable characters */
        public C2702.C2704<C3664If> f14334 = C3072.m15665();

        /* renamed from: ι  reason: contains not printable characters */
        public C2702.C2704<C1767> f14335 = C3072.m15665();

        private Cif() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15917(C2346 r5) {
            for (int i = 0; i < this.f14334.size(); i++) {
                r5.m12252(1, (C2993) this.f14334.get(i));
            }
            if ((this.f14332 & 1) == 1) {
                r5.m12261(2, this.f14333);
            }
            for (int i2 = 0; i2 < this.f14335.size(); i2++) {
                r5.m12256(3, (C1767) this.f14335.get(i2));
            }
            this.f12289.m15884(r5);
        }

        public final int I_() {
            int i = this.f12290;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f14334.size(); i3++) {
                i2 += C2346.m12240(1, (C2993) this.f14334.get(i3));
            }
            if ((this.f14332 & 1) == 1) {
                i2 += C2346.m12245(2);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f14335.size(); i5++) {
                i4 += C2346.m12235((C1767) this.f14335.get(i5));
            }
            int size = i2 + i4 + (this.f14335.size() * 1) + this.f12289.m15886();
            this.f12290 = size;
            return size;
        }

        /* renamed from: o.յǀ$if$ǃ  reason: contains not printable characters */
        public static final class C3141 extends C2669.C2672<Cif, C3141> implements C0712.C0713 {
            /* synthetic */ C3141(byte b) {
                this();
            }

            private C3141() {
                super(Cif.f14331);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m15918(C2669.C2673 r8, Object obj, Object obj2) {
            boolean z = false;
            switch (AnonymousClass3.f14318[r8.ordinal()]) {
                case 1:
                    return new Cif();
                case 2:
                    return f14331;
                case 3:
                    this.f14334.m14400();
                    this.f14335.m14400();
                    return null;
                case 4:
                    return new C3141((byte) 0);
                case 5:
                    C2669.IF ifR = (C2669.IF) obj;
                    Cif ifVar = (Cif) obj2;
                    this.f14334 = ifR.m14172(this.f14334, ifVar.f14334);
                    this.f14333 = ifR.m14171((this.f14332 & 1) == 1, this.f14333, (ifVar.f14332 & 1) == 1, ifVar.f14333);
                    this.f14335 = ifR.m14172(this.f14335, ifVar.f14335);
                    if (ifR == C2669.aux.f12293) {
                        this.f14332 |= ifVar.f14332;
                    }
                    return this;
                case 6:
                    C1841 r9 = (C1841) obj;
                    C2269 r10 = (C2269) obj2;
                    while (!z) {
                        try {
                            int r82 = r9.m10178();
                            if (r82 != 0) {
                                int i = 10;
                                if (r82 == 10) {
                                    if (!this.f14334.m14401()) {
                                        C2702.C2704<C3664If> r83 = this.f14334;
                                        int size = r83.size();
                                        if (size != 0) {
                                            i = size << 1;
                                        }
                                        this.f14334 = r83.m14399(i);
                                    }
                                    this.f14334.add((C3664If) r9.m10183(C3664If.m15910(), r10));
                                } else if (r82 == 17) {
                                    this.f14332 |= 1;
                                    this.f14333 = r9.m10180();
                                } else if (r82 == 26) {
                                    if (!this.f14335.m14401()) {
                                        C2702.C2704<C1767> r84 = this.f14335;
                                        int size2 = r84.size();
                                        if (size2 != 0) {
                                            i = size2 << 1;
                                        }
                                        this.f14335 = r84.m14399(i);
                                    }
                                    this.f14335.add(r9.m10187());
                                } else if (!m14164(r82, r9)) {
                                }
                            }
                            z = true;
                        } catch (C2991 e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new C2991(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f14330 == null) {
                        synchronized (Cif.class) {
                            if (f14330 == null) {
                                f14330 = new C2669.C2671(f14331);
                            }
                        }
                    }
                    return f14330;
                default:
                    throw new UnsupportedOperationException();
            }
            return f14331;
        }

        static {
            Cif ifVar = new Cif();
            f14331 = ifVar;
            ifVar.m14165();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static Cif m15916() {
            return f14331;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static C3022<Cif> m15914() {
            return f14331.m14168();
        }
    }

    /* renamed from: o.յǀ$ı  reason: contains not printable characters */
    public static final class C3142 extends C2669<C3142, If> implements C0712.C0713 {

        /* renamed from: Ɩ  reason: contains not printable characters */
        private static volatile C3022<C3142> f14336;
        /* access modifiers changed from: private */

        /* renamed from: І  reason: contains not printable characters */
        public static final C3142 f14337;

        /* renamed from: ı  reason: contains not printable characters */
        private int f14338;

        /* renamed from: ǃ  reason: contains not printable characters */
        private int f14339;

        /* renamed from: ɩ  reason: contains not printable characters */
        private long f14340;

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f14341;

        private C3142() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15922(C2346 r4) {
            if ((this.f14339 & 1) == 1) {
                r4.m12257(1, this.f14338);
            }
            if ((this.f14339 & 2) == 2) {
                r4.m12259(this.f14341);
            }
            if ((this.f14339 & 4) == 4) {
                r4.m12261(3, this.f14340);
            }
            this.f12289.m15884(r4);
        }

        public final int I_() {
            int i = this.f12290;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f14339 & 1) == 1) {
                i2 = 0 + C2346.m12232(this.f14338);
            }
            if ((this.f14339 & 2) == 2) {
                i2 += C2346.m12242();
            }
            if ((this.f14339 & 4) == 4) {
                i2 += C2346.m12245(3);
            }
            int r2 = i2 + this.f12289.m15886();
            this.f12290 = r2;
            return r2;
        }

        /* renamed from: o.յǀ$ı$If */
        public static final class If extends C2669.C2672<C3142, If> implements C0712.C0713 {
            /* synthetic */ If(byte b) {
                this();
            }

            private If() {
                super(C3142.f14337);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m15923(C2669.C2673 r9, Object obj, Object obj2) {
            switch (AnonymousClass3.f14318[r9.ordinal()]) {
                case 1:
                    return new C3142();
                case 2:
                    return f14337;
                case 3:
                    return null;
                case 4:
                    return new If((byte) 0);
                case 5:
                    C2669.IF ifR = (C2669.IF) obj;
                    C3142 r11 = (C3142) obj2;
                    this.f14338 = ifR.m14175((this.f14339 & 1) == 1, this.f14338, (r11.f14339 & 1) == 1, r11.f14338);
                    this.f14341 = ifR.m14178((this.f14339 & 2) == 2, this.f14341, (r11.f14339 & 2) == 2, r11.f14341);
                    this.f14340 = ifR.m14171((this.f14339 & 4) == 4, this.f14340, (r11.f14339 & 4) == 4, r11.f14340);
                    if (ifR == C2669.aux.f12293) {
                        this.f14339 |= r11.f14339;
                    }
                    return this;
                case 6:
                    C1841 r10 = (C1841) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int r112 = r10.m10178();
                            if (r112 != 0) {
                                if (r112 == 8) {
                                    this.f14339 |= 1;
                                    this.f14338 = r10.m10188();
                                } else if (r112 == 16) {
                                    this.f14339 |= 2;
                                    this.f14341 = r10.m10186() != 0;
                                } else if (r112 == 25) {
                                    this.f14339 |= 4;
                                    this.f14340 = r10.m10180();
                                } else if (!m14164(r112, r10)) {
                                }
                            }
                            z = true;
                        } catch (C2991 e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new C2991(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f14336 == null) {
                        synchronized (C3142.class) {
                            if (f14336 == null) {
                                f14336 = new C2669.C2671(f14337);
                            }
                        }
                    }
                    return f14336;
                default:
                    throw new UnsupportedOperationException();
            }
            return f14337;
        }

        static {
            C3142 r0 = new C3142();
            f14337 = r0;
            r0.m14165();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static C3142 m15920() {
            return f14337;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static C3022<C3142> m15919() {
            return f14337.m14168();
        }
    }

    /* renamed from: o.յǀ$IF */
    public static final class IF extends C2669<IF, Cif> implements C0712.C0713 {
        /* access modifiers changed from: private */

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final IF f14319;

        /* renamed from: ɹ  reason: contains not printable characters */
        private static volatile C3022<IF> f14320;

        /* renamed from: ı  reason: contains not printable characters */
        private long f14321;

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f14322 = "";

        /* renamed from: ɩ  reason: contains not printable characters */
        private int f14323;

        /* renamed from: ι  reason: contains not printable characters */
        private int f14324;

        private IF() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15908(C2346 r5) {
            if ((this.f14324 & 1) == 1) {
                r5.m12257(1, this.f14323);
            }
            if ((this.f14324 & 2) == 2) {
                r5.m12261(2, this.f14321);
            }
            if ((this.f14324 & 4) == 4) {
                r5.m12253(3, this.f14322);
            }
            this.f12289.m15884(r5);
        }

        public final int I_() {
            int i = this.f12290;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f14324 & 1) == 1) {
                i2 = 0 + C2346.m12232(this.f14323);
            }
            if ((this.f14324 & 2) == 2) {
                i2 += C2346.m12245(2);
            }
            if ((this.f14324 & 4) == 4) {
                i2 += C2346.m12233(3, this.f14322);
            }
            int r2 = i2 + this.f12289.m15886();
            this.f12290 = r2;
            return r2;
        }

        /* renamed from: o.յǀ$IF$if  reason: invalid class name */
        public static final class Cif extends C2669.C2672<IF, Cif> implements C0712.C0713 {
            /* synthetic */ Cif(byte b) {
                this();
            }

            private Cif() {
                super(IF.f14319);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m15909(C2669.C2673 r12, Object obj, Object obj2) {
            boolean z = false;
            switch (AnonymousClass3.f14318[r12.ordinal()]) {
                case 1:
                    return new IF();
                case 2:
                    return f14319;
                case 3:
                    return null;
                case 4:
                    return new Cif((byte) 0);
                case 5:
                    C2669.IF ifR = (C2669.IF) obj;
                    IF ifR2 = (IF) obj2;
                    this.f14323 = ifR.m14175((this.f14324 & 1) == 1, this.f14323, (ifR2.f14324 & 1) == 1, ifR2.f14323);
                    this.f14321 = ifR.m14171((this.f14324 & 2) == 2, this.f14321, (ifR2.f14324 & 2) == 2, ifR2.f14321);
                    boolean z2 = (this.f14324 & 4) == 4;
                    String str = this.f14322;
                    if ((ifR2.f14324 & 4) == 4) {
                        z = true;
                    }
                    this.f14322 = ifR.m14174(z2, str, z, ifR2.f14322);
                    if (ifR == C2669.aux.f12293) {
                        this.f14324 |= ifR2.f14324;
                    }
                    return this;
                case 6:
                    C1841 r13 = (C1841) obj;
                    while (!z) {
                        try {
                            int r122 = r13.m10178();
                            if (r122 != 0) {
                                if (r122 == 8) {
                                    this.f14324 |= 1;
                                    this.f14323 = r13.m10188();
                                } else if (r122 == 17) {
                                    this.f14324 |= 2;
                                    this.f14321 = r13.m10180();
                                } else if (r122 == 26) {
                                    String r123 = r13.m10185();
                                    this.f14324 |= 4;
                                    this.f14322 = r123;
                                } else if (!m14164(r122, r13)) {
                                }
                            }
                            z = true;
                        } catch (C2991 e) {
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            throw new RuntimeException(new C2991(e2.getMessage()));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f14320 == null) {
                        synchronized (IF.class) {
                            if (f14320 == null) {
                                f14320 = new C2669.C2671(f14319);
                            }
                        }
                    }
                    return f14320;
                default:
                    throw new UnsupportedOperationException();
            }
            return f14319;
        }

        static {
            IF ifR = new IF();
            f14319 = ifR;
            ifR.m14165();
        }

        public static C3022<IF> K_() {
            return f14319.m14168();
        }
    }
}
