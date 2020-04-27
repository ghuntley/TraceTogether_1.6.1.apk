package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.ɩʙ  reason: contains not printable characters */
final class C1276 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static C1276 f7196;

    /* renamed from: ι  reason: contains not printable characters */
    private final SharedPreferences f7197;

    private C1276(Context context) {
        this.f7197 = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static synchronized C1276 m8186(Context context) {
        C1276 r2;
        synchronized (C1276.class) {
            if (f7196 == null) {
                f7196 = new C1276(context);
            }
            r2 = f7196;
        }
        return r2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized boolean m8188(String str, long j) {
        if (!this.f7197.contains(str)) {
            this.f7197.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f7197.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f7197.edit().putLong(str, j).apply();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized boolean m8187(long j) {
        return m8188("fire-global", j);
    }
}
