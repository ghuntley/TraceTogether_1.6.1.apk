package o;

import android.os.Build;
import java.util.ArrayList;
import java.util.TimeZone;

public final class F {

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0094 f1257;

    /* renamed from: o.F$ı  reason: contains not printable characters */
    public interface C0094 {
    }

    /* renamed from: o.F$ɩ  reason: contains not printable characters */
    public enum C0096 {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m1360() {
        return false;
    }

    static {
        Cif ifVar;
        TimeZone.getTimeZone("UTC");
        new ArrayList();
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                f1257 = new C0095();
            }
            if (f1257 == null) {
                ifVar = new Cif();
                f1257 = ifVar;
            }
        } catch (ClassNotFoundException unused) {
            if (f1257 == null) {
                ifVar = new Cif();
            }
        } catch (Throwable th) {
            if (f1257 == null) {
                f1257 = new Cif();
            }
            throw th;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m1361() {
        C0096 r0 = C0096.WARN;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m1356() {
        C0096 r0 = C0096.WARN;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m1358() {
        C0096 r0 = C0096.ERROR;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m1355() {
        C0096 r0 = C0096.ERROR;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static void m1363() {
        C0096 r0 = C0096.INFO;
    }

    /* renamed from: І  reason: contains not printable characters */
    public static void m1362() {
        C0096 r0 = C0096.INFO;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static void m1359() {
        C0096 r0 = C0096.DEBUG;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m1357(C c) {
        StringBuilder sb = new StringBuilder();
        if (c != null) {
            sb.append("Network Error: ");
            sb.append(c.m1278());
            sb.append(", Status Code: ");
            sb.append(c.m1276());
            if (P.m1406(c.m1280())) {
                sb.append(", Reason: ");
                sb.append(c.m1280());
            }
        }
        String obj = sb.toString();
        C0096 r0 = C0096.ERROR;
        P.m1406(obj);
    }

    /* renamed from: o.F$if  reason: invalid class name */
    static class Cif implements C0094 {
        Cif() {
        }
    }

    /* renamed from: o.F$ǃ  reason: contains not printable characters */
    static class C0095 implements C0094 {
        C0095() {
        }
    }
}
