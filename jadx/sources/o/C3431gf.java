package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u0000 \u00012\u00020\u00162\b\u0012\u0004\u0012\u00020\u00020\u0017:\u0001\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0007\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0007\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00028W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Lo/gf;", "If", "", "ɹ", "()Ljava/lang/Integer;", "ι", "і", "ı", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "()Z", "", "toString", "()Ljava/lang/String;", "p1", "<init>", "(II)V", "Lo/ge;", "Lo/gg;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.gf  reason: case insensitive filesystem */
public final class C3431gf extends C3430ge implements C3432gg<Integer> {
    public static final If If = new If((fL) null);
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3431gf f2236 = new C3431gf(1, 0);

    public C3431gf(int i, int i2) {
        super(i, i2, 1);
    }

    @JvmName(name = "і")
    /* renamed from: і  reason: contains not printable characters */
    public final Integer m2402() {
        return Integer.valueOf(m2394());
    }

    @JvmName(name = "ɹ")
    /* renamed from: ɹ  reason: contains not printable characters */
    public final Integer m2401() {
        return Integer.valueOf(m2396());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2400() {
        return m2394() > m2396();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3431gf) {
            if (!m2400() || !((C3431gf) obj).m2400()) {
                C3431gf gfVar = (C3431gf) obj;
                if (!(m2394() == gfVar.m2394() && m2396() == gfVar.m2396())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (m2400()) {
            return -1;
        }
        return (m2394() * 31) + m2396();
    }

    public final String toString() {
        return m2394() + ".." + m2396();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004"}, d2 = {"Lo/gf$If;", "Lo/gf;", "ı", "Lo/gf;", "()Lo/gf;", "Ι", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.gf$If */
    public static final class If {
        private If() {
        }

        public /* synthetic */ If(fL fLVar) {
            this();
        }

        @JvmName(name = "ı")
        /* renamed from: ı  reason: contains not printable characters */
        public final C3431gf m2403() {
            return C3431gf.f2236;
        }
    }
}
