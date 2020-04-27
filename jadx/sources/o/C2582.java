package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import o.C0957;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.іɨ  reason: contains not printable characters */
public class C2582 {
    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m13716(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Animator m13707(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m13708(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Animator m13708(Context context, Resources resources, Resources.Theme theme, int i) {
        return m13713(context, resources, theme, i, 1.0f);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Animator m13713(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator r2 = m13717(context, resources, theme, (XmlPullParser) animation, f);
            if (animation != null) {
                animation.close();
            }
            return r2;
        } catch (XmlPullParserException e) {
            StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder("Can't load animation resource ID #0x");
            sb2.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: o.іɨ$If */
    static class If implements TypeEvaluator<C0957.If[]> {

        /* renamed from: ı  reason: contains not printable characters */
        private C0957.If[] f11737;

        If() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public C0957.If[] evaluate(float f, C0957.If[] ifArr, C0957.If[] ifArr2) {
            if (C0957.m6865(ifArr, ifArr2)) {
                if (!C0957.m6865(this.f11737, ifArr)) {
                    this.f11737 = C0957.m6866(ifArr);
                }
                for (int i = 0; i < ifArr.length; i++) {
                    this.f11737[i].m6870(ifArr[i], ifArr2[i], f);
                }
                return this.f11737;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m13702(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = m13716(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = m13716(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a7
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            o.ȷı$If[] r13 = o.C0957.m6860(r12)
            o.ȷı$If[] r14 = o.C0957.m6860(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x00a4
        L_0x0054:
            if (r13 == 0) goto L_0x0095
            o.іɨ$If r0 = new o.іɨ$If
            r0.<init>()
            if (r14 == 0) goto L_0x008b
            boolean r3 = o.C0957.m6865(r13, r14)
            if (r3 == 0) goto L_0x006f
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0167
        L_0x006f:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " Can't morph from "
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008b:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0167
        L_0x0095:
            if (r14 == 0) goto L_0x00a4
            o.іɨ$If r11 = new o.іɨ$If
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
        L_0x00a4:
            r11 = r8
            goto L_0x0167
        L_0x00a7:
            if (r12 != r7) goto L_0x00ae
            o.іɿ r12 = o.C2591.m13738()
            goto L_0x00af
        L_0x00ae:
            r12 = r8
        L_0x00af:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00e3
            if (r0 != r7) goto L_0x00bc
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c0
        L_0x00bc:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c0:
            if (r5 == 0) goto L_0x00d9
            if (r4 != r7) goto L_0x00c9
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cd
        L_0x00c9:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cd:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x015f
        L_0x00d9:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x015f
        L_0x00e3:
            if (r4 != r7) goto L_0x00ea
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ee
        L_0x00ea:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x015f
        L_0x00f8:
            if (r3 == 0) goto L_0x013e
            if (r0 != r7) goto L_0x0102
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0111
        L_0x0102:
            boolean r0 = m13716(r0)
            if (r0 == 0) goto L_0x010d
            int r13 = r11.getColor(r13, r2)
            goto L_0x0111
        L_0x010d:
            int r13 = r11.getInt(r13, r2)
        L_0x0111:
            if (r5 == 0) goto L_0x0135
            if (r4 != r7) goto L_0x011b
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012a
        L_0x011b:
            boolean r0 = m13716(r4)
            if (r0 == 0) goto L_0x0126
            int r11 = r11.getColor(r14, r2)
            goto L_0x012a
        L_0x0126:
            int r11 = r11.getInt(r14, r2)
        L_0x012a:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015f
        L_0x0135:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015f
        L_0x013e:
            if (r5 == 0) goto L_0x015f
            if (r4 != r7) goto L_0x0148
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0157
        L_0x0148:
            boolean r13 = m13716(r4)
            if (r13 == 0) goto L_0x0153
            int r11 = r11.getColor(r14, r2)
            goto L_0x0157
        L_0x0153:
            int r11 = r11.getInt(r14, r2)
        L_0x0157:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015f:
            r11 = r8
            if (r11 == 0) goto L_0x0167
            if (r12 == 0) goto L_0x0167
            r11.setEvaluator(r12)
        L_0x0167:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2582.m13702(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m13719(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        boolean z = true;
        String str = null;
        String string = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) ? null : typedArray.getString(1);
        if (string != null) {
            String string2 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "propertyXName") != null) ? null : typedArray.getString(2);
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "propertyYName") == null) {
                z = false;
            }
            if (z) {
                str = typedArray.getString(3);
            }
            if (string2 == null && str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            m13703(C0957.m6861(string), objectAnimator, f * 0.5f, string2, str);
            return;
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "propertyName") == null) {
            z = false;
        }
        if (z) {
            str = typedArray.getString(0);
        }
        objectAnimator.setPropertyName(str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m13703(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, (float[]) null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Animator m13717(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m13705(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m13705(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            int r13 = r21.getDepth()
            r0 = 0
            r14 = r0
        L_0x0010:
            int r1 = r21.next()
            r2 = 3
            r15 = 0
            if (r1 != r2) goto L_0x001e
            int r2 = r21.getDepth()
            if (r2 <= r13) goto L_0x00f6
        L_0x001e:
            r2 = 1
            if (r1 == r2) goto L_0x00f6
            r3 = 2
            if (r1 != r3) goto L_0x00f2
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0044
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m13718(r0, r1, r2, r3, r4, r5)
        L_0x0040:
            r3 = r18
            goto L_0x00ca
        L_0x0044:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005e
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m13706(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0040
        L_0x005e:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ab
            android.animation.AnimatorSet r16 = new android.animation.AnimatorSet
            r16.<init>()
            int[] r0 = o.C2475.f11272
            if (r9 != 0) goto L_0x0074
            android.content.res.TypedArray r0 = r8.obtainAttributes(r11, r0)
            goto L_0x0078
        L_0x0074:
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r11, r0, r15, r15)
        L_0x0078:
            r7 = r0
            java.lang.String r0 = "ordering"
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r0 = r10.getAttributeValue(r1, r0)
            if (r0 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            if (r2 != 0) goto L_0x0089
            r6 = 0
            goto L_0x008e
        L_0x0089:
            int r0 = r7.getInt(r15, r15)
            r6 = r0
        L_0x008e:
            r5 = r16
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r7
            r7 = r25
            m13705(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r16
            goto L_0x00ca
        L_0x00ab:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00da
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m13720((android.content.Context) r3, (android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (org.xmlpull.v1.XmlPullParser) r10, (android.util.AttributeSet) r1)
            if (r1 == 0) goto L_0x00c9
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00c9
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00c9:
            r15 = 1
        L_0x00ca:
            if (r12 == 0) goto L_0x0010
            if (r15 != 0) goto L_0x0010
            if (r14 != 0) goto L_0x00d5
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x00d5:
            r14.add(r0)
            goto L_0x0010
        L_0x00da:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            r3 = r18
            goto L_0x0010
        L_0x00f6:
            if (r12 == 0) goto L_0x011f
            if (r14 == 0) goto L_0x011f
            int r1 = r14.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r14.iterator()
        L_0x0104:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0116
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r15 + 1
            r1[r15] = r3
            r15 = r4
            goto L_0x0104
        L_0x0116:
            if (r24 != 0) goto L_0x011c
            r12.playTogether(r1)
            goto L_0x011f
        L_0x011c:
            r12.playSequentially(r1)
        L_0x011f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2582.m13705(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0094  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m13720(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = 0
            r10 = r9
        L_0x0008:
            int r0 = r20.getEventType()
            r1 = 3
            r11 = 0
            if (r0 == r1) goto L_0x0092
            r12 = 1
            if (r0 == r12) goto L_0x0092
            r2 = 2
            if (r0 == r2) goto L_0x001a
            r20.next()
            goto L_0x0008
        L_0x001a:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x008b
            int[] r0 = o.C2475.f11278
            if (r6 != 0) goto L_0x0031
            r13 = r18
            android.content.res.TypedArray r0 = r13.obtainAttributes(r8, r0)
            goto L_0x0037
        L_0x0031:
            r13 = r18
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r8, r0, r11, r11)
        L_0x0037:
            r14 = r0
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r3 = "propertyName"
            java.lang.String r3 = r7.getAttributeValue(r0, r3)
            if (r3 == 0) goto L_0x0044
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 != 0) goto L_0x0049
            r15 = r9
            goto L_0x004e
        L_0x0049:
            java.lang.String r1 = r14.getString(r1)
            r15 = r1
        L_0x004e:
            java.lang.String r1 = "valueType"
            java.lang.String r0 = r7.getAttributeValue(r0, r1)
            if (r0 == 0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r1 = 4
            if (r0 != 0) goto L_0x005e
            r5 = 4
            goto L_0x0063
        L_0x005e:
            int r0 = r14.getInt(r2, r1)
            r5 = r0
        L_0x0063:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m13715(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x007a
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m13702((android.content.res.TypedArray) r14, (int) r1, (int) r11, (int) r12, (java.lang.String) r15)
        L_0x007a:
            if (r0 == 0) goto L_0x0087
            if (r10 != 0) goto L_0x0084
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10 = r1
        L_0x0084:
            r10.add(r0)
        L_0x0087:
            r14.recycle()
            goto L_0x008d
        L_0x008b:
            r13 = r18
        L_0x008d:
            r20.next()
            goto L_0x0008
        L_0x0092:
            if (r10 == 0) goto L_0x00a7
            int r0 = r10.size()
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r0]
        L_0x009a:
            if (r11 >= r0) goto L_0x00a7
            java.lang.Object r1 = r10.get(r11)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r9[r11] = r1
            int r11 = r11 + 1
            goto L_0x009a
        L_0x00a7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2582.m13720(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int m13704(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        int[] iArr = C2475.f11269;
        int i = 0;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        boolean z = true;
        TypedValue peekValue = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null) ? null : typedArray.peekValue(0);
        if (peekValue == null) {
            z = false;
        }
        if (z && m13716(peekValue.type)) {
            i = 3;
        }
        typedArray.recycle();
        return i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m13712(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        int i4 = z ? peekValue2.type : 0;
        if ((!z2 || !m13716(i3)) && (!z || !m13716(i4))) {
            return 0;
        }
        return 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m13715(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            r1 = r14
            r14 = r0
        L_0x0003:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r4 = 1
            if (r2 == r4) goto L_0x0041
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0003
            r2 = 4
            if (r1 != r2) goto L_0x0024
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            int r1 = m13704(r10, r11, r1, r12)
        L_0x0024:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r1
            r7 = r12
            android.animation.Keyframe r2 = m13709(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003d
            if (r14 != 0) goto L_0x003a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x003a:
            r14.add(r2)
        L_0x003d:
            r12.next()
            goto L_0x0003
        L_0x0041:
            if (r14 == 0) goto L_0x00e9
            int r9 = r14.size()
            if (r9 <= 0) goto L_0x00e9
            r10 = 0
            java.lang.Object r11 = r14.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r14.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0078
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r12.setFraction(r2)
            goto L_0x0078
        L_0x006b:
            int r0 = r14.size()
            android.animation.Keyframe r12 = m13714(r12, r2)
            r14.add(r0, r12)
            int r9 = r9 + 1
        L_0x0078:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0088
            r11.setFraction(r4)
            goto L_0x0091
        L_0x0088:
            android.animation.Keyframe r11 = m13714(r11, r4)
            r14.add(r10, r11)
            int r9 = r9 + 1
        L_0x0091:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r14.toArray(r11)
        L_0x0096:
            if (r10 >= r9) goto L_0x00dc
            r12 = r11[r10]
            float r14 = r12.getFraction()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d9
            if (r10 != 0) goto L_0x00a8
            r12.setFraction(r4)
            goto L_0x00d9
        L_0x00a8:
            int r14 = r9 + -1
            if (r10 != r14) goto L_0x00b0
            r12.setFraction(r2)
            goto L_0x00d9
        L_0x00b0:
            int r12 = r10 + 1
            r0 = r10
        L_0x00b3:
            if (r12 >= r14) goto L_0x00c5
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c5
            int r0 = r12 + 1
            r8 = r0
            r0 = r12
            r12 = r8
            goto L_0x00b3
        L_0x00c5:
            int r12 = r0 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r14 = r10 + -1
            r14 = r11[r14]
            float r14 = r14.getFraction()
            float r12 = r12 - r14
            m13711((android.animation.Keyframe[]) r11, (float) r12, (int) r10, (int) r0)
        L_0x00d9:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00dc:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r1 != r3) goto L_0x00e9
            o.іɿ r9 = o.C2591.m13738()
            r0.setEvaluator(r9)
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2582.m13715(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Keyframe m13714(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m13711(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a4  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Keyframe m13709(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, android.util.AttributeSet r11, int r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            int[] r0 = o.C2475.f11269
            r1 = 0
            if (r10 != 0) goto L_0x000a
            android.content.res.TypedArray r9 = r9.obtainAttributes(r11, r0)
            goto L_0x000e
        L_0x000a:
            android.content.res.TypedArray r9 = r10.obtainStyledAttributes(r11, r0, r1, r1)
        L_0x000e:
            java.lang.String r10 = "http://schemas.android.com/apk/res/android"
            java.lang.String r11 = "fraction"
            java.lang.String r11 = r13.getAttributeValue(r10, r11)
            r0 = 1
            if (r11 == 0) goto L_0x001b
            r11 = 1
            goto L_0x001c
        L_0x001b:
            r11 = 0
        L_0x001c:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 3
            if (r11 != 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            float r2 = r9.getFloat(r3, r2)
        L_0x0026:
            java.lang.String r11 = "value"
            java.lang.String r4 = r13.getAttributeValue(r10, r11)
            if (r4 == 0) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            r5 = 0
            if (r4 != 0) goto L_0x0036
            r4 = r5
            goto L_0x003a
        L_0x0036:
            android.util.TypedValue r4 = r9.peekValue(r1)
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            r6 = 1
            goto L_0x003f
        L_0x003e:
            r6 = 0
        L_0x003f:
            r7 = 4
            if (r12 != r7) goto L_0x004f
            if (r6 == 0) goto L_0x004e
            int r12 = r4.type
            boolean r12 = m13716(r12)
            if (r12 == 0) goto L_0x004e
            r12 = 3
            goto L_0x004f
        L_0x004e:
            r12 = 0
        L_0x004f:
            if (r6 == 0) goto L_0x0084
            if (r12 == 0) goto L_0x006e
            if (r12 == r0) goto L_0x0058
            if (r12 == r3) goto L_0x0058
            goto L_0x0090
        L_0x0058:
            java.lang.String r11 = r13.getAttributeValue(r10, r11)
            if (r11 == 0) goto L_0x0060
            r11 = 1
            goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            if (r11 != 0) goto L_0x0065
            r11 = 0
            goto L_0x0069
        L_0x0065:
            int r11 = r9.getInt(r1, r1)
        L_0x0069:
            android.animation.Keyframe r5 = android.animation.Keyframe.ofInt(r2, r11)
            goto L_0x0090
        L_0x006e:
            java.lang.String r11 = r13.getAttributeValue(r10, r11)
            if (r11 == 0) goto L_0x0076
            r11 = 1
            goto L_0x0077
        L_0x0076:
            r11 = 0
        L_0x0077:
            r12 = 0
            if (r11 != 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            float r12 = r9.getFloat(r1, r12)
        L_0x007f:
            android.animation.Keyframe r11 = android.animation.Keyframe.ofFloat(r2, r12)
            goto L_0x008f
        L_0x0084:
            if (r12 != 0) goto L_0x008b
            android.animation.Keyframe r11 = android.animation.Keyframe.ofFloat(r2)
            goto L_0x008f
        L_0x008b:
            android.animation.Keyframe r11 = android.animation.Keyframe.ofInt(r2)
        L_0x008f:
            r5 = r11
        L_0x0090:
            java.lang.String r11 = "interpolator"
            java.lang.String r10 = r13.getAttributeValue(r10, r11)
            if (r10 == 0) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 != 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            int r1 = r9.getResourceId(r0, r1)
        L_0x00a2:
            if (r1 <= 0) goto L_0x00ab
            android.view.animation.Interpolator r8 = o.C2595.m13765(r8, r1)
            r5.setInterpolator(r8)
        L_0x00ab:
            r9.recycle()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2582.m13709(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int, org.xmlpull.v1.XmlPullParser):android.animation.Keyframe");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static ObjectAnimator m13718(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m13706(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static ValueAnimator m13706(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        TypedArray typedArray2;
        int[] iArr = C2475.f11276;
        int i = 0;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int[] iArr2 = C2475.f11279;
        if (theme == null) {
            typedArray2 = resources.obtainAttributes(attributeSet, iArr2);
        } else {
            typedArray2 = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
        }
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m13710(valueAnimator, typedArray, typedArray2, f, xmlPullParser);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i = typedArray.getResourceId(0, 0);
        }
        if (i > 0) {
            valueAnimator.setInterpolator(C2595.m13765(context, i));
        }
        typedArray.recycle();
        if (typedArray2 != null) {
            typedArray2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m13710(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArray3 = typedArray;
        TypedArray typedArray4 = typedArray2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int i = 1;
        boolean z = false;
        int i2 = 300;
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "duration") != null) {
            i2 = typedArray3.getInt(1, 300);
        }
        long j = (long) i2;
        long j2 = (long) (!(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : typedArray3.getInt(2, 0));
        int i3 = !(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArray3.getInt(7, 4);
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null) {
            if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
                if (i3 == 4) {
                    i3 = m13712(typedArray3, 5, 6);
                }
                PropertyValuesHolder r13 = m13702(typedArray3, i3, 5, 6, "");
                if (r13 != null) {
                    valueAnimator2.setValues(new PropertyValuesHolder[]{r13});
                }
            }
        }
        valueAnimator2.setDuration(j);
        valueAnimator2.setStartDelay(j2);
        valueAnimator2.setRepeatCount(!(xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null) ? 0 : typedArray3.getInt(3, 0));
        if (xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null) {
            z = true;
        }
        if (z) {
            i = typedArray3.getInt(4, 1);
        }
        valueAnimator2.setRepeatMode(i);
        if (typedArray4 != null) {
            m13719(valueAnimator2, typedArray4, i3, f, xmlPullParser2);
        }
    }
}
