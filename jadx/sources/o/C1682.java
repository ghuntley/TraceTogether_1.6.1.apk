package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import o.C1283;
import o.C2745;

/* renamed from: o.ʟɍ  reason: contains not printable characters */
final class C1682 extends C1283 implements Handler.Callback {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final Context f8704;
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long f8705;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final long f8706;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1345 f8707;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public final HashMap<C1283.If, C1740> f8708 = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final Handler f8709;

    C1682(Context context) {
        this.f8704 = context.getApplicationContext();
        this.f8709 = new C0527(context.getMainLooper(), this);
        this.f8707 = C1345.m8433();
        this.f8706 = 5000;
        this.f8705 = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m9568(C1283.If ifR, ServiceConnection serviceConnection, String str) {
        boolean r5;
        C2745.C2746.m14559(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8708) {
            C1740 r1 = this.f8708.get(ifR);
            if (r1 == null) {
                r1 = new C1740(this, ifR);
                r1.m9801(serviceConnection, str);
                r1.m9805(str);
                this.f8708.put(ifR, r1);
            } else {
                this.f8709.removeMessages(0, ifR);
                if (!r1.m9802(serviceConnection)) {
                    r1.m9801(serviceConnection, str);
                    int r52 = r1.m9803();
                    if (r52 == 1) {
                        serviceConnection.onServiceConnected(r1.m9800(), r1.m9799());
                    } else if (r52 == 2) {
                        r1.m9805(str);
                    }
                } else {
                    String valueOf = String.valueOf(ifR);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            r5 = r1.m9796();
        }
        return r5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m9569(C1283.If ifR, ServiceConnection serviceConnection, String str) {
        C2745.C2746.m14559(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8708) {
            C1740 r1 = this.f8708.get(ifR);
            if (r1 == null) {
                String valueOf = String.valueOf(ifR);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (r1.m9802(serviceConnection)) {
                r1.m9804(serviceConnection, str);
                if (r1.m9798()) {
                    this.f8709.sendMessageDelayed(this.f8709.obtainMessage(0, ifR), this.f8706);
                }
            } else {
                String valueOf2 = String.valueOf(ifR);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f8708) {
                C1283.If ifR = (C1283.If) message.obj;
                C1740 r2 = this.f8708.get(ifR);
                if (r2 != null && r2.m9798()) {
                    if (r2.m9796()) {
                        r2.m9797("GmsClientSupervisor");
                    }
                    this.f8708.remove(ifR);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f8708) {
                C1283.If ifR2 = (C1283.If) message.obj;
                C1740 r22 = this.f8708.get(ifR2);
                if (r22 != null && r22.m9803() == 3) {
                    String valueOf = String.valueOf(ifR2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName r3 = r22.m9800();
                    if (r3 == null) {
                        r3 = ifR2.m8201();
                    }
                    if (r3 == null) {
                        r3 = new ComponentName(ifR2.m8204(), "unknown");
                    }
                    r22.onServiceDisconnected(r3);
                }
            }
            return true;
        }
    }
}
