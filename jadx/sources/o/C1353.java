package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import o.C1190;
import o.C2745;

/* renamed from: o.ɪɤ  reason: contains not printable characters */
public final class C1353 implements ServiceConnection, C1190.C1191, C1190.C1193 {

    /* renamed from: ı  reason: contains not printable characters */
    private volatile C2138 f7505;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public volatile boolean f7506;

    /* renamed from: ι  reason: contains not printable characters */
    final /* synthetic */ C0848 f7507;

    protected C1353(C0848 r1) {
        this.f7507 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8456(Intent intent) {
        this.f7507.y_();
        Context r0 = this.f7507.m15904();
        C1345 r1 = C1345.m8433();
        synchronized (this) {
            if (this.f7506) {
                this.f7507.t_().m11713().m11606("Connection attempt already in progress");
                return;
            }
            this.f7507.t_().m11713().m11606("Using local app measurement service");
            this.f7506 = true;
            r1.m8436(r0, intent, this.f7507.f5556, 129);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8455() {
        if (this.f7505 != null && (this.f7505.m7783() || this.f7505.m7772())) {
            this.f7505.m7763();
        }
        this.f7505 = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f7507.t_().m11714().m11606("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            o.C2745.C2746.m14556((java.lang.String) r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f7506 = r4     // Catch:{ all -> 0x001c }
            o.ǀɉ r4 = r3.f7507     // Catch:{ all -> 0x001c }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x001c }
            o.ϵı r4 = r4.m11714()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.m11606(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0096
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x004f
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005f }
            boolean r2 = r1 instanceof o.C2082     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x0039
            o.ιԏ r1 = (o.C2082) r1     // Catch:{ RemoteException -> 0x005f }
            goto L_0x003e
        L_0x0039:
            o.κӀ r1 = new o.κӀ     // Catch:{ RemoteException -> 0x005f }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005f }
        L_0x003e:
            r0 = r1
            o.ǀɉ r5 = r3.f7507     // Catch:{ RemoteException -> 0x005f }
            o.Іɛ r5 = r5.t_()     // Catch:{ RemoteException -> 0x005f }
            o.ϵı r5 = r5.m11713()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.m11606(r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x004f:
            o.ǀɉ r5 = r3.f7507     // Catch:{ RemoteException -> 0x005f }
            o.Іɛ r5 = r5.t_()     // Catch:{ RemoteException -> 0x005f }
            o.ϵı r5 = r5.m11714()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.m11603(r2, r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x005f:
            o.ǀɉ r5 = r3.f7507     // Catch:{ all -> 0x001c }
            o.Іɛ r5 = r5.t_()     // Catch:{ all -> 0x001c }
            o.ϵı r5 = r5.m11714()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.m11606(r1)     // Catch:{ all -> 0x001c }
        L_0x006e:
            if (r0 != 0) goto L_0x0086
            r3.f7506 = r4     // Catch:{ all -> 0x001c }
            o.ɪɍ r4 = o.C1345.m8433()     // Catch:{ IllegalArgumentException -> 0x0094 }
            o.ǀɉ r5 = r3.f7507     // Catch:{ IllegalArgumentException -> 0x0094 }
            android.content.Context r5 = r5.m15904()     // Catch:{ IllegalArgumentException -> 0x0094 }
            o.ǀɉ r0 = r3.f7507     // Catch:{ IllegalArgumentException -> 0x0094 }
            o.ɪɤ r0 = r0.f5556     // Catch:{ IllegalArgumentException -> 0x0094 }
            r4.m8434(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x0094
        L_0x0086:
            o.ǀɉ r4 = r3.f7507     // Catch:{ all -> 0x001c }
            o.іƭ r4 = r4.u_()     // Catch:{ all -> 0x001c }
            o.ɭɉ r5 = new o.ɭɉ     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.m13668((java.lang.Runnable) r5)     // Catch:{ all -> 0x001c }
        L_0x0094:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1353.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C2745.C2746.m14556("MeasurementServiceConnection.onServiceDisconnected");
        this.f7507.t_().m11711().m11606("Service disconnected");
        this.f7507.u_().m13668((Runnable) new C1452(this, componentName));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8454() {
        this.f7507.y_();
        Context r0 = this.f7507.m15904();
        synchronized (this) {
            if (this.f7506) {
                this.f7507.t_().m11713().m11606("Connection attempt already in progress");
            } else if (this.f7505 == null || (!this.f7505.m7772() && !this.f7505.m7783())) {
                this.f7505 = new C2138(r0, Looper.getMainLooper(), this, this);
                this.f7507.t_().m11713().m11606("Connecting to remote service");
                this.f7506 = true;
                this.f7505.m7767();
            } else {
                this.f7507.t_().m11713().m11606("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8453(Bundle bundle) {
        C2745.C2746.m14556("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f7507.u_().m13668((Runnable) new C1521(this, (C2082) this.f7505.m7768()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f7505 = null;
                this.f7506 = false;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8458(int i) {
        C2745.C2746.m14556("MeasurementServiceConnection.onConnectionSuspended");
        this.f7507.t_().m11711().m11606("Service connection suspended");
        this.f7507.u_().m13668((Runnable) new C1399(this));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8457(C2822 r3) {
        C2745.C2746.m14556("MeasurementServiceConnection.onConnectionFailed");
        C2244 r0 = this.f7507.f14314.m14083();
        if (r0 != null) {
            r0.A_().m11603("Service connection failed", r3);
        }
        synchronized (this) {
            this.f7506 = false;
            this.f7505 = null;
        }
        this.f7507.u_().m13668((Runnable) new C1529(this));
    }
}
