package androidx.lifecycle;

import o.C2014;
import o.C2319;
import o.C2456;
import o.C2851;

public class ReflectiveGenericLifecycleObserver implements C2456 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object f250;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2014.C2015 f251 = C2014.f9970.m10825(this.f250.getClass());

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f250 = obj;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m208(C2851 r4, C2319.C2320 r5) {
        C2014.C2015 r0 = this.f251;
        Object obj = this.f250;
        C2014.C2015.m10827(r0.f9975.get(r5), r4, r5, obj);
        C2014.C2015.m10827(r0.f9975.get(C2319.C2320.ON_ANY), r4, r5, obj);
    }
}
