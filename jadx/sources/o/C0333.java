package o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o.C3169;

/* renamed from: o.ıɟ  reason: contains not printable characters */
public final class C0333 extends C3169.If {

    /* renamed from: І  reason: contains not printable characters */
    private static final Class<?>[] f3689 = {C3180.class};

    /* renamed from: і  reason: contains not printable characters */
    private static final Class<?>[] f3690 = {Application.class, C3180.class};

    /* renamed from: ı  reason: contains not printable characters */
    private final Application f3691;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Bundle f3692;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3169.C3171 f3693;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1555 f3694;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2319 f3695;

    @SuppressLint({"LambdaLast"})
    public C0333(Application application, C1568 r3, Bundle bundle) {
        this.f3694 = r3.getSavedStateRegistry();
        this.f3695 = r3.getLifecycle();
        this.f3692 = bundle;
        this.f3691 = application;
        if (C3169.C3171.f14428 == null) {
            C3169.C3171.f14428 = new C3169.C3171(application);
        }
        this.f3693 = C3169.C3171.f14428;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T extends C0326> T m4428(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        boolean isAssignableFrom = C2222.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            constructor = m4425(cls, f3690);
        } else {
            constructor = m4425(cls, f3689);
        }
        if (constructor == null) {
            return this.f3693.m16022(cls);
        }
        SavedStateHandleController r6 = SavedStateHandleController.m209(this.f3694, this.f3695, str, this.f3692);
        if (isAssignableFrom) {
            try {
                t = (C0326) constructor.newInstance(new Object[]{this.f3691, r6.f254});
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access ".concat(String.valueOf(cls)), e);
            } catch (InstantiationException e2) {
                StringBuilder sb = new StringBuilder("A ");
                sb.append(cls);
                sb.append(" cannot be instantiated.");
                throw new RuntimeException(sb.toString(), e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of ".concat(String.valueOf(cls)), e3.getCause());
            }
        } else {
            t = (C0326) constructor.newInstance(new Object[]{r6.f254});
        }
        t.m4396("androidx.lifecycle.savedstate.vm.tag", r6);
        return t;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T extends C0326> T m4426(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m4428(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static <T> Constructor<T> m4425(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4427(C0326 r3) {
        SavedStateHandleController.m210(r3, this.f3694, this.f3695);
    }
}
