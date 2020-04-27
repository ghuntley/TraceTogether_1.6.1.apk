package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: o.ıґ  reason: contains not printable characters */
public final class C0440 implements Parcelable {
    public static final Parcelable.Creator<C0440> CREATOR = new Parcelable.Creator<C0440>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0440[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C0440(parcel);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final int f4027;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Bundle f4028;

    /* renamed from: Ι  reason: contains not printable characters */
    final Bundle f4029;

    /* renamed from: ι  reason: contains not printable characters */
    final UUID f4030;

    public final int describeContents() {
        return 0;
    }

    public C0440(C0546 r2) {
        this.f4030 = r2.f4429;
        this.f4027 = r2.f4428.f4522;
        this.f4029 = r2.f4425;
        this.f4028 = new Bundle();
        r2.f4426.m9162(this.f4028);
    }

    C0440(Parcel parcel) {
        this.f4030 = UUID.fromString(parcel.readString());
        this.f4027 = parcel.readInt();
        this.f4029 = parcel.readBundle(getClass().getClassLoader());
        this.f4028 = parcel.readBundle(getClass().getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4030.toString());
        parcel.writeInt(this.f4027);
        parcel.writeBundle(this.f4029);
        parcel.writeBundle(this.f4028);
    }
}
