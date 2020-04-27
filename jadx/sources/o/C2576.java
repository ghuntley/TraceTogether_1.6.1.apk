package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.іȷ  reason: contains not printable characters */
public class C2576 extends C2584 implements C2474 {

    /* renamed from: ı  reason: contains not printable characters */
    ArrayList<Object> f11710;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Animator.AnimatorListener f11711;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Drawable.Callback f11712;

    /* renamed from: Ι  reason: contains not printable characters */
    private If f11713;

    /* renamed from: ι  reason: contains not printable characters */
    private Context f11714;

    /* renamed from: і  reason: contains not printable characters */
    private ArgbEvaluator f11715;

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

    C2576() {
        this((Context) null, (If) null, (Resources) null);
    }

    private C2576(Context context) {
        this(context, (If) null, (Resources) null);
    }

    private C2576(Context context, If ifR, Resources resources) {
        this.f11715 = null;
        this.f11711 = null;
        this.f11710 = null;
        this.f11712 = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                C2576.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C2576.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C2576.this.unscheduleSelf(runnable);
            }
        };
        this.f11714 = context;
        if (ifR != null) {
            this.f11713 = ifR;
        } else {
            this.f11713 = new If(context, ifR, this.f11712, resources);
        }
    }

    public Drawable mutate() {
        if (this.f11738 != null) {
            this.f11738.mutate();
        }
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2576 m13694(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2576 r0 = new C2576(context);
        r0.inflate(resources, xmlPullParser, attributeSet, theme);
        return r0;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f11738 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C2577(this.f11738.getConstantState());
    }

    public int getChangingConfigurations() {
        if (this.f11738 != null) {
            return this.f11738.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f11713.f11720;
    }

    public void draw(Canvas canvas) {
        if (this.f11738 != null) {
            this.f11738.draw(canvas);
            return;
        }
        this.f11713.f11721.draw(canvas);
        if (this.f11713.f11718.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f11738 != null) {
            this.f11738.setBounds(rect);
        } else {
            this.f11713.f11721.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f11738 != null) {
            return this.f11738.setState(iArr);
        }
        return this.f11713.f11721.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f11738 != null) {
            return this.f11738.setLevel(i);
        }
        return this.f11713.f11721.setLevel(i);
    }

    public int getAlpha() {
        if (this.f11738 != null) {
            return C1266.m8156(this.f11738);
        }
        return this.f11713.f11721.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.f11738 != null) {
            this.f11738.setAlpha(i);
        } else {
            this.f11713.f11721.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f11738 != null) {
            this.f11738.setColorFilter(colorFilter);
        } else {
            this.f11713.f11721.setColorFilter(colorFilter);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f11738 != null) {
            return C1266.m8147(this.f11738);
        }
        return this.f11713.f11721.getColorFilter();
    }

    public void setTint(int i) {
        if (this.f11738 != null) {
            C1266.m8148(this.f11738, i);
        } else {
            this.f11713.f11721.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f11738 != null) {
            C1266.m8152(this.f11738, colorStateList);
        } else {
            this.f11713.f11721.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f11738 != null) {
            C1266.m8153(this.f11738, mode);
        } else {
            this.f11713.f11721.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f11738 != null) {
            return this.f11738.setVisible(z, z2);
        }
        this.f11713.f11721.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.f11738 != null) {
            return this.f11738.isStateful();
        }
        return this.f11713.f11721.isStateful();
    }

    public int getOpacity() {
        if (this.f11738 != null) {
            return this.f11738.getOpacity();
        }
        return this.f11713.f11721.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.f11738 != null) {
            return this.f11738.getIntrinsicWidth();
        }
        return this.f11713.f11721.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.f11738 != null) {
            return this.f11738.getIntrinsicHeight();
        }
        return this.f11713.f11721.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.f11738 != null) {
            return C1266.m8142(this.f11738);
        }
        return this.f11713.f11721.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.f11738 != null) {
            C1266.m8154(this.f11738, z);
        } else {
            this.f11713.f11721.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        if (this.f11738 != null) {
            C1266.m8146(this.f11738, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    int[] iArr = C2475.f11268;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    int resourceId = typedArray.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C2677 r3 = C2677.m14247(resources, resourceId, theme);
                        r3.m14250(false);
                        r3.setCallback(this.f11712);
                        if (this.f11713.f11721 != null) {
                            this.f11713.f11721.setCallback((Drawable.Callback) null);
                        }
                        this.f11713.f11721 = r3;
                    }
                    typedArray.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C2475.f11277);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f11714;
                        if (context != null) {
                            m13696(string, C2582.m13707(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f11713.m13697();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f11738 != null) {
            C1266.m8145(this.f11738, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.f11738 != null) {
            return C1266.m8155(this.f11738);
        }
        return false;
    }

    /* renamed from: o.іȷ$ǃ  reason: contains not printable characters */
    static class C2577 extends Drawable.ConstantState {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Drawable.ConstantState f11722;

        public C2577(Drawable.ConstantState constantState) {
            this.f11722 = constantState;
        }

        public Drawable newDrawable() {
            C2576 r0 = new C2576();
            r0.f11738 = this.f11722.newDrawable();
            r0.f11738.setCallback(r0.f11712);
            return r0;
        }

        public Drawable newDrawable(Resources resources) {
            C2576 r0 = new C2576();
            r0.f11738 = this.f11722.newDrawable(resources);
            r0.f11738.setCallback(r0.f11712);
            return r0;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2576 r0 = new C2576();
            r0.f11738 = this.f11722.newDrawable(resources, theme);
            r0.f11738.setCallback(r0.f11712);
            return r0;
        }

        public boolean canApplyTheme() {
            return this.f11722.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f11722.getChangingConfigurations();
        }
    }

    /* renamed from: o.іȷ$If */
    static class If extends Drawable.ConstantState {

        /* renamed from: ı  reason: contains not printable characters */
        C0299<Animator, String> f11717;

        /* renamed from: ǃ  reason: contains not printable characters */
        AnimatorSet f11718;

        /* renamed from: ɩ  reason: contains not printable characters */
        ArrayList<Animator> f11719;

        /* renamed from: Ι  reason: contains not printable characters */
        int f11720;

        /* renamed from: ι  reason: contains not printable characters */
        C2677 f11721;

        public If(Context context, If ifR, Drawable.Callback callback, Resources resources) {
            if (ifR != null) {
                this.f11720 = ifR.f11720;
                C2677 r3 = ifR.f11721;
                if (r3 != null) {
                    Drawable.ConstantState constantState = r3.getConstantState();
                    if (resources != null) {
                        this.f11721 = (C2677) constantState.newDrawable(resources);
                    } else {
                        this.f11721 = (C2677) constantState.newDrawable();
                    }
                    this.f11721 = (C2677) this.f11721.mutate();
                    this.f11721.setCallback(callback);
                    this.f11721.setBounds(ifR.f11721.getBounds());
                    this.f11721.m14250(false);
                }
                ArrayList<Animator> arrayList = ifR.f11719;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f11719 = new ArrayList<>(size);
                    this.f11717 = new C0299<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = ifR.f11719.get(i);
                        Animator clone = animator.clone();
                        String str = ifR.f11717.get(animator);
                        clone.setTarget(this.f11721.m14249(str));
                        this.f11719.add(clone);
                        this.f11717.put(clone, str);
                    }
                    m13697();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f11720;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m13697() {
            if (this.f11718 == null) {
                this.f11718 = new AnimatorSet();
            }
            this.f11718.playTogether(this.f11719);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m13695(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m13695(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f11715 == null) {
                    this.f11715 = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f11715);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m13696(String str, Animator animator) {
        animator.setTarget(this.f11713.f11721.m14249(str));
        if (Build.VERSION.SDK_INT < 21) {
            m13695(animator);
        }
        if (this.f11713.f11719 == null) {
            this.f11713.f11719 = new ArrayList<>();
            this.f11713.f11717 = new C0299<>();
        }
        this.f11713.f11719.add(animator);
        this.f11713.f11717.put(animator, str);
    }

    public boolean isRunning() {
        if (this.f11738 != null) {
            return ((AnimatedVectorDrawable) this.f11738).isRunning();
        }
        return this.f11713.f11718.isRunning();
    }

    public void start() {
        if (this.f11738 != null) {
            ((AnimatedVectorDrawable) this.f11738).start();
        } else if (!this.f11713.f11718.isStarted()) {
            this.f11713.f11718.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f11738 != null) {
            ((AnimatedVectorDrawable) this.f11738).stop();
        } else {
            this.f11713.f11718.end();
        }
    }
}
