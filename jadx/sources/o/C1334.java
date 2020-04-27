package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o.C1304;

/* renamed from: o.ɪƗ  reason: contains not printable characters */
public final class C1334 extends C1519 {
    public static final Parcelable.Creator<C1334> CREATOR = new C1632();

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f7356;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f7357;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C2822 f7358;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f7359;

    /* renamed from: ι  reason: contains not printable characters */
    private IBinder f7360;

    C1334(int i, IBinder iBinder, C2822 r3, boolean z, boolean z2) {
        this.f7357 = i;
        this.f7360 = iBinder;
        this.f7358 = r3;
        this.f7359 = z;
        this.f7356 = z2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1304 m8373() {
        return C1304.Cif.m8252(this.f7360);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2822 m8372() {
        return this.f7358;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1334)) {
            return false;
        }
        C1334 r5 = (C1334) obj;
        return this.f7358.equals(r5.f7358) && C1304.Cif.m8252(this.f7360).equals(C1304.Cif.m8252(r5.f7360));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f7357;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        C2745.m14509(parcel, 2, this.f7360, false);
        C2745.m14542(parcel, 3, this.f7358, i, false);
        boolean z = this.f7359;
        C2745.m14503(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f7356;
        C2745.m14503(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C2745.m14531(parcel, dataPosition);
    }
}
