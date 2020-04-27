package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\b\u0018\u00002\u00020\u0019B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005"}, d2 = {"Lo/ma;", "", "ɩ", "Ljava/lang/String;", "ǃ", "()Ljava/lang/String;", "Ι", "ι", "", "describeContents", "()I", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcelable;"}, k = 1, mv = {1, 1, 16})
/* renamed from: o.ma  reason: case insensitive filesystem */
public final class C3588ma implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0249();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f3189;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f3190;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    /* renamed from: o.ma$ı  reason: contains not printable characters */
    public static class C0249 implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            fM.m2254(parcel, "");
            return new C3588ma(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new C3588ma[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3588ma)) {
            return false;
        }
        C3588ma maVar = (C3588ma) obj;
        return fM.m2257(this.f3190, maVar.f3190) && fM.m2257(this.f3189, maVar.f3189);
    }

    public final int hashCode() {
        String str = this.f3190;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3189;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ma(ι=" + this.f3190 + ", ɩ=" + this.f3189 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        fM.m2254(parcel, "");
        parcel.writeString(this.f3190);
        parcel.writeString(this.f3189);
    }

    public C3588ma(String str, String str2) {
        fM.m2254(str, "");
        this.f3190 = str;
        this.f3189 = str2;
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final String m3806() {
        return this.f3190;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m3805() {
        return this.f3189;
    }
}
