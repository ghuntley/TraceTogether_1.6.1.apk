package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* renamed from: o.ιǃ  reason: contains not printable characters */
public class C1969 extends FrameLayout {

    /* renamed from: ı  reason: contains not printable characters */
    private TypedValue f9873;

    /* renamed from: ǃ  reason: contains not printable characters */
    private TypedValue f9874;

    /* renamed from: ɩ  reason: contains not printable characters */
    private TypedValue f9875;

    /* renamed from: Ι  reason: contains not printable characters */
    private TypedValue f9876;

    /* renamed from: ι  reason: contains not printable characters */
    private TypedValue f9877;

    /* renamed from: І  reason: contains not printable characters */
    private TypedValue f9878;

    /* renamed from: і  reason: contains not printable characters */
    private final Rect f9879;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Cif f9880;

    /* renamed from: o.ιǃ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m10700();

        /* renamed from: ι  reason: contains not printable characters */
        void m10701();
    }

    public C1969(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1969(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1969(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9879 = new Rect();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m10696(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(Cif ifVar) {
        this.f9880 = ifVar;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.f9879.set(i, i2, i3, i4);
        if (C0293.m4186(this)) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getMode(r15)
            r6 = 6
            r7 = 5
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto L_0x0069
            if (r1 == 0) goto L_0x002c
            android.util.TypedValue r10 = r13.f9877
            goto L_0x002e
        L_0x002c:
            android.util.TypedValue r10 = r13.f9873
        L_0x002e:
            if (r10 == 0) goto L_0x0069
            int r11 = r10.type
            if (r11 == 0) goto L_0x0069
            int r11 = r10.type
            if (r11 != r7) goto L_0x003e
            float r10 = r10.getDimension(r0)
        L_0x003c:
            int r10 = (int) r10
            goto L_0x004e
        L_0x003e:
            int r11 = r10.type
            if (r11 != r6) goto L_0x004d
            int r11 = r0.widthPixels
            float r11 = (float) r11
            int r12 = r0.widthPixels
            float r12 = (float) r12
            float r10 = r10.getFraction(r11, r12)
            goto L_0x003c
        L_0x004d:
            r10 = 0
        L_0x004e:
            if (r10 <= 0) goto L_0x0069
            android.graphics.Rect r11 = r13.f9879
            int r11 = r11.left
            android.graphics.Rect r12 = r13.f9879
            int r12 = r12.right
            int r11 = r11 + r12
            int r10 = r10 - r11
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r10, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r10 = r14
            r14 = 1
            goto L_0x006b
        L_0x0069:
            r10 = r14
            r14 = 0
        L_0x006b:
            if (r5 != r8) goto L_0x00ac
            if (r1 == 0) goto L_0x0072
            android.util.TypedValue r5 = r13.f9876
            goto L_0x0074
        L_0x0072:
            android.util.TypedValue r5 = r13.f9878
        L_0x0074:
            if (r5 == 0) goto L_0x00ac
            int r11 = r5.type
            if (r11 == 0) goto L_0x00ac
            int r11 = r5.type
            if (r11 != r7) goto L_0x0084
            float r5 = r5.getDimension(r0)
        L_0x0082:
            int r5 = (int) r5
            goto L_0x0094
        L_0x0084:
            int r11 = r5.type
            if (r11 != r6) goto L_0x0093
            int r11 = r0.heightPixels
            float r11 = (float) r11
            int r12 = r0.heightPixels
            float r12 = (float) r12
            float r5 = r5.getFraction(r11, r12)
            goto L_0x0082
        L_0x0093:
            r5 = 0
        L_0x0094:
            if (r5 <= 0) goto L_0x00ac
            android.graphics.Rect r11 = r13.f9879
            int r11 = r11.top
            android.graphics.Rect r12 = r13.f9879
            int r12 = r12.bottom
            int r11 = r11 + r12
            int r5 = r5 - r11
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            int r15 = java.lang.Math.min(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
        L_0x00ac:
            super.onMeasure(r10, r15)
            int r5 = r13.getMeasuredWidth()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            if (r14 != 0) goto L_0x00f5
            if (r2 != r8) goto L_0x00f5
            if (r1 == 0) goto L_0x00c0
            android.util.TypedValue r14 = r13.f9874
            goto L_0x00c2
        L_0x00c0:
            android.util.TypedValue r14 = r13.f9875
        L_0x00c2:
            if (r14 == 0) goto L_0x00f5
            int r1 = r14.type
            if (r1 == 0) goto L_0x00f5
            int r1 = r14.type
            if (r1 != r7) goto L_0x00d2
            float r14 = r14.getDimension(r0)
        L_0x00d0:
            int r14 = (int) r14
            goto L_0x00e2
        L_0x00d2:
            int r1 = r14.type
            if (r1 != r6) goto L_0x00e1
            int r1 = r0.widthPixels
            float r1 = (float) r1
            int r0 = r0.widthPixels
            float r0 = (float) r0
            float r14 = r14.getFraction(r1, r0)
            goto L_0x00d0
        L_0x00e1:
            r14 = 0
        L_0x00e2:
            if (r14 <= 0) goto L_0x00ee
            android.graphics.Rect r0 = r13.f9879
            int r0 = r0.left
            android.graphics.Rect r1 = r13.f9879
            int r1 = r1.right
            int r0 = r0 + r1
            int r14 = r14 - r0
        L_0x00ee:
            if (r5 >= r14) goto L_0x00f5
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            goto L_0x00f6
        L_0x00f5:
            r3 = 0
        L_0x00f6:
            if (r3 == 0) goto L_0x00fb
            super.onMeasure(r10, r15)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1969.onMeasure(int, int):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public TypedValue m10695() {
        if (this.f9875 == null) {
            this.f9875 = new TypedValue();
        }
        return this.f9875;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public TypedValue m10698() {
        if (this.f9874 == null) {
            this.f9874 = new TypedValue();
        }
        return this.f9874;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public TypedValue m10697() {
        if (this.f9873 == null) {
            this.f9873 = new TypedValue();
        }
        return this.f9873;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public TypedValue m10699() {
        if (this.f9877 == null) {
            this.f9877 = new TypedValue();
        }
        return this.f9877;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public TypedValue m10693() {
        if (this.f9876 == null) {
            this.f9876 = new TypedValue();
        }
        return this.f9876;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public TypedValue m10694() {
        if (this.f9878 == null) {
            this.f9878 = new TypedValue();
        }
        return this.f9878;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Cif ifVar = this.f9880;
        if (ifVar != null) {
            ifVar.m10700();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Cif ifVar = this.f9880;
        if (ifVar != null) {
            ifVar.m10701();
        }
    }
}
