package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: o.ҝ  reason: contains not printable characters */
public final class C2698 extends C1519 implements C0459 {
    public static final Parcelable.Creator<C2698> CREATOR = new C2594();

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f12444;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f12445;

    /* renamed from: ι  reason: contains not printable characters */
    private Intent f12446;

    C2698(int i, int i2, Intent intent) {
        this.f12445 = i;
        this.f12444 = i2;
        this.f12446 = intent;
    }

    public C2698() {
        this(0, (Intent) null);
    }

    private C2698(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Status m14313() {
        if (this.f12444 == 0) {
            return Status.f532;
        }
        return Status.f531;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14532(parcel, 1, this.f12445);
        C2745.m14532(parcel, 2, this.f12444);
        C2745.m14542(parcel, 3, this.f12446, i, false);
        C2745.m14531(parcel, r0);
    }
}
