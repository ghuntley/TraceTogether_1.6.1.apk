package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ɨϳ  reason: contains not printable characters */
public final class C1220 extends C1519 {
    public static final Parcelable.Creator<C1220> CREATOR = new C1224();

    /* renamed from: ı  reason: contains not printable characters */
    private C1630 f6906;

    /* renamed from: ɩ  reason: contains not printable characters */
    private List<C1384> f6907;

    /* renamed from: ι  reason: contains not printable characters */
    private String f6908;

    public C1220(String str, List<C1384> list, C1630 r3) {
        this.f6908 = str;
        this.f6907 = list;
        this.f6906 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m7896() {
        return this.f6908;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1630 m7897() {
        return this.f6906;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<C2062> m7895() {
        return C2745.m14520(this.f6907);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f6908, false);
        C2745.m14511(parcel, 2, this.f6907, false);
        C2745.m14542(parcel, 3, this.f6906, i, false);
        C2745.m14531(parcel, r0);
    }
}
