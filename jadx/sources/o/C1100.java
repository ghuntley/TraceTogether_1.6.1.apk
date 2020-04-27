package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ɑ  reason: contains not printable characters */
public final class C1100 implements Runnable {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2499 f6536;

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m7482(RecyclerView.C0033 r3, C0966 r4, View view, View view2, RecyclerView.IF ifR, boolean z, boolean z2) {
        int i;
        if (ifR.m421() != 0) {
            if (!((r3.f378 ? r3.f375 - r3.f374 : r3.f366) == 0 || view == null || view2 == null)) {
                int min = Math.min(RecyclerView.IF.m392(view), RecyclerView.IF.m392(view2));
                int max = Math.max(RecyclerView.IF.m392(view), RecyclerView.IF.m392(view2));
                if (z2) {
                    i = Math.max(0, ((r3.f378 ? r3.f375 - r3.f374 : r3.f366) - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!z) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(r4.m6895(view2) - r4.m6897(view))) / ((float) (Math.abs(RecyclerView.IF.m392(view) - RecyclerView.IF.m392(view2)) + 1)))) + ((float) (r4.m6889() - r4.m6897(view))));
            }
        }
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m7481(RecyclerView.C0033 r0, C0966 r1, View view, View view2, RecyclerView.IF ifR, boolean z) {
        if (ifR.m421() == 0) {
            return 0;
        }
        if ((r0.f378 ? r0.f375 - r0.f374 : r0.f366) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.IF.m392(view) - RecyclerView.IF.m392(view2)) + 1;
        }
        return Math.min(r1.m6891(), r1.m6895(view2) - r1.m6897(view));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m7480(RecyclerView.C0033 r1, C0966 r2, View view, View view2, RecyclerView.IF ifR, boolean z) {
        if (ifR.m421() == 0) {
            return 0;
        }
        if ((r1.f378 ? r1.f375 - r1.f374 : r1.f366) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return r1.f378 ? r1.f375 - r1.f374 : r1.f366;
        }
        return (int) ((((float) (r2.m6895(view2) - r2.m6897(view))) / ((float) (Math.abs(RecyclerView.IF.m392(view) - RecyclerView.IF.m392(view2)) + 1))) * ((float) (r1.f378 ? r1.f375 - r1.f374 : r1.f366)));
    }

    public C1100(C2499 r1) {
        this.f6536 = r1;
    }

    public final void run() {
        C2499 r0 = this.f6536;
        r0.f11318.m14295(new C1238(r0));
    }
}
