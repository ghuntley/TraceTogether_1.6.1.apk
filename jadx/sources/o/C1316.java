package o;

import java.util.ArrayList;
import o.C1696;

/* renamed from: o.ɩӀ  reason: contains not printable characters */
public final class C1316 extends C1932 {

    /* renamed from: ı  reason: contains not printable characters */
    public int f7316 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f7317 = true;

    /* renamed from: ч  reason: contains not printable characters */
    private ArrayList<C2024> f7318 = new ArrayList<>(4);

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m8290() {
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8291() {
        super.m9650();
        this.f7318.clear();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8287(int i) {
        C2024 r8;
        C2024 r4;
        if (this.f8828 != null) {
            if ((((C1821) this.f8828).f9286 & 2) == 2) {
                int i2 = this.f7316;
                if (i2 == 0) {
                    r8 = this.f8813.f8547;
                } else if (i2 == 1) {
                    r8 = this.f8816.f8547;
                } else if (i2 == 2) {
                    r8 = this.f8812.f8547;
                } else if (i2 == 3) {
                    r8 = this.f8840.f8547;
                } else {
                    return;
                }
                r8.f10001 = 5;
                int i3 = this.f7316;
                if (i3 == 0 || i3 == 1) {
                    this.f8812.f8547.m10851((C2024) null, 0.0f);
                    this.f8840.f8547.m10851((C2024) null, 0.0f);
                } else {
                    this.f8813.f8547.m10851((C2024) null, 0.0f);
                    this.f8816.f8547.m10851((C2024) null, 0.0f);
                }
                this.f7318.clear();
                for (int i4 = 0; i4 < this.f9761; i4++) {
                    C1696 r42 = this.f9760[i4];
                    if (this.f7317 || r42.m9649()) {
                        int i5 = this.f7316;
                        if (i5 == 0) {
                            r4 = r42.f8813.f8547;
                        } else if (i5 == 1) {
                            r4 = r42.f8816.f8547;
                        } else if (i5 == 2) {
                            r4 = r42.f8812.f8547;
                        } else if (i5 != 3) {
                            r4 = null;
                        } else {
                            r4 = r42.f8840.f8547;
                        }
                        if (r4 != null) {
                            this.f7318.add(r4);
                            r4.f13031.add(r8);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8288() {
        C2024 r0;
        int i = this.f7316;
        float f = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                r0 = this.f8816.f8547;
            } else if (i == 2) {
                r0 = this.f8812.f8547;
            } else if (i == 3) {
                r0 = this.f8840.f8547;
            } else {
                return;
            }
            f = 0.0f;
        } else {
            r0 = this.f8813.f8547;
        }
        int size = this.f7318.size();
        C2024 r6 = null;
        int i2 = 0;
        while (i2 < size) {
            C2024 r8 = this.f7318.get(i2);
            if (r8.f13030 == 1) {
                int i3 = this.f7316;
                if (i3 == 0 || i3 == 2) {
                    if (r8.f10002 < f) {
                        f = r8.f10002;
                        r6 = r8.f10000;
                    }
                } else if (r8.f10002 > f) {
                    f = r8.f10002;
                    r6 = r8.f10000;
                }
                i2++;
            } else {
                return;
            }
        }
        C1461.m8733();
        r0.f10000 = r6;
        r0.f10002 = f;
        r0.m14552();
        int i4 = this.f7316;
        if (i4 == 0) {
            this.f8816.f8547.m10851(r6, f);
        } else if (i4 == 1) {
            this.f8813.f8547.m10851(r6, f);
        } else if (i4 == 2) {
            this.f8840.f8547.m10851(r6, f);
        } else if (i4 == 3) {
            this.f8812.f8547.m10851(r6, f);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8289(C1461 r13) {
        boolean z;
        int i;
        int i2;
        this.f8826[0] = this.f8813;
        this.f8826[2] = this.f8812;
        this.f8826[1] = this.f8816;
        this.f8826[3] = this.f8840;
        for (int i3 = 0; i3 < this.f8826.length; i3++) {
            this.f8826[i3].f8550 = r13.m8743((Object) this.f8826[i3]);
        }
        int i4 = this.f7316;
        if (i4 >= 0 && i4 < 4) {
            C1625 r0 = this.f8826[this.f7316];
            int i5 = 0;
            while (true) {
                if (i5 >= this.f9761) {
                    z = false;
                    break;
                }
                C1696 r6 = this.f9760[i5];
                if ((this.f7317 || r6.m9649()) && ((((i = this.f7316) == 0 || i == 1) && r6.m9625() == C1696.C1697.MATCH_CONSTRAINT) || (((i2 = this.f7316) == 2 || i2 == 3) && r6.m9643() == C1696.C1697.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            z = true;
            int i6 = this.f7316;
            if (i6 == 0 || i6 == 1 ? this.f8828.m9625() == C1696.C1697.WRAP_CONTENT : this.f8828.m9643() == C1696.C1697.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.f9761; i7++) {
                C1696 r7 = this.f9760[i7];
                if (this.f7317 || r7.m9649()) {
                    C1294 r8 = r13.m8743((Object) r7.f8826[this.f7316]);
                    C1625[] r72 = r7.f8826;
                    int i8 = this.f7316;
                    r72[i8].f8550 = r8;
                    if (i8 == 0 || i8 == 2) {
                        C1294 r9 = r0.f8550;
                        C1123 r10 = r13.m8752();
                        C1294 r11 = r13.m8742();
                        r11.f7256 = 0;
                        r10.m7549(r9, r8, r11, 0);
                        if (z) {
                            int r73 = (int) (r10.f6636.m6797(r11) * -1.0f);
                            r10.f6636.m6802(r13.m8750(1), (float) r73);
                        }
                        r13.m8751(r10);
                    } else {
                        C1294 r92 = r0.f8550;
                        C1123 r102 = r13.m8752();
                        C1294 r112 = r13.m8742();
                        r112.f7256 = 0;
                        r102.m7548(r92, r8, r112, 0);
                        if (z) {
                            int r74 = (int) (r102.f6636.m6797(r112) * -1.0f);
                            r102.f6636.m6802(r13.m8750(1), (float) r74);
                        }
                        r13.m8751(r102);
                    }
                }
            }
            int i9 = this.f7316;
            if (i9 == 0) {
                r13.m8746(this.f8816.f8550, this.f8813.f8550, 0, 6);
                if (!z) {
                    r13.m8746(this.f8813.f8550, this.f8828.f8816.f8550, 0, 5);
                }
            } else if (i9 == 1) {
                r13.m8746(this.f8813.f8550, this.f8816.f8550, 0, 6);
                if (!z) {
                    r13.m8746(this.f8813.f8550, this.f8828.f8813.f8550, 0, 5);
                }
            } else if (i9 == 2) {
                r13.m8746(this.f8840.f8550, this.f8812.f8550, 0, 6);
                if (!z) {
                    r13.m8746(this.f8812.f8550, this.f8828.f8840.f8550, 0, 5);
                }
            } else if (i9 == 3) {
                r13.m8746(this.f8812.f8550, this.f8840.f8550, 0, 6);
                if (!z) {
                    r13.m8746(this.f8812.f8550, this.f8828.f8812.f8550, 0, 5);
                }
            }
        }
    }
}
