package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* renamed from: o.ϙ  reason: contains not printable characters */
public class C2146 extends View {
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Deprecated
    public C2146(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    @Deprecated
    public C2146(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public C2146(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m11329(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m11329(getSuggestedMinimumWidth(), i), m11329(getSuggestedMinimumHeight(), i2));
    }
}
