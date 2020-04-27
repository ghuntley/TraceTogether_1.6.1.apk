package o;

import o.C1390;

/* renamed from: o.ǀі  reason: contains not printable characters */
class C0870 implements C1045 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1167 f5647;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1112 f5648;

    public C0870(C1112 r1, C1167 r2) {
        this.f5648 = r1;
        this.f5647 = r2;
    }

    /* renamed from: o.ǀі$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: Ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f5649 = new int[C1390.If.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                o.ɪг$If[] r0 = o.C1390.If.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5649 = r0
                int[] r0 = f5649     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ɪг$If r1 = o.C1390.If.JAVA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5649     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ɪг$If r1 = o.C1390.If.NATIVE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0870.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m6446(C1034 r4) {
        int i = AnonymousClass2.f5649[r4.f6285.m8553().ordinal()];
        if (i == 1) {
            this.f5648.m7515(r4);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f5647.m7666(r4);
            return true;
        }
    }
}
