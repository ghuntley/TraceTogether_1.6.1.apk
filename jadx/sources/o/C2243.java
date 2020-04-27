package o;

import android.content.Context;
import java.util.HashMap;
import o.C0712;
import o.C2178;
import o.C2188;
import o.C2201;

@C3356di
/* renamed from: o.Іɔ  reason: contains not printable characters */
public class C2243 implements C2258 {

    /* renamed from: ı  reason: contains not printable characters */
    public static volatile C2302 f10531;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2498 f10532;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2693 f10533;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2468 f10534;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2693 f10535;

    @C3350db
    C2243(C2693 r1, C2693 r2, C2468 r3, C2498 r4, C2499 r5) {
        this.f10535 = r1;
        this.f10533 = r2;
        this.f10534 = r3;
        this.f10532 = r4;
        r5.f11315.execute(new C1100(r5));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m11696(Context context) {
        if (f10531 == null) {
            synchronized (C2243.class) {
                if (f10531 == null) {
                    f10531 = new C2188.C2189((byte) 0).m11990(context).m11991();
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11697(C2246 r7, C0712.C0713 r8) {
        C2468 r82 = this.f10534;
        C2291 r0 = r7.m11729();
        C2291 r02 = C2291.m11958().m11963(r0.m11959()).m11964(r7.m11726().m9812()).m11965(r0.m11960()).m11962();
        C2178.If ifR = new C2178.If();
        ifR.f10378 = new HashMap();
        C2201.C2202 r1 = ifR.m11619(this.f10535.m14297()).m11622(this.f10533.m14297()).m11626(r7.m11728()).m11624(new C2196(r7.m11727(), r7.m11730().m9819(r7.m11726().m9813())));
        r7.m11726();
        r82.m12721(r02, r1.m11623((Integer) null).m11621());
    }
}
