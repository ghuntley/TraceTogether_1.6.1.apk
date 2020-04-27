package o;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o.aD;
import o.mG;

/* renamed from: o.ſӏ  reason: contains not printable characters */
class C0600 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f4564;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f4565;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f4566;

    /* renamed from: ι  reason: contains not printable characters */
    private final aD f4567;

    public C0600(Context context, aD aDVar, String str, String str2) {
        this.f4565 = context;
        this.f4567 = aDVar;
        this.f4564 = str;
        this.f4566 = str2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0519 m5305() {
        mG.C0235 r1;
        Map<aD.C0107, String> r0 = this.f4567.m1461();
        String str = this.f4567.f1399;
        String r5 = this.f4567.m1459();
        aD aDVar = this.f4567;
        Boolean bool = null;
        if ((aDVar.f1395 && !aA.m1450(aDVar.f1391)) && (r1 = aDVar.m1460()) != null) {
            bool = Boolean.valueOf(r1.f3095);
        }
        String r8 = C3285aw.m1678(this.f4565);
        StringBuilder sb = new StringBuilder();
        sb.append(aD.m1456(Build.VERSION.RELEASE));
        sb.append("/");
        sb.append(aD.m1456(Build.VERSION.INCREMENTAL));
        return new C0519(str, UUID.randomUUID().toString(), r5, bool, r0.get(aD.C0107.FONT_TOKEN), r8, sb.toString(), String.format(Locale.US, "%s/%s", new Object[]{aD.m1456(Build.MANUFACTURER), aD.m1456(Build.MODEL)}), this.f4564, this.f4566);
    }
}
