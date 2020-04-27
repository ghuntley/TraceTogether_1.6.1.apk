package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.Іӏ  reason: contains not printable characters */
public abstract class C2319 {

    /* renamed from: o.Іӏ$ǃ  reason: contains not printable characters */
    public enum C2320 {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract Cif m12096();

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m12097(C2608 r1);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract void m12098(C2608 r1);

    public C2319() {
        new AtomicReference();
    }

    /* renamed from: o.Іӏ$if  reason: invalid class name */
    public enum Cif {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m12099(Cif ifVar) {
            return compareTo(ifVar) >= 0;
        }
    }
}
