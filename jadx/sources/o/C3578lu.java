package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.lA;
import sg.gov.tech.bluetrace.idmanager.TempIDManager;
import sg.gov.tech.bluetrace.protocol.BlueTrace;
import sg.gov.tech.bluetrace.protocol.BlueTraceProtocol;
import sg.gov.tech.bluetrace.protocol.PeripheralInterface;
import sg.gov.tech.bluetrace.streetpass.ConnectionRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\u0018\u00002\u00020\"B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0001¢\u0006\u0004\b \u0010!J\u0015\u0010\u0007\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0019¢\u0006\u0004\b\u0007\u0010\u001bJ\r\u0010\f\u001a\u00020\u001c¢\u0006\u0004\b\f\u0010\u001dJ\r\u0010\u0004\u001a\u00020\u001a¢\u0006\u0004\b\u0004\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8C@CX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000e\"\u0004\b\u0004\u0010\u000fR\u0019\u0010\f\u001a\u00020\u00108\u0007@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0002\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178B@CX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\r\"\u0004\b\f\u0010\u0018"}, d2 = {"Lo/lu;", "", "ι", "Ljava/lang/String;", "ǃ", "Landroid/bluetooth/BluetoothGattServer;", "Landroid/bluetooth/BluetoothGattServer;", "ɩ", "()Landroid/bluetooth/BluetoothGattServer;", "ı", "Landroid/bluetooth/BluetoothManager;", "p0", "Ι", "Lo/gh;", "()Landroid/bluetooth/BluetoothManager;", "(Landroid/bluetooth/BluetoothManager;)V", "Landroid/content/Context;", "і", "Landroid/content/Context;", "()Landroid/content/Context;", "Lo/lu$ɩ;", "Ӏ", "Lo/lu$ɩ;", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "Lo/lv;", "", "(Lo/lv;)V", "", "()Z", "()V", "p1", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lu  reason: case insensitive filesystem */
public final class C3578lu {

    /* renamed from: ı  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f2996;

    /* renamed from: ǃ  reason: contains not printable characters */
    private BluetoothGattServer f2997;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3433gh f2998 = fY.f2174.m2283();

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3433gh f2999 = fY.f2174.m2283();
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final String f3000 = "GattServer";

    /* renamed from: і  reason: contains not printable characters */
    private final Context f3001;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0229 f3002;

    static {
        Class<C3578lu> cls = C3578lu.class;
        f2996 = new C3444gs[]{C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "bluetoothManager", "getBluetoothManager()Landroid/bluetooth/BluetoothManager;")), C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "serviceUUID", "getServiceUUID()Ljava/util/UUID;"))};
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    private final BluetoothManager m3689() {
        return (BluetoothManager) this.f2999.m2405(this, f2996[0]);
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m3690(BluetoothManager bluetoothManager) {
        this.f2999.m2404(this, f2996[0], bluetoothManager);
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    private final void m3692(UUID uuid) {
        this.f2998.m2404(this, f2996[1], uuid);
    }

    public C3578lu(Context context, String str) {
        fM.m2254(context, "");
        fM.m2254(str, "");
        this.f3001 = context;
        Object systemService = this.f3001.getSystemService("bluetooth");
        if (systemService != null) {
            m3690((BluetoothManager) systemService);
            UUID fromString = UUID.fromString(str);
            fM.m2252((Object) fromString, "");
            m3692(fromString);
            this.f3002 = new C0229(this);
            return;
        }
        throw new dA("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final Context m3697() {
        return this.f3001;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final BluetoothGattServer m3694() {
        return this.f2997;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020 J3\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u0019\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\n\u0010\u001fR!\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0005R!\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0005"}, d2 = {"Lo/lu$ɩ;", "", "", "Ljava/util/UUID;", "ǃ", "Ljava/util/Map;", "ι", "", "ɩ", "ı", "Ι", "Landroid/bluetooth/BluetoothDevice;", "p0", "", "p1", "p2", "Landroid/bluetooth/BluetoothGattCharacteristic;", "p3", "", "onCharacteristicReadRequest", "(Landroid/bluetooth/BluetoothDevice;IILandroid/bluetooth/BluetoothGattCharacteristic;)V", "", "p4", "p5", "p6", "onCharacteristicWriteRequest", "(Landroid/bluetooth/BluetoothDevice;ILandroid/bluetooth/BluetoothGattCharacteristic;ZZI[B)V", "onConnectionStateChange", "(Landroid/bluetooth/BluetoothDevice;II)V", "onExecuteWrite", "(Landroid/bluetooth/BluetoothDevice;IZ)V", "(Landroid/bluetooth/BluetoothDevice;)V", "Landroid/bluetooth/BluetoothGattServerCallback;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lu$ɩ  reason: contains not printable characters */
    public static final class C0229 extends BluetoothGattServerCallback {

        /* renamed from: ı  reason: contains not printable characters */
        public final Map<String, byte[]> f3003 = new HashMap();

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Map<String, UUID> f3004 = new HashMap();

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Map<String, byte[]> f3005 = new HashMap();

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ C3578lu f3006;

        C0229(C3578lu luVar) {
            this.f3006 = luVar;
        }

        public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
            String str = null;
            if (i2 == 0) {
                lA.C0215 r7 = lA.f2728;
                String r0 = this.f3006.f3000;
                StringBuilder sb = new StringBuilder();
                if (bluetoothDevice != null) {
                    str = bluetoothDevice.getAddress();
                }
                sb.append(str);
                sb.append(" Disconnected from local GATT server.");
                r7.m3369(r0, sb.toString());
            } else if (i2 != 2) {
                lA.C0215 r02 = lA.f2728;
                String r1 = this.f3006.f3000;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Connection status: ");
                sb2.append(i2);
                sb2.append(" - ");
                if (bluetoothDevice != null) {
                    str = bluetoothDevice.getAddress();
                }
                sb2.append(str);
                r02.m3369(r1, sb2.toString());
            } else {
                lA.C0215 r72 = lA.f2728;
                String r03 = this.f3006.f3000;
                StringBuilder sb3 = new StringBuilder();
                if (bluetoothDevice != null) {
                    str = bluetoothDevice.getAddress();
                }
                sb3.append(str);
                sb3.append(" Connected to local GATT server");
                r72.m3369(r03, sb3.toString());
            }
        }

        public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            UUID uuid;
            if (bluetoothDevice == null) {
                lA.f2728.m3372(this.f3006.f3000, "No device");
            }
            if (bluetoothDevice != null) {
                lA.C0215 r1 = lA.f2728;
                String r3 = this.f3006.f3000;
                r1.m3369(r3, "onCharacteristicReadRequest from " + bluetoothDevice.getAddress());
                if (!BlueTrace.INSTANCE.supportsCharUUID(bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getUuid() : null)) {
                    lA.C0215 r0 = lA.f2728;
                    String r12 = this.f3006.f3000;
                    r0.m3369(r12, "unsupported characteristic UUID from " + bluetoothDevice.getAddress());
                    BluetoothGattServer r02 = this.f3006.m3694();
                    if (r02 != null) {
                        r02.sendResponse(bluetoothDevice, i, 257, 0, (byte[]) null);
                    }
                } else if (bluetoothGattCharacteristic != null && (uuid = bluetoothGattCharacteristic.getUuid()) != null) {
                    BlueTraceProtocol implementation = BlueTrace.INSTANCE.getImplementation(uuid);
                    if (TempIDManager.INSTANCE.bmValid(this.f3006.m3697())) {
                        Map<String, byte[]> map = this.f3005;
                        String address = bluetoothDevice.getAddress();
                        fM.m2252((Object) address, "");
                        byte[] bArr = map.get(address);
                        if (bArr == null) {
                            bArr = implementation.getPeripheral().prepareReadRequestData(implementation.getVersionInt());
                            map.put(address, bArr);
                        }
                        byte[] bArr2 = bArr;
                        byte[] r7 = dM.m2064(bArr2, i2, bArr2.length);
                        lA.C0215 r13 = lA.f2728;
                        String r32 = this.f3006.f3000;
                        r13.m3369(r32, "onCharacteristicReadRequest from " + bluetoothDevice.getAddress() + " - " + i + "- " + i2 + " - " + new String(r7, gL.f2204));
                        BluetoothGattServer r03 = this.f3006.m3694();
                        if (r03 != null) {
                            r03.sendResponse(bluetoothDevice, i, 0, 0, r7);
                            return;
                        }
                        return;
                    }
                    lA.C0215 r14 = lA.f2728;
                    String r33 = this.f3006.f3000;
                    r14.m3369(r33, "onCharacteristicReadRequest from " + bluetoothDevice.getAddress() + " - " + i + "- " + i2 + " - BM Expired");
                    BluetoothGattServer r04 = this.f3006.m3694();
                    if (r04 != null) {
                        r04.sendResponse(bluetoothDevice, i, 257, 0, new byte[0]);
                    }
                }
            }
        }

        public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
            BluetoothGattServer r1;
            String str;
            BluetoothGattServer r12;
            boolean z3 = z;
            byte[] bArr2 = bArr;
            fM.m2254(bluetoothGattCharacteristic, "");
            if (bluetoothDevice == null) {
                lA.f2728.m3375(this.f3006.f3000, "Write stopped - no device");
            }
            if (bluetoothDevice != null) {
                lA.C0215 r3 = lA.f2728;
                String r4 = this.f3006.f3000;
                r3.m3369(r4, "onCharacteristicWriteRequest - " + bluetoothDevice.getAddress() + " - preparedWrite: " + z3);
                lA.C0215 r32 = lA.f2728;
                String r42 = this.f3006.f3000;
                r32.m3369(r42, "onCharacteristicWriteRequest from " + bluetoothDevice.getAddress() + " - " + i + " - " + i2);
                if (BlueTrace.INSTANCE.supportsCharUUID(bluetoothGattCharacteristic.getUuid())) {
                    Map<String, UUID> map = this.f3004;
                    String address = bluetoothDevice.getAddress();
                    fM.m2252((Object) address, "");
                    UUID uuid = bluetoothGattCharacteristic.getUuid();
                    fM.m2252((Object) uuid, "");
                    map.put(address, uuid);
                    if (bArr2 != null) {
                        str = new String(bArr2, gL.f2204);
                    } else {
                        str = "";
                    }
                    lA.C0215 r2 = lA.f2728;
                    String r43 = this.f3006.f3000;
                    r2.m3369(r43, "onCharacteristicWriteRequest from " + bluetoothDevice.getAddress() + " - " + str);
                    if (bArr2 != null) {
                        byte[] bArr3 = this.f3003.get(bluetoothDevice.getAddress());
                        if (bArr3 == null) {
                            bArr3 = new byte[0];
                        }
                        byte[] r22 = dM.m2060(bArr3, bArr2);
                        Map<String, byte[]> map2 = this.f3003;
                        String address2 = bluetoothDevice.getAddress();
                        fM.m2252((Object) address2, "");
                        map2.put(address2, r22);
                        lA.C0215 r13 = lA.f2728;
                        String r33 = this.f3006.f3000;
                        r13.m3369(r33, "Accumulated characteristic: " + new String(r22, gL.f2204));
                        if (z3 && z2) {
                            lA.C0215 r14 = lA.f2728;
                            String r34 = this.f3006.f3000;
                            r14.m3369(r34, "Sending response offset: " + r22.length);
                            BluetoothGattServer r15 = this.f3006.m3694();
                            if (r15 != null) {
                                r15.sendResponse(bluetoothDevice, i, 0, r22.length, bArr);
                            }
                        }
                        if (!z3) {
                            lA.C0215 r16 = lA.f2728;
                            String r23 = this.f3006.f3000;
                            r16.m3369(r23, "onCharacteristicWriteRequest - " + bluetoothDevice.getAddress() + " - preparedWrite: " + z3);
                            m3698(bluetoothDevice);
                            if (z2 && (r12 = this.f3006.m3694()) != null) {
                                r12.sendResponse(bluetoothDevice, i, 0, 0, (byte[]) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                lA.C0215 r17 = lA.f2728;
                String r24 = this.f3006.f3000;
                r17.m3369(r24, "unsupported characteristic UUID from " + bluetoothDevice.getAddress());
                if (z2 && (r1 = this.f3006.m3694()) != null) {
                    r1.sendResponse(bluetoothDevice, i, 257, 0, (byte[]) null);
                }
            }
        }

        public final void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) {
            fM.m2254(bluetoothDevice, "");
            super.onExecuteWrite(bluetoothDevice, i, z);
            byte[] bArr = this.f3003.get(bluetoothDevice.getAddress());
            if (bArr != null) {
                lA.C0215 r0 = lA.f2728;
                String r1 = this.f3006.f3000;
                r0.m3369(r1, "onExecuteWrite - " + i + "- " + bluetoothDevice.getAddress() + " - " + new String(bArr, gL.f2204));
                m3698(bluetoothDevice);
                BluetoothGattServer r02 = this.f3006.m3694();
                if (r02 != null) {
                    r02.sendResponse(bluetoothDevice, i, 0, 0, (byte[]) null);
                    return;
                }
                return;
            }
            BluetoothGattServer r03 = this.f3006.m3694();
            if (r03 != null) {
                r03.sendResponse(bluetoothDevice, i, 257, 0, (byte[]) null);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m3698(BluetoothDevice bluetoothDevice) {
            fM.m2254(bluetoothDevice, "");
            byte[] bArr = this.f3003.get(bluetoothDevice.getAddress());
            UUID uuid = this.f3004.get(bluetoothDevice.getAddress());
            if (uuid != null && bArr != null) {
                try {
                    PeripheralInterface peripheral = BlueTrace.INSTANCE.getImplementation(uuid).getPeripheral();
                    String address = bluetoothDevice.getAddress();
                    fM.m2252((Object) address, "");
                    ConnectionRecord processWriteRequestDataReceived = peripheral.processWriteRequestDataReceived(bArr, address);
                    if (processWriteRequestDataReceived != null) {
                        Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                        Context r13 = this.f3006.m3697();
                        Object[] objArr = new Object[2];
                        objArr[1] = processWriteRequestDataReceived;
                        objArr[0] = r13;
                        ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", new Class[]{Context.class, ConnectionRecord.class}).invoke(obj, objArr);
                    }
                } catch (Throwable th) {
                    lA.C0215 r5 = lA.f2728;
                    String r132 = this.f3006.f3000;
                    r5.m3375(r132, "Failed to process write payload - " + th.getMessage());
                }
                Object obj2 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                Context r52 = this.f3006.m3697();
                String address2 = bluetoothDevice.getAddress();
                fM.m2252((Object) address2, "");
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[1] = address2;
                    objArr2[0] = r52;
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Context.class, String.class}).invoke(obj2, objArr2);
                    this.f3003.remove(bluetoothDevice.getAddress());
                    this.f3005.remove(bluetoothDevice.getAddress());
                    UUID remove = this.f3004.remove(bluetoothDevice.getAddress());
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m3696() {
        this.f2997 = m3689().openGattServer(this.f3001, this.f3002);
        BluetoothGattServer bluetoothGattServer = this.f2997;
        if (bluetoothGattServer == null) {
            return false;
        }
        bluetoothGattServer.clearServices();
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3695(C3579lv lvVar) {
        fM.m2254(lvVar, "");
        BluetoothGattServer bluetoothGattServer = this.f2997;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.addService(lvVar.m3700());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3693() {
        try {
            BluetoothGattServer bluetoothGattServer = this.f2997;
            if (bluetoothGattServer != null) {
                bluetoothGattServer.clearServices();
            }
            BluetoothGattServer bluetoothGattServer2 = this.f2997;
            if (bluetoothGattServer2 != null) {
                bluetoothGattServer2.close();
            }
        } catch (Throwable th) {
            lA.C0215 r1 = lA.f2728;
            String str = this.f3000;
            r1.m3375(str, "GATT server can't be closed elegantly " + th.getLocalizedMessage());
        }
    }
}
