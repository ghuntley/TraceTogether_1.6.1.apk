package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Method;

/* renamed from: o.Ѕ  reason: contains not printable characters */
public final class C2209 implements C0539 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Method f10464 = m11636();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Method f10465 = m11643();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Method f10466 = m11641();

    /* renamed from: ι  reason: contains not printable characters */
    private static final Method f10467 = m11639();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static WorkSource m11637(int i, String str) {
        WorkSource workSource = new WorkSource();
        if (f10466 != null) {
            if (str == null) {
                str = "";
            }
            try {
                f10466.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method = f10464;
            if (method != null) {
                try {
                    method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
        return workSource;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static WorkSource m11640(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo applicationInfo = C2059.f10120.m10963(context).f10837.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    return null;
                }
                return m11637(applicationInfo.uid, str);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m11642(WorkSource workSource) {
        Method method = f10467;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m11638(WorkSource workSource, int i) {
        Method method = f10465;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m11645(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        C2341 r1 = C2059.f10120.m10963(context);
        if (r1.f10837.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Method m11636() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Method m11639() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Method m11644() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        Process.myUid();
        m11644();
        m11646();
        m11647();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Method m11641() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Method m11643() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: І  reason: contains not printable characters */
    private static final Method m11646() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: і  reason: contains not printable characters */
    private static final Method m11647() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Exception m11648(Status status) {
        if (status.f536 == 8) {
            return new C1590(status.m750());
        }
        return new C3034(status.m750());
    }
}
