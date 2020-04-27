package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import o.C1536;
import o.C3335coN;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* renamed from: o.CoN  reason: case insensitive filesystem */
class C3256CoN extends C1536 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f1248;

    /* renamed from: ι  reason: contains not printable characters */
    private C0092 f1249;

    public boolean isStateful() {
        return true;
    }

    C3256CoN() {
        this((C0092) null, (Resources) null);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int r3 = this.f1249.m1338(iArr);
        if (r3 < 0) {
            r3 = this.f1249.m1338(StateSet.WILD_CARD);
        }
        return m9005(r3) || onStateChange;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m1332(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        int[] iArr = C3335coN.Cif.f1977;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(typedArray.getBoolean(C3335coN.Cif.f1990, true), true);
        m1330(typedArray);
        m9004(resources);
        typedArray.recycle();
        m1331(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m1330(TypedArray typedArray) {
        C0092 r0 = this.f1249;
        if (Build.VERSION.SDK_INT >= 21) {
            r0.f8201 |= typedArray.getChangingConfigurations();
        }
        r0.f8176 = typedArray.getBoolean(C3335coN.Cif.f1996, r0.f8176);
        r0.f8182 = typedArray.getBoolean(C3335coN.Cif.f1992, r0.f8182);
        r0.f8186 = typedArray.getInt(C3335coN.Cif.f1991, r0.f8186);
        r0.f8179 = typedArray.getInt(C3335coN.Cif.f1981, r0.f8179);
        r0.f8174 = typedArray.getBoolean(C3335coN.Cif.f1978, r0.f8174);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m1331(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArray;
        int next;
        C0092 r0 = this.f1249;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    int[] iArr = C3335coN.Cif.f1982;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    Drawable drawable = null;
                    int resourceId = typedArray.getResourceId(C3335coN.Cif.f1979, -1);
                    if (resourceId > 0) {
                        drawable = C0930.m6776().m6782(context, resourceId);
                    }
                    typedArray.recycle();
                    int[] r3 = m1333(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(xmlPullParser.getPositionDescription());
                            sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            throw new XmlPullParserException(sb.toString());
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    r0.m1340(r3, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public int[] m1333(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f1248 && super.mutate() == this) {
            this.f1249.m1339();
            this.f1248 = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public C0092 m1335() {
        return new C0092(this.f1249, this, (Resources) null);
    }

    /* renamed from: o.CoN$ɩ  reason: contains not printable characters */
    static class C0092 extends C1536.C1537 {

        /* renamed from: ј  reason: contains not printable characters */
        int[][] f1250;

        C0092(C0092 r1, C3256CoN coN, Resources resources) {
            super(r1, coN, resources);
            if (r1 != null) {
                this.f1250 = r1.f1250;
            } else {
                this.f1250 = new int[m9014()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public void m1339() {
            int[][] iArr = this.f1250;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f1250;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f1250 = iArr2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public int m1340(int[] iArr, Drawable drawable) {
            int r3 = m9020(drawable);
            this.f1250[r3] = iArr;
            return r3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public int m1338(int[] iArr) {
            int[][] iArr2 = this.f1250;
            int r1 = m9010();
            for (int i = 0; i < r1; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C3256CoN(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3256CoN(this, resources);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m1337(int i, int i2) {
            super.m9016(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f1250, 0, iArr, 0, i);
            this.f1250 = iArr;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m1334(C1536.C1537 r2) {
        super.m9006(r2);
        if (r2 instanceof C0092) {
            this.f1249 = (C0092) r2;
        }
    }

    C3256CoN(C0092 r2, Resources resources) {
        m1334((C1536.C1537) new C0092(r2, this, resources));
        onStateChange(getState());
    }

    C3256CoN(C0092 r1) {
        if (r1 != null) {
            m1334((C1536.C1537) r1);
        }
    }
}
