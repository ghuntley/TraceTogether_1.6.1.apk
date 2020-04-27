package o;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o.C2745;

/* renamed from: o.ƨɹ  reason: contains not printable characters */
public final class C0770<TResult> extends C0329<TResult> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0799<TResult> f5167 = new C0799<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object f5168 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    private TResult f5169;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Exception f5170;

    /* renamed from: Ι  reason: contains not printable characters */
    private volatile boolean f5171;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f5172;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m6080() {
        boolean z;
        synchronized (this.f5168) {
            z = this.f5172;
        }
        return z;
    }

    /* renamed from: o.ƨɹ$ɩ  reason: contains not printable characters */
    static class C0771 extends LifecycleCallback {

        /* renamed from: ι  reason: contains not printable characters */
        private final List<WeakReference<C0642<?>>> f5173 = new ArrayList();

        /* renamed from: Ι  reason: contains not printable characters */
        public static C0771 m6089(Activity activity) {
            C0485 r2 = m766(activity);
            C0771 r0 = (C0771) r2.m4845("TaskOnStopCallback", C0771.class);
            return r0 == null ? new C0771(r2) : r0;
        }

        private C0771(C0485 r2) {
            super(r2);
            this.f555.m4844("TaskOnStopCallback", this);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final <T> void m6090(C0642<T> r4) {
            synchronized (this.f5173) {
                this.f5173.add(new WeakReference(r4));
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m6091() {
            synchronized (this.f5173) {
                for (WeakReference<C0642<?>> weakReference : this.f5173) {
                    C0642 r2 = (C0642) weakReference.get();
                    if (r2 != null) {
                        r2.m5419();
                    }
                }
                this.f5173.clear();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m6067() {
        return this.f5171;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m6086() {
        boolean z;
        synchronized (this.f5168) {
            z = this.f5172 && !this.f5171 && this.f5170 == null;
        }
        return z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final TResult m6063() {
        TResult tresult;
        synchronized (this.f5168) {
            m6060();
            m6059();
            if (this.f5170 == null) {
                tresult = this.f5169;
            } else {
                throw new C3053(this.f5170);
            }
        }
        return tresult;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <X extends Throwable> TResult m6081(Class<X> cls) {
        TResult tresult;
        synchronized (this.f5168) {
            m6060();
            m6059();
            if (cls.isInstance(this.f5170)) {
                throw ((Throwable) cls.cast(this.f5170));
            } else if (this.f5170 == null) {
                tresult = this.f5169;
            } else {
                throw new C3053(this.f5170);
            }
        }
        return tresult;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Exception m6069() {
        Exception exc;
        synchronized (this.f5168) {
            exc = this.f5170;
        }
        return exc;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0329<TResult> m6085(C3153<? super TResult> r2) {
        return m4408(C0322.f3663, r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0329<TResult> m6071(Executor executor, C3153<? super TResult> r4) {
        this.f5167.m6177(new C0561(executor, r4));
        m6062();
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<TResult> m6078(C3191 r2) {
        return m4403(C0322.f3663, r2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0329<TResult> m6065(Executor executor, C3191 r4) {
        this.f5167.m6177(new C0449(executor, r4));
        m6062();
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0329<TResult> m6072(C3149<TResult> r2) {
        return m4407(C0322.f3663, r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0329<TResult> m6070(Executor executor, C3149<TResult> r4) {
        this.f5167.m6177(new C0407(executor, r4));
        m6062();
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0329<TResult> m6082(Activity activity, C3149<TResult> r4) {
        C0407 r0 = new C0407(C0322.f3663, r4);
        this.f5167.m6177(r0);
        C0771.m6089(activity).m6090(r0);
        m6062();
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <TContinuationResult> C0329<TContinuationResult> m6076(C2979<TResult, TContinuationResult> r2) {
        return m4418(C0322.f3663, r2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <TContinuationResult> C0329<TContinuationResult> m6083(Executor executor, C2979<TResult, TContinuationResult> r5) {
        C0770 r0 = new C0770();
        this.f5167.m6177(new C0355(executor, r5, r0));
        m6062();
        return r0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <TContinuationResult> C0329<TContinuationResult> m6084(C2979<TResult, C0329<TContinuationResult>> r2) {
        return m4404(C0322.f3663, r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<TResult> m6075(C2970 r2) {
        return m4402(C0322.f3663, r2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0329<TResult> m6064(Executor executor, C2970 r4) {
        this.f5167.m6177(new C0450(executor, r4));
        m6062();
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <TContinuationResult> C0329<TContinuationResult> m6066(Executor executor, C2979<TResult, C0329<TContinuationResult>> r5) {
        C0770 r0 = new C0770();
        this.f5167.m6177(new C0365(executor, r5, r0));
        m6062();
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <TContinuationResult> C0329<TContinuationResult> m6074(Executor executor, C3184<TResult, TContinuationResult> r5) {
        C0770 r0 = new C0770();
        this.f5167.m6177(new C0461(executor, r5, r0));
        m6062();
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <TContinuationResult> C0329<TContinuationResult> m6077(C3184<TResult, TContinuationResult> r2) {
        return m4410(C0322.f3663, r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6079(TResult tresult) {
        synchronized (this.f5168) {
            m6061();
            this.f5172 = true;
            this.f5169 = tresult;
        }
        this.f5167.m6176(this);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m6087(TResult tresult) {
        synchronized (this.f5168) {
            if (this.f5172) {
                return false;
            }
            this.f5172 = true;
            this.f5169 = tresult;
            this.f5167.m6176(this);
            return true;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6073(Exception exc) {
        C2745.C2746.m14559(exc, "Exception must not be null");
        synchronized (this.f5168) {
            m6061();
            this.f5172 = true;
            this.f5170 = exc;
        }
        this.f5167.m6176(this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m6068(Exception exc) {
        C2745.C2746.m14559(exc, "Exception must not be null");
        synchronized (this.f5168) {
            if (this.f5172) {
                return false;
            }
            this.f5172 = true;
            this.f5170 = exc;
            this.f5167.m6176(this);
            return true;
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean m6088() {
        synchronized (this.f5168) {
            if (this.f5172) {
                return false;
            }
            this.f5172 = true;
            this.f5171 = true;
            this.f5167.m6176(this);
            return true;
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private final void m6060() {
        C2745.C2746.m14558(this.f5172, "Task is not yet complete");
    }

    /* renamed from: І  reason: contains not printable characters */
    private final void m6061() {
        C2745.C2746.m14558(!this.f5172, "Task is already complete");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final void m6059() {
        if (this.f5171) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private final void m6062() {
        synchronized (this.f5168) {
            if (this.f5172) {
                this.f5167.m6176(this);
            }
        }
    }
}
