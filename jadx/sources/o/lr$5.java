package o;

import kotlin.Metadata;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "p0", "", "onFailure", "(Ljava/lang/Exception;)V"}, k = 3, mv = {1, 1, 16})
final class lr$5 implements C3191 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final lr$5 f2966 = new lr$5();

    lr$5() {
    }

    public final void onFailure(Exception exc) {
        fM.m2254(exc, "");
        lA.C0215 r0 = lA.f2728;
        r0.m3372("Utils", "get handshake pin (failure): " + exc.getMessage());
    }
}
