package o;

import java.lang.reflect.Type;
import o.C2695;

/* renamed from: o.ȵ  reason: contains not printable characters */
public final class C0954 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static C3011 m6859(C3122 r3, Class cls, Object obj) {
        Class cls2;
        if (obj == null || (cls != Object.class && !(cls instanceof Class))) {
            cls2 = cls;
        } else {
            cls2 = obj.getClass();
        }
        C3011<?> r0 = r3.m15830(C3101.get((Type) cls2));
        if (cls != cls2) {
            boolean z = true;
            if (!(!(r0 instanceof C0760) && !(r0 instanceof C2695.If))) {
                C3011 r32 = r3.m15830(C3101.get(cls));
                if ((r32 instanceof C0760) || (r32 instanceof C2695.If)) {
                    z = false;
                }
                if (z) {
                    return r32;
                }
            }
        }
        return r0;
    }
}
