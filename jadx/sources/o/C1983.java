package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C1965;

/* renamed from: o.ιɕ  reason: contains not printable characters */
public final class C1983 implements C1965.C1966 {
    public static final Parcelable.Creator<C1983> CREATOR = new Parcelable.Creator<C1983>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C1983[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C1983(parcel.readLong(), (byte) 0);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    private final long f9928;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ C1983(long j, byte b) {
        this(j);
    }

    C1983(long j) {
        this.f9928 = j;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10776(long j) {
        return j >= this.f9928;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9928);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1983) && this.f9928 == ((C1983) obj).f9928;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9928)});
    }
}
