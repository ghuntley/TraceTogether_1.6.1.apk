package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: o.լɈ  reason: contains not printable characters */
public class C3101<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    public C3101() {
        this.type = getSuperclassTypeParameter(getClass());
        this.rawType = C3068.m15656(this.type);
        this.hashCode = this.type.hashCode();
    }

    C3101(Type type2) {
        if (type2 != null) {
            this.type = C3068.m15661(type2);
            this.rawType = C3068.m15656(this.type);
            this.hashCode = this.type.hashCode();
            return;
        }
        throw new NullPointerException();
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C3068.m15661(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3101) && C3068.m15654(this.type, ((C3101) obj).type);
    }

    public final String toString() {
        return C3068.m15652(this.type);
    }

    public static C3101<?> get(Type type2) {
        return new C3101<>(type2);
    }

    public static <T> C3101<T> get(Class<T> cls) {
        return new C3101<>(cls);
    }
}
