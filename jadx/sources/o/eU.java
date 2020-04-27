package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u00002\u00020\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/eU;", "", "p0", "p1", "", "Ι", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "<init>", "()V", "Lo/eS;"}, k = 1, mv = {1, 1, 15})
public class eU extends eS {
    /* renamed from: Ι  reason: contains not printable characters */
    public void m2164(Throwable th, Throwable th2) {
        fM.m2254(th, "");
        fM.m2254(th2, "");
        th.addSuppressed(th2);
    }
}
