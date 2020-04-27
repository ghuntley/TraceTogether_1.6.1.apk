package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: o.lq  reason: case insensitive filesystem */
public final class C3575lq {

    /* renamed from: ı  reason: contains not printable characters */
    private final Bundle f2948;

    public C3575lq() {
    }

    public C3575lq(Bundle bundle) {
        if (bundle != null) {
            this.f2948 = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m3649(String str) {
        String str2;
        Bundle bundle = this.f2948;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.f2948.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Integer m3655(String str) {
        String r2 = m3649(str);
        if (TextUtils.isEmpty(r2)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(r2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Long m3650(String str) {
        String r3 = m3649(str);
        if (TextUtils.isEmpty(r3)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(r3));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m3646(String str) {
        String valueOf = String.valueOf(str);
        return m3649("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object[] m3653(String str) {
        String valueOf = String.valueOf(str);
        JSONArray r4 = m3645("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (r4 == null) {
            return null;
        }
        String[] strArr = new String[r4.length()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = r4.optString(i);
        }
        return strArr;
    }

    /* renamed from: І  reason: contains not printable characters */
    private JSONArray m3645(String str) {
        String r2 = m3649(str);
        if (TextUtils.isEmpty(r2)) {
            return null;
        }
        try {
            return new JSONArray(r2);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Uri m3652() {
        String r0 = m3649("gcm.n.link_android");
        if (TextUtils.isEmpty(r0)) {
            r0 = m3649("gcm.n.link");
        }
        if (!TextUtils.isEmpty(r0)) {
            return Uri.parse(r0);
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long[] m3651() {
        JSONArray r0 = m3645("gcm.n.vibrate_timings");
        if (r0 == null) {
            return null;
        }
        try {
            if (r0.length() > 1) {
                long[] jArr = new long[r0.length()];
                for (int i = 0; i < jArr.length; i++) {
                    jArr[i] = r0.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int[] m3647() {
        JSONArray r0 = m3645("gcm.n.light_settings");
        if (r0 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (r0.length() == 3) {
                int parseColor = Color.parseColor(r0.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = r0.optInt(1);
                    iArr[2] = r0.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            return null;
        } catch (IllegalArgumentException e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Bundle m3648() {
        Bundle bundle = new Bundle(this.f2948);
        for (String str : this.f2948.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Bundle m3654() {
        Bundle bundle = new Bundle(this.f2948);
        for (String str : this.f2948.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m3656(Resources resources, String str, String str2) {
        int identifier;
        String r0 = m3646(str2);
        if (TextUtils.isEmpty(r0) || (identifier = resources.getIdentifier(r0, "string", str)) == 0) {
            return null;
        }
        Object[] r6 = m3653(str2);
        if (r6 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, r6);
        } catch (MissingFormatArgumentException unused) {
            Arrays.toString(r6);
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m3644(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* renamed from: o.lq$ǃ  reason: contains not printable characters */
    public static final class C0226 implements C2979 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f2949 = 2131361940;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f2950 = 2131362330;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f2951 = 2131361969;

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final int f2952 = 2131362438;

        /* renamed from: ɨ  reason: contains not printable characters */
        public static final int f2953 = 2131362423;

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f2954 = 2131361954;

        /* renamed from: ɪ  reason: contains not printable characters */
        public static final int f2955 = 2131362411;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f2956 = 2131362109;

        /* renamed from: ɾ  reason: contains not printable characters */
        public static final int f2957 = 2131362445;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f2958 = 2131361967;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f2959 = 2131362106;

        /* renamed from: І  reason: contains not printable characters */
        public static final int f2960 = 2131362107;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f2961 = 2131362108;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f2962 = 2131362293;

        /* renamed from: ӏ  reason: contains not printable characters */
        public static final int f2963 = 2131362447;

        /* renamed from: ŀ  reason: contains not printable characters */
        private final C2039 f2964;

        public C0226() {
        }

        public C0226(C2039 r1) {
            this.f2964 = r1;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m3657(C0329 r2) {
            return Boolean.valueOf(this.f2964.m10916((C0329<C2832>) r2));
        }
    }
}
