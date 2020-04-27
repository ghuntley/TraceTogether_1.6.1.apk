package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0003\u001a\u00020\u00008\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/eS;", "ı", "Lo/eS;", "ǃ", "", "ɩ", "()I"}, k = 2, mv = {1, 1, 15})
public final class eQ {

    /* renamed from: ı  reason: contains not printable characters */
    public static final eS f2093;

    static {
        eS eSVar;
        Object newInstance;
        Object newInstance2;
        int r0 = m2159();
        if (r0 >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                fM.m2252((Object) newInstance2, "");
                if (newInstance2 != null) {
                    eSVar = (eS) newInstance2;
                    f2093 = eSVar;
                }
                throw new dA("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = eS.class.getClassLoader();
                Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                fM.m2252((Object) initCause, "");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    fM.m2252((Object) newInstance3, "");
                    if (newInstance3 != null) {
                        try {
                            eSVar = (eS) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = eS.class.getClassLoader();
                            Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                            fM.m2252((Object) initCause2, "");
                            throw initCause2;
                        }
                    } else {
                        throw new dA("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (r0 >= 65543) {
            try {
                newInstance = Class.forName("o.eU").newInstance();
                fM.m2252(newInstance, "");
                if (newInstance != null) {
                    eSVar = (eS) newInstance;
                    f2093 = eSVar;
                }
                throw new dA("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = eS.class.getClassLoader();
                Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                fM.m2252((Object) initCause3, "");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    fM.m2252(newInstance4, "");
                    if (newInstance4 != null) {
                        try {
                            eSVar = (eS) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = eS.class.getClassLoader();
                            Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                            fM.m2252((Object) initCause4, "");
                            throw initCause4;
                        }
                    } else {
                        throw new dA("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        eSVar = new eS();
        f2093 = eSVar;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int m2159() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        CharSequence charSequence = property;
        int r9 = gK.m2354$default(charSequence, '.', 0, false, 6, (Object) null);
        if (r9 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = r9 + 1;
            int r2 = gK.m2354$default(charSequence, '.', i, false, 4, (Object) null);
            if (r2 < 0) {
                r2 = property.length();
            }
            String substring = property.substring(0, r9);
            fM.m2252((Object) substring, "");
            String substring2 = property.substring(i, r2);
            fM.m2252((Object) substring2, "");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
