package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u00020\u0005*\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000e\"\u0015\u0010\u0003\u001a\u00020\u00008\u0000@\u0000X\u0000¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0001\u001a\u0004\u0018\u00010\u0004*\u00020\u00058A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"", "ɩ", "Z", "Ι", "", "Lo/ex;", "ı", "(Lo/ex;)Ljava/lang/String;", "Lo/hq;", "ι", "()Lo/hq;", "p0", "Lo/hv;", "ǃ", "(Lo/hv;Lo/ex;)Lo/ex;"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.hu  reason: case insensitive filesystem */
public final class C3473hu {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final boolean f2295;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("") != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = o.C3511jf.m3075(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            f2295 = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3473hu.<clinit>():void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final C3469hq m2555() {
        return f2295 ? C3522jq.f2516 : C3460hh.f2285;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3396ex m2554(C3474hv hvVar, C3396ex exVar) {
        fM.m2254(hvVar, "");
        fM.m2254(exVar, "");
        C3396ex plus = hvVar.R_().plus(exVar);
        C3396ex plus2 = hA.m2426() ? plus.plus(new C3471hs(hA.m2424().incrementAndGet())) : plus;
        return (plus == hI.m2448() || plus.get(C3392et.f2133) != null) ? plus2 : plus2.plus(hI.m2448());
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public static final String m2553(C3396ex exVar) {
        C3471hs hsVar;
        String str;
        fM.m2254(exVar, "");
        if (!hA.m2426() || (hsVar = (C3471hs) exVar.get(C3471hs.f2292)) == null) {
            return null;
        }
        C3477hz hzVar = (C3477hz) exVar.get(C3477hz.If);
        if (hzVar == null || (str = hzVar.m2558()) == null) {
            str = "coroutine";
        }
        return str + '#' + hsVar.m2550();
    }
}
