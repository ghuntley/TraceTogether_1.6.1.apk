package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Ɉі  reason: contains not printable characters */
public final class C1040 extends C1519 {
    public static final Parcelable.Creator<C1040> CREATOR = new C1049();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f6296;

    public C1040(String str) {
        this.f6296 = str;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m7282() {
        return this.f6296;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f6296, false);
        C2745.m14531(parcel, r5);
    }
}
