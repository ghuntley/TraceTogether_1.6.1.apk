package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

/* renamed from: o.էı  reason: contains not printable characters */
public final class C3068 {

    /* renamed from: ɩ  reason: contains not printable characters */
    static final Type[] f14015 = new Type[0];

    /* JADX WARNING: type inference failed for: r0v8, types: [o.էı$ɩ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m15661(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            o.էı$ɩ r0 = new o.էı$ɩ
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m15661(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L_0x001d:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            o.էı$if r0 = new o.էı$if
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            o.էı$ɩ r0 = new o.էı$ɩ
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0045:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            o.էı$ǃ r0 = new o.էı$ǃ
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3068.m15661(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Class<?> m15656(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m15656(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
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
        }
        return (Class) type;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m15654(Type type, Type type2) {
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

    /* renamed from: ı  reason: contains not printable characters */
    static int m15651(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m15652(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class<? super ?>, for r5v0, types: [java.lang.Class<?>] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m15657(java.lang.reflect.Type r4, java.lang.Class<? super java.lang.Object> r5, java.lang.Class<?> r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: o.C3068.m15657(java.lang.reflect.Type, java.lang.Class, java.lang.Class):java.lang.reflect.Type");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Type m15663(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return m15658(type, cls, m15657(type, cls, cls2), new HashSet());
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Type m15655(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Type m15662(Type type, Class<?> cls) {
        Type r1 = m15663(type, cls, Collection.class);
        if (r1 instanceof WildcardType) {
            r1 = ((WildcardType) r1).getUpperBounds()[0];
        }
        if (r1 instanceof ParameterizedType) {
            return ((ParameterizedType) r1).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Type[] m15660(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type r4 = m15663(type, cls, Map.class);
        if (r4 instanceof ParameterizedType) {
            return ((ParameterizedType) r4).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Type m15653(Type type, Class<?> cls, Type type2) {
        return m15658(type, cls, type2, new HashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m15658(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 == 0) goto L_0x0049
            java.lang.reflect.Type r2 = m15657(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0049
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002d:
            if (r1 >= r3) goto L_0x0043
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0040
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004a
        L_0x0040:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0043:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x0049:
            r10 = r0
        L_0x004a:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004d:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006b
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006b
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m15658(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0065
            return r0
        L_0x0065:
            o.էı$ɩ r9 = new o.էı$ɩ
            r9.<init>(r8)
            return r9
        L_0x006b:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0082
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m15658(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007c
            return r10
        L_0x007c:
            o.էı$ɩ r9 = new o.էı$ɩ
            r9.<init>(r8)
            return r9
        L_0x0082:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c3
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m15658(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x009b:
            if (r1 >= r5) goto L_0x00b6
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m15658(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b3
            if (r0 != 0) goto L_0x00b1
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00b1:
            r4[r1] = r6
        L_0x00b3:
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00b6:
            if (r0 == 0) goto L_0x00c2
            java.lang.reflect.Type r8 = r10.getRawType()
            o.էı$if r9 = new o.էı$if
            r9.<init>(r3, r8, r4)
            return r9
        L_0x00c2:
            return r10
        L_0x00c3:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x011f
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fa
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m15658(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x011f
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e9
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ee
        L_0x00e9:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ee:
            o.էı$ǃ r9 = new o.էı$ǃ
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fa:
            int r0 = r3.length
            if (r0 != r2) goto L_0x011f
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m15658(r8, r9, r0, r11)     // Catch:{ all -> 0x0120 }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x011f
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0112
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0117
        L_0x0112:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0117:
            o.էı$ǃ r9 = new o.էı$ǃ
            java.lang.reflect.Type[] r10 = f14015
            r9.<init>(r8, r10)
            return r9
        L_0x011f:
            return r10
        L_0x0120:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3068.m15658(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m15659(Type type) {
        if (!(!(type instanceof Class) || !((Class) type).isPrimitive())) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: o.էı$if  reason: invalid class name */
    static final class Cif implements ParameterizedType, Serializable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Type[] f14016;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Type f14017;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Type f14018;

        public Cif(Type type, Type type2, Type... typeArr) {
            int i = 0;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException();
                }
            }
            this.f14018 = type == null ? null : C3068.m15661(type);
            this.f14017 = C3068.m15661(type2);
            this.f14016 = (Type[]) typeArr.clone();
            int length = this.f14016.length;
            while (i < length) {
                Type[] typeArr2 = this.f14016;
                if (typeArr2[i] != null) {
                    C3068.m15659(typeArr2[i]);
                    Type[] typeArr3 = this.f14016;
                    typeArr3[i] = C3068.m15661(typeArr3[i]);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f14016.clone();
        }

        public final Type getRawType() {
            return this.f14017;
        }

        public final Type getOwnerType() {
            return this.f14018;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C3068.m15654(this, (ParameterizedType) obj);
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f14016) ^ this.f14017.hashCode()) ^ C3068.m15651((Object) this.f14018);
        }

        public final String toString() {
            int length = this.f14016.length;
            if (length == 0) {
                return C3068.m15652(this.f14017);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C3068.m15652(this.f14017));
            sb.append("<");
            sb.append(C3068.m15652(this.f14016[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C3068.m15652(this.f14016[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: o.էı$ɩ  reason: contains not printable characters */
    static final class C3070 implements GenericArrayType, Serializable {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Type f14021;

        public C3070(Type type) {
            this.f14021 = C3068.m15661(type);
        }

        public final Type getGenericComponentType() {
            return this.f14021;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C3068.m15654(this, (GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.f14021.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C3068.m15652(this.f14021));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: o.էı$ǃ  reason: contains not printable characters */
    static final class C3069 implements WildcardType, Serializable {

        /* renamed from: ı  reason: contains not printable characters */
        private final Type f14019;

        /* renamed from: ι  reason: contains not printable characters */
        private final Type f14020;

        public C3069(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            if (typeArr2.length <= 1) {
                if (!(typeArr.length == 1)) {
                    throw new IllegalArgumentException();
                } else if (typeArr2.length == 1) {
                    if (typeArr2[0] != null) {
                        C3068.m15659(typeArr2[0]);
                        if (typeArr[0] != Object.class ? false : z) {
                            this.f14020 = C3068.m15661(typeArr2[0]);
                            this.f14019 = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new NullPointerException();
                } else if (typeArr[0] != null) {
                    C3068.m15659(typeArr[0]);
                    this.f14020 = null;
                    this.f14019 = C3068.m15661(typeArr[0]);
                } else {
                    throw new NullPointerException();
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f14019};
        }

        public final Type[] getLowerBounds() {
            Type type = this.f14020;
            if (type == null) {
                return C3068.f14015;
            }
            return new Type[]{type};
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C3068.m15654(this, (WildcardType) obj);
        }

        public final int hashCode() {
            Type type = this.f14020;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f14019.hashCode() + 31);
        }

        public final String toString() {
            if (this.f14020 != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C3068.m15652(this.f14020));
                return sb.toString();
            } else if (this.f14019 == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C3068.m15652(this.f14019));
                return sb2.toString();
            }
        }
    }
}
