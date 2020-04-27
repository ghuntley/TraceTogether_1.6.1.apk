package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: o.ɪі  reason: contains not printable characters */
final class C1401 implements Executor {

    /* renamed from: ı  reason: contains not printable characters */
    private Runnable f7661;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Executor f7662;

    /* renamed from: ι  reason: contains not printable characters */
    private final ArrayDeque<Runnable> f7663 = new ArrayDeque<>();

    C1401(Executor executor) {
        this.f7662 = executor;
    }

    public final synchronized void execute(final Runnable runnable) {
        this.f7663.offer(new Runnable() {
            public final void run() {
                try {
                    runnable.run();
                } finally {
                    C1401.this.m8579();
                }
            }
        });
        if (this.f7661 == null) {
            m8579();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized void m8579() {
        Runnable poll = this.f7663.poll();
        this.f7661 = poll;
        if (poll != null) {
            this.f7662.execute(this.f7661);
        }
    }
}
