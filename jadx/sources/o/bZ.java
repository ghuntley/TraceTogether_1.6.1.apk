package o;

import o.C0712;

public abstract class bZ<T> implements C3324ce<T> {
    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m1739(C3322cc<? super T> ccVar);

    /* renamed from: Ι  reason: contains not printable characters */
    public static <T> bZ<T> m1737(C3323cd<T> cdVar) {
        if (cdVar != null) {
            return new cH(cdVar);
        }
        throw new NullPointerException("source is null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <T1, T2, R> bZ<R> m1736(C3324ce<? extends T1> ceVar, C3324ce<? extends T2> ceVar2, C3339cr<? super T1, ? super T2, ? extends R> crVar) {
        if (ceVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (ceVar2 != null) {
            C3341ct<Object[], ? extends R> r5 = C3347cz.m2045(crVar);
            int r0 = bY.m1735();
            C3324ce[] ceVarArr = {ceVar, ceVar2};
            C3344cw.m2029(r0, "bufferSize");
            return new cG(ceVarArr, r5, r0);
        } else {
            throw new NullPointerException("source2 is null");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3326cg m1741(C3338cq<? super T> cqVar) {
        C3338cq<Throwable> cqVar2 = C3347cz.f2017;
        C0712.C0713 r1 = C3347cz.f2019;
        C3338cq r2 = C3347cz.m2044();
        if (cqVar2 == null) {
            throw new NullPointerException("onError is null");
        } else if (r1 == null) {
            throw new NullPointerException("onComplete is null");
        } else if (r2 != null) {
            cE cEVar = new cE(cqVar, cqVar2, r2);
            m1742(cEVar);
            return cEVar;
        } else {
            throw new NullPointerException("onSubscribe is null");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1742(C3322cc<? super T> ccVar) {
        if (ccVar != null) {
            try {
                m1739(ccVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C2745.m14522(th);
                cX.m1936(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final bZ<T> m1738(C3321cb cbVar) {
        if (cbVar != null) {
            return new cI(this, cbVar);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final bZ<T> m1740(C3321cb cbVar) {
        int r0 = bY.m1735();
        if (cbVar != null) {
            C3344cw.m2029(r0, "bufferSize");
            return new cF(this, cbVar, r0);
        }
        throw new NullPointerException("scheduler is null");
    }
}
