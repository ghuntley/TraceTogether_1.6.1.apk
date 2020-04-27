package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C3616p;
import o.mM;

/* renamed from: o.mw  reason: case insensitive filesystem */
public class C3610mw extends C2147 implements C3619s {

    /* renamed from: ı  reason: contains not printable characters */
    Uri f3351;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f3352;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f3353;

    /* renamed from: ɹ  reason: contains not printable characters */
    C3616p f3354;

    /* renamed from: Ι  reason: contains not printable characters */
    int f3355;

    /* renamed from: ι  reason: contains not printable characters */
    int f3356;

    /* renamed from: І  reason: contains not printable characters */
    final AtomicBoolean f3357;

    /* renamed from: і  reason: contains not printable characters */
    C0260 f3358;

    /* renamed from: o.mw$ı  reason: contains not printable characters */
    interface C0260 {
        /* renamed from: ι  reason: contains not printable characters */
        void m3936(C0261 r1);
    }

    public void onBitmapFailed(Drawable drawable) {
    }

    public void onPrepareLoad(Drawable drawable) {
    }

    public C3610mw(Context context) {
        super(context);
        this.f3352 = -1;
        this.f3356 = -1;
        this.f3351 = null;
        this.f3357 = new AtomicBoolean(false);
        this.f3356 = getResources().getDimensionPixelOffset(R.dimen.f157902131165267);
    }

    public C3610mw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3352 = -1;
        this.f3356 = -1;
        this.f3351 = null;
        this.f3357 = new AtomicBoolean(false);
        this.f3356 = getResources().getDimensionPixelOffset(R.dimen.f157902131165267);
    }

    public C3610mw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3352 = -1;
        this.f3356 = -1;
        this.f3351 = null;
        this.f3357 = new AtomicBoolean(false);
        this.f3356 = getResources().getDimensionPixelOffset(R.dimen.f157902131165267);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3356, 1073741824);
        if (this.f3352 == -1) {
            this.f3352 = size;
        }
        int i3 = this.f3352;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            if (this.f3357.compareAndSet(true, false)) {
                m3935(this.f3354, this.f3351, this.f3352, this.f3355, this.f3353);
            }
        }
        super.onMeasure(i, makeMeasureSpec);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m3934(C3616p pVar, int i, int i2, Uri uri) {
        this.f3356 = i2;
        post(new Runnable() {
            public final void run() {
                C3610mw.this.requestLayout();
            }
        });
        C0260 r0 = this.f3358;
        if (r0 != null) {
            r0.m3936(new C0261(this.f3353, this.f3355, this.f3356, this.f3352));
            this.f3358 = null;
        }
        C3620t tVar = new C3620t(pVar, uri);
        tVar.f3496.m4066(i, i2);
        tVar.m4074((C3625y) new mM.If(getContext().getResources().getDimensionPixelOffset(R.dimen.f157912131165269))).m4076(this, (C3289b) null);
    }

    public void onBitmapLoaded(Bitmap bitmap, C3616p.C0272 r4) {
        this.f3353 = bitmap.getHeight();
        this.f3355 = bitmap.getWidth();
        int i = this.f3352;
        int i2 = this.f3355;
        float f = ((float) i) / ((float) i2);
        Pair create = Pair.create(Integer.valueOf(i), Integer.valueOf((int) (((float) this.f3353) * f)));
        m3934(this.f3354, ((Integer) create.first).intValue(), ((Integer) create.second).intValue(), this.f3351);
    }

    /* renamed from: o.mw$ǃ  reason: contains not printable characters */
    static class C0261 {

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f3360;

        /* renamed from: ɩ  reason: contains not printable characters */
        final int f3361;

        /* renamed from: Ι  reason: contains not printable characters */
        final int f3362;

        /* renamed from: ι  reason: contains not printable characters */
        final int f3363;

        C0261(int i, int i2, int i3, int i4) {
            this.f3361 = i;
            this.f3362 = i2;
            this.f3360 = i3;
            this.f3363 = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m3935(C3616p pVar, Uri uri, int i, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            new C3620t(pVar, uri).m4075((C3619s) this);
            return;
        }
        Pair create = Pair.create(Integer.valueOf(i), Integer.valueOf((int) (((float) i3) * (((float) i) / ((float) i2)))));
        m3934(pVar, ((Integer) create.first).intValue(), ((Integer) create.second).intValue(), uri);
    }
}
