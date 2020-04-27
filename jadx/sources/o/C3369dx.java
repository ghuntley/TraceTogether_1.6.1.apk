package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b@\u0018\u0000 \u0001*\u0006\b\u0000\u0010\u0017 \u00012\u00060\u0015j\u0002`\u0016:\u0002\u0001\u0012B\u0016\b\u0000\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0007\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0007\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0003R\u0013\u0010\u0001\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/dx;", "ı", "", "(Ljava/lang/Object;)Z", "ǃ", "", "Ljava/lang/Object;", "ɩ", "p0", "equals", "", "Ι", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "hashCode", "()I", "", "(Ljava/lang/Object;)Ljava/lang/String;", "if", "ι", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/io/Serializable;", "Lo/ı;", "T"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.dx  reason: case insensitive filesystem */
public final class C3369dx<T> implements Serializable {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C0158 f2060 = new C0158((fL) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object f2061;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m2116(Object obj, Object obj2) {
        return (obj2 instanceof C3369dx) && fM.m2257(obj, ((C3369dx) obj2).m2120());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Object m2118(Object obj) {
        return obj;
    }

    /* renamed from: і  reason: contains not printable characters */
    public static int m2119(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return m2116(this.f2061, obj);
    }

    public final int hashCode() {
        return m2119(this.f2061);
    }

    public final String toString() {
        return m2115(this.f2061);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m2120() {
        return this.f2061;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final boolean m2114(Object obj) {
        return !(obj instanceof Cif);
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public static final boolean m2113(Object obj) {
        return obj instanceof Cif;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Throwable m2117(Object obj) {
        if (obj instanceof Cif) {
            return ((Cif) obj).f2062;
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m2115(Object obj) {
        if (obj instanceof Cif) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/dx$ı;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.dx$ı  reason: contains not printable characters */
    public static final class C0158 {
        private C0158() {
        }

        public /* synthetic */ C0158(fL fLVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00060\u0011j\u0002`\u0012B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/dx$if;", "", "ǃ", "Ljava/lang/Throwable;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Throwable;)V", "Ljava/io/Serializable;", "Lo/ı;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.dx$if  reason: invalid class name */
    public static final class Cif implements Serializable {

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Throwable f2062;

        public Cif(Throwable th) {
            fM.m2254(th, "");
            this.f2062 = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Cif) && fM.m2257(this.f2062, ((Cif) obj).f2062);
        }

        public final int hashCode() {
            return this.f2062.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f2062 + ')';
        }
    }
}
