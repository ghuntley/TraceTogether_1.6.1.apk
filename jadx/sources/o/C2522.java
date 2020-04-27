package o;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import o.C2745;

/* renamed from: o.ьӀ  reason: contains not printable characters */
public final class C2522 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2533 f11448;

    public C2522(C2533 r1) {
        C2745.C2746.m14555(r1);
        this.f11448 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m13401(Context context) {
        ActivityInfo receiverInfo;
        C2745.C2746.m14555(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13402(Context context, Intent intent) {
        C2658 r3 = C2658.m14078(context, (C2193) null);
        C2244 t_ = r3.t_();
        if (intent == null) {
            t_.A_().m11606("Receiver called with null intent");
            return;
        }
        r3.q_();
        String action = intent.getAction();
        t_.m11713().m11603("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            t_.m11713().m11606("Starting wakeful intent.");
            this.f11448.m13548(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                r3.u_().m13668((Runnable) new C2521(this, r3, t_));
            } catch (Exception e) {
                t_.A_().m11603("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult r9 = this.f11448.m13547();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                t_.m11713().m11606("Install referrer extras are null");
                if (r9 != null) {
                    r9.finish();
                    return;
                }
                return;
            }
            t_.m11710().m11603("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                stringExtra = stringExtra.length() != 0 ? "?".concat(stringExtra) : new String("?");
            }
            Bundle r6 = r3.m14116().m11370(Uri.parse(stringExtra));
            if (r6 == null) {
                t_.m11713().m11606("No campaign defined in install referrer broadcast");
                if (r9 != null) {
                    r9.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                t_.A_().m11606("Install referrer is missing timestamp");
            }
            r3.u_().m13668((Runnable) new C2528(this, r3, longExtra, r6, context, t_, r9));
        }
    }
}
