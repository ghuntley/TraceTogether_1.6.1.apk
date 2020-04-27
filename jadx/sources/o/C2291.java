package o;

import android.util.Base64;
import o.C2174;

/* renamed from: o.Іϲ  reason: contains not printable characters */
public abstract class C2291 {

    /* renamed from: o.Іϲ$ǃ  reason: contains not printable characters */
    public static abstract class C2292 {
        /* renamed from: ı  reason: contains not printable characters */
        public abstract C2291 m11962();

        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract C2292 m11963(String str);

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract C2292 m11964(C1766 r1);

        /* renamed from: ι  reason: contains not printable characters */
        public abstract C2292 m11965(byte[] bArr);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract String m11959();

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract byte[] m11960();

    /* renamed from: ι  reason: contains not printable characters */
    public abstract C1766 m11961();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = m11959();
        objArr[1] = m11961();
        objArr[2] = m11960() == null ? "" : Base64.encodeToString(m11960(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C2292 m11958() {
        C2174.C2175 r0 = new C2174.C2175();
        C1766 r1 = C1766.DEFAULT;
        if (r1 != null) {
            r0.f10356 = r1;
            return r0;
        }
        throw new NullPointerException("Null priority");
    }
}
