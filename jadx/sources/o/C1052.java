package o;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ɉЈ  reason: contains not printable characters */
final class C1052 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6318;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f6319;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ boolean f6320;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6321;

    C1052(C0848 r1, AtomicReference atomicReference, C2270 r3, boolean z) {
        this.f6321 = r1;
        this.f6319 = atomicReference;
        this.f6318 = r3;
        this.f6320 = z;
    }

    public final void run() {
        synchronized (this.f6319) {
            try {
                C2082 r1 = this.f6321.f5552;
                if (r1 == null) {
                    this.f6321.t_().m11714().m11606("Failed to get all user properties; not connected to service");
                    this.f6319.notify();
                    return;
                }
                this.f6319.set(r1.m11062(this.f6318, this.f6320));
                this.f6321.m6359();
                this.f6319.notify();
            } catch (RemoteException e) {
                try {
                    this.f6321.t_().m11714().m11603("Failed to get all user properties; remote exception", e);
                    this.f6319.notify();
                } catch (Throwable th) {
                    this.f6319.notify();
                    throw th;
                }
            }
        }
    }
}
