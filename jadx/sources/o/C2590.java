package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.іɾ  reason: contains not printable characters */
public class C2590 implements Interpolator {

    /* renamed from: ı  reason: contains not printable characters */
    private float[] f11752;

    /* renamed from: ι  reason: contains not printable characters */
    private float[] f11753;

    public C2590(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C2590(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        int[] iArr = C2475.f11273;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        m13735(typedArray, xmlPullParser);
        typedArray.recycle();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m13734(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m13736(path);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m13737(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m13736(path);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m13736(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f11752 = new float[min];
            this.f11753 = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f11752[i2] = fArr[0];
                this.f11753[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f11752[0])) <= 1.0E-5d && ((double) Math.abs(this.f11753[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f11752[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f11753[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        float[] fArr2 = this.f11752;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :".concat(String.valueOf(f2)));
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f11752[0]);
            sb.append(",");
            sb.append(this.f11753[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f11752[i6]);
            sb.append(",");
            sb.append(this.f11753[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length ".concat(String.valueOf(length)));
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f11752.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f11752[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f11752;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f11753[i];
        }
        float[] fArr2 = this.f11753;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m13735(TypedArray typedArray, XmlPullParser xmlPullParser) {
        boolean z = true;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                z = false;
            }
            String string = !z ? null : typedArray.getString(4);
            Path r12 = C0957.m6861(string);
            if (r12 != null) {
                m13736(r12);
                return;
            }
            throw new InflateException("The path is null, which is created from ".concat(String.valueOf(string)));
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX1") != null) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY1") != null) {
                float f = 0.0f;
                float f2 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX1") != null) ? 0.0f : typedArray.getFloat(0, 0.0f);
                float f3 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY1") != null) ? 0.0f : typedArray.getFloat(1, 0.0f);
                boolean z2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX2") != null;
                if (z2 != (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY2") != null)) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                } else if (!z2) {
                    m13734(f2, f3);
                } else {
                    float f4 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlX2") != null) ? 0.0f : typedArray.getFloat(2, 0.0f);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "controlY2") == null) {
                        z = false;
                    }
                    if (z) {
                        f = typedArray.getFloat(3, 0.0f);
                    }
                    m13737(f2, f3, f4, f);
                }
            } else {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }
}
