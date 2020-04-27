package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C0712;

/* renamed from: o.ɨյ  reason: contains not printable characters */
public class C1229 extends C2164 {
    public static final Parcelable.Creator<C1229> CREATOR = new C1385();

    /* renamed from: ı  reason: contains not printable characters */
    public C1630 f6972;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C0980 f6973;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f6974;

    /* renamed from: ȷ  reason: contains not printable characters */
    private List<String> f6975;

    /* renamed from: ɩ  reason: contains not printable characters */
    String f6976;

    /* renamed from: ɹ  reason: contains not printable characters */
    public C0562 f6977;

    /* renamed from: ɾ  reason: contains not printable characters */
    private Boolean f6978;

    /* renamed from: Ι  reason: contains not printable characters */
    public C1145 f6979;

    /* renamed from: ι  reason: contains not printable characters */
    List<C0980> f6980;

    /* renamed from: І  reason: contains not printable characters */
    private C1383 f6981;

    /* renamed from: і  reason: contains not printable characters */
    private String f6982;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f6983;

    C1229(C1383 r1, C0980 r2, String str, String str2, List<C0980> list, List<String> list2, String str3, Boolean bool, C1145 r9, boolean z, C1630 r11, C0562 r12) {
        this.f6981 = r1;
        this.f6973 = r2;
        this.f6982 = str;
        this.f6983 = str2;
        this.f6980 = list;
        this.f6975 = list2;
        this.f6976 = str3;
        this.f6978 = bool;
        this.f6979 = r9;
        this.f6974 = z;
        this.f6972 = r11;
        this.f6977 = r12;
    }

    public C1229(FirebaseApp firebaseApp, List<? extends C2437> list) {
        if (firebaseApp != null) {
            this.f6982 = firebaseApp.m1076();
            this.f6983 = "com.google.firebase.auth.internal.DefaultFirebaseUser";
            this.f6976 = "2";
            m11462(list);
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final String m7925() {
        Map map;
        C1383 r0 = this.f6981;
        if (r0 == null || r0.m8536() == null || (map = (Map) C0627.m5339(this.f6981.m8536()).f11652.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final String m7939() {
        return this.f6973.f5991;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final FirebaseApp m7938() {
        return FirebaseApp.m1069(this.f6982);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m7929() {
        return this.f6973.f5993;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7934() {
        String str;
        Boolean bool = this.f6978;
        if (bool == null || bool.booleanValue()) {
            C1383 r0 = this.f6981;
            if (r0 != null) {
                Map map = (Map) C0627.m5339(r0.m8536()).f11652.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = true;
            if (m11467().size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.f6978 = Boolean.valueOf(z);
        }
        return this.f6978.booleanValue();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<String> m7926() {
        return this.f6975;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2164 m7930(List<? extends C2437> list) {
        if (list != null) {
            this.f6980 = new ArrayList(list.size());
            this.f6975 = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                C2437 r2 = (C2437) list.get(i);
                if (r2.m12538().equals("firebase")) {
                    this.f6973 = (C0980) r2;
                } else {
                    this.f6975.add(r2.m12538());
                }
                this.f6980.add((C0980) r2);
            }
            if (this.f6973 == null) {
                this.f6973 = this.f6980.get(0);
            }
            return this;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<? extends C2437> m7935() {
        return this.f6980;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final C1383 m7936() {
        return this.f6981;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final String m7937() {
        return m11468().m8536();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m7932() {
        return this.f6981.m8538();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7927(C1383 r2) {
        if (r2 != null) {
            this.f6981 = r2;
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final C0712.C0713 m7928() {
        return this.f6979;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7933(List<C2062> list) {
        this.f6977 = C0562.m5175(list);
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* synthetic */ C1726 m7931() {
        return new C1726(this);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ C2164 m7924() {
        this.f6978 = Boolean.FALSE;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14542(parcel, 1, m11468(), i, false);
        C2745.m14542(parcel, 2, this.f6973, i, false);
        C2745.m14545(parcel, 3, this.f6982, false);
        C2745.m14545(parcel, 4, this.f6983, false);
        C2745.m14511(parcel, 5, this.f6980, false);
        C2745.m14521(parcel, 6, m11458(), false);
        C2745.m14545(parcel, 7, this.f6976, false);
        Boolean valueOf = Boolean.valueOf(m11466());
        if (valueOf != null) {
            C2745.m14503(parcel, 8, 4);
            parcel.writeInt(valueOf.booleanValue() ? 1 : 0);
        }
        C2745.m14542(parcel, 9, m11460(), i, false);
        boolean z = this.f6974;
        C2745.m14503(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        C2745.m14542(parcel, 11, this.f6972, i, false);
        C2745.m14542(parcel, 12, this.f6977, i, false);
        C2745.m14531(parcel, dataPosition);
    }
}
