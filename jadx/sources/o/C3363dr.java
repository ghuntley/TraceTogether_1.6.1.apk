package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0017 \u0001*\u0006\b\u0001\u0010\u0018 \u00012\u00060\u0015j\u0002`\u0016B\u0017\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u00028\u00008\u0007@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0001\u001a\u00028\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004"}, d2 = {"Lo/dr;", "ı", "Ljava/lang/Object;", "ι", "()Ljava/lang/Object;", "ɩ", "ǃ", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/io/Serializable;", "Lo/ı;", "A", "B"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.dr  reason: case insensitive filesystem */
public final class C3363dr<A, B> implements Serializable {

    /* renamed from: ı  reason: contains not printable characters */
    private final A f2050;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final B f2051;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3363dr)) {
            return false;
        }
        C3363dr drVar = (C3363dr) obj;
        return fM.m2257(this.f2050, drVar.f2050) && fM.m2257(this.f2051, drVar.f2051);
    }

    public final int hashCode() {
        A a = this.f2050;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f2051;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final A m2102() {
        return this.f2050;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final B m2103() {
        return this.f2051;
    }

    public C3363dr(A a, B b) {
        this.f2050 = a;
        this.f2051 = b;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final A m2104() {
        return this.f2050;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final B m2101() {
        return this.f2051;
    }

    public final String toString() {
        return '(' + this.f2050 + ", " + this.f2051 + ')';
    }
}
