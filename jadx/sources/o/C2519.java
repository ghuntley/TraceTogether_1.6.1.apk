package o;

import android.content.SharedPreferences;
import o.C2745;

/* renamed from: o.ьΙ  reason: contains not printable characters */
public final class C2519 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f11440;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2327 f11441;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f11442;

    /* renamed from: Ι  reason: contains not printable characters */
    private long f11443;

    /* renamed from: ι  reason: contains not printable characters */
    private final long f11444;

    public C2519(C2327 r1, String str, long j) {
        this.f11441 = r1;
        C2745.C2746.m14562(str);
        this.f11440 = str;
        this.f11444 = j;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m13399() {
        if (!this.f11442) {
            this.f11442 = true;
            this.f11443 = this.f11441.m12121().getLong(this.f11440, this.f11444);
        }
        return this.f11443;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13398(long j) {
        SharedPreferences.Editor edit = this.f11441.m12121().edit();
        edit.putLong(this.f11440, j);
        edit.apply();
        this.f11443 = j;
    }
}
