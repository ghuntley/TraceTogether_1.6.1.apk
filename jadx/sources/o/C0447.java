package o;

import java.io.Serializable;

/* renamed from: o.ıӌ  reason: contains not printable characters */
public final class C0447 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static <T> C0388<T> m4746(C0388<T> r1) {
        if ((r1 instanceof C0427) || (r1 instanceof C0331)) {
            return r1;
        }
        if (r1 instanceof Serializable) {
            return new C0331(r1);
        }
        return new C0427(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> C0388<T> m4745(T t) {
        return new C0390(t);
    }
}
