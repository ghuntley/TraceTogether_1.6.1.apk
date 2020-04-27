package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import o.C2319;
import o.C2456;
import o.C2523;
import o.C2751;
import o.C2851;
import o.C2915;

public abstract class LiveData<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Object f233 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    volatile Object f234 = f233;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C2751<C2915<? super T>, LiveData<T>.ı> f235 = new C2751<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    public volatile Object f236 = f233;

    /* renamed from: ɹ  reason: contains not printable characters */
    private int f237 = -1;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f238 = 0;

    /* renamed from: ι  reason: contains not printable characters */
    final Object f239 = new Object();

    /* renamed from: І  reason: contains not printable characters */
    private boolean f240;

    /* renamed from: і  reason: contains not printable characters */
    private final Runnable f241 = new Runnable() {
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f239) {
                obj = LiveData.this.f234;
                LiveData.this.f234 = LiveData.f233;
            }
            LiveData.this.m199(obj);
        }
    };

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f242;

    /* renamed from: ı  reason: contains not printable characters */
    public void m191() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m193() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m190(LiveData<T>.ı r3) {
        if (r3.f248) {
            if (!r3.m205()) {
                r3.m204(false);
                return;
            }
            int i = r3.f247;
            int i2 = this.f237;
            if (i < i2) {
                r3.f247 = i2;
                r3.f246.m15074(this.f236);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m198(LiveData<T>.ı r5) {
        if (this.f240) {
            this.f242 = true;
            return;
        }
        this.f240 = true;
        do {
            this.f242 = false;
            if (r5 == null) {
                C2751<C2915<? super T>, LiveData<T>.ı> r1 = this.f235;
                C2751.C2754 r2 = new C2751.C2754();
                r1.f13053.put(r2, Boolean.FALSE);
                while (r2.hasNext()) {
                    m190((C0019) ((Map.Entry) r2.next()).getValue());
                    if (this.f242) {
                        break;
                    }
                }
            } else {
                m190(r5);
                r5 = null;
            }
        } while (this.f242);
        this.f240 = false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m196(C2851 r3, C2915<? super T> r4) {
        m189("observe");
        if (r3.getLifecycle().m12096() != C2319.Cif.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(r3, r4);
            C0019 r42 = this.f235.m14578(r4, lifecycleBoundObserver);
            if (r42 != null && !r42.m207(r3)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (r42 == null) {
                r3.getLifecycle().m12098(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m194(C2915<? super T> r2) {
        m189("removeObserver");
        C0019 r22 = this.f235.m14580(r2);
        if (r22 != null) {
            r22.m206();
            r22.m204(false);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m192(C2851 r4) {
        m189("removeObservers");
        Iterator<Map.Entry<C2915<? super T>, LiveData<T>.ı>> it = this.f235.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((C0019) next.getValue()).m207(r4)) {
                m194((C2915) next.getKey());
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m195(T t) {
        boolean z;
        synchronized (this.f239) {
            z = this.f234 == f233;
            this.f234 = t;
        }
        if (z) {
            C2523.m13404().f11452.m13693(this.f241);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m199(T t) {
        m189("setValue");
        this.f237++;
        this.f236 = t;
        m198((LiveData<T>.ı) null);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final T m197() {
        T t = this.f236;
        if (t != f233) {
            return t;
        }
        return null;
    }

    class LifecycleBoundObserver extends LiveData<T>.ı implements C2456 {

        /* renamed from: ı  reason: contains not printable characters */
        final C2851 f244;

        LifecycleBoundObserver(C2851 r2, C2915<? super T> r3) {
            super(r3);
            this.f244 = r2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m201() {
            return this.f244.getLifecycle().m12096().compareTo(C2319.Cif.STARTED) >= 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m200(C2851 r1, C2319.C2320 r2) {
            if (this.f244.getLifecycle().m12096() == C2319.Cif.DESTROYED) {
                LiveData.this.m194(this.f246);
            } else {
                m204(this.f244.getLifecycle().m12096().compareTo(C2319.Cif.STARTED) >= 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m203(C2851 r2) {
            return this.f244 == r2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m202() {
            this.f244.getLifecycle().m12097(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$ı  reason: contains not printable characters */
    abstract class C0019 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final C2915<? super T> f246;

        /* renamed from: Ι  reason: contains not printable characters */
        int f247 = -1;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f248;

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract boolean m205();

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public void m206() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m207(C2851 r1) {
            return false;
        }

        C0019(C2915<? super T> r2) {
            this.f246 = r2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m204(boolean z) {
            if (z != this.f248) {
                this.f248 = z;
                int i = 1;
                boolean z2 = LiveData.this.f238 == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f238;
                if (!this.f248) {
                    i = -1;
                }
                liveData.f238 = i2 + i;
                if (z2 && this.f248) {
                    LiveData.this.m193();
                }
                if (LiveData.this.f238 == 0 && !this.f248) {
                    LiveData.this.m191();
                }
                if (this.f248) {
                    LiveData.this.m198((LiveData<T>.ı) this);
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m189(String str) {
        if (!C2523.m13404().f11452.m13692()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
