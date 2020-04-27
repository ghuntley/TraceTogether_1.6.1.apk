package o;

import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u0000*\u00020\u00018A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u0000*\u00020\u00018A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003"}, d2 = {"Lo/hq;", "Lo/ɩƚ;", "ɩ", "(Lo/ɩƚ;)Lo/hq;", "ǃ", "ι", "Ι"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.ɔǃ  reason: contains not printable characters */
public final class C1108 {
    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C3469hq m7506(C1242 r4) {
        fM.m2254(r4, "");
        Map<String, Object> r1 = r4.m8031();
        fM.m2252((Object) r1, "");
        Object obj = r1.get("QueryDispatcher");
        if (obj == null) {
            Executor r42 = r4.m8039();
            fM.m2252((Object) r42, "");
            obj = hY.m2502(r42);
            r1.put("QueryDispatcher", obj);
        }
        if (obj != null) {
            return (C3469hq) obj;
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public static final C3469hq m7507(C1242 r4) {
        fM.m2254(r4, "");
        Map<String, Object> r1 = r4.m8031();
        fM.m2252((Object) r1, "");
        Object obj = r1.get("TransactionDispatcher");
        if (obj == null) {
            Executor r42 = r4.m8030();
            fM.m2252((Object) r42, "");
            obj = hY.m2502(r42);
            r1.put("TransactionDispatcher", obj);
        }
        if (obj != null) {
            return (C3469hq) obj;
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }
}
