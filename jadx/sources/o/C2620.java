package o;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C0712;

/* renamed from: o.јǃ  reason: contains not printable characters */
public abstract class C2620 {

    /* renamed from: ı  reason: contains not printable characters */
    protected final C0299<String, Method> f11954;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected final C0299<String, Method> f11955;

    /* renamed from: Ι  reason: contains not printable characters */
    protected final C0299<String, Class> f11956;

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract C2620 m13899();

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m13900(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m13904();

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m13905(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m13910(int i);

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m13911(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract byte[] m13913();

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public abstract boolean m13914();

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract String m13916();

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m13919(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract boolean m13920(int i);

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract int m13922();

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m13923(int i);

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m13925(String str);

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public abstract CharSequence m13927();

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public abstract <T extends Parcelable> T m13929();

    public C2620(C0299<String, Method> r1, C0299<String, Method> r2, C0299<String, Class> r3) {
        this.f11955 = r1;
        this.f11954 = r2;
        this.f11956 = r3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13901(boolean z, int i) {
        m13910(i);
        m13900(z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13926(byte[] bArr) {
        m13910(2);
        m13919(bArr);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13917(CharSequence charSequence, int i) {
        m13910(i);
        m13911(charSequence);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13924(int i, int i2) {
        m13910(i2);
        m13923(i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13907(String str) {
        m13910(7);
        m13925(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13906(Parcelable parcelable, int i) {
        m13910(i);
        m13905(parcelable);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13921(boolean z, int i) {
        if (!m13920(i)) {
            return z;
        }
        return m13914();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m13915(int i, int i2) {
        if (!m13920(i2)) {
            return i;
        }
        return m13922();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m13909(String str) {
        if (!m13920(7)) {
            return str;
        }
        return m13916();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final byte[] m13902(byte[] bArr) {
        if (!m13920(2)) {
            return bArr;
        }
        return m13913();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final <T extends Parcelable> T m13908(T t, int i) {
        if (!m13920(i)) {
            return t;
        }
        return m13929();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final CharSequence m13903(CharSequence charSequence, int i) {
        if (!m13920(i)) {
            return charSequence;
        }
        return m13927();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13912(C0712.C0713 r2) {
        m13910(1);
        if (r2 == null) {
            m13925((String) null);
            return;
        }
        m13897(r2);
        C2620 r0 = m13899();
        m13894(r2, r0);
        r0.m13904();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13918(C0712.C0713 r2) {
        if (r2 == null) {
            m13925((String) null);
            return;
        }
        m13897(r2);
        C2620 r0 = m13899();
        m13894(r2, r0);
        r0.m13904();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m13897(C0712.C0713 r4) {
        try {
            m13925(m13896((Class<? extends C0712.C0713>) r4.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(r4.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T extends C0712.C0713> T m13898(T t) {
        if (!m13920(1)) {
            return t;
        }
        String r2 = m13916();
        if (r2 == null) {
            return null;
        }
        return m13893(r2, m13899());
    }

    /* renamed from: і  reason: contains not printable characters */
    public final <T extends C0712.C0713> T m13928() {
        String r0 = m13916();
        if (r0 == null) {
            return null;
        }
        return m13893(r0, m13899());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private <T extends C0712.C0713> void m13894(T t, C2620 r6) {
        try {
            m13895((Class) t.getClass()).invoke((Object) null, new Object[]{t, r6});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private Method m13895(Class cls) {
        Method method = this.f11954.get(cls.getName());
        if (method != null) {
            return method;
        }
        Method declaredMethod = m13896((Class<? extends C0712.C0713>) cls).getDeclaredMethod("write", new Class[]{cls, C2620.class});
        this.f11954.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private Class m13896(Class<? extends C0712.C0713> cls) {
        Class cls2 = this.f11956.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f11956.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private <T extends C0712.C0713> T m13893(String str, C2620 r8) {
        Class<C2620> cls = C2620.class;
        try {
            Method method = this.f11955.get(str);
            if (method == null) {
                method = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                this.f11955.put(str, method);
            }
            return (C0712.C0713) method.invoke((Object) null, new Object[]{r8});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }
}
