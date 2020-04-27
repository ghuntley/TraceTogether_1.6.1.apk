package o;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import o.C1536;
import o.C3256CoN;
import o.C3335coN;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* renamed from: o.ɪ  reason: contains not printable characters */
public class C1324 extends C3256CoN implements C1328 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f7336 = C1324.class.getSimpleName();

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3641iF f7337;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f7338;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f7339;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f7340;

    /* renamed from: ι  reason: contains not printable characters */
    private If f7341;

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public C1324() {
        this((If) null, (Resources) null);
    }

    C1324(If ifR, Resources resources) {
        super((C3256CoN.C0092) null);
        this.f7338 = -1;
        this.f7340 = -1;
        m8335(new If(ifR, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1324 m8332(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1324 r0 = new C1324();
            r0.m8333(context, resources, xmlPullParser, attributeSet, theme);
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m8333(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        int[] iArr = C3335coN.Cif.f1986;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(typedArray.getBoolean(C3335coN.Cif.f1993, true), true);
        m8326(typedArray);
        m9004(resources);
        typedArray.recycle();
        m8329(context, resources, xmlPullParser, attributeSet, theme);
        m8328();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f7337 != null && (visible || z2)) {
            if (z) {
                this.f7337.m8348();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C3641iF iFVar = this.f7337;
        if (iFVar != null) {
            iFVar.m8349();
            this.f7337 = null;
            m9005(this.f7338);
            this.f7338 = -1;
            this.f7340 = -1;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int r0 = this.f7341.m8343(iArr);
        boolean z = r0 != m9002() && (m8331(r0) || m9005(r0));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m8331(int i) {
        int i2;
        int r6;
        C3641iF iFVar;
        C3641iF iFVar2 = this.f7337;
        if (iFVar2 == null) {
            i2 = m9002();
        } else if (i == this.f7338) {
            return true;
        } else {
            if (i != this.f7340 || !iFVar2.m8347()) {
                i2 = this.f7338;
                iFVar2.m8349();
            } else {
                iFVar2.m8350();
                this.f7338 = this.f7340;
                this.f7340 = i;
                return true;
            }
        }
        this.f7337 = null;
        this.f7340 = -1;
        this.f7338 = -1;
        If ifR = this.f7341;
        int r3 = ifR.m8341(i2);
        int r4 = ifR.m8341(i);
        if (r4 == 0 || r3 == 0 || (r6 = ifR.m8339(r3, r4)) < 0) {
            return false;
        }
        boolean r7 = ifR.m8344(r3, r4);
        m9005(r6);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            iFVar = new C1327((AnimationDrawable) current, ifR.m8346(r3, r4), r7);
        } else if (current instanceof C2576) {
            iFVar = new Cif((C2576) current);
        } else {
            if (current instanceof Animatable) {
                iFVar = new C1326((Animatable) current);
            }
            return false;
        }
        iFVar.m8348();
        this.f7337 = iFVar;
        this.f7340 = i2;
        this.f7338 = i;
        return true;
    }

    /* renamed from: o.ɪ$iF  reason: case insensitive filesystem */
    static abstract class C3641iF {
        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m8347() {
            return false;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract void m8348();

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract void m8349();

        /* renamed from: ι  reason: contains not printable characters */
        public void m8350() {
        }

        private C3641iF() {
        }
    }

    /* renamed from: o.ɪ$ǃ  reason: contains not printable characters */
    static class C1326 extends C3641iF {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Animatable f7348;

        C1326(Animatable animatable) {
            super();
            this.f7348 = animatable;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m8355() {
            this.f7348.start();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m8356() {
            this.f7348.stop();
        }
    }

    /* renamed from: o.ɪ$ɩ  reason: contains not printable characters */
    static class C1327 extends C3641iF {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final boolean f7349;

        /* renamed from: ι  reason: contains not printable characters */
        private final ObjectAnimator f7350;

        C1327(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C1325 r4 = new C1325(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) r4.m8353());
            ofInt.setInterpolator(r4);
            this.f7349 = z2;
            this.f7350 = ofInt;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m8357() {
            return this.f7349;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m8358() {
            this.f7350.start();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m8360() {
            this.f7350.reverse();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m8359() {
            this.f7350.cancel();
        }
    }

    /* renamed from: o.ɪ$if  reason: invalid class name */
    static class Cif extends C3641iF {

        /* renamed from: Ι  reason: contains not printable characters */
        private final C2576 f7344;

        Cif(C2576 r2) {
            super();
            this.f7344 = r2;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public void m8351() {
            this.f7344.start();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public void m8352() {
            this.f7344.stop();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8326(TypedArray typedArray) {
        If ifR = this.f7341;
        if (Build.VERSION.SDK_INT >= 21) {
            ifR.f8201 |= typedArray.getChangingConfigurations();
        }
        ifR.m9012(typedArray.getBoolean(C3335coN.Cif.f1976, ifR.f8176));
        ifR.m9017(typedArray.getBoolean(C3335coN.Cif.f1994, ifR.f8182));
        ifR.m9026(typedArray.getInt(C3335coN.Cif.f1995, ifR.f8186));
        ifR.m9028(typedArray.getInt(C3335coN.Cif.f1997, ifR.f8179));
        setDither(typedArray.getBoolean(C3335coN.Cif.f1983, ifR.f8174));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8328() {
        onStateChange(getState());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m8329(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m8330(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m8327(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private int m8327(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        int next;
        int[] iArr = C3335coN.Cif.f1989;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = typedArray.getResourceId(C3335coN.Cif.f1984, -1);
        int resourceId2 = typedArray.getResourceId(C3335coN.Cif.f1987, -1);
        Drawable drawable = null;
        int resourceId3 = typedArray.getResourceId(C3335coN.Cif.f1999, -1);
        if (resourceId3 > 0) {
            drawable = C0930.m6776().m6782(context, resourceId3);
        }
        boolean z = typedArray.getBoolean(C3335coN.Cif.f1985, false);
        typedArray.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = C2576.m13694(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f7341.m8340(resourceId, resourceId2, drawable, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m8330(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        int next;
        int[] iArr = C3335coN.Cif.f1980;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = typedArray.getResourceId(C3335coN.Cif.f1998, 0);
        Drawable drawable = null;
        int resourceId2 = typedArray.getResourceId(C3335coN.Cif.f1988, -1);
        if (resourceId2 > 0) {
            drawable = C0930.m6776().m6782(context, resourceId2);
        }
        typedArray.recycle();
        int[] r6 = m1333(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = C2677.m14242(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable != null) {
            return this.f7341.m8345(r6, drawable, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }

    public Drawable mutate() {
        if (!this.f7339 && super.mutate() == this) {
            this.f7341.m8342();
            this.f7339 = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public If m8337() {
        return new If(this.f7341, this, (Resources) null);
    }

    /* renamed from: o.ɪ$If */
    static class If extends C3256CoN.C0092 {

        /* renamed from: ı  reason: contains not printable characters */
        C1286<Integer> f7342;

        /* renamed from: ι  reason: contains not printable characters */
        C0782<Long> f7343;

        /* renamed from: І  reason: contains not printable characters */
        private static long m8338(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        If(If ifR, C1324 r2, Resources resources) {
            super(ifR, r2, resources);
            if (ifR != null) {
                this.f7343 = ifR.f7343;
                this.f7342 = ifR.f7342;
                return;
            }
            this.f7343 = new C0782<>();
            this.f7342 = new C1286<>();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m8342() {
            this.f7343 = this.f7343.clone();
            this.f7342 = this.f7342.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public int m8340(int i, int i2, Drawable drawable, boolean z) {
            int r12 = super.m9020(drawable);
            long r0 = m8338(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) r12;
            this.f7343.m6118(r0, Long.valueOf(j2 | j));
            if (z) {
                this.f7343.m6118(m8338(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return r12;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public int m8345(int[] iArr, Drawable drawable, int i) {
            int r1 = super.m1340(iArr, drawable);
            this.f7342.m8219(r1, Integer.valueOf(i));
            return r1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public int m8343(int[] iArr) {
            int r1 = super.m1338(iArr);
            if (r1 >= 0) {
                return r1;
            }
            return super.m1338(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public int m8341(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f7342.m8209(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public int m8339(int i, int i2) {
            return (int) this.f7343.m6119(m8338(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public boolean m8346(int i, int i2) {
            return (this.f7343.m6119(m8338(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public boolean m8344(int i, int i2) {
            return (this.f7343.m6119(m8338(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C1324(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1324(this, resources);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m8335(C1536.C1537 r2) {
        super.m1334(r2);
        if (r2 instanceof If) {
            this.f7341 = (If) r2;
        }
    }

    /* renamed from: o.ɪ$ı  reason: contains not printable characters */
    static class C1325 implements TimeInterpolator {

        /* renamed from: ı  reason: contains not printable characters */
        private int f7345;

        /* renamed from: Ι  reason: contains not printable characters */
        private int f7346;

        /* renamed from: ι  reason: contains not printable characters */
        private int[] f7347;

        C1325(AnimationDrawable animationDrawable, boolean z) {
            m8354(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public int m8354(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f7346 = numberOfFrames;
            int[] iArr = this.f7347;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f7347 = new int[numberOfFrames];
            }
            int[] iArr2 = this.f7347;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f7345 = i;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public int m8353() {
            return this.f7345;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f7345)) + 0.5f);
            int i2 = this.f7346;
            int[] iArr = this.f7347;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f7345) : 0.0f);
        }
    }
}
