package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɬı  reason: contains not printable characters */
public final class C1422 extends C1519 {
    public static final Parcelable.Creator<C1422> CREATOR = new C1402();

    /* renamed from: ı  reason: contains not printable characters */
    private String f7757;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f7758;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f7759;

    /* renamed from: ι  reason: contains not printable characters */
    private C1384 f7760;

    public C1422() {
    }

    C1422(String str, String str2, String str3, C1384 r4) {
        this.f7758 = str;
        this.f7759 = str2;
        this.f7757 = str3;
        this.f7760 = r4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f7758, false);
        C2745.m14545(parcel, 3, this.f7759, false);
        C2745.m14545(parcel, 4, this.f7757, false);
        C2745.m14542(parcel, 5, this.f7760, i, false);
        C2745.m14531(parcel, r0);
    }
}
