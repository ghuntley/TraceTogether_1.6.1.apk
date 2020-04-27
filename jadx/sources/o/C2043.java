package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: o.ιІ  reason: contains not printable characters */
public final class C2043 {

    /* renamed from: ı  reason: contains not printable characters */
    public final int[] f10087 = {this.f10094, this.f10097};

    /* renamed from: Ɩ  reason: contains not printable characters */
    List<C1696> f10088 = new ArrayList();

    /* renamed from: ǃ  reason: contains not printable characters */
    List<C1696> f10089 = new ArrayList();

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean f10090 = false;

    /* renamed from: ɹ  reason: contains not printable characters */
    HashSet<C1696> f10091 = new HashSet<>();

    /* renamed from: Ι  reason: contains not printable characters */
    List<C1696> f10092 = new ArrayList();

    /* renamed from: ι  reason: contains not printable characters */
    public List<C1696> f10093;

    /* renamed from: І  reason: contains not printable characters */
    private int f10094 = -1;

    /* renamed from: і  reason: contains not printable characters */
    HashSet<C1696> f10095 = new HashSet<>();

    /* renamed from: Ӏ  reason: contains not printable characters */
    List<C1696> f10096 = new ArrayList();

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f10097 = -1;

    C2043(List<C1696> list) {
        this.f10093 = list;
    }

    C2043(List<C1696> list, byte b) {
        this.f10093 = list;
        this.f10090 = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10934(ArrayList<C1696> arrayList, C1696 r7) {
        C1696 r2;
        if (!r7.f8820) {
            arrayList.add(r7);
            r7.f8820 = true;
            if (!r7.m9658()) {
                if (r7 instanceof C1932) {
                    C1932 r0 = (C1932) r7;
                    int i = r0.f9761;
                    for (int i2 = 0; i2 < i; i2++) {
                        m10934(arrayList, r0.f9760[i2]);
                    }
                }
                for (C1625 r22 : r7.f8826) {
                    C1625 r23 = r22.f8549;
                    if (!(r23 == null || (r2 = r23.f8546) == r7.f8828)) {
                        m10934(arrayList, r2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10935(o.C1696 r9) {
        /*
            r8 = this;
            boolean r0 = r9.f8811
            if (r0 == 0) goto L_0x010c
            boolean r0 = r9.m9658()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            o.ʈ r0 = r9.f8816
            o.ʈ r0 = r0.f8549
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            o.ʈ r3 = r9.f8816
            o.ʈ r3 = r3.f8549
            goto L_0x0021
        L_0x001d:
            o.ʈ r3 = r9.f8813
            o.ʈ r3 = r3.f8549
        L_0x0021:
            r4 = 8
            if (r3 == 0) goto L_0x0051
            o.ʢ r5 = r3.f8546
            boolean r5 = r5.f8824
            if (r5 != 0) goto L_0x0030
            o.ʢ r5 = r3.f8546
            r8.m10935(r5)
        L_0x0030:
            o.ʈ$ı r5 = r3.f8548
            o.ʈ$ı r6 = o.C1625.C1626.RIGHT
            if (r5 != r6) goto L_0x0046
            o.ʢ r5 = r3.f8546
            int r5 = r5.f8857
            o.ʢ r3 = r3.f8546
            int r6 = r3.f8850
            if (r6 != r4) goto L_0x0042
            r3 = 0
            goto L_0x0044
        L_0x0042:
            int r3 = r3.f8827
        L_0x0044:
            int r3 = r3 + r5
            goto L_0x0052
        L_0x0046:
            o.ʈ$ı r5 = r3.f8548
            o.ʈ$ı r6 = o.C1625.C1626.LEFT
            if (r5 != r6) goto L_0x0051
            o.ʢ r3 = r3.f8546
            int r3 = r3.f8857
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x005c
            o.ʈ r0 = r9.f8816
            int r0 = r0.m9386()
            int r3 = r3 - r0
            goto L_0x006c
        L_0x005c:
            o.ʈ r0 = r9.f8813
            int r0 = r0.m9386()
            int r5 = r9.f8850
            if (r5 != r4) goto L_0x0068
            r5 = 0
            goto L_0x006a
        L_0x0068:
            int r5 = r9.f8827
        L_0x006a:
            int r0 = r0 + r5
            int r3 = r3 + r0
        L_0x006c:
            int r0 = r9.f8850
            if (r0 != r4) goto L_0x0072
            r0 = 0
            goto L_0x0074
        L_0x0072:
            int r0 = r9.f8827
        L_0x0074:
            int r0 = r3 - r0
            r9.m9652(r0, r3)
            o.ʈ r0 = r9.f8814
            o.ʈ r0 = r0.f8549
            if (r0 == 0) goto L_0x00a3
            o.ʈ r0 = r9.f8814
            o.ʈ r0 = r0.f8549
            o.ʢ r2 = r0.f8546
            boolean r2 = r2.f8824
            if (r2 != 0) goto L_0x008e
            o.ʢ r2 = r0.f8546
            r8.m10935(r2)
        L_0x008e:
            o.ʢ r2 = r0.f8546
            int r2 = r2.f8855
            o.ʢ r0 = r0.f8546
            int r0 = r0.f8835
            int r2 = r2 + r0
            int r0 = r9.f8835
            int r2 = r2 - r0
            int r0 = r9.f8836
            int r0 = r0 + r2
            r9.m9622(r2, r0)
            r9.f8824 = r1
            return
        L_0x00a3:
            o.ʈ r0 = r9.f8840
            o.ʈ r0 = r0.f8549
            if (r0 == 0) goto L_0x00ab
            r0 = 1
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            if (r0 == 0) goto L_0x00b3
            o.ʈ r5 = r9.f8840
            o.ʈ r5 = r5.f8549
            goto L_0x00b7
        L_0x00b3:
            o.ʈ r5 = r9.f8812
            o.ʈ r5 = r5.f8549
        L_0x00b7:
            if (r5 == 0) goto L_0x00e4
            o.ʢ r6 = r5.f8546
            boolean r6 = r6.f8824
            if (r6 != 0) goto L_0x00c4
            o.ʢ r6 = r5.f8546
            r8.m10935(r6)
        L_0x00c4:
            o.ʈ$ı r6 = r5.f8548
            o.ʈ$ı r7 = o.C1625.C1626.BOTTOM
            if (r6 != r7) goto L_0x00da
            o.ʢ r3 = r5.f8546
            int r3 = r3.f8855
            o.ʢ r5 = r5.f8546
            int r6 = r5.f8850
            if (r6 != r4) goto L_0x00d6
            r5 = 0
            goto L_0x00d8
        L_0x00d6:
            int r5 = r5.f8836
        L_0x00d8:
            int r3 = r3 + r5
            goto L_0x00e4
        L_0x00da:
            o.ʈ$ı r6 = r5.f8548
            o.ʈ$ı r7 = o.C1625.C1626.TOP
            if (r6 != r7) goto L_0x00e4
            o.ʢ r3 = r5.f8546
            int r3 = r3.f8855
        L_0x00e4:
            if (r0 == 0) goto L_0x00ee
            o.ʈ r0 = r9.f8840
            int r0 = r0.m9386()
            int r3 = r3 - r0
            goto L_0x00fe
        L_0x00ee:
            o.ʈ r0 = r9.f8812
            int r0 = r0.m9386()
            int r5 = r9.f8850
            if (r5 != r4) goto L_0x00fa
            r5 = 0
            goto L_0x00fc
        L_0x00fa:
            int r5 = r9.f8836
        L_0x00fc:
            int r0 = r0 + r5
            int r3 = r3 + r0
        L_0x00fe:
            int r0 = r9.f8850
            if (r0 != r4) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            int r2 = r9.f8836
        L_0x0105:
            int r0 = r3 - r2
            r9.m9622(r0, r3)
            r9.f8824 = r1
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2043.m10935(o.ʢ):void");
    }
}
