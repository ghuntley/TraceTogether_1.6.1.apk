package o;

import android.database.sqlite.SQLiteDatabase;
import o.C2622;

/* renamed from: o.Ιʟ  reason: contains not printable characters */
public final class C1840 implements C2622.C2624 {

    /* renamed from: ι  reason: contains not printable characters */
    private final long f9436;

    public C1840(long j) {
        this.f9436 = j;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m10168(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f9436)}));
    }
}
