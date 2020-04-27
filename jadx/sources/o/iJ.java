package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0012*\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0003\u0010\u000fJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\u0010R\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0003\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0013\u0010\u000b\u001a\u00020\t8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\b"}, d2 = {"Lo/iJ;", "", "", "ı", "[Ljava/lang/Object;", "ɩ", "", "ǃ", "I", "", "()Z", "Ι", "p0", "", "(Ljava/lang/Object;)V", "()V", "()Ljava/lang/Object;", "<init>", "T"}, k = 1, mv = {1, 1, 15})
public class iJ<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private Object[] f2322 = new Object[16];

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f2323;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f2324;

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2582() {
        return this.f2323 == this.f2324;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2584(T t) {
        fM.m2254(t, "");
        Object[] objArr = this.f2322;
        int i = this.f2324;
        objArr[i] = t;
        this.f2324 = (objArr.length - 1) & (i + 1);
        if (this.f2324 == this.f2323) {
            m2581();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final T m2583() {
        int i = this.f2323;
        if (i == this.f2324) {
            return null;
        }
        T[] tArr = this.f2322;
        T t = tArr[i];
        tArr[i] = null;
        this.f2323 = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new dA("null cannot be cast to non-null type T");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m2581() {
        Object[] objArr = this.f2322;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        dM.m2062$default(objArr, objArr3, 0, this.f2323, 0, 10, (Object) null);
        Object[] objArr4 = this.f2322;
        int length2 = objArr4.length;
        int i = this.f2323;
        dM.m2062$default(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f2322 = objArr3;
        this.f2323 = 0;
        this.f2324 = length;
    }
}
