package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: o.ĸ  reason: contains not printable characters */
public class C0472 extends SeekBar {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1249 f4095;

    public C0472(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0472(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154092130969223);
    }

    public C0472(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4095 = new C1249(this);
        this.f4095.m8055(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4095.m8056(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f4095.m8058();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f4095.m8057();
    }
}
