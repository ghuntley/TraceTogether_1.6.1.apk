package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\r0\u0011B)\u0012\u0006\u0010\b\u001a\u00020\r\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ic;", "Lkotlin/Function1;", "Lo/CompletionHandler;", "", "", "ǃ", "Lo/fo;", "ɩ", "p0", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lo/id;", "p1", "<init>", "(Lo/id;Lo/fo;)V", "Lo/ib;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ic  reason: case insensitive filesystem */
final class C3482ic extends C3481ib<C3483id> {

    /* renamed from: ı  reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f2364 = AtomicIntegerFieldUpdater.newUpdater(C3482ic.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3413fo<Throwable, dF> f2365;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ Object m2667(Object obj) {
        m2666((Throwable) obj);
        return dF.f2032;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3482ic(C3483id idVar, C3413fo<? super Throwable, dF> foVar) {
        super(idVar);
        fM.m2254(idVar, "");
        fM.m2254(foVar, "");
        this.f2365 = foVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m2666(Throwable th) {
        if (f2364.compareAndSet(this, 0, 1)) {
            this.f2365.m2298(th);
        }
    }

    public final String toString() {
        return "InvokeOnCancelling[" + hB.m2428((Object) this) + '@' + hB.m2427(this) + ']';
    }
}
