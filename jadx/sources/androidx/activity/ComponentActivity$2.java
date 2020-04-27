package androidx.activity;

import android.view.View;
import android.view.Window;
import o.C2319;
import o.C2456;
import o.C2557;
import o.C2851;

public class ComponentActivity$2 implements C2456 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final /* synthetic */ C2557 f84;

    public ComponentActivity$2(C2557 r1) {
        this.f84 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m91(C2851 r1, C2319.C2320 r2) {
        if (r2 == C2319.C2320.ON_STOP) {
            Window window = this.f84.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
