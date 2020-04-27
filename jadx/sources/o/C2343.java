package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C3356di
/* renamed from: o.А  reason: contains not printable characters */
final class C2343 implements C2336 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1356 f10838;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, C2362> f10839;

    /* renamed from: Ι  reason: contains not printable characters */
    private final If f10840;

    @C3350db
    C2343(Context context, C1356 r3) {
        this(new If(context), r3);
    }

    private C2343(If ifR, C1356 r3) {
        this.f10839 = new HashMap();
        this.f10840 = ifR;
        this.f10838 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized C2362 m12226(String str) {
        if (this.f10839.containsKey(str)) {
            return this.f10839.get(str);
        }
        C2340 r0 = this.f10840.m12228(str);
        if (r0 == null) {
            return null;
        }
        C1356 r1 = this.f10838;
        C2362 create = r0.create(new C2312(r1.f7519, r1.f7517, r1.f7518, str));
        this.f10839.put(str, create);
        return create;
    }

    /* renamed from: o.А$If */
    static class If {

        /* renamed from: ı  reason: contains not printable characters */
        private Map<String, String> f10841 = null;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Context f10842;

        If(Context context) {
            this.f10842 = context;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private static Bundle m12227(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final C2340 m12228(String str) {
            Map<String, String> map;
            if (this.f10841 == null) {
                Bundle r0 = m12227(this.f10842);
                if (r0 == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : r0.keySet()) {
                        Object obj = r0.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String trim : ((String) obj).split(",", -1)) {
                                String trim2 = trim.trim();
                                if (!trim2.isEmpty()) {
                                    hashMap.put(trim2, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.f10841 = map;
            }
            String str3 = this.f10841.get(str);
            if (str3 == null) {
                return null;
            }
            try {
                return (C2340) Class.forName(str3).asSubclass(C2340.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                new Object[1][0] = str3;
                return null;
            } catch (IllegalAccessException unused2) {
                new Object[1][0] = str3;
                return null;
            } catch (InstantiationException unused3) {
                new Object[1][0] = str3;
                return null;
            } catch (NoSuchMethodException unused4) {
                new Object[1][0] = str3;
                return null;
            } catch (InvocationTargetException unused5) {
                new Object[1][0] = str3;
                return null;
            }
        }
    }
}
