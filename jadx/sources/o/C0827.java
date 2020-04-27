package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.C0858;

/* renamed from: o.ƾІ  reason: contains not printable characters */
public class C0827 extends LinearLayout implements C0806 {

    /* renamed from: ı  reason: contains not printable characters */
    TextView f5374;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f5375;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f5376;

    /* renamed from: Ι  reason: contains not printable characters */
    public Button f5377;

    public C0827(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0827(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858.Aux.f5608);
        this.f5376 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f5375 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5374 = (TextView) findViewById(R.id.f167452131362341);
        this.f5377 = (Button) findViewById(R.id.f167442131362340);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (m6255(1, r0, r0 - r1) != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (m6255(0, r0, r0) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f5376
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f5376
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165320(0x7f070088, float:1.7944854E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165319(0x7f070087, float:1.7944852E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f5374
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003e
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0058
            int r5 = r7.f5375
            if (r5 <= 0) goto L_0x0058
            android.widget.Button r5 = r7.f5377
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f5375
            if (r5 <= r6) goto L_0x0058
            int r1 = r0 - r1
            boolean r0 = r7.m6255(r4, r0, r1)
            if (r0 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            boolean r0 = r7.m6255(r3, r0, r0)
            if (r0 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            if (r4 == 0) goto L_0x0069
            super.onMeasure(r8, r9)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0827.onMeasure(int, int):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m6255(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f5374.getPaddingTop() == i2 && this.f5374.getPaddingBottom() == i3) {
            return z;
        }
        m6256(this.f5374, i2, i3);
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m6256(View view, int i, int i2) {
        if (C0293.m4159(view)) {
            C0293.m4178(view, C0293.m4184(view), i, C0293.m4173(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6257() {
        this.f5374.setAlpha(0.0f);
        this.f5374.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.f5377.getVisibility() == 0) {
            this.f5377.setAlpha(0.0f);
            this.f5377.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6258() {
        this.f5374.setAlpha(1.0f);
        this.f5374.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f5377.getVisibility() == 0) {
            this.f5377.setAlpha(1.0f);
            this.f5377.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }
}
