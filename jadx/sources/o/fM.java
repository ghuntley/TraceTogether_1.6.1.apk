package o;

import java.util.Arrays;

public class fM {
    private fM() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m2256() {
        throw ((C3359dl) m2255(new C3359dl()));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m2253(String str) {
        StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        throw ((dC) m2255(new dC(sb.toString())));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m2252(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((IllegalStateException) m2255(new IllegalStateException(sb.toString())));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m2257(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static <T extends Throwable> T m2255(T t) {
        return m2251(t, fM.class.getName());
    }

    /* renamed from: ı  reason: contains not printable characters */
    static <T extends Throwable> T m2251(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m2254(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            StringBuilder sb = new StringBuilder("Parameter specified as non-null is null: method ");
            sb.append(className);
            sb.append(".");
            sb.append(methodName);
            sb.append(", parameter ");
            sb.append(str);
            throw ((IllegalArgumentException) m2255(new IllegalArgumentException(sb.toString())));
        }
    }
}
