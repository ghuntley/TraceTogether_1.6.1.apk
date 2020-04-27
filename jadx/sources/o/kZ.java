package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface kZ {
    /* renamed from: ɩ  reason: contains not printable characters */
    String m3256() default "";

    /* renamed from: ι  reason: contains not printable characters */
    String m3257() default "binary";
}
