package o;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.κӀ  reason: contains not printable characters */
public final class C2103 extends C1912 implements C2082 {
    C2103(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11240(C2441 r2, C2270 r3) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        C2165.m11475(r0, r3);
        m10391(1, r0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11235(C2113 r2, C2270 r3) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        C2165.m11475(r0, r3);
        m10391(2, r0);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11242(C2270 r2) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        m10391(4, r0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11230(C2441 r2, String str, String str2) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        r0.writeString(str);
        r0.writeString(str2);
        m10391(5, r0);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11239(C2270 r2) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        m10391(6, r0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2113> m11233(C2270 r2, boolean z) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        C2165.m11472(r0, z);
        Parcel r22 = m10392(7, r0);
        ArrayList<C2113> createTypedArrayList = r22.createTypedArrayList(C2113.CREATOR);
        r22.recycle();
        return createTypedArrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final byte[] m11229(C2441 r2, String str) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        r0.writeString(str);
        Parcel r22 = m10392(9, r0);
        byte[] createByteArray = r22.createByteArray();
        r22.recycle();
        return createByteArray;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11234(long j, String str, String str2, String str3) {
        Parcel r0 = m10390();
        r0.writeLong(j);
        r0.writeString(str);
        r0.writeString(str2);
        r0.writeString(str3);
        m10391(10, r0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m11227(C2270 r2) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        Parcel r22 = m10392(11, r0);
        String readString = r22.readString();
        r22.recycle();
        return readString;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11238(C2527 r2, C2270 r3) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        C2165.m11475(r0, r3);
        m10391(12, r0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11237(C2527 r2) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        m10391(13, r0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2113> m11232(String str, String str2, boolean z, C2270 r5) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11472(r0, z);
        C2165.m11475(r0, r5);
        Parcel r2 = m10392(14, r0);
        ArrayList<C2113> createTypedArrayList = r2.createTypedArrayList(C2113.CREATOR);
        r2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<C2113> m11228(String str, String str2, String str3, boolean z) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        r0.writeString(str3);
        C2165.m11472(r0, z);
        Parcel r2 = m10392(15, r0);
        ArrayList<C2113> createTypedArrayList = r2.createTypedArrayList(C2113.CREATOR);
        r2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2527> m11231(String str, String str2, C2270 r4) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11475(r0, r4);
        Parcel r2 = m10392(16, r0);
        ArrayList<C2527> createTypedArrayList = r2.createTypedArrayList(C2527.CREATOR);
        r2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<C2527> m11241(String str, String str2, String str3) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        r0.writeString(str3);
        Parcel r2 = m10392(17, r0);
        ArrayList<C2527> createTypedArrayList = r2.createTypedArrayList(C2527.CREATOR);
        r2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11236(C2270 r2) {
        Parcel r0 = m10390();
        C2165.m11475(r0, r2);
        m10391(18, r0);
    }
}
