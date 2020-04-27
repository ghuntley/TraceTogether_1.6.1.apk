package o;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ex;", "p0", "", "p1", "", "ǃ", "(Lo/ex;Ljava/lang/Throwable;)V", "ɩ", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.hr  reason: case insensitive filesystem */
public final class C3470hr {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static final void m2545(C3396ex exVar, Throwable th) {
        fM.m2254(exVar, "");
        fM.m2254(th, "");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) exVar.get(CoroutineExceptionHandler.f1018if);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(exVar, th);
            } else {
                C3472ht.m2552(exVar, th);
            }
        } catch (Throwable th2) {
            C3472ht.m2552(exVar, m2546(th, th2));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Throwable m2546(Throwable th, Throwable th2) {
        fM.m2254(th, "");
        fM.m2254(th2, "");
        if (th == th2) {
            return th;
        }
        Throwable runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C3354df.m2096(runtimeException, th);
        return runtimeException;
    }
}
