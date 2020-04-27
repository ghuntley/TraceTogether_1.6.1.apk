package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: o.բ  reason: contains not printable characters */
public final class C3062 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<Type, C0371<?>> f13994;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3063 f13995 = C3063.m15632();

    public C3062(Map<Type, C0371<?>> map) {
        this.f13994 = map;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> C1535<T> m15617(C3101<T> r5) {
        C1535<T> r1;
        final Type type = r5.getType();
        final Class<? super T> rawType = r5.getRawType();
        final C0371 r12 = this.f13994.get(type);
        if (r12 != null) {
            return new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15626() {
                    return C0371.this.m4567();
                }
            };
        }
        final C0371 r13 = this.f13994.get(rawType);
        if (r13 != null) {
            return new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15628() {
                    return C0371.this.m4567();
                }
            };
        }
        C1535<T> r14 = m15616(rawType);
        if (r14 != null) {
            return r14;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            r1 = SortedSet.class.isAssignableFrom(rawType) ? new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15631() {
                    return new TreeSet();
                }
            } : EnumSet.class.isAssignableFrom(rawType) ? new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15629() {
                    Type type = type;
                    if (type instanceof ParameterizedType) {
                        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                        if (type2 instanceof Class) {
                            return EnumSet.noneOf((Class) type2);
                        }
                        StringBuilder sb = new StringBuilder("Invalid EnumSet type: ");
                        sb.append(type.toString());
                        throw new C1169(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                    sb2.append(type.toString());
                    throw new C1169(sb2.toString());
                }
            } : Set.class.isAssignableFrom(rawType) ? new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15621() {
                    return new LinkedHashSet();
                }
            } : Queue.class.isAssignableFrom(rawType) ? new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15620() {
                    return new ArrayDeque();
                }
            } : new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15622() {
                    return new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(rawType)) {
            r1 = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
            r1 = new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15623() {
                    return new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
            r1 = new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15624() {
                    return new ConcurrentHashMap();
                }
            };
        } else {
            r1 = SortedMap.class.isAssignableFrom(rawType) ? new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15625() {
                    return new TreeMap();
                }
            } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C3101.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15627() {
                    return new C3095();
                }
            } : new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15618() {
                    return new LinkedHashMap();
                }
            };
        }
        return r1 != null ? r1 : new C1535<T>() {

            /* renamed from: ι  reason: contains not printable characters */
            private final C1605 f14002 = C1605.m9316();

            /* renamed from: ɩ  reason: contains not printable characters */
            public final T m15630() {
                try {
                    return this.f14002.m9318(rawType);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(type);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        };
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private <T> C1535<T> m15616(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f13995.m15633(declaredConstructor);
            }
            return new C1535<T>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final T m15619() {
                    try {
                        return declaredConstructor.newInstance((Object[]) null);
                    } catch (InstantiationException e) {
                        StringBuilder sb = new StringBuilder("Failed to invoke ");
                        sb.append(declaredConstructor);
                        sb.append(" with no args");
                        throw new RuntimeException(sb.toString(), e);
                    } catch (InvocationTargetException e2) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke ");
                        sb2.append(declaredConstructor);
                        sb2.append(" with no args");
                        throw new RuntimeException(sb2.toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.f13994.toString();
    }
}
