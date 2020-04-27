package zendesk.core;

import java.lang.reflect.Type;
import o.C0995;
import o.C1367;
import o.C1701;
import o.C2663;
import o.C3109;
import o.C3122;
import o.F;
import o.P;

class GsonSerializer implements Serializer {
    private final C3122 gson;

    GsonSerializer(C3122 r1) {
        this.gson = r1;
    }

    public <E> E deserialize(Object obj, Class<E> cls) {
        E e;
        if (obj instanceof String) {
            String str = (String) obj;
            if (P.m1406(str)) {
                try {
                    return this.gson.m15829(str, cls);
                } catch (C1701 unused) {
                    new Object[1][0] = cls.getSimpleName();
                    F.m1359();
                }
            }
        } else if (obj instanceof C1367) {
            C1367 r6 = (C1367) obj;
            try {
                C3122 r0 = this.gson;
                if (r6 == null) {
                    e = null;
                } else {
                    e = r0.m15834((C0995) new C2663(r6), (Type) cls);
                }
                return C3109.m15768(cls).cast(e);
            } catch (C1701 e2) {
                Object[] objArr = {cls.getSimpleName(), e2};
                F.m1359();
            }
        } else {
            new Object[1][0] = cls.getSimpleName();
            F.m1359();
        }
        return null;
    }

    public String serialize(Object obj) {
        return this.gson.m15836(obj);
    }
}
