package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class aQ implements aJ<aW>, aO, aW {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final AtomicBoolean f1472 = new AtomicBoolean(false);

    /* renamed from: Ι  reason: contains not printable characters */
    private final List<aW> f1473 = new ArrayList();

    /* renamed from: ι  reason: contains not printable characters */
    private final AtomicReference<Throwable> f1474 = new AtomicReference<>((Object) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    public synchronized Collection<aW> m1527() {
        return Collections.unmodifiableCollection(this.f1473);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public synchronized void m1524(aW aWVar) {
        this.f1473.add(aWVar);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m1531() {
        for (aW r1 : m1527()) {
            if (!r1.m1544()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public synchronized void m1530(boolean z) {
        this.f1472.set(z);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public boolean m1526() {
        return this.f1472.get();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public aL m1523() {
        return aL.NORMAL;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1529(Throwable th) {
        this.f1474.set(th);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Throwable m1528() {
        return this.f1474.get();
    }

    public int compareTo(Object obj) {
        return aL.m1502(this, obj);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m1522(Object obj) {
        try {
            aJ aJVar = (aJ) obj;
            aW aWVar = (aW) obj;
            aO aOVar = (aO) obj;
            if (aJVar == null || aWVar == null || aOVar == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
        }
    }
}
