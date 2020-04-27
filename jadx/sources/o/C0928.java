package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.ǃј  reason: contains not printable characters */
public final class C0928 extends RecyclerView.C0037 implements RecyclerView.C3241Aux {

    /* renamed from: ł  reason: contains not printable characters */
    private static final int[] f5855 = new int[0];

    /* renamed from: ɿ  reason: contains not printable characters */
    private static final int[] f5856 = {16842919};

    /* renamed from: ı  reason: contains not printable characters */
    final Drawable f5857;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final int f5858;

    /* renamed from: ſ  reason: contains not printable characters */
    private final StateListDrawable f5859;

    /* renamed from: Ɩ  reason: contains not printable characters */
    int f5860;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private final Drawable f5861;

    /* renamed from: ƚ  reason: contains not printable characters */
    private final int f5862;

    /* renamed from: ǀ  reason: contains not printable characters */
    private final int[] f5863 = new int[2];

    /* renamed from: ǃ  reason: contains not printable characters */
    final int f5864;

    /* renamed from: ȷ  reason: contains not printable characters */
    int f5865 = 0;

    /* renamed from: ɍ  reason: contains not printable characters */
    private final int f5866;

    /* renamed from: ɔ  reason: contains not printable characters */
    private final int[] f5867 = new int[2];

    /* renamed from: ɟ  reason: contains not printable characters */
    private float f5868;

    /* renamed from: ɨ  reason: contains not printable characters */
    boolean f5869 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f5870;

    /* renamed from: ɪ  reason: contains not printable characters */
    int f5871 = 0;

    /* renamed from: ɹ  reason: contains not printable characters */
    int f5872 = 0;

    /* renamed from: ɺ  reason: contains not printable characters */
    private int f5873 = 0;

    /* renamed from: ɼ  reason: contains not printable characters */
    private final Runnable f5874 = new Runnable() {
        public final void run() {
            C0928 r0 = C0928.this;
            int i = r0.f5871;
            if (i == 1) {
                r0.f5875.cancel();
            } else if (i != 2) {
                return;
            }
            r0.f5871 = 3;
            r0.f5875.setFloatValues(new float[]{((Float) r0.f5875.getAnimatedValue()).floatValue(), 0.0f});
            r0.f5875.setDuration(500);
            r0.f5875.start();
        }
    };

    /* renamed from: ɾ  reason: contains not printable characters */
    final ValueAnimator f5875 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: ʅ  reason: contains not printable characters */
    private float f5876;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final int f5877;

    /* renamed from: Ι  reason: contains not printable characters */
    int f5878;

    /* renamed from: ι  reason: contains not printable characters */
    final StateListDrawable f5879;

    /* renamed from: І  reason: contains not printable characters */
    RecyclerView f5880;

    /* renamed from: Ј  reason: contains not printable characters */
    private final RecyclerView.C3243aUx f5881 = new RecyclerView.C3243aUx() {
        /* renamed from: ι  reason: contains not printable characters */
        public final void m6770(RecyclerView recyclerView, int i, int i2) {
            C0928 r10 = C0928.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = r10.f5880.computeVerticalScrollRange();
            int i3 = r10.f5872;
            r10.f5885 = computeVerticalScrollRange - i3 > 0 && r10.f5872 >= r10.f5864;
            int computeHorizontalScrollRange = r10.f5880.computeHorizontalScrollRange();
            int i4 = r10.f5883;
            r10.f5869 = computeHorizontalScrollRange - i4 > 0 && r10.f5883 >= r10.f5864;
            if (r10.f5885 || r10.f5869) {
                if (r10.f5885) {
                    float f = (float) i3;
                    r10.f5878 = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                    r10.f5870 = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (r10.f5869) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    r10.f5860 = (int) ((f3 * (f2 + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    r10.f5884 = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                if (r10.f5865 == 0 || r10.f5865 == 1) {
                    r10.m6769(1);
                }
            } else if (r10.f5865 != 0) {
                r10.m6769(0);
            }
        }
    };

    /* renamed from: г  reason: contains not printable characters */
    private final int f5882;

    /* renamed from: і  reason: contains not printable characters */
    int f5883 = 0;

    /* renamed from: Ӏ  reason: contains not printable characters */
    int f5884;

    /* renamed from: ӏ  reason: contains not printable characters */
    boolean f5885 = false;

    public C0928(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f5879 = stateListDrawable;
        this.f5857 = drawable;
        this.f5859 = stateListDrawable2;
        this.f5861 = drawable2;
        this.f5858 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f5882 = Math.max(i, drawable.getIntrinsicWidth());
        this.f5866 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f5862 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f5864 = i2;
        this.f5877 = i3;
        this.f5879.setAlpha(255);
        this.f5857.setAlpha(255);
        this.f5875.addListener(new If());
        this.f5875.addUpdateListener(new Cif());
        RecyclerView recyclerView2 = this.f5880;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f5880.removeOnItemTouchListener(this);
                this.f5880.removeOnScrollListener(this.f5881);
                this.f5880.removeCallbacks(this.f5874);
            }
            this.f5880 = recyclerView;
            RecyclerView recyclerView3 = this.f5880;
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(this);
                this.f5880.addOnItemTouchListener(this);
                this.f5880.addOnScrollListener(this.f5881);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6769(int i) {
        if (i == 2 && this.f5865 != 2) {
            this.f5879.setState(f5856);
            this.f5880.removeCallbacks(this.f5874);
        }
        if (i == 0) {
            this.f5880.invalidate();
        } else {
            m6766();
        }
        if (this.f5865 == 2 && i != 2) {
            this.f5879.setState(f5855);
            this.f5880.removeCallbacks(this.f5874);
            this.f5880.postDelayed(this.f5874, 1200);
        } else if (i == 1) {
            this.f5880.removeCallbacks(this.f5874);
            this.f5880.postDelayed(this.f5874, 1500);
        }
        this.f5865 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6766() {
        int i = this.f5871;
        if (i != 0) {
            if (i == 3) {
                this.f5875.cancel();
            } else {
                return;
            }
        }
        this.f5871 = 1;
        ValueAnimator valueAnimator = this.f5875;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f5875.setDuration(500);
        this.f5875.setStartDelay(0);
        this.f5875.start();
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0033 r8) {
        if (this.f5883 != this.f5880.getWidth() || this.f5872 != this.f5880.getHeight()) {
            this.f5883 = this.f5880.getWidth();
            this.f5872 = this.f5880.getHeight();
            m6769(0);
        } else if (this.f5871 != 0) {
            if (this.f5885) {
                int i = this.f5883;
                int i2 = this.f5858;
                int i3 = i - i2;
                int i4 = this.f5878;
                int i5 = this.f5870;
                int i6 = i4 - (i5 / 2);
                this.f5879.setBounds(0, 0, i2, i5);
                this.f5857.setBounds(0, 0, this.f5882, this.f5872);
                boolean z = true;
                if (C0293.m4156(this.f5880) != 1) {
                    z = false;
                }
                if (z) {
                    this.f5857.draw(canvas);
                    canvas.translate((float) this.f5858, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f5879.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.f5858), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f5857.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f5879.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f5869) {
                int i7 = this.f5872;
                int i8 = this.f5866;
                int i9 = i7 - i8;
                int i10 = this.f5860;
                int i11 = this.f5884;
                int i12 = i10 - (i11 / 2);
                this.f5859.setBounds(0, 0, i11, i8);
                this.f5861.setBounds(0, 0, this.f5883, this.f5862);
                canvas.translate(0.0f, (float) i9);
                this.f5861.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f5859.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m6768(MotionEvent motionEvent) {
        int i = this.f5865;
        if (i == 1) {
            boolean r0 = m6765(motionEvent.getX(), motionEvent.getY());
            boolean r4 = m6764(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!r0 && !r4) {
                return false;
            }
            if (r4) {
                this.f5873 = 1;
                this.f5868 = (float) ((int) motionEvent.getX());
            } else if (r0) {
                this.f5873 = 2;
                this.f5876 = (float) ((int) motionEvent.getY());
            }
            m6769(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6767(MotionEvent motionEvent) {
        if (this.f5865 != 0) {
            if (motionEvent.getAction() == 0) {
                boolean r0 = m6765(motionEvent.getX(), motionEvent.getY());
                boolean r3 = m6764(motionEvent.getX(), motionEvent.getY());
                if (r0 || r3) {
                    if (r3) {
                        this.f5873 = 1;
                        this.f5868 = (float) ((int) motionEvent.getX());
                    } else if (r0) {
                        this.f5873 = 2;
                        this.f5876 = (float) ((int) motionEvent.getY());
                    }
                    m6769(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f5865 == 2) {
                this.f5876 = 0.0f;
                this.f5868 = 0.0f;
                m6769(1);
                this.f5873 = 0;
            } else if (motionEvent.getAction() == 2 && this.f5865 == 2) {
                m6766();
                if (this.f5873 == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.f5863;
                    int i = this.f5877;
                    iArr[0] = i;
                    iArr[1] = this.f5883 - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f5860) - max) >= 2.0f) {
                        int r5 = m6763(this.f5868, max, iArr, this.f5880.computeHorizontalScrollRange(), this.f5880.computeHorizontalScrollOffset(), this.f5883);
                        if (r5 != 0) {
                            this.f5880.scrollBy(r5, 0);
                        }
                        this.f5868 = max;
                    }
                }
                if (this.f5873 == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.f5867;
                    int i2 = this.f5877;
                    iArr2[0] = i2;
                    iArr2[1] = this.f5872 - i2;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.f5878) - max2) >= 2.0f) {
                        int r02 = m6763(this.f5876, max2, iArr2, this.f5880.computeVerticalScrollRange(), this.f5880.computeVerticalScrollOffset(), this.f5872);
                        if (r02 != 0) {
                            this.f5880.scrollBy(0, r02);
                        }
                        this.f5876 = max2;
                    }
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m6763(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m6764(float f, float f2) {
        if (f2 < ((float) (this.f5872 - this.f5866))) {
            return false;
        }
        int i = this.f5860;
        int i2 = this.f5884;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
    }

    /* renamed from: o.ǃј$If */
    class If extends AnimatorListenerAdapter {

        /* renamed from: ι  reason: contains not printable characters */
        private boolean f5889 = false;

        If() {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f5889) {
                this.f5889 = false;
            } else if (((Float) C0928.this.f5875.getAnimatedValue()).floatValue() == 0.0f) {
                C0928 r3 = C0928.this;
                r3.f5871 = 0;
                r3.m6769(0);
            } else {
                C0928 r32 = C0928.this;
                r32.f5871 = 2;
                r32.f5880.invalidate();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f5889 = true;
        }
    }

    /* renamed from: o.ǃј$if  reason: invalid class name */
    class Cif implements ValueAnimator.AnimatorUpdateListener {
        Cif() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0928.this.f5879.setAlpha(floatValue);
            C0928.this.f5857.setAlpha(floatValue);
            C0928.this.f5880.invalidate();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m6765(float f, float f2) {
        if (!(C0293.m4156(this.f5880) == 1) ? f >= ((float) (this.f5883 - this.f5858)) : f <= ((float) (this.f5858 / 2))) {
            int i = this.f5878;
            int i2 = this.f5870;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }
}
