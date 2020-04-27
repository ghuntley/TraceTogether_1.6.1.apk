package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ɪǀ  reason: contains not printable characters */
public final class C1341 extends C1519 {
    public static final Parcelable.Creator<C1341> CREATOR = new C1361();

    /* renamed from: ı  reason: contains not printable characters */
    private String f7452;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f7453;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1449 f7454;

    /* renamed from: ɹ  reason: contains not printable characters */
    private List<String> f7455;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f7456;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f7457;

    public C1341() {
        this.f7454 = C1449.m8712();
    }

    public C1341(String str, boolean z, String str2, boolean z2, C1449 r5, List<String> list) {
        this.f7456 = str;
        this.f7457 = z;
        this.f7452 = str2;
        this.f7453 = z2;
        this.f7454 = r5 == null ? C1449.m8712() : C1449.m8713(r5);
        this.f7455 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f7456, false);
        C2745.m14546(parcel, 3, this.f7457);
        C2745.m14545(parcel, 4, this.f7452, false);
        C2745.m14546(parcel, 5, this.f7453);
        C2745.m14542(parcel, 6, this.f7454, i, false);
        C2745.m14521(parcel, 7, this.f7455, false);
        C2745.m14531(parcel, r0);
    }
}
