package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: o.aa  reason: case insensitive filesystem */
final class C3261aa extends ContextWrapper {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f1477;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f1478;

    public C3261aa(Context context, String str, String str2) {
        super(context);
        this.f1478 = str;
        this.f1477 = str2;
    }

    public final File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f1477);
        file.mkdirs();
        return new File(file, str);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }

    public final File getFilesDir() {
        return new File(super.getFilesDir(), this.f1477);
    }

    @TargetApi(8)
    public final File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f1477);
    }

    public final File getCacheDir() {
        return new File(super.getCacheDir(), this.f1477);
    }

    @TargetApi(8)
    public final File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f1477);
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1478);
        sb.append(":");
        sb.append(str);
        return super.getSharedPreferences(sb.toString(), i);
    }
}
