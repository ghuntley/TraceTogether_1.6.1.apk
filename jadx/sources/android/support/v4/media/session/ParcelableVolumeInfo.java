package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    public int f62;

    /* renamed from: ǃ  reason: contains not printable characters */
    public int f63;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f64;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f65;

    /* renamed from: ι  reason: contains not printable characters */
    public int f66;

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f65 = parcel.readInt();
        this.f64 = parcel.readInt();
        this.f62 = parcel.readInt();
        this.f63 = parcel.readInt();
        this.f66 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f65);
        parcel.writeInt(this.f64);
        parcel.writeInt(this.f62);
        parcel.writeInt(this.f63);
        parcel.writeInt(this.f66);
    }
}
