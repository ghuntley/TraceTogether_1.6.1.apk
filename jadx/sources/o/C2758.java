package o;

import java.io.File;
import java.util.List;

/* renamed from: o.Ӏł  reason: contains not printable characters */
class C2758 implements C3296bg {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int f13079 = 1000;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int f13080 = 5;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int f13081 = 8;

    /* renamed from: ι  reason: contains not printable characters */
    private static final double f13082 = 0.1d;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0471 f13083;

    /* renamed from: І  reason: contains not printable characters */
    private final C0384 f13084;

    /* renamed from: ı  reason: contains not printable characters */
    public static C2758 m14600(C0471 r4) {
        return new C2758(r4, new C0384(new C3291bb(new C0377(new aU(), f13082), new aX())));
    }

    C2758(C0471 r1, C0384 r2) {
        this.f13083 = r1;
        this.f13084 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m14601(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.f13084.m4641(nanoTime)) {
            if (this.f13083.m4803(list)) {
                this.f13084.m4639();
                return true;
            }
            this.f13084.m4640(nanoTime);
        }
        return false;
    }
}
