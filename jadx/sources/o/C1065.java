package o;

import android.content.Context;
import android.os.Bundle;
import com.crashlytics.android.core.CrashlyticsCore;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ɍƖ  reason: contains not printable characters */
public class C1065 implements C0739 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f6396 = "registerOnMeasurementEventListener";

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final String f6397 = "name";

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String f6398 = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f6399 = "getInstance";

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final List<Class<?>> f6400 = Collections.unmodifiableList(Arrays.asList(new Class[]{String.class, String.class, Bundle.class, Long.class}));

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final String f6401 = "hashCode";

    /* renamed from: ɾ  reason: contains not printable characters */
    private static final String f6402 = "onEvent";

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f6403 = "crash";

    /* renamed from: ι  reason: contains not printable characters */
    private static final String f6404 = "com.google.android.gms.measurement.AppMeasurement";

    /* renamed from: І  reason: contains not printable characters */
    private static final String f6405 = "equals";

    /* renamed from: і  reason: contains not printable characters */
    private static final String f6406 = "parameters";

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final String f6407 = "toString";

    /* renamed from: ӏ  reason: contains not printable characters */
    private static final String f6408 = "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ";

    /* renamed from: ȷ  reason: contains not printable characters */
    private Object f6409;
    /* access modifiers changed from: private */

    /* renamed from: ɨ  reason: contains not printable characters */
    public final CrashlyticsCore f6410;

    public C1065(CrashlyticsCore crashlyticsCore) {
        this.f6410 = crashlyticsCore;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m7360() {
        Class<?> r0 = m7356(f6404);
        if (r0 == null) {
            C3263ac.m1563();
            return false;
        }
        Object r2 = m7357(r0);
        if (r2 == null) {
            C3263ac.m1563();
            return false;
        }
        Class<?> r3 = m7356(f6398);
        if (r3 == null) {
            C3263ac.m1563();
            return false;
        }
        try {
            r0.getDeclaredMethod(f6396, new Class[]{r3}).invoke(r2, new Object[]{m7359((Class) r3)});
        } catch (NoSuchMethodException unused) {
            C3263ac.m1563();
            return false;
        } catch (Exception e) {
            C3263ac.m1563();
            e.getMessage();
        }
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private Class<?> m7356(String str) {
        try {
            return this.f6410.m1589().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Object m7357(Class<?> cls) {
        try {
            return cls.getDeclaredMethod(f6399, new Class[]{Context.class}).invoke(cls, new Object[]{this.f6410.m1589()});
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public synchronized Object m7359(Class cls) {
        if (this.f6409 == null) {
            this.f6409 = Proxy.newProxyInstance(this.f6410.m1589().getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    if (objArr.length == 1 && name.equals(C1065.f6405)) {
                        return Boolean.valueOf(m7361(obj, objArr[0]));
                    }
                    if (objArr.length == 0 && name.equals(C1065.f6401)) {
                        return Integer.valueOf(super.hashCode());
                    }
                    if (objArr.length == 0 && name.equals(C1065.f6407)) {
                        return super.toString();
                    }
                    if (objArr.length == 4 && name.equals(C1065.f6402) && C1065.m7355(objArr)) {
                        String str = (String) objArr[0];
                        String str2 = (String) objArr[1];
                        Bundle bundle = (Bundle) objArr[2];
                        if (str != null && !str.equals(C1065.f6403)) {
                            C1065.m7353(C1065.this.f6410, str2, bundle);
                            return null;
                        }
                    }
                    C3263ac.m1563();
                    return null;
                }

                /* renamed from: Ι  reason: contains not printable characters */
                public boolean m7361(Object obj, Object obj2) {
                    if (obj == obj2) {
                        return true;
                    }
                    if (obj2 == null || !Proxy.isProxyClass(obj2.getClass()) || !super.equals(Proxy.getInvocationHandler(obj2))) {
                        return false;
                    }
                    return true;
                }
            });
        }
        return this.f6409;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m7355(Object[] objArr) {
        if (objArr.length != f6400.size()) {
            return false;
        }
        Iterator<Class<?>> it = f6400.iterator();
        for (Object obj : objArr) {
            if (!obj.getClass().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static void m7353(CrashlyticsCore crashlyticsCore, String str, Bundle bundle) {
        try {
            StringBuilder sb = new StringBuilder("$A$:");
            sb.append(m7354(str, bundle));
            crashlyticsCore.m688(sb.toString());
        } catch (JSONException unused) {
            C3263ac.m1563();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m7354(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(f6397, str);
        jSONObject.put(f6406, jSONObject2);
        return jSONObject.toString();
    }
}
