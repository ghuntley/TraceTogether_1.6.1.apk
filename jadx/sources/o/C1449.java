package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C2745;

/* renamed from: o.ɭӏ  reason: contains not printable characters */
public final class C1449 extends C1519 {
    public static final Parcelable.Creator<C1449> CREATOR = new C1497();

    /* renamed from: ǃ  reason: contains not printable characters */
    private List<String> f7794;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f7795;

    public C1449() {
        this((List<String>) null);
    }

    private C1449(List<String> list) {
        this.f7795 = 1;
        this.f7794 = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f7794.addAll(list);
        }
    }

    C1449(int i, List<String> list) {
        this.f7795 = i;
        if (list == null || list.isEmpty()) {
            this.f7794 = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, C2745.C2746.m14564(list.get(i2)));
        }
        this.f7794 = Collections.unmodifiableList(list);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1449 m8712() {
        return new C1449((List<String>) null);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1449 m8713(C1449 r1) {
        return new C1449(r1 != null ? r1.f7794 : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14532(parcel, 1, this.f7795);
        C2745.m14521(parcel, 2, this.f7794, false);
        C2745.m14531(parcel, r5);
    }
}
