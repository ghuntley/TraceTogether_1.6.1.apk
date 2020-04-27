package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import o.C0801;
import o.C2193;
import o.C2248;
import o.C2256;
import o.C2448;
import o.C2658;

public final class FirebaseAnalytics {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static volatile FirebaseAnalytics f957;

    /* renamed from: ı  reason: contains not printable characters */
    private final C2248 f958;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2658 f959;

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean f960;

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f957 == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f957 == null) {
                    if (C2248.m11750(context)) {
                        f957 = new FirebaseAnalytics(C2248.m11745(context));
                    } else {
                        f957 = new FirebaseAnalytics(C2658.m14078(context, (C2193) null));
                    }
                }
            }
        }
        return f957;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1082(String str, Bundle bundle) {
        if (this.f960) {
            this.f958.m11781(str, bundle);
        } else {
            this.f959.m14100().m4324("app", str, bundle, true);
        }
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.f960) {
            this.f958.m11780(activity, str, str2);
        } else if (!C2448.m12571()) {
            this.f959.t_().A_().m11606("setCurrentScreen must be called from the main thread");
        } else {
            this.f959.m14085().m6334(activity, str, str2);
        }
    }

    private FirebaseAnalytics(C2658 r2) {
        if (r2 != null) {
            this.f959 = r2;
            this.f958 = null;
            this.f960 = false;
            return;
        }
        throw new NullPointerException("null reference");
    }

    private FirebaseAnalytics(C2248 r2) {
        if (r2 != null) {
            this.f959 = null;
            this.f958 = r2;
            this.f960 = true;
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if ((java.lang.System.currentTimeMillis() > r1.f9676 + o.C1918.f9675 || !r0.f981.m9978().equals(r1.f9677)) != false) goto L_0x003a;
     */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFirebaseInstanceId() {
        /*
            r11 = this;
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.m1106()
            com.google.firebase.FirebaseApp r1 = r0.f983
            com.google.firebase.iid.FirebaseInstanceId.m1107((com.google.firebase.FirebaseApp) r1)
            com.google.firebase.FirebaseApp r1 = r0.f983
            java.lang.String r1 = o.C1799.m9976(r1)
            java.lang.String r2 = "*"
            o.ΣІ r1 = com.google.firebase.iid.FirebaseInstanceId.m1103(r1, r2)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003a
            o.ΙƩ r4 = r0.f981
            java.lang.String r4 = r4.m9978()
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r1.f9676
            long r9 = o.C1918.f9675
            long r7 = r7 + r9
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0037
            java.lang.String r1 = r1.f9677
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r1 = 0
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            if (r1 == 0) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            if (r2 != 0) goto L_0x0045
            o.z$ɩ r1 = r0.f982
            boolean r1 = r1.m4103()
            if (r1 == 0) goto L_0x0048
        L_0x0045:
            r0.m1115()
        L_0x0048:
            java.lang.String r0 = r0.m1118()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.FirebaseAnalytics.getFirebaseInstanceId():java.lang.String");
    }

    @Keep
    public static C0801 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2248 r2;
        if (C2248.m11750(context) && (r2 = C2248.m11739(context, (String) null, (String) null, (String) null, bundle)) != null) {
            return new C2256(r2);
        }
        return null;
    }
}
