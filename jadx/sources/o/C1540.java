package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.Map;
import o.C2622;
import o.C2745;

/* renamed from: o.ɾȷ  reason: contains not printable characters */
public final class C1540 implements C2622.C2624 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C1540 f8207 = new C1540();

    /* renamed from: o.ɾȷ$IF */
    public static final class IF {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f8208 = 1;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f8209 = 2;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int[] f8210 = {R.attr.f151492130968938, R.attr.f151502130968939, R.attr.f151512130968940};

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f8211 = 0;
    }

    /* renamed from: o.ɾȷ$If  reason: case insensitive filesystem */
    public static final class C3642If implements C2622.C2624 {

        /* renamed from: Ι  reason: contains not printable characters */
        public static final C3642If f8212 = new C3642If();

        private C3642If() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Object m9035(Object obj) {
            Cursor cursor = (Cursor) obj;
            if (cursor.moveToNext()) {
                return Long.valueOf(cursor.getLong(0));
            }
            return 0L;
        }
    }

    /* renamed from: o.ɾȷ$if  reason: invalid class name */
    public static final class Cif implements C2622.C2624 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final String f8213;

        public Cif(String str) {
            this.f8213 = str;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Object m9036(Object obj) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            sQLiteDatabase.compileStatement(this.f8213).execute();
            sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
            return null;
        }
    }

    /* renamed from: o.ɾȷ$ı  reason: contains not printable characters */
    public static final class C1541 implements C2622.C2624 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final C1541 f8214 = new C1541();

        private C1541() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Object m9037(Object obj) {
            Cursor cursor = (Cursor) obj;
            if (!cursor.moveToNext()) {
                return null;
            }
            return Long.valueOf(cursor.getLong(0));
        }
    }

    /* renamed from: o.ɾȷ$ǃ  reason: contains not printable characters */
    public static final class C1542 implements C2622.C2624 {

        /* renamed from: ı  reason: contains not printable characters */
        private final C2622 f8215;

        /* renamed from: Ι  reason: contains not printable characters */
        private final C2291 f8216;

        /* renamed from: ι  reason: contains not printable characters */
        private final C2201 f8217;

        public C1542(C2622 r1, C2291 r2, C2201 r3) {
            this.f8215 = r1;
            this.f8216 = r2;
            this.f8217 = r3;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Object m9038(Object obj) {
            long j;
            C2622 r0 = this.f8215;
            C2291 r1 = this.f8216;
            C2201 r2 = this.f8217;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            if (((SQLiteDatabase) r0.m13939(new C1493(r0.f11961), C1540.f8207)).compileStatement("PRAGMA page_count").simpleQueryForLong() * ((SQLiteDatabase) r0.m13939(new C1493(r0.f11961), C1540.f8207)).compileStatement("PRAGMA page_size").simpleQueryForLong() >= r0.f11960.m13776()) {
                return -1L;
            }
            Long r3 = C2622.m13931(sQLiteDatabase, r1);
            if (r3 != null) {
                j = r3.longValue();
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("backend_name", r1.m11959());
                contentValues.put("priority", Integer.valueOf(C2745.C3657iF.m14550(r1.m11961())));
                contentValues.put("next_request_ms", 0);
                if (r1.m11960() != null) {
                    contentValues.put("extras", Base64.encodeToString(r1.m11960(), 0));
                }
                j = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("context_id", Long.valueOf(j));
            contentValues2.put("transport_name", r2.m11614());
            contentValues2.put("timestamp_ms", Long.valueOf(r2.m11610()));
            contentValues2.put("uptime_ms", Long.valueOf(r2.m11615()));
            contentValues2.put("payload_encoding", r2.m11608().f10437.f8957);
            contentValues2.put("payload", r2.m11608().f10436);
            contentValues2.put("code", r2.m11612());
            contentValues2.put("num_attempts", 0);
            long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
            for (Map.Entry next : r2.m11618().entrySet()) {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("name", (String) next.getKey());
                contentValues3.put("value", (String) next.getValue());
                sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
            }
            return Long.valueOf(insert);
        }
    }

    /* renamed from: o.ɾȷ$ɩ  reason: contains not printable characters */
    public static final class C1543 implements C2622.C2624 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C2291 f8218;

        /* renamed from: ι  reason: contains not printable characters */
        private final C2622 f8219;

        public C1543(C2622 r1, C2291 r2) {
            this.f8219 = r1;
            this.f8218 = r2;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Object m9039(Object obj) {
            C2622 r0 = this.f8219;
            Long r4 = C2622.m13931((SQLiteDatabase) obj, this.f8218);
            if (r4 == null) {
                return Boolean.FALSE;
            }
            return (Boolean) C2622.m13932(((SQLiteDatabase) r0.m13939(new C1493(r0.f11961), C1540.f8207)).rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{r4.toString()}), C2044.f10098);
        }
    }

    private C1540() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m9034(Object obj) {
        throw new C2684("Timed out while trying to open db.", (Throwable) obj);
    }
}
