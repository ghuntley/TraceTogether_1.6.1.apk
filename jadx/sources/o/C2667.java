package o;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: o.ҎІ  reason: contains not printable characters */
final class C2667 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: ı  reason: contains not printable characters */
    private C3289b f12285;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3620t f12286;

    /* renamed from: ι  reason: contains not printable characters */
    private WeakReference<ImageView> f12287;

    C2667(C3620t tVar, ImageView imageView, C3289b bVar) {
        this.f12286 = tVar;
        this.f12287 = new WeakReference<>(imageView);
        this.f12285 = bVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final boolean onPreDraw() {
        ImageView imageView = this.f12287.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            C3620t tVar = this.f12286;
            tVar.f3498 = false;
            tVar.f3496.m4066(width, height);
            tVar.m4076(imageView, this.f12285);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14149() {
        this.f12285 = null;
        ImageView imageView = this.f12287.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }
}
