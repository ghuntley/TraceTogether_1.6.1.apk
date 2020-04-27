package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.C3177;

/* renamed from: o.ΙŁ  reason: contains not printable characters */
public class C1789 extends C0671 implements Drawable.Callback, C3177.If {

    /* renamed from: ʕ  reason: contains not printable characters */
    private static final int[] f9139 = {16842910};

    /* renamed from: ʖ  reason: contains not printable characters */
    private static final ShapeDrawable f9140 = new ShapeDrawable(new OvalShape());

    /* renamed from: ı  reason: contains not printable characters */
    ColorStateList f9141;

    /* renamed from: ıı  reason: contains not printable characters */
    private Drawable f9142;

    /* renamed from: ıǃ  reason: contains not printable characters */
    private int f9143;

    /* renamed from: ıɩ  reason: contains not printable characters */
    private PorterDuff.Mode f9144 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ıι  reason: contains not printable characters */
    private int[] f9145;

    /* renamed from: ŀ  reason: contains not printable characters */
    float f9146;

    /* renamed from: ł  reason: contains not printable characters */
    float f9147;

    /* renamed from: ſ  reason: contains not printable characters */
    final Context f9148;

    /* renamed from: Ɩ  reason: contains not printable characters */
    CharSequence f9149;

    /* renamed from: Ɨ  reason: contains not printable characters */
    float f9150;

    /* renamed from: ƚ  reason: contains not printable characters */
    float f9151;

    /* renamed from: ǀ  reason: contains not printable characters */
    WeakReference<C1790> f9152 = new WeakReference<>((Object) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    ColorStateList f9153;

    /* renamed from: ǃı  reason: contains not printable characters */
    private final RectF f9154 = new RectF();

    /* renamed from: ǃǃ  reason: contains not printable characters */
    private int f9155;

    /* renamed from: ȷ  reason: contains not printable characters */
    CharSequence f9156;

    /* renamed from: ɂ  reason: contains not printable characters */
    private final Path f9157 = new Path();

    /* renamed from: Ɉ  reason: contains not printable characters */
    private final PointF f9158 = new PointF();

    /* renamed from: ɉ  reason: contains not printable characters */
    private int f9159;

    /* renamed from: ɍ  reason: contains not printable characters */
    float f9160;

    /* renamed from: ɔ  reason: contains not printable characters */
    boolean f9161;

    /* renamed from: ɟ  reason: contains not printable characters */
    ColorStateList f9162;

    /* renamed from: ɨ  reason: contains not printable characters */
    boolean f9163;

    /* renamed from: ɩ  reason: contains not printable characters */
    ColorStateList f9164;

    /* renamed from: ɪ  reason: contains not printable characters */
    boolean f9165;

    /* renamed from: ɹ  reason: contains not printable characters */
    boolean f9166;

    /* renamed from: ɺ  reason: contains not printable characters */
    boolean f9167;

    /* renamed from: ɻ  reason: contains not printable characters */
    private ColorStateList f9168;

    /* renamed from: ɼ  reason: contains not printable characters */
    final C3177 f9169;

    /* renamed from: ɾ  reason: contains not printable characters */
    Drawable f9170;

    /* renamed from: ɿ  reason: contains not printable characters */
    float f9171;

    /* renamed from: ʃ  reason: contains not printable characters */
    private int f9172;

    /* renamed from: ʅ  reason: contains not printable characters */
    float f9173;

    /* renamed from: ʌ  reason: contains not printable characters */
    private int f9174;

    /* renamed from: ʏ  reason: contains not printable characters */
    private float f9175;

    /* renamed from: ʔ  reason: contains not printable characters */
    private ColorStateList f9176;

    /* renamed from: ʟ  reason: contains not printable characters */
    float f9177;

    /* renamed from: ͻ  reason: contains not printable characters */
    int f9178;

    /* renamed from: ͼ  reason: contains not printable characters */
    private int f9179;

    /* renamed from: ͽ  reason: contains not printable characters */
    private int f9180;

    /* renamed from: Γ  reason: contains not printable characters */
    private boolean f9181;

    /* renamed from: Ι  reason: contains not printable characters */
    float f9182;

    /* renamed from: Ξ  reason: contains not printable characters */
    private ColorStateList f9183;

    /* renamed from: ι  reason: contains not printable characters */
    float f9184;

    /* renamed from: ς  reason: contains not printable characters */
    private int f9185 = 255;

    /* renamed from: τ  reason: contains not printable characters */
    private final Paint f9186 = new Paint(1);

    /* renamed from: ϛ  reason: contains not printable characters */
    private PorterDuffColorFilter f9187;

    /* renamed from: ϳ  reason: contains not printable characters */
    boolean f9188;

    /* renamed from: І  reason: contains not printable characters */
    boolean f9189;

    /* renamed from: Ј  reason: contains not printable characters */
    boolean f9190;

    /* renamed from: Г  reason: contains not printable characters */
    private ColorStateList f9191;

    /* renamed from: г  reason: contains not printable characters */
    Drawable f9192;

    /* renamed from: с  reason: contains not printable characters */
    TextUtils.TruncateAt f9193;

    /* renamed from: ч  reason: contains not printable characters */
    private ColorFilter f9194;

    /* renamed from: і  reason: contains not printable characters */
    Drawable f9195;

    /* renamed from: Ӏ  reason: contains not printable characters */
    float f9196;

    /* renamed from: ӏ  reason: contains not printable characters */
    float f9197;

    /* renamed from: ӷ  reason: contains not printable characters */
    private final Paint.FontMetrics f9198 = new Paint.FontMetrics();

    /* renamed from: o.ΙŁ$ǃ  reason: contains not printable characters */
    public interface C1790 {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m9953();
    }

    public int getOpacity() {
        return -3;
    }

    C1789(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.f175072131952257);
        m5522(context);
        this.f9148 = context;
        this.f9169 = new C3177(this);
        this.f9149 = "";
        this.f9169.f14435.density = context.getResources().getDisplayMetrics().density;
        setState(f9139);
        m9931(f9139);
        this.f9190 = true;
        if (C0410.f3979) {
            f9140.setTint(-1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getIntrinsicWidth() {
        /*
            r8 = this;
            float r0 = r8.f9147
            boolean r1 = r8.f9166
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r1 = r8.f9195
            if (r1 == 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            r4 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r8.f9165
            if (r1 == 0) goto L_0x0020
            android.graphics.drawable.Drawable r1 = r8.f9192
            if (r1 == 0) goto L_0x0020
            boolean r1 = r8.f9167
            if (r1 == 0) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x002e
        L_0x0026:
            float r1 = r8.f9146
            float r5 = r8.f9196
            float r1 = r1 + r5
            float r5 = r8.f9177
            float r1 = r1 + r5
        L_0x002e:
            float r0 = r0 + r1
            float r1 = r8.f9171
            float r0 = r0 + r1
            o.ջ r1 = r8.f9169
            java.lang.CharSequence r5 = r8.f9149
            java.lang.String r5 = r5.toString()
            boolean r6 = r1.f14432
            if (r6 != 0) goto L_0x0041
            float r1 = r1.f14434
            goto L_0x0055
        L_0x0041:
            if (r5 != 0) goto L_0x0045
            r5 = 0
            goto L_0x004f
        L_0x0045:
            android.text.TextPaint r6 = r1.f14435
            int r7 = r5.length()
            float r5 = r6.measureText(r5, r3, r7)
        L_0x004f:
            r1.f14434 = r5
            r1.f14432 = r3
            float r1 = r1.f14434
        L_0x0055:
            float r0 = r0 + r1
            float r1 = r8.f9160
            float r0 = r0 + r1
            boolean r1 = r8.f9189
            if (r1 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r1 = r8.f9170
            if (r1 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x006e
            float r1 = r8.f9151
            float r2 = r8.f9197
            float r1 = r1 + r2
            float r2 = r8.f9150
            float r4 = r1 + r2
        L_0x006e:
            float r0 = r0 + r4
            float r1 = r8.f9173
            float r0 = r0 + r1
            int r0 = java.lang.Math.round(r0)
            int r1 = r8.f9178
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1789.getIntrinsicWidth():int");
    }

    public int getIntrinsicHeight() {
        return (int) this.f9184;
    }

    public void draw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            if (this.f9185 < 255) {
                float f3 = (float) bounds.left;
                float f4 = (float) bounds.top;
                float f5 = (float) bounds.right;
                float f6 = (float) bounds.bottom;
                int i4 = this.f9185;
                if (Build.VERSION.SDK_INT > 21) {
                    i3 = canvas.saveLayerAlpha(f3, f4, f5, f6, i4);
                } else {
                    i3 = canvas.saveLayerAlpha(f3, f4, f5, f6, i4, 31);
                }
                i = i3;
            } else {
                i = 0;
            }
            if (!this.f9188) {
                this.f9186.setColor(this.f9155);
                this.f9186.setStyle(Paint.Style.FILL);
                this.f9154.set(bounds);
                canvas2.drawRoundRect(this.f9154, this.f9188 ? m5535() : this.f9182, this.f9188 ? m5535() : this.f9182, this.f9186);
            }
            if (!this.f9188) {
                this.f9186.setColor(this.f9143);
                this.f9186.setStyle(Paint.Style.FILL);
                Paint paint = this.f9186;
                ColorFilter colorFilter = this.f9194;
                if (colorFilter == null) {
                    colorFilter = this.f9187;
                }
                paint.setColorFilter(colorFilter);
                this.f9154.set(bounds);
                canvas2.drawRoundRect(this.f9154, this.f9188 ? m5535() : this.f9182, this.f9188 ? m5535() : this.f9182, this.f9186);
            }
            if (this.f9188) {
                super.draw(canvas);
            }
            float f7 = 0.0f;
            if (this.f9175 > 0.0f && !this.f9188) {
                this.f9186.setColor(this.f9174);
                this.f9186.setStyle(Paint.Style.STROKE);
                if (!this.f9188) {
                    Paint paint2 = this.f9186;
                    ColorFilter colorFilter2 = this.f9194;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f9187;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                this.f9154.set(((float) bounds.left) + (this.f9175 / 2.0f), ((float) bounds.top) + (this.f9175 / 2.0f), ((float) bounds.right) - (this.f9175 / 2.0f), ((float) bounds.bottom) - (this.f9175 / 2.0f));
                float f8 = this.f9182 - (this.f9175 / 2.0f);
                canvas2.drawRoundRect(this.f9154, f8, f8, this.f9186);
            }
            this.f9186.setColor(this.f9172);
            this.f9186.setStyle(Paint.Style.FILL);
            this.f9154.set(bounds);
            boolean z = this.f9188;
            if (!z) {
                RectF rectF = this.f9154;
                if (z) {
                    f2 = m5535();
                } else {
                    f2 = this.f9182;
                }
                canvas2.drawRoundRect(rectF, f2, this.f9188 ? m5535() : this.f9182, this.f9186);
            } else {
                m5527(new RectF(bounds), this.f9157);
                Paint paint3 = this.f9186;
                Path path = this.f9157;
                this.f4790.set(getBounds());
                super.m5530(canvas2, paint3, path, this.f4790);
            }
            if (this.f9166 && this.f9195 != null) {
                m9921(bounds, this.f9154);
                float f9 = this.f9154.left;
                float f10 = this.f9154.top;
                canvas2.translate(f9, f10);
                this.f9195.setBounds(0, 0, (int) this.f9154.width(), (int) this.f9154.height());
                this.f9195.draw(canvas2);
                canvas2.translate(-f9, -f10);
            }
            if (this.f9165 && this.f9192 != null && this.f9167) {
                m9921(bounds, this.f9154);
                float f11 = this.f9154.left;
                float f12 = this.f9154.top;
                canvas2.translate(f11, f12);
                this.f9192.setBounds(0, 0, (int) this.f9154.width(), (int) this.f9154.height());
                this.f9192.draw(canvas2);
                canvas2.translate(-f11, -f12);
            }
            if (this.f9190 && this.f9149 != null) {
                PointF pointF = this.f9158;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.f9149 != null) {
                    float r3 = this.f9147 + m9926() + this.f9171;
                    if (C1266.m8143(this) == 0) {
                        pointF.x = ((float) bounds.left) + r3;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - r3;
                        align = Paint.Align.RIGHT;
                    }
                    this.f9169.f14435.getFontMetrics(this.f9198);
                    pointF.y = ((float) bounds.centerY()) - ((this.f9198.descent + this.f9198.ascent) / 2.0f);
                }
                RectF rectF2 = this.f9154;
                rectF2.setEmpty();
                if (this.f9149 != null) {
                    float r4 = this.f9147 + m9926() + this.f9171;
                    float r5 = this.f9173 + m9923() + this.f9160;
                    if (C1266.m8143(this) == 0) {
                        rectF2.left = ((float) bounds.left) + r4;
                        rectF2.right = ((float) bounds.right) - r5;
                    } else {
                        rectF2.left = ((float) bounds.left) + r5;
                        rectF2.right = ((float) bounds.right) - r4;
                    }
                    rectF2.top = (float) bounds.top;
                    rectF2.bottom = (float) bounds.bottom;
                }
                if (this.f9169.f14436 != null) {
                    this.f9169.f14435.drawableState = getState();
                    C3177 r1 = this.f9169;
                    r1.f14436.m4291(this.f9148, r1.f14435, r1.f14433);
                }
                this.f9169.f14435.setTextAlign(align);
                C3177 r12 = this.f9169;
                String charSequence = this.f9149.toString();
                if (!r12.f14432) {
                    f = r12.f14434;
                } else {
                    if (charSequence != null) {
                        f7 = r12.f14435.measureText(charSequence, 0, charSequence.length());
                    }
                    r12.f14434 = f7;
                    r12.f14432 = false;
                    f = r12.f14434;
                }
                boolean z2 = Math.round(f) > Math.round(this.f9154.width());
                if (z2) {
                    int save = canvas.save();
                    canvas2.clipRect(this.f9154);
                    i2 = save;
                } else {
                    i2 = 0;
                }
                CharSequence charSequence2 = this.f9149;
                if (z2 && this.f9193 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, this.f9169.f14435, this.f9154.width(), this.f9193);
                }
                CharSequence charSequence3 = charSequence2;
                int i5 = i2;
                canvas.drawText(charSequence3, 0, charSequence3.length(), this.f9158.x, this.f9158.y, this.f9169.f14435);
                if (z2) {
                    canvas2.restoreToCount(i5);
                }
            }
            if (this.f9189 && this.f9170 != null) {
                RectF rectF3 = this.f9154;
                rectF3.setEmpty();
                if (this.f9189 && this.f9170 != null) {
                    float f13 = this.f9173 + this.f9150;
                    if (C1266.m8143(this) == 0) {
                        rectF3.right = ((float) bounds.right) - f13;
                        rectF3.left = rectF3.right - this.f9197;
                    } else {
                        rectF3.left = ((float) bounds.left) + f13;
                        rectF3.right = rectF3.left + this.f9197;
                    }
                    rectF3.top = bounds.exactCenterY() - (this.f9197 / 2.0f);
                    rectF3.bottom = rectF3.top + this.f9197;
                }
                float f14 = this.f9154.left;
                float f15 = this.f9154.top;
                canvas2.translate(f14, f15);
                this.f9170.setBounds(0, 0, (int) this.f9154.width(), (int) this.f9154.height());
                if (C0410.f3979) {
                    this.f9142.setBounds(this.f9170.getBounds());
                    this.f9142.jumpToCurrentState();
                    this.f9142.draw(canvas2);
                } else {
                    this.f9170.draw(canvas2);
                }
                canvas2.translate(-f14, -f15);
            }
            if (this.f9185 < 255) {
                canvas2.restoreToCount(i);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9921(Rect rect, RectF rectF) {
        rectF.setEmpty();
        boolean z = true;
        if (!(this.f9166 && this.f9195 != null)) {
            if (!this.f9165 || this.f9192 == null || !this.f9167) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        float f = this.f9147 + this.f9146;
        if (C1266.m8143(this) == 0) {
            rectF.left = ((float) rect.left) + f;
            rectF.right = rectF.left + this.f9196;
        } else {
            rectF.right = ((float) rect.right) - f;
            rectF.left = rectF.right - this.f9196;
        }
        rectF.top = rect.exactCenterY() - (this.f9196 / 2.0f);
        rectF.bottom = rectF.top + this.f9196;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9935(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f9189 && this.f9170 != null) {
            float f = this.f9173 + this.f9150 + this.f9197 + this.f9151 + this.f9160;
            if (C1266.m8143(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f;
            } else {
                rectF.left = (float) rect.left;
                rectF.right = ((float) rect.left) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0040, code lost:
        if ((r0 != null && r0.isStateful()) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.f9164
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != 0) goto L_0x0099
            android.content.res.ColorStateList r0 = r4.f9141
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0099
            android.content.res.ColorStateList r0 = r4.f9168
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0099
            boolean r0 = r4.f9161
            if (r0 == 0) goto L_0x0042
            android.content.res.ColorStateList r0 = r4.f9162
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 != 0) goto L_0x0099
        L_0x0042:
            o.ջ r0 = r4.f9169
            o.ıƩ r0 = r0.f14436
            if (r0 == 0) goto L_0x0056
            android.content.res.ColorStateList r3 = r0.f3585
            if (r3 == 0) goto L_0x0056
            android.content.res.ColorStateList r0 = r0.f3585
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 != 0) goto L_0x0099
            boolean r0 = r4.f9165
            if (r0 == 0) goto L_0x0067
            android.graphics.drawable.Drawable r0 = r4.f9192
            if (r0 == 0) goto L_0x0067
            boolean r0 = r4.f9163
            if (r0 == 0) goto L_0x0067
            r0 = 1
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r0 != 0) goto L_0x0099
            android.graphics.drawable.Drawable r0 = r4.f9195
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r0 != 0) goto L_0x0099
            android.graphics.drawable.Drawable r0 = r4.f9192
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0085
            r0 = 1
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r0 != 0) goto L_0x0099
            android.content.res.ColorStateList r0 = r4.f9183
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0094
            r0 = 1
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            if (r0 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            return r2
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1789.isStateful():boolean");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m9931(int[] iArr) {
        if (!Arrays.equals(this.f9145, iArr)) {
            this.f9145 = iArr;
            if (this.f9189 && this.f9170 != null) {
                return m9925(getState(), iArr);
            }
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f9188) {
            super.onStateChange(iArr);
        }
        return m9925(iArr, this.f9145);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0130  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9925(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f9164
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f9155
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f9155
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f9155 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f9141
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f9143
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f9143
            if (r5 == r3) goto L_0x002c
            r6.f9143 = r3
            r0 = 1
        L_0x002c:
            int r1 = o.C0960.m6875(r3, r1)
            int r3 = r6.f9179
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            o.Ɨŧ$if r5 = r6.f4785
            android.content.res.ColorStateList r5 = r5.f4804
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x005d
            r6.f9179 = r1
            int r0 = r6.f9179
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            o.Ɨŧ$if r1 = r6.f4785
            android.content.res.ColorStateList r1 = r1.f4804
            if (r1 == r0) goto L_0x005c
            o.Ɨŧ$if r1 = r6.f4785
            r1.f4804 = r0
            int[] r0 = r6.getState()
            r6.onStateChange(r0)
        L_0x005c:
            r0 = 1
        L_0x005d:
            android.content.res.ColorStateList r1 = r6.f9168
            if (r1 == 0) goto L_0x0068
            int r3 = r6.f9174
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r3 = r6.f9174
            if (r3 == r1) goto L_0x0070
            r6.f9174 = r1
            r0 = 1
        L_0x0070:
            android.content.res.ColorStateList r1 = r6.f9162
            if (r1 == 0) goto L_0x0083
            boolean r1 = o.C0410.m4697(r7)
            if (r1 == 0) goto L_0x0083
            android.content.res.ColorStateList r1 = r6.f9162
            int r3 = r6.f9172
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            int r3 = r6.f9172
            if (r3 == r1) goto L_0x008f
            r6.f9172 = r1
            boolean r1 = r6.f9161
            if (r1 == 0) goto L_0x008f
            r0 = 1
        L_0x008f:
            o.ջ r1 = r6.f9169
            o.ıƩ r1 = r1.f14436
            if (r1 == 0) goto L_0x00aa
            o.ջ r1 = r6.f9169
            o.ıƩ r1 = r1.f14436
            android.content.res.ColorStateList r1 = r1.f3585
            if (r1 == 0) goto L_0x00aa
            o.ջ r1 = r6.f9169
            o.ıƩ r1 = r1.f14436
            android.content.res.ColorStateList r1 = r1.f3585
            int r3 = r6.f9180
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00ab
        L_0x00aa:
            r1 = 0
        L_0x00ab:
            int r3 = r6.f9180
            if (r3 == r1) goto L_0x00b2
            r6.f9180 = r1
            r0 = 1
        L_0x00b2:
            int[] r1 = r6.getState()
            boolean r1 = m9924((int[]) r1)
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r6.f9163
            if (r1 == 0) goto L_0x00c2
            r1 = 1
            goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            boolean r3 = r6.f9167
            if (r3 == r1) goto L_0x00dd
            android.graphics.drawable.Drawable r3 = r6.f9192
            if (r3 == 0) goto L_0x00dd
            float r0 = r6.m9926()
            r6.f9167 = r1
            float r1 = r6.m9926()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            r0 = 1
            r1 = 1
            goto L_0x00de
        L_0x00dc:
            r0 = 1
        L_0x00dd:
            r1 = 0
        L_0x00de:
            android.content.res.ColorStateList r3 = r6.f9183
            if (r3 == 0) goto L_0x00e9
            int r5 = r6.f9159
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00ea
        L_0x00e9:
            r3 = 0
        L_0x00ea:
            int r5 = r6.f9159
            if (r5 == r3) goto L_0x010b
            r6.f9159 = r3
            android.content.res.ColorStateList r0 = r6.f9183
            android.graphics.PorterDuff$Mode r3 = r6.f9144
            if (r0 == 0) goto L_0x0107
            if (r3 != 0) goto L_0x00f9
            goto L_0x0107
        L_0x00f9:
            int[] r5 = r6.getState()
            int r0 = r0.getColorForState(r5, r2)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r0, r3)
            goto L_0x0108
        L_0x0107:
            r5 = 0
        L_0x0108:
            r6.f9187 = r5
            r0 = 1
        L_0x010b:
            android.graphics.drawable.Drawable r3 = r6.f9195
            if (r3 == 0) goto L_0x0117
            boolean r3 = r3.isStateful()
            if (r3 == 0) goto L_0x0117
            r3 = 1
            goto L_0x0118
        L_0x0117:
            r3 = 0
        L_0x0118:
            if (r3 == 0) goto L_0x0121
            android.graphics.drawable.Drawable r3 = r6.f9195
            boolean r3 = r3.setState(r7)
            r0 = r0 | r3
        L_0x0121:
            android.graphics.drawable.Drawable r3 = r6.f9192
            if (r3 == 0) goto L_0x012d
            boolean r3 = r3.isStateful()
            if (r3 == 0) goto L_0x012d
            r3 = 1
            goto L_0x012e
        L_0x012d:
            r3 = 0
        L_0x012e:
            if (r3 == 0) goto L_0x0137
            android.graphics.drawable.Drawable r3 = r6.f9192
            boolean r3 = r3.setState(r7)
            r0 = r0 | r3
        L_0x0137:
            android.graphics.drawable.Drawable r3 = r6.f9170
            if (r3 == 0) goto L_0x0143
            boolean r3 = r3.isStateful()
            if (r3 == 0) goto L_0x0143
            r3 = 1
            goto L_0x0144
        L_0x0143:
            r3 = 0
        L_0x0144:
            if (r3 == 0) goto L_0x015b
            int r3 = r7.length
            int r5 = r8.length
            int r3 = r3 + r5
            int[] r3 = new int[r3]
            int r5 = r7.length
            java.lang.System.arraycopy(r7, r2, r3, r2, r5)
            int r7 = r7.length
            int r5 = r8.length
            java.lang.System.arraycopy(r8, r2, r3, r7, r5)
            android.graphics.drawable.Drawable r7 = r6.f9170
            boolean r7 = r7.setState(r3)
            r0 = r0 | r7
        L_0x015b:
            boolean r7 = o.C0410.f3979
            if (r7 == 0) goto L_0x0173
            android.graphics.drawable.Drawable r7 = r6.f9142
            if (r7 == 0) goto L_0x016a
            boolean r7 = r7.isStateful()
            if (r7 == 0) goto L_0x016a
            r2 = 1
        L_0x016a:
            if (r2 == 0) goto L_0x0173
            android.graphics.drawable.Drawable r7 = r6.f9142
            boolean r7 = r7.setState(r8)
            r0 = r0 | r7
        L_0x0173:
            if (r0 == 0) goto L_0x0178
            r6.invalidateSelf()
        L_0x0178:
            if (r1 == 0) goto L_0x0187
            java.lang.ref.WeakReference<o.ΙŁ$ǃ> r7 = r6.f9152
            java.lang.Object r7 = r7.get()
            o.ΙŁ$ǃ r7 = (o.C1789.C1790) r7
            if (r7 == 0) goto L_0x0187
            r7.m9953()
        L_0x0187:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1789.m9925(int[], int[]):boolean");
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        boolean z = false;
        if (this.f9166 && this.f9195 != null) {
            onLayoutDirectionChanged |= C1266.m8157(this.f9195, i);
        }
        if (this.f9165 && this.f9192 != null && this.f9167) {
            onLayoutDirectionChanged |= C1266.m8157(this.f9192, i);
        }
        if (this.f9189 && this.f9170 != null) {
            z = true;
        }
        if (z) {
            onLayoutDirectionChanged |= C1266.m8157(this.f9170, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        boolean z = true;
        if (this.f9166 && this.f9195 != null) {
            onLevelChange |= this.f9195.setLevel(i);
        }
        if (this.f9165 && this.f9192 != null && this.f9167) {
            onLevelChange |= this.f9192.setLevel(i);
        }
        if (!this.f9189 || this.f9170 == null) {
            z = false;
        }
        if (z) {
            onLevelChange |= this.f9170.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        boolean z3 = true;
        if (this.f9166 && this.f9195 != null) {
            visible |= this.f9195.setVisible(z, z2);
        }
        if (this.f9165 && this.f9192 != null && this.f9167) {
            visible |= this.f9192.setVisible(z, z2);
        }
        if (!this.f9189 || this.f9170 == null) {
            z3 = false;
        }
        if (z3) {
            visible |= this.f9170.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void setAlpha(int i) {
        if (this.f9185 != i) {
            this.f9185 = i;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f9185;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f9194 != colorFilter) {
            this.f9194 = colorFilter;
            invalidateSelf();
        }
    }

    public ColorFilter getColorFilter() {
        return this.f9194;
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f9183 != colorStateList) {
            this.f9183 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f9144 != mode) {
            this.f9144 = mode;
            ColorStateList colorStateList = this.f9183;
            this.f9187 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9188) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f9182);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f9182);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9922(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C1266.m8157(drawable, C1266.m8143(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f9170) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f9145);
                }
                C1266.m8152(drawable, this.f9191);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f9195;
            if (drawable == drawable2 && this.f9181) {
                C1266.m8152(drawable2, this.f9176);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m9924(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == 16842912) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9944(float f) {
        if (this.f9184 != f) {
            this.f9184 = f;
            invalidateSelf();
            C1790 r2 = this.f9152.get();
            if (r2 != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9928(ColorStateList colorStateList) {
        if (this.f9168 != colorStateList) {
            this.f9168 = colorStateList;
            if (this.f9188 && this.f4785.f4811 != colorStateList) {
                this.f4785.f4811 = colorStateList;
                onStateChange(getState());
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9927(float f) {
        if (this.f9175 != f) {
            this.f9175 = f;
            this.f9186.setStrokeWidth(f);
            if (this.f9188) {
                this.f4785.f4817 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9929(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f9149, charSequence)) {
            this.f9149 = charSequence;
            this.f9169.f14432 = true;
            invalidateSelf();
            C1790 r2 = this.f9152.get();
            if (r2 != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9949(boolean z) {
        boolean z2 = this.f9166;
        if (z2 != z) {
            boolean z3 = true;
            boolean z4 = z2 && this.f9195 != null;
            this.f9166 = z;
            boolean z5 = this.f9166 && this.f9195 != null;
            if (z4 == z5) {
                z3 = false;
            }
            if (z3) {
                if (z5) {
                    m9922(this.f9195);
                } else {
                    Drawable drawable = this.f9195;
                    if (drawable != null) {
                        drawable.setCallback((Drawable.Callback) null);
                    }
                }
                invalidateSelf();
                C1790 r4 = this.f9152.get();
                if (r4 != null) {
                    r4.m9953();
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9947(ColorStateList colorStateList) {
        boolean z = true;
        this.f9181 = true;
        if (this.f9176 != colorStateList) {
            this.f9176 = colorStateList;
            if (!this.f9166 || this.f9195 == null) {
                z = false;
            }
            if (z) {
                C1266.m8152(this.f9195, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9933(float f) {
        C1790 r2;
        if (this.f9196 != f) {
            float r0 = m9926();
            this.f9196 = f;
            float r22 = m9926();
            invalidateSelf();
            if (r0 != r22 && (r2 = this.f9152.get()) != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9930(boolean z) {
        boolean z2 = this.f9189;
        if (z2 != z) {
            boolean z3 = true;
            boolean z4 = z2 && this.f9170 != null;
            this.f9189 = z;
            boolean z5 = this.f9189 && this.f9170 != null;
            if (z4 == z5) {
                z3 = false;
            }
            if (z3) {
                if (z5) {
                    m9922(this.f9170);
                } else {
                    Drawable drawable = this.f9170;
                    if (drawable != null) {
                        drawable.setCallback((Drawable.Callback) null);
                    }
                }
                invalidateSelf();
                C1790 r4 = this.f9152.get();
                if (r4 != null) {
                    r4.m9953();
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9934(ColorStateList colorStateList) {
        if (this.f9191 != colorStateList) {
            this.f9191 = colorStateList;
            if (this.f9189 && this.f9170 != null) {
                C1266.m8152(this.f9170, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9940(float f) {
        C1790 r2;
        if (this.f9197 != f) {
            this.f9197 = f;
            invalidateSelf();
            if ((this.f9189 && this.f9170 != null) && (r2 = this.f9152.get()) != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9937(boolean z) {
        C1790 r2;
        if (this.f9163 != z) {
            this.f9163 = z;
            float r0 = m9926();
            if (!z && this.f9167) {
                this.f9167 = false;
            }
            float r22 = m9926();
            invalidateSelf();
            if (r0 != r22 && (r2 = this.f9152.get()) != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9945(boolean z) {
        boolean z2 = this.f9165;
        if (z2 != z) {
            boolean z3 = true;
            boolean z4 = z2 && this.f9192 != null && this.f9167;
            this.f9165 = z;
            boolean z5 = this.f9165 && this.f9192 != null && this.f9167;
            if (z4 == z5) {
                z3 = false;
            }
            if (z3) {
                if (z5) {
                    m9922(this.f9192);
                } else {
                    Drawable drawable = this.f9192;
                    if (drawable != null) {
                        drawable.setCallback((Drawable.Callback) null);
                    }
                }
                invalidateSelf();
                C1790 r4 = this.f9152.get();
                if (r4 != null) {
                    r4.m9953();
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9948(Drawable drawable) {
        C1790 r4;
        if (this.f9192 != drawable) {
            float r0 = m9926();
            this.f9192 = drawable;
            float r42 = m9926();
            Drawable drawable2 = this.f9192;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            m9922(this.f9192);
            invalidateSelf();
            if (r0 != r42 && (r4 = this.f9152.get()) != null) {
                r4.m9953();
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9946(float f) {
        if (this.f9147 != f) {
            this.f9147 = f;
            invalidateSelf();
            C1790 r2 = this.f9152.get();
            if (r2 != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m9942(float f) {
        C1790 r2;
        if (this.f9146 != f) {
            float r0 = m9926();
            this.f9146 = f;
            float r22 = m9926();
            invalidateSelf();
            if (r0 != r22 && (r2 = this.f9152.get()) != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m9951(float f) {
        C1790 r2;
        if (this.f9177 != f) {
            float r0 = m9926();
            this.f9177 = f;
            float r22 = m9926();
            invalidateSelf();
            if (r0 != r22 && (r2 = this.f9152.get()) != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public final void m9950(float f) {
        if (this.f9171 != f) {
            this.f9171 = f;
            invalidateSelf();
            C1790 r2 = this.f9152.get();
            if (r2 != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m9932(float f) {
        if (this.f9160 != f) {
            this.f9160 = f;
            invalidateSelf();
            C1790 r2 = this.f9152.get();
            if (r2 != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final void m9952(float f) {
        C1790 r2;
        if (this.f9151 != f) {
            this.f9151 = f;
            invalidateSelf();
            if ((this.f9189 && this.f9170 != null) && (r2 = this.f9152.get()) != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final void m9943(float f) {
        C1790 r2;
        if (this.f9150 != f) {
            this.f9150 = f;
            invalidateSelf();
            if ((this.f9189 && this.f9170 != null) && (r2 = this.f9152.get()) != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public final void m9938(float f) {
        if (this.f9173 != f) {
            this.f9173 = f;
            invalidateSelf();
            C1790 r2 = this.f9152.get();
            if (r2 != null) {
                r2.m9953();
            }
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private float m9926() {
        boolean z = true;
        if (!(this.f9166 && this.f9195 != null)) {
            if (!this.f9165 || this.f9192 == null || !this.f9167) {
                z = false;
            }
            if (!z) {
                return 0.0f;
            }
        }
        return this.f9146 + this.f9196 + this.f9177;
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private float m9923() {
        if (this.f9189 && this.f9170 != null) {
            return this.f9151 + this.f9197 + this.f9150;
        }
        return 0.0f;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9939() {
        C1790 r0 = this.f9152.get();
        if (r0 != null) {
            r0.m9953();
        }
        invalidateSelf();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9941(Drawable drawable) {
        C1790 r4;
        Drawable drawable2 = this.f9195;
        Drawable r0 = drawable2 != null ? C1266.m8149(drawable2) : null;
        if (r0 != drawable) {
            float r2 = m9926();
            this.f9195 = drawable != null ? C1266.m8158(drawable).mutate() : null;
            float r42 = m9926();
            if (r0 != null) {
                r0.setCallback((Drawable.Callback) null);
            }
            if (this.f9166 && this.f9195 != null) {
                m9922(this.f9195);
            }
            invalidateSelf();
            if (r2 != r42 && (r4 = this.f9152.get()) != null) {
                r4.m9953();
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9936(Drawable drawable) {
        C1790 r7;
        Drawable drawable2 = this.f9170;
        Drawable r0 = drawable2 != null ? C1266.m8149(drawable2) : null;
        if (r0 != drawable) {
            float r2 = m9923();
            this.f9170 = drawable != null ? C1266.m8158(drawable).mutate() : null;
            if (C0410.f3979) {
                this.f9142 = new RippleDrawable(C0410.m4695(this.f9153), this.f9170, f9140);
            }
            float r72 = m9923();
            if (r0 != null) {
                r0.setCallback((Drawable.Callback) null);
            }
            if (this.f9189 && this.f9170 != null) {
                m9922(this.f9170);
            }
            invalidateSelf();
            if (r2 != r72 && (r7 = this.f9152.get()) != null) {
                r7.m9953();
            }
        }
    }
}
