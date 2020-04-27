package o;

import android.util.Log;
import android.util.Pair;
import o.C2248;

/* renamed from: o.ϻ  reason: contains not printable characters */
final class C2203 extends C2248.If {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C3211 f10452;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2248 f10453;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2203(C2248 r1, C3211 r2) {
        super(r1);
        this.f10453 = r1;
        this.f10452 = r2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11630() {
        for (int i = 0; i < this.f10453.f10565.size(); i++) {
            if (this.f10452.equals(((Pair) this.f10453.f10565.get(i)).first)) {
                Log.w(this.f10453.f10563, "OnEventListener already registered.");
                return;
            }
        }
        C2248.C2249 r0 = new C2248.C2249(this.f10452);
        this.f10453.f10565.add(new Pair(this.f10452, r0));
        this.f10453.f10558.registerOnMeasurementEventListener(r0);
    }
}
