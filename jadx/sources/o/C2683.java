package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import o.C2827;

/* renamed from: o.ґІ  reason: contains not printable characters */
public final class C2683 extends SQLiteOpenHelper {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Cif f12402 = C2827.Cif.f13252;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final List<Cif> f12403 = Arrays.asList(new Cif[]{f12404, f12402, f12406});

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Cif f12404 = C2827.f13250;

    /* renamed from: ι  reason: contains not printable characters */
    public static int f12405 = 3;

    /* renamed from: і  reason: contains not printable characters */
    private static final Cif f12406 = C2827.C2828.f13253;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f12407;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f12408 = false;

    /* renamed from: o.ґІ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m14288(SQLiteDatabase sQLiteDatabase);
    }

    @C3350db
    C2683(Context context, @C3349da(m2095 = "SCHEMA_VERSION") int i) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i);
        this.f12407 = i;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f12408 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m14287(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f12403.size()) {
            while (i < i2) {
                f12403.get(i).m14288(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(f12403.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f12408) {
            onConfigure(sQLiteDatabase);
        }
        m14287(sQLiteDatabase, 0, this.f12407);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f12408) {
            onConfigure(sQLiteDatabase);
        }
        m14287(sQLiteDatabase, i, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f12408) {
            onConfigure(sQLiteDatabase);
        }
    }
}
