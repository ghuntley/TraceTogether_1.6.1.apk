package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: o.ǃι  reason: contains not printable characters */
public class C0917 extends RatingBar {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0908 f5806;

    public C0917(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0917(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153972130969210);
    }

    public C0917(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5806 = new C0908(this);
        this.f5806.m6710(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap r3 = this.f5806.m6711();
        if (r3 != null) {
            setMeasuredDimension(View.resolveSizeAndState(r3.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
