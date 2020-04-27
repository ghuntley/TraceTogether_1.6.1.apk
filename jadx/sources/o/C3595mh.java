package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3594mg;
import o.lA;
import sg.gov.tech.bluetrace.BuildConfig;
import sg.gov.tech.bluetrace.idmanager.TempIDManager;
import sg.gov.tech.bluetrace.protocol.BlueTrace;
import sg.gov.tech.bluetrace.protocol.BlueTraceProtocol;
import sg.gov.tech.bluetrace.protocol.CentralInterface;
import sg.gov.tech.bluetrace.streetpass.ConnectionRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\u0018\u00002\u000209:\u00036\u0007\u0004B\u000f\u0012\u0006\u0010-\u001a\u00020\u0017¢\u0006\u0004\b7\u00108J\u0015\u0010\u0011\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001b¢\u0006\u0004\b\u0011\u0010/J\r\u0010\r\u001a\u000200¢\u0006\u0004\b\r\u00101J\u0015\u0010\t\u001a\u0002002\u0006\u0010-\u001a\u00020\u001b¢\u0006\u0004\b\t\u00102J\u0017\u0010\u0011\u001a\u00020.2\u0006\u0010-\u001a\u000203H\u0002¢\u0006\u0004\b\u0011\u00104J\u0017\u0010\r\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u00105J\u000f\u0010\u0013\u001a\u000200H\u0002¢\u0006\u0004\b\u0013\u00101J\r\u0010\t\u001a\u000200¢\u0006\u0004\b\t\u00101J\r\u0010\u0011\u001a\u000200¢\u0006\u0004\b\u0011\u00101R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0019\u0010\u000f\u001a\u00020\u00178\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0004\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0002\u001a\u00060\u001eR\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010\u0015\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u00020#8\u0007@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0007\u0010&R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010\fR\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u001a\u0010,\u001a\u00060*R\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+"}, d2 = {"Lo/mh;", "", "І", "Ljava/lang/String;", "ı", "", "Lo/lU;", "ǃ", "Ljava/util/List;", "ι", "Landroid/os/Handler;", "ɨ", "Landroid/os/Handler;", "ɩ", "Landroid/bluetooth/BluetoothManager;", "Ӏ", "Landroid/bluetooth/BluetoothManager;", "Ι", "Ljava/util/UUID;", "ɹ", "Ljava/util/UUID;", "і", "Ɩ", "Landroid/content/Context;", "ɿ", "Landroid/content/Context;", "()Landroid/content/Context;", "Lo/mg;", "ɾ", "Lo/mg;", "Lo/mh$If;", "Lo/mh$If;", "Lo/ıͻ;", "ɪ", "Lo/ıͻ;", "Lo/mg$ı;", "ȷ", "Lo/mg$ı;", "()Lo/mg$ı;", "ӏ", "Ljava/util/concurrent/PriorityBlockingQueue;", "Ljava/util/concurrent/PriorityBlockingQueue;", "Lo/mh$ı;", "Lo/mh$ı;", "ʟ", "p0", "", "(Lo/mg;)Z", "", "()V", "(Lo/mg;)V", "Landroid/bluetooth/BluetoothDevice;", "(Landroid/bluetooth/BluetoothDevice;)Z", "(Ljava/lang/String;)Z", "If", "<init>", "(Landroid/content/Context;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mh  reason: case insensitive filesystem */
public final class C3595mh {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final UUID f3235;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Handler f3236;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<lU> f3237;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C3594mg.C0251 f3238;

    /* renamed from: ɨ  reason: contains not printable characters */
    private Handler f3239;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final PriorityBlockingQueue<C3594mg> f3240 = new PriorityBlockingQueue<>();

    /* renamed from: ɪ  reason: contains not printable characters */
    private C0375 f3241;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public final UUID f3242;
    /* access modifiers changed from: private */

    /* renamed from: ɾ  reason: contains not printable characters */
    public C3594mg f3243;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final Context f3244;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0253 f3245;

    /* renamed from: ι  reason: contains not printable characters */
    private final If f3246;
    /* access modifiers changed from: private */

    /* renamed from: І  reason: contains not printable characters */
    public final String f3247;
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public final UUID f3248;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final BluetoothManager f3249;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Handler f3250;

    public C3595mh(Context context) {
        fM.m2254(context, "");
        this.f3244 = context;
        List<lU> synchronizedList = Collections.synchronizedList(new ArrayList());
        fM.m2252((Object) synchronizedList, "");
        this.f3237 = synchronizedList;
        this.f3245 = new C0253();
        this.f3246 = new If();
        UUID fromString = UUID.fromString("B82AB3FC-1595-4F6A-80F0-FE094CC218F9");
        fM.m2252((Object) fromString, "");
        this.f3235 = fromString;
        UUID fromString2 = UUID.fromString("B82AB3FC-1595-4F6A-80F0-FE094CC218F9");
        fM.m2252((Object) fromString2, "");
        this.f3242 = fromString2;
        UUID fromString3 = UUID.fromString(BuildConfig.V2_CHARACTERISTIC_ID);
        fM.m2252((Object) fromString3, "");
        this.f3248 = fromString3;
        this.f3247 = "StreetPassWorker";
        Object systemService = this.f3244.getSystemService("bluetooth");
        if (systemService != null) {
            this.f3249 = (BluetoothManager) systemService;
            C0375 r3 = C0375.m4583(this.f3244);
            fM.m2252((Object) r3, "");
            this.f3241 = r3;
            this.f3238 = new Cif(this);
            m3861();
            return;
        }
        throw new dA("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final /* synthetic */ Handler m3860(C3595mh mhVar) {
        Handler handler = mhVar.f3236;
        if (handler == null) {
            fM.m2253("timeoutHandler");
        }
        return handler;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static final /* synthetic */ Handler m3866(C3595mh mhVar) {
        Handler handler = mhVar.f3239;
        if (handler == null) {
            fM.m2253("blacklistHandler");
        }
        return handler;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final Context m3869() {
        return this.f3244;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0006J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/mh$if;", "Lo/mg;", "p0", "", "ı", "(Lo/mg;)V", "Lo/mg$ı;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.mh$if  reason: invalid class name */
    public static final class Cif implements C3594mg.C0251 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ C3595mh f3256;

        Cif(C3595mh mhVar) {
            this.f3256 = mhVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x00e9, code lost:
            r3 = r3.m3843();
         */
        /* renamed from: ı  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m3877(o.C3594mg r8) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                o.fM.m2254(r8, r0)
                o.mh r0 = r7.f3256
                android.bluetooth.BluetoothDevice r1 = r8.m3843()
                java.lang.String r1 = r1.getAddress()
                boolean r0 = r0.m3872((java.lang.String) r1)
                if (r0 != 0) goto L_0x0022
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r1 = r7.f3256
                java.lang.String r1 = r1.f3247
                java.lang.String r2 = "Work already removed. Timeout ineffective??."
                r0.m3369(r1, r2)
            L_0x0022:
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r1 = r7.f3256
                java.lang.String r1 = r1.f3247
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Work timed out for "
                r2.append(r3)
                android.bluetooth.BluetoothDevice r3 = r8.m3843()
                java.lang.String r3 = r3.getAddress()
                r2.append(r3)
                java.lang.String r3 = " @ "
                r2.append(r3)
                o.mc r3 = r8.m3832()
                int r3 = r3.m3810()
                r2.append(r3)
                java.lang.String r3 = " queued for "
                r2.append(r3)
                o.mg$If r3 = r8.m3831()
                o.mg$ǃ r3 = r3.m3845()
                long r3 = r3.m3855()
                long r5 = r8.m3833()
                long r3 = r3 - r5
                r2.append(r3)
                java.lang.String r3 = "ms"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.m3375(r1, r2)
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r1 = r7.f3256
                java.lang.String r1 = r1.f3247
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                android.bluetooth.BluetoothDevice r3 = r8.m3843()
                java.lang.String r3 = r3.getAddress()
                r2.append(r3)
                java.lang.String r3 = " work status: "
                r2.append(r3)
                o.mg$If r3 = r8.m3831()
                r2.append(r3)
                r3 = 46
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.m3375(r1, r2)
                o.mg$If r0 = r8.m3831()
                o.mg$ǃ r0 = r0.m3849()
                boolean r0 = r0.m3854()
                java.lang.String r1 = ": "
                r2 = 0
                if (r0 != 0) goto L_0x0142
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r3 = r7.f3256
                java.lang.String r3 = r3.f3247
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "No connection formed for "
                r4.append(r5)
                android.bluetooth.BluetoothDevice r5 = r8.m3843()
                java.lang.String r5 = r5.getAddress()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0.m3375(r3, r4)
                android.bluetooth.BluetoothDevice r0 = r8.m3843()
                java.lang.String r0 = r0.getAddress()
                o.mh r3 = r7.f3256
                o.mg r3 = r3.f3243
                if (r3 == 0) goto L_0x00f4
                android.bluetooth.BluetoothDevice r3 = r3.m3843()
                if (r3 == 0) goto L_0x00f4
                java.lang.String r3 = r3.getAddress()
                goto L_0x00f5
            L_0x00f4:
                r3 = r2
            L_0x00f5:
                boolean r0 = o.fM.m2257(r0, r3)
                if (r0 == 0) goto L_0x0102
                o.mh r0 = r7.f3256
                o.mg r2 = (o.C3594mg) r2
                r0.f3243 = r2
            L_0x0102:
                android.bluetooth.BluetoothGatt r0 = r8.m3842()     // Catch:{ Exception -> 0x010c }
                if (r0 == 0) goto L_0x013b
                r0.close()     // Catch:{ Exception -> 0x010c }
                goto L_0x013b
            L_0x010c:
                r0 = move-exception
                o.lA$ǃ r2 = o.lA.f2728
                o.mh r3 = r7.f3256
                java.lang.String r3 = r3.f3247
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Unexpected error while attempting to close clientIf to "
                r4.append(r5)
                android.bluetooth.BluetoothDevice r5 = r8.m3843()
                java.lang.String r5 = r5.getAddress()
                r4.append(r5)
                r4.append(r1)
                java.lang.String r0 = r0.getLocalizedMessage()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.m3375(r3, r0)
            L_0x013b:
                o.mh r0 = r7.f3256
                r0.m3876((o.C3594mg) r8)
                goto L_0x027b
            L_0x0142:
                o.mg$If r0 = r8.m3831()
                o.mg$ǃ r0 = r0.m3849()
                boolean r0 = r0.m3854()
                if (r0 == 0) goto L_0x024d
                o.mg$If r0 = r8.m3831()
                o.mg$ǃ r0 = r0.m3851()
                boolean r0 = r0.m3854()
                if (r0 != 0) goto L_0x024d
                o.mg$If r0 = r8.m3831()
                o.mg$ǃ r0 = r0.m3847()
                boolean r0 = r0.m3854()
                java.lang.String r1 = "Failed to clean up work, bluetooth state likely changed or other device's advertiser stopped: "
                if (r0 != 0) goto L_0x01ed
                o.mg$If r0 = r8.m3831()
                o.mg$ǃ r0 = r0.m3848()
                boolean r0 = r0.m3854()
                if (r0 != 0) goto L_0x01ed
                o.mg$If r0 = r8.m3831()
                o.mg$ǃ r0 = r0.m3850()
                boolean r0 = r0.m3854()
                if (r0 == 0) goto L_0x018b
                goto L_0x01ed
            L_0x018b:
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r3 = r7.f3256
                java.lang.String r3 = r3.f3247
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Connected but did nothing for "
                r4.append(r5)
                android.bluetooth.BluetoothDevice r5 = r8.m3843()
                java.lang.String r5 = r5.getAddress()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0.m3375(r3, r4)
                android.bluetooth.BluetoothGatt r0 = r8.m3842()     // Catch:{ all -> 0x01cc }
                if (r0 == 0) goto L_0x01b8
                r0.disconnect()     // Catch:{ all -> 0x01cc }
            L_0x01b8:
                android.bluetooth.BluetoothGatt r0 = r8.m3842()     // Catch:{ all -> 0x01cc }
                if (r0 != 0) goto L_0x027b
                o.mh r0 = r7.f3256     // Catch:{ all -> 0x01cc }
                o.mg r2 = (o.C3594mg) r2     // Catch:{ all -> 0x01cc }
                r0.f3243 = r2     // Catch:{ all -> 0x01cc }
                o.mh r0 = r7.f3256     // Catch:{ all -> 0x01cc }
                r0.m3876((o.C3594mg) r8)     // Catch:{ all -> 0x01cc }
                goto L_0x027b
            L_0x01cc:
                r8 = move-exception
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r2 = r7.f3256
                java.lang.String r2 = r2.f3247
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r8 = r8.getLocalizedMessage()
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                r0.m3375(r2, r8)
                goto L_0x027b
            L_0x01ed:
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r3 = r7.f3256
                java.lang.String r3 = r3.f3247
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Connected but did not disconnect in time for "
                r4.append(r5)
                android.bluetooth.BluetoothDevice r5 = r8.m3843()
                java.lang.String r5 = r5.getAddress()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r0.m3375(r3, r4)
                android.bluetooth.BluetoothGatt r0 = r8.m3842()     // Catch:{ all -> 0x022d }
                if (r0 == 0) goto L_0x021a
                r0.disconnect()     // Catch:{ all -> 0x022d }
            L_0x021a:
                android.bluetooth.BluetoothGatt r0 = r8.m3842()     // Catch:{ all -> 0x022d }
                if (r0 != 0) goto L_0x027b
                o.mh r0 = r7.f3256     // Catch:{ all -> 0x022d }
                o.mg r2 = (o.C3594mg) r2     // Catch:{ all -> 0x022d }
                r0.f3243 = r2     // Catch:{ all -> 0x022d }
                o.mh r0 = r7.f3256     // Catch:{ all -> 0x022d }
                r0.m3876((o.C3594mg) r8)     // Catch:{ all -> 0x022d }
                goto L_0x027b
            L_0x022d:
                r8 = move-exception
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r2 = r7.f3256
                java.lang.String r2 = r2.f3247
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r8 = r8.getLocalizedMessage()
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                r0.m3375(r2, r8)
                goto L_0x027b
            L_0x024d:
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r2 = r7.f3256
                java.lang.String r2 = r2.f3247
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Disconnected but callback not invoked in time. Waiting.: "
                r3.append(r4)
                android.bluetooth.BluetoothDevice r4 = r8.m3843()
                java.lang.String r4 = r4.getAddress()
                r3.append(r4)
                r3.append(r1)
                o.mg$If r8 = r8.m3831()
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                r0.m3375(r2, r8)
            L_0x027b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3595mh.Cif.m3877(o.mg):void");
        }
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3594mg.C0251 m3870() {
        return this.f3238;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private final void m3861() {
        this.f3241.m4586(this.f3245, new IntentFilter("sg.gov.tech.bluetrace.ACTION_DEVICE_SCANNED"));
        this.f3241.m4586(this.f3246, new IntentFilter("sg.gov.tech.bluetrace.ACTION_DEVICE_PROCESSED"));
        this.f3236 = new Handler();
        this.f3250 = new Handler();
        this.f3239 = new Handler();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m3872(String str) {
        C3594mg mgVar = this.f3243;
        if (mgVar != null) {
            return fM.m2257(mgVar.m3843().getAddress(), str);
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m3874(final C3594mg mgVar) {
        Object obj;
        fM.m2254(mgVar, "");
        if (m3872(mgVar.m3843().getAddress())) {
            lA.C0215 r0 = lA.f2728;
            String str = this.f3247;
            r0.m3369(str, mgVar.m3843().getAddress() + " is being worked on, not adding to queue");
            return false;
        }
        if (lR.f2769.m3503()) {
            Collection arrayList = new ArrayList();
            for (Object next : this.f3237) {
                if (fM.m2257(((lU) next).m3525(), mgVar.m3843().getAddress())) {
                    arrayList.add(next);
                }
            }
            if (!((List) arrayList).isEmpty()) {
                lA.C0215 r02 = lA.f2728;
                String str2 = this.f3247;
                r02.m3369(str2, mgVar.m3843().getAddress() + " is in blacklist, not adding to queue");
                return false;
            }
        }
        Collection arrayList2 = new ArrayList();
        for (Object next2 : this.f3240) {
            if (fM.m2257(((C3594mg) next2).m3843().getAddress(), mgVar.m3843().getAddress())) {
                arrayList2.add(next2);
            }
        }
        if (((List) arrayList2).isEmpty()) {
            this.f3240.offer(mgVar);
            Handler handler = this.f3250;
            if (handler == null) {
                fM.m2253("queueHandler");
            }
            handler.postDelayed(new Runnable(this) {

                /* renamed from: ı  reason: contains not printable characters */
                final /* synthetic */ C3595mh f3252;

                {
                    this.f3252 = r1;
                }

                public final void run() {
                    if (this.f3252.f3240.contains(mgVar)) {
                        lA.C0215 r0 = lA.f2728;
                        String r1 = this.f3252.f3247;
                        r0.m3369(r1, "Work for " + mgVar.m3843().getAddress() + " removed from queue? : " + this.f3252.f3240.remove(mgVar));
                    }
                }
            }, lR.f2769.m3512());
            lA.C0215 r03 = lA.f2728;
            String str3 = this.f3247;
            r03.m3369(str3, "Added to work queue: " + mgVar.m3843().getAddress());
            return true;
        }
        lA.C0215 r04 = lA.f2728;
        String str4 = this.f3247;
        r04.m3369(str4, mgVar.m3843().getAddress() + " is already in work queue");
        Iterator it = this.f3240.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (fM.m2257(((C3594mg) obj).m3843().getAddress(), mgVar.m3843().getAddress())) {
                break;
            }
        }
        boolean remove = this.f3240.remove((C3594mg) obj);
        boolean offer = this.f3240.offer(mgVar);
        lA.C0215 r2 = lA.f2728;
        String str5 = this.f3247;
        r2.m3369(str5, "Queue entry updated - removed: " + remove + ", added: " + offer);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r6 = r6.m3843();
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m3871() {
        /*
            r15 = this;
            java.lang.String r0 = "Moving on to next task"
            o.mg r1 = r15.f3243
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00e7
            o.lA$ǃ r0 = o.lA.f2728
            java.lang.String r1 = r15.f3247
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Already trying to connect to: "
            r5.append(r6)
            o.mg r6 = r15.f3243
            if (r6 == 0) goto L_0x0026
            android.bluetooth.BluetoothDevice r6 = r6.m3843()
            if (r6 == 0) goto L_0x0026
            java.lang.String r6 = r6.getAddress()
            goto L_0x0027
        L_0x0026:
            r6 = r4
        L_0x0027:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.m3369(r1, r5)
            long r0 = java.lang.System.currentTimeMillis()
            o.mg r5 = r15.f3243
            if (r5 == 0) goto L_0x003e
            long r5 = r5.m3840()
            goto L_0x0040
        L_0x003e:
            r5 = 0
        L_0x0040:
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            o.mg r0 = r15.f3243
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.m3837()
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0054
            if (r3 == 0) goto L_0x00e6
        L_0x0054:
            o.lA$ǃ r0 = o.lA.f2728
            java.lang.String r1 = r15.f3247
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Handling erroneous current work for "
            r5.append(r6)
            o.mg r6 = r15.f3243
            if (r6 == 0) goto L_0x0071
            android.bluetooth.BluetoothDevice r6 = r6.m3843()
            if (r6 == 0) goto L_0x0071
            java.lang.String r6 = r6.getAddress()
            goto L_0x0072
        L_0x0071:
            r6 = r4
        L_0x0072:
            r5.append(r6)
            java.lang.String r6 = " : - finished: "
            r5.append(r6)
            o.mg r6 = r15.f3243
            if (r6 == 0) goto L_0x0082
            boolean r2 = r6.m3837()
        L_0x0082:
            r5.append(r2)
            java.lang.String r2 = ", timedout: "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r0.m3372(r1, r2)
            o.mg r0 = r15.f3243
            if (r0 == 0) goto L_0x00e3
            android.bluetooth.BluetoothManager r0 = r15.f3249
            r1 = 7
            java.util.List r0 = r0.getConnectedDevices(r1)
            o.mg r1 = r15.f3243
            if (r1 == 0) goto L_0x00a8
            android.bluetooth.BluetoothDevice r1 = r1.m3843()
            goto L_0x00a9
        L_0x00a8:
            r1 = r4
        L_0x00a9:
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00e6
            o.lA$ǃ r0 = o.lA.f2728
            java.lang.String r1 = r15.f3247
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Disconnecting dangling connection to "
            r2.append(r3)
            o.mg r3 = r15.f3243
            if (r3 == 0) goto L_0x00cb
            android.bluetooth.BluetoothDevice r3 = r3.m3843()
            if (r3 == 0) goto L_0x00cb
            java.lang.String r4 = r3.getAddress()
        L_0x00cb:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.m3372(r1, r2)
            o.mg r0 = r15.f3243
            if (r0 == 0) goto L_0x00e6
            android.bluetooth.BluetoothGatt r0 = r0.m3842()
            if (r0 == 0) goto L_0x00e6
            r0.disconnect()
            goto L_0x00e6
        L_0x00e3:
            r15.m3871()
        L_0x00e6:
            return
        L_0x00e7:
            java.util.concurrent.PriorityBlockingQueue<o.mg> r1 = r15.f3240
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00f9
            o.lA$ǃ r0 = o.lA.f2728
            java.lang.String r1 = r15.f3247
            java.lang.String r2 = "Queue empty. Nothing to do."
            r0.m3369(r1, r2)
            return
        L_0x00f9:
            o.lA$ǃ r1 = o.lA.f2728
            java.lang.String r5 = r15.f3247
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Queue size: "
            r6.append(r7)
            java.util.concurrent.PriorityBlockingQueue<o.mg> r7 = r15.f3240
            int r7 = r7.size()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r1.m3369(r5, r6)
            r1 = r4
            o.mg r1 = (o.C3594mg) r1
            long r5 = java.lang.System.currentTimeMillis()
        L_0x011e:
            r7 = r1
        L_0x011f:
            if (r7 != 0) goto L_0x016c
            java.util.concurrent.PriorityBlockingQueue<o.mg> r8 = r15.f3240
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto L_0x016c
            java.util.concurrent.PriorityBlockingQueue<o.mg> r7 = r15.f3240
            java.lang.Object r7 = r7.poll()
            o.mg r7 = (o.C3594mg) r7
            if (r7 == 0) goto L_0x011f
            long r8 = r7.m3833()
            long r8 = r5 - r8
            o.lR$ı r10 = o.lR.f2769
            long r10 = r10.m3512()
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x011f
            o.lA$ǃ r8 = o.lA.f2728
            java.lang.String r9 = r15.f3247
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Work request for "
            r10.append(r11)
            android.bluetooth.BluetoothDevice r7 = r7.m3843()
            java.lang.String r7 = r7.getAddress()
            r10.append(r7)
            java.lang.String r7 = " too old. Not doing"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r8.m3372(r9, r7)
            goto L_0x011e
        L_0x016c:
            if (r7 == 0) goto L_0x0369
            android.bluetooth.BluetoothDevice r5 = r7.m3843()
            o.lR$ı r6 = o.lR.f2769
            boolean r6 = r6.m3503()
            if (r6 == 0) goto L_0x01d8
            java.util.List<o.lU> r6 = r15.f3237
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r6 = r6.iterator()
        L_0x0189:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01a8
            java.lang.Object r9 = r6.next()
            r10 = r9
            o.lU r10 = (o.lU) r10
            java.lang.String r10 = r10.m3525()
            java.lang.String r11 = r5.getAddress()
            boolean r10 = o.fM.m2257(r10, r11)
            if (r10 == 0) goto L_0x0189
            r8.add(r9)
            goto L_0x0189
        L_0x01a8:
            java.util.List r8 = (java.util.List) r8
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r6 = r8.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01d8
            o.lA$ǃ r0 = o.lA.f2728
            java.lang.String r1 = r15.f3247
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Already worked on "
            r2.append(r3)
            java.lang.String r3 = r5.getAddress()
            r2.append(r3)
            java.lang.String r3 = ". Skip."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.m3372(r1, r2)
            r15.m3871()
            return
        L_0x01d8:
            boolean r6 = r15.m3863((android.bluetooth.BluetoothDevice) r5)
            o.lA$ǃ r8 = o.lA.f2728
            java.lang.String r9 = r15.f3247
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Already connected to "
            r10.append(r11)
            java.lang.String r11 = r5.getAddress()
            r10.append(r11)
            java.lang.String r11 = " : "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r8.m3369(r9, r10)
            if (r6 == 0) goto L_0x0221
            o.mg$If r0 = r7.m3831()
            o.mg$ǃ r0 = r0.m3850()
            r0.m3856(r3)
            o.mg$If r0 = r7.m3831()
            o.mg$ǃ r0 = r0.m3850()
            long r1 = java.lang.System.currentTimeMillis()
            r0.m3853(r1)
            r15.m3876((o.C3594mg) r7)
            goto L_0x0369
        L_0x0221:
            o.mh$ǃ r6 = new o.mh$ǃ
            r6.<init>(r15, r7)
            o.lA$ǃ r8 = o.lA.f2728
            java.lang.String r9 = r15.f3247
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Starting work - connecting to device: "
            r10.append(r11)
            java.lang.String r11 = r5.getAddress()
            r10.append(r11)
            java.lang.String r11 = " @ "
            r10.append(r11)
            o.mc r11 = r7.m3832()
            int r11 = r11.m3810()
            r10.append(r11)
            r11 = 32
            r10.append(r11)
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = r7.m3833()
            long r11 = r11 - r13
            r10.append(r11)
            java.lang.String r11 = "ms ago"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r8.m3369(r9, r10)
            r15.f3243 = r7
            o.mg$If r8 = r7.m3831()     // Catch:{ all -> 0x0333 }
            o.mg$ǃ r8 = r8.m3845()     // Catch:{ all -> 0x0333 }
            r8.m3856(r3)     // Catch:{ all -> 0x0333 }
            o.mg$If r3 = r7.m3831()     // Catch:{ all -> 0x0333 }
            o.mg$ǃ r3 = r3.m3845()     // Catch:{ all -> 0x0333 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0333 }
            r3.m3853(r8)     // Catch:{ all -> 0x0333 }
            android.content.Context r3 = r15.f3244     // Catch:{ all -> 0x0333 }
            r7.m3836(r3, r6)     // Catch:{ all -> 0x0333 }
            android.bluetooth.BluetoothGatt r3 = r7.m3842()     // Catch:{ all -> 0x0333 }
            if (r3 == 0) goto L_0x0293
            boolean r2 = r3.connect()     // Catch:{ all -> 0x0333 }
        L_0x0293:
            if (r2 != 0) goto L_0x02c9
            o.lA$ǃ r2 = o.lA.f2728     // Catch:{ all -> 0x0333 }
            java.lang.String r3 = r15.f3247     // Catch:{ all -> 0x0333 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0333 }
            r6.<init>()     // Catch:{ all -> 0x0333 }
            java.lang.String r8 = "Alamak! not connecting to "
            r6.append(r8)     // Catch:{ all -> 0x0333 }
            android.bluetooth.BluetoothDevice r7 = r7.m3843()     // Catch:{ all -> 0x0333 }
            java.lang.String r7 = r7.getAddress()     // Catch:{ all -> 0x0333 }
            r6.append(r7)     // Catch:{ all -> 0x0333 }
            java.lang.String r7 = "??"
            r6.append(r7)     // Catch:{ all -> 0x0333 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0333 }
            r2.m3375(r3, r6)     // Catch:{ all -> 0x0333 }
            o.lA$ǃ r2 = o.lA.f2728     // Catch:{ all -> 0x0333 }
            java.lang.String r3 = r15.f3247     // Catch:{ all -> 0x0333 }
            r2.m3375(r3, r0)     // Catch:{ all -> 0x0333 }
            o.mg r4 = (o.C3594mg) r4     // Catch:{ all -> 0x0333 }
            r15.f3243 = r4     // Catch:{ all -> 0x0333 }
            r15.m3871()     // Catch:{ all -> 0x0333 }
            return
        L_0x02c9:
            o.lA$ǃ r2 = o.lA.f2728     // Catch:{ all -> 0x0333 }
            java.lang.String r3 = r15.f3247     // Catch:{ all -> 0x0333 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0333 }
            r4.<init>()     // Catch:{ all -> 0x0333 }
            java.lang.String r6 = "Connection to "
            r4.append(r6)     // Catch:{ all -> 0x0333 }
            android.bluetooth.BluetoothDevice r6 = r7.m3843()     // Catch:{ all -> 0x0333 }
            java.lang.String r6 = r6.getAddress()     // Catch:{ all -> 0x0333 }
            r4.append(r6)     // Catch:{ all -> 0x0333 }
            java.lang.String r6 = " attempt in progress"
            r4.append(r6)     // Catch:{ all -> 0x0333 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0333 }
            r2.m3369(r3, r4)     // Catch:{ all -> 0x0333 }
            android.os.Handler r2 = r15.f3236     // Catch:{ all -> 0x0333 }
            if (r2 != 0) goto L_0x02f7
            java.lang.String r3 = "timeoutHandler"
            o.fM.m2253(r3)     // Catch:{ all -> 0x0333 }
        L_0x02f7:
            java.lang.Runnable r3 = r7.m3844()     // Catch:{ all -> 0x0333 }
            o.lR$ı r4 = o.lR.f2769     // Catch:{ all -> 0x0333 }
            long r8 = r4.m3506()     // Catch:{ all -> 0x0333 }
            r2.postDelayed(r3, r8)     // Catch:{ all -> 0x0333 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0333 }
            o.lR$ı r4 = o.lR.f2769     // Catch:{ all -> 0x0333 }
            long r8 = r4.m3506()     // Catch:{ all -> 0x0333 }
            long r2 = r2 + r8
            r7.m3835(r2)     // Catch:{ all -> 0x0333 }
            o.lA$ǃ r2 = o.lA.f2728     // Catch:{ all -> 0x0333 }
            java.lang.String r3 = r15.f3247     // Catch:{ all -> 0x0333 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0333 }
            r4.<init>()     // Catch:{ all -> 0x0333 }
            java.lang.String r6 = "Timeout scheduled for "
            r4.append(r6)     // Catch:{ all -> 0x0333 }
            android.bluetooth.BluetoothDevice r6 = r7.m3843()     // Catch:{ all -> 0x0333 }
            java.lang.String r6 = r6.getAddress()     // Catch:{ all -> 0x0333 }
            r4.append(r6)     // Catch:{ all -> 0x0333 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0333 }
            r2.m3369(r3, r4)     // Catch:{ all -> 0x0333 }
            goto L_0x0369
        L_0x0333:
            r2 = move-exception
            o.lA$ǃ r3 = o.lA.f2728
            java.lang.String r4 = r15.f3247
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Unexpected error while attempting to connect to "
            r6.append(r7)
            java.lang.String r5 = r5.getAddress()
            r6.append(r5)
            java.lang.String r5 = ": "
            r6.append(r5)
            java.lang.String r2 = r2.getLocalizedMessage()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r3.m3375(r4, r2)
            o.lA$ǃ r2 = o.lA.f2728
            java.lang.String r3 = r15.f3247
            r2.m3375(r3, r0)
            r15.f3243 = r1
            r15.m3871()
            return
        L_0x0369:
            if (r7 != 0) goto L_0x0374
            o.lA$ǃ r0 = o.lA.f2728
            java.lang.String r1 = r15.f3247
            java.lang.String r2 = "No outstanding work"
            r0.m3369(r1, r2)
        L_0x0374:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3595mh.m3871():void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m3863(BluetoothDevice bluetoothDevice) {
        return this.f3249.getDevicesMatchingConnectionStates(7, new int[]{2}).contains(bluetoothDevice);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3876(C3594mg mgVar) {
        fM.m2254(mgVar, "");
        if (mgVar.m3837()) {
            lA.C0215 r0 = lA.f2728;
            String str = this.f3247;
            r0.m3369(str, "Work on " + mgVar.m3843().getAddress() + " already finished and closed");
            return;
        }
        if (mgVar.m3838()) {
            Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
            Context context = this.f3244;
            String address = mgVar.m3843().getAddress();
            fM.m2252((Object) address, "");
            try {
                Object[] objArr = new Object[2];
                objArr[1] = address;
                objArr[0] = context;
                ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Context.class, String.class}).invoke(obj, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        lA.C0215 r02 = lA.f2728;
        String str2 = this.f3247;
        r02.m3369(str2, "Work on " + mgVar.m3843().getAddress() + " stopped in: " + (mgVar.m3831().m3851().m3855() - mgVar.m3831().m3845().m3855()));
        lA.C0215 r03 = lA.f2728;
        String str3 = this.f3247;
        r03.m3369(str3, "Work on " + mgVar.m3843().getAddress() + " completed?: " + mgVar.m3838() + ". Connected in: " + (mgVar.m3831().m3849().m3855() - mgVar.m3831().m3845().m3855()) + ". connection lasted for: " + (mgVar.m3831().m3851().m3855() - mgVar.m3831().m3849().m3855()) + ". Status: " + mgVar.m3831());
        Handler handler = this.f3236;
        if (handler == null) {
            fM.m2253("timeoutHandler");
        }
        handler.removeCallbacks(mgVar.m3844());
        lA.C0215 r04 = lA.f2728;
        String str4 = this.f3247;
        r04.m3369(str4, "Timeout removed for " + mgVar.m3843().getAddress());
        mgVar.m3834(true);
        m3871();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u0017B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/mh$ǃ;", "Lo/mg;", "ǃ", "Lo/mg;", "Landroid/bluetooth/BluetoothGatt;", "p0", "", "Ι", "(Landroid/bluetooth/BluetoothGatt;)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "p1", "", "p2", "onCharacteristicRead", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V", "onCharacteristicWrite", "onConnectionStateChange", "(Landroid/bluetooth/BluetoothGatt;II)V", "onMtuChanged", "onServicesDiscovered", "(Landroid/bluetooth/BluetoothGatt;I)V", "<init>", "(Lo/mh;Lo/mg;)V", "Landroid/bluetooth/BluetoothGattCallback;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.mh$ǃ  reason: contains not printable characters */
    public final class C0254 extends BluetoothGattCallback {

        /* renamed from: ı  reason: contains not printable characters */
        final /* synthetic */ C3595mh f3259;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C3594mg f3260;

        public C0254(C3595mh mhVar, C3594mg mgVar) {
            fM.m2254(mgVar, "");
            this.f3259 = mhVar;
            this.f3260 = mgVar;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m3878(BluetoothGatt bluetoothGatt) {
            fM.m2254(bluetoothGatt, "");
            lA.C0215 r1 = lA.f2728;
            String r2 = this.f3259.f3247;
            StringBuilder sb = new StringBuilder();
            sb.append("Ending connection with: ");
            BluetoothDevice device = bluetoothGatt.getDevice();
            fM.m2252((Object) device, "");
            sb.append(device.getAddress());
            r1.m3369(r2, sb.toString());
            bluetoothGatt.disconnect();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x011b, code lost:
            r7 = r7.m3843();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onConnectionStateChange(android.bluetooth.BluetoothGatt r5, int r6, int r7) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x013e
                r6 = 1
                java.lang.String r0 = ""
                if (r7 == 0) goto L_0x008e
                r1 = 2
                if (r7 == r1) goto L_0x003e
                o.lA$ǃ r6 = o.lA.f2728
                o.mh r1 = r4.f3259
                java.lang.String r1 = r1.f3247
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Connection status for "
                r2.append(r3)
                android.bluetooth.BluetoothDevice r3 = r5.getDevice()
                o.fM.m2252((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.String r0 = r3.getAddress()
                r2.append(r0)
                java.lang.String r0 = ": "
                r2.append(r0)
                r2.append(r7)
                java.lang.String r7 = r2.toString()
                r6.m3369(r1, r7)
                r4.m3878(r5)
                goto L_0x013e
            L_0x003e:
                o.lA$ǃ r7 = o.lA.f2728
                o.mh r1 = r4.f3259
                java.lang.String r1 = r1.f3247
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Connected to other GATT server - "
                r2.append(r3)
                android.bluetooth.BluetoothDevice r3 = r5.getDevice()
                o.fM.m2252((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.String r0 = r3.getAddress()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r7.m3369(r1, r0)
                r7 = 0
                r5.requestConnectionPriority(r7)
                r7 = 512(0x200, float:7.175E-43)
                r5.requestMtu(r7)
                o.mg r5 = r4.f3260
                o.mg$If r5 = r5.m3831()
                o.mg$ǃ r5 = r5.m3849()
                r5.m3856(r6)
                o.mg r5 = r4.f3260
                o.mg$If r5 = r5.m3831()
                o.mg$ǃ r5 = r5.m3849()
                long r6 = java.lang.System.currentTimeMillis()
                r5.m3853(r6)
                goto L_0x013e
            L_0x008e:
                o.lA$ǃ r7 = o.lA.f2728
                o.mh r1 = r4.f3259
                java.lang.String r1 = r1.f3247
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Disconnected from other GATT server - "
                r2.append(r3)
                android.bluetooth.BluetoothDevice r3 = r5.getDevice()
                o.fM.m2252((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.String r0 = r3.getAddress()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r7.m3369(r1, r0)
                o.mg r7 = r4.f3260
                o.mg$If r7 = r7.m3831()
                o.mg$ǃ r7 = r7.m3851()
                r7.m3856(r6)
                o.mg r6 = r4.f3260
                o.mg$If r6 = r6.m3831()
                o.mg$ǃ r6 = r6.m3851()
                long r0 = java.lang.System.currentTimeMillis()
                r6.m3853(r0)
                o.mh r6 = r4.f3259
                android.os.Handler r6 = o.C3595mh.m3860((o.C3595mh) r6)
                o.mg r7 = r4.f3260
                java.lang.Runnable r7 = r7.m3844()
                r6.removeCallbacks(r7)
                o.lA$ǃ r6 = o.lA.f2728
                o.mh r7 = r4.f3259
                java.lang.String r7 = r7.f3247
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Timeout removed for "
                r0.append(r1)
                o.mg r1 = r4.f3260
                android.bluetooth.BluetoothDevice r1 = r1.m3843()
                java.lang.String r1 = r1.getAddress()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.m3369(r7, r0)
                o.mg r6 = r4.f3260
                android.bluetooth.BluetoothDevice r6 = r6.m3843()
                java.lang.String r6 = r6.getAddress()
                o.mh r7 = r4.f3259
                o.mg r7 = r7.f3243
                r0 = 0
                if (r7 == 0) goto L_0x0126
                android.bluetooth.BluetoothDevice r7 = r7.m3843()
                if (r7 == 0) goto L_0x0126
                java.lang.String r7 = r7.getAddress()
                goto L_0x0127
            L_0x0126:
                r7 = r0
            L_0x0127:
                boolean r6 = o.fM.m2257(r6, r7)
                if (r6 == 0) goto L_0x0134
                o.mh r6 = r4.f3259
                o.mg r0 = (o.C3594mg) r0
                r6.f3243 = r0
            L_0x0134:
                r5.close()
                o.mh r5 = r4.f3259
                o.mg r6 = r4.f3260
                r5.m3876((o.C3594mg) r6)
            L_0x013e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3595mh.C0254.onConnectionStateChange(android.bluetooth.BluetoothGatt, int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x003e, code lost:
            r4 = r6.getDevice();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMtuChanged(android.bluetooth.BluetoothGatt r6, int r7, int r8) {
            /*
                r5 = this;
                o.mg r0 = r5.f3260
                o.mg$If r0 = r0.m3831()
                o.mg$ǃ r0 = r0.m3846()
                boolean r0 = r0.m3854()
                if (r0 != 0) goto L_0x009f
                o.mg r0 = r5.f3260
                o.mg$If r0 = r0.m3831()
                o.mg$ǃ r0 = r0.m3846()
                r1 = 1
                r0.m3856(r1)
                o.mg r0 = r5.f3260
                o.mg$If r0 = r0.m3831()
                o.mg$ǃ r0 = r0.m3846()
                long r2 = java.lang.System.currentTimeMillis()
                r0.m3853(r2)
                o.lA$ǃ r0 = o.lA.f2728
                o.mh r2 = r5.f3259
                java.lang.String r2 = r2.f3247
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                if (r6 == 0) goto L_0x0049
                android.bluetooth.BluetoothDevice r4 = r6.getDevice()
                if (r4 == 0) goto L_0x0049
                java.lang.String r4 = r4.getAddress()
                goto L_0x004a
            L_0x0049:
                r4 = 0
            L_0x004a:
                r3.append(r4)
                java.lang.String r4 = " MTU is "
                r3.append(r4)
                r3.append(r7)
                java.lang.String r7 = ". Was change successful? : "
                r3.append(r7)
                if (r8 != 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r1 = 0
            L_0x005e:
                r3.append(r1)
                java.lang.String r7 = r3.toString()
                r0.m3369(r2, r7)
                if (r6 == 0) goto L_0x009f
                boolean r7 = r6.discoverServices()
                o.lA$ǃ r8 = o.lA.f2728
                o.mh r0 = r5.f3259
                java.lang.String r0 = r0.f3247
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Attempting to start service discovery on "
                r1.append(r2)
                android.bluetooth.BluetoothDevice r6 = r6.getDevice()
                java.lang.String r2 = ""
                o.fM.m2252((java.lang.Object) r6, (java.lang.String) r2)
                java.lang.String r6 = r6.getAddress()
                r1.append(r6)
                java.lang.String r6 = ": "
                r1.append(r6)
                r1.append(r7)
                java.lang.String r6 = r1.toString()
                r8.m3369(r0, r6)
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C3595mh.C0254.onMtuChanged(android.bluetooth.BluetoothGatt, int, int):void");
        }

        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            fM.m2254(bluetoothGatt, "");
            if (i != 0) {
                lA.C0215 r9 = lA.f2728;
                String r1 = this.f3259.f3247;
                StringBuilder sb = new StringBuilder();
                sb.append("No services discovered on ");
                BluetoothDevice device = bluetoothGatt.getDevice();
                fM.m2252((Object) device, "");
                sb.append(device.getAddress());
                r9.m3372(r1, sb.toString());
                m3878(bluetoothGatt);
                return;
            }
            lA.C0215 r12 = lA.f2728;
            String r2 = this.f3259.f3247;
            r12.m3369(r2, "onServicesDiscovered received: BluetoothGatt.GATT_SUCCESS - " + i);
            lA.C0215 r92 = lA.f2728;
            String r13 = this.f3259.f3247;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Discovered ");
            sb2.append(bluetoothGatt.getServices().size());
            sb2.append(" services on ");
            BluetoothDevice device2 = bluetoothGatt.getDevice();
            fM.m2252((Object) device2, "");
            sb2.append(device2.getAddress());
            r92.m3369(r13, sb2.toString());
            BluetoothGattService service = bluetoothGatt.getService(this.f3259.f3235);
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.f3259.f3242);
                BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.f3259.f3248);
                if (characteristic2 != null) {
                    characteristic = characteristic2;
                }
                if (characteristic != null) {
                    boolean readCharacteristic = bluetoothGatt.readCharacteristic(characteristic);
                    lA.C0215 r3 = lA.f2728;
                    String r4 = this.f3259.f3247;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Attempt to read characteristic of our service on ");
                    BluetoothDevice device3 = bluetoothGatt.getDevice();
                    fM.m2252((Object) device3, "");
                    sb3.append(device3.getAddress());
                    sb3.append(": ");
                    sb3.append(readCharacteristic);
                    r3.m3369(r4, sb3.toString());
                } else {
                    lA.C0215 r22 = lA.f2728;
                    String r32 = this.f3259.f3247;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("WTF? ");
                    BluetoothDevice device4 = bluetoothGatt.getDevice();
                    fM.m2252((Object) device4, "");
                    sb4.append(device4.getAddress());
                    sb4.append(" does not have our characteristic");
                    r22.m3375(r32, sb4.toString());
                    m3878(bluetoothGatt);
                }
            }
            if (service == null) {
                lA.C0215 r93 = lA.f2728;
                String r23 = this.f3259.f3247;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("WTF? ");
                BluetoothDevice device5 = bluetoothGatt.getDevice();
                fM.m2252((Object) device5, "");
                sb5.append(device5.getAddress());
                sb5.append(" does not have our service");
                r93.m3375(r23, sb5.toString());
                m3878(bluetoothGatt);
            }
        }

        public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            fM.m2254(bluetoothGatt, "");
            fM.m2254(bluetoothGattCharacteristic, "");
            lA.C0215 r1 = lA.f2728;
            String r2 = this.f3259.f3247;
            r1.m3369(r2, "Read Status: " + i);
            if (i != 0) {
                lA.C0215 r22 = lA.f2728;
                String r3 = this.f3259.f3247;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to read characteristics from ");
                BluetoothDevice device = bluetoothGatt.getDevice();
                fM.m2252((Object) device, "");
                sb.append(device.getAddress());
                sb.append(": ");
                sb.append(i);
                r22.m3372(r3, sb.toString());
            } else {
                lA.C0215 r14 = lA.f2728;
                String r23 = this.f3259.f3247;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Characteristic read from ");
                BluetoothDevice device2 = bluetoothGatt.getDevice();
                fM.m2252((Object) device2, "");
                sb2.append(device2.getAddress());
                sb2.append(": ");
                sb2.append(bluetoothGattCharacteristic.getStringValue(0));
                r14.m3369(r23, sb2.toString());
                lA.C0215 r142 = lA.f2728;
                String r24 = this.f3259.f3247;
                r142.m3369(r24, "onCharacteristicRead: " + this.f3260.m3843().getAddress() + " - [" + this.f3260.m3832().m3810() + ']');
                if (BlueTrace.INSTANCE.supportsCharUUID(bluetoothGattCharacteristic.getUuid())) {
                    try {
                        BlueTrace blueTrace = BlueTrace.INSTANCE;
                        UUID uuid = bluetoothGattCharacteristic.getUuid();
                        fM.m2252((Object) uuid, "");
                        BlueTraceProtocol implementation = blueTrace.getImplementation(uuid);
                        byte[] value = bluetoothGattCharacteristic.getValue();
                        CentralInterface central = implementation.getCentral();
                        fM.m2252((Object) value, "");
                        String address = this.f3260.m3843().getAddress();
                        fM.m2252((Object) address, "");
                        ConnectionRecord processReadRequestDataReceived = central.processReadRequestDataReceived(value, address, this.f3260.m3832().m3810(), this.f3260.m3832().m3809());
                        if (processReadRequestDataReceived != null) {
                            Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                            Context r8 = this.f3259.m3869();
                            Object[] objArr = new Object[2];
                            objArr[1] = processReadRequestDataReceived;
                            objArr[0] = r8;
                            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", new Class[]{Context.class, ConnectionRecord.class}).invoke(obj, objArr);
                        }
                    } catch (Throwable th) {
                        lA.C0215 r32 = lA.f2728;
                        String r4 = this.f3259.f3247;
                        r32.m3375(r4, "Failed to process read payload - " + th.getMessage());
                    }
                }
                this.f3260.m3831().m3847().m3856(true);
                this.f3260.m3831().m3847().m3853(System.currentTimeMillis());
            }
            if (BlueTrace.INSTANCE.supportsCharUUID(bluetoothGattCharacteristic.getUuid())) {
                BlueTrace blueTrace2 = BlueTrace.INSTANCE;
                UUID uuid2 = bluetoothGattCharacteristic.getUuid();
                fM.m2252((Object) uuid2, "");
                BlueTraceProtocol implementation2 = blueTrace2.getImplementation(uuid2);
                if (TempIDManager.INSTANCE.bmValid(this.f3259.m3869())) {
                    bluetoothGattCharacteristic.setValue(implementation2.getCentral().prepareWriteRequestData(implementation2.getVersionInt(), this.f3260.m3832().m3810(), this.f3260.m3832().m3809()));
                    boolean writeCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                    lA.C0215 r143 = lA.f2728;
                    String r25 = this.f3259.f3247;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Attempt to write characteristic to our service on ");
                    BluetoothDevice device3 = bluetoothGatt.getDevice();
                    fM.m2252((Object) device3, "");
                    sb3.append(device3.getAddress());
                    sb3.append(": ");
                    sb3.append(writeCharacteristic);
                    r143.m3369(r25, sb3.toString());
                    return;
                }
                lA.C0215 r13 = lA.f2728;
                String r144 = this.f3259.f3247;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Expired BM. Skipping attempt to write characteristic to our service on ");
                BluetoothDevice device4 = bluetoothGatt.getDevice();
                fM.m2252((Object) device4, "");
                sb4.append(device4.getAddress());
                r13.m3369(r144, sb4.toString());
                m3878(bluetoothGatt);
                return;
            }
            lA.C0215 r145 = lA.f2728;
            String r12 = this.f3259.f3247;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Not writing to ");
            BluetoothDevice device5 = bluetoothGatt.getDevice();
            fM.m2252((Object) device5, "");
            sb5.append(device5.getAddress());
            sb5.append(". Characteristic ");
            sb5.append(bluetoothGattCharacteristic.getUuid());
            sb5.append(" is not supported");
            r145.m3372(r12, sb5.toString());
            m3878(bluetoothGatt);
        }

        public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            fM.m2254(bluetoothGatt, "");
            fM.m2254(bluetoothGattCharacteristic, "");
            if (i != 0) {
                lA.C0215 r5 = lA.f2728;
                String r0 = this.f3259.f3247;
                r5.m3369(r0, "Failed to write characteristics: " + i);
            } else {
                lA.f2728.m3369(this.f3259.f3247, "Characteristic wrote successfully");
                this.f3260.m3831().m3848().m3856(true);
                this.f3260.m3831().m3848().m3853(System.currentTimeMillis());
            }
            m3878(bluetoothGatt);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3875() {
        BluetoothGatt r0;
        lA.f2728.m3368(this.f3247, "Cleaning up worker.");
        C3594mg mgVar = this.f3243;
        if (!(mgVar == null || (r0 = mgVar.m3842()) == null)) {
            r0.disconnect();
        }
        this.f3243 = null;
        Handler handler = this.f3236;
        if (handler == null) {
            fM.m2253("timeoutHandler");
        }
        handler.removeCallbacksAndMessages((Object) null);
        Handler handler2 = this.f3250;
        if (handler2 == null) {
            fM.m2253("queueHandler");
        }
        handler2.removeCallbacksAndMessages((Object) null);
        Handler handler3 = this.f3239;
        if (handler3 == null) {
            fM.m2253("blacklistHandler");
        }
        handler3.removeCallbacksAndMessages((Object) null);
        this.f3240.clear();
        this.f3237.clear();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3873() {
        try {
            this.f3241.m4584(this.f3246);
        } catch (Throwable th) {
            lA.C0215 r2 = lA.f2728;
            String str = this.f3247;
            r2.m3375(str, "Unable to close receivers: " + th.getLocalizedMessage());
        }
        try {
            this.f3241.m4584(this.f3245);
        } catch (Throwable th2) {
            lA.C0215 r22 = lA.f2728;
            String str2 = this.f3247;
            r22.m3375(str2, "Unable to close receivers: " + th2.getLocalizedMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/mh$If;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "(Lo/mh;)V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.mh$If */
    public final class If extends BroadcastReceiver {
        public If() {
        }

        public final void onReceive(Context context, Intent intent) {
            fM.m2254(context, "");
            fM.m2254(intent, "");
            if (fM.m2257("sg.gov.tech.bluetrace.ACTION_DEVICE_PROCESSED", intent.getAction())) {
                String stringExtra = intent.getStringExtra("sg.gov.tech.bluetrace.DEVICE_ADDRESS");
                lA.C0215 r6 = lA.f2728;
                String r1 = C3595mh.this.f3247;
                r6.m3368(r1, "Adding to blacklist: " + stringExtra);
                fM.m2252((Object) stringExtra, "");
                final lU lUVar = new lU(stringExtra, System.currentTimeMillis());
                C3595mh.this.f3237.add(lUVar);
                C3595mh.m3866(C3595mh.this).postDelayed(new Runnable(this) {

                    /* renamed from: ɩ  reason: contains not printable characters */
                    final /* synthetic */ If f3255;

                    {
                        this.f3255 = r1;
                    }

                    public final void run() {
                        lA.C0215 r0 = lA.f2728;
                        String r1 = C3595mh.this.f3247;
                        r0.m3369(r1, "blacklist for " + lUVar.m3525() + " removed? : " + C3595mh.this.f3237.remove(lUVar));
                    }
                }, lR.f2769.m3510());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/mh$ı;", "", "Ι", "Ljava/lang/String;", "ι", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "(Lo/mh;)V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.mh$ı  reason: contains not printable characters */
    public final class C0253 extends BroadcastReceiver {

        /* renamed from: Ι  reason: contains not printable characters */
        private final String f3257 = "StreetPassWorkReceiver";

        public C0253() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && fM.m2257("sg.gov.tech.bluetrace.ACTION_DEVICE_SCANNED", intent.getAction())) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                C3590mc mcVar = (C3590mc) intent.getParcelableExtra("sg.gov.tech.bluetrace.CONNECTION_DATA");
                boolean z = true;
                boolean z2 = bluetoothDevice != null;
                if (mcVar == null) {
                    z = false;
                }
                lA.C0215 r1 = lA.f2728;
                String str = this.f3257;
                StringBuilder sb = new StringBuilder();
                sb.append("Device received: ");
                sb.append(bluetoothDevice != null ? bluetoothDevice.getAddress() : null);
                sb.append(". Device present: ");
                sb.append(z2);
                sb.append(", Connectable Present: ");
                sb.append(z);
                r1.m3369(str, sb.toString());
                if (bluetoothDevice != null && mcVar != null) {
                    if (C3595mh.this.m3874(new C3594mg(bluetoothDevice, mcVar, C3595mh.this.m3870()))) {
                        C3595mh.this.m3871();
                    }
                }
            }
        }
    }
}
