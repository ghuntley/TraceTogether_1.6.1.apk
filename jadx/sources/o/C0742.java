package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ƚΙ  reason: contains not printable characters */
public abstract class C0742<K, A> {

    /* renamed from: ı  reason: contains not printable characters */
    private final If<K> f5000;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private float f5001 = -1.0f;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<C0744> f5002 = new ArrayList(1);

    /* renamed from: ɩ  reason: contains not printable characters */
    protected float f5003 = 0.0f;

    /* renamed from: ɹ  reason: contains not printable characters */
    private float f5004 = -1.0f;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f5005 = false;

    /* renamed from: ι  reason: contains not printable characters */
    protected C2476<A> f5006;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private A f5007 = null;

    /* renamed from: o.ƚΙ$If */
    interface If<T> {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m5939(float f);

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean m5940();

        /* renamed from: ɩ  reason: contains not printable characters */
        float m5941();

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean m5942(float f);

        /* renamed from: Ι  reason: contains not printable characters */
        C2463<T> m5943();

        /* renamed from: ι  reason: contains not printable characters */
        float m5944();
    }

    /* renamed from: o.ƚΙ$ǃ  reason: contains not printable characters */
    public interface C0744 {
        /* renamed from: ı  reason: contains not printable characters */
        void m5958();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract A m5930(C2463<K> r1, float f);

    C0742(List<? extends C2463<K>> list) {
        If<K> ifR;
        if (list.isEmpty()) {
            ifR = new Cif<>((byte) 0);
        } else if (list.size() == 1) {
            ifR = new C0745<>(list);
        } else {
            ifR = new C0743<>(list);
        }
        this.f5000 = ifR;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5934(float f) {
        if (!this.f5000.m5940()) {
            if (this.f5004 == -1.0f) {
                this.f5004 = this.f5000.m5944();
            }
            float f2 = this.f5004;
            if (f < f2) {
                if (f2 == -1.0f) {
                    this.f5004 = this.f5000.m5944();
                }
                f = this.f5004;
            } else if (f > m5936()) {
                f = m5936();
            }
            if (f != this.f5003) {
                this.f5003 = f;
                if (this.f5000.m5942(f)) {
                    m5931();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m5931() {
        for (int i = 0; i < this.f5002.size(); i++) {
            this.f5002.get(i).m5958();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final C2463<K> m5935() {
        C2921.m15081();
        C2463<K> r0 = this.f5000.m5943();
        C2921.m15080();
        return r0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final float m5933() {
        if (this.f5005) {
            return 0.0f;
        }
        C2921.m15081();
        C2463<K> r0 = this.f5000.m5943();
        C2921.m15080();
        if (r0.f11219 == null) {
            return 0.0f;
        }
        return (this.f5003 - r0.m12705()) / (r0.m12704() - r0.m12705());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public float m5936() {
        if (this.f5001 == -1.0f) {
            this.f5001 = this.f5000.m5941();
        }
        return this.f5001;
    }

    /* renamed from: і  reason: contains not printable characters */
    public A m5937() {
        float r0 = m5929();
        if (this.f5006 == null && this.f5000.m5939(r0)) {
            return this.f5007;
        }
        C2921.m15081();
        C2463<K> r1 = this.f5000.m5943();
        C2921.m15080();
        A r02 = m5930(r1, r0);
        this.f5007 = r02;
        return r02;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final float m5938() {
        return this.f5003;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5932(C2476<A> r1) {
        this.f5006 = r1;
    }

    /* renamed from: o.ƚΙ$if  reason: invalid class name */
    static final class Cif<T> implements If<T> {
        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m5946() {
            return true;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final float m5947() {
            return 1.0f;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m5948(float f) {
            return false;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final float m5950() {
            return 0.0f;
        }

        private Cif() {
        }

        /* synthetic */ Cif(byte b) {
            this();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2463<T> m5949() {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m5945(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* renamed from: o.ƚΙ$ɩ  reason: contains not printable characters */
    static final class C0745<T> implements If<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C2463<T> f5012;

        /* renamed from: ɩ  reason: contains not printable characters */
        private float f5013 = -1.0f;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m5960() {
            return false;
        }

        C0745(List<? extends C2463<T>> list) {
            this.f5012 = (C2463) list.get(0);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m5962(float f) {
            return !(this.f5012.f11219 == null);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2463<T> m5963() {
            return this.f5012;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final float m5964() {
            return this.f5012.m12705();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final float m5961() {
            return this.f5012.m12704();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m5959(float f) {
            if (this.f5013 == f) {
                return true;
            }
            this.f5013 = f;
            return false;
        }
    }

    /* renamed from: o.ƚΙ$ı  reason: contains not printable characters */
    static final class C0743<T> implements If<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private C2463<T> f5008 = null;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final List<? extends C2463<T>> f5009;

        /* renamed from: ɩ  reason: contains not printable characters */
        private float f5010 = -1.0f;

        /* renamed from: ι  reason: contains not printable characters */
        private C2463<T> f5011;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m5953() {
            return false;
        }

        C0743(List<? extends C2463<T>> list) {
            this.f5009 = list;
            this.f5011 = m5951(0.0f);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m5955(float f) {
            C2463<T> r0 = this.f5011;
            if (f >= r0.m12705() && f < r0.m12704()) {
                return !(this.f5011.f11219 == null);
            }
            this.f5011 = m5951(f);
            return true;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private C2463<T> m5951(float f) {
            List<? extends C2463<T>> list = this.f5009;
            C2463<T> r0 = (C2463) list.get(list.size() - 1);
            if (f >= r0.m12705()) {
                return r0;
            }
            int size = this.f5009.size() - 2;
            while (true) {
                boolean z = false;
                if (size <= 0) {
                    return (C2463) this.f5009.get(0);
                }
                C2463<T> r3 = (C2463) this.f5009.get(size);
                if (this.f5011 != r3) {
                    if (f >= r3.m12705() && f < r3.m12704()) {
                        z = true;
                    }
                    if (z) {
                        return r3;
                    }
                }
                size--;
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2463<T> m5956() {
            return this.f5011;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final float m5957() {
            return ((C2463) this.f5009.get(0)).m12705();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final float m5954() {
            List<? extends C2463<T>> list = this.f5009;
            return ((C2463) list.get(list.size() - 1)).m12704();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m5952(float f) {
            if (this.f5008 == this.f5011 && this.f5010 == f) {
                return true;
            }
            this.f5008 = this.f5011;
            this.f5010 = f;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final float m5929() {
        C2921.m15081();
        C2463<K> r0 = this.f5000.m5943();
        C2921.m15080();
        if (r0.f11219 == null) {
            return 0.0f;
        }
        return r0.f11219.getInterpolation(m5933());
    }
}
