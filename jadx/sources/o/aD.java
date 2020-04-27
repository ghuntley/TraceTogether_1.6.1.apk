package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import o.mG;

public final class aD {

    /* renamed from: ı  reason: contains not printable characters */
    public static final String f1389 = Pattern.quote("/");

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final Pattern f1390 = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Context f1391;

    /* renamed from: ȷ  reason: contains not printable characters */
    private mG.C0235 f1392;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final aF f1393;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final ReentrantLock f1394 = new ReentrantLock();

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean f1395;

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean f1396;

    /* renamed from: І  reason: contains not printable characters */
    private C3277aq f1397;

    /* renamed from: і  reason: contains not printable characters */
    private final Collection<C3269ai> f1398;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String f1399;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f1400;

    /* renamed from: o.aD$ı  reason: contains not printable characters */
    public enum C0107 {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        

        /* renamed from: ι  reason: contains not printable characters */
        public final int f1409;

        private C0107(int i) {
            this.f1409 = i;
        }
    }

    public aD(Context context, String str, Collection<C3269ai> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f1391 = context;
            this.f1399 = str;
            this.f1398 = collection;
            this.f1393 = new aF();
            this.f1397 = new C3277aq(context);
            this.f1395 = C3285aw.m1692(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (!this.f1395) {
                C3263ac.m1563();
            }
            this.f1396 = C3285aw.m1692(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f1396) {
                C3263ac.m1563();
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m1459() {
        SharedPreferences r0 = C3285aw.m1658(this.f1391);
        mG.C0235 r1 = m1460();
        if (r1 != null) {
            m1457(r0, r1.f3096);
        }
        String string = r0.getString("crashlytics.installation.id", (String) null);
        return string == null ? m1455(r0) : string;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m1458() {
        return String.format(Locale.US, "%s/%s", new Object[]{Build.MANUFACTURER.replaceAll(f1389, ""), Build.MODEL.replaceAll(f1389, "")});
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m1456(String str) {
        return str.replaceAll(f1389, "");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: ı  reason: contains not printable characters */
    private String m1455(SharedPreferences sharedPreferences) {
        this.f1394.lock();
        String str = null;
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            if (string == null) {
                String obj = UUID.randomUUID().toString();
                if (obj != null) {
                    str = f1390.matcher(obj).replaceAll("").toLowerCase(Locale.US);
                }
                string = str;
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            return string;
        } finally {
            this.f1394.unlock();
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: ı  reason: contains not printable characters */
    private void m1457(SharedPreferences sharedPreferences, String str) {
        this.f1394.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString("crashlytics.advertising.id", (String) null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString("crashlytics.advertising.id", str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str).commit();
                }
            }
        } finally {
            this.f1394.unlock();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Map<C0107, String> m1461() {
        HashMap hashMap = new HashMap();
        for (C3269ai next : this.f1398) {
            if (next instanceof C3288az) {
                for (Map.Entry next2 : ((C3288az) next).m1699().entrySet()) {
                    C0107 r4 = (C0107) next2.getKey();
                    String str = (String) next2.getValue();
                    if (str != null) {
                        hashMap.put(r4, str);
                    }
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized mG.C0235 m1460() {
        if (!this.f1400) {
            C3277aq aqVar = this.f1397;
            mG.C0235 r3 = new mG.C0235(aqVar.f1536.m1830().getString("advertising_id", ""), aqVar.f1536.m1830().getBoolean("limit_ad_tracking_enabled", false));
            if (!TextUtils.isEmpty(r3.f3096)) {
                C3263ac.m1563();
                new Thread(new C3280at(r3) {

                    /* renamed from: ι  reason: contains not printable characters */
                    private /* synthetic */ mG.C0235 f1539;

                    {
                        this.f1539 = r2;
                    }

                    /* renamed from: ı  reason: contains not printable characters */
                    public final void m1620() {
                        mG.C0235 r0 = C3277aq.this.m1618();
                        if (!this.f1539.equals(r0)) {
                            C3263ac.m1563();
                            C3277aq.this.m1619(r0);
                        }
                    }
                }).start();
            } else {
                r3 = aqVar.m1618();
                aqVar.m1619(r3);
            }
            this.f1392 = r3;
            this.f1400 = true;
        }
        return this.f1392;
    }
}
