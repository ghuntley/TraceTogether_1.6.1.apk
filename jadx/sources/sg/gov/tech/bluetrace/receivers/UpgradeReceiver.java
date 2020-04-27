package sg.gov.tech.bluetrace.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import o.C3166;
import o.fM;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\nB\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsg/gov/tech/bluetrace/receivers/UpgradeReceiver;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "()V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
public final class UpgradeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            try {
                fM.m2256();
            } catch (Exception e) {
                lA.C0215 r9 = lA.f2728;
                r9.m3375("UpgradeReceiver", "Unable to handle upgrade: " + e.getLocalizedMessage());
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (!(!fM.m2257("android.intent.action.MY_PACKAGE_REPLACED", intent.getAction())) && context != null) {
            lA.f2728.m3369("UpgradeReceiver", "Starting service from upgrade receiver");
            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{context});
        }
    }
}
