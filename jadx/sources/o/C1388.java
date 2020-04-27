package o;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C3185;
import o.C3534kc;

/* renamed from: o.ɪа  reason: contains not printable characters */
final class C1388 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Executor f7632;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f7633;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3575lq f7634;

    public C1388(Context context, C3575lq lqVar, Executor executor) {
        this.f7632 = executor;
        this.f7633 = context;
        this.f7634 = lqVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m8549() {
        boolean z;
        String r0 = this.f7634.m3649("gcm.n.noui");
        if ("1".equals(r0) || Boolean.parseBoolean(r0)) {
            return true;
        }
        if (!((KeyguardManager) this.f7633.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!(Build.VERSION.SDK_INT >= 21)) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f7633.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        C3534kc.Cif r02 = C3534kc.Cif.m3259(this.f7634.m3649("gcm.n.image"));
        if (r02 != null) {
            r02.f2625 = C0309.m4375(this.f7632, new C3534kc(r02));
        }
        C1094 r1 = C1597.m9307(this.f7633, this.f7634);
        C3185.Cif ifVar = r1.f6529;
        if (r02 != null) {
            try {
                C0329<Bitmap> r5 = r02.f2625;
                if (r5 != null) {
                    Bitmap bitmap = (Bitmap) C0309.m4372(r5, 5, TimeUnit.SECONDS);
                    ifVar.m16084(bitmap);
                    ifVar.m16080((C3185.If) new C3185.C3188().m16108(bitmap).m16106((Bitmap) null));
                } else {
                    throw new NullPointerException("null reference");
                }
            } catch (ExecutionException e) {
                e.getCause();
            } catch (InterruptedException unused) {
                r02.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                r02.close();
            }
        }
        ((NotificationManager) this.f7633.getSystemService("notification")).notify(r1.f6528, 0, r1.f6529.m16075());
        return true;
    }
}
