package o;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import o.C2745;

/* renamed from: o.Э  reason: contains not printable characters */
public final class C2381 {

    /* renamed from: ı  reason: contains not printable characters */
    final long f10910;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final String f10911;

    /* renamed from: ǃ  reason: contains not printable characters */
    final String f10912;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C2433 f10913;

    /* renamed from: Ι  reason: contains not printable characters */
    final long f10914;

    /* renamed from: ι  reason: contains not printable characters */
    final String f10915;

    private C2381(C2658 r2, String str, String str2, String str3, long j, long j2, C2433 r10) {
        C2745.C2746.m14562(str2);
        C2745.C2746.m14562(str3);
        C2745.C2746.m14555(r10);
        this.f10915 = str2;
        this.f10912 = str3;
        this.f10911 = TextUtils.isEmpty(str) ? null : str;
        this.f10910 = j;
        this.f10914 = j2;
        long j3 = this.f10914;
        if (j3 != 0 && j3 > this.f10910) {
            r2.t_().A_().m11605("Event created with reverse previous/current timestamps. appId, name", C2244.m11698(str2), C2244.m11698(str3));
        }
        this.f10913 = r10;
    }

    C2381(C2658 r1, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C2433 r12;
        C2745.C2746.m14562(str2);
        C2745.C2746.m14562(str3);
        this.f10915 = str2;
        this.f10912 = str3;
        this.f10911 = TextUtils.isEmpty(str) ? null : str;
        this.f10910 = j;
        this.f10914 = j2;
        long j3 = this.f10914;
        if (j3 != 0 && j3 > this.f10910) {
            r1.t_().A_().m11603("Event created with reverse previous/current timestamps. appId", C2244.m11698(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            r12 = new C2433(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    r1.t_().m11714().m11606("Param name can't be null");
                    it.remove();
                } else {
                    Object r5 = r1.m14116().m11401(str4, bundle2.get(str4));
                    if (r5 == null) {
                        r1.t_().A_().m11603("Param value can't be null", r1.m14115().m11219(str4));
                        it.remove();
                    } else {
                        r1.m14116().m11381(bundle2, str4, r5);
                    }
                }
            }
            r12 = new C2433(bundle2);
        }
        this.f10913 = r12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2381 m12377(C2658 r12, long j) {
        return new C2381(r12, this.f10911, this.f10915, this.f10912, this.f10910, j, this.f10913);
    }

    public final String toString() {
        String str = this.f10915;
        String str2 = this.f10912;
        String valueOf = String.valueOf(this.f10913);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + valueOf.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
