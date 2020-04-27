package o;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import o.C0976;

/* renamed from: o.ʙӀ  reason: contains not printable characters */
public final class C1671 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2880 f8682 = new C2880() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15798(Object obj, Writer writer) {
            C3150 r0 = new C3150(writer, C3116.this.f14232, C3116.this.f14233);
            r0.m15938(obj);
            if (r0.f14358) {
                r0.f14356.flush();
                return;
            }
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String m15797(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                m15798(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    public static void m9546(Intent intent, C1781<String> r3) {
        m9540("_nr", intent);
        if (r3 != null) {
            try {
                r3.m9898(new C1743(f8682.m14945(new C0976.C0979(new C0976("MESSAGE_DELIVERED", intent))), C1766.VERY_LOW));
            } catch (C3021 unused) {
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m9539(Intent intent) {
        C1855 r0;
        if (!(intent == null || !"1".equals(intent.getStringExtra("google.c.a.tc")) || (r0 = (C1855) FirebaseApp.getInstance().m1077(C1855.class)) == null)) {
            String stringExtra = intent.getStringExtra("google.c.a.c_id");
            r0.m10222("fcm", "_ln", stringExtra);
            Bundle bundle = new Bundle();
            bundle.putString("source", "Firebase");
            bundle.putString("medium", "notification");
            bundle.putString("campaign", stringExtra);
            r0.m10224("fcm", "_cmp", bundle);
        }
        m9540("_no", intent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m9545(Intent intent) {
        m9540("_nd", intent);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m9532(Intent intent) {
        m9540("_nf", intent);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m9533() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            com.google.firebase.FirebaseApp.getInstance()     // Catch:{ IllegalStateException -> 0x0046 }
            com.google.firebase.FirebaseApp r2 = com.google.firebase.FirebaseApp.getInstance()
            android.content.Context r2 = r2.m1074()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0021
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0021:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1671.m9533():boolean");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m9540(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        String str2 = null;
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        String stringExtra6 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException unused) {
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            str2 = intent.getStringExtra("google.c.a.udt");
        }
        if (str2 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(str2));
            } catch (NumberFormatException unused2) {
            }
        }
        String str3 = (intent.getExtras() == null || !C3575lq.m3644(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str3);
        }
        C1855 r5 = (C1855) FirebaseApp.getInstance().m1077(C1855.class);
        if (r5 != null) {
            r5.m10224("fcm", str, bundle);
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    static int m9549(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    static String m9541(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* renamed from: і  reason: contains not printable characters */
    static String m9548(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* renamed from: І  reason: contains not printable characters */
    static String m9547(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    static String m9534(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static String m9542() {
        return FirebaseApp.getInstance().m1074().getPackageName();
    }

    /* renamed from: ι  reason: contains not printable characters */
    static String m9544() {
        FirebaseInstanceId instance = FirebaseInstanceId.getInstance(FirebaseApp.getInstance());
        FirebaseInstanceId.m1107(instance.f983);
        instance.m1112();
        return instance.m1118();
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    static String m9537(Intent intent) {
        return (intent.getExtras() == null || !C3575lq.m3644(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    static String m9538(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    static int m9550(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        if ("normal".equals(stringExtra)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static String m9535() {
        FirebaseApp instance = FirebaseApp.getInstance();
        String str = instance.m1075().f8950;
        if (str != null) {
            return str;
        }
        String str2 = instance.m1075().f8951;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m9536(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m9543(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return m9533();
    }
}
