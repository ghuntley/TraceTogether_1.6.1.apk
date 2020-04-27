package o;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import o.C2745;

/* renamed from: o.ѫ  reason: contains not printable characters */
final class C2646<V> extends FutureTask<V> implements Comparable<C2646<V>> {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f12135;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2570 f12136;

    /* renamed from: Ι  reason: contains not printable characters */
    private final long f12137 = C2570.f11693.getAndIncrement();

    /* renamed from: ι  reason: contains not printable characters */
    final boolean f12138;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2646(C2570 r3, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f12136 = r3;
        C2745.C2746.m14555(str);
        this.f12135 = str;
        this.f12138 = z;
        if (this.f12137 == Long.MAX_VALUE) {
            r3.t_().m11714().m11606("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2646(C2570 r3, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f12136 = r3;
        C2745.C2746.m14555(str);
        this.f12135 = str;
        this.f12138 = false;
        if (this.f12137 == Long.MAX_VALUE) {
            r3.t_().m11714().m11606("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f12136.t_().m11714().m11603(this.f12135, th);
        if (th instanceof C2611) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C2646 r7 = (C2646) obj;
        boolean z = this.f12138;
        if (z != r7.f12138) {
            return z ? -1 : 1;
        }
        long j = this.f12137;
        long j2 = r7.f12137;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f12136.t_().m11718().m11603("Two tasks share the same index. index", Long.valueOf(this.f12137));
        return 0;
    }
}
