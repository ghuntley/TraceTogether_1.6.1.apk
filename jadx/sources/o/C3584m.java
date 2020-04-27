package o;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C3616p;
import o.C3626z;

/* renamed from: o.m  reason: case insensitive filesystem */
final class C3584m extends ThreadPoolExecutor {
    C3584m() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C3626z.Cif());
    }

    public final Future<?> submit(Runnable runnable) {
        C0231 r0 = new C0231((C2666) runnable);
        execute(r0);
        return r0;
    }

    /* renamed from: o.m$ɩ  reason: contains not printable characters */
    static final class C0231 extends FutureTask<C2666> implements Comparable<C0231> {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C2666 f3036;

        public final /* synthetic */ int compareTo(Object obj) {
            C0231 r3 = (C0231) obj;
            C3616p.Cif ifVar = this.f3036.f12273;
            C3616p.Cif ifVar2 = r3.f3036.f12273;
            return ifVar == ifVar2 ? this.f3036.f12275 - r3.f3036.f12275 : ifVar2.ordinal() - ifVar.ordinal();
        }

        public C0231(C2666 r2) {
            super(r2, (Object) null);
            this.f3036 = r2;
        }
    }
}
