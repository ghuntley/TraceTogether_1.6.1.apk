package o;

/* renamed from: o.ІӀ  reason: contains not printable characters */
public final class C2317 implements C1741 {

    /* renamed from: ι  reason: contains not printable characters */
    private final C1746 f10744;

    /* renamed from: o.ІӀ$If */
    public interface If<T> {
        /* renamed from: ι  reason: contains not printable characters */
        T m12090();

        /* renamed from: ι  reason: contains not printable characters */
        boolean m12091(T t);
    }

    /* renamed from: o.ІӀ$ɩ  reason: contains not printable characters */
    public static class C2318<T> implements If<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private int f10746;

        /* renamed from: ι  reason: contains not printable characters */
        private final Object[] f10747;

        public C2318(int i) {
            if (i > 0) {
                this.f10747 = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public T m12094() {
            int i = this.f10746;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f10747;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f10746 = i - 1;
            return t;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public boolean m12095(T t) {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= this.f10746) {
                    z = false;
                    break;
                } else if (this.f10747[i] == t) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                int i2 = this.f10746;
                Object[] objArr = this.f10747;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = t;
                this.f10746 = i2 + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    /* renamed from: o.ІӀ$if  reason: invalid class name */
    public static class Cif<T> extends C2318<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Object f10745 = new Object();

        public Cif(int i) {
            super(i);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final T m12092() {
            T r1;
            synchronized (this.f10745) {
                r1 = super.m12094();
            }
            return r1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m12093(T t) {
            boolean r2;
            synchronized (this.f10745) {
                r2 = super.m12095(t);
            }
            return r2;
        }
    }

    public C2317(C1746 r1) {
        this.f10744 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12088() {
        C1746 r0 = this.f10744;
        r0.f9050.cancel();
        if (r0.f9047.getVisibility() == 4) {
            r0.f9047.setVisibility(0);
            r0.m9814();
            r0.f9048.start();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m12089() {
        C1746 r0 = this.f10744;
        r0.m9814();
        r0.f9050.start();
    }

    public C2317() {
    }
}
