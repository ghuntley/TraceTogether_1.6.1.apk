package o;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import o.C2695;

/* renamed from: o.ԟı  reason: contains not printable characters */
final class C2989<T> extends C3011<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Type f13774;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3011<T> f13775;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3122 f13776;

    C2989(C3122 r1, C3011<T> r2, Type type) {
        this.f13776 = r1;
        this.f13775 = r2;
        this.f13774 = type;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final T m15332(C0995 r2) {
        return this.f13775.m15434(r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15333(C0815 r4, T t) {
        C3011<T> r0 = this.f13775;
        Type type = this.f13774;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f13774) {
            r0 = this.f13776.m15830(C3101.get(type));
            if (r0 instanceof C2695.If) {
                C3011<T> r1 = this.f13775;
                if (!(r1 instanceof C2695.If)) {
                    r0 = r1;
                }
            }
        }
        r0.m15435(r4, t);
    }
}
