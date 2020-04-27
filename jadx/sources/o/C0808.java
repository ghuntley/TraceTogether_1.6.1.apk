package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ƶІ  reason: contains not printable characters */
public final class C0808 extends C1219 {
    public static final Parcelable.Creator<C0808> CREATOR = new Parcelable.ClassLoaderCreator<C0808>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0808(parcel, classLoader, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0808[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C0808(parcel, (ClassLoader) null, (byte) 0);
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0910<String, Bundle> f5287;

    /* synthetic */ C0808(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public C0808(Parcelable parcelable) {
        super(parcelable);
        this.f5287 = new C0910<>();
    }

    private C0808(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f5287 = new C0910<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f5287.put(strArr[i], bundleArr[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f5287.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 << 1;
            strArr[i2] = (String) this.f5287.f5784[i3];
            bundleArr[i2] = (Bundle) this.f5287.f5784[i3 + 1];
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.f5287);
        sb.append("}");
        return sb.toString();
    }
}
