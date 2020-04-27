package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C2363;
import o.C2477;
import o.C2745;

/* renamed from: o.Ψ  reason: contains not printable characters */
public class C1924 implements C3005 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static volatile C1924 f9706;

    /* renamed from: ı  reason: contains not printable characters */
    private C2309 f9707;

    /* renamed from: ŀ  reason: contains not printable characters */
    private int f9708;

    /* renamed from: ł  reason: contains not printable characters */
    private boolean f9709;

    /* renamed from: ſ  reason: contains not printable characters */
    private long f9710;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C2658 f9711;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private FileChannel f9712;

    /* renamed from: ƚ  reason: contains not printable characters */
    private List<Long> f9713;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C2593 f9714;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f9715;

    /* renamed from: ɍ  reason: contains not printable characters */
    private List<Long> f9716;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f9717;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C2286 f9718;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f9719;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C2090 f9720;

    /* renamed from: ɾ  reason: contains not printable characters */
    private List<Runnable> f9721;

    /* renamed from: ɿ  reason: contains not printable characters */
    private boolean f9722;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f9723;

    /* renamed from: ι  reason: contains not printable characters */
    private C2301 f9724;

    /* renamed from: І  reason: contains not printable characters */
    private C1922 f9725;

    /* renamed from: г  reason: contains not printable characters */
    private FileLock f9726;

    /* renamed from: і  reason: contains not printable characters */
    private C2217 f9727;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C0822 f9728;

    /* renamed from: ӏ  reason: contains not printable characters */
    private long f9729;

    /* renamed from: o.Ψ$ı  reason: contains not printable characters */
    class C1925 implements C2377 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private long f9731;

        /* renamed from: ɩ  reason: contains not printable characters */
        List<C2477.C2481> f9732;

        /* renamed from: Ι  reason: contains not printable characters */
        List<Long> f9733;

        /* renamed from: ι  reason: contains not printable characters */
        C2477.aux f9734;

        private C1925() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m10526(C2477.aux aux) {
            C2745.C2746.m14555(aux);
            this.f9734 = aux;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m10525(long j, C2477.C2481 r10) {
            C2745.C2746.m14555(r10);
            if (this.f9732 == null) {
                this.f9732 = new ArrayList();
            }
            if (this.f9733 == null) {
                this.f9733 = new ArrayList();
            }
            if (this.f9732.size() > 0 && m10524(this.f9732.get(0)) != m10524(r10)) {
                return false;
            }
            long r2 = this.f9731 + ((long) r10.m6988());
            if (r2 >= ((long) Math.max(0, C2529.f11597.m10833(null).intValue()))) {
                return false;
            }
            this.f9731 = r2;
            this.f9732.add(r10);
            this.f9733.add(Long.valueOf(j));
            if (this.f9732.size() >= Math.max(1, C2529.f11606.m10833(null).intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static long m10524(C2477.C2481 r4) {
            return ((r4.m13065() / 1000) / 60) / 60;
        }

        /* synthetic */ C1925(C1924 r1, C1937 r2) {
            this();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1924 m10484(Context context) {
        C2745.C2746.m14555(context);
        C2745.C2746.m14555(context.getApplicationContext());
        if (f9706 == null) {
            synchronized (C1924.class) {
                if (f9706 == null) {
                    f9706 = new C1924(new C2099(context));
                }
            }
        }
        return f9706;
    }

    private C1924(C2099 r2) {
        this(r2, (C2658) null);
    }

    private C1924(C2099 r3, C2658 r4) {
        this.f9715 = false;
        C2745.C2746.m14555(r3);
        this.f9711 = C2658.m14078(r3.f10184, (C2193) null);
        this.f9710 = -1;
        C2090 r42 = new C2090(this);
        r42.m10930();
        this.f9720 = r42;
        C2286 r43 = new C2286(this);
        r43.m10930();
        this.f9718 = r43;
        C2593 r44 = new C2593(this);
        r44.m10930();
        this.f9714 = r44;
        this.f9711.u_().m13668((Runnable) new C1937(this, r3));
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10465(C2099 r4) {
        this.f9711.u_().y_();
        C2309 r42 = new C2309(this);
        r42.m10930();
        this.f9707 = r42;
        this.f9711.m14090().m13371((C2447) this.f9714);
        C2217 r43 = new C2217(this);
        r43.m10930();
        this.f9727 = r43;
        C0822 r44 = new C0822(this);
        r44.m10930();
        this.f9728 = r44;
        C1922 r45 = new C1922(this);
        r45.m10930();
        this.f9725 = r45;
        this.f9724 = new C2301(this);
        if (this.f9717 != this.f9708) {
            this.f9711.t_().m11714().m11605("Not all upload components initialized", Integer.valueOf(this.f9717), Integer.valueOf(this.f9708));
        }
        this.f9715 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10492() {
        this.f9711.u_().y_();
        m10502().i_();
        if (this.f9711.m14107().f10789.m13399() == 0) {
            this.f9711.m14107().f10789.m13398(this.f9711.w_().m10846());
        }
        m10479();
    }

    public final C2448 q_() {
        return this.f9711.q_();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2518 m10497() {
        return this.f9711.m14090();
    }

    public final C2244 t_() {
        return this.f9711.t_();
    }

    public final C2570 u_() {
        return this.f9711.u_();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2593 m10514() {
        m10486((C2042) this.f9714);
        return this.f9714;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2286 m10511() {
        m10486((C2042) this.f9718);
        return this.f9718;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2309 m10502() {
        m10486((C2042) this.f9707);
        return this.f9707;
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    private final C2301 m10471() {
        C2301 r0 = this.f9724;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: ſ  reason: contains not printable characters */
    private final C1922 m10467() {
        m10486((C2042) this.f9725);
        return this.f9725;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final C2217 m10520() {
        m10486((C2042) this.f9727);
        return this.f9727;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final C0822 m10521() {
        m10486((C2042) this.f9728);
        return this.f9728;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C2090 m10496() {
        m10486((C2042) this.f9720);
        return this.f9720;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C2102 m10522() {
        return this.f9711.m14115();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final Context m10523() {
        return this.f9711.m14117();
    }

    public final C2023 w_() {
        return this.f9711.w_();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C2151 m10507() {
        return this.f9711.m14116();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    private final void m10469() {
        this.f9711.u_().y_();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɾ  reason: contains not printable characters */
    public final void m10508() {
        if (!this.f9715) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m10486(C2042 r3) {
        if (r3 == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!r3.m10932()) {
            String valueOf = String.valueOf(r3.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    private final long m10480() {
        long r0 = this.f9711.w_().m10846();
        C2327 r2 = this.f9711.m14107();
        r2.m15649();
        r2.y_();
        long r3 = r2.f10774.m13399();
        if (r3 == 0) {
            r3 = 1 + ((long) r2.m15901().m11390().nextInt(86400000));
            r2.f10774.m13398(r3);
        }
        return ((((r0 + r3) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m10516(C2441 r34, String str) {
        C2441 r1 = r34;
        C2457 r2 = m10502().m12038(str);
        if (r2 == null || TextUtils.isEmpty(r2.m12614())) {
            this.f9711.t_().m11711().m11603("No app data available; dropping event", str);
            return;
        }
        Boolean r4 = m10481(r2);
        if (r4 == null) {
            if (!"_ui".equals(r1.f11089)) {
                this.f9711.t_().A_().m11603("Could not find package. appId", C2244.m11698(str));
            }
        } else if (!r4.booleanValue()) {
            this.f9711.t_().m11714().m11603("App version does not match; dropping event. appId", C2244.m11698(str));
            return;
        }
        C2270 r32 = r2;
        C2270 r22 = new C2270(str, r2.m12597(), r2.m12614(), r2.m12660(), r2.m12625(), r2.m12632(), r2.m12636(), (String) null, r2.m12603(), false, r2.m12627(), r2.m12653(), 0, 0, r2.m12651(), r2.m12646(), false, r2.m12657(), r2.m12638(), r2.m12652(), r2.m12647(), (!C1306.m8256() || !this.f9711.m14090().m13384(r2.m12610(), C2529.f11605)) ? null : r2.m12648());
        m10517(r1, r32);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013b A[Catch:{ all -> 0x038a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0216 A[Catch:{ all -> 0x038a }] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10517(o.C2441 r20, o.C2270 r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            o.C2745.C2746.m14555(r21)
            java.lang.String r3 = r2.f10610
            o.C2745.C2746.m14562((java.lang.String) r3)
            r19.m10469()
            r19.m10508()
            java.lang.String r3 = r2.f10610
            long r11 = r0.f11091
            o.ιս r4 = r19.m10496()
            boolean r4 = r4.m11108((o.C2441) r0, (o.C2270) r2)
            if (r4 != 0) goto L_0x0023
            return
        L_0x0023:
            boolean r4 = r2.f10625
            if (r4 != 0) goto L_0x002b
            r1.m10491((o.C2270) r2)
            return
        L_0x002b:
            o.ѵı r4 = r1.f9711
            o.ьɹ r4 = r4.m14090()
            o.ιͱ<java.lang.Boolean> r5 = o.C2529.f11499
            boolean r4 = r4.m13384(r3, r5)
            if (r4 == 0) goto L_0x007f
            java.util.List<java.lang.String> r4 = r2.f10618
            if (r4 == 0) goto L_0x007f
            java.util.List<java.lang.String> r4 = r2.f10618
            java.lang.String r5 = r0.f11089
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x006b
            o.зι r4 = r0.f11090
            android.os.Bundle r4 = r4.m12527()
            r5 = 1
            java.lang.String r7 = "ga_safelisted"
            r4.putLong(r7, r5)
            o.кǃ r5 = new o.кǃ
            java.lang.String r14 = r0.f11089
            o.зι r15 = new o.зι
            r15.<init>(r4)
            java.lang.String r4 = r0.f11088
            long r6 = r0.f11091
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            r0 = r5
            goto L_0x007f
        L_0x006b:
            o.ѵı r2 = r1.f9711
            o.Іɛ r2 = r2.t_()
            o.ϵı r2 = r2.m11711()
            java.lang.String r4 = r0.f11089
            java.lang.String r0 = r0.f11088
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r2.m11604(r5, r3, r4, r0)
            return
        L_0x007f:
            o.Іє r4 = r19.m10502()
            r4.m12045()
            o.Іє r4 = r19.m10502()     // Catch:{ all -> 0x038a }
            o.C2745.C2746.m14562((java.lang.String) r3)     // Catch:{ all -> 0x038a }
            r4.y_()     // Catch:{ all -> 0x038a }
            r4.m10931()     // Catch:{ all -> 0x038a }
            r5 = 0
            r7 = 2
            r13 = 0
            r14 = 1
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b6
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r4 = r4.A_()     // Catch:{ all -> 0x038a }
            java.lang.String r5 = "Invalid time querying timed out conditional properties"
            java.lang.Object r6 = o.C2244.m11698(r3)     // Catch:{ all -> 0x038a }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x038a }
            r4.m11605(r5, r6, r9)     // Catch:{ all -> 0x038a }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x038a }
            goto L_0x00c6
        L_0x00b6:
            java.lang.String r5 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ all -> 0x038a }
            r6[r13] = r3     // Catch:{ all -> 0x038a }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x038a }
            r6[r14] = r9     // Catch:{ all -> 0x038a }
            java.util.List r4 = r4.m12036((java.lang.String) r5, (java.lang.String[]) r6)     // Catch:{ all -> 0x038a }
        L_0x00c6:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x038a }
        L_0x00ca:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x038a }
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x038a }
            o.эɪ r5 = (o.C2527) r5     // Catch:{ all -> 0x038a }
            if (r5 == 0) goto L_0x00ca
            boolean r6 = o.C1140.m7582()     // Catch:{ all -> 0x038a }
            java.lang.String r9 = "User property timed out"
            if (r6 == 0) goto L_0x0114
            o.ѵı r6 = r1.f9711     // Catch:{ all -> 0x038a }
            o.ьɹ r6 = r6.m14090()     // Catch:{ all -> 0x038a }
            java.lang.String r10 = r2.f10610     // Catch:{ all -> 0x038a }
            o.ιͱ<java.lang.Boolean> r15 = o.C2529.f11567     // Catch:{ all -> 0x038a }
            boolean r6 = r6.m13384(r10, r15)     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x0114
            o.ѵı r6 = r1.f9711     // Catch:{ all -> 0x038a }
            o.Іɛ r6 = r6.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r6 = r6.m11713()     // Catch:{ all -> 0x038a }
            java.lang.String r10 = r5.f11486     // Catch:{ all -> 0x038a }
            o.ѵı r15 = r1.f9711     // Catch:{ all -> 0x038a }
            o.κІ r15 = r15.m14115()     // Catch:{ all -> 0x038a }
            o.πı r14 = r5.f11482     // Catch:{ all -> 0x038a }
            java.lang.String r14 = r14.f10236     // Catch:{ all -> 0x038a }
            java.lang.String r14 = r15.m11222((java.lang.String) r14)     // Catch:{ all -> 0x038a }
            o.πı r15 = r5.f11482     // Catch:{ all -> 0x038a }
            java.lang.Object r15 = r15.m11268()     // Catch:{ all -> 0x038a }
            r6.m11604(r9, r10, r14, r15)     // Catch:{ all -> 0x038a }
            goto L_0x0137
        L_0x0114:
            o.ѵı r6 = r1.f9711     // Catch:{ all -> 0x038a }
            o.Іɛ r6 = r6.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r6 = r6.m11711()     // Catch:{ all -> 0x038a }
            java.lang.String r10 = r5.f11486     // Catch:{ all -> 0x038a }
            o.ѵı r14 = r1.f9711     // Catch:{ all -> 0x038a }
            o.κІ r14 = r14.m14115()     // Catch:{ all -> 0x038a }
            o.πı r15 = r5.f11482     // Catch:{ all -> 0x038a }
            java.lang.String r15 = r15.f10236     // Catch:{ all -> 0x038a }
            java.lang.String r14 = r14.m11222((java.lang.String) r15)     // Catch:{ all -> 0x038a }
            o.πı r15 = r5.f11482     // Catch:{ all -> 0x038a }
            java.lang.Object r15 = r15.m11268()     // Catch:{ all -> 0x038a }
            r6.m11604(r9, r10, r14, r15)     // Catch:{ all -> 0x038a }
        L_0x0137:
            o.кǃ r6 = r5.f11489     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x0145
            o.кǃ r6 = new o.кǃ     // Catch:{ all -> 0x038a }
            o.кǃ r9 = r5.f11489     // Catch:{ all -> 0x038a }
            r6.<init>(r9, r11)     // Catch:{ all -> 0x038a }
            r1.m10466((o.C2441) r6, (o.C2270) r2)     // Catch:{ all -> 0x038a }
        L_0x0145:
            o.Іє r6 = r19.m10502()     // Catch:{ all -> 0x038a }
            o.πı r5 = r5.f11482     // Catch:{ all -> 0x038a }
            java.lang.String r5 = r5.f10236     // Catch:{ all -> 0x038a }
            r6.m12015((java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x038a }
            r14 = 1
            goto L_0x00ca
        L_0x0153:
            o.Іє r4 = r19.m10502()     // Catch:{ all -> 0x038a }
            o.C2745.C2746.m14562((java.lang.String) r3)     // Catch:{ all -> 0x038a }
            r4.y_()     // Catch:{ all -> 0x038a }
            r4.m10931()     // Catch:{ all -> 0x038a }
            if (r8 >= 0) goto L_0x017c
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r4 = r4.A_()     // Catch:{ all -> 0x038a }
            java.lang.String r5 = "Invalid time querying expired conditional properties"
            java.lang.Object r6 = o.C2244.m11698(r3)     // Catch:{ all -> 0x038a }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x038a }
            r4.m11605(r5, r6, r9)     // Catch:{ all -> 0x038a }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x038a }
            goto L_0x018d
        L_0x017c:
            java.lang.String r5 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ all -> 0x038a }
            r6[r13] = r3     // Catch:{ all -> 0x038a }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x038a }
            r10 = 1
            r6[r10] = r9     // Catch:{ all -> 0x038a }
            java.util.List r4 = r4.m12036((java.lang.String) r5, (java.lang.String[]) r6)     // Catch:{ all -> 0x038a }
        L_0x018d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x038a }
            int r6 = r4.size()     // Catch:{ all -> 0x038a }
            r5.<init>(r6)     // Catch:{ all -> 0x038a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x038a }
        L_0x019a:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x0229
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x038a }
            o.эɪ r6 = (o.C2527) r6     // Catch:{ all -> 0x038a }
            if (r6 == 0) goto L_0x019a
            boolean r9 = o.C1140.m7582()     // Catch:{ all -> 0x038a }
            java.lang.String r10 = "User property expired"
            if (r9 == 0) goto L_0x01e4
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x038a }
            o.ьɹ r9 = r9.m14090()     // Catch:{ all -> 0x038a }
            java.lang.String r14 = r2.f10610     // Catch:{ all -> 0x038a }
            o.ιͱ<java.lang.Boolean> r15 = o.C2529.f11567     // Catch:{ all -> 0x038a }
            boolean r9 = r9.m13384(r14, r15)     // Catch:{ all -> 0x038a }
            if (r9 == 0) goto L_0x01e4
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x038a }
            o.Іɛ r9 = r9.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r9 = r9.m11713()     // Catch:{ all -> 0x038a }
            java.lang.String r14 = r6.f11486     // Catch:{ all -> 0x038a }
            o.ѵı r15 = r1.f9711     // Catch:{ all -> 0x038a }
            o.κІ r15 = r15.m14115()     // Catch:{ all -> 0x038a }
            o.πı r7 = r6.f11482     // Catch:{ all -> 0x038a }
            java.lang.String r7 = r7.f10236     // Catch:{ all -> 0x038a }
            java.lang.String r7 = r15.m11222((java.lang.String) r7)     // Catch:{ all -> 0x038a }
            o.πı r15 = r6.f11482     // Catch:{ all -> 0x038a }
            java.lang.Object r15 = r15.m11268()     // Catch:{ all -> 0x038a }
            r9.m11604(r10, r14, r7, r15)     // Catch:{ all -> 0x038a }
            goto L_0x0207
        L_0x01e4:
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x038a }
            o.Іɛ r7 = r7.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r7 = r7.m11711()     // Catch:{ all -> 0x038a }
            java.lang.String r9 = r6.f11486     // Catch:{ all -> 0x038a }
            o.ѵı r14 = r1.f9711     // Catch:{ all -> 0x038a }
            o.κІ r14 = r14.m14115()     // Catch:{ all -> 0x038a }
            o.πı r15 = r6.f11482     // Catch:{ all -> 0x038a }
            java.lang.String r15 = r15.f10236     // Catch:{ all -> 0x038a }
            java.lang.String r14 = r14.m11222((java.lang.String) r15)     // Catch:{ all -> 0x038a }
            o.πı r15 = r6.f11482     // Catch:{ all -> 0x038a }
            java.lang.Object r15 = r15.m11268()     // Catch:{ all -> 0x038a }
            r7.m11604(r10, r9, r14, r15)     // Catch:{ all -> 0x038a }
        L_0x0207:
            o.Іє r7 = r19.m10502()     // Catch:{ all -> 0x038a }
            o.πı r9 = r6.f11482     // Catch:{ all -> 0x038a }
            java.lang.String r9 = r9.f10236     // Catch:{ all -> 0x038a }
            r7.m12046(r3, r9)     // Catch:{ all -> 0x038a }
            o.кǃ r7 = r6.f11483     // Catch:{ all -> 0x038a }
            if (r7 == 0) goto L_0x021b
            o.кǃ r7 = r6.f11483     // Catch:{ all -> 0x038a }
            r5.add(r7)     // Catch:{ all -> 0x038a }
        L_0x021b:
            o.Іє r7 = r19.m10502()     // Catch:{ all -> 0x038a }
            o.πı r6 = r6.f11482     // Catch:{ all -> 0x038a }
            java.lang.String r6 = r6.f10236     // Catch:{ all -> 0x038a }
            r7.m12015((java.lang.String) r3, (java.lang.String) r6)     // Catch:{ all -> 0x038a }
            r7 = 2
            goto L_0x019a
        L_0x0229:
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x038a }
            int r4 = r5.size()     // Catch:{ all -> 0x038a }
            r6 = 0
        L_0x0230:
            if (r6 >= r4) goto L_0x0243
            java.lang.Object r7 = r5.get(r6)     // Catch:{ all -> 0x038a }
            int r6 = r6 + 1
            o.кǃ r7 = (o.C2441) r7     // Catch:{ all -> 0x038a }
            o.кǃ r9 = new o.кǃ     // Catch:{ all -> 0x038a }
            r9.<init>(r7, r11)     // Catch:{ all -> 0x038a }
            r1.m10466((o.C2441) r9, (o.C2270) r2)     // Catch:{ all -> 0x038a }
            goto L_0x0230
        L_0x0243:
            o.Іє r4 = r19.m10502()     // Catch:{ all -> 0x038a }
            java.lang.String r5 = r0.f11089     // Catch:{ all -> 0x038a }
            o.C2745.C2746.m14562((java.lang.String) r3)     // Catch:{ all -> 0x038a }
            o.C2745.C2746.m14562((java.lang.String) r5)     // Catch:{ all -> 0x038a }
            r4.y_()     // Catch:{ all -> 0x038a }
            r4.m10931()     // Catch:{ all -> 0x038a }
            if (r8 >= 0) goto L_0x0279
            o.Іɛ r6 = r4.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r6 = r6.A_()     // Catch:{ all -> 0x038a }
            java.lang.String r7 = "Invalid time querying triggered conditional properties"
            java.lang.Object r3 = o.C2244.m11698(r3)     // Catch:{ all -> 0x038a }
            o.κІ r4 = r4.v_()     // Catch:{ all -> 0x038a }
            java.lang.String r4 = r4.m11216((java.lang.String) r5)     // Catch:{ all -> 0x038a }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x038a }
            r6.m11604(r7, r3, r4, r5)     // Catch:{ all -> 0x038a }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x038a }
            goto L_0x028e
        L_0x0279:
            java.lang.String r6 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x038a }
            r7[r13] = r3     // Catch:{ all -> 0x038a }
            r3 = 1
            r7[r3] = r5     // Catch:{ all -> 0x038a }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x038a }
            r5 = 2
            r7[r5] = r3     // Catch:{ all -> 0x038a }
            java.util.List r3 = r4.m12036((java.lang.String) r6, (java.lang.String[]) r7)     // Catch:{ all -> 0x038a }
        L_0x028e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x038a }
            int r4 = r3.size()     // Catch:{ all -> 0x038a }
            r14.<init>(r4)     // Catch:{ all -> 0x038a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x038a }
        L_0x029b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x038a }
            if (r4 == 0) goto L_0x035e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x038a }
            r15 = r4
            o.эɪ r15 = (o.C2527) r15     // Catch:{ all -> 0x038a }
            if (r15 == 0) goto L_0x029b
            o.πı r4 = r15.f11482     // Catch:{ all -> 0x038a }
            o.ϜІ r10 = new o.ϜІ     // Catch:{ all -> 0x038a }
            java.lang.String r5 = r15.f11486     // Catch:{ all -> 0x038a }
            java.lang.String r6 = r15.f11485     // Catch:{ all -> 0x038a }
            java.lang.String r7 = r4.f10236     // Catch:{ all -> 0x038a }
            java.lang.Object r16 = r4.m11268()     // Catch:{ all -> 0x038a }
            r4 = r10
            r8 = r11
            r13 = r10
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x038a }
            o.Іє r4 = r19.m10502()     // Catch:{ all -> 0x038a }
            boolean r4 = r4.m12021((o.C2152) r13)     // Catch:{ all -> 0x038a }
            if (r4 == 0) goto L_0x031e
            boolean r4 = o.C1140.m7582()     // Catch:{ all -> 0x038a }
            java.lang.String r5 = "User property triggered"
            if (r4 == 0) goto L_0x0300
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x038a }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x038a }
            java.lang.String r6 = r2.f10610     // Catch:{ all -> 0x038a }
            o.ιͱ<java.lang.Boolean> r7 = o.C2529.f11567     // Catch:{ all -> 0x038a }
            boolean r4 = r4.m13384(r6, r7)     // Catch:{ all -> 0x038a }
            if (r4 == 0) goto L_0x0300
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x038a }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r4 = r4.m11713()     // Catch:{ all -> 0x038a }
            java.lang.String r6 = r15.f11486     // Catch:{ all -> 0x038a }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x038a }
            o.κІ r7 = r7.m14115()     // Catch:{ all -> 0x038a }
            java.lang.String r8 = r13.f10313     // Catch:{ all -> 0x038a }
            java.lang.String r7 = r7.m11222((java.lang.String) r8)     // Catch:{ all -> 0x038a }
            java.lang.Object r8 = r13.f10314     // Catch:{ all -> 0x038a }
            r4.m11604(r5, r6, r7, r8)     // Catch:{ all -> 0x038a }
            goto L_0x0341
        L_0x0300:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x038a }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r4 = r4.m11711()     // Catch:{ all -> 0x038a }
            java.lang.String r6 = r15.f11486     // Catch:{ all -> 0x038a }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x038a }
            o.κІ r7 = r7.m14115()     // Catch:{ all -> 0x038a }
            java.lang.String r8 = r13.f10313     // Catch:{ all -> 0x038a }
            java.lang.String r7 = r7.m11222((java.lang.String) r8)     // Catch:{ all -> 0x038a }
            java.lang.Object r8 = r13.f10314     // Catch:{ all -> 0x038a }
            r4.m11604(r5, r6, r7, r8)     // Catch:{ all -> 0x038a }
            goto L_0x0341
        L_0x031e:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x038a }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x038a }
            o.ϵı r4 = r4.m11714()     // Catch:{ all -> 0x038a }
            java.lang.String r5 = "Too many active user properties, ignoring"
            java.lang.String r6 = r15.f11486     // Catch:{ all -> 0x038a }
            java.lang.Object r6 = o.C2244.m11698(r6)     // Catch:{ all -> 0x038a }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x038a }
            o.κІ r7 = r7.m14115()     // Catch:{ all -> 0x038a }
            java.lang.String r8 = r13.f10313     // Catch:{ all -> 0x038a }
            java.lang.String r7 = r7.m11222((java.lang.String) r8)     // Catch:{ all -> 0x038a }
            java.lang.Object r8 = r13.f10314     // Catch:{ all -> 0x038a }
            r4.m11604(r5, r6, r7, r8)     // Catch:{ all -> 0x038a }
        L_0x0341:
            o.кǃ r4 = r15.f11487     // Catch:{ all -> 0x038a }
            if (r4 == 0) goto L_0x034a
            o.кǃ r4 = r15.f11487     // Catch:{ all -> 0x038a }
            r14.add(r4)     // Catch:{ all -> 0x038a }
        L_0x034a:
            o.πı r4 = new o.πı     // Catch:{ all -> 0x038a }
            r4.<init>(r13)     // Catch:{ all -> 0x038a }
            r15.f11482 = r4     // Catch:{ all -> 0x038a }
            r4 = 1
            r15.f11481 = r4     // Catch:{ all -> 0x038a }
            o.Іє r5 = r19.m10502()     // Catch:{ all -> 0x038a }
            r5.m12052((o.C2527) r15)     // Catch:{ all -> 0x038a }
            r13 = 0
            goto L_0x029b
        L_0x035e:
            r1.m10466((o.C2441) r0, (o.C2270) r2)     // Catch:{ all -> 0x038a }
            java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ all -> 0x038a }
            int r0 = r14.size()     // Catch:{ all -> 0x038a }
            r3 = 0
        L_0x0368:
            if (r3 >= r0) goto L_0x037b
            java.lang.Object r4 = r14.get(r3)     // Catch:{ all -> 0x038a }
            int r3 = r3 + 1
            o.кǃ r4 = (o.C2441) r4     // Catch:{ all -> 0x038a }
            o.кǃ r5 = new o.кǃ     // Catch:{ all -> 0x038a }
            r5.<init>(r4, r11)     // Catch:{ all -> 0x038a }
            r1.m10466((o.C2441) r5, (o.C2270) r2)     // Catch:{ all -> 0x038a }
            goto L_0x0368
        L_0x037b:
            o.Іє r0 = r19.m10502()     // Catch:{ all -> 0x038a }
            r0.m12030()     // Catch:{ all -> 0x038a }
            o.Іє r0 = r19.m10502()
            r0.m12018()
            return
        L_0x038a:
            r0 = move-exception
            o.Іє r2 = r19.m10502()
            r2.m12018()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10517(o.кǃ, o.Іʭ):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02b1 A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02e9 A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x031f A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x032e A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0362 A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0909 A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014f A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0157 A[Catch:{ SQLiteException -> 0x027a, all -> 0x0994 }] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10466(o.C2441 r26, o.C2270 r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r27
            java.lang.String r4 = "_s"
            o.C2745.C2746.m14555(r27)
            java.lang.String r5 = r3.f10610
            o.C2745.C2746.m14562((java.lang.String) r5)
            long r5 = java.lang.System.nanoTime()
            r25.m10469()
            r25.m10508()
            java.lang.String r15 = r3.f10610
            o.ιս r7 = r25.m10496()
            boolean r7 = r7.m11108((o.C2441) r2, (o.C2270) r3)
            if (r7 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r7 = r3.f10625
            if (r7 != 0) goto L_0x002f
            r1.m10491((o.C2270) r3)
            return
        L_0x002f:
            o.іʄ r7 = r25.m10514()
            java.lang.String r8 = r2.f11089
            boolean r7 = r7.m13751((java.lang.String) r15, (java.lang.String) r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00da
            o.ѵı r3 = r1.f9711
            o.Іɛ r3 = r3.t_()
            o.ϵı r3 = r3.A_()
            java.lang.Object r4 = o.C2244.m11698(r15)
            o.ѵı r5 = r1.f9711
            o.κІ r5 = r5.m14115()
            java.lang.String r6 = r2.f11089
            java.lang.String r5 = r5.m11216((java.lang.String) r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.m11605(r6, r4, r5)
            o.іʄ r3 = r25.m10514()
            boolean r3 = r3.m13761(r15)
            if (r3 != 0) goto L_0x0074
            o.іʄ r3 = r25.m10514()
            boolean r3 = r3.m13754(r15)
            if (r3 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r3 = 0
            goto L_0x0075
        L_0x0074:
            r3 = 1
        L_0x0075:
            if (r3 != 0) goto L_0x0090
            java.lang.String r4 = r2.f11089
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0090
            o.ѵı r4 = r1.f9711
            o.ϜΙ r7 = r4.m14116()
            r9 = 11
            java.lang.String r11 = r2.f11089
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.m11382((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
        L_0x0090:
            if (r3 == 0) goto L_0x00d9
            o.Іє r2 = r25.m10502()
            o.пı r2 = r2.m12038((java.lang.String) r15)
            if (r2 == 0) goto L_0x00d9
            long r3 = r2.m12607()
            long r5 = r2.m12634()
            long r3 = java.lang.Math.max(r3, r5)
            o.ѵı r5 = r1.f9711
            o.ιͽ r5 = r5.w_()
            long r5 = r5.m10846()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            o.ιͱ<java.lang.Long> r5 = o.C2529.f11528
            java.lang.Object r5 = r5.m10833(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d9
            o.ѵı r3 = r1.f9711
            o.Іɛ r3 = r3.t_()
            o.ϵı r3 = r3.m11711()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.m11606(r4)
            r1.m10487((o.C2457) r2)
        L_0x00d9:
            return
        L_0x00da:
            o.ѵı r7 = r1.f9711
            o.Іɛ r7 = r7.t_()
            r10 = 2
            boolean r7 = r7.m11721((int) r10)
            if (r7 == 0) goto L_0x0100
            o.ѵı r7 = r1.f9711
            o.Іɛ r7 = r7.t_()
            o.ϵı r7 = r7.m11713()
            o.ѵı r8 = r1.f9711
            o.κІ r8 = r8.m14115()
            java.lang.String r8 = r8.m11217((o.C2441) r2)
            java.lang.String r9 = "Logging event"
            r7.m11603(r9, r8)
        L_0x0100:
            o.Іє r7 = r25.m10502()
            r7.m12045()
            r1.m10491((o.C2270) r3)     // Catch:{ all -> 0x0994 }
            boolean r7 = o.C0369.m4560()     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0120
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r8 = o.C2529.f11584     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m13372((o.C2019<java.lang.Boolean>) r8)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0120
            r7 = 1
            goto L_0x0121
        L_0x0120:
            r7 = 0
        L_0x0121:
            java.lang.String r8 = "ecommerce_purchase"
            java.lang.String r9 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = "refund"
            if (r8 != 0) goto L_0x0144
            if (r7 == 0) goto L_0x0142
            java.lang.String r7 = "purchase"
            java.lang.String r8 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x0144
            java.lang.String r7 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r7 = 0
            goto L_0x0145
        L_0x0144:
            r7 = 1
        L_0x0145:
            java.lang.String r8 = "_iap"
            java.lang.String r10 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r8 = r8.equals(r10)     // Catch:{ all -> 0x0994 }
            if (r8 != 0) goto L_0x0154
            if (r7 == 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r8 = 0
            goto L_0x0155
        L_0x0154:
            r8 = 1
        L_0x0155:
            if (r8 == 0) goto L_0x02f8
            o.зι r8 = r2.f11090     // Catch:{ all -> 0x0994 }
            java.lang.String r10 = "currency"
            java.lang.String r8 = r8.m12528(r10)     // Catch:{ all -> 0x0994 }
            java.lang.String r10 = "value"
            if (r7 == 0) goto L_0x01d3
            o.зι r7 = r2.f11090     // Catch:{ all -> 0x0994 }
            java.lang.Double r7 = r7.m12529(r10)     // Catch:{ all -> 0x0994 }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x0994 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x0187
            o.зι r7 = r2.f11090     // Catch:{ all -> 0x0994 }
            java.lang.Long r7 = r7.m12530(r10)     // Catch:{ all -> 0x0994 }
            long r11 = r7.longValue()     // Catch:{ all -> 0x0994 }
            double r10 = (double) r11     // Catch:{ all -> 0x0994 }
            double r17 = r10 * r19
        L_0x0187:
            r10 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x01b5
            r10 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x01b5
            long r10 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0994 }
            boolean r7 = o.C0369.m4560()     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x01dd
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r12 = o.C2529.f11584     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m13372((o.C2019<java.lang.Boolean>) r12)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x01dd
            java.lang.String r7 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x01dd
            long r10 = -r10
            goto L_0x01dd
        L_0x01b5:
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r7 = r7.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r7 = r7.A_()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = o.C2244.m11698(r15)     // Catch:{ all -> 0x0994 }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0994 }
            r7.m11605(r8, r9, r10)     // Catch:{ all -> 0x0994 }
            r23 = r5
            r6 = 0
            r21 = 0
            goto L_0x02e7
        L_0x01d3:
            o.зι r7 = r2.f11090     // Catch:{ all -> 0x0994 }
            java.lang.Long r7 = r7.m12530(r10)     // Catch:{ all -> 0x0994 }
            long r10 = r7.longValue()     // Catch:{ all -> 0x0994 }
        L_0x01dd:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x02e2
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = r8.toUpperCase(r7)     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "[A-Z]{3}"
            boolean r8 = r7.matches(r8)     // Catch:{ all -> 0x0994 }
            if (r8 == 0) goto L_0x02e2
            java.lang.String r8 = "_ltv_"
            int r9 = r7.length()     // Catch:{ all -> 0x0994 }
            if (r9 == 0) goto L_0x01fe
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x0994 }
            goto L_0x0203
        L_0x01fe:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0994 }
            r7.<init>(r8)     // Catch:{ all -> 0x0994 }
        L_0x0203:
            r12 = r7
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            o.ϜІ r7 = r7.m12029((java.lang.String) r15, (java.lang.String) r12)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0241
            java.lang.Object r8 = r7.f10314     // Catch:{ all -> 0x0994 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0994 }
            if (r8 != 0) goto L_0x0215
            goto L_0x0241
        L_0x0215:
            java.lang.Object r7 = r7.f10314     // Catch:{ all -> 0x0994 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0994 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0994 }
            o.ϜІ r17 = new o.ϜІ     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = r2.f11088     // Catch:{ all -> 0x0994 }
            o.ѵı r13 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ιͽ r13 = r13.w_()     // Catch:{ all -> 0x0994 }
            long r19 = r13.m10846()     // Catch:{ all -> 0x0994 }
            long r7 = r7 + r10
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0994 }
            r7 = r17
            r8 = r15
            r11 = 2
            r10 = r12
            r23 = r5
            r5 = 1
            r6 = 0
            r11 = r19
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0994 }
            r5 = r17
            goto L_0x02a7
        L_0x0241:
            r23 = r5
            r5 = 1
            r6 = 0
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r8 = r8.m14090()     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Integer> r9 = o.C2529.f11529     // Catch:{ all -> 0x0994 }
            int r8 = r8.m13387(r15, r9)     // Catch:{ all -> 0x0994 }
            int r8 = r8 - r5
            o.C2745.C2746.m14562((java.lang.String) r15)     // Catch:{ all -> 0x0994 }
            r7.y_()     // Catch:{ all -> 0x0994 }
            r7.m10931()     // Catch:{ all -> 0x0994 }
            android.database.sqlite.SQLiteDatabase r9 = r7.m12047()     // Catch:{ SQLiteException -> 0x027a }
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x027a }
            r5[r6] = r15     // Catch:{ SQLiteException -> 0x027a }
            r16 = 1
            r5[r16] = r15     // Catch:{ SQLiteException -> 0x027a }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x027a }
            r16 = 2
            r5[r16] = r8     // Catch:{ SQLiteException -> 0x027a }
            r9.execSQL(r13, r5)     // Catch:{ SQLiteException -> 0x027a }
            goto L_0x028d
        L_0x027a:
            r0 = move-exception
            r5 = r0
            o.Іɛ r7 = r7.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r7 = r7.m11714()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = o.C2244.m11698(r15)     // Catch:{ all -> 0x0994 }
            r7.m11605(r8, r9, r5)     // Catch:{ all -> 0x0994 }
        L_0x028d:
            o.ϜІ r5 = new o.ϜІ     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = r2.f11088     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ιͽ r7 = r7.w_()     // Catch:{ all -> 0x0994 }
            long r16 = r7.m10846()     // Catch:{ all -> 0x0994 }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0994 }
            r7 = r5
            r8 = r15
            r10 = r12
            r11 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0994 }
        L_0x02a7:
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m12021((o.C2152) r5)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x02e5
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r7 = r7.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r7 = r7.m11714()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = o.C2244.m11698(r15)     // Catch:{ all -> 0x0994 }
            o.ѵı r10 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.κІ r10 = r10.m14115()     // Catch:{ all -> 0x0994 }
            java.lang.String r11 = r5.f10313     // Catch:{ all -> 0x0994 }
            java.lang.String r10 = r10.m11222((java.lang.String) r11)     // Catch:{ all -> 0x0994 }
            java.lang.Object r5 = r5.f10314     // Catch:{ all -> 0x0994 }
            r7.m11604(r8, r9, r10, r5)     // Catch:{ all -> 0x0994 }
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r7 = r5.m14116()     // Catch:{ all -> 0x0994 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.m11382((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0994 }
            goto L_0x02e5
        L_0x02e2:
            r23 = r5
            r6 = 0
        L_0x02e5:
            r21 = 1
        L_0x02e7:
            if (r21 != 0) goto L_0x02fb
            o.Іє r2 = r25.m10502()     // Catch:{ all -> 0x0994 }
            r2.m12030()     // Catch:{ all -> 0x0994 }
            o.Іє r2 = r25.m10502()
            r2.m12018()
            return
        L_0x02f8:
            r23 = r5
            r6 = 0
        L_0x02fb:
            java.lang.String r5 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r5 = o.C2151.m11345((java.lang.String) r5)     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x0994 }
            boolean r7 = o.C0369.m4560()     // Catch:{ all -> 0x0994 }
            r19 = 1
            if (r7 == 0) goto L_0x032e
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r9 = o.C2529.f11583     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m13384(r8, r9)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x032e
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            r7.m14116()     // Catch:{ all -> 0x0994 }
            o.зι r7 = r2.f11090     // Catch:{ all -> 0x0994 }
            long r7 = o.C2151.m11336((o.C2433) r7)     // Catch:{ all -> 0x0994 }
            long r7 = r7 + r19
            r11 = r7
            goto L_0x0330
        L_0x032e:
            r11 = r19
        L_0x0330:
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            long r8 = r25.m10480()     // Catch:{ all -> 0x0994 }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r5
            r21 = r15
            r15 = r16
            r16 = r18
            o.Іэ r7 = r7.m12044(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0994 }
            long r8 = r7.f10718     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Integer> r10 = o.C2529.f11510     // Catch:{ all -> 0x0994 }
            r14 = 0
            java.lang.Object r10 = r10.m10833(r14)     // Catch:{ all -> 0x0994 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0994 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0994 }
            long r10 = (long) r10     // Catch:{ all -> 0x0994 }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x038f
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0380
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r2 = r2.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x0994 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = o.C2244.m11698(r21)     // Catch:{ all -> 0x0994 }
            long r5 = r7.f10718     // Catch:{ all -> 0x0994 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0994 }
            r2.m11605(r3, r4, r5)     // Catch:{ all -> 0x0994 }
        L_0x0380:
            o.Іє r2 = r25.m10502()     // Catch:{ all -> 0x0994 }
            r2.m12030()     // Catch:{ all -> 0x0994 }
            o.Іє r2 = r25.m10502()
            r2.m12018()
            return
        L_0x038f:
            if (r5 == 0) goto L_0x03e4
            long r8 = r7.f10717     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Integer> r15 = o.C2529.f11538     // Catch:{ all -> 0x0994 }
            java.lang.Object r15 = r15.m10833(r14)     // Catch:{ all -> 0x0994 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x0994 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x0994 }
            long r14 = (long) r15     // Catch:{ all -> 0x0994 }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x03e4
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x03c3
            o.ѵı r3 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r3 = r3.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r3 = r3.m11714()     // Catch:{ all -> 0x0994 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = o.C2244.m11698(r21)     // Catch:{ all -> 0x0994 }
            long r6 = r7.f10717     // Catch:{ all -> 0x0994 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0994 }
            r3.m11605(r4, r5, r6)     // Catch:{ all -> 0x0994 }
        L_0x03c3:
            o.ѵı r3 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r7 = r3.m14116()     // Catch:{ all -> 0x0994 }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f11089     // Catch:{ all -> 0x0994 }
            r12 = 0
            r8 = r21
            r7.m11382((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0994 }
            o.Іє r2 = r25.m10502()     // Catch:{ all -> 0x0994 }
            r2.m12030()     // Catch:{ all -> 0x0994 }
            o.Іє r2 = r25.m10502()
            r2.m12018()
            return
        L_0x03e4:
            if (r18 == 0) goto L_0x0433
            long r8 = r7.f10719     // Catch:{ all -> 0x0994 }
            o.ѵı r10 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r10 = r10.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r11 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Integer> r14 = o.C2529.f11532     // Catch:{ all -> 0x0994 }
            int r10 = r10.m13387(r11, r14)     // Catch:{ all -> 0x0994 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0994 }
            int r10 = java.lang.Math.max(r6, r10)     // Catch:{ all -> 0x0994 }
            long r10 = (long) r10     // Catch:{ all -> 0x0994 }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0433
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0424
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r2 = r2.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x0994 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = o.C2244.m11698(r21)     // Catch:{ all -> 0x0994 }
            long r5 = r7.f10719     // Catch:{ all -> 0x0994 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0994 }
            r2.m11605(r3, r4, r5)     // Catch:{ all -> 0x0994 }
        L_0x0424:
            o.Іє r2 = r25.m10502()     // Catch:{ all -> 0x0994 }
            r2.m12030()     // Catch:{ all -> 0x0994 }
            o.Іє r2 = r25.m10502()
            r2.m12018()
            return
        L_0x0433:
            o.зι r7 = r2.f11090     // Catch:{ all -> 0x0994 }
            android.os.Bundle r14 = r7.m12527()     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r7 = r7.m14116()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f11088     // Catch:{ all -> 0x0994 }
            r7.m11381(r14, r8, r9)     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r7 = r7.m14116()     // Catch:{ all -> 0x0994 }
            r15 = r21
            boolean r7 = r7.m11410(r15)     // Catch:{ all -> 0x0994 }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x0472
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r7 = r7.m14116()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0994 }
            r7.m11381(r14, r8, r9)     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r7 = r7.m14116()     // Catch:{ all -> 0x0994 }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0994 }
            r7.m11381(r14, r11, r8)     // Catch:{ all -> 0x0994 }
        L_0x0472:
            java.lang.String r7 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "_sno"
            if (r7 == 0) goto L_0x04a9
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r10 = o.C2529.f11554     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m13384(r9, r10)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x04a9
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ϜІ r7 = r7.m12029((java.lang.String) r9, (java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x04a9
            java.lang.Object r9 = r7.f10314     // Catch:{ all -> 0x0994 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0994 }
            if (r9 == 0) goto L_0x04a9
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r9 = r9.m14116()     // Catch:{ all -> 0x0994 }
            java.lang.Object r7 = r7.f10314     // Catch:{ all -> 0x0994 }
            r9.m11381(r14, r8, r7)     // Catch:{ all -> 0x0994 }
        L_0x04a9:
            java.lang.String r7 = r2.f11089     // Catch:{ all -> 0x0994 }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0994 }
            if (r4 == 0) goto L_0x04db
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r9 = o.C2529.f11576     // Catch:{ all -> 0x0994 }
            boolean r4 = r4.m13384(r7, r9)     // Catch:{ all -> 0x0994 }
            if (r4 == 0) goto L_0x04db
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r9 = o.C2529.f11554     // Catch:{ all -> 0x0994 }
            boolean r4 = r4.m13384(r7, r9)     // Catch:{ all -> 0x0994 }
            if (r4 != 0) goto L_0x04db
            o.πı r4 = new o.πı     // Catch:{ all -> 0x0994 }
            r10 = 0
            r4.<init>(r8, r12, r10)     // Catch:{ all -> 0x0994 }
            r1.m10494((o.C2113) r4, (o.C2270) r3)     // Catch:{ all -> 0x0994 }
            goto L_0x04dc
        L_0x04db:
            r10 = 0
        L_0x04dc:
            o.Іє r4 = r25.m10502()     // Catch:{ all -> 0x0994 }
            long r7 = r4.m12026(r15)     // Catch:{ all -> 0x0994 }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ff
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r4 = r4.A_()     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r6 = o.C2244.m11698(r15)     // Catch:{ all -> 0x0994 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0994 }
            r4.m11605(r9, r6, r7)     // Catch:{ all -> 0x0994 }
        L_0x04ff:
            o.Э r4 = new o.Э     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = r2.f11088     // Catch:{ all -> 0x0994 }
            java.lang.String r6 = r2.f11089     // Catch:{ all -> 0x0994 }
            long r12 = r2.f11091     // Catch:{ all -> 0x0994 }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r2 = r11
            r11 = r6
            r16 = r14
            r6 = r15
            r26 = 0
            r14 = r18
            r7.<init>((o.C2658) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x0994 }
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r4.f10912     // Catch:{ all -> 0x0994 }
            o.кı r7 = r7.m12050((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x059d
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            long r7 = r7.m12041(r6)     // Catch:{ all -> 0x0994 }
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r9 = r9.m14090()     // Catch:{ all -> 0x0994 }
            int r9 = r9.m13381((java.lang.String) r6)     // Catch:{ all -> 0x0994 }
            long r9 = (long) r9     // Catch:{ all -> 0x0994 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0583
            if (r5 == 0) goto L_0x0583
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r2 = r2.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x0994 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r5 = o.C2244.m11698(r6)     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.κІ r7 = r7.m14115()     // Catch:{ all -> 0x0994 }
            java.lang.String r4 = r4.f10912     // Catch:{ all -> 0x0994 }
            java.lang.String r4 = r7.m11216((java.lang.String) r4)     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            int r7 = r7.m13381((java.lang.String) r6)     // Catch:{ all -> 0x0994 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0994 }
            r2.m11604(r3, r5, r4, r7)     // Catch:{ all -> 0x0994 }
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r7 = r2.m14116()     // Catch:{ all -> 0x0994 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r6
            r7.m11382((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0994 }
            o.Іє r2 = r25.m10502()
            r2.m12018()
            return
        L_0x0583:
            o.кı r5 = new o.кı     // Catch:{ all -> 0x0994 }
            java.lang.String r9 = r4.f10912     // Catch:{ all -> 0x0994 }
            r10 = 0
            r12 = 0
            long r14 = r4.f10910     // Catch:{ all -> 0x0994 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r5
            r8 = r6
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x0994 }
            goto L_0x05ab
        L_0x059d:
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0994 }
            long r8 = r7.f11086     // Catch:{ all -> 0x0994 }
            o.Э r4 = r4.m12377(r5, r8)     // Catch:{ all -> 0x0994 }
            long r5 = r4.f10910     // Catch:{ all -> 0x0994 }
            o.кı r5 = r7.m12554(r5)     // Catch:{ all -> 0x0994 }
        L_0x05ab:
            o.Іє r6 = r25.m10502()     // Catch:{ all -> 0x0994 }
            r6.m12020((o.C2440) r5)     // Catch:{ all -> 0x0994 }
            r25.m10469()     // Catch:{ all -> 0x0994 }
            r25.m10508()     // Catch:{ all -> 0x0994 }
            o.C2745.C2746.m14555(r4)     // Catch:{ all -> 0x0994 }
            o.C2745.C2746.m14555(r27)     // Catch:{ all -> 0x0994 }
            java.lang.String r5 = r4.f10915     // Catch:{ all -> 0x0994 }
            o.C2745.C2746.m14562((java.lang.String) r5)     // Catch:{ all -> 0x0994 }
            java.lang.String r5 = r4.f10915     // Catch:{ all -> 0x0994 }
            java.lang.String r6 = r3.f10610     // Catch:{ all -> 0x0994 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0994 }
            o.C2745.C2746.m14563((boolean) r5)     // Catch:{ all -> 0x0994 }
            o.хɪ$aux$if r5 = o.C2477.aux.m12856()     // Catch:{ all -> 0x0994 }
            r6 = 1
            o.хɪ$aux$if r5 = r5.m12965((int) r6)     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = "android"
            o.хɪ$aux$if r5 = r5.m12990((java.lang.String) r7)     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = r3.f10610     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x05ea
            java.lang.String r7 = r3.f10610     // Catch:{ all -> 0x0994 }
            r5.m13021((java.lang.String) r7)     // Catch:{ all -> 0x0994 }
        L_0x05ea:
            java.lang.String r7 = r3.f10621     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x05f7
            java.lang.String r7 = r3.f10621     // Catch:{ all -> 0x0994 }
            r5.m13012((java.lang.String) r7)     // Catch:{ all -> 0x0994 }
        L_0x05f7:
            java.lang.String r7 = r3.f10613     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x0604
            java.lang.String r7 = r3.f10613     // Catch:{ all -> 0x0994 }
            r5.m13025((java.lang.String) r7)     // Catch:{ all -> 0x0994 }
        L_0x0604:
            long r7 = r3.f10608     // Catch:{ all -> 0x0994 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0613
            long r7 = r3.f10608     // Catch:{ all -> 0x0994 }
            int r8 = (int) r7     // Catch:{ all -> 0x0994 }
            r5.m12996((int) r8)     // Catch:{ all -> 0x0994 }
        L_0x0613:
            long r7 = r3.f10605     // Catch:{ all -> 0x0994 }
            r5.m12997((long) r7)     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = r3.f10620     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x0625
            java.lang.String r7 = r3.f10620     // Catch:{ all -> 0x0994 }
            r5.m13000(r7)     // Catch:{ all -> 0x0994 }
        L_0x0625:
            boolean r7 = o.C1306.m8256()     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0674
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r9 = o.C2529.f11605     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m13384(r8, r9)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0674
            java.lang.String r7 = r5.m12983()     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0652
            java.lang.String r7 = r3.f10609     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x0652
            java.lang.String r7 = r3.f10609     // Catch:{ all -> 0x0994 }
            r5.m13001(r7)     // Catch:{ all -> 0x0994 }
        L_0x0652:
            java.lang.String r7 = r5.m12983()     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x06a7
            java.lang.String r7 = r5.m13026()     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x06a7
            java.lang.String r7 = r3.f10606     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x06a7
            java.lang.String r7 = r3.f10606     // Catch:{ all -> 0x0994 }
            r5.m13027(r7)     // Catch:{ all -> 0x0994 }
            goto L_0x06a7
        L_0x0674:
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r8 = o.C2529.f11553     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m13372((o.C2019<java.lang.Boolean>) r8)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x069a
            java.lang.String r7 = r5.m12983()     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x06a7
            java.lang.String r7 = r3.f10606     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x06a7
            java.lang.String r7 = r3.f10606     // Catch:{ all -> 0x0994 }
            r5.m13027(r7)     // Catch:{ all -> 0x0994 }
            goto L_0x06a7
        L_0x069a:
            java.lang.String r7 = r3.f10606     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x06a7
            java.lang.String r7 = r3.f10606     // Catch:{ all -> 0x0994 }
            r5.m13027(r7)     // Catch:{ all -> 0x0994 }
        L_0x06a7:
            long r7 = r3.f10622     // Catch:{ all -> 0x0994 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x06b4
            long r7 = r3.f10622     // Catch:{ all -> 0x0994 }
            r5.m13020((long) r7)     // Catch:{ all -> 0x0994 }
        L_0x06b4:
            long r7 = r3.f10617     // Catch:{ all -> 0x0994 }
            r5.m12981((long) r7)     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r11 = o.C2529.f11549     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m13384(r8, r11)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x06d6
            o.ιս r7 = r25.m10496()     // Catch:{ all -> 0x0994 }
            java.util.List r7 = r7.m11122()     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x06d6
            r5.m12989((java.lang.Iterable<? extends java.lang.Integer>) r7)     // Catch:{ all -> 0x0994 }
        L_0x06d6:
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іւ r7 = r7.m14107()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10610     // Catch:{ all -> 0x0994 }
            android.util.Pair r7 = r7.m12122((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x0709
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x0994 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x0994 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0994 }
            if (r8 != 0) goto L_0x0709
            boolean r8 = r3.f10614     // Catch:{ all -> 0x0994 }
            if (r8 == 0) goto L_0x076b
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0994 }
            r5.m12998((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            java.lang.Object r8 = r7.second     // Catch:{ all -> 0x0994 }
            if (r8 == 0) goto L_0x076b
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x0994 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0994 }
            r5.m13013((boolean) r7)     // Catch:{ all -> 0x0994 }
            goto L_0x076b
        L_0x0709:
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ЈЈ r7 = r7.m14088()     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            android.content.Context r8 = r8.m14117()     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m12188(r8)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x076b
            boolean r7 = r3.f10623     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x076b
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            android.content.Context r7 = r7.m14117()     // Catch:{ all -> 0x0994 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x074b
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r7 = r7.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r7 = r7.A_()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = "null secure ID. appId"
            java.lang.String r11 = r5.m13015()     // Catch:{ all -> 0x0994 }
            java.lang.Object r11 = o.C2244.m11698(r11)     // Catch:{ all -> 0x0994 }
            r7.m11603(r8, r11)     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = "null"
            goto L_0x0768
        L_0x074b:
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x0994 }
            if (r8 == 0) goto L_0x0768
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r8 = r8.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r8 = r8.A_()     // Catch:{ all -> 0x0994 }
            java.lang.String r11 = "empty secure ID. appId"
            java.lang.String r12 = r5.m13015()     // Catch:{ all -> 0x0994 }
            java.lang.Object r12 = o.C2244.m11698(r12)     // Catch:{ all -> 0x0994 }
            r8.m11603(r11, r12)     // Catch:{ all -> 0x0994 }
        L_0x0768:
            r5.m12984(r7)     // Catch:{ all -> 0x0994 }
        L_0x076b:
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ЈЈ r7 = r7.m14088()     // Catch:{ all -> 0x0994 }
            r7.m15649()     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ all -> 0x0994 }
            o.хɪ$aux$if r7 = r5.m13006((java.lang.String) r7)     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ЈЈ r8 = r8.m14088()     // Catch:{ all -> 0x0994 }
            r8.m15649()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0994 }
            o.хɪ$aux$if r7 = r7.m12967((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ЈЈ r8 = r8.m14088()     // Catch:{ all -> 0x0994 }
            long r11 = r8.m12187()     // Catch:{ all -> 0x0994 }
            int r8 = (int) r11     // Catch:{ all -> 0x0994 }
            o.хɪ$aux$if r7 = r7.m13016((int) r8)     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ЈЈ r8 = r8.m14088()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r8.m12184()     // Catch:{ all -> 0x0994 }
            o.хɪ$aux$if r7 = r7.m12977((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            long r11 = r3.f10626     // Catch:{ all -> 0x0994 }
            r7.m13024((long) r11)     // Catch:{ all -> 0x0994 }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0994 }
            boolean r7 = r7.m14094()     // Catch:{ all -> 0x0994 }
            if (r7 == 0) goto L_0x07c1
            r5.m13015()     // Catch:{ all -> 0x0994 }
            boolean r7 = android.text.TextUtils.isEmpty(r26)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x07c1
            r7 = r26
            r5.m12994((java.lang.String) r7)     // Catch:{ all -> 0x0994 }
        L_0x07c1:
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.пı r7 = r7.m12038((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            if (r7 != 0) goto L_0x0834
            o.пı r7 = new o.пı     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            java.lang.String r11 = r3.f10610     // Catch:{ all -> 0x0994 }
            r7.<init>(r8, r11)     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ϜΙ r8 = r8.m14116()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r8.m11377()     // Catch:{ all -> 0x0994 }
            r7.m12623((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10612     // Catch:{ all -> 0x0994 }
            r7.m12629((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10620     // Catch:{ all -> 0x0994 }
            r7.m12613((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            o.ѵı r8 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іւ r8 = r8.m14107()     // Catch:{ all -> 0x0994 }
            java.lang.String r11 = r3.f10610     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r8.m12124((java.lang.String) r11)     // Catch:{ all -> 0x0994 }
            r7.m12641((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            r7.m12649((long) r9)     // Catch:{ all -> 0x0994 }
            r7.m12611((long) r9)     // Catch:{ all -> 0x0994 }
            r7.m12643((long) r9)     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10613     // Catch:{ all -> 0x0994 }
            r7.m12656((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            long r11 = r3.f10608     // Catch:{ all -> 0x0994 }
            r7.m12640((long) r11)     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10621     // Catch:{ all -> 0x0994 }
            r7.m12650((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            long r11 = r3.f10605     // Catch:{ all -> 0x0994 }
            r7.m12622((long) r11)     // Catch:{ all -> 0x0994 }
            long r11 = r3.f10622     // Catch:{ all -> 0x0994 }
            r7.m12598((long) r11)     // Catch:{ all -> 0x0994 }
            boolean r8 = r3.f10625     // Catch:{ all -> 0x0994 }
            r7.m12642((boolean) r8)     // Catch:{ all -> 0x0994 }
            long r11 = r3.f10626     // Catch:{ all -> 0x0994 }
            r7.m12637(r11)     // Catch:{ all -> 0x0994 }
            long r11 = r3.f10617     // Catch:{ all -> 0x0994 }
            r7.m12655((long) r11)     // Catch:{ all -> 0x0994 }
            o.Іє r8 = r25.m10502()     // Catch:{ all -> 0x0994 }
            r8.m12051((o.C2457) r7)     // Catch:{ all -> 0x0994 }
        L_0x0834:
            java.lang.String r8 = r7.m12621()     // Catch:{ all -> 0x0994 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0994 }
            if (r8 != 0) goto L_0x0845
            java.lang.String r8 = r7.m12621()     // Catch:{ all -> 0x0994 }
            r5.m13018((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
        L_0x0845:
            java.lang.String r8 = r7.m12627()     // Catch:{ all -> 0x0994 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0994 }
            if (r8 != 0) goto L_0x0856
            java.lang.String r7 = r7.m12627()     // Catch:{ all -> 0x0994 }
            r5.m12982((java.lang.String) r7)     // Catch:{ all -> 0x0994 }
        L_0x0856:
            o.Іє r7 = r25.m10502()     // Catch:{ all -> 0x0994 }
            java.lang.String r8 = r3.f10610     // Catch:{ all -> 0x0994 }
            java.util.List r7 = r7.m12017((java.lang.String) r8)     // Catch:{ all -> 0x0994 }
            r8 = 0
        L_0x0861:
            int r11 = r7.size()     // Catch:{ all -> 0x0994 }
            if (r8 >= r11) goto L_0x0898
            o.хɪ$І$If r11 = o.C2477.C2490.m13202()     // Catch:{ all -> 0x0994 }
            java.lang.Object r12 = r7.get(r8)     // Catch:{ all -> 0x0994 }
            o.ϜІ r12 = (o.C2152) r12     // Catch:{ all -> 0x0994 }
            java.lang.String r12 = r12.f10313     // Catch:{ all -> 0x0994 }
            o.хɪ$І$If r11 = r11.m13221(r12)     // Catch:{ all -> 0x0994 }
            java.lang.Object r12 = r7.get(r8)     // Catch:{ all -> 0x0994 }
            o.ϜІ r12 = (o.C2152) r12     // Catch:{ all -> 0x0994 }
            long r12 = r12.f10317     // Catch:{ all -> 0x0994 }
            o.хɪ$І$If r11 = r11.m13227(r12)     // Catch:{ all -> 0x0994 }
            o.ιս r12 = r25.m10496()     // Catch:{ all -> 0x0994 }
            java.lang.Object r13 = r7.get(r8)     // Catch:{ all -> 0x0994 }
            o.ϜІ r13 = (o.C2152) r13     // Catch:{ all -> 0x0994 }
            java.lang.Object r13 = r13.f10314     // Catch:{ all -> 0x0994 }
            r12.m11107((o.C2477.C2490.If) r11, (java.lang.Object) r13)     // Catch:{ all -> 0x0994 }
            r5.m12968((o.C2477.C2490.If) r11)     // Catch:{ all -> 0x0994 }
            int r8 = r8 + 1
            goto L_0x0861
        L_0x0898:
            o.Іє r7 = r25.m10502()     // Catch:{ IOException -> 0x090c }
            o.ʋΙ r8 = r5.m7011()     // Catch:{ IOException -> 0x090c }
            o.ȽІ r8 = (o.C0987) r8     // Catch:{ IOException -> 0x090c }
            o.хɪ$aux r8 = (o.C2477.aux) r8     // Catch:{ IOException -> 0x090c }
            long r7 = r7.m12034((o.C2477.aux) r8)     // Catch:{ IOException -> 0x090c }
            o.Іє r5 = r25.m10502()     // Catch:{ all -> 0x0994 }
            o.зι r11 = r4.f10913     // Catch:{ all -> 0x0994 }
            if (r11 == 0) goto L_0x0902
            o.зι r11 = r4.f10913     // Catch:{ all -> 0x0994 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0994 }
        L_0x08b6:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0994 }
            if (r12 == 0) goto L_0x08c9
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0994 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0994 }
            boolean r12 = r2.equals(r12)     // Catch:{ all -> 0x0994 }
            if (r12 == 0) goto L_0x08b6
            goto L_0x0903
        L_0x08c9:
            o.іʄ r2 = r25.m10514()     // Catch:{ all -> 0x0994 }
            java.lang.String r11 = r4.f10915     // Catch:{ all -> 0x0994 }
            java.lang.String r12 = r4.f10912     // Catch:{ all -> 0x0994 }
            boolean r2 = r2.m13759(r11, r12)     // Catch:{ all -> 0x0994 }
            o.Іє r11 = r25.m10502()     // Catch:{ all -> 0x0994 }
            long r12 = r25.m10480()     // Catch:{ all -> 0x0994 }
            java.lang.String r14 = r4.f10915     // Catch:{ all -> 0x0994 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            o.Іэ r11 = r11.m12037(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0994 }
            if (r2 == 0) goto L_0x0902
            long r11 = r11.f10715     // Catch:{ all -> 0x0994 }
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r2 = r2.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r13 = r4.f10915     // Catch:{ all -> 0x0994 }
            int r2 = r2.m13368((java.lang.String) r13)     // Catch:{ all -> 0x0994 }
            long r13 = (long) r2     // Catch:{ all -> 0x0994 }
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0902
            goto L_0x0903
        L_0x0902:
            r6 = 0
        L_0x0903:
            boolean r2 = r5.m12022((o.C2381) r4, (long) r7, (boolean) r6)     // Catch:{ all -> 0x0994 }
            if (r2 == 0) goto L_0x0925
            r1.f9729 = r9     // Catch:{ all -> 0x0994 }
            goto L_0x0925
        L_0x090c:
            r0 = move-exception
            r2 = r0
            o.ѵı r6 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r6 = r6.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r6 = r6.m11714()     // Catch:{ all -> 0x0994 }
            java.lang.String r7 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r5.m13015()     // Catch:{ all -> 0x0994 }
            java.lang.Object r5 = o.C2244.m11698(r5)     // Catch:{ all -> 0x0994 }
            r6.m11605(r7, r5, r2)     // Catch:{ all -> 0x0994 }
        L_0x0925:
            o.Іє r2 = r25.m10502()     // Catch:{ all -> 0x0994 }
            r2.m12030()     // Catch:{ all -> 0x0994 }
            boolean r2 = o.C1140.m7582()     // Catch:{ all -> 0x0994 }
            if (r2 == 0) goto L_0x0942
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.ьɹ r2 = r2.m14090()     // Catch:{ all -> 0x0994 }
            java.lang.String r3 = r3.f10610     // Catch:{ all -> 0x0994 }
            o.ιͱ<java.lang.Boolean> r5 = o.C2529.f11567     // Catch:{ all -> 0x0994 }
            boolean r2 = r2.m13384(r3, r5)     // Catch:{ all -> 0x0994 }
            if (r2 != 0) goto L_0x0968
        L_0x0942:
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r2 = r2.t_()     // Catch:{ all -> 0x0994 }
            r3 = 2
            boolean r2 = r2.m11721((int) r3)     // Catch:{ all -> 0x0994 }
            if (r2 == 0) goto L_0x0968
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.Іɛ r2 = r2.t_()     // Catch:{ all -> 0x0994 }
            o.ϵı r2 = r2.m11713()     // Catch:{ all -> 0x0994 }
            java.lang.String r3 = "Event recorded"
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0994 }
            o.κІ r5 = r5.m14115()     // Catch:{ all -> 0x0994 }
            java.lang.String r4 = r5.m11220((o.C2381) r4)     // Catch:{ all -> 0x0994 }
            r2.m11603(r3, r4)     // Catch:{ all -> 0x0994 }
        L_0x0968:
            o.Іє r2 = r25.m10502()
            r2.m12018()
            r25.m10479()
            o.ѵı r2 = r1.f9711
            o.Іɛ r2 = r2.t_()
            o.ϵı r2 = r2.m11713()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.m11603(r4, r3)
            return
        L_0x0994:
            r0 = move-exception
            r2 = r0
            o.Іє r3 = r25.m10502()
            r3.m12018()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10466(o.кǃ, o.Іʭ):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:100|101) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r15.f9711.t_().m11714().m11605("Failed to parse upload URL. Not uploading. appId", o.C2244.m11698(r4), r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x02df */
    /* renamed from: ɪ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10506() {
        /*
            r15 = this;
            r15.m10469()
            r15.m10508()
            r0 = 1
            r15.f9709 = r0
            r1 = 0
            o.ѵı r2 = r15.f9711     // Catch:{ all -> 0x031b }
            r2.q_()     // Catch:{ all -> 0x031b }
            o.ѵı r2 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ǀɉ r2 = r2.m14093()     // Catch:{ all -> 0x031b }
            java.lang.Boolean r2 = r2.m6380()     // Catch:{ all -> 0x031b }
            if (r2 != 0) goto L_0x0030
            o.ѵı r0 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іɛ r0 = r0.t_()     // Catch:{ all -> 0x031b }
            o.ϵı r0 = r0.A_()     // Catch:{ all -> 0x031b }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.m11606(r2)     // Catch:{ all -> 0x031b }
            r15.f9709 = r1
            r15.m10478()
            return
        L_0x0030:
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x031b }
            if (r2 == 0) goto L_0x004b
            o.ѵı r0 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іɛ r0 = r0.t_()     // Catch:{ all -> 0x031b }
            o.ϵı r0 = r0.m11714()     // Catch:{ all -> 0x031b }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.m11606(r2)     // Catch:{ all -> 0x031b }
            r15.f9709 = r1
            r15.m10478()
            return
        L_0x004b:
            long r2 = r15.f9729     // Catch:{ all -> 0x031b }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x005c
            r15.m10479()     // Catch:{ all -> 0x031b }
            r15.f9709 = r1
            r15.m10478()
            return
        L_0x005c:
            r15.m10469()     // Catch:{ all -> 0x031b }
            java.util.List<java.lang.Long> r2 = r15.f9713     // Catch:{ all -> 0x031b }
            if (r2 == 0) goto L_0x0065
            r2 = 1
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            if (r2 == 0) goto L_0x007d
            o.ѵı r0 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іɛ r0 = r0.t_()     // Catch:{ all -> 0x031b }
            o.ϵı r0 = r0.m11713()     // Catch:{ all -> 0x031b }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.m11606(r2)     // Catch:{ all -> 0x031b }
            r15.f9709 = r1
            r15.m10478()
            return
        L_0x007d:
            o.Іε r2 = r15.m10511()     // Catch:{ all -> 0x031b }
            boolean r2 = r2.m11949()     // Catch:{ all -> 0x031b }
            if (r2 != 0) goto L_0x009f
            o.ѵı r0 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іɛ r0 = r0.t_()     // Catch:{ all -> 0x031b }
            o.ϵı r0 = r0.m11713()     // Catch:{ all -> 0x031b }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.m11606(r2)     // Catch:{ all -> 0x031b }
            r15.m10479()     // Catch:{ all -> 0x031b }
            r15.f9709 = r1
            r15.m10478()
            return
        L_0x009f:
            o.ѵı r2 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ιͽ r2 = r2.w_()     // Catch:{ all -> 0x031b }
            long r2 = r2.m10846()     // Catch:{ all -> 0x031b }
            boolean r6 = o.C1420.m8638()     // Catch:{ all -> 0x031b }
            r7 = 0
            if (r6 == 0) goto L_0x00bd
            o.ѵı r6 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ьɹ r6 = r6.m14090()     // Catch:{ all -> 0x031b }
            o.ιͱ<java.lang.Integer> r8 = o.C2529.f11557     // Catch:{ all -> 0x031b }
            int r6 = r6.m13387(r7, r8)     // Catch:{ all -> 0x031b }
            goto L_0x00be
        L_0x00bd:
            r6 = 1
        L_0x00be:
            if (r6 <= r0) goto L_0x00d2
            long r8 = o.C2518.m13364()     // Catch:{ all -> 0x031b }
            long r8 = r2 - r8
            r10 = 0
        L_0x00c7:
            if (r10 >= r6) goto L_0x00db
            boolean r11 = r15.m10477((java.lang.String) r7, (long) r8)     // Catch:{ all -> 0x031b }
            if (r11 == 0) goto L_0x00db
            int r10 = r10 + 1
            goto L_0x00c7
        L_0x00d2:
            long r8 = o.C2518.m13364()     // Catch:{ all -> 0x031b }
            long r8 = r2 - r8
            r15.m10477((java.lang.String) r7, (long) r8)     // Catch:{ all -> 0x031b }
        L_0x00db:
            o.ѵı r6 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іւ r6 = r6.m14107()     // Catch:{ all -> 0x031b }
            o.ьΙ r6 = r6.f10789     // Catch:{ all -> 0x031b }
            long r8 = r6.m13399()     // Catch:{ all -> 0x031b }
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0104
            o.ѵı r4 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x031b }
            o.ϵı r4 = r4.m11711()     // Catch:{ all -> 0x031b }
            java.lang.String r5 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r8 = r2 - r8
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x031b }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x031b }
            r4.m11603(r5, r6)     // Catch:{ all -> 0x031b }
        L_0x0104:
            o.Іє r4 = r15.m10502()     // Catch:{ all -> 0x031b }
            java.lang.String r4 = r4.m12054()     // Catch:{ all -> 0x031b }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x031b }
            r8 = -1
            if (r5 != 0) goto L_0x02f3
            long r5 = r15.f9710     // Catch:{ all -> 0x031b }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0124
            o.Іє r5 = r15.m10502()     // Catch:{ all -> 0x031b }
            long r5 = r5.m12033()     // Catch:{ all -> 0x031b }
            r15.f9710 = r5     // Catch:{ all -> 0x031b }
        L_0x0124:
            o.ѵı r5 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ьɹ r5 = r5.m14090()     // Catch:{ all -> 0x031b }
            o.ιͱ<java.lang.Integer> r6 = o.C2529.f11542     // Catch:{ all -> 0x031b }
            int r5 = r5.m13387(r4, r6)     // Catch:{ all -> 0x031b }
            o.ѵı r6 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ьɹ r6 = r6.m14090()     // Catch:{ all -> 0x031b }
            o.ιͱ<java.lang.Integer> r8 = o.C2529.f11582     // Catch:{ all -> 0x031b }
            int r6 = r6.m13387(r4, r8)     // Catch:{ all -> 0x031b }
            int r6 = java.lang.Math.max(r1, r6)     // Catch:{ all -> 0x031b }
            o.Іє r8 = r15.m10502()     // Catch:{ all -> 0x031b }
            java.util.List r5 = r8.m12027((java.lang.String) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x031b }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x031b }
            if (r6 != 0) goto L_0x0315
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x031b }
        L_0x0152:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x031b }
            if (r8 == 0) goto L_0x0171
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x031b }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x031b }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x031b }
            o.хɪ$aux r8 = (o.C2477.aux) r8     // Catch:{ all -> 0x031b }
            java.lang.String r9 = r8.m12933()     // Catch:{ all -> 0x031b }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x031b }
            if (r9 != 0) goto L_0x0152
            java.lang.String r6 = r8.m12933()     // Catch:{ all -> 0x031b }
            goto L_0x0172
        L_0x0171:
            r6 = r7
        L_0x0172:
            if (r6 == 0) goto L_0x01a1
            r8 = 0
        L_0x0175:
            int r9 = r5.size()     // Catch:{ all -> 0x031b }
            if (r8 >= r9) goto L_0x01a1
            java.lang.Object r9 = r5.get(r8)     // Catch:{ all -> 0x031b }
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x031b }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x031b }
            o.хɪ$aux r9 = (o.C2477.aux) r9     // Catch:{ all -> 0x031b }
            java.lang.String r10 = r9.m12933()     // Catch:{ all -> 0x031b }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x031b }
            if (r10 != 0) goto L_0x019e
            java.lang.String r9 = r9.m12933()     // Catch:{ all -> 0x031b }
            boolean r9 = r9.equals(r6)     // Catch:{ all -> 0x031b }
            if (r9 != 0) goto L_0x019e
            java.util.List r5 = r5.subList(r1, r8)     // Catch:{ all -> 0x031b }
            goto L_0x01a1
        L_0x019e:
            int r8 = r8 + 1
            goto L_0x0175
        L_0x01a1:
            o.хɪ$Ι$ǃ r6 = o.C2477.C2487.m13162()     // Catch:{ all -> 0x031b }
            int r8 = r5.size()     // Catch:{ all -> 0x031b }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x031b }
            int r10 = r5.size()     // Catch:{ all -> 0x031b }
            r9.<init>(r10)     // Catch:{ all -> 0x031b }
            o.ѵı r10 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ьɹ r10 = r10.m14090()     // Catch:{ all -> 0x031b }
            boolean r10 = r10.m13386(r4)     // Catch:{ all -> 0x031b }
            r11 = 0
        L_0x01bd:
            if (r11 >= r8) goto L_0x0228
            java.lang.Object r12 = r5.get(r11)     // Catch:{ all -> 0x031b }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x031b }
            java.lang.Object r12 = r12.first     // Catch:{ all -> 0x031b }
            o.хɪ$aux r12 = (o.C2477.aux) r12     // Catch:{ all -> 0x031b }
            o.ȽІ$ǃ r12 = r12.m6992()     // Catch:{ all -> 0x031b }
            o.ȽІ$ǃ r12 = (o.C0987.C0989) r12     // Catch:{ all -> 0x031b }
            o.хɪ$aux$if r12 = (o.C2477.aux.Cif) r12     // Catch:{ all -> 0x031b }
            java.lang.Object r13 = r5.get(r11)     // Catch:{ all -> 0x031b }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x031b }
            java.lang.Object r13 = r13.second     // Catch:{ all -> 0x031b }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x031b }
            r9.add(r13)     // Catch:{ all -> 0x031b }
            o.ѵı r13 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ьɹ r13 = r13.m14090()     // Catch:{ all -> 0x031b }
            long r13 = r13.m13369()     // Catch:{ all -> 0x031b }
            o.хɪ$aux$if r13 = r12.m12971((long) r13)     // Catch:{ all -> 0x031b }
            o.хɪ$aux$if r13 = r13.m12988((long) r2)     // Catch:{ all -> 0x031b }
            o.ѵı r14 = r15.f9711     // Catch:{ all -> 0x031b }
            r14.q_()     // Catch:{ all -> 0x031b }
            r13.m13008((boolean) r1)     // Catch:{ all -> 0x031b }
            if (r10 != 0) goto L_0x01fd
            r12.m12980()     // Catch:{ all -> 0x031b }
        L_0x01fd:
            o.ѵı r13 = r15.f9711     // Catch:{ all -> 0x031b }
            o.ьɹ r13 = r13.m14090()     // Catch:{ all -> 0x031b }
            o.ιͱ<java.lang.Boolean> r14 = o.C2529.f11561     // Catch:{ all -> 0x031b }
            boolean r13 = r13.m13384(r4, r14)     // Catch:{ all -> 0x031b }
            if (r13 == 0) goto L_0x0222
            o.ʋΙ r13 = r12.m7011()     // Catch:{ all -> 0x031b }
            o.ȽІ r13 = (o.C0987) r13     // Catch:{ all -> 0x031b }
            o.хɪ$aux r13 = (o.C2477.aux) r13     // Catch:{ all -> 0x031b }
            byte[] r13 = r13.m4781()     // Catch:{ all -> 0x031b }
            o.ιս r14 = r15.m10496()     // Catch:{ all -> 0x031b }
            long r13 = r14.m11110(r13)     // Catch:{ all -> 0x031b }
            r12.m12993((long) r13)     // Catch:{ all -> 0x031b }
        L_0x0222:
            r6.m13170(r12)     // Catch:{ all -> 0x031b }
            int r11 = r11 + 1
            goto L_0x01bd
        L_0x0228:
            o.ѵı r5 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іɛ r5 = r5.t_()     // Catch:{ all -> 0x031b }
            r10 = 2
            boolean r5 = r5.m11721((int) r10)     // Catch:{ all -> 0x031b }
            if (r5 == 0) goto L_0x0246
            o.ιս r5 = r15.m10496()     // Catch:{ all -> 0x031b }
            o.ʋΙ r10 = r6.m7011()     // Catch:{ all -> 0x031b }
            o.ȽІ r10 = (o.C0987) r10     // Catch:{ all -> 0x031b }
            o.хɪ$Ι r10 = (o.C2477.C2487) r10     // Catch:{ all -> 0x031b }
            java.lang.String r5 = r5.m11121((o.C2477.C2487) r10)     // Catch:{ all -> 0x031b }
            goto L_0x0247
        L_0x0246:
            r5 = r7
        L_0x0247:
            r15.m10496()     // Catch:{ all -> 0x031b }
            o.ʋΙ r10 = r6.m7011()     // Catch:{ all -> 0x031b }
            o.ȽІ r10 = (o.C0987) r10     // Catch:{ all -> 0x031b }
            o.хɪ$Ι r10 = (o.C2477.C2487) r10     // Catch:{ all -> 0x031b }
            byte[] r12 = r10.m4781()     // Catch:{ all -> 0x031b }
            o.ιͱ<java.lang.String> r10 = o.C2529.f11507     // Catch:{ all -> 0x031b }
            java.lang.Object r7 = r10.m10833(r7)     // Catch:{ all -> 0x031b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x031b }
            java.net.URL r11 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02df }
            r11.<init>(r7)     // Catch:{ MalformedURLException -> 0x02df }
            boolean r10 = r9.isEmpty()     // Catch:{ MalformedURLException -> 0x02df }
            if (r10 != 0) goto L_0x026b
            r10 = 1
            goto L_0x026c
        L_0x026b:
            r10 = 0
        L_0x026c:
            o.C2745.C2746.m14563((boolean) r10)     // Catch:{ MalformedURLException -> 0x02df }
            java.util.List<java.lang.Long> r10 = r15.f9713     // Catch:{ MalformedURLException -> 0x02df }
            if (r10 == 0) goto L_0x0283
            o.ѵı r9 = r15.f9711     // Catch:{ MalformedURLException -> 0x02df }
            o.Іɛ r9 = r9.t_()     // Catch:{ MalformedURLException -> 0x02df }
            o.ϵı r9 = r9.m11714()     // Catch:{ MalformedURLException -> 0x02df }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r9.m11606(r10)     // Catch:{ MalformedURLException -> 0x02df }
            goto L_0x028a
        L_0x0283:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02df }
            r10.<init>(r9)     // Catch:{ MalformedURLException -> 0x02df }
            r15.f9713 = r10     // Catch:{ MalformedURLException -> 0x02df }
        L_0x028a:
            o.ѵı r9 = r15.f9711     // Catch:{ MalformedURLException -> 0x02df }
            o.Іւ r9 = r9.m14107()     // Catch:{ MalformedURLException -> 0x02df }
            o.ьΙ r9 = r9.f10770     // Catch:{ MalformedURLException -> 0x02df }
            r9.m13398(r2)     // Catch:{ MalformedURLException -> 0x02df }
            java.lang.String r2 = "?"
            if (r8 <= 0) goto L_0x02a1
            o.хɪ$aux r2 = r6.m13169(r1)     // Catch:{ MalformedURLException -> 0x02df }
            java.lang.String r2 = r2.m12911()     // Catch:{ MalformedURLException -> 0x02df }
        L_0x02a1:
            o.ѵı r3 = r15.f9711     // Catch:{ MalformedURLException -> 0x02df }
            o.Іɛ r3 = r3.t_()     // Catch:{ MalformedURLException -> 0x02df }
            o.ϵı r3 = r3.m11713()     // Catch:{ MalformedURLException -> 0x02df }
            java.lang.String r6 = "Uploading data. app, uncompressed size, data"
            int r8 = r12.length     // Catch:{ MalformedURLException -> 0x02df }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x02df }
            r3.m11604(r6, r2, r8, r5)     // Catch:{ MalformedURLException -> 0x02df }
            r15.f9722 = r0     // Catch:{ MalformedURLException -> 0x02df }
            o.Іε r9 = r15.m10511()     // Catch:{ MalformedURLException -> 0x02df }
            o.ιյ r14 = new o.ιյ     // Catch:{ MalformedURLException -> 0x02df }
            r14.<init>(r15, r4)     // Catch:{ MalformedURLException -> 0x02df }
            r9.y_()     // Catch:{ MalformedURLException -> 0x02df }
            r9.m10931()     // Catch:{ MalformedURLException -> 0x02df }
            o.C2745.C2746.m14555(r11)     // Catch:{ MalformedURLException -> 0x02df }
            o.C2745.C2746.m14555(r12)     // Catch:{ MalformedURLException -> 0x02df }
            o.C2745.C2746.m14555(r14)     // Catch:{ MalformedURLException -> 0x02df }
            o.іƭ r0 = r9.u_()     // Catch:{ MalformedURLException -> 0x02df }
            o.Іь r2 = new o.Іь     // Catch:{ MalformedURLException -> 0x02df }
            r13 = 0
            r8 = r2
            r10 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ MalformedURLException -> 0x02df }
            r0.m13672((java.lang.Runnable) r2)     // Catch:{ MalformedURLException -> 0x02df }
            goto L_0x0315
        L_0x02df:
            o.ѵı r0 = r15.f9711     // Catch:{ all -> 0x031b }
            o.Іɛ r0 = r0.t_()     // Catch:{ all -> 0x031b }
            o.ϵı r0 = r0.m11714()     // Catch:{ all -> 0x031b }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = o.C2244.m11698(r4)     // Catch:{ all -> 0x031b }
            r0.m11605(r2, r3, r7)     // Catch:{ all -> 0x031b }
            goto L_0x0315
        L_0x02f3:
            r15.f9710 = r8     // Catch:{ all -> 0x031b }
            o.Іє r0 = r15.m10502()     // Catch:{ all -> 0x031b }
            long r4 = o.C2518.m13364()     // Catch:{ all -> 0x031b }
            long r2 = r2 - r4
            java.lang.String r0 = r0.m12016((long) r2)     // Catch:{ all -> 0x031b }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x031b }
            if (r2 != 0) goto L_0x0315
            o.Іє r2 = r15.m10502()     // Catch:{ all -> 0x031b }
            o.пı r0 = r2.m12038((java.lang.String) r0)     // Catch:{ all -> 0x031b }
            if (r0 == 0) goto L_0x0315
            r15.m10487((o.C2457) r0)     // Catch:{ all -> 0x031b }
        L_0x0315:
            r15.f9709 = r1
            r15.m10478()
            return
        L_0x031b:
            r0 = move-exception
            r15.f9709 = r1
            r15.m10478()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10506():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r2 = r0;
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x025e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x025f, code lost:
        r6 = r3;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r6 = null;
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (r0v20 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
  PHI: (r3v54 android.database.Cursor) = (r3v49 android.database.Cursor), (r3v49 android.database.Cursor), (r3v49 android.database.Cursor), (r3v57 android.database.Cursor), (r3v57 android.database.Cursor), (r3v57 android.database.Cursor), (r3v57 android.database.Cursor), (r3v1 android.database.Cursor), (r3v1 android.database.Cursor) binds: [B:44:0x00d6, B:49:0x00e1, B:50:?, B:23:0x007b, B:28:0x0086, B:30:0x008a, B:31:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0280 A[SYNTHETIC, Splitter:B:143:0x0280] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0287 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0295 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03d4 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03d6 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03d9 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03da A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x05c7 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06a2 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x07a5 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07bb A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x07d5 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0b9e A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0bb1 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0bb4 A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0bdb A[Catch:{ IOException -> 0x022f, all -> 0x0f97 }] */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x0f7d A[SYNTHETIC, Splitter:B:581:0x0f7d] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0f93 A[SYNTHETIC, Splitter:B:588:0x0f93] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m10477(java.lang.String r64, long r65) {
        /*
            r63 = this;
            r1 = r63
            o.Іє r2 = r63.m10502()
            r2.m12045()
            o.Ψ$ı r2 = new o.Ψ$ı     // Catch:{ all -> 0x0f97 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0f97 }
            o.Іє r4 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            long r5 = r1.f9710     // Catch:{ all -> 0x0f97 }
            o.C2745.C2746.m14555(r2)     // Catch:{ all -> 0x0f97 }
            r4.y_()     // Catch:{ all -> 0x0f97 }
            r4.m10931()     // Catch:{ all -> 0x0f97 }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.m12047()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            if (r13 == 0) goto L_0x0099
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004c
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            java.lang.String r16 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            r14[r11] = r16     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            java.lang.String r16 = java.lang.String.valueOf(r65)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            r14[r12] = r16     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r0 = move-exception
            r2 = r0
            r22 = r3
            goto L_0x0f91
        L_0x0046:
            r0 = move-exception
            r6 = r3
            r7 = r6
        L_0x0049:
            r3 = r0
            goto L_0x026d
        L_0x004c:
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r16 = java.lang.String.valueOf(r65)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r14[r11] = r16     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
        L_0x0054:
            if (r13 == 0) goto L_0x0059
            java.lang.String r13 = "rowid <= ? and "
            goto L_0x005b
        L_0x0059:
            java.lang.String r13 = ""
        L_0x005b:
            int r7 = r13.length()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r3.append(r13)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            android.database.Cursor r3 = r15.rawQuery(r3, r14)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x025e, all -> 0x0040 }
            if (r7 != 0) goto L_0x0086
            r3.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0283
        L_0x0086:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x025e, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0096, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0096, all -> 0x0040 }
            r23 = r3
            r3 = r7
            r7 = r13
            goto L_0x00ec
        L_0x0096:
            r0 = move-exception
            r6 = r3
            goto L_0x0049
        L_0x0099:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00aa
            java.lang.String[] r7 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r13 = 0
            r7[r11] = r13     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r13 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r7[r12] = r13     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r13 = r7
            goto L_0x00af
        L_0x00aa:
            r7 = 0
            java.lang.String[] r13 = new java.lang.String[]{r7}     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
        L_0x00af:
            if (r3 == 0) goto L_0x00b4
            java.lang.String r3 = " and rowid <= ?"
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r3 = ""
        L_0x00b6:
            int r7 = r3.length()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            int r7 = r7 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r14.<init>(r7)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            r14.append(r3)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r3 = " order by rowid limit 1;"
            r14.append(r3)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            java.lang.String r3 = r14.toString()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0263 }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x025e, all -> 0x0040 }
            if (r7 != 0) goto L_0x00e1
            r3.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0283
        L_0x00e1:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x025e, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x025e, all -> 0x0040 }
            r23 = r3
            r7 = r13
            r3 = 0
        L_0x00ec:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r16 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0258, all -> 0x0252 }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0258, all -> 0x0252 }
            r13[r11] = r3     // Catch:{ SQLiteException -> 0x0258, all -> 0x0252 }
            r13[r12] = r7     // Catch:{ SQLiteException -> 0x0258, all -> 0x0252 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r24 = r13
            r13 = r15
            r25 = r15
            r15 = r16
            r16 = r17
            r17 = r24
            android.database.Cursor r15 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0258, all -> 0x0252 }
            boolean r13 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            if (r13 != 0) goto L_0x013a
            o.Іɛ r5 = r4.t_()     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            o.ϵı r5 = r5.m11714()     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = o.C2244.m11698(r3)     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            r5.m11603(r6, r7)     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            r15.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0283
        L_0x012f:
            r0 = move-exception
            r2 = r0
            r22 = r15
            goto L_0x0f91
        L_0x0135:
            r0 = move-exception
            r7 = r3
            r6 = r15
            goto L_0x0049
        L_0x013a:
            byte[] r13 = r15.getBlob(r11)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            o.хɪ$aux$if r14 = o.C2477.aux.m12856()     // Catch:{ IOException -> 0x022f }
            o.ͽɹ r13 = o.C2090.m11100(r14, (byte[]) r13)     // Catch:{ IOException -> 0x022f }
            o.хɪ$aux$if r13 = (o.C2477.aux.Cif) r13     // Catch:{ IOException -> 0x022f }
            o.ʋΙ r13 = r13.m7011()     // Catch:{ IOException -> 0x022f }
            o.ȽІ r13 = (o.C0987) r13     // Catch:{ IOException -> 0x022f }
            o.хɪ$aux r13 = (o.C2477.aux) r13     // Catch:{ IOException -> 0x022f }
            boolean r14 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            if (r14 == 0) goto L_0x0167
            o.Іɛ r14 = r4.t_()     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            o.ϵı r14 = r14.A_()     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            java.lang.String r10 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = o.C2244.m11698(r3)     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            r14.m11603(r10, r12)     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
        L_0x0167:
            r15.close()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            r2.m12370(r13)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0187
            java.lang.String r10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            r13[r11] = r3     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            r12 = 1
            r13[r12] = r7     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            r6 = 2
            r13[r6] = r5     // Catch:{ SQLiteException -> 0x0135, all -> 0x012f }
            r16 = r10
            r17 = r13
            goto L_0x0195
        L_0x0187:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            r6 = 2
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            r10[r11] = r3     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            r6 = 1
            r10[r6] = r7     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            r16 = r5
            r17 = r10
        L_0x0195:
            java.lang.String r14 = "raw_events"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r7 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r10}     // Catch:{ SQLiteException -> 0x024d, all -> 0x0249 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r25
            r6 = r15
            r15 = r5
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0247 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            if (r6 != 0) goto L_0x01cf
            o.Іɛ r6 = r4.t_()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            o.ϵı r6 = r6.A_()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = o.C2244.m11698(r3)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            r6.m11603(r7, r10)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            r5.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0283
        L_0x01cf:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            r10 = 3
            byte[] r12 = r5.getBlob(r10)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            o.хɪ$ı$ı r10 = o.C2477.C2481.m13050()     // Catch:{ IOException -> 0x0206 }
            o.ͽɹ r10 = o.C2090.m11100(r10, (byte[]) r12)     // Catch:{ IOException -> 0x0206 }
            o.хɪ$ı$ı r10 = (o.C2477.C2481.C2482) r10     // Catch:{ IOException -> 0x0206 }
            r12 = 1
            java.lang.String r13 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            o.хɪ$ı$ı r12 = r10.m13089(r13)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            r13 = 2
            long r14 = r5.getLong(r13)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            r12.m13077((long) r14)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            o.ʋΙ r10 = r10.m7011()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            o.ȽІ r10 = (o.C0987) r10     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            o.хɪ$ı r10 = (o.C2477.C2481) r10     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            boolean r6 = r2.m12369(r6, r10)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            if (r6 != 0) goto L_0x0219
            r5.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0283
        L_0x0206:
            r0 = move-exception
            r6 = r0
            o.Іɛ r7 = r4.t_()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            o.ϵı r7 = r7.m11714()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r12 = o.C2244.m11698(r3)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            r7.m11605(r10, r12, r6)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
        L_0x0219:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x022a, all -> 0x0224 }
            if (r6 != 0) goto L_0x01cf
            r5.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0283
        L_0x0224:
            r0 = move-exception
            r2 = r0
            r22 = r5
            goto L_0x0f91
        L_0x022a:
            r0 = move-exception
            r7 = r3
            r6 = r5
            goto L_0x0049
        L_0x022f:
            r0 = move-exception
            r6 = r15
            r5 = r0
            o.Іɛ r7 = r4.t_()     // Catch:{ SQLiteException -> 0x0247 }
            o.ϵı r7 = r7.m11714()     // Catch:{ SQLiteException -> 0x0247 }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r12 = o.C2244.m11698(r3)     // Catch:{ SQLiteException -> 0x0247 }
            r7.m11605(r10, r12, r5)     // Catch:{ SQLiteException -> 0x0247 }
            r6.close()     // Catch:{ all -> 0x0f97 }
            goto L_0x0283
        L_0x0247:
            r0 = move-exception
            goto L_0x024f
        L_0x0249:
            r0 = move-exception
            r6 = r15
            goto L_0x0f8e
        L_0x024d:
            r0 = move-exception
            r6 = r15
        L_0x024f:
            r7 = r3
            goto L_0x0049
        L_0x0252:
            r0 = move-exception
            r2 = r0
            r22 = r23
            goto L_0x0f91
        L_0x0258:
            r0 = move-exception
            r7 = r3
            r6 = r23
            goto L_0x0049
        L_0x025e:
            r0 = move-exception
            r6 = r3
            r7 = 0
            goto L_0x0049
        L_0x0263:
            r0 = move-exception
            r2 = r0
            r22 = 0
            goto L_0x0f91
        L_0x0269:
            r0 = move-exception
            r3 = r0
            r6 = 0
            r7 = 0
        L_0x026d:
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f8d }
            o.ϵı r4 = r4.m11714()     // Catch:{ all -> 0x0f8d }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r7 = o.C2244.m11698(r7)     // Catch:{ all -> 0x0f8d }
            r4.m11605(r5, r7, r3)     // Catch:{ all -> 0x0f8d }
            if (r6 == 0) goto L_0x0283
            r6.close()     // Catch:{ all -> 0x0f97 }
        L_0x0283:
            java.util.List<o.хɪ$ı> r3 = r2.f9732     // Catch:{ all -> 0x0f97 }
            if (r3 == 0) goto L_0x0292
            java.util.List<o.хɪ$ı> r3 = r2.f9732     // Catch:{ all -> 0x0f97 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0f97 }
            if (r3 == 0) goto L_0x0290
            goto L_0x0292
        L_0x0290:
            r3 = 0
            goto L_0x0293
        L_0x0292:
            r3 = 1
        L_0x0293:
            if (r3 != 0) goto L_0x0f7d
            o.хɪ$aux r3 = r2.f9734     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r3 = r3.m6992()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r3 = (o.C0987.C0989) r3     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux$if r3 = (o.C2477.aux.Cif) r3     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux$if r3 = r3.m12973()     // Catch:{ all -> 0x0f97 }
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r5 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = r5.m12911()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r6 = o.C2529.f11525     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r5, r6)     // Catch:{ all -> 0x0f97 }
            r7 = 0
            r8 = -1
            r9 = -1
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 0
            r19 = 0
        L_0x02c0:
            java.util.List<o.хɪ$ı> r11 = r2.f9732     // Catch:{ all -> 0x0f97 }
            int r11 = r11.size()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "_e"
            java.lang.String r6 = "_et"
            r21 = r12
            r26 = r13
            if (r7 >= r11) goto L_0x082a
            java.util.List<o.хɪ$ı> r11 = r2.f9732     // Catch:{ all -> 0x0f97 }
            java.lang.Object r11 = r11.get(r7)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r11 = (o.C2477.C2481) r11     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r11 = r11.m6992()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r11 = (o.C0987.C0989) r11     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı$ı r11 = (o.C2477.C2481.C2482) r11     // Catch:{ all -> 0x0f97 }
            o.іʄ r14 = r63.m10514()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r10 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = r10.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.String r12 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r10 = r14.m13751((java.lang.String) r10, (java.lang.String) r12)     // Catch:{ all -> 0x0f97 }
            java.lang.String r12 = "_err"
            if (r10 == 0) goto L_0x0375
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r5 = r5.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r5 = r5.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            o.хɪ$aux r10 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = r10.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r10 = o.C2244.m11698(r10)     // Catch:{ all -> 0x0f97 }
            o.ѵı r13 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.κІ r13 = r13.m14115()     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r13 = r13.m11216((java.lang.String) r14)     // Catch:{ all -> 0x0f97 }
            r5.m11605(r6, r10, r13)     // Catch:{ all -> 0x0f97 }
            o.іʄ r5 = r63.m10514()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r6 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r6.m12911()     // Catch:{ all -> 0x0f97 }
            boolean r5 = r5.m13761(r6)     // Catch:{ all -> 0x0f97 }
            if (r5 != 0) goto L_0x0340
            o.іʄ r5 = r63.m10514()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r6 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r6.m12911()     // Catch:{ all -> 0x0f97 }
            boolean r5 = r5.m13754(r6)     // Catch:{ all -> 0x0f97 }
            if (r5 == 0) goto L_0x033e
            goto L_0x0340
        L_0x033e:
            r5 = 0
            goto L_0x0341
        L_0x0340:
            r5 = 1
        L_0x0341:
            if (r5 != 0) goto L_0x0366
            java.lang.String r5 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0f97 }
            if (r5 != 0) goto L_0x0366
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ϜΙ r28 = r5.m14116()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r5 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r29 = r5.m12911()     // Catch:{ all -> 0x0f97 }
            r30 = 11
            java.lang.String r31 = "_ev"
            java.lang.String r32 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            r33 = 0
            r28.m11382((java.lang.String) r29, (int) r30, (java.lang.String) r31, (java.lang.String) r32, (int) r33)     // Catch:{ all -> 0x0f97 }
        L_0x0366:
            r31 = r4
            r12 = r21
            r13 = r26
            r6 = -1
            r10 = 3
            r62 = r9
            r9 = r7
            r7 = r62
            goto L_0x0822
        L_0x0375:
            o.іʄ r10 = r63.m10514()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r13 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r13 = r13.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r10 = r10.m13759(r13, r14)     // Catch:{ all -> 0x0f97 }
            java.lang.String r13 = "_c"
            if (r10 != 0) goto L_0x03e3
            r63.m10496()     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            o.C2745.C2746.m14562((java.lang.String) r14)     // Catch:{ all -> 0x0f97 }
            r25 = r15
            int r15 = r14.hashCode()     // Catch:{ all -> 0x0f97 }
            r30 = r7
            r7 = 94660(0x171c4, float:1.32647E-40)
            if (r15 == r7) goto L_0x03c1
            r7 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r7) goto L_0x03b7
            r7 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r7) goto L_0x03ad
            goto L_0x03cb
        L_0x03ad:
            java.lang.String r7 = "_ui"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f97 }
            if (r7 == 0) goto L_0x03cb
            r7 = 1
            goto L_0x03cc
        L_0x03b7:
            java.lang.String r7 = "_ug"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f97 }
            if (r7 == 0) goto L_0x03cb
            r7 = 2
            goto L_0x03cc
        L_0x03c1:
            java.lang.String r7 = "_in"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f97 }
            if (r7 == 0) goto L_0x03cb
            r7 = 0
            goto L_0x03cc
        L_0x03cb:
            r7 = -1
        L_0x03cc:
            if (r7 == 0) goto L_0x03d6
            r14 = 1
            if (r7 == r14) goto L_0x03d6
            r14 = 2
            if (r7 == r14) goto L_0x03d6
            r7 = 0
            goto L_0x03d7
        L_0x03d6:
            r7 = 1
        L_0x03d7:
            if (r7 == 0) goto L_0x03da
            goto L_0x03e7
        L_0x03da:
            r31 = r4
            r32 = r8
            r33 = r9
            r9 = r6
            goto L_0x05c5
        L_0x03e3:
            r30 = r7
            r25 = r15
        L_0x03e7:
            r31 = r4
            r7 = 0
            r14 = 0
            r15 = 0
        L_0x03ec:
            int r4 = r11.m13076()     // Catch:{ all -> 0x0f97 }
            r32 = r8
            java.lang.String r8 = "_r"
            if (r7 >= r4) goto L_0x045a
            o.хɪ$ǃ r4 = r11.m13082((int) r7)     // Catch:{ all -> 0x0f97 }
            java.lang.String r4 = r4.m13123()     // Catch:{ all -> 0x0f97 }
            boolean r4 = r13.equals(r4)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0425
            o.хɪ$ǃ r4 = r11.m13082((int) r7)     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = r4.m6992()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = (o.C0987.C0989) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = (o.C2477.C2483.C2484) r4     // Catch:{ all -> 0x0f97 }
            r33 = r9
            r8 = 1
            o.хɪ$ǃ$ı r4 = r4.m13131((long) r8)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r4 = r4.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r4 = (o.C0987) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r4 = (o.C2477.C2483) r4     // Catch:{ all -> 0x0f97 }
            r11.m13080(r7, r4)     // Catch:{ all -> 0x0f97 }
            r14 = 1
            goto L_0x0453
        L_0x0425:
            r33 = r9
            o.хɪ$ǃ r4 = r11.m13082((int) r7)     // Catch:{ all -> 0x0f97 }
            java.lang.String r4 = r4.m13123()     // Catch:{ all -> 0x0f97 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0453
            o.хɪ$ǃ r4 = r11.m13082((int) r7)     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = r4.m6992()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = (o.C0987.C0989) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = (o.C2477.C2483.C2484) r4     // Catch:{ all -> 0x0f97 }
            r8 = 1
            o.хɪ$ǃ$ı r4 = r4.m13131((long) r8)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r4 = r4.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r4 = (o.C0987) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r4 = (o.C2477.C2483) r4     // Catch:{ all -> 0x0f97 }
            r11.m13080(r7, r4)     // Catch:{ all -> 0x0f97 }
            r15 = 1
        L_0x0453:
            int r7 = r7 + 1
            r8 = r32
            r9 = r33
            goto L_0x03ec
        L_0x045a:
            r33 = r9
            if (r14 != 0) goto L_0x0490
            if (r10 == 0) goto L_0x0490
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.m11713()     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = "Marking event as conversion"
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.κІ r9 = r9.m14115()     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r9 = r9.m11216((java.lang.String) r14)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r7, r9)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = o.C2477.C2483.m13106()     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = r4.m13132((java.lang.String) r13)     // Catch:{ all -> 0x0f97 }
            r9 = r6
            r6 = 1
            o.хɪ$ǃ$ı r4 = r4.m13131((long) r6)     // Catch:{ all -> 0x0f97 }
            r11.m13078((o.C2477.C2483.C2484) r4)     // Catch:{ all -> 0x0f97 }
            goto L_0x0491
        L_0x0490:
            r9 = r6
        L_0x0491:
            if (r15 != 0) goto L_0x04c1
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.m11713()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Marking event as real-time"
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.κІ r7 = r7.m14115()     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = r7.m11216((java.lang.String) r14)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r6, r7)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = o.C2477.C2483.m13106()     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = r4.m13132((java.lang.String) r8)     // Catch:{ all -> 0x0f97 }
            r6 = 1
            o.хɪ$ǃ$ı r4 = r4.m13131((long) r6)     // Catch:{ all -> 0x0f97 }
            r11.m13078((o.C2477.C2483.C2484) r4)     // Catch:{ all -> 0x0f97 }
        L_0x04c1:
            o.Іє r34 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            long r35 = r63.m10480()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r4 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r37 = r4.m12911()     // Catch:{ all -> 0x0f97 }
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 1
            o.Іэ r4 = r34.m12037(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0f97 }
            long r6 = r4.f10715     // Catch:{ all -> 0x0f97 }
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r14 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r14.m12911()     // Catch:{ all -> 0x0f97 }
            int r4 = r4.m13368((java.lang.String) r14)     // Catch:{ all -> 0x0f97 }
            long r14 = (long) r4     // Catch:{ all -> 0x0f97 }
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x04f8
            m10489((o.C2477.C2481.C2482) r11, (java.lang.String) r8)     // Catch:{ all -> 0x0f97 }
            goto L_0x04fa
        L_0x04f8:
            r21 = 1
        L_0x04fa:
            java.lang.String r4 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r4 = o.C2151.m11345((java.lang.String) r4)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x05c5
            if (r10 == 0) goto L_0x05c5
            o.Іє r34 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            long r35 = r63.m10480()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r4 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r37 = r4.m12911()     // Catch:{ all -> 0x0f97 }
            r38 = 0
            r39 = 0
            r40 = 1
            r41 = 0
            r42 = 0
            o.Іэ r4 = r34.m12037(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0f97 }
            long r6 = r4.f10716     // Catch:{ all -> 0x0f97 }
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r8 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r8 = r8.m12911()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Integer> r14 = o.C2529.f11607     // Catch:{ all -> 0x0f97 }
            int r4 = r4.m13387(r8, r14)     // Catch:{ all -> 0x0f97 }
            long r14 = (long) r4     // Catch:{ all -> 0x0f97 }
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x05c5
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            o.хɪ$aux r7 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = r7.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r7 = o.C2244.m11698(r7)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r6, r7)     // Catch:{ all -> 0x0f97 }
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -1
        L_0x0558:
            int r14 = r11.m13076()     // Catch:{ all -> 0x0f97 }
            if (r4 >= r14) goto L_0x0584
            o.хɪ$ǃ r14 = r11.m13082((int) r4)     // Catch:{ all -> 0x0f97 }
            java.lang.String r15 = r14.m13123()     // Catch:{ all -> 0x0f97 }
            boolean r15 = r13.equals(r15)     // Catch:{ all -> 0x0f97 }
            if (r15 == 0) goto L_0x0576
            o.ȽІ$ǃ r7 = r14.m6992()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r7 = (o.C0987.C0989) r7     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r7 = (o.C2477.C2483.C2484) r7     // Catch:{ all -> 0x0f97 }
            r8 = r4
            goto L_0x0581
        L_0x0576:
            java.lang.String r14 = r14.m13123()     // Catch:{ all -> 0x0f97 }
            boolean r14 = r12.equals(r14)     // Catch:{ all -> 0x0f97 }
            if (r14 == 0) goto L_0x0581
            r6 = 1
        L_0x0581:
            int r4 = r4 + 1
            goto L_0x0558
        L_0x0584:
            if (r6 == 0) goto L_0x058c
            if (r7 == 0) goto L_0x058c
            r11.m13083((int) r8)     // Catch:{ all -> 0x0f97 }
            goto L_0x05c5
        L_0x058c:
            if (r7 == 0) goto L_0x05ac
            java.lang.Object r4 = r7.clone()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = (o.C0987.C0989) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = (o.C2477.C2483.C2484) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ$ı r4 = r4.m13132((java.lang.String) r12)     // Catch:{ all -> 0x0f97 }
            r6 = 10
            o.хɪ$ǃ$ı r4 = r4.m13131((long) r6)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r4 = r4.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r4 = (o.C0987) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r4 = (o.C2477.C2483) r4     // Catch:{ all -> 0x0f97 }
            r11.m13080(r8, r4)     // Catch:{ all -> 0x0f97 }
            goto L_0x05c5
        L_0x05ac:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.m11714()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            o.хɪ$aux r7 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = r7.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r7 = o.C2244.m11698(r7)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r6, r7)     // Catch:{ all -> 0x0f97 }
        L_0x05c5:
            if (r10 == 0) goto L_0x068c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0f97 }
            java.util.List r6 = r11.m13079()     // Catch:{ all -> 0x0f97 }
            r4.<init>(r6)     // Catch:{ all -> 0x0f97 }
            r6 = 0
            r7 = -1
            r8 = -1
        L_0x05d3:
            int r10 = r4.size()     // Catch:{ all -> 0x0f97 }
            if (r6 >= r10) goto L_0x0603
            java.lang.String r10 = "value"
            java.lang.Object r12 = r4.get(r6)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r12 = (o.C2477.C2483) r12     // Catch:{ all -> 0x0f97 }
            java.lang.String r12 = r12.m13123()     // Catch:{ all -> 0x0f97 }
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0f97 }
            if (r10 == 0) goto L_0x05ed
            r7 = r6
            goto L_0x0600
        L_0x05ed:
            java.lang.String r10 = "currency"
            java.lang.Object r12 = r4.get(r6)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r12 = (o.C2477.C2483) r12     // Catch:{ all -> 0x0f97 }
            java.lang.String r12 = r12.m13123()     // Catch:{ all -> 0x0f97 }
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0f97 }
            if (r10 == 0) goto L_0x0600
            r8 = r6
        L_0x0600:
            int r6 = r6 + 1
            goto L_0x05d3
        L_0x0603:
            r6 = -1
            if (r7 == r6) goto L_0x068d
            java.lang.Object r6 = r4.get(r7)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r6 = (o.C2477.C2483) r6     // Catch:{ all -> 0x0f97 }
            boolean r6 = r6.m13116()     // Catch:{ all -> 0x0f97 }
            if (r6 != 0) goto L_0x063b
            java.lang.Object r6 = r4.get(r7)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r6 = (o.C2477.C2483) r6     // Catch:{ all -> 0x0f97 }
            boolean r6 = r6.m13124()     // Catch:{ all -> 0x0f97 }
            if (r6 != 0) goto L_0x063b
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.m11708()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Value must be specified with a numeric type."
            r4.m11606(r6)     // Catch:{ all -> 0x0f97 }
            r11.m13083((int) r7)     // Catch:{ all -> 0x0f97 }
            m10489((o.C2477.C2481.C2482) r11, (java.lang.String) r13)     // Catch:{ all -> 0x0f97 }
            r4 = 18
            java.lang.String r6 = "value"
            m10470(r11, r4, r6)     // Catch:{ all -> 0x0f97 }
            goto L_0x068c
        L_0x063b:
            r6 = -1
            if (r8 != r6) goto L_0x0641
            r4 = 1
            r10 = 3
            goto L_0x066d
        L_0x0641:
            java.lang.Object r4 = r4.get(r8)     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r4 = (o.C2477.C2483) r4     // Catch:{ all -> 0x0f97 }
            java.lang.String r4 = r4.m13119()     // Catch:{ all -> 0x0f97 }
            int r8 = r4.length()     // Catch:{ all -> 0x0f97 }
            r10 = 3
            if (r8 == r10) goto L_0x0654
        L_0x0652:
            r4 = 1
            goto L_0x066d
        L_0x0654:
            r8 = 0
        L_0x0655:
            int r12 = r4.length()     // Catch:{ all -> 0x0f97 }
            if (r8 >= r12) goto L_0x066c
            int r12 = r4.codePointAt(r8)     // Catch:{ all -> 0x0f97 }
            boolean r14 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0f97 }
            if (r14 != 0) goto L_0x0666
            goto L_0x0652
        L_0x0666:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0f97 }
            int r8 = r8 + r12
            goto L_0x0655
        L_0x066c:
            r4 = 0
        L_0x066d:
            if (r4 == 0) goto L_0x068e
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.m11708()     // Catch:{ all -> 0x0f97 }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r4.m11606(r8)     // Catch:{ all -> 0x0f97 }
            r11.m13083((int) r7)     // Catch:{ all -> 0x0f97 }
            m10489((o.C2477.C2481.C2482) r11, (java.lang.String) r13)     // Catch:{ all -> 0x0f97 }
            r4 = 19
            java.lang.String r7 = "currency"
            m10470(r11, r4, r7)     // Catch:{ all -> 0x0f97 }
            goto L_0x068e
        L_0x068c:
            r6 = -1
        L_0x068d:
            r10 = 3
        L_0x068e:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r7 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = r7.m12911()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r8 = o.C2529.f11516     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r7, r8)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x07a5
            java.lang.String r4 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x06fd
            r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r4 = r11.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r4 = (o.C0987) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r4 = (o.C2477.C2481) r4     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = "_fr"
            o.хɪ$ǃ r4 = o.C2090.m11101((o.C2477.C2481) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0f97 }
            if (r4 != 0) goto L_0x06f7
            if (r19 == 0) goto L_0x06ef
            long r7 = r19.m13092()     // Catch:{ all -> 0x0f97 }
            long r12 = r11.m13092()     // Catch:{ all -> 0x0f97 }
            long r7 = r7 - r12
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0f97 }
            r12 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x06ef
            java.lang.Object r4 = r19.clone()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = (o.C0987.C0989) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı$ı r4 = (o.C2477.C2481.C2482) r4     // Catch:{ all -> 0x0f97 }
            boolean r7 = r1.m10483((o.C2477.C2481.C2482) r11, (o.C2477.C2481.C2482) r4)     // Catch:{ all -> 0x0f97 }
            if (r7 == 0) goto L_0x06ef
            r7 = r33
            r3.m12987(r7, r4)     // Catch:{ all -> 0x0f97 }
            r8 = r32
        L_0x06e9:
            r18 = 0
            r19 = 0
            goto L_0x07a9
        L_0x06ef:
            r7 = r33
            r18 = r11
            r8 = r25
            goto L_0x07a9
        L_0x06f7:
            r7 = r33
        L_0x06f9:
            r8 = r32
            goto L_0x07a9
        L_0x06fd:
            r7 = r33
            java.lang.String r4 = "_vs"
            java.lang.String r8 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x074c
            r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r4 = r11.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r4 = (o.C0987) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r4 = (o.C2477.C2481) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r4 = o.C2090.m11101((o.C2477.C2481) r4, (java.lang.String) r9)     // Catch:{ all -> 0x0f97 }
            if (r4 != 0) goto L_0x06f9
            if (r18 == 0) goto L_0x0745
            long r12 = r18.m13092()     // Catch:{ all -> 0x0f97 }
            long r14 = r11.m13092()     // Catch:{ all -> 0x0f97 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f97 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x0745
            java.lang.Object r4 = r18.clone()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = (o.C0987.C0989) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı$ı r4 = (o.C2477.C2481.C2482) r4     // Catch:{ all -> 0x0f97 }
            boolean r8 = r1.m10483((o.C2477.C2481.C2482) r4, (o.C2477.C2481.C2482) r11)     // Catch:{ all -> 0x0f97 }
            if (r8 == 0) goto L_0x0745
            r8 = r32
            r3.m12987(r8, r4)     // Catch:{ all -> 0x0f97 }
            goto L_0x06e9
        L_0x0745:
            r8 = r32
            r19 = r11
            r7 = r25
            goto L_0x07a9
        L_0x074c:
            r8 = r32
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r12 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r12 = r12.m12911()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r13 = o.C2529.f11502     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r12, r13)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x07a9
            java.lang.String r4 = "_ab"
            java.lang.String r12 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.equals(r12)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x07a9
            r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r4 = r11.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r4 = (o.C0987) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r4 = (o.C2477.C2481) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r4 = o.C2090.m11101((o.C2477.C2481) r4, (java.lang.String) r9)     // Catch:{ all -> 0x0f97 }
            if (r4 != 0) goto L_0x07a9
            if (r18 == 0) goto L_0x07a9
            long r12 = r18.m13092()     // Catch:{ all -> 0x0f97 }
            long r14 = r11.m13092()     // Catch:{ all -> 0x0f97 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f97 }
            r14 = 4000(0xfa0, double:1.9763E-320)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x07a9
            java.lang.Object r4 = r18.clone()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r4 = (o.C0987.C0989) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı$ı r4 = (o.C2477.C2481.C2482) r4     // Catch:{ all -> 0x0f97 }
            r1.m10475((o.C2477.C2481.C2482) r4, (o.C2477.C2481.C2482) r11)     // Catch:{ all -> 0x0f97 }
            r3.m12987(r8, r4)     // Catch:{ all -> 0x0f97 }
            r18 = 0
            goto L_0x07a9
        L_0x07a5:
            r8 = r32
            r7 = r33
        L_0x07a9:
            if (r31 != 0) goto L_0x080a
            java.lang.String r4 = r11.m13090()     // Catch:{ all -> 0x0f97 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x080a
            int r4 = r11.m13076()     // Catch:{ all -> 0x0f97 }
            if (r4 != 0) goto L_0x07d5
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "Engagement event does not contain any parameters. appId"
            o.хɪ$aux r9 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r9 = r9.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r9 = o.C2244.m11698(r9)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r5, r9)     // Catch:{ all -> 0x0f97 }
            goto L_0x080a
        L_0x07d5:
            o.ιս r4 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r5 = r11.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r5 = (o.C0987) r5     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r5 = (o.C2477.C2481) r5     // Catch:{ all -> 0x0f97 }
            java.lang.Object r4 = r4.m11112((o.C2477.C2481) r5, (java.lang.String) r9)     // Catch:{ all -> 0x0f97 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0f97 }
            if (r4 != 0) goto L_0x0803
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "Engagement event does not include duration. appId"
            o.хɪ$aux r9 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r9 = r9.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r9 = o.C2244.m11698(r9)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r5, r9)     // Catch:{ all -> 0x0f97 }
            goto L_0x080a
        L_0x0803:
            long r4 = r4.longValue()     // Catch:{ all -> 0x0f97 }
            long r13 = r26 + r4
            goto L_0x080c
        L_0x080a:
            r13 = r26
        L_0x080c:
            java.util.List<o.хɪ$ı> r4 = r2.f9732     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r5 = r11.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r5 = (o.C0987) r5     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r5 = (o.C2477.C2481) r5     // Catch:{ all -> 0x0f97 }
            r9 = r30
            r4.set(r9, r5)     // Catch:{ all -> 0x0f97 }
            int r15 = r25 + 1
            r3.m12991((o.C2477.C2481.C2482) r11)     // Catch:{ all -> 0x0f97 }
            r12 = r21
        L_0x0822:
            int r4 = r9 + 1
            r9 = r7
            r7 = r4
            r4 = r31
            goto L_0x02c0
        L_0x082a:
            r31 = r4
            r9 = r6
            r25 = r15
            if (r31 == 0) goto L_0x0886
            r6 = r25
            r13 = r26
            r4 = 0
        L_0x0836:
            if (r4 >= r6) goto L_0x0888
            o.хɪ$ı r7 = r3.m12979((int) r4)     // Catch:{ all -> 0x0f97 }
            java.lang.String r8 = r7.m13068()     // Catch:{ all -> 0x0f97 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0f97 }
            if (r8 == 0) goto L_0x0859
            r63.m10496()     // Catch:{ all -> 0x0f97 }
            java.lang.String r8 = "_fr"
            o.хɪ$ǃ r8 = o.C2090.m11101((o.C2477.C2481) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0f97 }
            if (r8 == 0) goto L_0x0859
            r3.m12986((int) r4)     // Catch:{ all -> 0x0f97 }
            int r6 = r6 + -1
            int r4 = r4 + -1
            goto L_0x0883
        L_0x0859:
            r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r7 = o.C2090.m11101((o.C2477.C2481) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0f97 }
            if (r7 == 0) goto L_0x0883
            boolean r8 = r7.m13116()     // Catch:{ all -> 0x0f97 }
            if (r8 == 0) goto L_0x0871
            long r7 = r7.m13125()     // Catch:{ all -> 0x0f97 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0f97 }
            goto L_0x0872
        L_0x0871:
            r7 = 0
        L_0x0872:
            if (r7 == 0) goto L_0x0883
            long r10 = r7.longValue()     // Catch:{ all -> 0x0f97 }
            r18 = 0
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x0883
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f97 }
            long r13 = r13 + r7
        L_0x0883:
            r7 = 1
            int r4 = r4 + r7
            goto L_0x0836
        L_0x0886:
            r13 = r26
        L_0x0888:
            r4 = 0
            r1.m10474((o.C2477.aux.Cif) r3, (long) r13, (boolean) r4)     // Catch:{ all -> 0x0f97 }
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r6 = o.C2529.f11505     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r5, r6)     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "_se"
            if (r4 == 0) goto L_0x0951
            java.util.List r4 = r3.m12985()     // Catch:{ all -> 0x0f97 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0f97 }
        L_0x08a8:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0f97 }
            if (r6 == 0) goto L_0x08c2
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r6 = (o.C2477.C2481) r6     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = "_s"
            java.lang.String r6 = r6.m13068()     // Catch:{ all -> 0x0f97 }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x0f97 }
            if (r6 == 0) goto L_0x08a8
            r4 = 1
            goto L_0x08c3
        L_0x08c2:
            r4 = 0
        L_0x08c3:
            if (r4 == 0) goto L_0x08d0
            o.Іє r4 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            r4.m12046(r6, r5)     // Catch:{ all -> 0x0f97 }
        L_0x08d0:
            boolean r4 = o.C1723.m9720()     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x094c
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r7 = o.C2529.f11519     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r6, r7)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x094c
            java.lang.String r4 = "_sid"
            int r4 = o.C2090.m11093(r3, r4)     // Catch:{ all -> 0x0f97 }
            if (r4 < 0) goto L_0x08f2
            r4 = 1
            goto L_0x08f3
        L_0x08f2:
            r4 = 0
        L_0x08f3:
            if (r4 != 0) goto L_0x094c
            int r4 = o.C2090.m11093(r3, r5)     // Catch:{ all -> 0x0f97 }
            if (r4 < 0) goto L_0x096e
            r3.m13003((int) r4)     // Catch:{ all -> 0x0f97 }
            boolean r4 = o.C1140.m7582()     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0932
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r5 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = r5.m12911()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r6 = o.C2529.f11567     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r5, r6)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0932
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.m11714()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "Session engagement user property is in the bundle without session ID. appId"
            o.хɪ$aux r6 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r6.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r6 = o.C2244.m11698(r6)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r5, r6)     // Catch:{ all -> 0x0f97 }
            goto L_0x096e
        L_0x0932:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r4 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r4 = r4.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "Session engagement user property is in the bundle without session ID. appId"
            o.хɪ$aux r6 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r6.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r6 = o.C2244.m11698(r6)     // Catch:{ all -> 0x0f97 }
            r4.m11603(r5, r6)     // Catch:{ all -> 0x0f97 }
            goto L_0x096e
        L_0x094c:
            r4 = 1
            r1.m10474((o.C2477.aux.Cif) r3, (long) r13, (boolean) r4)     // Catch:{ all -> 0x0f97 }
            goto L_0x096e
        L_0x0951:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r7 = o.C2529.f11517     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r6, r7)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x096e
            o.Іє r4 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            r4.m12046(r6, r5)     // Catch:{ all -> 0x0f97 }
        L_0x096e:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r6 = o.C2529.f11526     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r5, r6)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0a13
            o.ιս r4 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.Іɛ r5 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r5 = r5.m11713()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Checking account type status for ad personalization signals"
            r5.m11606(r6)     // Catch:{ all -> 0x0f97 }
            o.іʄ r5 = r4.m10945()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            boolean r5 = r5.m13748(r6)     // Catch:{ all -> 0x0f97 }
            if (r5 == 0) goto L_0x0a13
            o.Іє r5 = r4.n_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            o.пı r5 = r5.m12038((java.lang.String) r6)     // Catch:{ all -> 0x0f97 }
            if (r5 == 0) goto L_0x0a13
            boolean r5 = r5.m12651()     // Catch:{ all -> 0x0f97 }
            if (r5 == 0) goto L_0x0a13
            o.ЈЈ r5 = r4.x_()     // Catch:{ all -> 0x0f97 }
            boolean r5 = r5.m12186()     // Catch:{ all -> 0x0f97 }
            if (r5 == 0) goto L_0x0a13
            o.Іɛ r5 = r4.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r5 = r5.m11711()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r5.m11606(r6)     // Catch:{ all -> 0x0f97 }
            o.хɪ$І$If r5 = o.C2477.C2490.m13202()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "_npa"
            o.хɪ$І$If r5 = r5.m13221(r6)     // Catch:{ all -> 0x0f97 }
            o.ЈЈ r4 = r4.x_()     // Catch:{ all -> 0x0f97 }
            long r6 = r4.m12183()     // Catch:{ all -> 0x0f97 }
            o.хɪ$І$If r4 = r5.m13227(r6)     // Catch:{ all -> 0x0f97 }
            r5 = 1
            o.хɪ$І$If r4 = r4.m13225((long) r5)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r4 = r4.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r4 = (o.C0987) r4     // Catch:{ all -> 0x0f97 }
            o.хɪ$І r4 = (o.C2477.C2490) r4     // Catch:{ all -> 0x0f97 }
            r5 = 0
        L_0x09ef:
            int r6 = r3.m13009()     // Catch:{ all -> 0x0f97 }
            if (r5 >= r6) goto L_0x0a0d
            java.lang.String r6 = "_npa"
            o.хɪ$І r7 = r3.m13014((int) r5)     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = r7.m13210()     // Catch:{ all -> 0x0f97 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0f97 }
            if (r6 == 0) goto L_0x0a0a
            r3.m12974(r5, r4)     // Catch:{ all -> 0x0f97 }
            r5 = 1
            goto L_0x0a0e
        L_0x0a0a:
            int r5 = r5 + 1
            goto L_0x09ef
        L_0x0a0d:
            r5 = 0
        L_0x0a0e:
            if (r5 != 0) goto L_0x0a13
            r3.m13007((o.C2477.C2490) r4)     // Catch:{ all -> 0x0f97 }
        L_0x0a13:
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r6 = o.C2529.f11603     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13384(r5, r6)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0a28
            m10488((o.C2477.aux.Cif) r3)     // Catch:{ all -> 0x0f97 }
        L_0x0a28:
            o.хɪ$aux$if r4 = r3.m12999()     // Catch:{ all -> 0x0f97 }
            o.Іŧ r5 = r63.m10520()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r3.m13015()     // Catch:{ all -> 0x0f97 }
            java.util.List r7 = r3.m12985()     // Catch:{ all -> 0x0f97 }
            java.util.List r8 = r3.m13002()     // Catch:{ all -> 0x0f97 }
            long r9 = r3.m13022()     // Catch:{ all -> 0x0f97 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0f97 }
            long r10 = r3.m12995()     // Catch:{ all -> 0x0f97 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0f97 }
            java.util.List r5 = r5.m11658(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0f97 }
            r4.m13005((java.lang.Iterable<? extends o.C2477.C2485>) r5)     // Catch:{ all -> 0x0f97 }
            o.ѵı r4 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r4 = r4.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r5 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = r5.m12911()     // Catch:{ all -> 0x0f97 }
            boolean r4 = r4.m13375(r5)     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0dd7
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0f97 }
            r4.<init>()     // Catch:{ all -> 0x0f97 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0f97 }
            r5.<init>()     // Catch:{ all -> 0x0f97 }
            o.ѵı r6 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ϜΙ r6 = r6.m14116()     // Catch:{ all -> 0x0f97 }
            java.security.SecureRandom r6 = r6.m11390()     // Catch:{ all -> 0x0f97 }
            r7 = 0
        L_0x0a7a:
            int r8 = r3.m12964()     // Catch:{ all -> 0x0f97 }
            if (r7 >= r8) goto L_0x0da1
            o.хɪ$ı r8 = r3.m12979((int) r7)     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r8 = r8.m6992()     // Catch:{ all -> 0x0f97 }
            o.ȽІ$ǃ r8 = (o.C0987.C0989) r8     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı$ı r8 = (o.C2477.C2481.C2482) r8     // Catch:{ all -> 0x0f97 }
            java.lang.String r9 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0b10
            o.ιս r9 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r10 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r10 = (o.C0987) r10     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r10 = (o.C2477.C2481) r10     // Catch:{ all -> 0x0f97 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = r9.m11112((o.C2477.C2481) r10, (java.lang.String) r11)     // Catch:{ all -> 0x0f97 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f97 }
            java.lang.Object r10 = r4.get(r9)     // Catch:{ all -> 0x0f97 }
            o.кı r10 = (o.C2440) r10     // Catch:{ all -> 0x0f97 }
            if (r10 != 0) goto L_0x0ac5
            o.Іє r10 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r11 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r11 = r11.m12911()     // Catch:{ all -> 0x0f97 }
            o.кı r10 = r10.m12050((java.lang.String) r11, (java.lang.String) r9)     // Catch:{ all -> 0x0f97 }
            r4.put(r9, r10)     // Catch:{ all -> 0x0f97 }
        L_0x0ac5:
            java.lang.Long r9 = r10.f11078     // Catch:{ all -> 0x0f97 }
            if (r9 != 0) goto L_0x0b06
            java.lang.Long r9 = r10.f11085     // Catch:{ all -> 0x0f97 }
            long r11 = r9.longValue()     // Catch:{ all -> 0x0f97 }
            r13 = 1
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0ae0
            o.ιս r9 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            java.lang.String r11 = "_sr"
            java.lang.Long r12 = r10.f11085     // Catch:{ all -> 0x0f97 }
            r9.m11114((o.C2477.C2481.C2482) r8, (java.lang.String) r11, (java.lang.Object) r12)     // Catch:{ all -> 0x0f97 }
        L_0x0ae0:
            java.lang.Boolean r9 = r10.f11080     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0afb
            java.lang.Boolean r9 = r10.f11080     // Catch:{ all -> 0x0f97 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0afb
            o.ιս r9 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = "_efs"
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0f97 }
            r9.m11114((o.C2477.C2481.C2482) r8, (java.lang.String) r10, (java.lang.Object) r13)     // Catch:{ all -> 0x0f97 }
        L_0x0afb:
            o.ʋΙ r9 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r9 = (o.C0987) r9     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r9 = (o.C2477.C2481) r9     // Catch:{ all -> 0x0f97 }
            r5.add(r9)     // Catch:{ all -> 0x0f97 }
        L_0x0b06:
            r3.m12987(r7, r8)     // Catch:{ all -> 0x0f97 }
        L_0x0b09:
            r64 = r2
            r2 = r3
            r15 = r6
            r3 = r7
            goto L_0x0d99
        L_0x0b10:
            o.іʄ r9 = r63.m10514()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r10 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = r10.m12911()     // Catch:{ all -> 0x0f97 }
            long r9 = r9.m13746(r10)     // Catch:{ all -> 0x0f97 }
            o.ѵı r11 = r1.f9711     // Catch:{ all -> 0x0f97 }
            r11.m14116()     // Catch:{ all -> 0x0f97 }
            long r11 = r8.m13092()     // Catch:{ all -> 0x0f97 }
            long r11 = o.C2151.m11349((long) r11, (long) r9)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r13 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r13 = (o.C0987) r13     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r13 = (o.C2477.C2481) r13     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = "_dbg"
            r18 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0f97 }
            boolean r18 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0f97 }
            if (r18 != 0) goto L_0x0b9b
            if (r15 != 0) goto L_0x0b44
            goto L_0x0b9b
        L_0x0b44:
            java.util.List r13 = r13.m13067()     // Catch:{ all -> 0x0f97 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0f97 }
        L_0x0b4c:
            boolean r18 = r13.hasNext()     // Catch:{ all -> 0x0f97 }
            if (r18 == 0) goto L_0x0b9b
            java.lang.Object r18 = r13.next()     // Catch:{ all -> 0x0f97 }
            o.хɪ$ǃ r18 = (o.C2477.C2483) r18     // Catch:{ all -> 0x0f97 }
            r64 = r13
            java.lang.String r13 = r18.m13123()     // Catch:{ all -> 0x0f97 }
            boolean r13 = r14.equals(r13)     // Catch:{ all -> 0x0f97 }
            if (r13 == 0) goto L_0x0b98
            boolean r13 = r15 instanceof java.lang.Long     // Catch:{ all -> 0x0f97 }
            if (r13 == 0) goto L_0x0b76
            long r13 = r18.m13125()     // Catch:{ all -> 0x0f97 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0f97 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0f97 }
            if (r13 != 0) goto L_0x0b96
        L_0x0b76:
            boolean r13 = r15 instanceof java.lang.String     // Catch:{ all -> 0x0f97 }
            if (r13 == 0) goto L_0x0b84
            java.lang.String r13 = r18.m13119()     // Catch:{ all -> 0x0f97 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0f97 }
            if (r13 != 0) goto L_0x0b96
        L_0x0b84:
            boolean r13 = r15 instanceof java.lang.Double     // Catch:{ all -> 0x0f97 }
            if (r13 == 0) goto L_0x0b9b
            double r13 = r18.m13126()     // Catch:{ all -> 0x0f97 }
            java.lang.Double r13 = java.lang.Double.valueOf(r13)     // Catch:{ all -> 0x0f97 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0f97 }
            if (r13 == 0) goto L_0x0b9b
        L_0x0b96:
            r13 = 1
            goto L_0x0b9c
        L_0x0b98:
            r13 = r64
            goto L_0x0b4c
        L_0x0b9b:
            r13 = 0
        L_0x0b9c:
            if (r13 != 0) goto L_0x0bb1
            o.іʄ r13 = r63.m10514()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r14 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r14.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.String r15 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            int r13 = r13.m13755(r14, r15)     // Catch:{ all -> 0x0f97 }
            goto L_0x0bb2
        L_0x0bb1:
            r13 = 1
        L_0x0bb2:
            if (r13 > 0) goto L_0x0bdb
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r9 = r9.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r9 = r9.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0f97 }
            r9.m11605(r10, r11, r12)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r9 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r9 = (o.C0987) r9     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r9 = (o.C2477.C2481) r9     // Catch:{ all -> 0x0f97 }
            r5.add(r9)     // Catch:{ all -> 0x0f97 }
            r3.m12987(r7, r8)     // Catch:{ all -> 0x0f97 }
            goto L_0x0b09
        L_0x0bdb:
            java.lang.String r14 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r14 = r4.get(r14)     // Catch:{ all -> 0x0f97 }
            o.кı r14 = (o.C2440) r14     // Catch:{ all -> 0x0f97 }
            if (r14 != 0) goto L_0x0c75
            o.Іє r14 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r15 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r15 = r15.m12911()     // Catch:{ all -> 0x0f97 }
            r18 = r9
            java.lang.String r9 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            o.кı r14 = r14.m12050((java.lang.String) r15, (java.lang.String) r9)     // Catch:{ all -> 0x0f97 }
            if (r14 != 0) goto L_0x0c77
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r9 = r9.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r9 = r9.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = "Event being bundled has no eventAggregate. appId, eventName"
            o.хɪ$aux r14 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r14 = r14.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.String r15 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            r9.m11605(r10, r14, r15)     // Catch:{ all -> 0x0f97 }
            o.ѵı r9 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r9 = r9.m14090()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r10 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r10 = r10.m12911()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r14 = o.C2529.f11506     // Catch:{ all -> 0x0f97 }
            boolean r9 = r9.m13384(r10, r14)     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0c50
            o.кı r9 = new o.кı     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r10 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r31 = r10.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.String r32 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r8.m13092()     // Catch:{ all -> 0x0f97 }
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r30 = r9
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)     // Catch:{ all -> 0x0f97 }
            goto L_0x0c73
        L_0x0c50:
            o.кı r9 = new o.кı     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r10 = r2.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r48 = r10.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.String r49 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            r50 = 1
            r52 = 1
            long r54 = r8.m13092()     // Catch:{ all -> 0x0f97 }
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r47 = r9
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r59, r60, r61)     // Catch:{ all -> 0x0f97 }
        L_0x0c73:
            r14 = r9
            goto L_0x0c77
        L_0x0c75:
            r18 = r9
        L_0x0c77:
            o.ιս r9 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r10 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r10 = (o.C0987) r10     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r10 = (o.C2477.C2481) r10     // Catch:{ all -> 0x0f97 }
            java.lang.String r15 = "_eid"
            java.lang.Object r9 = r9.m11112((o.C2477.C2481) r10, (java.lang.String) r15)     // Catch:{ all -> 0x0f97 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0c8f
            r10 = 1
            goto L_0x0c90
        L_0x0c8f:
            r10 = 0
        L_0x0c90:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0f97 }
            r15 = 1
            if (r13 != r15) goto L_0x0cc5
            o.ʋΙ r9 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r9 = (o.C0987) r9     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r9 = (o.C2477.C2481) r9     // Catch:{ all -> 0x0f97 }
            r5.add(r9)     // Catch:{ all -> 0x0f97 }
            boolean r9 = r10.booleanValue()     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0cc0
            java.lang.Long r9 = r14.f11078     // Catch:{ all -> 0x0f97 }
            if (r9 != 0) goto L_0x0cb4
            java.lang.Long r9 = r14.f11085     // Catch:{ all -> 0x0f97 }
            if (r9 != 0) goto L_0x0cb4
            java.lang.Boolean r9 = r14.f11080     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0cc0
        L_0x0cb4:
            r9 = 0
            o.кı r10 = r14.m12552(r9, r9, r9)     // Catch:{ all -> 0x0f97 }
            java.lang.String r9 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            r4.put(r9, r10)     // Catch:{ all -> 0x0f97 }
        L_0x0cc0:
            r3.m12987(r7, r8)     // Catch:{ all -> 0x0f97 }
            goto L_0x0b09
        L_0x0cc5:
            int r15 = r6.nextInt(r13)     // Catch:{ all -> 0x0f97 }
            if (r15 != 0) goto L_0x0d0c
            o.ιս r9 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            java.lang.String r15 = "_sr"
            r64 = r2
            r23 = r3
            long r2 = (long) r13     // Catch:{ all -> 0x0f97 }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f97 }
            r9.m11114((o.C2477.C2481.C2482) r8, (java.lang.String) r15, (java.lang.Object) r13)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r9 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r9 = (o.C0987) r9     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r9 = (o.C2477.C2481) r9     // Catch:{ all -> 0x0f97 }
            r5.add(r9)     // Catch:{ all -> 0x0f97 }
            boolean r9 = r10.booleanValue()     // Catch:{ all -> 0x0f97 }
            if (r9 == 0) goto L_0x0cf7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f97 }
            r3 = 0
            o.кı r14 = r14.m12552(r3, r2, r3)     // Catch:{ all -> 0x0f97 }
        L_0x0cf7:
            java.lang.String r2 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            long r9 = r8.m13092()     // Catch:{ all -> 0x0f97 }
            o.кı r3 = r14.m12553(r9, r11)     // Catch:{ all -> 0x0f97 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0f97 }
            r15 = r6
            r3 = r7
            r2 = r23
            goto L_0x0d96
        L_0x0d0c:
            r64 = r2
            r23 = r3
            java.lang.Long r2 = r14.f11082     // Catch:{ all -> 0x0f97 }
            if (r2 == 0) goto L_0x0d1e
            java.lang.Long r2 = r14.f11082     // Catch:{ all -> 0x0f97 }
            long r2 = r2.longValue()     // Catch:{ all -> 0x0f97 }
            r15 = r6
            r25 = r7
            goto L_0x0d30
        L_0x0d1e:
            o.ѵı r2 = r1.f9711     // Catch:{ all -> 0x0f97 }
            r2.m14116()     // Catch:{ all -> 0x0f97 }
            long r2 = r8.m13086()     // Catch:{ all -> 0x0f97 }
            r15 = r6
            r25 = r7
            r6 = r18
            long r2 = o.C2151.m11349((long) r2, (long) r6)     // Catch:{ all -> 0x0f97 }
        L_0x0d30:
            int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0d80
            o.ιս r2 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            java.lang.String r3 = "_efs"
            r6 = 1
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f97 }
            r2.m11114((o.C2477.C2481.C2482) r8, (java.lang.String) r3, (java.lang.Object) r9)     // Catch:{ all -> 0x0f97 }
            o.ιս r2 = r63.m10496()     // Catch:{ all -> 0x0f97 }
            java.lang.String r3 = "_sr"
            long r6 = (long) r13     // Catch:{ all -> 0x0f97 }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f97 }
            r2.m11114((o.C2477.C2481.C2482) r8, (java.lang.String) r3, (java.lang.Object) r9)     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r2 = r8.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r2 = (o.C0987) r2     // Catch:{ all -> 0x0f97 }
            o.хɪ$ı r2 = (o.C2477.C2481) r2     // Catch:{ all -> 0x0f97 }
            r5.add(r2)     // Catch:{ all -> 0x0f97 }
            boolean r2 = r10.booleanValue()     // Catch:{ all -> 0x0f97 }
            if (r2 == 0) goto L_0x0d70
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f97 }
            r3 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0f97 }
            r3 = 0
            o.кı r14 = r14.m12552(r3, r2, r6)     // Catch:{ all -> 0x0f97 }
        L_0x0d70:
            java.lang.String r2 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            long r6 = r8.m13092()     // Catch:{ all -> 0x0f97 }
            o.кı r3 = r14.m12553(r6, r11)     // Catch:{ all -> 0x0f97 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0f97 }
            goto L_0x0d92
        L_0x0d80:
            boolean r2 = r10.booleanValue()     // Catch:{ all -> 0x0f97 }
            if (r2 == 0) goto L_0x0d92
            java.lang.String r2 = r8.m13090()     // Catch:{ all -> 0x0f97 }
            r3 = 0
            o.кı r6 = r14.m12552(r9, r3, r3)     // Catch:{ all -> 0x0f97 }
            r4.put(r2, r6)     // Catch:{ all -> 0x0f97 }
        L_0x0d92:
            r2 = r23
            r3 = r25
        L_0x0d96:
            r2.m12987(r3, r8)     // Catch:{ all -> 0x0f97 }
        L_0x0d99:
            int r7 = r3 + 1
            r3 = r2
            r6 = r15
            r2 = r64
            goto L_0x0a7a
        L_0x0da1:
            r64 = r2
            r2 = r3
            int r3 = r5.size()     // Catch:{ all -> 0x0f97 }
            int r6 = r2.m12964()     // Catch:{ all -> 0x0f97 }
            if (r3 >= r6) goto L_0x0db5
            o.хɪ$aux$if r3 = r2.m12973()     // Catch:{ all -> 0x0f97 }
            r3.m13011((java.lang.Iterable<? extends o.C2477.C2481>) r5)     // Catch:{ all -> 0x0f97 }
        L_0x0db5:
            java.util.Set r3 = r4.entrySet()     // Catch:{ all -> 0x0f97 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0f97 }
        L_0x0dbd:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0f97 }
            if (r4 == 0) goto L_0x0dda
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0f97 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0f97 }
            o.Іє r5 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0f97 }
            o.кı r4 = (o.C2440) r4     // Catch:{ all -> 0x0f97 }
            r5.m12020((o.C2440) r4)     // Catch:{ all -> 0x0f97 }
            goto L_0x0dbd
        L_0x0dd7:
            r64 = r2
            r2 = r3
        L_0x0dda:
            o.ѵı r3 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.ьɹ r3 = r3.m14090()     // Catch:{ all -> 0x0f97 }
            java.lang.String r4 = r2.m13015()     // Catch:{ all -> 0x0f97 }
            o.ιͱ<java.lang.Boolean> r5 = o.C2529.f11603     // Catch:{ all -> 0x0f97 }
            boolean r3 = r3.m13384(r4, r5)     // Catch:{ all -> 0x0f97 }
            if (r3 != 0) goto L_0x0def
            m10488((o.C2477.aux.Cif) r2)     // Catch:{ all -> 0x0f97 }
        L_0x0def:
            r3 = r64
            o.хɪ$aux r4 = r3.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r4 = r4.m12911()     // Catch:{ all -> 0x0f97 }
            o.Іє r5 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            o.пı r5 = r5.m12038((java.lang.String) r4)     // Catch:{ all -> 0x0f97 }
            if (r5 != 0) goto L_0x0e1b
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r5 = r5.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r5 = r5.m11714()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            o.хɪ$aux r7 = r3.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = r7.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r7 = o.C2244.m11698(r7)     // Catch:{ all -> 0x0f97 }
            r5.m11603(r6, r7)     // Catch:{ all -> 0x0f97 }
            goto L_0x0e76
        L_0x0e1b:
            int r6 = r2.m12964()     // Catch:{ all -> 0x0f97 }
            if (r6 <= 0) goto L_0x0e76
            long r6 = r5.m12619()     // Catch:{ all -> 0x0f97 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0e2f
            r2.m12966((long) r6)     // Catch:{ all -> 0x0f97 }
            goto L_0x0e32
        L_0x0e2f:
            r2.m12969()     // Catch:{ all -> 0x0f97 }
        L_0x0e32:
            long r8 = r5.m12605()     // Catch:{ all -> 0x0f97 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0e3d
            goto L_0x0e3e
        L_0x0e3d:
            r6 = r8
        L_0x0e3e:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0e46
            r2.m13010((long) r6)     // Catch:{ all -> 0x0f97 }
            goto L_0x0e49
        L_0x0e46:
            r2.m13019()     // Catch:{ all -> 0x0f97 }
        L_0x0e49:
            r5.m12616()     // Catch:{ all -> 0x0f97 }
            long r6 = r5.m12602()     // Catch:{ all -> 0x0f97 }
            int r7 = (int) r6     // Catch:{ all -> 0x0f97 }
            r2.m12970((int) r7)     // Catch:{ all -> 0x0f97 }
            long r6 = r2.m13022()     // Catch:{ all -> 0x0f97 }
            r5.m12611((long) r6)     // Catch:{ all -> 0x0f97 }
            long r6 = r2.m12995()     // Catch:{ all -> 0x0f97 }
            r5.m12643((long) r6)     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r5.m12630()     // Catch:{ all -> 0x0f97 }
            if (r6 == 0) goto L_0x0e6c
            r2.m12972((java.lang.String) r6)     // Catch:{ all -> 0x0f97 }
            goto L_0x0e6f
        L_0x0e6c:
            r2.m12992()     // Catch:{ all -> 0x0f97 }
        L_0x0e6f:
            o.Іє r6 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            r6.m12051((o.C2457) r5)     // Catch:{ all -> 0x0f97 }
        L_0x0e76:
            int r5 = r2.m12964()     // Catch:{ all -> 0x0f97 }
            if (r5 <= 0) goto L_0x0edc
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0f97 }
            r5.q_()     // Catch:{ all -> 0x0f97 }
            o.іʄ r5 = r63.m10514()     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r6 = r3.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = r6.m12911()     // Catch:{ all -> 0x0f97 }
            o.Л$ı r5 = r5.m13758(r6)     // Catch:{ all -> 0x0f97 }
            if (r5 == 0) goto L_0x0ea0
            boolean r6 = r5.m12334()     // Catch:{ all -> 0x0f97 }
            if (r6 != 0) goto L_0x0e98
            goto L_0x0ea0
        L_0x0e98:
            long r5 = r5.m12329()     // Catch:{ all -> 0x0f97 }
            r2.m13017((long) r5)     // Catch:{ all -> 0x0f97 }
            goto L_0x0ecb
        L_0x0ea0:
            o.хɪ$aux r5 = r3.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = r5.m12957()     // Catch:{ all -> 0x0f97 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0f97 }
            if (r5 == 0) goto L_0x0eb2
            r5 = -1
            r2.m13017((long) r5)     // Catch:{ all -> 0x0f97 }
            goto L_0x0ecb
        L_0x0eb2:
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x0f97 }
            o.Іɛ r5 = r5.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r5 = r5.A_()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            o.хɪ$aux r7 = r3.f9734     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = r7.m12911()     // Catch:{ all -> 0x0f97 }
            java.lang.Object r7 = o.C2244.m11698(r7)     // Catch:{ all -> 0x0f97 }
            r5.m11603(r6, r7)     // Catch:{ all -> 0x0f97 }
        L_0x0ecb:
            o.Іє r5 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            o.ʋΙ r2 = r2.m7011()     // Catch:{ all -> 0x0f97 }
            o.ȽІ r2 = (o.C0987) r2     // Catch:{ all -> 0x0f97 }
            o.хɪ$aux r2 = (o.C2477.aux) r2     // Catch:{ all -> 0x0f97 }
            r12 = r21
            r5.m12023((o.C2477.aux) r2, (boolean) r12)     // Catch:{ all -> 0x0f97 }
        L_0x0edc:
            o.Іє r2 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            java.util.List<java.lang.Long> r3 = r3.f9733     // Catch:{ all -> 0x0f97 }
            o.C2745.C2746.m14555(r3)     // Catch:{ all -> 0x0f97 }
            r2.y_()     // Catch:{ all -> 0x0f97 }
            r2.m10931()     // Catch:{ all -> 0x0f97 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f97 }
            r6 = 0
        L_0x0ef3:
            int r7 = r3.size()     // Catch:{ all -> 0x0f97 }
            if (r6 >= r7) goto L_0x0f10
            if (r6 == 0) goto L_0x0f00
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f97 }
        L_0x0f00:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0f97 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f97 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f97 }
            r5.append(r7)     // Catch:{ all -> 0x0f97 }
            int r6 = r6 + 1
            goto L_0x0ef3
        L_0x0f10:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f97 }
            android.database.sqlite.SQLiteDatabase r6 = r2.m12047()     // Catch:{ all -> 0x0f97 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f97 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f97 }
            int r6 = r3.size()     // Catch:{ all -> 0x0f97 }
            if (r5 == r6) goto L_0x0f43
            o.Іɛ r2 = r2.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x0f97 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f97 }
            int r3 = r3.size()     // Catch:{ all -> 0x0f97 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0f97 }
            r2.m11605(r6, r5, r3)     // Catch:{ all -> 0x0f97 }
        L_0x0f43:
            o.Іє r2 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            android.database.sqlite.SQLiteDatabase r3 = r2.m12047()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0f5a }
            r7 = 0
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0f5a }
            r7 = 1
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0f5a }
            r3.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0f5a }
            goto L_0x0f6d
        L_0x0f5a:
            r0 = move-exception
            r3 = r0
            o.Іɛ r2 = r2.t_()     // Catch:{ all -> 0x0f97 }
            o.ϵı r2 = r2.m11714()     // Catch:{ all -> 0x0f97 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = o.C2244.m11698(r4)     // Catch:{ all -> 0x0f97 }
            r2.m11605(r5, r4, r3)     // Catch:{ all -> 0x0f97 }
        L_0x0f6d:
            o.Іє r2 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            r2.m12030()     // Catch:{ all -> 0x0f97 }
            o.Іє r2 = r63.m10502()
            r2.m12018()
            r2 = 1
            return r2
        L_0x0f7d:
            o.Іє r2 = r63.m10502()     // Catch:{ all -> 0x0f97 }
            r2.m12030()     // Catch:{ all -> 0x0f97 }
            o.Іє r2 = r63.m10502()
            r2.m12018()
            r2 = 0
            return r2
        L_0x0f8d:
            r0 = move-exception
        L_0x0f8e:
            r2 = r0
            r22 = r6
        L_0x0f91:
            if (r22 == 0) goto L_0x0f96
            r22.close()     // Catch:{ all -> 0x0f97 }
        L_0x0f96:
            throw r2     // Catch:{ all -> 0x0f97 }
        L_0x0f97:
            r0 = move-exception
            r2 = r0
            o.Іє r3 = r63.m10502()
            r3.m12018()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10477(java.lang.String, long):boolean");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m10488(C2477.aux.Cif ifVar) {
        ifVar.m13004(Long.MAX_VALUE).m12975(Long.MIN_VALUE);
        for (int i = 0; i < ifVar.m12964(); i++) {
            C2477.C2481 r1 = ifVar.m12979(i);
            if (r1.m13065() < ifVar.m13022()) {
                ifVar.m13004(r1.m13065());
            }
            if (r1.m13065() > ifVar.m12995()) {
                ifVar.m12975(r1.m13065());
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m10474(C2477.aux.Cif ifVar, long j, boolean z) {
        C2152 r8;
        String str = z ? "_se" : "_lte";
        C2152 r1 = m10502().m12029(ifVar.m13015(), str);
        if (r1 == null || r1.f10314 == null) {
            r8 = new C2152(ifVar.m13015(), "auto", str, this.f9711.w_().m10846(), Long.valueOf(j));
        } else {
            r8 = new C2152(ifVar.m13015(), "auto", str, this.f9711.w_().m10846(), Long.valueOf(((Long) r1.f10314).longValue() + j));
        }
        C2477.C2490 r12 = (C2477.C2490) ((C0987) C2477.C2490.m13202().m13221(str).m13227(this.f9711.w_().m10846()).m13225(((Long) r8.f10314).longValue()).m7011());
        boolean z2 = false;
        int r0 = C2090.m11093(ifVar, str);
        if (r0 >= 0) {
            ifVar.m12974(r0, r12);
            z2 = true;
        }
        if (!z2) {
            ifVar.m13007(r12);
        }
        if (j > 0) {
            m10502().m12021(r8);
            String str2 = z ? "session-scoped" : "lifetime";
            if (!C1140.m7582() || !this.f9711.m14090().m13384(ifVar.m13015(), C2529.f11567)) {
                this.f9711.t_().m11711().m11605("Updated engagement user property. scope, value", str2, r8.f10314);
            } else {
                this.f9711.t_().m11713().m11605("Updated engagement user property. scope, value", str2, r8.f10314);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m10483(C2477.C2481.C2482 r5, C2477.C2481.C2482 r6) {
        String str;
        C2745.C2746.m14563("_e".equals(r5.m13090()));
        m10496();
        C2477.C2483 r0 = C2090.m11101((C2477.C2481) ((C0987) r5.m7011()), "_sc");
        String str2 = null;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.m13119();
        }
        m10496();
        C2477.C2483 r2 = C2090.m11101((C2477.C2481) ((C0987) r6.m7011()), "_pc");
        if (r2 != null) {
            str2 = r2.m13119();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        m10475(r5, r6);
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m10475(C2477.C2481.C2482 r10, C2477.C2481.C2482 r11) {
        C2745.C2746.m14563("_e".equals(r10.m13090()));
        m10496();
        C2477.C2483 r0 = C2090.m11101((C2477.C2481) ((C0987) r10.m7011()), "_et");
        if (r0.m13116() && r0.m13125() > 0) {
            long r2 = r0.m13125();
            m10496();
            C2477.C2483 r02 = C2090.m11101((C2477.C2481) ((C0987) r11.m7011()), "_et");
            if (r02 != null && r02.m13125() > 0) {
                r2 += r02.m13125();
            }
            m10496().m11114(r11, "_et", (Object) Long.valueOf(r2));
            m10496().m11114(r10, "_fr", (Object) 1L);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m10489(C2477.C2481.C2482 r3, String str) {
        List<C2477.C2483> r0 = r3.m13079();
        for (int i = 0; i < r0.size(); i++) {
            if (str.equals(r0.get(i).m13123())) {
                r3.m13083(i);
                return;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m10470(C2477.C2481.C2482 r4, int i, String str) {
        List<C2477.C2483> r0 = r4.m13079();
        int i2 = 0;
        while (i2 < r0.size()) {
            if (!"_err".equals(r0.get(i2).m13123())) {
                i2++;
            } else {
                return;
            }
        }
        r4.m13091((C2477.C2483) ((C0987) C2477.C2483.m13106().m13132("_err").m13131(Long.valueOf((long) i).longValue()).m7011())).m13091((C2477.C2483) ((C0987) C2477.C2483.m13106().m13132("_ev").m13136(str).m7011()));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10498(int i, Throwable th, byte[] bArr, String str) {
        C2309 r11;
        m10469();
        m10508();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f9722 = false;
                m10478();
                throw th2;
            }
        }
        List<Long> list = this.f9713;
        this.f9713 = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f9711.m14107().f10789.m13398(this.f9711.w_().m10846());
                this.f9711.m14107().f10770.m13398(0);
                m10479();
                this.f9711.t_().m11713().m11605("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                m10502().m12045();
                try {
                    for (Long next : list) {
                        try {
                            r11 = m10502();
                            long longValue = next.longValue();
                            r11.y_();
                            r11.m10931();
                            if (r11.m12047().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            r11.t_().m11714().m11603("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f9716 == null || !this.f9716.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    m10502().m12030();
                    m10502().m12018();
                    this.f9716 = null;
                    if (!m10511().m11949() || !m10468()) {
                        this.f9710 = -1;
                        m10479();
                    } else {
                        m10506();
                    }
                    this.f9729 = 0;
                } catch (Throwable th3) {
                    m10502().m12018();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f9711.t_().m11714().m11603("Database error while trying to delete uploaded bundles", e3);
                this.f9729 = this.f9711.w_().m10847();
                this.f9711.t_().m11713().m11603("Disable upload, time", Long.valueOf(this.f9729));
            }
        } else {
            this.f9711.t_().m11713().m11605("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f9711.m14107().f10770.m13398(this.f9711.w_().m10846());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f9711.m14107().f10780.m13398(this.f9711.w_().m10846());
            }
            m10502().m12019(list);
            m10479();
        }
        this.f9722 = false;
        m10478();
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final boolean m10468() {
        m10469();
        m10508();
        return m10502().l_() || !TextUtils.isEmpty(m10502().m12054());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m10487(C2457 r11) {
        C0299 r6;
        m10469();
        if (!C1306.m8256() || !this.f9711.m14090().m13384(r11.m12610(), C2529.f11605)) {
            if (TextUtils.isEmpty(r11.m12597()) && TextUtils.isEmpty(r11.m12657())) {
                m10515(r11.m12610(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(r11.m12597()) && TextUtils.isEmpty(r11.m12648()) && TextUtils.isEmpty(r11.m12657())) {
            m10515(r11.m12610(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String r0 = this.f9711.m14090().m13383(r11);
        try {
            URL url = new URL(r0);
            this.f9711.t_().m11713().m11603("Fetching remote configuration", r11.m12610());
            C2363.C2365 r1 = m10514().m13758(r11.m12610());
            String r3 = m10514().m13756(r11.m12610());
            if (r1 == null || TextUtils.isEmpty(r3)) {
                r6 = null;
            } else {
                C0299 r12 = new C0299();
                r12.put("If-Modified-Since", r3);
                r6 = r12;
            }
            this.f9723 = true;
            C2286 r2 = m10511();
            String r32 = r11.m12610();
            C2012 r7 = new C2012(this);
            r2.y_();
            r2.m10931();
            C2745.C2746.m14555(url);
            C2745.C2746.m14555(r7);
            r2.u_().m13672((Runnable) new C2306(r2, r32, url, (byte[]) null, r6, r7));
        } catch (MalformedURLException unused) {
            this.f9711.t_().m11714().m11605("Failed to parse config URL. Not fetching. appId", C2244.m11698(r11.m12610()), r0);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0172 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10515(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m10469()
            r6.m10508()
            o.C2745.C2746.m14562((java.lang.String) r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0196 }
        L_0x000e:
            o.ѵı r1 = r6.f9711     // Catch:{ all -> 0x0196 }
            o.Іɛ r1 = r1.t_()     // Catch:{ all -> 0x0196 }
            o.ϵı r1 = r1.m11713()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r1.m11603(r2, r3)     // Catch:{ all -> 0x0196 }
            o.Іє r1 = r6.m10502()     // Catch:{ all -> 0x0196 }
            r1.m12045()     // Catch:{ all -> 0x0196 }
            o.Іє r1 = r6.m10502()     // Catch:{ all -> 0x018d }
            o.пı r1 = r1.m12038((java.lang.String) r7)     // Catch:{ all -> 0x018d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            o.ѵı r8 = r6.f9711     // Catch:{ all -> 0x018d }
            o.Іɛ r8 = r8.t_()     // Catch:{ all -> 0x018d }
            o.ϵı r8 = r8.A_()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = o.C2244.m11698(r7)     // Catch:{ all -> 0x018d }
            r8.m11603(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            o.ѵı r10 = r6.f9711     // Catch:{ all -> 0x018d }
            o.ιͽ r10 = r10.w_()     // Catch:{ all -> 0x018d }
            long r10 = r10.m10846()     // Catch:{ all -> 0x018d }
            r1.m12628((long) r10)     // Catch:{ all -> 0x018d }
            o.Іє r10 = r6.m10502()     // Catch:{ all -> 0x018d }
            r10.m12051((o.C2457) r1)     // Catch:{ all -> 0x018d }
            o.ѵı r10 = r6.f9711     // Catch:{ all -> 0x018d }
            o.Іɛ r10 = r10.t_()     // Catch:{ all -> 0x018d }
            o.ϵı r10 = r10.m11713()     // Catch:{ all -> 0x018d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            r10.m11605(r11, r1, r9)     // Catch:{ all -> 0x018d }
            o.іʄ r9 = r6.m10514()     // Catch:{ all -> 0x018d }
            r9.m13745(r7)     // Catch:{ all -> 0x018d }
            o.ѵı r7 = r6.f9711     // Catch:{ all -> 0x018d }
            o.Іւ r7 = r7.m14107()     // Catch:{ all -> 0x018d }
            o.ьΙ r7 = r7.f10770     // Catch:{ all -> 0x018d }
            o.ѵı r9 = r6.f9711     // Catch:{ all -> 0x018d }
            o.ιͽ r9 = r9.w_()     // Catch:{ all -> 0x018d }
            long r9 = r9.m10846()     // Catch:{ all -> 0x018d }
            r7.m13398(r9)     // Catch:{ all -> 0x018d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            o.ѵı r7 = r6.f9711     // Catch:{ all -> 0x018d }
            o.Іւ r7 = r7.m14107()     // Catch:{ all -> 0x018d }
            o.ьΙ r7 = r7.f10780     // Catch:{ all -> 0x018d }
            o.ѵı r8 = r6.f9711     // Catch:{ all -> 0x018d }
            o.ιͽ r8 = r8.w_()     // Catch:{ all -> 0x018d }
            long r8 = r8.m10846()     // Catch:{ all -> 0x018d }
            r7.m13398(r8)     // Catch:{ all -> 0x018d }
        L_0x00c5:
            r6.m10479()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x018d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x018d }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x018d }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x018d }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            o.іʄ r9 = r6.m10514()     // Catch:{ all -> 0x018d }
            boolean r9 = r9.m13757(r7, r10, r11)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            o.Іє r7 = r6.m10502()     // Catch:{ all -> 0x0196 }
            r7.m12018()     // Catch:{ all -> 0x0196 }
            r6.f9723 = r0
            r6.m10478()
            return
        L_0x0103:
            o.іʄ r11 = r6.m10514()     // Catch:{ all -> 0x018d }
            o.Л$ı r11 = r11.m13758(r7)     // Catch:{ all -> 0x018d }
            if (r11 != 0) goto L_0x0124
            o.іʄ r11 = r6.m10514()     // Catch:{ all -> 0x018d }
            boolean r9 = r11.m13757(r7, r9, r9)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            o.Іє r7 = r6.m10502()     // Catch:{ all -> 0x0196 }
            r7.m12018()     // Catch:{ all -> 0x0196 }
            r6.f9723 = r0
            r6.m10478()
            return
        L_0x0124:
            o.ѵı r9 = r6.f9711     // Catch:{ all -> 0x018d }
            o.ιͽ r9 = r9.w_()     // Catch:{ all -> 0x018d }
            long r2 = r9.m10846()     // Catch:{ all -> 0x018d }
            r1.m12606(r2)     // Catch:{ all -> 0x018d }
            o.Іє r9 = r6.m10502()     // Catch:{ all -> 0x018d }
            r9.m12051((o.C2457) r1)     // Catch:{ all -> 0x018d }
            if (r8 != r5) goto L_0x014a
            o.ѵı r8 = r6.f9711     // Catch:{ all -> 0x018d }
            o.Іɛ r8 = r8.t_()     // Catch:{ all -> 0x018d }
            o.ϵı r8 = r8.m11708()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.m11603(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0162
        L_0x014a:
            o.ѵı r7 = r6.f9711     // Catch:{ all -> 0x018d }
            o.Іɛ r7 = r7.t_()     // Catch:{ all -> 0x018d }
            o.ϵı r7 = r7.m11713()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            int r10 = r10.length     // Catch:{ all -> 0x018d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x018d }
            r7.m11605(r9, r8, r10)     // Catch:{ all -> 0x018d }
        L_0x0162:
            o.Іε r7 = r6.m10511()     // Catch:{ all -> 0x018d }
            boolean r7 = r7.m11949()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            boolean r7 = r6.m10468()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            r6.m10506()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x0176:
            r6.m10479()     // Catch:{ all -> 0x018d }
        L_0x0179:
            o.Іє r7 = r6.m10502()     // Catch:{ all -> 0x018d }
            r7.m12030()     // Catch:{ all -> 0x018d }
            o.Іє r7 = r6.m10502()     // Catch:{ all -> 0x0196 }
            r7.m12018()     // Catch:{ all -> 0x0196 }
            r6.f9723 = r0
            r6.m10478()
            return
        L_0x018d:
            r7 = move-exception
            o.Іє r8 = r6.m10502()     // Catch:{ all -> 0x0196 }
            r8.m12018()     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            r6.f9723 = r0
            r6.m10478()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10515(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ab  */
    /* renamed from: ɼ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10479() {
        /*
            r21 = this;
            r0 = r21
            r21.m10469()
            r21.m10508()
            long r1 = r0.f9729
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            o.ѵı r1 = r0.f9711
            o.ιͽ r1 = r1.w_()
            long r1 = r1.m10847()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f9729
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            o.ѵı r1 = r0.f9711
            o.Іɛ r1 = r1.t_()
            o.ϵı r1 = r1.m11713()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.m11603(r3, r2)
            o.Із r1 = r21.m10471()
            r1.m11986()
            o.Φ r1 = r21.m10467()
            r1.m10458()
            return
        L_0x004b:
            r0.f9729 = r3
        L_0x004d:
            o.ѵı r1 = r0.f9711
            boolean r1 = r1.m14106()
            if (r1 == 0) goto L_0x0256
            boolean r1 = r21.m10468()
            if (r1 != 0) goto L_0x005d
            goto L_0x0256
        L_0x005d:
            o.ѵı r1 = r0.f9711
            o.ιͽ r1 = r1.w_()
            long r1 = r1.m10846()
            o.ιͱ<java.lang.Long> r5 = o.C2529.f11530
            r6 = 0
            java.lang.Object r5 = r5.m10833(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            o.Іє r5 = r21.m10502()
            boolean r5 = r5.m_()
            if (r5 != 0) goto L_0x008f
            o.Іє r5 = r21.m10502()
            boolean r5 = r5.h_()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00cc
            o.ѵı r10 = r0.f9711
            o.ьɹ r10 = r10.m14090()
            java.lang.String r10 = r10.m13380()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bb
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bb
            o.ιͱ<java.lang.Long> r10 = o.C2529.f11511
            java.lang.Object r10 = r10.m10833(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00bb:
            o.ιͱ<java.lang.Long> r10 = o.C2529.f11508
            java.lang.Object r10 = r10.m10833(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00cc:
            o.ιͱ<java.lang.Long> r10 = o.C2529.f11548
            java.lang.Object r10 = r10.m10833(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00dc:
            o.ѵı r12 = r0.f9711
            o.Іւ r12 = r12.m14107()
            o.ьΙ r12 = r12.f10789
            long r12 = r12.m13399()
            o.ѵı r14 = r0.f9711
            o.Іւ r14 = r14.m14107()
            o.ьΙ r14 = r14.f10770
            long r14 = r14.m13399()
            o.Іє r16 = r21.m10502()
            r17 = r10
            long r9 = r16.j_()
            o.Іє r11 = r21.m10502()
            r19 = r7
            long r6 = r11.k_()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0113
        L_0x0110:
            r8 = r3
            goto L_0x0189
        L_0x0113:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0139
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0139
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0139:
            o.ιս r5 = r21.m10496()
            r12 = r17
            boolean r5 = r5.m11116((long) r8, (long) r12)
            if (r5 != 0) goto L_0x0147
            long r8 = r8 + r12
            goto L_0x0148
        L_0x0147:
            r8 = r10
        L_0x0148:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0189
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0189
            r5 = 0
        L_0x0151:
            r6 = 20
            o.ιͱ<java.lang.Integer> r7 = o.C2529.f11543
            r10 = 0
            java.lang.Object r7 = r7.m10833(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0110
            r6 = 1
            long r6 = r6 << r5
            o.ιͱ<java.lang.Long> r12 = o.C2529.f11545
            java.lang.Object r12 = r12.m10833(r10)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r8 = r8 + r12
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            int r5 = r5 + 1
            goto L_0x0151
        L_0x0189:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01ab
            o.ѵı r1 = r0.f9711
            o.Іɛ r1 = r1.t_()
            o.ϵı r1 = r1.m11713()
            java.lang.String r2 = "Next upload time is 0"
            r1.m11606(r2)
            o.Із r1 = r21.m10471()
            r1.m11986()
            o.Φ r1 = r21.m10467()
            r1.m10458()
            return
        L_0x01ab:
            o.Іε r1 = r21.m10511()
            boolean r1 = r1.m11949()
            if (r1 != 0) goto L_0x01d3
            o.ѵı r1 = r0.f9711
            o.Іɛ r1 = r1.t_()
            o.ϵı r1 = r1.m11713()
            java.lang.String r2 = "No network"
            r1.m11606(r2)
            o.Із r1 = r21.m10471()
            r1.m11987()
            o.Φ r1 = r21.m10467()
            r1.m10458()
            return
        L_0x01d3:
            o.ѵı r1 = r0.f9711
            o.Іւ r1 = r1.m14107()
            o.ьΙ r1 = r1.f10780
            long r1 = r1.m13399()
            o.ιͱ<java.lang.Long> r5 = o.C2529.f11558
            r6 = 0
            java.lang.Object r5 = r5.m10833(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            o.ιս r7 = r21.m10496()
            boolean r7 = r7.m11116((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01ff
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x01ff:
            o.Із r1 = r21.m10471()
            r1.m11986()
            o.ѵı r1 = r0.f9711
            o.ιͽ r1 = r1.w_()
            long r1 = r1.m10846()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x023b
            o.ιͱ<java.lang.Long> r1 = o.C2529.f11550
            r2 = 0
            java.lang.Object r1 = r1.m10833(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            o.ѵı r1 = r0.f9711
            o.Іւ r1 = r1.m14107()
            o.ьΙ r1 = r1.f10789
            o.ѵı r2 = r0.f9711
            o.ιͽ r2 = r2.w_()
            long r2 = r2.m10846()
            r1.m13398(r2)
        L_0x023b:
            o.ѵı r1 = r0.f9711
            o.Іɛ r1 = r1.t_()
            o.ϵı r1 = r1.m11713()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.m11603(r3, r2)
            o.Φ r1 = r21.m10467()
            r1.m10454(r8)
            return
        L_0x0256:
            o.ѵı r1 = r0.f9711
            o.Іɛ r1 = r1.t_()
            o.ϵı r1 = r1.m11713()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.m11606(r2)
            o.Із r1 = r21.m10471()
            r1.m11986()
            o.Φ r1 = r21.m10467()
            r1.m10458()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10479():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10499(Runnable runnable) {
        m10469();
        if (this.f9721 == null) {
            this.f9721 = new ArrayList();
        }
        this.f9721.add(runnable);
    }

    /* renamed from: ɺ  reason: contains not printable characters */
    private final void m10478() {
        m10469();
        if (this.f9723 || this.f9722 || this.f9709) {
            this.f9711.t_().m11713().m11604("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f9723), Boolean.valueOf(this.f9722), Boolean.valueOf(this.f9709));
            return;
        }
        this.f9711.t_().m11713().m11606("Stopping uploading service(s)");
        List<Runnable> list = this.f9721;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f9721.clear();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final Boolean m10481(C2457 r9) {
        try {
            if (r9.m12660() != -2147483648L) {
                if (r9.m12660() == ((long) C2059.m10962(this.f9711.m14117()).m12204(r9.m12610(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = C2059.m10962(this.f9711.m14117()).m12204(r9.m12610(), 0).versionName;
                if (r9.m12614() != null && r9.m12614().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m10501() {
        m10469();
        m10508();
        if (!this.f9719) {
            this.f9719 = true;
            if (m10472()) {
                int r0 = m10463(this.f9712);
                int r1 = this.f9711.m14105().m11205();
                m10469();
                if (r0 > r1) {
                    this.f9711.t_().m11714().m11605("Panic: can't downgrade version. Previous, current version", Integer.valueOf(r0), Integer.valueOf(r1));
                } else if (r0 >= r1) {
                } else {
                    if (m10476(r1, this.f9712)) {
                        this.f9711.t_().m11713().m11605("Storage version upgraded. Previous, current version", Integer.valueOf(r0), Integer.valueOf(r1));
                    } else {
                        this.f9711.t_().m11714().m11605("Storage version upgrade failed. Previous, current version", Integer.valueOf(r0), Integer.valueOf(r1));
                    }
                }
            }
        }
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    private final boolean m10472() {
        FileLock fileLock;
        m10469();
        if (!this.f9711.m14090().m13372(C2529.f11604) || (fileLock = this.f9726) == null || !fileLock.isValid()) {
            try {
                this.f9712 = new RandomAccessFile(new File(this.f9711.m14117().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f9726 = this.f9712.tryLock();
                if (this.f9726 != null) {
                    this.f9711.t_().m11713().m11606("Storage concurrent access okay");
                    return true;
                }
                this.f9711.t_().m11714().m11606("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                this.f9711.t_().m11714().m11603("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                this.f9711.t_().m11714().m11603("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                this.f9711.t_().A_().m11603("Storage lock already acquired", e3);
                return false;
            }
        } else {
            this.f9711.t_().m11713().m11606("Storage concurrent access okay");
            return true;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final int m10463(FileChannel fileChannel) {
        m10469();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f9711.t_().m11714().m11606("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f9711.t_().A_().m11603("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            this.f9711.t_().m11714().m11603("Failed to read from channel", e);
            return 0;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m10476(int i, FileChannel fileChannel) {
        m10469();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f9711.t_().m11714().m11606("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.f9711.m14090().m13372(C2529.f11537) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f9711.t_().m11714().m11603("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f9711.t_().m11714().m11603("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10500(C2270 r13) {
        if (this.f9713 != null) {
            this.f9716 = new ArrayList();
            this.f9716.addAll(this.f9713);
        }
        C2309 r1 = m10502();
        String str = r13.f10610;
        C2745.C2746.m14562(str);
        r1.y_();
        r1.m10931();
        try {
            SQLiteDatabase r3 = r1.m12047();
            String[] strArr = {str};
            int delete = r3.delete("apps", "app_id=?", strArr) + 0 + r3.delete("events", "app_id=?", strArr) + r3.delete("user_attributes", "app_id=?", strArr) + r3.delete("conditional_properties", "app_id=?", strArr) + r3.delete("raw_events", "app_id=?", strArr) + r3.delete("raw_events_metadata", "app_id=?", strArr) + r3.delete("queue", "app_id=?", strArr) + r3.delete("audience_filter_values", "app_id=?", strArr) + r3.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                r1.t_().m11713().m11605("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            r1.t_().m11714().m11605("Error resetting analytics data. appId, error", C2244.m11698(str), e);
        }
        if (!C0992.m7022() || !this.f9711.m14090().m13372(C2529.f11503)) {
            C2270 r0 = m10482(this.f9711.m14117(), r13.f10610, r13.f10620, r13.f10625, r13.f10614, r13.f10623, r13.f10616, r13.f10606, r13.f10609);
            if (r13.f10625) {
                m10503(r0);
            }
        } else if (r13.f10625) {
            m10503(r13);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2270 m10482(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3, String str4) {
        String str5;
        String str6;
        int i;
        String str7 = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f9711.t_().m11714().m11606("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str5 = packageManager.getInstallerPackageName(str7);
        } catch (IllegalArgumentException unused) {
            this.f9711.t_().m11714().m11603("Error retrieving installer package name. appId", C2244.m11698(str));
            str5 = "Unknown";
        }
        if (str5 == null) {
            str5 = "manual_install";
        } else if ("com.android.vending".equals(str5)) {
            str5 = "";
        }
        String str8 = str5;
        try {
            PackageInfo r3 = C2059.m10962(context).m12204(str7, 0);
            if (r3 != null) {
                CharSequence r5 = C2059.m10962(context).m12206(str7);
                if (!TextUtils.isEmpty(r5)) {
                    String charSequence = r5.toString();
                }
                str6 = r3.versionName;
                i = r3.versionCode;
            } else {
                str6 = "Unknown";
                i = RecyclerView.UNDEFINED_DURATION;
            }
            return new C2270(str, str2, str6, (long) i, str8, this.f9711.m14090().m13369(), this.f9711.m14116().m11379(context, str7), (String) null, z, false, "", 0, j, 0, z2, z3, false, str3, (Boolean) null, 0, (List<String>) null, (!C1306.m8256() || !this.f9711.m14090().m13384(str7, C2529.f11605)) ? null : str4);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.f9711.t_().m11714().m11605("Error retrieving newly installed package info. appId, appName", C2244.m11698(str), "Unknown");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10512(C2113 r13, C2270 r14) {
        C2440 r3;
        m10469();
        m10508();
        if (m10490(r14)) {
            if (!r14.f10625) {
                m10491(r14);
                return;
            }
            int r4 = this.f9711.m14116().m11400(r13.f10236);
            if (r4 != 0) {
                this.f9711.m14116();
                this.f9711.m14116().m11382(r14.f10610, r4, "_ev", C2151.m11338(r13.f10236, 24, true), r13.f10236 != null ? r13.f10236.length() : 0);
                return;
            }
            int r8 = this.f9711.m14116().m11388(r13.f10236, r13.m11268());
            if (r8 != 0) {
                this.f9711.m14116();
                String r10 = C2151.m11338(r13.f10236, 24, true);
                Object r132 = r13.m11268();
                this.f9711.m14116().m11382(r14.f10610, r8, "_ev", r10, (r132 == null || (!(r132 instanceof String) && !(r132 instanceof CharSequence))) ? 0 : String.valueOf(r132).length());
                return;
            }
            Object r0 = this.f9711.m14116().m11371(r13.f10236, r13.m11268());
            if (r0 != null) {
                if ("_sid".equals(r13.f10236) && this.f9711.m14090().m13384(r14.f10610, C2529.f11554)) {
                    long j = r13.f10232;
                    String str = r13.f10235;
                    long j2 = 0;
                    C2152 r32 = m10502().m12029(r14.f10610, "_sno");
                    if (r32 == null || !(r32.f10314 instanceof Long)) {
                        if (r32 != null) {
                            this.f9711.t_().A_().m11603("Retrieved last session number from database does not contain a valid (long) value", r32.f10314);
                        }
                        if (this.f9711.m14090().m13384(r14.f10610, C2529.f11586) && (r3 = m10502().m12050(r14.f10610, "_s")) != null) {
                            j2 = r3.f11079;
                            this.f9711.t_().m11713().m11603("Backfill the session number. Last used session number", Long.valueOf(j2));
                        }
                    } else {
                        j2 = ((Long) r32.f10314).longValue();
                    }
                    m10512(new C2113("_sno", j, Long.valueOf(j2 + 1), str), r14);
                }
                C2152 r33 = new C2152(r14.f10610, r13.f10235, r13.f10236, r13.f10232, r0);
                if (!C1140.m7582() || !this.f9711.m14090().m13384(r14.f10610, C2529.f11567)) {
                    this.f9711.t_().m11711().m11605("Setting user property", this.f9711.m14115().m11222(r33.f10313), r0);
                } else {
                    this.f9711.t_().m11713().m11605("Setting user property", this.f9711.m14115().m11222(r33.f10313), r0);
                }
                m10502().m12045();
                try {
                    m10491(r14);
                    boolean r133 = m10502().m12021(r33);
                    m10502().m12030();
                    if (!r133) {
                        this.f9711.t_().m11714().m11605("Too many unique user properties are set. Ignoring user property", this.f9711.m14115().m11222(r33.f10313), r33.f10314);
                        this.f9711.m14116().m11382(r14.f10610, 9, (String) null, (String) null, 0);
                    } else if (!C1140.m7582() || !this.f9711.m14090().m13384(r14.f10610, C2529.f11567)) {
                        this.f9711.t_().m11711().m11605("User property set", this.f9711.m14115().m11222(r33.f10313), r33.f10314);
                    }
                } finally {
                    m10502().m12018();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10494(C2113 r8, C2270 r9) {
        m10469();
        m10508();
        if (m10490(r9)) {
            if (!r9.f10625) {
                m10491(r9);
            } else if (!this.f9711.m14090().m13384(r9.f10610, C2529.f11526)) {
                this.f9711.t_().m11711().m11603("Removing user property", this.f9711.m14115().m11222(r8.f10236));
                m10502().m12045();
                try {
                    m10491(r9);
                    m10502().m12046(r9.f10610, r8.f10236);
                    m10502().m12030();
                    this.f9711.t_().m11711().m11603("User property removed", this.f9711.m14115().m11222(r8.f10236));
                } finally {
                    m10502().m12018();
                }
            } else if (!"_npa".equals(r8.f10236) || r9.f10607 == null) {
                this.f9711.t_().m11711().m11603("Removing user property", this.f9711.m14115().m11222(r8.f10236));
                m10502().m12045();
                try {
                    m10491(r9);
                    m10502().m12046(r9.f10610, r8.f10236);
                    m10502().m12030();
                    this.f9711.t_().m11711().m11603("User property removed", this.f9711.m14115().m11222(r8.f10236));
                } finally {
                    m10502().m12018();
                }
            } else {
                this.f9711.t_().m11711().m11606("Falling back to manifest metadata value for ad personalization");
                m10512(new C2113("_npa", this.f9711.w_().m10846(), Long.valueOf(r9.f10607.booleanValue() ? 1 : 0), "auto"), r9);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10493(C2042 r1) {
        this.f9717++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɿ  reason: contains not printable characters */
    public final void m10509() {
        this.f9708++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ł  reason: contains not printable characters */
    public final C2658 m10495() {
        return this.f9711;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04b2 A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01eb A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021f A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0221 A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0225 A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248 A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024f A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x025c A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026f A[Catch:{ NameNotFoundException -> 0x0348, all -> 0x04dd }] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10503(o.C2270 r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sys"
            java.lang.String r4 = "_pfo"
            java.lang.String r5 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.m10469()
            r21.m10508()
            o.C2745.C2746.m14555(r22)
            java.lang.String r6 = r2.f10610
            o.C2745.C2746.m14562((java.lang.String) r6)
            boolean r6 = r21.m10490((o.C2270) r22)
            if (r6 != 0) goto L_0x0021
            return
        L_0x0021:
            o.Іє r6 = r21.m10502()
            java.lang.String r7 = r2.f10610
            o.пı r6 = r6.m12038((java.lang.String) r7)
            r7 = 0
            if (r6 == 0) goto L_0x0054
            java.lang.String r9 = r6.m12597()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0054
            java.lang.String r9 = r2.f10620
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0054
            r6.m12606(r7)
            o.Іє r9 = r21.m10502()
            r9.m12051((o.C2457) r6)
            o.іʄ r6 = r21.m10514()
            java.lang.String r9 = r2.f10610
            r6.m13749((java.lang.String) r9)
        L_0x0054:
            boolean r6 = r2.f10625
            if (r6 != 0) goto L_0x005c
            r21.m10491((o.C2270) r22)
            return
        L_0x005c:
            long r9 = r2.f10616
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x006c
            o.ѵı r6 = r1.f9711
            o.ιͽ r6 = r6.w_()
            long r9 = r6.m10846()
        L_0x006c:
            o.ѵı r6 = r1.f9711
            o.ьɹ r6 = r6.m14090()
            java.lang.String r11 = r2.f10610
            o.ιͱ<java.lang.Boolean> r12 = o.C2529.f11526
            boolean r6 = r6.m13384(r11, r12)
            if (r6 == 0) goto L_0x0085
            o.ѵı r6 = r1.f9711
            o.ЈЈ r6 = r6.m14088()
            r6.z_()
        L_0x0085:
            int r6 = r2.f10611
            r15 = 0
            r13 = 1
            if (r6 == 0) goto L_0x00a7
            if (r6 == r13) goto L_0x00a7
            o.ѵı r11 = r1.f9711
            o.Іɛ r11 = r11.t_()
            o.ϵı r11 = r11.A_()
            java.lang.String r12 = r2.f10610
            java.lang.Object r12 = o.C2244.m11698(r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r11.m11605(r14, r12, r6)
            r6 = 0
        L_0x00a7:
            o.Іє r11 = r21.m10502()
            r11.m12045()
            o.ѵı r11 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.ьɹ r11 = r11.m14090()     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = r2.f10610     // Catch:{ all -> 0x04dd }
            o.ιͱ<java.lang.Boolean> r14 = o.C2529.f11526     // Catch:{ all -> 0x04dd }
            boolean r11 = r11.m13384(r12, r14)     // Catch:{ all -> 0x04dd }
            if (r11 == 0) goto L_0x0127
            o.Іє r11 = r21.m10502()     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = r2.f10610     // Catch:{ all -> 0x04dd }
            java.lang.String r14 = "_npa"
            o.ϜІ r14 = r11.m12029((java.lang.String) r12, (java.lang.String) r14)     // Catch:{ all -> 0x04dd }
            if (r14 == 0) goto L_0x00d6
            java.lang.String r11 = "auto"
            java.lang.String r12 = r14.f10315     // Catch:{ all -> 0x04dd }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x04dd }
            if (r11 == 0) goto L_0x0127
        L_0x00d6:
            java.lang.Boolean r11 = r2.f10607     // Catch:{ all -> 0x04dd }
            if (r11 == 0) goto L_0x0111
            o.πı r12 = new o.πı     // Catch:{ all -> 0x04dd }
            java.lang.String r16 = "_npa"
            java.lang.Boolean r11 = r2.f10607     // Catch:{ all -> 0x04dd }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x04dd }
            if (r11 == 0) goto L_0x00e9
            r17 = 1
            goto L_0x00eb
        L_0x00e9:
            r17 = 0
        L_0x00eb:
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x04dd }
            java.lang.String r18 = "auto"
            r11 = r12
            r7 = r12
            r12 = r16
            r19 = r3
            r8 = r14
            r3 = 1
            r13 = r9
            r15 = r17
            r16 = r18
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04dd }
            if (r8 == 0) goto L_0x010d
            java.lang.Object r8 = r8.f10314     // Catch:{ all -> 0x04dd }
            java.lang.Long r11 = r7.f10234     // Catch:{ all -> 0x04dd }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x04dd }
            if (r8 != 0) goto L_0x012a
        L_0x010d:
            r1.m10512((o.C2113) r7, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            goto L_0x012a
        L_0x0111:
            r19 = r3
            r8 = r14
            r3 = 1
            if (r8 == 0) goto L_0x012a
            o.πı r7 = new o.πı     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_npa"
            r15 = 0
            java.lang.String r16 = "auto"
            r11 = r7
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04dd }
            r1.m10494((o.C2113) r7, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            goto L_0x012a
        L_0x0127:
            r19 = r3
            r3 = 1
        L_0x012a:
            o.Іє r7 = r21.m10502()     // Catch:{ all -> 0x04dd }
            java.lang.String r8 = r2.f10610     // Catch:{ all -> 0x04dd }
            o.пı r7 = r7.m12038((java.lang.String) r8)     // Catch:{ all -> 0x04dd }
            if (r7 == 0) goto L_0x01e8
            o.ѵı r11 = r1.f9711     // Catch:{ all -> 0x04dd }
            r11.m14116()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = r2.f10620     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = r7.m12597()     // Catch:{ all -> 0x04dd }
            java.lang.String r13 = r2.f10606     // Catch:{ all -> 0x04dd }
            java.lang.String r14 = r7.m12657()     // Catch:{ all -> 0x04dd }
            boolean r11 = o.C2151.m11358((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x04dd }
            if (r11 == 0) goto L_0x01e8
            o.ѵı r11 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.Іɛ r11 = r11.t_()     // Catch:{ all -> 0x04dd }
            o.ϵı r11 = r11.A_()     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r7.m12610()     // Catch:{ all -> 0x04dd }
            java.lang.Object r13 = o.C2244.m11698(r13)     // Catch:{ all -> 0x04dd }
            r11.m11603(r12, r13)     // Catch:{ all -> 0x04dd }
            o.Іє r11 = r21.m10502()     // Catch:{ all -> 0x04dd }
            java.lang.String r7 = r7.m12610()     // Catch:{ all -> 0x04dd }
            r11.m10931()     // Catch:{ all -> 0x04dd }
            r11.y_()     // Catch:{ all -> 0x04dd }
            o.C2745.C2746.m14562((java.lang.String) r7)     // Catch:{ all -> 0x04dd }
            android.database.sqlite.SQLiteDatabase r12 = r11.m12047()     // Catch:{ SQLiteException -> 0x01d3 }
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01d3 }
            r15 = 0
            r13[r15] = r7     // Catch:{ SQLiteException -> 0x01d1 }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r15
            java.lang.String r8 = "user_attributes"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "conditional_properties"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "apps"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events_metadata"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "event_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "property_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "audience_filter_values"
            int r0 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e6
            o.Іɛ r0 = r11.t_()     // Catch:{ SQLiteException -> 0x01d1 }
            o.ϵı r0 = r0.m11713()     // Catch:{ SQLiteException -> 0x01d1 }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01d1 }
            r0.m11605(r8, r7, r12)     // Catch:{ SQLiteException -> 0x01d1 }
            goto L_0x01e6
        L_0x01d1:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d3:
            r0 = move-exception
            r15 = 0
        L_0x01d5:
            o.Іɛ r8 = r11.t_()     // Catch:{ all -> 0x04dd }
            o.ϵı r8 = r8.m11714()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = "Error deleting application data. appId, error"
            java.lang.Object r7 = o.C2244.m11698(r7)     // Catch:{ all -> 0x04dd }
            r8.m11605(r11, r7, r0)     // Catch:{ all -> 0x04dd }
        L_0x01e6:
            r7 = 0
            goto L_0x01e9
        L_0x01e8:
            r15 = 0
        L_0x01e9:
            if (r7 == 0) goto L_0x0248
            long r11 = r7.m12660()     // Catch:{ all -> 0x04dd }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0203
            long r11 = r7.m12660()     // Catch:{ all -> 0x04dd }
            r8 = r4
            long r3 = r2.f10608     // Catch:{ all -> 0x04dd }
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0204
            r0 = 1
            goto L_0x0205
        L_0x0203:
            r8 = r4
        L_0x0204:
            r0 = 0
        L_0x0205:
            long r3 = r7.m12660()     // Catch:{ all -> 0x04dd }
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0221
            java.lang.String r3 = r7.m12614()     // Catch:{ all -> 0x04dd }
            if (r3 == 0) goto L_0x0221
            java.lang.String r3 = r7.m12614()     // Catch:{ all -> 0x04dd }
            java.lang.String r4 = r2.f10613     // Catch:{ all -> 0x04dd }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04dd }
            if (r3 != 0) goto L_0x0221
            r3 = 1
            goto L_0x0222
        L_0x0221:
            r3 = 0
        L_0x0222:
            r0 = r0 | r3
            if (r0 == 0) goto L_0x0249
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04dd }
            r0.<init>()     // Catch:{ all -> 0x04dd }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r7.m12614()     // Catch:{ all -> 0x04dd }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04dd }
            o.кǃ r3 = new o.кǃ     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_au"
            o.зι r13 = new o.зι     // Catch:{ all -> 0x04dd }
            r13.<init>(r0)     // Catch:{ all -> 0x04dd }
            java.lang.String r14 = "auto"
            r11 = r3
            r4 = 0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04dd }
            r1.m10517((o.C2441) r3, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            goto L_0x024a
        L_0x0248:
            r8 = r4
        L_0x0249:
            r4 = 0
        L_0x024a:
            r21.m10491((o.C2270) r22)     // Catch:{ all -> 0x04dd }
            if (r6 != 0) goto L_0x025c
            o.Іє r0 = r21.m10502()     // Catch:{ all -> 0x04dd }
            java.lang.String r3 = r2.f10610     // Catch:{ all -> 0x04dd }
            java.lang.String r7 = "_f"
            o.кı r0 = r0.m12050((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ all -> 0x04dd }
            goto L_0x026d
        L_0x025c:
            r3 = 1
            if (r6 != r3) goto L_0x026c
            o.Іє r0 = r21.m10502()     // Catch:{ all -> 0x04dd }
            java.lang.String r3 = r2.f10610     // Catch:{ all -> 0x04dd }
            java.lang.String r7 = "_v"
            o.кı r0 = r0.m12050((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ all -> 0x04dd }
            goto L_0x026d
        L_0x026c:
            r0 = 0
        L_0x026d:
            if (r0 != 0) goto L_0x04b2
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r13 = r9 / r11
            r15 = 1
            long r13 = r13 + r15
            long r13 = r13 * r11
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r7 = "_c"
            java.lang.String r15 = "_et"
            if (r6 != 0) goto L_0x0415
            o.πı r6 = new o.πı     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04dd }
            java.lang.String r20 = "auto"
            r11 = r6
            r13 = r9
            r4 = r15
            r15 = r16
            r16 = r20
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04dd }
            r1.m10512((o.C2113) r6, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            o.ѵı r6 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.ьɹ r6 = r6.m14090()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = r2.f10620     // Catch:{ all -> 0x04dd }
            o.ιͱ<java.lang.Boolean> r12 = o.C2529.f11556     // Catch:{ all -> 0x04dd }
            boolean r6 = r6.m13384(r11, r12)     // Catch:{ all -> 0x04dd }
            if (r6 == 0) goto L_0x02b8
            r21.m10469()     // Catch:{ all -> 0x04dd }
            o.ѵı r6 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.кɩ r6 = r6.m14112()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = r2.f10610     // Catch:{ all -> 0x04dd }
            r6.m12557(r11)     // Catch:{ all -> 0x04dd }
        L_0x02b8:
            r21.m10469()     // Catch:{ all -> 0x04dd }
            r21.m10508()     // Catch:{ all -> 0x04dd }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x04dd }
            r6.<init>()     // Catch:{ all -> 0x04dd }
            r11 = 1
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04dd }
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04dd }
            r11 = 0
            r6.putLong(r5, r11)     // Catch:{ all -> 0x04dd }
            r6.putLong(r8, r11)     // Catch:{ all -> 0x04dd }
            r3 = r19
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04dd }
            java.lang.String r7 = "_sysu"
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04dd }
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.ьɹ r7 = r7.m14090()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = r2.f10610     // Catch:{ all -> 0x04dd }
            o.ιͱ<java.lang.Boolean> r12 = o.C2529.f11516     // Catch:{ all -> 0x04dd }
            boolean r7 = r7.m13384(r11, r12)     // Catch:{ all -> 0x04dd }
            r11 = 1
            if (r7 == 0) goto L_0x02f2
            r6.putLong(r4, r11)     // Catch:{ all -> 0x04dd }
        L_0x02f2:
            boolean r7 = r2.f10619     // Catch:{ all -> 0x04dd }
            if (r7 == 0) goto L_0x02f9
            r6.putLong(r0, r11)     // Catch:{ all -> 0x04dd }
        L_0x02f9:
            o.Іє r0 = r21.m10502()     // Catch:{ all -> 0x04dd }
            java.lang.String r7 = r2.f10610     // Catch:{ all -> 0x04dd }
            o.C2745.C2746.m14562((java.lang.String) r7)     // Catch:{ all -> 0x04dd }
            r0.y_()     // Catch:{ all -> 0x04dd }
            r0.m10931()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = "first_open_count"
            long r13 = r0.m12024(r7, r11)     // Catch:{ all -> 0x04dd }
            o.ѵı r0 = r1.f9711     // Catch:{ all -> 0x04dd }
            android.content.Context r0 = r0.m14117()     // Catch:{ all -> 0x04dd }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04dd }
            if (r0 != 0) goto L_0x0336
            o.ѵı r0 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.Іɛ r0 = r0.t_()     // Catch:{ all -> 0x04dd }
            o.ϵı r0 = r0.m11714()     // Catch:{ all -> 0x04dd }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r5 = r2.f10610     // Catch:{ all -> 0x04dd }
            java.lang.Object r5 = o.C2244.m11698(r5)     // Catch:{ all -> 0x04dd }
            r0.m11603(r3, r5)     // Catch:{ all -> 0x04dd }
            r19 = r8
            r7 = r13
        L_0x0332:
            r11 = 0
            goto L_0x03f8
        L_0x0336:
            o.ѵı r0 = r1.f9711     // Catch:{ NameNotFoundException -> 0x0348 }
            android.content.Context r0 = r0.m14117()     // Catch:{ NameNotFoundException -> 0x0348 }
            o.Јӏ r0 = o.C2059.m10962(r0)     // Catch:{ NameNotFoundException -> 0x0348 }
            java.lang.String r7 = r2.f10610     // Catch:{ NameNotFoundException -> 0x0348 }
            r11 = 0
            android.content.pm.PackageInfo r0 = r0.m12204(r7, r11)     // Catch:{ NameNotFoundException -> 0x0348 }
            goto L_0x035f
        L_0x0348:
            r0 = move-exception
            o.ѵı r7 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.Іɛ r7 = r7.t_()     // Catch:{ all -> 0x04dd }
            o.ϵı r7 = r7.m11714()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.f10610     // Catch:{ all -> 0x04dd }
            java.lang.Object r12 = o.C2244.m11698(r12)     // Catch:{ all -> 0x04dd }
            r7.m11605(r11, r12, r0)     // Catch:{ all -> 0x04dd }
            r0 = 0
        L_0x035f:
            if (r0 == 0) goto L_0x03b0
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04dd }
            r15 = 0
            int r7 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x03b0
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04dd }
            r19 = r8
            long r7 = r0.lastUpdateTime     // Catch:{ all -> 0x04dd }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0394
            o.ѵı r0 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.ьɹ r0 = r0.m14090()     // Catch:{ all -> 0x04dd }
            o.ιͱ<java.lang.Boolean> r7 = o.C2529.f11518     // Catch:{ all -> 0x04dd }
            boolean r0 = r0.m13372((o.C2019<java.lang.Boolean>) r7)     // Catch:{ all -> 0x04dd }
            if (r0 == 0) goto L_0x038d
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0392
            r7 = 1
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04dd }
            goto L_0x0392
        L_0x038d:
            r7 = 1
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04dd }
        L_0x0392:
            r0 = 0
            goto L_0x0395
        L_0x0394:
            r0 = 1
        L_0x0395:
            o.πı r5 = new o.πı     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_fi"
            if (r0 == 0) goto L_0x039e
            r7 = 1
            goto L_0x03a0
        L_0x039e:
            r7 = 0
        L_0x03a0:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04dd }
            java.lang.String r16 = "auto"
            r11 = r5
            r7 = r13
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04dd }
            r1.m10512((o.C2113) r5, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            goto L_0x03b3
        L_0x03b0:
            r19 = r8
            r7 = r13
        L_0x03b3:
            o.ѵı r0 = r1.f9711     // Catch:{ NameNotFoundException -> 0x03c5 }
            android.content.Context r0 = r0.m14117()     // Catch:{ NameNotFoundException -> 0x03c5 }
            o.Јӏ r0 = o.C2059.m10962(r0)     // Catch:{ NameNotFoundException -> 0x03c5 }
            java.lang.String r5 = r2.f10610     // Catch:{ NameNotFoundException -> 0x03c5 }
            r11 = 0
            android.content.pm.ApplicationInfo r0 = r0.m12203(r5, r11)     // Catch:{ NameNotFoundException -> 0x03c5 }
            goto L_0x03dc
        L_0x03c5:
            r0 = move-exception
            o.ѵı r5 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.Іɛ r5 = r5.t_()     // Catch:{ all -> 0x04dd }
            o.ϵı r5 = r5.m11714()     // Catch:{ all -> 0x04dd }
            java.lang.String r11 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.f10610     // Catch:{ all -> 0x04dd }
            java.lang.Object r12 = o.C2244.m11698(r12)     // Catch:{ all -> 0x04dd }
            r5.m11605(r11, r12, r0)     // Catch:{ all -> 0x04dd }
            r0 = 0
        L_0x03dc:
            if (r0 == 0) goto L_0x0332
            int r5 = r0.flags     // Catch:{ all -> 0x04dd }
            r11 = 1
            r5 = r5 & r11
            if (r5 == 0) goto L_0x03e9
            r11 = 1
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04dd }
        L_0x03e9:
            int r0 = r0.flags     // Catch:{ all -> 0x04dd }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0332
            java.lang.String r0 = "_sysu"
            r11 = 1
            r6.putLong(r0, r11)     // Catch:{ all -> 0x04dd }
            goto L_0x0332
        L_0x03f8:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0401
            r3 = r19
            r6.putLong(r3, r7)     // Catch:{ all -> 0x04dd }
        L_0x0401:
            o.кǃ r0 = new o.кǃ     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_f"
            o.зι r13 = new o.зι     // Catch:{ all -> 0x04dd }
            r13.<init>(r6)     // Catch:{ all -> 0x04dd }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04dd }
            r1.m10517((o.C2441) r0, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            goto L_0x046d
        L_0x0415:
            r4 = r15
            r5 = 1
            if (r6 != r5) goto L_0x046d
            o.πı r5 = new o.πı     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_fvt"
            java.lang.Long r15 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04dd }
            java.lang.String r16 = "auto"
            r11 = r5
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04dd }
            r1.m10512((o.C2113) r5, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            r21.m10469()     // Catch:{ all -> 0x04dd }
            r21.m10508()     // Catch:{ all -> 0x04dd }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04dd }
            r5.<init>()     // Catch:{ all -> 0x04dd }
            r11 = 1
            r5.putLong(r7, r11)     // Catch:{ all -> 0x04dd }
            r5.putLong(r3, r11)     // Catch:{ all -> 0x04dd }
            o.ѵı r3 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.ьɹ r3 = r3.m14090()     // Catch:{ all -> 0x04dd }
            java.lang.String r6 = r2.f10610     // Catch:{ all -> 0x04dd }
            o.ιͱ<java.lang.Boolean> r7 = o.C2529.f11516     // Catch:{ all -> 0x04dd }
            boolean r3 = r3.m13384(r6, r7)     // Catch:{ all -> 0x04dd }
            r6 = 1
            if (r3 == 0) goto L_0x0453
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04dd }
        L_0x0453:
            boolean r3 = r2.f10619     // Catch:{ all -> 0x04dd }
            if (r3 == 0) goto L_0x045a
            r5.putLong(r0, r6)     // Catch:{ all -> 0x04dd }
        L_0x045a:
            o.кǃ r0 = new o.кǃ     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_v"
            o.зι r13 = new o.зι     // Catch:{ all -> 0x04dd }
            r13.<init>(r5)     // Catch:{ all -> 0x04dd }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04dd }
            r1.m10517((o.C2441) r0, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
        L_0x046d:
            o.ѵı r0 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.ьɹ r0 = r0.m14090()     // Catch:{ all -> 0x04dd }
            java.lang.String r3 = r2.f10610     // Catch:{ all -> 0x04dd }
            o.ιͱ<java.lang.Boolean> r5 = o.C2529.f11525     // Catch:{ all -> 0x04dd }
            boolean r0 = r0.m13384(r3, r5)     // Catch:{ all -> 0x04dd }
            if (r0 != 0) goto L_0x04ce
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04dd }
            r0.<init>()     // Catch:{ all -> 0x04dd }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x04dd }
            o.ѵı r3 = r1.f9711     // Catch:{ all -> 0x04dd }
            o.ьɹ r3 = r3.m14090()     // Catch:{ all -> 0x04dd }
            java.lang.String r4 = r2.f10610     // Catch:{ all -> 0x04dd }
            o.ιͱ<java.lang.Boolean> r5 = o.C2529.f11516     // Catch:{ all -> 0x04dd }
            boolean r3 = r3.m13384(r4, r5)     // Catch:{ all -> 0x04dd }
            if (r3 == 0) goto L_0x049e
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04dd }
        L_0x049e:
            o.кǃ r3 = new o.кǃ     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_e"
            o.зι r13 = new o.зι     // Catch:{ all -> 0x04dd }
            r13.<init>(r0)     // Catch:{ all -> 0x04dd }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04dd }
            r1.m10517((o.C2441) r3, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
            goto L_0x04ce
        L_0x04b2:
            boolean r0 = r2.f10615     // Catch:{ all -> 0x04dd }
            if (r0 == 0) goto L_0x04ce
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04dd }
            r0.<init>()     // Catch:{ all -> 0x04dd }
            o.кǃ r3 = new o.кǃ     // Catch:{ all -> 0x04dd }
            java.lang.String r12 = "_cd"
            o.зι r13 = new o.зι     // Catch:{ all -> 0x04dd }
            r13.<init>(r0)     // Catch:{ all -> 0x04dd }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04dd }
            r1.m10517((o.C2441) r3, (o.C2270) r2)     // Catch:{ all -> 0x04dd }
        L_0x04ce:
            o.Іє r0 = r21.m10502()     // Catch:{ all -> 0x04dd }
            r0.m12030()     // Catch:{ all -> 0x04dd }
            o.Іє r0 = r21.m10502()
            r0.m12018()
            return
        L_0x04dd:
            r0 = move-exception
            o.Іє r2 = r21.m10502()
            r2.m12018()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10503(o.Іʭ):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final C2270 m10485(String str) {
        String str2 = str;
        C2457 r1 = m10502().m12038(str2);
        if (r1 == null || TextUtils.isEmpty(r1.m12614())) {
            this.f9711.t_().m11711().m11603("No app data available; dropping", str2);
            return null;
        }
        Boolean r4 = m10481(r1);
        if (r4 == null || r4.booleanValue()) {
            return new C2270(str, r1.m12597(), r1.m12614(), r1.m12660(), r1.m12625(), r1.m12632(), r1.m12636(), (String) null, r1.m12603(), false, r1.m12627(), r1.m12653(), 0, 0, r1.m12651(), r1.m12646(), false, r1.m12657(), r1.m12638(), r1.m12652(), r1.m12647(), (!C1306.m8256() || !this.f9711.m14090().m13384(str2, C2529.f11605)) ? null : r1.m12648());
        }
        this.f9711.t_().m11714().m11603("App version does not match; dropping. appId", C2244.m11698(str));
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10504(C2527 r2) {
        C2270 r0 = m10485(r2.f11486);
        if (r0 != null) {
            m10513(r2, r0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10513(C2527 r11, C2270 r12) {
        C2745.C2746.m14555(r11);
        C2745.C2746.m14562(r11.f11486);
        C2745.C2746.m14555(r11.f11485);
        C2745.C2746.m14555(r11.f11482);
        C2745.C2746.m14562(r11.f11482.f10236);
        m10469();
        m10508();
        if (m10490(r12)) {
            if (!r12.f10625) {
                m10491(r12);
                return;
            }
            C2527 r0 = new C2527(r11);
            boolean z = false;
            r0.f11481 = false;
            m10502().m12045();
            try {
                C2527 r1 = m10502().m12039(r0.f11486, r0.f11482.f10236);
                if (r1 != null && !r1.f11485.equals(r0.f11485)) {
                    this.f9711.t_().A_().m11604("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f9711.m14115().m11222(r0.f11482.f10236), r0.f11485, r1.f11485);
                }
                if (r1 != null && r1.f11481) {
                    r0.f11485 = r1.f11485;
                    r0.f11479 = r1.f11479;
                    r0.f11488 = r1.f11488;
                    r0.f11484 = r1.f11484;
                    r0.f11487 = r1.f11487;
                    r0.f11481 = r1.f11481;
                    r0.f11482 = new C2113(r0.f11482.f10236, r1.f11482.f10232, r0.f11482.m11268(), r1.f11482.f10235);
                } else if (TextUtils.isEmpty(r0.f11484)) {
                    r0.f11482 = new C2113(r0.f11482.f10236, r0.f11479, r0.f11482.m11268(), r0.f11482.f10235);
                    r0.f11481 = true;
                    z = true;
                }
                if (r0.f11481) {
                    C2113 r13 = r0.f11482;
                    C2152 r2 = new C2152(r0.f11486, r0.f11485, r13.f10236, r13.f10232, r13.m11268());
                    if (m10502().m12021(r2)) {
                        this.f9711.t_().m11711().m11604("User property updated immediately", r0.f11486, this.f9711.m14115().m11222(r2.f10313), r2.f10314);
                    } else {
                        this.f9711.t_().m11714().m11604("(2)Too many active user properties, ignoring", C2244.m11698(r0.f11486), this.f9711.m14115().m11222(r2.f10313), r2.f10314);
                    }
                    if (z && r0.f11487 != null) {
                        m10466(new C2441(r0.f11487, r0.f11479), r12);
                    }
                }
                if (m10502().m12052(r0)) {
                    this.f9711.t_().m11711().m11604("Conditional property added", r0.f11486, this.f9711.m14115().m11222(r0.f11482.f10236), r0.f11482.m11268());
                } else {
                    this.f9711.t_().m11714().m11604("Too many conditional properties, ignoring", C2244.m11698(r0.f11486), this.f9711.m14115().m11222(r0.f11482.f10236), r0.f11482.m11268());
                }
                m10502().m12030();
            } finally {
                m10502().m12018();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m10518(C2527 r2) {
        C2270 r0 = m10485(r2.f11486);
        if (r0 != null) {
            m10505(r2, r0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10505(C2527 r10, C2270 r11) {
        C2745.C2746.m14555(r10);
        C2745.C2746.m14562(r10.f11486);
        C2745.C2746.m14555(r10.f11482);
        C2745.C2746.m14562(r10.f11482.f10236);
        m10469();
        m10508();
        if (m10490(r11)) {
            if (!r11.f10625) {
                m10491(r11);
                return;
            }
            m10502().m12045();
            try {
                m10491(r11);
                C2527 r0 = m10502().m12039(r10.f11486, r10.f11482.f10236);
                if (r0 != null) {
                    this.f9711.t_().m11711().m11605("Removing conditional user property", r10.f11486, this.f9711.m14115().m11222(r10.f11482.f10236));
                    m10502().m12015(r10.f11486, r10.f11482.f10236);
                    if (r0.f11481) {
                        m10502().m12046(r10.f11486, r10.f11482.f10236);
                    }
                    if (r10.f11483 != null) {
                        Bundle bundle = null;
                        if (r10.f11483.f11090 != null) {
                            bundle = r10.f11483.f11090.m12527();
                        }
                        Bundle bundle2 = bundle;
                        m10466(this.f9711.m14116().m11402(r10.f11486, r10.f11483.f11089, bundle2, r0.f11485, r10.f11483.f11091, true, false), r11);
                    }
                } else {
                    this.f9711.t_().A_().m11605("Conditional user property doesn't exist", C2244.m11698(r10.f11486), this.f9711.m14115().m11222(r10.f11482.f10236));
                }
                m10502().m12030();
            } finally {
                m10502().m12018();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0194  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final o.C2457 m10473(o.C2270 r9, o.C2457 r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x001e
            o.пı r10 = new o.пı
            o.ѵı r1 = r8.f9711
            java.lang.String r2 = r9.f10610
            r10.<init>(r1, r2)
            o.ѵı r1 = r8.f9711
            o.ϜΙ r1 = r1.m14116()
            java.lang.String r1 = r1.m11377()
            r10.m12623((java.lang.String) r1)
            r10.m12641((java.lang.String) r11)
        L_0x001c:
            r11 = 1
            goto L_0x003a
        L_0x001e:
            java.lang.String r1 = r10.m12654()
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0039
            r10.m12641((java.lang.String) r11)
            o.ѵı r11 = r8.f9711
            o.ϜΙ r11 = r11.m14116()
            java.lang.String r11 = r11.m11377()
            r10.m12623((java.lang.String) r11)
            goto L_0x001c
        L_0x0039:
            r11 = 0
        L_0x003a:
            java.lang.String r1 = r9.f10620
            java.lang.String r2 = r10.m12597()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x004c
            java.lang.String r11 = r9.f10620
            r10.m12613((java.lang.String) r11)
            r11 = 1
        L_0x004c:
            java.lang.String r1 = r9.f10606
            java.lang.String r2 = r10.m12657()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x005e
            java.lang.String r11 = r9.f10606
            r10.m12644((java.lang.String) r11)
            r11 = 1
        L_0x005e:
            boolean r1 = o.C1306.m8256()
            if (r1 == 0) goto L_0x0088
            o.ѵı r1 = r8.f9711
            o.ьɹ r1 = r1.m14090()
            java.lang.String r2 = r10.m12610()
            o.ιͱ<java.lang.Boolean> r3 = o.C2529.f11605
            boolean r1 = r1.m13384(r2, r3)
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r9.f10609
            java.lang.String r2 = r10.m12648()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0088
            java.lang.String r11 = r9.f10609
            r10.m12599((java.lang.String) r11)
            r11 = 1
        L_0x0088:
            java.lang.String r1 = r9.f10612
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = r9.f10612
            java.lang.String r2 = r10.m12627()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r11 = r9.f10612
            r10.m12629((java.lang.String) r11)
            r11 = 1
        L_0x00a2:
            long r1 = r9.f10605
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00ba
            long r1 = r9.f10605
            long r5 = r10.m12632()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00ba
            long r1 = r9.f10605
            r10.m12622((long) r1)
            r11 = 1
        L_0x00ba:
            java.lang.String r1 = r9.f10613
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d4
            java.lang.String r1 = r9.f10613
            java.lang.String r2 = r10.m12614()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d4
            java.lang.String r11 = r9.f10613
            r10.m12656((java.lang.String) r11)
            r11 = 1
        L_0x00d4:
            long r1 = r9.f10608
            long r5 = r10.m12660()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e4
            long r1 = r9.f10608
            r10.m12640((long) r1)
            r11 = 1
        L_0x00e4:
            java.lang.String r1 = r9.f10621
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = r9.f10621
            java.lang.String r2 = r10.m12625()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r11 = r9.f10621
            r10.m12650((java.lang.String) r11)
            r11 = 1
        L_0x00fa:
            long r1 = r9.f10622
            long r5 = r10.m12636()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x010a
            long r1 = r9.f10622
            r10.m12598((long) r1)
            r11 = 1
        L_0x010a:
            boolean r1 = r9.f10625
            boolean r2 = r10.m12603()
            if (r1 == r2) goto L_0x0118
            boolean r11 = r9.f10625
            r10.m12642((boolean) r11)
            r11 = 1
        L_0x0118:
            java.lang.String r1 = r9.f10624
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0132
            java.lang.String r1 = r9.f10624
            java.lang.String r2 = r10.m12631()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0132
            java.lang.String r11 = r9.f10624
            r10.m12659((java.lang.String) r11)
            r11 = 1
        L_0x0132:
            long r1 = r9.f10626
            long r5 = r10.m12653()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0142
            long r1 = r9.f10626
            r10.m12637(r1)
            r11 = 1
        L_0x0142:
            boolean r1 = r9.f10614
            boolean r2 = r10.m12651()
            if (r1 == r2) goto L_0x0150
            boolean r11 = r9.f10614
            r10.m12601((boolean) r11)
            r11 = 1
        L_0x0150:
            boolean r1 = r9.f10623
            boolean r2 = r10.m12646()
            if (r1 == r2) goto L_0x015e
            boolean r11 = r9.f10623
            r10.m12624((boolean) r11)
            r11 = 1
        L_0x015e:
            o.ѵı r1 = r8.f9711
            o.ьɹ r1 = r1.m14090()
            java.lang.String r2 = r9.f10610
            o.ιͱ<java.lang.Boolean> r5 = o.C2529.f11526
            boolean r1 = r1.m13384(r2, r5)
            if (r1 == 0) goto L_0x017c
            java.lang.Boolean r1 = r9.f10607
            java.lang.Boolean r2 = r10.m12638()
            if (r1 == r2) goto L_0x017c
            java.lang.Boolean r11 = r9.f10607
            r10.m12612((java.lang.Boolean) r11)
            r11 = 1
        L_0x017c:
            long r1 = r9.f10617
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0192
            long r1 = r9.f10617
            long r3 = r10.m12652()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0192
            long r1 = r9.f10617
            r10.m12655((long) r1)
            r11 = 1
        L_0x0192:
            if (r11 == 0) goto L_0x019b
            o.Іє r9 = r8.m10502()
            r9.m12051((o.C2457) r10)
        L_0x019b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1924.m10473(o.Іʭ, o.пı, java.lang.String):o.пı");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2457 m10491(C2270 r7) {
        m10469();
        m10508();
        C2745.C2746.m14555(r7);
        C2745.C2746.m14562(r7.f10610);
        C2457 r0 = m10502().m12038(r7.f10610);
        String r1 = this.f9711.m14107().m12124(r7.f10610);
        if (!C1015.m7245() || !this.f9711.m14090().m13372(C2529.f11521)) {
            return m10473(r7, r0, r1);
        }
        if (r0 == null) {
            r0 = new C2457(this.f9711, r7.f10610);
            r0.m12623(this.f9711.m14116().m11377());
            r0.m12641(r1);
        } else if (!r1.equals(r0.m12654())) {
            r0.m12641(r1);
            r0.m12623(this.f9711.m14116().m11377());
        }
        r0.m12613(r7.f10620);
        r0.m12644(r7.f10606);
        if (C1306.m8256() && this.f9711.m14090().m13384(r0.m12610(), C2529.f11605)) {
            r0.m12599(r7.f10609);
        }
        if (!TextUtils.isEmpty(r7.f10612)) {
            r0.m12629(r7.f10612);
        }
        if (r7.f10605 != 0) {
            r0.m12622(r7.f10605);
        }
        if (!TextUtils.isEmpty(r7.f10613)) {
            r0.m12656(r7.f10613);
        }
        r0.m12640(r7.f10608);
        if (r7.f10621 != null) {
            r0.m12650(r7.f10621);
        }
        r0.m12598(r7.f10622);
        r0.m12642(r7.f10625);
        if (!TextUtils.isEmpty(r7.f10624)) {
            r0.m12659(r7.f10624);
        }
        r0.m12637(r7.f10626);
        r0.m12601(r7.f10614);
        r0.m12624(r7.f10623);
        if (this.f9711.m14090().m13384(r7.f10610, C2529.f11526)) {
            r0.m12612(r7.f10607);
        }
        r0.m12655(r7.f10617);
        if (r0.m12645()) {
            m10502().m12051(r0);
        }
        return r0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final String m10510(C2270 r5) {
        try {
            return (String) this.f9711.u_().m13667(new C2055(this, r5)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f9711.t_().m11714().m11605("Failed to get app instance id. appId", C2244.m11698(r5.f10610), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m10519(boolean z) {
        m10479();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean m10490(C2270 r6) {
        return (!C1306.m8256() || !this.f9711.m14090().m13384(r6.f10610, C2529.f11605)) ? !TextUtils.isEmpty(r6.f10620) || !TextUtils.isEmpty(r6.f10606) : !TextUtils.isEmpty(r6.f10620) || !TextUtils.isEmpty(r6.f10609) || !TextUtils.isEmpty(r6.f10606);
    }
}
