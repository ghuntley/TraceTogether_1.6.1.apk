package o;

import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\bÂ\u0002\u0018\u00002\u00020\u000f:\u0001\fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0006\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003"}, d2 = {"Lo/eP;", "Lo/eP$If;", "Ι", "Lo/eP$If;", "ɩ", "ǃ", "ι", "Lo/eD;", "p0", "(Lo/eD;)Lo/eP$If;", "", "(Lo/eD;)Ljava/lang/String;", "If", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
final class eP {

    /* renamed from: ı  reason: contains not printable characters */
    public static final eP f2087 = new eP();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final If f2088 = new If((Method) null, (Method) null, (Method) null);

    /* renamed from: Ι  reason: contains not printable characters */
    public static If f2089;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\b\u0002\u0018\u00002\u00020\rB%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003"}, d2 = {"Lo/eP$If;", "Ljava/lang/reflect/Method;", "ǃ", "Ljava/lang/reflect/Method;", "ı", "Ι", "ι", "ɩ", "p0", "p1", "p2", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", ""}, k = 1, mv = {1, 1, 15})
    static final class If {

        /* renamed from: ı  reason: contains not printable characters */
        public final Method f2090;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Method f2091;

        /* renamed from: ι  reason: contains not printable characters */
        public final Method f2092;

        public If(Method method, Method method2, Method method3) {
            this.f2090 = method;
            this.f2091 = method2;
            this.f2092 = method3;
        }
    }

    private eP() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m2158(eD eDVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        fM.m2254(eDVar, "");
        If ifR = f2089;
        if (ifR == null) {
            ifR = m2157(eDVar);
        }
        if (ifR == f2088 || (method = ifR.f2090) == null || (invoke = method.invoke(eDVar.getClass(), new Object[0])) == null || (method2 = ifR.f2091) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = ifR.f2092;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (!(invoke3 instanceof String)) {
            invoke3 = null;
        }
        return (String) invoke3;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final If m2157(eD eDVar) {
        try {
            If ifR = new If(Class.class.getDeclaredMethod("getModule", new Class[0]), eDVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), eDVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f2089 = ifR;
            return ifR;
        } catch (Exception unused) {
            If ifR2 = f2088;
            f2089 = ifR2;
            return ifR2;
        }
    }
}
