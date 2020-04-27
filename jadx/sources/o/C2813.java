package o;

import android.os.IBinder;
import java.lang.reflect.Field;
import o.C2722;

/* renamed from: o.ӀΓ  reason: contains not printable characters */
public final class C2813<T> extends C2722.If {

    /* renamed from: ı  reason: contains not printable characters */
    private final T f13229;

    public C2813(T t) {
        this.f13229 = t;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> C2722 m14730(T t) {
        return new C2813(t);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <T> T m14731(C2722 r7) {
        if (r7 instanceof C2813) {
            return ((C2813) r7).f13229;
        }
        IBinder asBinder = r7.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
