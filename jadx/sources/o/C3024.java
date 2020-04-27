package o;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import o.C0288;
import o.C1190;
import o.C3024.Cif;

/* renamed from: o.Լ  reason: contains not printable characters */
public final class C3024<O extends Cif> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3026<?, O> f13927;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f13928;

    /* renamed from: o.Լ$If */
    public static abstract class If<T extends C3028, O> {
    }

    /* renamed from: o.Լ$iF  reason: case insensitive filesystem */
    public interface C3661iF<T extends IInterface> extends C3028 {
        /* renamed from: ǃ  reason: contains not printable characters */
        T m15474();

        /* renamed from: ɩ  reason: contains not printable characters */
        String m15475();

        /* renamed from: ι  reason: contains not printable characters */
        String m15476();
    }

    /* renamed from: o.Լ$if  reason: invalid class name */
    public interface Cif {

        /* renamed from: o.Լ$if$if  reason: invalid class name */
        public interface Cif extends C3132 {
            /* renamed from: ι  reason: contains not printable characters */
            GoogleSignInAccount m15477();
        }

        /* renamed from: o.Լ$if$ǃ  reason: contains not printable characters */
        public interface C3025 extends C3132, C0287 {
            /* renamed from: ι  reason: contains not printable characters */
            Account m15478();
        }
    }

    /* renamed from: o.Լ$ı  reason: contains not printable characters */
    public static abstract class C3026<T extends C3030, O> extends If<T, O> {
        @Deprecated
        /* renamed from: ǃ  reason: contains not printable characters */
        public T m15479(Context context, Looper looper, C1273 r3, O o2, C0288.C0290 r5, C0288.C0289 r6) {
            return m15480(context, looper, r3, o2, (C0484) r5, (C0586) r6);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public T m15480(Context context, Looper looper, C1273 r3, O o2, C0484 r5, C0586 r6) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: o.Լ$ǃ  reason: contains not printable characters */
    public static class C3027<C extends C3028> {
    }

    /* renamed from: o.Լ$ɩ  reason: contains not printable characters */
    public interface C3028 {
    }

    /* renamed from: o.Լ$Ι  reason: contains not printable characters */
    public static final class C3029<C extends C3030> extends C3027<C> {
    }

    /* renamed from: o.Լ$ι  reason: contains not printable characters */
    public interface C3030 extends C3028 {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m15481();

        /* renamed from: Ɩ  reason: contains not printable characters */
        C2847[] m15482();

        /* renamed from: ǃ  reason: contains not printable characters */
        void m15483();

        /* renamed from: ǃ  reason: contains not printable characters */
        void m15484(C1190.C3638If ifR);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m15485(C1190.Cif ifVar);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m15486(C1304 r1, Set<Scope> set);

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m15487();

        /* renamed from: Ι  reason: contains not printable characters */
        boolean m15488();

        /* renamed from: ι  reason: contains not printable characters */
        boolean m15489();

        /* renamed from: І  reason: contains not printable characters */
        Set<Scope> m15490();

        /* renamed from: і  reason: contains not printable characters */
        String m15491();

        /* renamed from: Ӏ  reason: contains not printable characters */
        int m15492();
    }

    public <C extends C3030> C3024(String str, C3026<C, O> r2, C3029<C> r3) {
        if (r2 == null) {
            throw new NullPointerException("Cannot construct an Api with a null ClientBuilder");
        } else if (r3 != null) {
            this.f13928 = str;
            this.f13927 = r2;
        } else {
            throw new NullPointerException("Cannot construct an Api with a null ClientKey");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3026<?, O> m15473() {
        if (this.f13927 != null) {
            return this.f13927;
        }
        throw new IllegalStateException("This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
    }
}
