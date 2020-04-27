package o;

/* renamed from: o.ɂΙ  reason: contains not printable characters */
final class C1020<E> extends C0719<E> {

    /* renamed from: ι  reason: contains not printable characters */
    static final C0719<Object> f6218 = new C1020(new Object[0], 0);

    /* renamed from: ı  reason: contains not printable characters */
    private final transient Object[] f6219;

    /* renamed from: Ι  reason: contains not printable characters */
    private final transient int f6220;

    C1020(Object[] objArr, int i) {
        this.f6219 = objArr;
        this.f6220 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final int m7257() {
        return 0;
    }

    public final int size() {
        return this.f6220;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Object[] m7259() {
        return this.f6219;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m7260() {
        return this.f6220;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m7258(Object[] objArr, int i) {
        System.arraycopy(this.f6219, 0, objArr, i, this.f6220);
        return i + this.f6220;
    }

    public final E get(int i) {
        C0672.m5539(i, this.f6220);
        return this.f6219[i];
    }
}
