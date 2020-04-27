package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import kotlin.Metadata;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\bÆ\u0002\u0018\u00002\u00020\u0010B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ-\u0010\r\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Lo/lO;", "", "p0", "Landroid/content/Context;", "p1", "Landroid/content/Intent;", "p2", "", "ɩ", "(ILandroid/content/Context;Landroid/content/Intent;)V", "", "p3", "(ILandroid/content/Context;Landroid/content/Intent;J)V", "ǃ", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
public final class lO {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final lO f2758 = new lO();

    private lO() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3406(int i, Context context, Intent intent, long j) {
        fM.m2254(context, "");
        fM.m2254(intent, "");
        Object systemService = context.getSystemService("alarm");
        if (systemService != null) {
            AlarmManager alarmManager = (AlarmManager) systemService;
            PendingIntent service = PendingIntent.getService(context, i, intent, 134217728);
            if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, service);
            } else {
                alarmManager.set(2, SystemClock.elapsedRealtime() + j, service);
            }
        } else {
            throw new dA("null cannot be cast to non-null type android.app.AlarmManager");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3408(int i, Context context, Intent intent, long j) {
        Throwable cause;
        Context context2 = context;
        Intent intent2 = intent;
        fM.m2254(context2, "");
        fM.m2254(intent2, "");
        Object systemService = context2.getSystemService("alarm");
        if (systemService != null) {
            AlarmManager alarmManager = (AlarmManager) systemService;
            PendingIntent service = PendingIntent.getService(context2, i, intent2, 134217728);
            lA.C0215 r1 = lA.f2728;
            StringBuilder sb = new StringBuilder();
            sb.append("Purging alarm set to ");
            try {
                sb.append(((Long) ((Class) C3166.m16013(4, 8, 0)).getMethod("і", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{context2})).longValue() + j);
                r1.m3368("Scheduler", sb.toString());
                try {
                    alarmManager.setRepeating(1, ((Long) ((Class) C3166.m16013(4, 8, 0)).getMethod("і", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{context2})).longValue() + j, j, service);
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
            throw new dA("null cannot be cast to non-null type android.app.AlarmManager");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3407(int i, Context context, Intent intent) {
        fM.m2254(context, "");
        fM.m2254(intent, "");
        PendingIntent.getService(context, i, intent, 134217728).cancel();
    }
}
