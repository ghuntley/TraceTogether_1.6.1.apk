package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import o.C0459;
import o.C1157;
import o.C1345;
import o.C1519;
import o.C2745;

public final class Status extends C1519 implements C0459, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C1157();

    /* renamed from: ı  reason: contains not printable characters */
    public static final Status f531 = new Status(16);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Status f532 = new Status(0);

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Status f533 = new Status(8);

    /* renamed from: ι  reason: contains not printable characters */
    public static final Status f534 = new Status(15);

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int f535;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int f536;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String f537;

    /* renamed from: і  reason: contains not printable characters */
    public final PendingIntent f538;

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f535 = i;
        this.f536 = i2;
        this.f537 = str;
        this.f538 = pendingIntent;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Status m749() {
        return this;
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m753() {
        return this.f537;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m752() {
        return this.f536 <= 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m751() {
        return this.f536;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f535), Integer.valueOf(this.f536), this.f537, this.f538});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f535 == status.f535 && this.f536 == status.f536) {
            String str = this.f537;
            String str2 = status.f537;
            if (str == str2 || (str != null && str.equals(str2))) {
                PendingIntent pendingIntent = this.f538;
                PendingIntent pendingIntent2 = status.f538;
                if (pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m750() {
        String str = this.f537;
        if (str != null) {
            return str;
        }
        int i = this.f536;
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
        }
    }

    static {
        new Status(14);
        new Status(17);
        new Status(18);
    }

    public final String toString() {
        return new C1345.C1346(this, (byte) 0).m8437("statusCode", m750()).m8437("resolution", this.f538).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f536;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        C2745.m14545(parcel, 2, this.f537, false);
        C2745.m14542(parcel, 3, this.f538, i, false);
        int i3 = this.f535;
        C2745.m14503(parcel, 1000, 4);
        parcel.writeInt(i3);
        C2745.m14531(parcel, dataPosition);
    }
}
