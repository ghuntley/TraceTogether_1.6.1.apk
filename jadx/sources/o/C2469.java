package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import o.C0736;
import o.C2291;
import o.C2745;

/* renamed from: o.сӀ  reason: contains not printable characters */
public class C2469 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C2243.m11696(context);
        C2291.C2292 r5 = C2291.m11958().m11963(queryParameter).m11964(C2745.C3657iF.m14549(intValue));
        if (queryParameter2 != null) {
            r5.m11965(Base64.decode(queryParameter2, 0));
        }
        C2302 r0 = C2243.f10531;
        if (r0 != null) {
            C2498 r02 = r0.m11989().f10532;
            r02.f11312.execute(new C0818(r02, r5.m11962(), i, C0736.If.f4970));
            return;
        }
        throw new IllegalStateException("Not initialized!");
    }
}
