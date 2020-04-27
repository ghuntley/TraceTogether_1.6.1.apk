package o;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: o.ɿι  reason: contains not printable characters */
final class C1569 implements Parcelable {
    public static final Parcelable.Creator<C1569> CREATOR = new Parcelable.Creator<C1569>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C1569[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C1569(parcel);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    C1268[] f8334;

    /* renamed from: ǃ  reason: contains not printable characters */
    ArrayList<C1674> f8335;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f8336;

    /* renamed from: Ι  reason: contains not printable characters */
    ArrayList<String> f8337;

    /* renamed from: ι  reason: contains not printable characters */
    String f8338 = null;

    public final int describeContents() {
        return 0;
    }

    public C1569() {
    }

    public C1569(Parcel parcel) {
        this.f8335 = parcel.createTypedArrayList(C1674.CREATOR);
        this.f8337 = parcel.createStringArrayList();
        this.f8334 = (C1268[]) parcel.createTypedArray(C1268.CREATOR);
        this.f8336 = parcel.readInt();
        this.f8338 = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f8335);
        parcel.writeStringList(this.f8337);
        parcel.writeTypedArray(this.f8334, i);
        parcel.writeInt(this.f8336);
        parcel.writeString(this.f8338);
    }
}
