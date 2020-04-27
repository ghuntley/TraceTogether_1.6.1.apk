package o;

import java.util.List;

/* renamed from: o.ȣ  reason: contains not printable characters */
final class C0946 extends C0719<E> {

    /* renamed from: ı  reason: contains not printable characters */
    private final transient int f5935;

    /* renamed from: Ι  reason: contains not printable characters */
    private final transient int f5936;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C0719 f5937;

    C0946(C0719 r1, int i, int i2) {
        this.f5937 = r1;
        this.f5936 = i;
        this.f5935 = i2;
    }

    public final int size() {
        return this.f5935;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Object[] m6842() {
        return this.f5937.m6404();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final int m6840() {
        return this.f5937.m6401() + this.f5936;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m6843() {
        return this.f5937.m6401() + this.f5936 + this.f5935;
    }

    public final E get(int i) {
        C0672.m5539(i, this.f5935);
        return this.f5937.get(i + this.f5936);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0719<E> m6841(int i, int i2) {
        C0672.m5543(i, i2, this.f5935);
        C0719 r0 = this.f5937;
        int i3 = this.f5936;
        return (C0719) r0.subList(i + i3, i2 + i3);
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
