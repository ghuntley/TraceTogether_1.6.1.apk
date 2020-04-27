package o;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import o.C2622;

/* renamed from: o.ιŀ  reason: contains not printable characters */
public final class C1951 implements C2622.C2624 {

    /* renamed from: ι  reason: contains not printable characters */
    public static final C1951 f9835 = new C1951();

    private C1951() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m10676(Object obj) {
        return (List) C2622.m13932(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C2066.f10138);
    }
}
