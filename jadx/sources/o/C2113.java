package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C2745;

/* renamed from: o.πı  reason: contains not printable characters */
public final class C2113 extends C1519 {
    public static final Parcelable.Creator<C2113> CREATOR = new C2088();

    /* renamed from: ı  reason: contains not printable characters */
    public final long f10232;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final Double f10233;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Long f10234;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f10235;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f10236;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f10237;

    /* renamed from: і  reason: contains not printable characters */
    private final Float f10238;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int f10239;

    C2113(C2152 r7) {
        this(r7.f10313, r7.f10317, r7.f10314, r7.f10315);
    }

    C2113(String str, long j, Object obj, String str2) {
        C2745.C2746.m14562(str);
        this.f10239 = 2;
        this.f10236 = str;
        this.f10232 = j;
        this.f10235 = str2;
        if (obj == null) {
            this.f10234 = null;
            this.f10238 = null;
            this.f10233 = null;
            this.f10237 = null;
        } else if (obj instanceof Long) {
            this.f10234 = (Long) obj;
            this.f10238 = null;
            this.f10233 = null;
            this.f10237 = null;
        } else if (obj instanceof String) {
            this.f10234 = null;
            this.f10238 = null;
            this.f10233 = null;
            this.f10237 = (String) obj;
        } else if (obj instanceof Double) {
            this.f10234 = null;
            this.f10238 = null;
            this.f10233 = (Double) obj;
            this.f10237 = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    C2113(String str, long j, String str2) {
        C2745.C2746.m14562(str);
        this.f10239 = 2;
        this.f10236 = str;
        this.f10232 = 0;
        this.f10234 = null;
        this.f10238 = null;
        this.f10233 = null;
        this.f10237 = null;
        this.f10235 = null;
    }

    C2113(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f10239 = i;
        this.f10236 = str;
        this.f10232 = j;
        this.f10234 = l;
        Double d2 = null;
        this.f10238 = null;
        if (i == 1) {
            this.f10233 = f != null ? Double.valueOf(f.doubleValue()) : d2;
        } else {
            this.f10233 = d;
        }
        this.f10237 = str2;
        this.f10235 = str3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m11268() {
        Long l = this.f10234;
        if (l != null) {
            return l;
        }
        Double d = this.f10233;
        if (d != null) {
            return d;
        }
        String str = this.f10237;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r6 = C2745.m14517(parcel);
        C2745.m14532(parcel, 1, this.f10239);
        C2745.m14545(parcel, 2, this.f10236, false);
        C2745.m14508(parcel, 3, this.f10232);
        C2745.m14533(parcel, 4, this.f10234, false);
        C2745.m14544(parcel, 5, (Float) null, false);
        C2745.m14545(parcel, 6, this.f10237, false);
        C2745.m14545(parcel, 7, this.f10235, false);
        C2745.m14510(parcel, 8, this.f10233, false);
        C2745.m14531(parcel, r6);
    }
}
