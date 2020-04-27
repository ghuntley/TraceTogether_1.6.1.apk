package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import o.C1961;

/* renamed from: o.Ιյ  reason: contains not printable characters */
public final class C1899 {

    /* renamed from: ι  reason: contains not printable characters */
    public static final int f9615;

    /* renamed from: ı  reason: contains not printable characters */
    public final View f9616;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C1961.C1962 f9617;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1900 f9618;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Drawable f9619;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f9620;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Paint f9621 = new Paint(1);

    /* renamed from: І  reason: contains not printable characters */
    private final Paint f9622 = new Paint(7);

    /* renamed from: і  reason: contains not printable characters */
    private final Path f9623 = new Path();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f9624;

    /* renamed from: o.Ιյ$ǃ  reason: contains not printable characters */
    public interface C1900 {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m10341(Canvas canvas);

        /* renamed from: Ι  reason: contains not printable characters */
        boolean m10342();
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f9615 = 2;
        } else if (Build.VERSION.SDK_INT >= 18) {
            f9615 = 1;
        } else {
            f9615 = 0;
        }
    }

    public C1899(C1900 r3) {
        this.f9618 = r3;
        this.f9616 = (View) r3;
        this.f9616.setWillNotDraw(false);
        this.f9621.setColor(0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10338() {
        if (f9615 == 0) {
            this.f9624 = true;
            this.f9620 = false;
            this.f9616.buildDrawingCache();
            Bitmap drawingCache = this.f9616.getDrawingCache();
            if (!(drawingCache != null || this.f9616.getWidth() == 0 || this.f9616.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f9616.getWidth(), this.f9616.getHeight(), Bitmap.Config.ARGB_8888);
                this.f9616.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f9622;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f9624 = false;
            this.f9620 = true;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10340() {
        if (f9615 == 0) {
            this.f9620 = false;
            this.f9616.destroyDrawingCache();
            this.f9622.setShader((Shader) null);
            this.f9616.invalidate();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10339(C1961.C1962 r5) {
        if (r5 == null) {
            this.f9617 = null;
        } else {
            C1961.C1962 r0 = this.f9617;
            if (r0 == null) {
                this.f9617 = new C1961.C1962(r5);
            } else {
                float f = r5.f9854;
                float f2 = r5.f9853;
                float f3 = r5.f9855;
                r0.f9854 = f;
                r0.f9853 = f2;
                r0.f9855 = f3;
            }
            if (r5.f9855 + 1.0E-4f >= C2745.m14524(r5.f9854, r5.f9853, (float) this.f9616.getWidth(), (float) this.f9616.getHeight())) {
                this.f9617.f9855 = Float.MAX_VALUE;
            }
        }
        m10334();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1961.C1962 m10336() {
        C1961.C1962 r0 = this.f9617;
        if (r0 == null) {
            return null;
        }
        C1961.C1962 r1 = new C1961.C1962(r0);
        if (r1.f9855 == Float.MAX_VALUE) {
            r1.f9855 = C2745.m14524(r1.f9854, r1.f9853, (float) this.f9616.getWidth(), (float) this.f9616.getHeight());
        }
        return r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m10334() {
        if (f9615 == 1) {
            this.f9623.rewind();
            C1961.C1962 r0 = this.f9617;
            if (r0 != null) {
                this.f9623.addCircle(r0.f9854, this.f9617.f9853, this.f9617.f9855, Path.Direction.CW);
            }
        }
        this.f9616.invalidate();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10337(Canvas canvas) {
        boolean z = false;
        if (m10335()) {
            int i = f9615;
            if (i == 0) {
                canvas.drawCircle(this.f9617.f9854, this.f9617.f9853, this.f9617.f9855, this.f9622);
                if (!this.f9624 && Color.alpha(this.f9621.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawCircle(this.f9617.f9854, this.f9617.f9853, this.f9617.f9855, this.f9621);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f9623);
                this.f9618.m10341(canvas);
                if (!this.f9624 && Color.alpha(this.f9621.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f9616.getWidth(), (float) this.f9616.getHeight(), this.f9621);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f9618.m10341(canvas);
                if (!this.f9624 && Color.alpha(this.f9621.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f9616.getWidth(), (float) this.f9616.getHeight(), this.f9621);
                }
            } else {
                StringBuilder sb = new StringBuilder("Unsupported strategy ");
                sb.append(f9615);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            this.f9618.m10341(canvas);
            if (!this.f9624 && Color.alpha(this.f9621.getColor()) != 0) {
                z = true;
            }
            if (z) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f9616.getWidth(), (float) this.f9616.getHeight(), this.f9621);
            }
        }
        m10333(canvas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m10335() {
        /*
            r4 = this;
            o.ιƶ$ı r0 = r4.f9617
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            float r0 = r0.f9855
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            int r3 = f9615
            if (r3 != 0) goto L_0x0024
            if (r0 != 0) goto L_0x0023
            boolean r0 = r4.f9620
            if (r0 == 0) goto L_0x0023
            return r2
        L_0x0023:
            return r1
        L_0x0024:
            if (r0 != 0) goto L_0x0027
            return r2
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1899.m10335():boolean");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m10333(Canvas canvas) {
        if ((this.f9624 || this.f9619 == null || this.f9617 == null) ? false : true) {
            Rect bounds = this.f9619.getBounds();
            float width = this.f9617.f9854 - (((float) bounds.width()) / 2.0f);
            float height = this.f9617.f9853 - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f9619.draw(canvas);
            canvas.translate(-width, -height);
        }
    }
}
