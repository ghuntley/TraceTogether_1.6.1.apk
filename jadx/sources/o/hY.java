package o;

import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/hq;", "Ljava/util/concurrent/Executor;", "Ι", "(Ljava/util/concurrent/Executor;)Lo/hq;"}, k = 2, mv = {1, 1, 15})
public final class hY {
    /* renamed from: Ι  reason: contains not printable characters */
    public static final C3469hq m2502(Executor executor) {
        C3469hq hqVar;
        fM.m2254(executor, "");
        hH hHVar = (hH) (!(executor instanceof hH) ? null : executor);
        return (hHVar == null || (hqVar = hHVar.f2259) == null) ? new hU(executor) : hqVar;
    }
}
