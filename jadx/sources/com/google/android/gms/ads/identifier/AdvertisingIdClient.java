package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.SystemClock;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C0392;
import o.C1345;
import o.C2396;
import o.C2742;
import o.C2787;
import o.C2796;
import o.C2837;
import o.C2845;
import o.C2877;
import o.C3041;

public class AdvertisingIdClient {
    private final Context mContext;
    private C2796 zze;
    private C0392 zzf;
    private boolean zzg;
    private final Object zzh;
    private Cif zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) {
        C2742 r0 = new C2742(context);
        boolean r2 = r0.m14495("gads:ad_id_app_context:enabled", false);
        float r11 = r0.m14494("gads:ad_id_app_context:ping_ratio", 0.0f);
        String r12 = r0.m14493("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, r2, r0.m14495("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, r2, r11, SystemClock.elapsedRealtime() - elapsedRealtime, r12, (Throwable) null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        C2742 r0 = new C2742(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, r0.m14495("gads:ad_id_app_context:enabled", false), r0.m14495("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzh
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f509     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = r6.zzi     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.zzk     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$if     // Catch:{ all -> 0x0026 }
            long r2 = r6.zzk     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.zzi = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    private final boolean zza(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C2787(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        finish();
        super.finalize();
    }

    public void start() {
        zza(true);
    }

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$if  reason: invalid class name */
    static class Cif extends Thread {

        /* renamed from: ǃ  reason: contains not printable characters */
        private WeakReference<AdvertisingIdClient> f508;

        /* renamed from: ɩ  reason: contains not printable characters */
        CountDownLatch f509 = new CountDownLatch(1);

        /* renamed from: Ι  reason: contains not printable characters */
        private long f510;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f511 = false;

        public Cif(AdvertisingIdClient advertisingIdClient, long j) {
            this.f508 = new WeakReference<>(advertisingIdClient);
            this.f510 = j;
            start();
        }

        public final void run() {
            AdvertisingIdClient advertisingIdClient;
            try {
                if (!this.f509.await(this.f510, TimeUnit.MILLISECONDS) && (advertisingIdClient = this.f508.get()) != null) {
                    advertisingIdClient.finish();
                    this.f511 = true;
                }
            } catch (InterruptedException unused) {
                AdvertisingIdClient advertisingIdClient2 = this.f508.get();
                if (advertisingIdClient2 != null) {
                    advertisingIdClient2.finish();
                    this.f511 = true;
                }
            }
        }
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        if (context != null) {
            if (z && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            this.mContext = context;
            this.zzg = false;
            this.zzk = j;
            this.zzj = z2;
            return;
        }
        throw new NullPointerException("null reference");
    }

    private final void zza(boolean z) {
        if (!C2396.m12409()) {
            synchronized (this) {
                if (this.zzg) {
                    finish();
                }
                this.zze = zza(this.mContext, this.zzj);
                this.zzf = zza(this.mContext, this.zze);
                this.zzg = true;
                if (z) {
                    zza();
                }
            }
            return;
        }
        throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:43|44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0064, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() {
        /*
            r4 = this;
            boolean r0 = o.C2396.m12409()
            if (r0 != 0) goto L_0x0078
            monitor-enter(r4)
            boolean r0 = r4.zzg     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r4.zzh     // Catch:{ all -> 0x0075 }
            monitor-enter(r0)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = r4.zzi     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0033
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = r4.zzi     // Catch:{ all -> 0x003b }
            boolean r1 = r1.f511     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0033
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            r0 = 0
            r4.zza(r0)     // Catch:{ Exception -> 0x002a }
            boolean r0 = r4.zzg     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x002a:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0075 }
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0033:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x003e:
            o.Ӏɺ r0 = r4.zze     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x006d
            o.ıο r0 = r4.zzf     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0065
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info     // Catch:{ RemoteException -> 0x005d }
            o.ıο r1 = r4.zzf     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r1 = r1.m4655()     // Catch:{ RemoteException -> 0x005d }
            o.ıο r2 = r4.zzf     // Catch:{ RemoteException -> 0x005d }
            r3 = 1
            boolean r2 = r2.m4653(r3)     // Catch:{ RemoteException -> 0x005d }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005d }
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            r4.zza()
            return r0
        L_0x005d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0065:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "null reference"
            r0.<init>(r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x006d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "null reference"
            r0.<init>(r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0078:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling this from your main thread can lead to deadlock"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getInfo():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:43|44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0058, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb() {
        /*
            r3 = this;
            boolean r0 = o.C2396.m12409()
            if (r0 != 0) goto L_0x006c
            monitor-enter(r3)
            boolean r0 = r3.zzg     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r3.zzh     // Catch:{ all -> 0x0069 }
            monitor-enter(r0)     // Catch:{ all -> 0x0069 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = r3.zzi     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0033
            com.google.android.gms.ads.identifier.AdvertisingIdClient$if r1 = r3.zzi     // Catch:{ all -> 0x003b }
            boolean r1 = r1.f511     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0033
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            r0 = 0
            r3.zza(r0)     // Catch:{ Exception -> 0x002a }
            boolean r0 = r3.zzg     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x002a:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0069 }
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0033:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x003e:
            o.Ӏɺ r0 = r3.zze     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0061
            o.ıο r0 = r3.zzf     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0059
            o.ıο r0 = r3.zzf     // Catch:{ RemoteException -> 0x0051 }
            boolean r0 = r0.m4654()     // Catch:{ RemoteException -> 0x0051 }
            monitor-exit(r3)     // Catch:{ all -> 0x0069 }
            r3.zza()
            return r0
        L_0x0051:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0059:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "null reference"
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0061:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "null reference"
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling this from your main thread can lead to deadlock"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zzb():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r2 = this;
            boolean r0 = o.C2396.m12409()
            if (r0 != 0) goto L_0x002d
            monitor-enter(r2)
            android.content.Context r0 = r2.mContext     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            o.Ӏɺ r0 = r2.zze     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0010
            goto L_0x0028
        L_0x0010:
            boolean r0 = r2.zzg     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            o.C1345.m8433()     // Catch:{ all -> 0x001e }
            android.content.Context r0 = r2.mContext     // Catch:{ all -> 0x001e }
            o.Ӏɺ r1 = r2.zze     // Catch:{ all -> 0x001e }
            r0.unbindService(r1)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r2.zzg = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r2.zzf = r0     // Catch:{ all -> 0x002a }
            r2.zze = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling this from your main thread can lead to deadlock"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    private static C2796 zza(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int r0 = C2837.f13284.m14807(context, C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (r0 == 0 || r0 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C2796 r6 = new C2796();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C1345.m8433().m8435(context, context.getClass().getName(), intent, r6, 1)) {
                        return r6;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C2845(9);
        }
    }

    private static C0392 zza(Context context, C2796 r3) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (C2396.m12409()) {
                throw new IllegalStateException("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            } else if (!r3.f13214) {
                r3.f13214 = true;
                IBinder poll = r3.f13213.poll(10000, timeUnit);
                if (poll != null) {
                    return C3041.m15524(poll);
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            } else {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
