package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C2383;
import o.C2771;
import o.C2864;

/* renamed from: o.ϥ  reason: contains not printable characters */
public final class C2157 implements C2218<C2864.Cif> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C2157 f10322 = new C2157();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f10323 = C2383.C2385.m12397("c", "v", "i", "o");

    private C2157() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m11423(C2383 r13, float f) {
        if (r13.m12390() == C2383.C2384.BEGIN_ARRAY) {
            r13.m12388();
        }
        r13.m12391();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (r13.m12383()) {
            int r5 = r13.m12385(f10323);
            if (r5 == 0) {
                z = r13.m12394();
            } else if (r5 == 1) {
                list = C2041.m10926(r13, f);
            } else if (r5 == 2) {
                list2 = C2041.m10926(r13, f);
            } else if (r5 != 3) {
                r13.m12393();
                r13.m12396();
            } else {
                list3 = C2041.m10926(r13, f);
            }
        }
        r13.m12392();
        if (r13.m12390() == C2383.C2384.END_ARRAY) {
            r13.m12386();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C2864.Cif(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C2771.Cif(C2493.m13240(list.get(i2), list3.get(i2)), C2493.m13240(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C2771.Cif(C2493.m13240(list.get(i3), list3.get(i3)), C2493.m13240(pointF3, list2.get(0)), pointF3));
            }
            return new C2864.Cif(pointF, z, arrayList);
        }
    }
}
