package com.google.firebase.auth.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import o.C0375;
import o.C0563;
import o.C0718;
import o.C0857;
import o.C1269;
import o.C2022;
import o.C2745;

@KeepName
public class FederatedSignInActivity extends C1269 {
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Runnable f974;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Handler f975;

    /* renamed from: ι  reason: contains not printable characters */
    private static long f976;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f977 = false;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.SIGN_IN".equals(action) || "com.google.firebase.auth.internal.LINK".equals(action) || "com.google.firebase.auth.internal.REAUTHENTICATE".equals(action)) {
            long r0 = C2022.f9992.m10846();
            if (r0 - f976 >= 30000) {
                f976 = r0;
                if (bundle != null) {
                    this.f977 = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                    return;
                }
                return;
            }
            return;
        }
        m1099();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f977);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r9 = this;
            super.onResume()
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r2 = "com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED"
            boolean r1 = r2.equals(r1)
            r2 = 1
            r3 = 0
            java.lang.String r4 = "com.google.firebase.auth.internal.OPERATION"
            if (r1 == 0) goto L_0x002b
            boolean r1 = o.C0857.m6410(r0)
            if (r1 == 0) goto L_0x0025
            com.google.android.gms.common.api.Status r0 = o.C0857.m6411(r0)
            r9.m1100((com.google.android.gms.common.api.Status) r0)
            goto L_0x0028
        L_0x0025:
            r9.m1099()
        L_0x0028:
            r3 = 1
            goto L_0x00ac
        L_0x002b:
            boolean r1 = r0.hasExtra(r4)
            if (r1 == 0) goto L_0x00ac
            java.lang.String r1 = "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"
            boolean r5 = r0.hasExtra(r1)
            if (r5 == 0) goto L_0x00ac
            java.lang.String r5 = r0.getStringExtra(r4)
            java.lang.String r6 = "com.google.firebase.auth.internal.SIGN_IN"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0055
            java.lang.String r6 = "com.google.firebase.auth.internal.LINK"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0055
            java.lang.String r6 = "com.google.firebase.auth.internal.REAUTHENTICATE"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00ac
        L_0x0055:
            android.os.Parcelable$Creator<o.ɽɩ> r6 = o.C1522.CREATOR
            byte[] r7 = r0.getByteArrayExtra(r1)
            if (r7 != 0) goto L_0x005f
            r6 = 0
            goto L_0x0063
        L_0x005f:
            o.ɼӏ r6 = o.C1544.m9040(r7, r6)
        L_0x0063:
            o.ɽɩ r6 = (o.C1522) r6
            java.lang.String r7 = "com.google.firebase.auth.internal.EXTRA_TENANT_ID"
            java.lang.String r0 = r0.getStringExtra(r7)
            r6.m8974(r0)
            r7 = 0
            f976 = r7
            r9.f977 = r3
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.os.Parcel r8 = android.os.Parcel.obtain()
            r6.writeToParcel(r8, r3)
            byte[] r3 = r8.marshall()
            r8.recycle()
            r7.putExtra(r1, r3)
            r7.putExtra(r4, r5)
            java.lang.String r1 = "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"
            r7.setAction(r1)
            o.ıͻ r1 = o.C0375.m4583(r9)
            boolean r1 = r1.m4585(r7)
            if (r1 != 0) goto L_0x00a4
            android.content.Context r1 = r9.getApplicationContext()
            o.C0718.m5836(r1, r6, r5, r0)
            goto L_0x00a7
        L_0x00a4:
            o.C0718.m5839(r9)
        L_0x00a7:
            r9.finish()
            goto L_0x0028
        L_0x00ac:
            if (r3 == 0) goto L_0x00af
            return
        L_0x00af:
            boolean r0 = r9.f977
            if (r0 != 0) goto L_0x00eb
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.firebase.auth.api.gms.ui.START_WEB_SIGN_IN"
            r0.<init>(r1)
            java.lang.String r1 = "com.google.android.gms"
            r0.setPackage(r1)
            android.content.Intent r1 = r9.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r0.putExtras(r1)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r1 = r1.getAction()
            r0.putExtra(r4, r1)
            r1 = 40963(0xa003, float:5.7401E-41)
            r9.startActivityForResult(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x00dc }
            goto L_0x00e8
        L_0x00dc:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17499(0x445b, float:2.4521E-41)
            java.lang.String r3 = "Could not launch web sign-in Intent. Google Play service is unavailable"
            r0.<init>(r1, r3)
            r9.m1100((com.google.android.gms.common.api.Status) r0)
        L_0x00e8:
            r9.f977 = r2
            return
        L_0x00eb:
            o.ɩƶ r0 = new o.ɩƶ
            r0.<init>(r9)
            f974 = r0
            android.os.Handler r0 = f975
            if (r0 != 0) goto L_0x00fd
            o.ʂ r0 = new o.ʂ
            r0.<init>()
            f975 = r0
        L_0x00fd:
            android.os.Handler r0 = f975
            java.lang.Runnable r1 = f974
            r2 = 800(0x320, double:3.953E-321)
            r0.postDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.FederatedSignInActivity.onResume():void");
    }

    public void onNewIntent(Intent intent) {
        Runnable runnable;
        super.onNewIntent(intent);
        Handler handler = f975;
        if (!(handler == null || (runnable = f974) == null)) {
            handler.removeCallbacks(runnable);
            f974 = null;
        }
        setIntent(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m1099() {
        f976 = 0;
        this.f977 = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C0375.m4583(this).m4585(intent)) {
            C0718.m5838(this, C2745.m14525("WEB_CONTEXT_CANCELED"));
        } else {
            C0718.m5839(this);
        }
        finish();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m1100(Status status) {
        f976 = 0;
        this.f977 = false;
        Intent intent = new Intent();
        C0857.m6412(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!C0375.m4583(this).m4585(intent)) {
            C0718.m5838(getApplicationContext(), status);
        } else {
            C0718.m5839(this);
        }
        finish();
    }

    static {
        C0563.m5176();
    }
}
