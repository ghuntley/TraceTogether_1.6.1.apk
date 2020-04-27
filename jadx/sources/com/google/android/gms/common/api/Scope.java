package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o.C1199;
import o.C1519;
import o.C2745;

public final class Scope extends C1519 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1199();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f529;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f530;

    public Scope(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f529 = i;
            this.f530 = str;
            return;
        }
        throw new IllegalArgumentException("scopeUri must not be null or empty");
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f530.equals(((Scope) obj).f530);
    }

    public final int hashCode() {
        return this.f530.hashCode();
    }

    public final String toString() {
        return this.f530;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f529;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        C2745.m14545(parcel, 2, this.f530, false);
        C2745.m14531(parcel, dataPosition);
    }
}
