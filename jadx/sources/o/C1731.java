package o;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import o.C1345;

/* renamed from: o.ͳ  reason: contains not printable characters */
public final class C1731 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f8949;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f8950;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f8951;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f8952;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f8953;

    /* renamed from: І  reason: contains not printable characters */
    private final String f8954;

    /* renamed from: і  reason: contains not printable characters */
    private final String f8955;

    private C1731(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (true ^ (str == null || str.trim().isEmpty())) {
            this.f8951 = str;
            this.f8953 = str2;
            this.f8952 = str3;
            this.f8954 = str4;
            this.f8950 = str5;
            this.f8955 = str6;
            this.f8949 = str7;
            return;
        }
        throw new IllegalStateException("ApplicationId must be set.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1731 m9754(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C1442 r0 = new C1442(context);
        int identifier = r0.f7785.getIdentifier("google_app_id", "string", r0.f7784);
        String str7 = null;
        if (identifier == 0) {
            str = null;
        } else {
            str = r0.f7785.getString(identifier);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int identifier2 = r0.f7785.getIdentifier("google_api_key", "string", r0.f7784);
        if (identifier2 == 0) {
            str2 = null;
        } else {
            str2 = r0.f7785.getString(identifier2);
        }
        int identifier3 = r0.f7785.getIdentifier("firebase_database_url", "string", r0.f7784);
        if (identifier3 == 0) {
            str3 = null;
        } else {
            str3 = r0.f7785.getString(identifier3);
        }
        int identifier4 = r0.f7785.getIdentifier("ga_trackingId", "string", r0.f7784);
        if (identifier4 == 0) {
            str4 = null;
        } else {
            str4 = r0.f7785.getString(identifier4);
        }
        int identifier5 = r0.f7785.getIdentifier("gcm_defaultSenderId", "string", r0.f7784);
        if (identifier5 == 0) {
            str5 = null;
        } else {
            str5 = r0.f7785.getString(identifier5);
        }
        int identifier6 = r0.f7785.getIdentifier("google_storage_bucket", "string", r0.f7784);
        if (identifier6 == 0) {
            str6 = null;
        } else {
            str6 = r0.f7785.getString(identifier6);
        }
        int identifier7 = r0.f7785.getIdentifier("project_id", "string", r0.f7784);
        if (identifier7 != 0) {
            str7 = r0.f7785.getString(identifier7);
        }
        return new C1731(str, str2, str3, str4, str5, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1731)) {
            return false;
        }
        C1731 r5 = (C1731) obj;
        String str = this.f8951;
        String str2 = r5.f8951;
        if (str == str2 || (str != null && str.equals(str2))) {
            String str3 = this.f8953;
            String str4 = r5.f8953;
            if (str3 == str4 || (str3 != null && str3.equals(str4))) {
                String str5 = this.f8952;
                String str6 = r5.f8952;
                if (str5 == str6 || (str5 != null && str5.equals(str6))) {
                    String str7 = this.f8954;
                    String str8 = r5.f8954;
                    if (str7 == str8 || (str7 != null && str7.equals(str8))) {
                        String str9 = this.f8950;
                        String str10 = r5.f8950;
                        if (str9 == str10 || (str9 != null && str9.equals(str10))) {
                            String str11 = this.f8955;
                            String str12 = r5.f8955;
                            if (str11 == str12 || (str11 != null && str11.equals(str12))) {
                                String str13 = this.f8949;
                                String str14 = r5.f8949;
                                if (str13 == str14 || (str13 != null && str13.equals(str14))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8951, this.f8953, this.f8952, this.f8954, this.f8950, this.f8955, this.f8949});
    }

    public final String toString() {
        return new C1345.C1346(this, (byte) 0).m8437("applicationId", this.f8951).m8437("apiKey", this.f8953).m8437("databaseUrl", this.f8952).m8437("gcmSenderId", this.f8950).m8437("storageBucket", this.f8955).m8437("projectId", this.f8949).toString();
    }
}
