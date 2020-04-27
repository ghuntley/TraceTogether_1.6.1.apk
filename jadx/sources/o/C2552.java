package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: o.ѕΙ  reason: contains not printable characters */
public final class C2552 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Object f11649 = new Object();
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C2837 f11650 = C2837.f13284;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Method f11651 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Map<String, Object> f11652;

    /* renamed from: ι  reason: contains not printable characters */
    public String f11653;

    /* renamed from: o.ѕΙ$ǃ  reason: contains not printable characters */
    public interface C2553 {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m13622(int i, Intent intent);

        /* renamed from: Ι  reason: contains not printable characters */
        void m13623();
    }

    public C2552() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Context m13618(Context context) {
        try {
            return DynamiteModule.m800(context, DynamiteModule.f582, "providerinstaller").f586;
        } catch (DynamiteModule.If e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Context m13620(Context context) {
        try {
            return C2877.getRemoteContext(context);
        } catch (Resources.NotFoundException e) {
            e.getMessage();
            C2154.m11412(context, e);
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m13621(Context context) {
        if (context != null) {
            C2877.ensurePlayServicesAvailable(context, 11925000);
            Context r0 = m13618(context);
            if (r0 == null) {
                r0 = m13620(context);
            }
            if (r0 != null) {
                synchronized (f11649) {
                    try {
                        if (f11651 == null) {
                            f11651 = r0.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                        }
                        f11651.invoke((Object) null, new Object[]{r0});
                    } catch (Exception e) {
                        e = e;
                        Throwable cause = e.getCause();
                        if (Log.isLoggable("ProviderInstaller", 6)) {
                            if (cause == null) {
                                e.getMessage();
                            } else {
                                cause.getMessage();
                            }
                        }
                        if (cause != null) {
                            e = cause;
                        }
                        C2154.m11412(context, e);
                        throw new C2845(8);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            throw new C2845(8);
        }
        throw new NullPointerException("Context must not be null");
    }

    public C2552(String str, Map<String, Object> map) {
        this.f11653 = str;
        this.f11652 = map;
    }
}
