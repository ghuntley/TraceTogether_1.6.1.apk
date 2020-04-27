package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\b\u0018\u00002\u00020\u0018B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0002\u001a\u00020\u00018\u0007@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005"}, d2 = {"Lo/lZ;", "", "ǃ", "Ljava/lang/String;", "ı", "()Ljava/lang/String;", "ɩ", "", "describeContents", "()I", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcelable;"}, k = 1, mv = {1, 1, 16})
public final class lZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new If();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f2876;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f2877;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public static class If implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            fM.m2254(parcel, "");
            return new lZ(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new lZ[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lZ)) {
            return false;
        }
        lZ lZVar = (lZ) obj;
        return fM.m2257(this.f2876, lZVar.f2876) && fM.m2257(this.f2877, lZVar.f2877);
    }

    public final int hashCode() {
        String str = this.f2876;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2877;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "lZ(ǃ=" + this.f2876 + ", ɩ=" + this.f2877 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        fM.m2254(parcel, "");
        parcel.writeString(this.f2876);
        parcel.writeString(this.f2877);
    }

    public lZ(String str, String str2) {
        fM.m2254(str, "");
        this.f2876 = str;
        this.f2877 = str2;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m3550() {
        return this.f2876;
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final String m3549() {
        return this.f2877;
    }
}
