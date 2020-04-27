package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* renamed from: o.зι  reason: contains not printable characters */
public final class C2433 extends C1519 implements Iterable<String> {
    public static final Parcelable.Creator<C2433> CREATOR = new C2501();
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final Bundle f11066;

    public C2433(Bundle bundle) {
        this.f11066 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14541(parcel, 2, m12527(), false);
        C2745.m14531(parcel, r5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final Object m12532(String str) {
        return this.f11066.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Long m12530(String str) {
        return Long.valueOf(this.f11066.getLong(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final Double m12529(String str) {
        return Double.valueOf(this.f11066.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final String m12528(String str) {
        return this.f11066.getString(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m12531() {
        return this.f11066.size();
    }

    public final String toString() {
        return this.f11066.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Bundle m12527() {
        return new Bundle(this.f11066);
    }

    public final Iterator<String> iterator() {
        return new C2429(this);
    }
}
