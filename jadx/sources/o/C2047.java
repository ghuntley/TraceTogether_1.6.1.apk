package o;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
/* renamed from: o.ιг  reason: contains not printable characters */
public abstract class C2047 extends BroadcastReceiver {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final SparseArray<PowerManager.WakeLock> f10102 = new SparseArray<>();

    /* renamed from: ι  reason: contains not printable characters */
    private static int f10103 = 1;

    /* renamed from: Ι  reason: contains not printable characters */
    public static ComponentName m10940(Context context, Intent intent) {
        synchronized (f10102) {
            int i = f10103;
            int i2 = f10103 + 1;
            f10103 = i2;
            if (i2 <= 0) {
                f10103 = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f10102.put(i, newWakeLock);
            return startService;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m10939(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f10102) {
            PowerManager.WakeLock wakeLock = f10102.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            wakeLock.release();
            f10102.remove(intExtra);
            return true;
        }
    }
}
