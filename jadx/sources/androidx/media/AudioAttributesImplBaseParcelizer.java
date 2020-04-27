package androidx.media;

import o.C0421;
import o.C2620;

public final class AudioAttributesImplBaseParcelizer {
    public static C0421 read(C2620 r3) {
        C0421 r0 = new C0421();
        r0.f4003 = r3.m13915(r0.f4003, 1);
        r0.f4004 = r3.m13915(r0.f4004, 2);
        r0.f4001 = r3.m13915(r0.f4001, 3);
        r0.f4002 = r3.m13915(r0.f4002, 4);
        return r0;
    }

    public static void write(C0421 r2, C2620 r3) {
        r3.m13924(r2.f4003, 1);
        r3.m13924(r2.f4004, 2);
        r3.m13924(r2.f4001, 3);
        r3.m13924(r2.f4002, 4);
    }
}
