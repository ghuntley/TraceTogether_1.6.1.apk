package o;

import o.C2274;

/* renamed from: o.зɹ  reason: contains not printable characters */
final class C2431 extends C2445 {

    /* renamed from: і  reason: contains not printable characters */
    private C2274.C2278 f11059;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final /* synthetic */ C2217 f11060;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2431(C2217 r1, String str, int i, C2274.C2278 r4) {
        super(str, i);
        this.f11060 = r1;
        this.f11059 = r4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12520() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m12522() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m12521() {
        return this.f11059.m11913();
    }

    /* JADX WARNING: type inference failed for: r7v17, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m12523(java.lang.Long r14, java.lang.Long r15, o.C2477.C2490 r16, boolean r17) {
        /*
            r13 = this;
            r0 = r13
            o.Іŧ r1 = r0.f11060
            o.ьɹ r1 = r1.r_()
            java.lang.String r2 = r0.f11102
            o.ιͱ<java.lang.Boolean> r3 = o.C2529.f11594
            boolean r1 = r1.m13379((java.lang.String) r2, (o.C2019<java.lang.Boolean>) r3)
            o.Іŧ r2 = r0.f11060
            o.ьɹ r2 = r2.r_()
            java.lang.String r3 = r0.f11102
            o.ιͱ<java.lang.Boolean> r4 = o.C2529.f11524
            boolean r2 = r2.m13379((java.lang.String) r3, (o.C2019<java.lang.Boolean>) r4)
            boolean r3 = o.C0564.m5177()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0037
            o.Іŧ r3 = r0.f11060
            o.ьɹ r3 = r3.r_()
            java.lang.String r6 = r0.f11102
            o.ιͱ<java.lang.Boolean> r7 = o.C2529.f11539
            boolean r3 = r3.m13379((java.lang.String) r6, (o.C2019<java.lang.Boolean>) r7)
            if (r3 == 0) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            o.Іͽ$ǃ r6 = r0.f11059
            boolean r6 = r6.m11915()
            o.Іͽ$ǃ r7 = r0.f11059
            boolean r7 = r7.m11917()
            if (r1 == 0) goto L_0x0050
            o.Іͽ$ǃ r8 = r0.f11059
            boolean r8 = r8.m11921()
            if (r8 == 0) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x0050:
            r8 = 0
        L_0x0051:
            if (r6 != 0) goto L_0x005a
            if (r7 != 0) goto L_0x005a
            if (r8 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r6 = 0
            goto L_0x005b
        L_0x005a:
            r6 = 1
        L_0x005b:
            r7 = 0
            if (r17 == 0) goto L_0x0088
            if (r6 != 0) goto L_0x0088
            o.Іŧ r1 = r0.f11060
            o.Іɛ r1 = r1.t_()
            o.ϵı r1 = r1.m11713()
            int r2 = r0.f11101
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            o.Іͽ$ǃ r3 = r0.f11059
            boolean r3 = r3.m11918()
            if (r3 == 0) goto L_0x0082
            o.Іͽ$ǃ r3 = r0.f11059
            int r3 = r3.m11913()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L_0x0082:
            java.lang.String r3 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.m11605(r3, r2, r7)
            return r5
        L_0x0088:
            o.Іͽ$ǃ r9 = r0.f11059
            o.Іͽ$ı r9 = r9.m11919()
            boolean r10 = r9.m11907()
            boolean r11 = r16.m13217()
            if (r11 == 0) goto L_0x00cf
            boolean r11 = r9.m11901()
            if (r11 != 0) goto L_0x00bd
            o.Іŧ r9 = r0.f11060
            o.Іɛ r9 = r9.t_()
            o.ϵı r9 = r9.A_()
            o.Іŧ r10 = r0.f11060
            o.κІ r10 = r10.v_()
            java.lang.String r11 = r16.m13210()
            java.lang.String r10 = r10.m11222((java.lang.String) r11)
            java.lang.String r11 = "No number filter for long property. property"
            r9.m11603(r11, r10)
            goto L_0x01ad
        L_0x00bd:
            long r11 = r16.m13219()
            o.Іͽ$ɩ r7 = r9.m11902()
            java.lang.Boolean r7 = m12561(r11, r7)
            java.lang.Boolean r7 = m12565((java.lang.Boolean) r7, (boolean) r10)
            goto L_0x01ad
        L_0x00cf:
            boolean r11 = r16.m13218()
            if (r11 == 0) goto L_0x010c
            boolean r11 = r9.m11901()
            if (r11 != 0) goto L_0x00fa
            o.Іŧ r9 = r0.f11060
            o.Іɛ r9 = r9.t_()
            o.ϵı r9 = r9.A_()
            o.Іŧ r10 = r0.f11060
            o.κІ r10 = r10.v_()
            java.lang.String r11 = r16.m13210()
            java.lang.String r10 = r10.m11222((java.lang.String) r11)
            java.lang.String r11 = "No number filter for double property. property"
            r9.m11603(r11, r10)
            goto L_0x01ad
        L_0x00fa:
            double r11 = r16.m13211()
            o.Іͽ$ɩ r7 = r9.m11902()
            java.lang.Boolean r7 = m12564((double) r11, (o.C2274.C2279) r7)
            java.lang.Boolean r7 = m12565((java.lang.Boolean) r7, (boolean) r10)
            goto L_0x01ad
        L_0x010c:
            boolean r11 = r16.m13214()
            if (r11 == 0) goto L_0x0190
            boolean r11 = r9.m11904()
            if (r11 != 0) goto L_0x0179
            boolean r11 = r9.m11901()
            if (r11 != 0) goto L_0x013c
            o.Іŧ r9 = r0.f11060
            o.Іɛ r9 = r9.t_()
            o.ϵı r9 = r9.A_()
            o.Іŧ r10 = r0.f11060
            o.κІ r10 = r10.v_()
            java.lang.String r11 = r16.m13210()
            java.lang.String r10 = r10.m11222((java.lang.String) r11)
            java.lang.String r11 = "No string or number filter defined. property"
            r9.m11603(r11, r10)
            goto L_0x01ad
        L_0x013c:
            java.lang.String r11 = r16.m13216()
            boolean r11 = o.C2090.m11098((java.lang.String) r11)
            if (r11 == 0) goto L_0x0157
            java.lang.String r7 = r16.m13216()
            o.Іͽ$ɩ r9 = r9.m11902()
            java.lang.Boolean r7 = m12563(r7, r9)
            java.lang.Boolean r7 = m12565((java.lang.Boolean) r7, (boolean) r10)
            goto L_0x01ad
        L_0x0157:
            o.Іŧ r9 = r0.f11060
            o.Іɛ r9 = r9.t_()
            o.ϵı r9 = r9.A_()
            o.Іŧ r10 = r0.f11060
            o.κІ r10 = r10.v_()
            java.lang.String r11 = r16.m13210()
            java.lang.String r10 = r10.m11222((java.lang.String) r11)
            java.lang.String r11 = r16.m13216()
            java.lang.String r12 = "Invalid user property value for Numeric number filter. property, value"
            r9.m11605(r12, r10, r11)
            goto L_0x01ad
        L_0x0179:
            java.lang.String r7 = r16.m13216()
            o.Іͽ$aux r9 = r9.m11899()
            o.Іŧ r11 = r0.f11060
            o.Іɛ r11 = r11.t_()
            java.lang.Boolean r7 = m12566(r7, r9, r11)
            java.lang.Boolean r7 = m12565((java.lang.Boolean) r7, (boolean) r10)
            goto L_0x01ad
        L_0x0190:
            o.Іŧ r9 = r0.f11060
            o.Іɛ r9 = r9.t_()
            o.ϵı r9 = r9.A_()
            o.Іŧ r10 = r0.f11060
            o.κІ r10 = r10.v_()
            java.lang.String r11 = r16.m13210()
            java.lang.String r10 = r10.m11222((java.lang.String) r11)
            java.lang.String r11 = "User property has no value, property"
            r9.m11603(r11, r10)
        L_0x01ad:
            o.Іŧ r9 = r0.f11060
            o.Іɛ r9 = r9.t_()
            o.ϵı r9 = r9.m11713()
            if (r7 != 0) goto L_0x01bc
            java.lang.String r10 = "null"
            goto L_0x01bd
        L_0x01bc:
            r10 = r7
        L_0x01bd:
            java.lang.String r11 = "Property filter result"
            r9.m11603(r11, r10)
            if (r7 != 0) goto L_0x01c5
            return r4
        L_0x01c5:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r0.f11097 = r4
            if (r1 == 0) goto L_0x01d6
            if (r8 == 0) goto L_0x01d6
            boolean r1 = r7.booleanValue()
            if (r1 != 0) goto L_0x01d6
            return r5
        L_0x01d6:
            if (r17 == 0) goto L_0x01e0
            o.Іͽ$ǃ r1 = r0.f11059
            boolean r1 = r1.m11915()
            if (r1 == 0) goto L_0x01e2
        L_0x01e0:
            r0.f11100 = r7
        L_0x01e2:
            boolean r1 = r7.booleanValue()
            if (r1 == 0) goto L_0x0229
            if (r6 == 0) goto L_0x0229
            boolean r1 = r16.m13215()
            if (r1 == 0) goto L_0x0229
            long r6 = r16.m13212()
            if (r2 == 0) goto L_0x01fc
            if (r14 == 0) goto L_0x01fc
            long r6 = r14.longValue()
        L_0x01fc:
            if (r3 == 0) goto L_0x0214
            o.Іͽ$ǃ r1 = r0.f11059
            boolean r1 = r1.m11915()
            if (r1 == 0) goto L_0x0214
            o.Іͽ$ǃ r1 = r0.f11059
            boolean r1 = r1.m11917()
            if (r1 != 0) goto L_0x0214
            if (r15 == 0) goto L_0x0214
            long r6 = r15.longValue()
        L_0x0214:
            o.Іͽ$ǃ r1 = r0.f11059
            boolean r1 = r1.m11917()
            if (r1 == 0) goto L_0x0223
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0.f11098 = r1
            goto L_0x0229
        L_0x0223:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0.f11099 = r1
        L_0x0229:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2431.m12523(java.lang.Long, java.lang.Long, o.хɪ$І, boolean):boolean");
    }
}
