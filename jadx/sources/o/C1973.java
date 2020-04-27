package o;

import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import o.mG;

/* renamed from: o.ιɂ  reason: contains not printable characters */
public final class C1973 implements C3278ar {

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f9882;

    public C1973() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m10710(PowerManager.WakeLock wakeLock) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        String str = null;
        if (TextUtils.isEmpty((CharSequence) null)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public C1973(Context context) {
        this.f9882 = context.getApplicationContext();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m10708(Context context) {
        try {
            return ((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke((Object) null, new Object[]{context})).intValue() == 0;
        } catch (Exception unused) {
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final mG.C0235 m10711() {
        if (m10708(this.f9882)) {
            return new mG.C0235(m10706(), m10707());
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private String m10706() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(m10709(), new Object[0]);
        } catch (Exception unused) {
            C3263ac.m1563();
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m10707() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m10709(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            C3263ac.m1563();
            return false;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Object m10709() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.f9882});
        } catch (Exception unused) {
            C3263ac.m1563();
            return null;
        }
    }
}
