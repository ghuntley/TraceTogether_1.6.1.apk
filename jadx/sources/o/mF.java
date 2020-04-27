package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

public class mF implements Parcelable, Comparable<mF> {
    public static final Parcelable.Creator<mF> CREATOR = new Parcelable.Creator<mF>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mF[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mF(parcel, (byte) 0);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    public final File f3087;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long f3088;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f3089;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Uri f3090;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final long f3091;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Uri f3092;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f3093;

    /* renamed from: І  reason: contains not printable characters */
    public final long f3094;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ mF(Parcel parcel, byte b) {
        this(parcel);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3092.compareTo(((mF) obj).f3092);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static mF m3740() {
        return new mF((File) null, (Uri) null, (Uri) null, (String) null, (String) null, -1, -1, -1);
    }

    public mF(File file, Uri uri, Uri uri2, String str, String str2, long j, long j2, long j3) {
        this.f3087 = file;
        this.f3090 = uri;
        this.f3092 = uri2;
        this.f3089 = str2;
        this.f3093 = str;
        this.f3091 = j;
        this.f3088 = j2;
        this.f3094 = j3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f3087);
        parcel.writeParcelable(this.f3090, i);
        parcel.writeString(this.f3093);
        parcel.writeString(this.f3089);
        parcel.writeParcelable(this.f3092, i);
        parcel.writeLong(this.f3091);
        parcel.writeLong(this.f3088);
        parcel.writeLong(this.f3094);
    }

    private mF(Parcel parcel) {
        Class<mF> cls = mF.class;
        this.f3087 = (File) parcel.readSerializable();
        this.f3090 = (Uri) parcel.readParcelable(cls.getClassLoader());
        this.f3093 = parcel.readString();
        this.f3089 = parcel.readString();
        this.f3092 = (Uri) parcel.readParcelable(cls.getClassLoader());
        this.f3091 = parcel.readLong();
        this.f3088 = parcel.readLong();
        this.f3094 = parcel.readLong();
    }

    public boolean equals(Object obj) {
        File file;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mF mFVar = (mF) obj;
            if (this.f3091 != mFVar.f3091 || this.f3088 != mFVar.f3088 || this.f3094 != mFVar.f3094 || ((file = this.f3087) == null ? mFVar.f3087 != null : !file.equals(mFVar.f3087))) {
                return false;
            }
            Uri uri = this.f3090;
            if (uri == null ? mFVar.f3090 != null : !uri.equals(mFVar.f3090)) {
                return false;
            }
            Uri uri2 = this.f3092;
            if (uri2 == null ? mFVar.f3092 != null : !uri2.equals(mFVar.f3092)) {
                return false;
            }
            String str = this.f3093;
            if (str == null ? mFVar.f3093 != null : !str.equals(mFVar.f3093)) {
                return false;
            }
            String str2 = this.f3089;
            String str3 = mFVar.f3089;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        File file = this.f3087;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        Uri uri = this.f3090;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Uri uri2 = this.f3092;
        int hashCode3 = (hashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        String str = this.f3093;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3089;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f3091;
        long j2 = this.f3088;
        long j3 = this.f3094;
        return ((((((hashCode4 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }
}
