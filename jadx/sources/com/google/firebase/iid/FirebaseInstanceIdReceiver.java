package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.B;
import o.C0329;
import o.C1381;
import o.C1897;
import o.C2047;
import o.C2324;
import o.X;

public final class FirebaseInstanceIdReceiver extends C2047 {

    /* renamed from: ι  reason: contains not printable characters */
    private final ExecutorService f996 = C2324.m12104();

    public final void onReceive(Context context, Intent intent) {
        C1897 r4;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                intent = intent2;
            }
            intent.setComponent((ComponentName) null);
            intent.setPackage(context.getPackageName());
            if (Build.VERSION.SDK_INT <= 18) {
                intent.removeCategory(context.getPackageName());
            }
            if ("google.com/iid".equals(intent.getStringExtra("from"))) {
                r4 = new X(this.f996);
            } else {
                r4 = new C1381(context, this.f996);
            }
            r4.m10332(intent).m4407((Executor) this.f996, new B.Aux(isOrderedBroadcast(), goAsync()));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final /* synthetic */ void m1125(boolean z, BroadcastReceiver.PendingResult pendingResult, C0329 r2) {
        if (z) {
            pendingResult.setResultCode(r2.m4421() ? ((Integer) r2.m4401()).intValue() : 500);
        }
        pendingResult.finish();
    }
}
