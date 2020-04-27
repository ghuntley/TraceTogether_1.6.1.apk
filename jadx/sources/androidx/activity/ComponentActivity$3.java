package androidx.activity;

import o.C2319;
import o.C2456;
import o.C2557;
import o.C2851;

public class ComponentActivity$3 implements C2456 {

    /* renamed from: ι  reason: contains not printable characters */
    final /* synthetic */ C2557 f85;

    public ComponentActivity$3(C2557 r1) {
        this.f85 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m92(C2851 r1, C2319.C2320 r2) {
        if (r2 == C2319.C2320.ON_DESTROY && !this.f85.isChangingConfigurations()) {
            this.f85.getViewModelStore().m4365();
        }
    }
}
