package o;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Іɐ  reason: contains not printable characters */
public final class C2241<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final If<T> f10528;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final T f10529;

    /* renamed from: o.Іɐ$If */
    public interface If<T> {
        /* renamed from: ɩ  reason: contains not printable characters */
        List<String> m11693(T t);
    }

    public C2241(T t, If<T> ifR) {
        this.f10529 = t;
        this.f10528 = ifR;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static List<ComponentRegistrar> m11692(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            try {
                Class<?> cls = Class.forName(next);
                if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                    Object[] objArr = {next, "com.google.firebase.components.ComponentRegistrar"};
                } else {
                    arrayList.add((ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                new Object[1][0] = next;
            } catch (IllegalAccessException unused2) {
                new Object[1][0] = next;
            } catch (InstantiationException unused3) {
                new Object[1][0] = next;
            } catch (NoSuchMethodException unused4) {
                new Object[1][0] = next;
            } catch (InvocationTargetException unused5) {
                new Object[1][0] = next;
            }
        }
        return arrayList;
    }

    /* renamed from: o.Іɐ$ı  reason: contains not printable characters */
    public static class C2242 implements If<Context> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Class<? extends Service> f10530;

        public /* synthetic */ C2242(Class cls, byte b) {
            this(cls);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ List m11695(Object obj) {
            Bundle r6 = m11694((Context) obj);
            if (r6 == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : r6.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(r6.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private C2242(Class<? extends Service> cls) {
            this.f10530 = cls;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private Bundle m11694(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f10530), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
