package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.List;

/* renamed from: o.ı  reason: contains not printable characters */
public interface C0282 extends IInterface {
    /* renamed from: ı  reason: contains not printable characters */
    void m4109();

    /* renamed from: ı  reason: contains not printable characters */
    void m4110(Bundle bundle);

    /* renamed from: ı  reason: contains not printable characters */
    void m4111(PlaybackStateCompat playbackStateCompat);

    /* renamed from: ı  reason: contains not printable characters */
    void m4112(boolean z);

    /* renamed from: ǃ  reason: contains not printable characters */
    void m4113();

    /* renamed from: ǃ  reason: contains not printable characters */
    void m4114(int i);

    /* renamed from: ǃ  reason: contains not printable characters */
    void m4115(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: ɩ  reason: contains not printable characters */
    void m4116(String str, Bundle bundle);

    /* renamed from: ι  reason: contains not printable characters */
    void m4117(int i);

    /* renamed from: ι  reason: contains not printable characters */
    void m4118(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: ι  reason: contains not printable characters */
    void m4119(CharSequence charSequence);

    /* renamed from: ι  reason: contains not printable characters */
    void m4120(List<MediaSessionCompat.QueueItem> list);

    /* renamed from: ι  reason: contains not printable characters */
    void m4121(boolean z);

    /* renamed from: o.ı$if  reason: invalid class name */
    public static abstract class Cif extends Binder implements C0282 {
        public IBinder asBinder() {
            return this;
        }

        public Cif() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public static C0282 m4122(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0282)) {
                return new C0283(iBinder);
            }
            return (C0282) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: type inference failed for: r3v22 */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                r2 = 1
                if (r5 == r0) goto L_0x00e7
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00cd;
                    case 2: goto L_0x00c6;
                    case 3: goto L_0x00b0;
                    case 4: goto L_0x009a;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0077;
                    case 7: goto L_0x0061;
                    case 8: goto L_0x004b;
                    case 9: goto L_0x0040;
                    case 10: goto L_0x0032;
                    case 11: goto L_0x0024;
                    case 12: goto L_0x0019;
                    case 13: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r1)
                r4.m4109()
                return r2
            L_0x0019:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.m4117((int) r5)
                return r2
            L_0x0024:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002e
                r0 = 1
            L_0x002e:
                r4.m4121((boolean) r0)
                return r2
            L_0x0032:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.m4112((boolean) r0)
                return r2
            L_0x0040:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.m4114((int) r5)
                return r2
            L_0x004b:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x005d
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.v4.media.session.ParcelableVolumeInfo) r3
            L_0x005d:
                r4.m4115((android.support.v4.media.session.ParcelableVolumeInfo) r3)
                return r2
            L_0x0061:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0073
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0073:
                r4.m4110((android.os.Bundle) r3)
                return r2
            L_0x0077:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0089
                android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L_0x0089:
                r4.m4119((java.lang.CharSequence) r3)
                return r2
            L_0x008d:
                r6.enforceInterface(r1)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r5 = r6.createTypedArrayList(r5)
                r4.m4120((java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem>) r5)
                return r2
            L_0x009a:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.v4.media.MediaMetadataCompat) r3
            L_0x00ac:
                r4.m4118((android.support.v4.media.MediaMetadataCompat) r3)
                return r2
            L_0x00b0:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00c2
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.v4.media.session.PlaybackStateCompat) r3
            L_0x00c2:
                r4.m4111((android.support.v4.media.session.PlaybackStateCompat) r3)
                return r2
            L_0x00c6:
                r6.enforceInterface(r1)
                r4.m4113()
                return r2
            L_0x00cd:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x00e3
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00e3:
                r4.m4116(r5, r3)
                return r2
            L_0x00e7:
                r7.writeString(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0282.Cif.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        /* renamed from: o.ı$if$ɩ  reason: contains not printable characters */
        static class C0283 implements C0282 {

            /* renamed from: ɩ  reason: contains not printable characters */
            private IBinder f3525;

            C0283(IBinder iBinder) {
                this.f3525 = iBinder;
            }

            public final IBinder asBinder() {
                return this.f3525;
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m4130(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3525.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m4127() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f3525.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m4125(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3525.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m4132(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3525.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m4134(List<MediaSessionCompat.QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.f3525.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m4133(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3525.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m4124(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3525.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m4129(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3525.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m4128(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f3525.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m4126(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f3525.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m4135(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z ? 1 : 0);
                    this.f3525.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m4131(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f3525.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m4123() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f3525.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
