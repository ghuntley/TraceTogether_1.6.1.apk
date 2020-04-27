package o;

public final class cW {
    /* renamed from: ı  reason: contains not printable characters */
    public static RuntimeException m1935(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    static {
        new Cif();
    }

    /* renamed from: o.cW$if  reason: invalid class name */
    static final class Cif extends Throwable {
        public final Throwable fillInStackTrace() {
            return this;
        }

        Cif() {
            super("No further exceptions");
        }
    }
}
