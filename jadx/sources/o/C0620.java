package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
/* renamed from: o.Ɛǃ  reason: contains not printable characters */
final class C0620 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0305 f4586;

    private C0620(C0305 r1) {
        this.f4586 = r1;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f4586.t_().m11713().m11606("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f4586.m15901();
                        String str = C2151.m11351(intent) ? "gs" : "auto";
                        String queryParameter = data.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        if (!C1366.m8476() || !C2529.f11601.m10833(null).booleanValue()) {
                            m5328(z, data, str, queryParameter);
                        } else {
                            this.f4586.u_().m13668((Runnable) new C0772(this, z, data, str, queryParameter));
                        }
                        this.f4586.m11085().m6333(activity, bundle);
                        return;
                    }
                }
                this.f4586.m11085().m6333(activity, bundle);
            }
        } catch (Exception e) {
            this.f4586.t_().m11714().m11603("Throwable caught in onActivityCreated", e);
        } finally {
            this.f4586.m11085().m6333(activity, bundle);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[SYNTHETIC, Splitter:B:33:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0 A[Catch:{ Exception -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1 A[SYNTHETIC, Splitter:B:49:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120 A[Catch:{ Exception -> 0x01a3 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0121 A[Catch:{ Exception -> 0x01a3 }] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5328(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            o.ıƶ r3 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ьɹ r3 = r3.r_()     // Catch:{ Exception -> 0x01a3 }
            o.ιͱ<java.lang.Boolean> r4 = o.C2529.f11551     // Catch:{ Exception -> 0x01a3 }
            boolean r3 = r3.m13372((o.C2019<java.lang.Boolean>) r4)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x003f
            o.ıƶ r3 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ьɹ r3 = r3.r_()     // Catch:{ Exception -> 0x01a3 }
            o.ιͱ<java.lang.Boolean> r11 = o.C2529.f11600     // Catch:{ Exception -> 0x01a3 }
            boolean r3 = r3.m13372((o.C2019<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x01a3 }
            if (r3 != 0) goto L_0x003f
            o.ıƶ r3 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ьɹ r3 = r3.r_()     // Catch:{ Exception -> 0x01a3 }
            o.ιͱ<java.lang.Boolean> r11 = o.C2529.f11570     // Catch:{ Exception -> 0x01a3 }
            boolean r3 = r3.m13372((o.C2019<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x01a3 }
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            goto L_0x0092
        L_0x003f:
            o.ıƶ r3 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ϜΙ r3 = r3.m15901()     // Catch:{ Exception -> 0x01a3 }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01a3 }
            if (r11 == 0) goto L_0x004c
            goto L_0x003d
        L_0x004c:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x01a3 }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x01a3 }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x01a3 }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x01a3 }
            if (r11 != 0) goto L_0x0070
            o.Іɛ r3 = r3.t_()     // Catch:{ Exception -> 0x01a3 }
            o.ϵı r3 = r3.m11711()     // Catch:{ Exception -> 0x01a3 }
            r3.m11606(r4)     // Catch:{ Exception -> 0x01a3 }
            goto L_0x003d
        L_0x0070:
            java.lang.String r11 = "https://google.com/search?"
            int r12 = r21.length()     // Catch:{ Exception -> 0x01a3 }
            if (r12 == 0) goto L_0x007d
            java.lang.String r11 = r11.concat(r2)     // Catch:{ Exception -> 0x01a3 }
            goto L_0x0083
        L_0x007d:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x01a3 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01a3 }
            r11 = r12
        L_0x0083:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x01a3 }
            android.os.Bundle r3 = r3.m11370((android.net.Uri) r11)     // Catch:{ Exception -> 0x01a3 }
            if (r3 == 0) goto L_0x0092
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x01a3 }
        L_0x0092:
            r11 = 0
            java.lang.String r12 = "_cmp"
            r13 = 1
            if (r18 == 0) goto L_0x00e0
            o.ıƶ r14 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ϜΙ r14 = r14.m15901()     // Catch:{ Exception -> 0x01a3 }
            r15 = r19
            android.os.Bundle r14 = r14.m11370((android.net.Uri) r15)     // Catch:{ Exception -> 0x01a3 }
            if (r14 == 0) goto L_0x00e1
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x01a3 }
            o.ıƶ r6 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ьɹ r6 = r6.r_()     // Catch:{ Exception -> 0x01a3 }
            o.ιͱ<java.lang.Boolean> r15 = o.C2529.f11551     // Catch:{ Exception -> 0x01a3 }
            boolean r6 = r6.m13372((o.C2019<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x01a3 }
            if (r6 == 0) goto L_0x00da
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01a3 }
            if (r6 != 0) goto L_0x00da
            if (r3 == 0) goto L_0x00da
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01a3 }
            if (r6 == 0) goto L_0x00da
            java.lang.String r6 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r16 = r3.getString(r10)     // Catch:{ Exception -> 0x01a3 }
            r9[r11] = r16     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r9 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x01a3 }
            r14.putString(r6, r9)     // Catch:{ Exception -> 0x01a3 }
        L_0x00da:
            o.ıƶ r6 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            r6.m4344(r0, r12, r14)     // Catch:{ Exception -> 0x01a3 }
            goto L_0x00e1
        L_0x00e0:
            r14 = 0
        L_0x00e1:
            o.ıƶ r6 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ьɹ r6 = r6.r_()     // Catch:{ Exception -> 0x01a3 }
            o.ιͱ<java.lang.Boolean> r9 = o.C2529.f11600     // Catch:{ Exception -> 0x01a3 }
            boolean r6 = r6.m13372((o.C2019<java.lang.Boolean>) r9)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r9 = "auto"
            if (r6 == 0) goto L_0x011a
            o.ıƶ r6 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ьɹ r6 = r6.r_()     // Catch:{ Exception -> 0x01a3 }
            o.ιͱ<java.lang.Boolean> r15 = o.C2529.f11570     // Catch:{ Exception -> 0x01a3 }
            boolean r6 = r6.m13372((o.C2019<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x01a3 }
            if (r6 != 0) goto L_0x011a
            if (r3 == 0) goto L_0x011a
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01a3 }
            if (r6 == 0) goto L_0x011a
            if (r14 == 0) goto L_0x010f
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01a3 }
            if (r6 != 0) goto L_0x011a
        L_0x010f:
            o.ıƶ r6 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r14 = "_lgclid"
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x01a3 }
            r6.m4345((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r15, (boolean) r13)     // Catch:{ Exception -> 0x01a3 }
        L_0x011a:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01a3 }
            if (r6 == 0) goto L_0x0121
            return
        L_0x0121:
            o.ıƶ r6 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.Іɛ r6 = r6.t_()     // Catch:{ Exception -> 0x01a3 }
            o.ϵı r6 = r6.m11711()     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r14 = "Activity created with referrer"
            r6.m11603(r14, r2)     // Catch:{ Exception -> 0x01a3 }
            o.ıƶ r6 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.ьɹ r6 = r6.r_()     // Catch:{ Exception -> 0x01a3 }
            o.ιͱ<java.lang.Boolean> r14 = o.C2529.f11570     // Catch:{ Exception -> 0x01a3 }
            boolean r6 = r6.m13372((o.C2019<java.lang.Boolean>) r14)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r14 = "_ldl"
            if (r6 == 0) goto L_0x015e
            if (r3 == 0) goto L_0x0148
            o.ıƶ r2 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            r2.m4344(r0, r12, r3)     // Catch:{ Exception -> 0x01a3 }
            goto L_0x0157
        L_0x0148:
            o.ıƶ r0 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.Іɛ r0 = r0.t_()     // Catch:{ Exception -> 0x01a3 }
            o.ϵı r0 = r0.m11711()     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.m11603(r3, r2)     // Catch:{ Exception -> 0x01a3 }
        L_0x0157:
            o.ıƶ r0 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            r2 = 0
            r0.m4345((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r2, (boolean) r13)     // Catch:{ Exception -> 0x01a3 }
            return
        L_0x015e:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x01a3 }
            if (r0 == 0) goto L_0x0187
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x01a3 }
            if (r0 != 0) goto L_0x0186
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x01a3 }
            if (r0 != 0) goto L_0x0186
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x01a3 }
            if (r0 != 0) goto L_0x0186
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01a3 }
            if (r0 != 0) goto L_0x0186
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01a3 }
            if (r0 == 0) goto L_0x0187
        L_0x0186:
            r11 = 1
        L_0x0187:
            if (r11 != 0) goto L_0x0197
            o.ıƶ r0 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            o.Іɛ r0 = r0.t_()     // Catch:{ Exception -> 0x01a3 }
            o.ϵı r0 = r0.m11711()     // Catch:{ Exception -> 0x01a3 }
            r0.m11606(r4)     // Catch:{ Exception -> 0x01a3 }
            return
        L_0x0197:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01a3 }
            if (r0 != 0) goto L_0x01a2
            o.ıƶ r0 = r1.f4586     // Catch:{ Exception -> 0x01a3 }
            r0.m4345((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r2, (boolean) r13)     // Catch:{ Exception -> 0x01a3 }
        L_0x01a2:
            return
        L_0x01a3:
            r0 = move-exception
            o.ıƶ r2 = r1.f4586
            o.Іɛ r2 = r2.t_()
            o.ϵı r2 = r2.m11714()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.m11603(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0620.m5328(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f4586.m11085().m6332(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f4586.m11085().m6342(activity);
        C1729 r5 = this.f4586.m11084();
        r5.u_().m13668((Runnable) new C1727(r5, r5.w_().m10847()));
    }

    public final void onActivityResumed(Activity activity) {
        if (!C1174.m7692() || !C2529.f11497.m10833(null).booleanValue()) {
            this.f4586.m11085().m6339(activity);
            this.f4586.m11084().m9741();
            return;
        }
        this.f4586.m11084().m9741();
        this.f4586.m11085().m6339(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f4586.m11085().m6328(activity, bundle);
    }

    /* synthetic */ C0620(C0305 r1, C3214 r2) {
        this(r1);
    }
}
