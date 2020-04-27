package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ǃӀ  reason: contains not printable characters */
public final class C0930 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0933 f5892 = new C0933();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final PorterDuff.Mode f5893 = PorterDuff.Mode.SRC_IN;

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0930 f5894;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private TypedValue f5895;

    /* renamed from: ǃ  reason: contains not printable characters */
    Cif f5896;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f5897;

    /* renamed from: ι  reason: contains not printable characters */
    private WeakHashMap<Context, C1286<ColorStateList>> f5898;

    /* renamed from: І  reason: contains not printable characters */
    private C0299<String, C0932> f5899;

    /* renamed from: і  reason: contains not printable characters */
    private C1286<String> f5900;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final WeakHashMap<Context, C0782<WeakReference<Drawable.ConstantState>>> f5901 = new WeakHashMap<>(0);

    /* renamed from: o.ǃӀ$if  reason: invalid class name */
    interface Cif {
        /* renamed from: ı  reason: contains not printable characters */
        boolean m6788(Context context, int i, Drawable drawable);

        /* renamed from: ǃ  reason: contains not printable characters */
        ColorStateList m6789(Context context, int i);

        /* renamed from: ǃ  reason: contains not printable characters */
        Drawable m6790(C0930 r1, Context context, int i);

        /* renamed from: ι  reason: contains not printable characters */
        PorterDuff.Mode m6791(int i);

        /* renamed from: ι  reason: contains not printable characters */
        boolean m6792(Context context, int i, Drawable drawable);
    }

    /* renamed from: o.ǃӀ$ǃ  reason: contains not printable characters */
    interface C0932 {
        /* renamed from: ı  reason: contains not printable characters */
        Drawable m6794(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static synchronized C0930 m6776() {
        C0930 r1;
        synchronized (C0930.class) {
            if (f5894 == null) {
                C0930 r12 = new C0930();
                f5894 = r12;
                if (Build.VERSION.SDK_INT < 24) {
                    IF ifR = new IF();
                    if (r12.f5899 == null) {
                        r12.f5899 = new C0299<>();
                    }
                    r12.f5899.put("vector", ifR);
                    C3634If ifR2 = new C3634If();
                    if (r12.f5899 == null) {
                        r12.f5899 = new C0299<>();
                    }
                    r12.f5899.put("animated-vector", ifR2);
                    C0931 r3 = new C0931();
                    if (r12.f5899 == null) {
                        r12.f5899 = new C0299<>();
                    }
                    r12.f5899.put("animated-selector", r3);
                }
            }
            r1 = f5894;
        }
        return r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized void m6784(Cif ifVar) {
        this.f5896 = ifVar;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized Drawable m6782(Context context, int i) {
        return m6783(context, i, false);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized void m6781(Context context) {
        C0782 r2 = this.f5901.get(context);
        if (r2 != null) {
            r2.m6117();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private Drawable m6773(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList r0 = m6785(context, i);
        PorterDuff.Mode mode = null;
        if (r0 != null) {
            if (C2674.m14212(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r6 = C1266.m8158(drawable);
            C1266.m8152(r6, r0);
            Cif ifVar = this.f5896;
            if (ifVar != null) {
                mode = ifVar.m6791(i);
            }
            if (mode == null) {
                return r6;
            }
            C1266.m8153(r6, mode);
            return r6;
        }
        Cif ifVar2 = this.f5896;
        if (ifVar2 != null && ifVar2.m6788(context, i, drawable)) {
            return drawable;
        }
        Cif ifVar3 = this.f5896;
        if ((ifVar3 != null && ifVar3.m6792(context, i, drawable)) || !z) {
            return drawable;
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private Drawable m6774(Context context, int i) {
        int next;
        C0299<String, C0932> r0 = this.f5899;
        if (r0 == null || r0.isEmpty()) {
            return null;
        }
        C1286<String> r02 = this.f5900;
        if (r02 != null) {
            String r03 = r02.m8216(i);
            if ("appcompat_skip_skip".equals(r03) || (r03 != null && this.f5899.get(r03) == null)) {
                return null;
            }
        } else {
            this.f5900 = new C1286<>();
        }
        if (this.f5895 == null) {
            this.f5895 = new TypedValue();
        }
        TypedValue typedValue = this.f5895;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable r6 = m6775(context, j);
        if (r6 != null) {
            return r6;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f5900.m8214(i, name);
                    C0932 r3 = this.f5899.get(name);
                    if (r3 != null) {
                        r6 = r3.m6794(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (r6 != null) {
                        r6.setChangingConfigurations(typedValue.changingConfigurations);
                        m6777(context, j, r6);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (r6 == null) {
            this.f5900.m8214(i, "appcompat_skip_skip");
        }
        return r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        return null;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m6775(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.Ƭ<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f5901     // Catch:{ all -> 0x0045 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0045 }
            o.Ƭ r0 = (o.C0782) r0     // Catch:{ all -> 0x0045 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.m6119(r5, r1)     // Catch:{ all -> 0x0045 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0045 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0045 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0045 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f5202     // Catch:{ all -> 0x0045 }
            int r2 = r0.f5201     // Catch:{ all -> 0x0045 }
            int r4 = o.C0647.m5432(r4, r2, r5)     // Catch:{ all -> 0x0045 }
            if (r4 < 0) goto L_0x0043
            java.lang.Object[] r5 = r0.f5200     // Catch:{ all -> 0x0045 }
            r5 = r5[r4]     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = o.C0782.f5198     // Catch:{ all -> 0x0045 }
            if (r5 == r6) goto L_0x0043
            java.lang.Object[] r5 = r0.f5200     // Catch:{ all -> 0x0045 }
            java.lang.Object r6 = o.C0782.f5198     // Catch:{ all -> 0x0045 }
            r5[r4] = r6     // Catch:{ all -> 0x0045 }
            r4 = 1
            r0.f5199 = r4     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r3)
            return r1
        L_0x0045:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0930.m6775(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private synchronized boolean m6777(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0782 r0 = this.f5901.get(context);
        if (r0 == null) {
            r0 = new C0782();
            this.f5901.put(context, r0);
        }
        r0.m6116(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized Drawable m6780(Context context, C2123 r3, int i) {
        Drawable r0 = m6774(context, i);
        if (r0 == null) {
            r0 = r3.m11294(i);
        }
        if (r0 == null) {
            return null;
        }
        return m6773(context, i, false, r0);
    }

    /* renamed from: o.ǃӀ$ɩ  reason: contains not printable characters */
    static class C0933 extends C0783<Integer, PorterDuffColorFilter> {
        public C0933() {
            super(6);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m6779(Drawable drawable, C1288 r4, int[] iArr) {
        if (!C2674.m14212(drawable) || drawable.mutate() == drawable) {
            if (r4.f7236 || r4.f7235) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = r4.f7236 ? r4.f7234 : null;
                PorterDuff.Mode mode = r4.f7235 ? r4.f7233 : f5893;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = m6778(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m6778(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0930.class) {
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) f5892.m6126(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                f5892.m6123(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: o.ǃӀ$IF */
    static class IF implements C0932 {
        IF() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Drawable m6786(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2677.m14242(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: o.ǃӀ$If  reason: case insensitive filesystem */
    static class C3634If implements C0932 {
        C3634If() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final Drawable m6787(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2576.m13694(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: o.ǃӀ$ı  reason: contains not printable characters */
    static class C0931 implements C0932 {
        C0931() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public Drawable m6793(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1324.m8332(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable m6783(android.content.Context r6, int r7, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f5897     // Catch:{ all -> 0x008b }
            r1 = 1
            if (r0 != 0) goto L_0x0037
            r5.f5897 = r1     // Catch:{ all -> 0x008b }
            r0 = 2131230812(0x7f08005c, float:1.8077687E38)
            android.graphics.drawable.Drawable r0 = r5.m6782(r6, r0)     // Catch:{ all -> 0x008b }
            r2 = 0
            if (r0 == 0) goto L_0x002d
            boolean r3 = r0 instanceof o.C2677     // Catch:{ all -> 0x008b }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x008b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x008b }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r5.f5897 = r2     // Catch:{ all -> 0x008b }
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            java.lang.String r7 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r6.<init>(r7)     // Catch:{ all -> 0x008b }
            throw r6     // Catch:{ all -> 0x008b }
        L_0x0037:
            android.graphics.drawable.Drawable r0 = r5.m6774((android.content.Context) r6, (int) r7)     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0078
            android.util.TypedValue r0 = r5.f5895     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0048
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x008b }
            r0.<init>()     // Catch:{ all -> 0x008b }
            r5.f5895 = r0     // Catch:{ all -> 0x008b }
        L_0x0048:
            android.util.TypedValue r0 = r5.f5895     // Catch:{ all -> 0x008b }
            android.content.res.Resources r2 = r6.getResources()     // Catch:{ all -> 0x008b }
            r2.getValue(r7, r0, r1)     // Catch:{ all -> 0x008b }
            int r1 = r0.assetCookie     // Catch:{ all -> 0x008b }
            long r1 = (long) r1     // Catch:{ all -> 0x008b }
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data     // Catch:{ all -> 0x008b }
            long r3 = (long) r3     // Catch:{ all -> 0x008b }
            long r1 = r1 | r3
            android.graphics.drawable.Drawable r3 = r5.m6775((android.content.Context) r6, (long) r1)     // Catch:{ all -> 0x008b }
            if (r3 != 0) goto L_0x0077
            o.ǃӀ$if r3 = r5.f5896     // Catch:{ all -> 0x008b }
            if (r3 != 0) goto L_0x0067
            r3 = 0
            goto L_0x006d
        L_0x0067:
            o.ǃӀ$if r3 = r5.f5896     // Catch:{ all -> 0x008b }
            android.graphics.drawable.Drawable r3 = r3.m6790(r5, r6, r7)     // Catch:{ all -> 0x008b }
        L_0x006d:
            if (r3 == 0) goto L_0x0077
            int r0 = r0.changingConfigurations     // Catch:{ all -> 0x008b }
            r3.setChangingConfigurations(r0)     // Catch:{ all -> 0x008b }
            r5.m6777((android.content.Context) r6, (long) r1, (android.graphics.drawable.Drawable) r3)     // Catch:{ all -> 0x008b }
        L_0x0077:
            r0 = r3
        L_0x0078:
            if (r0 != 0) goto L_0x007e
            android.graphics.drawable.Drawable r0 = o.C0651.m5458(r6, r7)     // Catch:{ all -> 0x008b }
        L_0x007e:
            if (r0 == 0) goto L_0x0084
            android.graphics.drawable.Drawable r0 = r5.m6773(r6, r7, r8, r0)     // Catch:{ all -> 0x008b }
        L_0x0084:
            if (r0 == 0) goto L_0x0089
            o.C2674.m14211(r0)     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r5)
            return r0
        L_0x008b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0930.m6783(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r3.f5898.get(r4);
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList m6785(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.ɩΙ<android.content.res.ColorStateList>> r0 = r3.f5898     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.util.WeakHashMap<android.content.Context, o.ɩΙ<android.content.res.ColorStateList>> r0 = r3.f5898     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            o.ɩΙ r0 = (o.C1286) r0     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.m8216((int) r5)     // Catch:{ all -> 0x004d }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x004d }
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x004b
            o.ǃӀ$if r0 = r3.f5896     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0020
        L_0x001e:
            r0 = r1
            goto L_0x0027
        L_0x0020:
            o.ǃӀ$if r0 = r3.f5896     // Catch:{ all -> 0x004d }
            android.content.res.ColorStateList r1 = r0.m6789(r4, r5)     // Catch:{ all -> 0x004d }
            goto L_0x001e
        L_0x0027:
            if (r0 == 0) goto L_0x004b
            java.util.WeakHashMap<android.content.Context, o.ɩΙ<android.content.res.ColorStateList>> r1 = r3.f5898     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0034
            java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            r3.f5898 = r1     // Catch:{ all -> 0x004d }
        L_0x0034:
            java.util.WeakHashMap<android.content.Context, o.ɩΙ<android.content.res.ColorStateList>> r1 = r3.f5898     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x004d }
            o.ɩΙ r1 = (o.C1286) r1     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0048
            o.ɩΙ r1 = new o.ɩΙ     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            java.util.WeakHashMap<android.content.Context, o.ɩΙ<android.content.res.ColorStateList>> r2 = r3.f5898     // Catch:{ all -> 0x004d }
            r2.put(r4, r1)     // Catch:{ all -> 0x004d }
        L_0x0048:
            r1.m8214(r5, r0)     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r3)
            return r0
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0930.m6785(android.content.Context, int):android.content.res.ColorStateList");
    }
}
