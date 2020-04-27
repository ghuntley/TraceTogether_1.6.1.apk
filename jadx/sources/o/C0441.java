package o;

/* renamed from: o.ıғ  reason: contains not printable characters */
public final class C0441 extends UnsupportedOperationException {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2847 f4031;

    public C0441(C2847 r1) {
        this.f4031 = r1;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f4031);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
