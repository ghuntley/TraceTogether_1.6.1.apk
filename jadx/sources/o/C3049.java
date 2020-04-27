package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: o.Վ  reason: contains not printable characters */
public final class C3049 extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C3049> CREATOR = new Parcelable.ClassLoaderCreator<C3049>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C3049(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3049[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3049(parcel, (ClassLoader) null);
        }
    };

    public final int describeContents() {
        return 0;
    }

    public C3049() {
    }

    public C3049(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
