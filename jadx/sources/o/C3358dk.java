package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000f\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00000\u001a:\u0001\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0017R\u0015\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0015\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004"}, d2 = {"Lo/dk;", "If", "", "ι", "I", "ı", "ǃ", "Ι", "ɹ", "ɩ", "p0", "(Lo/dk;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p1", "p2", "(III)I", "<init>", "(III)V", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.dk  reason: case insensitive filesystem */
public final class C3358dk implements Comparable<C3358dk> {
    public static final If If = new If((fL) null);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C3358dk f2040 = new C3358dk(1, 3, 61);

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int f2041;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int f2042 = m2099(this.f2044, this.f2041, this.f2043);

    /* renamed from: Ι  reason: contains not printable characters */
    public final int f2043;

    /* renamed from: ι  reason: contains not printable characters */
    public final int f2044;

    public C3358dk(int i, int i2, int i3) {
        this.f2044 = i;
        this.f2041 = i2;
        this.f2043 = i3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final int m2099(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2044);
        sb.append('.');
        sb.append(this.f2041);
        sb.append('.');
        sb.append(this.f2043);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3358dk)) {
            obj = null;
        }
        C3358dk dkVar = (C3358dk) obj;
        if (dkVar == null || this.f2042 != dkVar.f2042) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2042;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int compareTo(C3358dk dkVar) {
        fM.m2254(dkVar, "");
        return this.f2042 - dkVar.f2042;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0004\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/dk$If;", "Lo/dk;", "ɩ", "Lo/dk;", "ı", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.dk$If */
    public static final class If {
        private If() {
        }

        public /* synthetic */ If(fL fLVar) {
            this();
        }
    }
}
