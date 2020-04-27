package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: o.ʜ  reason: contains not printable characters */
public final class C1674 implements Parcelable {
    public static final Parcelable.Creator<C1674> CREATOR = new Parcelable.Creator<C1674>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C1674[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C1674(parcel);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final int f8687;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final String f8688;

    /* renamed from: ǃ  reason: contains not printable characters */
    final int f8689;

    /* renamed from: ȷ  reason: contains not printable characters */
    public Bundle f8690;

    /* renamed from: ɨ  reason: contains not printable characters */
    final boolean f8691;

    /* renamed from: ɩ  reason: contains not printable characters */
    final boolean f8692;

    /* renamed from: ɹ  reason: contains not printable characters */
    final boolean f8693;

    /* renamed from: ɾ  reason: contains not printable characters */
    final int f8694;

    /* renamed from: Ι  reason: contains not printable characters */
    final String f8695;

    /* renamed from: ι  reason: contains not printable characters */
    final String f8696;

    /* renamed from: І  reason: contains not printable characters */
    final boolean f8697;

    /* renamed from: і  reason: contains not printable characters */
    final boolean f8698;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final Bundle f8699;

    public final int describeContents() {
        return 0;
    }

    public C1674(C1277 r2) {
        this.f8695 = r2.getClass().getName();
        this.f8696 = r2.mWho;
        this.f8692 = r2.mFromLayout;
        this.f8689 = r2.mFragmentId;
        this.f8687 = r2.mContainerId;
        this.f8688 = r2.mTag;
        this.f8698 = r2.mRetainInstance;
        this.f8697 = r2.mRemoving;
        this.f8693 = r2.mDetached;
        this.f8699 = r2.mArguments;
        this.f8691 = r2.mHidden;
        this.f8694 = r2.mMaxState.ordinal();
    }

    C1674(Parcel parcel) {
        this.f8695 = parcel.readString();
        this.f8696 = parcel.readString();
        boolean z = true;
        this.f8692 = parcel.readInt() != 0;
        this.f8689 = parcel.readInt();
        this.f8687 = parcel.readInt();
        this.f8688 = parcel.readString();
        this.f8698 = parcel.readInt() != 0;
        this.f8697 = parcel.readInt() != 0;
        this.f8693 = parcel.readInt() != 0;
        this.f8699 = parcel.readBundle();
        this.f8691 = parcel.readInt() == 0 ? false : z;
        this.f8690 = parcel.readBundle();
        this.f8694 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f8695);
        sb.append(" (");
        sb.append(this.f8696);
        sb.append(")}:");
        if (this.f8692) {
            sb.append(" fromLayout");
        }
        if (this.f8687 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f8687));
        }
        String str = this.f8688;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f8688);
        }
        if (this.f8698) {
            sb.append(" retainInstance");
        }
        if (this.f8697) {
            sb.append(" removing");
        }
        if (this.f8693) {
            sb.append(" detached");
        }
        if (this.f8691) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8695);
        parcel.writeString(this.f8696);
        parcel.writeInt(this.f8692 ? 1 : 0);
        parcel.writeInt(this.f8689);
        parcel.writeInt(this.f8687);
        parcel.writeString(this.f8688);
        parcel.writeInt(this.f8698 ? 1 : 0);
        parcel.writeInt(this.f8697 ? 1 : 0);
        parcel.writeInt(this.f8693 ? 1 : 0);
        parcel.writeBundle(this.f8699);
        parcel.writeInt(this.f8691 ? 1 : 0);
        parcel.writeBundle(this.f8690);
        parcel.writeInt(this.f8694);
    }
}
