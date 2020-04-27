package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C2219;
import o.C2613;
import o.C2745;
import o.lA;
import sg.gov.tech.bluetrace.idmanager.TempIDManager;
import sg.gov.tech.bluetrace.onboarding.OTPFragment;
import sg.gov.tech.bluetrace.onboarding.OnboardingFragmentInterface;
import sg.gov.tech.bluetrace.onboarding.RegisterNumberFragment;
import sg.gov.tech.bluetrace.onboarding.SetupCompleteFragment;
import sg.gov.tech.bluetrace.onboarding.SetupFragment;
import sg.gov.tech.bluetrace.onboarding.TOUFragment;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020E2\u00020F2\u00020G2\u00020H2\u00020I2\u00020J:\u0001\u0004B\u0007¢\u0006\u0004\bD\u0010/J\u0019\u0010\u001c\u001a\u00020.2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001c\u0010)J\r\u0010\b\u001a\u00020.¢\u0006\u0004\b\b\u0010/J\r\u0010\u000e\u001a\u00020.¢\u0006\u0004\b\u000e\u0010/J\u000f\u0010\u001f\u001a\u00020.H\u0002¢\u0006\u0004\b\u001f\u0010/J\r\u0010\u0004\u001a\u00020.¢\u0006\u0004\b\u0004\u0010/J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b'\u00102J\r\u0010\u0015\u001a\u00020.¢\u0006\u0004\b\u0015\u0010/J\u0015\u0010\b\u001a\u00020.2\u0006\u0010\u0010\u001a\u000203¢\u0006\u0004\b\b\u00104J\r\u0010\u0002\u001a\u00020.¢\u0006\u0004\b\u0002\u0010/J\r\u0010\u001c\u001a\u00020.¢\u0006\u0004\b\u001c\u0010/J)\u00108\u001a\u00020.2\u0006\u0010\u0010\u001a\u0002032\u0006\u00105\u001a\u0002032\b\u00107\u001a\u0004\u0018\u000106H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020.H\u0016¢\u0006\u0004\b:\u0010/J\u0019\u0010<\u001a\u00020.2\b\u0010\u0010\u001a\u0004\u0018\u00010;H\u0014¢\u0006\u0004\b<\u0010=J/\u0010@\u001a\u00020.2\u0006\u0010\u0010\u001a\u0002032\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010>2\u0006\u00107\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020.H\u0014¢\u0006\u0004\bB\u0010/J\u0015\u0010\u000e\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010)J\u0015\u0010\u0015\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010)J\u000f\u0010C\u001a\u00020.H\u0007¢\u0006\u0004\bC\u0010/J\u0017\u0010\b\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u001f\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010)J\u0015\u0010\b\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010)J\u0015\u0010\u0004\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010)J\u0015\u0010\u0002\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010)R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001f\u0010\u000e\u001a\u0004\u0018\u00010\t8C@\u0002X\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR+\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8C@CX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00198\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u001c\u0010\u001f\u001a\b\u0018\u00010\u001dR\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010\u0011\u001a\u00020 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R+\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020#8C@CX\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b\u0006\u0010%\"\u0004\b\u0004\u0010&R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R+\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018C@CX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b\u0011\u0010(\"\u0004\b\u0013\u0010)R\u0016\u0010!\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u001a\u0010-\u001a\u00020\u0005*\u00020\t8C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010,"}, d2 = {"Lo/lk;", "", "ǃ", "Ljava/lang/String;", "ı", "", "І", "Z", "Ι", "Landroid/bluetooth/BluetoothAdapter;", "ł", "Lo/dj;", "ɪ", "()Landroid/bluetooth/BluetoothAdapter;", "ɩ", "Lo/Іπ;", "p0", "ɹ", "Lo/gh;", "і", "()Lo/Іπ;", "ι", "(Lo/Іπ;)V", "Lo/ıӿ;", "Lo/ıӿ;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "ӏ", "Ӏ", "Lo/lk$ı;", "Lo/lk$ı;", "Ɩ", "Lo/lk$if;", "ȷ", "Lo/lk$if;", "Lo/ІƐ$ǃ;", "ɨ", "()Lo/ІƐ$ǃ;", "(Lo/ІƐ$ǃ;)V", "ɾ", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "Lo/mn;", "Lo/mn;", "(Landroid/bluetooth/BluetoothAdapter;)Z", "г", "", "()V", "Lo/ıə;", "Lo/ƚյ;", "()Lo/ıə;", "", "(I)V", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onResume", "setupPermissionsAndSettings", "<init>", "Lo/ɩɿ;", "Lsg/gov/tech/bluetrace/onboarding/SetupFragment$ɩ;", "Lsg/gov/tech/bluetrace/onboarding/SetupCompleteFragment$ǃ;", "Lsg/gov/tech/bluetrace/onboarding/RegisterNumberFragment$If;", "Lsg/gov/tech/bluetrace/onboarding/OTPFragment$ı;", "Lsg/gov/tech/bluetrace/onboarding/TOUFragment$ɩ;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.lk  reason: case insensitive filesystem */
public final class C3570lk extends C1269 implements SetupFragment.C3229, SetupCompleteFragment.C3228, RegisterNumberFragment.If, OTPFragment.C3222, TOUFragment.C3231 {

    /* renamed from: Ι  reason: contains not printable characters */
    static final /* synthetic */ C3444gs[] f2885;

    /* renamed from: ı  reason: contains not printable characters */
    private FrameLayout f2886;

    /* renamed from: ł  reason: contains not printable characters */
    private final C3357dj f2887;
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public boolean f2888;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public String f2889 = "OnboardingActivity";

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Cif f2890;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C3433gh f2891;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0223 f2892;
    /* access modifiers changed from: private */

    /* renamed from: ɪ  reason: contains not printable characters */
    public boolean f2893;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C3433gh f2894;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C3433gh f2895;

    /* renamed from: ι  reason: contains not printable characters */
    private C3601mn f2896;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f2897;
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public final C0452 f2898;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public boolean f2899;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f2900;

    static {
        Class<C3570lk> cls = C3570lk.class;
        f2885 = new C3444gs[]{C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "credential", "getCredential()Lcom/google/firebase/auth/PhoneAuthCredential;")), C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "verificationId", "getVerificationId()Ljava/lang/String;")), C3428gc.m2390((fQ) new fS(C3428gc.m2389((Class) cls), "resendToken", "getResendToken()Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;")), C3428gc.m2386((fV) new fT(C3428gc.m2389((Class) cls), "bluetoothAdapter", "getBluetoothAdapter()Landroid/bluetooth/BluetoothAdapter;"))};
    }

    /* access modifiers changed from: private */
    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final void m3562(C2219.C2221 r4) {
        this.f2891.m2404(this, f2885[2], r4);
    }

    @JvmName(name = "ɪ")
    /* renamed from: ɪ  reason: contains not printable characters */
    private final BluetoothAdapter m3570() {
        C3357dj djVar = this.f2887;
        C3444gs gsVar = f2885[3];
        return (BluetoothAdapter) djVar.m2098();
    }

    @JvmName(name = "ɹ")
    /* renamed from: ɹ  reason: contains not printable characters */
    private final String m3571() {
        return (String) this.f2895.m2405(this, f2885[1]);
    }

    /* access modifiers changed from: private */
    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final void m3581(C2288 r4) {
        this.f2894.m2404(this, f2885[0], r4);
    }

    @JvmName(name = "І")
    /* renamed from: І  reason: contains not printable characters */
    private final C2219.C2221 m3582() {
        return (C2219.C2221) this.f2891.m2405(this, f2885[2]);
    }

    /* access modifiers changed from: private */
    @JvmName(name = "і")
    /* renamed from: і  reason: contains not printable characters */
    public final C2288 m3583() {
        return (C2288) this.f2894.m2405(this, f2885[0]);
    }

    /* access modifiers changed from: private */
    @JvmName(name = "і")
    /* renamed from: і  reason: contains not printable characters */
    public final void m3585(String str) {
        this.f2895.m2404(this, f2885[1], str);
    }

    public C3570lk() {
        C0452 r0 = C0452.m4766("asia-east2");
        fM.m2252((Object) r0, "");
        this.f2898 = r0;
        this.f2894 = fY.f2174.m2283();
        this.f2895 = fY.f2174.m2283();
        this.f2891 = fY.f2174.m2283();
        this.f2890 = new Cif(this);
        this.f2887 = C3360dn.m2105(C3361dp.NONE, new C3409fk<BluetoothAdapter>(this) {

            /* renamed from: ı  reason: contains not printable characters */
            final /* synthetic */ C3570lk f2905;

            {
                this.f2905 = r1;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final BluetoothAdapter invoke() {
                Object systemService = this.f2905.getSystemService("bluetooth");
                if (systemService != null) {
                    return ((BluetoothManager) systemService).getAdapter();
                }
                throw new dA("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            }
        });
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final /* synthetic */ FrameLayout m3564(C3570lk lkVar) {
        FrameLayout frameLayout = lkVar.f2886;
        if (frameLayout == null) {
            fM.m2253("loadingProgressBarFrame");
        }
        return frameLayout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\rJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0006\u0010\f"}, d2 = {"Lo/lk$if;", "", "p0", "Lo/ІƐ$ǃ;", "p1", "", "ǃ", "(Ljava/lang/String;Lo/ІƐ$ǃ;)V", "Lo/Іπ;", "ı", "(Lo/Іπ;)V", "Lo/ʀι;", "(Lo/ʀι;)V", "Lo/ІƐ$ı;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lk$if  reason: invalid class name */
    public static final class Cif extends C2219.C2220 {

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ C3570lk f2910;

        Cif(C3570lk lkVar) {
            this.f2910 = lkVar;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m3605(C2288 r5) {
            fM.m2254(r5, "");
            lA.C0215 r0 = lA.f2728;
            String r1 = this.f2910.f2889;
            r0.m3368(r1, "onVerificationCompleted: " + r5);
            this.f2910.m3581(r5);
            C3570lk lkVar = this.f2910;
            lkVar.m3576(lkVar.m3583());
            this.f2910.f2888 = true;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3607(C1590 r6) {
            fM.m2254(r6, "");
            if (r6 instanceof C2068) {
                lA.f2728.m3373(this.f2910.f2889, "FirebaseAuthInvalidCredentialsException", r6);
                C3570lk lkVar = this.f2910;
                String string = lkVar.getString(R.string.f170882131886203);
                fM.m2252((Object) string, "");
                lkVar.m3589(string);
            } else if (r6 instanceof C1801) {
                lA.f2728.m3373(this.f2910.f2889, "FirebaseTooManyRequestsException", r6);
                C3570lk lkVar2 = this.f2910;
                lkVar2.m3586(lkVar2.getString(R.string.f171562131886340));
            }
            this.f2910.m3563();
            lA.C0215 r0 = lA.f2728;
            String r1 = this.f2910.f2889;
            r0.m3368(r1, "On Verification failure: " + r6.getMessage());
            C3570lk.m3564(this.f2910).setVisibility(8);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m3606(String str, C2219.C2221 r5) {
            fM.m2254(str, "");
            fM.m2254(r5, "");
            this.f2910.m3585(str);
            this.f2910.m3562(r5);
            lA.C0215 r52 = lA.f2728;
            String r0 = this.f2910.f2889;
            r52.m3368(r0, "onCodeSent: " + str);
            if (this.f2910.f2899) {
                C3570lk.m3564(this.f2910).setVisibility(8);
            } else {
                this.f2910.m3591();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m3563() {
        OnboardingFragmentInterface onboardingFragmentInterface;
        C0223 r0 = this.f2892;
        if (r0 != null) {
            C3601mn mnVar = this.f2896;
            if (mnVar == null) {
                fM.m2253("viewPager");
            }
            onboardingFragmentInterface = r0.m3609(mnVar.m13865());
        } else {
            onboardingFragmentInterface = null;
        }
        if (onboardingFragmentInterface != null) {
            onboardingFragmentInterface.m16246();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m3586(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str).setCancelable(false).setPositiveButton(getString(R.string.f170992131886251), AnonymousClass4.f2906);
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3576(C2288 r3) {
        FirebaseAuth.getInstance().m1094((C1970) r3).m4417((Activity) this, new C3149<C1979>(this) {

            /* renamed from: ɩ  reason: contains not printable characters */
            final /* synthetic */ C3570lk f2909;

            {
                this.f2909 = r1;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m3604(C0329<C1979> r6) {
                fM.m2254(r6, "");
                if (r6.m4421()) {
                    lA.f2728.m3368(this.f2909.f2889, "signInWithCredential:success");
                    C1979 r62 = r6.m4401();
                    C2164 r63 = r62 != null ? r62.m10766() : null;
                    if (r63 != null) {
                        C3577lt.f2990.m3686(r63.m11461(), "");
                    }
                    if (lR.f2769.m3507() != null) {
                        TempIDManager tempIDManager = TempIDManager.INSTANCE;
                        Context applicationContext = this.f2909.getApplicationContext();
                        fM.m2252((Object) applicationContext, "");
                        if (!tempIDManager.needToUpdate(applicationContext)) {
                            return;
                        }
                    }
                    C0329 unused = this.f2909.m3573();
                    return;
                }
                lA.f2728.m3373(this.f2909.f2889, "signInWithCredential:failure", r6.m4406());
                if (r6.m4406() instanceof C2068) {
                    C3570lk.m3564(this.f2909).setVisibility(8);
                    C3570lk lkVar = this.f2909;
                    String string = lkVar.getString(R.string.f170892131886204);
                    fM.m2252((Object) string, "");
                    lkVar.m3590(string);
                } else if (r6.m4406() instanceof C2045) {
                    C3570lk lkVar2 = this.f2909;
                    lkVar2.m3586(lkVar2.getString(R.string.f170912131886206));
                }
                C3570lk.m3564(this.f2909).setVisibility(8);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: ɾ  reason: contains not printable characters */
    public final C0329<C0757> m3573() {
        C0329<C0757> r0 = TempIDManager.INSTANCE.getTemporaryIDs(this, this.f2898).m4409(new C3149<C0757>(this) {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ C3570lk f2903;

            {
                this.f2903 = r1;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m3601(C0329<C0757> r10) {
                fM.m2254(r10, "");
                lA.f2728.m3368(this.f2903.f2889, "retrieved bm successfully");
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                C3570lk lkVar = this.f2903;
                Context context = lkVar;
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = lkVar.f2898;
                    objArr[0] = context;
                    ((C0329) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Context.class, C0452.class}).invoke(obj, objArr)).m4409(new C3149<C0757>(this) {

                        /* renamed from: Ι  reason: contains not printable characters */
                        final /* synthetic */ AnonymousClass2 f2904;

                        {
                            this.f2904 = r1;
                        }

                        /* renamed from: ǃ  reason: contains not printable characters */
                        public final void m3602(C0329<C0757> r6) {
                            fM.m2254(r6, "");
                            if (r6.m4421()) {
                                lA.f2728.m3368(this.f2904.f2903.f2889, "its completed handshake");
                                this.f2904.f2903.m3591();
                                return;
                            }
                            lA.C0215 r1 = lA.f2728;
                            String r2 = this.f2904.f2903.f2889;
                            StringBuilder sb = new StringBuilder();
                            sb.append("getHandShakePin failed ");
                            Exception r62 = r6.m4406();
                            sb.append(r62 != null ? r62.getMessage() : null);
                            r1.m3375(r2, sb.toString());
                            C3570lk lkVar = this.f2904.f2903;
                            String string = this.f2904.f2903.getString(R.string.f171602131886353);
                            fM.m2252((Object) string, "");
                            lkVar.m3590(string);
                            C3570lk.m3564(this.f2904.f2903).setVisibility(8);
                        }
                    });
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        });
        fM.m2252((Object) r0, "");
        return r0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f168882131558429);
        View findViewById = findViewById(R.id.f166252131362197);
        fM.m2252((Object) findViewById, "");
        this.f2896 = (C3601mn) findViewById;
        View findViewById2 = findViewById(R.id.f165772131362130);
        fM.m2252((Object) findViewById2, "");
        this.f2886 = (FrameLayout) findViewById2;
        lA.C0215 r7 = lA.f2728;
        StringBuilder sb = new StringBuilder();
        sb.append("view pager: ");
        C3601mn mnVar = this.f2896;
        if (mnVar == null) {
            fM.m2253("viewPager");
        }
        sb.append(mnVar);
        r7.m3368("TESTING", sb.toString());
        C1550 supportFragmentManager = getSupportFragmentManager();
        fM.m2252((Object) supportFragmentManager, "");
        this.f2892 = new C0223(this, supportFragmentManager);
        C3601mn mnVar2 = this.f2896;
        if (mnVar2 == null) {
            fM.m2253("viewPager");
        }
        mnVar2.setAdapter(this.f2892);
        C0828 r72 = (C0828) findViewById(R.id.f167562131362363);
        C3601mn mnVar3 = this.f2896;
        if (mnVar3 == null) {
            fM.m2253("viewPager");
        }
        r72.setupWithViewPager(mnVar3, true);
        C3601mn mnVar4 = this.f2896;
        if (mnVar4 == null) {
            fM.m2253("viewPager");
        }
        mnVar4.m13867((C2613.C3648iF) new C0224(this));
        C3601mn mnVar5 = this.f2896;
        if (mnVar5 == null) {
            fM.m2253("viewPager");
        }
        mnVar5.setPagingEnabled(false);
        C3601mn mnVar6 = this.f2896;
        if (mnVar6 == null) {
            fM.m2253("viewPager");
        }
        mnVar6.setOffscreenPageLimit(5);
        Intent intent = getIntent();
        fM.m2252((Object) intent, "");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f2900 = true;
            m3596(extras.getInt("page", 0));
            return;
        }
        try {
            m3596(((Integer) ((Class) C3166.m16013(4, 8, 0)).getMethod("ı", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null), new Object[]{this})).intValue());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u000bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0005"}, d2 = {"Lo/lk$ɩ;", "", "p0", "", "ι", "(I)V", "", "p1", "p2", "ı", "(IFI)V", "Lo/јı$iF;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lk$ɩ  reason: contains not printable characters */
    public static final class C0224 implements C2613.C3648iF {

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ C3570lk f2913;

        C0224(C3570lk lkVar) {
            this.f2913 = lkVar;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m3614(int i) {
            lA.f2728.m3368(this.f2913.f2889, "OnPageScrollStateChanged");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m3613(int i, float f, int i2) {
            lA.f2728.m3368(this.f2913.f2889, "OnPageScrolled");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m3612(int i) {
            lA.C0215 r0 = lA.f2728;
            String r1 = this.f2913.f2889;
            r0.m3368(r1, "position: " + i);
            C0223 r02 = this.f2913.f2892;
            if (r02 == null) {
                fM.m2256();
            }
            r02.m3609(i).m16244();
            if (i == 0) {
                Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                Context baseContext = this.f2913.getBaseContext();
                fM.m2252((Object) baseContext, "");
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = Integer.valueOf(i);
                    objArr[0] = baseContext;
                    ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke(obj, objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else if (i == 1) {
            } else {
                if (i == 2) {
                    Object obj2 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                    Context baseContext2 = this.f2913.getBaseContext();
                    fM.m2252((Object) baseContext2, "");
                    try {
                        Object[] objArr2 = new Object[2];
                        objArr2[1] = Integer.valueOf(i);
                        objArr2[0] = baseContext2;
                        ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke(obj2, objArr2);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else if (i == 3) {
                    Object obj3 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                    Context baseContext3 = this.f2913.getBaseContext();
                    fM.m2252((Object) baseContext3, "");
                    try {
                        Object[] objArr3 = new Object[2];
                        objArr3[1] = Integer.valueOf(i);
                        objArr3[0] = baseContext3;
                        ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke(obj3, objArr3);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } else if (i == 4) {
                    Object obj4 = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
                    Context baseContext4 = this.f2913.getBaseContext();
                    fM.m2252((Object) baseContext4, "");
                    try {
                        Object[] objArr4 = new Object[2];
                        objArr4[1] = Integer.valueOf(i);
                        objArr4[0] = baseContext4;
                        ((Class) C3166.m16013(4, 8, 0)).getMethod("Ι", new Class[]{Context.class, Integer.TYPE}).invoke(obj4, objArr4);
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f2893) {
            new Handler().postDelayed(new Runnable(this) {

                /* renamed from: Ι  reason: contains not printable characters */
                final /* synthetic */ C3570lk f2902;

                {
                    this.f2902 = r1;
                }

                public final void run() {
                    this.f2902.setupPermissionsAndSettings();
                }
            }, 1000);
        }
    }

    public final void onBackPressed() {
        C3601mn mnVar = this.f2896;
        if (mnVar == null) {
            fM.m2253("viewPager");
        }
        if (mnVar.m13865() > 0) {
            C3601mn mnVar2 = this.f2896;
            if (mnVar2 == null) {
                fM.m2253("viewPager");
            }
            if (mnVar2.m13865() != 2) {
                m3600();
                return;
            }
        }
        super.onBackPressed();
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m3577(BluetoothAdapter bluetoothAdapter) {
        return !bluetoothAdapter.isEnabled();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3593() {
        lA.f2728.m3368(this.f2889, "[enableBluetooth]");
        BluetoothAdapter r0 = m3570();
        if (r0 == null) {
            return;
        }
        if (m3577(r0)) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), C2745.aux.f12792);
        } else {
            setupPermissionsAndSettings();
        }
    }

    @C3532ka(m3258 = 456)
    public final void setupPermissionsAndSettings() {
        lA.f2728.m3368(this.f2889, "[setupPermissionsAndSettings]");
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Object[] objArr = (Object[]) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", (Class[]) null).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), (Object[]) null);
                if (C3538kg.m3271(this, (String[]) Arrays.copyOf(objArr, objArr.length))) {
                    m3598();
                    m3588();
                    return;
                }
                C3538kg.m3264(this, getString(R.string.f171032131886260), 456, (String[]) Arrays.copyOf(objArr, objArr.length));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            m3598();
            m3591();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3598() {
        m3595();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3595() {
        lA.f2728.m3368(this.f2889, "[checkBLESupport] ");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        fM.m2252((Object) defaultAdapter, "");
        if (!defaultAdapter.isMultipleAdvertisementSupported()) {
            this.f2897 = false;
            try {
                ((Class) C3166.m16013(4, 12, 45444)).getMethod("ı", new Class[]{Context.class}).invoke(((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null), new Object[]{this});
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            this.f2897 = true;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3588() {
        Throwable cause;
        lA.f2728.m3368(this.f2889, "[excludeFromBatteryOptimization] ");
        Object systemService = getSystemService("power");
        if (systemService != null) {
            PowerManager powerManager = (PowerManager) systemService;
            String packageName = getPackageName();
            if (Build.VERSION.SDK_INT >= 23) {
                Object obj = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                fM.m2252((Object) packageName, "");
                try {
                    Intent intent = (Intent) ((Class) C3166.m16013(4, 12, 45444)).getMethod("ɩ", new Class[]{String.class}).invoke(obj, new Object[]{packageName});
                    if (!powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        lA.f2728.m3368(this.f2889, "Not on Battery Optimization whitelist");
                        Object obj2 = ((Class) C3166.m16013(4, 12, 45444)).getField("Ι").get((Object) null);
                        try {
                            Object[] objArr = new Object[2];
                            objArr[1] = getPackageManager();
                            objArr[0] = intent;
                            if (((Boolean) ((Class) C3166.m16013(4, 12, 45444)).getMethod("Ι", new Class[]{Intent.class, PackageManager.class}).invoke(obj2, objArr)).booleanValue()) {
                                startActivityForResult(intent, 789);
                            } else {
                                m3591();
                            }
                        } catch (Throwable th) {
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        lA.f2728.m3368(this.f2889, "On Battery Optimization whitelist");
                        m3591();
                    }
                } finally {
                    cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                }
            }
        } else {
            throw new dA("null cannot be cast to non-null type android.os.PowerManager");
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        lA.C0215 r0 = lA.f2728;
        String str = this.f2889;
        r0.m3368(str, "requestCode " + i + " resultCode " + i2);
        if (i == 123) {
            if (i2 == 0) {
                finish();
                return;
            }
            setupPermissionsAndSettings();
        } else if (i == 789 && i2 != 0) {
            new Handler().postDelayed(new Runnable(this) {

                /* renamed from: Ι  reason: contains not printable characters */
                final /* synthetic */ C3570lk f2907;

                {
                    this.f2907 = r1;
                }

                public final void run() {
                    this.f2907.m3591();
                }
            }, 1000);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        fM.m2254(strArr, "");
        fM.m2254(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        lA.C0215 r0 = lA.f2728;
        String str = this.f2889;
        r0.m3368(str, "[onRequestPermissionsResult] requestCode " + i);
        if (i == 456) {
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str2 = strArr[i2];
                if (iArr[i2] == -1) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (!shouldShowRequestPermissionRationale(str2)) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(this);
                            builder.setMessage(getString(R.string.f171002131886252)).setCancelable(false).setPositiveButton(getString(R.string.f170992131886251), new DialogInterface.OnClickListener(this) {

                                /* renamed from: Ι  reason: contains not printable characters */
                                final /* synthetic */ C3570lk f2901;

                                {
                                    this.f2901 = r1;
                                }

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    lA.f2728.m3368(this.f2901.f2889, "user also CHECKED never ask again");
                                    this.f2901.f2893 = true;
                                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                    intent.addFlags(268435456);
                                    Uri fromParts = Uri.fromParts("package", this.f2901.getPackageName(), (String) null);
                                    fM.m2252((Object) fromParts, "");
                                    intent.setData(fromParts);
                                    this.f2901.startActivity(intent);
                                }
                            }).setNegativeButton(getString(R.string.f170542131886143), AnonymousClass6.f2908);
                            builder.create().show();
                        } else if ("android.permission.WRITE_CONTACTS".equals(str2)) {
                            lA.f2728.m3368(this.f2889, "user did not CHECKED never ask again");
                        } else {
                            m3588();
                        }
                    }
                } else if (iArr[i2] == 0) {
                    m3588();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3591() {
        lA.f2728.m3368(this.f2889, "Navigating to next page");
        FrameLayout frameLayout = this.f2886;
        if (frameLayout == null) {
            fM.m2253("loadingProgressBarFrame");
        }
        frameLayout.setVisibility(8);
        if (!this.f2888) {
            C3601mn mnVar = this.f2896;
            if (mnVar == null) {
                fM.m2253("viewPager");
            }
            C3601mn mnVar2 = this.f2896;
            if (mnVar2 == null) {
                fM.m2253("viewPager");
            }
            mnVar.setCurrentItem(mnVar2.m13865() + 1);
            C0223 r0 = this.f2892;
            if (r0 == null) {
                fM.m2256();
            }
            r0.m14227();
            return;
        }
        C3601mn mnVar3 = this.f2896;
        if (mnVar3 == null) {
            fM.m2253("viewPager");
        }
        C3601mn mnVar4 = this.f2896;
        if (mnVar4 == null) {
            fM.m2253("viewPager");
        }
        mnVar3.setCurrentItem(mnVar4.m13865() + 2);
        C0223 r02 = this.f2892;
        if (r02 == null) {
            fM.m2256();
        }
        r02.m14227();
        this.f2888 = false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m3600() {
        lA.f2728.m3368(this.f2889, "Navigating to previous page");
        if (this.f2900) {
            C3601mn mnVar = this.f2896;
            if (mnVar == null) {
                fM.m2253("viewPager");
            }
            if (mnVar.m13865() >= 4) {
                C3601mn mnVar2 = this.f2896;
                if (mnVar2 == null) {
                    fM.m2253("viewPager");
                }
                C3601mn mnVar3 = this.f2896;
                if (mnVar3 == null) {
                    fM.m2253("viewPager");
                }
                mnVar2.setCurrentItem(mnVar3.m13865() - 1);
                C0223 r0 = this.f2892;
                if (r0 == null) {
                    fM.m2256();
                }
                r0.m14227();
                return;
            }
            finish();
            return;
        }
        C3601mn mnVar4 = this.f2896;
        if (mnVar4 == null) {
            fM.m2253("viewPager");
        }
        C3601mn mnVar5 = this.f2896;
        if (mnVar5 == null) {
            fM.m2253("viewPager");
        }
        mnVar4.setCurrentItem(mnVar5.m13865() - 1);
        C0223 r02 = this.f2892;
        if (r02 == null) {
            fM.m2256();
        }
        r02.m14227();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3596(int i) {
        lA.f2728.m3368(this.f2889, "Navigating to page");
        C3601mn mnVar = this.f2896;
        if (mnVar == null) {
            fM.m2253("viewPager");
        }
        mnVar.setCurrentItem(i);
        C0223 r4 = this.f2892;
        if (r4 == null) {
            fM.m2256();
        }
        r4.m14227();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3594(String str) {
        fM.m2254(str, "");
        FrameLayout frameLayout = this.f2886;
        if (frameLayout == null) {
            fM.m2253("loadingProgressBarFrame");
        }
        frameLayout.setVisibility(0);
        this.f2888 = false;
        this.f2899 = false;
        C2219.m11662().m11663(str, 60, TimeUnit.SECONDS, this, this.f2890);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3592(String str) {
        fM.m2254(str, "");
        if (TextUtils.isEmpty(str) || str.length() < 6) {
            String string = getString(R.string.f170972131886245);
            fM.m2252((Object) string, "");
            m3590(string);
            return;
        }
        FrameLayout frameLayout = this.f2886;
        if (frameLayout == null) {
            fM.m2253("loadingProgressBarFrame");
        }
        frameLayout.setVisibility(0);
        C2288 r4 = C2219.m11661(m3571(), str);
        fM.m2252((Object) r4, "");
        m3581(r4);
        m3576(m3583());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m3599(String str) {
        fM.m2254(str, "");
        FrameLayout frameLayout = this.f2886;
        if (frameLayout == null) {
            fM.m2253("loadingProgressBarFrame");
        }
        frameLayout.setVisibility(0);
        this.f2888 = false;
        this.f2899 = true;
        C2219.m11662().m11664(str, 60, TimeUnit.SECONDS, this, this.f2890, m3582());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3597(String str) {
        fM.m2254(str, "");
        C0223 r0 = this.f2892;
        if (r0 == null) {
            fM.m2256();
        }
        r0.m3609(1).m16252(str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m3589(String str) {
        fM.m2254(str, "");
        C0223 r0 = this.f2892;
        if (r0 == null) {
            fM.m2256();
        }
        r0.m3609(0).m16248(str);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m3590(String str) {
        fM.m2254(str, "");
        C0223 r0 = this.f2892;
        if (r0 == null) {
            fM.m2256();
        }
        r0.m3609(1).m16248(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020\u000fB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\tR!\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/lk$ı;", "", "", "Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;", "ι", "Ljava/util/Map;", "ı", "p0", "Ι", "(I)Lsg/gov/tech/bluetrace/onboarding/OnboardingFragmentInterface;", "ɩ", "()I", "Lo/ɾι;", "<init>", "(Lo/lk;Lo/ɾι;)V", "Lo/ʟɩ;"}, k = 1, mv = {1, 1, 16})
    /* renamed from: o.lk$ı  reason: contains not printable characters */
    final class C0223 extends C1683 {

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ C3570lk f2911;

        /* renamed from: ι  reason: contains not printable characters */
        public final Map<Integer, OnboardingFragmentInterface> f2912 = new HashMap();

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m3610() {
            return 5;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0223(C3570lk lkVar, C1550 r3) {
            super(r3);
            fM.m2254(r3, "");
            this.f2911 = lkVar;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final OnboardingFragmentInterface m3609(int i) {
            lA.C0215 r0 = lA.f2728;
            String r1 = this.f2911.f2889;
            r0.m3368(r1, "position " + i);
            Map<Integer, OnboardingFragmentInterface> map = this.f2912;
            Integer valueOf = Integer.valueOf(i);
            OnboardingFragmentInterface onboardingFragmentInterface = map.get(valueOf);
            if (onboardingFragmentInterface == null) {
                onboardingFragmentInterface = m3608(i);
                map.put(valueOf, onboardingFragmentInterface);
            }
            return onboardingFragmentInterface;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private final OnboardingFragmentInterface m3608(int i) {
            if (i == 0) {
                return new RegisterNumberFragment();
            }
            if (i == 1) {
                return new OTPFragment();
            }
            if (i == 2) {
                return new TOUFragment();
            }
            if (i == 3) {
                return new SetupFragment();
            }
            if (i != 4) {
                return new RegisterNumberFragment();
            }
            return new SetupCompleteFragment();
        }
    }
}
