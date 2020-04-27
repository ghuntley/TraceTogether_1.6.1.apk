package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.ɤɩ  reason: contains not printable characters */
public final class C1179 extends C0486<String> implements C1183, RandomAccess {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C1183 f6785 = f6786;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C1179 f6786;

    /* renamed from: ι  reason: contains not printable characters */
    private final List<Object> f6787;

    public C1179() {
        this(10);
    }

    public C1179(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C1179(ArrayList<Object> arrayList) {
        this.f6787 = arrayList;
    }

    public final int size() {
        return this.f6787.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        g_();
        if (collection instanceof C1183) {
            collection = ((C1183) collection).m7715();
        }
        boolean addAll = this.f6787.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        g_();
        this.f6787.clear();
        this.modCount++;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7709(C0510 r2) {
        g_();
        this.f6787.add(r2);
        this.modCount++;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Object m7704(int i) {
        return this.f6787.get(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m7703(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0510) {
            return ((C0510) obj).m4962();
        }
        return C0936.m6807((byte[]) obj);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<?> m7705() {
        return Collections.unmodifiableList(this.f6787);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1183 m7708() {
        return m4848() ? new C2514(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        g_();
        return m7703(this.f6787.set(i, (String) obj));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        g_();
        Object remove = this.f6787.remove(i);
        this.modCount++;
        return m7703(remove);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean m7707() {
        return super.m4848();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        g_();
        this.f6787.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C1001 m7706(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f6787);
            return new C1179((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f6787.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0510) {
            C0510 r0 = (C0510) obj;
            String r1 = r0.m4962();
            if (r0.m4970()) {
                this.f6787.set(i, r1);
            }
            return r1;
        }
        byte[] bArr = (byte[]) obj;
        String r12 = C0936.m6807(bArr);
        if (C0936.m6814(bArr)) {
            this.f6787.set(i, r12);
        }
        return r12;
    }

    static {
        C1179 r0 = new C1179();
        f6786 = r0;
        r0.m4847();
    }
}
