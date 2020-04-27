package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import o.C2864;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ǃɪ  reason: contains not printable characters */
final class C0909 {
    /* renamed from: ɩ  reason: contains not printable characters */
    static Shader m6714(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            int[] iArr = C2864.C2865.f13345;
            if (theme2 == null) {
                typedArray = resources.obtainAttributes(attributeSet2, iArr);
            } else {
                Resources resources2 = resources;
                typedArray = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0);
            }
            int i = C2864.C2865.f13371;
            float f = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArray.getFloat(8, 0.0f);
            int i2 = C2864.C2865.f13367;
            float f2 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) ? 0.0f : typedArray.getFloat(9, 0.0f);
            int i3 = C2864.C2865.f13363;
            float f3 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) ? 0.0f : typedArray.getFloat(10, 0.0f);
            int i4 = C2864.C2865.f13369;
            float f4 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) ? 0.0f : typedArray.getFloat(11, 0.0f);
            int i5 = C2864.C2865.f13351;
            float f5 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArray.getFloat(3, 0.0f);
            int i6 = C2864.C2865.f13357;
            float f6 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) ? 0.0f : typedArray.getFloat(4, 0.0f);
            int i7 = C2864.C2865.f13358;
            int i8 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArray.getInt(2, 0);
            int i9 = C2864.C2865.f13343;
            int color = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) ? 0 : typedArray.getColor(0, 0);
            boolean z = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
            int i10 = C2864.C2865.f13366;
            int color2 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) ? 0 : typedArray.getColor(7, 0);
            int i11 = C2864.C2865.f13346;
            int color3 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) ? 0 : typedArray.getColor(1, 0);
            int i12 = C2864.C2865.f13347;
            int i13 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) ? 0 : typedArray.getInt(6, 0);
            int i14 = C2864.C2865.f13352;
            float f7 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) ? 0.0f : typedArray.getFloat(5, 0.0f);
            typedArray.recycle();
            If r0 = m6715(m6712(resources, xmlPullParser, attributeSet, theme), color, color3, z, color2);
            if (i8 != 1) {
                if (i8 == 2) {
                    return new SweepGradient(f5, f6, r0.f5778, r0.f5777);
                }
                return new LinearGradient(f, f2, f3, f4, r0.f5778, r0.f5777, m6713(i13));
            } else if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, r0.f5778, r0.f5777, m6713(i13));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.C0909.If m6712(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x008a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x008a
        L_0x0021:
            r6 = 2
            if (r3 != r6) goto L_0x0012
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0012
            int[] r3 = o.C2864.C2865.f13373
            r5 = 0
            if (r11 != 0) goto L_0x003c
            android.content.res.TypedArray r3 = r8.obtainAttributes(r10, r3)
            goto L_0x0040
        L_0x003c:
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r10, r3, r5, r5)
        L_0x0040:
            int r6 = o.C2864.C2865.f13375
            boolean r6 = r3.hasValue(r6)
            int r7 = o.C2864.C2865.f13372
            boolean r7 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x006f
            if (r7 == 0) goto L_0x006f
            int r6 = o.C2864.C2865.f13375
            int r5 = r3.getColor(r6, r5)
            int r6 = o.C2864.C2865.f13372
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006f:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x008a:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0096
            o.ǃɪ$If r8 = new o.ǃɪ$If
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0096:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0909.m6712(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o.ǃɪ$If");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static If m6715(If ifR, int i, int i2, boolean z, int i3) {
        if (ifR != null) {
            return ifR;
        }
        if (z) {
            return new If(i, i3, i2);
        }
        return new If(i, i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Shader.TileMode m6713(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: o.ǃɪ$If */
    static final class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        final float[] f5777;

        /* renamed from: ɩ  reason: contains not printable characters */
        final int[] f5778;

        If(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f5778 = new int[size];
            this.f5777 = new float[size];
            for (int i = 0; i < size; i++) {
                this.f5778[i] = list.get(i).intValue();
                this.f5777[i] = list2.get(i).floatValue();
            }
        }

        If(int i, int i2) {
            this.f5778 = new int[]{i, i2};
            this.f5777 = new float[]{0.0f, 1.0f};
        }

        If(int i, int i2, int i3) {
            this.f5778 = new int[]{i, i2, i3};
            this.f5777 = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
