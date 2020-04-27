package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ke  reason: case insensitive filesystem */
public final class C3536ke implements Parcelable {
    public static final Parcelable.Creator<C3536ke> CREATOR = new Parcelable.Creator<C3536ke>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3536ke[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3536ke(parcel, (byte) 0);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final String f2629;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int f2630;

    /* renamed from: ǃ  reason: contains not printable characters */
    final String f2631;

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f2632;

    /* renamed from: ɹ  reason: contains not printable characters */
    Context f2633;

    /* renamed from: Ι  reason: contains not printable characters */
    final int f2634;

    /* renamed from: ι  reason: contains not printable characters */
    final String f2635;

    /* renamed from: І  reason: contains not printable characters */
    final int f2636;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ C3536ke(Parcel parcel, byte b) {
        this(parcel);
    }

    private C3536ke(Parcel parcel) {
        this.f2634 = parcel.readInt();
        this.f2629 = parcel.readString();
        this.f2635 = parcel.readString();
        this.f2631 = parcel.readString();
        this.f2632 = parcel.readString();
        this.f2630 = parcel.readInt();
        this.f2636 = parcel.readInt();
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C3536ke m3261(Intent intent, Activity activity) {
        C3536ke keVar = (C3536ke) intent.getParcelableExtra("extra_app_settings");
        keVar.f2633 = activity;
        return keVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2634);
        parcel.writeString(this.f2629);
        parcel.writeString(this.f2635);
        parcel.writeString(this.f2631);
        parcel.writeString(this.f2632);
        parcel.writeInt(this.f2630);
        parcel.writeInt(this.f2636);
    }
}
