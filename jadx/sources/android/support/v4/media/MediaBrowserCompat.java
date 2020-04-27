package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.C2210;
import o.C3258If;

public final class MediaBrowserCompat {

    /* renamed from: ı  reason: contains not printable characters */
    static final boolean f0 = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ı  reason: contains not printable characters */
    public static abstract class C0001 {
        /* renamed from: ı  reason: contains not printable characters */
        public void m9(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m10(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m11(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ǃ  reason: contains not printable characters */
    public static abstract class C0002 {
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m12(String str, Bundle bundle, List<MediaItem> list) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m13(String str, Bundle bundle) {
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* renamed from: ι  reason: contains not printable characters */
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: Ι  reason: contains not printable characters */
        private final MediaDescriptionCompat f8;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f9;

        public int describeContents() {
            return 0;
        }

        MediaItem(Parcel parcel) {
            this.f9 = parcel.readInt();
            this.f8 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9);
            this.f8.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.f9);
            sb.append(", mDescription=");
            sb.append(this.f8);
            sb.append('}');
            return sb.toString();
        }
    }

    public static abstract class If {

        /* renamed from: ı  reason: contains not printable characters */
        final Object f4;

        /* renamed from: ı  reason: contains not printable characters */
        public void m1(MediaItem mediaItem) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m2(String str) {
        }

        public If() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f4 = C3258If.m1374(new C0000());
            } else {
                this.f4 = null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$If$ǃ  reason: contains not printable characters */
        class C0000 implements C3258If.C0098 {
            C0000() {
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m3(Parcel parcel) {
                if (parcel == null) {
                    If.this.m1((MediaItem) null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                If.this.m1(MediaItem.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m4(String str) {
                If.this.m2(str);
            }
        }
    }

    static class ItemReceiver extends C2210 {

        /* renamed from: ı  reason: contains not printable characters */
        private final If f6;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f7;

        /* renamed from: ι  reason: contains not printable characters */
        public void m5(int i, Bundle bundle) {
            MediaSessionCompat.m73(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f6.m2(this.f7);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f6.m1((MediaItem) parcelable);
            } else {
                this.f6.m2(this.f7);
            }
        }
    }

    static class SearchResultReceiver extends C2210 {

        /* renamed from: ı  reason: contains not printable characters */
        private final Bundle f10;

        /* renamed from: ɹ  reason: contains not printable characters */
        private final C0002 f11;

        /* renamed from: ι  reason: contains not printable characters */
        private final String f12;

        /* renamed from: ι  reason: contains not printable characters */
        public void m8(int i, Bundle bundle) {
            MediaSessionCompat.m73(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f11.m13(this.f12, this.f10);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f11.m12(this.f12, this.f10, arrayList);
        }
    }

    static class CustomActionResultReceiver extends C2210 {

        /* renamed from: ı  reason: contains not printable characters */
        private final String f1;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final C0001 f2;

        /* renamed from: ι  reason: contains not printable characters */
        private final Bundle f3;

        /* renamed from: ι  reason: contains not printable characters */
        public void m0(int i, Bundle bundle) {
            if (this.f2 != null) {
                MediaSessionCompat.m73(bundle);
                if (i == -1) {
                    this.f2.m10(this.f1, this.f3, bundle);
                } else if (i == 0) {
                    this.f2.m11(this.f1, this.f3, bundle);
                } else if (i == 1) {
                    this.f2.m9(this.f1, this.f3, bundle);
                }
            }
        }
    }
}
