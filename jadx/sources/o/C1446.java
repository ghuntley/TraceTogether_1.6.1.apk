package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: o.ɭі  reason: contains not printable characters */
public final class C1446 extends C1519 {
    public static final Parcelable.Creator<C1446> CREATOR = new C1643();
    @Deprecated

    /* renamed from: ı  reason: contains not printable characters */
    private final Scope[] f7788;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f7789;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f7790;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f7791;

    C1446(int i, int i2, int i3, Scope[] scopeArr) {
        this.f7789 = i;
        this.f7790 = i2;
        this.f7791 = i3;
        this.f7788 = scopeArr;
    }

    public C1446(int i, int i2) {
        this(1, i, i2, (Scope[]) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f7789;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f7790;
        C2745.m14503(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.f7791;
        C2745.m14503(parcel, 3, 4);
        parcel.writeInt(i4);
        C2745.m14534(parcel, 4, this.f7788, i, false);
        C2745.m14531(parcel, dataPosition);
    }
}
