package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* renamed from: o.aw  reason: case insensitive filesystem */
public final class C3285aw {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Comparator<File> f1552 = new Comparator<File>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Boolean f1553;

    /* renamed from: Ι  reason: contains not printable characters */
    private static long f1554 = -1;

    /* renamed from: ι  reason: contains not printable characters */
    private static final char[] f1555 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m1682(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static SharedPreferences m1658(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r0 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        r4 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0050 A[SYNTHETIC, Splitter:B:30:0x0050] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m1687(java.io.File r4, java.lang.String r5) {
        /*
            boolean r0 = r4.exists()
            r1 = 0
            if (r0 == 0) goto L_0x0058
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003f, all -> 0x003c }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x003f, all -> 0x003c }
            r2.<init>(r4)     // Catch:{ Exception -> 0x003f, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r4)     // Catch:{ Exception -> 0x003f, all -> 0x003c }
        L_0x0013:
            java.lang.String r4 = r0.readLine()     // Catch:{ Exception -> 0x0040 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r2 = "\\s*:\\s*"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch:{ Exception -> 0x0040 }
            r3 = 2
            java.lang.String[] r4 = r2.split(r4, r3)     // Catch:{ Exception -> 0x0040 }
            int r2 = r4.length     // Catch:{ Exception -> 0x0040 }
            r3 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 0
            r2 = r4[r2]     // Catch:{ Exception -> 0x0040 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0040 }
            if (r2 == 0) goto L_0x0013
            r4 = r4[r3]     // Catch:{ Exception -> 0x0040 }
            r1 = r4
        L_0x0034:
            r0.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x0058
        L_0x0038:
            o.C3263ac.m1563()
            goto L_0x0058
        L_0x003c:
            r4 = move-exception
            r0 = r1
            goto L_0x004e
        L_0x003f:
            r0 = r1
        L_0x0040:
            o.C3263ac.m1563()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0058
        L_0x0049:
            o.C3263ac.m1563()
            goto L_0x0058
        L_0x004d:
            r4 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0057
            r0.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0057
        L_0x0054:
            o.C3263ac.m1563()
        L_0x0057:
            throw r4
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3285aw.m1687(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m1671() {
        return If.m1697().ordinal();
    }

    /* renamed from: o.aw$If */
    enum If {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: ȷ  reason: contains not printable characters */
        private static final Map<String, If> f1559 = null;

        static {
            HashMap hashMap = new HashMap(4);
            f1559 = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            f1559.put("armeabi", ARMV6);
            f1559.put("arm64-v8a", ARM64);
            f1559.put("x86", X86_32);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        static If m1697() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C3263ac.m1563();
                return UNKNOWN;
            }
            If ifR = f1559.get(str.toLowerCase(Locale.US));
            return ifR == null ? UNKNOWN : ifR;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0081 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized long m1664() {
        /*
            java.lang.Class<o.aw> r0 = o.C3285aw.class
            monitor-enter(r0)
            long r1 = f1554     // Catch:{ all -> 0x008a }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0086
            r1 = 0
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "/proc/meminfo"
            r3.<init>(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "MemTotal"
            java.lang.String r3 = m1687((java.io.File) r3, (java.lang.String) r4)     // Catch:{ all -> 0x008a }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x0084
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x008a }
            java.lang.String r3 = r3.toUpperCase(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "KB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0081 }
            r5 = 0
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = "KB"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ NumberFormatException -> 0x0081 }
            r3 = r3[r5]     // Catch:{ NumberFormatException -> 0x0081 }
            java.lang.String r3 = r3.trim()     // Catch:{ NumberFormatException -> 0x0081 }
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0081 }
            r3 = 10
            long r1 = r1 << r3
            goto L_0x0084
        L_0x0043:
            java.lang.String r4 = "MB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0081 }
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "MB"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ NumberFormatException -> 0x0081 }
            r3 = r3[r5]     // Catch:{ NumberFormatException -> 0x0081 }
            java.lang.String r3 = r3.trim()     // Catch:{ NumberFormatException -> 0x0081 }
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0081 }
            r3 = 1048576(0x100000, double:5.180654E-318)
        L_0x005e:
            long r1 = r1 * r3
            goto L_0x0084
        L_0x0061:
            java.lang.String r4 = "GB"
            boolean r4 = r3.endsWith(r4)     // Catch:{ NumberFormatException -> 0x0081 }
            if (r4 == 0) goto L_0x007d
            java.lang.String r4 = "GB"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ NumberFormatException -> 0x0081 }
            r3 = r3[r5]     // Catch:{ NumberFormatException -> 0x0081 }
            java.lang.String r3 = r3.trim()     // Catch:{ NumberFormatException -> 0x0081 }
            long r1 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0081 }
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x005e
        L_0x007d:
            o.C3263ac.m1563()     // Catch:{ NumberFormatException -> 0x0081 }
            goto L_0x0084
        L_0x0081:
            o.C3263ac.m1563()     // Catch:{ all -> 0x008a }
        L_0x0084:
            f1554 = r1     // Catch:{ all -> 0x008a }
        L_0x0086:
            long r1 = f1554     // Catch:{ all -> 0x008a }
            monitor-exit(r0)
            return r1
        L_0x008a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3285aw.m1664():long");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static ActivityManager.RunningAppProcessInfo m1657(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m1688(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m1661(InputStream inputStream) {
        return m1674(inputStream, "SHA-1");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String m1674(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m1666(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception unused) {
            C3263ac.m1563();
            return "";
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m1683(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m1666(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            C3263ac.m1563();
            return "";
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m1676(String... strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String obj = sb.toString();
        if (obj.length() > 0) {
            return m1683(obj.getBytes(), "SHA-1");
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static long m1665(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static long m1681(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Float m1673(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m1686(Context context) {
        if (!m1695(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m1692(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int identifier = context.getResources().getIdentifier(str, "bool", m1662(context));
            if (identifier > 0) {
                return resources.getBoolean(identifier);
            }
            int identifier2 = context.getResources().getIdentifier(str, "string", m1662(context));
            if (identifier2 > 0) {
                return Boolean.parseBoolean(context.getString(identifier2));
            }
        }
        return z;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m1672(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m1662(context));
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static boolean m1695(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static boolean m1693(Context context) {
        boolean r3 = m1695(context);
        String str = Build.TAGS;
        if ((!r3 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (r3 || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m1694(Context context) {
        boolean r0 = m1695(context);
        if (m1693(context)) {
            r0 |= true;
        }
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger() ? r0 | true ? 1 : 0 : r0 ? 1 : 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m1656(Context context, boolean z) {
        Float r4 = m1673(context);
        if (!z || r4 == null) {
            return 1;
        }
        if (((double) r4.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) r4.floatValue()) < 99.0d ? 2 : 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m1666(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i << 1;
            char[] cArr2 = f1555;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static boolean m1679(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m1667(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C3263ac.m1563();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m1677(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException unused) {
                C3263ac.m1563();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m1668(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m1659(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    private static String m1662(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                return context.getResources().getResourcePackageName(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m1685(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[SYNTHETIC, Splitter:B:26:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004f A[SYNTHETIC, Splitter:B:34:0x004f] */
    /* renamed from: ɾ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1680(android.content.Context r4) {
        /*
            r0 = 0
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            int r4 = r4.icon     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            java.io.InputStream r4 = r1.openRawResource(r4)     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            java.lang.String r1 = "SHA-1"
            java.lang.String r1 = m1674(r4, r1)     // Catch:{ Exception -> 0x0033 }
            if (r1 == 0) goto L_0x0024
            int r2 = r1.length()     // Catch:{ Exception -> 0x0033 }
            if (r2 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r2 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            if (r4 == 0) goto L_0x0032
            r4.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0032
        L_0x002f:
            o.C3263ac.m1563()
        L_0x0032:
            return r0
        L_0x0033:
            r1 = move-exception
            goto L_0x0039
        L_0x0035:
            r4 = move-exception
            goto L_0x004d
        L_0x0037:
            r1 = move-exception
            r4 = r0
        L_0x0039:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0049 }
            r1.getMessage()     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0048
            r4.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            o.C3263ac.m1563()
        L_0x0048:
            return r0
        L_0x0049:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
        L_0x004d:
            if (r0 == 0) goto L_0x0056
            r0.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0056
        L_0x0053:
            o.C3263ac.m1563()
        L_0x0056:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3285aw.m1680(android.content.Context):java.lang.String");
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public static int m1696(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m1684(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m1675(String str) {
        return m1683(str.getBytes(), "SHA-1");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m1689(String str) {
        return m1683(str.getBytes(), "SHA-256");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m1690(Context context) {
        if (f1553 == null) {
            f1553 = Boolean.valueOf(m1692(context, "com.crashlytics.Trace", false));
        }
        if (f1553.booleanValue()) {
            C3263ac.m1563();
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static void m1663(Context context) {
        if (f1553 == null) {
            f1553 = Boolean.valueOf(m1692(context, "com.crashlytics.Trace", false));
        }
        if (f1553.booleanValue()) {
            C3263ac.m1563();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m1691(Context context, String str) {
        if (f1553 == null) {
            f1553 = Boolean.valueOf(m1692(context, "com.crashlytics.Trace", false));
        }
        if (f1553.booleanValue()) {
            C3263ac.m1563().m1612(4, "Fabric", str);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m1660(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "string", m1662(context));
        return identifier > 0 ? context.getString(identifier) : "";
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public static String m1678(Context context) {
        int identifier = context.getResources().getIdentifier("io.fabric.android.build_id", "string", m1662(context));
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier("com.crashlytics.android.build_id", "string", m1662(context));
        }
        if (identifier == 0) {
            return null;
        }
        String string = context.getResources().getString(identifier);
        C3263ac.m1563();
        return string;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public static String m1670(Context context) {
        int identifier = context.getResources().getIdentifier("com.google.firebase.crashlytics.unity_version", "string", m1662(context));
        if (identifier == 0) {
            return null;
        }
        String string = context.getResources().getString(identifier);
        C3263ac.m1563();
        return string;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: ȷ  reason: contains not printable characters */
    public static boolean m1669(Context context) {
        if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
