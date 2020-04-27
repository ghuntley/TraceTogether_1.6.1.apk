package o;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import sg.gov.tech.bluetrace.BuildConfig;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\u0018\u00002\u00020\u0016B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0003R+\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u0006*\u00020\u00100\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011"}, d2 = {"Lo/lv;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "Ɩ", "Landroid/bluetooth/BluetoothGattCharacteristic;", "ɩ", "Landroid/content/Context;", "ı", "Landroid/content/Context;", "Ι", "ι", "Landroid/bluetooth/BluetoothGattService;", "p0", "Lo/gh;", "()Landroid/bluetooth/BluetoothGattService;", "ǃ", "(Landroid/bluetooth/BluetoothGattService;)V", "Ljava/util/UUID;", "Ljava/util/UUID;", "", "p1", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lv  reason: case insensitive filesystem */
public final class C3579lv {

    /* renamed from: ι  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f3007 = {C3428gc.m2390((fQ) new fS(C3428gc.m2389(C3579lv.class), "gattService", "getGattService()Landroid/bluetooth/BluetoothGattService;"))};

    /* renamed from: ı  reason: contains not printable characters */
    public final Context f3008;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private BluetoothGattCharacteristic f3009;

    /* renamed from: ǃ  reason: contains not printable characters */
    private UUID f3010;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3433gh f3011 = fY.f2174.m2283();

    /* renamed from: Ι  reason: contains not printable characters */
    private BluetoothGattCharacteristic f3012;

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3699(BluetoothGattService bluetoothGattService) {
        fM.m2254(bluetoothGattService, "");
        this.f3011.m2404(this, f3007[0], bluetoothGattService);
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final BluetoothGattService m3700() {
        return (BluetoothGattService) this.f3011.m2405(this, f3007[0]);
    }

    public C3579lv(Context context, String str) {
        fM.m2254(context, "");
        fM.m2254(str, "");
        this.f3008 = context;
        this.f3010 = UUID.fromString(str);
        m3699(new BluetoothGattService(this.f3010, 0));
        this.f3012 = new BluetoothGattCharacteristic(this.f3010, 10, 17);
        m3700().addCharacteristic(this.f3012);
        this.f3009 = new BluetoothGattCharacteristic(UUID.fromString(BuildConfig.V2_CHARACTERISTIC_ID), 10, 17);
        m3700().addCharacteristic(this.f3009);
    }
}
