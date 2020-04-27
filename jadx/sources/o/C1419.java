package o;

import o.C0987;

/* renamed from: o.ɫӀ  reason: contains not printable characters */
final class C1419 implements C2095 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C1639 f7734 = new C1418();

    /* renamed from: ι  reason: contains not printable characters */
    private final C1639 f7735;

    public C1419() {
        this(new C1525(C0894.m6641(), m8634()));
    }

    private C1419(C1639 r2) {
        this.f7735 = (C1639) C0936.m6813(r2, "messageInfoFactory");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final <T> C1990<T> m8636(Class<T> cls) {
        C2092.m11173((Class<?>) cls);
        C1640 r2 = this.f7735.m9441(cls);
        if (r2.m9443()) {
            if (C0987.class.isAssignableFrom(cls)) {
                return C1808.m9996(C2092.m11144(), C0728.m5864(), r2.m9444());
            }
            return C1808.m9996(C2092.m11170(), C0728.m5863(), r2.m9444());
        } else if (C0987.class.isAssignableFrom(cls)) {
            if (m8635(r2)) {
                return C1824.m10050(cls, r2, C1931.m10553(), C1309.m8260(), C2092.m11144(), C0728.m5864(), C1530.m8981());
            }
            return C1824.m10050(cls, r2, C1931.m10553(), C1309.m8260(), C2092.m11144(), (C0740<?>) null, C1530.m8981());
        } else if (m8635(r2)) {
            return C1824.m10050(cls, r2, C1931.m10552(), C1309.m8259(), C2092.m11170(), C0728.m5863(), C1530.m8982());
        } else {
            return C1824.m10050(cls, r2, C1931.m10552(), C1309.m8259(), C2092.m11153(), (C0740<?>) null, C1530.m8982());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m8635(C1640 r1) {
        return r1.m9442() == C0987.If.f6026;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C1639 m8634() {
        try {
            return (C1639) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f7734;
        }
    }
}
