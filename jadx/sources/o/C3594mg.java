package o;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3595mh;
import o.lA;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u000005:\u0003\u0010\b1B\u001f\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u00020\u001d¢\u0006\u0004\b3\u00104J\u0018\u0010\u0004\u001a\u00020)2\u0006\u0010!\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010*J\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0017J!\u0010\n\u001a\u00020/2\u0006\u0010!\u001a\u00020+2\n\u0010.\u001a\u00060,R\u00020-¢\u0006\u0004\b\n\u00100R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00060\u0005R\u00020\u00008\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u00020\u000b8\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u00020\u00118\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00158\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\n\u0010\u0017\"\u0004\b\u0010\u0010\u0018R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u0006\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR+\u0010\u0013\u001a\u00020 2\u0006\u0010!\u001a\u00020 8G@GX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u001a\u0004\b\u0010\u0010#\"\u0004\b\u0004\u0010$R\"\u0010\u0002\u001a\u00020 8\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010%\u001a\u0004\b\u0004\u0010#\"\u0004\b\n\u0010$R\u0019\u0010\f\u001a\u00020&8\u0007@\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b\u0002\u0010("}, d2 = {"Lo/mg;", "", "і", "Ljava/lang/String;", "Ι", "Lo/mg$If;", "ι", "Lo/mg$If;", "ı", "()Lo/mg$If;", "ɩ", "Lo/mc;", "Ӏ", "Lo/mc;", "Ɩ", "()Lo/mc;", "ǃ", "Landroid/bluetooth/BluetoothDevice;", "Landroid/bluetooth/BluetoothDevice;", "І", "()Landroid/bluetooth/BluetoothDevice;", "", "Z", "()Z", "(Z)V", "Landroid/bluetooth/BluetoothGatt;", "Landroid/bluetooth/BluetoothGatt;", "()Landroid/bluetooth/BluetoothGatt;", "ɹ", "Lo/mg$ı;", "ɾ", "Lo/mg$ı;", "", "p0", "Lo/gh;", "()J", "(J)V", "J", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "", "(Lo/mg;)I", "Landroid/content/Context;", "Lo/mh$ǃ;", "Lo/mh;", "p1", "", "(Landroid/content/Context;Lo/mh$ǃ;)V", "If", "p2", "<init>", "(Landroid/bluetooth/BluetoothDevice;Lo/mc;Lo/mg$ı;)V", ""}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mg  reason: case insensitive filesystem */
public final class C3594mg implements Comparable<C3594mg> {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f3212 = {C3428gc.m2390((fQ) new fS(C3428gc.m2389(C3594mg.class), "timeStamp", "getTimeStamp()J"))};

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f3213;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private BluetoothDevice f3214;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3433gh f3215 = fY.f2174.m2283();

    /* renamed from: ɹ  reason: contains not printable characters */
    private long f3216;
    /* access modifiers changed from: private */

    /* renamed from: ɾ  reason: contains not printable characters */
    public final C0251 f3217;

    /* renamed from: Ι  reason: contains not printable characters */
    private BluetoothGatt f3218;

    /* renamed from: ι  reason: contains not printable characters */
    private If f3219 = new If();

    /* renamed from: І  reason: contains not printable characters */
    private final Runnable f3220 = new Runnable(this) {

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ C3594mg f3223;

        {
            this.f3223 = r1;
        }

        public final void run() {
            this.f3223.f3217.m3852(this.f3223);
        }
    };

    /* renamed from: і  reason: contains not printable characters */
    private final String f3221 = "Work";

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C3590mc f3222;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0006J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/mg$ı;", "Lo/mg;", "p0", "", "ı", "(Lo/mg;)V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.mg$ı  reason: contains not printable characters */
    public interface C0251 {
        /* renamed from: ı  reason: contains not printable characters */
        void m3852(C3594mg mgVar);
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m3833() {
        return ((Number) this.f3215.m2405(this, f3212[0])).longValue();
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3841(long j) {
        this.f3215.m2404(this, f3212[0], Long.valueOf(j));
    }

    public C3594mg(BluetoothDevice bluetoothDevice, C3590mc mcVar, C0251 r4) {
        fM.m2254(bluetoothDevice, "");
        fM.m2254(mcVar, "");
        fM.m2254(r4, "");
        this.f3214 = bluetoothDevice;
        this.f3222 = mcVar;
        this.f3217 = r4;
        m3841(System.currentTimeMillis());
    }

    @JvmName(name = "І")
    /* renamed from: І  reason: contains not printable characters */
    public final BluetoothDevice m3843() {
        return this.f3214;
    }

    @JvmName(name = "Ɩ")
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C3590mc m3832() {
        return this.f3222;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final If m3831() {
        return this.f3219;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final BluetoothGatt m3842() {
        return this.f3218;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3834(boolean z) {
        this.f3213 = z;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m3837() {
        return this.f3213;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3835(long j) {
        this.f3216 = j;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final long m3840() {
        return this.f3216;
    }

    @JvmName(name = "і")
    /* renamed from: і  reason: contains not printable characters */
    public final Runnable m3844() {
        return this.f3220;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m3838() {
        return (this.f3219.m3849().m3854() && this.f3219.m3847().m3854() && this.f3219.m3848().m3854()) || this.f3219.m3850().m3854();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3836(Context context, C3595mh.C0254 r5) {
        fM.m2254(context, "");
        fM.m2254(r5, "");
        if (Build.VERSION.SDK_INT >= 23) {
            this.f3218 = this.f3214.connectGatt(context, false, r5, 2);
        } else {
            this.f3218 = this.f3214.connectGatt(context, false, r5);
        }
        if (this.f3218 == null) {
            lA.C0215 r4 = lA.f2728;
            String str = this.f3221;
            r4.m3375(str, "Unable to connect to " + this.f3214.getAddress());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int compareTo(C3594mg mgVar) {
        fM.m2254(mgVar, "");
        return -((int) (m3833() - mgVar.m3833()));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0004\u0018\u00002\u00020\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u00060\u0001R\u00020\u00028\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0003\u001a\u00060\u0001R\u00020\u00028\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\n\u001a\u00060\u0001R\u00020\u00028\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\u0005\u001a\u00060\u0001R\u00020\u00028\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0007\u0010\u0006R \u0010\t\u001a\u00060\u0001R\u00020\u00028\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00060\u0001R\u00020\u00028\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R \u0010\f\u001a\u00060\u0001R\u00020\u00028\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\n\u0010\u0006"}, d2 = {"Lo/mg$If;", "Lo/mg$ǃ;", "Lo/mg;", "ı", "Lo/mg$ǃ;", "ι", "()Lo/mg$ǃ;", "ɩ", "і", "ǃ", "Ι", "Ӏ", "І", "ɹ", "", "toString", "()Ljava/lang/String;", "<init>", "(Lo/mg;)V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.mg$If */
    public final class If {

        /* renamed from: ı  reason: contains not printable characters */
        C0252 f3224;

        /* renamed from: ǃ  reason: contains not printable characters */
        C0252 f3225;

        /* renamed from: ɩ  reason: contains not printable characters */
        C0252 f3226;

        /* renamed from: Ι  reason: contains not printable characters */
        C0252 f3227;

        /* renamed from: ι  reason: contains not printable characters */
        C0252 f3228;

        /* renamed from: і  reason: contains not printable characters */
        C0252 f3230;

        /* renamed from: Ӏ  reason: contains not printable characters */
        C0252 f3231;

        public If() {
            this.f3225 = new C0252();
            this.f3224 = new C0252();
            this.f3228 = new C0252();
            this.f3227 = new C0252();
            this.f3226 = new C0252();
            this.f3230 = new C0252();
            this.f3231 = new C0252();
        }

        @JvmName(name = "ı")
        /* renamed from: ı  reason: contains not printable characters */
        public final C0252 m3845() {
            return this.f3225;
        }

        @JvmName(name = "ι")
        /* renamed from: ι  reason: contains not printable characters */
        public final C0252 m3849() {
            return this.f3224;
        }

        @JvmName(name = "ǃ")
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0252 m3846() {
            return this.f3228;
        }

        @JvmName(name = "ɩ")
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0252 m3847() {
            return this.f3227;
        }

        @JvmName(name = "Ι")
        /* renamed from: Ι  reason: contains not printable characters */
        public final C0252 m3848() {
            return this.f3226;
        }

        @JvmName(name = "і")
        /* renamed from: і  reason: contains not printable characters */
        public final C0252 m3851() {
            return this.f3230;
        }

        @JvmName(name = "І")
        /* renamed from: І  reason: contains not printable characters */
        public final C0252 m3850() {
            return this.f3231;
        }

        public final String toString() {
            String r0 = new C3122().m15836(this);
            fM.m2252((Object) r0, "");
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0004\u0018\u00002\u00020\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\u00020\u00018\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\f\"\u0004\b\u0004\u0010\r"}, d2 = {"Lo/mg$ǃ;", "", "ι", "Z", "ǃ", "()Z", "Ι", "(Z)V", "ɩ", "", "ı", "J", "()J", "(J)V", "<init>", "(Lo/mg;)V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.mg$ǃ  reason: contains not printable characters */
    public final class C0252 {

        /* renamed from: ı  reason: contains not printable characters */
        long f3232;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f3234;

        public C0252() {
        }

        @JvmName(name = "ǃ")
        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m3854() {
            return this.f3234;
        }

        @JvmName(name = "Ι")
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m3856(boolean z) {
            this.f3234 = z;
        }

        @JvmName(name = "ǃ")
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3853(long j) {
            this.f3232 = j;
        }

        @JvmName(name = "Ι")
        /* renamed from: Ι  reason: contains not printable characters */
        public final long m3855() {
            return this.f3232;
        }
    }
}
