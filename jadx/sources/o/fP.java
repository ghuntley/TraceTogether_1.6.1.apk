package o;

public abstract class fP extends fF implements C3444gs {
    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public C3444gs m2260() {
        return (C3444gs) super.m2240();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fP) {
            fP fPVar = (fP) obj;
            if (!m2242().equals(fPVar.m2242()) || !m2244().equals(fPVar.m2244()) || !m2245().equals(fPVar.m2245()) || !fM.m2257(m2243(), fPVar.m2243())) {
                return false;
            }
            return true;
        } else if (obj instanceof C3444gs) {
            return obj.equals(m2238());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((m2242().hashCode() * 31) + m2244().hashCode()) * 31) + m2245().hashCode();
    }

    public String toString() {
        C3442gq r0 = m2238();
        if (r0 != this) {
            return r0.toString();
        }
        return "property " + m2244() + " (Kotlin reflection is not available)";
    }
}
