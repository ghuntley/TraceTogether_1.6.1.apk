package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: o.ɾ  reason: contains not printable characters */
class C1536 extends Drawable implements Drawable.Callback, Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private Drawable f8154;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Runnable f8155;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Drawable f8156;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Cif f8157;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Rect f8158;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f8159;

    /* renamed from: ɾ  reason: contains not printable characters */
    private long f8160;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f8161 = 255;

    /* renamed from: ι  reason: contains not printable characters */
    private C1537 f8162;

    /* renamed from: І  reason: contains not printable characters */
    private int f8163 = -1;

    /* renamed from: і  reason: contains not printable characters */
    private boolean f8164;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f8165 = -1;

    /* renamed from: ӏ  reason: contains not printable characters */
    private long f8166;

    C1536() {
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f8154;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f8156;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f8162.getChangingConfigurations();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m9001() {
        return isAutoMirrored() && C1266.m8143(this) == 1;
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect r0 = this.f8162.m9027();
        if (r0 != null) {
            rect.set(r0);
            z = (r0.right | ((r0.left | r0.top) | r0.bottom)) != 0;
        } else {
            Drawable drawable = this.f8154;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m9001()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f8154;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
        if (!this.f8159 || this.f8161 != i) {
            this.f8159 = true;
            this.f8161 = i;
            Drawable drawable = this.f8154;
            if (drawable == null) {
                return;
            }
            if (this.f8160 == 0) {
                drawable.setAlpha(i);
            } else {
                m9003(false);
            }
        }
    }

    public int getAlpha() {
        return this.f8161;
    }

    public void setDither(boolean z) {
        if (this.f8162.f8174 != z) {
            C1537 r0 = this.f8162;
            r0.f8174 = z;
            Drawable drawable = this.f8154;
            if (drawable != null) {
                drawable.setDither(r0.f8174);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C1537 r0 = this.f8162;
        r0.f8191 = true;
        if (r0.f8198 != colorFilter) {
            this.f8162.f8198 = colorFilter;
            Drawable drawable = this.f8154;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C1537 r0 = this.f8162;
        r0.f8183 = true;
        if (r0.f8194 != colorStateList) {
            this.f8162.f8194 = colorStateList;
            C1266.m8152(this.f8154, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1537 r0 = this.f8162;
        r0.f8199 = true;
        if (r0.f8196 != mode) {
            this.f8162.f8196 = mode;
            C1266.m8153(this.f8154, mode);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8156;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f8154;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean isStateful() {
        return this.f8162.m9023();
    }

    public void setAutoMirrored(boolean z) {
        if (this.f8162.f8193 != z) {
            C1537 r0 = this.f8162;
            r0.f8193 = z;
            Drawable drawable = this.f8154;
            if (drawable != null) {
                C1266.m8154(drawable, r0.f8193);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f8162.f8193;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f8156;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f8156 = null;
            this.f8165 = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f8154;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f8159) {
                this.f8154.setAlpha(this.f8161);
            }
        }
        if (this.f8166 != 0) {
            this.f8166 = 0;
            z = true;
        }
        if (this.f8160 != 0) {
            this.f8160 = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f8154;
        if (drawable != null) {
            C1266.m8150(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f8158;
        if (rect == null) {
            this.f8158 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f8154;
        if (drawable != null) {
            C1266.m8151(drawable, i, i2, i3, i4);
        }
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f8158;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8156;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f8154;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f8156;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f8154;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f8162.m9022(i, m9002());
    }

    public int getIntrinsicWidth() {
        if (this.f8162.m9030()) {
            return this.f8162.m9024();
        }
        Drawable drawable = this.f8154;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.f8162.m9030()) {
            return this.f8162.m9032();
        }
        Drawable drawable = this.f8154;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.f8162.m9030()) {
            return this.f8162.m9031();
        }
        Drawable drawable = this.f8154;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.f8162.m9030()) {
            return this.f8162.m9013();
        }
        Drawable drawable = this.f8154;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        C1537 r0 = this.f8162;
        if (r0 != null) {
            r0.m9025();
        }
        if (drawable == this.f8154 && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f8154 && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f8154 && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f8156;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f8154;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public int getOpacity() {
        Drawable drawable = this.f8154;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f8162.m9018();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public int m9002() {
        return this.f8163;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m9005(int i) {
        if (i == this.f8163) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f8162.f8179 > 0) {
            Drawable drawable = this.f8156;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f8154;
            if (drawable2 != null) {
                this.f8156 = drawable2;
                this.f8165 = this.f8163;
                this.f8166 = ((long) this.f8162.f8179) + uptimeMillis;
            } else {
                this.f8156 = null;
                this.f8165 = -1;
                this.f8166 = 0;
            }
        } else {
            Drawable drawable3 = this.f8154;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i < 0 || i >= this.f8162.f8184) {
            this.f8154 = null;
            this.f8163 = -1;
        } else {
            Drawable r0 = this.f8162.m9015(i);
            this.f8154 = r0;
            this.f8163 = i;
            if (r0 != null) {
                if (this.f8162.f8186 > 0) {
                    this.f8160 = uptimeMillis + ((long) this.f8162.f8186);
                }
                m9000(r0);
            }
        }
        if (!(this.f8160 == 0 && this.f8166 == 0)) {
            Runnable runnable = this.f8155;
            if (runnable == null) {
                this.f8155 = this;
            } else {
                unscheduleSelf(runnable);
            }
            m9003(true);
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m9000(Drawable drawable) {
        if (this.f8157 == null) {
            this.f8157 = new Cif();
        }
        Cif ifVar = this.f8157;
        ifVar.f8167 = drawable.getCallback();
        drawable.setCallback(ifVar);
        try {
            if (this.f8162.f8186 <= 0 && this.f8159) {
                drawable.setAlpha(this.f8161);
            }
            if (this.f8162.f8191) {
                drawable.setColorFilter(this.f8162.f8198);
            } else {
                if (this.f8162.f8183) {
                    C1266.m8152(drawable, this.f8162.f8194);
                }
                if (this.f8162.f8199) {
                    C1266.m8153(drawable, this.f8162.f8196);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f8162.f8174);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f8162.f8193);
            }
            Rect rect = this.f8158;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            Cif ifVar2 = this.f8157;
            Drawable.Callback callback = ifVar2.f8167;
            ifVar2.f8167 = null;
            drawable.setCallback(callback);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m9003(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f8159 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f8154
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f8160
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f8161
            r3.setAlpha(r9)
            goto L_0x0038
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            o.ɾ$ɩ r9 = r13.f8162
            int r9 = r9.f8186
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r13.f8154
            int r3 = 255 - r3
            int r10 = r13.f8161
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f8160 = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f8156
            if (r9 == 0) goto L_0x0068
            long r10 = r13.f8166
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x006a
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0053
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f8156 = r0
            r0 = -1
            r13.f8165 = r0
            goto L_0x0068
        L_0x0053:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            o.ɾ$ɩ r4 = r13.f8162
            int r4 = r4.f8179
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r13.f8156
            int r5 = r13.f8161
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x006b
        L_0x0068:
            r13.f8166 = r7
        L_0x006a:
            r0 = r3
        L_0x006b:
            if (r14 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0077
            java.lang.Runnable r14 = r13.f8155
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1536.m9003(boolean):void");
    }

    public Drawable getCurrent() {
        return this.f8154;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9004(Resources resources) {
        this.f8162.m9011(resources);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f8162.m9029(theme);
    }

    public boolean canApplyTheme() {
        return this.f8162.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f8162.m9033()) {
            return null;
        }
        this.f8162.f8201 = getChangingConfigurations();
        return this.f8162;
    }

    public Drawable mutate() {
        if (!this.f8164 && super.mutate() == this) {
            C1537 r0 = m9007();
            r0.m9021();
            m9006(r0);
            this.f8164 = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public C1537 m9007() {
        return this.f8162;
    }

    /* renamed from: o.ɾ$ɩ  reason: contains not printable characters */
    static abstract class C1537 extends Drawable.ConstantState {

        /* renamed from: ŀ  reason: contains not printable characters */
        int f8168;

        /* renamed from: ł  reason: contains not printable characters */
        int f8169;

        /* renamed from: ſ  reason: contains not printable characters */
        int f8170;

        /* renamed from: Ɩ  reason: contains not printable characters */
        SparseArray<Drawable.ConstantState> f8171;

        /* renamed from: Ɨ  reason: contains not printable characters */
        boolean f8172;

        /* renamed from: ƚ  reason: contains not printable characters */
        boolean f8173;

        /* renamed from: ǀ  reason: contains not printable characters */
        boolean f8174;

        /* renamed from: ǃ  reason: contains not printable characters */
        final C1536 f8175;

        /* renamed from: ȷ  reason: contains not printable characters */
        boolean f8176;

        /* renamed from: ɍ  reason: contains not printable characters */
        boolean f8177;

        /* renamed from: ɔ  reason: contains not printable characters */
        boolean f8178;

        /* renamed from: ɟ  reason: contains not printable characters */
        int f8179;

        /* renamed from: ɨ  reason: contains not printable characters */
        boolean f8180;

        /* renamed from: ɩ  reason: contains not printable characters */
        Resources f8181;

        /* renamed from: ɪ  reason: contains not printable characters */
        boolean f8182;

        /* renamed from: ɭ  reason: contains not printable characters */
        boolean f8183;

        /* renamed from: ɹ  reason: contains not printable characters */
        int f8184;

        /* renamed from: ɺ  reason: contains not printable characters */
        int f8185;

        /* renamed from: ɼ  reason: contains not printable characters */
        int f8186;

        /* renamed from: ɾ  reason: contains not printable characters */
        Rect f8187;

        /* renamed from: ɿ  reason: contains not printable characters */
        boolean f8188;

        /* renamed from: ʅ  reason: contains not printable characters */
        boolean f8189;

        /* renamed from: ʟ  reason: contains not printable characters */
        int f8190;

        /* renamed from: ͻ  reason: contains not printable characters */
        boolean f8191;

        /* renamed from: Ι  reason: contains not printable characters */
        int f8192 = 160;

        /* renamed from: ϲ  reason: contains not printable characters */
        boolean f8193;

        /* renamed from: ϳ  reason: contains not printable characters */
        ColorStateList f8194;

        /* renamed from: І  reason: contains not printable characters */
        int f8195;

        /* renamed from: Ј  reason: contains not printable characters */
        PorterDuff.Mode f8196;

        /* renamed from: г  reason: contains not printable characters */
        int f8197;

        /* renamed from: с  reason: contains not printable characters */
        ColorFilter f8198;

        /* renamed from: х  reason: contains not printable characters */
        boolean f8199;

        /* renamed from: і  reason: contains not printable characters */
        Drawable[] f8200;

        /* renamed from: Ӏ  reason: contains not printable characters */
        int f8201;

        /* renamed from: ӏ  reason: contains not printable characters */
        boolean f8202;

        C1537(C1537 r3, C1536 r4, Resources resources) {
            Resources resources2;
            this.f8176 = false;
            this.f8182 = false;
            this.f8174 = true;
            this.f8186 = 0;
            this.f8179 = 0;
            this.f8175 = r4;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = r3 != null ? r3.f8181 : null;
            }
            this.f8181 = resources2;
            this.f8192 = C1536.m8999(resources, r3 != null ? r3.f8192 : 0);
            if (r3 != null) {
                this.f8201 = r3.f8201;
                this.f8195 = r3.f8195;
                this.f8172 = true;
                this.f8189 = true;
                this.f8176 = r3.f8176;
                this.f8182 = r3.f8182;
                this.f8174 = r3.f8174;
                this.f8178 = r3.f8178;
                this.f8185 = r3.f8185;
                this.f8186 = r3.f8186;
                this.f8179 = r3.f8179;
                this.f8193 = r3.f8193;
                this.f8198 = r3.f8198;
                this.f8191 = r3.f8191;
                this.f8194 = r3.f8194;
                this.f8196 = r3.f8196;
                this.f8183 = r3.f8183;
                this.f8199 = r3.f8199;
                if (r3.f8192 == this.f8192) {
                    if (r3.f8202) {
                        this.f8187 = new Rect(r3.f8187);
                        this.f8202 = true;
                    }
                    if (r3.f8180) {
                        this.f8190 = r3.f8190;
                        this.f8197 = r3.f8197;
                        this.f8169 = r3.f8169;
                        this.f8168 = r3.f8168;
                        this.f8180 = true;
                    }
                }
                if (r3.f8188) {
                    this.f8170 = r3.f8170;
                    this.f8188 = true;
                }
                if (r3.f8177) {
                    this.f8173 = r3.f8173;
                    this.f8177 = true;
                }
                Drawable[] drawableArr = r3.f8200;
                this.f8200 = new Drawable[drawableArr.length];
                this.f8184 = r3.f8184;
                SparseArray<Drawable.ConstantState> sparseArray = r3.f8171;
                if (sparseArray != null) {
                    this.f8171 = sparseArray.clone();
                } else {
                    this.f8171 = new SparseArray<>(this.f8184);
                }
                int i = this.f8184;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f8171.put(i2, constantState);
                        } else {
                            this.f8200[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f8200 = new Drawable[10];
            this.f8184 = 0;
        }

        public int getChangingConfigurations() {
            return this.f8201 | this.f8195;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m9020(Drawable drawable) {
            int i = this.f8184;
            if (i >= this.f8200.length) {
                m9016(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f8175);
            this.f8200[i] = drawable;
            this.f8184++;
            this.f8195 = drawable.getChangingConfigurations() | this.f8195;
            m9025();
            this.f8187 = null;
            this.f8202 = false;
            this.f8180 = false;
            this.f8172 = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public void m9025() {
            this.f8188 = false;
            this.f8177 = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final int m9014() {
            return this.f8200.length;
        }

        /* renamed from: ɾ  reason: contains not printable characters */
        private void m9009() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f8171;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f8200[this.f8171.keyAt(i)] = m9008(this.f8171.valueAt(i).newDrawable(this.f8181));
                }
                this.f8171 = null;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private Drawable m9008(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f8185);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f8175);
            return mutate;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m9010() {
            return this.f8184;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Drawable m9015(int i) {
            int indexOfKey;
            Drawable drawable = this.f8200[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f8171;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable r2 = m9008(this.f8171.valueAt(indexOfKey).newDrawable(this.f8181));
            this.f8200[i] = r2;
            this.f8171.removeAt(indexOfKey);
            if (this.f8171.size() == 0) {
                this.f8171 = null;
            }
            return r2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final boolean m9022(int i, int i2) {
            int i3 = this.f8184;
            Drawable[] drawableArr = this.f8200;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f8185 = i;
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m9011(Resources resources) {
            if (resources != null) {
                this.f8181 = resources;
                int r2 = C1536.m8999(resources, this.f8192);
                int i = this.f8192;
                this.f8192 = r2;
                if (i != r2) {
                    this.f8180 = false;
                    this.f8202 = false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final void m9029(Resources.Theme theme) {
            if (theme != null) {
                m9009();
                int i = this.f8184;
                Drawable[] drawableArr = this.f8200;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f8195 |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m9011(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int i = this.f8184;
            Drawable[] drawableArr = this.f8200;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f8171.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m9021() {
            int i = this.f8184;
            Drawable[] drawableArr = this.f8200;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f8178 = true;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m9012(boolean z) {
            this.f8176 = z;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final Rect m9027() {
            if (this.f8176) {
                return null;
            }
            if (this.f8187 != null || this.f8202) {
                return this.f8187;
            }
            m9009();
            Rect rect = new Rect();
            int i = this.f8184;
            Drawable[] drawableArr = this.f8200;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if (rect.left > rect2.left) {
                        rect2.left = rect.left;
                    }
                    if (rect.top > rect2.top) {
                        rect2.top = rect.top;
                    }
                    if (rect.right > rect2.right) {
                        rect2.right = rect.right;
                    }
                    if (rect.bottom > rect2.bottom) {
                        rect2.bottom = rect.bottom;
                    }
                }
            }
            this.f8202 = true;
            this.f8187 = rect2;
            return rect2;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m9017(boolean z) {
            this.f8182 = z;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m9030() {
            return this.f8182;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final int m9024() {
            if (!this.f8180) {
                m9019();
            }
            return this.f8190;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final int m9032() {
            if (!this.f8180) {
                m9019();
            }
            return this.f8197;
        }

        /* renamed from: і  reason: contains not printable characters */
        public final int m9031() {
            if (!this.f8180) {
                m9019();
            }
            return this.f8169;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final int m9013() {
            if (!this.f8180) {
                m9019();
            }
            return this.f8168;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ɨ  reason: contains not printable characters */
        public void m9019() {
            this.f8180 = true;
            m9009();
            int i = this.f8184;
            Drawable[] drawableArr = this.f8200;
            this.f8197 = -1;
            this.f8190 = -1;
            this.f8168 = 0;
            this.f8169 = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f8190) {
                    this.f8190 = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f8197) {
                    this.f8197 = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f8169) {
                    this.f8169 = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f8168) {
                    this.f8168 = minimumHeight;
                }
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m9026(int i) {
            this.f8186 = i;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m9028(int i) {
            this.f8179 = i;
        }

        /* renamed from: ȷ  reason: contains not printable characters */
        public final int m9018() {
            if (this.f8188) {
                return this.f8170;
            }
            m9009();
            int i = this.f8184;
            Drawable[] drawableArr = this.f8200;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f8170 = opacity;
            this.f8188 = true;
            return opacity;
        }

        /* renamed from: ɪ  reason: contains not printable characters */
        public final boolean m9023() {
            if (this.f8177) {
                return this.f8173;
            }
            m9009();
            int i = this.f8184;
            Drawable[] drawableArr = this.f8200;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f8173 = z;
            this.f8177 = true;
            return z;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m9016(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f8200, 0, drawableArr, 0, i);
            this.f8200 = drawableArr;
        }

        /* renamed from: ӏ  reason: contains not printable characters */
        public synchronized boolean m9033() {
            if (this.f8172) {
                return this.f8189;
            }
            m9009();
            this.f8172 = true;
            int i = this.f8184;
            Drawable[] drawableArr = this.f8200;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f8189 = false;
                    return false;
                }
            }
            this.f8189 = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m9006(C1537 r2) {
        this.f8162 = r2;
        int i = this.f8163;
        if (i >= 0) {
            this.f8154 = r2.m9015(i);
            Drawable drawable = this.f8154;
            if (drawable != null) {
                m9000(drawable);
            }
        }
        this.f8165 = -1;
        this.f8156 = null;
    }

    /* renamed from: o.ɾ$if  reason: invalid class name */
    static class Cif implements Drawable.Callback {

        /* renamed from: Ι  reason: contains not printable characters */
        Drawable.Callback f8167;

        public final void invalidateDrawable(Drawable drawable) {
        }

        Cif() {
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f8167;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f8167;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m8999(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    public void run() {
        m9003(true);
        invalidateSelf();
    }
}
