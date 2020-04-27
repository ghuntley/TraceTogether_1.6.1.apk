package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.lb  reason: case insensitive filesystem */
public @interface C3562lb {
    /* renamed from: ı  reason: contains not printable characters */
    String m3552();

    /* renamed from: ǃ  reason: contains not printable characters */
    boolean m3553() default false;
}
