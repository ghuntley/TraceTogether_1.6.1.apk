package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class O {
    static {
        new C3623w() {
            public final Object apply(Object obj) {
                return obj;
            }
        };
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <Type> boolean m1400(Type[] typeArr) {
        return typeArr == null || typeArr.length == 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <Type> boolean m1399(Collection<Type> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <Type> List<Type> m1395(List<Type> list) {
        return Collections.unmodifiableList(m1403(list));
    }

    @SafeVarargs
    /* renamed from: ɩ  reason: contains not printable characters */
    public static <Type> List<Type> m1398(List<Type>... listArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = new CopyOnWriteArrayList(listArr).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (true ^ (list == null || list.isEmpty())) {
                Iterator it2 = new CopyOnWriteArrayList(list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <Type> List<Type> m1393(List<Type> list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <Key, Value> Map<Key, Value> m1396(Map<Key, Value> map) {
        if (map == null) {
            return new HashMap();
        }
        Map<Key, Value> synchronizedMap = Collections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <Type, Return> List<Return> m1392(Collection<Type> collection, C3623w<Type, Return> wVar) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Type apply : collection) {
            arrayList.add(wVar.apply(apply));
        }
        return arrayList;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <Type> List<Type> m1402(Collection<Type> collection, C3623w<Type, Boolean> wVar) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Type next : collection) {
            if (wVar.apply(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <Type> List<Type> m1401(Collection<Type> collection, Type type, E<Type, Type, Boolean> e) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection);
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (e.apply(arrayList.get(i), type).booleanValue()) {
                arrayList.set(i, type);
                z = true;
            }
        }
        if (!z) {
            arrayList.add(type);
        }
        return arrayList;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <Type> boolean m1397(Type[] typeArr) {
        return !(typeArr == null || typeArr.length == 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <Type> boolean m1394(Collection<Type> collection) {
        return !(collection == null || collection.isEmpty());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <Type> List<Type> m1403(List<Type> list) {
        return list == null || list.isEmpty() ? new ArrayList() : list;
    }
}
