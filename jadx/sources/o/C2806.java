package o;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import o.C2895;

/* renamed from: o.Ӏʟ  reason: contains not printable characters */
final class C2806 extends C2895.C2898 {

    /* renamed from: ı  reason: contains not printable characters */
    final List<C2895.C2898> f13220 = new ArrayList(3);

    C2806() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m14715(int i, float f, int i2) {
        try {
            for (C2895.C2898 r1 : this.f13220) {
                r1.m15020(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14716(int i) {
        try {
            for (C2895.C2898 r1 : this.f13220) {
                r1.m15021(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14717(int i) {
        try {
            for (C2895.C2898 r1 : this.f13220) {
                r1.m15022(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
