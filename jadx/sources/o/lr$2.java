package o;

import android.content.Context;
import java.util.HashMap;
import kotlin.Metadata;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/ƚյ;", "p0", "", "Ι", "(Lo/ƚյ;)V"}, k = 3, mv = {1, 1, 16})
final class lr$2<TResult> implements C3153<C0757> {

    /* renamed from: $ι  reason: contains not printable characters */
    final /* synthetic */ Context f2965$;

    public lr$2(Context context) {
        this.f2965$ = context;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void onSuccess(C0757 r10) {
        fM.m2252((Object) r10, "");
        Object r102 = r10.m6030();
        if (r102 != null) {
            HashMap hashMap = (HashMap) r102;
            String valueOf = String.valueOf(hashMap.get("pin"));
            Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
            Context context = this.f2965$;
            try {
                Object[] objArr = new Object[2];
                objArr[1] = valueOf;
                objArr[0] = context;
                ((Class) C3166.m16013(4, 8, 0)).getMethod("ι", new Class[]{Context.class, String.class}).invoke(obj, objArr);
                lA.C0215 r0 = lA.f2728;
                r0.m3368("Utils", "Result from handshake pin: " + hashMap.toString());
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            throw new dA("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        }
    }
}
