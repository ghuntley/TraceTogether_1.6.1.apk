package o;

import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0010\u0018\u00002\u00020\n:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/eS;", "", "p0", "p1", "", "Ι", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "If", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
public class eS {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\bÂ\u0002\u0018\u00002\u00020\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/eS$If;", "Ljava/lang/reflect/Method;", "ǃ", "Ljava/lang/reflect/Method;", "ɩ", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    static final class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final Method f2094;

        /* renamed from: ι  reason: contains not printable characters */
        public static final If f2095 = new If();

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[EDGE_INSN: B:14:0x0045->B:11:0x0045 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0041 A[LOOP:0: B:1:0x0015->B:9:0x0041, LOOP_END] */
        static {
            /*
                o.eS$If r0 = new o.eS$If
                r0.<init>()
                f2095 = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = ""
                o.fM.m2252((java.lang.Object) r1, (java.lang.String) r2)
                int r3 = r1.length
                r4 = 0
                r5 = 0
            L_0x0015:
                if (r5 >= r3) goto L_0x0044
                r6 = r1[r5]
                o.fM.m2252((java.lang.Object) r6, (java.lang.String) r2)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = o.fM.m2257(r7, r8)
                if (r7 == 0) goto L_0x003d
                java.lang.Class[] r7 = r6.getParameterTypes()
                o.fM.m2252((java.lang.Object) r7, (java.lang.String) r2)
                java.lang.Object r7 = o.dM.m2067((T[]) r7)
                java.lang.Class r7 = (java.lang.Class) r7
                boolean r7 = o.fM.m2257(r7, r0)
                if (r7 == 0) goto L_0x003d
                r7 = 1
                goto L_0x003e
            L_0x003d:
                r7 = 0
            L_0x003e:
                if (r7 == 0) goto L_0x0041
                goto L_0x0045
            L_0x0041:
                int r5 = r5 + 1
                goto L_0x0015
            L_0x0044:
                r6 = 0
            L_0x0045:
                f2094 = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eS.If.<clinit>():void");
        }

        private If() {
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m2163(Throwable th, Throwable th2) {
        fM.m2254(th, "");
        fM.m2254(th2, "");
        Method method = If.f2094;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }
}
