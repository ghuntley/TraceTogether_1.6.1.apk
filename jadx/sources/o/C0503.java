package o;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: o.ŀɨ  reason: contains not printable characters */
public final class C0503 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C0503 f4197;

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f4198 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean f4199;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f4200;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Status f4201;

    /* renamed from: і  reason: contains not printable characters */
    private final boolean f4202;

    private C0503(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.f170692131886159));
        boolean z = true;
        if (identifier != 0) {
            z = resources.getInteger(identifier) == 0 ? false : z;
            this.f4202 = !z;
        } else {
            this.f4202 = false;
        }
        this.f4199 = z;
        String r0 = C1826.m10088(context);
        if (r0 == null) {
            C1442 r02 = new C1442(context);
            int identifier2 = r02.f7785.getIdentifier("google_app_id", "string", r02.f7784);
            if (identifier2 == 0) {
                r0 = null;
            } else {
                r0 = r02.f7785.getString(identifier2);
            }
        }
        if (TextUtils.isEmpty(r0)) {
            this.f4201 = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f4200 = null;
            return;
        }
        this.f4200 = r0;
        this.f4201 = Status.f532;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Status m4905(Context context) {
        Status status;
        if (context != null) {
            synchronized (f4198) {
                if (f4197 == null) {
                    f4197 = new C0503(context);
                }
                status = f4197.f4201;
            }
            return status;
        }
        throw new NullPointerException("Context must not be null.");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m4902() {
        return m4903("getGoogleAppId").f4200;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m4904() {
        return m4903("isMeasurementExplicitlyDisabled").f4202;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C0503 m4903(String str) {
        C0503 r4;
        synchronized (f4198) {
            if (f4197 != null) {
                r4 = f4197;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return r4;
    }
}
