package o;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o.C2745;

/* renamed from: o.ǀɉ  reason: contains not printable characters */
public final class C0848 extends C1698 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2335 f5550;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final List<Runnable> f5551 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public C2082 f5552;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1883 f5553;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C2335 f5554;

    /* renamed from: Ι  reason: contains not printable characters */
    private volatile Boolean f5555;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final C1353 f5556;

    protected C0848(C2658 r3) {
        super(r3);
        this.f5553 = new C1883(r3.w_());
        this.f5556 = new C1353(this);
        this.f5550 = new C1041(this, r3);
        this.f5554 = new C1180(this, r3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɟ  reason: contains not printable characters */
    public final boolean m6371() {
        return false;
    }

    /* renamed from: ǀ  reason: contains not printable characters */
    public final boolean m6365() {
        y_();
        m9662();
        return this.f5552 != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɔ  reason: contains not printable characters */
    public final void m6370() {
        y_();
        m9662();
        m6355((Runnable) new C1138(this, m6347(true)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6376(C2082 r12, C1519 r13, C2270 r14) {
        int i;
        List<C1519> r5;
        y_();
        m15903();
        m9662();
        boolean r0 = m6357();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!r0 || (r5 = m11087().m11436(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(r5);
                i = r5.size();
            }
            if (r13 != null && i < 100) {
                arrayList.add(r13);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                C1519 r8 = (C1519) obj;
                if (r8 instanceof C2441) {
                    try {
                        r12.m11069((C2441) r8, r14);
                    } catch (RemoteException e) {
                        t_().m11714().m11603("Failed to send event to the service", e);
                    }
                } else if (r8 instanceof C2113) {
                    try {
                        r12.m11064((C2113) r8, r14);
                    } catch (RemoteException e2) {
                        t_().m11714().m11603("Failed to send user property to the service", e2);
                    }
                } else if (r8 instanceof C2527) {
                    try {
                        r12.m11067((C2527) r8, r14);
                    } catch (RemoteException e3) {
                        t_().m11714().m11603("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    t_().m11714().m11606("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m6361(C2441 r9, String str) {
        C2745.C2746.m14555(r9);
        y_();
        m9662();
        boolean r2 = m6357();
        m6355((Runnable) new C1117(this, r2, r2 && m11087().m11444(r9), r9, m6347(true), str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m6362(C2527 r10) {
        C2745.C2746.m14555(r10);
        y_();
        m9662();
        q_();
        m6355((Runnable) new C1293(this, true, m11087().m11429(r10), new C2527(r10), m6347(true), r10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6367(AtomicReference<List<C2527>> atomicReference, String str, String str2, String str3) {
        y_();
        m9662();
        m6355((Runnable) new C1103(this, atomicReference, str, str2, str3, m6347(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6374(C1818 r8, String str, String str2) {
        y_();
        m9662();
        m6355((Runnable) new C1397(this, str, str2, m6347(false), r8));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6383(AtomicReference<List<C2113>> atomicReference, String str, String str2, String str3, boolean z) {
        y_();
        m9662();
        m6355((Runnable) new C1382(this, atomicReference, str, str2, str3, z, m6347(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6368(C1818 r9, String str, String str2, boolean z) {
        y_();
        m9662();
        m6355((Runnable) new C1322(this, str, str2, z, m6347(false), r9));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6369(C2113 r4) {
        y_();
        m9662();
        m6355((Runnable) new C0982(this, m6357() && m11087().m11443(r4), r4, m6347(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6373(AtomicReference<List<C2113>> atomicReference, boolean z) {
        y_();
        m9662();
        m6355((Runnable) new C1052(this, atomicReference, m6347(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɼ  reason: contains not printable characters */
    public final void m6379() {
        y_();
        m15903();
        m9662();
        C2270 r0 = m6347(false);
        if (m6357()) {
            m11087().m11434();
        }
        m6355((Runnable) new C1037(this, r0));
    }

    /* renamed from: с  reason: contains not printable characters */
    private final boolean m6357() {
        q_();
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6382(AtomicReference<String> atomicReference) {
        y_();
        m9662();
        m6355((Runnable) new C1046(this, atomicReference, m6347(false)));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6387(C1818 r3) {
        y_();
        m9662();
        m6355((Runnable) new C1054(this, m6347(false), r3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ј  reason: contains not printable characters */
    public final void m6390() {
        y_();
        m9662();
        C2270 r0 = m6347(true);
        boolean r1 = r_().m13372(C2529.f11552);
        if (r1) {
            m11087().m11440();
        }
        m6355((Runnable) new C1101(this, r0, r1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6384(C0856 r2) {
        y_();
        m9662();
        m6355((Runnable) new C1050(this, r2));
    }

    /* access modifiers changed from: private */
    /* renamed from: х  reason: contains not printable characters */
    public final void m6359() {
        y_();
        this.f5553.m10288();
        this.f5550.m12178(C2529.f11559.m10833(null).longValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* renamed from: ϲ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6388() {
        /*
            r6 = this;
            r6.y_()
            r6.m9662()
            boolean r0 = r6.m6365()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f5555
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x011a
            r6.y_()
            r6.m9662()
            o.Іւ r0 = r6.s_()
            java.lang.Boolean r0 = r0.m12119()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x0114
        L_0x002c:
            r6.q_()
            o.κΙ r0 = r6.m11086()
            int r0 = r0.m11207()
            if (r0 != r2) goto L_0x003d
        L_0x0039:
            r0 = 1
        L_0x003a:
            r3 = 1
            goto L_0x00f1
        L_0x003d:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.m11713()
            java.lang.String r3 = "Checking service availability"
            r0.m11606(r3)
            o.ϜΙ r0 = r6.m15901()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.m11369((int) r3)
            if (r0 == 0) goto L_0x00e2
            if (r0 == r2) goto L_0x00d2
            r3 = 2
            if (r0 == r3) goto L_0x00a6
            r3 = 3
            if (r0 == r3) goto L_0x0098
            r3 = 9
            if (r0 == r3) goto L_0x008a
            r3 = 18
            if (r0 == r3) goto L_0x007c
            o.Іɛ r3 = r6.t_()
            o.ϵı r3 = r3.A_()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "Unexpected service status"
            r3.m11603(r4, r0)
        L_0x0078:
            r0 = 0
        L_0x0079:
            r3 = 0
            goto L_0x00f1
        L_0x007c:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.A_()
            java.lang.String r3 = "Service updating"
            r0.m11606(r3)
            goto L_0x0039
        L_0x008a:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.A_()
            java.lang.String r3 = "Service invalid"
            r0.m11606(r3)
            goto L_0x0078
        L_0x0098:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.A_()
            java.lang.String r3 = "Service disabled"
            r0.m11606(r3)
            goto L_0x0078
        L_0x00a6:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.m11711()
            java.lang.String r3 = "Service container out of date"
            r0.m11606(r3)
            o.ϜΙ r0 = r6.m15901()
            int r0 = r0.m11394()
            r3 = 17443(0x4423, float:2.4443E-41)
            if (r0 >= r3) goto L_0x00c0
            goto L_0x00df
        L_0x00c0:
            o.Іւ r0 = r6.s_()
            java.lang.Boolean r0 = r0.m12119()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0078
        L_0x00d0:
            r0 = 1
            goto L_0x0079
        L_0x00d2:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.m11713()
            java.lang.String r3 = "Service missing"
            r0.m11606(r3)
        L_0x00df:
            r0 = 0
            goto L_0x003a
        L_0x00e2:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.m11713()
            java.lang.String r3 = "Service available"
            r0.m11606(r3)
            goto L_0x0039
        L_0x00f1:
            if (r0 != 0) goto L_0x010b
            o.ьɹ r4 = r6.r_()
            boolean r4 = r4.m13376()
            if (r4 == 0) goto L_0x010b
            o.Іɛ r3 = r6.t_()
            o.ϵı r3 = r3.m11714()
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.m11606(r4)
            r3 = 0
        L_0x010b:
            if (r3 == 0) goto L_0x0114
            o.Іւ r3 = r6.s_()
            r3.m12114(r0)
        L_0x0114:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f5555 = r0
        L_0x011a:
            java.lang.Boolean r0 = r6.f5555
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0128
            o.ɪɤ r0 = r6.f5556
            r0.m8454()
            return
        L_0x0128:
            o.ьɹ r0 = r6.r_()
            boolean r0 = r0.m13376()
            if (r0 != 0) goto L_0x0186
            r6.q_()
            android.content.Context r0 = r6.m15904()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.m15904()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x015b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x015b
            r1 = 1
        L_0x015b:
            if (r1 == 0) goto L_0x0179
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.m15904()
            r6.q_()
            r1.<init>(r2, r5)
            r0.setComponent(r1)
            o.ɪɤ r1 = r6.f5556
            r1.m8456((android.content.Intent) r0)
            return
        L_0x0179:
            o.Іɛ r0 = r6.t_()
            o.ϵı r0 = r0.m11714()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.m11606(r1)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0848.m6388():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ͻ  reason: contains not printable characters */
    public final Boolean m6380() {
        return this.f5555;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6385(C2082 r1) {
        y_();
        C2745.C2746.m14555(r1);
        this.f5552 = r1;
        m6359();
        m6352();
    }

    /* renamed from: ϳ  reason: contains not printable characters */
    public final void m6389() {
        y_();
        m9662();
        this.f5556.m8455();
        try {
            C1345.m8433().m8434(m15904(), this.f5556);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f5552 = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6349(ComponentName componentName) {
        y_();
        if (this.f5552 != null) {
            this.f5552 = null;
            t_().m11713().m11603("Disconnected from device MeasurementService", componentName);
            y_();
            m6388();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: т  reason: contains not printable characters */
    public final void m6358() {
        y_();
        if (m6365()) {
            t_().m11713().m11606("Inactivity, disconnecting from the service");
            m6389();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m6355(Runnable runnable) {
        y_();
        if (m6365()) {
            runnable.run();
        } else if (((long) this.f5551.size()) >= 1000) {
            t_().m11714().m11606("Discarding data. Max runnable queue size reached");
        } else {
            this.f5551.add(runnable);
            this.f5554.m12178(60000);
            m6388();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɭ  reason: contains not printable characters */
    public final void m6352() {
        y_();
        t_().m11713().m11603("Processing queued up service tasks", Integer.valueOf(this.f5551.size()));
        for (Runnable run : this.f5551) {
            try {
                run.run();
            } catch (Exception e) {
                t_().m11714().m11603("Task exception while flushing queue", e);
            }
        }
        this.f5551.clear();
        this.f5554.m12177();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final C2270 m6347(boolean z) {
        q_();
        return m11086().m11189(z ? t_().m11717() : null);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6375(C1818 r3, C2441 r4, String str) {
        y_();
        m9662();
        if (m15901().m11369((int) C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            t_().A_().m11606("Not bundling data. Service unavailable or out of date");
            m15901().m11405(r3, new byte[0]);
            return;
        }
        m6355((Runnable) new C1128(this, r4, str, r3));
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6363() {
        super.m11083();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6392() {
        super.m11091();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6391() {
        super.m11090();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2547 m6360() {
        return super.m11082();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0305 m6381() {
        return super.m11088();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2100 m6372() {
        return super.m11086();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0848 m6386() {
        return super.m11089();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0847 m6366() {
        return super.m11085();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2158 m6378() {
        return super.m11087();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1729 m6364() {
        return super.m11084();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m6393() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m6377() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
