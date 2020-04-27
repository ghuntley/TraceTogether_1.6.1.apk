package o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import o.C3616p;

/* renamed from: o.e  reason: case insensitive filesystem */
final class C3372e extends C3126<ImageView> {

    /* renamed from: ɹ  reason: contains not printable characters */
    private C3289b f2064;

    C3372e(C3616p pVar, ImageView imageView, C3617q qVar, String str, C3289b bVar, boolean z) {
        super(pVar, imageView, qVar, str, z);
        this.f2064 = bVar;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2123(Bitmap bitmap, C3616p.C0272 r5) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f14265.get();
            if (imageView != null) {
                C3615o.m4037(imageView, this.f14266.f3444, bitmap, r5, this.f14264);
                C3289b bVar = this.f2064;
                if (bVar != null) {
                    bVar.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m2121() {
        C3289b bVar;
        if (((ImageView) this.f14265.get()) != null && (bVar = this.f2064) != null) {
            bVar.onError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m2122() {
        super.m15857();
        if (this.f2064 != null) {
            this.f2064 = null;
        }
    }
}
