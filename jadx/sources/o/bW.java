package o;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class bW {

    /* renamed from: ı  reason: contains not printable characters */
    public C3120 f1716 = C3118.f14241;

    /* renamed from: ǃ  reason: contains not printable characters */
    public C3042 f1717 = C3042.f13951;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2638> f1718 = new ArrayList();

    /* renamed from: ɹ  reason: contains not printable characters */
    private final List<C2638> f1719 = new ArrayList();

    /* renamed from: Ι  reason: contains not printable characters */
    private C1512 f1720 = C1512.f8081;

    /* renamed from: ι  reason: contains not printable characters */
    private final Map<Type, C0371<?>> f1721 = new HashMap();

    /* renamed from: І  reason: contains not printable characters */
    private int f1722 = 2;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f1723 = true;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f1724 = 2;

    /* renamed from: ı  reason: contains not printable characters */
    public final bW m1732() {
        this.f1723 = false;
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3122 m1733() {
        ArrayList arrayList = new ArrayList(this.f1718.size() + this.f1719.size() + 3);
        arrayList.addAll(this.f1718);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f1719);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.f1722;
        int i2 = this.f1724;
        if (!(i == 2 || i2 == 2)) {
            C3111 r2 = new C3111(Date.class, i, i2);
            C3111 r3 = new C3111(Timestamp.class, i, i2);
            C3111 r4 = new C3111(java.sql.Date.class, i, i2);
            arrayList.add(C2700.m14318(Date.class, r2));
            arrayList.add(C2700.m14318(Timestamp.class, r3));
            arrayList.add(C2700.m14318(java.sql.Date.class, r4));
        }
        return new C3122(this.f1717, this.f1716, this.f1721, this.f1723, this.f1720, arrayList);
    }
}
