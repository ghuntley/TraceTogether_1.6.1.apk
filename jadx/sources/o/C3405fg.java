package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0016\u0018\u00002\u00020\u0003B\u0007¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/fg;", "<init>", "()V", "Ljava/lang/Error;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.fg  reason: case insensitive filesystem */
public class C3405fg extends Error {
    public C3405fg() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
