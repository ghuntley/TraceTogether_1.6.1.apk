package o;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import o.C0288;
import o.C0506;
import o.C1273;
import o.C2745;
import o.C3024;
import o.C3024.Cif;

/* renamed from: o.ıɫ  reason: contains not printable characters */
public class C0339<O extends C3024.Cif> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0475<O> f3709;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0288 f3710;

    /* renamed from: ǃ  reason: contains not printable characters */
    protected final C0506 f3711;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final O f3712;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int f3713;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f3714;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3024<O> f3715;

    /* renamed from: І  reason: contains not printable characters */
    private final C0539 f3716;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Looper f3717;

    /* renamed from: o.ıɫ$ǃ  reason: contains not printable characters */
    public static class C0340 {

        /* renamed from: ı  reason: contains not printable characters */
        public final C0539 f3718;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Looper f3719;

        private C0340(C0539 r1, Looper looper, byte b) {
            this.f3718 = r1;
            this.f3719 = looper;
        }

        /* renamed from: o.ıɫ$ǃ$ı  reason: contains not printable characters */
        public static class C0341 {

            /* renamed from: ǃ  reason: contains not printable characters */
            private Looper f3720;

            /* renamed from: ɩ  reason: contains not printable characters */
            private C0539 f3721;

            /* renamed from: ι  reason: contains not printable characters */
            public final C0341 m4471(C0539 r2) {
                if (r2 != null) {
                    this.f3721 = r2;
                    return this;
                }
                throw new NullPointerException("StatusExceptionMapper must not be null.");
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final C0340 m4470() {
                if (this.f3721 == null) {
                    this.f3721 = new C2887();
                }
                if (this.f3720 == null) {
                    this.f3720 = Looper.getMainLooper();
                }
                return new C0340(this.f3721, this.f3720);
            }
        }

        /* synthetic */ C0340(C0539 r2, Looper looper) {
            this(r2, looper, (byte) 0);
        }

        static {
            new C0341().m4470();
        }
    }

    public C0339(Context context, C3024<O> r3, O o2, C0340 r5) {
        C2745.C2746.m14559(context, "Null context is not permitted.");
        C2745.C2746.m14559(r3, "Api must not be null.");
        C2745.C2746.m14559(r5, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f3714 = context.getApplicationContext();
        this.f3715 = r3;
        this.f3712 = o2;
        this.f3717 = r5.f3719;
        this.f3709 = C0475.m4807(this.f3715, this.f3712);
        this.f3710 = new C0703(this);
        this.f3711 = C0506.m4911(this.f3714);
        this.f3713 = this.f3711.m4917();
        this.f3716 = r5.f3718;
        this.f3711.m4912((C0339<?>) this);
    }

    @Deprecated
    public C0339(Context context, C3024<O> r3, O o2, C0539 r5) {
        this(context, r3, o2, new C0340.C0341().m4471(r5).m4470());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final <TResult, A extends C3024.C3028> C0329<TResult> m4461(int i, C0661<A, TResult> r9) {
        C3203 r6 = new C3203();
        this.f3711.m4915(this, i, r9, r6, this.f3716);
        return r6.m16152();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public <TResult, A extends C3024.C3028> C0329<TResult> m4462(C0661<A, TResult> r2) {
        return m4461(0, r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public <TResult, A extends C3024.C3028> C0329<TResult> m4468(C0661<A, TResult> r2) {
        return m4461(1, r2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C3024.C3030 m4466(Looper looper, C0506.C0507<O> r10) {
        return this.f3715.m15473().m15479(this.f3714, looper, m4463().m8182(), this.f3712, (C0288.C0290) r10, (C0288.C0289) r10);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public O m4469() {
        return this.f3712;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0475<O> m4464() {
        return this.f3709;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m4467() {
        return this.f3713;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public C1273.C1274 m4463() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount r1;
        GoogleSignInAccount r12;
        C1273.C1274 r0 = new C1273.C1274();
        O o2 = this.f3712;
        if (!(o2 instanceof C3024.Cif.Cif) || (r12 = ((C3024.Cif.Cif) o2).m15477()) == null) {
            O o3 = this.f3712;
            account = o3 instanceof C3024.Cif.C3025 ? ((C3024.Cif.C3025) o3).m15478() : null;
        } else {
            account = r12.m744();
        }
        C1273.C1274 r02 = r0.m8183(account);
        O o4 = this.f3712;
        if (!(o4 instanceof C3024.Cif.Cif) || (r1 = ((C3024.Cif.Cif) o4).m15477()) == null) {
            set = Collections.emptySet();
        } else {
            set = r1.m743();
        }
        return r02.m8184((Collection<Scope>) set).m8181(this.f3714.getClass().getName()).m8185(this.f3714.getPackageName());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0812 m4465(Context context, Handler handler) {
        return new C0812(context, handler, m4463().m8182());
    }
}
