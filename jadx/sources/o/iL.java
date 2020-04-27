package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0001\u0010\u0010\u001a#\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0012\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0012\u0010\u0014\u001a\u001f\u0010\u0003\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0003\u0010\u0014\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"<\u0010\u0001\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007j\u0002`\b0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f*(\b\u0002\u0010\u0015\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00072\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0007"}, d2 = {"Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "ı", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "ι", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lo/Ctor;", "Ι", "Ljava/util/WeakHashMap;", "", "I", "ɩ", "Ljava/lang/reflect/Constructor;", "p0", "(Ljava/lang/reflect/Constructor;)Lo/fo;", "E", "ǃ", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "(Ljava/lang/Class;I)I", "Ctor"}, k = 2, mv = {1, 1, 15})
public final class iL {

    /* renamed from: ı  reason: contains not printable characters */
    private static final ReentrantReadWriteLock f2326 = new ReentrantReadWriteLock();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final WeakHashMap<Class<? extends Throwable>, C3413fo<Throwable, Throwable>> f2327 = new WeakHashMap<>();

    /* renamed from: ι  reason: contains not printable characters */
    private static final int f2328 = m2594(Throwable.class, -1);

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m2592(E r9) {
        /*
            java.lang.String r0 = ""
            o.fM.m2254(r9, r0)
            boolean r1 = r9 instanceof o.C3466hn
            r2 = 0
            if (r1 == 0) goto L_0x002c
            o.dx$ı r0 = o.C3369dx.f2060     // Catch:{ all -> 0x0017 }
            o.hn r9 = (o.C3466hn) r9     // Catch:{ all -> 0x0017 }
            java.lang.Throwable r9 = r9.m2540()     // Catch:{ all -> 0x0017 }
            java.lang.Object r9 = o.C3369dx.m2118(r9)     // Catch:{ all -> 0x0017 }
            goto L_0x0022
        L_0x0017:
            r9 = move-exception
            o.dx$ı r0 = o.C3369dx.f2060
            java.lang.Object r9 = o.C3366du.m2110(r9)
            java.lang.Object r9 = o.C3369dx.m2118(r9)
        L_0x0022:
            boolean r0 = o.C3369dx.m2113(r9)
            if (r0 == 0) goto L_0x0029
            r9 = r2
        L_0x0029:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x002c:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f2326
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, o.fo<java.lang.Throwable, java.lang.Throwable>> r3 = f2327     // Catch:{ all -> 0x012f }
            java.lang.Class r4 = r9.getClass()     // Catch:{ all -> 0x012f }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x012f }
            o.fo r3 = (o.C3413fo) r3     // Catch:{ all -> 0x012f }
            r1.unlock()
            if (r3 == 0) goto L_0x004d
            java.lang.Object r9 = r3.m2298(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x004d:
            int r1 = f2328
            java.lang.Class r3 = r9.getClass()
            r4 = 0
            int r3 = m2594(r3, r4)
            if (r1 == r3) goto L_0x00a4
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f2326
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r3 = r0.getWriteHoldCount()
            if (r3 != 0) goto L_0x006b
            int r3 = r0.getReadHoldCount()
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            r5 = 0
        L_0x006d:
            if (r5 >= r3) goto L_0x0075
            r1.unlock()
            int r5 = r5 + 1
            goto L_0x006d
        L_0x0075:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, o.fo<java.lang.Throwable, java.lang.Throwable>> r5 = f2327     // Catch:{ all -> 0x0097 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x0097 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0097 }
            o.iL$10 r6 = o.iL.AnonymousClass10.f2330     // Catch:{ all -> 0x0097 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0097 }
            o.dF r9 = o.dF.f2032     // Catch:{ all -> 0x0097 }
        L_0x008b:
            if (r4 >= r3) goto L_0x0093
            r1.lock()
            int r4 = r4 + 1
            goto L_0x008b
        L_0x0093:
            r0.unlock()
            return r2
        L_0x0097:
            r9 = move-exception
        L_0x0098:
            if (r4 >= r3) goto L_0x00a0
            r1.lock()
            int r4 = r4 + 1
            goto L_0x0098
        L_0x00a0:
            r0.unlock()
            throw r9
        L_0x00a4:
            r1 = r2
            o.fo r1 = (o.C3413fo) r1
            java.lang.Class r3 = r9.getClass()
            java.lang.reflect.Constructor[] r3 = r3.getConstructors()
            o.fM.m2252((java.lang.Object) r3, (java.lang.String) r0)
            o.iL$4 r5 = new o.iL$4
            r5.<init>()
            java.util.Comparator r5 = (java.util.Comparator) r5
            java.util.List r3 = o.dM.m2065(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00c1:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d6
            java.lang.Object r1 = r3.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            o.fM.m2252((java.lang.Object) r1, (java.lang.String) r0)
            o.fo r1 = m2590(r1)
            if (r1 == 0) goto L_0x00c1
        L_0x00d6:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f2326
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00e7
            int r5 = r0.getReadHoldCount()
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            if (r6 >= r5) goto L_0x00f1
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x00e9
        L_0x00f1:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, o.fo<java.lang.Throwable, java.lang.Throwable>> r6 = f2327     // Catch:{ all -> 0x0122 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x0122 }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0104
            r8 = r1
            goto L_0x0108
        L_0x0104:
            o.iL$7 r8 = o.iL.AnonymousClass7.f2334     // Catch:{ all -> 0x0122 }
            o.fo r8 = (o.C3413fo) r8     // Catch:{ all -> 0x0122 }
        L_0x0108:
            r6.put(r7, r8)     // Catch:{ all -> 0x0122 }
            o.dF r6 = o.dF.f2032     // Catch:{ all -> 0x0122 }
        L_0x010d:
            if (r4 >= r5) goto L_0x0115
            r3.lock()
            int r4 = r4 + 1
            goto L_0x010d
        L_0x0115:
            r0.unlock()
            if (r1 == 0) goto L_0x0121
            java.lang.Object r9 = r1.m2298(r9)
            r2 = r9
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L_0x0121:
            return r2
        L_0x0122:
            r9 = move-exception
        L_0x0123:
            if (r4 >= r5) goto L_0x012b
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0123
        L_0x012b:
            r0.unlock()
            throw r9
        L_0x012f:
            r9 = move-exception
            r1.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iL.m2592(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static final C3413fo<Throwable, Throwable> m2590(final Constructor<?> constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C3413fo<Throwable, Throwable>() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final Throwable m2599(Throwable th) {
                    Object obj;
                    fM.m2254(th, "");
                    try {
                        C3369dx.C0158 r0 = C3369dx.f2060;
                        Object newInstance = constructor.newInstance(new Object[0]);
                        if (newInstance != null) {
                            Throwable th2 = (Throwable) newInstance;
                            th2.initCause(th);
                            obj = C3369dx.m2118(th2);
                            if (C3369dx.m2113(obj)) {
                                obj = null;
                            }
                            return (Throwable) obj;
                        }
                        throw new dA("null cannot be cast to non-null type kotlin.Throwable");
                    } catch (Throwable th3) {
                        C3369dx.C0158 r02 = C3369dx.f2060;
                        obj = C3369dx.m2118(C3366du.m2110(th3));
                    }
                }
            };
        }
        if (length == 1) {
            Class cls = parameterTypes[0];
            if (fM.m2257(cls, Throwable.class)) {
                return new C3413fo<Throwable, Throwable>() {
                    /* renamed from: ǃ  reason: contains not printable characters */
                    public final Throwable m2602(Throwable th) {
                        Object obj;
                        fM.m2254(th, "");
                        try {
                            C3369dx.C0158 r0 = C3369dx.f2060;
                            Object newInstance = constructor.newInstance(new Object[]{th});
                            if (newInstance != null) {
                                obj = C3369dx.m2118((Throwable) newInstance);
                                if (C3369dx.m2113(obj)) {
                                    obj = null;
                                }
                                return (Throwable) obj;
                            }
                            throw new dA("null cannot be cast to non-null type kotlin.Throwable");
                        } catch (Throwable th2) {
                            C3369dx.C0158 r02 = C3369dx.f2060;
                            obj = C3369dx.m2118(C3366du.m2110(th2));
                        }
                    }
                };
            }
            if (fM.m2257(cls, String.class)) {
                return new C3413fo<Throwable, Throwable>() {
                    /* renamed from: ǃ  reason: contains not printable characters */
                    public final Throwable m2596(Throwable th) {
                        Object obj;
                        fM.m2254(th, "");
                        try {
                            C3369dx.C0158 r0 = C3369dx.f2060;
                            Object newInstance = constructor.newInstance(new Object[]{th.getMessage()});
                            if (newInstance != null) {
                                Throwable th2 = (Throwable) newInstance;
                                th2.initCause(th);
                                obj = C3369dx.m2118(th2);
                                if (C3369dx.m2113(obj)) {
                                    obj = null;
                                }
                                return (Throwable) obj;
                            }
                            throw new dA("null cannot be cast to non-null type kotlin.Throwable");
                        } catch (Throwable th3) {
                            C3369dx.C0158 r02 = C3369dx.f2060;
                            obj = C3369dx.m2118(C3366du.m2110(th3));
                        }
                    }
                };
            }
            return null;
        } else if (length == 2 && fM.m2257(parameterTypes[0], String.class) && fM.m2257(parameterTypes[1], Throwable.class)) {
            return new C3413fo<Throwable, Throwable>() {
                /* renamed from: ι  reason: contains not printable characters */
                public final Throwable m2603(Throwable th) {
                    Object obj;
                    fM.m2254(th, "");
                    try {
                        C3369dx.C0158 r0 = C3369dx.f2060;
                        Object newInstance = constructor.newInstance(new Object[]{th.getMessage(), th});
                        if (newInstance != null) {
                            obj = C3369dx.m2118((Throwable) newInstance);
                            if (C3369dx.m2113(obj)) {
                                obj = null;
                            }
                            return (Throwable) obj;
                        }
                        throw new dA("null cannot be cast to non-null type kotlin.Throwable");
                    } catch (Throwable th2) {
                        C3369dx.C0158 r02 = C3369dx.f2060;
                        obj = C3369dx.m2118(C3366du.m2110(th2));
                    }
                }
            };
        } else {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static final int m2594(Class<?> cls, int i) {
        Integer num;
        C3408fj.m2297(cls);
        try {
            C3369dx.C0158 r0 = C3369dx.f2060;
            num = C3369dx.m2118(Integer.valueOf(m2593$default(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            C3369dx.C0158 r02 = C3369dx.f2060;
            num = C3369dx.m2118(C3366du.m2110(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (C3369dx.m2113(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /* renamed from: ǃ$default  reason: contains not printable characters */
    static /* synthetic */ int m2593$default(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m2591(cls, i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int m2591(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r6.getDeclaredFields();
            fM.m2252((Object) declaredFields, "");
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (Field field : declaredFields) {
                fM.m2252((Object) field, "");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }
}
