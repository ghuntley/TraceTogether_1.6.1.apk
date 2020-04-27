package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class jN extends AbstractList<jM> implements RandomAccess {

    /* renamed from: ǃ  reason: contains not printable characters */
    final int[] f2427;

    /* renamed from: Ι  reason: contains not printable characters */
    final jM[] f2428;

    private jN(jM[] jMVarArr, int[] iArr) {
        this.f2428 = jMVarArr;
        this.f2427 = iArr;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static jN m2968(jM... jMVarArr) {
        boolean z = false;
        if (jMVarArr.length == 0) {
            return new jN(new jM[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(jMVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, jMVarArr[i2]), Integer.valueOf(i2));
        }
        if (((jM) arrayList.get(0)).m2967() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                jM jMVar = (jM) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    jM jMVar2 = (jM) arrayList.get(i5);
                    if (!jMVar2.m2963(0, jMVar, 0, jMVar.m2967())) {
                        continue;
                        break;
                    } else if (jMVar2.m2967() == jMVar.m2967()) {
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(jMVar2)));
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            jH jHVar = new jH();
            m2969(0, jHVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int[] iArr = new int[((int) (jHVar.f2411 / 4))];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                iArr[i6] = jHVar.m2897();
            }
            if (jHVar.f2411 == 0) {
                z = true;
            }
            if (z) {
                return new jN((jM[]) jMVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m2969(long j, jH jHVar, int i, List<jM> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        jH jHVar2;
        jH jHVar3 = jHVar;
        int i7 = i;
        List<jM> list3 = list;
        int i8 = i2;
        int i9 = i3;
        List<Integer> list4 = list2;
        if (i8 < i9) {
            int i10 = i8;
            while (i10 < i9) {
                if (list3.get(i10).m2967() >= i7) {
                    i10++;
                } else {
                    throw new AssertionError();
                }
            }
            jM jMVar = list.get(i2);
            jM jMVar2 = list3.get(i9 - 1);
            int i11 = -1;
            if (i7 == jMVar.m2967()) {
                i11 = list4.get(i8).intValue();
                i8++;
                jMVar = list3.get(i8);
            }
            int i12 = i8;
            long j2 = 4;
            if (jMVar.m2956(i7) != jMVar2.m2956(i7)) {
                int i13 = 1;
                for (int i14 = i12 + 1; i14 < i9; i14++) {
                    if (list3.get(i14 - 1).m2956(i7) != list3.get(i14).m2956(i7)) {
                        i13++;
                    }
                }
                long j3 = j + ((long) ((int) (jHVar3.f2411 / 4))) + 2 + ((long) (i13 << 1));
                jHVar3.m2869(i13);
                jHVar3.m2869(i11);
                for (int i15 = i12; i15 < i9; i15++) {
                    byte r3 = list3.get(i15).m2956(i7);
                    if (i15 == i12 || r3 != list3.get(i15 - 1).m2956(i7)) {
                        jHVar3.m2869((int) r3 & 255);
                    }
                }
                jH jHVar4 = new jH();
                int i16 = i12;
                while (i16 < i9) {
                    byte r2 = list3.get(i16).m2956(i7);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= i9) {
                            i5 = i9;
                            break;
                        } else if (r2 != list3.get(i18).m2956(i7)) {
                            i5 = i18;
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i17 == i5 && i7 + 1 == list3.get(i16).m2967()) {
                        jHVar3.m2869(list4.get(i16).intValue());
                        i6 = i5;
                        jHVar2 = jHVar4;
                    } else {
                        jHVar3.m2869((int) ((((long) ((int) (jHVar4.f2411 / j2))) + j3) * -1));
                        i6 = i5;
                        jHVar2 = jHVar4;
                        m2969(j3, jHVar4, i7 + 1, list, i16, i5, list2);
                    }
                    jHVar4 = jHVar2;
                    i16 = i6;
                    j2 = 4;
                }
                jH jHVar5 = jHVar4;
                jHVar3.write(jHVar5, jHVar5.f2411);
                return;
            }
            int min = Math.min(jMVar.m2967(), jMVar2.m2967());
            int i19 = i7;
            int i20 = 0;
            while (i19 < min && jMVar.m2956(i19) == jMVar2.m2956(i19)) {
                i20++;
                i19++;
            }
            long j4 = 1 + j + ((long) ((int) (jHVar3.f2411 / 4))) + 2 + ((long) i20);
            jHVar3.m2869(-i20);
            jHVar3.m2869(i11);
            int i21 = i7;
            while (true) {
                i4 = i7 + i20;
                if (i21 >= i4) {
                    break;
                }
                jHVar3.m2869((int) jMVar.m2956(i21) & 255);
                i21++;
            }
            if (i12 + 1 != i9) {
                jH jHVar6 = new jH();
                jHVar3.m2869((int) ((((long) ((int) (jHVar6.f2411 / 4))) + j4) * -1));
                m2969(j4, jHVar6, i4, list, i12, i3, list2);
                jHVar3.write(jHVar6, jHVar6.f2411);
            } else if (i4 == list3.get(i12).m2967()) {
                jHVar3.m2869(list4.get(i12).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public final int size() {
        return this.f2428.length;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f2428[i];
    }
}
