package o;

import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\u0018\u00002\u00020\u0013B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\r\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0015\u0010\u000b\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0003"}, d2 = {"Lo/mf;", "", "ι", "Ljava/lang/String;", "Landroid/content/Context;", "ǃ", "Landroid/content/Context;", "ı", "Lo/lu;", "Lo/lu;", "ɩ", "Ι", "p0", "p1", "(Landroid/content/Context;Ljava/lang/String;)Lo/lu;", "", "()V", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mf  reason: case insensitive filesystem */
public final class C3593mf {

    /* renamed from: ı  reason: contains not printable characters */
    private C3578lu f3208 = m3828(this.f3209, this.f3210);

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Context f3209;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f3210;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f3211 = "StreetPassServer";

    public C3593mf(Context context, String str) {
        fM.m2254(context, "");
        fM.m2254(str, "");
        this.f3209 = context;
        this.f3210 = str;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final C3578lu m3828(Context context, String str) {
        C3578lu luVar = new C3578lu(context, str);
        if (!luVar.m3696()) {
            return null;
        }
        luVar.m3695(new C3579lv(context, str));
        return luVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3829() {
        C3578lu luVar = this.f3208;
        if (luVar != null) {
            luVar.m3693();
        }
    }
}
