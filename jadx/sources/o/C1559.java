package o;

/* renamed from: o.ɾӏ  reason: contains not printable characters */
public final class C1559 implements C1455 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f8302;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1282 f8303;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1282 f8304;

    /* renamed from: Ι  reason: contains not printable characters */
    public final If f8305;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1282 f8306;

    /* renamed from: І  reason: contains not printable characters */
    public final boolean f8307;

    /* renamed from: o.ɾӏ$If */
    public enum If {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: ι  reason: contains not printable characters */
        public static If m9185(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public C1559(String str, If ifR, C1282 r3, C1282 r4, C1282 r5, boolean z) {
        this.f8302 = str;
        this.f8305 = ifR;
        this.f8304 = r3;
        this.f8303 = r4;
        this.f8306 = r5;
        this.f8307 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0550 m9184(C0379 r1, C1578 r2) {
        return new C0851(r2, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.f8304);
        sb.append(", end: ");
        sb.append(this.f8303);
        sb.append(", offset: ");
        sb.append(this.f8306);
        sb.append("}");
        return sb.toString();
    }
}
