package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: o.ɩғ  reason: contains not printable characters */
public final class C1314 extends C1519 {
    public static final Parcelable.Creator<C1314> CREATOR = new C1352();

    /* renamed from: ı  reason: contains not printable characters */
    private String f7300;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C1393 f7301;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f7302;

    /* renamed from: ȷ  reason: contains not printable characters */
    private List<C1384> f7303;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f7304;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C1630 f7305;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f7306;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f7307;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f7308;

    /* renamed from: ι  reason: contains not printable characters */
    private String f7309;

    /* renamed from: І  reason: contains not printable characters */
    private long f7310;

    /* renamed from: і  reason: contains not printable characters */
    private long f7311;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f7312;

    public C1314() {
        this.f7301 = new C1393();
    }

    public C1314(String str, String str2, boolean z, String str3, String str4, C1393 r6, String str5, String str6, long j, long j2, boolean z2, C1630 r14, List<C1384> list) {
        C1393 r1;
        this.f7308 = str;
        this.f7304 = str2;
        this.f7302 = z;
        this.f7309 = str3;
        this.f7300 = str4;
        if (r6 == null) {
            r1 = new C1393();
        } else {
            r1 = C1393.m8558(r6);
        }
        this.f7301 = r1;
        this.f7306 = str5;
        this.f7312 = str6;
        this.f7311 = j;
        this.f7310 = j2;
        this.f7307 = z2;
        this.f7305 = r14;
        this.f7303 = list == null ? C0719.m5842() : list;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m8280() {
        return this.f7304;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8281() {
        return this.f7302;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m8274() {
        return this.f7308;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m8277() {
        return this.f7309;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Uri m8276() {
        if (!TextUtils.isEmpty(this.f7300)) {
            return Uri.parse(this.f7300);
        }
        return null;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final String m8282() {
        return this.f7312;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final long m8284() {
        return this.f7311;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long m8275() {
        return this.f7310;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m8279() {
        return this.f7307;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final List<C1436> m8283() {
        return this.f7301.m8559();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final C1630 m8285() {
        return this.f7305;
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final List<C1384> m8278() {
        return this.f7303;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f7308, false);
        C2745.m14545(parcel, 3, this.f7304, false);
        C2745.m14546(parcel, 4, this.f7302);
        C2745.m14545(parcel, 5, this.f7309, false);
        C2745.m14545(parcel, 6, this.f7300, false);
        C2745.m14542(parcel, 7, this.f7301, i, false);
        C2745.m14545(parcel, 8, this.f7306, false);
        C2745.m14545(parcel, 9, this.f7312, false);
        C2745.m14508(parcel, 10, this.f7311);
        C2745.m14508(parcel, 11, this.f7310);
        C2745.m14546(parcel, 12, this.f7307);
        C2745.m14542(parcel, 13, this.f7305, i, false);
        C2745.m14511(parcel, 14, this.f7303, false);
        C2745.m14531(parcel, r0);
    }
}
