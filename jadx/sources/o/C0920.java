package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.ǃЈ  reason: contains not printable characters */
public final class C0920 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Comparator<If> f5811 = new Comparator<If>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            If ifR = (If) obj;
            If ifR2 = (If) obj2;
            int i = ifR.f5814 - ifR2.f5814;
            return i == 0 ? ifR.f5813 - ifR2.f5813 : i;
        }
    };

    /* renamed from: o.ǃЈ$ı  reason: contains not printable characters */
    public static abstract class C0921 {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Cif m6749(C0921 r15) {
        int oldListSize = r15.getOldListSize();
        int newListSize = r15.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0923(oldListSize, newListSize));
        int abs = Math.abs(oldListSize - newListSize) + oldListSize + newListSize;
        int i = abs << 1;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0923 r14 = (C0923) arrayList2.remove(arrayList2.size() - 1);
            If r5 = m6748(r15, r14.f5828, r14.f5829, r14.f5827, r14.f5830, iArr, iArr2, abs);
            if (r5 != null) {
                if (r5.f5812 > 0) {
                    arrayList.add(r5);
                }
                r5.f5814 += r14.f5828;
                r5.f5813 += r14.f5827;
                C0923 r6 = arrayList3.isEmpty() ? new C0923() : (C0923) arrayList3.remove(arrayList3.size() - 1);
                r6.f5828 = r14.f5828;
                r6.f5827 = r14.f5827;
                if (r5.f5815) {
                    r6.f5829 = r5.f5814;
                    r6.f5830 = r5.f5813;
                } else if (r5.f5816) {
                    r6.f5829 = r5.f5814 - 1;
                    r6.f5830 = r5.f5813;
                } else {
                    r6.f5829 = r5.f5814;
                    r6.f5830 = r5.f5813 - 1;
                }
                arrayList2.add(r6);
                if (!r5.f5815) {
                    r14.f5828 = r5.f5814 + r5.f5812;
                    r14.f5827 = r5.f5813 + r5.f5812;
                } else if (r5.f5816) {
                    r14.f5828 = r5.f5814 + r5.f5812 + 1;
                    r14.f5827 = r5.f5813 + r5.f5812;
                } else {
                    r14.f5828 = r5.f5814 + r5.f5812;
                    r14.f5827 = r5.f5813 + r5.f5812 + 1;
                }
                arrayList2.add(r14);
            } else {
                arrayList3.add(r14);
            }
        }
        Collections.sort(arrayList, f5811);
        return new Cif(r15, arrayList, iArr, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r7]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c A[LOOP:1: B:10:0x0033->B:33:0x009c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.C0920.If m6748(o.C0920.C0921 r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            if (r3 <= 0) goto L_0x0133
            if (r4 > 0) goto L_0x0010
            goto L_0x0133
        L_0x0010:
            int r5 = r3 - r4
            int r6 = r3 + r4
            r7 = 1
            int r6 = r6 + r7
            int r6 = r6 / 2
            int r8 = r26 - r6
            int r8 = r8 - r7
            int r9 = r26 + r6
            int r9 = r9 + r7
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r5
            int r9 = r9 + r5
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r5 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r6) goto L_0x012b
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a2
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r7
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r7
            r13 = r1[r13]
            int r13 = r13 + r7
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r7
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r7 = r22 + r15
            boolean r7 = r0.areItemsTheSame(r10, r7)
            if (r7 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r7 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r7 = r26 + r12
            r1[r7] = r13
            if (r8 == 0) goto L_0x009c
            int r10 = r5 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009c
            int r10 = r5 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009c
            r10 = r1[r7]
            r13 = r2[r7]
            if (r10 < r13) goto L_0x009c
            o.ǃЈ$If r0 = new o.ǃЈ$If
            r0.<init>()
            r3 = r2[r7]
            r0.f5814 = r3
            int r3 = r0.f5814
            int r3 = r3 - r12
            r0.f5813 = r3
            r1 = r1[r7]
            r2 = r2[r7]
            int r1 = r1 - r2
            r0.f5812 = r1
            r0.f5816 = r14
            r7 = 0
            r0.f5815 = r7
            return r0
        L_0x009c:
            r7 = 0
            int r12 = r12 + 2
            r7 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a2:
            r7 = 0
            r10 = r11
        L_0x00a4:
            if (r10 > r9) goto L_0x0120
            int r12 = r10 + r5
            int r13 = r9 + r5
            if (r12 == r13) goto L_0x00c6
            int r13 = r11 + r5
            if (r12 == r13) goto L_0x00bd
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r2[r14]
            r15 = 1
            int r13 = r13 + r15
            r13 = r2[r13]
            if (r14 >= r13) goto L_0x00be
            goto L_0x00c7
        L_0x00bd:
            r15 = 1
        L_0x00be:
            int r13 = r26 + r12
            int r13 = r13 + r15
            r13 = r2[r13]
            int r13 = r13 - r15
            r14 = 1
            goto L_0x00cd
        L_0x00c6:
            r15 = 1
        L_0x00c7:
            int r13 = r26 + r12
            int r13 = r13 - r15
            r13 = r2[r13]
            r14 = 0
        L_0x00cd:
            int r16 = r13 - r12
        L_0x00cf:
            if (r13 <= 0) goto L_0x00ec
            if (r16 <= 0) goto L_0x00ec
            int r17 = r20 + r13
            int r7 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.areItemsTheSame(r7, r3)
            if (r3 == 0) goto L_0x00ee
            int r13 = r13 + -1
            int r16 = r16 + -1
            r3 = r18
            r7 = 0
            r15 = 1
            goto L_0x00cf
        L_0x00ec:
            r18 = r3
        L_0x00ee:
            int r3 = r26 + r12
            r2[r3] = r13
            if (r8 != 0) goto L_0x0119
            if (r12 < r11) goto L_0x0119
            if (r12 > r9) goto L_0x0119
            r7 = r1[r3]
            r13 = r2[r3]
            if (r7 < r13) goto L_0x0119
            o.ǃЈ$If r0 = new o.ǃЈ$If
            r0.<init>()
            r4 = r2[r3]
            r0.f5814 = r4
            int r4 = r0.f5814
            int r4 = r4 - r12
            r0.f5813 = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f5812 = r1
            r0.f5816 = r14
            r3 = 1
            r0.f5815 = r3
            return r0
        L_0x0119:
            r3 = 1
            int r10 = r10 + 2
            r3 = r18
            r7 = 0
            goto L_0x00a4
        L_0x0120:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r7 = 1
            r10 = 0
            goto L_0x002f
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0920.m6748(o.ǃЈ$ı, int, int, int, int, int[], int[], int):o.ǃЈ$If");
    }

    /* renamed from: o.ǃЈ$If */
    public static class If {

        /* renamed from: ı  reason: contains not printable characters */
        public int f5812;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f5813;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f5814;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f5815;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f5816;

        If() {
        }
    }

    /* renamed from: o.ǃЈ$ɩ  reason: contains not printable characters */
    static class C0923 {

        /* renamed from: ı  reason: contains not printable characters */
        int f5827;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f5828;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f5829;

        /* renamed from: Ι  reason: contains not printable characters */
        int f5830;

        public C0923() {
        }

        public C0923(int i, int i2) {
            this.f5828 = 0;
            this.f5829 = i;
            this.f5827 = 0;
            this.f5830 = i2;
        }
    }

    /* renamed from: o.ǃЈ$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public final int f5817;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final int f5818;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int[] f5819;

        /* renamed from: ɹ  reason: contains not printable characters */
        private final int[] f5820;

        /* renamed from: Ι  reason: contains not printable characters */
        public final List<If> f5821;

        /* renamed from: ι  reason: contains not printable characters */
        public final C0921 f5822;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private final boolean f5823 = true;

        Cif(C0921 r1, List<If> list, int[] iArr, int[] iArr2) {
            this.f5821 = list;
            this.f5819 = iArr;
            this.f5820 = iArr2;
            Arrays.fill(this.f5819, 0);
            Arrays.fill(this.f5820, 0);
            this.f5822 = r1;
            this.f5818 = r1.getOldListSize();
            this.f5817 = r1.getNewListSize();
            If ifR = this.f5821.isEmpty() ? null : this.f5821.get(0);
            if (!(ifR != null && ifR.f5814 == 0 && ifR.f5813 == 0)) {
                If ifR2 = new If();
                ifR2.f5814 = 0;
                ifR2.f5813 = 0;
                ifR2.f5816 = false;
                ifR2.f5812 = 0;
                ifR2.f5815 = false;
                this.f5821.add(0, ifR2);
            }
            m6750();
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m6750() {
            int i = this.f5818;
            int i2 = this.f5817;
            for (int size = this.f5821.size() - 1; size >= 0; size--) {
                If ifR = this.f5821.get(size);
                int i3 = ifR.f5814 + ifR.f5812;
                int i4 = ifR.f5813 + ifR.f5812;
                if (this.f5823) {
                    while (i > i3) {
                        if (this.f5819[i - 1] == 0) {
                            m6752(i, i2, size, false);
                        }
                        i--;
                    }
                    while (i2 > i4) {
                        if (this.f5820[i2 - 1] == 0) {
                            m6752(i, i2, size, true);
                        }
                        i2--;
                    }
                }
                for (int i5 = 0; i5 < ifR.f5812; i5++) {
                    int i6 = ifR.f5814 + i5;
                    int i7 = ifR.f5813 + i5;
                    int i8 = this.f5822.areContentsTheSame(i6, i7) ? 1 : 2;
                    this.f5819[i6] = (i7 << 5) | i8;
                    this.f5820[i7] = (i6 << 5) | i8;
                }
                i = ifR.f5814;
                i2 = ifR.f5813;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        private boolean m6752(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                int i6 = i2 - 1;
                i2--;
                i4 = i6;
                i5 = i;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                If ifR = this.f5821.get(i3);
                int i7 = ifR.f5814 + ifR.f5812;
                int i8 = ifR.f5813 + ifR.f5812;
                int i9 = 8;
                if (!z) {
                    while (true) {
                        i2--;
                        if (i2 < i8) {
                            continue;
                            break;
                        } else if (this.f5822.areItemsTheSame(i4, i2)) {
                            if (!this.f5822.areContentsTheSame(i4, i2)) {
                                i9 = 4;
                            }
                            int i10 = i - 1;
                            this.f5819[i10] = (i2 << 5) | 16;
                            this.f5820[i2] = (i10 << 5) | i9;
                            return true;
                        }
                    }
                } else {
                    for (int i11 = i5 - 1; i11 >= i7; i11--) {
                        if (this.f5822.areItemsTheSame(i11, i4)) {
                            if (!this.f5822.areContentsTheSame(i11, i4)) {
                                i9 = 4;
                            }
                            this.f5820[i4] = (i11 << 5) | 16;
                            this.f5819[i11] = (i4 << 5) | i9;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = ifR.f5814;
                i2 = ifR.f5813;
                i3--;
            }
            return false;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private static C0922 m6751(List<C0922> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0922 r2 = list.get(size);
                if (r2.f5825 == i && r2.f5824 == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f5826 += z ? 1 : -1;
                        size++;
                    }
                    return r2;
                }
                size--;
            }
            return null;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m6754(List<C0922> list, C0970 r8, int i, int i2, int i3) {
            if (!this.f5823) {
                r8.onInserted(i, i2);
                return;
            }
            while (true) {
                i2--;
                if (i2 >= 0) {
                    int i4 = i3 + i2;
                    int i5 = this.f5820[i4] & 31;
                    if (i5 == 0) {
                        r8.onInserted(i, 1);
                        for (C0922 r1 : list) {
                            r1.f5826++;
                        }
                    } else if (i5 == 4 || i5 == 8) {
                        int i6 = this.f5820[i4] >> 5;
                        r8.onMoved(m6751(list, i6, true).f5826, i);
                        if (i5 == 4) {
                            r8.onChanged(i, 1, this.f5822.getChangePayload(i6, i4));
                        }
                    } else if (i5 == 16) {
                        list.add(new C0922(i4, i, false));
                    } else {
                        StringBuilder sb = new StringBuilder("unknown flag for pos ");
                        sb.append(i4);
                        sb.append(" ");
                        sb.append(Long.toBinaryString((long) i5));
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m6753(List<C0922> list, C0970 r10, int i, int i2, int i3) {
            if (!this.f5823) {
                r10.onRemoved(i, i2);
                return;
            }
            while (true) {
                i2--;
                if (i2 >= 0) {
                    int i4 = i3 + i2;
                    int i5 = this.f5819[i4] & 31;
                    if (i5 == 0) {
                        r10.onRemoved(i + i2, 1);
                        for (C0922 r1 : list) {
                            r1.f5826--;
                        }
                    } else if (i5 == 4 || i5 == 8) {
                        int i6 = this.f5819[i4] >> 5;
                        C0922 r5 = m6751(list, i6, false);
                        r10.onMoved(i + i2, r5.f5826 - 1);
                        if (i5 == 4) {
                            r10.onChanged(r5.f5826 - 1, 1, this.f5822.getChangePayload(i4, i6));
                        }
                    } else if (i5 == 16) {
                        list.add(new C0922(i4, i + i2, true));
                    } else {
                        StringBuilder sb = new StringBuilder("unknown flag for pos ");
                        sb.append(i4);
                        sb.append(" ");
                        sb.append(Long.toBinaryString((long) i5));
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: o.ǃЈ$ǃ  reason: contains not printable characters */
    static class C0922 {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f5824;

        /* renamed from: Ι  reason: contains not printable characters */
        int f5825;

        /* renamed from: ι  reason: contains not printable characters */
        int f5826;

        public C0922(int i, int i2, boolean z) {
            this.f5825 = i;
            this.f5826 = i2;
            this.f5824 = z;
        }
    }
}
