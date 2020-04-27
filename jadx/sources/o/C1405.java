package o;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C1225;

/* renamed from: o.ɪӀ  reason: contains not printable characters */
public final class C1405<T> extends LiveData<T> {

    /* renamed from: Ɩ  reason: contains not printable characters */
    final C1225.If f7671;

    /* renamed from: ȷ  reason: contains not printable characters */
    final AtomicBoolean f7672 = new AtomicBoolean(false);

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C1188 f7673;

    /* renamed from: ɪ  reason: contains not printable characters */
    final AtomicBoolean f7674 = new AtomicBoolean(false);

    /* renamed from: ɹ  reason: contains not printable characters */
    final Callable<T> f7675;

    /* renamed from: ɾ  reason: contains not printable characters */
    final Runnable f7676 = new Runnable() {
        public final void run() {
            Executor executor;
            boolean z = C1405.this.f238 > 0;
            if (C1405.this.f7679.compareAndSet(false, true) && z) {
                C1405 r0 = C1405.this;
                if (r0.f7678) {
                    executor = r0.f7677.m8030();
                } else {
                    executor = r0.f7677.m8039();
                }
                executor.execute(C1405.this.f7680);
            }
        }
    };

    /* renamed from: І  reason: contains not printable characters */
    final C1242 f7677;

    /* renamed from: і  reason: contains not printable characters */
    final boolean f7678;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final AtomicBoolean f7679 = new AtomicBoolean(true);

    /* renamed from: ӏ  reason: contains not printable characters */
    final Runnable f7680 = new Runnable() {
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                o.ɪӀ r0 = o.C1405.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7674
                r1 = 1
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0020
                o.ɪӀ r0 = o.C1405.this
                o.ɩƚ r0 = r0.f7677
                o.ɨӀ r0 = r0.m8029()
                o.ɪӀ r3 = o.C1405.this
                o.ɨӀ$If r3 = r3.f7671
                o.ɨӀ$ɩ r4 = new o.ɨӀ$ɩ
                r4.<init>(r0, r3)
                r0.m7912((o.C1225.If) r4)
            L_0x0020:
                o.ɪӀ r0 = o.C1405.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7672
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0062
                r0 = 0
                r3 = r0
                r0 = 0
            L_0x002d:
                o.ɪӀ r4 = o.C1405.this     // Catch:{ all -> 0x0059 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f7679     // Catch:{ all -> 0x0059 }
                boolean r4 = r4.compareAndSet(r1, r2)     // Catch:{ all -> 0x0059 }
                if (r4 == 0) goto L_0x004a
                o.ɪӀ r0 = o.C1405.this     // Catch:{ Exception -> 0x0041 }
                java.util.concurrent.Callable<T> r0 = r0.f7675     // Catch:{ Exception -> 0x0041 }
                java.lang.Object r3 = r0.call()     // Catch:{ Exception -> 0x0041 }
                r0 = 1
                goto L_0x002d
            L_0x0041:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0059 }
                java.lang.String r3 = "Exception while computing database live data."
                r1.<init>(r3, r0)     // Catch:{ all -> 0x0059 }
                throw r1     // Catch:{ all -> 0x0059 }
            L_0x004a:
                if (r0 == 0) goto L_0x0051
                o.ɪӀ r4 = o.C1405.this     // Catch:{ all -> 0x0059 }
                r4.m195(r3)     // Catch:{ all -> 0x0059 }
            L_0x0051:
                o.ɪӀ r3 = o.C1405.this
                java.util.concurrent.atomic.AtomicBoolean r3 = r3.f7672
                r3.set(r2)
                goto L_0x0063
            L_0x0059:
                r0 = move-exception
                o.ɪӀ r1 = o.C1405.this
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.f7672
                r1.set(r2)
                throw r0
            L_0x0062:
                r0 = 0
            L_0x0063:
                if (r0 == 0) goto L_0x006f
                o.ɪӀ r0 = o.C1405.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7679
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0020
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1405.AnonymousClass1.run():void");
        }
    };

    @SuppressLint({"RestrictedApi"})
    public C1405(C1242 r3, C1188 r4, Callable<T> callable, String[] strArr) {
        this.f7677 = r3;
        this.f7678 = false;
        this.f7675 = callable;
        this.f7673 = r4;
        this.f7671 = new C1225.If(strArr) {
            /* renamed from: ı  reason: contains not printable characters */
            public final void m8586(Set<String> set) {
                C2523 r3 = C2523.m13404();
                Runnable runnable = C1405.this.f7676;
                if (r3.m13692()) {
                    runnable.run();
                } else {
                    r3.m13693(runnable);
                }
            }
        };
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m8585() {
        Executor executor;
        super.m193();
        this.f7673.f6807.add(this);
        if (this.f7678) {
            executor = this.f7677.m8030();
        } else {
            executor = this.f7677.m8039();
        }
        executor.execute(this.f7680);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8584() {
        super.m191();
        this.f7673.f6807.remove(this);
    }
}
