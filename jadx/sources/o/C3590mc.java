package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0018\u00002\u00020\u0016B!\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0002¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0002\u0010\u000b"}, d2 = {"Lo/mc;", "", "ɩ", "Ljava/lang/String;", "", "ι", "I", "Ι", "()I", "ı", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "describeContents", "Landroid/os/Parcel;", "p0", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;I)V", "Landroid/os/Parcelable;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.mc  reason: case insensitive filesystem */
public final class C3590mc implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Cif();

    /* renamed from: ı  reason: contains not printable characters */
    private Integer f3194;

    /* renamed from: ɩ  reason: contains not printable characters */
    public String f3195;

    /* renamed from: ι  reason: contains not printable characters */
    private int f3196;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    /* renamed from: o.mc$if  reason: invalid class name */
    public static class Cif implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            fM.m2254(parcel, "");
            return new C3590mc(parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new C3590mc[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        fM.m2254(parcel, "");
        parcel.writeString(this.f3195);
        Integer num = this.f3194;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.f3196);
    }

    public C3590mc(String str, Integer num, int i) {
        fM.m2254(str, "");
        this.f3195 = str;
        this.f3194 = num;
        this.f3196 = i;
    }

    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public final Integer m3809() {
        return this.f3194;
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m3810() {
        return this.f3196;
    }
}
