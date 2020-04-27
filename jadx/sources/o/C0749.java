package o;

import android.graphics.Path;
import java.util.List;
import o.C0742;
import o.C1559;
import o.C2771;
import o.C2864;

/* renamed from: o.ƚІ  reason: contains not printable characters */
public final class C0749 implements C0707, C0742.C0744 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0742<?, Path> f5020;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0379 f5021;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean f5022;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Path f5023 = new Path();

    /* renamed from: ι  reason: contains not printable characters */
    private final String f5024;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f5025;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C2771.C2772 f5026 = new C2771.C2772();

    public C0749(C0379 r2, C1578 r3, C2864.C2866 r4) {
        this.f5024 = r4.f13379;
        this.f5022 = r4.f13378;
        this.f5021 = r2;
        this.f5020 = new C1084(r4.f13381.f7684);
        C0742<?, Path> r22 = this.f5020;
        if (r22 != null) {
            r3.f8389.add(r22);
        }
        this.f5020.f5002.add(this);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5985(List<C0550> list, List<C0550> list2) {
        for (int i = 0; i < list.size(); i++) {
            C0550 r0 = list.get(i);
            if (r0 instanceof C0851) {
                C0851 r02 = (C0851) r0;
                if (r02.f5560 == C1559.If.SIMULTANEOUSLY) {
                    this.f5026.f13126.add(r02);
                    r02.f5561.add(this);
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Path m5983() {
        if (this.f5025) {
            return this.f5023;
        }
        this.f5023.reset();
        if (this.f5022) {
            this.f5025 = true;
            return this.f5023;
        }
        this.f5023.set(this.f5020.m5937());
        this.f5023.setFillType(Path.FillType.EVEN_ODD);
        this.f5026.m14662(this.f5023);
        this.f5025 = true;
        return this.f5023;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5984() {
        return this.f5024;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5982() {
        this.f5025 = false;
        this.f5021.invalidateSelf();
    }
}
