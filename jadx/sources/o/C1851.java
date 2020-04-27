package o;

/* renamed from: o.ΙΞ  reason: contains not printable characters */
final class C1851 extends C1878 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C1848 f9472 = new C1848();

    C1851() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10211(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f9472.m10206(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
