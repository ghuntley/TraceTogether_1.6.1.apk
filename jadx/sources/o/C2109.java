package o;

/* renamed from: o.ξ  reason: contains not printable characters */
public final class C2109 implements C2856<C1875> {
    /* renamed from: ı  reason: contains not printable characters */
    public final void m11262(Object obj, Object obj2) {
        C1875 r5 = (C1875) obj;
        C3043 r6 = (C3043) obj2;
        r6.m15533("requestTimeMs", r5.f9556).m15533("requestUptimeMs", r5.f9552);
        if (r5.f9554 != null) {
            r6.m15534("clientInfo", (Object) r5.f9554);
        }
        if (r5.f9555 != null) {
            r6.m15534("logSourceName", (Object) r5.f9555);
        } else if (r5.f9557 != Integer.MIN_VALUE) {
            r6.m15535("logSource", r5.f9557);
        } else {
            throw new C3021("Log request must have either LogSourceName or LogSource");
        }
        if (!r5.f9558.isEmpty()) {
            r6.m15534("logEvent", (Object) r5.f9558);
        }
    }
}
