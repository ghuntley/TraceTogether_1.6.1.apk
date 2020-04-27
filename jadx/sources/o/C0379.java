package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: o.ıΓ  reason: contains not printable characters */
public final class C0379 extends Drawable implements Drawable.Callback, Animatable, ValueAnimator.AnimatorUpdateListener, C0380 {

    /* renamed from: ı  reason: contains not printable characters */
    final C2560 f3874 = new C2560();

    /* renamed from: ŀ  reason: contains not printable characters */
    private final Matrix f3875 = new Matrix();

    /* renamed from: ł  reason: contains not printable characters */
    boolean f3876;

    /* renamed from: Ɩ  reason: contains not printable characters */
    String f3877;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private boolean f3878;

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0343 f3879;

    /* renamed from: ȷ  reason: contains not printable characters */
    boolean f3880;

    /* renamed from: ɨ  reason: contains not printable characters */
    C1646 f3881;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f3882 = false;

    /* renamed from: ɪ  reason: contains not printable characters */
    public boolean f3883;

    /* renamed from: ɹ  reason: contains not printable characters */
    C2998 f3884;

    /* renamed from: ɾ  reason: contains not printable characters */
    public C0548 f3885;

    /* renamed from: ɿ  reason: contains not printable characters */
    private int f3886;

    /* renamed from: ʟ  reason: contains not printable characters */
    public boolean f3887;

    /* renamed from: Ι  reason: contains not printable characters */
    boolean f3888 = true;

    /* renamed from: ι  reason: contains not printable characters */
    float f3889 = 1.0f;

    /* renamed from: І  reason: contains not printable characters */
    ImageView.ScaleType f3890;

    /* renamed from: г  reason: contains not printable characters */
    private final ValueAnimator.AnimatorUpdateListener f3891;

    /* renamed from: і  reason: contains not printable characters */
    final ArrayList<C0380> f3892;

    /* renamed from: Ӏ  reason: contains not printable characters */
    C1255 f3893;

    /* renamed from: ӏ  reason: contains not printable characters */
    public C1155 f3894;

    /* renamed from: o.ıΓ$ɩ  reason: contains not printable characters */
    interface C0380 {
        /* renamed from: ı  reason: contains not printable characters */
        void m4628();
    }

    public final int getOpacity() {
        return -3;
    }

    public C0379() {
        new HashSet();
        this.f3892 = new ArrayList<>();
        this.f3891 = this;
        this.f3886 = 255;
        this.f3878 = true;
        this.f3876 = false;
        this.f3874.addUpdateListener(this.f3891);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4613(boolean z) {
        if (this.f3883 != z) {
            if (Build.VERSION.SDK_INT < 19) {
                C2414.m12460("Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f3883 = z;
            C0343 r4 = this.f3879;
            if (r4 != null) {
                this.f3881 = new C1646(this, C2056.m10952(r4), this.f3879.f3723, this.f3879);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4606() {
        if (this.f3874.isRunning()) {
            this.f3874.cancel();
        }
        this.f3879 = null;
        this.f3881 = null;
        this.f3893 = null;
        C2560 r1 = this.f3874;
        r1.f11675 = null;
        r1.f11670 = -2.14748365E9f;
        r1.f11676 = 2.14748365E9f;
        invalidateSelf();
    }

    public final void invalidateSelf() {
        if (!this.f3876) {
            this.f3876 = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final void setAlpha(int i) {
        this.f3886 = i;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f3886;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C2414.m12460("Use addColorFilter instead.");
    }

    public final void draw(Canvas canvas) {
        this.f3876 = false;
        C2921.m15081();
        if (this.f3882) {
            try {
                if (ImageView.ScaleType.FIT_XY == this.f3890) {
                    m4591(canvas);
                } else {
                    m4593(canvas);
                }
            } catch (Throwable unused) {
                C2414.m12461();
            }
        } else if (ImageView.ScaleType.FIT_XY == this.f3890) {
            m4591(canvas);
        } else {
            m4593(canvas);
        }
        C2921.m15080();
    }

    public final void start() {
        m4597();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4597() {
        if (this.f3881 == null) {
            this.f3892.add(this);
            return;
        }
        if (this.f3888 || this.f3874.getRepeatCount() == 0) {
            this.f3874.m13638();
        }
        if (!this.f3888) {
            float f = 0.0f;
            if (this.f3874.f11672 < 0.0f) {
                C2560 r0 = this.f3874;
                if (r0.f11675 != null) {
                    f = r0.f11670 == -2.14748365E9f ? r0.f11675.f3725 : r0.f11670;
                }
            } else {
                C2560 r02 = this.f3874;
                if (r02.f11675 != null) {
                    f = r02.f11676 == 2.14748365E9f ? r02.f11675.f3730 : r02.f11676;
                }
            }
            m4612((int) f);
            this.f3874.m13637();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4611() {
        if (this.f3881 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4627() {
                    C0379.this.m4611();
                }
            });
            return;
        }
        if (this.f3888 || this.f3874.getRepeatCount() == 0) {
            this.f3874.m13642();
        }
        if (!this.f3888) {
            float f = 0.0f;
            if (this.f3874.f11672 < 0.0f) {
                C2560 r0 = this.f3874;
                if (r0.f11675 != null) {
                    f = r0.f11670 == -2.14748365E9f ? r0.f11675.f3725 : r0.f11670;
                }
            } else {
                C2560 r02 = this.f3874;
                if (r02.f11675 != null) {
                    f = r02.f11676 == 2.14748365E9f ? r02.f11675.f3730 : r02.f11676;
                }
            }
            m4612((int) f);
            this.f3874.m13637();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4599(final int i) {
        if (this.f3879 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4615() {
                    C0379.this.m4599(i);
                }
            });
            return;
        }
        C2560 r0 = this.f3874;
        r0.m13641((float) i, (float) ((int) r0.f11676));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4607(final float f) {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4625() {
                    C0379.this.m4607(f);
                }
            });
        } else {
            m4599((int) C2493.m13237(r0.f3725, this.f3879.f3730, f));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4609(final int i) {
        if (this.f3879 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4618() {
                    C0379.this.m4609(i);
                }
            });
            return;
        }
        C2560 r0 = this.f3874;
        r0.m13641(r0.f11670, ((float) i) + 0.99f);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4603(final float f) {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4616() {
                    C0379.this.m4603(f);
                }
            });
        } else {
            m4609((int) C2493.m13237(r0.f3725, this.f3879.f3730, f));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4610(final String str) {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4619() {
                    C0379.this.m4610(str);
                }
            });
            return;
        }
        C1248 r02 = r0.m4472(str);
        if (r02 != null) {
            m4599((int) r02.f7065);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4595(final String str) {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4617() {
                    C0379.this.m4595(str);
                }
            });
            return;
        }
        C1248 r02 = r0.m4472(str);
        if (r02 != null) {
            m4609((int) (r02.f7065 + r02.f7064));
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4600(final String str) {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4614() {
                    C0379.this.m4600(str);
                }
            });
            return;
        }
        C1248 r02 = r0.m4472(str);
        if (r02 != null) {
            int i = (int) r02.f7065;
            m4604(i, ((int) r02.f7064) + i);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4605(final String str, final String str2, final boolean z) {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4623() {
                    C0379.this.m4605(str, str2, z);
                }
            });
            return;
        }
        C1248 r02 = r0.m4472(str);
        if (r02 != null) {
            int i = (int) r02.f7065;
            C1248 r03 = this.f3879.m4472(str2);
            if (str2 != null) {
                m4604(i, (int) (r03.f7065 + (z ? 1.0f : 0.0f)));
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str2);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot find marker with name ");
        sb2.append(str);
        sb2.append(".");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4604(final int i, final int i2) {
        if (this.f3879 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4620() {
                    C0379.this.m4604(i, i2);
                }
            });
        } else {
            this.f3874.m13641((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4608(final float f, final float f2) {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4621() {
                    C0379.this.m4608(f, f2);
                }
            });
        } else {
            m4604((int) C2493.m13237(r0.f3725, this.f3879.f3730, f), (int) C2493.m13237(this.f3879.f3725, this.f3879.f3730, f2));
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4612(final int i) {
        if (this.f3879 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4622() {
                    C0379.this.m4612(i);
                }
            });
        } else {
            this.f3874.m13640((float) i);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4598(final float f) {
        if (this.f3879 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4626() {
                    C0379.this.m4598(f);
                }
            });
            return;
        }
        C2921.m15081();
        this.f3874.m13640(C2493.m13237(this.f3879.f3725, this.f3879.f3730, f));
        C2921.m15080();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4602() {
        C0343 r0 = this.f3879;
        if (r0 != null) {
            float f = this.f3889;
            setBounds(0, 0, (int) (((float) r0.f3729.width()) * f), (int) (((float) this.f3879.f3729.height()) * f));
        }
    }

    public final int getIntrinsicWidth() {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            return -1;
        }
        return (int) (((float) r0.f3729.width()) * this.f3889);
    }

    public final int getIntrinsicHeight() {
        C0343 r0 = this.f3879;
        if (r0 == null) {
            return -1;
        }
        return (int) (((float) r0.f3729.height()) * this.f3889);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private List<C1695> m4590(C1695 r6) {
        if (this.f3881 == null) {
            C2414.m12460("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f3881.m9257(r6, 0, arrayList, new C1695(new String[0]));
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> void m4596(final C1695 r5, final T t, final C2476<T> r7) {
        if (this.f3881 == null) {
            this.f3892.add(new C0380() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4624() {
                    C0379.this.m4596(r5, t, r7);
                }
            });
            return;
        }
        boolean z = true;
        if (r5.f8807 != null) {
            r5.f8807.m7881(t, r7);
        } else {
            List<C1695> r52 = m4590(r5);
            for (int i = 0; i < r52.size(); i++) {
                r52.get(i).f8807.m7881(t, r7);
            }
            if (r52.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == C0349.f3767) {
                m4598(this.f3874.m13639());
            }
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private float m4592(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f3879.f3729.width()), ((float) canvas.getHeight()) / ((float) this.f3879.f3729.height()));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m4591(Canvas canvas) {
        float f;
        if (this.f3881 != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f3879.f3729.width());
            float height = ((float) bounds.height()) / ((float) this.f3879.f3729.height());
            if (this.f3878) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.f3875.reset();
            this.f3875.preScale(width, height);
            this.f3881.m9255(canvas, this.f3875, this.f3886);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m4593(Canvas canvas) {
        float f;
        if (this.f3881 != null) {
            float f2 = this.f3889;
            float r1 = m4592(canvas);
            if (f2 > r1) {
                f = this.f3889 / r1;
            } else {
                r1 = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f3879.f3729.width()) / 2.0f;
                float height = ((float) this.f3879.f3729.height()) / 2.0f;
                float f3 = width * r1;
                float f4 = height * r1;
                float f5 = this.f3889;
                canvas.translate((width * f5) - f3, (f5 * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f3875.reset();
            this.f3875.preScale(r1, r1);
            this.f3881.m9255(canvas, this.f3875, this.f3886);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    public final void stop() {
        this.f3892.clear();
        this.f3874.m13637();
    }

    public final boolean isRunning() {
        C2560 r0 = this.f3874;
        if (r0 == null) {
            return false;
        }
        return r0.isRunning();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Bitmap m4601(String str) {
        C1255 r0;
        if (getCallback() == null) {
            r0 = null;
        } else {
            C1255 r02 = this.f3893;
            if (r02 != null) {
                Drawable.Callback callback = getCallback();
                Context context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if (!((context == null && r02.f7092 == null) || r02.f7092.equals(context))) {
                    this.f3893 = null;
                }
            }
            if (this.f3893 == null) {
                this.f3893 = new C1255(getCallback(), this.f3877, this.f3884, this.f3879.f3724);
            }
            r0 = this.f3893;
        }
        if (r0 != null) {
            return r0.m8087(str);
        }
        return null;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1646 r2 = this.f3881;
        if (r2 != null) {
            r2.m9480(this.f3874.m13639());
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4594() {
        m4597();
    }
}
