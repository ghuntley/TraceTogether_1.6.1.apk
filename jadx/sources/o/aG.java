package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class aG<Params, Progress, Result> {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int f1427;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final BlockingQueue<Runnable> f1428 = new LinkedBlockingQueue(128);

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int f1429 = ((f1433 << 1) + 1);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Executor f1430 = new ThreadPoolExecutor(f1427, f1429, 1, TimeUnit.SECONDS, f1428, f1432);

    /* renamed from: ɹ  reason: contains not printable characters */
    private static volatile Executor f1431 = f1434;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final ThreadFactory f1432 = new ThreadFactory() {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final AtomicInteger f1441 = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("AsyncTask #");
            sb.append(this.f1441.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    private static final int f1433;

    /* renamed from: І  reason: contains not printable characters */
    private static Executor f1434 = new C0112((byte) 0);

    /* renamed from: і  reason: contains not printable characters */
    private static final C0110 f1435 = new C0110();

    /* renamed from: ȷ  reason: contains not printable characters */
    private volatile If f1436 = If.PENDING;
    /* access modifiers changed from: private */

    /* renamed from: ɪ  reason: contains not printable characters */
    public final AtomicBoolean f1437 = new AtomicBoolean();

    /* renamed from: ɾ  reason: contains not printable characters */
    private final FutureTask<Result> f1438 = new FutureTask<Result>(this.f1439) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                aG.m1484(aG.this, get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occured while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                aG.m1484(aG.this, (Object) null);
            }
        }
    };

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Cif<Params, Result> f1439 = new Cif<Params, Result>() {
        public final Result call() {
            aG.this.f1437.set(true);
            Process.setThreadPriority(10);
            aG aGVar = aG.this;
            return aG.f1435.obtainMessage(1, new C0111(aGVar, aGVar.m1491())).sendToTarget();
        }
    };

    /* renamed from: ӏ  reason: contains not printable characters */
    private final AtomicBoolean f1440 = new AtomicBoolean();

    public enum If {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1488() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m1490(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract Result m1491();

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public void m1493(Result result) {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f1433 = availableProcessors;
        f1427 = availableProcessors + 1;
    }

    /* renamed from: o.aG$ɩ  reason: contains not printable characters */
    static class C0112 implements Executor {

        /* renamed from: ɩ  reason: contains not printable characters */
        private LinkedList<Runnable> f1451;

        /* renamed from: ι  reason: contains not printable characters */
        private Runnable f1452;

        private C0112() {
            this.f1451 = new LinkedList<>();
        }

        /* synthetic */ C0112(byte b) {
            this();
        }

        public final synchronized void execute(final Runnable runnable) {
            this.f1451.offer(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        C0112.this.m1494();
                    }
                }
            });
            if (this.f1452 == null) {
                m1494();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final synchronized void m1494() {
            Runnable poll = this.f1451.poll();
            this.f1452 = poll;
            if (poll != null) {
                aG.f1430.execute(this.f1452);
            }
        }
    }

    public final If L_() {
        return this.f1436;
    }

    public final boolean M_() {
        return this.f1440.get();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m1489() {
        this.f1440.set(true);
        return this.f1438.cancel(true);
    }

    /* renamed from: o.aG$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ǃ  reason: contains not printable characters */
        static final /* synthetic */ int[] f1444 = new int[If.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                o.aG$If[] r0 = o.aG.If.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1444 = r0
                int[] r0 = f1444     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.aG$If r1 = o.aG.If.RUNNING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1444     // Catch:{ NoSuchFieldError -> 0x001f }
                o.aG$If r1 = o.aG.If.FINISHED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aG.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final aG<Params, Progress, Result> m1492(Executor executor) {
        if (this.f1436 != If.PENDING) {
            int i = AnonymousClass5.f1444[this.f1436.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f1436 = If.RUNNING;
        m1488();
        executor.execute(this.f1438);
        return this;
    }

    /* renamed from: o.aG$ı  reason: contains not printable characters */
    static class C0110 extends Handler {
        public C0110() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C0111 r0 = (C0111) message.obj;
            if (message.what == 1) {
                aG.m1486(r0.f1450, r0.f1449[0]);
            }
        }
    }

    /* renamed from: o.aG$if  reason: invalid class name */
    static abstract class Cif<Params, Result> implements Callable<Result> {
        private Cif() {
        }

        /* synthetic */ Cif(byte b) {
            this();
        }
    }

    /* renamed from: o.aG$ǃ  reason: contains not printable characters */
    static class C0111<Data> {

        /* renamed from: ǃ  reason: contains not printable characters */
        final Data[] f1449;

        /* renamed from: Ι  reason: contains not printable characters */
        final aG f1450;

        C0111(aG aGVar, Data... dataArr) {
            this.f1450 = aGVar;
            this.f1449 = dataArr;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ void m1484(aG aGVar, Object obj) {
        if (!aGVar.f1437.get()) {
            f1435.obtainMessage(1, new C0111(aGVar, obj)).sendToTarget();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static /* synthetic */ void m1486(aG aGVar, Object obj) {
        if (aGVar.f1440.get()) {
            aGVar.m1490(obj);
        } else {
            aGVar.m1493(obj);
        }
        aGVar.f1436 = If.FINISHED;
    }
}
