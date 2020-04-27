package o;

import sg.gov.tech.bluetrace.protocol.v1.V1WriteRequestPayload;

public final class lG extends C3011 implements C0760 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3216 f2741;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3122 f2742;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3057 f2743;

    public lG(C3122 r1, C3057 r2, C3216 r3) {
        this.f2742 = r1;
        this.f2743 = r2;
        this.f2741 = r3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3393(C0815 r5, Object obj) {
        if (obj == null) {
            r5.m6224();
            return;
        }
        V1WriteRequestPayload v1WriteRequestPayload = (V1WriteRequestPayload) obj;
        C3122 r0 = this.f2742;
        C3216 r1 = this.f2741;
        r5.m6234();
        if (v1WriteRequestPayload != v1WriteRequestPayload.modelC) {
            r1.m16163(r5, 5);
            r5.m6227(v1WriteRequestPayload.modelC);
        }
        r1.m16163(r5, 10);
        r5.m6230(Integer.valueOf(v1WriteRequestPayload.v));
        if (v1WriteRequestPayload != v1WriteRequestPayload.msg) {
            r1.m16163(r5, 19);
            r5.m6227(v1WriteRequestPayload.msg);
        }
        if (v1WriteRequestPayload != v1WriteRequestPayload.org) {
            r1.m16163(r5, 0);
            r5.m6227(v1WriteRequestPayload.org);
        }
        r1.m16163(r5, 17);
        r5.m6230(Integer.valueOf(v1WriteRequestPayload.rssi));
        if (v1WriteRequestPayload != v1WriteRequestPayload.txPower) {
            r1.m16163(r5, 7);
            Integer num = v1WriteRequestPayload.txPower;
            C0954.m6859(r0, Integer.class, num).m15435(r5, num);
        }
        r5.m6225(3, 5, "}");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e2, code lost:
        r9.m7105();
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m3392(o.C0995 r9) {
        /*
            r8 = this;
            o.ıȶ r0 = r9.m7095()
            o.ıȶ r1 = o.C0313.NULL
            r2 = 0
            if (r0 != r1) goto L_0x000d
            r9.m7097()
            return r2
        L_0x000d:
            sg.gov.tech.bluetrace.protocol.v1.V1WriteRequestPayload r0 = new sg.gov.tech.bluetrace.protocol.v1.V1WriteRequestPayload
            r0.<init>()
            o.լј r1 = r8.f2742
            o.ՒІ r3 = r8.f2743
            r9.m7096()
        L_0x0019:
            boolean r4 = r9.m7092()
            if (r4 == 0) goto L_0x00e7
            int r4 = r3.m15608(r9)
        L_0x0023:
            o.ıȶ r5 = r9.m7095()
            o.ıȶ r6 = o.C0313.NULL
            r7 = 1
            if (r5 == r6) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r4 == 0) goto L_0x00d1
            if (r4 == r7) goto L_0x0023
            r6 = 2
            if (r4 == r6) goto L_0x0023
            r6 = 13
            if (r4 == r6) goto L_0x00c0
            r6 = 18
            if (r4 == r6) goto L_0x00a2
            r6 = 22
            if (r4 == r6) goto L_0x0084
            r6 = 15
            if (r4 == r6) goto L_0x0067
            r6 = 16
            if (r4 == r6) goto L_0x004e
            r9.m7097()
            goto L_0x0019
        L_0x004e:
            if (r5 == 0) goto L_0x0063
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            o.լɈ r4 = o.C3101.get(r4)
            o.Ա r4 = r1.m15830(r4)
            java.lang.Object r4 = r4.m15434(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0.txPower = r4
            goto L_0x0019
        L_0x0063:
            r0.txPower = r2
            goto L_0x00e2
        L_0x0067:
            if (r5 == 0) goto L_0x0081
            o.ıȶ r4 = r9.m7095()
            o.ıȶ r5 = o.C0313.BOOLEAN
            if (r4 == r5) goto L_0x0076
            java.lang.String r4 = r9.m7101()
            goto L_0x007e
        L_0x0076:
            boolean r4 = r9.m7106()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x007e:
            r0.msg = r4
            goto L_0x0019
        L_0x0081:
            r0.msg = r2
            goto L_0x00e2
        L_0x0084:
            if (r5 == 0) goto L_0x009f
            o.ıȶ r4 = r9.m7095()
            o.ıȶ r5 = o.C0313.BOOLEAN
            if (r4 == r5) goto L_0x0093
            java.lang.String r4 = r9.m7101()
            goto L_0x009b
        L_0x0093:
            boolean r4 = r9.m7106()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x009b:
            r0.org = r4
            goto L_0x0019
        L_0x009f:
            r0.org = r2
            goto L_0x00e2
        L_0x00a2:
            if (r5 == 0) goto L_0x00bd
            o.ıȶ r4 = r9.m7095()
            o.ıȶ r5 = o.C0313.BOOLEAN
            if (r4 == r5) goto L_0x00b1
            java.lang.String r4 = r9.m7101()
            goto L_0x00b9
        L_0x00b1:
            boolean r4 = r9.m7106()
            java.lang.String r4 = java.lang.Boolean.toString(r4)
        L_0x00b9:
            r0.modelC = r4
            goto L_0x0019
        L_0x00bd:
            r0.modelC = r2
            goto L_0x00e2
        L_0x00c0:
            if (r5 == 0) goto L_0x00e2
            int r4 = r9.m7102()     // Catch:{ NumberFormatException -> 0x00ca }
            r0.v = r4     // Catch:{ NumberFormatException -> 0x00ca }
            goto L_0x0019
        L_0x00ca:
            r9 = move-exception
            o.ʬǃ r0 = new o.ʬǃ
            r0.<init>((java.lang.Throwable) r9)
            throw r0
        L_0x00d1:
            if (r5 == 0) goto L_0x00e2
            int r4 = r9.m7102()     // Catch:{ NumberFormatException -> 0x00db }
            r0.rssi = r4     // Catch:{ NumberFormatException -> 0x00db }
            goto L_0x0019
        L_0x00db:
            r9 = move-exception
            o.ʬǃ r0 = new o.ʬǃ
            r0.<init>((java.lang.Throwable) r9)
            throw r0
        L_0x00e2:
            r9.m7105()
            goto L_0x0019
        L_0x00e7:
            r9.m7103()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lG.m3392(o.ȿȷ):java.lang.Object");
    }
}
