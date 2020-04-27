package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: o.Ӏͻ  reason: contains not printable characters */
public final class C2810 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C2810 f13223;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Lock f13224 = new ReentrantLock();

    /* renamed from: Ι  reason: contains not printable characters */
    private final SharedPreferences f13225;

    /* renamed from: ι  reason: contains not printable characters */
    private final Lock f13226 = new ReentrantLock();

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2810 m14722(Context context) {
        if (context != null) {
            f13224.lock();
            try {
                if (f13223 == null) {
                    f13223 = new C2810(context.getApplicationContext());
                }
                return f13223;
            } finally {
                f13224.unlock();
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    private C2810(Context context) {
        this.f13225 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final GoogleSignInAccount m14723(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("googleSignInAccount".length() + 1 + String.valueOf(str).length());
        sb.append("googleSignInAccount");
        sb.append(":");
        sb.append(str);
        String r5 = m14724(sb.toString());
        if (r5 != null) {
            try {
                return GoogleSignInAccount.m742(r5);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14724(String str) {
        this.f13226.lock();
        try {
            return this.f13225.getString(str, (String) null);
        } finally {
            this.f13226.unlock();
        }
    }
}
