package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ıԍ  reason: contains not printable characters */
public class C0454 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final ClassLoader f4072 = C0454.class.getClassLoader();

    private C0454() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T extends Parcelable> T m4777(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m4776(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m4778(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
