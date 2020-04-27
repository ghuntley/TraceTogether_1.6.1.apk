package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ĸɩ  reason: contains not printable characters */
public class C0476 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final ClassLoader f4105 = C0476.class.getClassLoader();

    private C0476() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m4813(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m4808(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T extends Parcelable> T m4810(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m4809(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4811(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m4812(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
