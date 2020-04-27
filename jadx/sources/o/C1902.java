package o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: o.Κ  reason: contains not printable characters */
public abstract class C1902 {
    /* renamed from: ı  reason: contains not printable characters */
    public abstract Object m10348(Object obj);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m10351(Object obj, View view);

    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m10352(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract Object m10354(Object obj, Object obj2, Object obj3);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m10355(Object obj, Rect rect);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m10356(Object obj, View view);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m10357(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m10362(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m10363(Object obj, ArrayList<View> arrayList);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m10364(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m10365(Object obj);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract Object m10366(Object obj);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract Object m10367(Object obj, Object obj2, Object obj3);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m10368(ViewGroup viewGroup, Object obj);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m10369(Object obj, View view);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m10370(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public void m10349(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public ArrayList<String> m10361(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0293.m4215(view));
            C0293.m4205(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m10358(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String r4 = C0293.m4215(view2);
            arrayList4.add(r4);
            if (r4 != null) {
                C0293.m4205(view2, (String) null);
                String str = map.get(r4);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0293.m4205(arrayList2.get(i2), r4);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C2966.m15241(view, new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    C0293.m4205((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C0293.m4205((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m10360(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C3174.m16027(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m10360(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m10371(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String r0 = C0293.m4215(view);
            if (r0 != null) {
                map.put(r0, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m10371(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m10350(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C2966.m15241(view, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String r3 = C0293.m4215(view);
                    if (r3 != null) {
                        C0293.m4205(view, C1902.m10346((Map<String, String>) map, r3));
                    }
                }
            }
        });
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m10353(C1277 r1, Object obj, C1562 r3, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m10359(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C2966.m15241(viewGroup, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0293.m4205(view, (String) map.get(C0293.m4215(view)));
                }
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    protected static void m10347(List<View> list, View view) {
        int size = list.size();
        if (!m10345(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m10345(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m10345(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m10344(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static String m10346(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }
}
