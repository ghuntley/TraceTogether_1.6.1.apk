package o;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: o.Ɏ  reason: contains not printable characters */
final class C1088 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C1078 f6491;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ String f6492;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ LifecycleCallback f6493;

    C1088(C1078 r1, LifecycleCallback lifecycleCallback, String str) {
        this.f6491 = r1;
        this.f6493 = lifecycleCallback;
        this.f6492 = str;
    }

    public final void run() {
        if (this.f6491.f6462 > 0) {
            this.f6493.m773(this.f6491.f6460 != null ? this.f6491.f6460.getBundle(this.f6492) : null);
        }
        if (this.f6491.f6462 >= 2) {
            this.f6493.m772();
        }
        if (this.f6491.f6462 >= 3) {
            this.f6493.m767();
        }
        if (this.f6491.f6462 >= 4) {
            this.f6493.m769();
        }
        if (this.f6491.f6462 >= 5) {
            this.f6493.m775();
        }
    }
}
