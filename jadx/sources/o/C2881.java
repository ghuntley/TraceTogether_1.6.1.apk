package o;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: o.ӏǀ  reason: contains not printable characters */
public final class C2881 implements DynamiteModule.C0053 {
    /* renamed from: ι  reason: contains not printable characters */
    public final DynamiteModule.C0053.C0054 m14947(Context context, String str, DynamiteModule.C0053.Cif ifVar) {
        DynamiteModule.C0053.C0054 r0 = new DynamiteModule.C0053.C0054();
        r0.f590 = ifVar.m806(context, str, true);
        if (r0.f590 != 0) {
            r0.f589 = 1;
        } else {
            r0.f588 = ifVar.m805(context, str);
            if (r0.f588 != 0) {
                r0.f589 = -1;
            }
        }
        return r0;
    }
}
