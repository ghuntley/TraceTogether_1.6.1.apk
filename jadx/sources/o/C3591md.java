package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\u0018\u00002\u00020&:\u0001\u0006B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\r\u0010\u0002\u001a\u00020\u001e¢\u0006\u0004\b\u0002\u0010\u001fJ\r\u0010\u000e\u001a\u00020 ¢\u0006\u0004\b\u000e\u0010!J\r\u0010\u0006\u001a\u00020 ¢\u0006\u0004\b\u0006\u0010!R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048C@CX\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\u0006\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u00060\u000fR\u00020\u00008\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R+\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00168C@CX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0002\u0010\u0018R\"\u0010\b\u001a\u00020\u001a8\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c\"\u0004\b\u000e\u0010\u001d"}, d2 = {"Lo/md;", "", "ǃ", "Ljava/lang/String;", "Landroid/content/Context;", "p0", "ı", "Lo/gh;", "Ӏ", "()Landroid/content/Context;", "(Landroid/content/Context;)V", "Landroid/os/Handler;", "і", "Landroid/os/Handler;", "Ι", "Lo/md$ı;", "ι", "Lo/md$ı;", "", "Ɩ", "J", "ɩ", "Lo/ly;", "()Lo/ly;", "(Lo/ly;)V", "І", "", "I", "()I", "(I)V", "", "()Z", "", "()V", "p1", "p2", "<init>", "(Landroid/content/Context;Ljava/lang/String;J)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.md  reason: case insensitive filesystem */
public final class C3591md {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f3197;

    /* renamed from: ı  reason: contains not printable characters */
    private final C3433gh f3198 = fY.f2174.m2283();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final long f3199;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f3200 = "StreetPassScanner";

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3433gh f3201 = fY.f2174.m2283();

    /* renamed from: ι  reason: contains not printable characters */
    public final C0250 f3202 = new C0250();

    /* renamed from: і  reason: contains not printable characters */
    private Handler f3203 = new Handler();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f3204;

    static {
        Class<C3591md> cls = C3591md.class;
        f3197 = new C3444gs[]{C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "scanner", "getScanner()Lsg/gov/tech/bluetrace/bluetooth/BLEScanner;")), C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "context", "getContext()Landroid/content/Context;"))};
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    private final void m3811(Context context) {
        this.f3198.m2404(this, f3197[1], context);
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m3812(C3582ly lyVar) {
        this.f3201.m2404(this, f3197[0], lyVar);
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    private final C3582ly m3814() {
        return (C3582ly) this.f3201.m2405(this, f3197[0]);
    }

    /* access modifiers changed from: private */
    @JvmName(name = "Ӏ")
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Context m3815() {
        return (Context) this.f3198.m2405(this, f3197[1]);
    }

    public C3591md(Context context, String str, long j) {
        fM.m2254(context, "");
        fM.m2254(str, "");
        this.f3199 = j;
        m3812(new C3582ly(context, str, 0));
        m3811(context);
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m3818() {
        return this.f3204;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3820(int i) {
        this.f3204 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3819() {
        lT lTVar = new lT("Scanning Started");
        Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
        Context r5 = m3815();
        try {
            Object[] objArr = new Object[2];
            objArr[1] = lTVar;
            objArr[0] = r5;
            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ǃ", new Class[]{Context.class, lT.class}).invoke(obj, objArr);
            m3814().m3716((ScanCallback) this.f3202);
            this.f3204++;
            if (!lR.f2769.m3502()) {
                this.f3203.postDelayed(new Runnable(this) {

                    /* renamed from: ι  reason: contains not printable characters */
                    final /* synthetic */ C3591md f3205;

                    {
                        this.f3205 = r1;
                    }

                    public final void run() {
                        this.f3205.m3816();
                    }
                }, this.f3199);
            }
            lA.f2728.m3368(this.f3200, "scanning started");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3816() {
        if (this.f3204 > 0) {
            lT lTVar = new lT("Scanning Stopped");
            Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
            Context r5 = m3815();
            try {
                Object[] objArr = new Object[2];
                objArr[1] = lTVar;
                objArr[0] = r5;
                ((Class) C3166.m16013(4, 12, 45444)).getMethod("ǃ", new Class[]{Context.class, lT.class}).invoke(obj, objArr);
                this.f3204--;
                m3814().m3715();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m3817() {
        return this.f3204 > 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0002\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0002\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/md$ı;", "", "ι", "Ljava/lang/String;", "ı", "", "p0", "", "onScanFailed", "(I)V", "Landroid/bluetooth/le/ScanResult;", "p1", "onScanResult", "(ILandroid/bluetooth/le/ScanResult;)V", "(Landroid/bluetooth/le/ScanResult;)V", "<init>", "(Lo/md;)V", "Landroid/bluetooth/le/ScanCallback;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.md$ı  reason: contains not printable characters */
    public final class C0250 extends ScanCallback {

        /* renamed from: ι  reason: contains not printable characters */
        private final String f3207 = "BleScanCallback";

        public C0250() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        private final void m3821(ScanResult scanResult) {
            byte[] bArr;
            if (scanResult != null) {
                BluetoothDevice device = scanResult.getDevice();
                int rssi = scanResult.getRssi();
                Integer num = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    Integer valueOf = Integer.valueOf(scanResult.getTxPower());
                    if (valueOf.intValue() != 127) {
                        num = valueOf;
                    }
                }
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord == null || (bArr = scanRecord.getManufacturerSpecificData(1023)) == null) {
                    bArr = "N.A".getBytes(gL.f2204);
                    fM.m2252((Object) bArr, "");
                }
                String str = new String(bArr, gL.f2204);
                C3590mc mcVar = new C3590mc(str, num, rssi);
                lA.C0215 r1 = lA.f2728;
                String str2 = this.f3207;
                StringBuilder sb = new StringBuilder();
                sb.append("Scanned: ");
                sb.append(str);
                sb.append(" - ");
                fM.m2252((Object) device, "");
                sb.append(device.getAddress());
                r1.m3369(str2, sb.toString());
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                Context r5 = C3591md.this.m3815();
                try {
                    Object[] objArr = new Object[3];
                    objArr[2] = mcVar;
                    objArr[1] = device;
                    objArr[0] = r5;
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Context.class, BluetoothDevice.class, C3590mc.class}).invoke(obj, objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }

        public final void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            m3821(scanResult);
        }

        public final void onScanFailed(int i) {
            String str;
            super.onScanFailed(i);
            if (i == 1) {
                str = i + " - SCAN_FAILED_ALREADY_STARTED";
            } else if (i == 2) {
                str = i + " - SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
            } else if (i == 3) {
                str = i + " - SCAN_FAILED_INTERNAL_ERROR";
            } else if (i != 4) {
                str = i + " - UNDOCUMENTED";
            } else {
                str = i + " - SCAN_FAILED_FEATURE_UNSUPPORTED";
            }
            lA.f2728.m3375(this.f3207, "BT Scan failed: " + str);
            if (C3591md.this.m3818() > 0) {
                C3591md mdVar = C3591md.this;
                mdVar.m3820(mdVar.m3818() - 1);
            }
        }
    }
}
