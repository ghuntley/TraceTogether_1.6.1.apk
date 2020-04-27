package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: o.ɩɂ  reason: contains not printable characters */
public final class C1252 implements ThreadFactory {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0910<String, String> f7078 = new C0910<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f7079;

    /* renamed from: ι  reason: contains not printable characters */
    private final ThreadFactory f7080;

    /* renamed from: ι  reason: contains not printable characters */
    public static String m8080(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.f170662131886156);
            case 2:
                return resources.getString(R.string.f170732131886163);
            case 3:
                return resources.getString(R.string.f170632131886153);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return m8081(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m8081(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return m8081(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m8081(context, "common_google_play_services_restricted_profile_title");
            default:
                return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m8076(Context context, int i) {
        String str;
        if (i == 6) {
            str = m8081(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m8080(context, i);
        }
        return str == null ? context.getResources().getString(R.string.f170682131886158) : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0096, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 26) == false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8075(android.content.Context r5, int r6) {
        /*
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r1 = m8079(r5)
            r2 = 0
            r3 = 1
            if (r6 == r3) goto L_0x00b1
            r4 = 2
            if (r6 == r4) goto L_0x0076
            r4 = 3
            if (r6 == r4) goto L_0x006a
            r4 = 5
            if (r6 == r4) goto L_0x0063
            r4 = 7
            if (r6 == r4) goto L_0x005c
            r4 = 9
            if (r6 == r4) goto L_0x0050
            r4 = 20
            if (r6 == r4) goto L_0x0049
            switch(r6) {
                case 16: goto L_0x0042;
                case 17: goto L_0x003b;
                case 18: goto L_0x002f;
                default: goto L_0x0023;
            }
        L_0x0023:
            r5 = 2131886159(0x7f12004f, float:1.9406889E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L_0x002f:
            r5 = 2131886164(0x7f120054, float:1.94069E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L_0x003b:
            java.lang.String r6 = "common_google_play_services_sign_in_failed_text"
            java.lang.String r5 = m8078(r5, r6, r1)
            return r5
        L_0x0042:
            java.lang.String r6 = "common_google_play_services_api_unavailable_text"
            java.lang.String r5 = m8078(r5, r6, r1)
            return r5
        L_0x0049:
            java.lang.String r6 = "common_google_play_services_restricted_profile_text"
            java.lang.String r5 = m8078(r5, r6, r1)
            return r5
        L_0x0050:
            r5 = 2131886160(0x7f120050, float:1.940689E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L_0x005c:
            java.lang.String r6 = "common_google_play_services_network_error_text"
            java.lang.String r5 = m8078(r5, r6, r1)
            return r5
        L_0x0063:
            java.lang.String r6 = "common_google_play_services_invalid_account_text"
            java.lang.String r5 = m8078(r5, r6, r1)
            return r5
        L_0x006a:
            r5 = 2131886152(0x7f120048, float:1.9406875E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L_0x0076:
            boolean r6 = o.C2173.m11531(r5)
            if (r6 == 0) goto L_0x009a
            int r6 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r6 < r4) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            if (r6 == 0) goto L_0x0098
            boolean r5 = o.C2173.m11530(r5)
            if (r5 == 0) goto L_0x009a
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L_0x0095
            r5 = 1
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 != 0) goto L_0x009a
        L_0x0098:
            r5 = 1
            goto L_0x009b
        L_0x009a:
            r5 = 0
        L_0x009b:
            if (r5 == 0) goto L_0x00a5
            r5 = 2131886165(0x7f120055, float:1.9406901E38)
            java.lang.String r5 = r0.getString(r5)
            return r5
        L_0x00a5:
            r5 = 2131886162(0x7f120052, float:1.9406895E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L_0x00b1:
            r5 = 2131886155(0x7f12004b, float:1.940688E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1252.m8075(android.content.Context, int):java.lang.String");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m8077(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.f170642131886154);
        }
        if (i == 2) {
            return resources.getString(R.string.f170712131886161);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.f170612131886151);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m8079(Context context) {
        String packageName = context.getPackageName();
        try {
            C2341 r1 = C2059.f10120.m10963(context);
            return r1.f10837.getPackageManager().getApplicationLabel(r1.f10837.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m8078(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String r2 = m8081(context, str);
        if (r2 == null) {
            r2 = resources.getString(R.string.f170692131886159);
        }
        return String.format(resources.getConfiguration().locale, r2, new Object[]{str2});
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m8081(Context context, String str) {
        synchronized (f7078) {
            String str2 = f7078.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            f7078.put(str, string);
            return string;
        }
    }

    public C1252(String str, byte b) {
        this(str);
    }

    private C1252(String str) {
        this.f7080 = Executors.defaultThreadFactory();
        if (str != null) {
            this.f7079 = str;
            return;
        }
        throw new NullPointerException("Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7080.newThread(new C2297(runnable, 0));
        newThread.setName(this.f7079);
        return newThread;
    }
}
