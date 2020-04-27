package o;

/* renamed from: o.Ӏʬ  reason: contains not printable characters */
public class C2807 {

    /* renamed from: ı  reason: contains not printable characters */
    volatile C1767 f13221;

    /* renamed from: ǃ  reason: contains not printable characters */
    volatile C2993 f13222;

    public int hashCode() {
        return 1;
    }

    static {
        C2269.m11833();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2807)) {
            return false;
        }
        C2807 r3 = (C2807) obj;
        C2993 r0 = this.f13222;
        C2993 r1 = r3.f13222;
        if (r0 == null && r1 == null) {
            return m14718().equals(r3.m14718());
        }
        if (r0 != null && r1 != null) {
            return r0.equals(r1);
        }
        if (r0 != null) {
            return r0.equals(r3.m14720(r0.m15523()));
        }
        return m14720(r1.m15523()).equals(r1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2993 m14720(C2993 r1) {
        m14719(r1);
        return this.f13222;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C1767 m14718() {
        if (this.f13221 != null) {
            return this.f13221;
        }
        synchronized (this) {
            if (this.f13221 != null) {
                C1767 r0 = this.f13221;
                return r0;
            }
            if (this.f13222 == null) {
                this.f13221 = C1767.f9079;
            } else {
                this.f13221 = this.f13222.m15340();
            }
            C1767 r02 = this.f13221;
            return r02;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14719(o.C2993 r2) {
        /*
            r1 = this;
            o.ԟι r0 = r1.f13222
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            o.ԟι r0 = r1.f13222     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x000c:
            r1.f13222 = r2     // Catch:{ ԟɩ -> 0x0013 }
            o.Β r0 = o.C1767.f9079     // Catch:{ ԟɩ -> 0x0013 }
            r1.f13221 = r0     // Catch:{ ԟɩ -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.f13222 = r2     // Catch:{ all -> 0x001b }
            o.Β r2 = o.C1767.f9079     // Catch:{ all -> 0x001b }
            r1.f13221 = r2     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2807.m14719(o.ԟι):void");
    }
}
