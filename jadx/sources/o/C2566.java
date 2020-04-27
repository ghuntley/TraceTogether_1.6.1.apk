package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.іƖ  reason: contains not printable characters */
final class C2566 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static AtomicBoolean f11685 = new AtomicBoolean(false);

    /* renamed from: ι  reason: contains not printable characters */
    static void m13647(Context context) {
        if (!f11685.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2567());
        }
    }

    /* renamed from: o.іƖ$ɩ  reason: contains not printable characters */
    static class C2567 extends C2374 {
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        C2567() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2918.m15076(activity);
        }
    }
}
