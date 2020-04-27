package o;

import android.os.Bundle;
import o.C2248;

/* renamed from: o.ϳȷ  reason: contains not printable characters */
final class C2187 extends C2248.If {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ String f10399;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final /* synthetic */ boolean f10400;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ String f10401;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ Long f10402;

    /* renamed from: І  reason: contains not printable characters */
    private final /* synthetic */ Bundle f10403;

    /* renamed from: і  reason: contains not printable characters */
    private final /* synthetic */ C2248 f10404;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final /* synthetic */ boolean f10405;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2187(C2248 r1, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(r1);
        this.f10404 = r1;
        this.f10402 = l;
        this.f10399 = str;
        this.f10401 = str2;
        this.f10403 = bundle;
        this.f10405 = z;
        this.f10400 = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11575() {
        Long l = this.f10402;
        this.f10404.f10558.logEvent(this.f10399, this.f10401, this.f10403, this.f10405, this.f10400, l == null ? this.f10570 : l.longValue());
    }
}
