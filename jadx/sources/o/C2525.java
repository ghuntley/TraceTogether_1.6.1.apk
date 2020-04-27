package o;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.эǃ  reason: contains not printable characters */
public final class C2525 implements C2538 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Map<Uri, C2525> f11469 = new C0299();

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final String[] f11470 = {"key", "value"};

    /* renamed from: ı  reason: contains not printable characters */
    private final ContentObserver f11471 = new C2503(this, (Handler) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object f11472 = new Object();

    /* renamed from: Ι  reason: contains not printable characters */
    private final Uri f11473;

    /* renamed from: ι  reason: contains not printable characters */
    private final ContentResolver f11474;

    /* renamed from: І  reason: contains not printable characters */
    private final List<C2592> f11475 = new ArrayList();

    /* renamed from: і  reason: contains not printable characters */
    private volatile Map<String, String> f11476;

    private C2525(ContentResolver contentResolver, Uri uri) {
        this.f11474 = contentResolver;
        this.f11473 = uri;
        contentResolver.registerContentObserver(uri, false, this.f11471);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.C2525 m13413(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<o.эǃ> r0 = o.C2525.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, o.эǃ> r1 = f11469     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            o.эǃ r1 = (o.C2525) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            o.эǃ r2 = new o.эǃ     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, o.эǃ> r3 = f11469     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2525.m13413(android.content.ContentResolver, android.net.Uri):o.эǃ");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Map<String, String> m13415() {
        Map<String, String> map = this.f11476;
        if (map == null) {
            synchronized (this.f11472) {
                map = this.f11476;
                if (map == null) {
                    map = m13412();
                    this.f11476 = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13418() {
        synchronized (this.f11472) {
            this.f11476 = null;
            C2781.m14675();
        }
        synchronized (this) {
            for (C2592 r1 : this.f11475) {
                r1.m13739();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, String> m13412() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) C2779.m14670(new C2578(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static synchronized void m13414() {
        synchronized (C2525.class) {
            for (C2525 next : f11469.values()) {
                next.f11474.unregisterContentObserver(next.f11471);
            }
            f11469.clear();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ Object m13417(String str) {
        return m13415().get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Map m13416() {
        Map map;
        Cursor query = this.f11474.query(this.f11473, f11470, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C0299(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
