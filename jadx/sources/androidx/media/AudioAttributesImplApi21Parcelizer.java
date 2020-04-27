package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import o.C0405;
import o.C2620;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0405 read(C2620 r3) {
        C0405 r0 = new C0405();
        r0.f3964 = (AudioAttributes) r3.m13908(r0.f3964, 1);
        r0.f3963 = r3.m13915(r0.f3963, 2);
        return r0;
    }

    public static void write(C0405 r2, C2620 r3) {
        r3.m13906((Parcelable) r2.f3964, 1);
        r3.m13924(r2.f3963, 2);
    }
}
