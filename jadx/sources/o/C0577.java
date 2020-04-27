package o;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ſı  reason: contains not printable characters */
public class C0577 {

    /* renamed from: ι  reason: contains not printable characters */
    private final Object f4492;

    /* renamed from: ı  reason: contains not printable characters */
    public boolean m5195(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0520 m5196(int i) {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public List<C0520> m5197(String str, int i) {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C0520 m5198(int i) {
        return null;
    }

    /* renamed from: o.ſı$if  reason: invalid class name */
    static class Cif extends AccessibilityNodeProvider {

        /* renamed from: ɩ  reason: contains not printable characters */
        final C0577 f4493;

        Cif(C0577 r1) {
            this.f4493 = r1;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0520 r2 = this.f4493.m5196(i);
            if (r2 == null) {
                return null;
            }
            return r2.m5006();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0520> r4 = this.f4493.m5197(str, i);
            if (r4 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = r4.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(r4.get(i2).m5006());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f4493.m5195(i, i2, bundle);
        }
    }

    /* renamed from: o.ſı$ı  reason: contains not printable characters */
    static class C0578 extends Cif {
        C0578(C0577 r1) {
            super(r1);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0520 r2 = this.f4493.m5198(i);
            if (r2 == null) {
                return null;
            }
            return r2.m5006();
        }
    }

    public C0577() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4492 = new C0578(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f4492 = new Cif(this);
        } else {
            this.f4492 = null;
        }
    }

    public C0577(Object obj) {
        this.f4492 = obj;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public Object m5194() {
        return this.f4492;
    }
}
