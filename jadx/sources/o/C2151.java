package o;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import o.C2745;

/* renamed from: o.ϜΙ  reason: contains not printable characters */
public final class C2151 extends C3067 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String[] f10308 = {"firebase_", "google_", "ga_"};

    /* renamed from: ǃ  reason: contains not printable characters */
    private Integer f10309 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    private SecureRandom f10310;

    /* renamed from: Ι  reason: contains not printable characters */
    private final AtomicLong f10311 = new AtomicLong(0);

    /* renamed from: ι  reason: contains not printable characters */
    private int f10312;

    C2151(C2658 r3) {
        super(r3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11406() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m11373() {
        y_();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                t_().A_().m11606("Utils falling back to Random for random id");
            }
        }
        this.f10311.set(nextLong);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m11378() {
        long andIncrement;
        long j;
        if (this.f10311.get() == 0) {
            synchronized (this.f10311) {
                long nextLong = new Random(System.nanoTime() ^ w_().m10846()).nextLong();
                int i = this.f10312 + 1;
                this.f10312 = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f10311) {
            this.f10311.compareAndSet(-1, 1);
            andIncrement = this.f10311.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final SecureRandom m11390() {
        y_();
        if (this.f10310 == null) {
            this.f10310 = new SecureRandom();
        }
        return this.f10310;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m11345(String str) {
        C2745.C2746.m14562(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final Bundle m11370(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            t_().A_().m11603("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m11351(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m11386(String str, String str2) {
        if (str2 == null) {
            t_().m11712().m11603("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            t_().m11712().m11603("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                t_().m11712().m11605("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    t_().m11712().m11605("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m11392(String str, String str2) {
        if (str2 == null) {
            t_().m11712().m11603("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            t_().m11712().m11603("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        t_().m11712().m11605("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            t_().m11712().m11605("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11407(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            t_().m11712().m11603("Name is required and can't be null. Type", str);
            return false;
        }
        C2745.C2746.m14555(str2);
        String[] strArr2 = f10308;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            t_().m11712().m11605("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !m11346(str2, strArr)) {
            return true;
        } else {
            t_().m11712().m11605("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m11374(String str, int i, String str2) {
        if (str2 == null) {
            t_().m11712().m11603("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            t_().m11712().m11604("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m11387(String str) {
        if (!m11392("event", str)) {
            return 2;
        }
        if (!m11407("event", C2983.f13759, str)) {
            return 13;
        }
        if (!m11374("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m11400(String str) {
        if (!m11392("user property", str)) {
            return 6;
        }
        if (!m11407("user property", C3181.f14446, str)) {
            return 15;
        }
        if (!m11374("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int m11353(String str) {
        if (!m11386("event param", str)) {
            return 3;
        }
        if (!m11407("event param", (String[]) null, str)) {
            return 14;
        }
        if (!m11374("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int m11341(String str) {
        if (!m11392("event param", str)) {
            return 3;
        }
        if (!m11407("event param", (String[]) null, str)) {
            return 14;
        }
        if (!m11374("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m11365(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean m11366(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i2 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i2 > i) {
            t_().m11708().m11604("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
            return false;
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m11357(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                t_().m11708().m11604("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m11361(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        C2151 r9 = this;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean r13 = r_().m13372(C2529.f11574);
            int i3 = r13 ? 10 : 25;
            int i4 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    i = z ? r9.m11353(str6) : 0;
                    if (i == 0) {
                        i = r9.m11341(str6);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    m11344(bundle2, i, str6, str6, (Object) i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (m11365(bundle2.get(str6))) {
                        t_().m11708().m11604("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i2 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = m11359(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        m11344(bundle2, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m11345(str4) && (!r13 || !m11346(str4, C3209.f14567))) {
                        int i5 = i4 + 1;
                        if (i5 > i3) {
                            StringBuilder sb = new StringBuilder(63);
                            sb.append("Child bundles can't contain more than ");
                            sb.append(i3);
                            sb.append(" custom params");
                            t_().m11712().m11605(sb.toString(), v_().m11216(str5), v_().m11221(bundle2));
                            m11363(bundle2, r13 ? 23 : 5);
                            bundle2.remove(str4);
                            r9 = this;
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                }
                r9 = this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m11399(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (m11368(str)) {
                return true;
            }
            if (this.f14314.m14092()) {
                t_().m11712().m11603("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2244.m11698(str));
            }
            return false;
        } else if (C1306.m8256() && r_().m13372(C2529.f11605) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.f14314.m14092()) {
                    t_().m11712().m11606("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m11368(str2)) {
                return true;
            } else {
                t_().m11712().m11603("Invalid admob_app_id. Analytics disabled.", C2244.m11698(str2));
                return false;
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m11358(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: і  reason: contains not printable characters */
    private static boolean m11368(String str) {
        C2745.C2746.m14555(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object m11343(int i, Object obj, boolean z, boolean z2) {
        Bundle r0;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m11338(String.valueOf(obj), i, z);
            }
            if (!C0369.m4560() || !r_().m13372(C2529.f11587) || !r_().m13372(C2529.f11577) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (r0 = m11389((Bundle) parcelable)) != null && !r0.isEmpty()) {
                    arrayList.add(r0);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m11338(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m11359(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.y_()
            boolean r2 = o.C0369.m4560()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 0
            if (r2 == 0) goto L_0x0070
            o.ьɹ r2 = r17.r_()
            o.ιͱ<java.lang.Boolean> r5 = o.C2529.f11574
            boolean r2 = r2.m13372((o.C2019<java.lang.Boolean>) r5)
            if (r2 == 0) goto L_0x0070
            boolean r2 = m11365((java.lang.Object) r21)
            if (r2 == 0) goto L_0x007b
            if (r25 == 0) goto L_0x006d
            java.lang.String[] r2 = o.C3209.f14566
            boolean r2 = m11346((java.lang.String) r8, (java.lang.String[]) r2)
            if (r2 != 0) goto L_0x0035
            r0 = 20
            return r0
        L_0x0035:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.m11366((java.lang.String) r4, (java.lang.String) r8, (int) r2, (java.lang.Object) r0)
            if (r5 != 0) goto L_0x007b
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x0051
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x006a
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x006a
        L_0x0051:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x006a
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x006a
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r9, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x006a:
            r10 = 17
            goto L_0x007c
        L_0x006d:
            r0 = 21
            return r0
        L_0x0070:
            if (r25 == 0) goto L_0x007b
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.m11366((java.lang.String) r4, (java.lang.String) r8, (int) r1, (java.lang.Object) r0)
            if (r1 != 0) goto L_0x007b
            return r3
        L_0x007b:
            r10 = 0
        L_0x007c:
            o.ьɹ r1 = r17.r_()
            o.ιͱ<java.lang.Boolean> r2 = o.C2529.f11544
            r11 = r18
            boolean r1 = r1.m13384(r11, r2)
            if (r1 == 0) goto L_0x0090
            boolean r1 = m11339((java.lang.String) r19)
            if (r1 != 0) goto L_0x0096
        L_0x0090:
            boolean r1 = m11339((java.lang.String) r20)
            if (r1 == 0) goto L_0x0099
        L_0x0096:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x009b
        L_0x0099:
            r1 = 100
        L_0x009b:
            boolean r1 = r7.m11357((java.lang.String) r4, (java.lang.String) r8, (int) r1, (java.lang.Object) r0)
            if (r1 == 0) goto L_0x00a2
            return r10
        L_0x00a2:
            if (r25 == 0) goto L_0x0158
            boolean r1 = o.C0369.m4560()
            r12 = 1
            if (r1 == 0) goto L_0x00b9
            o.ьɹ r1 = r17.r_()
            o.ιͱ<java.lang.Boolean> r2 = o.C2529.f11587
            boolean r1 = r1.m13372((o.C2019<java.lang.Boolean>) r2)
            if (r1 == 0) goto L_0x00b9
            r13 = 1
            goto L_0x00ba
        L_0x00b9:
            r13 = 0
        L_0x00ba:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00d4
            if (r13 == 0) goto L_0x0155
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m11361(r1, r2, r3, r4, r5, r6)
            goto L_0x0155
        L_0x00d4:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0113
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = 0
        L_0x00dd:
            if (r6 >= r15) goto L_0x0155
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x00f7
            o.Іɛ r1 = r17.t_()
            o.ϵı r1 = r1.m11708()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.m11605(r2, r0, r8)
            goto L_0x0154
        L_0x00f7:
            if (r13 == 0) goto L_0x010e
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.m11361(r1, r2, r3, r4, r5, r6)
            goto L_0x0110
        L_0x010e:
            r16 = r6
        L_0x0110:
            int r6 = r16 + 1
            goto L_0x00dd
        L_0x0113:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0154
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = 0
        L_0x011f:
            if (r0 >= r15) goto L_0x0155
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x013d
            o.Іɛ r0 = r17.t_()
            o.ϵı r0 = r0.m11708()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.m11605(r2, r1, r8)
            goto L_0x0154
        L_0x013d:
            if (r13 == 0) goto L_0x0151
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m11361(r1, r2, r3, r4, r5, r6)
        L_0x0151:
            r0 = r16
            goto L_0x011f
        L_0x0154:
            r12 = 0
        L_0x0155:
            if (r12 == 0) goto L_0x0158
            return r10
        L_0x0158:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2151.m11359(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final Object m11401(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m11343(256, obj, true, true);
        }
        if (!m11339(str)) {
            i = 100;
        }
        return m11343(i, obj, false, true);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static Bundle[] m11348(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle m11395(java.lang.String r22, java.lang.String r23, android.os.Bundle r24, java.util.List<java.lang.String> r25, boolean r26, boolean r27) {
        /*
            r21 = this;
            r9 = r21
            r10 = r23
            r11 = r24
            r12 = r25
            boolean r0 = o.C0369.m4560()
            r13 = 0
            if (r0 == 0) goto L_0x001e
            o.ьɹ r0 = r21.r_()
            o.ιͱ<java.lang.Boolean> r1 = o.C2529.f11574
            boolean r0 = r0.m13372((o.C2019<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x001e
            r0 = 1
            r14 = 1
            goto L_0x001f
        L_0x001e:
            r14 = 0
        L_0x001f:
            if (r14 == 0) goto L_0x0029
            java.lang.String[] r0 = o.C2983.f13758
            boolean r0 = m11346((java.lang.String) r10, (java.lang.String[]) r0)
            r15 = r0
            goto L_0x002b
        L_0x0029:
            r15 = r27
        L_0x002b:
            r16 = 0
            if (r11 == 0) goto L_0x0125
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r11)
            o.ьɹ r0 = r21.r_()
            o.ιͱ<java.lang.Boolean> r1 = o.C2529.f11566
            r7 = r22
            boolean r0 = r0.m13384(r7, r1)
            if (r0 == 0) goto L_0x004c
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r24.keySet()
            r0.<init>(r1)
            goto L_0x0050
        L_0x004c:
            java.util.Set r0 = r24.keySet()
        L_0x0050:
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
        L_0x0056:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r17.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            if (r12 == 0) goto L_0x006e
            boolean r0 = r12.contains(r6)
            if (r0 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r0 = 0
            goto L_0x007c
        L_0x006e:
            if (r26 == 0) goto L_0x0075
            int r0 = r9.m11353(r6)
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            if (r0 != 0) goto L_0x007c
            int r0 = r9.m11341(r6)
        L_0x007c:
            if (r0 == 0) goto L_0x008d
            r1 = 3
            if (r0 != r1) goto L_0x0083
            r1 = r6
            goto L_0x0085
        L_0x0083:
            r1 = r16
        L_0x0085:
            m11344((android.os.Bundle) r8, (int) r0, (java.lang.String) r6, (java.lang.String) r6, (java.lang.Object) r1)
            r8.remove(r6)
            r2 = r8
            goto L_0x00d7
        L_0x008d:
            java.lang.Object r4 = r11.get(r6)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r6
            r5 = r8
            r19 = r6
            r6 = r25
            r7 = r26
            r20 = r8
            r8 = r15
            int r0 = r0.m11359(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 == 0) goto L_0x00b8
            r1 = 17
            if (r0 != r1) goto L_0x00b8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r3 = r19
            r2 = r20
            m11344((android.os.Bundle) r2, (int) r0, (java.lang.String) r3, (java.lang.String) r3, (java.lang.Object) r1)
            goto L_0x00dc
        L_0x00b8:
            r3 = r19
            r2 = r20
            if (r0 == 0) goto L_0x00dc
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00dc
            r1 = 21
            if (r0 != r1) goto L_0x00cc
            r1 = r10
            goto L_0x00cd
        L_0x00cc:
            r1 = r3
        L_0x00cd:
            java.lang.Object r4 = r11.get(r3)
            m11344((android.os.Bundle) r2, (int) r0, (java.lang.String) r1, (java.lang.String) r3, (java.lang.Object) r4)
            r2.remove(r3)
        L_0x00d7:
            r7 = r22
        L_0x00d9:
            r8 = r2
            goto L_0x0056
        L_0x00dc:
            boolean r0 = m11345((java.lang.String) r3)
            if (r0 == 0) goto L_0x00d7
            int r0 = r18 + 1
            r1 = 25
            if (r0 <= r1) goto L_0x011f
            r1 = 48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Event can't contain more than 25 params"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            o.Іɛ r4 = r21.t_()
            o.ϵı r4 = r4.m11712()
            o.κІ r5 = r21.v_()
            java.lang.String r5 = r5.m11216((java.lang.String) r10)
            o.κІ r6 = r21.v_()
            java.lang.String r6 = r6.m11221((android.os.Bundle) r11)
            r4.m11605(r1, r5, r6)
            r1 = 5
            m11363((android.os.Bundle) r2, (int) r1)
            r2.remove(r3)
            r7 = r22
            r18 = r0
            goto L_0x00d9
        L_0x011f:
            r18 = r0
            goto L_0x00d7
        L_0x0122:
            r2 = r8
            r16 = r2
        L_0x0125:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2151.m11395(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m11344(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m11363(bundle, i)) {
            bundle.putString("_ev", m11338(str, 40, true));
            if (obj != null) {
                C2745.C2746.m14555(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m11363(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: І  reason: contains not printable characters */
    private final int m11367(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!r_().m13372(C2529.f11579) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m11388(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = m11357("user property referrer", str, m11367(str), obj);
        } else {
            z = m11357("user property", str, m11367(str), obj);
        }
        return z ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final Object m11371(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m11343(m11367(str), obj, true, false);
        }
        return m11343(m11367(str), obj, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11381(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (C0369.m4560() && r_().m13372(C2529.f11587) && r_().m13372(C2529.f11577) && (obj instanceof Bundle[])) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                t_().m11708().m11605("Not putting event parameter. Invalid value type. name, type", v_().m11219(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11403(int i, String str, String str2, int i2) {
        m11382((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11382(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m11363(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f14314.q_();
        this.f14314.m14100().m4344("auto", "_err", bundle);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static MessageDigest m11355() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static long m11337(byte[] bArr) {
        C2745.C2746.m14555(bArr);
        int i = 0;
        C2745.C2746.m14557(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m11356(Context context, boolean z) {
        C2745.C2746.m14555(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m11362(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m11362(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m11362(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m11398(String str) {
        y_();
        if (C2059.m10962(m15904()).m12202(str) == 0) {
            return true;
        }
        t_().m11711().m11603("Permission not granted", str);
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static boolean m11339(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(C3292bc.f1729);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static boolean m11340(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static boolean m11364(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m11352(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean m11410(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String r0 = r_().m13380();
        q_();
        return r0.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final Bundle m11389(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object r3 = m11401(str, bundle.get(str));
                if (r3 == null) {
                    t_().m11708().m11603("Param value can't be null", v_().m11219(str));
                } else {
                    m11381(bundle2, str, r3);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2441 m11402(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m11387(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            return new C2441(str2, new C2433(m11389(m11395(str, str2, bundle3, C2745.m14527("_o"), false, false))), str3, j);
        }
        t_().m11714().m11603("Invalid conditional property event name", v_().m11222(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m11379(Context context, String str) {
        y_();
        C2745.C2746.m14555(context);
        C2745.C2746.m14562(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest r1 = m11355();
        if (r1 == null) {
            t_().m11714().m11606("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m11350(context, str)) {
                    PackageInfo r7 = C2059.m10962(context).m12204(m15904().getPackageName(), 64);
                    if (r7.signatures != null && r7.signatures.length > 0) {
                        return m11337(r1.digest(r7.signatures[0].toByteArray()));
                    }
                    t_().A_().m11606("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                t_().m11714().m11603("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m11350(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo r3 = C2059.m10962(context).m12204(str, 64);
            if (r3 == null || r3.signatures == null || r3.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(r3.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            t_().m11714().m11603("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            t_().m11714().m11603("Package name not found", e2);
            return true;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static byte[] m11347(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Bundle m11342(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m11346(String str, String[] strArr) {
        C2745.C2746.m14555(strArr);
        for (String r3 : strArr) {
            if (m11340(str, r3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final int m11394() {
        if (this.f10309 == null) {
            this.f10309 = Integer.valueOf(C2837.m14802().m14803(m15904()) / 1000);
        }
        return this.f10309.intValue();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m11369(int i) {
        return C2837.m14802().m14807(m15904(), C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static long m11349(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ƚ  reason: contains not printable characters */
    public final String m11377() {
        byte[] bArr = new byte[16];
        m11390().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11380(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            t_().A_().m11603("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11397(C1818 r3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            r3.m10015(bundle);
        } catch (RemoteException e) {
            this.f14314.t_().A_().m11603("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11404(C1818 r3, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            r3.m10015(bundle);
        } catch (RemoteException e) {
            this.f14314.t_().A_().m11603("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11383(C1818 r3, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            r3.m10015(bundle);
        } catch (RemoteException e) {
            this.f14314.t_().A_().m11603("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11405(C1818 r3, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            r3.m10015(bundle);
        } catch (RemoteException e) {
            this.f14314.t_().A_().m11603("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11385(C1818 r3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            r3.m10015(bundle);
        } catch (RemoteException e) {
            this.f14314.t_().A_().m11603("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11396(C1818 r2, Bundle bundle) {
        try {
            r2.m10015(bundle);
        } catch (RemoteException e) {
            this.f14314.t_().A_().m11603("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Bundle m11354(List<C2113> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C2113 next : list) {
            if (next.f10237 != null) {
                bundle.putString(next.f10236, next.f10237);
            } else if (next.f10234 != null) {
                bundle.putLong(next.f10236, next.f10234.longValue());
            } else if (next.f10233 != null) {
                bundle.putDouble(next.f10236, next.f10233.doubleValue());
            }
        }
        return bundle;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11384(C1818 r3, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            r3.m10015(bundle);
        } catch (RemoteException e) {
            this.f14314.t_().A_().m11603("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static ArrayList<Bundle> m11360(List<C2527> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C2527 next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f11486);
            bundle.putString("origin", next.f11485);
            bundle.putLong("creation_timestamp", next.f11479);
            bundle.putString("name", next.f11482.f10236);
            C3146.m15932(bundle, next.f11482.m11268());
            bundle.putBoolean("active", next.f11481);
            if (next.f11484 != null) {
                bundle.putString("trigger_event_name", next.f11484);
            }
            if (next.f11489 != null) {
                bundle.putString("timed_out_event_name", next.f11489.f11089);
                if (next.f11489.f11090 != null) {
                    bundle.putBundle("timed_out_event_params", next.f11489.f11090.m12527());
                }
            }
            bundle.putLong("trigger_timeout", next.f11488);
            if (next.f11487 != null) {
                bundle.putString("triggered_event_name", next.f11487.f11089);
                if (next.f11487.f11090 != null) {
                    bundle.putBundle("triggered_event_params", next.f11487.f11090.m12527());
                }
            }
            bundle.putLong("triggered_timestamp", next.f11482.f10232);
            bundle.putLong("time_to_live", next.f11480);
            if (next.f11483 != null) {
                bundle.putString("expired_event_name", next.f11483.f11089);
                if (next.f11483.f11090 != null) {
                    bundle.putBundle("expired_event_params", next.f11483.f11090.m12527());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final URL m11372(long j, String str, String str2, long j2) {
        try {
            C2745.C2746.m14562(str2);
            C2745.C2746.m14562(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(m11394())}), str2, str, Long.valueOf(j2)});
            if (str.equals(r_().m13373())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            t_().m11714().m11603("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m11391(String str, double d) {
        try {
            SharedPreferences.Editor edit = m15904().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (Exception e) {
            t_().m11714().m11603("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public final boolean m11376() {
        try {
            m15904().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static long m11336(C2433 r5) {
        long j = 0;
        if (r5 == null) {
            return 0;
        }
        Iterator<String> it = r5.iterator();
        while (it.hasNext()) {
            Object r3 = r5.m12532(it.next());
            if (r3 instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) r3).length;
            }
        }
        return j;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11375() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11409() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11408() {
        super.m15902();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m11411() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m11393() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
