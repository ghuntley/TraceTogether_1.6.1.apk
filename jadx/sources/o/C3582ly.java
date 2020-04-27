package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\u0018\u00002\u00020\u001fB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0004\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u000f¢\u0006\u0004\b\u0004\u0010\u0019J\r\u0010\u000e\u001a\u00020\u0018¢\u0006\u0004\b\u000e\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058B@CX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b8C@CX\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\f\"\u0004\b\u0007\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R+\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00018C@CX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0004\u0010\u0016"}, d2 = {"Lo/ly;", "", "Ӏ", "Ljava/lang/String;", "Ι", "Landroid/content/Context;", "p0", "ι", "Lo/gh;", "ɩ", "(Landroid/content/Context;)V", "", "()J", "(J)V", "ǃ", "Landroid/bluetooth/le/ScanCallback;", "Landroid/bluetooth/le/ScanCallback;", "Landroid/bluetooth/le/BluetoothLeScanner;", "ɹ", "Landroid/bluetooth/le/BluetoothLeScanner;", "ı", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "І", "", "(Landroid/bluetooth/le/ScanCallback;)V", "()V", "p1", "p2", "<init>", "(Landroid/content/Context;Ljava/lang/String;J)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.ly  reason: case insensitive filesystem */
public final class C3582ly {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f3027;

    /* renamed from: ı  reason: contains not printable characters */
    private final C3433gh f3028 = fY.f2174.m2283();

    /* renamed from: ǃ  reason: contains not printable characters */
    private ScanCallback f3029;

    /* renamed from: ɹ  reason: contains not printable characters */
    private BluetoothLeScanner f3030;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3433gh f3031 = fY.f2174.m2283();

    /* renamed from: ι  reason: contains not printable characters */
    private final C3433gh f3032 = fY.f2174.m2283();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final String f3033;

    static {
        Class<C3582ly> cls = C3582ly.class;
        f3027 = new C3444gs[]{C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "serviceUUID", "getServiceUUID()Ljava/lang/String;")), C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "context", "getContext()Landroid/content/Context;")), C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "reportDelay", "getReportDelay()J"))};
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    private final String m3710() {
        return (String) this.f3028.m2405(this, f3027[0]);
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    private final long m3711() {
        return ((Number) this.f3031.m2405(this, f3027[2])).longValue();
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m3712(Context context) {
        this.f3032.m2404(this, f3027[1], context);
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    private final void m3713(String str) {
        this.f3028.m2404(this, f3027[0], str);
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    private final void m3714(long j) {
        this.f3031.m2404(this, f3027[2], Long.valueOf(j));
    }

    public C3582ly(Context context, String str, long j) {
        fM.m2254(context, "");
        fM.m2254(str, "");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        fM.m2252((Object) defaultAdapter, "");
        this.f3030 = defaultAdapter.getBluetoothLeScanner();
        this.f3033 = "BLEScanner";
        m3713(str);
        m3712(context);
        m3714(j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3716(ScanCallback scanCallback) {
        fM.m2254(scanCallback, "");
        ScanFilter build = new ScanFilter.Builder().setServiceUuid(new ParcelUuid(UUID.fromString(m3710()))).build();
        ArrayList arrayList = new ArrayList();
        arrayList.add(build);
        ScanSettings build2 = new ScanSettings.Builder().setReportDelay(m3711()).setScanMode(2).build();
        this.f3029 = scanCallback;
        BluetoothLeScanner bluetoothLeScanner = this.f3030;
        if (bluetoothLeScanner == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            fM.m2252((Object) defaultAdapter, "");
            bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        }
        this.f3030 = bluetoothLeScanner;
        BluetoothLeScanner bluetoothLeScanner2 = this.f3030;
        if (bluetoothLeScanner2 != null) {
            bluetoothLeScanner2.startScan(arrayList, build2, scanCallback);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3715() {
        try {
            if (this.f3029 != null) {
                if (((Boolean) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", (Class[]) null).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), (Object[]) null)).booleanValue()) {
                    BluetoothLeScanner bluetoothLeScanner = this.f3030;
                    if (bluetoothLeScanner != null) {
                        bluetoothLeScanner.stopScan(this.f3029);
                    }
                    lA.f2728.m3368(this.f3033, "scanning stopped");
                }
            }
        } catch (Throwable th) {
            lA.C0215 r1 = lA.f2728;
            String str = this.f3033;
            r1.m3375(str, "unable to stop scanning - callback null or bluetooth off? : " + th.getLocalizedMessage());
        }
    }
}
