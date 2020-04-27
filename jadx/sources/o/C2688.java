package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: o.ғ  reason: contains not printable characters */
class C2688 extends ListView implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    boolean f12412;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f12413 = 0;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f12414 = 0;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C0668 f12415;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f12416 = 0;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C2688 f12417;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Field f12418;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Rect f12419 = new Rect();

    /* renamed from: ι  reason: contains not printable characters */
    private int f12420 = 0;

    /* renamed from: І  reason: contains not printable characters */
    private C2689 f12421;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f12422;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f12423;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f12424;

    C2688(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.f150992130968888);
        this.f12422 = z;
        setCacheColorHint(0);
        try {
            this.f12418 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f12418.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public boolean isInTouchMode() {
        return (this.f12422 && this.f12412) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f12422 || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f12422 || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f12422 || super.hasFocus();
    }

    public void setSelector(Drawable drawable) {
        this.f12421 = drawable != null ? new C2689(drawable) : null;
        super.setSelector(this.f12421);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f12414 = rect.left;
        this.f12416 = rect.top;
        this.f12420 = rect.right;
        this.f12413 = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f12417 == null) {
            super.drawableStateChanged();
            C2689 r0 = this.f12421;
            if (r0 != null) {
                r0.f12425 = true;
            }
            m14291();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f12423 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C2688 r0 = this.f12417;
        if (r0 != null) {
            r0.f12417 = null;
            r0.removeCallbacks(r0);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public int m14292(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i4) {
                return (i5 < 0 || i9 <= i5 || i11 <= 0 || i8 == i4) ? i4 : i11;
            }
            if (i5 >= 0 && i9 >= i5) {
                i11 = i8;
            }
            i9++;
        }
        return i8;
    }

    /* renamed from: o.ғ$ǃ  reason: contains not printable characters */
    static class C2689 extends C1678 {

        /* renamed from: ı  reason: contains not printable characters */
        boolean f12425 = true;

        C2689(Drawable drawable) {
            super(drawable);
        }

        public final boolean setState(int[] iArr) {
            if (this.f12425) {
                return super.setState(iArr);
            }
            return false;
        }

        public final void draw(Canvas canvas) {
            if (this.f12425) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f2) {
            if (this.f12425) {
                super.setHotspot(f, f2);
            }
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f12425) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f12425) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f12417 == null) {
            this.f12417 = this;
            C2688 r1 = this.f12417;
            r1.post(r1);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m14291();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f12417 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0164  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m14293(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L_0x001b
            r5 = 2
            if (r2 == r5) goto L_0x0019
            r5 = 3
            if (r2 == r5) goto L_0x0015
            r2 = 0
            goto L_0x0132
        L_0x0015:
            r2 = 0
            r3 = 0
            goto L_0x0132
        L_0x0019:
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0023
            goto L_0x0015
        L_0x0023:
            float r7 = r1.getX(r6)
            int r7 = (int) r7
            float r6 = r1.getY(r6)
            int r6 = (int) r6
            int r8 = r0.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0038
            r3 = r5
            r2 = 1
            goto L_0x0132
        L_0x0038:
            int r5 = r16.getFirstVisiblePosition()
            int r5 = r8 - r5
            android.view.View r5 = r0.getChildAt(r5)
            float r7 = (float) r7
            float r6 = (float) r6
            r0.f12424 = r3
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x004f
            r0.drawableHotspotChanged(r7, r6)
        L_0x004f:
            boolean r10 = r16.isPressed()
            if (r10 != 0) goto L_0x0058
            r0.setPressed(r3)
        L_0x0058:
            r16.layoutChildren()
            int r10 = r0.f12423
            if (r10 == r9) goto L_0x0075
            int r12 = r16.getFirstVisiblePosition()
            int r10 = r10 - r12
            android.view.View r10 = r0.getChildAt(r10)
            if (r10 == 0) goto L_0x0075
            if (r10 == r5) goto L_0x0075
            boolean r12 = r10.isPressed()
            if (r12 == 0) goto L_0x0075
            r10.setPressed(r4)
        L_0x0075:
            r0.f12423 = r8
            int r10 = r5.getLeft()
            float r10 = (float) r10
            float r10 = r7 - r10
            int r12 = r5.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r11) goto L_0x008c
            r5.drawableHotspotChanged(r10, r12)
        L_0x008c:
            boolean r10 = r5.isPressed()
            if (r10 != 0) goto L_0x0095
            r5.setPressed(r3)
        L_0x0095:
            android.graphics.drawable.Drawable r10 = r16.getSelector()
            if (r10 == 0) goto L_0x009f
            if (r8 == r9) goto L_0x009f
            r11 = 1
            goto L_0x00a0
        L_0x009f:
            r11 = 0
        L_0x00a0:
            if (r11 == 0) goto L_0x00a5
            r10.setVisible(r4, r4)
        L_0x00a5:
            android.graphics.Rect r12 = r0.f12419
            int r13 = r5.getLeft()
            int r14 = r5.getTop()
            int r15 = r5.getRight()
            int r3 = r5.getBottom()
            r12.set(r13, r14, r15, r3)
            int r3 = r12.left
            int r13 = r0.f12414
            int r3 = r3 - r13
            r12.left = r3
            int r3 = r12.top
            int r13 = r0.f12416
            int r3 = r3 - r13
            r12.top = r3
            int r3 = r12.right
            int r13 = r0.f12420
            int r3 = r3 + r13
            r12.right = r3
            int r3 = r12.bottom
            int r13 = r0.f12413
            int r3 = r3 + r13
            r12.bottom = r3
            java.lang.reflect.Field r3 = r0.f12418     // Catch:{ IllegalAccessException -> 0x00f6 }
            boolean r3 = r3.getBoolean(r0)     // Catch:{ IllegalAccessException -> 0x00f6 }
            boolean r12 = r5.isEnabled()     // Catch:{ IllegalAccessException -> 0x00f6 }
            if (r12 == r3) goto L_0x00f7
            java.lang.reflect.Field r12 = r0.f12418     // Catch:{ IllegalAccessException -> 0x00f6 }
            if (r3 != 0) goto L_0x00e8
            r3 = 1
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x00f6 }
            r12.set(r0, r3)     // Catch:{ IllegalAccessException -> 0x00f6 }
            if (r8 == r9) goto L_0x00f7
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            if (r11 == 0) goto L_0x0112
            android.graphics.Rect r3 = r0.f12419
            float r11 = r3.exactCenterX()
            float r3 = r3.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x010b
            r12 = 1
            goto L_0x010c
        L_0x010b:
            r12 = 0
        L_0x010c:
            r10.setVisible(r12, r4)
            o.C1266.m8150(r10, r11, r3)
        L_0x0112:
            android.graphics.drawable.Drawable r3 = r16.getSelector()
            if (r3 == 0) goto L_0x011d
            if (r8 == r9) goto L_0x011d
            o.C1266.m8150(r3, r7, r6)
        L_0x011d:
            o.ғ$ǃ r3 = r0.f12421
            if (r3 == 0) goto L_0x0123
            r3.f12425 = r4
        L_0x0123:
            r16.refreshDrawableState()
            r3 = 1
            if (r2 != r3) goto L_0x0130
            long r2 = r0.getItemIdAtPosition(r8)
            r0.performItemClick(r5, r8, r2)
        L_0x0130:
            r2 = 0
            r3 = 1
        L_0x0132:
            if (r3 == 0) goto L_0x0136
            if (r2 == 0) goto L_0x014e
        L_0x0136:
            r0.f12424 = r4
            r0.setPressed(r4)
            r16.drawableStateChanged()
            int r2 = r0.f12423
            int r5 = r16.getFirstVisiblePosition()
            int r2 = r2 - r5
            android.view.View r2 = r0.getChildAt(r2)
            if (r2 == 0) goto L_0x014e
            r2.setPressed(r4)
        L_0x014e:
            if (r3 == 0) goto L_0x0164
            o.Ɨı r2 = r0.f12415
            if (r2 != 0) goto L_0x015b
            o.Ɨı r2 = new o.Ɨı
            r2.<init>(r0)
            r0.f12415 = r2
        L_0x015b:
            o.Ɨı r2 = r0.f12415
            r4 = 1
            r2.f4716 = r4
            r2.onTouch(r0, r1)
            goto L_0x017a
        L_0x0164:
            o.Ɨı r1 = r0.f12415
            if (r1 == 0) goto L_0x017a
            boolean r2 = r1.f4716
            if (r2 == 0) goto L_0x0178
            boolean r2 = r1.f4709
            if (r2 == 0) goto L_0x0173
            r1.f4714 = r4
            goto L_0x0178
        L_0x0173:
            o.ƖІ$ɩ r2 = r1.f4715
            r2.m5485()
        L_0x0178:
            r1.f4716 = r4
        L_0x017a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2688.m14293(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m14291() {
        Drawable selector = getSelector();
        if (selector != null && this.f12424 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f12419.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f12419);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void run() {
        this.f12417 = null;
        drawableStateChanged();
    }
}
