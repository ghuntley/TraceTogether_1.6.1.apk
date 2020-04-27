package o;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: o.am  reason: case insensitive filesystem */
public abstract class C3273am {

    /* renamed from: ł  reason: contains not printable characters */
    public static final String f1518 = "android";

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final String f1519 = "X-CRASHLYTICS-API-CLIENT-VERSION";

    /* renamed from: ȷ  reason: contains not printable characters */
    public static final String f1520 = "Accept";

    /* renamed from: ɨ  reason: contains not printable characters */
    public static final String f1521 = "470fa2b4ae81cd56ecbcda9735803434cec591fa";

    /* renamed from: ɪ  reason: contains not printable characters */
    public static final String f1522 = "User-Agent";

    /* renamed from: ɹ  reason: contains not printable characters */
    public static final String f1523 = "X-CRASHLYTICS-API-KEY";

    /* renamed from: ɾ  reason: contains not printable characters */
    public static final String f1524 = "Crashlytics Android SDK/";

    /* renamed from: ι  reason: contains not printable characters */
    private static final Pattern f1525 = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: І  reason: contains not printable characters */
    public static final String f1526 = "X-CRASHLYTICS-DEVELOPER-TOKEN";

    /* renamed from: г  reason: contains not printable characters */
    public static final int f1527 = 10000;

    /* renamed from: і  reason: contains not printable characters */
    public static final String f1528 = "X-CRASHLYTICS-API-CLIENT-TYPE";

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static final String f1529 = "X-REQUEST-ID";

    /* renamed from: ӏ  reason: contains not printable characters */
    public static final String f1530 = "application/json";

    /* renamed from: ı  reason: contains not printable characters */
    private final String f1531;

    /* renamed from: ŀ  reason: contains not printable characters */
    public final C3269ai f1532;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3301bl f1533;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f1534;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3302bm f1535;

    public C3273am(C3269ai aiVar, String str, String str2, C3301bl blVar, C3302bm bmVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (blVar != null) {
            this.f1532 = aiVar;
            this.f1534 = str;
            this.f1531 = m1605(str2);
            this.f1533 = blVar;
            this.f1535 = bmVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public String m1608() {
        return this.f1531;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public C3298bi m1606() {
        return m1607(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C3298bi m1607(Map<String, String> map) {
        C3298bi r4 = this.f1533.m1822(this.f1535, m1608(), map);
        if (r4.f1751 == null) {
            r4.f1751 = r4.m1802();
        }
        r4.f1751.setUseCaches(false);
        if (r4.f1751 == null) {
            r4.f1751 = r4.m1802();
        }
        r4.f1751.setConnectTimeout(f1527);
        StringBuilder sb = new StringBuilder(f1524);
        sb.append(this.f1532.m1597());
        String obj = sb.toString();
        if (r4.f1751 == null) {
            r4.f1751 = r4.m1802();
        }
        r4.f1751.setRequestProperty(f1522, obj);
        if (r4.f1751 == null) {
            r4.f1751 = r4.m1802();
        }
        r4.f1751.setRequestProperty(f1526, f1521);
        return r4;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private String m1605(String str) {
        return !C3285aw.m1668(this.f1534) ? f1525.matcher(str).replaceFirst(this.f1534) : str;
    }
}
