package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.ɪх  reason: contains not printable characters */
public final class C1393 extends C1519 {
    public static final Parcelable.Creator<C1393> CREATOR = new C1423();

    /* renamed from: ı  reason: contains not printable characters */
    private List<C1436> f7639;

    public C1393() {
        this.f7639 = new ArrayList();
    }

    C1393(List<C1436> list) {
        if (list == null || list.isEmpty()) {
            this.f7639 = Collections.emptyList();
        } else {
            this.f7639 = Collections.unmodifiableList(list);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C1436> m8559() {
        return this.f7639;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1393 m8558(C1393 r2) {
        List<C1436> list = r2.f7639;
        C1393 r0 = new C1393();
        if (list != null) {
            r0.f7639.addAll(list);
        }
        return r0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14511(parcel, 2, this.f7639, false);
        C2745.m14531(parcel, r5);
    }
}
