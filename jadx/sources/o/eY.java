package o;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "", "Ljava/io/Closeable;", "ɩ", "(Ljava/io/Closeable;Ljava/lang/Throwable;)V"}, k = 2, mv = {1, 1, 15})
public final class eY {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final void m2182(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C3354df.m2096(th, th2);
            }
        }
    }
}
