package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1228;
import o.C2864;

/* renamed from: o.Ιŀ  reason: contains not printable characters */
public final class C1788 extends C1578 {

    /* renamed from: ŀ  reason: contains not printable characters */
    private C0742<Integer, Integer> f9119;

    /* renamed from: ł  reason: contains not printable characters */
    private C0742<Integer, Integer> f9120;

    /* renamed from: ſ  reason: contains not printable characters */
    private C0742<Float, Float> f9121;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private C0742<Float, Float> f9122;

    /* renamed from: ƚ  reason: contains not printable characters */
    private C0742<Float, Float> f9123;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C1159 f9124;

    /* renamed from: ɍ  reason: contains not printable characters */
    private C0742<Float, Float> f9125;

    /* renamed from: ɟ  reason: contains not printable characters */
    private C0742<Float, Float> f9126;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final Paint f9127 = new Paint() {
        {
            setStyle(Paint.Style.STROKE);
        }
    };

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Paint f9128 = new Paint() {
        {
            setStyle(Paint.Style.FILL);
        }
    };

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Matrix f9129 = new Matrix();

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Map<C1460, List<C0592>> f9130 = new HashMap();

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C0379 f9131;

    /* renamed from: ʅ  reason: contains not printable characters */
    private C0742<Integer, Integer> f9132;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final C0343 f9133;

    /* renamed from: І  reason: contains not printable characters */
    private final StringBuilder f9134 = new StringBuilder(2);

    /* renamed from: г  reason: contains not printable characters */
    private C0742<Integer, Integer> f9135;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final RectF f9136 = new RectF();

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C0782<String> f9137 = new C0782<>();

    C1788(C0379 r3, C1685 r4) {
        super(r3, r4);
        this.f9131 = r3;
        this.f9133 = r4.f8720;
        this.f9124 = new C1159(r4.f8722.f7684);
        this.f9124.f5002.add(this);
        C1159 r32 = this.f9124;
        if (r32 != null) {
            this.f8389.add(r32);
        }
        C2724 r33 = r4.f8734;
        if (!(r33 == null || r33.f12583 == null)) {
            this.f9120 = new C0938(r33.f12583.f7684);
            this.f9120.f5002.add(this);
            C0742<Integer, Integer> r42 = this.f9120;
            if (r42 != null) {
                this.f8389.add(r42);
            }
        }
        if (!(r33 == null || r33.f12585 == null)) {
            this.f9135 = new C0938(r33.f12585.f7684);
            this.f9135.f5002.add(this);
            C0742<Integer, Integer> r43 = this.f9135;
            if (r43 != null) {
                this.f8389.add(r43);
            }
        }
        if (!(r33 == null || r33.f12586 == null)) {
            this.f9123 = new C0965(r33.f12586.f7684);
            this.f9123.f5002.add(this);
            C0742<Float, Float> r44 = this.f9123;
            if (r44 != null) {
                this.f8389.add(r44);
            }
        }
        if (r33 != null && r33.f12584 != null) {
            this.f9121 = new C0965(r33.f12584.f7684);
            this.f9121.f5002.add(this);
            C0742<Float, Float> r34 = this.f9121;
            if (r34 != null) {
                this.f8389.add(r34);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9920(RectF rectF, Matrix matrix, boolean z) {
        super.m9256(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f9133.f3729.width(), (float) this.f9133.f3729.height());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9918(Canvas canvas, Matrix matrix, int i) {
        float f;
        String str;
        int i2;
        List list;
        float floatValue;
        int i3;
        String str2;
        float f2;
        int i4;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        canvas.save();
        C0379 r3 = this.f9131;
        boolean z = true;
        if (!(r3.f3885 == null && r3.f3879.f3733.m8210() > 0)) {
            canvas.setMatrix(matrix);
        }
        C1228 r32 = (C1228) this.f9124.m5937();
        C1311 r4 = this.f9133.f3732.get(r32.f6960);
        if (r4 == null) {
            canvas.restore();
            return;
        }
        C0742<Integer, Integer> r7 = this.f9119;
        if (r7 != null) {
            this.f9128.setColor(r7.m5937().intValue());
        } else {
            C0742<Integer, Integer> r72 = this.f9120;
            if (r72 != null) {
                this.f9128.setColor(r72.m5937().intValue());
            } else {
                this.f9128.setColor(r32.f6965);
            }
        }
        C0742<Integer, Integer> r73 = this.f9132;
        if (r73 != null) {
            this.f9127.setColor(r73.m5937().intValue());
        } else {
            C0742<Integer, Integer> r74 = this.f9135;
            if (r74 != null) {
                this.f9127.setColor(r74.m5937().intValue());
            } else {
                this.f9127.setColor(r32.f6967);
            }
        }
        int intValue = ((this.f8387.f6577 == null ? 100 : this.f8387.f6577.m5937().intValue()) * 255) / 100;
        this.f9128.setAlpha(intValue);
        this.f9127.setAlpha(intValue);
        C0742<Float, Float> r75 = this.f9122;
        if (r75 != null) {
            this.f9127.setStrokeWidth(r75.m5937().floatValue());
        } else {
            C0742<Float, Float> r76 = this.f9123;
            if (r76 != null) {
                this.f9127.setStrokeWidth(r76.m5937().floatValue());
            } else {
                this.f9127.setStrokeWidth(r32.f6961 * C2467.m12711() * C2467.m12712(matrix));
            }
        }
        C0379 r77 = this.f9131;
        if (r77.f3885 != null || r77.f3879.f3733.m8210() <= 0) {
            z = false;
        }
        if (z) {
            C0742<Float, Float> r5 = this.f9126;
            if (r5 != null) {
                f = r5.m5937().floatValue();
            } else {
                f = r32.f6959;
            }
            float f3 = f / 100.0f;
            float r78 = C2467.m12712(matrix);
            String str3 = r32.f6963;
            float r9 = r32.f6958 * C2467.m12711();
            List asList = Arrays.asList(str3.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size = asList.size();
            int i5 = 0;
            while (i5 < size) {
                String str4 = (String) asList.get(i5);
                int i6 = 0;
                float f4 = 0.0f;
                while (i6 < str4.length()) {
                    List list2 = asList;
                    C1460 r6 = this.f9133.f3733.m8216((((str4.charAt(i6) * 31) + r4.f7294.hashCode()) * 31) + r4.f7295.hashCode());
                    if (r6 != null) {
                        str2 = str4;
                        f2 = r9;
                        double d = r6.f7863;
                        i4 = size;
                        i3 = i5;
                        f4 = (float) (((double) f4) + (d * ((double) f3) * ((double) C2467.m12711()) * ((double) r78)));
                    } else {
                        f2 = r9;
                        i4 = size;
                        i3 = i5;
                        str2 = str4;
                    }
                    i6++;
                    size = i4;
                    asList = list2;
                    r9 = f2;
                    str4 = str2;
                    i5 = i3;
                }
                List list3 = asList;
                float f5 = r9;
                int i7 = size;
                String str5 = str4;
                canvas.save();
                m9913(r32.f6957, canvas2, f4);
                int i8 = i5;
                canvas2.translate(0.0f, (((float) i8) * f5) - ((((float) (i7 - 1)) * f5) / 2.0f));
                int i9 = 0;
                while (i9 < str5.length()) {
                    String str6 = str5;
                    C1460 r10 = this.f9133.f3733.m8216((((str6.charAt(i9) * 31) + r4.f7294.hashCode()) * 31) + r4.f7295.hashCode());
                    if (r10 != null) {
                        if (this.f9130.containsKey(r10)) {
                            i2 = i7;
                            list = this.f9130.get(r10);
                            str = str6;
                        } else {
                            List<C2864.If> list4 = r10.f7859;
                            int size2 = list4.size();
                            list = new ArrayList(size2);
                            int i10 = 0;
                            while (i10 < size2) {
                                list.add(new C0592(this.f9131, this, list4.get(i10)));
                                i10++;
                                list4 = list4;
                                i7 = i7;
                                str6 = str6;
                            }
                            i2 = i7;
                            str = str6;
                            this.f9130.put(r10, list);
                        }
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            Path r11 = ((C0592) list.get(i11)).m5232();
                            r11.computeBounds(this.f9136, false);
                            this.f9129.set(matrix2);
                            this.f9129.preTranslate(0.0f, (-r32.f6966) * C2467.m12711());
                            this.f9129.preScale(f3, f3);
                            r11.transform(this.f9129);
                            if (r32.f6962) {
                                m9914(r11, this.f9128, canvas2);
                                m9914(r11, this.f9127, canvas2);
                            } else {
                                m9914(r11, this.f9127, canvas2);
                                m9914(r11, this.f9128, canvas2);
                            }
                        }
                        float r62 = ((float) r10.f7863) * f3 * C2467.m12711() * r78;
                        float f6 = ((float) r32.f6964) / 10.0f;
                        C0742<Float, Float> r112 = this.f9125;
                        if (r112 != null) {
                            floatValue = r112.m5937().floatValue();
                        } else {
                            C0742<Float, Float> r113 = this.f9121;
                            if (r113 != null) {
                                floatValue = r113.m5937().floatValue();
                            }
                            canvas2.translate(r62 + (f6 * r78), 0.0f);
                        }
                        f6 += floatValue;
                        canvas2.translate(r62 + (f6 * r78), 0.0f);
                    } else {
                        i2 = i7;
                        str = str6;
                    }
                    i9++;
                    i7 = i2;
                    str5 = str;
                }
                canvas.restore();
                i5 = i8 + 1;
                asList = list3;
                r9 = f5;
                size = i7;
            }
        } else {
            m9916(r32, r4, matrix2, canvas2);
        }
        canvas.restore();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m9916(C1228 r8, C1311 r9, Matrix matrix, Canvas canvas) {
        C1155 r1;
        float f;
        float r0 = C2467.m12712(matrix);
        C0379 r12 = this.f9131;
        T t = r9.f7294;
        T t2 = r9.f7295;
        Typeface typeface = null;
        if (r12.getCallback() == null) {
            r1 = null;
        } else {
            if (r12.f3894 == null) {
                r12.f3894 = new C1155(r12.getCallback());
            }
            r1 = r12.f3894;
        }
        if (r1 != null) {
            C1291<String> r4 = r1.f6699;
            r4.f7245 = t;
            r4.f7246 = t2;
            typeface = r1.f6696.get(r1.f6699);
            if (typeface == null) {
                typeface = r1.f6695.get(t);
                if (typeface == null) {
                    StringBuilder sb = new StringBuilder("fonts/");
                    sb.append(t);
                    sb.append(r1.f6697);
                    typeface = Typeface.createFromAsset(r1.f6698, sb.toString());
                    r1.f6695.put(t, typeface);
                }
                boolean contains = t2.contains("Italic");
                boolean contains2 = t2.contains("Bold");
                int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
                if (typeface.getStyle() != i) {
                    typeface = Typeface.create(typeface, i);
                }
                r1.f6696.put(r1.f6699, typeface);
            }
        }
        if (typeface != null) {
            String str = r8.f6963;
            C0548 r13 = this.f9131.f3885;
            if (r13 != null) {
                if (r13.f4434 && r13.f4435.containsKey(str)) {
                    str = r13.f4435.get(str);
                } else if (r13.f4434) {
                    r13.f4435.put(str, str);
                }
            }
            this.f9128.setTypeface(typeface);
            C0742<Float, Float> r14 = this.f9126;
            if (r14 != null) {
                f = r14.m5937().floatValue();
            } else {
                f = r8.f6959;
            }
            this.f9128.setTextSize(f * C2467.m12711());
            this.f9127.setTypeface(this.f9128.getTypeface());
            this.f9127.setTextSize(this.f9128.getTextSize());
            float r15 = r8.f6958 * C2467.m12711();
            List asList = Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size = asList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) asList.get(i2);
                m9913(r8.f6957, canvas, this.f9127.measureText(str2));
                canvas.translate(0.0f, (((float) i2) * r15) - ((((float) (size - 1)) * r15) / 2.0f));
                m9917(str2, r8, canvas, r0);
                canvas.setMatrix(matrix);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m9917(String str, C1228 r11, Canvas canvas, float f) {
        String str2;
        float floatValue;
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt) + i;
            while (charCount < str.length()) {
                int codePointAt2 = str.codePointAt(charCount);
                if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                    break;
                }
                charCount += Character.charCount(codePointAt2);
                codePointAt = (codePointAt * 31) + codePointAt2;
            }
            C0782<String> r4 = this.f9137;
            long j = (long) codePointAt;
            if (r4.f5199) {
                r4.m6115();
            }
            if (C0647.m5432(r4.f5202, r4.f5201, j) >= 0) {
                str2 = this.f9137.m6119(j, null);
            } else {
                this.f9134.setLength(0);
                int i2 = i;
                while (i2 < charCount) {
                    int codePointAt3 = str.codePointAt(i2);
                    this.f9134.appendCodePoint(codePointAt3);
                    i2 += Character.charCount(codePointAt3);
                }
                str2 = this.f9134.toString();
                this.f9137.m6116(j, str2);
            }
            i += str2.length();
            if (r11.f6962) {
                m9915(str2, this.f9128, canvas);
                m9915(str2, this.f9127, canvas);
            } else {
                m9915(str2, this.f9127, canvas);
                m9915(str2, this.f9128, canvas);
            }
            float measureText = this.f9128.measureText(str2, 0, 1);
            float f2 = ((float) r11.f6964) / 10.0f;
            C0742<Float, Float> r42 = this.f9125;
            if (r42 != null) {
                floatValue = r42.m5937().floatValue();
            } else {
                C0742<Float, Float> r43 = this.f9121;
                if (r43 != null) {
                    floatValue = r43.m5937().floatValue();
                } else {
                    canvas.translate(measureText + (f2 * f), 0.0f);
                }
            }
            f2 += floatValue;
            canvas.translate(measureText + (f2 * f), 0.0f);
        }
    }

    /* renamed from: o.Ιŀ$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: Ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f9138 = new int[C1228.Cif.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                o.ɨӏ$if[] r0 = o.C1228.Cif.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9138 = r0
                int[] r0 = f9138     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ɨӏ$if r1 = o.C1228.Cif.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f9138     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ɨӏ$if r1 = o.C1228.Cif.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f9138     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ɨӏ$if r1 = o.C1228.Cif.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1788.AnonymousClass5.<clinit>():void");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m9913(C1228.Cif ifVar, Canvas canvas, float f) {
        int i = AnonymousClass5.f9138[ifVar.ordinal()];
        if (i == 1) {
            return;
        }
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m9914(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m9915(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m9919(T t, C2476<T> r4) {
        super.m9253(t, r4);
        if (t == C0349.f3749) {
            C0742<Integer, Integer> r3 = this.f9119;
            if (r3 != null) {
                this.f8389.remove(r3);
            }
            if (r4 == null) {
                this.f9119 = null;
                return;
            }
            this.f9119 = new C1120(r4);
            this.f9119.f5002.add(this);
            C0742<Integer, Integer> r32 = this.f9119;
            if (r32 != null) {
                this.f8389.add(r32);
            }
        } else if (t == C0349.f3773) {
            C0742<Integer, Integer> r33 = this.f9132;
            if (r33 != null) {
                this.f8389.remove(r33);
            }
            if (r4 == null) {
                this.f9132 = null;
                return;
            }
            this.f9132 = new C1120(r4);
            this.f9132.f5002.add(this);
            C0742<Integer, Integer> r34 = this.f9132;
            if (r34 != null) {
                this.f8389.add(r34);
            }
        } else if (t == C0349.f3768) {
            C0742<Float, Float> r35 = this.f9122;
            if (r35 != null) {
                this.f8389.remove(r35);
            }
            if (r4 == null) {
                this.f9122 = null;
                return;
            }
            this.f9122 = new C1120(r4);
            this.f9122.f5002.add(this);
            C0742<Float, Float> r36 = this.f9122;
            if (r36 != null) {
                this.f8389.add(r36);
            }
        } else if (t == C0349.f3769) {
            C0742<Float, Float> r37 = this.f9125;
            if (r37 != null) {
                this.f8389.remove(r37);
            }
            if (r4 == null) {
                this.f9125 = null;
                return;
            }
            this.f9125 = new C1120(r4);
            this.f9125.f5002.add(this);
            C0742<Float, Float> r38 = this.f9125;
            if (r38 != null) {
                this.f8389.add(r38);
            }
        } else if (t == C0349.f3756) {
            C0742<Float, Float> r39 = this.f9126;
            if (r39 != null) {
                this.f8389.remove(r39);
            }
            if (r4 == null) {
                this.f9126 = null;
                return;
            }
            this.f9126 = new C1120(r4);
            this.f9126.f5002.add(this);
            C0742<Float, Float> r310 = this.f9126;
            if (r310 != null) {
                this.f8389.add(r310);
            }
        }
    }
}
