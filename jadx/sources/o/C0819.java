package o;

import o.C2314;
import o.C2691;

/* renamed from: o.ƾ  reason: contains not printable characters */
public final class C0819 implements C2691.C2692 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2498 f5339;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2314 f5340;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2291 f5341;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f5342;

    /* renamed from: ι  reason: contains not printable characters */
    private final Iterable f5343;

    /* renamed from: o.ƾ$ǃ  reason: contains not printable characters */
    public static final class C0820 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f5345 = 3;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f5346 = 4;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f5347 = 2;

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final int f5348 = 11;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int[] f5349 = {16842948, 16842987, 16842993, R.attr.f151442130968933, R.attr.f151452130968934, R.attr.f151462130968935, R.attr.f151472130968936, R.attr.f151482130968937, R.attr.f152342130969028, R.attr.f154012130969214, R.attr.f154282130969245, R.attr.f154332130969251};

        /* renamed from: ɪ  reason: contains not printable characters */
        public static final int f5350 = 9;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f5351 = 5;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f5352 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f5353 = 1;

        /* renamed from: І  reason: contains not printable characters */
        public static final int f5354 = 8;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f5355 = 7;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f5356 = 6;

        /* renamed from: ӏ  reason: contains not printable characters */
        public static final int f5357 = 10;
    }

    /* renamed from: o.ƾ$If */
    public static final class If implements C2691.C2692 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C2602 f5344;

        public If(C2602 r1) {
            this.f5344 = r1;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Object m6239() {
            return Integer.valueOf(this.f5344.m13791());
        }
    }

    /* renamed from: o.ƾ$ɩ  reason: contains not printable characters */
    public static final class C0821 implements C2691.C2692 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C2498 f5358;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f5359;

        /* renamed from: ι  reason: contains not printable characters */
        private final C2291 f5360;

        public C0821(C2498 r1, C2291 r2, int i) {
            this.f5358 = r1;
            this.f5360 = r2;
            this.f5359 = i;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Object m6240() {
            C2498 r0 = this.f5358;
            r0.f11310.m13832(this.f5360, this.f5359 + 1);
            return null;
        }
    }

    public C0819(C2498 r1, C2314 r2, Iterable iterable, C2291 r4, int i) {
        this.f5339 = r1;
        this.f5340 = r2;
        this.f5343 = iterable;
        this.f5341 = r4;
        this.f5342 = i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m6238() {
        C2498 r0 = this.f5339;
        C2314 r1 = this.f5340;
        Iterable iterable = this.f5343;
        C2291 r3 = this.f5341;
        int i = this.f5342;
        if (r1.m12064() == C2314.If.TRANSIENT_ERROR) {
            r0.f11308.m13793((Iterable<C2630>) iterable);
            r0.f11310.m13832(r3, i + 1);
            return null;
        }
        r0.f11308.m13795((Iterable<C2630>) iterable);
        if (r1.m12064() == C2314.If.OK) {
            r0.f11308.m13799(r3, r0.f11314.m14297() + r1.m12063());
        }
        if (!r0.f11308.m13796(r3)) {
            return null;
        }
        r0.f11310.m13832(r3, 1);
        return null;
    }
}
