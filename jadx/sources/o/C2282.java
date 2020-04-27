package o;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: o.ІΓ  reason: contains not printable characters */
public final class C2282 {

    /* renamed from: ı  reason: contains not printable characters */
    private static float f10653 = Float.NaN;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final IntentFilter f10654 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: ι  reason: contains not printable characters */
    private static long f10655;

    @TargetApi(20)
    /* renamed from: ı  reason: contains not printable characters */
    public static int m11939(Context context) {
        int i;
        boolean z;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, f10654);
        int i2 = 0;
        if (registerReceiver == null) {
            i = 0;
        } else {
            i = registerReceiver.getIntExtra("plugged", 0);
        }
        int i3 = (i & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C2134.m11305()) {
            z = powerManager.isInteractive();
        } else {
            z = powerManager.isScreenOn();
        }
        if (z) {
            i2 = 2;
        }
        return i2 | i3;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static synchronized float m11940(Context context) {
        synchronized (C2282.class) {
            if (SystemClock.elapsedRealtime() - f10655 >= 60000 || Float.isNaN(f10653)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, f10654);
                if (registerReceiver != null) {
                    f10653 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f10655 = SystemClock.elapsedRealtime();
                float f = f10653;
                return f;
            }
            float f2 = f10653;
            return f2;
        }
    }
}
