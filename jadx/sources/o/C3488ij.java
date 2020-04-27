package o;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\u00020\u0007*\u00020\b2\u0010\b\u0002\u0010\u0001\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/id;", "p0", "Lo/hj;", "ɩ", "(Lo/id;)Lo/hj;", "Ljava/util/concurrent/CancellationException;", "Lo/Ι;", "", "Lo/ex;", "ι", "(Lo/ex;Ljava/util/concurrent/CancellationException;)V"}, k = 5, mv = {1, 1, 15}, xs = "o/ie")
/* renamed from: o.ij  reason: case insensitive filesystem */
final /* synthetic */ class C3488ij {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C3462hj m2776(C3483id idVar) {
        return new C3487ii(idVar);
    }

    /* renamed from: ɩ$default  reason: contains not printable characters */
    public static /* synthetic */ C3462hj m2777$default(C3483id idVar, int i, Object obj) {
        if ((i & 1) != 0) {
            idVar = null;
        }
        return C3484ie.m2680(idVar);
    }

    /* renamed from: ι$default  reason: contains not printable characters */
    public static /* synthetic */ void m2779$default(C3396ex exVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C3484ie.m2682(exVar, cancellationException);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final void m2778(C3396ex exVar, CancellationException cancellationException) {
        fM.m2254(exVar, "");
        C3483id idVar = (C3483id) exVar.get(C3483id.f2366);
        if (idVar != null) {
            idVar.m2672(cancellationException);
        }
    }
}
