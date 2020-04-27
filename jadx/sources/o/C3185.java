package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: o.ւ  reason: contains not printable characters */
public class C3185 {

    /* renamed from: o.ւ$if  reason: invalid class name */
    public static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        ArrayList<C3186> f14453;

        /* renamed from: ŀ  reason: contains not printable characters */
        CharSequence f14454;

        /* renamed from: ł  reason: contains not printable characters */
        int f14455;

        /* renamed from: ſ  reason: contains not printable characters */
        boolean f14456;

        /* renamed from: Ɩ  reason: contains not printable characters */
        Bitmap f14457;

        /* renamed from: Ɨ  reason: contains not printable characters */
        String f14458;

        /* renamed from: ƚ  reason: contains not printable characters */
        String f14459;

        /* renamed from: ǀ  reason: contains not printable characters */
        String f14460;

        /* renamed from: ǃ  reason: contains not printable characters */
        CharSequence f14461;

        /* renamed from: ȷ  reason: contains not printable characters */
        boolean f14462;

        /* renamed from: ɍ  reason: contains not printable characters */
        boolean f14463;

        /* renamed from: ɔ  reason: contains not printable characters */
        Bundle f14464;

        /* renamed from: ɟ  reason: contains not printable characters */
        int f14465;

        /* renamed from: ɨ  reason: contains not printable characters */
        boolean f14466;

        /* renamed from: ɩ  reason: contains not printable characters */
        public ArrayList<C3186> f14467;

        /* renamed from: ɪ  reason: contains not printable characters */
        If f14468;

        /* renamed from: ɭ  reason: contains not printable characters */
        long f14469;

        /* renamed from: ɹ  reason: contains not printable characters */
        PendingIntent f14470;

        /* renamed from: ɺ  reason: contains not printable characters */
        int f14471;

        /* renamed from: ɼ  reason: contains not printable characters */
        boolean f14472;

        /* renamed from: ɾ  reason: contains not printable characters */
        int f14473;

        /* renamed from: ɿ  reason: contains not printable characters */
        CharSequence[] f14474;

        /* renamed from: ʅ  reason: contains not printable characters */
        boolean f14475;
        @Deprecated

        /* renamed from: ʏ  reason: contains not printable characters */
        public ArrayList<String> f14476;

        /* renamed from: ʟ  reason: contains not printable characters */
        int f14477;

        /* renamed from: ͻ  reason: contains not printable characters */
        RemoteViews f14478;

        /* renamed from: Ι  reason: contains not printable characters */
        CharSequence f14479;

        /* renamed from: ι  reason: contains not printable characters */
        public Context f14480;

        /* renamed from: ϲ  reason: contains not printable characters */
        RemoteViews f14481;

        /* renamed from: ϳ  reason: contains not printable characters */
        Notification f14482;

        /* renamed from: І  reason: contains not printable characters */
        PendingIntent f14483;

        /* renamed from: Ј  reason: contains not printable characters */
        String f14484;

        /* renamed from: г  reason: contains not printable characters */
        boolean f14485;

        /* renamed from: с  reason: contains not printable characters */
        RemoteViews f14486;

        /* renamed from: т  reason: contains not printable characters */
        int f14487;

        /* renamed from: х  reason: contains not printable characters */
        int f14488;

        /* renamed from: і  reason: contains not printable characters */
        CharSequence f14489;

        /* renamed from: ј  reason: contains not printable characters */
        String f14490;

        /* renamed from: ґ  reason: contains not printable characters */
        Notification f14491;

        /* renamed from: Ӏ  reason: contains not printable characters */
        RemoteViews f14492;

        /* renamed from: ӏ  reason: contains not printable characters */
        int f14493;

        public Cif(Context context, String str) {
            this.f14467 = new ArrayList<>();
            this.f14453 = new ArrayList<>();
            this.f14462 = true;
            this.f14456 = false;
            this.f14471 = 0;
            this.f14465 = 0;
            this.f14487 = 0;
            this.f14488 = 0;
            this.f14491 = new Notification();
            this.f14480 = context;
            this.f14484 = str;
            this.f14491.when = System.currentTimeMillis();
            this.f14491.audioStreamType = -1;
            this.f14473 = 0;
            this.f14476 = new ArrayList<>();
        }

        @Deprecated
        public Cif(Context context) {
            this(context, (String) null);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Cif m16078(long j) {
            this.f14491.when = j;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public Cif m16093(boolean z) {
            this.f14462 = z;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public Cif m16088(int i) {
            this.f14491.icon = i;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Cif m16079(CharSequence charSequence) {
            this.f14461 = m16068(charSequence);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public Cif m16086(CharSequence charSequence) {
            this.f14479 = m16068(charSequence);
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public Cif m16070(int i) {
            this.f14493 = i;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public Cif m16092(PendingIntent pendingIntent) {
            this.f14470 = pendingIntent;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public Cif m16072(PendingIntent pendingIntent) {
            this.f14491.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public Cif m16073(CharSequence charSequence) {
            this.f14491.tickerText = m16068(charSequence);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public Cif m16084(Bitmap bitmap) {
            this.f14457 = m16069(bitmap);
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        private Bitmap m16069(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f14480.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f157962131165279);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f157952131165278);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public Cif m16085(Uri uri) {
            Notification notification = this.f14491;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f14491.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public Cif m16090(long[] jArr) {
            this.f14491.vibrate = jArr;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public Cif m16071(int i, int i2, int i3) {
            Notification notification = this.f14491;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (notification.ledOnMS == 0 || this.f14491.ledOffMS == 0) ? 0 : 1;
            Notification notification2 = this.f14491;
            notification2.flags = i4 | (notification2.flags & -2);
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Cif m16081(boolean z) {
            m16067(2, z);
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public Cif m16074(boolean z) {
            m16067(16, z);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public Cif m16087(boolean z) {
            this.f14456 = z;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public Cif m16091(int i) {
            Notification notification = this.f14491;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m16067(int i, boolean z) {
            if (z) {
                Notification notification = this.f14491;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f14491;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Cif m16076(int i) {
            this.f14473 = i;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public Bundle m16082() {
            if (this.f14464 == null) {
                this.f14464 = new Bundle();
            }
            return this.f14464;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Cif m16077(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f14467.add(new C3186(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Cif m16080(If ifR) {
            if (this.f14468 != ifR) {
                this.f14468 = ifR;
                If ifR2 = this.f14468;
                if (ifR2 != null) {
                    ifR2.m16062(this);
                }
            }
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public Cif m16083(int i) {
            this.f14471 = i;
            return this;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public Cif m16094(int i) {
            this.f14465 = i;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public Cif m16089(String str) {
            this.f14484 = str;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Notification m16075() {
            return new C0352(this).m4507();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        protected static CharSequence m16068(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }
    }

    /* renamed from: o.ւ$If */
    public static abstract class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        CharSequence f14449;

        /* renamed from: ɩ  reason: contains not printable characters */
        protected Cif f14450;

        /* renamed from: Ι  reason: contains not printable characters */
        boolean f14451 = false;

        /* renamed from: ι  reason: contains not printable characters */
        CharSequence f14452;

        /* renamed from: ı  reason: contains not printable characters */
        public RemoteViews m16061(C2974 r1) {
            return null;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m16063(C2974 r1) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public RemoteViews m16064(C2974 r1) {
            return null;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m16065(Bundle bundle) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public RemoteViews m16066(C2974 r1) {
            return null;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m16062(Cif ifVar) {
            if (this.f14450 != ifVar) {
                this.f14450 = ifVar;
                Cif ifVar2 = this.f14450;
                if (ifVar2 != null) {
                    ifVar2.m16080(this);
                }
            }
        }
    }

    /* renamed from: o.ւ$ɩ  reason: contains not printable characters */
    public static class C3188 extends If {

        /* renamed from: ı  reason: contains not printable characters */
        private Bitmap f14504;

        /* renamed from: ɹ  reason: contains not printable characters */
        private Bitmap f14505;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private boolean f14506;

        /* renamed from: ι  reason: contains not printable characters */
        public C3188 m16108(Bitmap bitmap) {
            this.f14504 = bitmap;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public C3188 m16106(Bitmap bitmap) {
            this.f14505 = bitmap;
            this.f14506 = true;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m16107(C2974 r3) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(r3.m15262()).setBigContentTitle(this.f14449).bigPicture(this.f14504);
                if (this.f14506) {
                    bigPicture.bigLargeIcon(this.f14505);
                }
                if (this.f14451) {
                    bigPicture.setSummaryText(this.f14452);
                }
            }
        }
    }

    /* renamed from: o.ւ$ǃ  reason: contains not printable characters */
    public static class C3187 extends If {

        /* renamed from: ı  reason: contains not printable characters */
        private CharSequence f14503;

        /* renamed from: ι  reason: contains not printable characters */
        public C3187 m16105(CharSequence charSequence) {
            this.f14503 = Cif.m16068(charSequence);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m16104(C2974 r3) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(r3.m15262()).setBigContentTitle(this.f14449).bigText(this.f14503);
                if (this.f14451) {
                    bigText.setSummaryText(this.f14452);
                }
            }
        }
    }

    /* renamed from: o.ւ$ı  reason: contains not printable characters */
    public static class C3186 {

        /* renamed from: ı  reason: contains not printable characters */
        public CharSequence f14494;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final C0370[] f14495;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f14496;

        /* renamed from: ɩ  reason: contains not printable characters */
        public PendingIntent f14497;

        /* renamed from: Ι  reason: contains not printable characters */
        final Bundle f14498;

        /* renamed from: ι  reason: contains not printable characters */
        public int f14499;

        /* renamed from: І  reason: contains not printable characters */
        private final int f14500;

        /* renamed from: і  reason: contains not printable characters */
        private final C0370[] f14501;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private boolean f14502;

        public C3186(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), (C0370[]) null, (C0370[]) null, true, 0, true);
        }

        C3186(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0370[] r6, C0370[] r7, boolean z, int i2, boolean z2) {
            this.f14496 = true;
            this.f14499 = i;
            this.f14494 = Cif.m16068(charSequence);
            this.f14497 = pendingIntent;
            this.f14498 = bundle == null ? new Bundle() : bundle;
            this.f14501 = r6;
            this.f14495 = r7;
            this.f14502 = z;
            this.f14500 = i2;
            this.f14496 = z2;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public int m16098() {
            return this.f14499;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public CharSequence m16100() {
            return this.f14494;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public PendingIntent m16095() {
            return this.f14497;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public Bundle m16097() {
            return this.f14498;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public boolean m16101() {
            return this.f14502;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public C0370[] m16103() {
            return this.f14501;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public int m16099() {
            return this.f14500;
        }

        /* renamed from: І  reason: contains not printable characters */
        public C0370[] m16102() {
            return this.f14495;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public boolean m16096() {
            return this.f14496;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Bundle m16060(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return C0338.m4457(notification);
        }
        return null;
    }
}
