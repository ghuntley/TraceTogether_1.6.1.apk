package o;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: o.iF  reason: case insensitive filesystem */
public class C3479iF {

    /* renamed from: o.iF$ɩ  reason: contains not printable characters */
    public interface C0184 {
        /* renamed from: ı  reason: contains not printable characters */
        void m2572();

        /* renamed from: ǃ  reason: contains not printable characters */
        void m2573(int i, int i2, int i3, int i4, int i5);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m2574(CharSequence charSequence);

        /* renamed from: ǃ  reason: contains not printable characters */
        void m2575(Object obj);

        /* renamed from: Ι  reason: contains not printable characters */
        void m2576(Bundle bundle);

        /* renamed from: Ι  reason: contains not printable characters */
        void m2577(Object obj);

        /* renamed from: Ι  reason: contains not printable characters */
        void m2578(String str, Bundle bundle);

        /* renamed from: ι  reason: contains not printable characters */
        void m2579(List<?> list);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Object m2568(C0184 r1) {
        return new Cif(r1);
    }

    /* renamed from: o.iF$If */
    public static class If {
        /* renamed from: Ι  reason: contains not printable characters */
        public static AudioAttributes m2570(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public static int m2571(Object obj) {
            return m2569(m2570(obj));
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private static int m2569(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
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
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: o.iF$if  reason: invalid class name */
    static class Cif<T extends C0184> extends MediaController.Callback {

        /* renamed from: ɩ  reason: contains not printable characters */
        protected final T f2311;

        public Cif(T t) {
            this.f2311 = t;
        }

        public void onSessionDestroyed() {
            this.f2311.m2572();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m73(bundle);
            this.f2311.m2578(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f2311.m2577((Object) playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f2311.m2575((Object) mediaMetadata);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f2311.m2579(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f2311.m2574(charSequence);
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m73(bundle);
            this.f2311.m2576(bundle);
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f2311.m2573(playbackInfo.getPlaybackType(), If.m2571(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }
}
