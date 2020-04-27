package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import o.C3079;

/* renamed from: o.ʀɹ  reason: contains not printable characters */
public final class C1588 implements ServiceConnection {

    /* renamed from: ı  reason: contains not printable characters */
    public int f8433;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Messenger f8434;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C3079.C3081 f8435;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Queue<C1404<?>> f8436;

    /* renamed from: ι  reason: contains not printable characters */
    public final SparseArray<C1404<?>> f8437;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* synthetic */ C3074 f8438;

    private C1588(C3074 r4) {
        this.f8438 = r4;
        this.f8433 = 0;
        this.f8434 = new Messenger(new C1782(Looper.getMainLooper(), new C3076(this)));
        this.f8436 = new ArrayDeque();
        this.f8437 = new SparseArray<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        return true;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m9274(o.C1404<?> r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f8433     // Catch:{ all -> 0x009c }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r2) goto L_0x0043
            r3 = 2
            if (r0 == r3) goto L_0x0030
            r10 = 3
            if (r0 == r10) goto L_0x002e
            r10 = 4
            if (r0 != r10) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009c }
            int r0 = r9.f8433     // Catch:{ all -> 0x009c }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r2.<init>(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x009c }
            r2.append(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x009c }
            r10.<init>(r0)     // Catch:{ all -> 0x009c }
            throw r10     // Catch:{ all -> 0x009c }
        L_0x002e:
            monitor-exit(r9)
            return r1
        L_0x0030:
            java.util.Queue<o.ɪҹ<?>> r0 = r9.f8436     // Catch:{ all -> 0x009c }
            r0.add(r10)     // Catch:{ all -> 0x009c }
            o.էі r10 = r9.f8438     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r10 = r10.f14032     // Catch:{ all -> 0x009c }
            o.ը$ı r0 = new o.ը$ı     // Catch:{ all -> 0x009c }
            r0.<init>(r9)     // Catch:{ all -> 0x009c }
            r10.execute(r0)     // Catch:{ all -> 0x009c }
            monitor-exit(r9)
            return r2
        L_0x0043:
            java.util.Queue<o.ɪҹ<?>> r0 = r9.f8436     // Catch:{ all -> 0x009c }
            r0.add(r10)     // Catch:{ all -> 0x009c }
            monitor-exit(r9)
            return r2
        L_0x004a:
            java.util.Queue<o.ɪҹ<?>> r0 = r9.f8436     // Catch:{ all -> 0x009c }
            r0.add(r10)     // Catch:{ all -> 0x009c }
            int r10 = r9.f8433     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0055
            r10 = 1
            goto L_0x0056
        L_0x0055:
            r10 = 0
        L_0x0056:
            if (r10 == 0) goto L_0x0096
            r9.f8433 = r2     // Catch:{ all -> 0x009c }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x009c }
            java.lang.String r10 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r10)     // Catch:{ all -> 0x009c }
            java.lang.String r10 = "com.google.android.gms"
            r6.setPackage(r10)     // Catch:{ all -> 0x009c }
            o.ɪɍ r3 = o.C1345.m8433()     // Catch:{ all -> 0x009c }
            o.էі r10 = r9.f8438     // Catch:{ all -> 0x009c }
            android.content.Context r4 = r10.f14030     // Catch:{ all -> 0x009c }
            java.lang.Class r10 = r4.getClass()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r10.getName()     // Catch:{ all -> 0x009c }
            r8 = 1
            r7 = r9
            boolean r10 = r3.m8435(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0084
            java.lang.String r10 = "Unable to bind to service"
            r9.m9278(r1, r10)     // Catch:{ all -> 0x009c }
            goto L_0x0094
        L_0x0084:
            o.էі r10 = r9.f8438     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r10 = r10.f14032     // Catch:{ all -> 0x009c }
            o.ը$If r0 = new o.ը$If     // Catch:{ all -> 0x009c }
            r0.<init>(r9)     // Catch:{ all -> 0x009c }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x009c }
            r10.schedule(r0, r3, r1)     // Catch:{ all -> 0x009c }
        L_0x0094:
            monitor-exit(r9)
            return r2
        L_0x0096:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009c }
            r10.<init>()     // Catch:{ all -> 0x009c }
            throw r10     // Catch:{ all -> 0x009c }
        L_0x009c:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1588.m9274(o.ɪҹ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1.f7668.f14555.m6073((java.lang.Exception) new o.C1669(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r1.m8581(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r5 = r5.getData();
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m9276(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            monitor-enter(r4)
            android.util.SparseArray<o.ɪҹ<?>> r1 = r4.f8437     // Catch:{ all -> 0x003a }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x003a }
            o.ɪҹ r1 = (o.C1404) r1     // Catch:{ all -> 0x003a }
            r2 = 1
            if (r1 != 0) goto L_0x0010
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0010:
            android.util.SparseArray<o.ɪҹ<?>> r3 = r4.f8437     // Catch:{ all -> 0x003a }
            r3.remove(r0)     // Catch:{ all -> 0x003a }
            r4.m9277()     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x0036
            o.ʙι r5 = new o.ʙι
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            o.ւɹ<T> r0 = r1.f7668
            o.ƨɹ<TResult> r0 = r0.f14555
            r0.m6073((java.lang.Exception) r5)
            goto L_0x0039
        L_0x0036:
            r1.m8581(r5)
        L_0x0039:
            return r2
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1588.m9276(android.os.Message):boolean");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8438.f14032.execute(new C3079(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8438.f14032.execute(new C3079.C3082(this));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized void m9278(int i, String str) {
        int i2 = this.f8433;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            this.f8433 = 4;
            C1345.m8433();
            this.f8438.f14030.unbindService(this);
            C1669 r0 = new C1669(i, str);
            for (C1404 r5 : this.f8436) {
                r5.f7668.f14555.m6073((Exception) r0);
            }
            this.f8436.clear();
            for (int i3 = 0; i3 < this.f8437.size(); i3++) {
                this.f8437.valueAt(i3).f7668.f14555.m6073((Exception) r0);
            }
            this.f8437.clear();
        } else if (i2 == 3) {
            this.f8433 = 4;
        } else if (i2 != 4) {
            int i4 = this.f8433;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized void m9277() {
        if (this.f8433 == 2 && this.f8436.isEmpty() && this.f8437.size() == 0) {
            this.f8433 = 3;
            C1345.m8433();
            this.f8438.f14030.unbindService(this);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m9273() {
        if (this.f8433 == 1) {
            m9278(1, "Timed out while binding");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m9275(int i) {
        C1404 r0 = this.f8437.get(i);
        if (r0 != null) {
            this.f8437.remove(i);
            r0.f7668.f14555.m6073((Exception) new C1669(3, "Timed out waiting for response"));
            m9277();
        }
    }

    public /* synthetic */ C1588(C3074 r1, byte b) {
        this(r1);
    }
}
