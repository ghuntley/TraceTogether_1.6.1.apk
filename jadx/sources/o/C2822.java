package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C1345;

/* renamed from: o.Ӏϲ  reason: contains not printable characters */
public final class C2822 extends C1519 {
    public static final Parcelable.Creator<C2822> CREATOR = new C2358();

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2822 f13245 = new C2822(0);

    /* renamed from: ı  reason: contains not printable characters */
    public final PendingIntent f13246;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f13247;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f13248;

    /* renamed from: ι  reason: contains not printable characters */
    public final int f13249;

    C2822(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f13248 = i;
        this.f13249 = i2;
        this.f13246 = pendingIntent;
        this.f13247 = str;
    }

    public C2822(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public C2822(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public C2822(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m14749() {
        return (this.f13249 == 0 || this.f13246 == null) ? false : true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m14746() {
        return this.f13249 == 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m14747() {
        return this.f13249;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final PendingIntent m14748() {
        return this.f13246;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static String m14745(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2822)) {
            return false;
        }
        C2822 r5 = (C2822) obj;
        if (this.f13249 == r5.f13249) {
            PendingIntent pendingIntent = this.f13246;
            PendingIntent pendingIntent2 = r5.f13246;
            if (pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2))) {
                String str = this.f13247;
                String str2 = r5.f13247;
                if (str == str2 || (str != null && str.equals(str2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13249), this.f13246, this.f13247});
    }

    public final String toString() {
        return new C1345.C1346(this, (byte) 0).m8437("statusCode", m14745(this.f13249)).m8437("resolution", this.f13246).m8437("message", this.f13247).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f13248;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f13249;
        C2745.m14503(parcel, 2, 4);
        parcel.writeInt(i3);
        C2745.m14542(parcel, 3, this.f13246, i, false);
        C2745.m14545(parcel, 4, this.f13247, false);
        C2745.m14531(parcel, dataPosition);
    }
}
