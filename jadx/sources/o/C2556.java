package o;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import o.C0288;
import o.C1190;

/* renamed from: o.ѕӀ  reason: contains not printable characters */
public final class C2556 extends C1202<C2694> implements C2879 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Integer f11658;

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean f11659;

    /* renamed from: І  reason: contains not printable characters */
    private final C1273 f11660;

    /* renamed from: і  reason: contains not printable characters */
    private final Bundle f11661;

    private C2556(Context context, Looper looper, C1273 r10, Bundle bundle, C0288.C0290 r12, C0288.C0289 r13) {
        super(context, looper, 44, r10, r12, r13);
        this.f11659 = true;
        this.f11660 = r10;
        this.f11661 = bundle;
        this.f11658 = r10.f7179;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m13627() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m13631() {
        return C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final String m13632() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m13625() {
        return this.f11659;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13626(C2731 r5) {
        Account account;
        if (r5 != null) {
            try {
                C1273 r0 = this.f11660;
                if (r0.f7182 != null) {
                    account = r0.f7182;
                } else {
                    account = new Account("<<default account>>", "com.google");
                }
                GoogleSignInAccount googleSignInAccount = null;
                if ("<<default account>>".equals(account.name)) {
                    C2810 r1 = C2810.m14722(m7775());
                    googleSignInAccount = r1.m14723(r1.m14724("defaultGoogleSignInAccount"));
                }
                ((C2694) m7768()).m14298(new C2821(new C1415(account, this.f11658.intValue(), googleSignInAccount)), r5);
            } catch (RemoteException e) {
                try {
                    r5.m14472(new C2765(8));
                } catch (RemoteException unused) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                }
            }
        } else {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
    }

    /* renamed from: ʟ  reason: contains not printable characters */
    public final Bundle m13629() {
        if (!m7775().getPackageName().equals(this.f11660.f7185)) {
            this.f11661.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f11660.f7185);
        }
        return this.f11661;
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    public final void m13628() {
        m7765((C1190.C3638If) new C1190.C1192());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ IInterface m13630(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C2694) {
            return (C2694) queryLocalInterface;
        }
        return new C2808(iBinder);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2556(android.content.Context r8, android.os.Looper r9, boolean r10, o.C1273 r11, o.C2562 r12, o.C0288.C0290 r13, o.C0288.C0289 r14) {
        /*
            r7 = this;
            o.іŧ r10 = r11.f7181
            java.lang.Integer r12 = r11.f7179
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            android.accounts.Account r0 = r11.f7182
            java.lang.String r1 = "com.google.android.gms.signin.internal.clientRequestedAccount"
            r4.putParcelable(r1, r0)
            if (r12 == 0) goto L_0x001b
            int r12 = r12.intValue()
            java.lang.String r0 = "com.google.android.gms.common.internal.ClientSettings.sessionId"
            r4.putInt(r0, r12)
        L_0x001b:
            if (r10 == 0) goto L_0x0048
            r10 = 0
            java.lang.String r12 = "com.google.android.gms.signin.internal.offlineAccessRequested"
            r4.putBoolean(r12, r10)
            java.lang.String r12 = "com.google.android.gms.signin.internal.idTokenRequested"
            r4.putBoolean(r12, r10)
            r12 = 0
            java.lang.String r0 = "com.google.android.gms.signin.internal.serverClientId"
            r4.putString(r0, r12)
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.signin.internal.usePromptModeForAuthCode"
            r4.putBoolean(r1, r0)
            java.lang.String r0 = "com.google.android.gms.signin.internal.forceCodeForRefreshToken"
            r4.putBoolean(r0, r10)
            java.lang.String r0 = "com.google.android.gms.signin.internal.hostedDomain"
            r4.putString(r0, r12)
            java.lang.String r0 = "com.google.android.gms.signin.internal.logSessionId"
            r4.putString(r0, r12)
            java.lang.String r12 = "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"
            r4.putBoolean(r12, r10)
        L_0x0048:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2556.<init>(android.content.Context, android.os.Looper, boolean, o.ɩʌ, o.іŧ, o.ıĿ$ɩ, o.ıĿ$ı):void");
    }
}
