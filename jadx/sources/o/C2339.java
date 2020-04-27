package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.Јј  reason: contains not printable characters */
public final class C2339 {
    /* renamed from: ι  reason: contains not printable characters */
    private static Set<String> m12200(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m12198(C2244 r5, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (r5 != null) {
            if (!m12199(r5, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> r8 = m12200(sQLiteDatabase, str);
                String[] split = str3.split(",");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    String str4 = split[i];
                    if (r8.remove(str4)) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                        sb.append("Table ");
                        sb.append(str);
                        sb.append(" is missing required column: ");
                        sb.append(str4);
                        throw new SQLiteException(sb.toString());
                    }
                }
                if (strArr != null) {
                    for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                        if (!r8.remove(strArr[i2])) {
                            sQLiteDatabase.execSQL(strArr[i2 + 1]);
                        }
                    }
                }
                if (!r8.isEmpty()) {
                    r5.A_().m11605("Table has extra columns. table, columns", str, TextUtils.join(", ", r8));
                }
            } catch (SQLiteException e) {
                r5.m11714().m11603("Failed to verify columns on table that was just created", str);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m12199(C2244 r10, SQLiteDatabase sQLiteDatabase, String str) {
        if (r10 != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                boolean moveToFirst = query.moveToFirst();
                query.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                r10.A_().m11605("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m12197(C2244 r3, SQLiteDatabase sQLiteDatabase) {
        if (r3 != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                r3.A_().m11606("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                r3.A_().m11606("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                r3.A_().m11606("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                r3.A_().m11606("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
