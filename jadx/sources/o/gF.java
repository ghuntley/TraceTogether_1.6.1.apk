package o;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u000f*\u0004\b\u0001\u0010\u00102\b\u0012\u0004\u0012\u00028\u00010\u0001B)\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\b\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/gF;", "Lo/gB;", "ǃ", "Lo/gB;", "ɩ", "Lkotlin/Function1;", "ı", "Lo/fo;", "ι", "", "()Ljava/util/Iterator;", "p0", "p1", "<init>", "(Lo/gB;Lo/fo;)V", "T", "R"}, k = 1, mv = {1, 1, 15})
public final class gF<T, R> implements gB<R> {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final C3413fo<T, R> f2187;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final gB<T> f2188;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/gF$ɩ;", "", "ɩ", "Ljava/util/Iterator;", "ι", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.gF$ɩ  reason: contains not printable characters */
    public static final class C0175 implements Iterator<R> {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Iterator<T> f2189;

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ gF f2190;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C0175(gF gFVar) {
            this.f2190 = gFVar;
            this.f2189 = gFVar.f2188.m2305();
        }

        public final R next() {
            return this.f2190.f2187.m2298(this.f2189.next());
        }

        public final boolean hasNext() {
            return this.f2189.hasNext();
        }
    }

    public gF(gB<? extends T> gBVar, C3413fo<? super T, ? extends R> foVar) {
        fM.m2254(gBVar, "");
        fM.m2254(foVar, "");
        this.f2188 = gBVar;
        this.f2187 = foVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Iterator<R> m2312() {
        return new C0175(this);
    }
}
