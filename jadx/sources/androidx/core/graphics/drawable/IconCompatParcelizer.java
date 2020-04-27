package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import o.C2620;

public class IconCompatParcelizer {
    public static IconCompat read(C2620 r3) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f191 = r3.m13915(iconCompat.f191, 1);
        iconCompat.f187 = r3.m13902(iconCompat.f187);
        iconCompat.f190 = r3.m13908(iconCompat.f190, 3);
        iconCompat.f188 = r3.m13915(iconCompat.f188, 4);
        iconCompat.f189 = r3.m13915(iconCompat.f189, 5);
        iconCompat.f193 = (ColorStateList) r3.m13908(iconCompat.f193, 6);
        iconCompat.f194 = r3.m13909(iconCompat.f194);
        iconCompat.m610();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C2620 r3) {
        iconCompat.m609(false);
        if (-1 != iconCompat.f191) {
            r3.m13924(iconCompat.f191, 1);
        }
        if (iconCompat.f187 != null) {
            r3.m13926(iconCompat.f187);
        }
        if (iconCompat.f190 != null) {
            r3.m13906(iconCompat.f190, 3);
        }
        if (iconCompat.f188 != 0) {
            r3.m13924(iconCompat.f188, 4);
        }
        if (iconCompat.f189 != 0) {
            r3.m13924(iconCompat.f189, 5);
        }
        if (iconCompat.f193 != null) {
            r3.m13906((Parcelable) iconCompat.f193, 6);
        }
        if (iconCompat.f194 != null) {
            r3.m13907(iconCompat.f194);
        }
    }
}
