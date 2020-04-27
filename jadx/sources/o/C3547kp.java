package o;

import android.app.Activity;
import android.content.Context;

/* renamed from: o.kp  reason: case insensitive filesystem */
public final class C3547kp<T> extends C3546ko<T> {
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m3299(String str) {
        return false;
    }

    public C3547kp(T t) {
        super(t);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3300(int i, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3298(String str, String str2, String str3, int i, int i2, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Context m3301() {
        if (this.f2669 instanceof Activity) {
            return (Context) this.f2669;
        }
        if (this.f2669 instanceof C1277) {
            return ((C1277) this.f2669).getContext();
        }
        StringBuilder sb = new StringBuilder("Unknown host: ");
        sb.append(this.f2669);
        throw new IllegalStateException(sb.toString());
    }
}
