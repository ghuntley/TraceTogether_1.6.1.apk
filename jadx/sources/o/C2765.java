package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Ӏƨ  reason: contains not printable characters */
public final class C2765 extends C1519 {
    public static final Parcelable.Creator<C2765> CREATOR = new C2805();

    /* renamed from: ı  reason: contains not printable characters */
    private final C1334 f13103;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2822 f13104;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f13105;

    C2765(int i, C2822 r2, C1334 r3) {
        this.f13105 = i;
        this.f13104 = r2;
        this.f13103 = r3;
    }

    public C2765(int i) {
        this(new C2822(8, (PendingIntent) null), (C1334) null);
    }

    private C2765(C2822 r2, C1334 r3) {
        this(1, r2, (C1334) null);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2822 m14628() {
        return this.f13104;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1334 m14629() {
        return this.f13103;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14532(parcel, 1, this.f13105);
        C2745.m14542(parcel, 2, this.f13104, i, false);
        C2745.m14542(parcel, 3, this.f13103, i, false);
        C2745.m14531(parcel, r0);
    }
}
