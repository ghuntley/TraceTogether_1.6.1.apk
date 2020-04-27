package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u001c\b\u0016\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u0019:\u0001\u0001B!\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0001\u0010\u000fJ\u0010\u0010\b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\b\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0001\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0019\u0010\u0003\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005"}, d2 = {"Lo/ge;", "ı", "", "ǃ", "I", "()I", "ɩ", "Ι", "ι", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()Z", "Lo/ed;", "()Lo/ed;", "", "toString", "()Ljava/lang/String;", "p1", "p2", "<init>", "(III)V", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ge  reason: case insensitive filesystem */
public class C3430ge implements Iterable<Integer> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C0177 f2232 = new C0177((fL) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f2233;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f2234;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f2235;

    public C3430ge(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f2233 = i;
            this.f2234 = eR.m2160(i, i2, i3);
            this.f2235 = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m2394() {
        return this.f2233;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m2396() {
        return this.f2234;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m2395() {
        return this.f2235;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public C3376ed iterator() {
        return new C3429gd(this.f2233, this.f2234, this.f2235);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m2393() {
        if (this.f2235 > 0) {
            if (this.f2233 > this.f2234) {
                return true;
            }
        } else if (this.f2233 < this.f2234) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3430ge) {
            if (!m2393() || !((C3430ge) obj).m2393()) {
                C3430ge geVar = (C3430ge) obj;
                if (!(this.f2233 == geVar.f2233 && this.f2234 == geVar.f2234 && this.f2235 == geVar.f2235)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (m2393()) {
            return -1;
        }
        return (((this.f2233 * 31) + this.f2234) * 31) + this.f2235;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f2235 > 0) {
            sb = new StringBuilder();
            sb.append(this.f2233);
            sb.append("..");
            sb.append(this.f2234);
            sb.append(" step ");
            i = this.f2235;
        } else {
            sb = new StringBuilder();
            sb.append(this.f2233);
            sb.append(" downTo ");
            sb.append(this.f2234);
            sb.append(" step ");
            i = -this.f2235;
        }
        sb.append(i);
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/ge$ı;", "", "p0", "p1", "p2", "Lo/ge;", "ɩ", "(III)Lo/ge;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.ge$ı  reason: contains not printable characters */
    public static final class C0177 {
        private C0177() {
        }

        public /* synthetic */ C0177(fL fLVar) {
            this();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3430ge m2398(int i, int i2, int i3) {
            return new C3430ge(i, i2, i3);
        }
    }
}
