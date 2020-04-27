package o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import java.util.Map;
import kotlin.Metadata;
import o.C1170;
import o.C3185;
import o.lA;
import sg.gov.tech.bluetrace.BuildConfig;
import sg.gov.tech.bluetrace.SplashActivity;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\u0018\u00002\u00020\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\tJ5\u0010\u0004\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\u0004\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lS;", "", "ǃ", "Ljava/lang/String;", "Ι", "Lo/ɟյ;", "p0", "", "(Lo/ɟյ;)V", "(Ljava/lang/String;)V", "p1", "", "p2", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "<init>", "()V", "Lo/ɪɐ;"}, k = 1, mv = {1, 1, 16})
public final class lS extends C1347 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f2858 = "FCMService";

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3523(C1170 r11) {
        fM.m2254(r11, "");
        lA.C0215 r1 = lA.f2728;
        String str = this.f2858;
        r1.m3368(str, "From: " + r11.m7669());
        Map<String, String> r12 = r11.m7668();
        fM.m2252((Object) r12, "");
        if (!r12.isEmpty()) {
            lA.C0215 r13 = lA.f2728;
            String str2 = this.f2858;
            r13.m3368(str2, "Message data payload: " + r11.m7668());
            String str3 = r11.m7668().get("body");
            if (str3 == null) {
                str3 = "";
            }
            Object obj = ((Class) C3166.m16013(4, 8, 0)).getField("ǃ").get((Object) null);
            Context baseContext = getBaseContext();
            fM.m2252((Object) baseContext, "");
            try {
                Object[] objArr = new Object[2];
                objArr[1] = str3;
                objArr[0] = baseContext;
                ((Class) C3166.m16013(4, 8, 0)).getMethod("ɩ", new Class[]{Context.class, String.class}).invoke(obj, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        C1170.Cif r14 = r11.m7667();
        if (r14 != null) {
            lA.C0215 r2 = lA.f2728;
            String str4 = this.f2858;
            StringBuilder sb = new StringBuilder();
            sb.append("Message Notification Body: ");
            fM.m2252((Object) r14, "");
            sb.append(r14.m7672());
            r2.m3368(str4, sb.toString());
            String r22 = r14.m7672();
            if (r22 != null) {
                String r15 = r14.m7671();
                fM.m2252((Object) r22, "");
                Map<String, String> r112 = r11.m7668();
                fM.m2252((Object) r112, "");
                m3521(r15, r22, r112);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3522(String str) {
        fM.m2254(str, "");
        lA.C0215 r0 = lA.f2728;
        String str2 = this.f2858;
        r0.m3368(str2, "Refreshed token: " + str);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m3521(String str, String str2, Map<String, String> map) {
        Context context = this;
        Intent intent = new Intent(context, SplashActivity.class);
        intent.addFlags(67108864);
        for (String str3 : map.keySet()) {
            intent.putExtra(str3, map.get(str3));
        }
        CharSequence charSequence = str2;
        C3185.Cif r6 = new C3185.Cif(context, BuildConfig.PUSH_NOTIFICATION_CHANNEL_NAME).m16088(2131231157).m16079((CharSequence) str).m16086(charSequence).m16080((C3185.If) new C3185.C3187().m16105(charSequence)).m16074(true).m16085(RingtoneManager.getDefaultUri(2)).m16092(PendingIntent.getActivity(context, 0, intent, 1073741824)).m16083(C0651.m5450(context, R.color.f156802131099862));
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel(BuildConfig.PUSH_NOTIFICATION_CHANNEL_NAME, BuildConfig.PUSH_NOTIFICATION_CHANNEL_NAME, 3));
            }
            notificationManager.notify(lR.f2769.m3515(), r6.m16075());
            return;
        }
        throw new dA("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
