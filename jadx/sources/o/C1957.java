package o;

import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C2178;
import o.C2201;
import o.C2622;

/* renamed from: o.ιƚ  reason: contains not printable characters */
public final class C1957 implements C2622.C2624 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final List f9846;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2291 f9847;

    /* renamed from: o.ιƚ$ı  reason: contains not printable characters */
    public static final class C1958 implements C2622.C2624 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Map f9848;

        public C1958(Map map) {
            this.f9848 = map;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Object m10683(Object obj) {
            Map map = this.f9848;
            Cursor cursor = (Cursor) obj;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                Set set = (Set) map.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    map.put(Long.valueOf(j), set);
                }
                set.add(new C2622.C2623(cursor.getString(1), cursor.getString(2), (byte) 0));
            }
            return null;
        }
    }

    public C1957(List list, C2291 r2) {
        this.f9846 = list;
        this.f9847 = r2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m10682(Object obj) {
        C1733 r6;
        List list = this.f9846;
        C2291 r1 = this.f9847;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            C2178.If ifR = new C2178.If();
            ifR.f10378 = new HashMap();
            C2201.C2202 r4 = ifR.m11626(cursor.getString(1)).m11619(cursor.getLong(2)).m11622(cursor.getLong(3));
            String string = cursor.getString(4);
            if (string == null) {
                r6 = C2622.f11958;
            } else {
                r6 = new C1733(string);
            }
            C2201.C2202 r42 = r4.m11624(new C2196(r6, cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                r42.m11623(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(new C2630(j, r1, r42.m11621()));
        }
        return null;
    }
}
