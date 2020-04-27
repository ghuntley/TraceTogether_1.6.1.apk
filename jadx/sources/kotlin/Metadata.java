package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u001b\b\u0002\u0018\u00002\u00020!B\\\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0001\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\fR\u0013\u0010\u0004\u001a\u00020\u00018\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0013\u0010\u000f\u001a\u00020\f8\u0006@\u0007¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0012\u001a\u00020\u00068\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u00020\f8\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0016\u001a\u00020\u00018\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0003R\u0013\u0010\u0018\u001a\u00020\u00068\u0006@\u0007¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011"}, d2 = {"Lkotlin/Metadata;", "", "bv", "()[I", "bytecodeVersion", "", "", "d1", "()[Ljava/lang/String;", "data1", "d2", "data2", "", "xi", "()I", "extraInt", "xs", "()Ljava/lang/String;", "extraString", "k", "kind", "mv", "metadataVersion", "pn", "packageName", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", ""}, k = 1, mv = {1, 1, 15})
@Retention(RetentionPolicy.RUNTIME)
public @interface Metadata {
    int[] bv() default {};

    String[] d1() default {};

    String[] d2() default {};

    int k() default 1;

    int[] mv() default {};

    String pn() default "";

    int xi() default 0;

    String xs() default "";
}
