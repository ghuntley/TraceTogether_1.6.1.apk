package o;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0001\u0010\f\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r"}, d2 = {"Ljava/lang/reflect/Method;", "ι", "Ljava/lang/reflect/Method;", "ɩ", "", "p0", "", "E", "ǃ", "(I)Ljava/util/Set;", "Ljava/util/concurrent/Executor;", "", "(Ljava/util/concurrent/Executor;)Z", "Ljava/util/concurrent/locks/ReentrantLock;", "ı"}, k = 2, mv = {1, 1, 15})
public final class iO {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Method f2336;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <E> Set<E> m2612(int i) {
        Set<E> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i));
        fM.m2252((Object) newSetFromMap, "");
        return newSetFromMap;
    }

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f2336 = method;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final boolean m2613(Executor executor) {
        Method method;
        fM.m2254(executor, "");
        try {
            if (!(executor instanceof ScheduledExecutorService)) {
                executor = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) executor;
            if (scheduledExecutorService == null || (method = f2336) == null) {
                return false;
            }
            method.invoke(scheduledExecutorService, new Object[]{true});
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
