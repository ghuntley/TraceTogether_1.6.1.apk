package o;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class aS<V> extends FutureTask<V> implements aJ<aW>, aO, aW {

    /* renamed from: Ι  reason: contains not printable characters */
    private Object f1475;

    /* renamed from: ı  reason: contains not printable characters */
    public /* synthetic */ void m1533(Object obj) {
        ((aJ) ((aO) m1539())).m1498((aW) obj);
    }

    public aS(Callable<V> callable) {
        super(callable);
        Object obj;
        if (aQ.m1522(callable)) {
            obj = (aJ) callable;
        } else {
            obj = new aQ();
        }
        this.f1475 = obj;
    }

    public aS(Runnable runnable, V v) {
        super(runnable, v);
        Object obj;
        if (aQ.m1522(runnable)) {
            obj = (aJ) runnable;
        } else {
            obj = new aQ();
        }
        this.f1475 = obj;
    }

    public int compareTo(Object obj) {
        return ((aO) m1539()).compareTo(obj);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public Collection<aW> m1535() {
        return ((aJ) ((aO) m1539())).m1499();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m1538() {
        return ((aJ) ((aO) m1539())).m1500();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public aL m1532() {
        return ((aO) m1539()).m1520();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1537(boolean z) {
        ((aW) ((aO) m1539())).m1546(z);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public boolean m1534() {
        return ((aW) ((aO) m1539())).m1544();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1536(Throwable th) {
        ((aW) ((aO) m1539())).m1545(th);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public <T extends aJ<aW> & aO & aW> T m1539() {
        return (aJ) this.f1475;
    }
}
