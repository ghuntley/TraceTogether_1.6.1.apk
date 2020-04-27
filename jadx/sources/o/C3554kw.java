package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import o.C3553kv;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: o.kw  reason: case insensitive filesystem */
class C3554kw {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C3554kw f2672 = m3321();

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public Executor m3323() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m3326(Method method) {
        return false;
    }

    C3554kw() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C3554kw m3322() {
        return f2672;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C3554kw m3321() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C0204();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C0205();
        } catch (ClassNotFoundException unused2) {
            return new C3554kw();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C3553kv.C0203 m3325(Executor executor) {
        if (executor != null) {
            return new C3555kx(executor);
        }
        return C3549kr.f2670;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Object m3324(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    /* renamed from: o.kw$ɩ  reason: contains not printable characters */
    static class C0205 extends C3554kw {
        C0205() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m3330(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final Object m3329(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    /* renamed from: o.kw$ı  reason: contains not printable characters */
    static class C0204 extends C3554kw {
        C0204() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Executor m3327() {
            return new Cif();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3553kv.C0203 m3328(Executor executor) {
            if (executor != null) {
                return new C3555kx(executor);
            }
            throw new AssertionError();
        }

        /* renamed from: o.kw$ı$if  reason: invalid class name */
        static class Cif implements Executor {

            /* renamed from: ǃ  reason: contains not printable characters */
            private final Handler f2673 = new Handler(Looper.getMainLooper());

            Cif() {
            }

            public final void execute(Runnable runnable) {
                this.f2673.post(runnable);
            }
        }
    }
}
