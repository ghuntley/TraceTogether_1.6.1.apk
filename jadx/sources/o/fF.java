package o;

import java.io.Serializable;

public abstract class fF implements C3442gq, Serializable {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Object f2155 = C0173.f2158;

    /* renamed from: ı  reason: contains not printable characters */
    protected final Object f2156;

    /* renamed from: Ι  reason: contains not printable characters */
    private transient C3442gq f2157;

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract C3442gq m2239();

    /* renamed from: o.fF$ǃ  reason: contains not printable characters */
    static class C0173 implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: ι  reason: contains not printable characters */
        public static final C0173 f2158 = new C0173();

        private C0173() {
        }

        private Object readResolve() {
            return f2158;
        }
    }

    public fF() {
        this(f2155);
    }

    protected fF(Object obj) {
        this.f2156 = obj;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Object m2243() {
        return this.f2156;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public C3442gq m2238() {
        C3442gq gqVar = this.f2157;
        if (gqVar != null) {
            return gqVar;
        }
        C3442gq r0 = m2239();
        this.f2157 = r0;
        return r0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C3442gq m2240() {
        C3442gq r0 = m2238();
        if (r0 != this) {
            return r0;
        }
        throw new C3405fg();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C3440go m2242() {
        throw new AbstractMethodError();
    }

    /* renamed from: і  reason: contains not printable characters */
    public String m2244() {
        throw new AbstractMethodError();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public String m2245() {
        throw new AbstractMethodError();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Object m2241(Object... objArr) {
        return m2240().m2413(objArr);
    }
}
