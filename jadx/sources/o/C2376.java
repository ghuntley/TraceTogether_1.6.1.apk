package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import o.C2512;

/* renamed from: o.Ч  reason: contains not printable characters */
public class C2376 extends View {
    public void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }

    public C2376(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C2376(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C2376(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C2512.C2513 r0 = (C2512.C2513) getLayoutParams();
        r0.f11386 = i;
        setLayoutParams(r0);
    }

    public void setGuidelineEnd(int i) {
        C2512.C2513 r0 = (C2512.C2513) getLayoutParams();
        r0.f11365 = i;
        setLayoutParams(r0);
    }

    public void setGuidelinePercent(float f) {
        C2512.C2513 r0 = (C2512.C2513) getLayoutParams();
        r0.f11375 = f;
        setLayoutParams(r0);
    }
}
