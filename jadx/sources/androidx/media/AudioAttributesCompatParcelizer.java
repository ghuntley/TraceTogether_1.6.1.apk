package androidx.media;

import o.C2620;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C2620 r2) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f260 = r2.m13898(audioAttributesCompat.f260);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C2620 r1) {
        r1.m13912(audioAttributesCompat.f260);
    }
}
