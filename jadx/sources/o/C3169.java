package o;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.ո  reason: contains not printable characters */
public final class C3169 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0307 f14425;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3172 f14426;

    /* renamed from: o.ո$ɩ  reason: contains not printable characters */
    public interface C3172 {
        /* renamed from: ı  reason: contains not printable characters */
        <T extends C0326> T m16025(Class<T> cls);
    }

    /* renamed from: o.ո$ı  reason: contains not printable characters */
    static class C3170 {
        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m16023(C0326 r1) {
        }

        C3170() {
        }
    }

    /* renamed from: o.ո$If */
    static abstract class If extends C3170 implements C3172 {
        /* renamed from: ι  reason: contains not printable characters */
        public abstract <T extends C0326> T m16020(String str, Class<T> cls);

        If() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public <T extends C0326> T m16019(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3169(o.C0350 r3) {
        /*
            r2 = this;
            o.ıǀ r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof o.C2416
            if (r1 == 0) goto L_0x000f
            o.гι r3 = (o.C2416) r3
            o.ո$ɩ r3 = r3.getDefaultViewModelProviderFactory()
            goto L_0x0013
        L_0x000f:
            o.ո$if r3 = o.C3169.Cif.m16021()
        L_0x0013:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3169.<init>(o.ıɼ):void");
    }

    public C3169(C0307 r1, C3172 r2) {
        this.f14426 = r2;
        this.f14425 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T extends C0326> T m16018(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m16017("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private <T extends C0326> T m16017(String str, Class<T> cls) {
        T t;
        T t2 = (C0326) this.f14425.f3602.get(str);
        if (cls.isInstance(t2)) {
            C3172 r3 = this.f14426;
            if (r3 instanceof C3170) {
                ((C3170) r3).m16023(t2);
            }
            return t2;
        }
        C3172 r0 = this.f14426;
        if (r0 instanceof If) {
            t = ((If) r0).m16020(str, cls);
        } else {
            t = r0.m16025(cls);
        }
        C0326 put = this.f14425.f3602.put(str, t);
        if (put != null) {
            put.m4397();
        }
        return t;
    }

    /* renamed from: o.ո$if  reason: invalid class name */
    public static class Cif implements C3172 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private static Cif f14427;

        /* renamed from: ı  reason: contains not printable characters */
        static Cif m16021() {
            if (f14427 == null) {
                f14427 = new Cif();
            }
            return f14427;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public <T extends C0326> T m16022(Class<T> cls) {
            try {
                return (C0326) cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            }
        }
    }

    /* renamed from: o.ո$ǃ  reason: contains not printable characters */
    public static class C3171 extends Cif {

        /* renamed from: ι  reason: contains not printable characters */
        static C3171 f14428;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Application f14429;

        public C3171(Application application) {
            this.f14429 = application;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final <T extends C0326> T m16024(Class<T> cls) {
            if (!C2222.class.isAssignableFrom(cls)) {
                return super.m16022(cls);
            }
            try {
                return (C0326) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f14429});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
            }
        }
    }
}
