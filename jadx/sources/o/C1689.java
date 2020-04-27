package o;

import android.database.sqlite.SQLiteStatement;
import o.C3335coN;

/* renamed from: o.ʟІ  reason: contains not printable characters */
final class C1689 extends C3335coN.If implements C1647 {

    /* renamed from: ι  reason: contains not printable characters */
    private final SQLiteStatement f8764;

    C1689(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f8764 = sQLiteStatement;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m9601() {
        return this.f8764.executeUpdateDelete();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m9600() {
        return this.f8764.executeInsert();
    }
}
