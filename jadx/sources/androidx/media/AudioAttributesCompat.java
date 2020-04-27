package androidx.media;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import o.C0712;

public class AudioAttributesCompat implements C0712.C0713 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final SparseIntArray f258;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int[] f259 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: ı  reason: contains not printable characters */
    C0712.C0713 f260;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f258 = sparseIntArray;
        sparseIntArray.put(5, 1);
        f258.put(6, 2);
        f258.put(7, 2);
        f258.put(8, 1);
        f258.put(9, 1);
        f258.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    public int hashCode() {
        return this.f260.hashCode();
    }

    public String toString() {
        return this.f260.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m217(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage ".concat(String.valueOf(i));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m218(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
                if (z) {
                    return RecyclerView.UNDEFINED_DURATION;
                }
                return 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder("Unknown usage value ");
                sb.append(i2);
                sb.append(" in audio attributes");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        C0712.C0713 r0 = this.f260;
        if (r0 != null) {
            return r0.equals(audioAttributesCompat.f260);
        }
        if (audioAttributesCompat.f260 == null) {
            return true;
        }
        return false;
    }
}
