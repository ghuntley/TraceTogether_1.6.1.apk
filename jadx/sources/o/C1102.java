package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.ɒ  reason: contains not printable characters */
public class C1102 extends C2449 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final If f6540;

    /* renamed from: Ι  reason: contains not printable characters */
    final RecyclerView f6541;

    public C1102(RecyclerView recyclerView) {
        this.f6541 = recyclerView;
        If ifR = this.f6540;
        if (ifR == null || !(ifR instanceof If)) {
            this.f6540 = new If(this);
        } else {
            this.f6540 = ifR;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m7484(View view, int i, Bundle bundle) {
        if (super.m12580(view, i, bundle)) {
            return true;
        }
        if (this.f6541.hasPendingAdapterUpdates() || this.f6541.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.IF layoutManager = this.f6541.getLayoutManager();
        return layoutManager.m420(layoutManager.f349.mRecycler, layoutManager.f349.mState, i, bundle);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m7483(View view, C0520 r4) {
        super.m12579(view, r4);
        if (!this.f6541.hasPendingAdapterUpdates() && this.f6541.getLayoutManager() != null) {
            RecyclerView.IF layoutManager = this.f6541.getLayoutManager();
            layoutManager.m418(layoutManager.f349.mRecycler, layoutManager.f349.mState, r4);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m7485(View view, AccessibilityEvent accessibilityEvent) {
        super.m12584(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f6541.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m401(accessibilityEvent);
            }
        }
    }

    /* renamed from: o.ɒ$If */
    public static class If extends C2449 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public Map<View, C2449> f6542 = new WeakHashMap();

        /* renamed from: ɩ  reason: contains not printable characters */
        final C1102 f6543;

        public If(C1102 r2) {
            this.f6543 = r2;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7489(View view, C0520 r3) {
            if (this.f6543.f6541.hasPendingAdapterUpdates() || this.f6543.f6541.getLayoutManager() == null) {
                super.m12579(view, r3);
                return;
            }
            this.f6543.f6541.getLayoutManager().m437(view, r3);
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                r0.m12579(view, r3);
            } else {
                super.m12579(view, r3);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m7490(View view, int i, Bundle bundle) {
            if (this.f6543.f6541.hasPendingAdapterUpdates() || this.f6543.f6541.getLayoutManager() == null) {
                return super.m12580(view, i, bundle);
            }
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                if (r0.m12580(view, i, bundle)) {
                    return true;
                }
            } else if (super.m12580(view, i, bundle)) {
                return true;
            }
            this.f6543.f6541.getLayoutManager();
            return false;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7487(View view, int i) {
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                r0.m12577(view, i);
            } else {
                super.m12577(view, i);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m7488(View view, AccessibilityEvent accessibilityEvent) {
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                r0.m12578(view, accessibilityEvent);
            } else {
                super.m12578(view, accessibilityEvent);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m7492(View view, AccessibilityEvent accessibilityEvent) {
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                return r0.m12582(view, accessibilityEvent);
            }
            return super.m12582(view, accessibilityEvent);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m7486(View view, AccessibilityEvent accessibilityEvent) {
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                r0.m12576(view, accessibilityEvent);
            } else {
                super.m12576(view, accessibilityEvent);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m7494(View view, AccessibilityEvent accessibilityEvent) {
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                r0.m12584(view, accessibilityEvent);
            } else {
                super.m12584(view, accessibilityEvent);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m7491(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2449 r0 = this.f6542.get(viewGroup);
            if (r0 != null) {
                return r0.m12581(viewGroup, view, accessibilityEvent);
            }
            return super.m12581(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0577 m7493(View view) {
            C2449 r0 = this.f6542.get(view);
            if (r0 != null) {
                return r0.m12583(view);
            }
            return super.m12583(view);
        }
    }
}
