package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.C1976;

/* renamed from: o.ϳı  reason: contains not printable characters */
public final class C2183 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C1976 f10392 = new C1807();

    /* renamed from: Ι  reason: contains not printable characters */
    private static ThreadLocal<WeakReference<C0299<ViewGroup, ArrayList<C1976>>>> f10393 = new ThreadLocal<>();

    /* renamed from: ι  reason: contains not printable characters */
    static ArrayList<ViewGroup> f10394 = new ArrayList<>();

    public C2183() {
        new C0299();
        new C0299();
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C0299<ViewGroup, ArrayList<C1976>> m11569() {
        C0299<ViewGroup, ArrayList<C1976>> r0;
        WeakReference weakReference = f10393.get();
        if (weakReference != null && (r0 = (C0299) weakReference.get()) != null) {
            return r0;
        }
        C0299<ViewGroup, ArrayList<C1976>> r02 = new C0299<>();
        f10393.set(new WeakReference(r02));
        return r02;
    }

    /* renamed from: o.ϳı$ɩ  reason: contains not printable characters */
    static class C2184 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: ɩ  reason: contains not printable characters */
        private C1976 f10395;

        /* renamed from: Ι  reason: contains not printable characters */
        ViewGroup f10396;

        public final void onViewAttachedToWindow(View view) {
        }

        C2184(C1976 r1, ViewGroup viewGroup) {
            this.f10395 = r1;
            this.f10396 = viewGroup;
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f10396.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f10396.removeOnAttachStateChangeListener(this);
            C2183.f10394.remove(this.f10396);
            ArrayList arrayList = C2183.m11569().get(this.f10396);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1976) it.next()).m10726((View) this.f10396);
                }
            }
            this.f10395.m10731(true);
        }

        public final boolean onPreDraw() {
            this.f10396.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f10396.removeOnAttachStateChangeListener(this);
            if (!C2183.f10394.remove(this.f10396)) {
                return true;
            }
            final C0299<ViewGroup, ArrayList<C1976>> r0 = C2183.m11569();
            ArrayList arrayList = r0.get(this.f10396);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                r0.put(this.f10396, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f10395);
            this.f10395.m10747((C1976.If) new C2169() {
                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m11571(C1976 r3) {
                    ((ArrayList) r0.get(C2184.this.f10396)).remove(r3);
                    r3.m10741((C1976.If) this);
                }
            });
            this.f10395.m10728(this.f10396, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C1976) it.next()).m10726((View) this.f10396);
                }
            }
            this.f10395.m10748(this.f10396);
            return true;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m11568(ViewGroup viewGroup, C1976 r3) {
        ArrayList arrayList = m11569().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1976) it.next()).m10754((View) viewGroup);
            }
        }
        if (r3 != null) {
            r3.m10728(viewGroup, true);
        }
        C1956 r2 = C1956.m10679(viewGroup);
        if (r2 != null) {
            r2.f9844.getTag(R.id.f167902131362406);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m11566(ViewGroup viewGroup, C1976 r2) {
        if (!f10394.contains(viewGroup) && C0293.m4186(viewGroup)) {
            f10394.add(viewGroup);
            if (r2 == null) {
                r2 = f10392;
            }
            C1976 r22 = r2.clone();
            m11568(viewGroup, r22);
            C1956.m10680(viewGroup);
            if (r22 != null && viewGroup != null) {
                C2184 r0 = new C2184(r22, viewGroup);
                viewGroup.addOnAttachStateChangeListener(r0);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(r0);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m11570(ViewGroup viewGroup) {
        f10394.remove(viewGroup);
        ArrayList arrayList = m11569().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((C1976) arrayList2.get(size)).m10727(viewGroup);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m11567(C1956 r3, C1976 r4) {
        ViewGroup viewGroup = r3.f9844;
        if (!f10394.contains(viewGroup)) {
            C1956 r1 = C1956.m10679(viewGroup);
            if (r4 == null) {
                if (r1 != null) {
                    r1.f9844.getTag(R.id.f167902131362406);
                }
                r3.m10681();
                return;
            }
            f10394.add(viewGroup);
            C1976 r42 = r4.clone();
            r42.m10752(viewGroup);
            if (r1 != null) {
                if (r1.f9845 > 0) {
                    r42.m10756(true);
                }
            }
            m11568(viewGroup, r42);
            r3.m10681();
            if (viewGroup != null) {
                C2184 r32 = new C2184(r42, viewGroup);
                viewGroup.addOnAttachStateChangeListener(r32);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(r32);
            }
        }
    }
}
