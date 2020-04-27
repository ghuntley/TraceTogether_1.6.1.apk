package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɾɍ  reason: contains not printable characters */
public final class C1544 {
    public C1544() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <T extends C1511> T m9040(byte[] bArr, Parcelable.Creator<T> creator) {
        if (creator != null) {
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            T t = (C1511) creator.createFromParcel(obtain);
            obtain.recycle();
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public C1544(C2248 r1) {
    }
}
