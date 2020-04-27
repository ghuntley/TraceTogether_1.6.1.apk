package o;

import o.C3594mg;

/* renamed from: o.mb  reason: case insensitive filesystem */
public final class C3589mb extends C3011 implements C0760 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3122 f3191;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3057 f3192;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3216 f3193;

    public C3589mb(C3122 r1, C3057 r2, C3216 r3) {
        this.f3191 = r1;
        this.f3192 = r2;
        this.f3193 = r3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3808(C0815 r5, Object obj) {
        if (obj == null) {
            r5.m6224();
            return;
        }
        C3594mg.C0252 r6 = (C3594mg.C0252) obj;
        C3122 r0 = this.f3191;
        C3216 r1 = this.f3193;
        r5.m6234();
        r1.m16163(r5, 11);
        r5.m6228(r6.f3234);
        r1.m16163(r5, 8);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(r6.f3232);
        C0954.m6859(r0, cls, valueOf).m15435(r5, valueOf);
        r5.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3807(C0995 r7) {
        boolean z;
        if (r7.m7095() == C0313.NULL) {
            r7.m7097();
            return null;
        }
        C3594mg.C0252 r0 = new C3594mg.C0252();
        C3122 r1 = this.f3191;
        C3057 r2 = this.f3192;
        r7.m7096();
        while (r7.m7092()) {
            int r3 = r2.m15608(r7);
            do {
                z = r7.m7095() != C0313.NULL;
            } while (r3 == 5);
            if (r3 != 8) {
                if (r3 != 20) {
                    r7.m7097();
                } else if (z) {
                    r0.f3234 = r1.m15830(C3101.get(Boolean.class)).m15434(r7).booleanValue();
                }
            } else if (z) {
                r0.f3232 = r1.m15830(C3101.get(Long.class)).m15434(r7).longValue();
            }
            r7.m7105();
        }
        r7.m7103();
        return r0;
    }
}
