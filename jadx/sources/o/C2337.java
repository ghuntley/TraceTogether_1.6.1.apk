package o;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ЈЈ  reason: contains not printable characters */
public final class C2337 extends C3067 {

    /* renamed from: ı  reason: contains not printable characters */
    private long f10831;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f10832;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Boolean f10833;

    /* renamed from: Ι  reason: contains not printable characters */
    private AccountManager f10834;

    /* renamed from: ι  reason: contains not printable characters */
    private Boolean f10835;

    /* renamed from: і  reason: contains not printable characters */
    private long f10836;

    C2337(C2658 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m12189() {
        Calendar instance = Calendar.getInstance();
        this.f10831 = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f10832 = sb.toString();
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m12187() {
        m15649();
        return this.f10831;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m12184() {
        m15649();
        return this.f10832;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m12188(Context context) {
        if (this.f10833 == null) {
            q_();
            this.f10833 = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f10833 = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f10833.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m12183() {
        y_();
        return this.f10836;
    }

    /* access modifiers changed from: package-private */
    public final void z_() {
        y_();
        this.f10835 = null;
        this.f10836 = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m12186() {
        y_();
        long r1 = w_().m10846();
        if (r1 - this.f10836 > 86400000) {
            this.f10835 = null;
        }
        Boolean bool = this.f10835;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0651.m5452(m15904(), "android.permission.GET_ACCOUNTS") != 0) {
            t_().m11716().m11606("Permission error checking for dasher/unicorn accounts");
            this.f10836 = r1;
            this.f10835 = false;
            return false;
        }
        if (this.f10834 == null) {
            this.f10834 = AccountManager.get(m15904());
        }
        try {
            Account[] result = this.f10834.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f10834.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f10835 = true;
                    this.f10836 = r1;
                    return true;
                }
                this.f10836 = r1;
                this.f10835 = false;
                return false;
            }
            this.f10835 = true;
            this.f10836 = r1;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            t_().m11718().m11603("Exception checking account types", e);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m12182() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m12191() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m12190() {
        super.m15902();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m12192() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m12185() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
