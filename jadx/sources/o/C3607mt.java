package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.mt  reason: case insensitive filesystem */
public abstract class C3607mt<E> {
    private boolean canceled = false;

    public abstract void success(E e);

    public void internalSuccess(final E e) {
        if (!this.canceled) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C3607mt.this.success(e);
                }
            });
        }
    }
}
