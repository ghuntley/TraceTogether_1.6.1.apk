package o;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C2477;

/* renamed from: o.Іƨ  reason: contains not printable characters */
final class C2225 {

    /* renamed from: ı  reason: contains not printable characters */
    private C2477.IF f10501;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2217 f10502;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f10503;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f10504;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Map<Integer, List<Long>> f10505;

    /* renamed from: Ι  reason: contains not printable characters */
    private BitSet f10506;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public BitSet f10507;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Map<Integer, Long> f10508;

    private C2225(C2217 r1, String str) {
        this.f10502 = r1;
        this.f10504 = str;
        this.f10503 = true;
        this.f10507 = new BitSet();
        this.f10506 = new BitSet();
        this.f10508 = new C0299();
        this.f10505 = new C0299();
    }

    private C2225(C2217 r1, String str, C2477.IF ifR, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f10502 = r1;
        this.f10504 = str;
        this.f10507 = bitSet;
        this.f10506 = bitSet2;
        this.f10508 = map;
        this.f10505 = new C0299();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f10505.put(next, arrayList);
            }
        }
        this.f10503 = false;
        this.f10501 = ifR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m11673(C2445 r9) {
        int r0 = r9.m12568();
        if (r9.f11097 != null) {
            this.f10506.set(r0, r9.f11097.booleanValue());
        }
        if (r9.f11100 != null) {
            this.f10507.set(r0, r9.f11100.booleanValue());
        }
        if (r9.f11099 != null) {
            Long l = this.f10508.get(Integer.valueOf(r0));
            long longValue = r9.f11099.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f10508.put(Integer.valueOf(r0), Long.valueOf(longValue));
            }
        }
        if (r9.f11098 != null) {
            List list = this.f10505.get(Integer.valueOf(r0));
            if (list == null) {
                list = new ArrayList();
                this.f10505.put(Integer.valueOf(r0), list);
            }
            if (C1723.m9720() && this.f10502.r_().m13379(this.f10504, C2529.f11535) && r9.m12567()) {
                list.clear();
            }
            if (C0564.m5177() && this.f10502.r_().m13379(this.f10504, C2529.f11568) && r9.m12569()) {
                list.clear();
            }
            if (!C0564.m5177() || !this.f10502.r_().m13379(this.f10504, C2529.f11568)) {
                list.add(Long.valueOf(r9.f11098.longValue() / 1000));
                return;
            }
            long longValue2 = r9.f11098.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2477.C2485 m11672(int i, List<Integer> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<Integer> list2 = list;
        C2477.C2485.C2486 r2 = C2477.C2485.m13139();
        r2.m13157(i);
        r2.m13158(this.f10503);
        C2477.IF ifR = this.f10501;
        if (ifR != null) {
            r2.m13160(ifR);
        }
        C2477.IF.Cif r3 = C2477.IF.m12746().m12780((Iterable<? extends Long>) C2090.m11103(this.f10507)).m12776(C2090.m11103(this.f10506));
        Map<Integer, Long> map = this.f10508;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer intValue : this.f10508.keySet()) {
                int intValue2 = intValue.intValue();
                arrayList.add((C2477.C3645If) ((C0987) C2477.C3645If.m12785().m12795(intValue2).m12794(this.f10508.get(Integer.valueOf(intValue2)).longValue()).m7011()));
            }
        }
        r3.m12777(arrayList);
        Map<Integer, List<Long>> map2 = this.f10505;
        if (map2 == null) {
            arrayList2 = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.f10505.keySet()) {
                C2477.C2489.If r8 = C2477.C2489.m13178().m13190(next.intValue());
                List list3 = this.f10505.get(next);
                if (list3 != null) {
                    Collections.sort(list3);
                    r8.m13191(list3);
                }
                arrayList3.add((C2477.C2489) ((C0987) r8.m7011()));
            }
            arrayList2 = arrayList3;
        }
        if ((!C1723.m9720() || !this.f10502.r_().m13379(this.f10504, C2529.f11535)) && r2.m13161()) {
            List<C2477.C2489> r6 = r2.m13156().m12773();
            if (!r6.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(arrayList2);
                C0299 r4 = new C0299();
                for (C2477.C2489 next2 : r6) {
                    if (next2.m13186() && next2.m13187() > 0) {
                        r4.put(Integer.valueOf(next2.m13182()), Long.valueOf(next2.m13185(next2.m13187() - 1)));
                    }
                }
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    C2477.C2489 r9 = (C2477.C2489) arrayList4.get(i2);
                    Long l = (Long) r4.remove(r9.m13186() ? Integer.valueOf(r9.m13182()) : null);
                    if (l != null && (list2 == null || !list2.contains(Integer.valueOf(r9.m13182())))) {
                        ArrayList arrayList5 = new ArrayList();
                        if (l.longValue() < r9.m13185(0)) {
                            arrayList5.add(l);
                        }
                        arrayList5.addAll(r9.m13184());
                        arrayList4.set(i2, (C2477.C2489) ((C0987) ((C2477.C2489.If) r9.m6992()).m13189().m13191(arrayList5).m7011()));
                    }
                }
                for (Integer num : r4.keySet()) {
                    arrayList4.add((C2477.C2489) ((C0987) C2477.C2489.m13178().m13190(num.intValue()).m13188(((Long) r4.get(num)).longValue()).m7011()));
                }
                arrayList2 = arrayList4;
            }
        }
        r3.m12782((Iterable<? extends C2477.C2489>) arrayList2);
        r2.m13159(r3);
        return (C2477.C2485) ((C0987) r2.m7011());
    }

    /* synthetic */ C2225(C2217 r1, String str, C2477.IF ifR, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C2310 r8) {
        this(r1, str, ifR, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ C2225(C2217 r1, String str, C2310 r3) {
        this(r1, str);
    }
}
