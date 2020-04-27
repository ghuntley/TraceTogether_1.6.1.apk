package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: o.эı  reason: contains not printable characters */
public class C2524 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final Pattern f11456 = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final HashMap<String, Integer> f11457 = new HashMap<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Uri f11458 = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: ȷ  reason: contains not printable characters */
    private static String[] f11459 = new String[0];

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Pattern f11460 = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: ɹ  reason: contains not printable characters */
    private static HashMap<String, String> f11461;

    /* renamed from: ɾ  reason: contains not printable characters */
    private static Object f11462;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Uri f11463 = Uri.parse("content://com.google.android.gsf.gservices");
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public static final AtomicBoolean f11464 = new AtomicBoolean();

    /* renamed from: І  reason: contains not printable characters */
    private static final HashMap<String, Long> f11465 = new HashMap<>();

    /* renamed from: і  reason: contains not printable characters */
    private static final HashMap<String, Boolean> f11466 = new HashMap<>();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final HashMap<String, Float> f11467 = new HashMap<>();

    /* renamed from: ӏ  reason: contains not printable characters */
    private static boolean f11468;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r10 = r10.query(f11463, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r11}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r10 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r10 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r10.moveToFirst() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        m13409(r0, r11, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12 = r10.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d6, code lost:
        if (r12 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        if (r12.equals((java.lang.Object) null) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        m13409(r0, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        if (r12 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e5, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e6, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e9, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ea, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00eb, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        throw r11;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13408(android.content.ContentResolver r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.Class<o.эı> r12 = o.C2524.class
            monitor-enter(r12)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f11461     // Catch:{ all -> 0x00ef }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicBoolean r0 = f11464     // Catch:{ all -> 0x00ef }
            r0.set(r2)     // Catch:{ all -> 0x00ef }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00ef }
            r0.<init>()     // Catch:{ all -> 0x00ef }
            f11461 = r0     // Catch:{ all -> 0x00ef }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ef }
            r0.<init>()     // Catch:{ all -> 0x00ef }
            f11462 = r0     // Catch:{ all -> 0x00ef }
            f11468 = r2     // Catch:{ all -> 0x00ef }
            android.net.Uri r0 = f11463     // Catch:{ all -> 0x00ef }
            o.чІ r4 = new o.чІ     // Catch:{ all -> 0x00ef }
            r4.<init>(r3)     // Catch:{ all -> 0x00ef }
            r10.registerContentObserver(r0, r1, r4)     // Catch:{ all -> 0x00ef }
            goto L_0x0054
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r0 = f11464     // Catch:{ all -> 0x00ef }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x0054
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f11461     // Catch:{ all -> 0x00ef }
            r0.clear()     // Catch:{ all -> 0x00ef }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = f11466     // Catch:{ all -> 0x00ef }
            r0.clear()     // Catch:{ all -> 0x00ef }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f11457     // Catch:{ all -> 0x00ef }
            r0.clear()     // Catch:{ all -> 0x00ef }
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = f11465     // Catch:{ all -> 0x00ef }
            r0.clear()     // Catch:{ all -> 0x00ef }
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = f11467     // Catch:{ all -> 0x00ef }
            r0.clear()     // Catch:{ all -> 0x00ef }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ef }
            r0.<init>()     // Catch:{ all -> 0x00ef }
            f11462 = r0     // Catch:{ all -> 0x00ef }
            f11468 = r2     // Catch:{ all -> 0x00ef }
        L_0x0054:
            java.lang.Object r0 = f11462     // Catch:{ all -> 0x00ef }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = f11461     // Catch:{ all -> 0x00ef }
            boolean r4 = r4.containsKey(r11)     // Catch:{ all -> 0x00ef }
            if (r4 == 0) goto L_0x006c
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f11461     // Catch:{ all -> 0x00ef }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x00ef }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r10 = r3
        L_0x006a:
            monitor-exit(r12)     // Catch:{ all -> 0x00ef }
            return r10
        L_0x006c:
            java.lang.String[] r4 = f11459     // Catch:{ all -> 0x00ef }
            int r5 = r4.length     // Catch:{ all -> 0x00ef }
            r6 = 0
        L_0x0070:
            if (r6 >= r5) goto L_0x00ae
            r7 = r4[r6]     // Catch:{ all -> 0x00ef }
            boolean r7 = r11.startsWith(r7)     // Catch:{ all -> 0x00ef }
            if (r7 == 0) goto L_0x00ab
            boolean r0 = f11468     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x0086
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f11461     // Catch:{ all -> 0x00ef }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00a9
        L_0x0086:
            java.lang.String[] r0 = f11459     // Catch:{ all -> 0x00ef }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = f11461     // Catch:{ all -> 0x00ef }
            java.util.Map r10 = m13411(r10, r0)     // Catch:{ all -> 0x00ef }
            r2.putAll(r10)     // Catch:{ all -> 0x00ef }
            f11468 = r1     // Catch:{ all -> 0x00ef }
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f11461     // Catch:{ all -> 0x00ef }
            boolean r10 = r10.containsKey(r11)     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x00a9
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f11461     // Catch:{ all -> 0x00ef }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x00ef }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r10 = r3
        L_0x00a7:
            monitor-exit(r12)     // Catch:{ all -> 0x00ef }
            return r10
        L_0x00a9:
            monitor-exit(r12)     // Catch:{ all -> 0x00ef }
            return r3
        L_0x00ab:
            int r6 = r6 + 1
            goto L_0x0070
        L_0x00ae:
            monitor-exit(r12)     // Catch:{ all -> 0x00ef }
            android.net.Uri r5 = f11463
            r6 = 0
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r1]
            r8[r2] = r11
            r9 = 0
            r4 = r10
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)
            if (r10 != 0) goto L_0x00c5
            if (r10 == 0) goto L_0x00c4
            r10.close()
        L_0x00c4:
            return r3
        L_0x00c5:
            boolean r12 = r10.moveToFirst()     // Catch:{ all -> 0x00ea }
            if (r12 != 0) goto L_0x00d2
            m13409(r0, r11, r3)     // Catch:{ all -> 0x00ea }
            r10.close()
            return r3
        L_0x00d2:
            java.lang.String r12 = r10.getString(r1)     // Catch:{ all -> 0x00ea }
            if (r12 == 0) goto L_0x00df
            boolean r1 = r12.equals(r3)     // Catch:{ all -> 0x00ea }
            if (r1 == 0) goto L_0x00df
            r12 = r3
        L_0x00df:
            m13409(r0, r11, r12)     // Catch:{ all -> 0x00ea }
            if (r12 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r12 = r3
        L_0x00e6:
            r10.close()
            return r12
        L_0x00ea:
            r11 = move-exception
            r10.close()
            throw r11
        L_0x00ef:
            r10 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00ef }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2524.m13408(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m13409(Object obj, String str, String str2) {
        synchronized (C2524.class) {
            if (obj == f11462) {
                f11461.put(str, str2);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Map<String, String> m13411(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f11458, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
