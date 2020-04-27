package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\bÀ\u0002\u0018\u00002\u00020\rB\t\b\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/jq;", "Lo/hq;", "ı", "Lo/hq;", "ι", "()Lo/hq;", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "<init>", "Lo/jr;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.jq  reason: case insensitive filesystem */
public final class C3522jq extends C3523jr {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C3469hq f2515;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C3522jq f2516;

    public final String toString() {
        return "DefaultDispatcher";
    }

    static {
        C3522jq jqVar = new C3522jq();
        f2516 = jqVar;
        f2515 = jqVar.m3177(C3514ji.m3091$default("kotlinx.coroutines.io.parallelism", C3435gj.m2407(64, C3511jf.m3076()), 0, 0, 12, (Object) null));
    }

    private C3522jq() {
        super(0, 0, (String) null, 7, (fL) null);
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final C3469hq m3175() {
        return f2515;
    }

    public final void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }
}
