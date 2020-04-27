package o;

/* renamed from: o.ʈ  reason: contains not printable characters */
public final class C1625 {

    /* renamed from: ı  reason: contains not printable characters */
    public int f8544 = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    Cif f8545 = Cif.NONE;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C1696 f8546;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2024 f8547 = new C2024(this);

    /* renamed from: Ι  reason: contains not printable characters */
    final C1626 f8548;

    /* renamed from: ι  reason: contains not printable characters */
    public C1625 f8549;

    /* renamed from: І  reason: contains not printable characters */
    public C1294 f8550;

    /* renamed from: і  reason: contains not printable characters */
    int f8551;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f8552 = -1;

    /* renamed from: o.ʈ$If */
    public enum If {
        RELAXED,
        STRICT
    }

    /* renamed from: o.ʈ$if  reason: invalid class name */
    public enum Cif {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: o.ʈ$ı  reason: contains not printable characters */
    public enum C1626 {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C1625(C1696 r3, C1626 r4) {
        If ifR = If.RELAXED;
        this.f8551 = 0;
        this.f8546 = r3;
        this.f8548 = r4;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m9386() {
        C1625 r0;
        if (this.f8546.f8850 == 8) {
            return 0;
        }
        if (this.f8552 < 0 || (r0 = this.f8549) == null || r0.f8546.f8850 != 8) {
            return this.f8544;
        }
        return this.f8552;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9387() {
        this.f8549 = null;
        this.f8544 = 0;
        this.f8552 = -1;
        this.f8545 = Cif.STRONG;
        this.f8551 = 0;
        If ifR = If.RELAXED;
        this.f8547.m14553();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r4.f8546.f8835 > 0) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        if (r10 != o.C1625.C1626.f8562) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0086, code lost:
        if (r10 != o.C1625.C1626.f8568) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0093, code lost:
        if (r10 != o.C1625.C1626.f8562) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0098 A[RETURN] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m9388(o.C1625 r5, int r6, int r7, o.C1625.Cif r8, int r9, boolean r10) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0014
            r5 = 0
            r4.f8549 = r5
            r4.f8544 = r1
            r5 = -1
            r4.f8552 = r5
            o.ʈ$if r5 = o.C1625.Cif.NONE
            r4.f8545 = r5
            r5 = 2
            r4.f8551 = r5
            return r0
        L_0x0014:
            if (r10 != 0) goto L_0x0099
            o.ʈ$ı r10 = r5.f8548
            o.ʈ$ı r2 = r4.f8548
            if (r10 != r2) goto L_0x003a
            o.ʈ$ı r10 = o.C1625.C1626.BASELINE
            if (r2 != r10) goto L_0x0037
            o.ʢ r10 = r5.f8546
            int r10 = r10.f8835
            if (r10 <= 0) goto L_0x0028
            r10 = 1
            goto L_0x0029
        L_0x0028:
            r10 = 0
        L_0x0029:
            if (r10 == 0) goto L_0x0053
            o.ʢ r10 = r4.f8546
            int r10 = r10.f8835
            if (r10 <= 0) goto L_0x0033
            r10 = 1
            goto L_0x0034
        L_0x0033:
            r10 = 0
        L_0x0034:
            if (r10 != 0) goto L_0x0037
            goto L_0x0053
        L_0x0037:
            r10 = 1
            goto L_0x0096
        L_0x003a:
            int[] r2 = o.C1625.AnonymousClass2.f8553
            o.ʈ$ı r3 = r4.f8548
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L_0x0089;
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                case 4: goto L_0x0055;
                case 5: goto L_0x0055;
                case 6: goto L_0x0053;
                case 7: goto L_0x0053;
                case 8: goto L_0x0053;
                case 9: goto L_0x0053;
                default: goto L_0x0047;
            }
        L_0x0047:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            o.ʈ$ı r6 = r4.f8548
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L_0x0053:
            r10 = 0
            goto L_0x0096
        L_0x0055:
            o.ʈ$ı r2 = o.C1625.C1626.TOP
            if (r10 == r2) goto L_0x0060
            o.ʈ$ı r2 = o.C1625.C1626.BOTTOM
            if (r10 != r2) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = 1
        L_0x0061:
            o.ʢ r3 = r5.f8546
            boolean r3 = r3 instanceof o.C2065
            if (r3 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0037
            o.ʈ$ı r2 = o.C1625.C1626.CENTER_Y
            if (r10 != r2) goto L_0x0053
            goto L_0x0037
        L_0x006e:
            r10 = r2
            goto L_0x0096
        L_0x0070:
            o.ʈ$ı r2 = o.C1625.C1626.LEFT
            if (r10 == r2) goto L_0x007b
            o.ʈ$ı r2 = o.C1625.C1626.RIGHT
            if (r10 != r2) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = 1
        L_0x007c:
            o.ʢ r3 = r5.f8546
            boolean r3 = r3 instanceof o.C2065
            if (r3 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0037
            o.ʈ$ı r2 = o.C1625.C1626.CENTER_X
            if (r10 != r2) goto L_0x0053
            goto L_0x0037
        L_0x0089:
            o.ʈ$ı r2 = o.C1625.C1626.BASELINE
            if (r10 == r2) goto L_0x0053
            o.ʈ$ı r2 = o.C1625.C1626.CENTER_X
            if (r10 == r2) goto L_0x0053
            o.ʈ$ı r2 = o.C1625.C1626.CENTER_Y
            if (r10 == r2) goto L_0x0053
            goto L_0x0037
        L_0x0096:
            if (r10 != 0) goto L_0x0099
            return r1
        L_0x0099:
            r4.f8549 = r5
            if (r6 <= 0) goto L_0x00a0
            r4.f8544 = r6
            goto L_0x00a2
        L_0x00a0:
            r4.f8544 = r1
        L_0x00a2:
            r4.f8552 = r7
            r4.f8545 = r8
            r4.f8551 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1625.m9388(o.ʈ, int, int, o.ʈ$if, int, boolean):boolean");
    }

    /* renamed from: o.ʈ$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: ǃ  reason: contains not printable characters */
        static final /* synthetic */ int[] f8553 = new int[C1626.values().length];

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
                f8553 = r0
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ʈ$ı r1 = o.C1625.C1626.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ʈ$ı r1 = o.C1625.C1626.LEFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ʈ$ı r1 = o.C1625.C1626.RIGHT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ʈ$ı r1 = o.C1625.C1626.TOP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x0040 }
                o.ʈ$ı r1 = o.C1625.C1626.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x004b }
                o.ʈ$ı r1 = o.C1625.C1626.BASELINE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x0056 }
                o.ʈ$ı r1 = o.C1625.C1626.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.ʈ$ı r1 = o.C1625.C1626.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f8553     // Catch:{ NoSuchFieldError -> 0x006e }
                o.ʈ$ı r1 = o.C1625.C1626.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1625.AnonymousClass2.<clinit>():void");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8546.f8858);
        sb.append(":");
        sb.append(this.f8548.toString());
        return sb.toString();
    }
}
