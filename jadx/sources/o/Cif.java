package o;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: o.if  reason: invalid class name */
public class Cif {
    /* renamed from: Ι  reason: contains not printable characters */
    public static String m2691(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static CharSequence m2686(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static CharSequence m2692(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static CharSequence m2689(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Bitmap m2684(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static Uri m2690(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static Bundle m2685(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m2688(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Object m2687(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: o.if$If */
    public static class If {
        /* renamed from: ı  reason: contains not printable characters */
        public static Object m2693() {
            return new MediaDescription.Builder();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static void m2696(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static void m2700(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static void m2698(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static void m2701(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static void m2695(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static void m2699(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static void m2697(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static Object m2694(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }
    }
}
