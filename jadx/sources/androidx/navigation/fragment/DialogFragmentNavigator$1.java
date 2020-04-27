package androidx.navigation.fragment;

import androidx.fragment.app.DialogFragment;
import o.C0800;
import o.C2319;
import o.C2456;
import o.C2851;

public class DialogFragmentNavigator$1 implements C2456 {

    /* renamed from: ι  reason: contains not printable characters */
    final /* synthetic */ C0800 f262;

    public DialogFragmentNavigator$1(C0800 r1) {
        this.f262 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m220(C2851 r2, C2319.C2320 r3) {
        if (r3 == C2319.C2320.ON_STOP) {
            DialogFragment dialogFragment = (DialogFragment) r2;
            if (!dialogFragment.m176().isShowing()) {
                NavHostFragment.m221(dialogFragment).m5119();
            }
        }
    }
}
