package o;

import androidx.recyclerview.widget.RecyclerView;
import o.C2317;

/* renamed from: o.ɟǃ  reason: contains not printable characters */
public class C1151 {

    /* renamed from: ı  reason: contains not printable characters */
    public final C0782<RecyclerView.con> f6688 = new C0782<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0910<RecyclerView.con, C1152> f6689 = new C0910<>();

    /* renamed from: o.ɟǃ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ı  reason: contains not printable characters */
        void m7617(RecyclerView.con con, RecyclerView.C3246iF.C0029 r2, RecyclerView.C3246iF.C0029 r3);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m7618(RecyclerView.con con, RecyclerView.C3246iF.C0029 r2, RecyclerView.C3246iF.C0029 r3);

        /* renamed from: ι  reason: contains not printable characters */
        void m7619(RecyclerView.con con);

        /* renamed from: ι  reason: contains not printable characters */
        void m7620(RecyclerView.con con, RecyclerView.C3246iF.C0029 r2, RecyclerView.C3246iF.C0029 r3);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7614(RecyclerView.con con, RecyclerView.C3246iF.C0029 r4) {
        C1152 r0 = this.f6689.get(con);
        if (r0 == null) {
            r0 = C1152.m7623();
            this.f6689.put(con, r0);
        }
        r0.f6692 = r4;
        r0.f6693 |= 4;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final RecyclerView.C3246iF.C0029 m7613(RecyclerView.con con, int i) {
        int i2;
        C1152 r1;
        RecyclerView.C3246iF.C0029 r5;
        C0910<RecyclerView.con, C1152> r0 = this.f6689;
        if (con == null) {
            i2 = r0.m6719();
        } else {
            i2 = r0.m6723(con, con.hashCode());
        }
        if (i2 < 0 || (r1 = (C1152) this.f6689.f5784[(i2 << 1) + 1]) == null || (r1.f6693 & i) == 0) {
            return null;
        }
        r1.f6693 &= ~i;
        if (i == 4) {
            r5 = r1.f6692;
        } else if (i == 8) {
            r5 = r1.f6691;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((r1.f6693 & 12) == 0) {
            this.f6689.m6721(i2);
            C1152.m7622(r1);
        }
        return r5;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7616(RecyclerView.con con, RecyclerView.C3246iF.C0029 r4) {
        C1152 r0 = this.f6689.get(con);
        if (r0 == null) {
            r0 = C1152.m7623();
            this.f6689.put(con, r0);
        }
        r0.f6691 = r4;
        r0.f6693 |= 8;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7615(RecyclerView.con con) {
        C1152 r0 = this.f6689.get(con);
        if (r0 == null) {
            r0 = C1152.m7623();
            this.f6689.put(con, r0);
        }
        r0.f6693 |= 1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7612(RecyclerView.con con) {
        C0782<RecyclerView.con> r0 = this.f6688;
        if (r0.f5199) {
            r0.m6115();
        }
        int i = r0.f5201 - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            C0782<RecyclerView.con> r2 = this.f6688;
            if (r2.f5199) {
                r2.m6115();
            }
            if (con == r2.f5200[i]) {
                C0782<RecyclerView.con> r22 = this.f6688;
                if (r22.f5200[i] != C0782.f5198) {
                    r22.f5200[i] = C0782.f5198;
                    r22.f5199 = true;
                }
            } else {
                i--;
            }
        }
        C1152 remove = this.f6689.remove(con);
        if (remove != null) {
            C1152.m7622(remove);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m7611() {
        C1152.m7621();
    }

    /* renamed from: o.ɟǃ$ı  reason: contains not printable characters */
    public static class C1152 {

        /* renamed from: ı  reason: contains not printable characters */
        private static C2317.If<C1152> f6690 = new C2317.C2318(20);

        /* renamed from: ǃ  reason: contains not printable characters */
        public RecyclerView.C3246iF.C0029 f6691;

        /* renamed from: Ι  reason: contains not printable characters */
        public RecyclerView.C3246iF.C0029 f6692;

        /* renamed from: ι  reason: contains not printable characters */
        public int f6693;

        private C1152() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static C1152 m7623() {
            C1152 r0 = f6690.m12090();
            return r0 == null ? new C1152() : r0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static void m7622(C1152 r1) {
            r1.f6693 = 0;
            r1.f6692 = null;
            r1.f6691 = null;
            f6690.m12091(r1);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        static void m7621() {
            do {
            } while (f6690.m12090() != null);
        }
    }
}
