package o;

/* renamed from: o.cl  reason: case insensitive filesystem */
public final class C3331cl extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3331cl(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    public C3331cl(Throwable th) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ".concat(String.valueOf(th)), th);
    }
}
