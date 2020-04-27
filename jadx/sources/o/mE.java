package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public class mE implements Parcelable {
    public static final Parcelable.Creator<mE> CREATOR = new Parcelable.Creator<mE>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new mE[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new mE(parcel);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    public final int f3075;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Intent f3076;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int f3077;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean f3078;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f3079;

    public int describeContents() {
        return 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static mE m3739() {
        return new mE(-1, (Intent) null, (String) null, false, -1);
    }

    public mE(int i, Intent intent, String str, boolean z, int i2) {
        this.f3075 = i;
        this.f3076 = intent;
        this.f3079 = str;
        this.f3078 = z;
        this.f3077 = i2;
    }

    /* renamed from: o.mE$ı  reason: contains not printable characters */
    public static class C0234 {

        /* renamed from: ǃ  reason: contains not printable characters */
        public final mL f3083;

        /* renamed from: ɩ  reason: contains not printable characters */
        public String f3084 = "*/*";

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean f3085 = false;

        /* renamed from: ι  reason: contains not printable characters */
        public final int f3086;

        public C0234(int i, mL mLVar) {
            this.f3083 = mLVar;
            this.f3086 = i;
        }
    }

    public static class If {

        /* renamed from: ı  reason: contains not printable characters */
        final mL f3080;

        /* renamed from: ǃ  reason: contains not printable characters */
        final mD f3081;

        /* renamed from: ι  reason: contains not printable characters */
        final int f3082;

        If(int i, mL mLVar, mD mDVar) {
            this.f3082 = i;
            this.f3080 = mLVar;
            this.f3081 = mDVar;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3075);
        parcel.writeParcelable(this.f3076, i);
        parcel.writeString(this.f3079);
        parcel.writeBooleanArray(new boolean[]{this.f3078});
        parcel.writeInt(this.f3077);
    }

    mE(Parcel parcel) {
        this.f3075 = parcel.readInt();
        this.f3076 = (Intent) parcel.readParcelable(mE.class.getClassLoader());
        this.f3079 = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f3078 = zArr[0];
        this.f3077 = parcel.readInt();
    }
}
