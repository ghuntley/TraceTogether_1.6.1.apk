package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.C3616p;
import o.C3617q;

/* renamed from: o.t  reason: case insensitive filesystem */
public class C3620t {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final AtomicInteger f3494 = new AtomicInteger();

    /* renamed from: ı  reason: contains not printable characters */
    public boolean f3495;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3617q.C0274 f3496;

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean f3497;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f3498;

    /* renamed from: І  reason: contains not printable characters */
    private final C3616p f3499;

    public C3620t(C3616p pVar, Uri uri) {
        this.f3495 = true;
        this.f3499 = pVar;
        this.f3496 = new C3617q.C0274(uri, pVar.f3453);
    }

    C3620t() {
        this.f3495 = true;
        this.f3499 = null;
        this.f3496 = new C3617q.C0274((Uri) null, (Bitmap.Config) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3620t m4074(C3625y yVar) {
        C3617q.C0274 r0 = this.f3496;
        if (yVar == null) {
            throw new IllegalArgumentException("Transformation must not be null.");
        } else if (yVar.key() != null) {
            if (r0.f3488 == null) {
                r0.f3488 = new ArrayList(2);
            }
            r0.f3488.add(yVar);
            return this;
        } else {
            throw new IllegalArgumentException("Transformation key must not be null.");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4075(C3619s sVar) {
        Bitmap r1;
        C3626z.m4097();
        if (!this.f3498) {
            if (!(this.f3496.f3486 != null)) {
                this.f3499.m4044((Object) sVar);
                sVar.onPrepareLoad((Drawable) null);
                return;
            }
            f3494.getAndIncrement();
            C3617q r0 = this.f3496.m4065();
            boolean z = this.f3499.f3452;
            C3617q r02 = this.f3499.m4042(r0);
            String r3 = C3626z.m4086(r02);
            if (!C3560l.m3362(0) || (r1 = this.f3499.m4043(r3)) == null) {
                sVar.onPrepareLoad((Drawable) null);
                this.f3499.m4045(new C3624x(this.f3499, sVar, r02, r3));
                return;
            }
            this.f3499.m4044((Object) sVar);
            sVar.onBitmapLoaded(r1, C3616p.C0272.MEMORY);
            return;
        }
        throw new IllegalStateException("Fit cannot be used with a Target.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4076(ImageView imageView, C3289b bVar) {
        Bitmap r0;
        C3626z.m4097();
        if (imageView != null) {
            boolean z = true;
            if (!(this.f3496.f3486 != null)) {
                this.f3499.m4044((Object) imageView);
                if (this.f3495) {
                    C3615o.m4038(imageView);
                    return;
                }
                return;
            }
            if (this.f3498) {
                C3617q.C0274 r02 = this.f3496;
                if (r02.f3485 == 0 && r02.f3483 == 0) {
                    z = false;
                }
                if (!z) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f3495) {
                            C3615o.m4038(imageView);
                        }
                        this.f3499.f3450.put(imageView, new C2667(this, imageView, bVar));
                        return;
                    }
                    this.f3496.m4066(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            f3494.getAndIncrement();
            C3617q r03 = this.f3496.m4065();
            boolean z2 = this.f3499.f3452;
            C3617q r6 = this.f3499.m4042(r03);
            String r7 = C3626z.m4086(r6);
            if (!C3560l.m3362(0) || (r0 = this.f3499.m4043(r7)) == null) {
                if (this.f3495) {
                    C3615o.m4038(imageView);
                }
                this.f3499.m4045(new C3372e(this.f3499, imageView, r6, r7, bVar, this.f3497));
                return;
            }
            this.f3499.m4044((Object) imageView);
            C3615o.m4037(imageView, this.f3499.f3444, r0, C3616p.C0272.MEMORY, this.f3497);
            boolean z3 = this.f3499.f3452;
            if (bVar != null) {
                bVar.onSuccess();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
