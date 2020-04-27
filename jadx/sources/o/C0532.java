package o;

import java.util.Comparator;

/* renamed from: o.łǀ  reason: contains not printable characters */
final class C0532 implements Comparator<C0510> {
    C0532() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0510 r5 = (C0510) obj;
        C0510 r6 = (C0510) obj2;
        C0596 r0 = (C0596) r5.iterator();
        C0596 r1 = (C0596) r6.iterator();
        while (r0.hasNext() && r1.hasNext()) {
            int compare = Integer.compare(C0510.m4956(r0.m5264()), C0510.m4956(r1.m5264()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(r5.m4967(), r6.m4967());
    }
}
