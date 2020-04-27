package o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.PowerManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3483id;
import o.lA;
import o.lC;
import sg.gov.tech.bluetrace.idmanager.TempIDManager;
import sg.gov.tech.bluetrace.idmanager.TemporaryID;
import sg.gov.tech.bluetrace.status.persistence.StatusRecord;
import sg.gov.tech.bluetrace.streetpass.ConnectionRecord;
import sg.gov.tech.bluetrace.streetpass.persistence.StreetPassRecord;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\u0018\u0000 k2\u00020\u00012\u00020\u0002:\u0006ijklmnB\u0005¢\u0006\u0002\u0010\u0003J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000205H\u0002J\b\u00108\u001a\u000205H\u0002J\b\u00109\u001a\u000205H\u0002J\b\u0010:\u001a\u000205H\u0002J\b\u0010;\u001a\u000205H\u0002J\u0006\u0010<\u001a\u000205J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020BH\u0002J\b\u0010D\u001a\u00020BH\u0002J\u0012\u0010E\u001a\u0002052\b\b\u0002\u0010F\u001a\u00020BH\u0002J\u0012\u0010G\u001a\u0002052\b\b\u0002\u0010F\u001a\u00020BH\u0002J\u0012\u0010H\u001a\u0002052\b\b\u0002\u0010F\u001a\u00020BH\u0002J\u0014\u0010I\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\b\u0010M\u001a\u000205H\u0016J\b\u0010N\u001a\u000205H\u0016J\"\u0010O\u001a\u00020P2\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020PH\u0016J\b\u0010S\u001a\u000205H\u0002J\b\u0010T\u001a\u000205H\u0002J\b\u0010U\u001a\u000205H\u0002J\b\u0010V\u001a\u000205H\u0002J\b\u0010W\u001a\u000205H\u0002J\u0010\u0010X\u001a\u0002052\b\u0010Y\u001a\u0004\u0018\u00010ZJ\b\u0010[\u001a\u000205H\u0002J\b\u0010\\\u001a\u000205H\u0002J\u0006\u0010]\u001a\u000205J\b\u0010^\u001a\u000205H\u0002J\b\u0010_\u001a\u000205H\u0002J\b\u0010`\u001a\u000205H\u0002J\b\u0010a\u001a\u000205H\u0002J\b\u0010b\u001a\u000205H\u0002J\b\u0010c\u001a\u000205H\u0002J\b\u0010d\u001a\u000205H\u0002J\b\u0010e\u001a\u000205H\u0002J\b\u0010f\u001a\u000205H\u0002J\u0006\u0010g\u001a\u000205J\b\u0010h\u001a\u000205H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00060\u001fR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006o²\u0006\f\u0010p\u001a\u0004\u0018\u00010qX\u0002"}, d2 = {"Lsg/gov/tech/bluetrace/services/BluetoothMonitoringService;", "Landroid/app/Service;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "advertiser", "Lsg/gov/tech/bluetrace/bluetooth/BLEAdvertiser;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "bluetoothStatusReceiver", "Lsg/gov/tech/bluetrace/services/BluetoothMonitoringService$BluetoothStatusReceiver;", "commandHandler", "Lsg/gov/tech/bluetrace/services/CommandHandler;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "functions", "Lcom/google/firebase/functions/FirebaseFunctions;", "job", "Lkotlinx/coroutines/Job;", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "mNotificationManager", "Landroid/app/NotificationManager;", "notificationShown", "Lsg/gov/tech/bluetrace/services/BluetoothMonitoringService$NOTIFICATION_STATE;", "serviceUUID", "", "statusReceiver", "Lsg/gov/tech/bluetrace/services/BluetoothMonitoringService$StatusReceiver;", "statusRecordStorage", "Lsg/gov/tech/bluetrace/status/persistence/StatusRecordStorage;", "streetPassReceiver", "Lsg/gov/tech/bluetrace/services/BluetoothMonitoringService$StreetPassReceiver;", "streetPassRecordStorage", "Lsg/gov/tech/bluetrace/streetpass/persistence/StreetPassRecordStorage;", "streetPassScanner", "Lsg/gov/tech/bluetrace/streetpass/StreetPassScanner;", "streetPassServer", "Lsg/gov/tech/bluetrace/streetpass/StreetPassServer;", "swiftmedInstalledReceiver", "Lsg/gov/tech/bluetrace/receivers/SwiftmedInstalledReceiver;", "swiftmedUninstalledReceiver", "Lsg/gov/tech/bluetrace/receivers/SwiftmedRemovedReceiver;", "worker", "Lsg/gov/tech/bluetrace/streetpass/StreetPassWorker;", "getWorker", "()Lsg/gov/tech/bluetrace/streetpass/StreetPassWorker;", "setWorker", "(Lsg/gov/tech/bluetrace/streetpass/StreetPassWorker;)V", "acquireWritePermission", "", "actionAdvertise", "actionHealthCheck", "actionPurge", "actionScan", "actionStart", "actionStop", "actionUpdateBm", "calcPhaseShift", "", "min", "max", "hasLocationPermissions", "", "hasWritePermissions", "isBluetoothEnabled", "notifyLackingThings", "override", "notifyRunning", "notifySwiftmed", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "performHealthCheck", "performPurge", "performScan", "performUserLoginCheck", "registerReceivers", "runService", "cmd", "Lsg/gov/tech/bluetrace/services/BluetoothMonitoringService$Command;", "scheduleAdvertisement", "scheduleScan", "setup", "setupAdvertiser", "setupAdvertisingCycles", "setupCycles", "setupNotifications", "setupScanCycles", "setupScanner", "setupService", "startScan", "stopService", "teardown", "unregisterReceivers", "BluetoothStatusReceiver", "Command", "Companion", "NOTIFICATION_STATE", "StatusReceiver", "StreetPassReceiver", "app_release", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;"}, k = 1, mv = {1, 1, 16})
public final class lR extends Service implements C3474hv {

    /* renamed from: ı  reason: contains not printable characters */
    public static final long f2761 = 43000;
    /* access modifiers changed from: private */

    /* renamed from: ıı  reason: contains not printable characters */
    public static final boolean f2762 = false;
    /* access modifiers changed from: private */

    /* renamed from: ıǃ  reason: contains not printable characters */
    public static final boolean f2763 = false;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final long f2764 = 86400000;

    /* renamed from: ǃ  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f2765 = {C3428gc.m2387((fX) new fW(C3428gc.m2389(lR.class), "bluetoothAdapter", "<v#0>"))};
    /* access modifiers changed from: private */

    /* renamed from: ǃı  reason: contains not printable characters */
    public static final boolean f2766 = f2766;
    /* access modifiers changed from: private */

    /* renamed from: ɂ  reason: contains not printable characters */
    public static final boolean f2767 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final String f2768 = "TraceTogether Foreground Service";

    /* renamed from: ɪ  reason: contains not printable characters */
    public static final C0219 f2769 = new C0219((fL) null);
    /* access modifiers changed from: private */

    /* renamed from: ɭ  reason: contains not printable characters */
    public static final String f2770 = f2770;

    /* renamed from: ɹ  reason: contains not printable characters */
    public static final long f2771 = 180000;
    /* access modifiers changed from: private */

    /* renamed from: ɻ  reason: contains not printable characters */
    public static final int f2772 = 11;
    /* access modifiers changed from: private */

    /* renamed from: ʏ  reason: contains not printable characters */
    public static final int f2773 = 10;
    /* access modifiers changed from: private */

    /* renamed from: ʔ  reason: contains not printable characters */
    public static final int f2774 = 12;
    /* access modifiers changed from: private */

    /* renamed from: ʕ  reason: contains not printable characters */
    public static TemporaryID f2775 = null;
    /* access modifiers changed from: private */

    /* renamed from: ʖ  reason: contains not printable characters */
    public static final int f2776 = 9;
    /* access modifiers changed from: private */

    /* renamed from: ͻ  reason: contains not printable characters */
    public static final int f2777 = 771578;
    /* access modifiers changed from: private */

    /* renamed from: Γ  reason: contains not printable characters */
    public static final long f2778 = 1814400000;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final long f2779 = 36000;

    /* renamed from: ι  reason: contains not printable characters */
    public static final long f2780 = 8000;
    /* access modifiers changed from: private */

    /* renamed from: τ  reason: contains not printable characters */
    public static final long f2781 = 6000;
    /* access modifiers changed from: private */

    /* renamed from: ϲ  reason: contains not printable characters */
    public static final String f2782 = f2782;

    /* renamed from: І  reason: contains not printable characters */
    public static final long f2783 = 540000;

    /* renamed from: Ј  reason: contains not printable characters */
    private static final String f2784 = "TraceTogether Updates";
    /* access modifiers changed from: private */

    /* renamed from: Г  reason: contains not printable characters */
    public static final long f2785 = 100000;

    /* renamed from: с  reason: contains not printable characters */
    private static final int f2786 = 771579;
    /* access modifiers changed from: private */

    /* renamed from: т  reason: contains not printable characters */
    public static final int f2787 = 5;
    /* access modifiers changed from: private */

    /* renamed from: х  reason: contains not printable characters */
    public static final int f2788 = 8;

    /* renamed from: і  reason: contains not printable characters */
    public static final long f2789 = 900000;
    /* access modifiers changed from: private */

    /* renamed from: ј  reason: contains not printable characters */
    public static final int f2790 = 6;
    /* access modifiers changed from: private */

    /* renamed from: ґ  reason: contains not printable characters */
    public static final int f2791 = 7;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final long f2792 = 5000;
    /* access modifiers changed from: private */

    /* renamed from: ӷ  reason: contains not printable characters */
    public static final long f2793 = 7000;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final aux f2794 = new aux();

    /* renamed from: ł  reason: contains not printable characters */
    private final If f2795 = new If();

    /* renamed from: ſ  reason: contains not printable characters */
    private C3483id f2796 = C3488ij.m2777$default((C3483id) null, 1, (Object) null);

    /* renamed from: Ɨ  reason: contains not printable characters */
    private C0452 f2797;

    /* renamed from: ƚ  reason: contains not printable characters */
    private lV f2798;

    /* renamed from: ǀ  reason: contains not printable characters */
    private C0220 f2799;

    /* renamed from: ȷ  reason: contains not printable characters */
    private NotificationManager f2800;

    /* renamed from: ɍ  reason: contains not printable characters */
    private C3596mi f2801;

    /* renamed from: ɔ  reason: contains not printable characters */
    private FirebaseAuth f2802;

    /* renamed from: ɟ  reason: contains not printable characters */
    private C0375 f2803;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C3591md f2804;

    /* renamed from: ɺ  reason: contains not printable characters */
    private final lN f2805 = new lN(AnonymousClass9.f2825);

    /* renamed from: ɼ  reason: contains not printable characters */
    private FirebaseAnalytics f2806;

    /* renamed from: ɾ  reason: contains not printable characters */
    private String f2807;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C0221 f2808 = new C0221();

    /* renamed from: ʅ  reason: contains not printable characters */
    private lQ f2809;

    /* renamed from: ʟ  reason: contains not printable characters */
    private C3595mh f2810;

    /* renamed from: ϳ  reason: contains not printable characters */
    private final lL f2811 = new lL(AnonymousClass6.f2824);

    /* renamed from: г  reason: contains not printable characters */
    private C3581lx f2812;

    /* renamed from: ӏ  reason: contains not printable characters */
    private C3593mf f2813;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003"}, d2 = {"Lo/lR$ǃ;", "ı", "ι", "ɩ", "<init>", "(Ljava/lang/String;I)V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lR$ǃ  reason: contains not printable characters */
    public enum C0220 {
        RUNNING,
        LACKING_THINGS,
        PAUSED_SWIFTMED
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final /* synthetic */ C3596mi m3452(lR lRVar) {
        C3596mi miVar = lRVar.f2801;
        if (miVar == null) {
            fM.m2253("streetPassRecordStorage");
        }
        return miVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final /* synthetic */ lV m3455(lR lRVar) {
        lV lVVar = lRVar.f2798;
        if (lVVar == null) {
            fM.m2253("statusRecordStorage");
        }
        return lVVar;
    }

    public final C3396ex R_() {
        return hI.m2449().plus(this.f2796);
    }

    public final void onCreate() {
        C0375 r0 = C0375.m4583(this);
        fM.m2252((Object) r0, "");
        this.f2803 = r0;
        m3475();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3475() {
        Object systemService = getSystemService("power");
        if (systemService != null) {
            lA.f2728.m3371((PowerManager) systemService);
            this.f2809 = new lQ(new WeakReference(this));
            lA.f2728.m3368(f2782, "Creating service - BluetoothMonitoringService");
            this.f2807 = "B82AB3FC-1595-4F6A-80F0-FE094CC218F9";
            Context applicationContext = getApplicationContext();
            fM.m2252((Object) applicationContext, "");
            this.f2810 = new C3595mh(applicationContext);
            m3463();
            m3458();
            Context applicationContext2 = getApplicationContext();
            fM.m2252((Object) applicationContext2, "");
            this.f2801 = new C3596mi(applicationContext2);
            Context applicationContext3 = getApplicationContext();
            fM.m2252((Object) applicationContext3, "");
            this.f2798 = new lV(applicationContext3);
            m3425();
            C0452 r0 = C0452.m4766("asia-east2");
            fM.m2252((Object) r0, "");
            this.f2797 = r0;
            TempIDManager tempIDManager = TempIDManager.INSTANCE;
            Context applicationContext4 = getApplicationContext();
            fM.m2252((Object) applicationContext4, "");
            f2775 = tempIDManager.retrieveTemporaryID(applicationContext4);
            return;
        }
        throw new dA("null cannot be cast to non-null type android.os.PowerManager");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3474() {
        Throwable cause;
        C3593mf mfVar = this.f2813;
        if (mfVar != null) {
            mfVar.m3829();
        }
        this.f2813 = null;
        C3591md mdVar = this.f2804;
        if (mdVar != null) {
            mdVar.m3816();
        }
        this.f2804 = null;
        lQ lQVar = this.f2809;
        if (lQVar == null) {
            fM.m2253("commandHandler");
        }
        lQVar.removeCallbacksAndMessages((Object) null);
        Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
        Context applicationContext = getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        try {
            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Context.class}).invoke(obj, new Object[]{applicationContext});
            Object obj2 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
            Context applicationContext2 = getApplicationContext();
            fM.m2252((Object) applicationContext2, "");
            try {
                ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Context.class}).invoke(obj2, new Object[]{applicationContext2});
                Object obj3 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                Context applicationContext3 = getApplicationContext();
                fM.m2252((Object) applicationContext3, "");
                try {
                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("ǃ", new Class[]{Context.class}).invoke(obj3, new Object[]{applicationContext3});
                } catch (Throwable th) {
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } finally {
                cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
            }
        } finally {
            Throwable cause2 = th.getCause();
            if (cause2 != null) {
                throw cause2;
            }
        }
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final void m3425() {
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            this.f2800 = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(f2784, f2768, 2);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(f2766);
                notificationChannel.setVibrationPattern(new long[]{0});
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                notificationChannel.setShowBadge(false);
                NotificationManager notificationManager = this.f2800;
                if (notificationManager == null) {
                    fM.m2256();
                }
                notificationManager.createNotificationChannel(notificationChannel);
                return;
            }
            return;
        }
        throw new dA("null cannot be cast to non-null type android.app.NotificationManager");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m3436(lR lRVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        lRVar.m3454(z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m3454(boolean z) {
        if (this.f2799 != C0220.PAUSED_SWIFTMED || z) {
            lC.C0217 r3 = lC.f2731;
            Context applicationContext = getApplicationContext();
            fM.m2252((Object) applicationContext, "");
            startForeground(f2786, r3.m3376(applicationContext, f2784));
            this.f2799 = C0220.PAUSED_SWIFTMED;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ void m3418(lR lRVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        lRVar.m3457(z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m3457(boolean z) {
        if (this.f2799 != C0220.LACKING_THINGS || z) {
            lC.C0217 r3 = lC.f2731;
            Context applicationContext = getApplicationContext();
            fM.m2252((Object) applicationContext, "");
            startForeground(f2786, r3.m3378(applicationContext, f2784));
            this.f2799 = C0220.LACKING_THINGS;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m3453(lR lRVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        lRVar.m3419(z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m3419(boolean z) {
        if (this.f2799 != C0220.RUNNING || z) {
            lC.C0217 r3 = lC.f2731;
            Context applicationContext = getApplicationContext();
            fM.m2252((Object) applicationContext, "");
            startForeground(f2786, r3.m3377(applicationContext, f2784));
            this.f2799 = C0220.RUNNING;
        }
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    private final boolean m3432() {
        try {
            Object[] objArr = (Object[]) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", (Class[]) null).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), (Object[]) null);
            return C3538kg.m3271(getApplicationContext(), (String[]) Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    private final boolean m3433() {
        C3357dj r0 = C3360dn.m2105(C3361dp.NONE, new C3409fk<BluetoothAdapter>(this) {

            /* renamed from: Ι  reason: contains not printable characters */
            final /* synthetic */ lR f2822;

            {
                this.f2822 = r1;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final BluetoothAdapter invoke() {
                Object systemService = this.f2822.getSystemService("bluetooth");
                if (systemService != null) {
                    return ((BluetoothManager) systemService).getAdapter();
                }
                throw new dA("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            }
        });
        C3444gs gsVar = f2765[0];
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) r0.m2098();
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        lA.f2728.m3369(f2782, "Service onStartCommand");
        if (!m3432() || !m3433()) {
            lA.C0215 r3 = lA.f2728;
            String str = f2782;
            r3.m3369(str, "location permission: " + m3432() + " bluetooth: " + m3433());
            m3418(this, false, 1, (Object) null);
            return 1;
        } else if (intent != null) {
            m3478(Cif.If.m3500(intent.getIntExtra(f2770, Cif.INVALID.m3499())));
            return 1;
        } else {
            lA.f2728.m3375(f2782, "WTF? Nothing in intent @ onStartCommand");
            lQ lQVar = this.f2809;
            if (lQVar == null) {
                fM.m2253("commandHandler");
            }
            lQVar.m3409();
            return 1;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3478(Cif ifVar) {
        Throwable cause;
        boolean z;
        Throwable cause2;
        Cif ifVar2 = ifVar;
        lA.C0215 r2 = lA.f2728;
        String str = f2782;
        StringBuilder sb = new StringBuilder();
        sb.append("Command is:");
        sb.append(ifVar2 != null ? ifVar.m3498() : null);
        r2.m3369(str, sb.toString());
        if (!m3432() || !m3433()) {
            lA.C0215 r0 = lA.f2728;
            String str2 = f2782;
            r0.m3369(str2, "location permission: " + m3432() + " bluetooth: " + m3433());
            m3418(this, false, 1, (Object) null);
            return;
        }
        try {
            if (((Boolean) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{this})).booleanValue()) {
                m3436(this, false, 1, (Object) null);
                z = false;
            } else {
                m3453(this, false, 1, (Object) null);
                z = f2766;
            }
            if (ifVar2 != null) {
                switch (lP$WhenMappings.f2759[ifVar.ordinal()]) {
                    case 1:
                        m3462();
                        Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                        Context applicationContext = getApplicationContext();
                        fM.m2252((Object) applicationContext, "");
                        try {
                            Object[] objArr = new Object[2];
                            objArr[1] = Long.valueOf(f2789);
                            objArr[0] = applicationContext;
                            ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Context.class, Long.TYPE}).invoke(obj, objArr);
                            Object obj2 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                            Context applicationContext2 = getApplicationContext();
                            fM.m2252((Object) applicationContext2, "");
                            try {
                                Object[] objArr2 = new Object[2];
                                objArr2[1] = Long.valueOf(f2764);
                                objArr2[0] = applicationContext2;
                                ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", new Class[]{Context.class, Long.TYPE}).invoke(obj2, objArr2);
                                Object obj3 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                                Context applicationContext3 = getApplicationContext();
                                fM.m2252((Object) applicationContext3, "");
                                try {
                                    Object[] objArr3 = new Object[2];
                                    objArr3[1] = Long.valueOf(f2783);
                                    objArr3[0] = applicationContext3;
                                    ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Context.class, Long.TYPE}).invoke(obj3, objArr3);
                                    m3459();
                                    return;
                                } catch (Throwable th) {
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th;
                                }
                            } finally {
                                cause2 = th.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                            }
                        } finally {
                            Throwable cause3 = th.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                        }
                    case 2:
                        m3441();
                        if (z) {
                            m3465();
                            return;
                        }
                        return;
                    case 3:
                        m3448();
                        if (z) {
                            m3451();
                            return;
                        }
                        return;
                    case 4:
                        Object obj4 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                        Context applicationContext4 = getApplicationContext();
                        fM.m2252((Object) applicationContext4, "");
                        try {
                            Object[] objArr4 = new Object[2];
                            objArr4[1] = Long.valueOf(f2783);
                            objArr4[0] = applicationContext4;
                            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ι", new Class[]{Context.class, Long.TYPE}).invoke(obj4, objArr4);
                            m3477();
                            return;
                        } catch (Throwable th2) {
                            Throwable cause4 = th2.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th2;
                        }
                    case 5:
                        m3440();
                        return;
                    case 6:
                        Object obj5 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                        Context applicationContext5 = getApplicationContext();
                        fM.m2252((Object) applicationContext5, "");
                        try {
                            Object[] objArr5 = new Object[2];
                            objArr5[1] = Long.valueOf(f2789);
                            objArr5[0] = applicationContext5;
                            ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Context.class, Long.TYPE}).invoke(obj5, objArr5);
                            if (z) {
                                m3442();
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            if (cause != null) {
                                throw cause;
                            }
                            throw th3;
                        }
                    case 7:
                        m3427();
                        return;
                    case 8:
                        m3436(this, false, 1, (Object) null);
                        return;
                }
            }
            lA.C0215 r22 = lA.f2728;
            String str3 = f2782;
            r22.m3369(str3, "Invalid / ignored command: " + ifVar2 + ". Nothing to do");
        } finally {
            cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    /* renamed from: ɺ  reason: contains not printable characters */
    private final void m3440() {
        stopForeground(f2766);
        stopSelf();
        lA.f2728.m3372(f2782, "Service Stopping");
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    private final void m3442() {
        m3449();
        m3447();
        Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
        Context applicationContext = getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        try {
            Object[] objArr = new Object[2];
            objArr[1] = Long.valueOf(f2764);
            objArr[0] = applicationContext;
            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", new Class[]{Context.class, Long.TYPE}).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ǀ  reason: contains not printable characters */
    private final void m3427() {
        m3473();
    }

    /* renamed from: ϲ  reason: contains not printable characters */
    private final void m3459() {
        lA.f2728.m3368(f2782, "Action Start");
        TempIDManager tempIDManager = TempIDManager.INSTANCE;
        Context context = this;
        C0452 r2 = this.f2797;
        if (r2 == null) {
            fM.m2253("functions");
        }
        tempIDManager.getTemporaryIDs(context, r2).m4409(new C3149<C0757>(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ lR f2814;

            {
                this.f2814 = r1;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m3479(C0329<C0757> r4) {
                fM.m2254(r4, "");
                lA.f2728.m3368(lR.f2782, "Get TemporaryIDs completed");
                TempIDManager tempIDManager = TempIDManager.INSTANCE;
                Context applicationContext = this.f2814.getApplicationContext();
                fM.m2252((Object) applicationContext, "");
                TemporaryID retrieveTemporaryID = tempIDManager.retrieveTemporaryID(applicationContext);
                if (retrieveTemporaryID != null) {
                    lR.f2769.m3509(retrieveTemporaryID);
                    this.f2814.m3438();
                }
            }
        });
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3477() {
        TempIDManager tempIDManager = TempIDManager.INSTANCE;
        Context applicationContext = getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        if (tempIDManager.needToUpdate(applicationContext) || f2775 == null) {
            lA.f2728.m3369(f2782, "[TempID] Need to update TemporaryID in actionUpdateBM");
            TempIDManager tempIDManager2 = TempIDManager.INSTANCE;
            Context context = this;
            C0452 r3 = this.f2797;
            if (r3 == null) {
                fM.m2253("functions");
            }
            fM.m2252((Object) tempIDManager2.getTemporaryIDs(context, r3).m4409(new C3149<C0757>(this) {

                /* renamed from: Ι  reason: contains not printable characters */
                final /* synthetic */ lR f2815;

                {
                    this.f2815 = r1;
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m3480(C0329<C0757> r4) {
                    fM.m2254(r4, "");
                    TempIDManager tempIDManager = TempIDManager.INSTANCE;
                    Context applicationContext = this.f2815.getApplicationContext();
                    fM.m2252((Object) applicationContext, "");
                    TemporaryID retrieveTemporaryID = tempIDManager.retrieveTemporaryID(applicationContext);
                    if (retrieveTemporaryID != null) {
                        lA.f2728.m3369(lR.f2782, "[TempID] Updated Temp ID");
                        lR.f2769.m3509(retrieveTemporaryID);
                    }
                    if (retrieveTemporaryID == null) {
                        lA.f2728.m3375(lR.f2782, "[TempID] Failed to fetch new Temp ID");
                    }
                }
            }), "");
            return;
        }
        lA.f2728.m3369(f2782, "[TempID] Don't need to update Temp ID in actionUpdateBM");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final long m3476(long j, long j2) {
        return (long) (((double) j) + (Math.random() * ((double) (j2 - j))));
    }

    /* renamed from: с  reason: contains not printable characters */
    private final void m3465() {
        TempIDManager tempIDManager = TempIDManager.INSTANCE;
        Context applicationContext = getApplicationContext();
        fM.m2252((Object) applicationContext, "");
        if (tempIDManager.needToUpdate(applicationContext) || f2775 == null) {
            lA.f2728.m3369(f2782, "[TempID] Need to update TemporaryID in actionScan");
            TempIDManager tempIDManager2 = TempIDManager.INSTANCE;
            Context applicationContext2 = getApplicationContext();
            fM.m2252((Object) applicationContext2, "");
            C0452 r3 = this.f2797;
            if (r3 == null) {
                fM.m2253("functions");
            }
            fM.m2252((Object) tempIDManager2.getTemporaryIDs(applicationContext2, r3).m4409(new C3149<C0757>(this) {

                /* renamed from: ɩ  reason: contains not printable characters */
                final /* synthetic */ lR f2823;

                {
                    this.f2823 = r1;
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m3485(C0329<C0757> r3) {
                    fM.m2254(r3, "");
                    TempIDManager tempIDManager = TempIDManager.INSTANCE;
                    Context applicationContext = this.f2823.getApplicationContext();
                    fM.m2252((Object) applicationContext, "");
                    TemporaryID retrieveTemporaryID = tempIDManager.retrieveTemporaryID(applicationContext);
                    if (retrieveTemporaryID != null) {
                        lR.f2769.m3509(retrieveTemporaryID);
                        this.f2823.m3466();
                    }
                }
            }), "");
            return;
        }
        lA.f2728.m3369(f2782, "[TempID] Don't need to update Temp ID in actionScan");
        m3466();
    }

    /* renamed from: ͻ  reason: contains not printable characters */
    private final void m3451() {
        m3469();
        if (m3433()) {
            C3581lx lxVar = this.f2812;
            if (lxVar != null) {
                lxVar.m3708(f2771);
                return;
            }
            return;
        }
        lA.f2728.m3372(f2782, "Unable to start advertising, bluetooth is off");
    }

    /* renamed from: Ј  reason: contains not printable characters */
    private final void m3462() {
        C3593mf mfVar = this.f2813;
        if (mfVar == null) {
            Context applicationContext = getApplicationContext();
            fM.m2252((Object) applicationContext, "");
            String str = this.f2807;
            if (str == null) {
                fM.m2253("serviceUUID");
            }
            mfVar = new C3593mf(applicationContext, str);
        }
        this.f2813 = mfVar;
        m3460();
        m3469();
    }

    /* renamed from: ϳ  reason: contains not printable characters */
    private final void m3460() {
        C3591md mdVar = this.f2804;
        if (mdVar == null) {
            Context context = this;
            String str = this.f2807;
            if (str == null) {
                fM.m2253("serviceUUID");
            }
            mdVar = new C3591md(context, str, f2780);
        }
        this.f2804 = mdVar;
    }

    /* renamed from: ј  reason: contains not printable characters */
    private final void m3469() {
        C3581lx lxVar = this.f2812;
        if (lxVar == null) {
            String str = this.f2807;
            if (str == null) {
                fM.m2253("serviceUUID");
            }
            lxVar = new C3581lx(str);
        }
        this.f2812 = lxVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɭ  reason: contains not printable characters */
    public final void m3438() {
        m3467();
        m3470();
    }

    /* renamed from: х  reason: contains not printable characters */
    private final void m3467() {
        lQ lQVar = this.f2809;
        if (lQVar == null) {
            fM.m2253("commandHandler");
        }
        lQVar.m3415(0);
    }

    /* renamed from: ґ  reason: contains not printable characters */
    private final void m3470() {
        lQ lQVar = this.f2809;
        if (lQVar == null) {
            fM.m2253("commandHandler");
        }
        lQVar.m3411(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: т  reason: contains not printable characters */
    public final void m3466() {
        m3460();
        m3446();
    }

    /* renamed from: ɻ  reason: contains not printable characters */
    private final void m3441() {
        if (!f2762) {
            lQ lQVar = this.f2809;
            if (lQVar == null) {
                fM.m2253("commandHandler");
            }
            lQVar.m3415(f2780 + m3476(f2779, f2761));
        }
    }

    /* renamed from: ʕ  reason: contains not printable characters */
    private final void m3448() {
        if (!f2763) {
            lQ lQVar = this.f2809;
            if (lQVar == null) {
                fM.m2253("commandHandler");
            }
            lQVar.m3411(f2771 + f2792);
        }
    }

    /* renamed from: ʏ  reason: contains not printable characters */
    private final void m3446() {
        if (m3433()) {
            C3591md mdVar = this.f2804;
            if (mdVar == null) {
                return;
            }
            if (!mdVar.m3817()) {
                mdVar.m3819();
            } else {
                lA.f2728.m3375(f2782, "Already scanning!");
            }
        } else {
            lA.f2728.m3372(f2782, "Unable to start scan - bluetooth is off");
        }
    }

    /* renamed from: ʖ  reason: contains not printable characters */
    private final void m3449() {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(getApplicationContext());
        fM.m2252((Object) instance, "");
        this.f2806 = instance;
        FirebaseAuth instance2 = FirebaseAuth.getInstance();
        fM.m2252((Object) instance2, "");
        this.f2802 = instance2;
        FirebaseAuth firebaseAuth = this.f2802;
        if (firebaseAuth == null) {
            fM.m2253("auth");
        }
        if (firebaseAuth.m1090() == null) {
            try {
                if (((Boolean) ((Class) C3166.m16013(4, 8, 0)).getMethod("ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{this})).booleanValue()) {
                    lA.f2728.m3368(f2782, "User is not login but has completed onboarding");
                    Bundle bundle = new Bundle();
                    bundle.putString("item_id", "Android");
                    bundle.putString("item_name", "Have not login yet but in main activity");
                    FirebaseAnalytics firebaseAnalytics = this.f2806;
                    if (firebaseAnalytics == null) {
                        fM.m2253("firebaseAnalytics");
                    }
                    firebaseAnalytics.m1082("login", bundle);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    /* renamed from: ʔ  reason: contains not printable characters */
    private final void m3447() {
        lA.f2728.m3369(f2782, "Performing self diagnosis");
        if (!m3432() || !m3433()) {
            lA.f2728.m3369(f2782, "no location permission");
            m3457((boolean) f2766);
            return;
        }
        try {
            boolean z = false;
            if (((Boolean) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ɩ", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{this})).booleanValue()) {
                m3454((boolean) f2766);
                return;
            }
            m3419(f2766);
            m3462();
            if (!f2762) {
                lQ lQVar = this.f2809;
                if (lQVar == null) {
                    fM.m2253("commandHandler");
                }
                if (!lQVar.m3413()) {
                    lA.f2728.m3372(f2782, "Missing Scan Schedule - rectifying");
                    lQ lQVar2 = this.f2809;
                    if (lQVar2 == null) {
                        fM.m2253("commandHandler");
                    }
                    lQVar2.m3415(100);
                } else {
                    lA.f2728.m3372(f2782, "Scan Schedule present");
                }
            } else {
                lA.f2728.m3372(f2782, "Should be operating under infinite scan mode");
            }
            if (!f2763) {
                lQ lQVar3 = this.f2809;
                if (lQVar3 == null) {
                    fM.m2253("commandHandler");
                }
                if (!lQVar3.m3417()) {
                    lA.f2728.m3372(f2782, "Missing Advertise Schedule - rectifying");
                    lQ lQVar4 = this.f2809;
                    if (lQVar4 == null) {
                        fM.m2253("commandHandler");
                    }
                    lQVar4.m3411(100);
                    return;
                }
                lA.C0215 r0 = lA.f2728;
                String str = f2782;
                StringBuilder sb = new StringBuilder();
                sb.append("Advertise Schedule present. Should be advertising?:  ");
                C3581lx lxVar = this.f2812;
                sb.append(lxVar != null ? lxVar.m3709() : false);
                sb.append(". Is Advertising?: ");
                C3581lx lxVar2 = this.f2812;
                if (lxVar2 != null) {
                    z = lxVar2.m3707();
                }
                sb.append(z);
                r0.m3372(str, sb.toString());
                return;
            }
            lA.f2728.m3372(f2782, "Should be operating under infinite advertise mode");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lo/hv;", "ı", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 16})
    /* renamed from: o.lR$3  reason: invalid class name */
    static final class AnonymousClass3 extends eM implements C3423fy<C3474hv, C3390er<? super dF>, Object> {

        /* renamed from: ı  reason: contains not printable characters */
        final /* synthetic */ lR f2817;

        /* renamed from: ǃ  reason: contains not printable characters */
        int f2818;

        /* renamed from: ɩ  reason: contains not printable characters */
        long f2819;

        /* renamed from: ɹ  reason: contains not printable characters */
        private C3474hv f2820;

        /* renamed from: Ι  reason: contains not printable characters */
        Object f2821;

        {
            this.f2817 = r1;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Object m3481(Object obj, Object obj2) {
            return ((AnonymousClass3) m3483(obj, (C3390er) obj2)).m3482(dF.f2032);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3390er<dF> m3483(Object obj, C3390er<?> erVar) {
            fM.m2254(erVar, "");
            AnonymousClass3 r0 = new AnonymousClass3(this.f2817, lRVar, erVar);
            r0.f2820 = (C3474hv) obj;
            return r0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m3482(Object obj) {
            long j;
            C3474hv hvVar;
            Object r0 = eF.m2136();
            int i = this.f2818;
            if (i == 0) {
                C3366du.m2109(obj);
                hvVar = this.f2820;
                j = System.currentTimeMillis() - lR.f2769.m3520();
                lA.C0215 r10 = lA.f2728;
                String r6 = lR.f2782;
                r10.m3369(r6, "Coroutine - Purging of data before epoch time " + j);
                C3596mi r102 = lR.m3452(this.f2817);
                this.f2821 = hvVar;
                this.f2819 = j;
                this.f2818 = 1;
                if (r102.m3881(j, this) == r0) {
                    return r0;
                }
            } else if (i == 1) {
                j = this.f2819;
                hvVar = (C3474hv) this.f2821;
                C3366du.m2109(obj);
            } else if (i == 2) {
                long j2 = this.f2819;
                C3474hv hvVar2 = (C3474hv) this.f2821;
                C3366du.m2109(obj);
                Object obj2 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                Context context = lRVar;
                Object[] objArr = new Object[2];
                objArr[1] = Long.valueOf(System.currentTimeMillis());
                objArr[0] = context;
                ((Class) C3166.m16013(4, 8, 0)).getMethod("ι", new Class[]{Context.class, Long.TYPE}).invoke(obj2, objArr);
                return dF.f2032;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lV r103 = lR.m3455(this.f2817);
            this.f2821 = hvVar;
            this.f2819 = j;
            this.f2818 = 2;
            if (r103.m3527(j, (C3390er<? super dF>) this) == r0) {
                return r0;
            }
            Object obj22 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
            Context context2 = lRVar;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Long.valueOf(System.currentTimeMillis());
                objArr2[0] = context2;
                ((Class) C3166.m16013(4, 8, 0)).getMethod("ι", new Class[]{Context.class, Long.TYPE}).invoke(obj22, objArr2);
                return dF.f2032;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    /* renamed from: ӷ  reason: contains not printable characters */
    private final void m3473() {
        final lR lRVar = this;
        C3483id unused = C3454hb.m2507$default(this, (C3396ex) null, (C3475hw) null, new AnonymousClass3(this, (C3390er) null), 3, (Object) null);
    }

    public final void onDestroy() {
        super.onDestroy();
        lA.f2728.m3369(f2782, "BluetoothMonitoringService destroyed - tearing down");
        m3420();
        lA.f2728.m3369(f2782, "BluetoothMonitoringService destroyed");
    }

    /* renamed from: ıı  reason: contains not printable characters */
    private final void m3420() {
        m3474();
        m3463();
        C3595mh mhVar = this.f2810;
        if (mhVar != null) {
            mhVar.m3875();
        }
        C3595mh mhVar2 = this.f2810;
        if (mhVar2 != null) {
            mhVar2.m3873();
        }
        C3483id.DefaultImpls.m2678$default(this.f2796, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: τ  reason: contains not printable characters */
    private final void m3458() {
        IntentFilter intentFilter = new IntentFilter("sg.gov.tech.bluetrace.ACTION_RECEIVED_STREETPASS");
        C0375 r1 = this.f2803;
        if (r1 == null) {
            fM.m2253("localBroadcastManager");
        }
        r1.m4586(this.f2794, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter("sg.gov.tech.bluetrace.ACTION_RECEIVED_STATUS");
        C0375 r12 = this.f2803;
        if (r12 == null) {
            fM.m2253("localBroadcastManager");
        }
        r12.m4586(this.f2795, intentFilter2);
        registerReceiver(this.f2808, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f2805, lN.f2755.m3405());
        registerReceiver(this.f2811, lL.f2750if.m3402());
        lA.f2728.m3369(f2782, "Receivers registered");
    }

    /* renamed from: Г  reason: contains not printable characters */
    private final void m3463() {
        try {
            C0375 r1 = this.f2803;
            if (r1 == null) {
                fM.m2253("localBroadcastManager");
            }
            r1.m4584(this.f2794);
        } catch (Throwable unused) {
            lA.f2728.m3372(f2782, "streetPassReceiver is not registered?");
        }
        try {
            C0375 r12 = this.f2803;
            if (r12 == null) {
                fM.m2253("localBroadcastManager");
            }
            r12.m4584(this.f2795);
        } catch (Throwable unused2) {
            lA.f2728.m3372(f2782, "statusReceiver is not registered?");
        }
        try {
            unregisterReceiver(this.f2808);
        } catch (Throwable unused3) {
            lA.f2728.m3372(f2782, "bluetoothStatusReceiver is not registered?");
        }
        try {
            unregisterReceiver(this.f2805);
        } catch (Throwable unused4) {
            lA.f2728.m3372(f2782, "packageInstalledReceiver is not registered?");
        }
        try {
            unregisterReceiver(this.f2811);
        } catch (Throwable unused5) {
            lA.f2728.m3372(f2782, "packageUninstalledReceiver is not registered?");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\nB\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/lR$ɩ;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "(Lo/lR;)V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lR$ɩ  reason: contains not printable characters */
    public final class C0221 extends BroadcastReceiver {
        public C0221() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && fM.m2257(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1)) {
                    case 10:
                        lA.f2728.m3368(lR.f2782, "BluetoothAdapter.STATE_OFF");
                        return;
                    case 11:
                        lA.f2728.m3368(lR.f2782, "BluetoothAdapter.STATE_TURNING_ON");
                        return;
                    case 12:
                        lA.f2728.m3368(lR.f2782, "BluetoothAdapter.STATE_ON");
                        Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                        Context applicationContext = lR.this.getApplicationContext();
                        fM.m2252((Object) applicationContext, "");
                        try {
                            ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{Context.class}).invoke(obj, new Object[]{applicationContext});
                            return;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    case 13:
                        lA.f2728.m3368(lR.f2782, "BluetoothAdapter.STATE_TURNING_OFF");
                        lR.m3418(lR.this, false, 1, (Object) null);
                        lR.this.m3474();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lR$aux;", "", "ı", "Ljava/lang/String;", "ɩ", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "(Lo/lR;)V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
    public final class aux extends BroadcastReceiver {
        /* access modifiers changed from: private */

        /* renamed from: ı  reason: contains not printable characters */
        public final String f2833 = "StreetPassReceiver";

        public aux() {
        }

        public final void onReceive(Context context, Intent intent) {
            Intent intent2 = intent;
            fM.m2254(context, "");
            fM.m2254(intent2, "");
            if (fM.m2257("sg.gov.tech.bluetrace.ACTION_RECEIVED_STREETPASS", intent.getAction())) {
                Parcelable parcelableExtra = intent2.getParcelableExtra("sg.gov.tech.bluetrace.STREET_PASS");
                fM.m2252((Object) parcelableExtra, "");
                ConnectionRecord connectionRecord = (ConnectionRecord) parcelableExtra;
                lA.C0215 r2 = lA.f2728;
                String str = this.f2833;
                r2.m3368(str, "StreetPass received: " + connectionRecord);
                if (connectionRecord.getMsg().length() > 0 ? lR.f2766 : false) {
                    final StreetPassRecord streetPassRecord = new StreetPassRecord(connectionRecord.getVersion(), connectionRecord.getMsg(), connectionRecord.getOrg(), connectionRecord.getPeripheral().m3550(), connectionRecord.getCentral().m3806(), connectionRecord.getRssi(), connectionRecord.getTxPower());
                    C3483id unused = C3454hb.m2507$default(lR.this, (C3396ex) null, (C3475hw) null, new C3423fy<C3474hv, C3390er<? super dF>, Object>(this, (C3390er) null) {

                        /* renamed from: ı  reason: contains not printable characters */
                        private C3474hv f2836;

                        /* renamed from: ǃ  reason: contains not printable characters */
                        int f2837;

                        /* renamed from: Ι  reason: contains not printable characters */
                        final /* synthetic */ aux f2838;

                        /* renamed from: ι  reason: contains not printable characters */
                        Object f2839;

                        {
                            this.f2838 = r1;
                        }

                        /* renamed from: ı  reason: contains not printable characters */
                        public final Object m3494(Object obj, Object obj2) {
                            return ((AnonymousClass5) m3496(obj, (C3390er) obj2)).m3495(dF.f2032);
                        }

                        /* renamed from: ɩ  reason: contains not printable characters */
                        public final C3390er<dF> m3496(Object obj, C3390er<?> erVar) {
                            fM.m2254(erVar, "");
                            AnonymousClass5 r0 = 

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lR$If;", "", "ι", "Ljava/lang/String;", "Ι", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "(Lo/lR;)V", "Landroid/content/BroadcastReceiver;"}, k = 1, mv = {1, 1, 16})
                            public final class If extends BroadcastReceiver {

                                /* renamed from: ι  reason: contains not printable characters */
                                private final String f2827 = "StatusReceiver";

                                public If() {
                                }

                                public final void onReceive(Context context, Intent intent) {
                                    fM.m2254(context, "");
                                    fM.m2254(intent, "");
                                    if (fM.m2257("sg.gov.tech.bluetrace.ACTION_RECEIVED_STATUS", intent.getAction())) {
                                        Parcelable parcelableExtra = intent.getParcelableExtra("sg.gov.tech.bluetrace.STATUS");
                                        fM.m2252((Object) parcelableExtra, "");
                                        lT lTVar = (lT) parcelableExtra;
                                        lA.C0215 r8 = lA.f2728;
                                        String str = this.f2827;
                                        r8.m3368(str, "Status received: " + lTVar.m3524());
                                        if (lTVar.m3524().length() > 0 ? lR.f2766 : false) {
                                            final StatusRecord statusRecord = new StatusRecord(lTVar.m3524());
                                            C3483id unused = C3454hb.m2507$default(lR.this, (C3396ex) null, (C3475hw) null, new C3423fy<C3474hv, C3390er<? super dF>, Object>(this, (C3390er) null) {

                                                /* renamed from: ǃ  reason: contains not printable characters */
                                                Object f2829;

                                                /* renamed from: ɩ  reason: contains not printable characters */
                                                int f2830;

                                                /* renamed from: Ι  reason: contains not printable characters */
                                                private C3474hv f2831;

                                                /* renamed from: ι  reason: contains not printable characters */
                                                final /* synthetic */ If f2832;

                                                {
                                                    this.f2832 = r1;
                                                }

                                                /* renamed from: ı  reason: contains not printable characters */
                                                public final Object m3490(Object obj, Object obj2) {
                                                    return ((AnonymousClass2) m3492(obj, (C3390er) obj2)).m3491(dF.f2032);
                                                }

                                                /* renamed from: ɩ  reason: contains not printable characters */
                                                public final C3390er<dF> m3492(Object obj, C3390er<?> erVar) {
                                                    fM.m2254(erVar, "");
                                                    AnonymousClass2 r0 = 

                                                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0010\b\u0001\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00000\u0017:\u0001\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u0005j\u0002\b\u0007j\u0002\b\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lo/lR$if;", "If", "", "ȷ", "I", "ι", "()I", "ɩ", "", "ӏ", "Ljava/lang/String;", "ǃ", "()Ljava/lang/String;", "ı", "Ι", "і", "Ɩ", "Ӏ", "І", "p0", "p1", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", ""}, k = 1, mv = {1, 1, 16})
                                                    /* renamed from: o.lR$if  reason: invalid class name */
                                                    public enum Cif {
                                                        INVALID(-1, "INVALID"),
                                                        ACTION_START(0, "START"),
                                                        ACTION_SCAN(1, "SCAN"),
                                                        ACTION_STOP(2, "STOP"),
                                                        ACTION_ADVERTISE(3, "ADVERTISE"),
                                                        ACTION_SELF_CHECK(4, "SELF_CHECK"),
                                                        ACTION_UPDATE_BM(5, "UPDATE_BM"),
                                                        ACTION_PAUSE_FOR_SWIFTMED(6, "PAUSE_FOR_SWIFTMED"),
                                                        ACTION_PURGE(7, "PURGE");
                                                        
                                                        public static final If If = null;
                                                        /* access modifiers changed from: private */

                                                        /* renamed from: ɾ  reason: contains not printable characters */
                                                        public static final Map<Integer, Cif> f2845 = null;

                                                        /* renamed from: ȷ  reason: contains not printable characters */
                                                        private final int f2851;

                                                        /* renamed from: ӏ  reason: contains not printable characters */
                                                        private final String f2852;

                                                        private Cif(int i, String str) {
                                                            this.f2851 = i;
                                                            this.f2852 = str;
                                                        }

                                                        @JvmName(name = "ǃ")
                                                        /* renamed from: ǃ  reason: contains not printable characters */
                                                        public final String m3498() {
                                                            return this.f2852;
                                                        }

                                                        @JvmName(name = "ι")
                                                        /* renamed from: ι  reason: contains not printable characters */
                                                        public final int m3499() {
                                                            return this.f2851;
                                                        }

                                                        static {
                                                            int i;
                                                            If = new If((fL) null);
                                                            Cif[] values = values();
                                                            Map<Integer, Cif> linkedHashMap = new LinkedHashMap<>(C3435gj.m2407(C3377ee.m2205(values.length), 16));
                                                            for (Cif ifVar : values) {
                                                                C3363dr r4 = dB.m2052(Integer.valueOf(ifVar.f2851), ifVar);
                                                                linkedHashMap.put(r4.m2104(), r4.m2101());
                                                            }
                                                            f2845 = linkedHashMap;
                                                        }

                                                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/lR$if$If;", "", "", "Lo/lR$if;", "ɾ", "Ljava/util/Map;", "Ι", "p0", "ǃ", "(I)Lo/lR$if;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
                                                        /* renamed from: o.lR$if$If */
                                                        public static final class If {
                                                            private If() {
                                                            }

                                                            public /* synthetic */ If(fL fLVar) {
                                                                this();
                                                            }

                                                            /* renamed from: ǃ  reason: contains not printable characters */
                                                            public final Cif m3500(int i) {
                                                                return (Cif) Cif.f2845.get(Integer.valueOf(i));
                                                            }
                                                        }
                                                    }

                                                    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020GB\t\b\u0002¢\u0006\u0004\bE\u0010FR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00018\u0007@\u0006XD¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0004\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0014\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0018\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0011\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u001b\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\b\u0010\u000eR\u001c\u0010\u001d\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u0018\u0010\u000eR\u001c\u0010\u001f\u001a\u00020\t8\u0007@\u0006XD¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u0005\u0010\u000eR\u0016\u0010!\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b \u0010\u0003R\u0016\u0010$\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0016\u0010%\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u001c\u0010(\u001a\u00020\"8\u0007@\u0006XD¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001b\u0010'R\u0016\u0010)\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u001c\u0010/\u001a\u00020*8\u0007@\u0006XD¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u0010-\u001a\u0004\u0018\u0001008\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b!\u00103\"\u0004\b\u0004\u00104R\u001c\u00106\u001a\u00020\"8\u0007@\u0006XD¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b\u001d\u0010'R\u0016\u00107\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u001c\u00109\u001a\u00020*8\u0007@\u0006XD¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b%\u0010.R\u001c\u0010;\u001a\u00020*8\u0007@\u0006XD¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b/\u0010.R\u001c\u0010=\u001a\u00020\"8\u0007@\u0006XD¢\u0006\f\n\u0004\b<\u0010#\u001a\u0004\b$\u0010'R\u0016\u0010>\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010?\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010@\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001c\u0010B\u001a\u00020\"8\u0007@\u0006XD¢\u0006\f\n\u0004\bA\u0010#\u001a\u0004\b\u001f\u0010'R\u0016\u0010C\u001a\u00020\"8\u0006@\u0006X@¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u001c\u0010\u001e\u001a\u00020*8\u0007@\u0006XD¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\b(\u0010."}, d2 = {"Lo/lR$ı;", "", "Ј", "Ljava/lang/String;", "ɩ", "Ι", "ɭ", "()Ljava/lang/String;", "ı", "", "с", "I", "ǃ", "т", "()I", "ι", "х", "І", "Ɩ", "ɻ", "і", "ɹ", "ʖ", "ʔ", "Ӏ", "ґ", "ј", "ɪ", "ʏ", "ȷ", "ͻ", "ӏ", "ϲ", "ɨ", "", "J", "ɾ", "ʟ", "Г", "()J", "ł", "г", "", "ɂ", "Z", "ɿ", "()Z", "ŀ", "Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "ʕ", "Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "()Lsg/gov/tech/bluetrace/idmanager/TemporaryID;", "(Lsg/gov/tech/bluetrace/idmanager/TemporaryID;)V", "τ", "Ɨ", "ſ", "ıǃ", "ɍ", "ıı", "ʅ", "ӷ", "ƚ", "ɟ", "ǀ", "ɺ", "Γ", "ɔ", "ɼ", "ǃı", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
                                                    /* renamed from: o.lR$ı  reason: contains not printable characters */
                                                    public static final class C0219 {
                                                        private C0219() {
                                                        }

                                                        public /* synthetic */ C0219(fL fLVar) {
                                                            this();
                                                        }

                                                        @JvmName(name = "Ι")
                                                        /* renamed from: Ι  reason: contains not printable characters */
                                                        public final int m3515() {
                                                            return lR.f2777;
                                                        }

                                                        @JvmName(name = "ɩ")
                                                        /* renamed from: ɩ  reason: contains not printable characters */
                                                        public final String m3508() {
                                                            return lR.f2770;
                                                        }

                                                        @JvmName(name = "ǃ")
                                                        /* renamed from: ǃ  reason: contains not printable characters */
                                                        public final int m3505() {
                                                            return lR.f2787;
                                                        }

                                                        @JvmName(name = "ı")
                                                        /* renamed from: ı  reason: contains not printable characters */
                                                        public final int m3501() {
                                                            return lR.f2790;
                                                        }

                                                        @JvmName(name = "ι")
                                                        /* renamed from: ι  reason: contains not printable characters */
                                                        public final int m3516() {
                                                            return lR.f2791;
                                                        }

                                                        @JvmName(name = "І")
                                                        /* renamed from: І  reason: contains not printable characters */
                                                        public final int m3517() {
                                                            return lR.f2788;
                                                        }

                                                        @JvmName(name = "Ɩ")
                                                        /* renamed from: Ɩ  reason: contains not printable characters */
                                                        public final int m3504() {
                                                            return lR.f2776;
                                                        }

                                                        @JvmName(name = "Ӏ")
                                                        /* renamed from: Ӏ  reason: contains not printable characters */
                                                        public final int m3519() {
                                                            return lR.f2773;
                                                        }

                                                        @JvmName(name = "і")
                                                        /* renamed from: і  reason: contains not printable characters */
                                                        public final int m3518() {
                                                            return lR.f2772;
                                                        }

                                                        @JvmName(name = "ɹ")
                                                        /* renamed from: ɹ  reason: contains not printable characters */
                                                        public final int m3511() {
                                                            return lR.f2774;
                                                        }

                                                        @JvmName(name = "ɨ")
                                                        /* renamed from: ɨ  reason: contains not printable characters */
                                                        public final TemporaryID m3507() {
                                                            return lR.f2775;
                                                        }

                                                        @JvmName(name = "ɩ")
                                                        /* renamed from: ɩ  reason: contains not printable characters */
                                                        public final void m3509(TemporaryID temporaryID) {
                                                            lR.f2775 = temporaryID;
                                                        }

                                                        @JvmName(name = "ɾ")
                                                        /* renamed from: ɾ  reason: contains not printable characters */
                                                        public final long m3512() {
                                                            return lR.f2793;
                                                        }

                                                        @JvmName(name = "ӏ")
                                                        /* renamed from: ӏ  reason: contains not printable characters */
                                                        public final long m3520() {
                                                            return lR.f2778;
                                                        }

                                                        @JvmName(name = "ȷ")
                                                        /* renamed from: ȷ  reason: contains not printable characters */
                                                        public final long m3506() {
                                                            return lR.f2781;
                                                        }

                                                        @JvmName(name = "ɪ")
                                                        /* renamed from: ɪ  reason: contains not printable characters */
                                                        public final long m3510() {
                                                            return lR.f2785;
                                                        }

                                                        @JvmName(name = "ŀ")
                                                        /* renamed from: ŀ  reason: contains not printable characters */
                                                        public final boolean m3502() {
                                                            return lR.f2762;
                                                        }

                                                        @JvmName(name = "ʟ")
                                                        /* renamed from: ʟ  reason: contains not printable characters */
                                                        public final boolean m3514() {
                                                            return lR.f2763;
                                                        }

                                                        @JvmName(name = "ł")
                                                        /* renamed from: ł  reason: contains not printable characters */
                                                        public final boolean m3503() {
                                                            return lR.f2766;
                                                        }

                                                        @JvmName(name = "ɿ")
                                                        /* renamed from: ɿ  reason: contains not printable characters */
                                                        public final boolean m3513() {
                                                            return lR.f2767;
                                                        }
                                                    }
                                                }
