package o;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import o.C1795;
import o.C2319;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: o.ɩɾ  reason: contains not printable characters */
final class C1268 implements Parcelable {
    public static final Parcelable.Creator<C1268> CREATOR = new Parcelable.Creator<C1268>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C1268[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C1268(parcel);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    final int[] f7160;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final int f7161;

    /* renamed from: ǃ  reason: contains not printable characters */
    final int[] f7162;

    /* renamed from: ȷ  reason: contains not printable characters */
    final ArrayList<String> f7163;

    /* renamed from: ɨ  reason: contains not printable characters */
    final boolean f7164;

    /* renamed from: ɩ  reason: contains not printable characters */
    final ArrayList<String> f7165;

    /* renamed from: ɪ  reason: contains not printable characters */
    final ArrayList<String> f7166;

    /* renamed from: ɹ  reason: contains not printable characters */
    final String f7167;

    /* renamed from: Ι  reason: contains not printable characters */
    final int[] f7168;

    /* renamed from: ι  reason: contains not printable characters */
    final int f7169;

    /* renamed from: І  reason: contains not printable characters */
    final int f7170;

    /* renamed from: і  reason: contains not printable characters */
    final int f7171;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final CharSequence f7172;

    /* renamed from: ӏ  reason: contains not printable characters */
    final CharSequence f7173;

    public final int describeContents() {
        return 0;
    }

    public C1268(C1265 r8) {
        int size = r8.f9206.size();
        this.f7160 = new int[(size * 5)];
        if (r8.f9211) {
            this.f7165 = new ArrayList<>(size);
            this.f7162 = new int[size];
            this.f7168 = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1795.If ifR = r8.f9206.get(i);
                int i3 = i2 + 1;
                this.f7160[i2] = ifR.f9226;
                this.f7165.add(ifR.f9227 != null ? ifR.f9227.mWho : null);
                int i4 = i3 + 1;
                this.f7160[i3] = ifR.f9224;
                int i5 = i4 + 1;
                this.f7160[i4] = ifR.f9221;
                int i6 = i5 + 1;
                this.f7160[i5] = ifR.f9223;
                this.f7160[i6] = ifR.f9228;
                this.f7162[i] = ifR.f9222.ordinal();
                this.f7168[i] = ifR.f9225.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f7169 = r8.f9205;
            this.f7167 = r8.f9212;
            this.f7161 = r8.f7154;
            this.f7170 = r8.f9208;
            this.f7172 = r8.f9220;
            this.f7171 = r8.f9207;
            this.f7173 = r8.f9210;
            this.f7163 = r8.f9213;
            this.f7166 = r8.f9204;
            this.f7164 = r8.f9214;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C1268(Parcel parcel) {
        this.f7160 = parcel.createIntArray();
        this.f7165 = parcel.createStringArrayList();
        this.f7162 = parcel.createIntArray();
        this.f7168 = parcel.createIntArray();
        this.f7169 = parcel.readInt();
        this.f7167 = parcel.readString();
        this.f7161 = parcel.readInt();
        this.f7170 = parcel.readInt();
        this.f7172 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7171 = parcel.readInt();
        this.f7173 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7163 = parcel.createStringArrayList();
        this.f7166 = parcel.createStringArrayList();
        this.f7164 = parcel.readInt() != 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1265 m8163(C1550 r8) {
        C1265 r0 = new C1265(r8);
        int i = 0;
        int i2 = 0;
        while (i < this.f7160.length) {
            C1795.If ifR = new C1795.If();
            int i3 = i + 1;
            ifR.f9226 = this.f7160[i];
            C1550.m9081(2);
            String str = this.f7165.get(i2);
            C1277 r4 = null;
            if (str != null) {
                C1688 r1 = r8.f8274.f13048.get(str);
                if (r1 != null) {
                    r4 = r1.f8760;
                }
                ifR.f9227 = r4;
            } else {
                ifR.f9227 = null;
            }
            ifR.f9222 = C2319.Cif.values()[this.f7162[i2]];
            ifR.f9225 = C2319.Cif.values()[this.f7168[i2]];
            int[] iArr = this.f7160;
            int i4 = i3 + 1;
            ifR.f9224 = iArr[i3];
            int i5 = i4 + 1;
            ifR.f9221 = iArr[i4];
            int i6 = i5 + 1;
            ifR.f9223 = iArr[i5];
            ifR.f9228 = iArr[i6];
            r0.f9209 = ifR.f9224;
            r0.f9203 = ifR.f9221;
            r0.f9217 = ifR.f9223;
            r0.f9219 = ifR.f9228;
            r0.m9971(ifR);
            i2++;
            i = i6 + 1;
        }
        r0.f9205 = this.f7169;
        r0.f9212 = this.f7167;
        r0.f7154 = this.f7161;
        r0.f9211 = true;
        r0.f9208 = this.f7170;
        r0.f9220 = this.f7172;
        r0.f9207 = this.f7171;
        r0.f9210 = this.f7173;
        r0.f9213 = this.f7163;
        r0.f9204 = this.f7166;
        r0.f9214 = this.f7164;
        r0.m8139(1);
        return r0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f7160);
        parcel.writeStringList(this.f7165);
        parcel.writeIntArray(this.f7162);
        parcel.writeIntArray(this.f7168);
        parcel.writeInt(this.f7169);
        parcel.writeString(this.f7167);
        parcel.writeInt(this.f7161);
        parcel.writeInt(this.f7170);
        TextUtils.writeToParcel(this.f7172, parcel, 0);
        parcel.writeInt(this.f7171);
        TextUtils.writeToParcel(this.f7173, parcel, 0);
        parcel.writeStringList(this.f7163);
        parcel.writeStringList(this.f7166);
        parcel.writeInt(this.f7164 ? 1 : 0);
    }
}
