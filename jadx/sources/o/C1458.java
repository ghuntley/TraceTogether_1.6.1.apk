package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ɷ  reason: contains not printable characters */
public final class C1458 extends C1591 {
    public static final Parcelable.Creator<C1458> CREATOR = new C1589();

    /* renamed from: ı  reason: contains not printable characters */
    private final List<C1673> f7854 = new ArrayList();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1592 f7855;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f7856;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1229 f7857;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1630 f7858;

    public C1458(List<C1673> list, C1592 r4, String str, C1630 r6, C1229 r7) {
        for (C2062 next : list) {
            if (next instanceof C1673) {
                this.f7854.add((C1673) next);
            }
        }
        if (r4 != null) {
            this.f7855 = r4;
            if (!TextUtils.isEmpty(str)) {
                this.f7856 = str;
                this.f7858 = r6;
                this.f7857 = r7;
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1458 m8724(C1220 r7, FirebaseAuth firebaseAuth, C2164 r9) {
        List<C2062> r0 = r7.m7895();
        ArrayList arrayList = new ArrayList();
        for (C2062 next : r0) {
            if (next instanceof C1673) {
                arrayList.add((C1673) next);
            }
        }
        return new C1458(arrayList, C1592.m9279(r7.m7895(), r7.m7896()), firebaseAuth.f968.m1076(), r7.m7897(), (C1229) r9);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14511(parcel, 1, this.f7854, false);
        C2745.m14542(parcel, 2, this.f7855, i, false);
        C2745.m14545(parcel, 3, this.f7856, false);
        C2745.m14542(parcel, 4, this.f7858, i, false);
        C2745.m14542(parcel, 5, this.f7857, i, false);
        C2745.m14531(parcel, dataPosition);
    }
}
