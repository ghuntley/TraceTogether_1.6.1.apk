package o;

import android.os.Process;

/* renamed from: o.at  reason: case insensitive filesystem */
public abstract class C3280at implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m1626();

    public final void run() {
        Process.setThreadPriority(10);
        m1626();
    }
}
