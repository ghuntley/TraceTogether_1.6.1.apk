package o;

/* renamed from: o.ɩɤ  reason: contains not printable characters */
public class C1259 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0705 f7096 = C0705.m5817();

    /* renamed from: ǃ  reason: contains not printable characters */
    private C0510 f7097;

    /* renamed from: Ι  reason: contains not printable characters */
    private volatile C1637 f7098;

    /* renamed from: ι  reason: contains not printable characters */
    private volatile C0510 f7099;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1259)) {
            return false;
        }
        C1259 r3 = (C1259) obj;
        C1637 r0 = this.f7098;
        C1637 r1 = r3.f7098;
        if (r0 == null && r1 == null) {
            return m8095().equals(r3.m8095());
        }
        if (r0 != null && r1 != null) {
            return r0.equals(r1);
        }
        if (r0 != null) {
            return r0.equals(r3.m8093(r0.m10162()));
        }
        return m8093(r1.m10162()).equals(r1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final o.C1637 m8093(o.C1637 r2) {
        /*
            r1 = this;
            o.ʋΙ r0 = r1.f7098
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            o.ʋΙ r0 = r1.f7098     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f7098 = r2     // Catch:{ ɛı -> 0x0012 }
            o.ŀɺ r0 = o.C0510.f4250     // Catch:{ ɛı -> 0x0012 }
            r1.f7099 = r0     // Catch:{ ɛı -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f7098 = r2     // Catch:{ all -> 0x001a }
            o.ŀɺ r2 = o.C0510.f4250     // Catch:{ all -> 0x001a }
            r1.f7099 = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            o.ʋΙ r2 = r1.f7098
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1259.m8093(o.ʋΙ):o.ʋΙ");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1637 m8096(C1637 r3) {
        C1637 r0 = this.f7098;
        this.f7097 = null;
        this.f7099 = null;
        this.f7098 = r3;
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m8094() {
        if (this.f7099 != null) {
            return this.f7099.m4967();
        }
        if (this.f7098 != null) {
            return this.f7098.m9436();
        }
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0510 m8095() {
        if (this.f7099 != null) {
            return this.f7099;
        }
        synchronized (this) {
            if (this.f7099 != null) {
                C0510 r0 = this.f7099;
                return r0;
            }
            if (this.f7098 == null) {
                this.f7099 = C0510.f4250;
            } else {
                this.f7099 = this.f7098.m9438();
            }
            C0510 r02 = this.f7099;
            return r02;
        }
    }
}
