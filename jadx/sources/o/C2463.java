package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: o.сɩ  reason: contains not printable characters */
public class C2463<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0343 f11215;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public float f11216;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final T f11217;

    /* renamed from: ɨ  reason: contains not printable characters */
    public PointF f11218;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Interpolator f11219;

    /* renamed from: ɪ  reason: contains not printable characters */
    public PointF f11220;

    /* renamed from: ɹ  reason: contains not printable characters */
    public Float f11221;

    /* renamed from: ɾ  reason: contains not printable characters */
    private float f11222;

    /* renamed from: Ι  reason: contains not printable characters */
    public T f11223;

    /* renamed from: ι  reason: contains not printable characters */
    public final float f11224;

    /* renamed from: І  reason: contains not printable characters */
    public int f11225;

    /* renamed from: і  reason: contains not printable characters */
    public float f11226;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int f11227;

    /* renamed from: ӏ  reason: contains not printable characters */
    private float f11228;

    public C2463(C0343 r2, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f11216 = -3987645.8f;
        this.f11226 = -3987645.8f;
        this.f11225 = 784923401;
        this.f11227 = 784923401;
        this.f11222 = Float.MIN_VALUE;
        this.f11228 = Float.MIN_VALUE;
        this.f11218 = null;
        this.f11220 = null;
        this.f11215 = r2;
        this.f11217 = t;
        this.f11223 = t2;
        this.f11219 = interpolator;
        this.f11224 = f;
        this.f11221 = f2;
    }

    public C2463(T t) {
        this.f11216 = -3987645.8f;
        this.f11226 = -3987645.8f;
        this.f11225 = 784923401;
        this.f11227 = 784923401;
        this.f11222 = Float.MIN_VALUE;
        this.f11228 = Float.MIN_VALUE;
        this.f11218 = null;
        this.f11220 = null;
        this.f11215 = null;
        this.f11217 = t;
        this.f11223 = t;
        this.f11219 = null;
        this.f11224 = Float.MIN_VALUE;
        this.f11221 = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final float m12705() {
        C0343 r0 = this.f11215;
        if (r0 == null) {
            return 0.0f;
        }
        if (this.f11222 == Float.MIN_VALUE) {
            float f = this.f11224 - r0.f3725;
            C0343 r02 = this.f11215;
            this.f11222 = f / (r02.f3730 - r02.f3725);
        }
        return this.f11222;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final float m12704() {
        if (this.f11215 == null) {
            return 1.0f;
        }
        if (this.f11228 == Float.MIN_VALUE) {
            if (this.f11221 == null) {
                this.f11228 = 1.0f;
            } else {
                float r0 = m12705();
                float floatValue = this.f11221.floatValue() - this.f11224;
                C0343 r2 = this.f11215;
                this.f11228 = r0 + (floatValue / (r2.f3730 - r2.f3725));
            }
        }
        return this.f11228;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.f11217);
        sb.append(", endValue=");
        sb.append(this.f11223);
        sb.append(", startFrame=");
        sb.append(this.f11224);
        sb.append(", endFrame=");
        sb.append(this.f11221);
        sb.append(", interpolator=");
        sb.append(this.f11219);
        sb.append('}');
        return sb.toString();
    }
}
