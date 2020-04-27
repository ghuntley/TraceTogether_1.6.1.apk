package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\b\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u000fJ\r\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0011R\u001e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\f"}, d2 = {"Lo/jn;", "", "", "ɩ", "[Ljava/lang/Object;", "Lo/ex;", "ǃ", "Lo/ex;", "Ι", "()Lo/ex;", "ι", "", "I", "p0", "", "(Ljava/lang/Object;)V", "()V", "()Ljava/lang/Object;", "p1", "<init>", "(Lo/ex;I)V"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.jn  reason: case insensitive filesystem */
final class C3519jn {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3396ex f2481;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Object[] f2482;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f2483;

    public C3519jn(C3396ex exVar, int i) {
        fM.m2254(exVar, "");
        this.f2481 = exVar;
        this.f2482 = new Object[i];
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final C3396ex m3111() {
        return this.f2481;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3112(Object obj) {
        Object[] objArr = this.f2482;
        int i = this.f2483;
        this.f2483 = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3110() {
        Object[] objArr = this.f2482;
        int i = this.f2483;
        this.f2483 = i + 1;
        return objArr[i];
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3113() {
        this.f2483 = 0;
    }
}
