package o;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ɪυ  reason: contains not printable characters */
final class C1382 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f7606;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ String f7607;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ boolean f7608;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ String f7609;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f7610;

    /* renamed from: І  reason: contains not printable characters */
    private final /* synthetic */ C2270 f7611;

    /* renamed from: і  reason: contains not printable characters */
    private final /* synthetic */ C0848 f7612;

    C1382(C0848 r1, AtomicReference atomicReference, String str, String str2, String str3, boolean z, C2270 r7) {
        this.f7612 = r1;
        this.f7606 = atomicReference;
        this.f7609 = str;
        this.f7607 = str2;
        this.f7610 = str3;
        this.f7608 = z;
        this.f7611 = r7;
    }

    public final void run() {
        synchronized (this.f7606) {
            try {
                C2082 r1 = this.f7612.f5552;
                if (r1 == null) {
                    this.f7612.t_().m11714().m11604("(legacy) Failed to get user properties; not connected to service", C2244.m11698(this.f7609), this.f7607, this.f7610);
                    this.f7606.set(Collections.emptyList());
                    this.f7606.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f7609)) {
                    this.f7606.set(r1.m11061(this.f7607, this.f7610, this.f7608, this.f7611));
                } else {
                    this.f7606.set(r1.m11057(this.f7609, this.f7607, this.f7610, this.f7608));
                }
                this.f7612.m6359();
                this.f7606.notify();
            } catch (RemoteException e) {
                try {
                    this.f7612.t_().m11714().m11604("(legacy) Failed to get user properties; remote exception", C2244.m11698(this.f7609), this.f7607, e);
                    this.f7606.set(Collections.emptyList());
                    this.f7606.notify();
                } catch (Throwable th) {
                    this.f7606.notify();
                    throw th;
                }
            }
        }
    }
}
