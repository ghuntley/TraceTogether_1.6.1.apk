package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: o.ƾӏ  reason: contains not printable characters */
public final class C0834 implements C1979 {
    public static final Parcelable.Creator<C0834> CREATOR = new C1308();

    /* renamed from: ǃ  reason: contains not printable characters */
    private C1229 f5467;

    /* renamed from: Ι  reason: contains not printable characters */
    private C1630 f5468;

    /* renamed from: ι  reason: contains not printable characters */
    private C1096 f5469;

    C0834(C1229 r1, C1096 r2, C1630 r3) {
        this.f5467 = r1;
        this.f5469 = r2;
        this.f5468 = r3;
    }

    public final int describeContents() {
        return 0;
    }

    public C0834(C1229 r7) {
        if (r7 != null) {
            this.f5467 = r7;
            List<C0980> list = this.f5467.f6980;
            this.f5469 = null;
            for (int i = 0; i < list.size(); i++) {
                if (!TextUtils.isEmpty(list.get(i).f5997)) {
                    this.f5469 = new C1096(list.get(i).f5991, list.get(i).f5997, r7.f6974);
                }
            }
            if (this.f5469 == null) {
                this.f5469 = new C1096(r7.f6974);
            }
            this.f5468 = r7.f6972;
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2164 m6300() {
        return this.f5467;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14542(parcel, 1, this.f5467, i, false);
        C2745.m14542(parcel, 2, this.f5469, i, false);
        C2745.m14542(parcel, 3, this.f5468, i, false);
        C2745.m14531(parcel, dataPosition);
    }
}
