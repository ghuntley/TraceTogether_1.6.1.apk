package o;

import android.animation.Animator;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import o.C2622;

/* renamed from: o.Ιɪ  reason: contains not printable characters */
public final class C1822 implements C2622.C2624 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2622 f9300;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2291 f9301;

    /* renamed from: o.Ιɪ$ǃ  reason: contains not printable characters */
    interface C1823 {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public C1822(C2622 r1, C2291 r2) {
        this.f9300 = r1;
        this.f9301 = r2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m10028(Object obj) {
        C2622 r0 = this.f9300;
        C2291 r1 = this.f9301;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList arrayList = new ArrayList();
        Long r2 = C2622.m13931(sQLiteDatabase, r1);
        if (r2 != null) {
            String[] strArr = {r2.toString()};
            C2622.m13932(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", strArr, (String) null, (String) null, (String) null, String.valueOf(r0.f11960.m13777())), new C1957(arrayList, r1));
        }
        return C2622.m13933((List<C2630>) arrayList, C2622.m13936(sQLiteDatabase, (List<C2630>) arrayList));
    }
}
