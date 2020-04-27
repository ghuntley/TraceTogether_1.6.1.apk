package o;

import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: o.լɪ  reason: contains not printable characters */
public final class C3107 {

    /* renamed from: Ι  reason: contains not printable characters */
    static final Date f14203 = new Date(-1);

    /* renamed from: ι  reason: contains not printable characters */
    static final Date f14204 = new Date(-1);

    /* renamed from: ı  reason: contains not printable characters */
    public final Object f14205 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object f14206 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final SharedPreferences f14207;

    public C3107(SharedPreferences sharedPreferences) {
        this.f14207 = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15764(String str) {
        synchronized (this.f14205) {
            this.f14207.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final If m15763() {
        If ifR;
        synchronized (this.f14206) {
            ifR = new If(this.f14207.getInt("num_failed_fetches", 0), new Date(this.f14207.getLong("backoff_end_time_in_millis", -1)));
        }
        return ifR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m15765(int i, Date date) {
        synchronized (this.f14206) {
            this.f14207.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: o.լɪ$If */
    static class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        Date f14208;

        /* renamed from: Ι  reason: contains not printable characters */
        int f14209;

        If(int i, Date date) {
            this.f14209 = i;
            this.f14208 = date;
        }
    }
}
