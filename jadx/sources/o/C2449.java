package o;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o.C0520;

/* renamed from: o.л  reason: contains not printable characters */
public class C2449 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final View.AccessibilityDelegate f11107 = new View.AccessibilityDelegate();

    /* renamed from: ı  reason: contains not printable characters */
    private final View.AccessibilityDelegate f11108;

    /* renamed from: Ι  reason: contains not printable characters */
    private final View.AccessibilityDelegate f11109;

    /* renamed from: o.л$if  reason: invalid class name */
    static final class Cif extends View.AccessibilityDelegate {

        /* renamed from: ɩ  reason: contains not printable characters */
        final C2449 f11110;

        Cif(C2449 r1) {
            this.f11110 = r1;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f11110.m12582(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f11110.m12584(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0520 r0 = C0520.m4998(accessibilityNodeInfo);
            r0.m5070(C0293.m4192(view));
            r0.m5044(C0293.m4211(view));
            r0.m5015(C0293.m4216(view));
            this.f11110.m12579(view, r0);
            r0.m5009(accessibilityNodeInfo.getText(), view);
            List<C0520.Cif> r3 = C2449.m12574(view);
            for (int i = 0; i < r3.size(); i++) {
                r0.m5052(r3.get(i));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f11110.m12576(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f11110.m12581(viewGroup, view, accessibilityEvent);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.f11110.m12577(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f11110.m12578(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0577 r2 = this.f11110.m12583(view);
            if (r2 != null) {
                return (AccessibilityNodeProvider) r2.m5194();
            }
            return null;
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f11110.m12580(view, i, bundle);
        }
    }

    public C2449() {
        this(f11107);
    }

    public C2449(View.AccessibilityDelegate accessibilityDelegate) {
        this.f11108 = accessibilityDelegate;
        this.f11109 = new Cif(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public View.AccessibilityDelegate m12575() {
        return this.f11109;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m12577(View view, int i) {
        this.f11108.sendAccessibilityEvent(view, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m12578(View view, AccessibilityEvent accessibilityEvent) {
        this.f11108.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m12582(View view, AccessibilityEvent accessibilityEvent) {
        return this.f11108.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m12576(View view, AccessibilityEvent accessibilityEvent) {
        this.f11108.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m12584(View view, AccessibilityEvent accessibilityEvent) {
        this.f11108.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m12579(View view, C0520 r3) {
        this.f11108.onInitializeAccessibilityNodeInfo(view, r3.m5006());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m12581(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f11108.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0577 m12583(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f11108.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0577(accessibilityNodeProvider);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m12580(View view, int i, Bundle bundle) {
        List<C0520.Cif> r0 = m12574(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= r0.size()) {
                break;
            }
            C0520.Cif ifVar = r0.get(i2);
            if (ifVar.m5074() == i) {
                z = ifVar.m5073(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f11108.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != R.id.f163962131361865) ? z : m12573(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m12573(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.f167582131362366);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m12572(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m12572(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] r5 = C0520.m4991(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (r5 != null && i < r5.length) {
                if (clickableSpan.equals(r5[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static List<C0520.Cif> m12574(View view) {
        List<C0520.Cif> list = (List) view.getTag(R.id.f167572131362365);
        return list == null ? Collections.emptyList() : list;
    }
}
