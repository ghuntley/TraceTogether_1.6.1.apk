package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import o.C3616p;

/* renamed from: o.x  reason: case insensitive filesystem */
final class C3624x extends C3126<C3619s> {
    C3624x(C3616p pVar, C3619s sVar, C3617q qVar, String str) {
        super(pVar, sVar, qVar, str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4080(Bitmap bitmap, C3616p.C0272 r3) {
        if (bitmap != null) {
            C3619s sVar = (C3619s) (this.f14265 == null ? null : this.f14265.get());
            if (sVar != null) {
                sVar.onBitmapLoaded(bitmap, r3);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m4079() {
        C3619s sVar = (C3619s) (this.f14265 == null ? null : this.f14265.get());
        if (sVar != null) {
            sVar.onBitmapFailed((Drawable) null);
        }
    }
}
