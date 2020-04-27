package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.cs  reason: case insensitive filesystem */
public enum C3340cs implements C3326cg {
    ;

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2022() {
    }

    private C3340cs(String str) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m2019(C3326cg cgVar) {
        return cgVar == f2008;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m2020(AtomicReference<C3326cg> atomicReference, C3326cg cgVar) {
        if (cgVar == null) {
            throw new NullPointerException("d is null");
        } else if (atomicReference.compareAndSet((Object) null, cgVar)) {
            return true;
        } else {
            cgVar.m1959();
            if (atomicReference.get() == f2008) {
                return false;
            }
            cX.m1936(new C3332cm("Disposable already set!"));
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m2018(AtomicReference<C3326cg> atomicReference) {
        C3326cg andSet;
        C3326cg cgVar = atomicReference.get();
        C3340cs csVar = f2008;
        if (cgVar == csVar || (andSet = atomicReference.getAndSet(csVar)) == csVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.m1959();
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m2021(C3326cg cgVar, C3326cg cgVar2) {
        if (cgVar2 == null) {
            cX.m1936(new NullPointerException("next is null"));
            return false;
        } else if (cgVar == null) {
            return true;
        } else {
            cgVar2.m1959();
            cX.m1936(new C3332cm("Disposable already set!"));
            return false;
        }
    }
}
