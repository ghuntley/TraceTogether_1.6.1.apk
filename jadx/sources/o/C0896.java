package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import o.C0929;
import o.C2317;

/* renamed from: o.ǃǀ  reason: contains not printable characters */
public class C0896 implements C0929.Cif {

    /* renamed from: ı  reason: contains not printable characters */
    public final ArrayList<C0897> f5728;

    /* renamed from: ǃ  reason: contains not printable characters */
    final boolean f5729;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C0929 f5730;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f5731;

    /* renamed from: Ι  reason: contains not printable characters */
    final Cif f5732;

    /* renamed from: ι  reason: contains not printable characters */
    public final ArrayList<C0897> f5733;

    /* renamed from: і  reason: contains not printable characters */
    private C2317.If<C0897> f5734;

    /* renamed from: o.ǃǀ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ı  reason: contains not printable characters */
        RecyclerView.con m6659(int i);

        /* renamed from: ı  reason: contains not printable characters */
        void m6660(int i, int i2);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m6661(int i, int i2);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m6662(C0897 r1);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m6663(int i, int i2);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m6664(int i, int i2, Object obj);

        /* renamed from: Ι  reason: contains not printable characters */
        void m6665(int i, int i2);

        /* renamed from: Ι  reason: contains not printable characters */
        void m6666(C0897 r1);
    }

    public C0896(Cif ifVar) {
        this(ifVar, (byte) 0);
    }

    private C0896(Cif ifVar, byte b) {
        this.f5734 = new C2317.C2318(30);
        this.f5728 = new ArrayList<>();
        this.f5733 = new ArrayList<>();
        this.f5731 = 0;
        this.f5732 = ifVar;
        this.f5729 = false;
        this.f5730 = new C0929(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:180:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6658() {
        /*
            r16 = this;
            r0 = r16
            o.ǃґ r1 = r0.f5730
            java.util.ArrayList<o.ǃǀ$ǃ> r2 = r0.f5728
        L_0x0006:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x000d:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0023
            java.lang.Object r9 = r2.get(r3)
            o.ǃǀ$ǃ r9 = (o.C0896.C0897) r9
            int r9 = r9.f5737
            if (r9 != r7) goto L_0x001f
            if (r6 == 0) goto L_0x0020
            goto L_0x0024
        L_0x001f:
            r6 = 1
        L_0x0020:
            int r3 = r3 + -1
            goto L_0x000d
        L_0x0023:
            r3 = -1
        L_0x0024:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x0206
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            o.ǃǀ$ǃ r11 = (o.C0896.C0897) r11
            java.lang.Object r12 = r2.get(r7)
            o.ǃǀ$ǃ r12 = (o.C0896.C0897) r12
            int r13 = r12.f5737
            if (r13 == r4) goto L_0x01ce
            if (r13 == r9) goto L_0x00b2
            if (r13 == r6) goto L_0x0040
            goto L_0x0006
        L_0x0040:
            int r5 = r11.f5738
            int r8 = r12.f5735
            if (r5 >= r8) goto L_0x004c
            int r5 = r12.f5735
            int r5 = r5 - r4
            r12.f5735 = r5
            goto L_0x0065
        L_0x004c:
            int r5 = r11.f5738
            int r8 = r12.f5735
            int r9 = r12.f5738
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0065
            int r5 = r12.f5738
            int r5 = r5 - r4
            r12.f5738 = r5
            o.ǃґ$if r5 = r1.f5891
            int r8 = r11.f5735
            java.lang.Object r9 = r12.f5736
            o.ǃǀ$ǃ r5 = r5.m6772(r6, r8, r4, r9)
            goto L_0x0066
        L_0x0065:
            r5 = r10
        L_0x0066:
            int r8 = r11.f5735
            int r9 = r12.f5735
            if (r8 > r9) goto L_0x0072
            int r6 = r12.f5735
            int r6 = r6 + r4
            r12.f5735 = r6
            goto L_0x0093
        L_0x0072:
            int r8 = r11.f5735
            int r9 = r12.f5735
            int r13 = r12.f5738
            int r9 = r9 + r13
            if (r8 >= r9) goto L_0x0093
            int r8 = r12.f5735
            int r9 = r12.f5738
            int r8 = r8 + r9
            int r9 = r11.f5735
            int r8 = r8 - r9
            o.ǃґ$if r9 = r1.f5891
            int r10 = r11.f5735
            int r10 = r10 + r4
            java.lang.Object r4 = r12.f5736
            o.ǃǀ$ǃ r10 = r9.m6772(r6, r10, r8, r4)
            int r4 = r12.f5738
            int r4 = r4 - r8
            r12.f5738 = r4
        L_0x0093:
            r2.set(r7, r11)
            int r4 = r12.f5738
            if (r4 <= 0) goto L_0x009e
            r2.set(r3, r12)
            goto L_0x00a6
        L_0x009e:
            r2.remove(r3)
            o.ǃґ$if r4 = r1.f5891
            r4.m6771(r12)
        L_0x00a6:
            if (r5 == 0) goto L_0x00ab
            r2.add(r3, r5)
        L_0x00ab:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x00b2:
            int r6 = r11.f5735
            int r8 = r11.f5738
            if (r6 >= r8) goto L_0x00cc
            int r6 = r12.f5735
            int r8 = r11.f5735
            if (r6 != r8) goto L_0x00c9
            int r6 = r12.f5738
            int r8 = r11.f5738
            int r13 = r11.f5735
            int r8 = r8 - r13
            if (r6 != r8) goto L_0x00c9
            r5 = 1
            goto L_0x00ca
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            r6 = 0
            goto L_0x00e0
        L_0x00cc:
            int r6 = r12.f5735
            int r8 = r11.f5738
            int r8 = r8 + r4
            if (r6 != r8) goto L_0x00de
            int r6 = r12.f5738
            int r8 = r11.f5735
            int r13 = r11.f5738
            int r8 = r8 - r13
            if (r6 != r8) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            r6 = 1
        L_0x00e0:
            int r8 = r11.f5738
            int r13 = r12.f5735
            if (r8 >= r13) goto L_0x00ec
            int r8 = r12.f5735
            int r8 = r8 - r4
            r12.f5735 = r8
            goto L_0x010c
        L_0x00ec:
            int r8 = r11.f5738
            int r13 = r12.f5735
            int r14 = r12.f5738
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x010c
            int r3 = r12.f5738
            int r3 = r3 - r4
            r12.f5738 = r3
            r11.f5737 = r9
            r11.f5738 = r4
            int r3 = r12.f5738
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            o.ǃґ$if r3 = r1.f5891
            r3.m6771(r12)
            goto L_0x0006
        L_0x010c:
            int r8 = r11.f5735
            int r13 = r12.f5735
            if (r8 > r13) goto L_0x0118
            int r8 = r12.f5735
            int r8 = r8 + r4
            r12.f5735 = r8
            goto L_0x0139
        L_0x0118:
            int r8 = r11.f5735
            int r13 = r12.f5735
            int r14 = r12.f5738
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x0139
            int r8 = r12.f5735
            int r13 = r12.f5738
            int r8 = r8 + r13
            int r13 = r11.f5735
            int r8 = r8 - r13
            o.ǃґ$if r13 = r1.f5891
            int r14 = r11.f5735
            int r14 = r14 + r4
            o.ǃǀ$ǃ r10 = r13.m6772(r9, r14, r8, r10)
            int r4 = r11.f5735
            int r8 = r12.f5735
            int r4 = r4 - r8
            r12.f5738 = r4
        L_0x0139:
            if (r5 == 0) goto L_0x0148
            r2.set(r3, r12)
            r2.remove(r7)
            o.ǃґ$if r3 = r1.f5891
            r3.m6771(r11)
            goto L_0x0006
        L_0x0148:
            if (r6 == 0) goto L_0x0181
            if (r10 == 0) goto L_0x0166
            int r4 = r11.f5735
            int r5 = r10.f5735
            if (r4 <= r5) goto L_0x0159
            int r4 = r11.f5735
            int r5 = r10.f5738
            int r4 = r4 - r5
            r11.f5735 = r4
        L_0x0159:
            int r4 = r11.f5738
            int r5 = r10.f5735
            if (r4 <= r5) goto L_0x0166
            int r4 = r11.f5738
            int r5 = r10.f5738
            int r4 = r4 - r5
            r11.f5738 = r4
        L_0x0166:
            int r4 = r11.f5735
            int r5 = r12.f5735
            if (r4 <= r5) goto L_0x0173
            int r4 = r11.f5735
            int r5 = r12.f5738
            int r4 = r4 - r5
            r11.f5735 = r4
        L_0x0173:
            int r4 = r11.f5738
            int r5 = r12.f5735
            if (r4 <= r5) goto L_0x01b7
            int r4 = r11.f5738
            int r5 = r12.f5738
            int r4 = r4 - r5
            r11.f5738 = r4
            goto L_0x01b7
        L_0x0181:
            if (r10 == 0) goto L_0x019d
            int r4 = r11.f5735
            int r5 = r10.f5735
            if (r4 < r5) goto L_0x0190
            int r4 = r11.f5735
            int r5 = r10.f5738
            int r4 = r4 - r5
            r11.f5735 = r4
        L_0x0190:
            int r4 = r11.f5738
            int r5 = r10.f5735
            if (r4 < r5) goto L_0x019d
            int r4 = r11.f5738
            int r5 = r10.f5738
            int r4 = r4 - r5
            r11.f5738 = r4
        L_0x019d:
            int r4 = r11.f5735
            int r5 = r12.f5735
            if (r4 < r5) goto L_0x01aa
            int r4 = r11.f5735
            int r5 = r12.f5738
            int r4 = r4 - r5
            r11.f5735 = r4
        L_0x01aa:
            int r4 = r11.f5738
            int r5 = r12.f5735
            if (r4 < r5) goto L_0x01b7
            int r4 = r11.f5738
            int r5 = r12.f5738
            int r4 = r4 - r5
            r11.f5738 = r4
        L_0x01b7:
            r2.set(r3, r12)
            int r4 = r11.f5735
            int r5 = r11.f5738
            if (r4 == r5) goto L_0x01c4
            r2.set(r7, r11)
            goto L_0x01c7
        L_0x01c4:
            r2.remove(r7)
        L_0x01c7:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x01ce:
            int r4 = r11.f5738
            int r6 = r12.f5735
            if (r4 >= r6) goto L_0x01d6
            r5 = -1
            goto L_0x01d7
        L_0x01d6:
            r5 = 0
        L_0x01d7:
            int r4 = r11.f5735
            int r6 = r12.f5735
            if (r4 >= r6) goto L_0x01df
            int r5 = r5 + 1
        L_0x01df:
            int r4 = r12.f5735
            int r6 = r11.f5735
            if (r4 > r6) goto L_0x01ec
            int r4 = r11.f5735
            int r6 = r12.f5738
            int r4 = r4 + r6
            r11.f5735 = r4
        L_0x01ec:
            int r4 = r12.f5735
            int r6 = r11.f5738
            if (r4 > r6) goto L_0x01f9
            int r4 = r11.f5738
            int r6 = r12.f5738
            int r4 = r4 + r6
            r11.f5738 = r4
        L_0x01f9:
            int r4 = r12.f5735
            int r4 = r4 + r5
            r12.f5735 = r4
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x0206:
            java.util.ArrayList<o.ǃǀ$ǃ> r1 = r0.f5728
            int r1 = r1.size()
            r2 = 0
        L_0x020d:
            if (r2 >= r1) goto L_0x02ed
            java.util.ArrayList<o.ǃǀ$ǃ> r3 = r0.f5728
            java.lang.Object r3 = r3.get(r2)
            o.ǃǀ$ǃ r3 = (o.C0896.C0897) r3
            int r11 = r3.f5737
            if (r11 == r4) goto L_0x02e6
            if (r11 == r9) goto L_0x0287
            if (r11 == r6) goto L_0x0228
            if (r11 == r7) goto L_0x0223
            goto L_0x02e9
        L_0x0223:
            r0.m6646((o.C0896.C0897) r3)
            goto L_0x02e9
        L_0x0228:
            int r11 = r3.f5735
            int r12 = r3.f5735
            int r13 = r3.f5738
            int r12 = r12 + r13
            int r13 = r3.f5735
            r15 = r11
            r11 = 0
            r14 = -1
        L_0x0234:
            if (r13 >= r12) goto L_0x0266
            o.ǃǀ$if r5 = r0.f5732
            androidx.recyclerview.widget.RecyclerView$con r5 = r5.m6659(r13)
            if (r5 != 0) goto L_0x0254
            boolean r5 = r0.m6647((int) r13)
            if (r5 == 0) goto L_0x0245
            goto L_0x0254
        L_0x0245:
            if (r14 != r4) goto L_0x0252
            java.lang.Object r5 = r3.f5736
            o.ǃǀ$ǃ r5 = r0.m6656(r6, r15, r11, r5)
            r0.m6646((o.C0896.C0897) r5)
            r15 = r13
            r11 = 0
        L_0x0252:
            r14 = 0
            goto L_0x0262
        L_0x0254:
            if (r14 != 0) goto L_0x0261
            java.lang.Object r5 = r3.f5736
            o.ǃǀ$ǃ r5 = r0.m6656(r6, r15, r11, r5)
            r0.m6649(r5)
            r15 = r13
            r11 = 0
        L_0x0261:
            r14 = 1
        L_0x0262:
            int r11 = r11 + r4
            int r13 = r13 + 1
            goto L_0x0234
        L_0x0266:
            int r5 = r3.f5738
            if (r11 == r5) goto L_0x027b
            java.lang.Object r5 = r3.f5736
            boolean r12 = r0.f5729
            if (r12 != 0) goto L_0x0277
            r3.f5736 = r10
            o.ІӀ$If<o.ǃǀ$ǃ> r12 = r0.f5734
            r12.m12091(r3)
        L_0x0277:
            o.ǃǀ$ǃ r3 = r0.m6656(r6, r15, r11, r5)
        L_0x027b:
            if (r14 != 0) goto L_0x0282
            r0.m6649(r3)
            goto L_0x02e9
        L_0x0282:
            r0.m6646((o.C0896.C0897) r3)
            goto L_0x02e9
        L_0x0287:
            int r5 = r3.f5735
            int r11 = r3.f5735
            int r12 = r3.f5738
            int r11 = r11 + r12
            int r12 = r3.f5735
            r13 = 0
            r14 = -1
        L_0x0292:
            if (r12 >= r11) goto L_0x02c9
            o.ǃǀ$if r15 = r0.f5732
            androidx.recyclerview.widget.RecyclerView$con r15 = r15.m6659(r12)
            if (r15 != 0) goto L_0x02b1
            boolean r15 = r0.m6647((int) r12)
            if (r15 == 0) goto L_0x02a3
            goto L_0x02b1
        L_0x02a3:
            if (r14 != r4) goto L_0x02ae
            o.ǃǀ$ǃ r14 = r0.m6656(r9, r5, r13, r10)
            r0.m6646((o.C0896.C0897) r14)
            r14 = 1
            goto L_0x02af
        L_0x02ae:
            r14 = 0
        L_0x02af:
            r15 = 0
            goto L_0x02be
        L_0x02b1:
            if (r14 != 0) goto L_0x02bc
            o.ǃǀ$ǃ r14 = r0.m6656(r9, r5, r13, r10)
            r0.m6649(r14)
            r14 = 1
            goto L_0x02bd
        L_0x02bc:
            r14 = 0
        L_0x02bd:
            r15 = 1
        L_0x02be:
            if (r14 == 0) goto L_0x02c4
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x02c6
        L_0x02c4:
            int r13 = r13 + 1
        L_0x02c6:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0292
        L_0x02c9:
            int r11 = r3.f5738
            if (r13 == r11) goto L_0x02dc
            boolean r11 = r0.f5729
            if (r11 != 0) goto L_0x02d8
            r3.f5736 = r10
            o.ІӀ$If<o.ǃǀ$ǃ> r11 = r0.f5734
            r11.m12091(r3)
        L_0x02d8:
            o.ǃǀ$ǃ r3 = r0.m6656(r9, r5, r13, r10)
        L_0x02dc:
            if (r14 != 0) goto L_0x02e2
            r0.m6649(r3)
            goto L_0x02e9
        L_0x02e2:
            r0.m6646((o.C0896.C0897) r3)
            goto L_0x02e9
        L_0x02e6:
            r0.m6646((o.C0896.C0897) r3)
        L_0x02e9:
            int r2 = r2 + 1
            goto L_0x020d
        L_0x02ed:
            java.util.ArrayList<o.ǃǀ$ǃ> r1 = r0.f5728
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0896.m6658():void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6657() {
        int size = this.f5733.size();
        for (int i = 0; i < size; i++) {
            this.f5732.m6662(this.f5733.get(i));
        }
        m6653((List<C0897>) this.f5733);
        this.f5731 = 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6649(C0897 r14) {
        int i;
        if (r14.f5737 == 1 || r14.f5737 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int r0 = m6648(r14.f5735, r14.f5737);
        int i2 = r14.f5735;
        int i3 = r14.f5737;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(r14)));
        }
        int i4 = r0;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < r14.f5738; i7++) {
            int r9 = m6648(r14.f5735 + (i * i7), r14.f5737);
            int i8 = r14.f5737;
            if (i8 == 2 ? r9 == i4 : i8 == 4 && r9 == i4 + 1) {
                i6++;
            } else {
                C0897 r7 = m6656(r14.f5737, i4, i6, r14.f5736);
                m6650(r7, i5);
                if (!this.f5729) {
                    r7.f5736 = null;
                    this.f5734.m12091(r7);
                }
                if (r14.f5737 == 4) {
                    i5 += i6;
                }
                i4 = r9;
                i6 = 1;
            }
        }
        Object obj = r14.f5736;
        if (!this.f5729) {
            r14.f5736 = null;
            this.f5734.m12091(r14);
        }
        if (i6 > 0) {
            C0897 r142 = m6656(r14.f5737, i4, i6, obj);
            m6650(r142, i5);
            if (!this.f5729) {
                r142.f5736 = null;
                this.f5734.m12091(r142);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6650(C0897 r3, int i) {
        this.f5732.m6666(r3);
        int i2 = r3.f5737;
        if (i2 == 2) {
            this.f5732.m6663(i, r3.f5738);
        } else if (i2 == 4) {
            this.f5732.m6664(i, r3.f5738, r3.f5736);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m6648(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f5733.size() - 1; size >= 0; size--) {
            C0897 r3 = this.f5733.get(size);
            if (r3.f5737 == 8) {
                if (r3.f5735 < r3.f5738) {
                    i4 = r3.f5735;
                    i3 = r3.f5738;
                } else {
                    i4 = r3.f5738;
                    i3 = r3.f5735;
                }
                if (i < i4 || i > i3) {
                    if (i < r3.f5735) {
                        if (i2 == 1) {
                            r3.f5735++;
                            r3.f5738++;
                        } else if (i2 == 2) {
                            r3.f5735--;
                            r3.f5738--;
                        }
                    }
                } else if (i4 == r3.f5735) {
                    if (i2 == 1) {
                        r3.f5738++;
                    } else if (i2 == 2) {
                        r3.f5738--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        r3.f5735++;
                    } else if (i2 == 2) {
                        r3.f5735--;
                    }
                    i--;
                }
            } else if (r3.f5735 <= i) {
                if (r3.f5737 == 1) {
                    i -= r3.f5738;
                } else if (r3.f5737 == 2) {
                    i += r3.f5738;
                }
            } else if (i2 == 1) {
                r3.f5735++;
            } else if (i2 == 2) {
                r3.f5735--;
            }
        }
        for (int size2 = this.f5733.size() - 1; size2 >= 0; size2--) {
            C0897 r0 = this.f5733.get(size2);
            if (r0.f5737 == 8) {
                if (r0.f5738 == r0.f5735 || r0.f5738 < 0) {
                    this.f5733.remove(size2);
                    if (!this.f5729) {
                        r0.f5736 = null;
                        this.f5734.m12091(r0);
                    }
                }
            } else if (r0.f5738 <= 0) {
                this.f5733.remove(size2);
                if (!this.f5729) {
                    r0.f5736 = null;
                    this.f5734.m12091(r0);
                }
            }
        }
        return i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m6647(int i) {
        int size = this.f5733.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0897 r3 = this.f5733.get(i2);
            if (r3.f5737 == 8) {
                if (m6651(r3.f5738, i2 + 1) == i) {
                    return true;
                }
            } else if (r3.f5737 == 1) {
                int i3 = r3.f5735 + r3.f5738;
                for (int i4 = r3.f5735; i4 < i3; i4++) {
                    if (m6651(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6646(C0897 r4) {
        this.f5733.add(r4);
        int i = r4.f5737;
        if (i == 1) {
            this.f5732.m6665(r4.f5735, r4.f5738);
        } else if (i == 2) {
            this.f5732.m6660(r4.f5735, r4.f5738);
        } else if (i == 4) {
            this.f5732.m6664(r4.f5735, r4.f5738, r4.f5736);
        } else if (i == 8) {
            this.f5732.m6661(r4.f5735, r4.f5738);
        } else {
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(r4)));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m6655(int i) {
        return m6651(i, 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m6651(int i, int i2) {
        int size = this.f5733.size();
        while (i2 < size) {
            C0897 r1 = this.f5733.get(i2);
            if (r1.f5737 == 8) {
                if (r1.f5735 == i) {
                    i = r1.f5738;
                } else {
                    if (r1.f5735 < i) {
                        i--;
                    }
                    if (r1.f5738 <= i) {
                        i++;
                    }
                }
            } else if (r1.f5735 > i) {
                continue;
            } else if (r1.f5737 == 2) {
                if (i < r1.f5735 + r1.f5738) {
                    return -1;
                }
                i -= r1.f5738;
            } else if (r1.f5737 == 1) {
                i += r1.f5738;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6652() {
        m6657();
        int size = this.f5728.size();
        for (int i = 0; i < size; i++) {
            C0897 r3 = this.f5728.get(i);
            int i2 = r3.f5737;
            if (i2 == 1) {
                this.f5732.m6662(r3);
                this.f5732.m6665(r3.f5735, r3.f5738);
            } else if (i2 == 2) {
                this.f5732.m6662(r3);
                this.f5732.m6663(r3.f5735, r3.f5738);
            } else if (i2 == 4) {
                this.f5732.m6662(r3);
                this.f5732.m6664(r3.f5735, r3.f5738, r3.f5736);
            } else if (i2 == 8) {
                this.f5732.m6662(r3);
                this.f5732.m6661(r3.f5735, r3.f5738);
            }
        }
        m6653((List<C0897>) this.f5728);
        this.f5731 = 0;
    }

    /* renamed from: o.ǃǀ$ǃ  reason: contains not printable characters */
    public static class C0897 {

        /* renamed from: ı  reason: contains not printable characters */
        public int f5735;

        /* renamed from: ǃ  reason: contains not printable characters */
        Object f5736;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f5737;

        /* renamed from: ι  reason: contains not printable characters */
        public int f5738;

        C0897(int i, int i2, int i3, Object obj) {
            this.f5737 = i;
            this.f5735 = i2;
            this.f5738 = i3;
            this.f5736 = obj;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f5737;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f5735);
            sb.append("c:");
            sb.append(this.f5738);
            sb.append(",p:");
            sb.append(this.f5736);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0897 r5 = (C0897) obj;
            int i = this.f5737;
            if (i != r5.f5737) {
                return false;
            }
            if (i == 8 && Math.abs(this.f5738 - this.f5735) == 1 && this.f5738 == r5.f5735 && this.f5735 == r5.f5738) {
                return true;
            }
            if (this.f5738 != r5.f5738 || this.f5735 != r5.f5735) {
                return false;
            }
            Object obj2 = this.f5736;
            if (obj2 != null) {
                if (!obj2.equals(r5.f5736)) {
                    return false;
                }
            } else if (r5.f5736 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f5737 * 31) + this.f5735) * 31) + this.f5738;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0897 m6656(int i, int i2, int i3, Object obj) {
        C0897 r0 = this.f5734.m12090();
        if (r0 == null) {
            return new C0897(i, i2, i3, obj);
        }
        r0.f5737 = i;
        r0.f5735 = i2;
        r0.f5738 = i3;
        r0.f5736 = obj;
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6654(C0897 r2) {
        if (!this.f5729) {
            r2.f5736 = null;
            this.f5734.m12091(r2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6653(List<C0897> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0897 r2 = list.get(i);
            if (!this.f5729) {
                r2.f5736 = null;
                this.f5734.m12091(r2);
            }
        }
        list.clear();
    }
}
