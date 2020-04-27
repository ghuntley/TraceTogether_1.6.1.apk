package o;

import java.lang.ref.WeakReference;

/* renamed from: o.гɍ  reason: contains not printable characters */
abstract class C2411 extends C2500 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final WeakReference<byte[]> f10991 = new WeakReference<>((Object) null);

    /* renamed from: Ι  reason: contains not printable characters */
    private WeakReference<byte[]> f10992 = f10991;

    C2411(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract byte[] m12457();

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final byte[] m12458() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f10992.get();
            if (bArr == null) {
                bArr = m12457();
                this.f10992 = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
