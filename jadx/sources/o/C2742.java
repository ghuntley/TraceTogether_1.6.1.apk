package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: o.һ  reason: contains not printable characters */
public final class C2742 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private SharedPreferences f12756;

    public C2742(Context context) {
        try {
            Context remoteContext = C2877.getRemoteContext(context);
            this.f12756 = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f12756 = null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m14493(String str, String str2) {
        try {
            return this.f12756 == null ? str2 : this.f12756.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final float m14494(String str, float f) {
        try {
            if (this.f12756 == null) {
                return 0.0f;
            }
            return this.f12756.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m14495(String str, boolean z) {
        try {
            if (this.f12756 == null) {
                return false;
            }
            return this.f12756.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
