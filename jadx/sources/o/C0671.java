package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import o.C0723;
import o.C0787;

/* renamed from: o.Ɨŧ  reason: contains not printable characters */
public class C0671 extends Drawable implements C1328, C0710 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Paint f4771 = new Paint(1);

    /* renamed from: ı  reason: contains not printable characters */
    private final Path f4772;

    /* renamed from: ŀ  reason: contains not printable characters */
    private Rect f4773;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Paint f4774;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Matrix f4775;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C0787 f4776;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C0787.C0788 f4777;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final RectF f4778;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C0374 f4779;

    /* renamed from: ɭ  reason: contains not printable characters */
    final C0723.C0727[] f4780;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Region f4781;

    /* renamed from: ɾ  reason: contains not printable characters */
    private PorterDuffColorFilter f4782;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final RectF f4783;

    /* renamed from: ι  reason: contains not printable characters */
    private final Path f4784;

    /* renamed from: ϲ  reason: contains not printable characters */
    public Cif f4785;

    /* renamed from: І  reason: contains not printable characters */
    private C0785 f4786;

    /* renamed from: т  reason: contains not printable characters */
    public boolean f4787;

    /* renamed from: х  reason: contains not printable characters */
    public boolean f4788;

    /* renamed from: і  reason: contains not printable characters */
    private final Region f4789;

    /* renamed from: ј  reason: contains not printable characters */
    public final RectF f4790;

    /* renamed from: ґ  reason: contains not printable characters */
    final C0723.C0727[] f4791;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Paint f4792;

    /* renamed from: ӏ  reason: contains not printable characters */
    private PorterDuffColorFilter f4793;

    public int getOpacity() {
        return -3;
    }

    /* synthetic */ C0671(Cif ifVar, byte b) {
        this(ifVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C0671 m5512(Context context, float f) {
        int r0 = C0328.m4398(context, (int) R.attr.f150352130968822, C0671.class.getSimpleName());
        C0671 r1 = new C0671();
        r1.f4785.f4812 = new C2610(context);
        r1.m5521();
        ColorStateList valueOf = ColorStateList.valueOf(r0);
        if (r1.f4785.f4804 != valueOf) {
            r1.f4785.f4804 = valueOf;
            r1.onStateChange(r1.getState());
        }
        if (r1.f4785.f4803 != f) {
            r1.f4785.f4803 = f;
            r1.m5521();
        }
        return r1;
    }

    public C0671() {
        this(new C0785());
    }

    public C0671(C0785 r2) {
        this(new Cif(r2));
    }

    private C0671(Cif ifVar) {
        this.f4780 = new C0723.C0727[4];
        this.f4791 = new C0723.C0727[4];
        this.f4775 = new Matrix();
        this.f4772 = new Path();
        this.f4784 = new Path();
        this.f4790 = new RectF();
        this.f4778 = new RectF();
        this.f4789 = new Region();
        this.f4781 = new Region();
        this.f4774 = new Paint(1);
        this.f4792 = new Paint(1);
        this.f4779 = new C0374();
        this.f4776 = new C0787();
        this.f4783 = new RectF();
        this.f4788 = true;
        this.f4785 = ifVar;
        this.f4792.setStyle(Paint.Style.STROKE);
        this.f4774.setStyle(Paint.Style.FILL);
        f4771.setColor(-1);
        f4771.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m5520();
        m5514(getState());
        this.f4777 = new C0787.C0788() {
            /* renamed from: ı  reason: contains not printable characters */
            public final void m5536(C0723 r3, Matrix matrix, int i) {
                C0723.C0727[] r0 = C0671.this.f4780;
                r3.m5853(r3.f4933);
                r0[i] = new C0723.C0727(new ArrayList(r3.f4931), matrix) {

                    /* renamed from: ɩ  reason: contains not printable characters */
                    private /* synthetic */ Matrix f4938;

                    /* renamed from: Ι  reason: contains not printable characters */
                    private /* synthetic */ List f4939;

                    {
                        this.f4939 = r1;
                        this.f4938 = r2;
                    }

                    /* renamed from: ι  reason: contains not printable characters */
                    public final void m5854(Matrix matrix, C0374 r4, int i, Canvas canvas) {
                        for (C0727 r0 : this.f4939) {
                            r0.m5861(this.f4938, r4, i, canvas);
                        }
                    }
                };
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m5537(C0723 r3, Matrix matrix, int i) {
                C0723.C0727[] r0 = C0671.this.f4791;
                r3.m5853(r3.f4933);
                r0[i] = new C0723.C0727(new ArrayList(r3.f4931), matrix) {

                    /* renamed from: ɩ  reason: contains not printable characters */
                    private /* synthetic */ Matrix f4938;

                    /* renamed from: Ι  reason: contains not printable characters */
                    private /* synthetic */ List f4939;

                    {
                        this.f4939 = r1;
                        this.f4938 = r2;
                    }

                    /* renamed from: ι  reason: contains not printable characters */
                    public final void m5854(Matrix matrix, C0374 r4, int i, Canvas canvas) {
                        for (C0727 r0 : this.f4939) {
                            r0.m5861(this.f4938, r4, i, canvas);
                        }
                    }
                };
            }
        };
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4785;
    }

    public Drawable mutate() {
        this.f4785 = new Cif(this.f4785);
        return this;
    }

    public void setShapeAppearanceModel(C0785 r2) {
        this.f4785.f4796 = r2;
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f4785.f4799 != mode) {
            this.f4785.f4799 = mode;
            m5520();
            super.invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4785.f4816 = colorStateList;
        m5520();
        super.invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setAlpha(int i) {
        if (this.f4785.f4805 != i) {
            this.f4785.f4805 = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4785.f4800 = colorFilter;
        super.invalidateSelf();
    }

    public Region getTransparentRegion() {
        this.f4789.set(getBounds());
        this.f4790.set(getBounds());
        m5516(this.f4790, this.f4772);
        this.f4781.setPath(this.f4772, this.f4789);
        this.f4789.op(this.f4781, Region.Op.DIFFERENCE);
        return this.f4789;
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f4773;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5533(int i, int i2) {
        if (this.f4785.f4815 == null) {
            this.f4785.f4815 = new Rect();
        }
        this.f4785.f4815.set(0, i, 0, i2);
        this.f4773 = this.f4785.f4815;
        invalidateSelf();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5529() {
        if (this.f4785.f4797 != 2) {
            this.f4785.f4797 = 2;
            super.invalidateSelf();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5522(Context context) {
        this.f4785.f4812 = new C2610(context);
        m5521();
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final void m5526(float f) {
        if (this.f4785.f4803 != f) {
            this.f4785.f4803 = f;
            m5521();
        }
    }

    public void invalidateSelf() {
        this.f4787 = true;
        super.invalidateSelf();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5524() {
        super.invalidateSelf();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5531() {
        this.f4779.m4582(-12303292);
        this.f4785.f4802 = false;
        super.invalidateSelf();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m5515() {
        return (this.f4785.f4809 == Paint.Style.FILL_AND_STROKE || this.f4785.f4809 == Paint.Style.STROKE) && this.f4792.getStrokeWidth() > 0.0f;
    }

    public void onBoundsChange(Rect rect) {
        this.f4787 = true;
        super.onBoundsChange(rect);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0117, code lost:
        if (r2 == false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            android.graphics.Paint r0 = r13.f4774
            android.graphics.PorterDuffColorFilter r1 = r13.f4793
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r13.f4774
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r13.f4774
            o.Ɨŧ$if r2 = r13.f4785
            int r2 = r2.f4805
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r13.f4792
            android.graphics.PorterDuffColorFilter r2 = r13.f4782
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r13.f4792
            o.Ɨŧ$if r2 = r13.f4785
            float r2 = r2.f4817
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r13.f4792
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r13.f4792
            o.Ɨŧ$if r3 = r13.f4785
            int r3 = r3.f4805
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r13.f4787
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x00d6
            boolean r2 = r13.m5515()
            if (r2 == 0) goto L_0x0059
            android.graphics.Paint r2 = r13.f4792
            float r2 = r2.getStrokeWidth()
            float r2 = r2 / r3
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            float r2 = -r2
            o.Ɨŧ$if r6 = r13.f4785
            o.ƭł r6 = r6.f4796
            o.Ɨŧ$5 r7 = new o.Ɨŧ$5
            r7.<init>(r2)
            o.ƭł$If r2 = new o.ƭł$If
            r2.<init>(r6)
            o.ıԼ r8 = r6.f5215
            o.ıԼ r8 = r7.m6134(r8)
            r2.f5228 = r8
            o.ıԼ r8 = r6.f5219
            o.ıԼ r8 = r7.m6134(r8)
            r2.f5227 = r8
            o.ıԼ r8 = r6.f5222
            o.ıԼ r8 = r7.m6134(r8)
            r2.f5231 = r8
            o.ıԼ r6 = r6.f5224
            o.ıԼ r6 = r7.m6134(r6)
            r2.f5235 = r6
            o.ƭł r6 = new o.ƭł
            r6.<init>(r2, r5)
            r13.f4786 = r6
            o.ƭƚ r7 = r13.f4776
            o.ƭł r8 = r13.f4786
            o.Ɨŧ$if r2 = r13.f4785
            float r9 = r2.f4807
            android.graphics.RectF r2 = r13.f4778
            android.graphics.RectF r6 = r13.f4790
            android.graphics.Rect r10 = r13.getBounds()
            r6.set(r10)
            android.graphics.RectF r6 = r13.f4790
            r2.set(r6)
            boolean r2 = r13.m5515()
            if (r2 == 0) goto L_0x00b6
            android.graphics.Paint r2 = r13.f4792
            float r2 = r2.getStrokeWidth()
            float r2 = r2 / r3
            goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            android.graphics.RectF r6 = r13.f4778
            r6.inset(r2, r2)
            android.graphics.RectF r10 = r13.f4778
            android.graphics.Path r12 = r13.f4784
            r11 = 0
            r7.m6145(r8, r9, r10, r11, r12)
            android.graphics.RectF r2 = r13.f4790
            android.graphics.Rect r6 = r13.getBounds()
            r2.set(r6)
            android.graphics.RectF r2 = r13.f4790
            android.graphics.Path r6 = r13.f4772
            r13.m5516(r2, r6)
            r13.f4787 = r5
        L_0x00d6:
            o.Ɨŧ$if r2 = r13.f4785
            int r2 = r2.f4797
            r6 = 21
            r7 = 1
            if (r2 == r7) goto L_0x011b
            o.Ɨŧ$if r2 = r13.f4785
            int r2 = r2.f4798
            if (r2 <= 0) goto L_0x011b
            o.Ɨŧ$if r2 = r13.f4785
            int r2 = r2.f4797
            r8 = 2
            if (r2 == r8) goto L_0x0119
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L_0x0116
            o.Ɨŧ$if r2 = r13.f4785
            o.ƭł r2 = r2.f4796
            android.graphics.RectF r8 = r13.f4790
            android.graphics.Rect r9 = r13.getBounds()
            r8.set(r9)
            android.graphics.RectF r8 = r13.f4790
            boolean r2 = r2.m6132(r8)
            if (r2 != 0) goto L_0x0114
            android.graphics.Path r2 = r13.f4772
            boolean r2 = r2.isConvex()
            if (r2 != 0) goto L_0x0114
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r2 >= r8) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r2 = 0
            goto L_0x0117
        L_0x0116:
            r2 = 1
        L_0x0117:
            if (r2 == 0) goto L_0x011b
        L_0x0119:
            r2 = 1
            goto L_0x011c
        L_0x011b:
            r2 = 0
        L_0x011c:
            if (r2 == 0) goto L_0x01f1
            r14.save()
            o.Ɨŧ$if r2 = r13.f4785
            int r2 = r2.f4814
            double r8 = (double) r2
            o.Ɨŧ$if r2 = r13.f4785
            int r2 = r2.f4810
            double r10 = (double) r2
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = java.lang.Math.sin(r10)
            double r8 = r8 * r10
            int r2 = (int) r8
            o.Ɨŧ$if r8 = r13.f4785
            int r8 = r8.f4814
            double r8 = (double) r8
            o.Ɨŧ$if r10 = r13.f4785
            int r10 = r10.f4810
            double r10 = (double) r10
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = java.lang.Math.cos(r10)
            double r8 = r8 * r10
            int r8 = (int) r8
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 >= r6) goto L_0x016c
            boolean r6 = r13.f4788
            if (r6 == 0) goto L_0x016c
            android.graphics.Rect r6 = r14.getClipBounds()
            o.Ɨŧ$if r9 = r13.f4785
            int r9 = r9.f4798
            int r9 = -r9
            o.Ɨŧ$if r10 = r13.f4785
            int r10 = r10.f4798
            int r10 = -r10
            r6.inset(r9, r10)
            r6.offset(r2, r8)
            android.graphics.Region$Op r9 = android.graphics.Region.Op.REPLACE
            r14.clipRect(r6, r9)
        L_0x016c:
            float r2 = (float) r2
            float r6 = (float) r8
            r14.translate(r2, r6)
            boolean r2 = r13.f4788
            if (r2 != 0) goto L_0x017c
            r13.m5519((android.graphics.Canvas) r14)
            r14.restore()
            goto L_0x01f1
        L_0x017c:
            android.graphics.RectF r2 = r13.f4783
            float r2 = r2.width()
            android.graphics.Rect r6 = r13.getBounds()
            int r6 = r6.width()
            float r6 = (float) r6
            float r2 = r2 - r6
            int r2 = (int) r2
            android.graphics.RectF r6 = r13.f4783
            float r6 = r6.height()
            android.graphics.Rect r8 = r13.getBounds()
            int r8 = r8.height()
            float r8 = (float) r8
            float r6 = r6 - r8
            int r6 = (int) r6
            android.graphics.RectF r8 = r13.f4783
            float r8 = r8.width()
            int r8 = (int) r8
            o.Ɨŧ$if r9 = r13.f4785
            int r9 = r9.f4798
            int r9 = r9 << r7
            int r8 = r8 + r9
            int r8 = r8 + r2
            android.graphics.RectF r9 = r13.f4783
            float r9 = r9.height()
            int r9 = (int) r9
            o.Ɨŧ$if r10 = r13.f4785
            int r10 = r10.f4798
            int r10 = r10 << r7
            int r9 = r9 + r10
            int r9 = r9 + r6
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r10)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r8)
            android.graphics.Rect r10 = r13.getBounds()
            int r10 = r10.left
            o.Ɨŧ$if r11 = r13.f4785
            int r11 = r11.f4798
            int r10 = r10 - r11
            int r10 = r10 - r2
            float r2 = (float) r10
            android.graphics.Rect r10 = r13.getBounds()
            int r10 = r10.top
            o.Ɨŧ$if r11 = r13.f4785
            int r11 = r11.f4798
            int r10 = r10 - r11
            int r10 = r10 - r6
            float r6 = (float) r10
            float r10 = -r2
            float r11 = -r6
            r9.translate(r10, r11)
            r13.m5519((android.graphics.Canvas) r9)
            r9 = 0
            r14.drawBitmap(r8, r2, r6, r9)
            r8.recycle()
            r14.restore()
        L_0x01f1:
            o.Ɨŧ$if r2 = r13.f4785
            android.graphics.Paint$Style r2 = r2.f4809
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r2 == r6) goto L_0x0201
            o.Ɨŧ$if r2 = r13.f4785
            android.graphics.Paint$Style r2 = r2.f4809
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            if (r2 != r6) goto L_0x0202
        L_0x0201:
            r5 = 1
        L_0x0202:
            if (r5 == 0) goto L_0x021a
            android.graphics.Paint r2 = r13.f4774
            android.graphics.Path r5 = r13.f4772
            o.Ɨŧ$if r6 = r13.f4785
            o.ƭł r6 = r6.f4796
            android.graphics.RectF r7 = r13.f4790
            android.graphics.Rect r8 = r13.getBounds()
            r7.set(r8)
            android.graphics.RectF r7 = r13.f4790
            m5513(r14, r2, r5, r6, r7)
        L_0x021a:
            boolean r2 = r13.m5515()
            if (r2 == 0) goto L_0x024d
            android.graphics.Paint r2 = r13.f4792
            android.graphics.Path r5 = r13.f4784
            o.ƭł r6 = r13.f4786
            android.graphics.RectF r7 = r13.f4778
            android.graphics.RectF r8 = r13.f4790
            android.graphics.Rect r9 = r13.getBounds()
            r8.set(r9)
            android.graphics.RectF r8 = r13.f4790
            r7.set(r8)
            boolean r7 = r13.m5515()
            if (r7 == 0) goto L_0x0243
            android.graphics.Paint r4 = r13.f4792
            float r4 = r4.getStrokeWidth()
            float r4 = r4 / r3
        L_0x0243:
            android.graphics.RectF r3 = r13.f4778
            r3.inset(r4, r4)
            android.graphics.RectF r3 = r13.f4778
            m5513(r14, r2, r5, r6, r3)
        L_0x024d:
            android.graphics.Paint r14 = r13.f4774
            r14.setAlpha(r0)
            android.graphics.Paint r14 = r13.f4792
            r14.setAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0671.draw(android.graphics.Canvas):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5530(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m5513(canvas, paint, path, this.f4785.f4796, rectF);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m5513(Canvas canvas, Paint paint, Path path, C0785 r4, RectF rectF) {
        if (r4.m6132(rectF)) {
            float r3 = r4.f5219.m4787(rectF);
            canvas.drawRoundRect(rectF, r3, r3, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m5519(Canvas canvas) {
        if (this.f4785.f4814 != 0) {
            canvas.drawPath(this.f4772, this.f4779.f3847);
        }
        for (int i = 0; i < 4; i++) {
            this.f4780[i].m5861(C0723.C0727.f4954, this.f4779, this.f4785.f4798, canvas);
            this.f4791[i].m5861(C0723.C0727.f4954, this.f4779, this.f4785.f4798, canvas);
        }
        if (this.f4788) {
            int sin = (int) (((double) this.f4785.f4814) * Math.sin(Math.toRadians((double) this.f4785.f4810)));
            int cos = (int) (((double) this.f4785.f4814) * Math.cos(Math.toRadians((double) this.f4785.f4810)));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.f4772, f4771);
            canvas.translate((float) sin, (float) cos);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5527(RectF rectF, Path path) {
        this.f4776.m6145(this.f4785.f4796, this.f4785.f4807, rectF, this.f4777, path);
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f4785.f4797 != 2) {
            C0785 r0 = this.f4785.f4796;
            this.f4790.set(getBounds());
            if (r0.m6132(this.f4790)) {
                C0460 r02 = this.f4785.f4796.f5215;
                this.f4790.set(getBounds());
                outline.setRoundRect(getBounds(), r02.m4787(this.f4790));
                return;
            }
            this.f4790.set(getBounds());
            m5516(this.f4790, this.f4772);
            if (this.f4772.isConvex() || Build.VERSION.SDK_INT >= 29) {
                outline.setConvexPath(this.f4772);
            }
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean m5520() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4793;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4782;
        ColorStateList colorStateList = this.f4785.f4816;
        PorterDuff.Mode mode = this.f4785.f4799;
        this.f4793 = (colorStateList == null || mode == null) ? m5518(this.f4774, true) : new PorterDuffColorFilter(m5517(colorStateList.getColorForState(getState(), 0)), mode);
        ColorStateList colorStateList2 = this.f4785.f4813;
        PorterDuff.Mode mode2 = this.f4785.f4799;
        this.f4782 = (colorStateList2 == null || mode2 == null) ? m5518(this.f4792, false) : new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode2);
        if (this.f4785.f4802) {
            this.f4779.m4582(this.f4785.f4816.getColorForState(getState(), 0));
        }
        return !C2408.m12453(porterDuffColorFilter, this.f4793) || !C2408.m12453(porterDuffColorFilter2, this.f4782);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m5518(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.m5517((int) r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0671.m5518(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        if (this.f4785.f4816 != null && this.f4785.f4816.isStateful()) {
            return true;
        }
        if (this.f4785.f4813 != null && this.f4785.f4813.isStateful()) {
            return true;
        }
        if (this.f4785.f4811 == null || !this.f4785.f4811.isStateful()) {
            return this.f4785.f4804 != null && this.f4785.f4804.isStateful();
        }
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = m5514(iArr) || m5520();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m5514(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4785.f4804 == null || (color2 = this.f4774.getColor()) == (colorForState2 = this.f4785.f4804.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f4774.setColor(colorForState2);
            z = true;
        }
        if (this.f4785.f4811 == null || (color = this.f4792.getColor()) == (colorForState = this.f4785.f4811.getColorForState(iArr, color))) {
            return z;
        }
        this.f4792.setColor(colorForState);
        return true;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final float m5535() {
        C0460 r0 = this.f4785.f4796.f5215;
        this.f4790.set(getBounds());
        return r0.m4787(this.f4790);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final float m5534() {
        C0460 r0 = this.f4785.f4796.f5219;
        this.f4790.set(getBounds());
        return r0.m4787(this.f4790);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final float m5528() {
        C0460 r0 = this.f4785.f4796.f5222;
        this.f4790.set(getBounds());
        return r0.m4787(this.f4790);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final float m5523() {
        C0460 r0 = this.f4785.f4796.f5224;
        this.f4790.set(getBounds());
        return r0.m4787(this.f4790);
    }

    /* renamed from: o.Ɨŧ$if  reason: invalid class name */
    public static final class Cif extends Drawable.ConstantState {

        /* renamed from: ı  reason: contains not printable characters */
        public C0785 f4796;

        /* renamed from: ŀ  reason: contains not printable characters */
        public int f4797 = 0;

        /* renamed from: ł  reason: contains not printable characters */
        public int f4798 = 0;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public PorterDuff.Mode f4799 = PorterDuff.Mode.SRC_IN;

        /* renamed from: ǃ  reason: contains not printable characters */
        public ColorFilter f4800;

        /* renamed from: ȷ  reason: contains not printable characters */
        public float f4801 = 0.0f;

        /* renamed from: ɍ  reason: contains not printable characters */
        public boolean f4802 = false;

        /* renamed from: ɨ  reason: contains not printable characters */
        public float f4803 = 0.0f;

        /* renamed from: ɩ  reason: contains not printable characters */
        public ColorStateList f4804 = null;

        /* renamed from: ɪ  reason: contains not printable characters */
        public int f4805 = 255;

        /* renamed from: ɹ  reason: contains not printable characters */
        public float f4806 = 1.0f;

        /* renamed from: ɾ  reason: contains not printable characters */
        public float f4807 = 1.0f;

        /* renamed from: ɿ  reason: contains not printable characters */
        public float f4808 = 0.0f;

        /* renamed from: ʅ  reason: contains not printable characters */
        public Paint.Style f4809 = Paint.Style.FILL_AND_STROKE;

        /* renamed from: ʟ  reason: contains not printable characters */
        public int f4810 = 0;

        /* renamed from: Ι  reason: contains not printable characters */
        public ColorStateList f4811 = null;

        /* renamed from: ι  reason: contains not printable characters */
        public C2610 f4812;

        /* renamed from: І  reason: contains not printable characters */
        public ColorStateList f4813 = null;

        /* renamed from: г  reason: contains not printable characters */
        public int f4814 = 0;

        /* renamed from: і  reason: contains not printable characters */
        public Rect f4815 = null;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public ColorStateList f4816 = null;

        /* renamed from: ӏ  reason: contains not printable characters */
        public float f4817;

        public final int getChangingConfigurations() {
            return 0;
        }

        public Cif(C0785 r3) {
            this.f4796 = r3;
            this.f4812 = null;
        }

        public Cif(Cif ifVar) {
            this.f4796 = ifVar.f4796;
            this.f4812 = ifVar.f4812;
            this.f4817 = ifVar.f4817;
            this.f4800 = ifVar.f4800;
            this.f4804 = ifVar.f4804;
            this.f4811 = ifVar.f4811;
            this.f4799 = ifVar.f4799;
            this.f4816 = ifVar.f4816;
            this.f4805 = ifVar.f4805;
            this.f4806 = ifVar.f4806;
            this.f4814 = ifVar.f4814;
            this.f4797 = ifVar.f4797;
            this.f4802 = ifVar.f4802;
            this.f4807 = ifVar.f4807;
            this.f4801 = ifVar.f4801;
            this.f4803 = ifVar.f4803;
            this.f4808 = ifVar.f4808;
            this.f4798 = ifVar.f4798;
            this.f4810 = ifVar.f4810;
            this.f4813 = ifVar.f4813;
            this.f4809 = ifVar.f4809;
            Rect rect = ifVar.f4815;
            if (rect != null) {
                this.f4815 = new Rect(rect);
            }
        }

        public final Drawable newDrawable() {
            C0671 r0 = new C0671(this, (byte) 0);
            r0.f4787 = true;
            return r0;
        }
    }

    public C0671(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new C0785(C0785.m6131(context, attributeSet, i, i2, new C0531(0.0f)), (byte) 0));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5532(float f, int i) {
        this.f4785.f4817 = f;
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f4785.f4811 != valueOf) {
            this.f4785.f4811 = valueOf;
            onStateChange(getState());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5525(float f, ColorStateList colorStateList) {
        this.f4785.f4817 = f;
        invalidateSelf();
        if (this.f4785.f4811 != colorStateList) {
            this.f4785.f4811 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m5517(int i) {
        return this.f4785.f4812 != null ? this.f4785.f4812.m13834(i, this.f4785.f4803 + this.f4785.f4808 + this.f4785.f4801) : i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5521() {
        float f = this.f4785.f4803 + this.f4785.f4808;
        this.f4785.f4798 = (int) Math.ceil((double) (0.75f * f));
        this.f4785.f4814 = (int) Math.ceil((double) (f * 0.25f));
        m5520();
        super.invalidateSelf();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m5516(RectF rectF, Path path) {
        this.f4776.m6145(this.f4785.f4796, this.f4785.f4807, rectF, this.f4777, path);
        if (this.f4785.f4806 != 1.0f) {
            this.f4775.reset();
            this.f4775.setScale(this.f4785.f4806, this.f4785.f4806, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4775);
        }
        path.computeBounds(this.f4783, true);
    }
}
