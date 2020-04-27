package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ɜɪ  reason: contains not printable characters */
public abstract class C1137<V extends View> extends C1351<V> {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f6653;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private VelocityTracker f6654;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f6655 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    OverScroller f6656;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f6657;

    /* renamed from: ι  reason: contains not printable characters */
    private Runnable f6658;

    /* renamed from: І  reason: contains not printable characters */
    private int f6659 = -1;

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m7576(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m7577() {
        return false;
    }

    public C1137() {
    }

    public C1137(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f6659 < 0) {
            this.f6659 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f6653) {
            int i = this.f6655;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f6657) > this.f6659) {
                this.f6657 = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f6655 = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            this.f6653 = m7577() && coordinatorLayout.m143(v, x, y2);
            if (this.f6653) {
                this.f6657 = y2;
                this.f6655 = motionEvent.getPointerId(0);
                if (this.f6654 == null) {
                    this.f6654 = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f6656;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f6656.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f6654;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r1 = 0
            r3 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x005e
            r4 = 2
            if (r0 == r4) goto L_0x0034
            r2 = 3
            if (r0 == r2) goto L_0x00c5
            r1 = 6
            if (r0 == r1) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            int r1 = r7.getPointerId(r0)
            r6.f6655 = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f6657 = r0
            goto L_0x005b
        L_0x0034:
            int r0 = r6.f6655
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r3) goto L_0x003d
            return r9
        L_0x003d:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f6657
            int r1 = r1 - r0
            r6.f6657 = r0
            int r4 = r6.m7578(r2)
            int r0 = r19.m7579()
            int r3 = r0 - r1
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r0.m7575(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = 0
            goto L_0x00d3
        L_0x005e:
            android.view.VelocityTracker r0 = r6.f6654
            if (r0 == 0) goto L_0x00c5
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f6654
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r6.f6654
            int r4 = r6.f6655
            float r0 = r0.getYVelocity(r4)
            int r4 = r6.m7574(r2)
            int r4 = -r4
            java.lang.Runnable r5 = r6.f6658
            if (r5 == 0) goto L_0x0082
            r2.removeCallbacks(r5)
            r6.f6658 = r1
        L_0x0082:
            android.widget.OverScroller r5 = r6.f6656
            if (r5 != 0) goto L_0x0091
            android.widget.OverScroller r5 = new android.widget.OverScroller
            android.content.Context r10 = r21.getContext()
            r5.<init>(r10)
            r6.f6656 = r5
        L_0x0091:
            android.widget.OverScroller r10 = r6.f6656
            r11 = 0
            int r12 = r19.getTopAndBottomOffset()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r18 = 0
            r17 = r4
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f6656
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            o.ɜɪ$If r0 = new o.ɜɪ$If
            r4 = r20
            r0.<init>(r4, r2)
            r6.f6658 = r0
            java.lang.Runnable r0 = r6.f6658
            o.C0293.m4204((android.view.View) r2, (java.lang.Runnable) r0)
            goto L_0x00c3
        L_0x00be:
            r4 = r20
            r19.m7576(r20, r21)
        L_0x00c3:
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            r6.f6653 = r9
            r6.f6655 = r3
            android.view.VelocityTracker r2 = r6.f6654
            if (r2 == 0) goto L_0x00d3
            r2.recycle()
            r6.f6654 = r1
        L_0x00d3:
            android.view.VelocityTracker r1 = r6.f6654
            if (r1 == 0) goto L_0x00da
            r1.addMovement(r7)
        L_0x00da:
            boolean r1 = r6.f6653
            if (r1 != 0) goto L_0x00e2
            if (r0 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            return r9
        L_0x00e2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1137.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m7575(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 != 0 && topAndBottomOffset >= i2 && topAndBottomOffset <= i3) {
            if (i < i2) {
                i = i2;
            } else if (i > i3) {
                i = i3;
            }
            if (topAndBottomOffset != i) {
                setTopAndBottomOffset(i);
                return topAndBottomOffset - i;
            }
        }
        return 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public int m7579() {
        return getTopAndBottomOffset();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public int m7578(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public int m7574(V v) {
        return v.getHeight();
    }

    /* renamed from: o.ɜɪ$If */
    class If implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private final CoordinatorLayout f6660;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final V f6661;

        If(CoordinatorLayout coordinatorLayout, V v) {
            this.f6660 = coordinatorLayout;
            this.f6661 = v;
        }

        public final void run() {
            if (this.f6661 != null && C1137.this.f6656 != null) {
                if (C1137.this.f6656.computeScrollOffset()) {
                    C1137 r1 = C1137.this;
                    r1.m7575(this.f6660, this.f6661, r1.f6656.getCurrY(), RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
                    C0293.m4204((View) this.f6661, (Runnable) this);
                    return;
                }
                C1137.this.m7576(this.f6660, this.f6661);
            }
        }
    }
}
