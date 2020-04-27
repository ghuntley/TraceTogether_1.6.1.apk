package o;

import kotlin.Metadata;
import o.C3396ex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\n\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\n\u0010\u0011\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\n\u0010\u0012\u001a#\u0010\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0001\u0010\u0013\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\",\u0010\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"4\u0010\n\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b\"(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b\"(\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b"}, d2 = {"Lo/ja;", "ı", "Lo/ja;", "Ι", "Lkotlin/Function2;", "", "Lo/ex$ı;", "ι", "Lo/fy;", "Lo/iy;", "ǃ", "Lo/jn;", "ɩ", "Lo/ex;", "p0", "p1", "", "(Lo/ex;Ljava/lang/Object;)V", "(Lo/ex;)Ljava/lang/Object;", "(Lo/ex;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.jh  reason: case insensitive filesystem */
public final class C3513jh {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C3506ja f2470 = new C3506ja("ZERO");

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C3423fy<C3519jn, C3396ex.C0169, C3519jn> f2471 = AnonymousClass4.f2477;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C3423fy<C3519jn, C3396ex.C0169, C3519jn> f2472 = AnonymousClass3.f2476;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C3423fy<C3503iy<?>, C3396ex.C0169, C3503iy<?>> f2473 = AnonymousClass5.f2478;

    /* renamed from: ι  reason: contains not printable characters */
    private static final C3423fy<Object, C3396ex.C0169, Object> f2474 = AnonymousClass1.f2475;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Object m3080(C3396ex exVar) {
        fM.m2254(exVar, "");
        Object fold = exVar.fold(0, f2474);
        if (fold == null) {
            fM.m2256();
        }
        return fold;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final Object m3079(C3396ex exVar, Object obj) {
        fM.m2254(exVar, "");
        if (obj == null) {
            obj = m3080(exVar);
        }
        if (obj == 0) {
            return f2470;
        }
        if (obj instanceof Integer) {
            return exVar.fold(new C3519jn(exVar, ((Number) obj).intValue()), f2471);
        }
        if (obj != null) {
            return ((C3503iy) obj).m2811(exVar);
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final void m3081(C3396ex exVar, Object obj) {
        fM.m2254(exVar, "");
        if (obj != f2470) {
            if (obj instanceof C3519jn) {
                ((C3519jn) obj).m3113();
                exVar.fold(obj, f2472);
                return;
            }
            Object fold = exVar.fold(null, f2473);
            if (fold != null) {
                ((C3503iy) fold).m2810(exVar, obj);
                return;
            }
            throw new dA("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }
}
