package o;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import o.C1304;

/* renamed from: o.ɨɍ  reason: contains not printable characters */
public final class C1209 extends C1519 {
    public static final Parcelable.Creator<C1209> CREATOR = new C1677();

    /* renamed from: ı  reason: contains not printable characters */
    Bundle f6861;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int f6862;

    /* renamed from: ǃ  reason: contains not printable characters */
    String f6863;

    /* renamed from: ɩ  reason: contains not printable characters */
    Account f6864;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int f6865;

    /* renamed from: Ι  reason: contains not printable characters */
    Scope[] f6866;

    /* renamed from: ι  reason: contains not printable characters */
    IBinder f6867;

    /* renamed from: І  reason: contains not printable characters */
    private int f6868;

    /* renamed from: і  reason: contains not printable characters */
    C2847[] f6869;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C2847[] f6870;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f6871;

    public C1209(int i) {
        this.f6865 = 4;
        this.f6868 = C2837.f13285;
        this.f6862 = i;
        this.f6871 = true;
    }

    C1209(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2847[] r9, C2847[] r10, boolean z) {
        this.f6865 = i;
        this.f6862 = i2;
        this.f6868 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f6863 = "com.google.android.gms";
        } else {
            this.f6863 = str;
        }
        if (i < 2) {
            this.f6864 = iBinder != null ? C1197.m7808(C1304.Cif.m8252(iBinder)) : null;
        } else {
            this.f6867 = iBinder;
            this.f6864 = account;
        }
        this.f6866 = scopeArr;
        this.f6861 = bundle;
        this.f6869 = r9;
        this.f6870 = r10;
        this.f6871 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f6865;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f6862;
        C2745.m14503(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.f6868;
        C2745.m14503(parcel, 3, 4);
        parcel.writeInt(i4);
        C2745.m14545(parcel, 4, this.f6863, false);
        C2745.m14509(parcel, 5, this.f6867, false);
        C2745.m14534(parcel, 6, this.f6866, i, false);
        C2745.m14541(parcel, 7, this.f6861, false);
        C2745.m14542(parcel, 8, this.f6864, i, false);
        C2745.m14534(parcel, 10, this.f6869, i, false);
        C2745.m14534(parcel, 11, this.f6870, i, false);
        boolean z = this.f6871;
        C2745.m14503(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        C2745.m14531(parcel, dataPosition);
    }
}
