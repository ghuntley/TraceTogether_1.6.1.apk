package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import o.C1974;
import o.C2745;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C1974();

    /* renamed from: ı  reason: contains not printable characters */
    private int f560;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final long f561;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f562;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final float f563;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final String f564;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f565;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f566;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final String f567;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final long f568;

    /* renamed from: ɿ  reason: contains not printable characters */
    private long f569;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f570;

    /* renamed from: ι  reason: contains not printable characters */
    private final long f571;

    /* renamed from: І  reason: contains not printable characters */
    private final String f572;

    /* renamed from: і  reason: contains not printable characters */
    private final int f573;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final List<String> f574;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final boolean f575;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f562 = i;
        this.f571 = j;
        this.f560 = i2;
        this.f570 = str;
        this.f565 = str3;
        this.f567 = str5;
        this.f573 = i3;
        this.f569 = -1;
        this.f574 = list;
        this.f572 = str2;
        this.f561 = j2;
        this.f566 = i4;
        this.f564 = str4;
        this.f563 = f;
        this.f568 = j3;
        this.f575 = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, float f, long j3) {
        this(2, j, i, str, i2, list, str2, j2, i3, (String) null, str3, f, j3, (String) null, false);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m786() {
        return this.f571;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m789() {
        return this.f560;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m787() {
        return this.f569;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m788() {
        String str;
        String str2 = this.f570;
        int i = this.f573;
        List<String> list = this.f574;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f566;
        String str4 = this.f565;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f564;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f563;
        String str6 = this.f567;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f575;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f562;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        long r3 = m782();
        C2745.m14503(parcel, 2, 8);
        parcel.writeLong(r3);
        C2745.m14545(parcel, 4, this.f570, false);
        int i3 = this.f573;
        C2745.m14503(parcel, 5, 4);
        parcel.writeInt(i3);
        C2745.m14521(parcel, 6, this.f574, false);
        long j = this.f561;
        C2745.m14503(parcel, 8, 8);
        parcel.writeLong(j);
        C2745.m14545(parcel, 10, this.f565, false);
        int r32 = m785();
        C2745.m14503(parcel, 11, 4);
        parcel.writeInt(r32);
        C2745.m14545(parcel, 12, this.f572, false);
        C2745.m14545(parcel, 13, this.f564, false);
        int i4 = this.f566;
        C2745.m14503(parcel, 14, 4);
        parcel.writeInt(i4);
        float f = this.f563;
        C2745.m14503(parcel, 15, 4);
        parcel.writeFloat(f);
        long j2 = this.f568;
        C2745.m14503(parcel, 16, 8);
        parcel.writeLong(j2);
        C2745.m14545(parcel, 17, this.f567, false);
        boolean z = this.f575;
        C2745.m14503(parcel, 18, 4);
        parcel.writeInt(z ? 1 : 0);
        C2745.m14531(parcel, dataPosition);
    }
}
