package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: o.as  reason: case insensitive filesystem */
final class C3279as implements C3278ar {

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f1540;

    public C3279as(Context context) {
        this.f1540 = context.getApplicationContext();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5.f1540.unbindService(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.mG.C0235 m1622() {
        /*
            r5 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 != r1) goto L_0x000f
            o.C3263ac.m1563()
            return r2
        L_0x000f:
            android.content.Context r0 = r5.f1540     // Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
            java.lang.String r1 = "com.android.vending"
            r3 = 0
            r0.getPackageInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x006e, Exception -> 0x006a }
            o.as$if r0 = new o.as$if
            r0.<init>(r3)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.google.android.gms.ads.identifier.service.START"
            r1.<init>(r3)
            java.lang.String r3 = "com.google.android.gms"
            r1.setPackage(r3)
            android.content.Context r3 = r5.f1540     // Catch:{ all -> 0x0066 }
            r4 = 1
            boolean r1 = r3.bindService(r1, r0, r4)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0062
            o.as$If r1 = new o.as$If     // Catch:{ Exception -> 0x0053 }
            android.os.IBinder r3 = r0.m1625()     // Catch:{ Exception -> 0x0053 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            o.mG$ɩ r3 = new o.mG$ɩ     // Catch:{ Exception -> 0x0053 }
            java.lang.String r4 = r1.m1624()     // Catch:{ Exception -> 0x0053 }
            boolean r1 = r1.m1623()     // Catch:{ Exception -> 0x0053 }
            r3.<init>(r4, r1)     // Catch:{ Exception -> 0x0053 }
            android.content.Context r1 = r5.f1540     // Catch:{ all -> 0x0066 }
            r1.unbindService(r0)     // Catch:{ all -> 0x0066 }
            return r3
        L_0x0051:
            r1 = move-exception
            goto L_0x005c
        L_0x0053:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0051 }
            android.content.Context r1 = r5.f1540     // Catch:{ all -> 0x0066 }
            r1.unbindService(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x005c:
            android.content.Context r3 = r5.f1540     // Catch:{ all -> 0x0066 }
            r3.unbindService(r0)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0062:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            o.C3263ac.m1563()
        L_0x0069:
            return r2
        L_0x006a:
            o.C3263ac.m1563()
            return r2
        L_0x006e:
            o.C3263ac.m1563()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3279as.m1622():o.mG$ɩ");
    }

    /* renamed from: o.as$if  reason: invalid class name */
    static final class Cif implements ServiceConnection {

        /* renamed from: ı  reason: contains not printable characters */
        private final LinkedBlockingQueue<IBinder> f1542;

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f1543;

        private Cif() {
            this.f1543 = false;
            this.f1542 = new LinkedBlockingQueue<>(1);
        }

        /* synthetic */ Cif(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f1542.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f1542.clear();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final IBinder m1625() {
            if (this.f1543) {
                C3263ac.m1563();
            }
            this.f1543 = true;
            try {
                return this.f1542.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    /* renamed from: o.as$If */
    static final class If implements IInterface {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final IBinder f1541;

        public If(IBinder iBinder) {
            this.f1541 = iBinder;
        }

        public final IBinder asBinder() {
            return this.f1541;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            o.C3263ac.m1563();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String m1624() {
            /*
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r2)     // Catch:{ Exception -> 0x0024 }
                android.os.IBinder r2 = r5.f1541     // Catch:{ Exception -> 0x0024 }
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch:{ Exception -> 0x0024 }
                r1.readException()     // Catch:{ Exception -> 0x0024 }
                java.lang.String r2 = r1.readString()     // Catch:{ Exception -> 0x0024 }
                r1.recycle()
                r0.recycle()
                goto L_0x002e
            L_0x0022:
                r2 = move-exception
                goto L_0x002f
            L_0x0024:
                o.C3263ac.m1563()     // Catch:{ all -> 0x0022 }
                r1.recycle()
                r0.recycle()
                r2 = 0
            L_0x002e:
                return r2
            L_0x002f:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3279as.If.m1624():java.lang.String");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            o.C3263ac.m1563();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean m1623() {
            /*
                r6 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r3)     // Catch:{ Exception -> 0x0025 }
                r3 = 1
                r0.writeInt(r3)     // Catch:{ Exception -> 0x0025 }
                android.os.IBinder r4 = r6.f1541     // Catch:{ Exception -> 0x0025 }
                r5 = 2
                r4.transact(r5, r0, r1, r2)     // Catch:{ Exception -> 0x0025 }
                r1.readException()     // Catch:{ Exception -> 0x0025 }
                int r4 = r1.readInt()     // Catch:{ Exception -> 0x0025 }
                if (r4 == 0) goto L_0x0028
                r2 = 1
                goto L_0x0028
            L_0x0023:
                r2 = move-exception
                goto L_0x002f
            L_0x0025:
                o.C3263ac.m1563()     // Catch:{ all -> 0x0023 }
            L_0x0028:
                r1.recycle()
                r0.recycle()
                return r2
            L_0x002f:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3279as.If.m1623():boolean");
        }
    }
}
