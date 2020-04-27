package o;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C3626z;

public final class B implements ServiceConnection {

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f1185;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f1186;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final ScheduledExecutorService f1187;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C2006 f1188;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Intent f1189;

    /* renamed from: ι  reason: contains not printable characters */
    private final Queue<C3626z.C0278> f1190;

    public static final class Aux implements C3149 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final boolean f1191;

        /* renamed from: Ι  reason: contains not printable characters */
        private final BroadcastReceiver.PendingResult f1192;

        public Aux(boolean z, BroadcastReceiver.PendingResult pendingResult) {
            this.f1191 = z;
            this.f1192 = pendingResult;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1268(C0329 r3) {
            FirebaseInstanceIdReceiver.m1125(this.f1191, this.f1192, r3);
        }
    }

    public static final class IF implements C3197 {

        /* renamed from: ι  reason: contains not printable characters */
        private final FirebaseInstanceId.If f1193;

        public IF(FirebaseInstanceId.If ifR) {
            this.f1193 = ifR;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1269() {
            FirebaseInstanceId.If ifR = this.f1193;
            synchronized (ifR) {
                if (ifR.m1124()) {
                    FirebaseInstanceId.this.m1112();
                }
            }
        }
    }

    /* renamed from: o.B$If  reason: case insensitive filesystem */
    public static final class C3252If implements C2979 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Context f1194;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Intent f1195;

        public C3252If(Context context, Intent intent) {
            this.f1194 = context;
            this.f1195 = intent;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m1270(C0329 r3) {
            return C1381.m8525(this.f1194, this.f1195, r3);
        }
    }

    /* renamed from: o.B$aux  reason: case insensitive filesystem */
    public static final class C3253aux implements C3184 {

        /* renamed from: ı  reason: contains not printable characters */
        private final FirebaseInstanceId f1196;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final String f1197;

        /* renamed from: Ι  reason: contains not printable characters */
        private final String f1198;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f1199;

        public C3253aux(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
            this.f1196 = firebaseInstanceId;
            this.f1198 = str;
            this.f1197 = str2;
            this.f1199 = str3;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0329 m1271(Object obj) {
            FirebaseInstanceId firebaseInstanceId = this.f1196;
            String str = this.f1198;
            String str2 = this.f1197;
            String str3 = this.f1199;
            String str4 = (String) obj;
            FirebaseInstanceId.f978.m10284("", str, str2, str4, firebaseInstanceId.f981.m9978());
            C3064 r0 = new C3064(str3, str4);
            C0770 r9 = new C0770();
            r9.m6079(r0);
            return r9;
        }
    }

    /* renamed from: o.B$iF  reason: case insensitive filesystem */
    public static final class C3254iF implements C3149 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final CountDownLatch f1200;

        public C3254iF(CountDownLatch countDownLatch) {
            this.f1200 = countDownLatch;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1272(C0329 r1) {
            this.f1200.countDown();
        }
    }

    /* renamed from: o.B$if  reason: invalid class name */
    public static final class Cif implements Runnable {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3626z.C0278 f1201;

        Cif(C3626z.C0278 r1) {
            this.f1201 = r1;
        }

        public final void run() {
            C3626z.C0278 r0 = this.f1201;
            r0.f3519.getAction();
            r0.f3520.f14555.m6087(null);
        }
    }

    /* renamed from: o.B$ı  reason: contains not printable characters */
    public static final class C0087 implements Runnable {

        /* renamed from: ι  reason: contains not printable characters */
        private final FirebaseInstanceId f1202;

        public C0087(FirebaseInstanceId firebaseInstanceId) {
            this.f1202 = firebaseInstanceId;
        }

        public final void run() {
            FirebaseInstanceId firebaseInstanceId = this.f1202;
            if (firebaseInstanceId.f985.m1124()) {
                firebaseInstanceId.m1112();
            }
        }
    }

    /* renamed from: o.B$ǃ  reason: contains not printable characters */
    public static final class C0088 implements Callable {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Intent f1203;

        /* renamed from: ι  reason: contains not printable characters */
        private final Context f1204;

        public C0088(Context context, Intent intent) {
            this.f1204 = context;
            this.f1203 = intent;
        }

        public final Object call() {
            return C1381.m8526(this.f1204, this.f1203);
        }
    }

    /* renamed from: o.B$ɩ  reason: contains not printable characters */
    public static final class C0089 implements C3149 {

        /* renamed from: ı  reason: contains not printable characters */
        private final ScheduledFuture f1205;

        C0089(ScheduledFuture scheduledFuture) {
            this.f1205 = scheduledFuture;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m1273(C0329 r2) {
            this.f1205.cancel(false);
        }
    }

    /* renamed from: o.B$Ι  reason: contains not printable characters */
    public static final class C0090 implements C2979 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final String f1206;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final String f1207;

        /* renamed from: ι  reason: contains not printable characters */
        private final FirebaseInstanceId f1208;

        public C0090(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
            this.f1208 = firebaseInstanceId;
            this.f1206 = str;
            this.f1207 = str2;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m1274(C0329 r6) {
            FirebaseInstanceId firebaseInstanceId = this.f1208;
            String str = this.f1206;
            String str2 = this.f1207;
            String r2 = firebaseInstanceId.m1118();
            C1918 r3 = FirebaseInstanceId.m1103(str, str2);
            if (firebaseInstanceId.m1119(r3)) {
                return firebaseInstanceId.f989.m14011(str, str2, new C0091(firebaseInstanceId, r2, str, str2));
            }
            C3064 r62 = new C3064(r2, r3.f9678);
            C0770 r0 = new C0770();
            r0.m6079(r62);
            return r0;
        }
    }

    /* renamed from: o.B$ι  reason: contains not printable characters */
    public static final class C0091 implements C1604 {

        /* renamed from: ı  reason: contains not printable characters */
        private final String f1209;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final FirebaseInstanceId f1210;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final String f1211;

        /* renamed from: Ι  reason: contains not printable characters */
        private final String f1212;

        public C0091(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
            this.f1210 = firebaseInstanceId;
            this.f1209 = str;
            this.f1211 = str2;
            this.f1212 = str3;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0329 m1275() {
            FirebaseInstanceId firebaseInstanceId = this.f1210;
            String str = this.f1209;
            String str2 = this.f1211;
            String str3 = this.f1212;
            C2400 r4 = firebaseInstanceId.f988;
            return r4.m12423(str, str2, str3, new Bundle()).m4418(r4.f10962, new C2766()).m4410(firebaseInstanceId.f987, new C3253aux(firebaseInstanceId, str2, str3, str));
        }
    }

    public B(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C1252("Firebase-FirebaseInstanceIdServiceConnection", (byte) 0)));
    }

    private B(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f1190 = new ArrayDeque();
        this.f1186 = false;
        this.f1185 = context.getApplicationContext();
        this.f1189 = new Intent(str).setPackage(this.f1185.getPackageName());
        this.f1187 = scheduledExecutorService;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized C0329<Void> m1267(Intent intent) {
        C3626z.C0278 r0;
        r0 = new C3626z.C0278(intent);
        ScheduledExecutorService scheduledExecutorService = this.f1187;
        r0.f3520.f14555.m4407((Executor) scheduledExecutorService, new C0089(scheduledExecutorService.schedule(new Cif(r0), 9000, TimeUnit.MILLISECONDS)));
        this.f1190.add(r0);
        m1266();
        return r0.f3520.f14555;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        return;
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m1266() {
        /*
            r7 = this;
            monitor-enter(r7)
        L_0x0001:
            java.util.Queue<o.z$ǃ> r0 = r7.f1190     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0070
            o.ιʊ r0 = r7.f1188     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0046
            o.ιʊ r0 = r7.f1188     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0046
            java.util.Queue<o.z$ǃ> r0 = r7.f1190     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0072 }
            o.z$ǃ r0 = (o.C3626z.C0278) r0     // Catch:{ all -> 0x0072 }
            o.ιʊ r1 = r7.f1188     // Catch:{ all -> 0x0072 }
            int r2 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x0072 }
            int r3 = android.os.Process.myUid()     // Catch:{ all -> 0x0072 }
            if (r2 != r3) goto L_0x003e
            o.ΙԼ r1 = r1.f9960     // Catch:{ all -> 0x0072 }
            android.content.Intent r2 = r0.f3519     // Catch:{ all -> 0x0072 }
            o.ıə r1 = r1.m10332(r2)     // Catch:{ all -> 0x0072 }
            java.util.concurrent.Executor r2 = o.C2324.m12102()     // Catch:{ all -> 0x0072 }
            o.z$ı r3 = new o.z$ı     // Catch:{ all -> 0x0072 }
            r3.<init>(r0)     // Catch:{ all -> 0x0072 }
            r1.m4407((java.util.concurrent.Executor) r2, r3)     // Catch:{ all -> 0x0072 }
            goto L_0x0001
        L_0x003e:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "Binding only allowed within app"
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0046:
            boolean r0 = r7.f1186     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x006e
            r0 = 1
            r7.f1186 = r0     // Catch:{ all -> 0x0072 }
            o.ɪɍ r1 = o.C1345.m8433()     // Catch:{ SecurityException -> 0x0068 }
            android.content.Context r2 = r7.f1185     // Catch:{ SecurityException -> 0x0068 }
            android.content.Intent r4 = r7.f1189     // Catch:{ SecurityException -> 0x0068 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ SecurityException -> 0x0068 }
            java.lang.String r3 = r0.getName()     // Catch:{ SecurityException -> 0x0068 }
            r6 = 65
            r5 = r7
            boolean r0 = r1.m8435(r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x0068 }
            if (r0 == 0) goto L_0x0068
            monitor-exit(r7)
            return
        L_0x0068:
            r0 = 0
            r7.f1186 = r0     // Catch:{ all -> 0x0072 }
            r7.m1265()     // Catch:{ all -> 0x0072 }
        L_0x006e:
            monitor-exit(r7)
            return
        L_0x0070:
            monitor-exit(r7)
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.B.m1266():void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m1265() {
        while (!this.f1190.isEmpty()) {
            this.f1190.poll().f3520.f14555.m6087(null);
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1186 = false;
        if (!(iBinder instanceof C2006)) {
            while (!this.f1190.isEmpty()) {
                this.f1190.poll().f3520.f14555.m6087(null);
            }
            return;
        }
        this.f1188 = (C2006) iBinder;
        m1266();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        m1266();
    }
}
