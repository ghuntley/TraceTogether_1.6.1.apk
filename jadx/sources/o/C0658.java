package o;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: o.ƖІ  reason: contains not printable characters */
public abstract class C0658 implements View.OnTouchListener {

    /* renamed from: ŀ  reason: contains not printable characters */
    private static final int f4703 = ViewConfiguration.getTapTimeout();

    /* renamed from: ı  reason: contains not printable characters */
    boolean f4704;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Interpolator f4705 = new AccelerateInterpolator();

    /* renamed from: ǃ  reason: contains not printable characters */
    final View f4706;

    /* renamed from: ȷ  reason: contains not printable characters */
    private float[] f4707 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: ɨ  reason: contains not printable characters */
    private float[] f4708 = {0.0f, 0.0f};

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean f4709;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f4710;

    /* renamed from: ɹ  reason: contains not printable characters */
    private float[] f4711 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f4712;

    /* renamed from: ʟ  reason: contains not printable characters */
    private boolean f4713;

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean f4714;

    /* renamed from: ι  reason: contains not printable characters */
    public final C0660 f4715 = new C0660();

    /* renamed from: І  reason: contains not printable characters */
    public boolean f4716;

    /* renamed from: і  reason: contains not printable characters */
    private Runnable f4717;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private float[] f4718 = {0.0f, 0.0f};

    /* renamed from: ӏ  reason: contains not printable characters */
    private float[] f4719 = {0.0f, 0.0f};

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m5478(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static float m5480(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m5481(int i);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract boolean m5483(int i);

    public C0658(View view) {
        this.f4706 = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float[] fArr = this.f4707;
        float f = ((float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.f4719;
        float f2 = ((float) ((int) ((displayMetrics.density * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.f4712 = 1;
        float[] fArr3 = this.f4711;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f4718;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f4708;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f4710 = f4703;
        C0660 r6 = this.f4715;
        r6.f4727 = 500;
        r6.f4726 = 500;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4716
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0027
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0086
        L_0x0016:
            boolean r6 = r5.f4709
            if (r6 == 0) goto L_0x001d
            r5.f4714 = r1
            goto L_0x0086
        L_0x001d:
            o.ƖІ$ɩ r6 = r5.f4715
            r6.m5485()
            goto L_0x0086
        L_0x0023:
            r5.f4704 = r2
            r5.f4713 = r1
        L_0x0027:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4706
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m5477(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4706
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m5477(r2, r7, r6, r3)
            o.ƖІ$ɩ r7 = r5.f4715
            r7.f4723 = r0
            r7.f4724 = r6
            boolean r6 = r5.f4714
            if (r6 != 0) goto L_0x0086
            boolean r6 = r5.m5482()
            if (r6 == 0) goto L_0x0086
            java.lang.Runnable r6 = r5.f4717
            if (r6 != 0) goto L_0x006a
            o.ƖІ$ı r6 = new o.ƖІ$ı
            r6.<init>()
            r5.f4717 = r6
        L_0x006a:
            r5.f4714 = r2
            r5.f4709 = r2
            boolean r6 = r5.f4713
            if (r6 != 0) goto L_0x007f
            int r6 = r5.f4710
            if (r6 <= 0) goto L_0x007f
            android.view.View r7 = r5.f4706
            java.lang.Runnable r0 = r5.f4717
            long r3 = (long) r6
            o.C0293.m4166(r7, r0, r3)
            goto L_0x0084
        L_0x007f:
            java.lang.Runnable r6 = r5.f4717
            r6.run()
        L_0x0084:
            r5.f4713 = r2
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0658.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5482() {
        C0660 r0 = this.f4715;
        int abs = (int) (r0.f4724 / Math.abs(r0.f4724));
        int abs2 = (int) (r0.f4723 / Math.abs(r0.f4723));
        return abs != 0 && m5483(abs);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private float m5477(int i, float f, float f2, float f3) {
        float r5 = m5476(this.f4718[i], f2, this.f4711[i], f);
        int i2 = (r5 > 0.0f ? 1 : (r5 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f4708[i];
        float f5 = this.f4719[i];
        float f6 = this.f4707[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            float f8 = r5 * f7;
            if (f8 > f6) {
                return f6;
            }
            return f8 < f5 ? f5 : f8;
        }
        float f9 = (-r5) * f7;
        if (f9 <= f6) {
            f6 = f9 < f5 ? f5 : f9;
        }
        return -f6;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private float m5476(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f * f2;
        if (f6 > f3) {
            f6 = f3;
        } else if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float r3 = m5479(f2 - f4, f6) - m5479(f4, f6);
        if (r3 < 0.0f) {
            f5 = -this.f4705.getInterpolation(-r3);
        } else if (r3 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f4705.getInterpolation(r3);
        }
        if (f5 > 1.0f) {
            return 1.0f;
        }
        if (f5 < -1.0f) {
            return -1.0f;
        }
        return f5;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private float m5479(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f4712;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f4714 || this.f4712 != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: o.ƖІ$ı  reason: contains not printable characters */
    class C0659 implements Runnable {
        C0659() {
        }

        public final void run() {
            if (C0658.this.f4714) {
                if (C0658.this.f4709) {
                    C0658 r0 = C0658.this;
                    r0.f4709 = false;
                    C0660 r02 = r0.f4715;
                    r02.f4721 = AnimationUtils.currentAnimationTimeMillis();
                    r02.f4725 = -1;
                    r02.f4722 = r02.f4721;
                    r02.f4730 = 0.5f;
                    r02.f4729 = 0;
                }
                C0660 r03 = C0658.this.f4715;
                if ((r03.f4725 > 0 && AnimationUtils.currentAnimationTimeMillis() > r03.f4725 + ((long) r03.f4728)) || !C0658.this.m5482()) {
                    C0658.this.f4714 = false;
                    return;
                }
                if (C0658.this.f4704) {
                    C0658 r2 = C0658.this;
                    r2.f4704 = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    r2.f4706.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (r03.f4722 != 0) {
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    float r3 = r03.m5484(currentAnimationTimeMillis);
                    r03.f4722 = currentAnimationTimeMillis;
                    r03.f4729 = (int) (((float) (currentAnimationTimeMillis - r03.f4722)) * ((-4.0f * r3 * r3) + (r3 * 4.0f)) * r03.f4724);
                    C0658.this.m5481(r03.f4729);
                    C0293.m4204(C0658.this.f4706, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    /* renamed from: o.ƖІ$ɩ  reason: contains not printable characters */
    public static class C0660 {

        /* renamed from: ı  reason: contains not printable characters */
        long f4721 = Long.MIN_VALUE;

        /* renamed from: Ɩ  reason: contains not printable characters */
        long f4722 = 0;

        /* renamed from: ǃ  reason: contains not printable characters */
        float f4723;

        /* renamed from: ɩ  reason: contains not printable characters */
        float f4724;

        /* renamed from: ɹ  reason: contains not printable characters */
        long f4725 = -1;

        /* renamed from: Ι  reason: contains not printable characters */
        int f4726;

        /* renamed from: ι  reason: contains not printable characters */
        int f4727;

        /* renamed from: І  reason: contains not printable characters */
        int f4728;

        /* renamed from: і  reason: contains not printable characters */
        int f4729 = 0;

        /* renamed from: Ӏ  reason: contains not printable characters */
        float f4730;

        C0660() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m5485() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4728 = C0658.m5478((int) (currentAnimationTimeMillis - this.f4721), this.f4726);
            this.f4730 = m5484(currentAnimationTimeMillis);
            this.f4725 = currentAnimationTimeMillis;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final float m5484(long j) {
            if (j < this.f4721) {
                return 0.0f;
            }
            long j2 = this.f4725;
            if (j2 < 0 || j < j2) {
                return C0658.m5480(((float) (j - this.f4721)) / ((float) this.f4727)) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f4730;
            return (1.0f - f) + (f * C0658.m5480(((float) j3) / ((float) this.f4728)));
        }
    }
}
