package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.Ӏƚ  reason: contains not printable characters */
class C2764 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int f13096 = 5000;

    /* renamed from: ı  reason: contains not printable characters */
    boolean f13097 = true;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final List<If> f13098 = new ArrayList();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ScheduledExecutorService f13099;

    /* renamed from: ι  reason: contains not printable characters */
    final AtomicReference<ScheduledFuture<?>> f13100 = new AtomicReference<>();

    /* renamed from: і  reason: contains not printable characters */
    private volatile boolean f13101 = true;

    /* renamed from: o.Ӏƚ$If */
    public interface If {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m14627();
    }

    public C2764(ScheduledExecutorService scheduledExecutorService) {
        this.f13099 = scheduledExecutorService;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14623(boolean z) {
        this.f13101 = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m14621() {
        for (If r1 : this.f13098) {
            r1.m14627();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m14626(If ifR) {
        this.f13098.add(ifR);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m14624() {
        this.f13097 = false;
        ScheduledFuture andSet = this.f13100.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m14625() {
        if (this.f13101 && !this.f13097) {
            this.f13097 = true;
            try {
                this.f13100.compareAndSet((Object) null, this.f13099.schedule(new Runnable() {
                    public void run() {
                        C2764.this.f13100.set((Object) null);
                        C2764.this.m14621();
                    }
                }, 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException unused) {
                C3263ac.m1563();
            }
        }
    }
}
