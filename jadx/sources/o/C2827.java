package o;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import o.C2683;

/* renamed from: o.ӀЈ  reason: contains not printable characters */
public final class C2827 implements C2683.Cif {

    /* renamed from: ι  reason: contains not printable characters */
    public static final C2827 f13250 = new C2827();

    /* renamed from: o.ӀЈ$if  reason: invalid class name */
    public static final class Cif implements C2683.Cif {

        /* renamed from: ι  reason: contains not printable characters */
        public static final Cif f13252 = new Cif();

        private Cif() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m14769(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
            sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
        }
    }

    /* renamed from: o.ӀЈ$ı  reason: contains not printable characters */
    public static final class C2828 implements C2683.Cif {

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final C2828 f13253 = new C2828();

        private C2828() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m14770(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
        }
    }

    private C2827() {
    }

    /* renamed from: o.ӀЈ$If */
    public static final class If implements C2693 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int[] f13251 = {R.attr.f149232130968700, R.attr.f150342130968819, R.attr.f154032130969216};

        /* renamed from: ι  reason: contains not printable characters */
        public final long m14768() {
            return System.currentTimeMillis();
        }
    }

    /* renamed from: o.ӀЈ$ɩ  reason: contains not printable characters */
    public static final class C2829 implements C2693 {
        /* renamed from: ι  reason: contains not printable characters */
        public final long m14771() {
            return SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14767(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }
}
