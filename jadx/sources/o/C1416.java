package o;

import java.util.List;

/* renamed from: o.ɫΙ  reason: contains not printable characters */
final class C1416 extends C1309 {
    private C1416() {
        super();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final <L> List<L> m8631(Object obj, long j) {
        C1001 r0 = m8628(obj, j);
        if (r0.m7115()) {
            return r0;
        }
        int size = r0.size();
        C1001 r02 = r0.m7113(size == 0 ? 10 : size << 1);
        C2509.m13291(obj, j, (Object) r02);
        return r02;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8630(Object obj, long j) {
        m8628(obj, j).m7114();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final <E> void m8629(Object obj, Object obj2, long j) {
        C1001 r0 = m8628(obj, j);
        C1001 r6 = m8628(obj2, j);
        int size = r0.size();
        int size2 = r6.size();
        if (size > 0 && size2 > 0) {
            if (!r0.m7115()) {
                r0 = r0.m7113(size2 + size);
            }
            r0.addAll(r6);
        }
        if (size > 0) {
            r6 = r0;
        }
        C2509.m13291(obj, j, (Object) r6);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static <E> C1001<E> m8628(Object obj, long j) {
        return (C1001) C2509.m13271(obj, j);
    }
}
