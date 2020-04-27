package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C3357dj;
import o.C3360dn;
import o.C3394ev;
import o.C3396ex;
import o.C3409fk;
import o.C3428gc;
import o.C3444gs;
import o.fM;
import o.fT;
import o.fV;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u00002\u00020\u00112\u00020\u00122\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u0005R\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00018B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Ljava/lang/reflect/Method;", "preHandler$delegate", "Lo/dj;", "getPreHandler", "()Ljava/lang/reflect/Method;", "preHandler", "Lo/ex;", "p0", "", "p1", "", "handleException", "(Lo/ex;Ljava/lang/Throwable;)V", "invoke", "<init>", "()V", "Lo/ev;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/Function0;"}, k = 1, mv = {1, 1, 15})
@Keep
public final class AndroidExceptionPreHandler extends C3394ev implements CoroutineExceptionHandler, C3409fk<Method> {
    static final /* synthetic */ C3444gs[] $$delegatedProperties = {C3428gc.m2386((fV) new fT(C3428gc.m2389(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;"))};
    private final C3357dj preHandler$delegate = C3360dn.m2106(this);

    private final Method getPreHandler() {
        C3357dj djVar = this.preHandler$delegate;
        C3444gs gsVar = $$delegatedProperties[0];
        return (Method) djVar.m2098();
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f1018if);
    }

    public final Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            fM.m2252((Object) declaredMethod, "");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void handleException(C3396ex exVar, Throwable th) {
        fM.m2254(exVar, "");
        fM.m2254(th, "");
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            fM.m2252((Object) currentThread, "");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object invoke = preHandler != null ? preHandler.invoke((Object) null, new Object[0]) : null;
        if (!(invoke instanceof Thread.UncaughtExceptionHandler)) {
            invoke = null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }
}
