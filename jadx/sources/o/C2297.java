package o;

import android.os.Process;

/* renamed from: o.ІГ  reason: contains not printable characters */
public final class C2297 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f10696;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Runnable f10697;

    public C2297(Runnable runnable, int i) {
        this.f10697 = runnable;
        this.f10696 = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f10696);
        this.f10697.run();
    }
}
