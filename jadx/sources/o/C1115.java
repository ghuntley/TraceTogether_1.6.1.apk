package o;

/* renamed from: o.ɔӀ  reason: contains not printable characters */
class C1115 implements C1504 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f6601;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1504[] f6602;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1186 f6603;

    public C1115(int i, C1504... r2) {
        this.f6601 = i;
        this.f6602 = r2;
        this.f6603 = new C1186(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public StackTraceElement[] m7527(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f6601) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C1504 r4 : this.f6602) {
            if (stackTraceElementArr2.length <= this.f6601) {
                break;
            }
            stackTraceElementArr2 = r4.m8921(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f6601 ? this.f6603.m7724(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
