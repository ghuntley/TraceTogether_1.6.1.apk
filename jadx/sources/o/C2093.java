package o;

import java.util.ArrayList;
import o.C1625;

/* renamed from: o.κ  reason: contains not printable characters */
public final class C2093 {

    /* renamed from: ı  reason: contains not printable characters */
    int f10173;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f10174;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f10175;

    /* renamed from: Ι  reason: contains not printable characters */
    ArrayList<C2094> f10176 = new ArrayList<>();

    /* renamed from: ι  reason: contains not printable characters */
    int f10177;

    /* renamed from: o.κ$ı  reason: contains not printable characters */
    static class C2094 {

        /* renamed from: ı  reason: contains not printable characters */
        C1625 f10178;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f10179;

        /* renamed from: ɩ  reason: contains not printable characters */
        C1625.Cif f10180;

        /* renamed from: Ι  reason: contains not printable characters */
        int f10181;

        /* renamed from: ι  reason: contains not printable characters */
        C1625 f10182;

        public C2094(C1625 r2) {
            this.f10182 = r2;
            this.f10178 = r2.f8549;
            this.f10179 = r2.m9386();
            this.f10180 = r2.f8545;
            this.f10181 = r2.f8551;
        }
    }

    public C2093(C1696 r6) {
        int i;
        int i2;
        this.f10174 = r6.m9627();
        this.f10177 = r6.m9654();
        if (r6.f8850 == 8) {
            i = 0;
        } else {
            i = r6.f8827;
        }
        this.f10175 = i;
        if (r6.f8850 == 8) {
            i2 = 0;
        } else {
            i2 = r6.f8836;
        }
        this.f10173 = i2;
        ArrayList<C1625> r62 = r6.m9660();
        int size = r62.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f10176.add(new C2094(r62.get(i3)));
        }
    }
}
