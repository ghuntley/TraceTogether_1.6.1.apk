package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Ɨյ  reason: contains not printable characters */
public class C0709 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f4914;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0554 f4915;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map<String, C0452> f4916 = new HashMap();

    /* renamed from: ι  reason: contains not printable characters */
    private final String f4917;

    public C0709(Context context, C0554 r3, String str) {
        this.f4914 = context;
        this.f4915 = r3;
        this.f4917 = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized C0452 m5821(String str) {
        C0452 r0;
        r0 = this.f4916.get(str);
        if (r0 == null) {
            r0 = new C0452(this.f4914, this.f4917, str, this.f4915);
            this.f4916.put(str, r0);
        }
        return r0;
    }
}
