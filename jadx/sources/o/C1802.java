package o;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C1855;

/* renamed from: o.Ιƾ  reason: contains not printable characters */
public final class C1802 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f9239;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1855 f9240;

    /* renamed from: ι  reason: contains not printable characters */
    private Integer f9241 = null;

    public C1802(C1855 r1, String str) {
        this.f9240 = r1;
        this.f9239 = str;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9988(List<C1734> list) {
        if (list.isEmpty()) {
            C1855 r6 = this.f9240;
            if (r6 != null) {
                m9985((Collection<C1855.C1856>) r6.m10220(this.f9239, ""));
                return;
            }
            throw new C1794("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        HashSet hashSet = new HashSet();
        for (C1734 r3 : list) {
            hashSet.add(r3.f8964);
        }
        List<C1855.C1856> r1 = this.f9240.m10220(this.f9239, "");
        HashSet hashSet2 = new HashSet();
        for (C1855.C1856 r4 : r1) {
            hashSet2.add(r4.f9478);
        }
        m9985((Collection<C1855.C1856>) m9986(r1, hashSet));
        m9987(m9983(list, hashSet2));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static ArrayList<C1855.C1856> m9986(List<C1855.C1856> list, Set<String> set) {
        ArrayList<C1855.C1856> arrayList = new ArrayList<>();
        for (C1855.C1856 next : list) {
            if (!set.contains(next.f9478)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static ArrayList<C1734> m9983(List<C1734> list, Set<String> set) {
        ArrayList<C1734> arrayList = new ArrayList<>();
        for (C1734 next : list) {
            if (!set.contains(next.f8964)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m9987(List<C1734> list) {
        ArrayDeque arrayDeque = new ArrayDeque(this.f9240.m10220(this.f9239, ""));
        if (this.f9241 == null) {
            this.f9241 = Integer.valueOf(this.f9240.m10219(this.f9239));
        }
        int intValue = this.f9241.intValue();
        for (C1734 next : list) {
            while (arrayDeque.size() >= intValue) {
                this.f9240.m10223(((C1855.C1856) arrayDeque.pollFirst()).f9478);
            }
            String str = this.f9239;
            C1855.C1856 r4 = new C1855.C1856();
            r4.f9476 = str;
            r4.f9484 = next.f8961.getTime();
            r4.f9478 = next.f8964;
            r4.f9481 = next.f8962;
            r4.f9486 = TextUtils.isEmpty(next.f8960) ? null : next.f8960;
            r4.f9485 = next.f8963;
            r4.f9489 = next.f8965;
            this.f9240.m10218(r4);
            arrayDeque.offer(r4);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9985(Collection<C1855.C1856> collection) {
        for (C1855.C1856 r0 : collection) {
            this.f9240.m10223(r0.f9478);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static List<C1734> m9984(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> r1 : list) {
            arrayList.add(C1734.m9756(r1));
        }
        return arrayList;
    }
}
