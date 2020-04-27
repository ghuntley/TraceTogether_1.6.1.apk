package androidx.viewpager2.adapter;

import android.os.Handler;
import o.C2319;
import o.C2456;
import o.C2851;

public class FragmentStateAdapter$5 implements C2456 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final /* synthetic */ Runnable f457;

    /* renamed from: ɩ  reason: contains not printable characters */
    final /* synthetic */ Handler f458;

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m612(C2851 r2, C2319.C2320 r3) {
        if (r3 == C2319.C2320.ON_DESTROY) {
            this.f458.removeCallbacks(this.f457);
            r2.getLifecycle().m12097(this);
        }
    }
}
