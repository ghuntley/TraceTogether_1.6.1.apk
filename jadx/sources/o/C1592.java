package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ʀӀ  reason: contains not printable characters */
public final class C1592 extends C1602 {
    public static final Parcelable.Creator<C1592> CREATOR = new C1441();

    /* renamed from: ı  reason: contains not printable characters */
    private List<C1673> f8439;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f8440;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f8441;

    private C1592() {
    }

    C1592(String str, String str2, List<C1673> list) {
        this.f8441 = str;
        this.f8440 = str2;
        this.f8439 = list;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C1592 m9279(List<C2062> list, String str) {
        if (list == null) {
            throw new NullPointerException("null reference");
        } else if (!TextUtils.isEmpty(str)) {
            C1592 r0 = new C1592();
            r0.f8439 = new ArrayList();
            for (C2062 next : list) {
                if (next instanceof C1673) {
                    r0.f8439.add((C1673) next);
                }
            }
            r0.f8440 = str;
            return r0;
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f8441, false);
        C2745.m14545(parcel, 2, this.f8440, false);
        C2745.m14511(parcel, 3, this.f8439, false);
        C2745.m14531(parcel, dataPosition);
    }
}
