package o;

import java.lang.Thread;
import o.C2745;

/* renamed from: o.ѕι  reason: contains not printable characters */
final class C2554 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2570 f11654;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f11655;

    public C2554(C2570 r1, String str) {
        this.f11654 = r1;
        C2745.C2746.m14555(str);
        this.f11655 = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f11654.t_().m11714().m11603(this.f11655, th);
    }
}
