package o;

import o.C0987;

/* renamed from: o.ιυ  reason: contains not printable characters */
final class C2035 implements C1640 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1637 f10062;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object[] f10063;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f10064;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f10065;

    C2035(C1637 r4, String str, Object[] objArr) {
        this.f10062 = r4;
        this.f10064 = str;
        this.f10063 = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f10065 = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f10065 = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m10903() {
        return this.f10064;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Object[] m10905() {
        return this.f10063;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1637 m10906() {
        return this.f10062;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m10902() {
        return (this.f10065 & 1) == 1 ? C0987.If.f6026 : C0987.If.f6021;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10904() {
        return (this.f10065 & 2) == 2;
    }
}
