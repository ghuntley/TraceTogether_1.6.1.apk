package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: o.ıΙ  reason: contains not printable characters */
public abstract class C0381 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: ı  reason: contains not printable characters */
    final View f3928;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int[] f3929 = new int[2];

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float f3930;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f3931;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Runnable f3932;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f3933;

    /* renamed from: ι  reason: contains not printable characters */
    private Runnable f3934;

    /* renamed from: І  reason: contains not printable characters */
    private int f3935;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f3936;

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract C2257 m4637();

    public C0381(View view) {
        this.f3928 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3930 = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3933 = ViewConfiguration.getTapTimeout();
        this.f3931 = (this.f3933 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f3936;
        if (z2) {
            z = m4634(motionEvent) || !m4636();
        } else {
            z = m4631(motionEvent) && m4638();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3928.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f3936 = z;
        return z || z2;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3936 = false;
        this.f3935 = -1;
        Runnable runnable = this.f3934;
        if (runnable != null) {
            this.f3928.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public boolean m4638() {
        C2257 r0 = m4637();
        if (r0 == null || r0.m11819()) {
            return true;
        }
        r0.b_();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m4636() {
        C2257 r0 = m4637();
        if (r0 == null || !r0.m11819()) {
            return true;
        }
        r0.m11820();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4631(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f3928
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f3935
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f3930
            boolean r6 = m4632(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m4629()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m4629()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f3935 = r6
            java.lang.Runnable r6 = r5.f3934
            if (r6 != 0) goto L_0x0052
            o.ıΙ$ɩ r6 = new o.ıΙ$ɩ
            r6.<init>()
            r5.f3934 = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f3934
            int r1 = r5.f3933
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f3932
            if (r6 != 0) goto L_0x0065
            o.ıΙ$ǃ r6 = new o.ıΙ$ǃ
            r6.<init>()
            r5.f3932 = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f3932
            int r1 = r5.f3931
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0381.m4631(android.view.MotionEvent):boolean");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m4629() {
        Runnable runnable = this.f3932;
        if (runnable != null) {
            this.f3928.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3934;
        if (runnable2 != null) {
            this.f3928.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m4635() {
        m4629();
        View view = this.f3928;
        if (view.isEnabled() && !view.isLongClickable() && m4638()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f3936 = true;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m4634(MotionEvent motionEvent) {
        C2688 r1;
        View view = this.f3928;
        C2257 r12 = m4637();
        if (r12 != null && r12.m11819() && (r1 = (C2688) r12.m11821()) != null && r1.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m4633(view, obtainNoHistory);
            m4630(r1, obtainNoHistory);
            boolean r0 = r1.m14293(obtainNoHistory, this.f3935);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (!r0 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m4632(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m4630(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3929;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m4633(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3929;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: o.ıΙ$ɩ  reason: contains not printable characters */
    class C0383 implements Runnable {
        C0383() {
        }

        public final void run() {
            ViewParent parent = C0381.this.f3928.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: o.ıΙ$ǃ  reason: contains not printable characters */
    class C0382 implements Runnable {
        C0382() {
        }

        public final void run() {
            C0381.this.m4635();
        }
    }
}
