package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import o.C0785;
import o.C3177;

/* renamed from: o.ɶ  reason: contains not printable characters */
public class C1457 extends C0671 implements C3177.If {

    /* renamed from: ı  reason: contains not printable characters */
    public CharSequence f7841;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int f7842;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final View.OnLayoutChangeListener f7843 = new View.OnLayoutChangeListener() {
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C1457 r2 = C1457.this;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            r2.f7847 = iArr[0];
            view.getWindowVisibleDisplayFrame(r2.f7844);
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Rect f7844 = new Rect();

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Paint.FontMetrics f7845 = new Paint.FontMetrics();

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f7846;

    /* renamed from: ɾ  reason: contains not printable characters */
    public int f7847;

    /* renamed from: Ι  reason: contains not printable characters */
    public final Context f7848;

    /* renamed from: ι  reason: contains not printable characters */
    public final C3177 f7849 = new C3177(this);

    /* renamed from: І  reason: contains not printable characters */
    public int f7850;

    /* renamed from: і  reason: contains not printable characters */
    public int f7851;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int f7852;

    public C1457(Context context, int i) {
        super(context, (AttributeSet) null, 0, i);
        this.f7848 = context;
        this.f7849.f14435.density = context.getResources().getDisplayMetrics().density;
        this.f7849.f14435.setTextAlign(Paint.Align.CENTER);
    }

    public int getIntrinsicWidth() {
        float f = (float) (this.f7842 * 2);
        CharSequence charSequence = this.f7841;
        float f2 = 0.0f;
        if (charSequence != null) {
            C3177 r3 = this.f7849;
            String charSequence2 = charSequence.toString();
            if (!r3.f14432) {
                f2 = r3.f14434;
            } else {
                if (charSequence2 != null) {
                    f2 = r3.f14435.measureText(charSequence2, 0, charSequence2.length());
                }
                r3.f14434 = f2;
                r3.f14432 = false;
                f2 = r3.f14434;
            }
        }
        return (int) Math.max(f + f2, (float) this.f7846);
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f7849.f14435.getTextSize(), (float) this.f7850);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(m8721(), (float) (-((((double) this.f7851) * Math.sqrt(2.0d)) - ((double) this.f7851))));
        super.draw(canvas);
        if (this.f7841 != null) {
            Rect bounds = getBounds();
            this.f7849.f14435.getFontMetrics(this.f7845);
            int centerY = (int) (((float) bounds.centerY()) - ((this.f7845.descent + this.f7845.ascent) / 2.0f));
            if (this.f7849.f14436 != null) {
                this.f7849.f14435.drawableState = getState();
                C3177 r2 = this.f7849;
                r2.f14436.m4291(this.f7848, r2.f14435, r2.f14433);
            }
            CharSequence charSequence = this.f7841;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, this.f7849.f14435);
        }
        canvas.restore();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C0785.If ifR = new C0785.If(this.f4785.f4796);
        ifR.f5229 = m8723();
        setShapeAppearanceModel(new C0785(ifR, (byte) 0));
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8722() {
        invalidateSelf();
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private float m8721() {
        int i;
        if (((this.f7844.right - getBounds().right) - this.f7847) - this.f7852 < 0) {
            i = ((this.f7844.right - getBounds().right) - this.f7847) - this.f7852;
        } else if (((this.f7844.left - getBounds().left) - this.f7847) + this.f7852 <= 0) {
            return 0.0f;
        } else {
            i = ((this.f7844.left - getBounds().left) - this.f7847) + this.f7852;
        }
        return (float) i;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C0565 m8723() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.f7851) * Math.sqrt(2.0d)))) / 2.0f;
        return new C0676(new C0622((float) this.f7851), Math.min(Math.max(-m8721(), -width), width));
    }
}
