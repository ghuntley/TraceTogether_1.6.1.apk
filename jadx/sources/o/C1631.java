package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import o.C2745;

/* renamed from: o.ʋ  reason: contains not printable characters */
class C1631 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final RectF f8580 = new RectF();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static ConcurrentHashMap<String, Method> f8581 = new ConcurrentHashMap<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private static ConcurrentHashMap<String, Field> f8582 = new ConcurrentHashMap<>();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int[] f8583 = new int[0];

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f8584 = 0;

    /* renamed from: ȷ  reason: contains not printable characters */
    private TextPaint f8585;

    /* renamed from: ɹ  reason: contains not printable characters */
    private float f8586 = -1.0f;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Context f8587;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f8588 = false;

    /* renamed from: І  reason: contains not printable characters */
    private float f8589 = -1.0f;

    /* renamed from: і  reason: contains not printable characters */
    private float f8590 = -1.0f;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f8591 = false;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final TextView f8592;

    C1631(TextView textView) {
        this.f8592 = textView;
        this.f8587 = this.f8592.getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public void m9422(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f8587.obtainStyledAttributes(attributeSet, C2745.aux.f12844, i, 0);
        if (obtainStyledAttributes.hasValue(C2745.aux.f12786)) {
            this.f8584 = obtainStyledAttributes.getInt(C2745.aux.f12786, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C2745.aux.f12921) ? obtainStyledAttributes.getDimension(C2745.aux.f12921, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C2745.aux.f12975) ? obtainStyledAttributes.getDimension(C2745.aux.f12975, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C2745.aux.f12894) ? obtainStyledAttributes.getDimension(C2745.aux.f12894, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C2745.aux.f12946) && (resourceId = obtainStyledAttributes.getResourceId(C2745.aux.f12946, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m9405(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m9417()) {
            this.f8584 = 0;
        } else if (this.f8584 == 1) {
            if (!this.f8591) {
                DisplayMetrics displayMetrics = this.f8587.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m9404(dimension2, dimension3, dimension);
            }
            m9416();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m9426(int i) {
        if (!m9417()) {
            return;
        }
        if (i == 0) {
            m9415();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f8587.getResources().getDisplayMetrics();
            m9404(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m9416()) {
                m9431();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m9430(int i, int i2, int i3, int i4) {
        if (m9417()) {
            DisplayMetrics displayMetrics = this.f8587.getResources().getDisplayMetrics();
            m9404(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m9416()) {
                m9431();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m9420(int[] iArr, int i) {
        if (m9417()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f8587.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f8583 = m9412(iArr2);
                if (!m9407()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f8591 = false;
            }
            if (m9416()) {
                m9431();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public int m9423() {
        return this.f8584;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public int m9421() {
        return Math.round(this.f8586);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public int m9429() {
        return Math.round(this.f8590);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public int m9418() {
        return Math.round(this.f8589);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public int[] m9428() {
        return this.f8583;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9405(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f8583 = m9412(iArr);
            m9407();
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean m9407() {
        int length = this.f8583.length;
        this.f8591 = length > 0;
        if (this.f8591) {
            this.f8584 = 1;
            int[] iArr = this.f8583;
            this.f8590 = (float) iArr[0];
            this.f8589 = (float) iArr[length - 1];
            this.f8586 = -1.0f;
        }
        return this.f8591;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int[] m9412(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9404(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f8584 = 1;
            this.f8590 = f;
            this.f8589 = f2;
            this.f8586 = f3;
            this.f8591 = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean m9416() {
        if (!m9417() || this.f8584 != 1) {
            this.f8588 = false;
        } else {
            if (!this.f8591 || this.f8583.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f8589 - this.f8590) / this.f8586))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f8590 + (((float) i) * this.f8586));
                }
                this.f8583 = m9412(iArr);
            }
            this.f8588 = true;
        }
        return this.f8588;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public void m9431() {
        boolean z;
        int i;
        if (m9425()) {
            if (this.f8588) {
                if (this.f8592.getMeasuredHeight() > 0 && this.f8592.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = this.f8592.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) m9414(this.f8592, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                    }
                    if (z) {
                        i = 1048576;
                    } else {
                        i = (this.f8592.getMeasuredWidth() - this.f8592.getTotalPaddingLeft()) - this.f8592.getTotalPaddingRight();
                    }
                    int height = (this.f8592.getHeight() - this.f8592.getCompoundPaddingBottom()) - this.f8592.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f8580) {
                            f8580.setEmpty();
                            f8580.right = (float) i;
                            f8580.bottom = (float) height;
                            float r0 = (float) m9408(f8580);
                            if (r0 != this.f8592.getTextSize()) {
                                m9427(0, r0);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f8588 = true;
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private void m9415() {
        this.f8584 = 0;
        this.f8590 = -1.0f;
        this.f8589 = -1.0f;
        this.f8586 = -1.0f;
        this.f8583 = new int[0];
        this.f8588 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m9427(int i, float f) {
        Resources resources;
        Context context = this.f8587;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m9403(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9403(float f) {
        if (f != this.f8592.getPaint().getTextSize()) {
            this.f8592.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f8592.isInLayout() : false;
            if (this.f8592.getLayout() != null) {
                this.f8588 = false;
                try {
                    Method r0 = m9402("nullLayouts");
                    if (r0 != null) {
                        r0.invoke(this.f8592, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f8592.requestLayout();
                } else {
                    this.f8592.forceLayout();
                }
                this.f8592.invalidate();
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int m9408(RectF rectF) {
        int length = this.f8583.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m9406(this.f8583[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f8583[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m9424(int i) {
        TextPaint textPaint = this.f8585;
        if (textPaint == null) {
            this.f8585 = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f8585.set(this.f8592.getPaint());
        this.f8585.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public StaticLayout m9419(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m9413(charSequence, alignment, i, i2);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return m9411(charSequence, alignment, i);
        }
        return m9401(charSequence, alignment, i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m9406(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f8592.getText();
        TransformationMethod transformationMethod = this.f8592.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f8592)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f8592.getMaxLines() : -1;
        m9424(i);
        StaticLayout r6 = m9419(text, (Layout.Alignment) m9414(this.f8592, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (r6.getLineCount() <= maxLines && r6.getLineEnd(r6.getLineCount() - 1) == text.length())) && ((float) r6.getHeight()) <= rectF.bottom;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private StaticLayout m9413(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f8585, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f8592.getLineSpacingExtra(), this.f8592.getLineSpacingMultiplier()).setIncludePad(this.f8592.getIncludeFontPadding()).setBreakStrategy(this.f8592.getBreakStrategy()).setHyphenationFrequency(this.f8592.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.f8592.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) m9414(this.f8592, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private StaticLayout m9411(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f8585, i, alignment, this.f8592.getLineSpacingMultiplier(), this.f8592.getLineSpacingExtra(), this.f8592.getIncludeFontPadding());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private StaticLayout m9401(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f8585, i, alignment, ((Float) m9409(this.f8592, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m9409(this.f8592, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m9409(this.f8592, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m9414(java.lang.Object r1, java.lang.String r2, T r3) {
        /*
            java.lang.reflect.Method r2 = m9402((java.lang.String) r2)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r3 = r2.invoke(r1, r0)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r1 = move-exception
            throw r1
        L_0x000e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1631.m9414(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static <T> T m9409(Object obj, String str, T t) {
        try {
            Field r1 = m9410(str);
            if (r1 == null) {
                return t;
            }
            return r1.get(obj);
        } catch (IllegalAccessException unused) {
            return t;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Method m9402(String str) {
        try {
            Method method = f8581.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f8581.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Field m9410(String str) {
        try {
            Field field = f8582.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f8582.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public boolean m9425() {
        return m9417() && this.f8584 != 0;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean m9417() {
        return !(this.f8592 instanceof C1745);
    }
}
