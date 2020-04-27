package sg.gov.tech.bluetrace.idmanager;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.HashMap;
import kotlin.Metadata;
import o.C0757;
import o.C3122;
import o.C3153;
import o.C3166;
import o.bW;
import o.dA;
import o.fM;
import o.gK;
import o.gL;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/ƚյ;", "p0", "", "onSuccess", "(Lo/ƚյ;)V"}, k = 3, mv = {1, 1, 16})
final class TempIDManager$getTemporaryIDs$1<TResult> implements C3153<C0757> {
    final /* synthetic */ Context $$context;

    TempIDManager$getTemporaryIDs$1(Context context) {
        this.$$context = context;
    }

    public final void onSuccess(C0757 r15) {
        Throwable cause;
        fM.m2252((Object) r15, "");
        Object r152 = r15.m6030();
        if (r152 != null) {
            HashMap hashMap = (HashMap) r152;
            Object obj = hashMap.get("tempIDs");
            String lowerCase = String.valueOf(hashMap.get("status")).toLowerCase();
            fM.m2252((Object) lowerCase, "");
            if (lowerCase == null) {
                throw new dA("null cannot be cast to non-null type java.lang.String");
            } else if (lowerCase.contentEquals(r3)) {
                lA.f2728.m3372("TempIDManager", "Retrieved Temporary IDs from Server");
                C3122 r2 = new bW().m1732().m1733();
                fM.m2252((Object) r2, "");
                String r1 = r2.m15836(obj);
                fM.m2252((Object) r1, "");
                Charset charset = gL.f2204;
                if (r1 != null) {
                    byte[] bytes = r1.getBytes(charset);
                    fM.m2252((Object) bytes, "");
                    TempIDManager.INSTANCE.storeTemporaryIDs(this.$$context, new String(bytes, gL.f2204));
                    Long r153 = gK.m2346(String.valueOf(hashMap.get("refreshTime")));
                    long longValue = r153 != null ? r153.longValue() : 0;
                    Object obj2 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                    Context context = this.$$context;
                    long j = (long) 1000;
                    try {
                        Object[] objArr = new Object[2];
                        objArr[1] = Long.valueOf(longValue * j);
                        objArr[0] = context;
                        ((Class) C3166.m16013(4, 8, 0)).getMethod("ı", new Class[]{Context.class, Long.TYPE}).invoke(obj2, objArr);
                        Object obj3 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                        Context context2 = this.$$context;
                        try {
                            Object[] objArr2 = new Object[2];
                            objArr2[1] = Long.valueOf(System.currentTimeMillis() * j);
                            objArr2[0] = context2;
                            ((Class) C3166.m16013(4, 8, 0)).getMethod("ɩ", new Class[]{Context.class, Long.TYPE}).invoke(obj3, objArr2);
                        } catch (Throwable th) {
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } finally {
                        cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                    }
                } else {
                    throw new dA("null cannot be cast to non-null type java.lang.String");
                }
            }
        } else {
            throw new dA("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
        }
    }
}
