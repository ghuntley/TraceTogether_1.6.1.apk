package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import o.C0293;
import o.C1265;
import o.C1277;
import o.C1550;
import o.C2319;
import o.C2456;
import o.C2776;
import o.C2797;
import o.C2851;

public class FragmentStateAdapter$2 implements C2456 {

    /* renamed from: ı  reason: contains not printable characters */
    final /* synthetic */ C2797 f455;

    /* renamed from: ɩ  reason: contains not printable characters */
    final /* synthetic */ C2776 f456;

    private FragmentStateAdapter$2(C2776 r1, C2797 r2) {
        this.f456 = r1;
        this.f455 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m611(C2851 r9, C2319.C2320 r10) {
        C1550 r102 = this.f456.f13154;
        if (!(r102.f8272 || r102.f8276)) {
            r9.getLifecycle().m12097(this);
            if (C0293.m4187((FrameLayout) this.f455.itemView)) {
                C2776 r92 = this.f456;
                C2797 r103 = this.f455;
                C2776.C2777 r5 = null;
                C1277 r0 = r92.f13153.m6119(r103.getItemId(), r5);
                if (r0 != null) {
                    FrameLayout frameLayout = (FrameLayout) r103.itemView;
                    View view = r0.getView();
                    if (!r0.isAdded() && view != null) {
                        throw new IllegalStateException("Design assumption violated.");
                    } else if (r0.isAdded() && view == null) {
                        r92.m14667(r0, frameLayout);
                    } else if (!r0.isAdded() || view.getParent() == null) {
                        if (r0.isAdded()) {
                            C2776.m14666(view, frameLayout);
                            return;
                        }
                        C1550 r3 = r92.f13154;
                        if (!(r3.f8272 || r3.f8276)) {
                            r92.m14667(r0, frameLayout);
                            C1265 r32 = new C1265(r92.f13154);
                            StringBuilder sb = new StringBuilder("f");
                            sb.append(r103.getItemId());
                            r32.m9968(0, r0, sb.toString(), 1);
                            r32.m9961(r0, C2319.Cif.STARTED).m9970();
                            r5.m14669();
                        } else if (!r92.f13154.f8270) {
                            r92.f13155.m12098(new FragmentStateAdapter$2(r92, r103));
                        }
                    } else if (view.getParent() != frameLayout) {
                        C2776.m14666(view, frameLayout);
                    }
                } else {
                    throw new IllegalStateException("Design assumption violated.");
                }
            }
        }
    }
}
