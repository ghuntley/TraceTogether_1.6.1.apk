package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.C2745;

/* renamed from: o.Γ  reason: contains not printable characters */
public class C1771 extends FrameLayout {

    /* renamed from: ı  reason: contains not printable characters */
    Drawable f9089;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f9090;

    /* renamed from: ǃ  reason: contains not printable characters */
    Drawable f9091;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f9092;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f9093;

    /* renamed from: Ι  reason: contains not printable characters */
    View f9094;

    /* renamed from: ι  reason: contains not printable characters */
    Drawable f9095;

    /* renamed from: І  reason: contains not printable characters */
    private View f9096;

    /* renamed from: і  reason: contains not printable characters */
    boolean f9097;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private View f9098;

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public C1771(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1771(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0293.m4199((View) this, (Drawable) new C1654(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2745.aux.f12818);
        this.f9089 = obtainStyledAttributes.getDrawable(C2745.aux.f12912);
        this.f9095 = obtainStyledAttributes.getDrawable(C2745.aux.f12779);
        this.f9090 = obtainStyledAttributes.getDimensionPixelSize(C2745.aux.f12806, -1);
        if (getId() == R.id.f167472131362346) {
            this.f9092 = true;
            this.f9091 = obtainStyledAttributes.getDrawable(C2745.aux.f12855);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f9092 ? this.f9089 == null && this.f9095 == null : this.f9091 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f9098 = findViewById(R.id.f164292131361899);
        this.f9096 = findViewById(R.id.f164352131361907);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f9089;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f9089);
        }
        this.f9089 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f9098;
            if (view != null) {
                this.f9089.setBounds(view.getLeft(), this.f9098.getTop(), this.f9098.getRight(), this.f9098.getBottom());
            }
        }
        boolean z = true;
        if (!this.f9092 ? !(this.f9089 == null && this.f9095 == null) : this.f9091 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9095;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f9095);
        }
        this.f9095 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9097 && (drawable2 = this.f9095) != null) {
                drawable2.setBounds(this.f9094.getLeft(), this.f9094.getTop(), this.f9094.getRight(), this.f9094.getBottom());
            }
        }
        boolean z = true;
        if (!this.f9092 ? !(this.f9089 == null && this.f9095 == null) : this.f9091 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9091;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f9091);
        }
        this.f9091 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9092 && (drawable2 = this.f9091) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f9092 ? this.f9089 == null && this.f9095 == null : this.f9091 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f9089;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f9095;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f9091;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f9089 && !this.f9092) {
            return true;
        }
        if (drawable != this.f9095 || !this.f9097) {
            return (drawable == this.f9091 && this.f9092) || super.verifyDrawable(drawable);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9089;
        if (drawable != null && drawable.isStateful()) {
            this.f9089.setState(getDrawableState());
        }
        Drawable drawable2 = this.f9095;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f9095.setState(getDrawableState());
        }
        Drawable drawable3 = this.f9091;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f9091.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9089;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9095;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f9091;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f9093 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9093 || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(C0925 r3) {
        View view = this.f9094;
        if (view != null) {
            removeView(view);
        }
        this.f9094 = r3;
        if (r3 != null) {
            addView(r3);
            ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            r3.setAllowCollapse(false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f9098
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L_0x001c
            int r0 = r6.f9090
            if (r0 < 0) goto L_0x001c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L_0x001c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f9098
            if (r7 != 0) goto L_0x0024
            return
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.f9094
            if (r0 == 0) goto L_0x00b2
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x00b2
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L_0x00b2
            android.view.View r0 = r6.f9098
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x004d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = 0
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            if (r0 != 0) goto L_0x0064
            android.view.View r0 = r6.f9098
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
        L_0x0061:
            int r4 = r0 + r2
            goto L_0x008a
        L_0x0064:
            android.view.View r0 = r6.f9096
            if (r0 == 0) goto L_0x0076
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x0076
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            if (r3 != 0) goto L_0x008a
            android.view.View r0 = r6.f9096
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            goto L_0x0061
        L_0x008a:
            if (r7 != r1) goto L_0x0091
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x0094
        L_0x0091:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0094:
            int r8 = r6.getMeasuredWidth()
            android.view.View r0 = r6.f9094
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getMeasuredHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r7 = java.lang.Math.min(r4, r7)
            r6.setMeasuredDimension(r8, r7)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1771.onMeasure(int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f9094;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f9092) {
            Drawable drawable2 = this.f9091;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f9089 != null) {
                if (this.f9098.getVisibility() == 0) {
                    this.f9089.setBounds(this.f9098.getLeft(), this.f9098.getTop(), this.f9098.getRight(), this.f9098.getBottom());
                } else {
                    View view2 = this.f9096;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f9089.setBounds(0, 0, 0, 0);
                    } else {
                        this.f9089.setBounds(this.f9096.getLeft(), this.f9096.getTop(), this.f9096.getRight(), this.f9096.getBottom());
                    }
                }
                z3 = true;
            }
            this.f9097 = z4;
            if (!z4 || (drawable = this.f9095) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }
}
