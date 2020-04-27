package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* renamed from: ı  reason: contains not printable characters */
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float f36;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f37;

    RatingCompat(int i, float f) {
        this.f37 = i;
        this.f36 = f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f37);
        sb.append(" rating=");
        float f = this.f36;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public final int describeContents() {
        return this.f37;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37);
        parcel.writeFloat(this.f36);
    }
}
