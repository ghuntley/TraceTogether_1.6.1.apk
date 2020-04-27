package o;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* renamed from: o.ӀƗ  reason: contains not printable characters */
public class C2763 implements C2903 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f13091 = "logEventInternal";

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f13092 = "com.google.android.gms.measurement.AppMeasurement";

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f13093 = "getInstance";

    /* renamed from: ı  reason: contains not printable characters */
    private final Object f13094;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Method f13095;

    /* renamed from: ι  reason: contains not printable characters */
    public static C2903 m14618(Context context) {
        Object r2;
        Method r3;
        Class r0 = m14615(context);
        if (r0 == null || (r2 = m14617(context, r0)) == null || (r3 = m14616(context, r0)) == null) {
            return null;
        }
        return new C2763(r2, r3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Class m14615(Context context) {
        try {
            return context.getClassLoader().loadClass(f13092);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Object m14617(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod(f13093, new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Method m14616(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod(f13091, new Class[]{String.class, String.class, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }

    public C2763(Object obj, Method method) {
        this.f13094 = obj;
        this.f13095 = method;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m14619(String str, Bundle bundle) {
        m14620("fab", str, bundle);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m14620(String str, String str2, Bundle bundle) {
        try {
            this.f13095.invoke(this.f13094, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }
}
