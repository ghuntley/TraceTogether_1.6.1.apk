package androidx.savedstate;

import o.C1555;
import o.C2319;
import o.C2456;
import o.C2851;

public class SavedStateRegistry$1 implements C2456 {

    /* renamed from: Ι  reason: contains not printable characters */
    final /* synthetic */ C1555 f453;

    public SavedStateRegistry$1(C1555 r1) {
        this.f453 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m608(C2851 r1, C2319.C2320 r2) {
        if (r2 == C2319.C2320.ON_START) {
            this.f453.f8300 = true;
        } else if (r2 == C2319.C2320.ON_STOP) {
            this.f453.f8300 = false;
        }
    }
}
