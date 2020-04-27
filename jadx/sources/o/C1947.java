package o;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: o.ι  reason: contains not printable characters */
public interface C1947 extends IInterface {
    /* renamed from: ı  reason: contains not printable characters */
    String m10575();

    /* renamed from: ı  reason: contains not printable characters */
    void m10576(int i, int i2, String str);

    /* renamed from: ı  reason: contains not printable characters */
    void m10577(String str, Bundle bundle);

    /* renamed from: ı  reason: contains not printable characters */
    void m10578(boolean z);

    /* renamed from: ı  reason: contains not printable characters */
    boolean m10579(KeyEvent keyEvent);

    /* renamed from: ŀ  reason: contains not printable characters */
    void m10580();

    /* renamed from: ł  reason: contains not printable characters */
    void m10581();

    /* renamed from: ſ  reason: contains not printable characters */
    void m10582();

    /* renamed from: Ɩ  reason: contains not printable characters */
    CharSequence m10583();

    /* renamed from: Ɨ  reason: contains not printable characters */
    void m10584();

    /* renamed from: ƚ  reason: contains not printable characters */
    void m10585();

    /* renamed from: ǃ  reason: contains not printable characters */
    String m10586();

    /* renamed from: ǃ  reason: contains not printable characters */
    void m10587(int i, int i2, String str);

    /* renamed from: ǃ  reason: contains not printable characters */
    void m10588(long j);

    /* renamed from: ǃ  reason: contains not printable characters */
    void m10589(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: ǃ  reason: contains not printable characters */
    void m10590(RatingCompat ratingCompat, Bundle bundle);

    /* renamed from: ǃ  reason: contains not printable characters */
    void m10591(String str, Bundle bundle);

    /* renamed from: ǃ  reason: contains not printable characters */
    void m10592(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean m10593();

    /* renamed from: ɨ  reason: contains not printable characters */
    int m10594();

    /* renamed from: ɩ  reason: contains not printable characters */
    void m10595(int i);

    /* renamed from: ɩ  reason: contains not printable characters */
    void m10596(Uri uri, Bundle bundle);

    /* renamed from: ɩ  reason: contains not printable characters */
    void m10597(String str, Bundle bundle);

    /* renamed from: ɩ  reason: contains not printable characters */
    void m10598(C0282 r1);

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean m10599();

    /* renamed from: ɪ  reason: contains not printable characters */
    boolean m10600();

    /* renamed from: ɹ  reason: contains not printable characters */
    PlaybackStateCompat m10601();

    /* renamed from: ɾ  reason: contains not printable characters */
    int m10602();

    /* renamed from: ɿ  reason: contains not printable characters */
    void m10603();

    /* renamed from: ʅ  reason: contains not printable characters */
    void m10604();

    /* renamed from: ʟ  reason: contains not printable characters */
    int m10605();

    /* renamed from: Ι  reason: contains not printable characters */
    PendingIntent m10606();

    /* renamed from: Ι  reason: contains not printable characters */
    void m10607(int i);

    /* renamed from: Ι  reason: contains not printable characters */
    void m10608(Uri uri, Bundle bundle);

    /* renamed from: Ι  reason: contains not printable characters */
    void m10609(MediaDescriptionCompat mediaDescriptionCompat);

    /* renamed from: Ι  reason: contains not printable characters */
    void m10610(MediaDescriptionCompat mediaDescriptionCompat, int i);

    /* renamed from: Ι  reason: contains not printable characters */
    void m10611(String str, Bundle bundle);

    /* renamed from: Ι  reason: contains not printable characters */
    void m10612(C0282 r1);

    /* renamed from: ι  reason: contains not printable characters */
    long m10613();

    /* renamed from: ι  reason: contains not printable characters */
    void m10614(int i);

    /* renamed from: ι  reason: contains not printable characters */
    void m10615(long j);

    /* renamed from: ι  reason: contains not printable characters */
    void m10616(RatingCompat ratingCompat);

    /* renamed from: ι  reason: contains not printable characters */
    void m10617(String str, Bundle bundle);

    /* renamed from: ι  reason: contains not printable characters */
    void m10618(boolean z);

    /* renamed from: І  reason: contains not printable characters */
    MediaMetadataCompat m10619();

    /* renamed from: г  reason: contains not printable characters */
    void m10620();

    /* renamed from: і  reason: contains not printable characters */
    ParcelableVolumeInfo m10621();

    /* renamed from: Ӏ  reason: contains not printable characters */
    List<MediaSessionCompat.QueueItem> m10622();

    /* renamed from: ӏ  reason: contains not printable characters */
    Bundle m10623();

    /* renamed from: o.ι$ɩ  reason: contains not printable characters */
    public static abstract class C1948 extends Binder implements C1947 {
        public C1948() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public static C1947 m10624(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1947)) {
                return new If(iBinder);
            }
            return (C1947) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.support.v4.media.RatingCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v43 */
        /* JADX WARNING: type inference failed for: r1v44 */
        /* JADX WARNING: type inference failed for: r1v45 */
        /* JADX WARNING: type inference failed for: r1v46 */
        /* JADX WARNING: type inference failed for: r1v47 */
        /* JADX WARNING: type inference failed for: r1v48 */
        /* JADX WARNING: type inference failed for: r1v49 */
        /* JADX WARNING: type inference failed for: r1v50 */
        /* JADX WARNING: type inference failed for: r1v51 */
        /* JADX WARNING: type inference failed for: r1v52 */
        /* JADX WARNING: type inference failed for: r1v53 */
        /* JADX WARNING: type inference failed for: r1v54 */
        /* JADX WARNING: type inference failed for: r1v55 */
        /* JADX WARNING: type inference failed for: r1v56 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 51
                r1 = 0
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                r3 = 1
                if (r5 == r0) goto L_0x03cd
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x03c9
                r0 = 0
                switch(r5) {
                    case 1: goto L_0x039c;
                    case 2: goto L_0x037f;
                    case 3: goto L_0x036d;
                    case 4: goto L_0x035b;
                    case 5: goto L_0x034d;
                    case 6: goto L_0x033f;
                    case 7: goto L_0x0331;
                    case 8: goto L_0x031a;
                    case 9: goto L_0x030c;
                    case 10: goto L_0x02f5;
                    case 11: goto L_0x02df;
                    case 12: goto L_0x02c9;
                    case 13: goto L_0x02bf;
                    case 14: goto L_0x02a2;
                    case 15: goto L_0x0285;
                    case 16: goto L_0x025c;
                    case 17: goto L_0x024e;
                    case 18: goto L_0x0244;
                    case 19: goto L_0x023a;
                    case 20: goto L_0x0230;
                    case 21: goto L_0x0226;
                    case 22: goto L_0x021c;
                    case 23: goto L_0x0212;
                    case 24: goto L_0x0204;
                    case 25: goto L_0x01eb;
                    case 26: goto L_0x01ce;
                    case 27: goto L_0x01b7;
                    case 28: goto L_0x01a0;
                    case 29: goto L_0x0192;
                    case 30: goto L_0x017b;
                    case 31: goto L_0x0164;
                    case 32: goto L_0x0156;
                    case 33: goto L_0x014c;
                    case 34: goto L_0x012f;
                    case 35: goto L_0x0112;
                    case 36: goto L_0x00e9;
                    case 37: goto L_0x00db;
                    case 38: goto L_0x00cd;
                    case 39: goto L_0x00bf;
                    case 40: goto L_0x00ae;
                    case 41: goto L_0x0095;
                    case 42: goto L_0x0078;
                    case 43: goto L_0x005f;
                    case 44: goto L_0x0051;
                    case 45: goto L_0x0043;
                    case 46: goto L_0x0032;
                    case 47: goto L_0x0024;
                    case 48: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0016:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.m10607((int) r5)
                r7.writeNoException()
                return r3
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r4.m10605()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.m10578((boolean) r0)
                r7.writeNoException()
                return r3
            L_0x0043:
                r6.enforceInterface(r2)
                boolean r5 = r4.m10593()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0051:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.m10614((int) r5)
                r7.writeNoException()
                return r3
            L_0x005f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0071
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1
            L_0x0071:
                r4.m10609((android.support.v4.media.MediaDescriptionCompat) r1)
                r7.writeNoException()
                return r3
            L_0x0078:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x008a
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1
            L_0x008a:
                int r5 = r6.readInt()
                r4.m10610((android.support.v4.media.MediaDescriptionCompat) r1, (int) r5)
                r7.writeNoException()
                return r3
            L_0x0095:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00a7
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1
            L_0x00a7:
                r4.m10589((android.support.v4.media.MediaDescriptionCompat) r1)
                r7.writeNoException()
                return r3
            L_0x00ae:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00b8
                r0 = 1
            L_0x00b8:
                r4.m10618((boolean) r0)
                r7.writeNoException()
                return r3
            L_0x00bf:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.m10595((int) r5)
                r7.writeNoException()
                return r3
            L_0x00cd:
                r6.enforceInterface(r2)
                boolean r5 = r4.m10600()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x00db:
                r6.enforceInterface(r2)
                int r5 = r4.m10594()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x00e9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x00fc
            L_0x00fb:
                r5 = r1
            L_0x00fc:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x010b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x010b:
                r4.m10608((android.net.Uri) r5, (android.os.Bundle) r1)
                r7.writeNoException()
                return r3
            L_0x0112:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0128
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0128:
                r4.m10611((java.lang.String) r5, (android.os.Bundle) r1)
                r7.writeNoException()
                return r3
            L_0x012f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0145:
                r4.m10617(r5, r1)
                r7.writeNoException()
                return r3
            L_0x014c:
                r6.enforceInterface(r2)
                r4.m10581()
                r7.writeNoException()
                return r3
            L_0x0156:
                r6.enforceInterface(r2)
                int r5 = r4.m10602()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x0164:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.m10623()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0177
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x017a
            L_0x0177:
                r7.writeInt(r0)
            L_0x017a:
                return r3
            L_0x017b:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.m10583()
                r7.writeNoException()
                if (r5 == 0) goto L_0x018e
                r7.writeInt(r3)
                android.text.TextUtils.writeToParcel(r5, r7, r3)
                goto L_0x0191
            L_0x018e:
                r7.writeInt(r0)
            L_0x0191:
                return r3
            L_0x0192:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.m10622()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r3
            L_0x01a0:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.m10601()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01b3
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x01b6
            L_0x01b3:
                r7.writeInt(r0)
            L_0x01b6:
                return r3
            L_0x01b7:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.m10619()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01ca
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x01cd
            L_0x01ca:
                r7.writeInt(r0)
            L_0x01cd:
                return r3
            L_0x01ce:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01e4
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x01e4:
                r4.m10577(r5, r1)
                r7.writeNoException()
                return r3
            L_0x01eb:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01fd
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.RatingCompat r1 = (android.support.v4.media.RatingCompat) r1
            L_0x01fd:
                r4.m10616((android.support.v4.media.RatingCompat) r1)
                r7.writeNoException()
                return r3
            L_0x0204:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.m10588((long) r5)
                r7.writeNoException()
                return r3
            L_0x0212:
                r6.enforceInterface(r2)
                r4.m10582()
                r7.writeNoException()
                return r3
            L_0x021c:
                r6.enforceInterface(r2)
                r4.m10584()
                r7.writeNoException()
                return r3
            L_0x0226:
                r6.enforceInterface(r2)
                r4.m10585()
                r7.writeNoException()
                return r3
            L_0x0230:
                r6.enforceInterface(r2)
                r4.m10604()
                r7.writeNoException()
                return r3
            L_0x023a:
                r6.enforceInterface(r2)
                r4.m10603()
                r7.writeNoException()
                return r3
            L_0x0244:
                r6.enforceInterface(r2)
                r4.m10620()
                r7.writeNoException()
                return r3
            L_0x024e:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.m10615((long) r5)
                r7.writeNoException()
                return r3
            L_0x025c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x026e
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x026f
            L_0x026e:
                r5 = r1
            L_0x026f:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x027e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x027e:
                r4.m10596((android.net.Uri) r5, (android.os.Bundle) r1)
                r7.writeNoException()
                return r3
            L_0x0285:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x029b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x029b:
                r4.m10597((java.lang.String) r5, (android.os.Bundle) r1)
                r7.writeNoException()
                return r3
            L_0x02a2:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02b8:
                r4.m10591((java.lang.String) r5, (android.os.Bundle) r1)
                r7.writeNoException()
                return r3
            L_0x02bf:
                r6.enforceInterface(r2)
                r4.m10580()
                r7.writeNoException()
                return r3
            L_0x02c9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.m10576(r5, r8, r6)
                r7.writeNoException()
                return r3
            L_0x02df:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.m10587((int) r5, (int) r8, (java.lang.String) r6)
                r7.writeNoException()
                return r3
            L_0x02f5:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.m10621()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0308
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x030b
            L_0x0308:
                r7.writeInt(r0)
            L_0x030b:
                return r3
            L_0x030c:
                r6.enforceInterface(r2)
                long r5 = r4.m10613()
                r7.writeNoException()
                r7.writeLong(r5)
                return r3
            L_0x031a:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.m10606()
                r7.writeNoException()
                if (r5 == 0) goto L_0x032d
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L_0x0330
            L_0x032d:
                r7.writeInt(r0)
            L_0x0330:
                return r3
            L_0x0331:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.m10575()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L_0x033f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.m10586()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L_0x034d:
                r6.enforceInterface(r2)
                boolean r5 = r4.m10599()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x035b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.ı r5 = o.C0282.Cif.m4122(r5)
                r4.m10612((o.C0282) r5)
                r7.writeNoException()
                return r3
            L_0x036d:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.ı r5 = o.C0282.Cif.m4122(r5)
                r4.m10598((o.C0282) r5)
                r7.writeNoException()
                return r3
            L_0x037f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0391
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            L_0x0391:
                boolean r5 = r4.m10579((android.view.KeyEvent) r1)
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L_0x039c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L_0x03b3
            L_0x03b2:
                r8 = r1
            L_0x03b3:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x03c2
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = (android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1
            L_0x03c2:
                r4.m10592((java.lang.String) r5, (android.os.Bundle) r8, (android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1)
                r7.writeNoException()
                return r3
            L_0x03c9:
                r7.writeString(r2)
                return r3
            L_0x03cd:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03df
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.v4.media.RatingCompat) r5
                goto L_0x03e0
            L_0x03df:
                r5 = r1
            L_0x03e0:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03ef
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x03ef:
                r4.m10590((android.support.v4.media.RatingCompat) r5, (android.os.Bundle) r1)
                r7.writeNoException()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1947.C1948.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        /* renamed from: o.ι$ɩ$If */
        static class If implements C1947 {

            /* renamed from: Ι  reason: contains not printable characters */
            private IBinder f9828;

            If(IBinder iBinder) {
                this.f9828 = iBinder;
            }

            public final IBinder asBinder() {
                return this.f9828;
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10642(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final boolean m10629(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m10648(C0282 r5) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(r5 != null ? r5.asBinder() : null);
                    this.f9828.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10662(C0282 r5) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(r5 != null ? r5.asBinder() : null);
                    this.f9828.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final boolean m10649() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f9828.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final String m10636() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final String m10625() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final PendingIntent m10656() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final long m10663() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: і  reason: contains not printable characters */
            public final ParcelableVolumeInfo m10671() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10637(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f9828.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m10626(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f9828.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: І  reason: contains not printable characters */
            public final MediaMetadataCompat m10669() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɹ  reason: contains not printable characters */
            public final PlaybackStateCompat m10651() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ӏ  reason: contains not printable characters */
            public final List<MediaSessionCompat.QueueItem> m10672() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ɩ  reason: contains not printable characters */
            public final CharSequence m10633() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ӏ  reason: contains not printable characters */
            public final Bundle m10673() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɾ  reason: contains not printable characters */
            public final int m10652() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ȷ  reason: contains not printable characters */
            public final boolean m10643() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f9828.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɨ  reason: contains not printable characters */
            public final int m10644() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɪ  reason: contains not printable characters */
            public final boolean m10650() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f9828.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ʟ  reason: contains not printable characters */
            public final int m10655() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10639(MediaDescriptionCompat mediaDescriptionCompat) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10660(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f9828.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10659(MediaDescriptionCompat mediaDescriptionCompat) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m10664(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f9828.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ł  reason: contains not printable characters */
            public final void m10631() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m10667(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10661(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10658(Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ŀ  reason: contains not printable characters */
            public final void m10630() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10641(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m10647(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m10646(Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m10665(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    this.f9828.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: г  reason: contains not printable characters */
            public final void m10670() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɿ  reason: contains not printable characters */
            public final void m10653() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ʅ  reason: contains not printable characters */
            public final void m10654() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ƚ  reason: contains not printable characters */
            public final void m10635() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ɨ  reason: contains not printable characters */
            public final void m10634() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ſ  reason: contains not printable characters */
            public final void m10632() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f9828.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10638(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    this.f9828.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m10666(RatingCompat ratingCompat) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m10640(RatingCompat ratingCompat, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m10628(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(z ? 1 : 0);
                    this.f9828.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m10645(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f9828.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m10668(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(z ? 1 : 0);
                    this.f9828.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m10657(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f9828.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m10627(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9828.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
