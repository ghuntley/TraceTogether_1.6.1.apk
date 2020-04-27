package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import o.C2512;
import o.C2724;

/* renamed from: o.Һ  reason: contains not printable characters */
public final class C2741 extends View {

    /* renamed from: ı  reason: contains not printable characters */
    View f12753 = null;

    /* renamed from: Ι  reason: contains not printable characters */
    int f12754 = -1;

    /* renamed from: ι  reason: contains not printable characters */
    int f12755 = 4;

    public C2741(Context context) {
        super(context);
        m14492((AttributeSet) null);
    }

    public C2741(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14492(attributeSet);
    }

    public C2741(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14492(attributeSet);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m14492(AttributeSet attributeSet) {
        super.setVisibility(this.f12755);
        this.f12754 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2724.C2725.f12591);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2724.C2725.f12686) {
                    this.f12754 = obtainStyledAttributes.getResourceId(index, this.f12754);
                } else if (index == C2724.C2725.f12683) {
                    this.f12755 = obtainStyledAttributes.getInt(index, this.f12755);
                }
            }
        }
    }

    public final void setEmptyVisibility(int i) {
        this.f12755 = i;
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public final void setContentId(int i) {
        View findViewById;
        if (this.f12754 != i) {
            View view = this.f12753;
            if (view != null) {
                view.setVisibility(0);
                ((C2512.C2513) this.f12753.getLayoutParams()).f11377 = false;
                this.f12753 = null;
            }
            this.f12754 = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }
}
