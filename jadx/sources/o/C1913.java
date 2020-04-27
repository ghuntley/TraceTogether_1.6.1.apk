package o;

import android.content.Context;
import android.os.Bundle;
import o.C2248;

/* renamed from: o.Ρ  reason: contains not printable characters */
final class C1913 extends C2248.If {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ Context f9659;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ String f9660;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ String f9661;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final /* synthetic */ C2248 f9662;

    /* renamed from: І  reason: contains not printable characters */
    private final /* synthetic */ Bundle f9663;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1913(C2248 r1, String str, String str2, Context context, Bundle bundle) {
        super(r1);
        this.f9662 = r1;
        this.f9660 = str;
        this.f9661 = str2;
        this.f9659 = context;
        this.f9663 = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r4 < r3) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x009e }] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10393() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            o.Іɤ r2 = r14.f9662     // Catch:{ Exception -> 0x009e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x009e }
            r3.<init>()     // Catch:{ Exception -> 0x009e }
            java.util.List unused = r2.f10565 = r3     // Catch:{ Exception -> 0x009e }
            o.Іɤ r2 = r14.f9662     // Catch:{ Exception -> 0x009e }
            java.lang.String r3 = r14.f9660     // Catch:{ Exception -> 0x009e }
            java.lang.String r4 = r14.f9661     // Catch:{ Exception -> 0x009e }
            boolean r2 = o.C2248.m11741((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ Exception -> 0x009e }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f9661     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = r14.f9660     // Catch:{ Exception -> 0x009e }
            o.Іɤ r4 = r14.f9662     // Catch:{ Exception -> 0x009e }
            java.lang.String r4 = r4.f10563     // Catch:{ Exception -> 0x009e }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f9659     // Catch:{ Exception -> 0x009e }
            o.C2248.m11743(r2)     // Catch:{ Exception -> 0x009e }
            java.lang.Boolean r2 = o.C2248.f10555     // Catch:{ Exception -> 0x009e }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x009e }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            o.Іɤ r3 = r14.f9662     // Catch:{ Exception -> 0x009e }
            o.Іɤ r4 = r14.f9662     // Catch:{ Exception -> 0x009e }
            android.content.Context r5 = r14.f9659     // Catch:{ Exception -> 0x009e }
            o.ɬі r4 = r4.m11765((android.content.Context) r5, (boolean) r2)     // Catch:{ Exception -> 0x009e }
            o.C1426 unused = r3.f10558 = r4     // Catch:{ Exception -> 0x009e }
            o.Іɤ r3 = r14.f9662     // Catch:{ Exception -> 0x009e }
            o.ɬі r3 = r3.f10558     // Catch:{ Exception -> 0x009e }
            if (r3 != 0) goto L_0x0060
            o.Іɤ r2 = r14.f9662     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = r2.f10563     // Catch:{ Exception -> 0x009e }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x009e }
            return
        L_0x0060:
            android.content.Context r3 = r14.f9659     // Catch:{ Exception -> 0x009e }
            int r3 = o.C2248.m11763(r3)     // Catch:{ Exception -> 0x009e }
            android.content.Context r4 = r14.f9659     // Catch:{ Exception -> 0x009e }
            int r4 = o.C2248.m11751(r4)     // Catch:{ Exception -> 0x009e }
            if (r2 == 0) goto L_0x0079
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x009e }
            if (r4 >= r3) goto L_0x0076
        L_0x0074:
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r8 = r3
            goto L_0x0081
        L_0x0079:
            if (r3 <= 0) goto L_0x007d
            r2 = r3
            goto L_0x007e
        L_0x007d:
            r2 = r4
        L_0x007e:
            if (r3 <= 0) goto L_0x0076
            goto L_0x0074
        L_0x0081:
            o.ϳЈ r13 = new o.ϳЈ     // Catch:{ Exception -> 0x009e }
            r4 = 22048(0x5620, double:1.0893E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x009e }
            android.os.Bundle r12 = r14.f9663     // Catch:{ Exception -> 0x009e }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x009e }
            o.Іɤ r2 = r14.f9662     // Catch:{ Exception -> 0x009e }
            o.ɬі r2 = r2.f10558     // Catch:{ Exception -> 0x009e }
            android.content.Context r3 = r14.f9659     // Catch:{ Exception -> 0x009e }
            o.ҳ r3 = o.C2813.m14730(r3)     // Catch:{ Exception -> 0x009e }
            long r4 = r14.f10570     // Catch:{ Exception -> 0x009e }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x009e }
            return
        L_0x009e:
            r2 = move-exception
            o.Іɤ r3 = r14.f9662
            r3.m11746((java.lang.Exception) r2, (boolean) r1, (boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1913.m10393():void");
    }
}
