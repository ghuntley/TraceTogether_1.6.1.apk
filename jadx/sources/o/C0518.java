package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: o.ŀӀ  reason: contains not printable characters */
public final class C0518<T> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Executor f4283 = Executors.newCachedThreadPool();

    /* renamed from: ı  reason: contains not printable characters */
    private final Set<C0406<Throwable>> f4284;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Handler f4285;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Set<C0406<T>> f4286;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public volatile C0364<T> f4287;

    public C0518(Callable<C0364<T>> callable) {
        this(callable, (byte) 0);
    }

    private C0518(Callable<C0364<T>> callable, byte b) {
        this.f4286 = new LinkedHashSet(1);
        this.f4284 = new LinkedHashSet(1);
        this.f4285 = new Handler(Looper.getMainLooper());
        this.f4287 = null;
        f4283.execute(new Cif(callable));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized C0518<T> m4987(C0406<T> r2) {
        if (!(this.f4287 == null || this.f4287.f3823 == null)) {
            r2.m4688(this.f4287.f3823);
        }
        this.f4286.add(r2);
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized C0518<T> m4988(C0406<T> r2) {
        this.f4286.remove(r2);
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized C0518<T> m4986(C0406<Throwable> r2) {
        if (!(this.f4287 == null || this.f4287.f3824 == null)) {
            r2.m4688(this.f4287.f3824);
        }
        this.f4284.add(r2);
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized C0518<T> m4989(C0406<Throwable> r2) {
        this.f4284.remove(r2);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public synchronized void m4984(T t) {
        for (C0406 r1 : new ArrayList(this.f4286)) {
            r1.m4688(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public synchronized void m4982(Throwable th) {
        ArrayList<C0406> arrayList = new ArrayList<>(this.f4284);
        if (arrayList.isEmpty()) {
            C2414.m12462("Lottie encountered an error but no failure listener was added:");
            return;
        }
        for (C0406 r1 : arrayList) {
            r1.m4688(th);
        }
    }

    /* renamed from: o.ŀӀ$if  reason: invalid class name */
    class Cif extends FutureTask<C0364<T>> {
        Cif(Callable<C0364<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public final void done() {
            if (!isCancelled()) {
                try {
                    C0518.m4983(C0518.this, (C0364) get());
                } catch (InterruptedException | ExecutionException e) {
                    C0518.m4983(C0518.this, new C0364(e));
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static /* synthetic */ void m4983(C0518 r1, C0364 r2) {
        if (r1.f4287 == null) {
            r1.f4287 = r2;
            r1.f4285.post(new Runnable() {
                public final void run() {
                    if (C0518.this.f4287 != null) {
                        C0364 r0 = C0518.this.f4287;
                        if (r0.f3823 != null) {
                            C0518.this.m4984(r0.f3823);
                        } else {
                            C0518.this.m4982(r0.f3824);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
