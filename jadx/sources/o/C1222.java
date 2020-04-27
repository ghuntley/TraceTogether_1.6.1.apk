package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: o.ɨЈ  reason: contains not printable characters */
public final class C1222 extends C1519 {
    public static final Parcelable.Creator<C1222> CREATOR = new C1271();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f6909;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f6910;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1630 f6911;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Status f6912;

    public C1222(Status status, C1630 r2, String str, String str2) {
        this.f6912 = status;
        this.f6911 = r2;
        this.f6910 = str;
        this.f6909 = str2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Status m7902() {
        return this.f6912;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1630 m7900() {
        return this.f6911;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m7903() {
        return this.f6910;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m7901() {
        return this.f6909;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14542(parcel, 1, this.f6912, i, false);
        C2745.m14542(parcel, 2, this.f6911, i, false);
        C2745.m14545(parcel, 3, this.f6910, false);
        C2745.m14545(parcel, 4, this.f6909, false);
        C2745.m14531(parcel, r0);
    }
}
