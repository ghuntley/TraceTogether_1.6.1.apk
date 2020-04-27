package o;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C0712;
import o.C1702;
import o.C2071;
import o.C2669;
import o.C2669.C2672;
import o.C2702;
import o.C2993;

/* renamed from: o.ҏ  reason: contains not printable characters */
public abstract class C2669<MessageType extends C2669<MessageType, BuilderType>, BuilderType extends C2672<MessageType, BuilderType>> extends C1702<MessageType, BuilderType> {

    /* renamed from: і  reason: contains not printable characters */
    public C3134 f12289 = C3134.m15878();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int f12290 = -1;

    /* renamed from: o.ҏ$IF */
    public interface IF {
        /* renamed from: ı  reason: contains not printable characters */
        long m14171(boolean z, long j, boolean z2, long j2);

        /* renamed from: ı  reason: contains not printable characters */
        <T> C2702.C2704<T> m14172(C2702.C2704<T> r1, C2702.C2704<T> r2);

        /* renamed from: ı  reason: contains not printable characters */
        <T extends C2993> T m14173(T t, T t2);

        /* renamed from: ǃ  reason: contains not printable characters */
        String m14174(boolean z, String str, boolean z2, String str2);

        /* renamed from: ɩ  reason: contains not printable characters */
        int m14175(boolean z, int i, boolean z2, int i2);

        /* renamed from: ɩ  reason: contains not printable characters */
        C1767 m14176(boolean z, C1767 r2, boolean z2, C1767 r4);

        /* renamed from: ι  reason: contains not printable characters */
        C3134 m14177(C3134 r1, C3134 r2);

        /* renamed from: ι  reason: contains not printable characters */
        boolean m14178(boolean z, boolean z2, boolean z3, boolean z4);
    }

    /* renamed from: o.ҏ$ı  reason: contains not printable characters */
    public static abstract class C2670<MessageType extends C2670<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends C2669<MessageType, BuilderType> implements C0712.C0713<MessageType, BuilderType> {

        /* renamed from: ɩ  reason: contains not printable characters */
        protected C2071<Cif> f12296 = C2071.m11000();
    }

    /* renamed from: o.ҏ$Ι  reason: contains not printable characters */
    public enum C2673 {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract Object m14166(C2673 r1, Object obj, Object obj2);

    /* renamed from: І  reason: contains not printable characters */
    public final C3022<MessageType> m14168() {
        return (C3022) m14166(C2673.GET_PARSER, (Object) null, (Object) null);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final BuilderType m14169() {
        return (C2672) m14166(C2673.NEW_BUILDER, (Object) null, (Object) null);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C3064.m15636(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.f8879 == 0) {
            C3653iF iFVar = new C3653iF((byte) 0);
            m14166(C2673.VISIT, (Object) iFVar, (Object) this);
            C3134 r1 = this.f12289;
            this.f12289 = iFVar.m14177(r1, r1);
            this.f8879 = iFVar.f12294;
        }
        return this.f8879;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final int m14158(C3653iF iFVar) {
        if (this.f8879 == 0) {
            int i = iFVar.f12294;
            iFVar.f12294 = 0;
            m14166(C2673.VISIT, (Object) iFVar, (Object) this);
            C3134 r1 = this.f12289;
            this.f12289 = iFVar.m14177(r1, r1);
            this.f8879 = iFVar.f12294;
            iFVar.f12294 = i;
        }
        return this.f8879;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m14165() {
        m14166(C2673.MAKE_IMMUTABLE, (Object) null, (Object) null);
        this.f12289.f14298 = false;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final boolean m14159() {
        return m14166(C2673.IS_INITIALIZED, (Object) Boolean.TRUE, (Object) null) != null;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final BuilderType m14161() {
        BuilderType buildertype = (C2672) m14166(C2673.NEW_BUILDER, (Object) null, (Object) null);
        buildertype.m14207(this);
        return buildertype;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final Object m14167(C2673 r2) {
        return m14166(r2, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14163(IF ifR, MessageType messagetype) {
        m14166(C2673.VISIT, (Object) ifR, (Object) messagetype);
        this.f12289 = ifR.m14177(this.f12289, messagetype.f12289);
    }

    /* renamed from: o.ҏ$ɩ  reason: contains not printable characters */
    public static abstract class C2672<MessageType extends C2669<MessageType, BuilderType>, BuilderType extends C2672<MessageType, BuilderType>> extends C1702.If<MessageType, BuilderType> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final MessageType f12298;

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean f12299 = false;

        /* renamed from: ι  reason: contains not printable characters */
        public MessageType f12300;

        /* access modifiers changed from: protected */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ C1702.If m14209(C1702 r3) {
            m14204();
            this.f12300.m14163((IF) aux.f12293, (C2669) r3);
            return this;
        }

        public C2672(MessageType messagetype) {
            this.f12298 = messagetype;
            this.f12300 = (C2669) messagetype.m14167(C2673.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m14204() {
            if (this.f12299) {
                MessageType messagetype = (C2669) this.f12300.m14167(C2673.NEW_MUTABLE_INSTANCE);
                messagetype.m14163((IF) aux.f12293, this.f12300);
                this.f12300 = messagetype;
                this.f12299 = false;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final BuilderType m14207(MessageType messagetype) {
            m14204();
            this.f12300.m14163((IF) aux.f12293, messagetype);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: ι  reason: contains not printable characters */
        public BuilderType m14206() {
            MessageType messagetype;
            BuilderType r0 = this.f12298.m14169();
            if (this.f12299) {
                messagetype = this.f12300;
            } else {
                this.f12300.m14165();
                this.f12299 = true;
                messagetype = this.f12300;
            }
            r0.m14204();
            r0.f12300.m14163((IF) aux.f12293, messagetype);
            return r0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ C2993 m14208() {
            MessageType messagetype;
            if (this.f12299) {
                messagetype = this.f12300;
            } else {
                this.f12300.m14165();
                this.f12299 = true;
                messagetype = this.f12300;
            }
            if (messagetype.m14159()) {
                return messagetype;
            }
            throw new C2224();
        }

        /* renamed from: ӏ  reason: contains not printable characters */
        public final /* bridge */ /* synthetic */ C2993 m14210() {
            return this.f12298;
        }
    }

    /* renamed from: o.ҏ$if  reason: invalid class name */
    static final class Cif implements C2071.C2072<Cif> {

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f12295;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.f12295 - ((Cif) obj).f12295;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static Object m14153(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: o.ҏ$ǃ  reason: contains not printable characters */
    public static class C2671<T extends C2669<T, ?>> extends C1783<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private T f12297;

        public C2671(T t) {
            this.f12297 = t;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final /* synthetic */ Object m14203(C1841 r2, C2269 r3) {
            return C2669.m14156(this.f12297, r2, r3);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static <T extends C2669<T, ?>> T m14156(T t, C1841 r3, C2269 r4) {
        T t2 = (C2669) t.m14166(C2673.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
        try {
            t2.m14166(C2673.MERGE_FROM_STREAM, (Object) r3, (Object) r4);
            t2.m14166(C2673.MAKE_IMMUTABLE, (Object) null, (Object) null);
            t2.f12289.f14298 = false;
            return t2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof C2991) {
                throw ((C2991) e.getCause());
            }
            throw e;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <T extends C2669<T, ?>> T m14157(T t, byte[] bArr) {
        return m14154(m14152(t, bArr, C2269.m11833()));
    }

    /* renamed from: o.ҏ$If  reason: case insensitive filesystem */
    static class C3652If implements IF {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final C3652If f12291 = new C3652If();

        /* renamed from: Ι  reason: contains not printable characters */
        private static Cif f12292 = new Cif();

        /* renamed from: o.ҏ$If$if  reason: invalid class name */
        static final class Cif extends RuntimeException {
            Cif() {
            }
        }

        private C3652If() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m14186(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f12292;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m14183(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f12292;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final long m14179(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw f12292;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String m14182(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f12292;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1767 m14184(boolean z, C1767 r2, boolean z2, C1767 r4) {
            if (z == z2 && r2.equals(r4)) {
                return r2;
            }
            throw f12292;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final <T extends C2993> T m14181(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f12292;
            }
            ((C2669) t).m14160(this, t2);
            return t;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C2702.C2704<T> m14180(C2702.C2704<T> r1, C2702.C2704<T> r2) {
            if (r1.equals(r2)) {
                return r1;
            }
            throw f12292;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C3134 m14185(C3134 r1, C3134 r2) {
            if (r1.equals(r2)) {
                return r1;
            }
            throw f12292;
        }
    }

    /* renamed from: o.ҏ$iF  reason: case insensitive filesystem */
    static class C3653iF implements IF {

        /* renamed from: Ι  reason: contains not printable characters */
        int f12294;

        private C3653iF() {
            this.f12294 = 0;
        }

        /* synthetic */ C3653iF(byte b) {
            this();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m14202(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f12294 = (this.f12294 * 53) + C2702.m14397(z2);
            return z2;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m14199(boolean z, int i, boolean z2, int i2) {
            this.f12294 = (this.f12294 * 53) + i;
            return i;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final long m14195(boolean z, long j, boolean z2, long j2) {
            this.f12294 = (this.f12294 * 53) + C2702.m14396(j);
            return j;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String m14198(boolean z, String str, boolean z2, String str2) {
            this.f12294 = (this.f12294 * 53) + str.hashCode();
            return str;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1767 m14200(boolean z, C1767 r2, boolean z2, C1767 r4) {
            this.f12294 = (this.f12294 * 53) + r2.hashCode();
            return r2;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final <T extends C2993> T m14197(T t, T t2) {
            int i;
            if (t != null) {
                i = t instanceof C2669 ? ((C2669) t).m14158(this) : t.hashCode();
            } else {
                i = 37;
            }
            this.f12294 = (this.f12294 * 53) + i;
            return t;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C2702.C2704<T> m14196(C2702.C2704<T> r2, C2702.C2704<T> r3) {
            this.f12294 = (this.f12294 * 53) + r2.hashCode();
            return r2;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C3134 m14201(C3134 r2, C3134 r3) {
            this.f12294 = (this.f12294 * 53) + r2.hashCode();
            return r2;
        }
    }

    /* renamed from: o.ҏ$aux */
    public static class aux implements IF {

        /* renamed from: Ι  reason: contains not printable characters */
        public static final aux f12293 = new aux();

        /* renamed from: ı  reason: contains not printable characters */
        public final long m14187(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final String m14190(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m14191(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1767 m14192(boolean z, C1767 r2, boolean z2, C1767 r4) {
            return z2 ? r4 : r2;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m14194(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        private aux() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final <T extends C2993> T m14189(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            return t.m15338().m15342(t2).m15341();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C2702.C2704<T> m14188(C2702.C2704<T> r4, C2702.C2704<T> r5) {
            int size = r4.size();
            int size2 = r5.size();
            if (size > 0 && size2 > 0) {
                if (!r4.m14401()) {
                    r4 = r4.m14399(size2 + size);
                }
                r4.addAll(r5);
            }
            return size > 0 ? r4 : r5;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C3134 m14193(C3134 r2, C3134 r3) {
            if (r3 == C3134.m15878()) {
                return r2;
            }
            return C3134.m15882(r2, r3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C2669) m14166(C2673.GET_DEFAULT_INSTANCE, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            C3652If ifR = C3652If.f12291;
            C2669 r5 = (C2669) obj;
            m14166(C2673.VISIT, (Object) ifR, (Object) r5);
            this.f12289 = ifR.m14177(this.f12289, r5.f12289);
            return true;
        } catch (C3652If.Cif unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m14160(C3652If ifR, C2993 r5) {
        if (this == r5) {
            return true;
        }
        if (!((C2669) m14166(C2673.GET_DEFAULT_INSTANCE, (Object) null, (Object) null)).getClass().isInstance(r5)) {
            return false;
        }
        C2669 r52 = (C2669) r5;
        m14166(C2673.VISIT, (Object) ifR, (Object) r52);
        this.f12289 = ifR.m14177(this.f12289, r52.f12289);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m14164(int i, C1841 r4) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.f12289 == C3134.m15878()) {
            this.f12289 = C3134.m15881();
        }
        return this.f12289.m15885(i, r4);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static <T extends C2669<T, ?>> T m14154(T t) {
        if (t != null) {
            if (!(t.m14166(C2673.IS_INITIALIZED, (Object) Boolean.TRUE, (Object) null) != null)) {
                throw new C2991(new C2224().getMessage());
            }
        }
        return t;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static <T extends C2669<T, ?>> T m14152(T t, byte[] bArr, C2269 r3) {
        try {
            C1841 r2 = C1841.m10175(bArr, bArr.length);
            T r1 = m14156(t, r2, r3);
            if (r2.f9437 == 0) {
                return r1;
            }
            throw new C2991("Protocol message end-group tag did not match expected tag.");
        } catch (C2991 e) {
            throw e;
        } catch (C2991 e2) {
            throw e2;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <T extends C2669<T, ?>> T m14155(T t, InputStream inputStream) {
        return m14154(m14156(t, new C1841(inputStream), C2269.m11833()));
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final /* synthetic */ C2993.C2994 m14162() {
        C2672 r0 = (C2672) m14166(C2673.NEW_BUILDER, (Object) null, (Object) null);
        r0.m14207(this);
        return r0;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* synthetic */ C2993 m14170() {
        return (C2669) m14166(C2673.GET_DEFAULT_INSTANCE, (Object) null, (Object) null);
    }
}
