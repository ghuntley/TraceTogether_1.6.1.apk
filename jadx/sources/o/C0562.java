package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ŧƗ  reason: contains not printable characters */
public final class C0562 extends C1519 {
    public static final Parcelable.Creator<C0562> CREATOR = new C0633();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C1673> f4464;

    C0562(List<C1673> list) {
        this.f4464 = list == null ? C0719.m5842() : list;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0562 m5175(List<C2062> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C2062 next : list) {
            if (next instanceof C1673) {
                arrayList.add((C1673) next);
            }
        }
        return new C0562(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14511(parcel, 1, this.f4464, false);
        C2745.m14531(parcel, dataPosition);
    }
}
