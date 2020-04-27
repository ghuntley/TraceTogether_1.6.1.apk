package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class jE extends C3533kb {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    static jE head;
    private boolean inQueue;
    private jE next;
    private long timeoutAt;

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    private static synchronized void scheduleTimeout(jE jEVar, long j, boolean z) {
        Class<jE> cls = jE.class;
        synchronized (cls) {
            if (head == null) {
                head = new jE();
                new C0190().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i != 0 && z) {
                jEVar.timeoutAt = Math.min(j, jEVar.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (i != 0) {
                jEVar.timeoutAt = j + nanoTime;
            } else if (z) {
                jEVar.timeoutAt = jEVar.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = jEVar.remainingNanos(nanoTime);
            jE jEVar2 = head;
            while (true) {
                if (jEVar2.next == null) {
                    break;
                } else if (remainingNanos < jEVar2.next.remainingNanos(nanoTime)) {
                    break;
                } else {
                    jEVar2 = jEVar2.next;
                }
            }
            jEVar.next = jEVar2.next;
            jEVar2.next = jEVar;
            if (jEVar2 == head) {
                cls.notify();
            }
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    private static synchronized boolean cancelScheduledTimeout(jE jEVar) {
        synchronized (jE.class) {
            jE jEVar2 = head;
            while (jEVar2 != null) {
                jE jEVar3 = jEVar2.next;
                if (jEVar3 == jEVar) {
                    jEVar2.next = jEVar.next;
                    jEVar.next = null;
                    return false;
                }
                jEVar2 = jEVar3;
            }
            return true;
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final jZ sink(final jZ jZVar) {
        return new jZ() {
            public final void write(jH jHVar, long j) {
                jX.m3051(jHVar.f2411, 0, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        jS jSVar = jHVar.f2412;
                        while (true) {
                            if (j2 >= 65536) {
                                break;
                            }
                            j2 += (long) (jSVar.f2447 - jSVar.f2449);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            jSVar = jSVar.f2450;
                        }
                        jE.this.enter();
                        try {
                            jZVar.write(jHVar, j2);
                            j -= j2;
                            jE.this.exit(true);
                        } catch (IOException e) {
                            throw jE.this.exit(e);
                        } catch (Throwable th) {
                            jE.this.exit(false);
                            throw th;
                        }
                    } else {
                        return;
                    }
                }
            }

            public final void flush() {
                jE.this.enter();
                try {
                    jZVar.flush();
                    jE.this.exit(true);
                } catch (IOException e) {
                    throw jE.this.exit(e);
                } catch (Throwable th) {
                    jE.this.exit(false);
                    throw th;
                }
            }

            public final void close() {
                jE.this.enter();
                try {
                    jZVar.close();
                    jE.this.exit(true);
                } catch (IOException e) {
                    throw jE.this.exit(e);
                } catch (Throwable th) {
                    jE.this.exit(false);
                    throw th;
                }
            }

            public final C3533kb timeout() {
                return jE.this;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
                sb.append(jZVar);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public final jY source(final jY jYVar) {
        return new jY() {
            public final long read(jH jHVar, long j) {
                jE.this.enter();
                try {
                    long read = jYVar.read(jHVar, j);
                    jE.this.exit(true);
                    return read;
                } catch (IOException e) {
                    throw jE.this.exit(e);
                } catch (Throwable th) {
                    jE.this.exit(false);
                    throw th;
                }
            }

            public final void close() {
                jE.this.enter();
                try {
                    jYVar.close();
                    jE.this.exit(true);
                } catch (IOException e) {
                    throw jE.this.exit(e);
                } catch (Throwable th) {
                    jE.this.exit(false);
                    throw th;
                }
            }

            public final C3533kb timeout() {
                return jE.this;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
                sb.append(jYVar);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final void exit(boolean z) {
        if (exit() && z) {
            throw newTimeoutException((IOException) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final IOException exit(IOException iOException) {
        if (!exit()) {
            return iOException;
        }
        return newTimeoutException(iOException);
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: o.jE$ı  reason: contains not printable characters */
    static final class C0190 extends Thread {
        C0190() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0015, code lost:
            r1.timedOut();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<o.jE> r0 = o.jE.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                o.jE r1 = o.jE.awaitTimeout()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                o.jE r2 = o.jE.head     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                o.jE.head = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: o.jE.C0190.run():void");
        }
    }

    static jE awaitTimeout() {
        Class<jE> cls = jE.class;
        jE jEVar = head.next;
        if (jEVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = jEVar.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            cls.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = jEVar.next;
        jEVar.next = null;
        return jEVar;
    }
}
