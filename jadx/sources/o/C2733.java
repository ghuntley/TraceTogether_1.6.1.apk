package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ҹɪ  reason: contains not printable characters */
final class C2733 implements Parcelable.Creator<C2226> {
    C2733() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2226[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new C2226(readStrongBinder);
        }
        return null;
    }
}
