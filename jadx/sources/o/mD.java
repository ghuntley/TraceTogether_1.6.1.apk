package o;

import android.util.SparseArray;

public final class mD {

    /* renamed from: ı  reason: contains not printable characters */
    public SparseArray<mF> f3074 = new SparseArray<>();

    mD() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m3738() {
        int i;
        synchronized (this) {
            while (true) {
                i = 1600;
                while (i < 1650) {
                    if (this.f3074.get(i) == null) {
                        this.f3074.put(i, mF.m3740());
                    } else {
                        i++;
                    }
                }
                this.f3074.clear();
            }
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final mF m3737(int i) {
        mF mFVar;
        synchronized (this) {
            mFVar = this.f3074.get(i);
        }
        return mFVar;
    }
}
