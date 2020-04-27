package o;

import android.os.Bundle;
import java.io.IOException;
import o.C0712;
import o.C2669;
import o.C2702;
import o.C2724;

public final class S implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final Bundle f1285;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C3203 f1286;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2400 f1287;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f1288;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f1289;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f1290;

    /* renamed from: o.S$ǃ  reason: contains not printable characters */
    public static final class C0101 extends C2669<C0101, C0102> implements C0712.C0713 {
        /* access modifiers changed from: private */

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final C0101 f1314;

        /* renamed from: ι  reason: contains not printable characters */
        private static volatile C3022<C0101> f1315;

        /* renamed from: ı  reason: contains not printable characters */
        private String f1316 = "";

        private C0101() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1420(C2346 r3) {
            if (!this.f1316.isEmpty()) {
                r3.m12253(1, this.f1316);
            }
        }

        public final int I_() {
            int i = this.f12290;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f1316.isEmpty()) {
                i2 = 0 + C2346.m12233(1, this.f1316);
            }
            this.f12290 = i2;
            return i2;
        }

        /* renamed from: o.S$ǃ$ǃ  reason: contains not printable characters */
        public static final class C0102 extends C2669.C2672<C0101, C0102> implements C0712.C0713 {
            /* synthetic */ C0102(byte b) {
                this();
            }

            private C0102() {
                super(C0101.f1314);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m1421(C2669.C2673 r4, Object obj, Object obj2) {
            boolean z = false;
            switch (AnonymousClass5.f1291[r4.ordinal()]) {
                case 1:
                    return new C0101();
                case 2:
                    return f1314;
                case 3:
                    return null;
                case 4:
                    return new C0102((byte) 0);
                case 5:
                    C0101 r6 = (C0101) obj2;
                    this.f1316 = ((C2669.IF) obj).m14174(!this.f1316.isEmpty(), this.f1316, true ^ r6.f1316.isEmpty(), r6.f1316);
                    C2669.aux aux = C2669.aux.f12293;
                    return this;
                case 6:
                    C1841 r5 = (C1841) obj;
                    while (!z) {
                        try {
                            int r42 = r5.m10178();
                            if (r42 != 0) {
                                if (r42 == 10) {
                                    this.f1316 = r5.m10182();
                                } else if (!r5.m10179(r42)) {
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
                    if (f1315 == null) {
                        synchronized (C0101.class) {
                            if (f1315 == null) {
                                f1315 = new C2669.C2671(f1314);
                            }
                        }
                    }
                    return f1315;
                default:
                    throw new UnsupportedOperationException();
            }
            return f1314;
        }

        static {
            C0101 r0 = new C0101();
            f1314 = r0;
            r0.m14165();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static C3022<C0101> m1419() {
            return f1314.m14168();
        }
    }

    /* renamed from: o.S$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f1291 = new int[C2669.C2673.values().length];

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
                f1291 = r0
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ҏ$Ι r1 = o.C2669.C2673.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ҏ$Ι r1 = o.C2669.C2673.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ҏ$Ι r1 = o.C2669.C2673.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ҏ$Ι r1 = o.C2669.C2673.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.ҏ$Ι r1 = o.C2669.C2673.VISIT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x004b }
                o.ҏ$Ι r1 = o.C2669.C2673.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.ҏ$Ι r1 = o.C2669.C2673.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f1291     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.ҏ$Ι r1 = o.C2669.C2673.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.S.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: o.S$ı  reason: contains not printable characters */
    public static final class C0099 extends C2669<C0099, C0100> implements C0712.C0713 {

        /* renamed from: ŀ  reason: contains not printable characters */
        private static volatile C3022<C0099> f1292;
        /* access modifiers changed from: private */

        /* renamed from: ł  reason: contains not printable characters */
        public static final C0099 f1293;

        /* renamed from: ı  reason: contains not printable characters */
        public String f1294 = "";

        /* renamed from: Ɩ  reason: contains not printable characters */
        private int f1295;

        /* renamed from: ǃ  reason: contains not printable characters */
        public String f1296 = "";

        /* renamed from: ȷ  reason: contains not printable characters */
        private String f1297 = "";

        /* renamed from: ɨ  reason: contains not printable characters */
        private String f1298 = "";

        /* renamed from: ɩ  reason: contains not printable characters */
        public String f1299 = "";

        /* renamed from: ɪ  reason: contains not printable characters */
        private String f1300 = "";

        /* renamed from: ɹ  reason: contains not printable characters */
        public long f1301;

        /* renamed from: ɾ  reason: contains not printable characters */
        private String f1302 = "";

        /* renamed from: ɿ  reason: contains not printable characters */
        private int f1303;

        /* renamed from: ʟ  reason: contains not printable characters */
        private C2702.C2704<C0101> f1304 = C3072.m15665();

        /* renamed from: ι  reason: contains not printable characters */
        public long f1305;

        /* renamed from: І  reason: contains not printable characters */
        public long f1306;

        /* renamed from: ӏ  reason: contains not printable characters */
        private String f1307 = "";

        private C0099() {
        }

        /* renamed from: o.S$ı$If */
        public enum If implements C2702.C2703 {
            POLICY_UNSPECIFIED(0),
            DISCARD_OLDEST(1),
            IGNORE_NEWEST(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: ǃ  reason: contains not printable characters */
            final int f1313;

            private If(int i) {
                this.f1313 = i;
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1416(C2346 r6) {
            if (!this.f1299.isEmpty()) {
                r6.m12253(1, this.f1299);
            }
            if (!this.f1296.isEmpty()) {
                r6.m12253(2, this.f1296);
            }
            long j = this.f1305;
            if (j != 0) {
                r6.m12251(3, j);
            }
            if (!this.f1294.isEmpty()) {
                r6.m12253(4, this.f1294);
            }
            long j2 = this.f1306;
            if (j2 != 0) {
                r6.m12251(5, j2);
            }
            long j3 = this.f1301;
            if (j3 != 0) {
                r6.m12251(6, j3);
            }
            if (!this.f1298.isEmpty()) {
                r6.m12253(7, this.f1298);
            }
            if (!this.f1300.isEmpty()) {
                r6.m12253(8, this.f1300);
            }
            if (!this.f1307.isEmpty()) {
                r6.m12253(9, this.f1307);
            }
            if (!this.f1302.isEmpty()) {
                r6.m12253(10, this.f1302);
            }
            if (!this.f1297.isEmpty()) {
                r6.m12253(11, this.f1297);
            }
            if (this.f1303 != If.POLICY_UNSPECIFIED.f1313) {
                r6.m12257(12, this.f1303);
            }
            for (int i = 0; i < this.f1304.size(); i++) {
                r6.m12252(13, (C2993) this.f1304.get(i));
            }
        }

        public final int I_() {
            int i = this.f12290;
            if (i != -1) {
                return i;
            }
            int r0 = !this.f1299.isEmpty() ? C2346.m12233(1, this.f1299) + 0 : 0;
            if (!this.f1296.isEmpty()) {
                r0 += C2346.m12233(2, this.f1296);
            }
            long j = this.f1305;
            if (j != 0) {
                r0 += C2346.m12239(3, j);
            }
            if (!this.f1294.isEmpty()) {
                r0 += C2346.m12233(4, this.f1294);
            }
            long j2 = this.f1306;
            if (j2 != 0) {
                r0 += C2346.m12239(5, j2);
            }
            long j3 = this.f1301;
            if (j3 != 0) {
                r0 += C2346.m12239(6, j3);
            }
            if (!this.f1298.isEmpty()) {
                r0 += C2346.m12233(7, this.f1298);
            }
            if (!this.f1300.isEmpty()) {
                r0 += C2346.m12233(8, this.f1300);
            }
            if (!this.f1307.isEmpty()) {
                r0 += C2346.m12233(9, this.f1307);
            }
            if (!this.f1302.isEmpty()) {
                r0 += C2346.m12233(10, this.f1302);
            }
            if (!this.f1297.isEmpty()) {
                r0 += C2346.m12233(11, this.f1297);
            }
            if (this.f1303 != If.POLICY_UNSPECIFIED.f1313) {
                r0 += C2346.m12243(this.f1303);
            }
            for (int i2 = 0; i2 < this.f1304.size(); i2++) {
                r0 += C2346.m12240(13, (C2993) this.f1304.get(i2));
            }
            this.f12290 = r0;
            return r0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static C0099 m1415(byte[] bArr) {
            return (C0099) C2669.m14157(f1293, bArr);
        }

        /* renamed from: o.S$ı$ǃ  reason: contains not printable characters */
        public static final class C0100 extends C2669.C2672<C0099, C0100> implements C0712.C0713 {
            /* synthetic */ C0100(byte b) {
                this();
            }

            private C0100() {
                super(C0099.f1293);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m1417(C2669.C2673 r12, Object obj, Object obj2) {
            boolean z = false;
            switch (AnonymousClass5.f1291[r12.ordinal()]) {
                case 1:
                    return new C0099();
                case 2:
                    return f1293;
                case 3:
                    this.f1304.m14400();
                    return null;
                case 4:
                    return new C0100((byte) 0);
                case 5:
                    C2669.IF ifR = (C2669.IF) obj;
                    C0099 r14 = (C0099) obj2;
                    this.f1299 = ifR.m14174(!this.f1299.isEmpty(), this.f1299, !r14.f1299.isEmpty(), r14.f1299);
                    this.f1296 = ifR.m14174(!this.f1296.isEmpty(), this.f1296, !r14.f1296.isEmpty(), r14.f1296);
                    this.f1305 = ifR.m14171(this.f1305 != 0, this.f1305, r14.f1305 != 0, r14.f1305);
                    this.f1294 = ifR.m14174(!this.f1294.isEmpty(), this.f1294, !r14.f1294.isEmpty(), r14.f1294);
                    this.f1306 = ifR.m14171(this.f1306 != 0, this.f1306, r14.f1306 != 0, r14.f1306);
                    this.f1301 = ifR.m14171(this.f1301 != 0, this.f1301, r14.f1301 != 0, r14.f1301);
                    this.f1298 = ifR.m14174(!this.f1298.isEmpty(), this.f1298, !r14.f1298.isEmpty(), r14.f1298);
                    this.f1300 = ifR.m14174(!this.f1300.isEmpty(), this.f1300, !r14.f1300.isEmpty(), r14.f1300);
                    this.f1307 = ifR.m14174(!this.f1307.isEmpty(), this.f1307, !r14.f1307.isEmpty(), r14.f1307);
                    this.f1302 = ifR.m14174(!this.f1302.isEmpty(), this.f1302, !r14.f1302.isEmpty(), r14.f1302);
                    this.f1297 = ifR.m14174(!this.f1297.isEmpty(), this.f1297, !r14.f1297.isEmpty(), r14.f1297);
                    boolean z2 = this.f1303 != 0;
                    int i = this.f1303;
                    if (r14.f1303 != 0) {
                        z = true;
                    }
                    this.f1303 = ifR.m14175(z2, i, z, r14.f1303);
                    this.f1304 = ifR.m14172(this.f1304, r14.f1304);
                    if (ifR == C2669.aux.f12293) {
                        this.f1295 |= r14.f1295;
                    }
                    return this;
                case 6:
                    C1841 r13 = (C1841) obj;
                    C2269 r142 = (C2269) obj2;
                    while (!z) {
                        try {
                            int r122 = r13.m10178();
                            switch (r122) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    this.f1299 = r13.m10182();
                                    break;
                                case 18:
                                    this.f1296 = r13.m10182();
                                    break;
                                case 24:
                                    this.f1305 = r13.m10186();
                                    break;
                                case 34:
                                    this.f1294 = r13.m10182();
                                    break;
                                case 40:
                                    this.f1306 = r13.m10186();
                                    break;
                                case 48:
                                    this.f1301 = r13.m10186();
                                    break;
                                case 58:
                                    this.f1298 = r13.m10182();
                                    break;
                                case C2724.C2725.f12724 /*66*/:
                                    this.f1300 = r13.m10182();
                                    break;
                                case C2724.C2725.f12633 /*74*/:
                                    this.f1307 = r13.m10182();
                                    break;
                                case 82:
                                    this.f1302 = r13.m10182();
                                    break;
                                case 90:
                                    this.f1297 = r13.m10182();
                                    break;
                                case 96:
                                    this.f1303 = r13.m10188();
                                    break;
                                case 106:
                                    if (!this.f1304.m14401()) {
                                        C2702.C2704<C0101> r123 = this.f1304;
                                        int size = r123.size();
                                        this.f1304 = r123.m14399(size == 0 ? 10 : size << 1);
                                    }
                                    this.f1304.add((C0101) r13.m10183(C0101.m1419(), r142));
                                    break;
                                default:
                                    if (r13.m10179(r122)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
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
                    if (f1292 == null) {
                        synchronized (C0099.class) {
                            if (f1292 == null) {
                                f1292 = new C2669.C2671(f1293);
                            }
                        }
                    }
                    return f1292;
                default:
                    throw new UnsupportedOperationException();
            }
            return f1293;
        }

        static {
            C0099 r0 = new C0099();
            f1293 = r0;
            r0.m14165();
        }
    }

    public S(C2400 r1, String str, String str2, String str3, Bundle bundle, C3203 r6) {
        this.f1287 = r1;
        this.f1289 = str;
        this.f1288 = str2;
        this.f1290 = str3;
        this.f1285 = bundle;
        this.f1286 = r6;
    }

    public final void run() {
        C2400 r0 = this.f1287;
        String str = this.f1289;
        String str2 = this.f1288;
        String str3 = this.f1290;
        Bundle bundle = this.f1285;
        C3203 r5 = this.f1286;
        try {
            r0.m12422(str, str2, str3, bundle);
            r5.f14555.m6079(r0.f10964.m10414(bundle));
        } catch (IOException e) {
            r5.f14555.m6073((Exception) e);
        }
    }
}
