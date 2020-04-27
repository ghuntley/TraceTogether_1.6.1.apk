package o;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class mZ {

    /* renamed from: ι  reason: contains not printable characters */
    private static String f3188 = "ZENDESK_UI_CONFIG";

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m3801(Intent intent, mW mWVar) {
        intent.putExtra(f3188, mWVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m3798(Bundle bundle, mW mWVar) {
        bundle.putSerializable(f3188, mWVar);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m3802(Map<String, Object> map, mW mWVar) {
        map.put(f3188, mWVar);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <E extends mW> E m3799(Bundle bundle, Class<E> cls) {
        if (bundle == null || !bundle.containsKey(f3188)) {
            return null;
        }
        E serializable = bundle.getSerializable(f3188);
        if (cls.isInstance(serializable)) {
            return (mW) serializable;
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <E extends mW> E m3804(Map<String, Object> map, Class<E> cls) {
        if (map == null || !map.containsKey(f3188)) {
            return null;
        }
        E e = map.get(f3188);
        if (cls.isInstance(e)) {
            return (mW) e;
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <E extends mW> E m3803(List<mW> list, Class<E> cls) {
        Iterator<mW> it = list.iterator();
        while (it.hasNext()) {
            E e = (mW) it.next();
            if (cls.isInstance(e)) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static List<mW> m3800(List<mW> list, mW mWVar) {
        ArrayList arrayList = new ArrayList(list);
        if (m3803(list, mWVar.getClass()) == null) {
            arrayList.add(mWVar);
        }
        return arrayList;
    }
}
