package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import o.C0299;
import o.C0880;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
        /* renamed from: Ι  reason: contains not printable characters */
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    private static final String[] f30 = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: ǃ  reason: contains not printable characters */
    static final C0299<String, Integer> f31;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String[] f32 = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String[] f33 = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: ι  reason: contains not printable characters */
    final Bundle f34;

    /* renamed from: і  reason: contains not printable characters */
    private Object f35;

    public final int describeContents() {
        return 0;
    }

    static {
        C0299<String, Integer> r0 = new C0299<>();
        f31 = r0;
        r0.put("android.media.metadata.TITLE", 1);
        f31.put("android.media.metadata.ARTIST", 1);
        f31.put("android.media.metadata.DURATION", 0);
        f31.put("android.media.metadata.ALBUM", 1);
        f31.put("android.media.metadata.AUTHOR", 1);
        f31.put("android.media.metadata.WRITER", 1);
        f31.put("android.media.metadata.COMPOSER", 1);
        f31.put("android.media.metadata.COMPILATION", 1);
        f31.put("android.media.metadata.DATE", 1);
        f31.put("android.media.metadata.YEAR", 0);
        f31.put("android.media.metadata.GENRE", 1);
        f31.put("android.media.metadata.TRACK_NUMBER", 0);
        f31.put("android.media.metadata.NUM_TRACKS", 0);
        f31.put("android.media.metadata.DISC_NUMBER", 0);
        f31.put("android.media.metadata.ALBUM_ARTIST", 1);
        f31.put("android.media.metadata.ART", 2);
        f31.put("android.media.metadata.ART_URI", 1);
        f31.put("android.media.metadata.ALBUM_ART", 2);
        f31.put("android.media.metadata.ALBUM_ART_URI", 1);
        f31.put("android.media.metadata.USER_RATING", 3);
        f31.put("android.media.metadata.RATING", 3);
        f31.put("android.media.metadata.DISPLAY_TITLE", 1);
        f31.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f31.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f31.put("android.media.metadata.DISPLAY_ICON", 2);
        f31.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f31.put("android.media.metadata.MEDIA_ID", 1);
        f31.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f31.put("android.media.metadata.MEDIA_URI", 1);
        f31.put("android.media.metadata.ADVERTISEMENT", 0);
        f31.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f34 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f34);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static MediaMetadataCompat m27(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0880.m6564(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f35 = obj;
        return createFromParcel;
    }
}
