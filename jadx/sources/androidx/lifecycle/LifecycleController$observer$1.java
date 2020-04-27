package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o.C2319;
import o.C2456;
import o.C2588;
import o.C2851;
import o.C3483id;
import o.fM;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/Ӏӏ;", "p0", "Lo/Іӏ$ǃ;", "p1", "", "ɩ", "(Lo/Ӏӏ;Lo/Іӏ$ǃ;)V"}, k = 3, mv = {1, 1, 15})
public final class LifecycleController$observer$1 implements C2456 {

    /* renamed from: $ι  reason: contains not printable characters */
    final /* synthetic */ C3483id f228$;

    /* renamed from: ǃ  reason: contains not printable characters */
    final /* synthetic */ C2588 f229;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m185(C2851 r3, C2319.C2320 r4) {
        fM.m2254(r3, "");
        fM.m2254(r4, "");
        C2319 lifecycle = r3.getLifecycle();
        fM.m2252((Object) lifecycle, "");
        if (lifecycle.m12096() == C2319.Cif.DESTROYED) {
            C2588 r32 = this.f229;
            C3483id.DefaultImpls.m2678$default(this.f228$, (CancellationException) null, 1, (Object) null);
            r32.m13733();
            return;
        }
        C2319 lifecycle2 = r3.getLifecycle();
        fM.m2252((Object) lifecycle2, "");
        if (lifecycle2.m12096().compareTo(this.f229.f11747) < 0) {
            this.f229.f11744.m11600();
        } else {
            this.f229.f11744.m11602();
        }
    }
}
