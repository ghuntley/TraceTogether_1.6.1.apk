package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface kL {
    /* renamed from: ǃ  reason: contains not printable characters */
    String m3243();

    /* renamed from: Ι  reason: contains not printable characters */
    boolean m3244() default false;

    /* renamed from: ι  reason: contains not printable characters */
    String m3245() default "";
}
