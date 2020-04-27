package o;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import o.C3185;

/* renamed from: o.ʁɪ  reason: contains not printable characters */
public final class C1597 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final AtomicInteger f8474 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: ı  reason: contains not printable characters */
    static C1094 m9307(Context context, C3575lq lqVar) {
        Uri uri;
        Intent intent;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        Bundle r0 = m9311(context.getPackageManager(), context.getPackageName());
        String packageName = context.getPackageName();
        String r2 = m9309(context, lqVar.m3649("gcm.n.android_channel_id"), r0);
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        C3185.Cif ifVar = new C3185.Cif(context, r2);
        String r6 = lqVar.m3649("gcm.n.title");
        if (TextUtils.isEmpty(r6)) {
            r6 = lqVar.m3656(resources, packageName, "gcm.n.title");
        }
        if (!TextUtils.isEmpty(r6)) {
            ifVar.m16079((CharSequence) r6);
        }
        String r62 = lqVar.m3649("gcm.n.body");
        if (TextUtils.isEmpty(r62)) {
            r62 = lqVar.m3656(resources, packageName, "gcm.n.body");
        }
        if (!TextUtils.isEmpty(r62)) {
            ifVar.m16086((CharSequence) r62);
            ifVar.m16080((C3185.If) new C3185.C3187().m16105(r62));
        }
        ifVar.m16088(m9306(packageManager, resources, packageName, lqVar.m3649("gcm.n.icon"), r0));
        String r22 = lqVar.m3649("gcm.n.sound2");
        if (TextUtils.isEmpty(r22)) {
            r22 = lqVar.m3649("gcm.n.sound");
        }
        Integer num = null;
        if (TextUtils.isEmpty(r22)) {
            uri = null;
        } else if ("default".equals(r22) || resources.getIdentifier(r22, "raw", packageName) == 0) {
            uri = RingtoneManager.getDefaultUri(2);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 24 + String.valueOf(r22).length());
            sb.append("android.resource://");
            sb.append(packageName);
            sb.append("/raw/");
            sb.append(r22);
            uri = Uri.parse(sb.toString());
        }
        if (uri != null) {
            ifVar.m16085(uri);
        }
        String r23 = lqVar.m3649("gcm.n.click_action");
        if (!TextUtils.isEmpty(r23)) {
            intent = new Intent(r23);
            intent.setPackage(packageName);
            intent.setFlags(268435456);
        } else {
            Uri r24 = lqVar.m3652();
            if (r24 != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                intent.setData(r24);
            } else {
                intent = packageManager.getLaunchIntentForPackage(packageName);
            }
        }
        boolean z = false;
        if (intent == null) {
            pendingIntent = null;
        } else {
            intent.addFlags(67108864);
            intent.putExtras(lqVar.m3648());
            pendingIntent = PendingIntent.getActivity(context, f8474.incrementAndGet(), intent, 1073741824);
            String r9 = lqVar.m3649("google.c.a.e");
            if ("1".equals(r9) || Boolean.parseBoolean(r9)) {
                pendingIntent = m9308(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(lqVar.m3654()).putExtra("pending_intent", pendingIntent));
            }
        }
        ifVar.m16092(pendingIntent);
        String r1 = lqVar.m3649("google.c.a.e");
        if (!("1".equals(r1) || Boolean.parseBoolean(r1))) {
            pendingIntent2 = null;
        } else {
            pendingIntent2 = m9308(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(lqVar.m3654()));
        }
        if (pendingIntent2 != null) {
            ifVar.m16072(pendingIntent2);
        }
        Integer r11 = m9310(context, lqVar.m3649("gcm.n.color"), r0);
        if (r11 != null) {
            ifVar.m16083(r11.intValue());
        }
        String r112 = lqVar.m3649("gcm.n.sticky");
        ifVar.m16074(!("1".equals(r112) || Boolean.parseBoolean(r112)));
        String r113 = lqVar.m3649("gcm.n.local_only");
        ifVar.m16087("1".equals(r113) || Boolean.parseBoolean(r113));
        String r114 = lqVar.m3649("gcm.n.ticker");
        if (r114 != null) {
            ifVar.m16073((CharSequence) r114);
        }
        Integer r115 = lqVar.m3655("gcm.n.notification_priority");
        if (r115 == null || r115.intValue() < -2 || r115.intValue() > 2) {
            r115 = null;
        }
        if (r115 != null) {
            ifVar.m16076(r115.intValue());
        }
        Integer r116 = lqVar.m3655("gcm.n.visibility");
        if (r116 == null || r116.intValue() < -1 || r116.intValue() > 1) {
            r116 = null;
        }
        if (r116 != null) {
            ifVar.m16094(r116.intValue());
        }
        Integer r117 = lqVar.m3655("gcm.n.notification_count");
        if (r117 != null && r117.intValue() >= 0) {
            num = r117;
        }
        if (num != null) {
            ifVar.m16070(num.intValue());
        }
        Long r118 = lqVar.m3650("gcm.n.event_time");
        if (r118 != null) {
            ifVar.m16093(true);
            ifVar.m16078(r118.longValue());
        }
        long[] r119 = lqVar.m3651();
        if (r119 != null) {
            ifVar.m16090(r119);
        }
        int[] r1110 = lqVar.m3647();
        if (r1110 != null) {
            ifVar.m16071(r1110[0], r1110[1], r1110[2]);
        }
        String r1111 = lqVar.m3649("gcm.n.default_sound");
        int i = ("1".equals(r1111) || Boolean.parseBoolean(r1111)) ? 1 : 0;
        String r02 = lqVar.m3649("gcm.n.default_vibrate_timings");
        if ("1".equals(r02) || Boolean.parseBoolean(r02)) {
            i |= 2;
        }
        String r03 = lqVar.m3649("gcm.n.default_light_settings");
        if ("1".equals(r03) || Boolean.parseBoolean(r03)) {
            z = true;
        }
        if (z) {
            i |= 4;
        }
        ifVar.m16091(i);
        String r12 = lqVar.m3649("gcm.n.tag");
        if (TextUtils.isEmpty(r12)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            r12 = sb2.toString();
        }
        return new C1094(ifVar, r12);
    }

    @TargetApi(26)
    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m9312(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m9306(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m9312(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m9312(resources, identifier2)) {
                return identifier2;
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m9312(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (i == 0 || !m9312(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Integer m9310(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0651.m5450(context, i));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Bundle m9311(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m9309(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static PendingIntent m9308(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, f8474.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }
}
