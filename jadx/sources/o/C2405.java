package o;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.mJ;

/* renamed from: o.вІ  reason: contains not printable characters */
public class C2405 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Random f10975 = new Random();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2023 f10976 = C2022.f9992;

    /* renamed from: ı  reason: contains not printable characters */
    private final Map<String, C2039> f10977;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final FirebaseApp f10978;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C1802 f10979;

    /* renamed from: Ι  reason: contains not printable characters */
    private final ExecutorService f10980;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f10981;

    /* renamed from: І  reason: contains not printable characters */
    private final String f10982;

    /* renamed from: і  reason: contains not printable characters */
    private final C1855 f10983;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final FirebaseInstanceId f10984;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Map<String, String> f10985;

    public C2405(Context context, FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C1802 r12, C1855 r13) {
        this(context, Executors.newCachedThreadPool(), firebaseApp, firebaseInstanceId, r12, r13, new C3154(context, firebaseApp.m1075().f8951));
    }

    private C2405(Context context, ExecutorService executorService, FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C1802 r6, C1855 r7, C3154 r8) {
        this.f10977 = new HashMap();
        this.f10985 = new HashMap();
        this.f10981 = context;
        this.f10980 = executorService;
        this.f10978 = firebaseApp;
        this.f10984 = firebaseInstanceId;
        this.f10979 = r6;
        this.f10983 = r7;
        this.f10982 = firebaseApp.m1075().f8951;
        C0309.m4375(executorService, new mJ.Cif(this));
        C0309.m4375(executorService, new mM(r8));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private synchronized C2039 m12429(FirebaseApp firebaseApp, String str, C1802 r15, Executor executor, C3018 r17, C3018 r18, C3018 r19, C3083 r20, C3037 r21, C3107 r22) {
        C2039 r0;
        String str2 = str;
        synchronized (this) {
            if (!this.f10977.containsKey(str)) {
                C2039 r3 = new C2039(str.equals("firebase") && firebaseApp.m1076().equals("[DEFAULT]") ? r15 : null, executor, r17, r18, r19, r20, r21, r22);
                r3.f10080.m15465();
                r3.f10079.m15465();
                r3.f10076.m15465();
                this.f10977.put(str, r3);
            }
            r0 = this.f10977.get(str);
        }
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C3018 m12430(Context context, String str, String str2, String str3) {
        return C3018.m15460(Executors.newCachedThreadPool(), C3136.m15890(context, String.format("%s_%s_%s_%s.json", new Object[]{"frc", str, str2, str3})));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private synchronized C3083 m12431(String str, C3018 r25, C3107 r26) {
        C3083 r2;
        C3107 r0 = r26;
        synchronized (this) {
            FirebaseInstanceId firebaseInstanceId = this.f10984;
            C1855 r4 = this.f10978.m1076().equals("[DEFAULT]") ? this.f10983 : null;
            ExecutorService executorService = this.f10980;
            C2023 r6 = f10976;
            Random random = f10975;
            C2023 r62 = r6;
            Random random2 = random;
            C3018 r8 = r25;
            r2 = new C3083(firebaseInstanceId, r4, executorService, r62, random2, r8, new ConfigFetchHttpClient(this.f10981, this.f10978.m1075().f8951, this.f10978.m1075().f8953, str, r0.f14207.getLong("fetch_timeout_in_seconds", 60), r0.f14207.getLong("fetch_timeout_in_seconds", 60)), r26, this.f10985);
        }
        return r2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized C2039 m12432(String str) {
        C3018 r8;
        C3018 r9;
        C3018 r10;
        C3107 r13;
        r8 = m12430(this.f10981, this.f10982, str, "fetch");
        r9 = m12430(this.f10981, this.f10982, str, "activate");
        r10 = m12430(this.f10981, this.f10982, str, "defaults");
        r13 = new C3107(this.f10981.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f10982, str, "settings"}), 0));
        return m12429(this.f10978, str, this.f10979, this.f10980, r8, r9, r10, m12431(str, r8, r13), new C3037(r9, r10), r13);
    }
}
