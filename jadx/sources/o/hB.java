package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0002\u001a\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\"\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u00018A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0002\u001a\u00020\u0000*\u00020\u00018A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003"}, d2 = {"", "", "Ι", "(Ljava/lang/Object;)Ljava/lang/String;", "ı", "Lo/er;", "(Lo/er;)Ljava/lang/String;"}, k = 2, mv = {1, 1, 15})
public final class hB {
    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public static final String m2427(Object obj) {
        fM.m2254(obj, "");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        fM.m2252((Object) hexString, "");
        return hexString;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String m2429(C3390er<?> erVar) {
        Object obj;
        fM.m2254(erVar, "");
        if (erVar instanceof hE) {
            return erVar.toString();
        }
        try {
            C3369dx.C0158 r1 = C3369dx.f2060;
            obj = C3369dx.m2118(erVar + '@' + m2427(erVar));
        } catch (Throwable th) {
            C3369dx.C0158 r2 = C3369dx.f2060;
            obj = C3369dx.m2118(C3366du.m2110(th));
        }
        Throwable r22 = C3369dx.m2117(obj);
        String str = obj;
        if (r22 != null) {
            str = erVar.getClass().getName() + '@' + m2427(erVar);
        }
        return (String) str;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public static final String m2428(Object obj) {
        fM.m2254(obj, "");
        String simpleName = obj.getClass().getSimpleName();
        fM.m2252((Object) simpleName, "");
        return simpleName;
    }
}
