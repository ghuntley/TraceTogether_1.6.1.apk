package o;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0010 \u00002\u00060\u0018j\u0002`\u0019B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0007\u0010\u000fJ\u001f\u0010\r\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\r\u0010\u0011J#\u0010\u0007\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0007\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\u0005\u0010\u0015R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018!@ X \u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/hJ;", "Lo/er;", "Ι", "()Lo/er;", "", "ɩ", "I", "ı", "", "p0", "", "p1", "", "ǃ", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "run", "()V", "()Ljava/lang/Object;", "<init>", "(I)V", "Lo/jx;", "Lo/ı;"}, k = 1, mv = {1, 1, 15})
public abstract class hJ<T> extends C3528jx {

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f2264;

    /* renamed from: ǃ  reason: contains not printable characters */
    public <T> T m2452(Object obj) {
        return obj;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m2453(Object obj, Throwable th) {
        fM.m2254(th, "");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract Object m2454();

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract C3390er<T> m2455();

    public hJ(int i) {
        this.f2264 = i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Throwable m2450(Object obj) {
        if (!(obj instanceof C3463hk)) {
            obj = null;
        }
        C3463hk hkVar = (C3463hk) obj;
        if (hkVar != null) {
            return hkVar.f2291;
        }
        return null;
    }

    public final void run() {
        Object obj;
        C3396ex r5;
        Object r3;
        Object obj2;
        C3529jy jyVar = this.f2531;
        C3483id idVar = null;
        Throwable th = null;
        try {
            C3390er r32 = m2455();
            if (r32 != null) {
                hE hEVar = (hE) r32;
                C3390er<T> erVar = hEVar.f2254;
                r5 = erVar.m2213();
                Object r6 = m2454();
                r3 = C3513jh.m3079(r5, hEVar.f2253);
                Throwable r7 = m2450(r6);
                if (C3494ip.m2792(this.f2264)) {
                    idVar = (C3483id) r5.get(C3483id.f2366);
                }
                if (r7 == null && idVar != null && !idVar.m2670()) {
                    CancellationException r1 = idVar.m2671();
                    m2453(r6, r1);
                    C3369dx.C0158 r62 = C3369dx.f2060;
                    erVar.m2214(C3369dx.m2118(C3366du.m2110(C3507jb.m3057(r1, (C3390er<?>) erVar))));
                } else if (r7 != null) {
                    C3369dx.C0158 r12 = C3369dx.f2060;
                    erVar.m2214(C3369dx.m2118(C3366du.m2110(C3507jb.m3057(r7, (C3390er<?>) erVar))));
                } else {
                    Object r13 = m2452(r6);
                    C3369dx.C0158 r63 = C3369dx.f2060;
                    erVar.m2214(C3369dx.m2118(r13));
                }
                dF dFVar = dF.f2032;
                C3513jh.m3081(r5, r3);
                try {
                    C3369dx.C0158 r14 = C3369dx.f2060;
                    hJ hJVar = this;
                    jyVar.m3191();
                    obj2 = C3369dx.m2118(dF.f2032);
                } catch (Throwable th2) {
                    C3369dx.C0158 r15 = C3369dx.f2060;
                    obj2 = C3369dx.m2118(C3366du.m2110(th2));
                }
                m2451(th, C3369dx.m2117(obj2));
                return;
            }
            throw new dA("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th3) {
            try {
                C3369dx.C0158 r2 = C3369dx.f2060;
                hJ hJVar2 = this;
                jyVar.m3191();
                obj = C3369dx.m2118(dF.f2032);
            } catch (Throwable th4) {
                C3369dx.C0158 r22 = C3369dx.f2060;
                obj = C3369dx.m2118(C3366du.m2110(th4));
            }
            m2451(th3, C3369dx.m2117(obj));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m2451(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C3354df.m2096(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th == null) {
                fM.m2256();
            }
            C3470hr.m2545(m2455().m2213(), new C3476hx(str, th));
        }
    }
}
