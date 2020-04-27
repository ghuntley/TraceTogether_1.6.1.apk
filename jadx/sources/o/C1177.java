package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɤı  reason: contains not printable characters */
public final class C1177 extends C1519 {
    public static final Parcelable.Creator<C1177> CREATOR = new C1215();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f6780;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f6781;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f6782;

    public C1177(String str, String str2, String str3) {
        this.f6781 = str;
        this.f6780 = str2;
        this.f6782 = str3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m7701() {
        return this.f6781;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m7700() {
        return this.f6780;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f6781, false);
        C2745.m14545(parcel, 2, this.f6780, false);
        C2745.m14545(parcel, 3, this.f6782, false);
        C2745.m14531(parcel, r5);
    }
}
