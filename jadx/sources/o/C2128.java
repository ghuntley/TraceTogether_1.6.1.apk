package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/* renamed from: o.υɹ  reason: contains not printable characters */
final class C2128 extends SQLiteOpenHelper {

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2158 f10276;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2128(C2158 r2, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f10276 = r2;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f10276.t_().m11714().m11606("Opening the local database failed, dropping and recreating it");
            if (!this.f10276.m15904().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f10276.t_().m11714().m11603("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f10276.t_().m11714().m11603("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (Build.VERSION.SDK_INT < 15) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", (String[]) null);
                cursor.moveToFirst();
                cursor.close();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        C2339.m12198(this.f10276.t_(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2339.m12197(this.f10276.t_(), sQLiteDatabase);
    }
}
