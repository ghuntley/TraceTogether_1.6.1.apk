package o;

import java.util.Date;
import java.util.concurrent.Callable;
import o.C0993;
import o.C2038;
import o.C3083;

public final class mQ implements Callable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C3018 f3131;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2832 f3132;

    public static final class IF implements C3149 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C2979 f3133;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C0993 f3134;

        /* renamed from: Ι  reason: contains not printable characters */
        private final C2173 f3135;

        /* renamed from: ι  reason: contains not printable characters */
        private final C3203 f3136;

        public IF(C0993 r1, C2979 r2, C3203 r3, C2173 r4) {
            this.f3134 = r1;
            this.f3133 = r2;
            this.f3136 = r3;
            this.f3135 = r4;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3775(C0329 r4) {
            C0993.m7037(this.f3134, this.f3133, this.f3136, this.f3135);
        }
    }

    /* renamed from: o.mQ$If  reason: case insensitive filesystem */
    public static final class C3585If implements C2979 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Date f3137;

        /* renamed from: ι  reason: contains not printable characters */
        private final C3083 f3138;

        public C3585If(C3083 r1, Date date) {
            this.f3138 = r1;
            this.f3137 = date;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m3776(C0329 r3) {
            return C3083.m15689(this.f3138, this.f3137, r3);
        }
    }

    public static final class aux implements C3153 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C2173 f3139;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C3184 f3140;

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3203 f3141;

        public aux(C3184 r1, C3203 r2, C2173 r3) {
            this.f3140 = r1;
            this.f3141 = r2;
            this.f3139 = r3;
        }

        public final void onSuccess(Object obj) {
            C0993.m7031(this.f3140, this.f3141, this.f3139, (C0993.C0994) obj);
        }
    }

    /* renamed from: o.mQ$if  reason: invalid class name */
    public static final class Cif implements Callable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C3136 f3142;

        public Cif(C3136 r1) {
            this.f3142 = r1;
        }

        public final Object call() {
            return this.f3142.m15891();
        }
    }

    /* renamed from: o.mQ$ı  reason: contains not printable characters */
    public static final class C0239 implements C3184 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C2832 f3143;

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3018 f3144;

        public C0239(C3018 r1, C2832 r2) {
            this.f3144 = r1;
            this.f3143 = r2;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0329 m3777(Object obj) {
            return C3018.m15459(this.f3144, this.f3143);
        }
    }

    /* renamed from: o.mQ$ǃ  reason: contains not printable characters */
    public static final class C0240 implements C2979 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C3083 f3145;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final long f3146;

        public C0240(C3083 r1, long j) {
            this.f3145 = r1;
            this.f3146 = j;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m3778(C0329 r4) {
            return C3083.m15688(this.f3145, this.f3146, r4);
        }
    }

    /* renamed from: o.mQ$ɩ  reason: contains not printable characters */
    public static final class C0241 implements C2979 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C3083 f3147;

        /* renamed from: ι  reason: contains not printable characters */
        private final Date f3148;

        public C0241(C3083 r1, Date date) {
            this.f3147 = r1;
            this.f3148 = date;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m3779(C0329 r3) {
            return C3083.m15687(this.f3147, this.f3148, r3);
        }
    }

    /* renamed from: o.mQ$Ι  reason: contains not printable characters */
    public static final class C0242 implements C3184 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3083.C3084 f3149;

        public C0242(C3083.C3084 r1) {
            this.f3149 = r1;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0329 m3780(Object obj) {
            return C3083.m15691(this.f3149);
        }
    }

    /* renamed from: o.mQ$ι  reason: contains not printable characters */
    public static final class C0243 implements C2038.Cif {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C0993 f3150;

        public C0243(C0993 r1) {
            this.f3150 = r1;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m3781(Object obj, Object obj2) {
            C0993.m7038(this.f3150, (C3153) obj, (C0993.C0994) obj2);
        }
    }

    public mQ(C3018 r1, C2832 r2) {
        this.f3131 = r1;
        this.f3132 = r2;
    }

    public final Object call() {
        return this.f3131.f13922.m15892(this.f3132);
    }
}
