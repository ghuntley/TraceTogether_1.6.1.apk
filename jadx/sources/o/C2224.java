package o;

/* renamed from: o.Іƚ  reason: contains not printable characters */
public final class C2224 extends RuntimeException {
    C2224(String str) {
        super(str);
    }

    public C2224() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
