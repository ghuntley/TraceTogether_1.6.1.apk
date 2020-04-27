package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import o.C1540;
import o.C1957;
import o.C2201;
import o.C2691;
import o.C2745;

@C3356di
/* renamed from: o.јΙ  reason: contains not printable characters */
public final class C2622 implements C2602, C2691 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C1733 f11958 = new C1733("proto");

    /* renamed from: ı  reason: contains not printable characters */
    private final C2693 f11959;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2599 f11960;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2683 f11961;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2693 f11962;

    /* renamed from: o.јΙ$if  reason: invalid class name */
    public interface Cif<T> {
        /* renamed from: ı  reason: contains not printable characters */
        T m13948();
    }

    /* renamed from: o.јΙ$ǃ  reason: contains not printable characters */
    public interface C2624<T, U> {
        /* renamed from: ı  reason: contains not printable characters */
        U m13949(T t);
    }

    @C3350db
    C2622(C2693 r1, C2693 r2, C2599 r3, C2683 r4) {
        this.f11961 = r4;
        this.f11959 = r1;
        this.f11962 = r2;
        this.f11960 = r3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2630 m13946(C2291 r6, C2201 r7) {
        Object[] objArr = {r6.m11961(), r7.m11614(), r6.m11959()};
        long longValue = ((Long) m13935(new C1540.C1542(this, r6, r7))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new C2630(longValue, r6, r7);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Long m13931(SQLiteDatabase sQLiteDatabase, C2291 r14) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{r14.m11959(), String.valueOf(C2745.C3657iF.m14550(r14.m11961()))}));
        if (r14.m11960() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(r14.m11960(), 0));
        }
        return (Long) m13932(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C1540.C1541.f8214);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13940(Iterable<C2630> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sb.append(m13934(iterable));
            m13935(new C1540.Cif(sb.toString()));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13942(Iterable<C2630> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder("DELETE FROM events WHERE _id in ");
            sb.append(m13934(iterable));
            ((SQLiteDatabase) m13939(new C1493(this.f11961), C1540.f8207)).compileStatement(sb.toString()).execute();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m13934(Iterable<C2630> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C2630> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f11971);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m13937() {
        return ((Integer) m13935(new C1840(this.f11959.m14297() - this.f11960.m13779()))).intValue();
    }

    public final void close() {
        this.f11961.close();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Map<Long, Set<C2623>> m13936(SQLiteDatabase sQLiteDatabase, List<C2630> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).f11971);
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m13932(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C1957.C1958(hashMap));
        return hashMap;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static List<C2630> m13933(List<C2630> list, Map<Long, Set<C2623>> map) {
        ListIterator<C2630> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C2630 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.f11971))) {
                C2201.C2202 r2 = next.f11972.m11609();
                for (C2623 r4 : map.get(Long.valueOf(next.f11971))) {
                    r2.m11620(r4.f11963, r4.f11964);
                }
                listIterator.set(new C2630(next.f11971, next.f11970, r2.m11621()));
            }
        }
        return list;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> T m13939(Cif<T> ifVar, C2624<Throwable, T> r10) {
        long r0 = this.f11962.m14297();
        while (true) {
            try {
                return ifVar.m13948();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f11962.m14297() >= ((long) this.f11960.m13778()) + r0) {
                    return r10.m13949(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: o.јΙ$ı  reason: contains not printable characters */
    public static class C2623 {

        /* renamed from: ı  reason: contains not printable characters */
        final String f11963;

        /* renamed from: ǃ  reason: contains not printable characters */
        final String f11964;

        public /* synthetic */ C2623(String str, String str2, byte b) {
            this(str, str2);
        }

        private C2623(String str, String str2) {
            this.f11963 = str;
            this.f11964 = str2;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T> T m13932(Cursor cursor, C2624<Cursor, T> r1) {
        try {
            return r1.m13949(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m13938(C2291 r5) {
        return ((Long) m13932(((SQLiteDatabase) m13939(new C1493(this.f11961), C1540.f8207)).rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{r5.m11959(), String.valueOf(C2745.C3657iF.m14550(r5.m11961()))}), C1540.C3642If.f8212)).longValue();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13944(C2291 r2) {
        return ((Boolean) m13935(new C1540.C1543(this, r2))).booleanValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13947(C2291 r2, long j) {
        m13935(new C1477(j, r2));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Iterable<C2630> m13941(C2291 r2) {
        return (Iterable) m13935(new C1822(this, r2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Iterable<C2291> m13945() {
        return (Iterable) m13935(C1951.f9835);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T> T m13943(C2691.C2692<T> r4) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) m13939(new C1493(this.f11961), C1540.f8207);
        m13939(new C2728(sQLiteDatabase), C0514.f4259);
        try {
            T r42 = r4.m14296();
            sQLiteDatabase.setTransactionSuccessful();
            return r42;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private <T> T m13935(C2624<SQLiteDatabase, T> r3) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) m13939(new C1493(this.f11961), C1540.f8207);
        sQLiteDatabase.beginTransaction();
        try {
            T r32 = r3.m13949(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return r32;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
