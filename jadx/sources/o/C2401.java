package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.вɪ  reason: contains not printable characters */
public @interface C2401 {
    /* renamed from: ı  reason: contains not printable characters */
    Class<?> m12424();

    /* renamed from: Ι  reason: contains not printable characters */
    boolean m12425() default true;
}
