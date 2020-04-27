package o;

/* renamed from: o.Ιґ  reason: contains not printable characters */
public final class C1888 implements C2856<C1868> {
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10294(Object obj, Object obj2) {
        C1868 r5 = (C1868) obj;
        C3043 r6 = (C3043) obj2;
        r6.m15533("eventTimeMs", r5.f9541).m15533("eventUptimeMs", r5.f9537).m15533("timezoneOffsetSeconds", r5.f9542);
        if (r5.f9538 != null) {
            r6.m15534("sourceExtension", (Object) r5.f9538);
        }
        if (r5.f9539 != null) {
            r6.m15534("sourceExtensionJsonProto3", (Object) r5.f9539);
        }
        if (r5.f9540 != Integer.MIN_VALUE) {
            r6.m15535("eventCode", r5.f9540);
        }
        if (r5.f9543 != null) {
            r6.m15534("networkConnectionInfo", (Object) r5.f9543);
        }
    }
}
