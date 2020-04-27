package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C0299;
import o.C0473;
import o.C0677;
import o.C0947;
import o.C1345;
import o.C1651;
import o.C1731;
import o.C1884;
import o.C2098;
import o.C2197;
import o.C2241;
import o.C2325;
import o.C2344;
import o.C2397;
import o.C2609;
import o.C2745;
import o.C3147;

public class FirebaseApp {

    /* renamed from: ı  reason: contains not printable characters */
    static final Map<String, FirebaseApp> f942 = new C0299();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Executor f943 = new C0077((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Object f944 = new Object();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C2609<C0677> f945;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f946;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C2397 f947;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final List<Object> f948 = new CopyOnWriteArrayList();

    /* renamed from: ι  reason: contains not printable characters */
    private final String f949;

    /* renamed from: І  reason: contains not printable characters */
    private final C1731 f950;

    /* renamed from: і  reason: contains not printable characters */
    private final AtomicBoolean f951 = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final AtomicBoolean f952 = new AtomicBoolean(false);

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f949.equals(((FirebaseApp) obj).m1076());
    }

    public int hashCode() {
        return this.f949.hashCode();
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f944) {
            firebaseApp = f942.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                if (C2197.f10439 == null) {
                    if (C2197.f10438 == 0) {
                        C2197.f10438 = Process.myPid();
                    }
                    C2197.f10439 = C2197.m11595(C2197.f10438);
                }
                sb.append(C2197.f10439);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static FirebaseApp m1069(String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (f944) {
            firebaseApp = f942.get(str.trim());
            if (firebaseApp == null) {
                List<String> r1 = m1073();
                if (r1.isEmpty()) {
                    str2 = "";
                } else {
                    StringBuilder sb = new StringBuilder("Available app names: ");
                    sb.append(TextUtils.join(", ", r1));
                    str2 = sb.toString();
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return firebaseApp;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static FirebaseApp m1071(Context context) {
        synchronized (f944) {
            if (f942.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            C1731 r1 = C1731.m9754(context);
            if (r1 == null) {
                return null;
            }
            FirebaseApp r3 = m1068(context, r1, "[DEFAULT]");
            return r3;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static FirebaseApp m1068(Context context, C1731 r5, String str) {
        FirebaseApp firebaseApp;
        Cif.m1080(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f944) {
            boolean z = !f942.containsKey(trim);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            String obj = sb.toString();
            if (!z) {
                throw new IllegalStateException(String.valueOf(obj));
            } else if (context != null) {
                firebaseApp = new FirebaseApp(context, trim, r5);
                f942.put(trim, firebaseApp);
            } else {
                throw new NullPointerException("Application context cannot be null.");
            }
        }
        firebaseApp.m1065();
        return firebaseApp;
    }

    private FirebaseApp(Context context, String str, C1731 r12) {
        new CopyOnWriteArrayList();
        if (context != null) {
            this.f946 = context;
            if (!TextUtils.isEmpty(str)) {
                this.f949 = str;
                if (r12 != null) {
                    this.f950 = r12;
                    C2241 r0 = new C2241(context, new C2241.C2242(C2325.class, (byte) 0));
                    List<ComponentRegistrar> r11 = C2241.m11692(r0.f10528.m11693(r0.f10529));
                    String r02 = C2745.m14537();
                    Executor executor = f943;
                    C2344[] r4 = new C2344[8];
                    C2344.C2345 r7 = new C2344.C2345(Context.class, new Class[0], (byte) 0);
                    r7.f10854 = new C2098(context);
                    r4[0] = r7.m12231();
                    C2344.C2345 r8 = new C2344.C2345(FirebaseApp.class, new Class[0], (byte) 0);
                    r8.f10854 = new C2098(this);
                    r4[1] = r8.m12231();
                    C2344.C2345 r82 = new C2344.C2345(C1731.class, new Class[0], (byte) 0);
                    r82.f10854 = new C2098(r12);
                    r4[2] = r82.m12231();
                    r4[3] = C2745.m14502("fire-android", "");
                    r4[4] = C2745.m14502("fire-core", "19.3.0");
                    r4[5] = r02 != null ? C2745.m14502("kotlin", r02) : null;
                    r4[6] = C1651.m9501();
                    r4[7] = C0947.m6845();
                    this.f947 = new C2397(executor, r11, r4);
                    this.f945 = new C2609<>(new C2197(this, context));
                    return;
                }
                throw new NullPointerException("null reference");
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static /* synthetic */ C0677 m1064(FirebaseApp firebaseApp, Context context) {
        String r1 = firebaseApp.m1078();
        firebaseApp.f947.m12418(C3147.class);
        return new C0677(context, r1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m1078() {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = m1076().getBytes(Charset.defaultCharset());
        String str = null;
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        byte[] bytes2 = m1075().f8951.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: І  reason: contains not printable characters */
    private static List<String> m1073() {
        ArrayList arrayList = new ArrayList();
        synchronized (f944) {
            for (FirebaseApp r3 : f942.values()) {
                arrayList.add(r3.m1076());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m1065() {
        if (!C1884.m10290(this.f946)) {
            If.m1079(this.f946);
        } else {
            this.f947.m12416("[DEFAULT]".equals(m1076()));
        }
    }

    @TargetApi(24)
    static class If extends BroadcastReceiver {

        /* renamed from: ɩ  reason: contains not printable characters */
        private static AtomicReference<If> f953 = new AtomicReference<>();

        /* renamed from: Ι  reason: contains not printable characters */
        private final Context f954;

        private If(Context context) {
            this.f954 = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f944) {
                for (FirebaseApp r0 : FirebaseApp.f942.values()) {
                    r0.m1065();
                }
            }
            this.f954.unregisterReceiver(this);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        static /* synthetic */ void m1079(Context context) {
            if (f953.get() == null) {
                If ifR = new If(context);
                if (f953.compareAndSet((Object) null, ifR)) {
                    context.registerReceiver(ifR, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.FirebaseApp$if  reason: invalid class name */
    static class Cif implements C0473.C0474 {

        /* renamed from: ı  reason: contains not printable characters */
        private static AtomicReference<Cif> f955 = new AtomicReference<>();

        private Cif() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1081(boolean z) {
            synchronized (FirebaseApp.f944) {
                Iterator it = new ArrayList(FirebaseApp.f942.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.f952.get()) {
                        FirebaseApp.m1070(firebaseApp);
                    }
                }
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        static /* synthetic */ void m1080(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (f955.get() == null) {
                    Cif ifVar = new Cif();
                    if (f955.compareAndSet((Object) null, ifVar)) {
                        C0473.m4804(application);
                        C0473 r3 = C0473.f4096;
                        synchronized (C0473.f4096) {
                            r3.f4100.add(ifVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$ı  reason: contains not printable characters */
    static class C0077 implements Executor {

        /* renamed from: ı  reason: contains not printable characters */
        private static final Handler f956 = new Handler(Looper.getMainLooper());

        private C0077() {
        }

        /* synthetic */ C0077(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            f956.post(runnable);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Context m1074() {
        if (!this.f951.get()) {
            return this.f946;
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m1076() {
        if (!this.f951.get()) {
            return this.f949;
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1731 m1075() {
        if (!this.f951.get()) {
            return this.f950;
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    public String toString() {
        return new C1345.C1346(this, (byte) 0).m8437("name", this.f949).m8437("options", this.f950).toString();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> T m1077(Class<T> cls) {
        if (!this.f951.get()) {
            return this.f947.m12418(cls);
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    public boolean isDataCollectionDefaultEnabled() {
        if (!this.f951.get()) {
            return this.f945.m13833().f4824.get();
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m1070(FirebaseApp firebaseApp) {
        Iterator<Object> it = firebaseApp.f948.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
