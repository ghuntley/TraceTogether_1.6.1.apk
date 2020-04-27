package o;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import o.C2177;

/* renamed from: o.ɩȷ  reason: contains not printable characters */
public final class C1250 implements C2360 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C2177 f7073;

    /* renamed from: o.ɩȷ$If */
    public interface If<T, V> {
        /* renamed from: ǃ  reason: contains not printable characters */
        int m8072(T t);

        /* renamed from: Ι  reason: contains not printable characters */
        V m8073(T t, int i);
    }

    /* renamed from: o.ɩȷ$if  reason: invalid class name */
    public interface Cif<T> {
        /* renamed from: ı  reason: contains not printable characters */
        void m8074(T t, Rect rect);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <L, T> T m8063(L l, If<L, T> ifR, Cif<T> ifVar, T t, int i, boolean z) {
        int r0 = ifR.m8072(l);
        ArrayList arrayList = new ArrayList(r0);
        for (int i2 = 0; i2 < r0; i2++) {
            arrayList.add(ifR.m8073(l, i2));
        }
        Collections.sort(arrayList, new C1251(z, ifVar));
        if (i == 1) {
            return m8060(t, arrayList);
        }
        if (i == 2) {
            return m8070(t, arrayList);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static <T> T m8070(T t, ArrayList<T> arrayList) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static <T> T m8060(T t, ArrayList<T> arrayList) {
        int size = arrayList.size();
        if (t != null) {
            size = arrayList.indexOf(t);
        }
        int i = size - 1;
        if (i >= 0) {
            return arrayList.get(i);
        }
        return null;
    }

    /* renamed from: o.ɩȷ$ı  reason: contains not printable characters */
    static class C1251<T> implements Comparator<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Cif<T> f7074;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Rect f7075 = new Rect();

        /* renamed from: Ι  reason: contains not printable characters */
        private final boolean f7076;

        /* renamed from: ι  reason: contains not printable characters */
        private final Rect f7077 = new Rect();

        C1251(boolean z, Cif<T> ifVar) {
            this.f7076 = z;
            this.f7074 = ifVar;
        }

        public final int compare(T t, T t2) {
            Rect rect = this.f7075;
            Rect rect2 = this.f7077;
            this.f7074.m8074(t, rect);
            this.f7074.m8074(t2, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                if (this.f7076) {
                    return 1;
                }
                return -1;
            } else if (rect.left > rect2.left) {
                if (this.f7076) {
                    return -1;
                }
                return 1;
            } else if (rect.bottom < rect2.bottom) {
                return -1;
            } else {
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    if (this.f7076) {
                        return 1;
                    }
                    return -1;
                } else if (rect.right <= rect2.right) {
                    return 0;
                } else {
                    if (this.f7076) {
                        return -1;
                    }
                    return 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r14 < (((r15 * 13) * r15) + (r16 * r16))) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4 A[SYNTHETIC] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L, T> T m8064(L r18, o.C1250.If<L, T> r19, o.C1250.Cif<T> r20, T r21, android.graphics.Rect r22, int r23) {
        /*
            r0 = r18
            r1 = r19
            r2 = r22
            r3 = r23
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r2)
            r5 = 17
            r6 = 0
            r7 = 1
            if (r3 == r5) goto L_0x0044
            r5 = 33
            if (r3 == r5) goto L_0x003b
            r5 = 66
            if (r3 == r5) goto L_0x0031
            r5 = 130(0x82, float:1.82E-43)
            if (r3 != r5) goto L_0x0029
            int r5 = r22.height()
            int r5 = r5 + r7
            int r5 = -r5
            r4.offset(r6, r5)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        L_0x0031:
            int r5 = r22.width()
            int r5 = r5 + r7
            int r5 = -r5
            r4.offset(r5, r6)
            goto L_0x004c
        L_0x003b:
            int r5 = r22.height()
            int r5 = r5 + r7
            r4.offset(r6, r5)
            goto L_0x004c
        L_0x0044:
            int r5 = r22.width()
            int r5 = r5 + r7
            r4.offset(r5, r6)
        L_0x004c:
            r5 = 0
            int r8 = r1.m8072(r0)
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r10 = r5
            r5 = 0
        L_0x0058:
            if (r5 >= r8) goto L_0x00b7
            java.lang.Object r11 = r1.m8073(r0, r5)
            r12 = r21
            r13 = r20
            if (r11 == r12) goto L_0x00b4
            r13.m8074(r11, r9)
            boolean r14 = m8067((android.graphics.Rect) r2, (android.graphics.Rect) r9, (int) r3)
            if (r14 == 0) goto L_0x00ad
            boolean r14 = m8067((android.graphics.Rect) r2, (android.graphics.Rect) r4, (int) r3)
            if (r14 != 0) goto L_0x0075
        L_0x0073:
            r14 = 1
            goto L_0x00ae
        L_0x0075:
            boolean r14 = m8065(r3, r2, r9, r4)
            if (r14 == 0) goto L_0x007c
            goto L_0x0073
        L_0x007c:
            boolean r14 = m8065(r3, r2, r4, r9)
            if (r14 != 0) goto L_0x00ad
            int r14 = m8062(r3, r2, r9)
            int r14 = java.lang.Math.max(r6, r14)
            int r15 = m8069(r3, r2, r9)
            int r16 = r14 * 13
            int r16 = r16 * r14
            int r15 = r15 * r15
            int r14 = r16 + r15
            int r15 = m8062(r3, r2, r4)
            int r15 = java.lang.Math.max(r6, r15)
            int r16 = m8069(r3, r2, r4)
            int r17 = r15 * 13
            int r17 = r17 * r15
            int r16 = r16 * r16
            int r15 = r17 + r16
            if (r14 >= r15) goto L_0x00ad
            goto L_0x0073
        L_0x00ad:
            r14 = 0
        L_0x00ae:
            if (r14 == 0) goto L_0x00b4
            r4.set(r9)
            r10 = r11
        L_0x00b4:
            int r5 = r5 + 1
            goto L_0x0058
        L_0x00b7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1250.m8064(java.lang.Object, o.ɩȷ$If, o.ɩȷ$if, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m8065(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean r0 = m8068(i, rect, rect2);
        if (m8068(i, rect, rect3) || !r0) {
            return false;
        }
        if (m8061(i, rect, rect3) && i != 17 && i != 66 && Math.max(0, m8062(i, rect, rect2)) >= Math.max(1, m8066(i, rect, rect3))) {
            return false;
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m8067(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m8068(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m8061(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m8062(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m8066(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static int m8069(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    public C1250(C2177 r1) {
        this.f7073 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m8071(Object obj) {
        return this.f7073.m11541((C2177.If) obj);
    }

    public C1250() {
    }
}
