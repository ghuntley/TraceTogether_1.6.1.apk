package o;

import java.util.NoSuchElementException;

/* renamed from: o.ƚƗ  reason: contains not printable characters */
abstract class C0721<E> extends C1024<E> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f4928;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f4929;

    protected C0721(int i, int i2) {
        C0672.m5541(i2, i);
        this.f4929 = i;
        this.f4928 = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract E m5847(int i);

    public final boolean hasNext() {
        return this.f4928 < this.f4929;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f4928;
            this.f4928 = i + 1;
            return m5847(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f4928;
    }

    public final boolean hasPrevious() {
        return this.f4928 > 0;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f4928 - 1;
            this.f4928 = i;
            return m5847(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f4928 - 1;
    }
}
