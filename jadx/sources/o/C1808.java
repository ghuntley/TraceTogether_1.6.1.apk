package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ΙȽ  reason: contains not printable characters */
final class C1808<T> implements C1990<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0740<?> f9258;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1637 f9259;

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean f9260;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2342<?, ?> f9261;

    private C1808(C2342<?, ?> r1, C0740<?> r2, C1637 r3) {
        this.f9261 = r1;
        this.f9260 = r2.m5925(r3);
        this.f9258 = r2;
        this.f9259 = r3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static <T> C1808<T> m9996(C2342<?, ?> r1, C0740<?> r2, C1637 r3) {
        return new C1808<>(r1, r2, r3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final T m10003() {
        return this.f9259.m9437().m9844();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10002(T t, T t2) {
        if (!this.f9261.m12218(t).equals(this.f9261.m12218(t2))) {
            return false;
        }
        if (this.f9260) {
            return this.f9258.m5922(t).equals(this.f9258.m5922(t2));
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m9997(T t) {
        int hashCode = this.f9261.m12218(t).hashCode();
        return this.f9260 ? (hashCode * 53) + this.f9258.m5922(t).hashCode() : hashCode;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10006(T t, T t2) {
        C2092.m11166(this.f9261, t, t2);
        if (this.f9260) {
            C2092.m11147(this.f9258, t, t2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9998(T t, C2867 r7) {
        Iterator<Map.Entry<?, Object>> r0 = this.f9258.m5922(t).m6164();
        while (r0.hasNext()) {
            Map.Entry next = r0.next();
            C0750 r2 = (C0750) next.getKey();
            if (r2.m5989() != C2743.MESSAGE || r2.m5992() || r2.m5986()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C1125) {
                r7.m14870(r2.m5990(), (Object) ((C1125) next).m7565().m8095());
            } else {
                r7.m14870(r2.m5990(), next.getValue());
            }
        }
        C2342<?, ?> r02 = this.f9261;
        r02.m12217(r02.m12218(t), r7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: o.ȽІ$iF} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10004(T r10, byte[] r11, int r12, int r13, o.C0515 r14) {
        /*
            r9 = this;
            r0 = r10
            o.ȽІ r0 = (o.C0987) r0
            o.ьǃ r1 = r0.zzb
            o.ьǃ r2 = o.C2515.m13355()
            if (r1 != r2) goto L_0x0011
            o.ьǃ r1 = o.C2515.m13352()
            r0.zzb = r1
        L_0x0011:
            o.ȽІ$if r10 = (o.C0987.Cif) r10
            r10.m6998()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = o.C0482.m4835(r11, r12, r14)
            int r2 = r14.f4280
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            o.ƚɺ<?> r12 = r9.f9258
            o.Ɨј r0 = r14.f4277
            o.ʋΙ r3 = r9.f9259
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.m5919(r0, r3, r5)
            r0 = r12
            o.ȽІ$iF r0 = (o.C0987.C3635iF) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = o.C0482.m4828((int) r2, (byte[]) r3, (int) r4, (int) r5, (o.C2515) r6, (o.C0515) r7)
            goto L_0x0018
        L_0x0043:
            o.C1934.m10558()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = o.C0482.m4826(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = o.C0482.m4835(r11, r4, r14)
            int r5 = r14.f4280
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = o.C0482.m4824(r11, r4, r14)
            java.lang.Object r2 = r14.f4278
            o.ŀɺ r2 = (o.C0510) r2
            goto L_0x0053
        L_0x0072:
            o.C1934.m10558()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = o.C0482.m4835(r11, r4, r14)
            int r12 = r14.f4280
            o.ƚɺ<?> r0 = r9.f9258
            o.Ɨј r5 = r14.f4277
            o.ʋΙ r6 = r9.f9259
            java.lang.Object r0 = r0.m5919(r5, r6, r12)
            o.ȽІ$iF r0 = (o.C0987.C3635iF) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = o.C0482.m4826(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m13360(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            o.ɛı r10 = o.C1124.m7563()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1808.m10004(java.lang.Object, byte[], int, int, o.ŀЈ):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10000(T t, C2081 r12, C0705 r13) {
        boolean z;
        C2342<?, ?> r0 = this.f9261;
        C0740<?> r1 = this.f9258;
        Object r2 = r0.m12212(t);
        C0790<?> r3 = r1.m5921((Object) t);
        do {
            try {
                if (r12.m11043() == Integer.MAX_VALUE) {
                    r0.m12223((Object) t, r2);
                    return;
                }
                int r4 = r12.m11014();
                if (r4 == 11) {
                    int i = 0;
                    Object obj = null;
                    C0510 r7 = null;
                    while (r12.m11043() != Integer.MAX_VALUE) {
                        int r8 = r12.m11014();
                        if (r8 == 16) {
                            i = r12.m11028();
                            obj = r1.m5919(r13, this.f9259, i);
                        } else if (r8 == 26) {
                            if (obj != null) {
                                r1.m5923(r12, obj, r13, r3);
                            } else {
                                r7 = r12.m11054();
                            }
                        } else if (!r12.m11025()) {
                            break;
                        }
                    }
                    if (r12.m11014() != 12) {
                        throw C1124.m7557();
                    } else if (r7 != null) {
                        if (obj != null) {
                            r1.m5926(r7, obj, r13, r3);
                        } else {
                            r0.m12222(r2, i, r7);
                        }
                    }
                } else if ((r4 & 7) == 2) {
                    Object r42 = r1.m5919(r13, this.f9259, r4 >>> 3);
                    if (r42 != null) {
                        r1.m5923(r12, r42, r13, r3);
                    } else {
                        z = r0.m12224(r2, r12);
                        continue;
                    }
                } else {
                    z = r12.m11025();
                    continue;
                }
                z = true;
                continue;
            } finally {
                r0.m12223((Object) t, r2);
            }
        } while (z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9999(T t) {
        this.f9261.m12208((Object) t);
        this.f9258.m5924(t);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m10005(T t) {
        return this.f9258.m5922(t).m6161();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m10001(T t) {
        C2342<?, ?> r0 = this.f9261;
        int r02 = r0.m12220(r0.m12218(t)) + 0;
        return this.f9260 ? r02 + this.f9258.m5922(t).m6166() : r02;
    }
}
