package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.la  reason: case insensitive filesystem */
public @interface C3561la {
    /* renamed from: ɩ  reason: contains not printable characters */
    boolean m3551() default false;
}
