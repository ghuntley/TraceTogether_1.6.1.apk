package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import okhttp3.ResponseBody;

public final class kC {

    /* renamed from: ι  reason: contains not printable characters */
    static final Type[] f2557 = new Type[0];

    /* renamed from: ι  reason: contains not printable characters */
    static Class<?> m3216(Type type) {
        while (type != null) {
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m3216(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(type.getClass().getName());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        throw new NullPointerException("type == null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m3210(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if (!(ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return false;
                }
                return true;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    return false;
                }
                return true;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class<? super ?>, for r5v0, types: [java.lang.Class<?>] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m3217(java.lang.reflect.Type r4, java.lang.Class<? super java.lang.Object> r5, java.lang.Class<?> r6) {
        /*
        L_0x0000:
            if (r6 != r5) goto L_0x0003
            return r4
        L_0x0003:
            boolean r4 = r6.isInterface()
            if (r4 == 0) goto L_0x0030
            java.lang.Class[] r4 = r5.getInterfaces()
            r0 = 0
            int r1 = r4.length
        L_0x000f:
            if (r0 >= r1) goto L_0x0030
            r2 = r4[r0]
            if (r2 != r6) goto L_0x001c
            java.lang.reflect.Type[] r4 = r5.getGenericInterfaces()
            r4 = r4[r0]
            return r4
        L_0x001c:
            r2 = r4[r0]
            boolean r2 = r6.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x002d
            java.lang.reflect.Type[] r5 = r5.getGenericInterfaces()
            r5 = r5[r0]
            r4 = r4[r0]
            goto L_0x004f
        L_0x002d:
            int r0 = r0 + 1
            goto L_0x000f
        L_0x0030:
            boolean r4 = r5.isInterface()
            if (r4 != 0) goto L_0x0055
        L_0x0036:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r5 == r4) goto L_0x0055
            java.lang.Class r4 = r5.getSuperclass()
            if (r4 != r6) goto L_0x0045
            java.lang.reflect.Type r4 = r5.getGenericSuperclass()
            return r4
        L_0x0045:
            boolean r0 = r6.isAssignableFrom(r4)
            if (r0 == 0) goto L_0x0053
            java.lang.reflect.Type r5 = r5.getGenericSuperclass()
        L_0x004f:
            r3 = r5
            r5 = r4
            r4 = r3
            goto L_0x0000
        L_0x0053:
            r5 = r4
            goto L_0x0036
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kC.m3217(java.lang.reflect.Type, java.lang.Class, java.lang.Class):java.lang.reflect.Type");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m3203(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static String m3213(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    static Type m3204(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m3208(type, cls, m3217(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[LOOP:0: B:0:0x0000->B:21:0x0042, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0041 A[SYNTHETIC] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m3208(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x003e
            java.lang.reflect.Type r2 = m3217(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003e
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0021:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0038
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x003f
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0038:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003e:
            r0 = r10
        L_0x003f:
            if (r0 != r10) goto L_0x0042
            return r0
        L_0x0042:
            r10 = r0
            goto L_0x0000
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0062
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0062
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m3208(r8, r9, r10)
            if (r10 != r8) goto L_0x005c
            return r0
        L_0x005c:
            o.kC$If r9 = new o.kC$If
            r9.<init>(r8)
            return r9
        L_0x0062:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0079
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m3208(r8, r9, r0)
            if (r0 != r8) goto L_0x0073
            return r10
        L_0x0073:
            o.kC$If r9 = new o.kC$If
            r9.<init>(r8)
            return r9
        L_0x0079:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00ba
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m3208(r8, r9, r0)
            if (r3 == r0) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0092:
            if (r1 >= r5) goto L_0x00ad
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m3208(r8, r9, r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00aa
            if (r0 != 0) goto L_0x00a8
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00a8:
            r4[r1] = r6
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x0092
        L_0x00ad:
            if (r0 == 0) goto L_0x00b9
            o.kC$ɩ r8 = new o.kC$ɩ
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            return r8
        L_0x00b9:
            return r10
        L_0x00ba:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00fe
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e5
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m3208(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x00fe
            o.kC$ı r9 = new o.kC$ı
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e5:
            int r0 = r3.length
            if (r0 != r2) goto L_0x00fe
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m3208(r8, r9, r0)     // Catch:{ all -> 0x00ff }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x00fe
            o.kC$ı r9 = new o.kC$ı
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = f2557
            r9.<init>(r10, r8)
            return r9
        L_0x00fe:
            return r10
        L_0x00ff:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kC.m3208(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m3209(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <T> T m3212(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m3211(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static ResponseBody m3205(ResponseBody responseBody) {
        jH jHVar = new jH();
        responseBody.source().m2907(jHVar);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), jHVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static <T> void m3206(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static Type m3214(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new IllegalArgumentException(sb.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static boolean m3207(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type r4 : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (m3207(r4)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                if (type == null) {
                    str = "null";
                } else {
                    str = type.getClass().getName();
                }
                StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static Type m3215(Type type) {
        if (type instanceof ParameterizedType) {
            return m3214(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: o.kC$ɩ  reason: contains not printable characters */
    static final class C0195 implements ParameterizedType {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Type f2561;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Type[] f2562;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Type f2563;

        C0195(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                kC.m3212(type3, "typeArgument == null");
                kC.m3209(type3);
            }
            this.f2561 = type;
            this.f2563 = type2;
            this.f2562 = (Type[]) typeArr.clone();
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f2562.clone();
        }

        public final Type getRawType() {
            return this.f2563;
        }

        public final Type getOwnerType() {
            return this.f2561;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && kC.m3210((Type) this, (Type) (ParameterizedType) obj);
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f2562) ^ this.f2563.hashCode()) ^ kC.m3203((Object) this.f2561);
        }

        public final String toString() {
            Type[] typeArr = this.f2562;
            if (typeArr.length == 0) {
                return kC.m3213(this.f2563);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(kC.m3213(this.f2563));
            sb.append("<");
            sb.append(kC.m3213(this.f2562[0]));
            for (int i = 1; i < this.f2562.length; i++) {
                sb.append(", ");
                sb.append(kC.m3213(this.f2562[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    static final class If implements GenericArrayType {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Type f2558;

        If(Type type) {
            this.f2558 = type;
        }

        public final Type getGenericComponentType() {
            return this.f2558;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && kC.m3210((Type) this, (Type) (GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.f2558.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(kC.m3213(this.f2558));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: o.kC$ı  reason: contains not printable characters */
    static final class C0194 implements WildcardType {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Type f2559;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Type f2560;

        C0194(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    kC.m3209(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f2559 = typeArr2[0];
                        this.f2560 = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                kC.m3209(typeArr[0]);
                this.f2559 = null;
                this.f2560 = typeArr[0];
            } else {
                throw new NullPointerException();
            }
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f2560};
        }

        public final Type[] getLowerBounds() {
            Type type = this.f2559;
            if (type == null) {
                return kC.f2557;
            }
            return new Type[]{type};
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && kC.m3210((Type) this, (Type) (WildcardType) obj);
        }

        public final int hashCode() {
            Type type = this.f2559;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2560.hashCode() + 31);
        }

        public final String toString() {
            if (this.f2559 != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(kC.m3213(this.f2559));
                return sb.toString();
            } else if (this.f2560 == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(kC.m3213(this.f2560));
                return sb2.toString();
            }
        }
    }
}
