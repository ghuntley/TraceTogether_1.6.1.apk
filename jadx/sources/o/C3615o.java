package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import o.C3616p;

/* renamed from: o.o  reason: case insensitive filesystem */
final class C3615o extends BitmapDrawable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Paint f3433 = new Paint();

    /* renamed from: ı  reason: contains not printable characters */
    private final float f3434;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private long f3435;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean f3436;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f3437;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3616p.C0272 f3438;

    /* renamed from: ι  reason: contains not printable characters */
    private Drawable f3439;

    /* renamed from: і  reason: contains not printable characters */
    private int f3440 = 255;

    /* renamed from: ı  reason: contains not printable characters */
    static void m4037(ImageView imageView, Context context, Bitmap bitmap, C3616p.C0272 r11, boolean z) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C3615o(context, bitmap, drawable, r11, z, false));
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m4038(ImageView imageView) {
        imageView.setImageDrawable((Drawable) null);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    private C3615o(Context context, Bitmap bitmap, Drawable drawable, C3616p.C0272 r4, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        boolean z3 = false;
        this.f3436 = false;
        this.f3434 = context.getResources().getDisplayMetrics().density;
        this.f3438 = r4;
        if (r4 != C3616p.C0272.MEMORY && !z) {
            z3 = true;
        }
        if (z3) {
            this.f3439 = drawable;
            this.f3437 = true;
            this.f3435 = SystemClock.uptimeMillis();
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.f3437) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f3435)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f3437 = false;
                this.f3439 = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f3439;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f3440) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f3440);
                if (Build.VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        }
        if (this.f3436) {
            f3433.setColor(-1);
            canvas.drawPath(m4036(new Point(0, 0), (int) (this.f3434 * 16.0f)), f3433);
            f3433.setColor(this.f3438.f3472);
            canvas.drawPath(m4036(new Point(0, 0), (int) (this.f3434 * 15.0f)), f3433);
        }
    }

    public final void setAlpha(int i) {
        this.f3440 = i;
        Drawable drawable = this.f3439;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3439;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3439;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Path m4036(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }
}
