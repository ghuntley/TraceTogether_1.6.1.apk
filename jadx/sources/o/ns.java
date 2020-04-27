package o;

import java.util.ArrayList;
import java.util.Collection;

public final class ns {
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean f3428 = true;

    static {
        try {
            Class.forName("android.os.Build");
        } catch (Exception unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0269 m4025(Collection<np> collection) {
        if (collection != null && !collection.isEmpty()) {
            return new C0269(collection);
        }
        throw new IllegalArgumentException("Reducer must not be null or empty");
    }

    /* renamed from: o.ns$ı  reason: contains not printable characters */
    public static class C0269 {

        /* renamed from: ı  reason: contains not printable characters */
        public ng<Object> f3429 = ni.f3401;

        /* renamed from: Ι  reason: contains not printable characters */
        public Collection<nn> f3430 = new ArrayList();

        /* renamed from: ι  reason: contains not printable characters */
        public final Collection<np> f3431;

        C0269(Collection<np> collection) {
            this.f3431 = collection;
        }
    }
}
