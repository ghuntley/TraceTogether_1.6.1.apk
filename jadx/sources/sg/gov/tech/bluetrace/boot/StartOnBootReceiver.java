package sg.gov.tech.bluetrace.boot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import o.C3166;
import o.fM;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/boot/StartOnBootReceiver;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "()V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
public final class StartOnBootReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        fM.m2254(context, "");
        fM.m2254(intent, "");
        if (fM.m2257("android.intent.action.BOOT_COMPLETED", intent.getAction())) {
            lA.f2728.m3368("StartOnBootReceiver", "boot completed received");
            try {
                lA.f2728.m3368("StartOnBootReceiver", "Attempting to start service");
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                Object[] objArr = new Object[2];
                objArr[1] = 500L;
                objArr[0] = context;
                ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Context.class, Long.TYPE}).invoke(obj, objArr);
            } catch (Throwable th) {
                lA.C0215 r11 = lA.f2728;
                String localizedMessage = th.getLocalizedMessage();
                fM.m2252((Object) localizedMessage, "");
                r11.m3375("StartOnBootReceiver", localizedMessage);
                th.printStackTrace();
            }
        }
    }
}
