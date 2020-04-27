package o;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: o.Ι  reason: contains not printable characters */
public class C1784 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m9901(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static long m9899(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static long m9902(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static float m9905(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static long m9904(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: і  reason: contains not printable characters */
    public static CharSequence m9906(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static long m9907(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static List<Object> m9903(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static long m9900(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: o.Ι$ǃ  reason: contains not printable characters */
    public static final class C1785 {
        /* renamed from: ǃ  reason: contains not printable characters */
        public static String m9908(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public static CharSequence m9910(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static int m9911(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static Bundle m9909(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }
    }
}
