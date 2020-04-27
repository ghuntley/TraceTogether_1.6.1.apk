package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import o.C0957;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ґǃ  reason: contains not printable characters */
public class C2677 extends C2584 {

    /* renamed from: ι  reason: contains not printable characters */
    static final PorterDuff.Mode f12329 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ı  reason: contains not printable characters */
    private IF f12330;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f12331;

    /* renamed from: ǃ  reason: contains not printable characters */
    private PorterDuffColorFilter f12332;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Rect f12333;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Drawable.ConstantState f12334;

    /* renamed from: Ι  reason: contains not printable characters */
    private ColorFilter f12335;

    /* renamed from: І  reason: contains not printable characters */
    private final Matrix f12336;

    /* renamed from: і  reason: contains not printable characters */
    private final float[] f12337;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f12338;

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    C2677() {
        this.f12331 = true;
        this.f12337 = new float[9];
        this.f12336 = new Matrix();
        this.f12333 = new Rect();
        this.f12330 = new IF();
    }

    C2677(IF ifR) {
        this.f12331 = true;
        this.f12337 = new float[9];
        this.f12336 = new Matrix();
        this.f12333 = new Rect();
        this.f12330 = ifR;
        this.f12332 = m14251(this.f12332, ifR.f12339, ifR.f12341);
    }

    public Drawable mutate() {
        if (this.f11738 != null) {
            this.f11738.mutate();
            return this;
        }
        if (!this.f12338 && super.mutate() == this) {
            this.f12330 = new IF(this.f12330);
            this.f12338 = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public Object m14249(String str) {
        return this.f12330.f12346.f12371.get(str);
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f11738 != null && Build.VERSION.SDK_INT >= 24) {
            return new C2681(this.f11738.getConstantState());
        }
        this.f12330.f12344 = getChangingConfigurations();
        return this.f12330;
    }

    public void draw(Canvas canvas) {
        if (this.f11738 != null) {
            this.f11738.draw(canvas);
            return;
        }
        copyBounds(this.f12333);
        if (this.f12333.width() > 0 && this.f12333.height() > 0) {
            ColorFilter colorFilter = this.f12335;
            if (colorFilter == null) {
                colorFilter = this.f12332;
            }
            canvas.getMatrix(this.f12336);
            this.f12336.getValues(this.f12337);
            float abs = Math.abs(this.f12337[0]);
            float abs2 = Math.abs(this.f12337[4]);
            float abs3 = Math.abs(this.f12337[1]);
            float abs4 = Math.abs(this.f12337[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f12333.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f12333.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f12333.left, (float) this.f12333.top);
                if (m14248()) {
                    canvas.translate((float) this.f12333.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f12333.offsetTo(0, 0);
                this.f12330.m14253(min, min2);
                if (!this.f12331) {
                    this.f12330.m14261(min, min2);
                } else if (!this.f12330.m14254()) {
                    this.f12330.m14261(min, min2);
                    this.f12330.m14252();
                }
                this.f12330.m14256(canvas, colorFilter, this.f12333);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        if (this.f11738 != null) {
            return C1266.m8156(this.f11738);
        }
        return this.f12330.f12346.getRootAlpha();
    }

    public void setAlpha(int i) {
        if (this.f11738 != null) {
            this.f11738.setAlpha(i);
        } else if (this.f12330.f12346.getRootAlpha() != i) {
            this.f12330.f12346.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f11738 != null) {
            this.f11738.setColorFilter(colorFilter);
            return;
        }
        this.f12335 = colorFilter;
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        if (this.f11738 != null) {
            return C1266.m8147(this.f11738);
        }
        return this.f12335;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public PorterDuffColorFilter m14251(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setTint(int i) {
        if (this.f11738 != null) {
            C1266.m8148(this.f11738, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f11738 != null) {
            C1266.m8152(this.f11738, colorStateList);
            return;
        }
        IF ifR = this.f12330;
        if (ifR.f12339 != colorStateList) {
            ifR.f12339 = colorStateList;
            this.f12332 = m14251(this.f12332, colorStateList, ifR.f12341);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f11738 != null) {
            C1266.m8153(this.f11738, mode);
            return;
        }
        IF ifR = this.f12330;
        if (ifR.f12341 != mode) {
            ifR.f12341 = mode;
            this.f12332 = m14251(this.f12332, ifR.f12339, mode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        if (this.f11738 != null) {
            return this.f11738.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        IF ifR = this.f12330;
        if (ifR == null) {
            return false;
        }
        if (!ifR.m14259()) {
            return this.f12330.f12339 != null && this.f12330.f12339.isStateful();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f11738 != null) {
            return this.f11738.setState(iArr);
        }
        boolean z = false;
        IF ifR = this.f12330;
        if (!(ifR.f12339 == null || ifR.f12341 == null)) {
            this.f12332 = m14251(this.f12332, ifR.f12339, ifR.f12341);
            invalidateSelf();
            z = true;
        }
        if (!ifR.m14259() || !ifR.m14255(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        if (this.f11738 != null) {
            return this.f11738.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        if (this.f11738 != null) {
            return this.f11738.getIntrinsicWidth();
        }
        return (int) this.f12330.f12346.f12367;
    }

    public int getIntrinsicHeight() {
        if (this.f11738 != null) {
            return this.f11738.getIntrinsicHeight();
        }
        return (int) this.f12330.f12346.f12356;
    }

    public boolean canApplyTheme() {
        if (this.f11738 == null) {
            return false;
        }
        C1266.m8155(this.f11738);
        return false;
    }

    public boolean isAutoMirrored() {
        if (this.f11738 != null) {
            return C1266.m8142(this.f11738);
        }
        return this.f12330.f12347;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f11738 != null) {
            C1266.m8154(this.f11738, z);
        } else {
            this.f12330.f12347 = z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[Catch:{ IOException | XmlPullParserException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0040 }] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.C2677 m14247(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            o.ґǃ r0 = new o.ґǃ
            r0.<init>()
            android.graphics.drawable.Drawable r4 = o.C0913.m6730(r4, r5, r6)
            r0.f11738 = r4
            o.ґǃ$ι r4 = new o.ґǃ$ι
            android.graphics.drawable.Drawable r5 = r0.f11738
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f12334 = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            r2 = 2
            if (r1 == r2) goto L_0x0031
            r3 = 1
            if (r1 != r3) goto L_0x0027
        L_0x0031:
            if (r1 != r2) goto L_0x0038
            o.ґǃ r4 = m14242(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            return r4
        L_0x0038:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
        L_0x0040:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2677.m14247(android.content.res.Resources, int, android.content.res.Resources$Theme):o.ґǃ");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2677 m14242(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2677 r0 = new C2677();
        r0.inflate(resources, xmlPullParser, attributeSet, theme);
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m14244(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f11738 != null) {
            this.f11738.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        if (this.f11738 != null) {
            C1266.m8146(this.f11738, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        IF ifR = this.f12330;
        ifR.f12346 = new C3655iF();
        int[] iArr = C2475.f11270;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        m14243(typedArray, xmlPullParser, theme);
        typedArray.recycle();
        ifR.f12344 = getChangingConfigurations();
        ifR.f12342 = true;
        m14245(resources, xmlPullParser, attributeSet, theme);
        this.f12332 = m14251(this.f12332, ifR.f12339, ifR.f12341);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static PorterDuff.Mode m14246(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m14243(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        ColorStateList colorStateList;
        IF ifR = this.f12330;
        C3655iF iFVar = ifR.f12346;
        boolean z = true;
        int i = -1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tintMode") != null) {
            i = typedArray.getInt(6, -1);
        }
        ifR.f12341 = m14246(i, PorterDuff.Mode.SRC_IN);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            if (typedValue.type != 2) {
                colorStateList = (typedValue.type < 28 || typedValue.type > 31) ? C0763.m6037(typedArray.getResources(), typedArray.getResourceId(1, 0), theme) : ColorStateList.valueOf(typedValue.data);
            } else {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(String.valueOf(typedValue)));
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            ifR.f12339 = colorStateList;
        }
        boolean z2 = ifR.f12347;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z2 = typedArray.getBoolean(5, z2);
        }
        ifR.f12347 = z2;
        float f = iFVar.f12368;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArray.getFloat(7, f);
        }
        iFVar.f12368 = f;
        float f2 = iFVar.f12357;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArray.getFloat(8, f2);
        }
        iFVar.f12357 = f2;
        if (iFVar.f12368 <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (iFVar.f12357 > 0.0f) {
            iFVar.f12367 = typedArray.getDimension(3, iFVar.f12367);
            iFVar.f12356 = typedArray.getDimension(2, iFVar.f12356);
            if (iFVar.f12367 <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (iFVar.f12356 > 0.0f) {
                float alpha = iFVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") == null) {
                    z = false;
                }
                if (z) {
                    alpha = typedArray.getFloat(4, alpha);
                }
                iFVar.setAlpha(alpha);
                String string = typedArray.getString(0);
                if (string != null) {
                    iFVar.f12362 = string;
                    iFVar.f12371.put(string, iFVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m14245(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        IF ifR = this.f12330;
        C3655iF iFVar = ifR.f12346;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(iFVar.f12360);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C2680 r7 = (C2680) arrayDeque.peek();
                if ("path".equals(name)) {
                    C2679 r3 = new C2679();
                    r3.m14279(resources, attributeSet, theme, xmlPullParser);
                    r7.f12393.add(r3);
                    if (r3.getPathName() != null) {
                        iFVar.f12371.put(r3.getPathName(), r3);
                    }
                    z = false;
                    ifR.f12344 = r3.f12352 | ifR.f12344;
                } else if ("clip-path".equals(name)) {
                    Cif ifVar = new Cif();
                    ifVar.m14273(resources, attributeSet, theme, xmlPullParser);
                    r7.f12393.add(ifVar);
                    if (ifVar.getPathName() != null) {
                        iFVar.f12371.put(ifVar.getPathName(), ifVar);
                    }
                    ifR.f12344 = ifVar.f12352 | ifR.f12344;
                } else if ("group".equals(name)) {
                    C2680 r32 = new C2680();
                    r32.m14284(resources, attributeSet, theme, xmlPullParser);
                    r7.f12393.add(r32);
                    arrayDeque.push(r32);
                    if (r32.getGroupName() != null) {
                        iFVar.f12371.put(r32.getGroupName(), r32);
                    }
                    ifR.f12344 = r32.f12388 | ifR.f12344;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m14250(boolean z) {
        this.f12331 = z;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m14248() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C1266.m8143(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f11738 != null) {
            this.f11738.setBounds(rect);
        }
    }

    public int getChangingConfigurations() {
        if (this.f11738 != null) {
            return this.f11738.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12330.getChangingConfigurations();
    }

    public void invalidateSelf() {
        if (this.f11738 != null) {
            this.f11738.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f11738 != null) {
            this.f11738.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f11738 != null) {
            return this.f11738.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f11738 != null) {
            this.f11738.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: o.ґǃ$ι  reason: contains not printable characters */
    static class C2681 extends Drawable.ConstantState {

        /* renamed from: ι  reason: contains not printable characters */
        private final Drawable.ConstantState f12397;

        public C2681(Drawable.ConstantState constantState) {
            this.f12397 = constantState;
        }

        public Drawable newDrawable() {
            C2677 r0 = new C2677();
            r0.f11738 = (VectorDrawable) this.f12397.newDrawable();
            return r0;
        }

        public Drawable newDrawable(Resources resources) {
            C2677 r0 = new C2677();
            r0.f11738 = (VectorDrawable) this.f12397.newDrawable(resources);
            return r0;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2677 r0 = new C2677();
            r0.f11738 = (VectorDrawable) this.f12397.newDrawable(resources, theme);
            return r0;
        }

        public boolean canApplyTheme() {
            return this.f12397.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f12397.getChangingConfigurations();
        }
    }

    /* renamed from: o.ґǃ$IF */
    static class IF extends Drawable.ConstantState {

        /* renamed from: ı  reason: contains not printable characters */
        ColorStateList f12339;

        /* renamed from: Ɩ  reason: contains not printable characters */
        int f12340;

        /* renamed from: ǃ  reason: contains not printable characters */
        PorterDuff.Mode f12341;

        /* renamed from: ȷ  reason: contains not printable characters */
        boolean f12342;

        /* renamed from: ɨ  reason: contains not printable characters */
        Paint f12343;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f12344;

        /* renamed from: ɹ  reason: contains not printable characters */
        PorterDuff.Mode f12345;

        /* renamed from: Ι  reason: contains not printable characters */
        C3655iF f12346;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f12347;

        /* renamed from: І  reason: contains not printable characters */
        Bitmap f12348;

        /* renamed from: і  reason: contains not printable characters */
        boolean f12349;

        /* renamed from: Ӏ  reason: contains not printable characters */
        ColorStateList f12350;

        public IF(IF ifR) {
            this.f12339 = null;
            this.f12341 = C2677.f12329;
            if (ifR != null) {
                this.f12344 = ifR.f12344;
                this.f12346 = new C3655iF(ifR.f12346);
                if (ifR.f12346.f12358 != null) {
                    this.f12346.f12358 = new Paint(ifR.f12346.f12358);
                }
                if (ifR.f12346.f12366 != null) {
                    this.f12346.f12366 = new Paint(ifR.f12346.f12366);
                }
                this.f12339 = ifR.f12339;
                this.f12341 = ifR.f12341;
                this.f12347 = ifR.f12347;
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m14256(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f12348, (Rect) null, rect, m14260(colorFilter));
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean m14257() {
            return this.f12346.getRootAlpha() < 255;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public Paint m14260(ColorFilter colorFilter) {
            if (!m14257() && colorFilter == null) {
                return null;
            }
            if (this.f12343 == null) {
                this.f12343 = new Paint();
                this.f12343.setFilterBitmap(true);
            }
            this.f12343.setAlpha(this.f12346.getRootAlpha());
            this.f12343.setColorFilter(colorFilter);
            return this.f12343;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m14261(int i, int i2) {
            this.f12348.eraseColor(0);
            this.f12346.m14270(new Canvas(this.f12348), i, i2, (ColorFilter) null);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m14253(int i, int i2) {
            if (this.f12348 == null || !m14258(i, i2)) {
                this.f12348 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f12342 = true;
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean m14258(int i, int i2) {
            return i == this.f12348.getWidth() && i2 == this.f12348.getHeight();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m14254() {
            return !this.f12342 && this.f12350 == this.f12339 && this.f12345 == this.f12341 && this.f12349 == this.f12347 && this.f12340 == this.f12346.getRootAlpha();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m14252() {
            this.f12350 = this.f12339;
            this.f12345 = this.f12341;
            this.f12340 = this.f12346.getRootAlpha();
            this.f12349 = this.f12347;
            this.f12342 = false;
        }

        public IF() {
            this.f12339 = null;
            this.f12341 = C2677.f12329;
            this.f12346 = new C3655iF();
        }

        public Drawable newDrawable() {
            return new C2677(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C2677(this);
        }

        public int getChangingConfigurations() {
            return this.f12344;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14259() {
            return this.f12346.m14268();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m14255(int[] iArr) {
            boolean r2 = this.f12346.m14269(iArr);
            this.f12342 |= r2;
            return r2;
        }
    }

    /* renamed from: o.ґǃ$iF  reason: case insensitive filesystem */
    static class C3655iF {

        /* renamed from: ɨ  reason: contains not printable characters */
        private static final Matrix f12355 = new Matrix();

        /* renamed from: ı  reason: contains not printable characters */
        float f12356;

        /* renamed from: Ɩ  reason: contains not printable characters */
        float f12357;

        /* renamed from: ǃ  reason: contains not printable characters */
        Paint f12358;

        /* renamed from: ȷ  reason: contains not printable characters */
        private final Path f12359;

        /* renamed from: ɩ  reason: contains not printable characters */
        final C2680 f12360;

        /* renamed from: ɪ  reason: contains not printable characters */
        private final Path f12361;

        /* renamed from: ɹ  reason: contains not printable characters */
        String f12362;

        /* renamed from: ɾ  reason: contains not printable characters */
        private final Matrix f12363;

        /* renamed from: ɿ  reason: contains not printable characters */
        private int f12364;

        /* renamed from: ʟ  reason: contains not printable characters */
        private PathMeasure f12365;

        /* renamed from: Ι  reason: contains not printable characters */
        Paint f12366;

        /* renamed from: ι  reason: contains not printable characters */
        float f12367;

        /* renamed from: І  reason: contains not printable characters */
        float f12368;

        /* renamed from: і  reason: contains not printable characters */
        int f12369;

        /* renamed from: Ӏ  reason: contains not printable characters */
        Boolean f12370;

        /* renamed from: ӏ  reason: contains not printable characters */
        final C0299<String, Object> f12371;

        /* renamed from: ǃ  reason: contains not printable characters */
        private static float m14265(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public C3655iF() {
            this.f12363 = new Matrix();
            this.f12367 = 0.0f;
            this.f12356 = 0.0f;
            this.f12368 = 0.0f;
            this.f12357 = 0.0f;
            this.f12369 = 255;
            this.f12362 = null;
            this.f12370 = null;
            this.f12371 = new C0299<>();
            this.f12360 = new C2680();
            this.f12361 = new Path();
            this.f12359 = new Path();
        }

        public void setRootAlpha(int i) {
            this.f12369 = i;
        }

        public int getRootAlpha() {
            return this.f12369;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C3655iF(C3655iF iFVar) {
            this.f12363 = new Matrix();
            this.f12367 = 0.0f;
            this.f12356 = 0.0f;
            this.f12368 = 0.0f;
            this.f12357 = 0.0f;
            this.f12369 = 255;
            this.f12362 = null;
            this.f12370 = null;
            this.f12371 = new C0299<>();
            this.f12360 = new C2680(iFVar.f12360, this.f12371);
            this.f12361 = new Path(iFVar.f12361);
            this.f12359 = new Path(iFVar.f12359);
            this.f12367 = iFVar.f12367;
            this.f12356 = iFVar.f12356;
            this.f12368 = iFVar.f12368;
            this.f12357 = iFVar.f12357;
            this.f12364 = iFVar.f12364;
            this.f12369 = iFVar.f12369;
            this.f12362 = iFVar.f12362;
            String str = iFVar.f12362;
            if (str != null) {
                this.f12371.put(str, this);
            }
            this.f12370 = iFVar.f12370;
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m14264(C2680 r10, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            r10.f12386.set(matrix);
            r10.f12386.preConcat(r10.f12392);
            canvas.save();
            for (int i3 = 0; i3 < r10.f12393.size(); i3++) {
                C2678 r0 = r10.f12393.get(i3);
                if (r0 instanceof C2680) {
                    m14264((C2680) r0, r10.f12386, canvas, i, i2, colorFilter);
                } else if (r0 instanceof C3654If) {
                    m14267(r10, (C3654If) r0, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m14270(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m14264(this.f12360, f12355, canvas, i, i2, colorFilter);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private void m14267(C2680 r8, C3654If ifR, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f12368;
            float f2 = ((float) i2) / this.f12357;
            float min = Math.min(f, f2);
            Matrix matrix = r8.f12386;
            this.f12363.set(matrix);
            this.f12363.postScale(f, f2);
            float r82 = m14266(matrix);
            if (r82 != 0.0f) {
                ifR.m14263(this.f12361);
                Path path = this.f12361;
                this.f12359.reset();
                if (ifR.m14262()) {
                    this.f12359.setFillType(ifR.f12351 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f12359.addPath(path, this.f12363);
                    canvas.clipPath(this.f12359);
                    return;
                }
                C2679 r9 = (C2679) ifR;
                if (!(r9.f12381 == 0.0f && r9.f12383 == 1.0f)) {
                    float f3 = (r9.f12381 + r9.f12374) % 1.0f;
                    float f4 = (r9.f12383 + r9.f12374) % 1.0f;
                    if (this.f12365 == null) {
                        this.f12365 = new PathMeasure();
                    }
                    this.f12365.setPath(this.f12361, false);
                    float length = this.f12365.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f12365.getSegment(f5, length, path, true);
                        this.f12365.getSegment(0.0f, f6, path, true);
                    } else {
                        this.f12365.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f12359.addPath(path, this.f12363);
                if (r9.f12379.m5162()) {
                    C0558 r11 = r9.f12379;
                    if (this.f12358 == null) {
                        this.f12358 = new Paint(1);
                        this.f12358.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.f12358;
                    if (r11.m5161()) {
                        Shader r112 = r11.m5166();
                        r112.setLocalMatrix(this.f12363);
                        paint.setShader(r112);
                        paint.setAlpha(Math.round(r9.f12372 * 255.0f));
                    } else {
                        paint.setShader((Shader) null);
                        paint.setAlpha(255);
                        paint.setColor(C2677.m14244(r11.m5163(), r9.f12372));
                    }
                    paint.setColorFilter(colorFilter);
                    this.f12359.setFillType(r9.f12351 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f12359, paint);
                }
                if (r9.f12380.m5162()) {
                    C0558 r113 = r9.f12380;
                    if (this.f12366 == null) {
                        this.f12366 = new Paint(1);
                        this.f12366.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.f12366;
                    if (r9.f12382 != null) {
                        paint2.setStrokeJoin(r9.f12382);
                    }
                    if (r9.f12378 != null) {
                        paint2.setStrokeCap(r9.f12378);
                    }
                    paint2.setStrokeMiter(r9.f12376);
                    if (r113.m5161()) {
                        Shader r114 = r113.m5166();
                        r114.setLocalMatrix(this.f12363);
                        paint2.setShader(r114);
                        paint2.setAlpha(Math.round(r9.f12375 * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C2677.m14244(r113.m5163(), r9.f12375));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(r9.f12377 * min * r82);
                    canvas.drawPath(this.f12359, paint2);
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private float m14266(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float r10 = m14265(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(r10) / max;
            }
            return 0.0f;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public boolean m14268() {
            if (this.f12370 == null) {
                this.f12370 = Boolean.valueOf(this.f12360.m14285());
            }
            return this.f12370.booleanValue();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public boolean m14269(int[] iArr) {
            return this.f12360.m14286(iArr);
        }
    }

    /* renamed from: o.ґǃ$ı  reason: contains not printable characters */
    static abstract class C2678 {
        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14274() {
            return false;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14275(int[] iArr) {
            return false;
        }

        private C2678() {
        }
    }

    /* renamed from: o.ґǃ$ɩ  reason: contains not printable characters */
    static class C2680 extends C2678 {

        /* renamed from: ı  reason: contains not printable characters */
        float f12384 = 0.0f;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private float f12385 = 0.0f;

        /* renamed from: ǃ  reason: contains not printable characters */
        final Matrix f12386 = new Matrix();

        /* renamed from: ȷ  reason: contains not printable characters */
        private int[] f12387;

        /* renamed from: ɩ  reason: contains not printable characters */
        int f12388;

        /* renamed from: ɪ  reason: contains not printable characters */
        private float f12389 = 0.0f;

        /* renamed from: ɹ  reason: contains not printable characters */
        private float f12390 = 1.0f;

        /* renamed from: ɾ  reason: contains not printable characters */
        private String f12391 = null;

        /* renamed from: Ι  reason: contains not printable characters */
        final Matrix f12392 = new Matrix();

        /* renamed from: ι  reason: contains not printable characters */
        final ArrayList<C2678> f12393 = new ArrayList<>();

        /* renamed from: І  reason: contains not printable characters */
        private float f12394 = 0.0f;

        /* renamed from: і  reason: contains not printable characters */
        private float f12395 = 0.0f;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private float f12396 = 1.0f;

        public C2680(C2680 r5, C0299<String, Object> r6) {
            super();
            C3654If ifR;
            this.f12384 = r5.f12384;
            this.f12394 = r5.f12394;
            this.f12385 = r5.f12385;
            this.f12390 = r5.f12390;
            this.f12396 = r5.f12396;
            this.f12395 = r5.f12395;
            this.f12389 = r5.f12389;
            this.f12387 = r5.f12387;
            this.f12391 = r5.f12391;
            this.f12388 = r5.f12388;
            String str = this.f12391;
            if (str != null) {
                r6.put(str, this);
            }
            this.f12392.set(r5.f12392);
            ArrayList<C2678> arrayList = r5.f12393;
            for (int i = 0; i < arrayList.size(); i++) {
                C2678 r1 = arrayList.get(i);
                if (r1 instanceof C2680) {
                    this.f12393.add(new C2680((C2680) r1, r6));
                } else {
                    if (r1 instanceof C2679) {
                        ifR = new C2679((C2679) r1);
                    } else if (r1 instanceof Cif) {
                        ifR = new Cif((Cif) r1);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f12393.add(ifR);
                    if (ifR.f12354 != null) {
                        r6.put(ifR.f12354, ifR);
                    }
                }
            }
        }

        public C2680() {
            super();
        }

        public String getGroupName() {
            return this.f12391;
        }

        public Matrix getLocalMatrix() {
            return this.f12392;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public void m14284(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            int[] iArr = C2475.f11275;
            if (theme == null) {
                typedArray = resources.obtainAttributes(attributeSet, iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            m14282(typedArray, xmlPullParser);
            typedArray.recycle();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private void m14282(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f12387 = null;
            float f = this.f12384;
            boolean z = true;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                f = typedArray.getFloat(5, f);
            }
            this.f12384 = f;
            this.f12394 = typedArray.getFloat(1, this.f12394);
            this.f12385 = typedArray.getFloat(2, this.f12385);
            float f2 = this.f12390;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                f2 = typedArray.getFloat(3, f2);
            }
            this.f12390 = f2;
            float f3 = this.f12396;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                f3 = typedArray.getFloat(4, f3);
            }
            this.f12396 = f3;
            float f4 = this.f12395;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                f4 = typedArray.getFloat(6, f4);
            }
            this.f12395 = f4;
            float f5 = this.f12389;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") == null) {
                z = false;
            }
            if (z) {
                f5 = typedArray.getFloat(7, f5);
            }
            this.f12389 = f5;
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12391 = string;
            }
            m14283();
        }

        /* renamed from: ι  reason: contains not printable characters */
        private void m14283() {
            this.f12392.reset();
            this.f12392.postTranslate(-this.f12394, -this.f12385);
            this.f12392.postScale(this.f12390, this.f12396);
            this.f12392.postRotate(this.f12384, 0.0f, 0.0f);
            this.f12392.postTranslate(this.f12395 + this.f12394, this.f12389 + this.f12385);
        }

        public float getRotation() {
            return this.f12384;
        }

        public void setRotation(float f) {
            if (f != this.f12384) {
                this.f12384 = f;
                m14283();
            }
        }

        public float getPivotX() {
            return this.f12394;
        }

        public void setPivotX(float f) {
            if (f != this.f12394) {
                this.f12394 = f;
                m14283();
            }
        }

        public float getPivotY() {
            return this.f12385;
        }

        public void setPivotY(float f) {
            if (f != this.f12385) {
                this.f12385 = f;
                m14283();
            }
        }

        public float getScaleX() {
            return this.f12390;
        }

        public void setScaleX(float f) {
            if (f != this.f12390) {
                this.f12390 = f;
                m14283();
            }
        }

        public float getScaleY() {
            return this.f12396;
        }

        public void setScaleY(float f) {
            if (f != this.f12396) {
                this.f12396 = f;
                m14283();
            }
        }

        public float getTranslateX() {
            return this.f12395;
        }

        public void setTranslateX(float f) {
            if (f != this.f12395) {
                this.f12395 = f;
                m14283();
            }
        }

        public float getTranslateY() {
            return this.f12389;
        }

        public void setTranslateY(float f) {
            if (f != this.f12389) {
                this.f12389 = f;
                m14283();
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14285() {
            for (int i = 0; i < this.f12393.size(); i++) {
                if (this.f12393.get(i).m14274()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14286(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f12393.size(); i++) {
                z |= this.f12393.get(i).m14275(iArr);
            }
            return z;
        }
    }

    /* renamed from: o.ґǃ$If  reason: case insensitive filesystem */
    static abstract class C3654If extends C2678 {

        /* renamed from: ȷ  reason: contains not printable characters */
        int f12351 = 0;

        /* renamed from: ɪ  reason: contains not printable characters */
        int f12352;

        /* renamed from: ɾ  reason: contains not printable characters */
        protected C0957.If[] f12353 = null;

        /* renamed from: ӏ  reason: contains not printable characters */
        String f12354;

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m14262() {
            return false;
        }

        public C3654If() {
            super();
        }

        public C3654If(C3654If ifR) {
            super();
            this.f12354 = ifR.f12354;
            this.f12352 = ifR.f12352;
            this.f12353 = C0957.m6866(ifR.f12353);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m14263(Path path) {
            path.reset();
            C0957.If[] ifArr = this.f12353;
            if (ifArr != null) {
                C0957.If.m6869(ifArr, path);
            }
        }

        public String getPathName() {
            return this.f12354;
        }

        public C0957.If[] getPathData() {
            return this.f12353;
        }

        public void setPathData(C0957.If[] ifArr) {
            if (!C0957.m6865(this.f12353, ifArr)) {
                this.f12353 = C0957.m6866(ifArr);
                return;
            }
            C0957.If[] ifArr2 = this.f12353;
            for (int i = 0; i < ifArr.length; i++) {
                ifArr2[i].f5956 = ifArr[i].f5956;
                for (int i2 = 0; i2 < ifArr[i].f5957.length; i2++) {
                    ifArr2[i].f5957[i2] = ifArr[i].f5957[i2];
                }
            }
        }
    }

    /* renamed from: o.ґǃ$if  reason: invalid class name */
    static class Cif extends C3654If {
        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m14272() {
            return true;
        }

        Cif() {
        }

        Cif(Cif ifVar) {
            super(ifVar);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private void m14271(TypedArray typedArray, XmlPullParser xmlPullParser) {
            int i = 0;
            String string = typedArray.getString(0);
            if (string != null) {
                this.f12354 = string;
            }
            boolean z = true;
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f12353 = C0957.m6860(string2);
            }
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") == null) {
                z = false;
            }
            if (z) {
                i = typedArray.getInt(2, 0);
            }
            this.f12351 = i;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m14273(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                int[] iArr = C2475.f11271;
                if (theme == null) {
                    typedArray = resources.obtainAttributes(attributeSet, iArr);
                } else {
                    typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                }
                m14271(typedArray, xmlPullParser);
                typedArray.recycle();
            }
        }
    }

    /* renamed from: o.ґǃ$ǃ  reason: contains not printable characters */
    static class C2679 extends C3654If {

        /* renamed from: ı  reason: contains not printable characters */
        float f12372 = 1.0f;

        /* renamed from: ŀ  reason: contains not printable characters */
        private int[] f12373;

        /* renamed from: Ɩ  reason: contains not printable characters */
        float f12374 = 0.0f;

        /* renamed from: ǃ  reason: contains not printable characters */
        float f12375 = 1.0f;

        /* renamed from: ɨ  reason: contains not printable characters */
        float f12376 = 4.0f;

        /* renamed from: ɩ  reason: contains not printable characters */
        float f12377 = 0.0f;

        /* renamed from: ɹ  reason: contains not printable characters */
        Paint.Cap f12378 = Paint.Cap.BUTT;

        /* renamed from: Ι  reason: contains not printable characters */
        C0558 f12379;

        /* renamed from: ι  reason: contains not printable characters */
        C0558 f12380;

        /* renamed from: І  reason: contains not printable characters */
        float f12381 = 0.0f;

        /* renamed from: і  reason: contains not printable characters */
        Paint.Join f12382 = Paint.Join.MITER;

        /* renamed from: Ӏ  reason: contains not printable characters */
        float f12383 = 1.0f;

        C2679() {
        }

        C2679(C2679 r3) {
            super(r3);
            this.f12373 = r3.f12373;
            this.f12380 = r3.f12380;
            this.f12377 = r3.f12377;
            this.f12375 = r3.f12375;
            this.f12379 = r3.f12379;
            this.f12351 = r3.f12351;
            this.f12372 = r3.f12372;
            this.f12381 = r3.f12381;
            this.f12383 = r3.f12383;
            this.f12374 = r3.f12374;
            this.f12378 = r3.f12378;
            this.f12382 = r3.f12382;
            this.f12376 = r3.f12376;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private Paint.Cap m14276(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private Paint.Join m14278(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m14279(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray;
            int[] iArr = C2475.f11274;
            if (theme == null) {
                typedArray = resources.obtainAttributes(attributeSet, iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            m14277(typedArray, xmlPullParser, theme);
            typedArray.recycle();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m14277(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f12373 = null;
            boolean z = true;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f12354 = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f12353 = C0957.m6860(string2);
                }
                this.f12379 = C0899.m6668(typedArray, xmlPullParser, theme, "fillColor", 1);
                float f = this.f12372;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                    f = typedArray.getFloat(12, f);
                }
                this.f12372 = f;
                int i = -1;
                this.f12378 = m14276(!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) ? -1 : typedArray.getInt(8, -1), this.f12378);
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                    i = typedArray.getInt(9, -1);
                }
                this.f12382 = m14278(i, this.f12382);
                float f2 = this.f12376;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                    f2 = typedArray.getFloat(10, f2);
                }
                this.f12376 = f2;
                this.f12380 = C0899.m6668(typedArray, xmlPullParser, theme, "strokeColor", 3);
                float f3 = this.f12375;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                    f3 = typedArray.getFloat(11, f3);
                }
                this.f12375 = f3;
                float f4 = this.f12377;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                    f4 = typedArray.getFloat(4, f4);
                }
                this.f12377 = f4;
                float f5 = this.f12383;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                    f5 = typedArray.getFloat(6, f5);
                }
                this.f12383 = f5;
                float f6 = this.f12374;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                    f6 = typedArray.getFloat(7, f6);
                }
                this.f12374 = f6;
                float f7 = this.f12381;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                    f7 = typedArray.getFloat(5, f7);
                }
                this.f12381 = f7;
                int i2 = this.f12351;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") == null) {
                    z = false;
                }
                if (z) {
                    i2 = typedArray.getInt(13, i2);
                }
                this.f12351 = i2;
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14280() {
            return this.f12379.m5164() || this.f12380.m5164();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m14281(int[] iArr) {
            return this.f12380.m5165(iArr) | this.f12379.m5165(iArr);
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f12380.m5163();
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f12380.m5167(i);
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f12377;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f12377 = f;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f12375;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f12375 = f;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f12379.m5163();
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f12379.m5167(i);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f12372;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f12372 = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f12381;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f12381 = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f12383;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f12383 = f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f12374;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f12374 = f;
        }
    }
}
