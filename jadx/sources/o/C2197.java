package o;

import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import com.google.firebase.FirebaseApp;
import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: o.ϳӏ  reason: contains not printable characters */
public class C2197 implements C2841 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int f10438;

    /* renamed from: Ι  reason: contains not printable characters */
    public static String f10439;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final FirebaseApp f10440;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f10441;

    /* renamed from: Ι  reason: contains not printable characters */
    public void m11597(C0723 r1, float f, float f2) {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m11594() {
        if (f10439 == null) {
            if (f10438 == 0) {
                f10438 = Process.myPid();
            }
            f10439 = m11595(f10438);
        }
        return f10439;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC, Splitter:B:15:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d A[SYNTHETIC, Splitter:B:22:0x003d] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11595(int r4) {
        /*
            r0 = 0
            if (r4 > 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003a, all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003a, all -> 0x0033 }
            java.lang.String r1 = "/proc/"
            r2.append(r1)     // Catch:{ IOException -> 0x003a, all -> 0x0033 }
            r2.append(r4)     // Catch:{ IOException -> 0x003a, all -> 0x0033 }
            java.lang.String r4 = "/cmdline"
            r2.append(r4)     // Catch:{ IOException -> 0x003a, all -> 0x0033 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003a, all -> 0x0033 }
            java.io.BufferedReader r4 = m11593(r4)     // Catch:{ IOException -> 0x003a, all -> 0x0033 }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            java.lang.String r0 = r1.trim()     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            r4.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0040
        L_0x002c:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0034
        L_0x0031:
            goto L_0x003b
        L_0x0033:
            r4 = move-exception
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            throw r4
        L_0x003a:
            r4 = r0
        L_0x003b:
            if (r4 == 0) goto L_0x0040
            r4.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2197.m11595(int):java.lang.String");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static BufferedReader m11593(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public C2197() {
    }

    public C2197(FirebaseApp firebaseApp, Context context) {
        this.f10440 = firebaseApp;
        this.f10441 = context;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m11596() {
        return FirebaseApp.m1064(this.f10440, this.f10441);
    }
}
