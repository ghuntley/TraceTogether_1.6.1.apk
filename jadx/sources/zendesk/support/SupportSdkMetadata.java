package zendesk.support;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.F;
import o.P;

class SupportSdkMetadata {
    private final ActivityManager activityManager;
    private final Context context;

    SupportSdkMetadata(Context context2) {
        this.context = context2;
        this.activityManager = (ActivityManager) context2.getSystemService("activity");
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> getDeviceInfoAsMapForMetaData() {
        HashMap hashMap = new HashMap();
        hashMap.put("device_os", getVersionName());
        hashMap.put("device_api", String.valueOf(getVersionCode()));
        hashMap.put("device_model", getModel());
        hashMap.put("device_name", getModelDeviceName());
        hashMap.put("device_manufacturer", getManufacturer());
        hashMap.put("device_total_memory", getBytesInMb(getTotalMemory()));
        hashMap.put("device_used_memory", getBytesInMb(getUsedMemory()));
        hashMap.put("device_low_memory", String.valueOf(isLowMemory()));
        hashMap.put("device_battery", String.valueOf(getBatteryLevel()));
        return hashMap;
    }

    private String getBytesInMb(long j) {
        return String.valueOf(j / 1048576);
    }

    private String getVersionName() {
        return Build.VERSION.RELEASE;
    }

    private int getVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    private String getModel() {
        boolean z = "unknown".equals(Build.MODEL) || P.m1409(Build.MODEL);
        boolean z2 = "unknown".equals(Build.DEVICE) || P.m1409(Build.DEVICE);
        if (z && z2) {
            return "";
        }
        if (Build.MODEL.equals(Build.DEVICE)) {
            return Build.MODEL;
        }
        return String.format(Locale.US, "%s/%s", new Object[]{Build.MODEL, Build.DEVICE});
    }

    private String getManufacturer() {
        if ("unknown".equals(Build.MANUFACTURER) || P.m1409(Build.MANUFACTURER)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    private String getModelDeviceName() {
        return Build.DEVICE;
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    @TargetApi(16)
    private long getTotalMemory() {
        if (Build.VERSION.SDK_INT >= 16) {
            F.m1359();
            return getTotalMemoryApi();
        }
        F.m1359();
        return getTotalMemoryCompat();
    }

    private boolean isLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[SYNTHETIC, Splitter:B:18:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[Catch:{ NoSuchElementException -> 0x0065, NumberFormatException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b A[SYNTHETIC, Splitter:B:34:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long getTotalMemoryCompat() {
        /*
            r6 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0029 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x0029 }
            java.lang.String r3 = "/proc/meminfo"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0029 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0029 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0022, all -> 0x001d }
            r1.close()     // Catch:{ IOException -> 0x0015 }
            goto L_0x003f
        L_0x0015:
            r1 = move-exception
            r1.getMessage()
            o.F.m1356()
            goto L_0x003f
        L_0x001d:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0069
        L_0x0022:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x002a
        L_0x0027:
            r1 = move-exception
            goto L_0x0069
        L_0x0029:
            r1 = move-exception
        L_0x002a:
            r1.getMessage()     // Catch:{ all -> 0x0027 }
            o.F.m1355()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003d
        L_0x0036:
            r0 = move-exception
            r0.getMessage()
            o.F.m1356()
        L_0x003d:
            java.lang.String r0 = ""
        L_0x003f:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            r1.<init>(r0)
            r2 = -1
            int r0 = r1.countTokens()     // Catch:{ NoSuchElementException -> 0x0065, NumberFormatException -> 0x0061 }
            r4 = 3
            if (r0 != r4) goto L_0x0068
            r1.nextToken()     // Catch:{ NoSuchElementException -> 0x0065, NumberFormatException -> 0x0061 }
            java.lang.String r0 = r1.nextToken()     // Catch:{ NoSuchElementException -> 0x0065, NumberFormatException -> 0x0061 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NoSuchElementException -> 0x0065, NumberFormatException -> 0x0061 }
            long r0 = r0.longValue()     // Catch:{ NoSuchElementException -> 0x0065, NumberFormatException -> 0x0061 }
            r2 = 10
            long r0 = r0 << r2
            r2 = r0
            goto L_0x0068
        L_0x0061:
            o.F.m1355()
            goto L_0x0068
        L_0x0065:
            o.F.m1355()
        L_0x0068:
            return r2
        L_0x0069:
            if (r0 == 0) goto L_0x0076
            r0.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0076
        L_0x006f:
            r0 = move-exception
            r0.getMessage()
            o.F.m1356()
        L_0x0076:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.support.SupportSdkMetadata.getTotalMemoryCompat():long");
    }

    @TargetApi(16)
    private long getTotalMemoryApi() {
        if (Build.VERSION.SDK_INT < 16) {
            F.m1361();
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
