package o;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: o.гı  reason: contains not printable characters */
public class C2408 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m12453(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m12454(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
