package o;

import java.util.ArrayList;
import java.util.HashSet;
import o.C2317;

/* renamed from: o.Ӏɩ  reason: contains not printable characters */
public final class C2790<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2317.If<ArrayList<T>> f13184 = new C2317.C2318(10);

    /* renamed from: ɩ  reason: contains not printable characters */
    private final HashSet<T> f13185 = new HashSet<>();

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0910<T, ArrayList<T>> f13186 = new C0910<>();

    /* renamed from: ι  reason: contains not printable characters */
    private final ArrayList<T> f13187 = new ArrayList<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final ArrayList<T> m14703() {
        this.f13187.clear();
        this.f13185.clear();
        int size = this.f13186.size();
        for (int i = 0; i < size; i++) {
            m14702(this.f13186.f5784[i << 1], this.f13187, this.f13185);
        }
        return this.f13187;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m14702(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f13186.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m14702(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
