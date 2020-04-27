package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: o.ɟյ  reason: contains not printable characters */
public final class C1170 extends C1519 {
    public static final Parcelable.Creator<C1170> CREATOR = new C1670();

    /* renamed from: ı  reason: contains not printable characters */
    private Cif f6738;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Bundle f6739;

    /* renamed from: Ι  reason: contains not printable characters */
    private Map<String, String> f6740;

    public C1170(Bundle bundle) {
        this.f6739 = bundle;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m7669() {
        return this.f6739.getString("from");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Map<String, String> m7668() {
        if (this.f6740 == null) {
            Bundle bundle = this.f6739;
            C0299 r1 = new C0299();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        r1.put(str, str2);
                    }
                }
            }
            this.f6740 = r1;
        }
        return this.f6740;
    }

    /* renamed from: o.ɟյ$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final String f6741;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f6742;

        private Cif(C3575lq lqVar) {
            this.f6742 = lqVar.m3649("gcm.n.title");
            lqVar.m3646("gcm.n.title");
            m7670(lqVar, "gcm.n.title");
            this.f6741 = lqVar.m3649("gcm.n.body");
            lqVar.m3646("gcm.n.body");
            m7670(lqVar, "gcm.n.body");
            lqVar.m3649("gcm.n.icon");
            if (TextUtils.isEmpty(lqVar.m3649("gcm.n.sound2"))) {
                lqVar.m3649("gcm.n.sound");
            }
            lqVar.m3649("gcm.n.tag");
            lqVar.m3649("gcm.n.color");
            lqVar.m3649("gcm.n.click_action");
            lqVar.m3649("gcm.n.android_channel_id");
            lqVar.m3652();
            lqVar.m3649("gcm.n.image");
            lqVar.m3649("gcm.n.ticker");
            lqVar.m3655("gcm.n.notification_priority");
            lqVar.m3655("gcm.n.visibility");
            lqVar.m3655("gcm.n.notification_count");
            "1".equals(lqVar.m3649("gcm.n.sticky"));
            "1".equals(lqVar.m3649("gcm.n.local_only"));
            "1".equals(lqVar.m3649("gcm.n.default_sound"));
            "1".equals(lqVar.m3649("gcm.n.default_vibrate_timings"));
            "1".equals(lqVar.m3649("gcm.n.default_light_settings"));
            lqVar.m3650("gcm.n.event_time");
            lqVar.m3647();
            lqVar.m3651();
        }

        /* renamed from: ı  reason: contains not printable characters */
        private static String[] m7670(C3575lq lqVar, String str) {
            Object[] r2 = lqVar.m3653(str);
            if (r2 == null) {
                return null;
            }
            String[] strArr = new String[r2.length];
            for (int i = 0; i < r2.length; i++) {
                strArr[i] = String.valueOf(r2[i]);
            }
            return strArr;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final String m7671() {
            return this.f6742;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final String m7672() {
            return this.f6741;
        }

        /* synthetic */ Cif(C3575lq lqVar, byte b) {
            this(lqVar);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Cif m7667() {
        if (this.f6738 == null && C3575lq.m3644(this.f6739)) {
            this.f6738 = new Cif(new C3575lq(this.f6739), (byte) 0);
        }
        return this.f6738;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14541(parcel, 2, this.f6739, false);
        C2745.m14531(parcel, dataPosition);
    }
}
