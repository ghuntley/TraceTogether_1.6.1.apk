package o;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ɉǀ  reason: contains not printable characters */
final class C1046 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6307;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6308;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f6309;

    C1046(C0848 r1, AtomicReference atomicReference, C2270 r3) {
        this.f6308 = r1;
        this.f6309 = atomicReference;
        this.f6307 = r3;
    }

    public final void run() {
        synchronized (this.f6309) {
            try {
                C2082 r1 = this.f6308.f5552;
                if (r1 == null) {
                    this.f6308.t_().m11714().m11606("Failed to get app instance id");
                    this.f6309.notify();
                    return;
                }
                this.f6309.set(r1.m11056(this.f6307));
                String str = (String) this.f6309.get();
                if (str != null) {
                    this.f6308.m11088().m4342(str);
                    this.f6308.s_().f10791.m12587(str);
                }
                this.f6308.m6359();
                this.f6309.notify();
            } catch (RemoteException e) {
                try {
                    this.f6308.t_().m11714().m11603("Failed to get app instance id", e);
                    this.f6309.notify();
                } catch (Throwable th) {
                    this.f6309.notify();
                    throw th;
                }
            }
        }
    }
}
