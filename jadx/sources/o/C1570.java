package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.C1068;

/* renamed from: o.ɿІ  reason: contains not printable characters */
public class C1570 extends ViewGroup {

    /* renamed from: ı  reason: contains not printable characters */
    float f8339;

    /* renamed from: ŀ  reason: contains not printable characters */
    private float f8340;

    /* renamed from: ł  reason: contains not printable characters */
    private Method f8341;

    /* renamed from: ſ  reason: contains not printable characters */
    private Field f8342;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final C1068 f8343;

    /* renamed from: ǃ  reason: contains not printable characters */
    View f8344;

    /* renamed from: ȷ  reason: contains not printable characters */
    private float f8345;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f8346;

    /* renamed from: ɨ  reason: contains not printable characters */
    private Drawable f8347;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f8348;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final int f8349;

    /* renamed from: ɹ  reason: contains not printable characters */
    final ArrayList<Cif> f8350;

    /* renamed from: ɾ  reason: contains not printable characters */
    private Drawable f8351;

    /* renamed from: ɿ  reason: contains not printable characters */
    private boolean f8352;

    /* renamed from: ʟ  reason: contains not printable characters */
    private float f8353;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f8354;

    /* renamed from: ι  reason: contains not printable characters */
    int f8355;

    /* renamed from: І  reason: contains not printable characters */
    int f8356;

    /* renamed from: г  reason: contains not printable characters */
    private final Rect f8357;

    /* renamed from: і  reason: contains not printable characters */
    private int f8358;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f8359;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f8360;

    /* renamed from: o.ɿІ$ɩ  reason: contains not printable characters */
    public interface C1573 {
    }

    public void setPanelSlideListener(C1573 r1) {
    }

    public C1570(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1570(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1570(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8348 = -858993460;
        this.f8352 = true;
        this.f8357 = new Rect();
        this.f8350 = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f8349 = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C0293.m4151((View) this, (C2449) new C1572());
        C0293.m4203((View) this, 1);
        this.f8343 = C1068.m7370((ViewGroup) this, 0.5f, (C1068.If) new C1571());
        this.f8343.f6433 = f * 400.0f;
    }

    public void setParallaxDistance(int i) {
        this.f8356 = i;
        requestLayout();
    }

    public void setSliderFadeColor(int i) {
        this.f8348 = i;
    }

    public void setCoveredFadeColor(int i) {
        this.f8358 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9210() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8352 = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8352 = true;
        int size = this.f8350.size();
        for (int i = 0; i < size; i++) {
            this.f8350.get(i).run();
        }
        this.f8350.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = RecyclerView.UNDEFINED_DURATION;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f8344 = null;
        int i13 = i4;
        int i14 = paddingLeft;
        int i15 = 0;
        boolean z2 = false;
        float f = 0.0f;
        while (true) {
            i5 = 8;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            If ifR = (If) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                ifR.f8364 = z;
            } else {
                if (ifR.f8365 > 0.0f) {
                    f += ifR.f8365;
                    if (ifR.width == 0) {
                    }
                }
                int i16 = ifR.leftMargin + ifR.rightMargin;
                if (ifR.width == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i16, RecyclerView.UNDEFINED_DURATION);
                } else if (ifR.width == -1) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i16, 1073741824);
                } else {
                    i11 = View.MeasureSpec.makeMeasureSpec(ifR.width, 1073741824);
                }
                if (ifR.height == -2) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION);
                } else if (ifR.height == -1) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                } else {
                    i12 = View.MeasureSpec.makeMeasureSpec(ifR.height, 1073741824);
                }
                childAt.measure(i11, i12);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i13) {
                    i13 = Math.min(measuredHeight, i3);
                }
                i14 -= measuredWidth;
                boolean z3 = i14 < 0;
                ifR.f8363 = z3;
                boolean z4 = z3 | z2;
                if (ifR.f8363) {
                    this.f8344 = childAt;
                }
                z2 = z4;
            }
            i15++;
            z = false;
        }
        if (z2 || f > 0.0f) {
            int i17 = paddingLeft - this.f8349;
            int i18 = 0;
            while (i18 < childCount) {
                View childAt2 = getChildAt(i18);
                if (childAt2.getVisibility() != i5) {
                    If ifR2 = (If) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z5 = ifR2.width == 0 && ifR2.f8365 > 0.0f;
                        if (z5) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.f8344) {
                            if (ifR2.f8365 > 0.0f) {
                                if (ifR2.width != 0) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (ifR2.height == -2) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION);
                                } else if (ifR2.height == -1) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(ifR2.height, 1073741824);
                                }
                                if (z2) {
                                    int i19 = paddingLeft - (ifR2.leftMargin + ifR2.rightMargin);
                                    i6 = i17;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                                    if (i7 != i19) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i18++;
                                    i17 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i17;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((ifR2.f8365 * ((float) Math.max(0, i14))) / f)), 1073741824), i8);
                                    i18++;
                                    i17 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (ifR2.width < 0 && (i7 > i17 || ifR2.f8365 > 0.0f)) {
                            if (!z5) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (ifR2.height == -2) {
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION);
                                i9 = 1073741824;
                            } else if (ifR2.height == -1) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(ifR2.height, 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i17, i9), i10);
                        }
                    }
                }
                i6 = i17;
                i18++;
                i17 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i13 + getPaddingTop() + getPaddingBottom());
        this.f8360 = z2;
        if (this.f8343.f6421 != 0 && !z2) {
            this.f8343.m7377();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f8352 = true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f8360) {
            this.f8359 = view == this.f8344;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f8360 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f8359 = !C1068.m7363(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f8360 || (this.f8354 && actionMasked != 0)) {
            this.f8343.m7386();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f8343.m7386();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f8354 = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f8353 = x;
                this.f8340 = y;
                if (C1068.m7363(this.f8344, (int) x, (int) y) && m9213(this.f8344)) {
                    z = true;
                    if (!this.f8343.m7379(motionEvent) || z) {
                        return true;
                    }
                    return false;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f8353);
                float abs2 = Math.abs(y2 - this.f8340);
                if (abs > ((float) this.f8343.f6413) && abs2 > abs) {
                    this.f8343.m7386();
                    this.f8354 = true;
                    return false;
                }
            }
            z = false;
            if (!this.f8343.m7379(motionEvent)) {
            }
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f8360) {
            return super.onTouchEvent(motionEvent);
        }
        this.f8343.m7382(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f8353 = x;
            this.f8340 = y;
        } else if (actionMasked == 1 && m9213(this.f8344)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f8353;
            float f2 = y2 - this.f8340;
            int i = this.f8343.f6413;
            if ((f * f) + (f2 * f2) < ((float) (i * i)) && C1068.m7363(this.f8344, (int) x2, (int) y2) && (this.f8352 || m9209(0.0f))) {
                this.f8359 = false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9215(View view, float f, int i) {
        If ifR = (If) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (ifR.f8362 == null) {
                ifR.f8362 = new Paint();
            }
            ifR.f8362.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, ifR.f8362);
            }
            m9214(view);
        } else if (view.getLayerType() != 0) {
            if (ifR.f8362 != null) {
                ifR.f8362.setColorFilter((ColorFilter) null);
            }
            Cif ifVar = new Cif(view);
            this.f8350.add(ifVar);
            C0293.m4204((View) this, (Runnable) ifVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        If ifR = (If) view.getLayoutParams();
        int save = canvas.save();
        if (this.f8360 && !ifR.f8363 && this.f8344 != null) {
            canvas.getClipBounds(this.f8357);
            boolean z = true;
            if (C0293.m4156(this) != 1) {
                z = false;
            }
            if (z) {
                Rect rect = this.f8357;
                rect.left = Math.max(rect.left, this.f8344.getRight());
            } else {
                Rect rect2 = this.f8357;
                rect2.right = Math.min(rect2.right, this.f8344.getLeft());
            }
            canvas.clipRect(this.f8357);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9214(View view) {
        Field field;
        if (Build.VERSION.SDK_INT >= 17) {
            C0293.m4165(view, ((If) view.getLayoutParams()).f8362);
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (!this.f8346) {
                try {
                    this.f8341 = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    this.f8342 = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f8342.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f8346 = true;
            }
            if (this.f8341 == null || (field = this.f8342) == null) {
                view.invalidate();
                return;
            } else {
                try {
                    field.setBoolean(view, true);
                    this.f8341.invoke(view, (Object[]) null);
                } catch (Exception unused3) {
                }
            }
        }
        C0293.m4148(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m9209(float f) {
        int i;
        if (!this.f8360) {
            return false;
        }
        boolean z = C0293.m4156(this) == 1;
        If ifR = (If) this.f8344.getLayoutParams();
        if (z) {
            i = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + ifR.rightMargin)) + (f * ((float) this.f8355))) + ((float) this.f8344.getWidth())));
        } else {
            i = (int) (((float) (getPaddingLeft() + ifR.leftMargin)) + (f * ((float) this.f8355)));
        }
        C1068 r0 = this.f8343;
        View view = this.f8344;
        if (!r0.m7385(view, i, view.getTop())) {
            return false;
        }
        m9210();
        C0293.m4176(this);
        return true;
    }

    public void computeScroll() {
        if (!this.f8343.m7381()) {
            return;
        }
        if (!this.f8360) {
            this.f8343.m7377();
        } else {
            C0293.m4176(this);
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f8351 = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f8347 = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0651.m5458(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0651.m5458(getContext(), i));
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        boolean z = false;
        if (C0293.m4156(this) == 1) {
            drawable = this.f8347;
        } else {
            drawable = this.f8351;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (C0293.m4156(this) == 1) {
                z = true;
            }
            if (z) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m9213(View view) {
        if (view == null) {
            return false;
        }
        If ifR = (If) view.getLayoutParams();
        if (!this.f8360 || !ifR.f8364 || this.f8339 <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new If();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new If((ViewGroup.MarginLayoutParams) layoutParams) : new If(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof If) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new If(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1574 r1 = new C1574(super.onSaveInstanceState());
        boolean z = this.f8360;
        r1.f8371 = z ? !z || this.f8339 == 1.0f : this.f8359;
        return r1;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1574)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1574 r2 = (C1574) parcelable;
        super.onRestoreInstanceState(r2.f6905);
        if (r2.f8371) {
            if (this.f8352 || m9209(1.0f)) {
                this.f8359 = true;
            }
        } else if (this.f8352 || m9209(0.0f)) {
            this.f8359 = false;
        }
        this.f8359 = r2.f8371;
    }

    /* renamed from: o.ɿІ$ı  reason: contains not printable characters */
    class C1571 extends C1068.If {
        C1571() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m9221(View view, int i) {
            if (C1570.this.f8354) {
                return false;
            }
            return ((If) view.getLayoutParams()).f8363;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m9223(int i) {
            if (C1570.this.f8343.f6421 != 0) {
                return;
            }
            if (C1570.this.f8339 == 0.0f) {
                C1570 r3 = C1570.this;
                r3.m9212(r3.f8344);
                C1570.this.sendAccessibilityEvent(32);
                C1570.this.f8359 = false;
                return;
            }
            C1570.this.sendAccessibilityEvent(32);
            C1570.this.f8359 = true;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m9224(View view, int i) {
            C1570.this.m9210();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m9217(View view, int i) {
            C1570 r5 = C1570.this;
            if (r5.f8344 == null) {
                r5.f8339 = 0.0f;
            } else {
                boolean z = true;
                if (C0293.m4156(r5) != 1) {
                    z = false;
                }
                If ifR = (If) r5.f8344.getLayoutParams();
                int width = r5.f8344.getWidth();
                if (z) {
                    i = (r5.getWidth() - i) - width;
                }
                r5.f8339 = ((float) (i - ((z ? r5.getPaddingRight() : r5.getPaddingLeft()) + (z ? ifR.rightMargin : ifR.leftMargin)))) / ((float) r5.f8355);
                if (r5.f8356 != 0) {
                    r5.m9211(r5.f8339);
                }
                if (ifR.f8364) {
                    r5.m9215(r5.f8344, r5.f8339, r5.f8348);
                }
            }
            C1570.this.invalidate();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m9220(View view, float f, float f2) {
            int i;
            If ifR = (If) view.getLayoutParams();
            boolean z = true;
            if (C0293.m4156(C1570.this) != 1) {
                z = false;
            }
            if (z) {
                int paddingRight = C1570.this.getPaddingRight() + ifR.rightMargin;
                if (f < 0.0f || (f == 0.0f && C1570.this.f8339 > 0.5f)) {
                    paddingRight += C1570.this.f8355;
                }
                i = (C1570.this.getWidth() - paddingRight) - C1570.this.f8344.getWidth();
            } else {
                i = ifR.leftMargin + C1570.this.getPaddingLeft();
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && C1570.this.f8339 > 0.5f)) {
                    i += C1570.this.f8355;
                }
            }
            C1570.this.f8343.m7384(i, view.getTop());
            C1570.this.invalidate();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m9222(View view) {
            return C1570.this.f8355;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m9218(View view, int i) {
            If ifR = (If) C1570.this.f8344.getLayoutParams();
            boolean z = true;
            if (C0293.m4156(C1570.this) != 1) {
                z = false;
            }
            if (z) {
                int width = C1570.this.getWidth() - ((C1570.this.getPaddingRight() + ifR.rightMargin) + C1570.this.f8344.getWidth());
                return Math.max(Math.min(i, width), width - C1570.this.f8355);
            }
            int paddingLeft = C1570.this.getPaddingLeft() + ifR.leftMargin;
            return Math.min(Math.max(i, paddingLeft), C1570.this.f8355 + paddingLeft);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m9216(View view, int i) {
            return view.getTop();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m9219(int i, int i2) {
            C1570.this.f8343.m7383(C1570.this.f8344, i2);
        }
    }

    /* renamed from: o.ɿІ$If */
    public static class If extends ViewGroup.MarginLayoutParams {

        /* renamed from: Ι  reason: contains not printable characters */
        private static final int[] f8361 = {16843137};

        /* renamed from: ı  reason: contains not printable characters */
        Paint f8362;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f8363;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f8364;

        /* renamed from: ι  reason: contains not printable characters */
        public float f8365 = 0.0f;

        public If() {
            super(-1, -1);
        }

        public If(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public If(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public If(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8361);
            this.f8365 = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o.ɿІ$Ι  reason: contains not printable characters */
    static class C1574 extends C1219 {
        public static final Parcelable.Creator<C1574> CREATOR = new Parcelable.ClassLoaderCreator<C1574>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1574(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C1574[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C1574(parcel);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        boolean f8371;

        C1574(Parcelable parcelable) {
            super(parcelable);
        }

        C1574(Parcel parcel) {
            super(parcel, (ClassLoader) null);
            this.f8371 = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8371 ? 1 : 0);
        }
    }

    /* renamed from: o.ɿІ$ǃ  reason: contains not printable characters */
    class C1572 extends C2449 {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Rect f8370 = new Rect();

        C1572() {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m9225(View view, C0520 r5) {
            C0520 r0 = C0520.m4999(r5);
            super.m12579(view, r0);
            Rect rect = this.f8370;
            r0.m5056(rect);
            r5.m5050(rect);
            r0.m5031(rect);
            r5.m5021(rect);
            r5.m5036(r0.m5069());
            r5.m5051(r0.m5065());
            r5.m5022(r0.m5012());
            r5.m5034(r0.m5019());
            r5.m5063(r0.m5071());
            r5.m5068(r0.m5029());
            r5.m5010(r0.m5064());
            r5.m5024(r0.m5067());
            r5.m5040(r0.m5038());
            r5.m5016(r0.m5043());
            r5.m5066(r0.m5026());
            r5.m5030(r0.m5054());
            r5.m5055(r0.m5020());
            r0.m5018();
            r5.m5022((CharSequence) C1570.class.getName());
            r5.m5057(view);
            ViewParent r4 = C0293.m4220(view);
            if (r4 instanceof View) {
                r5.m5007((View) r4);
            }
            int childCount = C1570.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C1570.this.getChildAt(i);
                if (!C1570.this.m9213(childAt) && childAt.getVisibility() == 0) {
                    C0293.m4203(childAt, 1);
                    r5.m5032(childAt);
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m9227(View view, AccessibilityEvent accessibilityEvent) {
            super.m12584(view, accessibilityEvent);
            accessibilityEvent.setClassName(C1570.class.getName());
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m9226(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!C1570.this.m9213(view)) {
                return super.m12581(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: o.ɿІ$if  reason: invalid class name */
    class Cif implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        final View f8366;

        Cif(View view) {
            this.f8366 = view;
        }

        public final void run() {
            if (this.f8366.getParent() == C1570.this) {
                this.f8366.setLayerType(0, (Paint) null);
                C1570.this.m9214(this.f8366);
            }
            C1570.this.f8350.remove(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9212(android.view.View r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = o.C0293.m4156(r17)
            r2 = 1
            if (r1 != r2) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x0018
            int r4 = r17.getWidth()
            int r5 = r17.getPaddingRight()
            int r4 = r4 - r5
            goto L_0x001c
        L_0x0018:
            int r4 = r17.getPaddingLeft()
        L_0x001c:
            if (r1 == 0) goto L_0x0023
            int r5 = r17.getPaddingLeft()
            goto L_0x002c
        L_0x0023:
            int r5 = r17.getWidth()
            int r6 = r17.getPaddingRight()
            int r5 = r5 - r6
        L_0x002c:
            int r6 = r17.getPaddingTop()
            int r7 = r17.getHeight()
            int r8 = r17.getPaddingBottom()
            int r7 = r7 - r8
            if (r0 == 0) goto L_0x006a
            boolean r8 = r18.isOpaque()
            if (r8 == 0) goto L_0x0042
            goto L_0x0057
        L_0x0042:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r8 >= r9) goto L_0x0056
            android.graphics.drawable.Drawable r8 = r18.getBackground()
            if (r8 == 0) goto L_0x0056
            int r8 = r8.getOpacity()
            r9 = -1
            if (r8 != r9) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r2 == 0) goto L_0x006a
            int r2 = r18.getLeft()
            int r8 = r18.getRight()
            int r9 = r18.getTop()
            int r10 = r18.getBottom()
            goto L_0x006e
        L_0x006a:
            r2 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x006e:
            int r11 = r17.getChildCount()
            r12 = 0
        L_0x0073:
            r13 = r17
            if (r12 >= r11) goto L_0x00c9
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 == r0) goto L_0x00c9
            int r15 = r14.getVisibility()
            r3 = 8
            if (r15 == r3) goto L_0x00c0
            if (r1 == 0) goto L_0x0089
            r3 = r5
            goto L_0x008a
        L_0x0089:
            r3 = r4
        L_0x008a:
            int r15 = r14.getLeft()
            int r3 = java.lang.Math.max(r3, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r6, r15)
            r16 = r1
            if (r1 == 0) goto L_0x00a0
            r0 = r4
            goto L_0x00a1
        L_0x00a0:
            r0 = r5
        L_0x00a1:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r7, r1)
            if (r3 < r2) goto L_0x00bb
            if (r15 < r9) goto L_0x00bb
            if (r0 > r8) goto L_0x00bb
            if (r1 > r10) goto L_0x00bb
            r3 = 4
            goto L_0x00bc
        L_0x00bb:
            r3 = 0
        L_0x00bc:
            r14.setVisibility(r3)
            goto L_0x00c2
        L_0x00c0:
            r16 = r1
        L_0x00c2:
            int r12 = r12 + 1
            r0 = r18
            r1 = r16
            goto L_0x0073
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1570.m9212(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2 = C0293.m4156(this) == 1;
        if (z2) {
            this.f8343.f6416 = 2;
        } else {
            this.f8343.f6416 = 1;
        }
        int i10 = i3 - i;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f8352) {
            this.f8339 = (!this.f8360 || !this.f8359) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        int i12 = i11;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                If ifR = (If) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (ifR.f8363) {
                    int i14 = i10 - paddingLeft;
                    int min = (Math.min(i11, i14 - this.f8349) - i12) - (ifR.leftMargin + ifR.rightMargin);
                    this.f8355 = min;
                    int i15 = z2 ? ifR.rightMargin : ifR.leftMargin;
                    ifR.f8364 = ((i12 + i15) + min) + (measuredWidth / 2) > i14;
                    int i16 = (int) (((float) min) * this.f8339);
                    i5 = i15 + i16 + i12;
                    this.f8339 = ((float) i16) / ((float) this.f8355);
                    i6 = 0;
                } else {
                    i6 = (!this.f8360 || (i9 = this.f8356) == 0) ? 0 : (int) ((1.0f - this.f8339) * ((float) i9));
                    i5 = i11;
                }
                if (z2) {
                    i7 = (i10 - i5) + i6;
                    i8 = i7 - measuredWidth;
                } else {
                    i8 = i5 - i6;
                    i7 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i7, childAt.getMeasuredHeight() + paddingTop);
                i11 += childAt.getWidth();
                i12 = i5;
            }
        }
        if (this.f8352) {
            if (this.f8360) {
                if (this.f8356 != 0) {
                    m9211(this.f8339);
                }
                if (((If) this.f8344.getLayoutParams()).f8364) {
                    m9215(this.f8344, this.f8339, this.f8348);
                }
            } else {
                for (int i17 = 0; i17 < childCount; i17++) {
                    m9215(getChildAt(i17), 0.0f, this.f8348);
                }
            }
            m9212(this.f8344);
        }
        this.f8352 = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((r0 ? r3.rightMargin : r3.leftMargin) <= 0) goto L_0x0022;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9211(float r10) {
        /*
            r9 = this;
            int r0 = o.C0293.m4156(r9)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            android.view.View r3 = r9.f8344
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            o.ɿІ$If r3 = (o.C1570.If) r3
            boolean r4 = r3.f8364
            if (r4 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x001c
            int r3 = r3.rightMargin
            goto L_0x001e
        L_0x001c:
            int r3 = r3.leftMargin
        L_0x001e:
            if (r3 > 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            int r3 = r9.getChildCount()
        L_0x0026:
            if (r1 >= r3) goto L_0x005d
            android.view.View r4 = r9.getChildAt(r1)
            android.view.View r5 = r9.f8344
            if (r4 == r5) goto L_0x005a
            float r5 = r9.f8345
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f8356
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f8345 = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0048
            int r5 = -r5
        L_0x0048:
            r4.offsetLeftAndRight(r5)
            if (r2 == 0) goto L_0x005a
            float r5 = r9.f8345
            if (r0 == 0) goto L_0x0053
            float r5 = r5 - r6
            goto L_0x0055
        L_0x0053:
            float r5 = r6 - r5
        L_0x0055:
            int r6 = r9.f8358
            r9.m9215(r4, r5, r6)
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1570.m9211(float):void");
    }
}
