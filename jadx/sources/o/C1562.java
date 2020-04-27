package o;

/* renamed from: o.ɿǃ  reason: contains not printable characters */
public final class C1562 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public Cif f8312;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f8313;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f8314;

    /* renamed from: o.ɿǃ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: Ι  reason: contains not printable characters */
        void m9194();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9193() {
        boolean z;
        synchronized (this) {
            z = this.f8313;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.m9194();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.f8314 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0022, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.f8314 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0028, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9192() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f8313     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return
        L_0x0007:
            r0 = 1
            r2.f8313 = r0     // Catch:{ all -> 0x002d }
            r2.f8314 = r0     // Catch:{ all -> 0x002d }
            o.ɿǃ$if r0 = r2.f8312     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0.m9194()     // Catch:{ all -> 0x0016 }
            goto L_0x0022
        L_0x0016:
            r0 = move-exception
            monitor-enter(r2)
            r2.f8314 = r1     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0022:
            monitor-enter(r2)
            r2.f8314 = r1     // Catch:{ all -> 0x002a }
            r2.notifyAll()     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1562.m9192():void");
    }
}
