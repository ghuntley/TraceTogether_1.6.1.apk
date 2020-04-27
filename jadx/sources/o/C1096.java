package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import o.C0712;

/* renamed from: o.ɐΙ  reason: contains not printable characters */
public final class C1096 implements C0712.C0713 {
    public static final Parcelable.Creator<C1096> CREATOR = new C0805();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f6530;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f6531;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f6532;

    public C1096(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        } else if (!TextUtils.isEmpty(str2)) {
            this.f6530 = str;
            this.f6532 = str2;
            C0602.m5313(str2);
            this.f6531 = z;
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public C1096(boolean z) {
        this.f6531 = z;
        this.f6532 = null;
        this.f6530 = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f6530, false);
        C2745.m14545(parcel, 2, this.f6532, false);
        boolean z = this.f6531;
        C2745.m14503(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        C2745.m14531(parcel, dataPosition);
    }
}
