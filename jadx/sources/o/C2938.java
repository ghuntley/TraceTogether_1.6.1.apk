package o;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: o.ӻ  reason: contains not printable characters */
public final class C2938 implements DynamiteModule.C0053 {
    /* renamed from: ι  reason: contains not printable characters */
    public final DynamiteModule.C0053.C0054 m15169(Context context, String str, DynamiteModule.C0053.Cif ifVar) {
        DynamiteModule.C0053.C0054 r0 = new DynamiteModule.C0053.C0054();
        r0.f588 = ifVar.m805(context, str);
        r0.f590 = ifVar.m806(context, str, true);
        if (r0.f588 == 0 && r0.f590 == 0) {
            r0.f589 = 0;
        } else if (r0.f590 >= r0.f588) {
            r0.f589 = 1;
        } else {
            r0.f589 = -1;
        }
        return r0;
    }
}
