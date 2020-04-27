package o;

import android.content.Context;

/* renamed from: o.an  reason: case insensitive filesystem */
public abstract class C3274an<T> {
    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m1610(T t);

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract T m1611();

    public C3274an() {
        this((byte) 0);
    }

    public C3274an(byte b) {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized T m1609(Context context, C3271ak<T> akVar) {
        T r0;
        r0 = m1611();
        if (r0 == null) {
            r0 = akVar.m1602(context);
            if (r0 != null) {
                m1610(r0);
            } else {
                throw new NullPointerException();
            }
        }
        return r0;
    }
}
