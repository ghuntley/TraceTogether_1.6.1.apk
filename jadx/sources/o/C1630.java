package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ʊı  reason: contains not printable characters */
public class C1630 extends C2230 {
    public static final Parcelable.Creator<C1630> CREATOR = new C1887();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f8573;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f8574;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f8575;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final String f8576;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1522 f8577;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f8578;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final String f8579;

    C1630(String str, String str2, String str3, C1522 r4, String str4, String str5, String str6) {
        this.f8573 = str;
        this.f8574 = str2;
        this.f8578 = str3;
        this.f8577 = r4;
        this.f8575 = str4;
        this.f8579 = str5;
        this.f8576 = str6;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1630 m9394(C1522 r9) {
        if (r9 != null) {
            return new C1630((String) null, (String) null, (String) null, r9, (String) null, (String) null, (String) null);
        }
        throw new NullPointerException("Must specify a non-null webSignInCredential");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m9399() {
        return this.f8573;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m9396() {
        return this.f8573;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m9395() {
        return this.f8574;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m9397() {
        return this.f8578;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final String m9400() {
        return this.f8579;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1522 m9393(C1630 r11, String str) {
        if (r11 != null) {
            C1522 r0 = r11.f8577;
            if (r0 != null) {
                return r0;
            }
            return new C1522(r11.m11678(), r11.m11679(), r11.m10704(), (String) null, r11.m11680(), (String) null, str, r11.f8575, r11.f8576);
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m9398() {
        return new C1630(this.f8573, this.f8574, this.f8578, this.f8577, this.f8575, this.f8579, this.f8576);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, m10704(), false);
        C2745.m14545(parcel, 2, m11678(), false);
        C2745.m14545(parcel, 3, m11679(), false);
        C2745.m14542(parcel, 4, this.f8577, i, false);
        C2745.m14545(parcel, 5, this.f8575, false);
        C2745.m14545(parcel, 6, m11680(), false);
        C2745.m14545(parcel, 7, this.f8576, false);
        C2745.m14531(parcel, dataPosition);
    }
}
