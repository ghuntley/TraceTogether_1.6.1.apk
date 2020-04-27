package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;
import o.C1283;

/* renamed from: o.ͻɹ  reason: contains not printable characters */
final class C1740 implements ServiceConnection {

    /* renamed from: ı  reason: contains not printable characters */
    private final Set<ServiceConnection> f9033 = new HashSet();

    /* renamed from: ǃ  reason: contains not printable characters */
    private IBinder f9034;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1283.If f9035;

    /* renamed from: ɹ  reason: contains not printable characters */
    private ComponentName f9036;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f9037 = 2;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f9038;

    /* renamed from: і  reason: contains not printable characters */
    private final /* synthetic */ C1682 f9039;

    public C1740(C1682 r1, C1283.If ifR) {
        this.f9039 = r1;
        this.f9035 = ifR;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9039.f8708) {
            this.f9039.f8709.removeMessages(1, this.f9035);
            this.f9034 = iBinder;
            this.f9036 = componentName;
            for (ServiceConnection onServiceConnected : this.f9033) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f9037 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9039.f8708) {
            this.f9039.f8709.removeMessages(1, this.f9035);
            this.f9034 = null;
            this.f9036 = componentName;
            for (ServiceConnection onServiceDisconnected : this.f9033) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f9037 = 2;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9805(String str) {
        this.f9037 = 3;
        this.f9038 = this.f9039.f8707.m8435(this.f9039.f8704, str, this.f9035.m8203(this.f9039.f8704), this, this.f9035.m8202());
        if (this.f9038) {
            this.f9039.f8709.sendMessageDelayed(this.f9039.f8709.obtainMessage(1, this.f9035), this.f9039.f8705);
            return;
        }
        this.f9037 = 2;
        try {
            this.f9039.f8707.m8434(this.f9039.f8704, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9797(String str) {
        this.f9039.f8709.removeMessages(1, this.f9035);
        this.f9039.f8707.m8434(this.f9039.f8704, this);
        this.f9038 = false;
        this.f9037 = 2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9801(ServiceConnection serviceConnection, String str) {
        C1345 unused = this.f9039.f8707;
        Context unused2 = this.f9039.f8704;
        this.f9035.m8203(this.f9039.f8704);
        this.f9033.add(serviceConnection);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9804(ServiceConnection serviceConnection, String str) {
        C1345 unused = this.f9039.f8707;
        Context unused2 = this.f9039.f8704;
        this.f9033.remove(serviceConnection);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m9796() {
        return this.f9038;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m9803() {
        return this.f9037;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9802(ServiceConnection serviceConnection) {
        return this.f9033.contains(serviceConnection);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9798() {
        return this.f9033.isEmpty();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final IBinder m9799() {
        return this.f9034;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final ComponentName m9800() {
        return this.f9036;
    }
}
