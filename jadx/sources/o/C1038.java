package o;

/* renamed from: o.ɈІ  reason: contains not printable characters */
final class C1038 extends C0719<Object> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final transient int f6290;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final transient int f6291;

    /* renamed from: ι  reason: contains not printable characters */
    private final transient Object[] f6292;

    C1038(Object[] objArr, int i, int i2) {
        this.f6292 = objArr;
        this.f6290 = i;
        this.f6291 = i2;
    }

    public final Object get(int i) {
        C0672.m5539(i, this.f6291);
        return this.f6292[(i * 2) + this.f6290];
    }

    public final int size() {
        return this.f6291;
    }
}
