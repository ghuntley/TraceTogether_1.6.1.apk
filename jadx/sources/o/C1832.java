package o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o.C1976;

@SuppressLint({"RestrictedApi"})
/* renamed from: o.Ιɿ  reason: contains not printable characters */
public class C1832 extends C1902 {
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m10147(Object obj) {
        return obj instanceof C1976;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public Object m10137(Object obj) {
        if (obj != null) {
            return ((C1976) obj).clone();
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Object m10148(Object obj) {
        if (obj == null) {
            return null;
        }
        C2170 r0 = new C2170();
        r0.m11509((C1976) obj);
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m10144(Object obj, View view, ArrayList<View> arrayList) {
        C2170 r5 = (C2170) obj;
        ArrayList<View> arrayList2 = r5.f9907;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m10347((List<View>) arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        m10363((Object) r5, arrayList);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m10138(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            m10349(view, rect);
            ((C1976) obj).m10729((C1976.C1977) new C1976.C1977() {
            });
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m10145(Object obj, ArrayList<View> arrayList) {
        C1976 r5 = (C1976) obj;
        if (r5 != null) {
            int i = 0;
            if (r5 instanceof C2170) {
                C2170 r52 = (C2170) r5;
                int size = r52.f10335.size();
                while (i < size) {
                    m10363((Object) (i < 0 || i >= r52.f10335.size()) ? null : r52.f10335.get(i), arrayList);
                    i++;
                }
                return;
            }
            if (!(!m10344((List) r5.f9896) || !m10344((List) null) || !m10344((List) null)) && m10344((List) r5.f9907)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    r5.m10734(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public Object m10140(Object obj, Object obj2, Object obj3) {
        C2170 r0 = new C2170();
        if (obj != null) {
            r0.m11509((C1976) obj);
        }
        if (obj2 != null) {
            r0.m11509((C1976) obj2);
        }
        if (obj3 != null) {
            r0.m11509((C1976) obj3);
        }
        return r0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m10139(Object obj, final View view, final ArrayList<View> arrayList) {
        ((C1976) obj).m10747((C1976.If) new C1976.If() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10153() {
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m10155() {
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10156() {
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m10157() {
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10154(C1976 r4) {
                r4.m10741((C1976.If) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Object m10149(Object obj, Object obj2, Object obj3) {
        C1976 r2 = (C1976) obj;
        C1976 r3 = (C1976) obj2;
        C1976 r4 = (C1976) obj3;
        if (r2 != null && r3 != null) {
            r2 = new C2170().m11509(r2).m11509(r3).m11507(1);
        } else if (r2 == null) {
            r2 = r3 != null ? r3 : null;
        }
        if (r4 == null) {
            return r2;
        }
        C2170 r32 = new C2170();
        if (r2 != null) {
            r32.m11509(r2);
        }
        r32.m11509(r4);
        return r32;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m10150(ViewGroup viewGroup, Object obj) {
        C2183.m11566(viewGroup, (C1976) obj);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m10143(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((C1976) obj).m10747((C1976.If) new C2169() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m10159() {
                Object obj = obj5;
                if (obj != null) {
                    C1832.this.m10370(obj, (ArrayList<View>) arrayList4, (ArrayList<View>) null);
                }
                Object obj2 = obj6;
                if (obj2 != null) {
                    C1832.this.m10370(obj2, (ArrayList<View>) arrayList5, (ArrayList<View>) null);
                }
                Object obj3 = obj7;
                if (obj3 != null) {
                    C1832.this.m10370(obj3, (ArrayList<View>) arrayList6, (ArrayList<View>) null);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10158(C1976 r1) {
                r1.m10741((C1976.If) this);
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m10146(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2170 r2 = (C2170) obj;
        if (r2 != null) {
            r2.f9907.clear();
            r2.f9907.addAll(arrayList2);
            m10370((Object) r2, arrayList, arrayList2);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m10152(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C1976 r6 = (C1976) obj;
        int i2 = 0;
        if (r6 instanceof C2170) {
            C2170 r62 = (C2170) r6;
            int size = r62.f10335.size();
            while (i2 < size) {
                m10370((Object) (i2 < 0 || i2 >= r62.f10335.size()) ? null : r62.f10335.get(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (!(!m10344((List) r6.f9896) || !m10344((List) null) || !m10344((List) null))) {
            ArrayList<View> arrayList3 = r6.f9907;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    r6.m10734(arrayList2.get(i2));
                    i2++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    r6.m10746(arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m10142(Object obj, View view) {
        if (obj != null) {
            ((C1976) obj).m10734(view);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m10151(Object obj, View view) {
        if (obj != null) {
            ((C1976) obj).m10746(view);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m10141(Object obj, final Rect rect) {
        if (obj != null) {
            ((C1976) obj).m10729((C1976.C1977) new C1976.C1977() {
            });
        }
    }
}
