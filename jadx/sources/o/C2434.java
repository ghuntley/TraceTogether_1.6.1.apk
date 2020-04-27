package o;

import android.content.SharedPreferences;
import android.util.Pair;
import o.C2745;

/* renamed from: o.зІ  reason: contains not printable characters */
public final class C2434 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f11067;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f11068;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2327 f11069;

    /* renamed from: Ι  reason: contains not printable characters */
    private final long f11070;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f11071;

    private C2434(C2327 r3, String str, long j) {
        this.f11069 = r3;
        C2745.C2746.m14562(str);
        C2745.C2746.m14563(j > 0);
        this.f11068 = String.valueOf(str).concat(":start");
        this.f11071 = String.valueOf(str).concat(":count");
        this.f11067 = String.valueOf(str).concat(":value");
        this.f11070 = j;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m12533() {
        this.f11069.y_();
        long r0 = this.f11069.w_().m10846();
        SharedPreferences.Editor edit = this.f11069.m12121().edit();
        edit.remove(this.f11071);
        edit.remove(this.f11067);
        edit.putLong(this.f11068, r0);
        edit.apply();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m12536(String str, long j) {
        this.f11069.y_();
        if (m12534() == 0) {
            m12533();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f11069.m12121().getLong(this.f11071, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f11069.m12121().edit();
            edit.putString(this.f11067, str);
            edit.putLong(this.f11071, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f11069.m15901().m11390().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f11069.m12121().edit();
        if (z) {
            edit2.putString(this.f11067, str);
        }
        edit2.putLong(this.f11071, j3);
        edit2.apply();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Pair<String, Long> m12535() {
        long j;
        this.f11069.y_();
        this.f11069.y_();
        long r0 = m12534();
        if (r0 == 0) {
            m12533();
            j = 0;
        } else {
            j = Math.abs(r0 - this.f11069.w_().m10846());
        }
        long j2 = this.f11070;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m12533();
            return null;
        }
        String string = this.f11069.m12121().getString(this.f11067, (String) null);
        long j3 = this.f11069.m12121().getLong(this.f11071, 0);
        m12533();
        if (string == null || j3 <= 0) {
            return C2327.f10769;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final long m12534() {
        return this.f11069.m12121().getLong(this.f11068, 0);
    }
}
