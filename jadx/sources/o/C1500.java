package o;

/* renamed from: o.ɼΙ  reason: contains not printable characters */
class C1500 {

    /* renamed from: ı  reason: contains not printable characters */
    public final C1500 f8002;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f8003;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f8004;

    /* renamed from: ι  reason: contains not printable characters */
    public final StackTraceElement[] f8005;

    public C1500(Throwable th, C1504 r3) {
        this.f8004 = th.getLocalizedMessage();
        this.f8003 = th.getClass().getName();
        this.f8005 = r3.m8921(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f8002 = cause != null ? new C1500(cause, r3) : null;
    }
}
