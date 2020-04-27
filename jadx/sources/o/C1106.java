package o;

import android.view.View;

/* renamed from: o.ɔı  reason: contains not printable characters */
public final class C1106 {

    /* renamed from: ı  reason: contains not printable characters */
    final Cif f6566;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1107 f6567 = new C1107();

    /* renamed from: o.ɔı$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ı  reason: contains not printable characters */
        int m7500(View view);

        /* renamed from: ǃ  reason: contains not printable characters */
        int m7501(View view);

        /* renamed from: ɩ  reason: contains not printable characters */
        int m7502();

        /* renamed from: Ι  reason: contains not printable characters */
        int m7503();

        /* renamed from: Ι  reason: contains not printable characters */
        View m7504(int i);
    }

    public C1106(Cif ifVar) {
        this.f6566 = ifVar;
    }

    /* renamed from: o.ɔı$ǃ  reason: contains not printable characters */
    static class C1107 {

        /* renamed from: ı  reason: contains not printable characters */
        int f6568;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f6569 = 0;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f6570;

        /* renamed from: Ι  reason: contains not printable characters */
        int f6571;

        /* renamed from: ι  reason: contains not printable characters */
        int f6572;

        C1107() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m7505() {
            int i = this.f6569;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.f6568;
                int i4 = this.f6572;
                if ((i & (i3 > i4 ? 1 : i3 == i4 ? 2 : 4)) == 0) {
                    return false;
                }
            }
            int i5 = this.f6569;
            if ((i5 & 112) != 0) {
                int i6 = this.f6568;
                int i7 = this.f6570;
                if ((i5 & ((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4)) == 0) {
                    return false;
                }
            }
            int i8 = this.f6569;
            if ((i8 & 1792) != 0) {
                int i9 = this.f6571;
                int i10 = this.f6572;
                if ((i8 & ((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8)) == 0) {
                    return false;
                }
            }
            int i11 = this.f6569;
            if ((i11 & 28672) != 0) {
                int i12 = this.f6571;
                int i13 = this.f6570;
                if (i12 > i13) {
                    i2 = 1;
                } else if (i12 != i13) {
                    i2 = 4;
                }
                if ((i11 & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final View m7499(int i, int i2, int i3, int i4) {
        int r0 = this.f6566.m7502();
        int r1 = this.f6566.m7503();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View r4 = this.f6566.m7504(i);
            int r5 = this.f6566.m7501(r4);
            int r6 = this.f6566.m7500(r4);
            C1107 r7 = this.f6567;
            r7.f6572 = r0;
            r7.f6570 = r1;
            r7.f6568 = r5;
            r7.f6571 = r6;
            if (i3 != 0) {
                r7.f6569 = 0;
                r7.f6569 |= i3;
                if (this.f6567.m7505()) {
                    return r4;
                }
            }
            if (i4 != 0) {
                C1107 r62 = this.f6567;
                r62.f6569 = 0;
                r62.f6569 |= i4;
                if (this.f6567.m7505()) {
                    view = r4;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7498(View view) {
        C1107 r0 = this.f6567;
        int r1 = this.f6566.m7502();
        int r2 = this.f6566.m7503();
        int r3 = this.f6566.m7501(view);
        int r6 = this.f6566.m7500(view);
        r0.f6572 = r1;
        r0.f6570 = r2;
        r0.f6568 = r3;
        r0.f6571 = r6;
        C1107 r62 = this.f6567;
        r62.f6569 = 0;
        r62.f6569 |= 24579;
        return this.f6567.m7505();
    }
}
