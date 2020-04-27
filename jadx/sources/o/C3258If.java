package o;

import android.media.browse.MediaBrowser;
import android.os.Parcel;

/* renamed from: o.If  reason: case insensitive filesystem */
public class C3258If {

    /* renamed from: o.If$ǃ  reason: contains not printable characters */
    public interface C0098 {
        /* renamed from: ι  reason: contains not printable characters */
        void m1375(Parcel parcel);

        /* renamed from: ι  reason: contains not printable characters */
        void m1376(String str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Object m1374(C0098 r1) {
        return new Cif(r1);
    }

    /* renamed from: o.If$if  reason: invalid class name */
    static class Cif<T extends C0098> extends MediaBrowser.ItemCallback {

        /* renamed from: Ι  reason: contains not printable characters */
        protected final T f1268;

        public Cif(T t) {
            this.f1268 = t;
        }

        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f1268.m1375((Parcel) null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f1268.m1375(obtain);
        }

        public void onError(String str) {
            this.f1268.m1376(str);
        }
    }
}
