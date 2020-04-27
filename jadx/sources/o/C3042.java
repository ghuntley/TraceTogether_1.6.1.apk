package o;

import java.util.Collections;
import java.util.List;
import o.C3282auX;

/* renamed from: o.Ճ  reason: contains not printable characters */
public final class C3042 implements C2638, Cloneable {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3042 f13951 = new C3042();

    /* renamed from: ǃ  reason: contains not printable characters */
    public List<C3282auX.Cif> f13952 = Collections.emptyList();

    /* renamed from: ɩ  reason: contains not printable characters */
    public double f13953 = -1.0d;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f13954 = true;

    /* renamed from: ι  reason: contains not printable characters */
    public int f13955 = 136;

    /* renamed from: І  reason: contains not printable characters */
    public List<C3282auX.Cif> f13956 = Collections.emptyList();

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3042 clone() {
        try {
            return (C3042) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> C3011<T> m15527(C3122 r11, C3101<T> r12) {
        boolean r0 = m15529((Class<?>) r12.getRawType());
        final boolean z = r0 || m15530(true);
        final boolean z2 = r0 || m15530(false);
        if (!z && !z2) {
            return null;
        }
        final C3122 r8 = r11;
        final C3101<T> r9 = r12;
        return new C3011<T>() {

            /* renamed from: ɩ  reason: contains not printable characters */
            private C3011<T> f13959;

            /* renamed from: ǃ  reason: contains not printable characters */
            public final T m15531(C0995 r4) {
                if (z2) {
                    r4.m7097();
                    return null;
                }
                C3011<T> r0 = this.f13959;
                if (r0 == null) {
                    r0 = r8.m15832((C2638) C3042.this, r9);
                    this.f13959 = r0;
                }
                return r0.m15434(r4);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m15532(C0815 r4, T t) {
                if (z) {
                    r4.m6224();
                    return;
                }
                C3011<T> r0 = this.f13959;
                if (r0 == null) {
                    r0 = r8.m15832((C2638) C3042.this, r9);
                    this.f13959 = r0;
                }
                r0.m15435(r4, t);
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[RETURN] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m15529(java.lang.Class<?> r9) {
        /*
            r8 = this;
            double r0 = r8.f13953
            r2 = 0
            r3 = 1
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0042
            java.lang.Class<o.ѫı> r0 = o.C2647.class
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r0)
            o.ѫı r0 = (o.C2647) r0
            java.lang.Class<o.էǃ> r1 = o.C3071.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            o.էǃ r1 = (o.C3071) r1
            if (r0 == 0) goto L_0x0028
            double r4 = r0.m14007()
            double r6 = r8.f13953
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x0039
            double r0 = r1.m15664()
            double r4 = r8.f13953
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x0042
            return r3
        L_0x0042:
            boolean r0 = r8.f13954
            if (r0 != 0) goto L_0x005f
            boolean r0 = r9.isMemberClass()
            if (r0 == 0) goto L_0x005b
            int r0 = r9.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 != 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            return r3
        L_0x005f:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto L_0x0075
            boolean r0 = r9.isAnonymousClass()
            if (r0 != 0) goto L_0x0073
            boolean r9 = r9.isLocalClass()
            if (r9 == 0) goto L_0x0075
        L_0x0073:
            r9 = 1
            goto L_0x0076
        L_0x0075:
            r9 = 0
        L_0x0076:
            if (r9 == 0) goto L_0x0079
            return r3
        L_0x0079:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3042.m15529(java.lang.Class):boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m15530(boolean z) {
        for (C3282auX.Cif r0 : z ? this.f13952 : this.f13956) {
            if (r0.m1647()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m15526(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            return cls.isAnonymousClass() || cls.isLocalClass();
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m15525(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }
}
