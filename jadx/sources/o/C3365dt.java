package o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000 \u0001*\u0006\b\u0000\u0010\u0016 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00132\u00060\u0014j\u0002`\u0015:\u0001\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0001\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0001\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0003R\u0016\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\b@\bX\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0016\u0010\t\u001a\u00028\u00008W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lo/dt;", "ɩ", "", "Ljava/lang/Object;", "ı", "ι", "Lkotlin/Function0;", "Lo/fk;", "()Ljava/lang/Object;", "Ι", "", "()Z", "", "toString", "()Ljava/lang/String;", "writeReplace", "p0", "<init>", "(Lo/fk;)V", "Lo/dj;", "Ljava/io/Serializable;", "Lo/ı;", "T"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.dt  reason: case insensitive filesystem */
final class C3365dt<T> implements C3357dj<T>, Serializable {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0157 f2052 = new C0157((fL) null);

    /* renamed from: Ι  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater<C3365dt<?>, Object> f2053 = AtomicReferenceFieldUpdater.newUpdater(C3365dt.class, Object.class, "ɩ");

    /* renamed from: ı  reason: contains not printable characters */
    public volatile C3409fk<? extends T> f2054;

    /* renamed from: ɩ  reason: contains not printable characters and collision with other field name */
    private volatile Object f2055 = C3371dz.f2063;

    /* renamed from: ι  reason: contains not printable characters */
    private final Object f2056 = C3371dz.f2063;

    public C3365dt(C3409fk<? extends T> fkVar) {
        fM.m2254(fkVar, "");
        this.f2054 = fkVar;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final T m2107() {
        T t = this.f2055;
        if (t != C3371dz.f2063) {
            return t;
        }
        C3409fk<? extends T> fkVar = this.f2054;
        if (fkVar != null) {
            T invoke = fkVar.invoke();
            if (f2053.compareAndSet(this, C3371dz.f2063, invoke)) {
                this.f2054 = null;
                return invoke;
            }
        }
        return this.f2055;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2108() {
        return this.f2055 != C3371dz.f2063;
    }

    public final String toString() {
        return m2108() ? String.valueOf(m2107()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new dg(m2107());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRR\u0010\u0006\u001a>\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00020\u0002\u0012\b\u0012\u0006*\u00020\u00030\u0003*\u001e\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00020\u0002\u0012\b\u0012\u0006*\u00020\u00030\u00030\u00010\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/dt$ɩ;", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lo/dt;", "", "Ι", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "ι", "<init>", "()V"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.dt$ɩ  reason: contains not printable characters */
    public static final class C0157 {
        private C0157() {
        }

        public /* synthetic */ C0157(fL fLVar) {
            this();
        }
    }
}
