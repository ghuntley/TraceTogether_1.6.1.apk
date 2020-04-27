package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import o.C0282;
import o.C0314;
import o.C1947;
import o.C3479iF;

public final class MediaControllerCompat {

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$ǃ  reason: contains not printable characters */
    public static abstract class C0005 implements IBinder.DeathRecipient {

        /* renamed from: ɩ  reason: contains not printable characters */
        C0282 f43;

        /* renamed from: Ι  reason: contains not printable characters */
        Cif f44;

        /* renamed from: ι  reason: contains not printable characters */
        final Object f45;

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m40(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m41(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m42(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m43() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m44(Bundle bundle) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m45() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m46(int i) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m47(CharSequence charSequence) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m48(int i) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m49(C0008 r1) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m50(String str, Bundle bundle) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m51(boolean z) {
        }

        public C0005() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f45 = C3479iF.m2568(new C0006(this));
                return;
            }
            C0007 r0 = new C0007(this);
            this.f43 = r0;
            this.f45 = r0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public void m39(int i, Object obj, Bundle bundle) {
            Cif ifVar = this.f44;
            if (ifVar != null) {
                Message obtainMessage = ifVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$ǃ$ı  reason: contains not printable characters */
        static class C0006 implements C3479iF.C0184 {

            /* renamed from: ι  reason: contains not printable characters */
            private final WeakReference<C0005> f48;

            C0006(C0005 r2) {
                this.f48 = new WeakReference<>(r2);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public void m52() {
                C0005 r0 = this.f48.get();
                if (r0 != null) {
                    r0.m45();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public void m58(String str, Bundle bundle) {
                C0005 r0 = this.f48.get();
                if (r0 == null) {
                    return;
                }
                if (r0.f43 == null || Build.VERSION.SDK_INT >= 23) {
                    r0.m50(str, bundle);
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public void m57(Object obj) {
                C0005 r0 = this.f48.get();
                if (r0 != null && r0.f43 == null) {
                    r0.m41(PlaybackStateCompat.m85(obj));
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m55(Object obj) {
                C0005 r0 = this.f48.get();
                if (r0 != null) {
                    r0.m40(MediaMetadataCompat.m27(obj));
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m59(List<?> list) {
                C0005 r0 = this.f48.get();
                if (r0 != null) {
                    r0.m42(MediaSessionCompat.QueueItem.m74(list));
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m54(CharSequence charSequence) {
                C0005 r0 = this.f48.get();
                if (r0 != null) {
                    r0.m47(charSequence);
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public void m56(Bundle bundle) {
                C0005 r0 = this.f48.get();
                if (r0 != null) {
                    r0.m44(bundle);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m53(int i, int i2, int i3, int i4, int i5) {
                C0005 r0 = this.f48.get();
                if (r0 != null) {
                    r0.m49(new C0008(i, i2, i3, i4, i5));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$ǃ$ɩ  reason: contains not printable characters */
        static class C0007 extends C0282.Cif {

            /* renamed from: ι  reason: contains not printable characters */
            private final WeakReference<C0005> f49;

            /* renamed from: ı  reason: contains not printable characters */
            public void m63(boolean z) {
            }

            C0007(C0005 r2) {
                this.f49 = new WeakReference<>(r2);
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public void m67(String str, Bundle bundle) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(1, str, bundle);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m64() {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public void m62(PlaybackStateCompat playbackStateCompat) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m69(MediaMetadataCompat mediaMetadataCompat) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m71(List<MediaSessionCompat.QueueItem> list) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(5, list, (Bundle) null);
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m70(CharSequence charSequence) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m72(boolean z) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m65(int i) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m68(int i) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public void m61(Bundle bundle) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m66(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(4, parcelableVolumeInfo != null ? new C0008(parcelableVolumeInfo.f65, parcelableVolumeInfo.f66, parcelableVolumeInfo.f64, parcelableVolumeInfo.f62, parcelableVolumeInfo.f63) : null, (Bundle) null);
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public void m60() {
                C0005 r0 = this.f49.get();
                if (r0 != null) {
                    r0.m39(13, (Object) null, (Bundle) null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$ǃ$if  reason: invalid class name */
        class Cif extends Handler {

            /* renamed from: ǃ  reason: contains not printable characters */
            final /* synthetic */ C0005 f46;

            /* renamed from: ι  reason: contains not printable characters */
            boolean f47;

            public void handleMessage(Message message) {
                if (this.f47) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m73(data);
                            this.f46.m50((String) message.obj, data);
                            return;
                        case 2:
                            this.f46.m41((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.f46.m40((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.f46.m49((C0008) message.obj);
                            return;
                        case 5:
                            this.f46.m42((List<MediaSessionCompat.QueueItem>) (List) message.obj);
                            return;
                        case 6:
                            this.f46.m47((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m73(bundle);
                            this.f46.m44(bundle);
                            return;
                        case 8:
                            this.f46.m45();
                            return;
                        case 9:
                            this.f46.m48(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            this.f46.m51(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            this.f46.m46(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            this.f46.m43();
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$ɩ  reason: contains not printable characters */
    public static final class C0008 {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f50;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f51;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final int f52;

        /* renamed from: Ι  reason: contains not printable characters */
        private final int f53;

        /* renamed from: ι  reason: contains not printable characters */
        private final int f54;

        C0008(int i, int i2, int i3, int i4, int i5) {
            this.f54 = i;
            this.f50 = i2;
            this.f53 = i3;
            this.f52 = i4;
            this.f51 = i5;
        }
    }

    static class MediaControllerImplApi21 {

        /* renamed from: ı  reason: contains not printable characters */
        final Object f38;

        /* renamed from: ǃ  reason: contains not printable characters */
        private HashMap<C0005, C0004> f39;

        /* renamed from: Ι  reason: contains not printable characters */
        private final List<C0005> f40;

        /* renamed from: ι  reason: contains not printable characters */
        final MediaSessionCompat.Token f41;

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public void m32() {
            if (this.f41.m80() != null) {
                for (C0005 next : this.f40) {
                    C0004 r2 = new C0004(next);
                    this.f39.put(next, r2);
                    next.f43 = r2;
                    try {
                        this.f41.m80().m10598((C0282) r2);
                        next.m39(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                }
                this.f40.clear();
            }
        }

        static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: ǃ  reason: contains not printable characters */
            private WeakReference<MediaControllerImplApi21> f42;

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f42.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f38) {
                        mediaControllerImplApi21.f41.m81(C1947.C1948.m10624(C0314.m4383(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f41.m82(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.m32();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ı  reason: contains not printable characters */
        static class C0004 extends C0005.C0007 {
            C0004(C0005 r1) {
                super(r1);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m34() {
                throw new AssertionError();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m36(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m38(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            /* renamed from: ι  reason: contains not printable characters */
            public void m37(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: ı  reason: contains not printable characters */
            public void m33(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public void m35(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }
    }
}
