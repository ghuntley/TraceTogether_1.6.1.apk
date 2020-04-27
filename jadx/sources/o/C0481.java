package o;

/* renamed from: o.ĸІ  reason: contains not printable characters */
final class C0481 extends C0391 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C0468 f4111 = new C0468();

    C0481() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4822(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f4111.m4798(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
