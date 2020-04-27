package o;

import android.util.Log;

/* renamed from: o.ad  reason: case insensitive filesystem */
public final class C3264ad implements C3275ao {

    /* renamed from: Ι  reason: contains not printable characters */
    private int f1507 = 4;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m1573(String str) {
        return this.f1507 <= 3 || Log.isLoggable(str, 3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1572(int i, String str, String str2) {
        Log.println(i, str, str2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1571(int i, String str, String str2) {
        if (this.f1507 <= i || Log.isLoggable(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
