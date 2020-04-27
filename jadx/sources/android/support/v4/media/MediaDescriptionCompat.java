package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import o.C1230;
import o.Cif;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        /* renamed from: ɩ  reason: contains not printable characters */
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m14(Cif.m2687(parcel));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    private final CharSequence f13;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Bundle f14;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final CharSequence f15;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final CharSequence f16;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Uri f17;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Bitmap f18;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f19;

    /* renamed from: і  reason: contains not printable characters */
    private Object f20;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Uri f21;

    public final int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f19 = str;
        this.f16 = charSequence;
        this.f15 = charSequence2;
        this.f13 = charSequence3;
        this.f18 = bitmap;
        this.f17 = uri;
        this.f14 = bundle;
        this.f21 = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f19 = parcel.readString();
        this.f16 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f18 = (Bitmap) parcel.readParcelable(classLoader);
        this.f17 = (Uri) parcel.readParcelable(classLoader);
        this.f14 = parcel.readBundle(classLoader);
        this.f21 = (Uri) parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f19);
            TextUtils.writeToParcel(this.f16, parcel, i);
            TextUtils.writeToParcel(this.f15, parcel, i);
            TextUtils.writeToParcel(this.f13, parcel, i);
            parcel.writeParcelable(this.f18, i);
            parcel.writeParcelable(this.f17, i);
            parcel.writeBundle(this.f14);
            parcel.writeParcelable(this.f21, i);
            return;
        }
        Cif.m2688(m15(), parcel, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16);
        sb.append(", ");
        sb.append(this.f15);
        sb.append(", ");
        sb.append(this.f13);
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m15() {
        if (this.f20 != null || Build.VERSION.SDK_INT < 21) {
            return this.f20;
        }
        Object r0 = Cif.If.m2693();
        Cif.If.m2696(r0, this.f19);
        Cif.If.m2700(r0, this.f16);
        Cif.If.m2698(r0, this.f15);
        Cif.If.m2701(r0, this.f13);
        Cif.If.m2695(r0, this.f18);
        Cif.If.m2699(r0, this.f17);
        Bundle bundle = this.f14;
        if (Build.VERSION.SDK_INT < 23 && this.f21 != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f21);
        }
        Cif.If.m2697(r0, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C1230.If.m7941(r0, this.f21);
        }
        this.f20 = Cif.If.m2694(r0);
        return this.f20;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat m14(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$ı r1 = new android.support.v4.media.MediaDescriptionCompat$ı
            r1.<init>()
            java.lang.String r2 = o.Cif.m2691(r8)
            r1.m26(r2)
            java.lang.CharSequence r2 = o.Cif.m2686((java.lang.Object) r8)
            r1.m25((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = o.Cif.m2692(r8)
            r1.m18(r2)
            java.lang.CharSequence r2 = o.Cif.m2689(r8)
            r1.m22(r2)
            android.graphics.Bitmap r2 = o.Cif.m2684(r8)
            r1.m23((android.graphics.Bitmap) r2)
            android.net.Uri r2 = o.Cif.m2690(r8)
            r1.m19((android.net.Uri) r2)
            android.os.Bundle r2 = o.Cif.m2685(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.v4.media.session.MediaSessionCompat.m73(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.m20((android.os.Bundle) r0)
            if (r4 == 0) goto L_0x006d
            r1.m24((android.net.Uri) r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = o.C1230.m7940(r8)
            r1.m24((android.net.Uri) r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.m21()
            r0.f20 = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m14(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$ı  reason: contains not printable characters */
    public static final class C0003 {

        /* renamed from: ı  reason: contains not printable characters */
        private CharSequence f22;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Bitmap f23;

        /* renamed from: ɩ  reason: contains not printable characters */
        private CharSequence f24;

        /* renamed from: ɹ  reason: contains not printable characters */
        private Uri f25;

        /* renamed from: Ι  reason: contains not printable characters */
        private String f26;

        /* renamed from: ι  reason: contains not printable characters */
        private CharSequence f27;

        /* renamed from: І  reason: contains not printable characters */
        private Uri f28;

        /* renamed from: і  reason: contains not printable characters */
        private Bundle f29;

        /* renamed from: ι  reason: contains not printable characters */
        public final C0003 m26(String str) {
            this.f26 = str;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0003 m25(CharSequence charSequence) {
            this.f24 = charSequence;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0003 m18(CharSequence charSequence) {
            this.f27 = charSequence;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0003 m22(CharSequence charSequence) {
            this.f22 = charSequence;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0003 m23(Bitmap bitmap) {
            this.f23 = bitmap;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0003 m19(Uri uri) {
            this.f28 = uri;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0003 m20(Bundle bundle) {
            this.f29 = bundle;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0003 m24(Uri uri) {
            this.f25 = uri;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final MediaDescriptionCompat m21() {
            return new MediaDescriptionCompat(this.f26, this.f24, this.f27, this.f22, this.f23, this.f28, this.f29, this.f25);
        }
    }
}
