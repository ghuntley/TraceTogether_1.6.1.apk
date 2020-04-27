package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: o.ϰ  reason: contains not printable characters */
public class C2165 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final ClassLoader f10330 = C2165.class.getClassLoader();

    private C2165() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m11473(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m11472(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T extends Parcelable> T m11471(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m11475(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m11476(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static HashMap m11474(Parcel parcel) {
        return parcel.readHashMap(f10330);
    }
}
