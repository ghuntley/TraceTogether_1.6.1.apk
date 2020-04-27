package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C0750;

/* renamed from: o.ƭǃ  reason: contains not printable characters */
final class C0790<T extends C0750<T>> {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C0790 f5253 = new C0790(true);

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f5254;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C2063<T, Object> f5255;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f5256;

    private C0790() {
        this.f5255 = C2063.m10974(16);
    }

    private C0790(boolean z) {
        this(C2063.m10974(0));
        m6160();
    }

    private C0790(C2063<T, Object> r1) {
        this.f5255 = r1;
        m6160();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <T extends C0750<T>> C0790<T> m6155() {
        return f5253;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6160() {
        if (!this.f5254) {
            this.f5255.m10978();
            this.f5254 = true;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m6165() {
        return this.f5254;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0790)) {
            return false;
        }
        return this.f5255.equals(((C0790) obj).f5255);
    }

    public final int hashCode() {
        return this.f5255.hashCode();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Iterator<Map.Entry<T, Object>> m6164() {
        if (this.f5256) {
            return new C1135(this.f5255.entrySet().iterator());
        }
        return this.f5255.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Iterator<Map.Entry<T, Object>> m6162() {
        if (this.f5256) {
            return new C1135(this.f5255.m10981().iterator());
        }
        return this.f5255.m10981().iterator();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final Object m6149(T t) {
        Object obj = this.f5255.get(t);
        if (!(obj instanceof C1056)) {
            return obj;
        }
        C1056 r2 = (C1056) obj;
        return C1056.m7304();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m6157(T t, Object obj) {
        if (!t.m5992()) {
            m6159(t.m5987(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m6159(t.m5987(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C1056) {
            this.f5256 = true;
        }
        this.f5255.put(t, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof o.C1000) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof o.C1056) == false) goto L_0x0014;
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m6159(o.C2792 r2, java.lang.Object r3) {
        /*
            o.C0936.m6809(r3)
            int[] r0 = o.C0784.f5212
            o.ҽ r2 = r2.m14708()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof o.C1637
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof o.C1056
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof o.C1000
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof o.C0510
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0790.m6159(o.Ӏɫ, java.lang.Object):void");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final boolean m6161() {
        for (int i = 0; i < this.f5255.m10979(); i++) {
            if (!m6153(this.f5255.m10980(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> r2 : this.f5255.m10982()) {
            if (!m6153(r2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static <T extends C0750<T>> boolean m6153(Map.Entry<T, Object> entry) {
        C0750 r0 = (C0750) entry.getKey();
        if (r0.m5989() == C2743.MESSAGE) {
            if (r0.m5992()) {
                for (C1637 r02 : (List) entry.getValue()) {
                    if (!r02.m10163()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C1637) {
                    if (!((C1637) value).m10163()) {
                        return false;
                    }
                } else if (value instanceof C1056) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6163(C0790<T> r3) {
        for (int i = 0; i < r3.f5255.m10979(); i++) {
            m6156(r3.f5255.m10980(i));
        }
        for (Map.Entry<T, Object> r0 : r3.f5255.m10982()) {
            m6156(r0);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Object m6154(Object obj) {
        if (obj instanceof C1835) {
            return ((C1835) obj).m10161();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m6156(Map.Entry<T, Object> entry) {
        Object obj;
        C0750 r0 = (C0750) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1056) {
            C1056 r5 = (C1056) value;
            value = C1056.m7304();
        }
        if (r0.m5992()) {
            Object r1 = m6149(r0);
            if (r1 == null) {
                r1 = new ArrayList();
            }
            for (Object r2 : (List) value) {
                ((List) r1).add(m6154(r2));
            }
            this.f5255.put(r0, r1);
        } else if (r0.m5989() == C2743.MESSAGE) {
            Object r12 = m6149(r0);
            if (r12 == null) {
                this.f5255.put(r0, m6154(value));
                return;
            }
            if (r12 instanceof C1835) {
                obj = r0.m5988((C1835) r12, (C1835) value);
            } else {
                obj = r0.m5991(((C1637) r12).m9435(), (C1637) value).m9845();
            }
            this.f5255.put(r0, obj);
        } else {
            this.f5255.put(r0, m6154(value));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m6152(C0692 r1, C2792 r2, int i, Object obj) {
        if (r2 == C2792.GROUP) {
            C1637 r4 = (C1637) obj;
            C0936.m6810(r4);
            r1.m5684(i, 3);
            r4.m9439(r1);
            r1.m5684(i, 4);
            return;
        }
        r1.m5684(i, r2.m14707());
        switch (C0784.f5211[r2.ordinal()]) {
            case 1:
                r1.m5682(((Double) obj).doubleValue());
                return;
            case 2:
                r1.m5709(((Float) obj).floatValue());
                return;
            case 3:
                r1.m5714(((Long) obj).longValue());
                return;
            case 4:
                r1.m5714(((Long) obj).longValue());
                return;
            case 5:
                r1.m5683(((Integer) obj).intValue());
                return;
            case 6:
                r1.m5699(((Long) obj).longValue());
                return;
            case 7:
                r1.m5689(((Integer) obj).intValue());
                return;
            case 8:
                r1.m5687(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C1637) obj).m9439(r1);
                return;
            case 10:
                r1.m5700((C1637) obj);
                return;
            case 11:
                if (obj instanceof C0510) {
                    r1.m5715((C0510) obj);
                    return;
                } else {
                    r1.m5686((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C0510) {
                    r1.m5715((C0510) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                r1.m5707(bArr, 0, bArr.length);
                return;
            case 13:
                r1.m5710(((Integer) obj).intValue());
                return;
            case 14:
                r1.m5689(((Integer) obj).intValue());
                return;
            case 15:
                r1.m5699(((Long) obj).longValue());
                return;
            case 16:
                r1.m5702(((Integer) obj).intValue());
                return;
            case 17:
                r1.m5706(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C1000) {
                    r1.m5683(((C1000) obj).m7112());
                    return;
                } else {
                    r1.m5683(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final int m6166() {
        int i = 0;
        for (int i2 = 0; i2 < this.f5255.m10979(); i2++) {
            i += m6150(this.f5255.m10980(i2));
        }
        for (Map.Entry<T, Object> r2 : this.f5255.m10982()) {
            i += m6150(r2);
        }
        return i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m6150(Map.Entry<T, Object> entry) {
        C0750 r0 = (C0750) entry.getKey();
        Object value = entry.getValue();
        if (r0.m5989() != C2743.MESSAGE || r0.m5992() || r0.m5986()) {
            return m6148(r0, value);
        }
        if (value instanceof C1056) {
            return C0692.m5664(((C0750) entry.getKey()).m5990(), (C1259) (C1056) value);
        }
        return C0692.m5665(((C0750) entry.getKey()).m5990(), (C1637) value);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m6158(C2792 r1, int i, Object obj) {
        int r2 = C0692.m5647(i);
        if (r1 == C2792.GROUP) {
            C0936.m6810((C1637) obj);
            r2 <<= 1;
        }
        return r2 + m6151(r1, obj);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m6151(C2792 r1, Object obj) {
        switch (C0784.f5211[r1.ordinal()]) {
            case 1:
                return C0692.m5657(((Double) obj).doubleValue());
            case 2:
                return C0692.m5633(((Float) obj).floatValue());
            case 3:
                return C0692.m5636(((Long) obj).longValue());
            case 4:
                return C0692.m5642(((Long) obj).longValue());
            case 5:
                return C0692.m5654(((Integer) obj).intValue());
            case 6:
                return C0692.m5656(((Long) obj).longValue());
            case 7:
                return C0692.m5670(((Integer) obj).intValue());
            case 8:
                return C0692.m5645(((Boolean) obj).booleanValue());
            case 9:
                return C0692.m5660((C1637) obj);
            case 10:
                if (obj instanceof C1056) {
                    return C0692.m5667((C1259) (C1056) obj);
                }
                return C0692.m5668((C1637) obj);
            case 11:
                if (obj instanceof C0510) {
                    return C0692.m5651((C0510) obj);
                }
                return C0692.m5643((String) obj);
            case 12:
                if (obj instanceof C0510) {
                    return C0692.m5651((C0510) obj);
                }
                return C0692.m5669((byte[]) obj);
            case 13:
                return C0692.m5639(((Integer) obj).intValue());
            case 14:
                return C0692.m5674(((Integer) obj).intValue());
            case 15:
                return C0692.m5673(((Long) obj).longValue());
            case 16:
                return C0692.m5678(((Integer) obj).intValue());
            case 17:
                return C0692.m5641(((Long) obj).longValue());
            case 18:
                if (obj instanceof C1000) {
                    return C0692.m5681(((C1000) obj).m7112());
                }
                return C0692.m5681(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m6148(C0750<?> r3, Object obj) {
        C2792 r0 = r3.m5987();
        int r1 = r3.m5990();
        if (!r3.m5992()) {
            return m6158(r0, r1, obj);
        }
        int i = 0;
        if (r3.m5986()) {
            for (Object r4 : (List) obj) {
                i += m6151(r0, r4);
            }
            return C0692.m5647(r1) + i + C0692.m5652(i);
        }
        for (Object r42 : (List) obj) {
            i += m6158(r0, r1, r42);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        C0790 r0 = new C0790();
        for (int i = 0; i < this.f5255.m10979(); i++) {
            Map.Entry<T, Object> r2 = this.f5255.m10980(i);
            r0.m6157((C0750) r2.getKey(), r2.getValue());
        }
        for (Map.Entry next : this.f5255.m10982()) {
            r0.m6157((C0750) next.getKey(), next.getValue());
        }
        r0.f5256 = this.f5256;
        return r0;
    }
}
