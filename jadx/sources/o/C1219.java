package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɨι  reason: contains not printable characters */
public abstract class C1219 implements Parcelable {
    public static final Parcelable.Creator<C1219> CREATOR = new Parcelable.ClassLoaderCreator<C1219>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C1219.f6904;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C1219[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return C1219.f6904;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    public static final C1219 f6904 = new C1219() {
    };

    /* renamed from: Ι  reason: contains not printable characters */
    public final Parcelable f6905;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ C1219(byte b) {
        this();
    }

    private C1219() {
        this.f6905 = null;
    }

    public C1219(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6905 = parcelable == f6904 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public C1219(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f6905 = readParcelable == null ? f6904 : readParcelable;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Parcelable m7894() {
        return this.f6905;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6905, i);
    }
}
