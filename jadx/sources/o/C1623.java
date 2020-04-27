package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ʇӀ  reason: contains not printable characters */
final class C1623 implements C1532 {
    C1623() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Map<?, ?> m9379(Object obj) {
        return (C1622) obj;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C1528<?, ?> m9375(Object obj) {
        C1620 r1 = (C1620) obj;
        throw new NoSuchMethodError();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Map<?, ?> m9378(Object obj) {
        return (C1622) obj;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9380(Object obj) {
        return !((C1622) obj).m9370();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m9373(Object obj) {
        ((C1622) obj).m9372();
        return obj;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m9376(Object obj) {
        return C1622.m9368().m9371();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m9374(Object obj, Object obj2) {
        C1622 r2 = (C1622) obj;
        C1622 r3 = (C1622) obj2;
        if (!r3.isEmpty()) {
            if (!r2.m9370()) {
                r2 = r2.m9371();
            }
            r2.m9369(r3);
        }
        return r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m9377(int i, Object obj, Object obj2) {
        C1622 r2 = (C1622) obj;
        C1620 r3 = (C1620) obj2;
        if (r2.isEmpty()) {
            return 0;
        }
        Iterator it = r2.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
