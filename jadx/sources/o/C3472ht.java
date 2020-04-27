package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "ɩ", "Ljava/util/List;", "Lo/ex;", "p0", "", "p1", "", "ǃ", "(Lo/ex;Ljava/lang/Throwable;)V"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.ht  reason: case insensitive filesystem */
public final class C3472ht {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final List<CoroutineExceptionHandler> f2294;

    static {
        Iterator<S> it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        fM.m2252((Object) it, "");
        f2294 = C3450gy.m2319(C3450gy.m2307(it));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final void m2552(C3396ex exVar, Throwable th) {
        fM.m2254(exVar, "");
        fM.m2254(th, "");
        for (CoroutineExceptionHandler handleException : f2294) {
            try {
                handleException.handleException(exVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                fM.m2252((Object) currentThread, "");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C3470hr.m2546(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        fM.m2252((Object) currentThread2, "");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
