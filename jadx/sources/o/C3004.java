package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.ԧɩ  reason: contains not printable characters */
public final class C3004 implements C2538 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Map<String, C3004> f13856 = new C0299();

    /* renamed from: ı  reason: contains not printable characters */
    private volatile Map<String, ?> f13857;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Object f13858 = new Object();

    /* renamed from: ɹ  reason: contains not printable characters */
    private final List<C2592> f13859 = new ArrayList();

    /* renamed from: Ι  reason: contains not printable characters */
    private final SharedPreferences f13860;

    /* renamed from: ι  reason: contains not printable characters */
    private final SharedPreferences.OnSharedPreferenceChangeListener f13861 = new C3008(this);

    /* renamed from: Ι  reason: contains not printable characters */
    static C3004 m15392(Context context, String str) {
        C3004 r1;
        if (!((!C2506.m13257() || str.startsWith("direct_boot:")) ? true : C2506.m13254(context))) {
            return null;
        }
        synchronized (C3004.class) {
            r1 = f13856.get(str);
            if (r1 == null) {
                r1 = new C3004(m15393(context, str));
                f13856.put(str, r1);
            }
        }
        return r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static SharedPreferences m15393(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (C2506.m13257()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private C3004(SharedPreferences sharedPreferences) {
        this.f13860 = sharedPreferences;
        this.f13860.registerOnSharedPreferenceChangeListener(this.f13861);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ι  reason: contains not printable characters */
    public final Object m15395(String str) {
        Map<String, ?> map = this.f13857;
        if (map == null) {
            synchronized (this.f13858) {
                map = this.f13857;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f13860.getAll();
                        this.f13857 = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static synchronized void m15391() {
        synchronized (C3004.class) {
            for (C3004 next : f13856.values()) {
                next.f13860.unregisterOnSharedPreferenceChangeListener(next.f13861);
            }
            f13856.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ void m15394(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f13858) {
            this.f13857 = null;
            C2781.m14675();
        }
        synchronized (this) {
            for (C2592 r2 : this.f13859) {
                r2.m13739();
            }
        }
    }
}
