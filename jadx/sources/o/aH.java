package o;

import android.os.SystemClock;
import android.util.Log;

public final class aH {

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean f1455;

    /* renamed from: ǃ  reason: contains not printable characters */
    private long f1456;

    /* renamed from: Ι  reason: contains not printable characters */
    private long f1457;

    public aH(String str) {
        this.f1455 = !Log.isLoggable(str, 2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized void m1496() {
        if (!this.f1455) {
            this.f1457 = SystemClock.elapsedRealtime();
            this.f1456 = 0;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized void m1495() {
        if (!this.f1455) {
            if (this.f1456 == 0) {
                this.f1456 = SystemClock.elapsedRealtime() - this.f1457;
            }
        }
    }
}
