package o;

import o.C1625;
import o.C2745;

/* renamed from: o.ιΙ  reason: contains not printable characters */
public final class C2024 extends C2745.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    C1625 f9993;

    /* renamed from: Ɩ  reason: contains not printable characters */
    C2024 f9994;

    /* renamed from: ɨ  reason: contains not printable characters */
    int f9995 = 1;

    /* renamed from: ɩ  reason: contains not printable characters */
    C2024 f9996;

    /* renamed from: ɹ  reason: contains not printable characters */
    C2074 f9997 = null;

    /* renamed from: ɾ  reason: contains not printable characters */
    C2074 f9998 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    float f9999;

    /* renamed from: І  reason: contains not printable characters */
    C2024 f10000;

    /* renamed from: і  reason: contains not printable characters */
    int f10001 = 0;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public float f10002;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m10849(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public C2024(C1625 r3) {
        this.f9993 = r3;
    }

    public final String toString() {
        if (this.f13030 != 1) {
            StringBuilder sb = new StringBuilder("{ ");
            sb.append(this.f9993);
            sb.append(" UNRESOLVED} type: ");
            sb.append(m10849(this.f10001));
            return sb.toString();
        } else if (this.f10000 == this) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f9993);
            sb2.append(", RESOLVED: ");
            sb2.append(this.f10002);
            sb2.append("]  type: ");
            sb2.append(m10849(this.f10001));
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(this.f9993);
            sb3.append(", RESOLVED: ");
            sb3.append(this.f10000);
            sb3.append(":");
            sb3.append(this.f10002);
            sb3.append("] type: ");
            sb3.append(m10849(this.f10001));
            return sb3.toString();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10851(C2024 r2, float f) {
        if (this.f13030 == 0 || !(this.f10000 == r2 || this.f10002 == f)) {
            this.f10000 = r2;
            this.f10002 = f;
            if (this.f13030 == 1) {
                m14554();
            }
            m14552();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10850() {
        C2024 r0;
        C2024 r02;
        C2024 r03;
        C2024 r04;
        C2024 r05;
        C2024 r06;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        C2024 r07;
        boolean z = true;
        if (this.f13030 != 1 && this.f10001 != 4) {
            C2074 r08 = this.f9997;
            if (r08 != null) {
                if (r08.f13030 == 1) {
                    this.f9999 = ((float) this.f9995) * this.f9997.f10151;
                } else {
                    return;
                }
            }
            C2074 r09 = this.f9998;
            if (r09 != null && r09.f13030 != 1) {
                return;
            }
            if (this.f10001 == 1 && ((r07 = this.f9996) == null || r07.f13030 == 1)) {
                C2024 r010 = this.f9996;
                if (r010 == null) {
                    this.f10000 = this;
                    this.f10002 = this.f9999;
                } else {
                    this.f10000 = r010.f10000;
                    this.f10002 = r010.f10002 + this.f9999;
                }
                m14552();
            } else if (this.f10001 == 2 && (r04 = this.f9996) != null && r04.f13030 == 1 && (r05 = this.f9994) != null && (r06 = r05.f9996) != null && r06.f13030 == 1) {
                C1461.m8733();
                this.f10000 = this.f9996.f10000;
                C2024 r011 = this.f9994;
                r011.f10000 = r011.f9996.f10000;
                int i3 = 0;
                if (!(this.f9993.f8548 == C1625.C1626.RIGHT || this.f9993.f8548 == C1625.C1626.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f2 = this.f9996.f10002;
                    f = this.f9994.f9996.f10002;
                } else {
                    f2 = this.f9994.f9996.f10002;
                    f = this.f9996.f10002;
                }
                float f5 = f2 - f;
                if (this.f9993.f8548 == C1625.C1626.LEFT || this.f9993.f8548 == C1625.C1626.RIGHT) {
                    C1696 r2 = this.f9993.f8546;
                    if (r2.f8850 == 8) {
                        i = 0;
                    } else {
                        i = r2.f8827;
                    }
                    f4 = f5 - ((float) i);
                    f3 = this.f9993.f8546.f8853;
                } else {
                    C1696 r22 = this.f9993.f8546;
                    if (r22.f8850 == 8) {
                        i2 = 0;
                    } else {
                        i2 = r22.f8836;
                    }
                    f4 = f5 - ((float) i2);
                    f3 = this.f9993.f8546.f8868;
                }
                int r4 = this.f9993.m9386();
                int r5 = this.f9994.f9993.m9386();
                if (this.f9993.f8549 == this.f9994.f9993.f8549) {
                    f3 = 0.5f;
                    r5 = 0;
                } else {
                    i3 = r4;
                }
                float f6 = (float) i3;
                float f7 = (float) r5;
                float f8 = (f4 - f6) - f7;
                if (z) {
                    C2024 r1 = this.f9994;
                    r1.f10002 = r1.f9996.f10002 + f7 + (f8 * f3);
                    this.f10002 = (this.f9996.f10002 - f6) - (f8 * (1.0f - f3));
                } else {
                    this.f10002 = this.f9996.f10002 + f6 + (f8 * f3);
                    C2024 r12 = this.f9994;
                    r12.f10002 = (r12.f9996.f10002 - f7) - (f8 * (1.0f - f3));
                }
                m14552();
                this.f9994.m14552();
            } else if (this.f10001 == 3 && (r0 = this.f9996) != null && r0.f13030 == 1 && (r02 = this.f9994) != null && (r03 = r02.f9996) != null && r03.f13030 == 1) {
                C1461.m8733();
                C2024 r012 = this.f9996;
                this.f10000 = r012.f10000;
                C2024 r13 = this.f9994;
                C2024 r23 = r13.f9996;
                r13.f10000 = r23.f10000;
                this.f10002 = r012.f10002 + this.f9999;
                r13.f10002 = r23.f10002 + r13.f9999;
                m14552();
                this.f9994.m14552();
            } else if (this.f10001 == 5) {
                this.f9993.f8546.m9630();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10852() {
        super.m14553();
        this.f9996 = null;
        this.f9999 = 0.0f;
        this.f9997 = null;
        this.f9995 = 1;
        this.f9998 = null;
        this.f10000 = null;
        this.f10002 = 0.0f;
        this.f9994 = null;
        this.f10001 = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10853(C1461 r5) {
        C1294 r0 = this.f9993.f8550;
        C2024 r1 = this.f10000;
        if (r1 == null) {
            r5.m8744(r0, (int) (this.f10002 + 0.5f));
        } else {
            r5.m8746(r0, r5.m8743((Object) r1.f9993), (int) (this.f10002 + 0.5f), 6);
        }
    }
}
