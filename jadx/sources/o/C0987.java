package o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C0987;
import o.C0987.C0989;

/* renamed from: o.ȽІ  reason: contains not printable characters */
public abstract class C0987<MessageType extends C0987<MessageType, BuilderType>, BuilderType extends C0989<MessageType, BuilderType>> extends C0457<MessageType, BuilderType> {
    private static Map<Object, C0987<?, ?>> zzd = new ConcurrentHashMap();
    protected C2515 zzb = C2515.m13355();
    private int zzc = -1;

    /* 'enum' modifier removed */
    /* renamed from: o.ȽІ$If */
    public static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f6015 = 5;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f6016 = 7;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int f6017 = 3;

        /* renamed from: ȷ  reason: contains not printable characters */
        public static final int f6018 = 2;

        /* renamed from: ɨ  reason: contains not printable characters */
        private static final /* synthetic */ int[] f6019 = {f6026, f6021};

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f6020 = 4;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f6021 = 2;

        /* renamed from: ɾ  reason: contains not printable characters */
        private static final /* synthetic */ int[] f6022 = {f6023, f6024, f6017, f6020, f6015, f6025, f6016};

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f6023 = 1;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int f6024 = 2;

        /* renamed from: І  reason: contains not printable characters */
        public static final int f6025 = 6;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f6026 = 1;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f6027 = 1;

        /* renamed from: ӏ  reason: contains not printable characters */
        private static final /* synthetic */ int[] f6028 = {f6027, f6018};

        /* renamed from: ɩ  reason: contains not printable characters */
        public static int[] m6997() {
            return (int[]) f6022.clone();
        }
    }

    /* renamed from: o.ȽІ$iF  reason: case insensitive filesystem */
    public static class C3635iF<ContainingType extends C1637, Type> extends C0706<ContainingType, Type> {
    }

    /* renamed from: o.ȽІ$ı  reason: contains not printable characters */
    static final class C0988 implements C0750<C0988> {
        /* renamed from: Ι  reason: contains not printable characters */
        public final int m7003() {
            throw new NoSuchMethodError();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2792 m7000() {
            throw new NoSuchMethodError();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2743 m7002() {
            throw new NoSuchMethodError();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m7005() {
            throw new NoSuchMethodError();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m6999() {
            throw new NoSuchMethodError();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1761 m7004(C1761 r1, C1637 r2) {
            throw new NoSuchMethodError();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1835 m7001(C1835 r1, C1835 r2) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: o.ȽІ$ɩ  reason: contains not printable characters */
    public static class C0990<T extends C0987<T, ?>> extends C0488<T> {

        /* renamed from: Ι  reason: contains not printable characters */
        private final T f6032;

        public C0990(T t) {
            this.f6032 = t;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract Object m6987(int i, Object obj, Object obj2);

    /* renamed from: o.ȽІ$if  reason: invalid class name */
    public static abstract class Cif<MessageType extends Cif<MessageType, BuilderType>, BuilderType> extends C0987<MessageType, BuilderType> {
        protected C0790<C0988> zzc = C0790.m6155();

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final C0790<C0988> m6998() {
            if (this.zzc.m6165()) {
                this.zzc = (C0790) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public String toString() {
        return C1751.m9826(this, super.toString());
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = C1934.m10558().m10560(this).m10782(this);
        return this.zza;
    }

    /* renamed from: o.ȽІ$ǃ  reason: contains not printable characters */
    public static abstract class C0989<MessageType extends C0987<MessageType, BuilderType>, BuilderType extends C0989<MessageType, BuilderType>> extends C0489<MessageType, BuilderType> {

        /* renamed from: ı  reason: contains not printable characters */
        protected MessageType f6029;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final MessageType f6030;

        /* renamed from: Ι  reason: contains not printable characters */
        protected boolean f6031 = false;

        protected C0989(MessageType messagetype) {
            this.f6030 = messagetype;
            this.f6029 = (C0987) messagetype.m6987(If.f6020, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ɿ  reason: contains not printable characters */
        public void m7014() {
            MessageType messagetype = (C0987) this.f6029.m6987(If.f6020, (Object) null, (Object) null);
            m7008(messagetype, this.f6029);
            this.f6029 = messagetype;
        }

        /* renamed from: ϛ  reason: contains not printable characters */
        public final boolean m7020() {
            return C0987.m6983(this.f6029, false);
        }

        /* renamed from: ł  reason: contains not printable characters */
        public MessageType m7009() {
            if (this.f6031) {
                return this.f6029;
            }
            MessageType messagetype = this.f6029;
            C1934.m10558().m10560(messagetype).m10784(messagetype);
            this.f6031 = true;
            return this.f6029;
        }

        /* renamed from: г  reason: contains not printable characters */
        public final MessageType m7011() {
            MessageType messagetype = (C0987) m7009();
            if (messagetype.m6995()) {
                return messagetype;
            }
            throw new C2395(messagetype);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final BuilderType m7012(MessageType messagetype) {
            if (this.f6031) {
                m7014();
                this.f6031 = false;
            }
            m7008(this.f6029, messagetype);
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private static void m7008(MessageType messagetype, MessageType messagetype2) {
            C1934.m10558().m10560(messagetype).m10791(messagetype, messagetype2);
        }

        /* renamed from: ı  reason: contains not printable characters */
        private final BuilderType m7006(byte[] bArr, int i, int i2, C0705 r12) {
            if (this.f6031) {
                m7014();
                this.f6031 = false;
            }
            try {
                C1934.m10558().m10560(this.f6029).m10789(this.f6029, bArr, 0, i2 + 0, new C0515(r12));
                return this;
            } catch (C1124 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C1124.m7558();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final BuilderType m7016(C0598 r3, C0705 r4) {
            if (this.f6031) {
                m7014();
                this.f6031 = false;
            }
            try {
                C1934.m10558().m10560(this.f6029).m10785(this.f6029, C0700.m5761(r3), r4);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final /* synthetic */ C0489 m7017(byte[] bArr, int i, int i2, C0705 r4) {
            return m7006(bArr, 0, i2, r4);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final /* synthetic */ C0489 m7019(byte[] bArr, int i, int i2) {
            return m7006(bArr, 0, i2, C0705.m5817());
        }

        /* renamed from: ʟ  reason: contains not printable characters */
        public final /* synthetic */ C0489 m7015() {
            return (C0989) clone();
        }

        /* renamed from: ɩı  reason: contains not printable characters */
        public final /* synthetic */ C1637 m7013() {
            return this.f6030;
        }

        public /* synthetic */ Object clone() {
            C0989 r0 = (C0989) ((C0987) this.f6030).m6987(If.f6015, (Object) null, (Object) null);
            r0.m7012((C0987) m7009());
            return r0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1934.m10558().m10560(this).m10787(this, (C0987) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ч  reason: contains not printable characters */
    public final <MessageType extends C0987<MessageType, BuilderType>, BuilderType extends C0989<MessageType, BuilderType>> BuilderType m6996() {
        return (C0989) m6987(If.f6015, (Object) null, (Object) null);
    }

    /* renamed from: ϛ  reason: contains not printable characters */
    public final boolean m6995() {
        return m6983(this, Boolean.TRUE.booleanValue());
    }

    /* renamed from: Ξ  reason: contains not printable characters */
    public final BuilderType m6992() {
        BuilderType buildertype = (C0989) m6987(If.f6015, (Object) null, (Object) null);
        buildertype.m7012(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ς  reason: contains not printable characters */
    public final int m6994() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m6991(int i) {
        this.zzc = i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6993(C0692 r2) {
        C1934.m10558().m10560(this).m10783(this, C0734.m5872(r2));
    }

    /* renamed from: ǃι  reason: contains not printable characters */
    public final int m6988() {
        if (this.zzc == -1) {
            this.zzc = C1934.m10558().m10560(this).m10786(this);
        }
        return this.zzc;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static <T extends C0987<?, ?>> T m6985(Class<T> cls) {
        T t = (C0987) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C0987) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C0987) ((C0987) C2509.m13274(cls)).m6987(If.f6025, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    protected static <T extends C0987<?, ?>> void m6979(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    protected static Object m6981(C1637 r1, String str, Object[] objArr) {
        return new C2035(r1, str, objArr);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static Object m6984(Method method, Object obj, Object... objArr) {
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

    /* renamed from: ɩ  reason: contains not printable characters */
    protected static final <T extends C0987<T, ?>> boolean m6983(T t, boolean z) {
        byte byteValue = ((Byte) t.m6987(If.f6023, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean r0 = C1934.m10558().m10560(t).m10790(t);
        if (z) {
            t.m6987(If.f6024, r0 ? t : null, (Object) null);
        }
        return r0;
    }

    /* renamed from: ıι  reason: contains not printable characters */
    protected static C1019 m6977() {
        return C0986.m6969();
    }

    /* renamed from: ǃɩ  reason: contains not printable characters */
    protected static C1043 m6980() {
        return C1440.m8699();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    protected static C1043 m6982(C1043 r1) {
        int size = r1.size();
        return r1.m7284(size == 0 ? 10 : size << 1);
    }

    /* renamed from: ĸ  reason: contains not printable characters */
    protected static <E> C1001<E> m6978() {
        return C2031.m10890();
    }

    /* renamed from: ı  reason: contains not printable characters */
    protected static <E> C1001<E> m6976(C1001<E> r1) {
        int size = r1.size();
        return r1.m7113(size == 0 ? 10 : size << 1);
    }

    /* renamed from: Ŀ  reason: contains not printable characters */
    public final /* synthetic */ C1761 m6986() {
        C0989 r0 = (C0989) m6987(If.f6015, (Object) null, (Object) null);
        r0.m7012(this);
        return r0;
    }

    /* renamed from: Ƚ  reason: contains not printable characters */
    public final /* synthetic */ C1761 m6989() {
        return (C0989) m6987(If.f6015, (Object) null, (Object) null);
    }

    /* renamed from: ɩı  reason: contains not printable characters */
    public final /* synthetic */ C1637 m6990() {
        return (C0987) m6987(If.f6025, (Object) null, (Object) null);
    }
}
