package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C1345;

/* renamed from: o.Ӏґ  reason: contains not printable characters */
public final class C2847 extends C1519 {
    public static final Parcelable.Creator<C2847> CREATOR = new C2357();

    /* renamed from: ı  reason: contains not printable characters */
    public final long f13292;
    @Deprecated

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int f13293;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f13294;

    public C2847(String str, long j) {
        this.f13294 = str;
        this.f13292 = j;
        this.f13293 = -1;
    }

    public C2847(String str, int i, long j) {
        this.f13294 = str;
        this.f13293 = i;
        this.f13292 = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2847) {
            C2847 r9 = (C2847) obj;
            String str = this.f13294;
            if ((str != null && str.equals(r9.f13294)) || (this.f13294 == null && r9.f13294 == null)) {
                long j = this.f13292;
                if (j == -1) {
                    j = (long) this.f13293;
                }
                long j2 = r9.f13292;
                if (j2 == -1) {
                    j2 = (long) r9.f13293;
                }
                if (j == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f13294, false);
        int i2 = this.f13293;
        C2745.m14503(parcel, 2, 4);
        parcel.writeInt(i2);
        long j = this.f13292;
        if (j == -1) {
            j = (long) this.f13293;
        }
        C2745.m14503(parcel, 3, 8);
        parcel.writeLong(j);
        C2745.m14531(parcel, dataPosition);
    }

    public final int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f13294;
        long j = this.f13292;
        if (j == -1) {
            j = (long) this.f13293;
        }
        objArr[1] = Long.valueOf(j);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        C1345.C1346 r0 = new C1345.C1346(this, (byte) 0).m8437("name", this.f13294);
        long j = this.f13292;
        if (j == -1) {
            j = (long) this.f13293;
        }
        return r0.m8437("version", Long.valueOf(j)).toString();
    }
}
