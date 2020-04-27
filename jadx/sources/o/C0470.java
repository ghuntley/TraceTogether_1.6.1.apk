package o;

import android.content.Context;
import java.util.UUID;

/* renamed from: o.Ĳ  reason: contains not printable characters */
class C0470 extends C3292bc<C0496> {

    /* renamed from: ɨ  reason: contains not printable characters */
    private static final String f4089 = "sa";

    /* renamed from: ӏ  reason: contains not printable characters */
    private static final String f4090 = ".tap";

    /* renamed from: ȷ  reason: contains not printable characters */
    private C3310bu f4091;

    C0470(Context context, C0542 r8, C3284av avVar, C3290ba baVar) {
        super(context, r8, avVar, baVar, 100);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m4800() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder("sa_");
        sb.append(randomUUID.toString());
        sb.append(C3292bc.f1729);
        sb.append(this.f1733.m1655());
        sb.append(f4090);
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m4801() {
        C3310bu buVar = this.f4091;
        return buVar == null ? super.m1758() : buVar.f1800;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public int m4799() {
        C3310bu buVar = this.f4091;
        return buVar == null ? super.m1754() : buVar.f1803;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m4802(C3310bu buVar) {
        this.f4091 = buVar;
    }
}
