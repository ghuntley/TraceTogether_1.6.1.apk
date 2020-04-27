package o;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ɒı  reason: contains not printable characters */
final class C1103 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ String f6544;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f6545;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6546;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ String f6547;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f6548;

    /* renamed from: і  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6549;

    C1103(C0848 r1, AtomicReference atomicReference, String str, String str2, String str3, C2270 r6) {
        this.f6549 = r1;
        this.f6545 = atomicReference;
        this.f6548 = str;
        this.f6544 = str2;
        this.f6547 = str3;
        this.f6546 = r6;
    }

    public final void run() {
        synchronized (this.f6545) {
            try {
                C2082 r1 = this.f6549.f5552;
                if (r1 == null) {
                    this.f6549.t_().m11714().m11604("(legacy) Failed to get conditional properties; not connected to service", C2244.m11698(this.f6548), this.f6544, this.f6547);
                    this.f6545.set(Collections.emptyList());
                    this.f6545.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f6548)) {
                    this.f6545.set(r1.m11060(this.f6544, this.f6547, this.f6546));
                } else {
                    this.f6545.set(r1.m11070(this.f6548, this.f6544, this.f6547));
                }
                this.f6549.m6359();
                this.f6545.notify();
            } catch (RemoteException e) {
                try {
                    this.f6549.t_().m11714().m11604("(legacy) Failed to get conditional properties; remote exception", C2244.m11698(this.f6548), this.f6544, e);
                    this.f6545.set(Collections.emptyList());
                    this.f6545.notify();
                } catch (Throwable th) {
                    this.f6545.notify();
                    throw th;
                }
            }
        }
    }
}
