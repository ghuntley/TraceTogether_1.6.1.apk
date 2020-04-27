package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C0293;
import o.C0501;
import o.C0651;
import o.C1219;
import o.C1266;
import o.C2317;
import o.C2408;
import o.C2409;
import o.C2715;
import o.C2719;
import o.C2745;
import o.C2790;
import o.C2844;
import o.C2850;
import o.C2910;
import o.R;

public class CoordinatorLayout extends ViewGroup implements C2844, C2910 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static ThreadLocal<Map<String, Constructor<C3238If>>> f133 = new ThreadLocal<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String f134;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Class<?>[] f135 = {Context.class, AttributeSet.class};

    /* renamed from: І  reason: contains not printable characters */
    private static Comparator<View> f136;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final C2317.If<Rect> f137 = new C2317.Cif(12);

    /* renamed from: ı  reason: contains not printable characters */
    boolean f138;

    /* renamed from: ŀ  reason: contains not printable characters */
    private View f139;

    /* renamed from: ł  reason: contains not printable characters */
    private boolean f140;

    /* renamed from: ſ  reason: contains not printable characters */
    private boolean f141;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private Drawable f142;

    /* renamed from: ƚ  reason: contains not printable characters */
    private C2850 f143;

    /* renamed from: ȷ  reason: contains not printable characters */
    private Paint f144;

    /* renamed from: ɍ  reason: contains not printable characters */
    private final C2745.IF f145;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final List<View> f146;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0501 f147;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final int[] f148;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final List<View> f149;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final List<View> f150;

    /* renamed from: ɿ  reason: contains not printable characters */
    private int[] f151;

    /* renamed from: ʅ  reason: contains not printable characters */
    private C3239iF f152;

    /* renamed from: ʟ  reason: contains not printable characters */
    private View f153;

    /* renamed from: ι  reason: contains not printable characters */
    ViewGroup.OnHierarchyChangeListener f154;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f155;

    /* renamed from: і  reason: contains not printable characters */
    private final C2790<View> f156;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final int[] f157;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: Ι  reason: contains not printable characters */
        C3238If m154();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ı  reason: contains not printable characters */
    public @interface C0014 {
        /* renamed from: ǃ  reason: contains not printable characters */
        Class<? extends C3238If> m155();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f134 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$Ι r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$Ι
            r0.<init>()
            f136 = r0
            goto L_0x0021
        L_0x001f:
            f136 = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f135 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f133 = r0
            o.ІӀ$if r0 = new o.ІӀ$if
            r1 = 12
            r0.<init>(r1)
            f137 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f150552130968842);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f149 = new ArrayList();
        this.f156 = new C2790<>();
        this.f146 = new ArrayList();
        this.f150 = new ArrayList();
        this.f157 = new int[2];
        this.f148 = new int[2];
        this.f145 = new C2745.IF();
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C2715.C2716.f12567, 0, R.style.f175282131952319);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C2715.C2716.f12567, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C2715.C2716.f12567, attributeSet, typedArray, 0, R.style.f175282131952319);
            } else {
                saveAttributeDataForStyleable(context, C2715.C2716.f12567, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C2715.C2716.f12565, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f151 = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f151.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f151;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f142 = typedArray.getDrawable(C2715.C2716.f12568);
        typedArray.recycle();
        m132();
        super.setOnHierarchyChangeListener(new C0015());
        if (C0293.m4217(this) == 0) {
            C0293.m4203((View) this, 1);
        }
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f154 = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m131(false);
        if (this.f141) {
            if (this.f152 == null) {
                this.f152 = new C3239iF();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f152);
        }
        if (this.f147 == null && C0293.m4153(this)) {
            C0293.m4154(this);
        }
        this.f140 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m131(false);
        if (this.f141 && this.f152 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f152);
        }
        View view = this.f153;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f140 = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f142;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f142 = drawable3;
            Drawable drawable4 = this.f142;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f142.setState(getDrawableState());
                }
                C1266.m8157(this.f142, C0293.m4156(this));
                this.f142.setVisible(getVisibility() == 0, false);
                this.f142.setCallback(this);
            }
            C0293.m4176(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f142;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f142;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f142;
        if (drawable != null && drawable.isVisible() != z) {
            this.f142.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0651.m5458(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m131(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C3238If ifR = ((C0016) childAt.getLayoutParams()).f162;
            if (ifR != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    ifR.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    ifR.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0016) getChildAt(i2).getLayoutParams()).f166 = false;
        }
        this.f139 = null;
        this.f155 = false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m129(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f146;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f136;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            C0016 r12 = (C0016) view.getLayoutParams();
            C3238If ifR = r12.f162;
            boolean z5 = true;
            if ((!z3 && !z4) || actionMasked == 0) {
                if (!z3 && ifR != null) {
                    if (i2 == 0) {
                        z3 = ifR.onInterceptTouchEvent(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z3 = ifR.onTouchEvent(this, view, motionEvent2);
                    }
                    if (z3) {
                        this.f139 = view;
                    }
                }
                if (r12.f162 == null) {
                    r12.f166 = false;
                }
                boolean z6 = r12.f166;
                if (r12.f166) {
                    z = true;
                } else {
                    boolean z7 = r12.f166;
                    if (r12.f162 != null) {
                        z2 = r12.f162.blocksInteractionBelow(this, view);
                    } else {
                        z2 = false;
                    }
                    z = z2 | z7;
                    r12.f166 = z;
                }
                if (!z || z6) {
                    z5 = false;
                }
                if (z && !z5) {
                    break;
                }
                z4 = z5;
            } else if (ifR != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    ifR.onInterceptTouchEvent(this, view, motionEvent3);
                } else if (i2 == 1) {
                    ifR.onTouchEvent(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z3;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m131(true);
        }
        boolean r4 = m129(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m131(true);
        }
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f139
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m129((android.view.MotionEvent) r1, (int) r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f139
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ɩ r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0016) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$If r6 = r6.f162
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f139
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.f139
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.m131((boolean) r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f155) {
            m131(false);
            this.f155 = true;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C3238If m138(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f134)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f134);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = f133.get();
            if (map == null) {
                map = new HashMap();
                f133.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f135);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C3238If) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0016 m134(View view) {
        C0016 r0 = (C0016) view.getLayoutParams();
        if (!r0.f174) {
            if (view instanceof Cif) {
                r0.m157(((Cif) view).m154());
                r0.f174 = true;
            } else {
                C0014 r1 = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    r1 = (C0014) cls.getAnnotation(C0014.class);
                    if (r1 != null) {
                        break;
                    }
                }
                if (r1 != null) {
                    try {
                        r0.m157((C3238If) r1.m155().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                    }
                }
                r0.f174 = true;
            }
        }
        return r0;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m152(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m142(View view, int i) {
        int i2;
        C0016 r0 = (C0016) view.getLayoutParams();
        int i3 = 0;
        if (r0.f170 == null && r0.f177 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (r0.f170 != null) {
            View view2 = r0.f170;
            Rect r1 = f137.m12090();
            if (r1 == null) {
                r1 = new Rect();
            }
            Rect r2 = f137.m12090();
            if (r2 == null) {
                r2 = new Rect();
            }
            Rect rect = r2;
            try {
                C2719.m14447((ViewGroup) this, view2, r1);
                C0016 r02 = (C0016) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m136(i, r1, rect, r02, measuredWidth, measuredHeight);
                m130(r02, rect, measuredWidth, measuredHeight);
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
            } finally {
                r1.setEmpty();
                f137.m12091(r1);
                rect.setEmpty();
                f137.m12091(rect);
            }
        } else if (r0.f167 >= 0) {
            int i4 = r0.f167;
            C0016 r12 = (C0016) view.getLayoutParams();
            int i5 = r12.f164;
            if (i5 == 0) {
                i5 = 8388661;
            }
            int r4 = C2409.m12455(i5, i);
            int i6 = r4 & 7;
            int i7 = r4 & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i4 = width - i4;
            }
            int[] iArr = this.f151;
            if (iArr != null && i4 >= 0 && i4 < iArr.length) {
                i2 = iArr[i4];
            } else {
                i2 = 0;
            }
            int i8 = i2 - measuredWidth2;
            if (i6 == 1) {
                i8 += measuredWidth2 / 2;
            } else if (i6 == 5) {
                i8 += measuredWidth2;
            }
            if (i7 == 16) {
                i3 = 0 + (measuredHeight2 / 2);
            } else if (i7 == 80) {
                i3 = measuredHeight2;
            }
            int max = Math.max(getPaddingLeft() + r12.leftMargin, Math.min(i8, ((width - getPaddingRight()) - measuredWidth2) - r12.rightMargin));
            int max2 = Math.max(getPaddingTop() + r12.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - r12.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
        } else {
            C0016 r03 = (C0016) view.getLayoutParams();
            Rect r13 = f137.m12090();
            if (r13 == null) {
                r13 = new Rect();
            }
            r13.set(getPaddingLeft() + r03.leftMargin, getPaddingTop() + r03.topMargin, (getWidth() - getPaddingRight()) - r03.rightMargin, (getHeight() - getPaddingBottom()) - r03.bottomMargin);
            if (this.f147 != null && C0293.m4153(this) && !C0293.m4153(view)) {
                r13.left += this.f147.m4895();
                r13.top += this.f147.m4893();
                r13.right -= this.f147.m4894();
                r13.bottom -= this.f147.m4890();
            }
            Rect r22 = f137.m12090();
            if (r22 == null) {
                r22 = new Rect();
            }
            Rect rect2 = r22;
            int i9 = r03.f164;
            if ((i9 & 7) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            C2409.m12456(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), r13, rect2, i);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            r13.setEmpty();
            f137.m12091(r13);
            rect2.setEmpty();
            f137.m12091(rect2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3238If ifR;
        int r2 = C0293.m4156(this);
        int size = this.f149.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f149.get(i5);
            if (view.getVisibility() != 8 && ((ifR = ((C0016) view.getLayoutParams()).f162) == null || !ifR.onLayoutChild(this, view, r2))) {
                m142(view, r2);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f138 && this.f142 != null) {
            C0501 r0 = this.f147;
            int r02 = r0 != null ? r0.m4893() : 0;
            if (r02 > 0) {
                this.f142.setBounds(0, 0, getWidth(), r02);
                this.f142.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m132();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m133(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            C2719.m14447((ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m136(int i, Rect rect, Rect rect2, C0016 r9, int i2, int i3) {
        int i4;
        int i5;
        int i6 = r9.f164;
        if (i6 == 0) {
            i6 = 17;
        }
        int r0 = C2409.m12455(i6, i);
        int i7 = r9.f173;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int r6 = C2409.m12455(i7, i);
        int i8 = r0 & 7;
        int i9 = r0 & 112;
        int i10 = r6 & 7;
        int i11 = r6 & 112;
        if (i10 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i10 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i11 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i11 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i8 == 1) {
            i4 -= i2 / 2;
        } else if (i8 != 5) {
            i4 -= i2;
        }
        if (i9 == 16) {
            i5 -= i3 / 2;
        } else if (i9 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m130(C0016 r6, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + r6.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - r6.rightMargin));
        int max2 = Math.max(getPaddingTop() + r6.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - r6.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0016 r0 = (C0016) view.getLayoutParams();
        if (r0.f162 != null) {
            float scrimOpacity = r0.f162.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f144 == null) {
                    this.f144 = new Paint();
                }
                this.f144.setColor(r0.f162.getScrimColor(this, view));
                Paint paint = this.f144;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f144);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m145(int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int height;
        int i5;
        C0016 r23;
        int i6;
        int i7;
        int i8;
        int i9;
        C0016 r3;
        C3238If ifR;
        int i10 = i;
        int r8 = C0293.m4156(this);
        int size = this.f149.size();
        Rect r2 = f137.m12090();
        if (r2 == null) {
            r2 = new Rect();
        }
        Rect rect = r2;
        Rect r22 = f137.m12090();
        if (r22 == null) {
            r22 = new Rect();
        }
        Rect rect2 = r22;
        Rect r24 = f137.m12090();
        if (r24 == null) {
            r24 = new Rect();
        }
        Rect rect3 = r24;
        boolean z4 = false;
        int i11 = 0;
        while (i11 < size) {
            View view = this.f149.get(i11);
            C0016 r7 = (C0016) view.getLayoutParams();
            if (i10 == 0 && view.getVisibility() == 8) {
                i3 = size;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (r7.f168 == this.f149.get(i12)) {
                        C0016 r4 = (C0016) view.getLayoutParams();
                        if (r4.f170 != null) {
                            Rect r25 = f137.m12090();
                            if (r25 == null) {
                                r25 = new Rect();
                            }
                            Rect rect4 = r25;
                            Rect r26 = f137.m12090();
                            if (r26 == null) {
                                r26 = new Rect();
                            }
                            Rect r16 = f137.m12090();
                            if (r16 == null) {
                                r16 = new Rect();
                            }
                            Rect rect5 = r16;
                            C2719.m14447((ViewGroup) this, r4.f170, rect4);
                            m133(view, z4, r26);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i7 = size;
                            Rect rect6 = r26;
                            Rect rect7 = rect4;
                            C0016 r20 = r4;
                            int i13 = measuredWidth;
                            i8 = i11;
                            boolean z5 = true;
                            i6 = i12;
                            r23 = r7;
                            m136(r8, rect4, rect5, r20, i13, measuredHeight);
                            Rect rect8 = rect5;
                            if (rect8.left == rect6.left && rect8.top == rect6.top) {
                                r3 = r20;
                                i9 = i13;
                                z5 = false;
                            } else {
                                r3 = r20;
                                i9 = i13;
                            }
                            m130(r3, rect8, i9, measuredHeight);
                            int i14 = rect8.left - rect6.left;
                            int i15 = rect8.top - rect6.top;
                            if (i14 != 0) {
                                C0293.m4221(view, i14);
                            }
                            if (i15 != 0) {
                                C0293.m4164(view, i15);
                            }
                            if (z5 && (ifR = r3.f162) != null) {
                                ifR.onDependentViewChanged(this, view, r3.f170);
                            }
                            rect7.setEmpty();
                            f137.m12091(rect7);
                            rect6.setEmpty();
                            f137.m12091(rect6);
                            rect8.setEmpty();
                            f137.m12091(rect8);
                            i12 = i6 + 1;
                            i11 = i8;
                            size = i7;
                            r7 = r23;
                            z4 = false;
                        }
                    }
                    i6 = i12;
                    r23 = r7;
                    i7 = size;
                    i8 = i11;
                    i12 = i6 + 1;
                    i11 = i8;
                    size = i7;
                    r7 = r23;
                    z4 = false;
                }
                int i16 = size;
                i2 = i11;
                m133(view, true, rect2);
                C0016 r27 = r7;
                if (r27.f176 != 0 && !rect2.isEmpty()) {
                    int r32 = C2409.m12455(r27.f176, r8);
                    int i17 = r32 & 112;
                    if (i17 == 48) {
                        rect.top = Math.max(rect.top, rect2.bottom);
                    } else if (i17 == 80) {
                        rect.bottom = Math.max(rect.bottom, getHeight() - rect2.top);
                    }
                    int i18 = r32 & 7;
                    if (i18 == 3) {
                        rect.left = Math.max(rect.left, rect2.right);
                    } else if (i18 == 5) {
                        rect.right = Math.max(rect.right, getWidth() - rect2.left);
                    }
                }
                if (r27.f163 != 0 && view.getVisibility() == 0 && C0293.m4186(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0016 r28 = (C0016) view.getLayoutParams();
                    C3238If ifR2 = r28.f162;
                    Rect r9 = f137.m12090();
                    if (r9 == null) {
                        r9 = new Rect();
                    }
                    Rect r13 = f137.m12090();
                    if (r13 == null) {
                        r13 = new Rect();
                    }
                    r13.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (ifR2 == null || !ifR2.getInsetDodgeRect(this, view, r9)) {
                        r9.set(r13);
                    } else if (!r13.contains(r9)) {
                        StringBuilder sb = new StringBuilder("Rect should be within the child's bounds. Rect:");
                        sb.append(r9.toShortString());
                        sb.append(" | Bounds:");
                        sb.append(r13.toShortString());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    r13.setEmpty();
                    f137.m12091(r13);
                    if (r9.isEmpty()) {
                        r9.setEmpty();
                        f137.m12091(r9);
                    } else {
                        int r33 = C2409.m12455(r28.f163, r8);
                        if ((r33 & 48) != 48 || (i5 = (r9.top - r28.topMargin) - r28.f169) >= rect.top) {
                            z2 = false;
                        } else {
                            m139(view, rect.top - i5);
                            z2 = true;
                        }
                        if ((r33 & 80) == 80 && (height = ((getHeight() - r9.bottom) - r28.bottomMargin) + r28.f169) < rect.bottom) {
                            m139(view, height - rect.bottom);
                            z2 = true;
                        }
                        if (!z2) {
                            m139(view, 0);
                        }
                        if ((r33 & 3) != 3 || (i4 = (r9.left - r28.leftMargin) - r28.f175) >= rect.left) {
                            z3 = false;
                        } else {
                            m137(view, rect.left - i4);
                            z3 = true;
                        }
                        if ((r33 & 5) == 5 && (width = ((getWidth() - r9.right) - r28.rightMargin) + r28.f175) < rect.right) {
                            m137(view, width - rect.right);
                            z3 = true;
                        }
                        if (!z3) {
                            m137(view, 0);
                        }
                        r9.setEmpty();
                        f137.m12091(r9);
                    }
                }
                if (i10 != 2) {
                    rect3.set(((C0016) view.getLayoutParams()).f178);
                    if (!rect3.equals(rect2)) {
                        ((C0016) view.getLayoutParams()).f178.set(rect2);
                    } else {
                        i3 = i16;
                    }
                }
                i3 = i16;
                for (int i19 = i2 + 1; i19 < i3; i19++) {
                    View view2 = this.f149.get(i19);
                    C0016 r5 = (C0016) view2.getLayoutParams();
                    C3238If ifR3 = r5.f162;
                    if (ifR3 != null && ifR3.layoutDependsOn(this, view2, view)) {
                        if (i10 != 0 || !r5.f165) {
                            if (i10 != 2) {
                                z = ifR3.onDependentViewChanged(this, view2, view);
                            } else {
                                ifR3.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i10 == 1) {
                                r5.f165 = z;
                            }
                        } else {
                            r5.f165 = false;
                        }
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            z4 = false;
        }
        rect.setEmpty();
        f137.m12091(rect);
        rect2.setEmpty();
        f137.m12091(rect2);
        rect3.setEmpty();
        f137.m12091(rect3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m137(View view, int i) {
        C0016 r0 = (C0016) view.getLayoutParams();
        if (r0.f175 != i) {
            C0293.m4221(view, i - r0.f175);
            r0.f175 = i;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m139(View view, int i) {
        C0016 r0 = (C0016) view.getLayoutParams();
        if (r0.f169 != i) {
            C0293.m4164(view, i - r0.f169);
            r0.f169 = i;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m141(View view) {
        List list = this.f156.f13186.get(view);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                C3238If ifR = ((C0016) view2.getLayoutParams()).f162;
                if (ifR != null) {
                    ifR.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<View> m144(View view) {
        C2790<View> r0 = this.f156;
        int size = r0.f13186.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            ArrayList arrayList2 = (ArrayList) r0.f13186.f5784[i2 + 1];
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r0.f13186.f5784[i2]);
            }
        }
        this.f150.clear();
        if (arrayList != null) {
            this.f150.addAll(arrayList);
        }
        return this.f150;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<View> m151(View view) {
        List list = this.f156.f13186.get(view);
        this.f150.clear();
        if (list != null) {
            this.f150.addAll(list);
        }
        return this.f150;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m135() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            C2790<View> r5 = this.f156;
            int size = r5.f13186.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    ArrayList arrayList = (ArrayList) r5.f13186.f5784[(i2 << 1) + 1];
                    if (arrayList != null && arrayList.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i++;
        }
        if (z == this.f141) {
            return;
        }
        if (z) {
            if (this.f140) {
                if (this.f152 == null) {
                    this.f152 = new C3239iF();
                }
                getViewTreeObserver().addOnPreDrawListener(this.f152);
            }
            this.f141 = true;
            return;
        }
        if (this.f140 && this.f152 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f152);
        }
        this.f141 = false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0016) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return m150(view, view2, i, 0);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m150(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0016 r13 = (C0016) childAt.getLayoutParams();
                C3238If ifR = r13.f162;
                if (ifR != null) {
                    boolean onStartNestedScroll = ifR.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    r13.m156(i3, onStartNestedScroll);
                    z |= onStartNestedScroll;
                } else {
                    r13.m156(i3, false);
                }
            }
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        m148(view, view2, i, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m148(View view, View view2, int i, int i2) {
        C3238If ifR;
        C2745.IF ifR2 = this.f145;
        if (i2 == 1) {
            ifR2.f12775 = i;
        } else {
            ifR2.f12774 = i;
        }
        this.f153 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0016 r2 = (C0016) childAt.getLayoutParams();
            if (r2.m158(i2) && (ifR = r2.f162) != null) {
                ifR.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    public void onStopNestedScroll(View view) {
        m140(view, 0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m140(View view, int i) {
        C2745.IF ifR = this.f145;
        if (i == 1) {
            ifR.f12775 = 0;
        } else {
            ifR.f12774 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0016 r4 = (C0016) childAt.getLayoutParams();
            if (r4.m158(i)) {
                C3238If ifR2 = r4.f162;
                if (ifR2 != null) {
                    ifR2.onStopNestedScroll(this, childAt, view, i);
                }
                r4.m156(i, false);
                r4.f165 = false;
            }
        }
        this.f153 = null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m149(View view, int i, int i2, int i3, int i4, int i5) {
        m146(view, i, i2, i3, i4, 0, this.f148);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m146(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C3238If ifR;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0016 r1 = (C0016) childAt.getLayoutParams();
                if (r1.m158(i5) && (ifR = r1.f162) != null) {
                    int[] iArr2 = this.f157;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ifR.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f157;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f157[1]);
                    } else {
                        i7 = Math.min(i9, this.f157[1]);
                    }
                    i8 = i6;
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            m145(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m147(view, i, i2, iArr, 0);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m147(View view, int i, int i2, int[] iArr, int i3) {
        C3238If ifR;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0016 r1 = (C0016) childAt.getLayoutParams();
                if (r1.m158(i3) && (ifR = r1.f162) != null) {
                    int[] iArr2 = this.f157;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ifR.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f157;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    int[] iArr4 = this.f157;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i6 = i4;
                    i7 = i5;
                    z = true;
                }
            } else {
                int i9 = i3;
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            m145(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C3238If ifR;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0016 r4 = (C0016) childAt.getLayoutParams();
                if (r4.m158(0) && (ifR = r4.f162) != null) {
                    z2 |= ifR.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m145(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C3238If ifR;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0016 r4 = (C0016) childAt.getLayoutParams();
                if (r4.m158(0) && (ifR = r4.f162) != null) {
                    z |= ifR.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        C2745.IF ifR = this.f145;
        return ifR.f12775 | ifR.f12774;
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$iF  reason: case insensitive filesystem */
    class C3239iF implements ViewTreeObserver.OnPreDrawListener {
        C3239iF() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.m145(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$Ι  reason: contains not printable characters */
    static class C0017 implements Comparator<View> {
        C0017() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            float r2 = C0293.m4160((View) obj);
            float r3 = C0293.m4160((View) obj2);
            if (r2 > r3) {
                return -1;
            }
            return r2 < r3 ? 1 : 0;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$If  reason: case insensitive filesystem */
    public static abstract class C3238If<V extends View> {
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public C0501 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, C0501 r3) {
            return r3;
        }

        public void onAttachedToLayoutParams(C0016 r1) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public C3238If() {
        }

        public C3238If(Context context, AttributeSet attributeSet) {
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ɩ  reason: contains not printable characters */
    public static class C0016 extends ViewGroup.MarginLayoutParams {

        /* renamed from: ı  reason: contains not printable characters */
        public C3238If f162;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public int f163 = 0;

        /* renamed from: ǃ  reason: contains not printable characters */
        public int f164 = 0;

        /* renamed from: ȷ  reason: contains not printable characters */
        boolean f165;

        /* renamed from: ɨ  reason: contains not printable characters */
        boolean f166;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f167 = -1;

        /* renamed from: ɪ  reason: contains not printable characters */
        View f168;

        /* renamed from: ɹ  reason: contains not printable characters */
        int f169;

        /* renamed from: ɾ  reason: contains not printable characters */
        View f170;

        /* renamed from: ɿ  reason: contains not printable characters */
        private boolean f171;

        /* renamed from: ʟ  reason: contains not printable characters */
        private boolean f172;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f173 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f174 = false;

        /* renamed from: І  reason: contains not printable characters */
        int f175;

        /* renamed from: і  reason: contains not printable characters */
        public int f176 = 0;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public int f177 = -1;

        /* renamed from: ӏ  reason: contains not printable characters */
        final Rect f178 = new Rect();

        public C0016() {
            super(-2, -2);
        }

        C0016(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2715.C2716.f12572);
            this.f164 = obtainStyledAttributes.getInteger(C2715.C2716.f12571, 0);
            this.f177 = obtainStyledAttributes.getResourceId(C2715.C2716.f12569, -1);
            this.f173 = obtainStyledAttributes.getInteger(C2715.C2716.f12574, 0);
            this.f167 = obtainStyledAttributes.getInteger(C2715.C2716.f12570, -1);
            this.f176 = obtainStyledAttributes.getInt(C2715.C2716.f12566, 0);
            this.f163 = obtainStyledAttributes.getInt(C2715.C2716.f12573, 0);
            this.f174 = obtainStyledAttributes.hasValue(C2715.C2716.f12575);
            if (this.f174) {
                this.f162 = CoordinatorLayout.m138(context, attributeSet, obtainStyledAttributes.getString(C2715.C2716.f12575));
            }
            obtainStyledAttributes.recycle();
            C3238If ifR = this.f162;
            if (ifR != null) {
                ifR.onAttachedToLayoutParams(this);
            }
        }

        public C0016(C0016 r2) {
            super(r2);
        }

        public C0016(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0016(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m157(C3238If ifR) {
            C3238If ifR2 = this.f162;
            if (ifR2 != ifR) {
                if (ifR2 != null) {
                    ifR2.onDetachedFromLayoutParams();
                }
                this.f162 = ifR;
                this.f174 = true;
                if (ifR != null) {
                    ifR.onAttachedToLayoutParams(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final void m156(int i, boolean z) {
            if (i == 0) {
                this.f172 = z;
            } else if (i == 1) {
                this.f171 = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m158(int i) {
            if (i == 0) {
                return this.f172;
            }
            if (i != 1) {
                return false;
            }
            return this.f171;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$ǃ  reason: contains not printable characters */
    class C0015 implements ViewGroup.OnHierarchyChangeListener {
        C0015() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f154 != null) {
                CoordinatorLayout.this.f154.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m145(2);
            if (CoordinatorLayout.this.f154 != null) {
                CoordinatorLayout.this.f154.onChildViewRemoved(view, view2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof IF)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        IF ifR = (IF) parcelable;
        super.onRestoreInstanceState(ifR.f6905);
        SparseArray<Parcelable> sparseArray = ifR.f159;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C3238If ifR2 = m134(childAt).f162;
            if (!(id == -1 || ifR2 == null || (parcelable2 = sparseArray.get(id)) == null)) {
                ifR2.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        IF ifR = new IF(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C3238If ifR2 = ((C0016) childAt.getLayoutParams()).f162;
            if (!(id == -1 || ifR2 == null || (onSaveInstanceState = ifR2.onSaveInstanceState(this, childAt)) == null)) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        ifR.f159 = sparseArray;
        return ifR;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C3238If ifR = ((C0016) view.getLayoutParams()).f162;
        if (ifR == null || !ifR.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m132() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0293.m4153(this)) {
                if (this.f143 == null) {
                    this.f143 = new C2850() {
                        /* renamed from: ɩ  reason: contains not printable characters */
                        public final C0501 m153(View view, C0501 r6) {
                            C3238If ifR;
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!C2408.m12453(coordinatorLayout.f147, r6)) {
                                coordinatorLayout.f147 = r6;
                                boolean z = true;
                                coordinatorLayout.f138 = r6 != null && r6.m4893() > 0;
                                if (coordinatorLayout.f138 || coordinatorLayout.getBackground() != null) {
                                    z = false;
                                }
                                coordinatorLayout.setWillNotDraw(z);
                                if (!r6.m4897()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (C0293.m4153(childAt) && (ifR = ((C0016) childAt.getLayoutParams()).f162) != null) {
                                            r6 = ifR.onApplyWindowInsets(coordinatorLayout, childAt, r6);
                                            if (r6.m4897()) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return r6;
                        }
                    };
                }
                C0293.m4207((View) this, this.f143);
                setSystemUiVisibility(1280);
                return;
            }
            C0293.m4207((View) this, (C2850) null);
        }
    }

    public static class IF extends C1219 {
        public static final Parcelable.Creator<IF> CREATOR = new Parcelable.ClassLoaderCreator<IF>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new IF(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new IF[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new IF(parcel, (ClassLoader) null);
            }
        };

        /* renamed from: ǃ  reason: contains not printable characters */
        SparseArray<Parcelable> f159;

        public IF(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f159 = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f159.append(iArr[i], readParcelableArray[i]);
            }
        }

        public IF(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f159;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f159.keyAt(i2);
                parcelableArr[i2] = this.f159.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02d8, code lost:
        if (r0.onMeasureChild(r31, r20, r24, r8, r25, 0) == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r5 != false) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0180 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r7 = r31
            java.util.List<android.view.View> r0 = r7.f149
            r0.clear()
            o.Ӏɩ<android.view.View> r0 = r7.f156
            o.ǃɹ<T, java.util.ArrayList<T>> r1 = r0.f13186
            int r1 = r1.size()
            r2 = 0
        L_0x0010:
            r3 = 1
            if (r2 >= r1) goto L_0x002b
            o.ǃɹ<T, java.util.ArrayList<T>> r4 = r0.f13186
            java.lang.Object[] r4 = r4.f5784
            int r5 = r2 << 1
            int r5 = r5 + r3
            r3 = r4[r5]
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x0028
            r3.clear()
            o.ІӀ$If<java.util.ArrayList<T>> r4 = r0.f13184
            r4.m12091(r3)
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x002b:
            o.ǃɹ<T, java.util.ArrayList<T>> r0 = r0.f13186
            r0.clear()
            int r0 = r31.getChildCount()
            r1 = 0
        L_0x0035:
            if (r1 >= r0) goto L_0x01ae
            android.view.View r2 = r7.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$ɩ r4 = m134(r2)
            int r5 = r4.f177
            r6 = -1
            r9 = 0
            if (r5 != r6) goto L_0x004b
            r4.f168 = r9
            r4.f170 = r9
            goto L_0x00dd
        L_0x004b:
            android.view.View r5 = r4.f170
            if (r5 == 0) goto L_0x0080
            android.view.View r5 = r4.f170
            int r5 = r5.getId()
            int r6 = r4.f177
            if (r5 == r6) goto L_0x005b
        L_0x0059:
            r5 = 0
            goto L_0x007e
        L_0x005b:
            android.view.View r5 = r4.f170
            android.view.View r6 = r4.f170
            android.view.ViewParent r6 = r6.getParent()
        L_0x0063:
            if (r6 == r7) goto L_0x007b
            if (r6 == 0) goto L_0x0076
            if (r6 != r2) goto L_0x006a
            goto L_0x0076
        L_0x006a:
            boolean r10 = r6 instanceof android.view.View
            if (r10 == 0) goto L_0x0071
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0071:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0063
        L_0x0076:
            r4.f168 = r9
            r4.f170 = r9
            goto L_0x0059
        L_0x007b:
            r4.f168 = r5
            r5 = 1
        L_0x007e:
            if (r5 != 0) goto L_0x00dd
        L_0x0080:
            int r5 = r4.f177
            android.view.View r5 = r7.findViewById(r5)
            r4.f170 = r5
            android.view.View r5 = r4.f170
            if (r5 == 0) goto L_0x00d3
            android.view.View r5 = r4.f170
            if (r5 != r7) goto L_0x00a3
            boolean r5 = r31.isInEditMode()
            if (r5 == 0) goto L_0x009b
            r4.f168 = r9
            r4.f170 = r9
            goto L_0x00dd
        L_0x009b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            android.view.View r5 = r4.f170
            android.view.View r6 = r4.f170
            android.view.ViewParent r6 = r6.getParent()
        L_0x00ab:
            if (r6 == r7) goto L_0x00d0
            if (r6 == 0) goto L_0x00d0
            if (r6 != r2) goto L_0x00c4
            boolean r5 = r31.isInEditMode()
            if (r5 == 0) goto L_0x00bc
            r4.f168 = r9
            r4.f170 = r9
            goto L_0x00dd
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            boolean r10 = r6 instanceof android.view.View
            if (r10 == 0) goto L_0x00cb
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00cb:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x00ab
        L_0x00d0:
            r4.f168 = r5
            goto L_0x00dd
        L_0x00d3:
            boolean r5 = r31.isInEditMode()
            if (r5 == 0) goto L_0x0188
            r4.f168 = r9
            r4.f170 = r9
        L_0x00dd:
            o.Ӏɩ<android.view.View> r5 = r7.f156
            o.ǃɹ<T, java.util.ArrayList<T>> r6 = r5.f13186
            boolean r6 = r6.containsKey(r2)
            if (r6 != 0) goto L_0x00ec
            o.ǃɹ<T, java.util.ArrayList<T>> r5 = r5.f13186
            r5.put(r2, r9)
        L_0x00ec:
            r5 = 0
        L_0x00ed:
            if (r5 >= r0) goto L_0x0184
            if (r5 == r1) goto L_0x0180
            android.view.View r6 = r7.getChildAt(r5)
            android.view.View r10 = r4.f168
            if (r6 == r10) goto L_0x0128
            int r10 = o.C0293.m4156(r31)
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$ɩ r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0016) r11
            int r11 = r11.f176
            int r11 = o.C2409.m12455(r11, r10)
            if (r11 == 0) goto L_0x0116
            int r12 = r4.f163
            int r10 = o.C2409.m12455(r12, r10)
            r10 = r10 & r11
            if (r10 != r11) goto L_0x0116
            r10 = 1
            goto L_0x0117
        L_0x0116:
            r10 = 0
        L_0x0117:
            if (r10 != 0) goto L_0x0128
            androidx.coordinatorlayout.widget.CoordinatorLayout$If r10 = r4.f162
            if (r10 == 0) goto L_0x0126
            androidx.coordinatorlayout.widget.CoordinatorLayout$If r10 = r4.f162
            boolean r10 = r10.layoutDependsOn(r7, r2, r6)
            if (r10 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            r10 = 0
            goto L_0x0129
        L_0x0128:
            r10 = 1
        L_0x0129:
            if (r10 == 0) goto L_0x0180
            o.Ӏɩ<android.view.View> r10 = r7.f156
            o.ǃɹ<T, java.util.ArrayList<T>> r10 = r10.f13186
            boolean r10 = r10.containsKey(r6)
            if (r10 != 0) goto L_0x0144
            o.Ӏɩ<android.view.View> r10 = r7.f156
            o.ǃɹ<T, java.util.ArrayList<T>> r11 = r10.f13186
            boolean r11 = r11.containsKey(r6)
            if (r11 != 0) goto L_0x0144
            o.ǃɹ<T, java.util.ArrayList<T>> r10 = r10.f13186
            r10.put(r6, r9)
        L_0x0144:
            o.Ӏɩ<android.view.View> r10 = r7.f156
            o.ǃɹ<T, java.util.ArrayList<T>> r11 = r10.f13186
            boolean r11 = r11.containsKey(r6)
            if (r11 == 0) goto L_0x0178
            o.ǃɹ<T, java.util.ArrayList<T>> r11 = r10.f13186
            boolean r11 = r11.containsKey(r2)
            if (r11 == 0) goto L_0x0178
            o.ǃɹ<T, java.util.ArrayList<T>> r11 = r10.f13186
            java.lang.Object r11 = r11.get(r6)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            if (r11 != 0) goto L_0x0174
            o.ІӀ$If<java.util.ArrayList<T>> r11 = r10.f13184
            java.lang.Object r11 = r11.m12090()
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            if (r11 != 0) goto L_0x016f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x016f:
            o.ǃɹ<T, java.util.ArrayList<T>> r10 = r10.f13186
            r10.put(r6, r11)
        L_0x0174:
            r11.add(r2)
            goto L_0x0180
        L_0x0178:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0180:
            int r5 = r5 + 1
            goto L_0x00ed
        L_0x0184:
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0188:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r3)
            android.content.res.Resources r3 = r31.getResources()
            int r4 = r4.f177
            java.lang.String r3 = r3.getResourceName(r4)
            r1.append(r3)
            java.lang.String r3 = " to anchor view "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01ae:
            java.util.List<android.view.View> r0 = r7.f149
            o.Ӏɩ<android.view.View> r1 = r7.f156
            java.util.ArrayList r1 = r1.m14703()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r7.f149
            java.util.Collections.reverse(r0)
            r31.m135()
            int r9 = r31.getPaddingLeft()
            int r0 = r31.getPaddingTop()
            int r10 = r31.getPaddingRight()
            int r1 = r31.getPaddingBottom()
            int r11 = o.C0293.m4156(r31)
            if (r11 != r3) goto L_0x01d9
            r12 = 1
            goto L_0x01da
        L_0x01d9:
            r12 = 0
        L_0x01da:
            int r13 = android.view.View.MeasureSpec.getMode(r32)
            int r14 = android.view.View.MeasureSpec.getSize(r32)
            int r15 = android.view.View.MeasureSpec.getMode(r33)
            int r16 = android.view.View.MeasureSpec.getSize(r33)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r31.getSuggestedMinimumWidth()
            int r1 = r31.getSuggestedMinimumHeight()
            o.ŀǃ r2 = r7.f147
            if (r2 == 0) goto L_0x0203
            boolean r2 = o.C0293.m4153(r31)
            if (r2 == 0) goto L_0x0203
            r19 = 1
            goto L_0x0205
        L_0x0203:
            r19 = 0
        L_0x0205:
            java.util.List<android.view.View> r2 = r7.f149
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x020f:
            if (r5 >= r6) goto L_0x0339
            java.util.List<android.view.View> r0 = r7.f149
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0329
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$ɩ r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0016) r1
            int r0 = r1.f167
            if (r0 < 0) goto L_0x0275
            if (r13 == 0) goto L_0x0275
            int r0 = r1.f167
            int[] r8 = r7.f151
            if (r8 != 0) goto L_0x023a
            r22 = r2
        L_0x0238:
            r8 = 0
            goto L_0x0244
        L_0x023a:
            r22 = r2
            if (r0 < 0) goto L_0x0238
            int r2 = r8.length
            if (r0 < r2) goto L_0x0242
            goto L_0x0238
        L_0x0242:
            r8 = r8[r0]
        L_0x0244:
            int r0 = r1.f164
            if (r0 != 0) goto L_0x024b
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x024b:
            int r0 = o.C2409.m12455(r0, r11)
            r0 = r0 & 7
            r2 = 3
            if (r0 != r2) goto L_0x0256
            if (r12 == 0) goto L_0x025b
        L_0x0256:
            r2 = 5
            if (r0 != r2) goto L_0x0265
            if (r12 == 0) goto L_0x0265
        L_0x025b:
            int r0 = r14 - r10
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0263:
            r8 = r0
            goto L_0x0279
        L_0x0265:
            if (r0 != r2) goto L_0x0269
            if (r12 == 0) goto L_0x026e
        L_0x0269:
            r2 = 3
            if (r0 != r2) goto L_0x0277
            if (r12 == 0) goto L_0x0277
        L_0x026e:
            int r8 = r8 - r9
            r2 = 0
            int r0 = java.lang.Math.max(r2, r8)
            goto L_0x0263
        L_0x0275:
            r22 = r2
        L_0x0277:
            r2 = 0
            r8 = 0
        L_0x0279:
            if (r19 == 0) goto L_0x02ae
            boolean r0 = o.C0293.m4153(r20)
            if (r0 != 0) goto L_0x02ae
            o.ŀǃ r0 = r7.f147
            int r0 = r0.m4895()
            o.ŀǃ r2 = r7.f147
            int r2 = r2.m4894()
            int r0 = r0 + r2
            o.ŀǃ r2 = r7.f147
            int r2 = r2.m4893()
            r23 = r3
            o.ŀǃ r3 = r7.f147
            int r3 = r3.m4890()
            int r2 = r2 + r3
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r24 = r0
            r25 = r2
            goto L_0x02b4
        L_0x02ae:
            r23 = r3
            r24 = r32
            r25 = r33
        L_0x02b4:
            androidx.coordinatorlayout.widget.CoordinatorLayout$If r0 = r1.f162
            if (r0 == 0) goto L_0x02db
            r26 = 0
            r3 = r1
            r1 = r31
            r27 = r22
            r21 = 0
            r2 = r20
            r29 = r3
            r28 = r23
            r3 = r24
            r30 = r4
            r4 = r8
            r22 = r5
            r5 = r25
            r23 = r6
            r6 = r26
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x02f6
            goto L_0x02e9
        L_0x02db:
            r29 = r1
            r30 = r4
            r27 = r22
            r28 = r23
            r21 = 0
            r22 = r5
            r23 = r6
        L_0x02e9:
            r5 = 0
            r0 = r31
            r1 = r20
            r2 = r24
            r3 = r8
            r4 = r25
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x02f6:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r29
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r30
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r28
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r4 = r0
            r3 = r2
            goto L_0x0332
        L_0x0329:
            r1 = r2
            r8 = r3
            r2 = r4
            r22 = r5
            r23 = r6
            r21 = 0
        L_0x0332:
            r2 = r1
            int r5 = r22 + 1
            r6 = r23
            goto L_0x020f
        L_0x0339:
            r1 = r2
            r8 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r3 = r32
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r8 << 16
            r3 = r33
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m143(View view, int i, int i2) {
        Rect r0 = f137.m12090();
        if (r0 == null) {
            r0 = new Rect();
        }
        C2719.m14447((ViewGroup) this, view, r0);
        try {
            return r0.contains(i, i2);
        } finally {
            r0.setEmpty();
            f137.m12091(r0);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m146(view, i, i2, i3, i4, 0, this.f148);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0016();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0016) {
            return new C0016((C0016) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0016((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0016(layoutParams);
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0016(getContext(), attributeSet);
    }
}
