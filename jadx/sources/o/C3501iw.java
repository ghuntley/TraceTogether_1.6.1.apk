package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u000fB\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00018A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R*\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lo/iw;", "Lo/hO;", "ι", "()Lo/hO;", "ı", "Ljava/lang/ThreadLocal;", "Lo/ɩ;", "ɩ", "Ljava/lang/ThreadLocal;", "Ι", "", "()V", "p0", "(Lo/hO;)V", "<init>", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.iw  reason: case insensitive filesystem */
public final class C3501iw {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3501iw f2385 = new C3501iw();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final ThreadLocal<hO> f2386 = new ThreadLocal<>();

    private C3501iw() {
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final hO m2807() {
        hO hOVar = f2386.get();
        if (hOVar != null) {
            return hOVar;
        }
        hO r0 = hR.m2493();
        f2386.set(r0);
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m2805() {
        f2386.set((Object) null);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m2806(hO hOVar) {
        fM.m2254(hOVar, "");
        f2386.set(hOVar);
    }
}
