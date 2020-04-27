package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: o.ɍǃ  reason: contains not printable characters */
public final class C1068 {

    /* renamed from: ƚ  reason: contains not printable characters */
    private static final Interpolator f6412 = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    public int f6413;

    /* renamed from: ŀ  reason: contains not printable characters */
    private VelocityTracker f6414;

    /* renamed from: ł  reason: contains not printable characters */
    private boolean f6415;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public int f6416;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final ViewGroup f6417;

    /* renamed from: ǃ  reason: contains not printable characters */
    public float[] f6418;

    /* renamed from: ȷ  reason: contains not printable characters */
    public View f6419;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int[] f6420;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f6421;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int[] f6422;

    /* renamed from: ɹ  reason: contains not printable characters */
    public int f6423;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f6424 = -1;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final If f6425;

    /* renamed from: ʅ  reason: contains not printable characters */
    private final Runnable f6426 = new Runnable() {
        public final void run() {
            C1068.this.m7378(0);
        }
    };

    /* renamed from: ʟ  reason: contains not printable characters */
    private OverScroller f6427;

    /* renamed from: Ι  reason: contains not printable characters */
    public float[] f6428;

    /* renamed from: ι  reason: contains not printable characters */
    public float[] f6429;

    /* renamed from: І  reason: contains not printable characters */
    public int f6430;

    /* renamed from: г  reason: contains not printable characters */
    private float f6431;

    /* renamed from: і  reason: contains not printable characters */
    public float[] f6432;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public float f6433;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int[] f6434;

    /* renamed from: o.ɍǃ$If */
    public static abstract class If {
        /* renamed from: ı  reason: contains not printable characters */
        public int m7387(View view, int i) {
            return 0;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m7388(View view, int i) {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public int m7389(View view, int i) {
            return 0;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m7390() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m7391(int i, int i2) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m7392(View view, float f, float f2) {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract boolean m7393(View view, int i);

        /* renamed from: ι  reason: contains not printable characters */
        public int m7394() {
            return 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public int m7395(View view) {
            return 0;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m7396(int i) {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m7397(View view, int i) {
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1068 m7371(ViewGroup viewGroup, If ifR) {
        return new C1068(viewGroup.getContext(), viewGroup, ifR);
    }

    private C1068(Context context, ViewGroup viewGroup, If ifR) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (ifR != null) {
            this.f6417 = viewGroup;
            this.f6425 = ifR;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f6423 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f6413 = viewConfiguration.getScaledTouchSlop();
            this.f6431 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f6433 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f6427 = new OverScroller(context, f6412);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7383(View view, int i) {
        if (view.getParent() == this.f6417) {
            this.f6419 = view;
            this.f6424 = i;
            this.f6425.m7397(view, i);
            m7378(1);
            return;
        }
        StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f6417);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7386() {
        this.f6424 = -1;
        float[] fArr = this.f6429;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6428, 0.0f);
            Arrays.fill(this.f6418, 0.0f);
            Arrays.fill(this.f6432, 0.0f);
            Arrays.fill(this.f6420, 0);
            Arrays.fill(this.f6422, 0);
            Arrays.fill(this.f6434, 0);
            this.f6430 = 0;
        }
        VelocityTracker velocityTracker = this.f6414;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6414 = null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m7377() {
        m7386();
        if (this.f6421 == 2) {
            this.f6427.getCurrX();
            this.f6427.getCurrY();
            this.f6427.abortAnimation();
            int currX = this.f6427.getCurrX();
            this.f6427.getCurrY();
            this.f6425.m7388(this.f6419, currX);
        }
        m7378(0);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7385(View view, int i, int i2) {
        this.f6419 = view;
        this.f6424 = -1;
        boolean r1 = m7366(i, i2, 0, 0);
        if (!r1 && this.f6421 == 0 && this.f6419 != null) {
            this.f6419 = null;
        }
        return r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m7384(int i, int i2) {
        if (this.f6415) {
            return m7366(i, i2, (int) this.f6414.getXVelocity(this.f6424), (int) this.f6414.getYVelocity(this.f6424));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m7366(int i, int i2, int i3, int i4) {
        int left = this.f6419.getLeft();
        int top = this.f6419.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f6427.abortAnimation();
            m7378(0);
            return false;
        }
        this.f6427.startScroll(left, top, i5, i6, m7364(this.f6419, i5, i6, i3, i4));
        m7378(2);
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m7364(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = (int) this.f6433;
        int i6 = (int) this.f6431;
        int abs = Math.abs(i3);
        if (abs < i5) {
            i3 = 0;
        } else if (abs > i6) {
            i3 = i3 > 0 ? i6 : -i6;
        }
        int i7 = (int) this.f6433;
        int i8 = (int) this.f6431;
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int abs3 = Math.abs(i);
        int abs4 = Math.abs(i2);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f2 = (float) abs5;
            f = (float) i9;
        } else {
            f2 = (float) abs3;
            f = (float) i10;
        }
        float f5 = f2 / f;
        if (i4 != 0) {
            f4 = (float) abs6;
            f3 = (float) i9;
        } else {
            f4 = (float) abs4;
            f3 = (float) i10;
        }
        return (int) ((((float) m7374(i, i3, this.f6425.m7395(view))) * f5) + (((float) m7374(i2, i4, this.f6425.m7394())) * (f4 / f3)));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m7374(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f6417.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m7381() {
        if (this.f6421 == 2) {
            boolean computeScrollOffset = this.f6427.computeScrollOffset();
            int currX = this.f6427.getCurrX();
            int currY = this.f6427.getCurrY();
            int left = currX - this.f6419.getLeft();
            int top = currY - this.f6419.getTop();
            if (left != 0) {
                C0293.m4221(this.f6419, left);
            }
            if (top != 0) {
                C0293.m4164(this.f6419, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f6425.m7388(this.f6419, currX);
            }
            if (computeScrollOffset && currX == this.f6427.getFinalX() && currY == this.f6427.getFinalY()) {
                this.f6427.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f6417.post(this.f6426);
            }
        }
        if (this.f6421 == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m7375(float f, float f2) {
        this.f6415 = true;
        this.f6425.m7392(this.f6419, f, f2);
        this.f6415 = false;
        if (this.f6421 == 1) {
            m7378(0);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7368(int i) {
        if (this.f6429 != null) {
            boolean z = true;
            int i2 = 1 << i;
            if ((this.f6430 & i2) == 0) {
                z = false;
            }
            if (z) {
                this.f6429[i] = 0.0f;
                this.f6428[i] = 0.0f;
                this.f6418[i] = 0.0f;
                this.f6432[i] = 0.0f;
                this.f6420[i] = 0;
                this.f6422[i] = 0;
                this.f6434[i] = 0;
                this.f6430 &= ~i2;
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m7373(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            boolean z = true;
            if ((this.f6430 & (1 << pointerId)) == 0) {
                z = false;
            }
            if (z) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f6418[pointerId] = x;
                this.f6432[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m7378(int i) {
        this.f6417.removeCallbacks(this.f6426);
        if (this.f6421 != i) {
            this.f6421 = i;
            this.f6425.m7396(i);
            if (this.f6421 == 0) {
                this.f6419 = null;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m7376(View view, int i) {
        if (view == this.f6419 && this.f6424 == i) {
            return true;
        }
        if (view == null || !this.f6425.m7393(view, i)) {
            return false;
        }
        this.f6424 = i;
        m7383(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m7379(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.m7386()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f6414
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f6414 = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f6414
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0100
            if (r2 == r6) goto L_0x00fc
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00fc
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x012f
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.m7368((int) r1)
            goto L_0x012f
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m7367((float) r7, (float) r1, (int) r2)
            int r3 = r0.f6421
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.f6420
            r1 = r1[r2]
            int r2 = r0.f6416
            r1 = r1 & r2
            if (r1 == 0) goto L_0x012f
            o.ɍǃ$If r1 = r0.f6425
            r1.m7390()
            goto L_0x012f
        L_0x005f:
            if (r3 != r4) goto L_0x012f
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.m7380(r3, r1)
            android.view.View r3 = r0.f6419
            if (r1 != r3) goto L_0x012f
            r0.m7376((android.view.View) r1, (int) r2)
            goto L_0x012f
        L_0x0070:
            float[] r2 = r0.f6429
            if (r2 == 0) goto L_0x012f
            float[] r2 = r0.f6428
            if (r2 == 0) goto L_0x012f
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007d:
            if (r3 >= r2) goto L_0x00f8
            int r4 = r1.getPointerId(r3)
            int r7 = r0.f6430
            int r8 = r6 << r4
            r7 = r7 & r8
            if (r7 == 0) goto L_0x008c
            r7 = 1
            goto L_0x008d
        L_0x008c:
            r7 = 0
        L_0x008d:
            if (r7 == 0) goto L_0x00f5
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f6429
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f6428
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.m7380(r7, r8)
            if (r7 == 0) goto L_0x00b3
            boolean r8 = r0.m7369((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00b3
            r8 = 1
            goto L_0x00b4
        L_0x00b3:
            r8 = 0
        L_0x00b4:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            o.ɍǃ$If r13 = r0.f6425
            int r12 = r13.m7389(r7, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r14 = r14 + r13
            o.ɍǃ$If r15 = r0.f6425
            int r14 = r15.m7387(r7, r14)
            o.ɍǃ$If r15 = r0.f6425
            int r15 = r15.m7395((android.view.View) r7)
            o.ɍǃ$If r5 = r0.f6425
            int r5 = r5.m7394()
            if (r15 == 0) goto L_0x00e0
            if (r15 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00e0:
            if (r5 == 0) goto L_0x00f8
            if (r5 <= 0) goto L_0x00e6
            if (r14 == r13) goto L_0x00f8
        L_0x00e6:
            r0.m7365(r9, r10, r4)
            int r5 = r0.f6421
            if (r5 == r6) goto L_0x00f8
            if (r8 == 0) goto L_0x00f5
            boolean r4 = r0.m7376((android.view.View) r7, (int) r4)
            if (r4 != 0) goto L_0x00f8
        L_0x00f5:
            int r3 = r3 + 1
            goto L_0x007d
        L_0x00f8:
            r16.m7373(r17)
            goto L_0x012f
        L_0x00fc:
            r16.m7386()
            goto L_0x012f
        L_0x0100:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m7367((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.m7380(r2, r3)
            android.view.View r3 = r0.f6419
            if (r2 != r3) goto L_0x0121
            int r3 = r0.f6421
            if (r3 != r4) goto L_0x0121
            r0.m7376((android.view.View) r2, (int) r1)
        L_0x0121:
            int[] r2 = r0.f6420
            r1 = r2[r1]
            int r2 = r0.f6416
            r1 = r1 & r2
            if (r1 == 0) goto L_0x012f
            o.ɍǃ$If r1 = r0.f6425
            r1.m7390()
        L_0x012f:
            int r1 = r0.f6421
            if (r1 != r6) goto L_0x0134
            return r6
        L_0x0134:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1068.m7379(android.view.MotionEvent):boolean");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7382(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m7386();
        }
        if (this.f6414 == null) {
            this.f6414 = VelocityTracker.obtain();
        }
        this.f6414.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r2 = m7380((int) x, (int) y);
            m7367(x, y, pointerId);
            m7376(r2, pointerId);
            if ((this.f6420[pointerId] & this.f6416) != 0) {
                this.f6425.m7390();
            }
        } else if (actionMasked == 1) {
            if (this.f6421 == 1) {
                m7372();
            }
            m7386();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f6421 == 1) {
                    m7375(0.0f, 0.0f);
                }
                m7386();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m7367(x2, y2, pointerId2);
                if (this.f6421 == 0) {
                    m7376(m7380((int) x2, (int) y2), pointerId2);
                    if ((this.f6420[pointerId2] & this.f6416) != 0) {
                        this.f6425.m7390();
                        return;
                    }
                    return;
                }
                if (m7363(this.f6419, (int) x2, (int) y2)) {
                    m7376(this.f6419, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f6421 == 1 && pointerId3 == this.f6424) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f6424) {
                            View r5 = m7380((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f6419;
                            if (r5 == view && m7376(view, pointerId4)) {
                                i = this.f6424;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m7372();
                    }
                }
                m7368(pointerId3);
            }
        } else if (this.f6421 == 1) {
            if (((1 << this.f6424) & this.f6430) != 0) {
                i2 = 1;
            }
            if (i2 != 0) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f6424);
                float x3 = motionEvent.getX(findPointerIndex);
                float y3 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f6418;
                int i3 = this.f6424;
                int i4 = (int) (x3 - fArr[i3]);
                int i5 = (int) (y3 - this.f6432[i3]);
                int left = this.f6419.getLeft() + i4;
                int top = this.f6419.getTop() + i5;
                int left2 = this.f6419.getLeft();
                int top2 = this.f6419.getTop();
                if (i4 != 0) {
                    left = this.f6425.m7389(this.f6419, left);
                    C0293.m4221(this.f6419, left - left2);
                }
                if (i5 != 0) {
                    C0293.m4164(this.f6419, this.f6425.m7387(this.f6419, top) - top2);
                }
                if (!(i4 == 0 && i5 == 0)) {
                    this.f6425.m7388(this.f6419, left);
                }
                m7373(motionEvent);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i6 = 0; i6 < pointerCount2; i6++) {
                int pointerId5 = motionEvent.getPointerId(i6);
                if ((this.f6430 & (1 << pointerId5)) != 0) {
                    float x4 = motionEvent.getX(i6);
                    float y4 = motionEvent.getY(i6);
                    float f = x4 - this.f6429[pointerId5];
                    float f2 = y4 - this.f6428[pointerId5];
                    m7365(f, f2, pointerId5);
                    if (this.f6421 == 1) {
                        break;
                    }
                    View r52 = m7380((int) x4, (int) y4);
                    if (m7369(r52, f, f2) && m7376(r52, pointerId5)) {
                        break;
                    }
                }
            }
            m7373(motionEvent);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m7365(float f, float f2, int i) {
        boolean r0 = m7362(f, f2, i, 1);
        if (m7362(f2, f, i, 4)) {
            r0 |= true;
        }
        if (m7362(f, f2, i, 2)) {
            r0 |= true;
        }
        if (m7362(f2, f, i, 8)) {
            r0 |= true;
        }
        if (r0) {
            int[] iArr = this.f6422;
            iArr[i] = iArr[i] | r0;
            this.f6425.m7391(r0 ? 1 : 0, i);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m7362(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f6420[i] & i2) != i2 || (this.f6416 & i2) == 0 || (this.f6434[i] & i2) == i2 || (this.f6422[i] & i2) == i2)) {
            int i3 = this.f6413;
            if ((abs > ((float) i3) || abs2 > ((float) i3)) && (this.f6422[i] & i2) == 0 && abs > ((float) this.f6413)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m7369(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f6425.m7395(view) > 0;
        boolean z2 = this.f6425.m7394() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f6413) : z2 && Math.abs(f2) > ((float) this.f6413);
        }
        int i = this.f6413;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m7372() {
        this.f6414.computeCurrentVelocity(1000, this.f6431);
        float xVelocity = this.f6414.getXVelocity(this.f6424);
        float f = this.f6433;
        float f2 = this.f6431;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f6414.getYVelocity(this.f6424);
        float f4 = this.f6433;
        float f5 = this.f6431;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            f3 = abs2 > f5 ? yVelocity > 0.0f ? f5 : -f5 : yVelocity;
        }
        m7375(xVelocity, f3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m7363(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final View m7380(int i, int i2) {
        for (int childCount = this.f6417.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f6417.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1068 m7370(ViewGroup viewGroup, float f, If ifR) {
        C1068 r0 = new C1068(viewGroup.getContext(), viewGroup, ifR);
        r0.f6413 = (int) (((float) r0.f6413) * (1.0f / f));
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m7367(float f, float f2, int i) {
        float[] fArr = this.f6429;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.f6429;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f6428;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f6418;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f6432;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f6420;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6422;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6434;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6429 = fArr2;
            this.f6428 = fArr3;
            this.f6418 = fArr4;
            this.f6432 = fArr5;
            this.f6420 = iArr;
            this.f6422 = iArr2;
            this.f6434 = iArr3;
        }
        float[] fArr10 = this.f6429;
        this.f6418[i] = f;
        fArr10[i] = f;
        float[] fArr11 = this.f6428;
        this.f6432[i] = f2;
        fArr11[i] = f2;
        int[] iArr7 = this.f6420;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f6417.getLeft() + this.f6423) {
            i2 = 1;
        }
        if (i5 < this.f6417.getTop() + this.f6423) {
            i2 |= 4;
        }
        if (i4 > this.f6417.getRight() - this.f6423) {
            i2 |= 2;
        }
        if (i5 > this.f6417.getBottom() - this.f6423) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f6430 |= 1 << i;
    }
}
