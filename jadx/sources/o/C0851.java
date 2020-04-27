package o;

import java.util.ArrayList;
import java.util.List;
import o.C0742;
import o.C1559;

/* renamed from: o.ǀɩ  reason: contains not printable characters */
public final class C0851 implements C0550, C0742.C0744 {

    /* renamed from: ı  reason: contains not printable characters */
    final C1559.If f5560;

    /* renamed from: ǃ  reason: contains not printable characters */
    final List<C0742.C0744> f5561 = new ArrayList();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean f5562;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final String f5563;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0742<?, Float> f5564;

    /* renamed from: ι  reason: contains not printable characters */
    public final C0742<?, Float> f5565;

    /* renamed from: і  reason: contains not printable characters */
    public final C0742<?, Float> f5566;

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6400(List<C0550> list, List<C0550> list2) {
    }

    public C0851(C1578 r3, C1559 r4) {
        this.f5563 = r4.f8302;
        this.f5562 = r4.f8307;
        this.f5560 = r4.f8305;
        this.f5565 = new C0965(r4.f8304.f7684);
        this.f5564 = new C0965(r4.f8303.f7684);
        this.f5566 = new C0965(r4.f8306.f7684);
        C0742<?, Float> r42 = this.f5565;
        if (r42 != null) {
            r3.f8389.add(r42);
        }
        C0742<?, Float> r43 = this.f5564;
        if (r43 != null) {
            r3.f8389.add(r43);
        }
        C0742<?, Float> r44 = this.f5566;
        if (r44 != null) {
            r3.f8389.add(r44);
        }
        this.f5565.f5002.add(this);
        this.f5564.f5002.add(this);
        this.f5566.f5002.add(this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6398() {
        for (int i = 0; i < this.f5561.size(); i++) {
            this.f5561.get(i).m5958();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m6399() {
        return this.f5563;
    }
}
