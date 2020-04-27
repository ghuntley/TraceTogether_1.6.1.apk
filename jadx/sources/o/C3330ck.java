package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* renamed from: o.ck  reason: case insensitive filesystem */
public final class C3330ck {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C3321cb f1971 = C2745.m14528((Callable<C3321cb>) new Callable<C3321cb>() {
        public final /* bridge */ /* synthetic */ Object call() {
            return C0148.f1972;
        }
    });

    /* renamed from: o.ck$ı  reason: contains not printable characters */
    static final class C0148 {

        /* renamed from: Ι  reason: contains not printable characters */
        static final C3321cb f1972 = new C3327ch(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C3321cb m1971() {
        C3321cb cbVar = f1971;
        if (cbVar != null) {
            return cbVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
