package o;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\u0018\u0000 \u00012\u00020\u0004:\u0001\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lA;", "ǃ", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
public final class lA {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C0215 f2728 = new C0215((fL) null);
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public static PowerManager f2729;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0002\u0010\u0010J\u001d\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\rJ\u000f\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0005\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\f\u0010\u0014J\u001d\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\rR$\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/lA$ǃ;", "Landroid/os/PowerManager;", "Ι", "Landroid/os/PowerManager;", "()Landroid/os/PowerManager;", "ι", "(Landroid/os/PowerManager;)V", "ǃ", "", "p0", "p1", "", "ı", "(Ljava/lang/String;Ljava/lang/String;)V", "", "p2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "()Ljava/lang/String;", "ɩ", "", "()Z", "<init>", "()V", ""}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lA$ǃ  reason: contains not printable characters */
    public static final class C0215 {
        /* renamed from: ı  reason: contains not printable characters */
        private final boolean m3366() {
            return false;
        }

        private C0215() {
        }

        public /* synthetic */ C0215(fL fLVar) {
            this();
        }

        @JvmName(name = "Ι")
        /* renamed from: Ι  reason: contains not printable characters */
        public final PowerManager m3370() {
            return lA.f2729;
        }

        @JvmName(name = "ι")
        /* renamed from: ι  reason: contains not printable characters */
        public final void m3374(PowerManager powerManager) {
            lA.f2729 = powerManager;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m3371(PowerManager powerManager) {
            fM.m2254(powerManager, "");
            m3374(powerManager);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private final String m3367() {
            if (Build.VERSION.SDK_INT < 23) {
                return " NO-DOZE-FEATURE ";
            }
            PowerManager r1 = m3370();
            return (r1 == null || true != r1.isDeviceIdleMode()) ? " NOT-IDLE " : " IDLE ";
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m3368(String str, String str2) {
            fM.m2254(str, "");
            fM.m2254(str2, "");
            C0215 r0 = this;
            if (r0.m3366()) {
                Log.d(str, r0.m3367() + str2);
                lD lDVar = lD.f2736;
                lDVar.m3385(str, r0.m3367() + str2);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m3373(String str, String str2, Throwable th) {
            fM.m2254(str, "");
            fM.m2254(str2, "");
            C0215 r0 = this;
            if (r0.m3366()) {
                Log.d(str, r0.m3367() + str2, th);
                lD lDVar = lD.f2736;
                lDVar.m3385(str, r0.m3367() + str2);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m3372(String str, String str2) {
            fM.m2254(str, "");
            fM.m2254(str2, "");
            C0215 r0 = this;
            if (r0.m3366()) {
                Log.w(str, r0.m3367() + str2);
                lD lDVar = lD.f2736;
                lDVar.m3384(str, r0.m3367() + str2);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m3369(String str, String str2) {
            fM.m2254(str, "");
            fM.m2254(str2, "");
            C0215 r0 = this;
            if (r0.m3366()) {
                Log.i(str, r0.m3367() + str2);
                lD lDVar = lD.f2736;
                lDVar.m3387(str, r0.m3367() + str2);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m3375(String str, String str2) {
            fM.m2254(str, "");
            fM.m2254(str2, "");
            C0215 r0 = this;
            if (r0.m3366()) {
                Log.e(str, r0.m3367() + str2);
                lD lDVar = lD.f2736;
                lDVar.m3386(str, r0.m3367() + str2);
            }
        }
    }
}
