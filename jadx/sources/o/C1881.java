package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: o.Ιя  reason: contains not printable characters */
public final class C1881 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final SharedPreferences f9570;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, Long> f9571 = new C0299();

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f9572;

    public C1881(Context context) {
        this.f9572 = context;
        this.f9570 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(C0651.m5451(this.f9572), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m10278()) {
                    m10285();
                    FirebaseInstanceId.m1106().m1120();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    e.getMessage();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized String m10281() {
        return this.f9570.getString("topic_operation_queue", "");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m10283(String str) {
        this.f9570.edit().putString("topic_operation_queue", str).apply();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final synchronized boolean m10278() {
        return this.f9570.getAll().isEmpty();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m10277(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m10275(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized void m10285() {
        this.f9571.clear();
        this.f9570.edit().clear().commit();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized C1918 m10280(String str, String str2, String str3) {
        return C1918.m10415(this.f9570.getString(m10277(str, str2, str3), (String) null));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized void m10284(String str, String str2, String str3, String str4, String str5) {
        String r6 = C1918.m10416(str4, str5, System.currentTimeMillis());
        if (r6 != null) {
            SharedPreferences.Editor edit = this.f9570.edit();
            edit.putString(m10277(str, str2, str3), r6);
            edit.commit();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final long m10276(String str) {
        String string = this.f9570.getString(m10275(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized long m10279(String str) {
        long currentTimeMillis;
        currentTimeMillis = System.currentTimeMillis();
        if (!this.f9570.contains(m10275(str, "cre"))) {
            SharedPreferences.Editor edit = this.f9570.edit();
            edit.putString(m10275(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            currentTimeMillis = m10276(str);
        }
        this.f9571.put(str, Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized void m10282(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f9570.edit();
        for (String next : this.f9570.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }
}
