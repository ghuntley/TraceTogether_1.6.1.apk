package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.ɩυ  reason: contains not printable characters */
final class C1290 extends C1309 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Class<?> f7244 = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C1290() {
        super();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final <L> List<L> m8228(Object obj, long j) {
        return m8225(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8227(Object obj, long j) {
        Object obj2;
        List list = (List) C2509.m13271(obj, j);
        if (list instanceof C1183) {
            obj2 = ((C1183) list).m7716();
        } else if (!f7244.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C2061) || !(list instanceof C1001)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C1001 r0 = (C1001) list;
                if (r0.m7115()) {
                    r0.m7114();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C2509.m13291(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: o.ɤɩ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: o.ɤɩ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: o.ɤɩ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m8225(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m8224(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof o.C1183
            if (r1 == 0) goto L_0x0014
            o.ɤɩ r0 = new o.ɤɩ
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof o.C2061
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof o.C1001
            if (r1 == 0) goto L_0x0024
            o.Ɂǃ r0 = (o.C1001) r0
            o.Ɂǃ r6 = r0.m7113(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            o.C2509.m13291((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f7244
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            o.C2509.m13291((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof o.C2514
            if (r1 == 0) goto L_0x0062
            o.ɤɩ r1 = new o.ɤɩ
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            o.ьı r0 = (o.C2514) r0
            r1.addAll(r0)
            o.C2509.m13291((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof o.C2061
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof o.C1001
            if (r1 == 0) goto L_0x007f
            r1 = r0
            o.Ɂǃ r1 = (o.C1001) r1
            boolean r2 = r1.m7115()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            o.Ɂǃ r0 = r1.m7113(r0)
            o.C2509.m13291((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1290.m8225(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final <E> void m8226(Object obj, Object obj2, long j) {
        List r5 = m8224(obj2, j);
        List r0 = m8225(obj, j, r5.size());
        int size = r0.size();
        int size2 = r5.size();
        if (size > 0 && size2 > 0) {
            r0.addAll(r5);
        }
        if (size > 0) {
            r5 = r0;
        }
        C2509.m13291(obj, j, (Object) r5);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static <E> List<E> m8224(Object obj, long j) {
        return (List) C2509.m13271(obj, j);
    }
}
