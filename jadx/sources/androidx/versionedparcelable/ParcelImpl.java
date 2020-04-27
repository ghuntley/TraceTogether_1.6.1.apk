package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.C0712;
import o.C2603;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelImpl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    private final C0712.C0713 f454;

    public int describeContents() {
        return 0;
    }

    protected ParcelImpl(Parcel parcel) {
        this.f454 = new C2603(parcel).m13928();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C2603(parcel).m13918(this.f454);
    }
}
