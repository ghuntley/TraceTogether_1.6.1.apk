package o;

import android.content.Context;

/* renamed from: o.ӏг  reason: contains not printable characters */
class C2914 {

    /* renamed from: ı  reason: contains not printable characters */
    private C2903 f13537;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2902 f13538;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f13539;

    public C2914(Context context) {
        this(context, new C2902());
    }

    public C2914(Context context, C2902 r2) {
        this.f13539 = context;
        this.f13538 = r2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C2903 m15072() {
        if (this.f13537 == null) {
            this.f13537 = C2763.m14618(this.f13539);
        }
        return this.f13537;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m15073(C0496 r5) {
        C2903 r0 = m15072();
        if (r0 == null) {
            C3263ac.m1563();
            return;
        }
        C2926 r1 = this.f13538.m15055(r5);
        if (r1 == null) {
            C3263ac.m1563();
            return;
        }
        r0.m15056(r1.m15093(), r1.m15092());
        if ("levelEnd".equals(r5.f4170)) {
            r0.m15056("post_score", r1.m15092());
        }
    }
}
