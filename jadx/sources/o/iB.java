package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\b\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/iD;", "ı", "Lo/iD;", "ɩ", "", "p0", "Landroid/os/Handler;", "Landroid/os/Looper;", "Ι", "(Landroid/os/Looper;Z)Landroid/os/Handler;"}, k = 2, mv = {1, 1, 15})
public final class iB {

    /* renamed from: ı  reason: contains not printable characters */
    public static final iD f2310;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Handler m2566(Looper looper, boolean z) {
        fM.m2254(looper, "");
        if (!z || Build.VERSION.SDK_INT < 16) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new dA("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            Constructor<Handler> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
            fM.m2252((Object) declaredConstructor, "");
            Handler newInstance = declaredConstructor.newInstance(new Object[]{looper, null, true});
            fM.m2252((Object) newInstance, "");
            return newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    static {
        Object obj;
        try {
            C3369dx.C0158 r0 = C3369dx.f2060;
            Looper mainLooper = Looper.getMainLooper();
            fM.m2252((Object) mainLooper, "");
            obj = C3369dx.m2118(new iA(m2566(mainLooper, true), "Main"));
        } catch (Throwable th) {
            C3369dx.C0158 r1 = C3369dx.f2060;
            obj = C3369dx.m2118(C3366du.m2110(th));
        }
        if (C3369dx.m2113(obj)) {
            obj = null;
        }
        f2310 = (iD) obj;
    }
}
