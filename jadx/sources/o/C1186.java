package o;

/* renamed from: o.ɥ  reason: contains not printable characters */
class C1186 implements C1504 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f6798;

    public C1186(int i) {
        this.f6798 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public StackTraceElement[] m7724(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f6798;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
