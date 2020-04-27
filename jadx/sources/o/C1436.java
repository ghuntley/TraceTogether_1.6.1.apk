package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.ɭȷ  reason: contains not printable characters */
public final class C1436 extends C1519 {
    public static final Parcelable.Creator<C1436> CREATOR = new C1373();

    /* renamed from: ı  reason: contains not printable characters */
    private String f7769;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f7770;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f7771;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f7772;

    /* renamed from: ι  reason: contains not printable characters */
    private String f7773;

    /* renamed from: І  reason: contains not printable characters */
    private String f7774;

    /* renamed from: і  reason: contains not printable characters */
    private String f7775;

    public C1436() {
    }

    C1436(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7772 = str;
        this.f7770 = str2;
        this.f7771 = str3;
        this.f7773 = str4;
        this.f7769 = str5;
        this.f7774 = str6;
        this.f7775 = str7;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m8677() {
        return this.f7772;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m8679() {
        return this.f7770;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Uri m8678() {
        if (!TextUtils.isEmpty(this.f7771)) {
            return Uri.parse(this.f7771);
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m8682() {
        return this.f7773;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m8681() {
        return this.f7774;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m8680() {
        return this.f7769;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final String m8683() {
        return this.f7775;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f7772, false);
        C2745.m14545(parcel, 3, this.f7770, false);
        C2745.m14545(parcel, 4, this.f7771, false);
        C2745.m14545(parcel, 5, this.f7773, false);
        C2745.m14545(parcel, 6, this.f7769, false);
        C2745.m14545(parcel, 7, this.f7774, false);
        C2745.m14545(parcel, 8, this.f7775, false);
        C2745.m14531(parcel, r5);
    }
}
