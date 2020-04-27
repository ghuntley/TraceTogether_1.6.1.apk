package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.łŀ  reason: contains not printable characters */
abstract class C0524<T> implements Iterator<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f4349 = C0556.f4450;

    /* renamed from: ɩ  reason: contains not printable characters */
    private T f4350;

    protected C0524() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract T m5082();

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final T m5081() {
        this.f4349 = C0556.f4448;
        return null;
    }

    public final boolean hasNext() {
        if (this.f4349 != C0556.f4452) {
            int i = C0499.f4191[this.f4349 - 1];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.f4349 = C0556.f4452;
            this.f4350 = m5082();
            if (this.f4349 == C0556.f4448) {
                return false;
            }
            this.f4349 = C0556.f4449;
            return true;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f4349 = C0556.f4450;
            T t = this.f4350;
            this.f4350 = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
