package o;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzc;

/* renamed from: o.ɟӏ  reason: contains not printable characters */
public final class C1168 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ String f6735;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ zzc f6736;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ LifecycleCallback f6737;

    public C1168(zzc zzc, LifecycleCallback lifecycleCallback, String str) {
        this.f6736 = zzc;
        this.f6737 = lifecycleCallback;
        this.f6735 = str;
    }

    public final void run() {
        if (this.f6736.f558 > 0) {
            this.f6737.m773(this.f6736.f557 != null ? this.f6736.f557.getBundle(this.f6735) : null);
        }
        if (this.f6736.f558 >= 2) {
            this.f6737.m772();
        }
        if (this.f6736.f558 >= 3) {
            this.f6737.m767();
        }
        if (this.f6736.f558 >= 4) {
            this.f6737.m769();
        }
        if (this.f6736.f558 >= 5) {
            this.f6737.m775();
        }
    }
}
