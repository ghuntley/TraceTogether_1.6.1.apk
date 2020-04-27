package o;

import java.util.Map;
import o.C2887;

/* renamed from: o.ƒǀ  reason: contains not printable characters */
public final class C0627 {
    /* renamed from: ι  reason: contains not printable characters */
    public static C2552 m5339(String str) {
        Map map;
        try {
            map = C0602.m5311(str);
        } catch (C0544 unused) {
            map = C0959.m6871();
        }
        return new C2552(str, map);
    }

    static {
        new C2887.Cif("GetTokenResultFactory", new String[0]);
    }
}
