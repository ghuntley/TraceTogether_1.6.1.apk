package o;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.ґı  reason: contains not printable characters */
public abstract class C2676 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final DataSetObservable f12327 = new DataSetObservable();

    /* renamed from: ι  reason: contains not printable characters */
    private DataSetObserver f12328;

    /* renamed from: ı  reason: contains not printable characters */
    public int m14221(Object obj) {
        return -1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public abstract boolean m14225(View view, Object obj);

    /* renamed from: ǃ  reason: contains not printable characters */
    public float m14226(int i) {
        return 1.0f;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract int m14230();

    /* renamed from: ɩ  reason: contains not printable characters */
    public CharSequence m14231(int i) {
        return null;
    }

    @Deprecated
    /* renamed from: Ι  reason: contains not printable characters */
    public void m14235(View view) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Parcelable m14236() {
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m14238(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: ι  reason: contains not printable characters */
    public void m14239(View view) {
    }

    @Deprecated
    /* renamed from: ι  reason: contains not printable characters */
    public void m14240(View view, int i, Object obj) {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m14229(ViewGroup viewGroup) {
        m14235((View) viewGroup);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public Object m14233(ViewGroup viewGroup, int i) {
        return m14237((View) viewGroup, i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m14241(ViewGroup viewGroup, int i, Object obj) {
        m14223(viewGroup, i, obj);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m14232(ViewGroup viewGroup, int i, Object obj) {
        m14240((View) viewGroup, i, obj);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m14224(ViewGroup viewGroup) {
        m14239(viewGroup);
    }

    @Deprecated
    /* renamed from: ι  reason: contains not printable characters */
    public Object m14237(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    /* renamed from: ı  reason: contains not printable characters */
    public void m14223(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m14227() {
        synchronized (this) {
            if (this.f12328 != null) {
                this.f12328.onChanged();
            }
        }
        this.f12327.notifyChanged();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m14228(DataSetObserver dataSetObserver) {
        this.f12327.registerObserver(dataSetObserver);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m14234(DataSetObserver dataSetObserver) {
        this.f12327.unregisterObserver(dataSetObserver);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m14222(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f12328 = dataSetObserver;
        }
    }
}
