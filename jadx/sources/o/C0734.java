package o;

import java.util.List;
import java.util.Map;
import o.C0987;

/* renamed from: o.ƚɟ  reason: contains not printable characters */
final class C0734 implements C2867 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0692 f4963;

    /* renamed from: ı  reason: contains not printable characters */
    public static C0734 m5872(C0692 r1) {
        if (r1.f4863 != null) {
            return r1.f4863;
        }
        return new C0734(r1);
    }

    private C0734(C0692 r2) {
        this.f4963 = (C0692) C0936.m6813(r2, "output");
        this.f4963.f4863 = this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m5900() {
        return C0987.If.f6027;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5886(int i, int i2) {
        this.f4963.m5703(i, i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5895(int i, long j) {
        this.f4963.m5697(i, j);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5903(int i, long j) {
        this.f4963.m5692(i, j);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5901(int i, float f) {
        this.f4963.m5690(i, f);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5885(int i, double d) {
        this.f4963.m5695(i, d);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5873(int i, int i2) {
        this.f4963.m5696(i, i2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5874(int i, long j) {
        this.f4963.m5697(i, j);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5902(int i, int i2) {
        this.f4963.m5696(i, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5879(int i, long j) {
        this.f4963.m5692(i, j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5894(int i, int i2) {
        this.f4963.m5703(i, i2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5908(int i, boolean z) {
        this.f4963.m5705(i, z);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5889(int i, String str) {
        this.f4963.m5704(i, str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5907(int i, C0510 r3) {
        this.f4963.m5693(i, r3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5878(int i, int i2) {
        this.f4963.m5711(i, i2);
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m5910(int i, int i2) {
        this.f4963.m5691(i, i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5887(int i, long j) {
        this.f4963.m5712(i, j);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5904(int i, Object obj, C1990 r4) {
        this.f4963.m5713(i, (C1637) obj, r4);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5888(int i, Object obj, C1990 r5) {
        C0692 r0 = this.f4963;
        r0.m5684(i, 3);
        r5.m10783((C1637) obj, r0.f4863);
        r0.m5684(i, 4);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5884(int i) {
        this.f4963.m5684(i, 3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5893(int i) {
        this.f4963.m5684(i, 4);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5875(int i, Object obj) {
        if (obj instanceof C0510) {
            this.f4963.m5685(i, (C0510) obj);
        } else {
            this.f4963.m5698(i, (C1637) obj);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5898(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5654(list.get(i4).intValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5683(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5696(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5890(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5670(list.get(i4).intValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5689(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5703(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5906(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5636(list.get(i4).longValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5714(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5697(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5876(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5642(list.get(i4).longValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5714(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5697(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5881(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5656(list.get(i4).longValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5699(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5692(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m5911(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5633(list.get(i4).floatValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5709(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5690(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m5909(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5657(list.get(i4).doubleValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5682(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5695(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m5892(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5681(list.get(i4).intValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5683(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5696(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m5877(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5645(list.get(i4).booleanValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5687(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5705(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5896(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C1183) {
            C1183 r0 = (C1183) list;
            while (i2 < list.size()) {
                Object r2 = r0.m7714(i2);
                if (r2 instanceof String) {
                    this.f4963.m5704(i, (String) r2);
                } else {
                    this.f4963.m5693(i, (C0510) r2);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5704(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5905(int i, List<C0510> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f4963.m5693(i, list.get(i2));
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m5912(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5639(list.get(i4).intValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5710(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5711(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m5882(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5674(list.get(i4).intValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5689(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5703(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final void m5891(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5673(list.get(i4).longValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5699(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5692(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final void m5913(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5678(list.get(i4).intValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5702(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5691(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final void m5883(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4963.m5684(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C0692.m5641(list.get(i4).longValue());
            }
            this.f4963.m5710(i3);
            while (i2 < list.size()) {
                this.f4963.m5706(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4963.m5712(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5897(int i, List<?> list, C1990 r5) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m5904(i, (Object) list.get(i2), r5);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5880(int i, List<?> list, C1990 r5) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m5888(i, (Object) list.get(i2), r5);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <K, V> void m5899(int i, C1528<K, V> r6, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f4963.m5684(i, 2);
            this.f4963.m5710(C1620.m9364(r6, next.getKey(), next.getValue()));
            C1620.m9365(this.f4963, r6, next.getKey(), next.getValue());
        }
    }
}
