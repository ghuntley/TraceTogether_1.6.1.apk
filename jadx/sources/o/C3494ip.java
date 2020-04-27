package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u001a/\u0010\u0002\u001a\u00020\u0007\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0002\u0010\n\u001a/\u0010\u0004\u001a\u00020\u0007\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\f\"\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u00018A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "ı", "(I)Z", "ɩ", "p0", "p1", "", "Lo/er;", "T", "(Lo/er;Ljava/lang/Object;I)V", "", "(Lo/er;Ljava/lang/Throwable;I)V"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.ip  reason: case insensitive filesystem */
public final class C3494ip {
    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public static final boolean m2792(int i) {
        return i == 1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> void m2791(C3390er<? super T> erVar, T t, int i) {
        fM.m2254(erVar, "");
        if (i == 0) {
            C3390er<? super T> r2 = eF.m2124(erVar);
            C3369dx.C0158 r4 = C3369dx.f2060;
            r2.m2214(C3369dx.m2118(t));
        } else if (i == 1) {
            hG.m2446(eF.m2124(erVar), t);
        } else if (i == 2) {
            C3369dx.C0158 r42 = C3369dx.f2060;
            erVar.m2214(C3369dx.m2118(t));
        } else if (i == 3) {
            C3396ex r43 = erVar.m2213();
            Object r0 = C3513jh.m3079(r43, (Object) null);
            try {
                C3369dx.C0158 r1 = C3369dx.f2060;
                erVar.m2214(C3369dx.m2118(t));
                dF dFVar = dF.f2032;
            } finally {
                C3513jh.m3081(r43, r0);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T> void m2793(C3390er<? super T> erVar, Throwable th, int i) {
        fM.m2254(erVar, "");
        fM.m2254(th, "");
        if (i == 0) {
            C3390er<? super T> r2 = eF.m2124(erVar);
            C3369dx.C0158 r4 = C3369dx.f2060;
            r2.m2214(C3369dx.m2118(C3366du.m2110(th)));
        } else if (i == 1) {
            hG.m2447(eF.m2124(erVar), th);
        } else if (i == 2) {
            C3369dx.C0158 r42 = C3369dx.f2060;
            erVar.m2214(C3369dx.m2118(C3366du.m2110(th)));
        } else if (i == 3) {
            C3396ex r43 = erVar.m2213();
            Object r0 = C3513jh.m3079(r43, (Object) null);
            try {
                C3369dx.C0158 r1 = C3369dx.f2060;
                erVar.m2214(C3369dx.m2118(C3366du.m2110(th)));
                dF dFVar = dF.f2032;
            } finally {
                C3513jh.m3081(r43, r0);
            }
        } else if (i != 4) {
            throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }
}
