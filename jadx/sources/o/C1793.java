package o;

import o.C1228;
import o.C2383;

/* renamed from: o.Ιſ  reason: contains not printable characters */
public final class C1793 implements C2218<C1228> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C1793 f9201 = new C1793();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f9202 = C2383.C2385.m12397("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C1793() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m9956(C2383 r18, float f) {
        C1228.Cif ifVar = C1228.Cif.CENTER;
        r18.m12391();
        C1228.Cif ifVar2 = ifVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (r18.m12383()) {
            switch (r18.m12385(f9202)) {
                case 0:
                    str = r18.m12384();
                    break;
                case 1:
                    str2 = r18.m12384();
                    break;
                case 2:
                    f2 = (float) r18.m12387();
                    break;
                case 3:
                    int r0 = r18.m12389();
                    if (r0 <= C1228.Cif.CENTER.ordinal() && r0 >= 0) {
                        ifVar2 = C1228.Cif.values()[r0];
                        break;
                    } else {
                        ifVar2 = C1228.Cif.CENTER;
                        break;
                    }
                case 4:
                    i = r18.m12389();
                    break;
                case 5:
                    f3 = (float) r18.m12387();
                    break;
                case 6:
                    f4 = (float) r18.m12387();
                    break;
                case 7:
                    i2 = C2041.m10925(r18);
                    break;
                case 8:
                    i3 = C2041.m10925(r18);
                    break;
                case 9:
                    f5 = (float) r18.m12387();
                    break;
                case 10:
                    z = r18.m12394();
                    break;
                default:
                    r18.m12393();
                    r18.m12396();
                    break;
            }
        }
        C2383 r1 = r18;
        r18.m12392();
        return new C1228(str, str2, f2, ifVar2, i, f3, f4, i2, i3, f5, z);
    }
}
