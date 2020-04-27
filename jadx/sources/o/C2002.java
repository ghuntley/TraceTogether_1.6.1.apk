package o;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import o.C1855;

/* renamed from: o.ιʀ  reason: contains not printable characters */
public final class C2002 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final List<String> f9948 = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final List<String> f9949 = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final List<String> f9950 = Arrays.asList((String[]) C2745.m14523((T[][]) new String[][]{AppMeasurement.C0056.f14446, AppMeasurement.C0056.f14447}));

    /* renamed from: Ι  reason: contains not printable characters */
    private static final List<String> f9951 = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: ι  reason: contains not printable characters */
    private static final List<String> f9952 = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m10802(String str) {
        return !f9951.contains(str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m10806(String str, Bundle bundle) {
        if (f9952.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : f9948) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m10807(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f9950.contains(str2)) {
            return false;
        }
        for (String matches : f9949) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m10803(C1855.C1856 r5) {
        String str;
        if (r5 == null || (str = r5.f9476) == null || str.isEmpty()) {
            return false;
        }
        if ((r5.f9481 != null && C0895.m6645(r5.f9481) == null) || !(!f9951.contains(str)) || !m10807(str, r5.f9478)) {
            return false;
        }
        if (r5.f9480 != null && (!m10806(r5.f9480, r5.f9490) || !m10808(str, r5.f9480, r5.f9490))) {
            return false;
        }
        if (r5.f9477 != null && (!m10806(r5.f9477, r5.f9487) || !m10808(str, r5.f9477, r5.f9487))) {
            return false;
        }
        if (r5.f9488 == null || (m10806(r5.f9488, r5.f9483) && m10808(str, r5.f9488, r5.f9483))) {
            return true;
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m10808(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!(!f9951.contains(str)) || bundle == null) {
            return false;
        }
        for (String containsKey : f9948) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c = 2;
                }
            } else if (str.equals("fdl")) {
                c = 1;
            }
        } else if (str.equals("fcm")) {
            c = 0;
        }
        if (c == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static AppMeasurement.ConditionalUserProperty m10804(C1855.C1856 r3) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mOrigin = r3.f9476;
        conditionalUserProperty.mActive = r3.f9479;
        conditionalUserProperty.mCreationTimestamp = r3.f9484;
        conditionalUserProperty.mExpiredEventName = r3.f9480;
        if (r3.f9490 != null) {
            conditionalUserProperty.mExpiredEventParams = new Bundle(r3.f9490);
        }
        conditionalUserProperty.mName = r3.f9478;
        conditionalUserProperty.mTimedOutEventName = r3.f9488;
        if (r3.f9483 != null) {
            conditionalUserProperty.mTimedOutEventParams = new Bundle(r3.f9483);
        }
        conditionalUserProperty.mTimeToLive = r3.f9489;
        conditionalUserProperty.mTriggeredEventName = r3.f9477;
        if (r3.f9487 != null) {
            conditionalUserProperty.mTriggeredEventParams = new Bundle(r3.f9487);
        }
        conditionalUserProperty.mTriggeredTimestamp = r3.f9482;
        conditionalUserProperty.mTriggerEventName = r3.f9486;
        conditionalUserProperty.mTriggerTimeout = r3.f9485;
        if (r3.f9481 != null) {
            conditionalUserProperty.mValue = C0895.m6645(r3.f9481);
        }
        return conditionalUserProperty;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C1855.C1856 m10801(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        C1855.C1856 r0 = new C1855.C1856();
        r0.f9476 = conditionalUserProperty.mOrigin;
        r0.f9479 = conditionalUserProperty.mActive;
        r0.f9484 = conditionalUserProperty.mCreationTimestamp;
        r0.f9480 = conditionalUserProperty.mExpiredEventName;
        if (conditionalUserProperty.mExpiredEventParams != null) {
            r0.f9490 = new Bundle(conditionalUserProperty.mExpiredEventParams);
        }
        r0.f9478 = conditionalUserProperty.mName;
        r0.f9488 = conditionalUserProperty.mTimedOutEventName;
        if (conditionalUserProperty.mTimedOutEventParams != null) {
            r0.f9483 = new Bundle(conditionalUserProperty.mTimedOutEventParams);
        }
        r0.f9489 = conditionalUserProperty.mTimeToLive;
        r0.f9477 = conditionalUserProperty.mTriggeredEventName;
        if (conditionalUserProperty.mTriggeredEventParams != null) {
            r0.f9487 = new Bundle(conditionalUserProperty.mTriggeredEventParams);
        }
        r0.f9482 = conditionalUserProperty.mTriggeredTimestamp;
        r0.f9486 = conditionalUserProperty.mTriggerEventName;
        r0.f9485 = conditionalUserProperty.mTriggerTimeout;
        if (conditionalUserProperty.mValue != null) {
            r0.f9481 = C0895.m6645(conditionalUserProperty.mValue);
        }
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m10805(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    static {
        new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    }
}
