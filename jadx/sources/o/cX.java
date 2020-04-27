package o;

import android.content.Intent;
import java.util.concurrent.Callable;

public final class cX implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C3203 f1942;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Intent f1943;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1513 f1944;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m1936(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m1938(th)) {
            th = new C3332cm(th);
        }
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m1938(Throwable th) {
        if (!(th instanceof C3331cl) && !(th instanceof C3333cn) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C3337cp)) {
            return false;
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C3321cb m1937(Callable<C3321cb> callable) {
        try {
            C3321cb call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw cW.m1935(th);
        }
    }

    public cX(C1513 r1, Intent intent, C3203 r3) {
        this.f1944 = r1;
        this.f1943 = intent;
        this.f1942 = r3;
    }

    public final void run() {
        C1513 r0 = this.f1944;
        Intent intent = this.f1943;
        C3203 r2 = this.f1942;
        try {
            r0.m8956(intent);
        } finally {
            r2.f14555.m6079(null);
        }
    }
}
