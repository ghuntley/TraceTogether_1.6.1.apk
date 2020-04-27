package o;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: o.ԓ  reason: contains not printable characters */
public final class C2984 extends Exception {

    /* renamed from: ι  reason: contains not printable characters */
    private final C0299<C0475<?>, C2822> f13761;

    public C2984(C0299<C0475<?>, C2822> r1) {
        this.f13761 = r1;
    }

    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C0475 next : this.f13761.keySet()) {
            C2822 r5 = this.f13761.get(next);
            if (r5.f13249 == 0) {
                z = false;
            }
            String str = next.f4103.f13928;
            String valueOf = String.valueOf(r5);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + valueOf.length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
