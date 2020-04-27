package o;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.C2219;

/* renamed from: o.ւł  reason: contains not printable characters */
public abstract class C3190<ResultT, CallbackT> implements C2507<C2972, ResultT> {

    /* renamed from: ı  reason: contains not printable characters */
    protected final int f14509;

    /* renamed from: ł  reason: contains not printable characters */
    boolean f14510;

    /* renamed from: Ɩ  reason: contains not printable characters */
    protected Executor f14511;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C3178 f14512 = new C3178(this);

    /* renamed from: ȷ  reason: contains not printable characters */
    protected boolean f14513;

    /* renamed from: ɨ  reason: contains not printable characters */
    protected C1220 f14514;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected FirebaseApp f14515;

    /* renamed from: ɪ  reason: contains not printable characters */
    protected C1970 f14516;

    /* renamed from: ɹ  reason: contains not printable characters */
    protected final List<C2219.C2220> f14517 = new ArrayList();

    /* renamed from: ɾ  reason: contains not printable characters */
    protected C1314 f14518;

    /* renamed from: ɿ  reason: contains not printable characters */
    private Activity f14519;

    /* renamed from: Ι  reason: contains not printable characters */
    protected C2164 f14520;

    /* renamed from: ι  reason: contains not printable characters */
    protected CallbackT f14521;

    /* renamed from: І  reason: contains not printable characters */
    protected C1383 f14522;

    /* renamed from: і  reason: contains not printable characters */
    protected C0631 f14523;

    /* renamed from: Ӏ  reason: contains not printable characters */
    protected C3176<ResultT> f14524;

    /* renamed from: ӏ  reason: contains not printable characters */
    protected boolean f14525;

    public C3190(int i) {
        this.f14509 = i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m16119();

    /* renamed from: o.ւł$if  reason: invalid class name */
    static class Cif extends LifecycleCallback {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final List<C2219.C2220> f14526;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static void m16123(Activity activity, List<C2219.C2220> list) {
            C0485 r2 = m766(activity);
            if (((Cif) r2.m4845("PhoneAuthActivityStopCallback", Cif.class)) == null) {
                new Cif(r2, list);
            }
        }

        private Cif(C0485 r2, List<C2219.C2220> list) {
            super(r2);
            this.f555.m4844("PhoneAuthActivityStopCallback", this);
            this.f14526 = list;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m16124() {
            synchronized (this.f14526) {
                this.f14526.clear();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3190<ResultT, CallbackT> m16116(FirebaseApp firebaseApp) {
        if (firebaseApp != null) {
            this.f14515 = firebaseApp;
            return this;
        }
        throw new NullPointerException("firebaseApp cannot be null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3190<ResultT, CallbackT> m16118(C2164 r2) {
        if (r2 != null) {
            this.f14520 = r2;
            return this;
        }
        throw new NullPointerException("firebaseUser cannot be null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3190<ResultT, CallbackT> m16117(CallbackT callbackt) {
        if (callbackt != null) {
            this.f14521 = callbackt;
            return this;
        }
        throw new NullPointerException("external callback cannot be null");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C3190<ResultT, CallbackT> m16114(C0631 r2) {
        if (r2 != null) {
            this.f14523 = r2;
            return this;
        }
        throw new NullPointerException("external failure callback cannot be null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3190<ResultT, CallbackT> m16120(C2219.C2220 r3, Activity activity, Executor executor) {
        synchronized (this.f14517) {
            List<C2219.C2220> list = this.f14517;
            if (r3 != null) {
                list.add(r3);
            } else {
                throw new NullPointerException("null reference");
            }
        }
        this.f14519 = activity;
        if (this.f14519 != null) {
            Cif.m16123(activity, this.f14517);
        }
        if (executor != null) {
            this.f14511 = executor;
            return this;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C2507<C2972, ResultT> m16113() {
        this.f14525 = true;
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2507<C2972, ResultT> m16121() {
        this.f14513 = true;
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m16122(ResultT resultt) {
        this.f14510 = true;
        this.f14524.m16029(resultt, (Status) null);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m16115(Status status) {
        this.f14510 = true;
        this.f14524.m16029(null, status);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m16112(C3190 r0, Status status) {
        C0631 r02 = r0.f14523;
        if (r02 != null) {
            r02.m5374(status);
        }
    }
}
