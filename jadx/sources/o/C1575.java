package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import o.C3335coN;

/* renamed from: o.ɿі  reason: contains not printable characters */
final class C1575 implements C1558 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String[] f8372 = new String[0];

    /* renamed from: Ι  reason: contains not printable characters */
    final SQLiteDatabase f8373;

    static {
        new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    C1575(SQLiteDatabase sQLiteDatabase) {
        this.f8373 = sQLiteDatabase;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1647 m9232(String str) {
        return new C1689(this.f8373.compileStatement(str));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9233() {
        this.f8373.beginTransaction();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9234() {
        this.f8373.endTransaction();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9229() {
        this.f8373.setTransactionSuccessful();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9239() {
        return this.f8373.inTransaction();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Cursor m9228(String str) {
        final C3335coN con = new C3335coN(str);
        return this.f8373.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r5.m9347(new C3335coN.If(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, con.m9348(), f8372, (String) null);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Cursor m9236(String str, Object[] objArr) {
        final C3335coN con = new C3335coN(str, (byte) 0);
        return this.f8373.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r5.m9347(new C3335coN.If(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, con.m9348(), f8372, (String) null);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Cursor m9238(final C1611 r5) {
        return this.f8373.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r5.m9347(new C3335coN.If(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, r5.m9348(), f8372, (String) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Cursor m9231(final C1611 r7, CancellationSignal cancellationSignal) {
        return this.f8373.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r7.m9347(new C3335coN.If(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, r7.m9348(), f8372, (String) null, cancellationSignal);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9235(String str) {
        this.f8373.execSQL(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9237() {
        return this.f8373.isOpen();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final String m9240() {
        return this.f8373.getPath();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final List<Pair<String, String>> m9230() {
        return this.f8373.getAttachedDbs();
    }

    public final void close() {
        this.f8373.close();
    }
}
