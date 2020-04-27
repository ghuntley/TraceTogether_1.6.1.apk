package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface kH {
    /* renamed from: ı  reason: contains not printable characters */
    String m3239();

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean m3240() default false;
}
