package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.Handler;
import android.os.ParcelUuid;
import java.nio.charset.Charset;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\u0018\u00002\u00020+B\u000f\u0012\u0006\u0010%\u001a\u00020\u0001¢\u0006\u0004\b)\u0010*J\u0015\u0010\u0004\u001a\u00020&2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\u0004\u0010'J\u0015\u0010\u0013\u001a\u00020&2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\u0013\u0010'J\r\u0010\u0013\u001a\u00020&¢\u0006\u0004\b\u0013\u0010(R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00148\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00168\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b\u0013\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\u001b8\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0015\u0010\u000e\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u0003R\u0019\u0010\n\u001a\u0006*\u00020\u001e0\u001e8\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001c\u0010\u0017\u001a\u00020\u00168\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u0004\u0010\u0019R\u0016\u0010#\u001a\u00020!8\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\""}, d2 = {"Lo/lx;", "", "І", "Ljava/lang/String;", "ι", "Landroid/bluetooth/le/BluetoothLeAdvertiser;", "Ӏ", "Landroid/bluetooth/le/BluetoothLeAdvertiser;", "ɩ", "Landroid/bluetooth/le/AdvertiseCallback;", "і", "Landroid/bluetooth/le/AdvertiseCallback;", "ı", "", "ɹ", "I", "Ι", "Landroid/bluetooth/le/AdvertiseData;", "Landroid/bluetooth/le/AdvertiseData;", "ǃ", "Landroid/os/Handler;", "Landroid/os/Handler;", "", "ɪ", "Z", "()Z", "(Z)V", "Landroid/os/ParcelUuid;", "Landroid/os/ParcelUuid;", "Ɩ", "Landroid/bluetooth/le/AdvertiseSettings;", "Landroid/bluetooth/le/AdvertiseSettings;", "ӏ", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "ɨ", "", "p0", "", "(J)V", "()V", "<init>", "(Ljava/lang/String;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lx  reason: case insensitive filesystem */
public final class C3581lx {

    /* renamed from: ı  reason: contains not printable characters */
    public Handler f3013 = new Handler();

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final String f3014;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final AdvertiseSettings f3015 = new AdvertiseSettings.Builder().setTxPowerLevel(3).setAdvertiseMode(2).setConnectable(true).setTimeout(0).build();

    /* renamed from: ɩ  reason: contains not printable characters */
    public AdvertiseData f3016;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f3017;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f3018 = 3;

    /* renamed from: Ι  reason: contains not printable characters */
    public Runnable f3019 = new Runnable(this) {

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ C3581lx f3025;

        {
            this.f3025 = r1;
        }

        public final void run() {
            lA.f2728.m3369(this.f3025.f3021, "Advertising stopping as scheduled.");
            this.f3025.m3704();
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    public final ParcelUuid f3020 = new ParcelUuid(UUID.fromString(this.f3014));
    /* access modifiers changed from: private */

    /* renamed from: І  reason: contains not printable characters */
    public final String f3021 = "BLEAdvertiser";

    /* renamed from: і  reason: contains not printable characters */
    private AdvertiseCallback f3022 = new Cif(this);

    /* renamed from: Ӏ  reason: contains not printable characters */
    private BluetoothLeAdvertiser f3023;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f3024;

    public C3581lx(String str) {
        fM.m2254(str, "");
        this.f3014 = str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        fM.m2252((Object) defaultAdapter, "");
        this.f3023 = defaultAdapter.getBluetoothLeAdvertiser();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\tJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/lx$if;", "", "p0", "", "onStartFailure", "(I)V", "Landroid/bluetooth/le/AdvertiseSettings;", "onStartSuccess", "(Landroid/bluetooth/le/AdvertiseSettings;)V", "Landroid/bluetooth/le/AdvertiseCallback;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lx$if  reason: invalid class name */
    public static final class Cif extends AdvertiseCallback {

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ C3581lx f3026;

        Cif(C3581lx lxVar) {
            this.f3026 = lxVar;
        }

        public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
            fM.m2254(advertiseSettings, "");
            super.onStartSuccess(advertiseSettings);
            lA.f2728.m3369(this.f3026.f3021, "Advertising onStartSuccess");
            lA.C0215 r1 = lA.f2728;
            String r2 = this.f3026.f3021;
            String advertiseSettings2 = advertiseSettings.toString();
            fM.m2252((Object) advertiseSettings2, "");
            r1.m3369(r2, advertiseSettings2);
            this.f3026.m3706(true);
        }

        public final void onStartFailure(int i) {
            String str;
            super.onStartFailure(i);
            if (i == 1) {
                this.f3026.m3706(false);
                C3581lx lxVar = this.f3026;
                lxVar.f3018 = lxVar.f3018 - 1;
                str = "ADVERTISE_FAILED_DATA_TOO_LARGE";
            } else if (i == 2) {
                this.f3026.m3706(false);
                str = "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS";
            } else if (i == 3) {
                this.f3026.m3706(true);
                str = "ADVERTISE_FAILED_ALREADY_STARTED";
            } else if (i == 4) {
                this.f3026.m3706(false);
                str = "ADVERTISE_FAILED_INTERNAL_ERROR";
            } else if (i != 5) {
                str = "UNDOCUMENTED";
            } else {
                this.f3026.m3706(false);
                str = "ADVERTISE_FAILED_FEATURE_UNSUPPORTED";
            }
            lA.C0215 r1 = lA.f2728;
            String r2 = this.f3026.f3021;
            r1.m3368(r2, "Advertising onStartFailure: " + i + " - " + str);
        }
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3706(boolean z) {
        this.f3017 = z;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m3707() {
        return this.f3017;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m3709() {
        return this.f3024;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3705(long j) {
        String uuid = UUID.randomUUID().toString();
        fM.m2252((Object) uuid, "");
        String substring = uuid.substring(uuid.length() - this.f3018, uuid.length());
        fM.m2252((Object) substring, "");
        lA.C0215 r2 = lA.f2728;
        String str = this.f3021;
        r2.m3368(str, "Unique string: " + substring);
        Charset charset = gL.f2204;
        if (substring != null) {
            byte[] bytes = substring.getBytes(charset);
            fM.m2252((Object) bytes, "");
            this.f3016 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(true).addServiceUuid(this.f3020).addManufacturerData(1023, bytes).build();
            try {
                lA.f2728.m3368(this.f3021, "Start advertising");
                BluetoothLeAdvertiser bluetoothLeAdvertiser = this.f3023;
                if (bluetoothLeAdvertiser == null) {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    fM.m2252((Object) defaultAdapter, "");
                    bluetoothLeAdvertiser = defaultAdapter.getBluetoothLeAdvertiser();
                }
                this.f3023 = bluetoothLeAdvertiser;
                BluetoothLeAdvertiser bluetoothLeAdvertiser2 = this.f3023;
                if (bluetoothLeAdvertiser2 != null) {
                    bluetoothLeAdvertiser2.startAdvertising(this.f3015, this.f3016, this.f3022);
                }
            } catch (Throwable th) {
                lA.C0215 r1 = lA.f2728;
                String str2 = this.f3021;
                r1.m3375(str2, "Failed to start advertising legacy: " + th.getMessage());
            }
            if (!lR.f2769.m3514()) {
                this.f3013.removeCallbacksAndMessages(this.f3019);
                this.f3013.postDelayed(this.f3019, j);
                return;
            }
            return;
        }
        throw new dA("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3708(long j) {
        m3705(j);
        this.f3024 = true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3704() {
        try {
            lA.f2728.m3368(this.f3021, "stop advertising");
            BluetoothLeAdvertiser bluetoothLeAdvertiser = this.f3023;
            if (bluetoothLeAdvertiser != null) {
                bluetoothLeAdvertiser.stopAdvertising(this.f3022);
            }
        } catch (Throwable th) {
            lA.C0215 r1 = lA.f2728;
            String str = this.f3021;
            r1.m3375(str, "Failed to stop advertising: " + th.getMessage());
        }
        this.f3024 = false;
        this.f3013.removeCallbacksAndMessages((Object) null);
    }
}
