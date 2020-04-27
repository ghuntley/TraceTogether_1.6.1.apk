package o;

import java.util.concurrent.TimeUnit;

public class jQ extends C3533kb {

    /* renamed from: Ι  reason: contains not printable characters */
    public C3533kb f2440;

    public jQ(C3533kb kbVar) {
        if (kbVar != null) {
            this.f2440 = kbVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public C3533kb timeout(long j, TimeUnit timeUnit) {
        return this.f2440.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f2440.timeoutNanos();
    }

    public boolean hasDeadline() {
        return this.f2440.hasDeadline();
    }

    public long deadlineNanoTime() {
        return this.f2440.deadlineNanoTime();
    }

    public C3533kb deadlineNanoTime(long j) {
        return this.f2440.deadlineNanoTime(j);
    }

    public C3533kb clearTimeout() {
        return this.f2440.clearTimeout();
    }

    public C3533kb clearDeadline() {
        return this.f2440.clearDeadline();
    }

    public void throwIfReached() {
        this.f2440.throwIfReached();
    }
}
